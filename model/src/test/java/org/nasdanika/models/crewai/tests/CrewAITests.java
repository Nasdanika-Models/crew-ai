package org.nasdanika.models.crewai.tests;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.crewai.Agent;
import org.nasdanika.models.crewai.Crew;
import org.nasdanika.models.crewai.CrewaiFactory;
import org.nasdanika.models.crewai.Task;
import org.nasdanika.models.crewai.Tool;
import org.nasdanika.models.crewai.util.CrewGenerator;
import org.nasdanika.models.python.Class;
import org.nasdanika.models.python.Function;
import org.nasdanika.models.python.Import;
import org.nasdanika.models.python.PythonFactory;
import org.nasdanika.models.python.Variable;

public class CrewAITests {

	@Test
	public void testGeneratePython() throws Exception {
		// Building
		PythonFactory pythonFactory = PythonFactory.eINSTANCE;
		
		// Class
		Class pClass = pythonFactory.createClass();
		pClass.setName("LatestAiDevelopment");
		pClass.getDecorators().add("CrewBase");			
		Import crewBaseImport = pythonFactory.createImport();
		crewBaseImport.setModule("crewai.project");
		crewBaseImport.setItem("CrewBase");
		pClass.getImports().add(crewBaseImport);
		
		org.nasdanika.models.source.Source classDoc = org.nasdanika.models.source.Source.create("\"\"\"LatestAiDevelopment crew\"\"\"");
		pClass.getBody().add(classDoc);
		
		pClass.getBody().add(org.nasdanika.models.source.Source.create(
		"""

		# Learn more about YAML configuration files here:
		# Agents: https://docs.crewai.com/concepts/agents#yaml-configuration-recommended
		# Tasks: https://docs.crewai.com/concepts/tasks#yaml-configuration-recommended
		agents_config = 'config/agents.yaml'		
		"""));
		
		// Variable
		Variable taskConfig = pythonFactory.createVariable();
		taskConfig.setName("task_config");
		taskConfig.setExpression("'config/tasks.yaml'");
		pClass.getBody().add(taskConfig);
		
		// Function
		Function researcherFunction = pythonFactory.createFunction();
		org.nasdanika.models.source.Source researcherFunctionBody = org.nasdanika.models.source.Source.create(
			"""
			return Agent(
				config=self.agents_config['researcher'],
				verbose=True
			)				
			""");
		
		researcherFunction.getBody().add(researcherFunctionBody);
		researcherFunction.setAnnotation("Agent");
		
		researcherFunction.setName("researcher");
		researcherFunction.getParameters().add("self");
		
		researcherFunction.getDecorators().add("agent");
		Import crewAgentImport = pythonFactory.createImport();
		crewAgentImport.setModule("crewai");
		crewAgentImport.setItem("Agent");
		researcherFunction.getImports().add(crewAgentImport);
		
		Import agentImport = pythonFactory.createImport();
		agentImport.setModule("crewai.project");
		agentImport.setItem("agent");
		researcherFunction.getImports().add(agentImport);
		
		pClass.getBody().add(researcherFunction);
		
		// Saving		
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);

		File pythonFile = new File("target/test.py").getCanonicalFile();
		Resource pythonResource = resourceSet.createResource(URI.createFileURI(pythonFile.getAbsolutePath()));
		pythonResource.getContents().add(pClass);
		pythonResource.save(null);
	}
	
	@Test
	public void testGenerateCrew() throws Exception {
		// Saving
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);

		File crewFile = new File("target/latest-ai-development-crew.xml").getCanonicalFile();
		Resource crewResource = resourceSet.createResource(URI.createFileURI(crewFile.getAbsolutePath()));
		crewResource.getContents().add(createCrew());
		crewResource.save(null);
	}

	protected Crew createCrew() {
		// Building
		CrewaiFactory crewaiFactory = CrewaiFactory.eINSTANCE;
		
		// Tools
		Tool serper = crewaiFactory.createTool();
		serper.setCode("SerperDevTool()");		
		serper.setImports(
				"""
				module: crewai_tools
				item: SerperDevTool
				""");
		
		// Agents
		Agent researcher = crewaiFactory.createAgent();
		researcher.setComment(
			"""
			Some important
			comment 
			about the researcher
			""");
		researcher.setId("researcher"); // Element id
		researcher.setName("Senior Data Researcher"); // Element label
		researcher.setConfiguration(
			"""
			role: >
			  {topic} Senior Data Researcher
			goal: >
			  Uncover cutting-edge developments in {topic}
			backstory: >
			  You're a seasoned researcher with a knack for uncovering the latest
			  developments in {topic}. Known for your ability to find the most relevant
              information and present it in a clear and concise manner.			
			""");
		
		Agent reportingAnalyst = crewaiFactory.createAgent();
		reportingAnalyst.setId("reporting_analyst");
		reportingAnalyst.setName("Reporting Analyst");
		reportingAnalyst.setConfiguration(
			"""
			role: >
			  {topic} Reporting Analyst
			goal: >
			  Create detailed reports based on {topic} data analysis and research findings
			backstory: >
			  You're a meticulous analyst with a keen eye for detail. You're known for
			  your ability to turn complex data into clear and concise reports, making
			  it easy for others to understand and act on the information you provide.
    		""");
				
		// Tasks		
		Task researchTask = crewaiFactory.createTask();
		researchTask.setId("research_task");
		researchTask.setName("Research Task");
		researchTask.setConfiguration(
			"""
			description: >
			  Conduct a thorough research about {topic}
			  Make sure you find any interesting and relevant information given
			  the current year is 2025.
			expected_output: >
			  A list with 10 bullet points of the most relevant information about {topic}
			""");
		researchTask.setAgent(researcher);
		researchTask.getTools().add(serper);
				
		Task reportingTask = crewaiFactory.createTask();
		reportingTask.setId("reporting_task");
		reportingTask.setName("Reporting Task");
		reportingTask.setConfiguration(
			"""
			description: >
			  Review the context you got and expand each topic into a full section for a report.
			  Make sure the report is detailed and contains any and all relevant information.
			expected_output: >
			  A fully fledge reports with the mains topics, each with a full section of information.
			  Formatted as markdown without '```'
			output_file: report.md
  			""");
		reportingTask.setAgent(reportingAnalyst);
				
		// Crew
		Crew crew = crewaiFactory.createCrew();
		crew.setId("LatestAiDevelopmentCrew");
		crew.setName("Latest AI Development Crew");
		
		// Example of importing using spel token
//		crew.setCode("""
//				my_var = ${spel:addItemImport('my_module', 'my_item').item}
//				""");
		
		EList<Agent> agents = crew.getAgents();
		agents.add(researcher);
		agents.add(reportingAnalyst);
		
		EList<Task> tasks = crew.getTasks();
		tasks.add(researchTask);
		tasks.add(reportingTask);
		
		crew.getTools().add(serper);
		return crew;
	}
	
	/**
	 * Generates a crew Python source file and configuration files 
	 * @throws Exception
	 */
	@Test
	public void testGenerateCrewSources() throws Exception {		
		// Generating		
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);

		File crewSourceFile = new File("target/latest-ai-developments/src/crew.py").getCanonicalFile();
		URI crewSourceURI = URI.createFileURI(crewSourceFile.getAbsolutePath());
		CrewGenerator crewGenerator = new CrewGenerator();
		crewGenerator.generate(
				createCrew(), 
				crewSourceURI, 
				resourceSet, 
				progressMonitor);
	}
	
	
}
