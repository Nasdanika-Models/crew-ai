module org.nasdanika.models.crewai.processors {
		
	requires transitive org.nasdanika.models.crewai;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.crewai.processors.ecore;
	opens org.nasdanika.models.crewai.processors.ecore; // For loading resources
	
	exports org.nasdanika.models.crewai.processors.doc;
	opens org.nasdanika.models.crewai.processors.doc; // For loading resources
	
}
