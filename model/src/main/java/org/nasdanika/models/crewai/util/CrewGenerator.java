package org.nasdanika.models.crewai.util;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.models.crewai.Agent;
import org.nasdanika.models.crewai.Code;
import org.nasdanika.models.crewai.Crew;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.crewai.Task;
import org.nasdanika.models.crewai.Tool;
import org.nasdanika.models.python.Class;
import org.nasdanika.models.python.Function;
import org.nasdanika.models.python.Import;
import org.nasdanika.models.python.PythonFactory;
import org.nasdanika.models.python.PythonPackage;
import org.nasdanika.models.python.Variable;
import org.nasdanika.models.source.Source;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.Yaml;

/**
 * Generates a crew python file and configuration files.
 */
public class CrewGenerator {
	
	private static final String SPEL_TOKEN_SCHEME = "spel:";

	/**
	 * Agents config relative to the crew source file
	 * @return
	 */
	protected String getAgentsConfig(Crew crew) {
		return "config/agents.yaml";
	}
	
	/**
	 * Tasks config relative to the crew source file
	 * @return
	 */
	protected String getTasksConfig(Crew crew) {
		return "config/tasks.yaml";
	}
	
	protected void addComment(Code code, Consumer<? super Source> consumer) {
		String comment = code.getComment();
		if (!Util.isBlank(comment)) {
			Source commentSource = Source.create("\"\"\"" + System.lineSeparator() + comment + System.lineSeparator() +  "\"\"\"");
			consumer.accept(commentSource);
		}
	}
	
	protected java.util.function.Function<String, String> createSpelTokenSource(org.nasdanika.models.python.Source rootObject) {
		StandardEvaluationContext evaluationContext = new StandardEvaluationContext(rootObject);		
		ExpressionParser parser = new SpelExpressionParser();
		
		return token -> {
			if (token != null && token.startsWith(SPEL_TOKEN_SCHEME)) {
				Expression exp = parser.parseExpression(token.substring(SPEL_TOKEN_SCHEME.length()));		
				Object result = exp.getValue(evaluationContext);
				return result == null ? null : result.toString();				
			}
			return null;
		};		
	}
	
	protected Source createIntepolatedSource(org.nasdanika.models.python.Source rootObject, String source) {
		return Source.create(Util.interpolate(source, createSpelTokenSource(rootObject)));		
	}
	
	public void generate(
			Crew crew, 
			URI crewSourceURI, 
			ResourceSet resourceSet, 
			ProgressMonitor progressMonitor)  throws IOException {

		PythonFactory pythonFactory = PythonFactory.eINSTANCE;
		
		// Class
		Class crewClass = pythonFactory.createClass();
		addImports(crew, crewClass);
		crewClass.setName(crew.getId());
		crewClass.getDecorators().add("CrewBase");				
		
		Source classDoc = Source.create("\"\"\"" + crew.getName() +  "\"\"\"");
		EList<Source> crewClassBody = crewClass.getBody();
		crewClassBody.add(classDoc);
		
		String agentsConfig = getAgentsConfig(crew);
		crewClassBody.add(Variable.createVariable(getAgentsConfigVariableName(), "'" + agentsConfig + "'"));
		
		String tasksConfig = getTasksConfig(crew);
		String taskConfigVariableName = getTasksConfigVariableName();
		crewClassBody.add(Variable.createVariable(taskConfigVariableName, "'" + tasksConfig + "'"));
		
		String crewCode = crew.getCode();
		if (!Util.isBlank(crewCode)) {
			crewClassBody.add(createIntepolatedSource(crewClass, crew.getCode()));			
		}

		// TODO - split tools monitor for agents and tasks.
		
		for (Tool tool: crew.getTools()) {
			String toolDeclarations = tool.getDeclarations();
			if (!Util.isBlank(toolDeclarations)) {
				addComment(tool, crewClassBody::add);
				crewClassBody.add(createIntepolatedSource(crewClass, toolDeclarations));
			}
		}
		
		Map<String,Object> agentConfigs = new LinkedHashMap<>();
		for (Agent agent: crew.getAgents()) {			
			Function agentMethod = pythonFactory.createFunction();
			agentMethod.getBody().add(createAgentFunctionBody(agent, crewClass, progressMonitor));
			agentMethod.setAnnotation(getAgentMethodAnnotation(agent));
			agentMethod.setName(getAgentMethodName(agent));
			agentMethod.getParameters().add("self");
			agentMethod.getDecorators().add("agent");
			addComment(agent, crewClassBody::add);
			crewClassBody.add(agentMethod);
			
			Map<String,Object> configMap = agent.getConfigMap();
			if (!configMap.isEmpty()) {
				agentConfigs.put(getAgentConfigKey(agent), configMap);				
			}
		}
		
		Map<String,Object> taskConfigs = new LinkedHashMap<>();
		for (Task task: crew.getTasks()) {			
			Function taskMethod = pythonFactory.createFunction();
			taskMethod.getBody().add(createTaskFunctionBody(task, crewClass, progressMonitor));
			taskMethod.setAnnotation(getTaskMethodAnnotation(task));
			taskMethod.setName(getTaskMethodName(task));
			taskMethod.getParameters().add("self");
			taskMethod.getDecorators().add("task");
			addComment(task, crewClassBody::add);
			crewClassBody.add(taskMethod);

			Map<String,Object> configMap = task.getConfigMap();
			Agent taskAgent = task.getAgent();
			if (taskAgent != null) {
				configMap.put(CrewaiPackage.Literals.TASK__AGENT.getName(), getAgentConfigKey(taskAgent));
			}
			if (!configMap.isEmpty()) {
				taskConfigs.put(getTaskConfigKey(task), configMap);
			}			
		}
		
		Function crewMethod = pythonFactory.createFunction();
		crewMethod.getBody().add(createCrewFunctionBody(crew, progressMonitor));
		crewMethod.setAnnotation(getCrewMethodAnnotation(crew));
		crewMethod.setName(getCrewMethodName(crew));
		crewMethod.getParameters().add("self");
		crewMethod.getDecorators().add("crew");
		crewClassBody.add(crewMethod);		
		
		Resource pythonResource = resourceSet.createResource(crewSourceURI);		
		EList<EObject> resourceContents = pythonResource.getContents();
		addComment(crew, resourceContents::add);
		resourceContents.add(crewClass);
		String indent = getIndent(crew);
		pythonResource.getAllContents().forEachRemaining(e -> {
			if (e instanceof Source) {
				((Source) e).setIndent(indent);
			}
		});
		pythonResource.save(null);
		
		Yaml yaml = getYaml();
		
		if (!agentConfigs.isEmpty()) {
			URI agentConfigsURI = URI.createURI(agentsConfig).resolve(crewSourceURI);
			try (Writer writer = new OutputStreamWriter(resourceSet.getURIConverter().createOutputStream(agentConfigsURI))) {
				yaml.dump(agentConfigs, writer);
			}
		}
		
		if (!taskConfigs.isEmpty()) {
			URI taskConfigsURI = URI.createURI(tasksConfig).resolve(crewSourceURI);
			try (Writer writer = new OutputStreamWriter(resourceSet.getURIConverter().createOutputStream(taskConfigsURI))) {
				yaml.dump(taskConfigs, writer);
			}
		}
		
	}

	protected Yaml getYaml() {
		DumperOptions dumperOptions = new DumperOptions();
		dumperOptions.setDefaultFlowStyle(FlowStyle.BLOCK); dumperOptions.setIndent(4); 
		return new Yaml(dumperOptions);
	}
	
	protected String getIndent(Crew crew) {
		return "\t";
	}

	protected void addImports(Crew crew, Class crewClass) {
		addDefaultImports(crewClass);
		List<String> allImports = new ArrayList<>();
		allImports.add(crew.getImports());
		TreeIterator<Object> cit = EcoreUtil.getAllContents(crew, true);
		while (cit.hasNext()) {
			Object next = cit.next();
			if (next instanceof Code) {
				allImports.add(((Code) next).getImports());
			}
		}
		
		Yaml yaml = getYaml();
		for (String toImport: allImports) {
			if (!Util.isBlank(toImport)) {
				Object toImportObj = yaml.load(toImport);
				if (toImportObj != null) {
					Iterable<?> toImportIterable = toImportObj instanceof Iterable ? (Iterable<?>) toImportObj : Collections.singleton(toImportObj);
					for (Object toImportElement: toImportIterable) {
						Import importObj = PythonFactory.eINSTANCE.createImport();
						if (toImportElement instanceof String) {
							importObj.setModule((String) toImportElement);
						} else if (toImportElement instanceof Map) {
							Map<?,?> toImportMap = (Map<?, ?>) toImportElement;
							importObj.setModule((String) toImportMap.get(PythonPackage.Literals.IMPORT__MODULE.getName()));
							importObj.setAlias((String) toImportMap.get(PythonPackage.Literals.IMPORT__ALIAS.getName()));
							importObj.setItem((String) toImportMap.get(PythonPackage.Literals.IMPORT__ITEM.getName()));
							importObj.setName((String) toImportMap.get(PythonPackage.Literals.IMPORT__NAME.getName()));							
						} else {
							throw new IllegalArgumentException("Unsupported import specification: " + toImportElement);
						}
						crewClass.getImports().add(importObj);
					}
				}
			}
		}
	}

	protected void addDefaultImports(Class crewClass) {
		// Default imports
		crewClass.addItemImports("crewai", "Agent", "Crew", "Process", "Task");
		crewClass.addItemImports("crewai.project", "CrewBase", "agent", "crew", "task");
	}

	protected String getTaskMethodAnnotation(Task task) {
		return "Task";
	}

	protected String getAgentMethodAnnotation(Agent agent) {
		return "Agent";
	}

	protected String getCrewMethodAnnotation(Crew crew) {
		return "Crew";
	}

	protected Source createCrewFunctionBody(Crew crew, ProgressMonitor progressMonitor) {
		return Source.create(
			"""
			return Crew(
				agents=self.agents, 
				tasks=self.tasks, 
				process=Process.sequential,
				verbose=True
			)			
			""");
	}

	protected Source createAgentFunctionBody(
			Agent agent, 
			org.nasdanika.models.python.Source importSink, 
			ProgressMonitor progressMonitor) {
		
		StringBuilder extraArgs = new StringBuilder();
		if (!agent.getTools().isEmpty()) {
			extraArgs
				.append(",")
				.append(System.lineSeparator())
				.append("    tools=[");
			
			boolean firstTool = true;
			for (Tool tool: agent.getTools()) {
				if (firstTool) {
					firstTool = false;
				} else {
					extraArgs.append(", ");
				}
				extraArgs.append(tool.getCode());
			}
			
			extraArgs.append("]");
		}
		
		Map<String,String> tokenMap = new HashMap<>(Map.of(
				"agents-config-variable", getAgentsConfigVariableName(), 	
				"agent-config-key", getAgentConfigKey(agent),
				"extra-args", extraArgs.toString()));
				
		java.util.function.Function<String, String> spelTokenSource = createSpelTokenSource(importSink);
		java.util.function.Function<String, String> tokenSource = token -> tokenMap.computeIfAbsent(token, spelTokenSource);
		return Source.create(Util.interpolate(
				getAgentFunctionBodyTemplate(agent), 
				tokenSource));
	}

	protected Source createTaskFunctionBody(
			Task task, 
			org.nasdanika.models.python.Source importSink, 
			ProgressMonitor progressMonitor) {
		StringBuilder extraArgs = new StringBuilder();
		if (!task.getTools().isEmpty()) {
			extraArgs
				.append(",")
				.append(System.lineSeparator())
				.append("    tools=[");
			
			boolean firstTool = true;
			for (Tool tool: task.getTools()) {
				if (firstTool) {
					firstTool = false;
				} else {
					extraArgs.append(", ");
				}
				extraArgs.append(tool.getCode());
			}
			
			extraArgs.append("]");
		}
		Map<String,String> tokenMap = new HashMap<>(Map.of(
				"tasks-config-variable", getTasksConfigVariableName(), 	
				"task-config-key", getTaskConfigKey(task),
				"extra-args", extraArgs.toString()));
		
		java.util.function.Function<String, String> spelTokenSource = createSpelTokenSource(importSink);
		java.util.function.Function<String, String> tokenSource = token -> tokenMap.computeIfAbsent(token, spelTokenSource);
		return Source.create(Util.interpolate(
				getTaskFunctionBodyTemplate(task), 
				tokenSource));
	}
	
	public static final String DEFAULT_AGENT_FUNCTION_BODY_TEMPLATE =
		"""
		return Agent(
		    config=self.${agents-config-variable}['${agent-config-key}'],
		    verbose=True${extra-args}
		)				
		""";
	
	protected String getAgentFunctionBodyTemplate(Agent agent) {
		String ret = agent.getCode();
		return Util.isBlank(ret) ? DEFAULT_AGENT_FUNCTION_BODY_TEMPLATE : ret;
	}
	
	public static final String DEFAULT_TASK_FUNCTION_BODY_TEMPLATE =
		"""
		return Task(
		    config=self.${tasks-config-variable}['${task-config-key}']${extra-args}
		)				
		""";	
	
	protected String getTaskFunctionBodyTemplate(Task task) {
		String ret = task.getCode();
		return Util.isBlank(ret) ? DEFAULT_TASK_FUNCTION_BODY_TEMPLATE : ret;		
	}

	protected String getCrewMethodName(Crew crew) {
		return "crew";
	}

	protected String getAgentMethodName(Agent agent) {
		return agent.getId();
	}

	protected String getAgentConfigKey(Agent agent) {
		return agent.getId();
	}

	protected String getTaskMethodName(Task task) {
		return task.getId();
	}

	protected String getTaskConfigKey(Task task) {
		return task.getId();
	}

	protected String getTasksConfigVariableName() {
		return "tasks_config";
	}

	protected String getAgentsConfigVariableName() {
		return "agents_config";
	}

}
