/**
 */
package org.nasdanika.models.crewai.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Util;
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
 *   <li>{@link org.nasdanika.models.crewai.impl.AgentImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.AgentImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.AgentImpl#getBackstory <em>Backstory</em>}</li>
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
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected static final String GOAL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getBackstory() <em>Backstory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackstory()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKSTORY_EDEFAULT = null;

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
	@Override
	public String getRole() {
		return (String)eDynamicGet(CrewaiPackage.AGENT__ROLE, CrewaiPackage.Literals.AGENT__ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		eDynamicSet(CrewaiPackage.AGENT__ROLE, CrewaiPackage.Literals.AGENT__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGoal() {
		return (String)eDynamicGet(CrewaiPackage.AGENT__GOAL, CrewaiPackage.Literals.AGENT__GOAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoal(String newGoal) {
		eDynamicSet(CrewaiPackage.AGENT__GOAL, CrewaiPackage.Literals.AGENT__GOAL, newGoal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackstory() {
		return (String)eDynamicGet(CrewaiPackage.AGENT__BACKSTORY, CrewaiPackage.Literals.AGENT__BACKSTORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackstory(String newBackstory) {
		eDynamicSet(CrewaiPackage.AGENT__BACKSTORY, CrewaiPackage.Literals.AGENT__BACKSTORY, newBackstory);
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
			case CrewaiPackage.AGENT__ROLE:
				return getRole();
			case CrewaiPackage.AGENT__GOAL:
				return getGoal();
			case CrewaiPackage.AGENT__BACKSTORY:
				return getBackstory();
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
			case CrewaiPackage.AGENT__ROLE:
				setRole((String)newValue);
				return;
			case CrewaiPackage.AGENT__GOAL:
				setGoal((String)newValue);
				return;
			case CrewaiPackage.AGENT__BACKSTORY:
				setBackstory((String)newValue);
				return;
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
			case CrewaiPackage.AGENT__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CrewaiPackage.AGENT__GOAL:
				setGoal(GOAL_EDEFAULT);
				return;
			case CrewaiPackage.AGENT__BACKSTORY:
				setBackstory(BACKSTORY_EDEFAULT);
				return;
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
			case CrewaiPackage.AGENT__ROLE:
				return ROLE_EDEFAULT == null ? getRole() != null : !ROLE_EDEFAULT.equals(getRole());
			case CrewaiPackage.AGENT__GOAL:
				return GOAL_EDEFAULT == null ? getGoal() != null : !GOAL_EDEFAULT.equals(getGoal());
			case CrewaiPackage.AGENT__BACKSTORY:
				return BACKSTORY_EDEFAULT == null ? getBackstory() != null : !BACKSTORY_EDEFAULT.equals(getBackstory());
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
		
	@Override
	public Map<String, Object> getConfigMap() {
		Map<String, Object> configMap = super.getConfigMap();
		String role = getRole();
		if (!Util.isBlank(role)) {
			configMap.put(ROLE_KEY, role);
		}
		String goal = getGoal();
		if (!Util.isBlank(goal)) {
			configMap.put(GOAL_KEY, goal);
		}
		String backstory = getBackstory();
		if (!Util.isBlank(backstory)) {
			configMap.put(BACKSTORY_KEY, backstory);
		}
		
		return configMap;
	}
	

} //AgentImpl
