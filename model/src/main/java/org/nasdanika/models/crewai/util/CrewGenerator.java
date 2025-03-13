package org.nasdanika.models.crewai.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
import org.nasdanika.models.crewai.Commented;
import org.nasdanika.models.crewai.Crew;
import org.nasdanika.models.crewai.Task;
import org.nasdanika.models.crewai.Tool;
import org.nasdanika.models.python.Class;
import org.nasdanika.models.python.Function;
import org.nasdanika.models.python.PythonFactory;
import org.nasdanika.models.python.Variable;
import org.nasdanika.models.source.Source;

/**
 * Generates a crew python file and configuration files.
 */
public class CrewGenerator {
	
	/**
	 * Agents config relative to the crew source file
	 * @return
	 */
	protected String getAgentsConfig() {
		return "config/agents.yaml";
	}
	
	/**
	 * Tasks config relative to the crew source file
	 * @return
	 */
	protected String getTasksConfig() {
		return "config/tasks.yaml";
	}
	
	protected void addComment(Commented commented, Consumer<? super Source> consumer) {
		String comment = commented.getComment();
		if (!Util.isBlank(comment)) {
			Source commentSource = Source.create("\"\"\"" + System.lineSeparator() + comment + System.lineSeparator() +  "\"\"\"");
			consumer.accept(commentSource);
		}
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
		
		String crewCode = crew.getCode();
		if (!Util.isBlank(crewCode)) {
			crewClassBody.add(Source.create(crewCode));			
		}
		
		String agentsConfig = getAgentsConfig();
		crewClassBody.add(Variable.createVariable(getAgentsConfigVariableName(), "'" + agentsConfig + "'"));
		
		String tasksConfig = getAgentsConfig();
		String taskConfigVariableName = getTasksConfigVariableName();
		crewClassBody.add(Variable.createVariable(taskConfigVariableName, "'" + tasksConfig + "'"));

		// TODO - split tools monitor for agents and tasks.
		
		for (Tool tool: crew.getTools()) {
			String toolDeclarations = tool.getDeclarations();
			if (!Util.isBlank(toolDeclarations)) {
				addComment(tool, crewClassBody::add);
				crewClassBody.add(Source.create(toolDeclarations));
			}
		}
		
		for (Agent agent: crew.getAgents()) {			
			Function agentMethod = pythonFactory.createFunction();
			agentMethod.getBody().add(createAgentFunctionBody(agent, progressMonitor));
			agentMethod.setAnnotation(getAgentMethodAnnotation(agent));
			agentMethod.setName(getAgentMethodName(agent));
			agentMethod.getParameters().add("self");
			agentMethod.getDecorators().add("agent");
			addComment(agent, crewClassBody::add);
			crewClassBody.add(agentMethod);		
		}
		
		for (Task task: crew.getTasks()) {			
			Function taskMethod = pythonFactory.createFunction();
			taskMethod.getBody().add(createTaskFunctionBody(task, progressMonitor));
			taskMethod.setAnnotation(getTaskMethodAnnotation(task));
			taskMethod.setName(getTaskMethodName(task));
			taskMethod.getParameters().add("self");
			taskMethod.getDecorators().add("task");
			addComment(task, crewClassBody::add);
			crewClassBody.add(taskMethod);		
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
		pythonResource.save(null);
		
		// Generating and saving configs, adding agents to tasks, context, ...
		
		
	}

	protected void addImports(Crew crew, Class crewClass) {
		addDefaultImports(crewClass);
		List<String> allImports = new ArrayList<>();
		allImports.add(crew.getImports());
		TreeIterator<Object> cit = EcoreUtil.getAllContents(crewClass, true);
		while (cit.hasNext()) {
			Object next = cit.next();
			if (next instanceof Code) {
				allImports.add(((Code) next).getCode());
			}
		}

		for (String toImport: allImports) {
			if (!Util.isBlank(toImport)) {
				// TODO - parse YAML, add
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

	protected Source createAgentFunctionBody(Agent agent, ProgressMonitor progressMonitor) {
		StringBuilder extraArgs = new StringBuilder();
		if (!agent.getTools().isEmpty()) {
			extraArgs
				.append(",")
				.append(System.lineSeparator())
				.append("tools[");
			
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
		return Source.create(
			"""
			return Agent(
				config=self.%s['%s'],
				verbose=True%s
			)				
			""".formatted(
					getAgentsConfigVariableName(), 
					getAgentConfigKey(agent),
					extraArgs));
	}

	protected Source createTaskFunctionBody(Task task, ProgressMonitor progressMonitor) {
		StringBuilder extraArgs = new StringBuilder();
		if (!task.getTools().isEmpty()) {
			extraArgs
				.append(",")
				.append(System.lineSeparator())
				.append("tools[");
			
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
		return Source.create(
			"""
			return Task(
				config=self.%s['%s'],
				verbose=True
			)				
			""".formatted(getTasksConfigVariableName(), getTaskConfigKey(task)));
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
