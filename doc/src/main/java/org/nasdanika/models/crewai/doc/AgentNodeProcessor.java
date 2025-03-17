package org.nasdanika.models.crewai.doc;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.gen.DynamicTableBuilder;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.OutgoingReferenceBuilder;
import org.nasdanika.models.crewai.Agent;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.ncore.NamedElement;

public class AgentNodeProcessor extends ConfigurableNodeProcessor<Agent> {

	public AgentNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		

	@Override
	protected String getTypeIcon() {
		return AGENT_ICON;
	}	
	
	@OutgoingReferenceBuilder(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.AGENT,
			referenceID = CrewaiPackage.AGENT__TOOLS)
	public void buildToolsOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
				.toList();		

		for (Label label: labels) {
			Action toolsAction = getRoleActionByName(
					((Action) label).getSections(), 
					"tools", 
					"Tools", 
					TOOLS_ICON);
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				toolsAction.getChildren().addAll(re.getValue());
			}
			if (label instanceof Action) {										
				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> toolsTableBuilder = new DynamicTableBuilder<>("nsd-table");
				buildNamedElementColumns(toolsTableBuilder, progressMonitor);
				
				org.nasdanika.models.html.Tag agentsTable = toolsTableBuilder.build(
						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
							return ane.getName().compareTo(bne.getName());
						}).toList(),  
						"agent-tools", 
						"tools-table", 
						progressMonitor);
				
				toolsAction.getContent().add(agentsTable);
			}
		}
	}	
	
	@OutgoingReferenceBuilder(
			nsURI = CrewaiPackage.eNS_URI,
			classID = CrewaiPackage.AGENT,
			referenceID = CrewaiPackage.AGENT__TASKS)
	public void buildTasksOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
				.toList();		

		for (Label label: labels) {
			Action toolsAction = getRoleActionByName(
					((Action) label).getSections(), 
					"tasks", 
					"Tasks", 
					TASKS_ICON);
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				toolsAction.getChildren().addAll(re.getValue());
			}
			if (label instanceof Action) {										
				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> toolsTableBuilder = new DynamicTableBuilder<>("nsd-table");
				buildNamedElementColumns(toolsTableBuilder, progressMonitor);
				
				org.nasdanika.models.html.Tag agentsTable = toolsTableBuilder.build(
						referenceOutgoingEndpoints
							.stream()
							.sorted((a,b) -> a.getKey().getIndex() - b.getKey().getIndex())
							.toList(),  
						"agent-tasks", 
						"tasks-table", 
						progressMonitor);
				
				toolsAction.getContent().add(agentsTable);
			}
		}
	}	
	
	@Override
	protected Collection<Entry<String, Collection<EObject>>> getProperties(ProgressMonitor progressMonitor) {
		Map<String, Collection<EObject>> properties = new LinkedHashMap<>();
		Object configuration = getConfiguration();
		if (configuration instanceof Map) {
			Map<?, ?> cMap = (Map<?,?>) configuration;
			Object role = cMap.get("role");
			if (role instanceof String) {
				properties.put("Role", Collections.singleton(createText((String) role)));
			}
			Object goal = cMap.get("goal");
			if (goal instanceof String) {
				properties.put("Goal", Collections.singleton(createText((String) goal)));
			}			
		}
		return properties.entrySet();		
	}
	
	/**
	 * Parses configuration for Role, Goal, and Back story
	 */
	@Override
	protected Label createAction(ProgressMonitor progressMonitor) {
		Action action = (Action) super.createAction(progressMonitor);
		Object configuration = getConfiguration();
		if (configuration instanceof Map) {
			Map<?, ?> cMap = (Map<?,?>) configuration;
			Object backstory = cMap.get("backstory");
			if (backstory instanceof String) {
				Action backstoryAction = getRoleActionByLocation(
						action.getSections(), 
						"backstory", 
						"Backstory", 
						BACKSTORY_ICON);
				
				backstoryAction.getContent().add(createText((String) backstory));
			}
		}
		return action;
	}	
	
	// TODO - llm, function calling llm, step callback, embedder
	
}
