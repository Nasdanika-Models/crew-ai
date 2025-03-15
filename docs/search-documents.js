var searchDocuments = {"references/eClassifiers/Task/references/eStructuralFeatures/callback/index.html":{"path":"Task/References/callback","link-uuid":"765ecf28-3df2-4524-a317-bdb398c60f66","title":"callback","content":"Function to be executed after task completion."},"references/eClassifiers/Task/inheritance.html":{"path":"Task/Inheritance","link-uuid":"517da214-bed4-4382-b15a-231efb5ad1aa","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/KnowledgeSource/inheritance.html":{"path":"Knowledge Source/Inheritance","link-uuid":"33559671-593e-4637-80d6-ed453c69b395","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Function/index.html":{"link-uuid":"2aa70a7b-ced2-4523-b709-a196aea55bac","title":"Function","content":"Generates a python function."},"references/eClassifiers/Crew/references/eStructuralFeatures/embedder/index.html":{"path":"Crew/References/embedder","link-uuid":"681fb704-27d1-46fb-9164-fa7bb558e33e","title":"embedder","content":"Configuration for the embedder to be used by the crew."},"references/eClassifiers/Crew/references/eStructuralFeatures/stepCallback/index.html":{"path":"Crew/References/stepCallback","link-uuid":"0e0c2b0b-ceb4-4567-a548-3a98cc2dc789","title":"stepCallback","content":"A function that is called after each step of every agent. This can be used to log the agent&rsquo;s actions or to perform other operations; it won&rsquo;t override the agent-specific step callback."},"references/eClassifiers/Task/index.html":{"link-uuid":"88877f4b-4e87-406b-acc2-f88002665b1a","title":"Task","content":"A Task is a specific assignment completed by an Agent. Tasks provide all necessary details for execution, such as a description, the agent responsible, required tools, and more, facilitating a wide range of action complexities. Tasks can be collaborative, requiring multiple agents to work together."},"references/eClassifiers/Tool/inheritance.html":{"path":"Tool/Inheritance","link-uuid":"7cde21d3-b1e8-4f1d-bf2a-27e391a0f975","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Code/references/eStructuralFeatures/code/index.html":{"path":"Code/Attributes/code","link-uuid":"92adbbf8-692b-4527-9901-55e7e5574b6b","title":"code","content":"How code attribute is used is subclass-specific: Crew - code is added to the top of the generated crew class after configuration fields and before any other declarations. Agent and Task - code is used as agent/task method body template. Function - code is used to produce function body. Tool - what is added to the tools array. E.g. SerperDevTool(). Code can contain interpolation tokens for adding imports. Example: my_var = ${spel:addItemImport('my_module', 'my_item').item}\n spel: is a prefix for Spring Expression Language tokens. addItemImport('my_module', 'my_item').item - calls org.nasdanika.models.python.Source.addImport() method and then getItem() value of the result. Import methods: addItemImport(module, item) - the method used above addItemImport(module, item, name) - in this case use .name addModuleImport(module) - in this case use add dot and imported item after the token. e.g. ${spel:addModuleImport('my_module').module}.my_item addModuleImport(module, alias) - in this case use add dot and imported item after the token. e.g. ${spel:addModuleImport('my_module', 'mi_modulo').alias}.my_item"},"references/eClassifiers/Crew/references/eStructuralFeatures/afterKickoff/index.html":{"path":"Crew/References/afterKickoff","link-uuid":"70e13eed-cc73-48fe-bcd9-c31e19308fec","title":"afterKickoff","content":"Executes after the crew finishes."},"references/eClassifiers/Task/references/eStructuralFeatures/tools/index.html":{"path":"Task/References/tools","link-uuid":"73991ca6-654f-4189-b24d-3cdac2c41a72","title":"tools","content":"The tools/resources the agent is limited to use for this task."},"references/eClassifiers/Guardrail/index.html":{"link-uuid":"90394e74-7438-4731-9269-6b24d868c956","title":"Guardrail","content":"Task guardrails provide a powerful way to validate, transform, or filter task outputs before they are passed to the next task. Guardrails are optional functions that execute before the next task starts, allowing you to ensure that task outputs meet specific requirements or formats."},"references/eClassifiers/KnowledgeSource/index.html":{"link-uuid":"86e86603-1a04-4692-a797-0adb8bed1353","title":"Knowledge Source","content":"Knowledge allows agents to access and utilize external information sources during their tasks. Think of it as giving your agents a reference library they can consult while working."},"references/eClassifiers/Crew/references/eStructuralFeatures/functionCallingLlm/index.html":{"path":"Crew/References/functionCallingLlm","link-uuid":"319d1652-a481-4af8-abd1-ccf595c97bdd","title":"functionCallingLlm","content":"If passed, the crew will use this LLM to do function calling for tools for all agents in the crew. Each agent can have its own LLM, which overrides the crew&rsquo;s LLM for function calling."},"index.html":{"link-uuid":"72c13c23-43cb-4ef0-82fc-19931d47e85e","title":"CrewAI Model","content":"The CrewAI model can be used as a reference guide complementary to the official documentation1. Hover the mouse over the diagram elements above for short descriptions (tooltips), click to navigate to element pages with more details. The above diagram is conceptual - it shows only the most important classes and relationships. The generated UML class diagram provides more details. Hover the mouse over diagram elements for tooltips, click to navigate to class/feature pages. You can also use the default graph and other graphs to quickly grasp relationships of the model elements. Hover the mouse over graph nodes for tooltips and to highlight their reated classes. Drag to rearrange, double-click to navigate to class pages. It can also be used as a starting point for an organization-specific documentation - make a copy or fork, modify descriptions of model elements. For example, add links to catalogs of internal knowledge sources or approved/available LLMs and their configurations. Similarly, you may have a catalog of reusable agents or guardrails. You may also have organization-specific development guidelines with references to shared libraries and internal productivity tools such as code generators, wizards, IDE plugins, training resources, &hellip; You can also create a custom model by extending classes in this model and add classes and features specific to your organization. For example, catalogs, ownership and reponsibilities, alignment to organizational structure, development efforts, etc. However, the main objective of the model is to serve as an intermediary for code and documentation generation. The model can be populated from diagrams and other data sources. Then it produces a python model and, finally, Python sources and supporting artifacts. The model can be created from Drawio diagrams using exeutable diagrams or semantic mapping. You can find an example of programmatic population of a model here. The below code snippet shows how to generate a python source file and configuration files using CrewGenerator: CapabilityLoader capabilityLoader = new CapabilityLoader();\nProgressMonitor progressMonitor = new PrintStreamProgressMonitor();\nRequirement&lt;ResourceSetRequirement, ResourceSet&gt; requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);\nResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);\n\nFile crewSourceFile = new File(&quot;target/latest-ai-developments/src/crew.py&quot;).getCanonicalFile();\nURI crewSourceURI = URI.createFileURI(crewSourceFile.getAbsolutePath());\nCrewGenerator crewGenerator = new CrewGenerator();\ncrewGenerator.generate(\n\t\tcreateCrew(),\n\t\tcrewSourceURI,\n\t\tresourceSet,\n\t\tprogressMonitor);\n You can override CrewGenerator methods to customize the generation process. Documentation in this model is copied verbatim or almost verbatim from the reference documentation for the purpose of consistency. ↩ Step callback Agent You can think of an agent as a specialized team member with specific skills, expertise, and responsibilities. Task A specific assignment completed by an Agent Tool A skill or function that agents can utilize to perform various actions Guardrail Validates and transforms task outputs A crew may use multiple LLMs: * Function calling LLM * Manager LLM * Planning LLM Step and taks callbacks Crew A group of agents working together to complete a set of tasks Large Language Model (LLM) LLMs enable agents to understand context, make decisions, and generate human-like responses Knowledge Source An external source of information which agents use to work on tasks Callback A function called after completion of tasks and steps Context Family"},"references/eClassifiers/Crew/references/eStructuralFeatures/agents/index.html":{"path":"Crew/References/agents","link-uuid":"18f38750-b059-4b9c-82cc-1a7e51da0e89","title":"agents","content":"Agents in this crew."},"references/eClassifiers/Function/inheritance.html":{"path":"Function/Inheritance","link-uuid":"c6b8f6d1-2757-4fa8-99a7-9b2b43d926a0","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Agent/index.html":{"link-uuid":"2549060f-bbae-4a1b-a56d-eab18cdc5529","title":"Agent","content":"An Agent is an autonomous unit that can: Perform specific tasks Make decisions based on its role and goal Use tools to accomplish objectives Communicate and collaborate with other agents Maintain memory of interactions Delegate tasks when allowed"},"references/eClassifiers/Agent/inheritance.html":{"path":"Agent/Inheritance","link-uuid":"eb6ed2bb-f976-44f8-9e19-439dfccfa8a1","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Agent/references/eStructuralFeatures/embedder/index.html":{"path":"Agent/References/embedder","link-uuid":"fbbe8b68-064e-4040-bded-c127dbc6a2ad","title":"embedder","content":"Configuration for the embedder used by the agent."},"references/eClassifiers/Crew/references/eStructuralFeatures/taskCallback/index.html":{"path":"Crew/References/taskCallback","link-uuid":"2ad48bb9-95c5-4ee7-9d1c-21be9c4a1bf2","title":"taskCallback","content":"A function that is called after the completion of each task. Useful for monitoring or additional operations post-task execution."},"references/eClassifiers/LargeLanguageModel/inheritance.html":{"path":"Large Language Model/Inheritance","link-uuid":"9c3b12fe-3a22-40ec-8983-6f0f735693a9","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Function/references/eStructuralFeatures/parameters/index.html":{"path":"Function/Attributes/parameters","link-uuid":"26099e91-6c9c-44a5-aa8f-5fa203e3bd2d","title":"parameters","content":"A list of function parameters."},"references/eClassifiers/Crew/references/eStructuralFeatures/knowledgeSources/index.html":{"path":"Crew/References/knowledgeSources","link-uuid":"2c8f36eb-9bb9-46b1-a766-36788463eb07","title":"knowledgeSources","content":"Knowledge sources used by agents"},"references/eClassifiers/Crew/references/eStructuralFeatures/planningLlm/index.html":{"path":"Crew/References/planningLlm","link-uuid":"801fa21d-0163-4873-9436-94c7ad4670fd","title":"planningLlm","content":"The language model used by the AgentPlanner in a planning process"},"references/eClassifiers/Guardrail/inheritance.html":{"path":"Guardrail/Inheritance","link-uuid":"421ea243-b1e3-407c-b216-4c8100d009a6","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Agent/references/eStructuralFeatures/stepCallback/index.html":{"path":"Agent/References/stepCallback","link-uuid":"fcd88dc2-3890-45e0-9a49-92b175d8b212","title":"stepCallback","content":"Function called after each agent step, overrides crew callback."},"references/eClassifiers/Crew/references/eStructuralFeatures/managerLlm/index.html":{"path":"Crew/References/managerLlm","link-uuid":"6d4ae47c-bf60-4c63-b61c-58069fa03e65","title":"managerLlm","content":"The language model used by the manager agent in a hierarchical process."},"references/eClassifiers/Agent/references/eStructuralFeatures/llm/index.html":{"path":"Agent/References/llm","link-uuid":"45117b55-a274-465f-a1a2-e54e49f865c4","title":"llm","content":"Language model that powers the agent."},"references/eClassifiers/Tool/index.html":{"link-uuid":"510b11d8-2157-4893-bb6b-9e43702e0a12","title":"Tool","content":"A tool is a skill or function that agents can utilize to perform various actions."},"references/eClassifiers/Crew/references/eStructuralFeatures/tasks/index.html":{"path":"Crew/References/tasks","link-uuid":"cac2c7c7-acae-48b0-ba3d-a880e961e4e0","title":"tasks","content":"Tasks containment reference."},"references/eClassifiers/Configurable/index.html":{"link-uuid":"cc39b8d0-93ab-4e71-8c3d-8883761eda5b","title":"Configurable","content":"Base class for Agent and Task which can be configured with YAML."},"references/eClassifiers/Process/index.html":{"link-uuid":"431c218d-c8b6-429c-aa2c-c8e27c180b17","title":"Process","content":"Processes enable individual agents to operate as a cohesive unit, streamlining their efforts to achieve common objectives with efficiency and coherence."},"references/eClassifiers/Crew/references/eStructuralFeatures/managerAgent/index.html":{"path":"Crew/References/managerAgent","link-uuid":"947729cc-3a60-4550-806c-e72baa39b956","title":"managerAgent","content":"A custom agent managing the crew."},"references/eClassifiers/Crew/references/eStructuralFeatures/tools/index.html":{"path":"Crew/References/tools","link-uuid":"c17387da-24ea-43e1-a3ce-b244d7709812","title":"tools","content":"Tools containment reference."},"references/eClassifiers/Code/references/eStructuralFeatures/imports/index.html":{"path":"Code/Attributes/imports","link-uuid":"9ea10b13-a878-462c-82d8-182db434e9db","title":"imports","content":"Imports used by code can be specified as a list of maps or a single map with the keys corresponding to Import attributes."},"references/eClassifiers/Crew/index.html":{"link-uuid":"0f81b500-e314-49cc-ba37-7ef34e96f23c","title":"Crew","content":"A crew represents a collaborative group of agents working together to accomplish a set of tasks. Each crew defines the strategy for task execution, agent collaboration, and the overall workflow."},"references/eClassifiers/Crew/references/eStructuralFeatures/languageModels/index.html":{"path":"Crew/References/languageModels","link-uuid":"a28f060c-e681-42a1-9f1e-44e29a43a63e","title":"languageModels","content":"Language models used by the crew and its agents"},"references/eClassifiers/Code/inheritance.html":{"path":"Code/Inheritance","link-uuid":"c72ef06d-d519-490d-ade1-505cdd9e50f2","title":"Inheritance","content":"Subtypes "},"references/eClassifiers/Code/references/eStructuralFeatures/comment/index.html":{"path":"Code/Attributes/comment","link-uuid":"8149953a-6d66-42ed-95b5-d01237428712","title":"comment","content":"Comment to add before the code."},"references/eClassifiers/Callback/index.html":{"link-uuid":"25b4f899-86ae-45e0-a10f-73efa27ad5a5","title":"Callback","content":"Crew Step Callback - A function that is called after each step of every agent. Task Callback - A function that is called after the completion of each task. Useful for monitoring or additional operations post-task execution. Agent Step Callback - Function called after each agent step, overrides crew callback. Task Callback - Function/object to be executed after task completion."},"references/eClassifiers/Tool/references/eStructuralFeatures/declarations/index.html":{"path":"Tool/Attributes/declarations","link-uuid":"feecce4a-bdc2-4ed7-a9d7-dd8fe0051d7f","title":"declarations","content":"Declarations used by the tool. Added to the crew class body. For example, a shared search tool can have the following declaration: serper_tool = SeperDevTool()\n In this case the tool code would be serper_tool"},"references/eClassifiers/Agent/references/eStructuralFeatures/knowledgeSources/index.html":{"path":"Agent/References/knowledgeSources","link-uuid":"f72490c3-8aee-4446-9672-71f1dda50b95","title":"knowledgeSources","content":"Knowledge sources available to the agent."},"references/eClassifiers/Task/references/eStructuralFeatures/guardrail/index.html":{"path":"Task/References/guardrail","link-uuid":"c722e876-3fe5-4790-912a-ee6ec970fd24","title":"guardrail","content":"Task guardrails provide a way to validate and transform task outputs before they are passed to the next task. This feature helps ensure data quality and provides feedback to agents when their output doesn&rsquo;t meet specific criteria."},"references/eClassifiers/LargeLanguageModel/index.html":{"link-uuid":"0452c484-eb35-4166-86c2-5478873581f1","title":"Large Language Model","content":"Large Language Models (LLMs) are the core intelligence behind agents. They enable agents to understand context, make decisions, and generate human-like responses."},"references/eClassifiers/Agent/references/eStructuralFeatures/tools/index.html":{"path":"Agent/References/tools","link-uuid":"e3b5e714-d38c-4c74-8486-71c350558a1f","title":"tools","content":"Capabilities or functions available to the agent."},"references/eClassifiers/Configurable/references/eStructuralFeatures/configuration/index.html":{"path":"Configurable/Attributes/configuration","link-uuid":"8970cbdc-9d2a-4c6c-bb27-1f4c26bb1cd6","title":"configuration","content":"YAML configuration."},"references/eClassifiers/Agent/references/eStructuralFeatures/functionCallingLlm/index.html":{"path":"Agent/References/functionCallingLlm","link-uuid":"e81e2b3e-a1c6-47c3-b626-a1929cd582fa","title":"functionCallingLlm","content":"Language model for tool calling, overrides crew&rsquo;s LLM if specified."},"references/eClassifiers/Task/references/eStructuralFeatures/agent/index.html":{"path":"Task/References/agent","link-uuid":"04014161-3a35-4468-9749-aa44f1b84f90","title":"agent","content":"The agent responsible for executing the task."},"references/eClassifiers/Configurable/inheritance.html":{"path":"Configurable/Inheritance","link-uuid":"0008b54e-d914-4c11-aa14-ad54b9f86685","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Callback/inheritance.html":{"path":"Callback/Inheritance","link-uuid":"cd40e779-17dc-4840-aca2-8c34c6f775fc","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Crew/inheritance.html":{"path":"Crew/Inheritance","link-uuid":"de4f5b78-68f0-464c-87f2-89b7b84239e7","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Crew/references/eStructuralFeatures/beforeKickoff/index.html":{"path":"Crew/References/beforeKickoff","link-uuid":"c4401d4c-0ead-48fe-9c00-d0922b6e60c2","title":"beforeKickoff","content":"Executes before the crew starts."},"references/eClassifiers/Code/index.html":{"link-uuid":"294cc29f-61e7-44e4-9dff-7bc1d5f71c9f","title":"Code","content":"Base class for model element which generate python code."}}