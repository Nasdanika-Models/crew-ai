package org.nasdanika.models.family.tests;

public class CrewAITests {
	
//	@Test
//	public void testLoadFamilyFromDrawioDiagram() throws Exception {
//		CapabilityLoader capabilityLoader = new CapabilityLoader();
//		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
//		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
//		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
//		
//		File familyDiagramFile = new File("family.drawio").getCanonicalFile();
//		Resource familyResource = resourceSet.getResource(URI.createFileURI(familyDiagramFile.getAbsolutePath()), true);
//		assertEquals(1, familyResource.getContents().size());
//		Family family = (Family) familyResource.getContents().get(0);
//		assertEquals("Sample Family", family.getName());
//
//		EList<Person> members = family.getMembers();
//		assertEquals(11, members.size());
//		
//		// Comparator
//		assertEquals("alain", members.get(0).getId()); 
//		assertEquals("albert", members.get(1).getId()); 
//		assertEquals("bryan", members.get(2).getId()); 
//
//		Person albert = members
//				.stream()
//				.filter(m -> "albert".equals(m.getId()))
//				.findFirst().get();
//		assertTrue(albert instanceof Man);
//		assertEquals("Albert", albert.getName());
//		
//		Person dave = members
//				.stream()
//				.filter(m -> m.getName().equals("Dave"))
//				.findAny()
//				.get();
//		assertEquals("Elias", dave.getFather().getName());
//		assertEquals(2, dave.getFather().getParents().size());
//		assertEquals(4, dave.getFather().getChildren().size());
//		assertEquals(1, dave.getChildren().size());
//		assertEquals(1, dave.getParents().size());
//	}	
	
}
