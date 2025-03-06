/**
 */
package org.nasdanika.models.crewai;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.nasdanika.models.architecture.ArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A model of CrewAI classes - Crew, Agent, Task, Tool.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.crewai.CrewaiFactory
 * @model kind="package"
 * @generated
 */
public interface CrewaiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "crewai";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/crew-ai";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.crew-ai";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CrewaiPackage eINSTANCE = org.nasdanika.models.crewai.impl.CrewaiPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.CrewImpl <em>Crew</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.CrewImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getCrew()
	 * @generated
	 */
	int CREW = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__ID = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Semantic Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__SEMANTIC_MAPPINGS = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__SEMANTIC_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__MARKERS = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__URIS = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__DESCRIPTION = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__UUID = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__LABEL_PROTOTYPE = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__REPRESENTATIONS = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__ANNOTATIONS = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__NAME = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__DOCUMENTATION = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__CONTEXT_HELP = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__START = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__END = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__DURATION = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__ICON = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__ROLES = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT__ROLES;

	/**
	 * The number of structural features of the '<em>Crew</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_FEATURE_COUNT = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Crew</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_OPERATION_COUNT = ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.Crew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crew</em>'.
	 * @see org.nasdanika.models.crewai.Crew
	 * @generated
	 */
	EClass getCrew();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CrewaiFactory getCrewaiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.CrewImpl <em>Crew</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.CrewImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getCrew()
		 * @generated
		 */
		EClass CREW = eINSTANCE.getCrew();

	}

} //CrewaiPackage
