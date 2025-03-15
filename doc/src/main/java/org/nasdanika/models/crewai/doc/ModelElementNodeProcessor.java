package org.nasdanika.models.crewai.doc;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.AppFactory;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.gen.DynamicTableBuilder;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.EObjectNodeProcessor;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;

/**
 * Base class for other processors with common functionality.
 * @param <T>
 */
public abstract class ModelElementNodeProcessor<T extends EObject> extends EObjectNodeProcessor<T> {
	
	public static final String GUARDRAIL_ICON = "https://crew-ai.models.nasdanika.org/images/barrier.svg";
	public static final String TOOL_ICON = "https://crew-ai.models.nasdanika.org/images/tool.svg";	
	public static final String TASK_ICON = "https://crew-ai.models.nasdanika.org/images/task.svg";	
	public static final String LLM_ICON = "https://crew-ai.models.nasdanika.org/images/ai.svg";	
	public static final String KNOWLDEGE_SOURCE_ICON = "https://crew-ai.models.nasdanika.org/images/book.svg";	
	public static final String FUNCTION_ICON = "https://crew-ai.models.nasdanika.org/images/settings.svg";	
	public static final String CREW_ICON = "https://crew-ai.models.nasdanika.org/images/navy.svg";	
	public static final String CONFIGURABLE_ICON = "https://crew-ai.models.nasdanika.org/images/web-management.svg";	
	public static final String CALLBACK_ICON = "https://crew-ai.models.nasdanika.org/images/callback.svg";	
	public static final String CODE_ICON = "https://crew-ai.models.nasdanika.org/images/script.svg";	
	public static final String AGENT_ICON = "https://crew-ai.models.nasdanika.org/images/software-agent.svg";
	
	protected ModelElementNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}		
	
	/**
	* Suppressing default behavior, explicit specification of how to build.
	*/	
	@Override
	protected void addReferenceChildren(
		EReference eReference, 
		Collection<Label> labels, 
		Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
		ProgressMonitor progressMonitor) {
	}
		
	@Override
	public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
		super.configureLabel(source, label, progressMonitor);
//		if (source == getTarget() && label instanceof Link) {
//			String location = ((Link) label).getLocation();
//			URI uri = getUri();
//			if (uri != null 
//					&& location != null 
//					&& uri.toString().equals(location)) {
//				
//				if (Util.isBlank(label.getIcon())) {
//					label.setIcon(getIcon());
//				}
//				if (Util.isBlank(label.getTooltip()) && source instanceof ModelElement) {
//					label.setTooltip(((ModelElement) source).getDescription());
//				}
//			}
//		}		
		if (source == getTarget()) {
			if (Util.isBlank(label.getIcon())) {
				label.setIcon(getIcon());
			}
			if (Util.isBlank(label.getTooltip()) && source instanceof ModelElement) {
				label.setTooltip(((ModelElement) source).getDescription());
			}
		}		
	}

	protected String getIcon() {
		return getTypeIcon();
	}	
	
	protected String getTypeIcon() {
		return null;
	}
		
	/**
	 * Returns an action matched by location, creates if necessary..
	 * @param parent
	 * @return
	 */
	protected Action getRoleAction(
			Action parent, 
			java.util.function.Function<Action, Collection<? super Action>> accessor,
			String location, 
			String text,
			String icon) {
		
		Collection<? super Action> roleActions = accessor.apply(parent);
		return roleActions
			.stream()
			.filter(e -> e instanceof Action && location.equals(((Action) e).getLocation()))
			.findFirst()
			.map(Action.class::cast)
			.orElseGet(() -> {
				Action ret = AppFactory.eINSTANCE.createAction();
				ret.setText(text);
				ret.setIcon(icon);
				ret.setLocation(location);
				roleActions.add(ret);
				return ret;
			});
	}	
	
	/**
	 * Builds columns for {@link ENamedElement}
	 * @param tableBuilder
	 * @param progressMonitor
	 */
	protected void buildNamedElementColumns(DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> tableBuilder, ProgressMonitor progressMonitor) {
		tableBuilder
			.addStringColumnBuilder("name", true, false, "Name", endpoint -> targetNameLink(endpoint.getKey(), endpoint.getValue(), progressMonitor)) 
			.addStringColumnBuilder("description", true, false, "Description", endpoint -> description(endpoint.getKey(), endpoint.getValue(), progressMonitor));
	}
	
	protected String targetNameLink(EReferenceConnection connection, WidgetFactory widgetFactory, ProgressMonitor progressMonitor) {
		String linkStr = widgetFactory.createLinkString(progressMonitor);
		return Util.isBlank(linkStr) ? ((NamedElement) connection.getTarget().get()).getName() : linkStr;
	}
	
	protected String description(EReferenceConnection connection, WidgetFactory widgetFactory, ProgressMonitor progressMonitor) {
		Object label = widgetFactory.createLabel(progressMonitor);
		return label instanceof Label ? ((Label) label).getTooltip() : null;
	}	
	
	
}
