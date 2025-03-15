package org.nasdanika.models.crewai.doc;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.graph.WidgetFactory;

public class FunctionNodeProcessor<T extends org.nasdanika.models.crewai.Function> extends CodeNodeProcessor<T> {

	public FunctionNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}		

	@Override
	protected String getTypeIcon() {
		return FUNCTION_ICON;
	}	
	
}
