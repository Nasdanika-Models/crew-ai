/**
 */
package org.nasdanika.models.crewai;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	int CONFIGURABLE = 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.ToolImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 5;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.AgentImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.CrewImpl <em>Crew</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.CrewImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getCrew()
	 * @generated
	 */
	int CREW = 7;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.TaskImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 8;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.CodeImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.FunctionImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.GuardrailImpl <em>Guardrail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.GuardrailImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getGuardrail()
	 * @generated
	 */
	int GUARDRAIL = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.CallbackImpl <em>Callback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.CallbackImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getCallback()
	 * @generated
	 */
	int CALLBACK = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__COMMENT = 2;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CODE = CODE__CODE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IMPORTS = CODE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__COMMENT = CODE__COMMENT;

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
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = CODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__CODE = FUNCTION__CODE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__IMPORTS = FUNCTION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL__COMMENT = FUNCTION__COMMENT;

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
	 * The number of operations of the '<em>Guardrail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDRAIL_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__CODE = FUNCTION__CODE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__IMPORTS = FUNCTION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__COMMENT = FUNCTION__COMMENT;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__CODE = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__IMPORTS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__COMMENT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE__CONFIGURATION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Configurable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_FEATURE_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Configurable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_OPERATION_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CODE = CODE__CODE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__IMPORTS = CODE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__COMMENT = CODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__MARKERS = CODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__URIS = CODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DESCRIPTION = CODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__UUID = CODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__LABEL_PROTOTYPE = CODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__REPRESENTATIONS = CODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ANNOTATIONS = CODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = CODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DOCUMENTATION = CODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CONTEXT_HELP = CODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ID = CODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DECLARATIONS = CODE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = CODE_FEATURE_COUNT + 12;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CODE = CONFIGURABLE__CODE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__IMPORTS = CONFIGURABLE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__COMMENT = CONFIGURABLE__COMMENT;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__CODE = CODE__CODE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__IMPORTS = CODE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__COMMENT = CODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__MARKERS = CODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__URIS = CODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__DESCRIPTION = CODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__UUID = CODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__LABEL_PROTOTYPE = CODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__REPRESENTATIONS = CODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__ANNOTATIONS = CODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__NAME = CODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__DOCUMENTATION = CODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__CONTEXT_HELP = CODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__ID = CODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__TOOLS = CODE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__AGENTS = CODE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__TASKS = CODE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Before Kickoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__BEFORE_KICKOFF = CODE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>After Kickoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__AFTER_KICKOFF = CODE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__PROCESS = CODE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Knowledge Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__KNOWLEDGE_SOURCES = CODE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Language Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__LANGUAGE_MODELS = CODE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Manager Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__MANAGER_AGENT = CODE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Manager Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__MANAGER_LLM = CODE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Function Calling Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__FUNCTION_CALLING_LLM = CODE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Planning Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__PLANNING_LLM = CODE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Embedder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__EMBEDDER = CODE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Step Callback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__STEP_CALLBACK = CODE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Task Callback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__TASK_CALLBACK = CODE_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Crew</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_FEATURE_COUNT = CODE_FEATURE_COUNT + 26;

	/**
	 * The number of operations of the '<em>Crew</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_OPERATION_COUNT = CODE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CODE = CONFIGURABLE__CODE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPORTS = CONFIGURABLE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__COMMENT = CONFIGURABLE__COMMENT;

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
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.LargeLanguageModelImpl <em>Large Language Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.LargeLanguageModelImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getLargeLanguageModel()
	 * @generated
	 */
	int LARGE_LANGUAGE_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGUAGE_MODEL__MARKERS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGUAGE_MODEL__URIS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGUAGE_MODEL__DESCRIPTION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGUAGE_MODEL__UUID = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGUAGE_MODEL__LABEL_PROTOTYPE = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGUAGE_MODEL__REPRESENTATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGUAGE_MODEL__ANNOTATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGUAGE_MODEL__NAME = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGUAGE_MODEL__DOCUMENTATION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGUAGE_MODEL__CONTEXT_HELP = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGUAGE_MODEL__ID = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__ID;

	/**
	 * The number of structural features of the '<em>Large Language Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGUAGE_MODEL_FEATURE_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Large Language Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_LANGUAGE_MODEL_OPERATION_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.impl.KnowledgeSourceImpl <em>Knowledge Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.impl.KnowledgeSourceImpl
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getKnowledgeSource()
	 * @generated
	 */
	int KNOWLEDGE_SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE__MARKERS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE__URIS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE__DESCRIPTION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE__UUID = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE__LABEL_PROTOTYPE = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE__REPRESENTATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE__ANNOTATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE__NAME = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE__DOCUMENTATION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE__CONTEXT_HELP = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE__ID = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__ID;

	/**
	 * The number of structural features of the '<em>Knowledge Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE_FEATURE_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Knowledge Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_SOURCE_OPERATION_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.crewai.Process <em>Process</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.crewai.Process
	 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 11;


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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.crewai.Tool#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declarations</em>'.
	 * @see org.nasdanika.models.crewai.Tool#getDeclarations()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Declarations();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.crewai.Crew#getKnowledgeSources <em>Knowledge Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Knowledge Sources</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getKnowledgeSources()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_KnowledgeSources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.crewai.Crew#getLanguageModels <em>Language Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language Models</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getLanguageModels()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_LanguageModels();

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
	 * Returns the meta object for the reference '{@link org.nasdanika.models.crewai.Crew#getManagerAgent <em>Manager Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager Agent</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getManagerAgent()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_ManagerAgent();

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
	 * Returns the meta object for the reference '{@link org.nasdanika.models.crewai.Crew#getStepCallback <em>Step Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step Callback</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getStepCallback()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_StepCallback();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.crewai.Crew#getTaskCallback <em>Task Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Callback</em>'.
	 * @see org.nasdanika.models.crewai.Crew#getTaskCallback()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_TaskCallback();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.crewai.LargeLanguageModel <em>Large Language Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Language Model</em>'.
	 * @see org.nasdanika.models.crewai.LargeLanguageModel
	 * @generated
	 */
	EClass getLargeLanguageModel();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.crewai.Code#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imports</em>'.
	 * @see org.nasdanika.models.crewai.Code#getImports()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Imports();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.crewai.Code#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.models.crewai.Code#getComment()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Comment();

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
		 * The meta object literal for the '<em><b>Declarations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__DECLARATIONS = eINSTANCE.getTool_Declarations();
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
		 * The meta object literal for the '<em><b>Knowledge Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__KNOWLEDGE_SOURCES = eINSTANCE.getCrew_KnowledgeSources();
		/**
		 * The meta object literal for the '<em><b>Language Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__LANGUAGE_MODELS = eINSTANCE.getCrew_LanguageModels();
		/**
		 * The meta object literal for the '<em><b>Manager Llm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__MANAGER_LLM = eINSTANCE.getCrew_ManagerLlm();
		/**
		 * The meta object literal for the '<em><b>Manager Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__MANAGER_AGENT = eINSTANCE.getCrew_ManagerAgent();
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
		 * The meta object literal for the '<em><b>Step Callback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__STEP_CALLBACK = eINSTANCE.getCrew_StepCallback();
		/**
		 * The meta object literal for the '<em><b>Task Callback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__TASK_CALLBACK = eINSTANCE.getCrew_TaskCallback();
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
		 * The meta object literal for the '{@link org.nasdanika.models.crewai.impl.LargeLanguageModelImpl <em>Large Language Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.crewai.impl.LargeLanguageModelImpl
		 * @see org.nasdanika.models.crewai.impl.CrewaiPackageImpl#getLargeLanguageModel()
		 * @generated
		 */
		EClass LARGE_LANGUAGE_MODEL = eINSTANCE.getLargeLanguageModel();
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
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__IMPORTS = eINSTANCE.getCode_Imports();
		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__COMMENT = eINSTANCE.getCode_Comment();
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
