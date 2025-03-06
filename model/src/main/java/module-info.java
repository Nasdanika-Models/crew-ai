import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.crewai.util.CrewAIEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.crewai {
	exports org.nasdanika.models.crewai;
	exports org.nasdanika.models.crewai.impl;
	exports org.nasdanika.models.crewai.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.architecture;
	
	provides CapabilityFactory with CrewAIEPackageResourceSetCapabilityFactory;
	
}