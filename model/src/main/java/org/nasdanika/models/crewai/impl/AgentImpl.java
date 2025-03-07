/**
 */
package org.nasdanika.models.crewai.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.crewai.Agent;
import org.nasdanika.models.crewai.Callback;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.crewai.KnowledgeSource;
import org.nasdanika.models.crewai.LargeLangaugeModel;
import org.nasdanika.models.crewai.Tool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.impl.AgentImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.AgentImpl#getLlm <em>Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.AgentImpl#getFunctionCallingLlm <em>Function Calling Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.AgentImpl#getStepCallback <em>Step Callback</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.AgentImpl#getKnowledgeSources <em>Knowledge Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends ConfigurableImpl implements Agent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrewaiPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Tool> getTools() {
		return (EList<Tool>)eDynamicGet(CrewaiPackage.AGENT__TOOLS, CrewaiPackage.Literals.AGENT__TOOLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LargeLangaugeModel getLlm() {
		return (LargeLangaugeModel)eDynamicGet(CrewaiPackage.AGENT__LLM, CrewaiPackage.Literals.AGENT__LLM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeLangaugeModel basicGetLlm() {
		return (LargeLangaugeModel)eDynamicGet(CrewaiPackage.AGENT__LLM, CrewaiPackage.Literals.AGENT__LLM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLlm(LargeLangaugeModel newLlm) {
		eDynamicSet(CrewaiPackage.AGENT__LLM, CrewaiPackage.Literals.AGENT__LLM, newLlm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LargeLangaugeModel getFunctionCallingLlm() {
		return (LargeLangaugeModel)eDynamicGet(CrewaiPackage.AGENT__FUNCTION_CALLING_LLM, CrewaiPackage.Literals.AGENT__FUNCTION_CALLING_LLM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeLangaugeModel basicGetFunctionCallingLlm() {
		return (LargeLangaugeModel)eDynamicGet(CrewaiPackage.AGENT__FUNCTION_CALLING_LLM, CrewaiPackage.Literals.AGENT__FUNCTION_CALLING_LLM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionCallingLlm(LargeLangaugeModel newFunctionCallingLlm) {
		eDynamicSet(CrewaiPackage.AGENT__FUNCTION_CALLING_LLM, CrewaiPackage.Literals.AGENT__FUNCTION_CALLING_LLM, newFunctionCallingLlm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Callback getStepCallback() {
		return (Callback)eDynamicGet(CrewaiPackage.AGENT__STEP_CALLBACK, CrewaiPackage.Literals.AGENT__STEP_CALLBACK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callback basicGetStepCallback() {
		return (Callback)eDynamicGet(CrewaiPackage.AGENT__STEP_CALLBACK, CrewaiPackage.Literals.AGENT__STEP_CALLBACK, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepCallback(Callback newStepCallback) {
		eDynamicSet(CrewaiPackage.AGENT__STEP_CALLBACK, CrewaiPackage.Literals.AGENT__STEP_CALLBACK, newStepCallback);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KnowledgeSource> getKnowledgeSources() {
		return (EList<KnowledgeSource>)eDynamicGet(CrewaiPackage.AGENT__KNOWLEDGE_SOURCES, CrewaiPackage.Literals.AGENT__KNOWLEDGE_SOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrewaiPackage.AGENT__TOOLS:
				return getTools();
			case CrewaiPackage.AGENT__LLM:
				if (resolve) return getLlm();
				return basicGetLlm();
			case CrewaiPackage.AGENT__FUNCTION_CALLING_LLM:
				if (resolve) return getFunctionCallingLlm();
				return basicGetFunctionCallingLlm();
			case CrewaiPackage.AGENT__STEP_CALLBACK:
				if (resolve) return getStepCallback();
				return basicGetStepCallback();
			case CrewaiPackage.AGENT__KNOWLEDGE_SOURCES:
				return getKnowledgeSources();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CrewaiPackage.AGENT__TOOLS:
				getTools().clear();
				getTools().addAll((Collection<? extends Tool>)newValue);
				return;
			case CrewaiPackage.AGENT__LLM:
				setLlm((LargeLangaugeModel)newValue);
				return;
			case CrewaiPackage.AGENT__FUNCTION_CALLING_LLM:
				setFunctionCallingLlm((LargeLangaugeModel)newValue);
				return;
			case CrewaiPackage.AGENT__STEP_CALLBACK:
				setStepCallback((Callback)newValue);
				return;
			case CrewaiPackage.AGENT__KNOWLEDGE_SOURCES:
				getKnowledgeSources().clear();
				getKnowledgeSources().addAll((Collection<? extends KnowledgeSource>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CrewaiPackage.AGENT__TOOLS:
				getTools().clear();
				return;
			case CrewaiPackage.AGENT__LLM:
				setLlm((LargeLangaugeModel)null);
				return;
			case CrewaiPackage.AGENT__FUNCTION_CALLING_LLM:
				setFunctionCallingLlm((LargeLangaugeModel)null);
				return;
			case CrewaiPackage.AGENT__STEP_CALLBACK:
				setStepCallback((Callback)null);
				return;
			case CrewaiPackage.AGENT__KNOWLEDGE_SOURCES:
				getKnowledgeSources().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CrewaiPackage.AGENT__TOOLS:
				return !getTools().isEmpty();
			case CrewaiPackage.AGENT__LLM:
				return basicGetLlm() != null;
			case CrewaiPackage.AGENT__FUNCTION_CALLING_LLM:
				return basicGetFunctionCallingLlm() != null;
			case CrewaiPackage.AGENT__STEP_CALLBACK:
				return basicGetStepCallback() != null;
			case CrewaiPackage.AGENT__KNOWLEDGE_SOURCES:
				return !getKnowledgeSources().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgentImpl
