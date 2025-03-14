package org.nasdanika.models.crewai.doc;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.crewai.Crew;

public class CrewNodeProcessor extends CodeNodeProcessor<Crew> {
	
	public CrewNodeProcessor(
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
		
//	@OutgoingReferenceBuilder(
//			nsURI = CrewaiPackage.eNS_URI,
//			classID = CrewaiPackage.CREW,
//			referenceID = CrewaiPackage.AGENTS)
//	public void buildAgentsOutgoingReference(
//			EReference eReference,
//			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
//			Collection<Label> labels,
//			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
//			ProgressMonitor progressMonitor) {
//
//		// TODO - a grouping label
//		for (Label tLabel: labels) {
//			for (Collection<Label> re: outgoingLabels.values()) { 
//				tLabel.getChildren().addAll(re);
//			}
//		}
//	}
	
	// A model of CrewAI classes - Crew, Agent, Task, Tool.
	
	@Override
	public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
		super.configureLabel(source, label, progressMonitor);
		if (source == getTarget() && label instanceof Action) {
			String location = ((Action) label).getLocation();
			URI uri = getUri();
			if (uri != null && location != null && uri.toString().equals(location)) {
				label.setIcon("https://crew-ai.models.nasdanika.org/images/navy.svg");
			}
		}		
	}
	
}
