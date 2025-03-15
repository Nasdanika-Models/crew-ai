package org.nasdanika.models.crewai.doc;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.crewai.KnowledgeSource;

public class KnowledgeSourceNodeProcessor extends ModelElementNodeProcessor<KnowledgeSource> {

	public KnowledgeSourceNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}		

	@Override
	protected String getTypeIcon() {
		return KNOWLDEGE_SOURCE_ICON;
	}	
	
}
