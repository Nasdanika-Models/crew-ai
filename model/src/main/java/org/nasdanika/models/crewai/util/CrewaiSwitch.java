/**
 */
package org.nasdanika.models.crewai.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.common.Adaptable;
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
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.DocumentedNamedElement;
import org.nasdanika.ncore.DocumentedNamedStringIdentity;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.ncore.StringIdentity;

import org.nasdanika.persistence.Marked;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.crewai.CrewaiPackage
 * @generated
 */
public class CrewaiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CrewaiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrewaiSwitch() {
		if (modelPackage == null) {
			modelPackage = CrewaiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CrewaiPackage.CODE: {
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrewaiPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseCode(function);
				if (result == null) result = caseDocumentedNamedStringIdentity(function);
				if (result == null) result = caseDocumentedNamedElement(function);
				if (result == null) result = caseStringIdentity(function);
				if (result == null) result = caseNamedElement(function);
				if (result == null) result = caseDocumented(function);
				if (result == null) result = caseModelElement(function);
				if (result == null) result = caseMarked(function);
				if (result == null) result = caseAdaptable(function);
				if (result == null) result = caseIMarked(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrewaiPackage.GUARDRAIL: {
				Guardrail guardrail = (Guardrail)theEObject;
				T result = caseGuardrail(guardrail);
				if (result == null) result = caseFunction(guardrail);
				if (result == null) result = caseCode(guardrail);
				if (result == null) result = caseDocumentedNamedStringIdentity(guardrail);
				if (result == null) result = caseDocumentedNamedElement(guardrail);
				if (result == null) result = caseStringIdentity(guardrail);
				if (result == null) result = caseNamedElement(guardrail);
				if (result == null) result = caseDocumented(guardrail);
				if (result == null) result = caseModelElement(guardrail);
				if (result == null) result = caseMarked(guardrail);
				if (result == null) result = caseAdaptable(guardrail);
				if (result == null) result = caseIMarked(guardrail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrewaiPackage.CALLBACK: {
				Callback callback = (Callback)theEObject;
				T result = caseCallback(callback);
				if (result == null) result = caseFunction(callback);
				if (result == null) result = caseCode(callback);
				if (result == null) result = caseDocumentedNamedStringIdentity(callback);
				if (result == null) result = caseDocumentedNamedElement(callback);
				if (result == null) result = caseStringIdentity(callback);
				if (result == null) result = caseNamedElement(callback);
				if (result == null) result = caseDocumented(callback);
				if (result == null) result = caseModelElement(callback);
				if (result == null) result = caseMarked(callback);
				if (result == null) result = caseAdaptable(callback);
				if (result == null) result = caseIMarked(callback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrewaiPackage.CONFIGURABLE: {
				Configurable configurable = (Configurable)theEObject;
				T result = caseConfigurable(configurable);
				if (result == null) result = caseDocumentedNamedStringIdentity(configurable);
				if (result == null) result = caseCode(configurable);
				if (result == null) result = caseDocumentedNamedElement(configurable);
				if (result == null) result = caseStringIdentity(configurable);
				if (result == null) result = caseNamedElement(configurable);
				if (result == null) result = caseDocumented(configurable);
				if (result == null) result = caseModelElement(configurable);
				if (result == null) result = caseMarked(configurable);
				if (result == null) result = caseAdaptable(configurable);
				if (result == null) result = caseIMarked(configurable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrewaiPackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = caseCode(tool);
				if (result == null) result = caseDocumentedNamedStringIdentity(tool);
				if (result == null) result = caseDocumentedNamedElement(tool);
				if (result == null) result = caseStringIdentity(tool);
				if (result == null) result = caseNamedElement(tool);
				if (result == null) result = caseDocumented(tool);
				if (result == null) result = caseModelElement(tool);
				if (result == null) result = caseMarked(tool);
				if (result == null) result = caseAdaptable(tool);
				if (result == null) result = caseIMarked(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrewaiPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = caseConfigurable(agent);
				if (result == null) result = caseDocumentedNamedStringIdentity(agent);
				if (result == null) result = caseCode(agent);
				if (result == null) result = caseDocumentedNamedElement(agent);
				if (result == null) result = caseStringIdentity(agent);
				if (result == null) result = caseNamedElement(agent);
				if (result == null) result = caseDocumented(agent);
				if (result == null) result = caseModelElement(agent);
				if (result == null) result = caseMarked(agent);
				if (result == null) result = caseAdaptable(agent);
				if (result == null) result = caseIMarked(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrewaiPackage.CREW: {
				Crew crew = (Crew)theEObject;
				T result = caseCrew(crew);
				if (result == null) result = caseCode(crew);
				if (result == null) result = caseDocumentedNamedStringIdentity(crew);
				if (result == null) result = caseDocumentedNamedElement(crew);
				if (result == null) result = caseStringIdentity(crew);
				if (result == null) result = caseNamedElement(crew);
				if (result == null) result = caseDocumented(crew);
				if (result == null) result = caseModelElement(crew);
				if (result == null) result = caseMarked(crew);
				if (result == null) result = caseAdaptable(crew);
				if (result == null) result = caseIMarked(crew);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrewaiPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseConfigurable(task);
				if (result == null) result = caseDocumentedNamedStringIdentity(task);
				if (result == null) result = caseCode(task);
				if (result == null) result = caseDocumentedNamedElement(task);
				if (result == null) result = caseStringIdentity(task);
				if (result == null) result = caseNamedElement(task);
				if (result == null) result = caseDocumented(task);
				if (result == null) result = caseModelElement(task);
				if (result == null) result = caseMarked(task);
				if (result == null) result = caseAdaptable(task);
				if (result == null) result = caseIMarked(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrewaiPackage.LARGE_LANGUAGE_MODEL: {
				LargeLanguageModel largeLanguageModel = (LargeLanguageModel)theEObject;
				T result = caseLargeLanguageModel(largeLanguageModel);
				if (result == null) result = caseDocumentedNamedStringIdentity(largeLanguageModel);
				if (result == null) result = caseDocumentedNamedElement(largeLanguageModel);
				if (result == null) result = caseStringIdentity(largeLanguageModel);
				if (result == null) result = caseNamedElement(largeLanguageModel);
				if (result == null) result = caseDocumented(largeLanguageModel);
				if (result == null) result = caseModelElement(largeLanguageModel);
				if (result == null) result = caseMarked(largeLanguageModel);
				if (result == null) result = caseAdaptable(largeLanguageModel);
				if (result == null) result = caseIMarked(largeLanguageModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrewaiPackage.KNOWLEDGE_SOURCE: {
				KnowledgeSource knowledgeSource = (KnowledgeSource)theEObject;
				T result = caseKnowledgeSource(knowledgeSource);
				if (result == null) result = caseDocumentedNamedStringIdentity(knowledgeSource);
				if (result == null) result = caseDocumentedNamedElement(knowledgeSource);
				if (result == null) result = caseStringIdentity(knowledgeSource);
				if (result == null) result = caseNamedElement(knowledgeSource);
				if (result == null) result = caseDocumented(knowledgeSource);
				if (result == null) result = caseModelElement(knowledgeSource);
				if (result == null) result = caseMarked(knowledgeSource);
				if (result == null) result = caseAdaptable(knowledgeSource);
				if (result == null) result = caseIMarked(knowledgeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurable(Configurable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crew</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crew</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrew(Crew object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Large Language Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Large Language Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLargeLanguageModel(LargeLanguageModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guardrail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guardrail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardrail(Guardrail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallback(Callback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowledgeSource(KnowledgeSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(org.nasdanika.ncore.Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptable(Adaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedNamedElement(DocumentedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedNamedStringIdentity(DocumentedNamedStringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CrewaiSwitch
