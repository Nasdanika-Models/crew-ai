/**
 */
package org.nasdanika.models.crewai.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.crewai.Agent;
import org.nasdanika.models.crewai.Callback;
import org.nasdanika.models.crewai.Code;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.crewai.KnowledgeSource;
import org.nasdanika.models.crewai.LargeLanguageModel;
import org.nasdanika.models.crewai.Task;
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
 *   <li>{@link org.nasdanika.models.crewai.impl.AgentImpl#getEmbedder <em>Embedder</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.AgentImpl#getTasks <em>Tasks</em>}</li>
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
	public LargeLanguageModel getLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.AGENT__LLM, CrewaiPackage.Literals.AGENT__LLM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeLanguageModel basicGetLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.AGENT__LLM, CrewaiPackage.Literals.AGENT__LLM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLlm(LargeLanguageModel newLlm) {
		eDynamicSet(CrewaiPackage.AGENT__LLM, CrewaiPackage.Literals.AGENT__LLM, newLlm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LargeLanguageModel getFunctionCallingLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.AGENT__FUNCTION_CALLING_LLM, CrewaiPackage.Literals.AGENT__FUNCTION_CALLING_LLM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeLanguageModel basicGetFunctionCallingLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.AGENT__FUNCTION_CALLING_LLM, CrewaiPackage.Literals.AGENT__FUNCTION_CALLING_LLM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionCallingLlm(LargeLanguageModel newFunctionCallingLlm) {
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
	public Code getEmbedder() {
		return (Code)eDynamicGet(CrewaiPackage.AGENT__EMBEDDER, CrewaiPackage.Literals.AGENT__EMBEDDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetEmbedder() {
		return (Code)eDynamicGet(CrewaiPackage.AGENT__EMBEDDER, CrewaiPackage.Literals.AGENT__EMBEDDER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmbedder(Code newEmbedder) {
		eDynamicSet(CrewaiPackage.AGENT__EMBEDDER, CrewaiPackage.Literals.AGENT__EMBEDDER, newEmbedder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Task> getTasks() {
		return (EList<Task>)eDynamicGet(CrewaiPackage.AGENT__TASKS, CrewaiPackage.Literals.AGENT__TASKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrewaiPackage.AGENT__TOOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTools()).basicAdd(otherEnd, msgs);
			case CrewaiPackage.AGENT__KNOWLEDGE_SOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getKnowledgeSources()).basicAdd(otherEnd, msgs);
			case CrewaiPackage.AGENT__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrewaiPackage.AGENT__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.AGENT__KNOWLEDGE_SOURCES:
				return ((InternalEList<?>)getKnowledgeSources()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.AGENT__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case CrewaiPackage.AGENT__EMBEDDER:
				if (resolve) return getEmbedder();
				return basicGetEmbedder();
			case CrewaiPackage.AGENT__TASKS:
				return getTasks();
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
				setLlm((LargeLanguageModel)newValue);
				return;
			case CrewaiPackage.AGENT__FUNCTION_CALLING_LLM:
				setFunctionCallingLlm((LargeLanguageModel)newValue);
				return;
			case CrewaiPackage.AGENT__STEP_CALLBACK:
				setStepCallback((Callback)newValue);
				return;
			case CrewaiPackage.AGENT__KNOWLEDGE_SOURCES:
				getKnowledgeSources().clear();
				getKnowledgeSources().addAll((Collection<? extends KnowledgeSource>)newValue);
				return;
			case CrewaiPackage.AGENT__EMBEDDER:
				setEmbedder((Code)newValue);
				return;
			case CrewaiPackage.AGENT__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
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
				setLlm((LargeLanguageModel)null);
				return;
			case CrewaiPackage.AGENT__FUNCTION_CALLING_LLM:
				setFunctionCallingLlm((LargeLanguageModel)null);
				return;
			case CrewaiPackage.AGENT__STEP_CALLBACK:
				setStepCallback((Callback)null);
				return;
			case CrewaiPackage.AGENT__KNOWLEDGE_SOURCES:
				getKnowledgeSources().clear();
				return;
			case CrewaiPackage.AGENT__EMBEDDER:
				setEmbedder((Code)null);
				return;
			case CrewaiPackage.AGENT__TASKS:
				getTasks().clear();
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
			case CrewaiPackage.AGENT__EMBEDDER:
				return basicGetEmbedder() != null;
			case CrewaiPackage.AGENT__TASKS:
				return !getTasks().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgentImpl
