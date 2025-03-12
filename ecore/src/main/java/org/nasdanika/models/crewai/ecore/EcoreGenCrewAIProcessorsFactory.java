package org.nasdanika.models.crewai.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector.Factory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;

@EPackageNodeProcessorFactory(nsURI = CrewaiPackage.eNS_URI)
public class EcoreGenCrewAIProcessorsFactory {

	private Context context;
	
//	@Factory
//	public final AgentProcessorsFactory agentProcessorsFactory;
//	
//	@Factory
//	public final AssignmentProcessorsFactory assignmentProcessorsFactory;
//	
//	@Factory
//	public final CallbackProcessorsFactory callbackProcessorsFactory;
//	
//	@Factory
//	public final CodeProcessorsFactory codeProcessorsFactory;
//	
//	@Factory
//	public final ConfigurableProcessorsFactory configurableProcessorsFactory;
//	
//	@Factory
//	public final ContainerProcessorsFactory containerProcessorsFactory;
	
	@Factory
	public final CrewProcessorsFactory crewProcessorsFactory;
		
//	@Factory
//	public final FunctionProcessorsFactory functionProcessorsFactory;
//	
//	@Factory
//	public final GuardrailProcessorsFactory guardrailProcessorsFactory;
//	
//	@Factory
//	public final ImportProcessorsFactory importProcessorsFactory;
//	
//	@Factory
//	public final KnowledgeSourceProcessorsFactory knowledgeSourceProcessorsFactory;
//	
//	@Factory
//	public final LargeLanguageModelProcessorsFactory largeLanguageModelProcessorsFactory;
//	
//	@Factory
//	public final ProcessProcessorsFactory processProcessorsFactory;
//	
//	@Factory
//	public final ResourceProcessorsFactory resourceProcessorsFactory;
//	
//	@Factory
//	public final SourceElementProcessorsFactory sourceElementProcessorsFactory;
//	
//	@Factory
//	public final SourceUnitProcessorsFactory sourceUnitProcessorsFactory;
//	
//	@Factory
//	public final TaskProcessorsFactory taskProcessorsFactory;
//	
//	@Factory
//	public final ToolProcessorsFactory toolProcessorsFactory;	
	
	public EcoreGenCrewAIProcessorsFactory(Context context) {
		this.context = context;
		crewProcessorsFactory = new CrewProcessorsFactory(context);
//		Agent.java
//		Assignment.java
//		Callback.java
//		Code.java
//		Configurable.java
//		Container.java
//		Crew.java
//		Function.java
//		Guardrail.java
//		Import.java
//		KnowledgeSource.java
//		LargeLanguageModel.java
//		Process.java
//		Resource.java
//		SourceElement.java
//		SourceUnit.java
//		Task.java
//		Tool.java		
	}
	
	/**
	 * Test of different ways to conProcessorsFactory ProcessorsFactory;e action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EPackageNodeProcessorFactory(
			label = "CrewAI Model",
			//actionPrototypeRef = "test-package.yml",
//			actionPrototype = """
//                    app-action:
//                        text: Param
//                        icon: fas fa-user					
//					""",
			icon = "https://cdn.jsdelivr.net/gh/Nasdanika-Models/crew-ai@main/cli/web-resources/crewai.svg",
			description = "A model of a CrewAI concepts for the purposes of modeling and code generation",
			documentation =  """
				Family model is used to demonstrate different Nasdanika technologies such as:
				
				* Generating of metamodel (Ecore) documentation like this one
				* Loading of models from MS Excel and Drawio diagrams
				* Generation of HTML sites from loaded models		
				
				The model was created to mimic the model from [Eclipse Sirius Basic Family](https://wiki.eclipse.org/Sirius/Tutorials/BasicFamily) tutorial. 
				This site uses fee icons from [Icons8](https://icons8.com/) and quotes [Wikipedia](https://www.wikipedia.org/) articles.
				
				The diagram below is interactive:
				
				 * Hover the mouse pointer over the shapes and connections to see tooltips
				 * Click on the shapes and connections to navigate to the pages of the respective model elements.
				   
				Click on the diagram to make it fullscreen. Then you may click on the pencil icon to edit it in the browser. 				 				
				
				```drawio-resource
				crew-ai.drawio
				```
						
				"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}
