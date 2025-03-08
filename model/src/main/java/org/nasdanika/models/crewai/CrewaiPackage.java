/**
 */
package org.nasdanika.models.crewai;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.nasdanika.ncore.NcorePackage;

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
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.ConfigurableImpl <em>Configurable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.ConfigurableImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getConfigurable()
	 * @generated
	 */
	int CONFIGURABLE = 10;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.ToolImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 11;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.AgentImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 12;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.CrewImpl <em>Crew</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.CrewImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getCrew()
	 * @generated
	 */
	int CREW = 13;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.TaskImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.SourceElementImpl <em>Source Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.SourceElementImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getSourceElement()
	 * @generated
	 */
	int SOURCE_ELEMENT = 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.CodeImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 5;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.FunctionImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.AssignmentImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 7;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.GuardrailImpl <em>Guardrail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.GuardrailImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getGuardrail()
	 * @generated
	 */
	int GUARDRAIL = 8;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.CallbackImpl <em>Callback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.CallbackImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getCallback()
	 * @generated
	 */
	int CALLBACK = 9;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.ResourceImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MARKERS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__URIS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__UUID = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LABEL_PROTOTYPE = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__REPRESENTATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ANNOTATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DOCUMENTATION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTEXT_HELP = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__ID;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.ImportImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.SourceUnitImpl <em>Source Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.SourceUnitImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getSourceUnit()
	 * @generated
	 */
	int SOURCE_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__MARKERS = RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__URIS = RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__UUID = RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__LABEL_PROTOTYPE = RESOURCE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__REPRESENTATIONS = RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__ANNOTATIONS = RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__DOCUMENTATION = RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__CONTEXT_HELP = RESOURCE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__ID = RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__IMPORTS = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__ELEMENTS = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT___GENERATE__STRING = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT___GENERATE = RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.ContainerImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MARKERS = RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__URIS = RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__UUID = RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LABEL_PROTOTYPE = RESOURCE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__REPRESENTATIONS = RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ANNOTATIONS = RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOCUMENTATION = RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTEXT_HELP = RESOURCE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RESOURCES = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__MODULE = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ITEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__IMPORTS = 0;

	/**
	 * The number of structural features of the '<em>Source Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT___GENERATE__STRING = 0;

	/**
	 * The number of operations of the '<em>Source Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__IMPORTS = SOURCE_ELEMENT__IMPORTS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CODE = SOURCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = SOURCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___GENERATE__STRING = SOURCE_ELEMENT___GENERATE__STRING;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = SOURCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IMPORTS = CODE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CODE = CODE__CODE;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MARKERS = CODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__URIS = CODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DESCRIPTION = CODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__UUID = CODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LABEL_PROTOTYPE = CODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__REPRESENTATIONS = CODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ANNOTATIONS = CODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = CODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DOCUMENTATION = CODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CONTEXT_HELP = CODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = CODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = CODE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = CODE_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION___GENERATE__STRING = CODE___GENERATE__STRING;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = CODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__IMPORTS = CODE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__CODE = CODE__CODE;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__MARKERS = CODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__URIS = CODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__DESCRIPTION = CODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__UUID = CODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__LABEL_PROTOTYPE = CODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__REPRESENTATIONS = CODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ANNOTATIONS = CODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__NAME = CODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__DOCUMENTATION = CODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__CONTEXT_HELP = CODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ID = CODE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = CODE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GENERATE__STRING = CODE___GENERATE__STRING;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = CODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__IMPORTS = FUNCTION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__CODE = FUNCTION__CODE;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__MARKERS = FUNCTION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__URIS = FUNCTION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__DESCRIPTION = FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__UUID = FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__LABEL_PROTOTYPE = FUNCTION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__REPRESENTATIONS = FUNCTION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__ANNOTATIONS = FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__DOCUMENTATION = FUNCTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__CONTEXT_HELP = FUNCTION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Guardrail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL___GENERATE__STRING = FUNCTION___GENERATE__STRING;

	/**
	 * The number of operations of the '<em>Guardrail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__IMPORTS = FUNCTION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__CODE = FUNCTION__CODE;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__MARKERS = FUNCTION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__URIS = FUNCTION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__DESCRIPTION = FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__UUID = FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__LABEL_PROTOTYPE = FUNCTION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__REPRESENTATIONS = FUNCTION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__ANNOTATIONS = FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__DOCUMENTATION = FUNCTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__CONTEXT_HELP = FUNCTION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK___GENERATE__STRING = FUNCTION___GENERATE__STRING;

	/**
	 * The number of operations of the '<em>Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__MARKERS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__URIS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__DESCRIPTION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__UUID = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__LABEL_PROTOTYPE = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__REPRESENTATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__ANNOTATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__NAME = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__DOCUMENTATION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__CONTEXT_HELP = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__ID = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__CONFIGURATION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configurable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_FEATURE_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Configurable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_OPERATION_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__IMPORTS = CODE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CODE = CODE__CODE;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = CODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___GENERATE__STRING = CODE___GENERATE__STRING;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OPERATION_COUNT = CODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MARKERS = CONFIGURABLE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__URIS = CONFIGURABLE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DESCRIPTION = CONFIGURABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__UUID = CONFIGURABLE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__LABEL_PROTOTYPE = CONFIGURABLE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__REPRESENTATIONS = CONFIGURABLE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ANNOTATIONS = CONFIGURABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = CONFIGURABLE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DOCUMENTATION = CONFIGURABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CONTEXT_HELP = CONFIGURABLE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ID = CONFIGURABLE__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CONFIGURATION = CONFIGURABLE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__TOOLS = CONFIGURABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__LLM = CONFIGURABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function Calling Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__FUNCTION_CALLING_LLM = CONFIGURABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Step Callback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__STEP_CALLBACK = CONFIGURABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Knowledge Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__KNOWLEDGE_SOURCES = CONFIGURABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Embedder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__EMBEDDER = CONFIGURABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = CONFIGURABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = CONFIGURABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__IMPORTS = SOURCE_ELEMENT__IMPORTS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__MARKERS = SOURCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__URIS = SOURCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__DESCRIPTION = SOURCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__UUID = SOURCE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__LABEL_PROTOTYPE = SOURCE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__REPRESENTATIONS = SOURCE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__ANNOTATIONS = SOURCE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__NAME = SOURCE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__DOCUMENTATION = SOURCE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__CONTEXT_HELP = SOURCE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__ID = SOURCE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__TOOLS = SOURCE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__AGENTS = SOURCE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__TASKS = SOURCE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Before Kickoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__BEFORE_KICKOFF = SOURCE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>After Kickoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__AFTER_KICKOFF = SOURCE_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__PROCESS = SOURCE_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Knowledge Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__KNOWLEDGE_SOURCES = SOURCE_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Manager Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__MANAGER_LLM = SOURCE_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Function Calling Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__FUNCTION_CALLING_LLM = SOURCE_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Planning Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__PLANNING_LLM = SOURCE_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Embedder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__EMBEDDER = SOURCE_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Crew</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_FEATURE_COUNT = SOURCE_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW___GENERATE__STRING = SOURCE_ELEMENT___GENERATE__STRING;

	/**
	 * The number of operations of the '<em>Crew</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_OPERATION_COUNT = SOURCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MARKERS = CONFIGURABLE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__URIS = CONFIGURABLE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = CONFIGURABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__UUID = CONFIGURABLE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LABEL_PROTOTYPE = CONFIGURABLE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REPRESENTATIONS = CONFIGURABLE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ANNOTATIONS = CONFIGURABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = CONFIGURABLE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DOCUMENTATION = CONFIGURABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTEXT_HELP = CONFIGURABLE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = CONFIGURABLE__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONFIGURATION = CONFIGURABLE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Guardrail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__GUARDRAIL = CONFIGURABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__AGENT = CONFIGURABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TOOLS = CONFIGURABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTEXT = CONFIGURABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Callback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CALLBACK = CONFIGURABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = CONFIGURABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = CONFIGURABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.LargeLangaugeModelImpl <em>Large Langauge Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.LargeLangaugeModelImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getLargeLangaugeModel()
	 * @generated
	 */
	int LARGE_LANGAUGE_MODEL = 15;

	/**
	 * The number of structural features of the '<em>Large Langauge Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGAUGE_MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Large Langauge Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGAUGE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.KnowledgeSourceImpl <em>Knowledge Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.KnowledgeSourceImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getKnowledgeSource()
	 * @generated
	 */
	int KNOWLEDGE_SOURCE = 16;

	/**
	 * The number of structural features of the '<em>Knowledge Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Knowledge Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.Process <em>Process</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.Process
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 17;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.Configurable <em>Configurable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configurable</em>'.
	 * @see org.nasdanika.models.crewai.Configurable
	 * @generated
	 */
	EClass getConfigurable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.crewai.Configurable#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see org.nasdanika.models.crewai.Configurable#getConfiguration()
	 * @see #getConfigurable()
	 * @generated
	 */
	EAttribute getConfigurable_Configuration();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see org.nasdanika.models.crewai.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see org.nasdanika.models.crewai.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.crewai.Agent#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tools</em>'.
	 * @see org.nasdanika.models.crewai.Agent#getTools()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Tools();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.crewai.Agent#getLlm <em>Llm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Llm</em>'.
	 * @see org.nasdanika.models.crewai.Agent#getLlm()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Llm();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.crewai.Agent#getFunctionCallingLlm <em>Function Calling Llm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Calling Llm</em>'.
	 * @see org.nasdanika.models.crewai.Agent#getFunctionCallingLlm()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_FunctionCallingLlm();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.crewai.Agent#getStepCallback <em>Step Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step Callback</em>'.
	 * @see org.nasdanika.models.crewai.Agent#getStepCallback()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_StepCallback();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.crewai.Agent#getKnowledgeSources <em>Knowledge Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Knowledge Sources</em>'.
	 * @see org.nasdanika.models.crewai.Agent#getKnowledgeSources()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_KnowledgeSources();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.crewai.Agent#getEmbedder <em>Embedder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Embedder</em>'.
	 * @see org.nasdanika.models.crewai.Agent#getEmbedder()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Embedder();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.crewai.Crew#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getTools()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_Tools();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.crewai.Crew#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getAgents()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_Agents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.crewai.Crew#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getTasks()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_Tasks();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.crewai.Crew#getBeforeKickoff <em>Before Kickoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Before Kickoff</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getBeforeKickoff()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_BeforeKickoff();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.crewai.Crew#getAfterKickoff <em>After Kickoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After Kickoff</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getAfterKickoff()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_AfterKickoff();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.crewai.Crew#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getProcess()
	 * @see #getCrew()
	 * @generated
	 */
	EAttribute getCrew_Process();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.crewai.Crew#getKnowledgeSources <em>Knowledge Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Knowledge Sources</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getKnowledgeSources()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_KnowledgeSources();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.crewai.Crew#getManagerLlm <em>Manager Llm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager Llm</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getManagerLlm()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_ManagerLlm();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.crewai.Crew#getFunctionCallingLlm <em>Function Calling Llm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Calling Llm</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getFunctionCallingLlm()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_FunctionCallingLlm();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.crewai.Crew#getPlanningLlm <em>Planning Llm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Planning Llm</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getPlanningLlm()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_PlanningLlm();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.crewai.Crew#getEmbedder <em>Embedder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Embedder</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getEmbedder()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_Embedder();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.nasdanika.models.crewai.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.crewai.Task#getGuardrail <em>Guardrail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guardrail</em>'.
	 * @see org.nasdanika.models.crewai.Task#getGuardrail()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Guardrail();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.crewai.Task#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see org.nasdanika.models.crewai.Task#getAgent()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Agent();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.crewai.Task#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tools</em>'.
	 * @see org.nasdanika.models.crewai.Task#getTools()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Tools();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.crewai.Task#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context</em>'.
	 * @see org.nasdanika.models.crewai.Task#getContext()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Context();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.crewai.Task#getCallback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callback</em>'.
	 * @see org.nasdanika.models.crewai.Task#getCallback()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Callback();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.nasdanika.models.crewai.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.crewai.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see org.nasdanika.models.crewai.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.nasdanika.models.crewai.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.Guardrail <em>Guardrail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guardrail</em>'.
	 * @see org.nasdanika.models.crewai.Guardrail
	 * @generated
	 */
	EClass getGuardrail();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.Callback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callback</em>'.
	 * @see org.nasdanika.models.crewai.Callback
	 * @generated
	 */
	EClass getCallback();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.nasdanika.models.crewai.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.nasdanika.models.crewai.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.crewai.Import#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see org.nasdanika.models.crewai.Import#getModule()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Module();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.crewai.Import#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item</em>'.
	 * @see org.nasdanika.models.crewai.Import#getItem()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Item();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.crewai.Import#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.crewai.Import#getName()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.SourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Element</em>'.
	 * @see org.nasdanika.models.crewai.SourceElement
	 * @generated
	 */
	EClass getSourceElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.crewai.SourceElement#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.nasdanika.models.crewai.SourceElement#getImports()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_Imports();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.crewai.SourceElement#generate(java.lang.String) <em>Generate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate</em>' operation.
	 * @see org.nasdanika.models.crewai.SourceElement#generate(java.lang.String)
	 * @generated
	 */
	EOperation getSourceElement__Generate__String();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see org.nasdanika.models.crewai.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.crewai.Code#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.models.crewai.Code#getCode()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Code();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.SourceUnit <em>Source Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Unit</em>'.
	 * @see org.nasdanika.models.crewai.SourceUnit
	 * @generated
	 */
	EClass getSourceUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.crewai.SourceUnit#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.models.crewai.SourceUnit#getElements()
	 * @see #getSourceUnit()
	 * @generated
	 */
	EReference getSourceUnit_Elements();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.crewai.SourceUnit#generate() <em>Generate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate</em>' operation.
	 * @see org.nasdanika.models.crewai.SourceUnit#generate()
	 * @generated
	 */
	EOperation getSourceUnit__Generate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.nasdanika.models.crewai.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.crewai.Container#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.nasdanika.models.crewai.Container#getResources()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Resources();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.LargeLangaugeModel <em>Large Langauge Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Langauge Model</em>'.
	 * @see org.nasdanika.models.crewai.LargeLangaugeModel
	 * @generated
	 */
	EClass getLargeLangaugeModel();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.KnowledgeSource <em>Knowledge Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Source</em>'.
	 * @see org.nasdanika.models.crewai.KnowledgeSource
	 * @generated
	 */
	EClass getKnowledgeSource();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.crewai.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process</em>'.
	 * @see org.nasdanika.models.crewai.Process
	 * @generated
	 */
	EEnum getProcess();

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
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.ConfigurableImpl <em>Configurable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.ConfigurableImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getConfigurable()
		 * @generated
		 */
		EClass CONFIGURABLE = eINSTANCE.getConfigurable();
		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURABLE__CONFIGURATION = eINSTANCE.getConfigurable_Configuration();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.ToolImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.AgentImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();
		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__TOOLS = eINSTANCE.getAgent_Tools();
		/**
		 * The meta object literal for the '<em><b>Llm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__LLM = eINSTANCE.getAgent_Llm();
		/**
		 * The meta object literal for the '<em><b>Function Calling Llm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__FUNCTION_CALLING_LLM = eINSTANCE.getAgent_FunctionCallingLlm();
		/**
		 * The meta object literal for the '<em><b>Step Callback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__STEP_CALLBACK = eINSTANCE.getAgent_StepCallback();
		/**
		 * The meta object literal for the '<em><b>Knowledge Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__KNOWLEDGE_SOURCES = eINSTANCE.getAgent_KnowledgeSources();
		/**
		 * The meta object literal for the '<em><b>Embedder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__EMBEDDER = eINSTANCE.getAgent_Embedder();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.CrewImpl <em>Crew</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.CrewImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getCrew()
		 * @generated
		 */
		EClass CREW = eINSTANCE.getCrew();
		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__TOOLS = eINSTANCE.getCrew_Tools();
		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__AGENTS = eINSTANCE.getCrew_Agents();
		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__TASKS = eINSTANCE.getCrew_Tasks();
		/**
		 * The meta object literal for the '<em><b>Before Kickoff</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__BEFORE_KICKOFF = eINSTANCE.getCrew_BeforeKickoff();
		/**
		 * The meta object literal for the '<em><b>After Kickoff</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__AFTER_KICKOFF = eINSTANCE.getCrew_AfterKickoff();
		/**
		 * The meta object literal for the '<em><b>Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREW__PROCESS = eINSTANCE.getCrew_Process();
		/**
		 * The meta object literal for the '<em><b>Knowledge Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__KNOWLEDGE_SOURCES = eINSTANCE.getCrew_KnowledgeSources();
		/**
		 * The meta object literal for the '<em><b>Manager Llm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__MANAGER_LLM = eINSTANCE.getCrew_ManagerLlm();
		/**
		 * The meta object literal for the '<em><b>Function Calling Llm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__FUNCTION_CALLING_LLM = eINSTANCE.getCrew_FunctionCallingLlm();
		/**
		 * The meta object literal for the '<em><b>Planning Llm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__PLANNING_LLM = eINSTANCE.getCrew_PlanningLlm();
		/**
		 * The meta object literal for the '<em><b>Embedder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__EMBEDDER = eINSTANCE.getCrew_Embedder();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.TaskImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();
		/**
		 * The meta object literal for the '<em><b>Guardrail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__GUARDRAIL = eINSTANCE.getTask_Guardrail();
		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__AGENT = eINSTANCE.getTask_Agent();
		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TOOLS = eINSTANCE.getTask_Tools();
		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__CONTEXT = eINSTANCE.getTask_Context();
		/**
		 * The meta object literal for the '<em><b>Callback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__CALLBACK = eINSTANCE.getTask_Callback();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.FunctionImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();
		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.AssignmentImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.GuardrailImpl <em>Guardrail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.GuardrailImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getGuardrail()
		 * @generated
		 */
		EClass GUARDRAIL = eINSTANCE.getGuardrail();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.CallbackImpl <em>Callback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.CallbackImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getCallback()
		 * @generated
		 */
		EClass CALLBACK = eINSTANCE.getCallback();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.ResourceImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.ImportImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();
		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__MODULE = eINSTANCE.getImport_Module();
		/**
		 * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__ITEM = eINSTANCE.getImport_Item();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.SourceElementImpl <em>Source Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.SourceElementImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getSourceElement()
		 * @generated
		 */
		EClass SOURCE_ELEMENT = eINSTANCE.getSourceElement();
		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__IMPORTS = eINSTANCE.getSourceElement_Imports();
		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE_ELEMENT___GENERATE__STRING = eINSTANCE.getSourceElement__Generate__String();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.CodeImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();
		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__CODE = eINSTANCE.getCode_Code();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.SourceUnitImpl <em>Source Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.SourceUnitImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getSourceUnit()
		 * @generated
		 */
		EClass SOURCE_UNIT = eINSTANCE.getSourceUnit();
		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_UNIT__ELEMENTS = eINSTANCE.getSourceUnit_Elements();
		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE_UNIT___GENERATE = eINSTANCE.getSourceUnit__Generate();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.ContainerImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();
		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__RESOURCES = eINSTANCE.getContainer_Resources();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.LargeLangaugeModelImpl <em>Large Langauge Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.LargeLangaugeModelImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getLargeLangaugeModel()
		 * @generated
		 */
		EClass LARGE_LANGAUGE_MODEL = eINSTANCE.getLargeLangaugeModel();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.KnowledgeSourceImpl <em>Knowledge Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.KnowledgeSourceImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getKnowledgeSource()
		 * @generated
		 */
		EClass KNOWLEDGE_SOURCE = eINSTANCE.getKnowledgeSource();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.Process <em>Process</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.Process
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getProcess()
		 * @generated
		 */
		EEnum PROCESS = eINSTANCE.getProcess();

	}

} //CrewaiPackage
