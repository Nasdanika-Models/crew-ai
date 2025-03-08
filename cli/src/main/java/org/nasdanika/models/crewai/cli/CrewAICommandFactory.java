package org.nasdanika.models.crewai.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.nasdanika.capability.CapabilityFactory.Loader;
import org.nasdanika.cli.SubCommandCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

import picocli.CommandLine;

public class CrewAICommandFactory extends SubCommandCapabilityFactory<CrewAICommand> {

	@Override
	protected Class<CrewAICommand> getCommandType() {
		return CrewAICommand.class;
	}
	
	@Override
	protected CompletionStage<CrewAICommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			ProgressMonitor progressMonitor) {
		return CompletableFuture.completedStage(new CrewAICommand(loader.getCapabilityLoader()));
	}

}
