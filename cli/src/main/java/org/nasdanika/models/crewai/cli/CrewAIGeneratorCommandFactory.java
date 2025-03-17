package org.nasdanika.models.crewai.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.nasdanika.cli.SubCommandCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

import picocli.CommandLine;

public class CrewAIGeneratorCommandFactory extends SubCommandCapabilityFactory<CrewAIGeneratorCommand> {

	@Override
	protected Class<CrewAIGeneratorCommand> getCommandType() {
		return CrewAIGeneratorCommand.class;
	}
	
	@Override
	protected CompletionStage<CrewAIGeneratorCommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			ProgressMonitor progressMonitor) {
		return CompletableFuture.completedStage(new CrewAIGeneratorCommand(loader.getCapabilityLoader()));
	}

}
