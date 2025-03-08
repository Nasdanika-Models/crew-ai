package org.nasdanika.models.crewai.cli;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.cli.CommandGroup;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.common.Description;
import org.nasdanika.common.EObjectSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.drawio.ConnectionBase;
import org.nasdanika.drawio.Document;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParentCommand;

@Command(
		description = {
				"Generates a CrewAI model from",
				"a Drawio diagram"
				},
		versionProvider = ModuleVersionProvider.class,		
		mixinStandardHelpOptions = true,
		name = "crew-ai")
@ParentCommands(Document.Supplier.class)
@Description(icon = "https://cdn.jsdelivr.net/gh/Nasdanika-Models/crew-ai@main/cli/web-resources/crewai.svg")
public class CrewAICommand extends CommandGroup implements EObjectSupplier<EObject> {

	protected CrewAICommand() {
		super();
	}

	protected CrewAICommand(CapabilityLoader capabilityLoader) {
		super(capabilityLoader);
	}
		
	@ParentCommand
	private Document.Supplier documentSupplier;
		
	@Option(
		names = {"-p", "--processor-property"},
		description = {
			"Processor property",
			"Defaults to ${DEFAULT-VALUE}"
		},
		defaultValue = "processor")
	@Description
	private String processorProperty;
		
//	@Option(
//		names = {"-c", "--connection-base"},
//		description = {
//			"Connection base",
//			"Valid values: ${COMPLETION-CANDIDATES}"
//		})
	private ConnectionBase connectionBase;

	@Override
	public Collection<EObject> getEObjects(ProgressMonitor progressMonitor) {
		// TODO Auto-generated method stub
		return null;
	}	
	
//	protected ElementInvocableFactory createFactory(ProgressMonitor progressMonitor) {
//		return new ElementInvocableFactory(documentSupplier.getDocument(null), processorProperty);
//	}

}
