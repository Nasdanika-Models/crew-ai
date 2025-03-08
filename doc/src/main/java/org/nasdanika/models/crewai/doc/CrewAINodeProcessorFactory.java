package org.nasdanika.models.crewai.doc;

import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.emf.EObjectNode;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.emf.EObjectNodeProcessor;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.AppFactory;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.crewai.Crew;
import org.nasdanika.ncore.util.NcoreUtil;

/**
 * Node processor factory to use with {@link EObjectReflectiveProcessorFactory} to generate family documentation.
 * @author Pavel
 *
 */
public class CrewAINodeProcessorFactory {
			
	private Context context;
	private java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider;

	protected java.util.function.Function<ProgressMonitor, Action> getPrototypeProvider(NodeProcessorConfig<WidgetFactory, WidgetFactory> config) {
		return progressMonitor -> {
			if (prototypeProvider != null) {
				for (URI identifier: NcoreUtil.getIdentifiers(((EObjectNode) config.getElement()).get())) {
					Action prototype = prototypeProvider.apply(identifier, progressMonitor);
					if (prototype != null) {
						return prototype;
					}				
				}			
			}
			return AppFactory.eINSTANCE.createAction();
		};		
	}
	
	/**
	 * 
	 * @param context
	 * @param reflectiveFactories Objects with annotated methods for creating processors. 
	 */
	public CrewAINodeProcessorFactory(
			Context context, 
			java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider)  {
		this.context = context;
		this.prototypeProvider = prototypeProvider;
	}
	
	@EObjectNodeProcessor(type = Crew.class)
	public Object createCrewNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CrewNodeProcessor(config, context, getPrototypeProvider(config));
	}
	
}
