/**
 */
package org.nasdanika.models.crewai.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.common.Util;
import org.nasdanika.emf.DiagnosticHelper;
import org.nasdanika.models.crewai.Agent;
import org.nasdanika.models.crewai.Callback;
import org.nasdanika.models.crewai.Code;
import org.nasdanika.models.crewai.Configurable;
import org.nasdanika.models.crewai.Crew;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.crewai.Function;
import org.nasdanika.models.crewai.Guardrail;
import org.nasdanika.models.crewai.KnowledgeSource;
import org.nasdanika.models.crewai.LargeLanguageModel;
import org.nasdanika.models.crewai.Task;
import org.nasdanika.models.crewai.Tool;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.error.YAMLException;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.crewai.CrewaiPackage
 * @generated
 */
public class CrewaiValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CrewaiValidator INSTANCE = new CrewaiValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.nasdanika.models.crewai";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrewaiValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CrewaiPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CrewaiPackage.CODE:
				return validateCode((Code)value, diagnostics, context);
			case CrewaiPackage.FUNCTION:
				return validateFunction((Function)value, diagnostics, context);
			case CrewaiPackage.GUARDRAIL:
				return validateGuardrail((Guardrail)value, diagnostics, context);
			case CrewaiPackage.CALLBACK:
				return validateCallback((Callback)value, diagnostics, context);
			case CrewaiPackage.CONFIGURABLE:
				return validateConfigurable((Configurable)value, diagnostics, context);
			case CrewaiPackage.TOOL:
				return validateTool((Tool)value, diagnostics, context);
			case CrewaiPackage.AGENT:
				return validateAgent((Agent)value, diagnostics, context);
			case CrewaiPackage.CREW:
				return validateCrew((Crew)value, diagnostics, context);
			case CrewaiPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case CrewaiPackage.LARGE_LANGUAGE_MODEL:
				return validateLargeLanguageModel((LargeLanguageModel)value, diagnostics, context);
			case CrewaiPackage.KNOWLEDGE_SOURCE:
				return validateKnowledgeSource((KnowledgeSource)value, diagnostics, context);
			case CrewaiPackage.PROCESS:
				return validateProcess((org.nasdanika.models.crewai.Process)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCode(Code code, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(code, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(code, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(code, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(code, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(code, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(code, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(code, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(code, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(code, diagnostics, context);
		if (result || diagnostics != null) result &= validateCode_imports(code, diagnostics, context);
		return result;
	}

	/**
	 * Validates the imports constraint of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCode_imports(Code code, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "imports", getObjectLabel(code, context) },
						 new Object[] { code },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(function, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= validateCode_imports(function, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardrail(Guardrail guardrail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(guardrail, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(guardrail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(guardrail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(guardrail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(guardrail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(guardrail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(guardrail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(guardrail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(guardrail, diagnostics, context);
		if (result || diagnostics != null) result &= validateCode_imports(guardrail, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallback(Callback callback, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callback, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callback, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callback, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callback, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callback, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callback, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callback, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callback, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callback, diagnostics, context);
		if (result || diagnostics != null) result &= validateCode_imports(callback, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurable(Configurable configurable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(configurable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(configurable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(configurable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(configurable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(configurable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(configurable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(configurable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(configurable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(configurable, diagnostics, context);
		if (result || diagnostics != null) result &= validateCode_imports(configurable, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfigurable_configuration(configurable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the configuration constraint of '<em>Configurable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConfigurable_configuration(Configurable configurable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		String config = configurable.getConfiguration();
		if (!Util.isBlank(config)) {
			Yaml yaml = new Yaml();
			try {
				Object configObj = yaml.load(config);
				if (configObj instanceof Map) {
					// TODO - validate supported keys, perhaps a warning
				} else {
					if (diagnostics != null) {
						DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, CrewaiPackage.CONFIGURABLE__CONFIGURATION, configurable);
						helper.error("Configuration shall be a YAML map");									
						return helper.isSuccess();
					}
					return false;					
				}
			} catch (YAMLException e) {
				if (diagnostics != null) {
					DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, CrewaiPackage.CONFIGURABLE__CONFIGURATION, configurable);
					helper.error("Invalid configuration: " + e);									
					return helper.isSuccess();
				}
				return false;									
			}
		}
		return true;
	}
	
//	protected Diagnostic createErrorDiagnostic(
//			int code, 
//			String message, 
//			Object[] data, 
//			Map<Object, Object> context) {
//			
//		return createDiagnostic(Diagnostic.ERROR, code, message, data, context);
//	}
//	
//	protected Diagnostic createWarningDiagnostic(
//			int code, 
//			String message, 
//			Object[] data, 
//			Map<Object, Object> context) {
//			
//		return createDiagnostic(Diagnostic.WARNING, code, message, data, context);
//	}
//	
//	protected Diagnostic createDiagnostic(
//			int severity, 
//			int code, 
//			String message, 
//			Object[] data, 
//			Map<Object, Object> context) {
//		
//		return new BasicDiagnostic(
//				severity,
//				DIAGNOSTIC_SOURCE,
//				code,
//				message,
//				data);
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTool(Tool tool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tool, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tool, diagnostics, context);
		if (result || diagnostics != null) result &= validateCode_imports(tool, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgent(Agent agent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(agent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validateCode_imports(agent, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfigurable_configuration(agent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrew(Crew crew, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(crew, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(crew, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(crew, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(crew, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(crew, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(crew, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(crew, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(crew, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(crew, diagnostics, context);
		if (result || diagnostics != null) result &= validateCode_imports(crew, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateCode_imports(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfigurable_configuration(task, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLargeLanguageModel(LargeLanguageModel largeLanguageModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(largeLanguageModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKnowledgeSource(KnowledgeSource knowledgeSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(knowledgeSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(org.nasdanika.models.crewai.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CrewaiValidator
