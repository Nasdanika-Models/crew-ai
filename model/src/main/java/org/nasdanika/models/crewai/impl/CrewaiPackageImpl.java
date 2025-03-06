/**
 */
package org.nasdanika.models.crewai.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.drawio.model.ModelPackage;

import org.nasdanika.models.architecture.ArchitecturePackage;

import org.nasdanika.models.crewai.Crew;
import org.nasdanika.models.crewai.CrewaiFactory;
import org.nasdanika.models.crewai.CrewaiPackage;

import org.nasdanika.models.party.PartyPackage;

import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrewaiPackageImpl extends EPackageImpl implements CrewaiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crewEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.crewai.CrewaiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CrewaiPackageImpl() {
		super(eNS_URI, CrewaiFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CrewaiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CrewaiPackage init() {
		if (isInited) return (CrewaiPackage)EPackage.Registry.INSTANCE.getEPackage(CrewaiPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCrewaiPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CrewaiPackageImpl theCrewaiPackage = registeredCrewaiPackage instanceof CrewaiPackageImpl ? (CrewaiPackageImpl)registeredCrewaiPackage : new CrewaiPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ArchitecturePackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();
		org.nasdanika.graph.model.ModelPackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();
		PartyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCrewaiPackage.createPackageContents();

		// Initialize created meta-data
		theCrewaiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCrewaiPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CrewaiPackage.eNS_URI, theCrewaiPackage);
		return theCrewaiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrew() {
		return crewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrewaiFactory getCrewaiFactory() {
		return (CrewaiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		crewEClass = createEClass(CREW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ArchitecturePackage theArchitecturePackage = (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		crewEClass.getESuperTypes().add(theArchitecturePackage.getArchitectureDescriptionElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(crewEClass, Crew.class, "Crew", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "A model of CrewAI classes - Crew, Agent, Task, Tool."
		   });
	}

} //CrewaiPackageImpl
