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
import org.nasdanika.models.crewai.Crew;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.crewai.Function;
import org.nasdanika.models.crewai.KnowledgeSource;
import org.nasdanika.models.crewai.LargeLanguageModel;
import org.nasdanika.models.crewai.Task;
import org.nasdanika.models.crewai.Tool;
import org.nasdanika.ncore.impl.DocumentedNamedStringIdentityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crew</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getBeforeKickoff <em>Before Kickoff</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getAfterKickoff <em>After Kickoff</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getKnowledgeSources <em>Knowledge Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getManagerLlm <em>Manager Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getFunctionCallingLlm <em>Function Calling Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getPlanningLlm <em>Planning Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getEmbedder <em>Embedder</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getStepCallback <em>Step Callback</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getTaskCallback <em>Task Callback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrewImpl extends DocumentedNamedStringIdentityImpl implements Crew {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getImports() <em>Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getProcess() <em>Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected static final org.nasdanika.models.crewai.Process PROCESS_EDEFAULT = org.nasdanika.models.crewai.Process.SEQUENTIAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrewaiPackage.Literals.CREW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return (String)eDynamicGet(CrewaiPackage.CREW__CODE, CrewaiPackage.Literals.CODE__CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		eDynamicSet(CrewaiPackage.CREW__CODE, CrewaiPackage.Literals.CODE__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImports() {
		return (String)eDynamicGet(CrewaiPackage.CREW__IMPORTS, CrewaiPackage.Literals.CODE__IMPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImports(String newImports) {
		eDynamicSet(CrewaiPackage.CREW__IMPORTS, CrewaiPackage.Literals.CODE__IMPORTS, newImports);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return (String)eDynamicGet(CrewaiPackage.CREW__COMMENT, CrewaiPackage.Literals.CODE__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		eDynamicSet(CrewaiPackage.CREW__COMMENT, CrewaiPackage.Literals.CODE__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Tool> getTools() {
		return (EList<Tool>)eDynamicGet(CrewaiPackage.CREW__TOOLS, CrewaiPackage.Literals.CREW__TOOLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Agent> getAgents() {
		return (EList<Agent>)eDynamicGet(CrewaiPackage.CREW__AGENTS, CrewaiPackage.Literals.CREW__AGENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Task> getTasks() {
		return (EList<Task>)eDynamicGet(CrewaiPackage.CREW__TASKS, CrewaiPackage.Literals.CREW__TASKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getBeforeKickoff() {
		return (Function)eDynamicGet(CrewaiPackage.CREW__BEFORE_KICKOFF, CrewaiPackage.Literals.CREW__BEFORE_KICKOFF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeforeKickoff(Function newBeforeKickoff, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBeforeKickoff, CrewaiPackage.CREW__BEFORE_KICKOFF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeforeKickoff(Function newBeforeKickoff) {
		eDynamicSet(CrewaiPackage.CREW__BEFORE_KICKOFF, CrewaiPackage.Literals.CREW__BEFORE_KICKOFF, newBeforeKickoff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getAfterKickoff() {
		return (Function)eDynamicGet(CrewaiPackage.CREW__AFTER_KICKOFF, CrewaiPackage.Literals.CREW__AFTER_KICKOFF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfterKickoff(Function newAfterKickoff, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAfterKickoff, CrewaiPackage.CREW__AFTER_KICKOFF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAfterKickoff(Function newAfterKickoff) {
		eDynamicSet(CrewaiPackage.CREW__AFTER_KICKOFF, CrewaiPackage.Literals.CREW__AFTER_KICKOFF, newAfterKickoff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.models.crewai.Process getProcess() {
		return (org.nasdanika.models.crewai.Process)eDynamicGet(CrewaiPackage.CREW__PROCESS, CrewaiPackage.Literals.CREW__PROCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcess(org.nasdanika.models.crewai.Process newProcess) {
		eDynamicSet(CrewaiPackage.CREW__PROCESS, CrewaiPackage.Literals.CREW__PROCESS, newProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KnowledgeSource> getKnowledgeSources() {
		return (EList<KnowledgeSource>)eDynamicGet(CrewaiPackage.CREW__KNOWLEDGE_SOURCES, CrewaiPackage.Literals.CREW__KNOWLEDGE_SOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LargeLanguageModel getManagerLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.CREW__MANAGER_LLM, CrewaiPackage.Literals.CREW__MANAGER_LLM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeLanguageModel basicGetManagerLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.CREW__MANAGER_LLM, CrewaiPackage.Literals.CREW__MANAGER_LLM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagerLlm(LargeLanguageModel newManagerLlm) {
		eDynamicSet(CrewaiPackage.CREW__MANAGER_LLM, CrewaiPackage.Literals.CREW__MANAGER_LLM, newManagerLlm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LargeLanguageModel getFunctionCallingLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.CREW__FUNCTION_CALLING_LLM, CrewaiPackage.Literals.CREW__FUNCTION_CALLING_LLM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeLanguageModel basicGetFunctionCallingLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.CREW__FUNCTION_CALLING_LLM, CrewaiPackage.Literals.CREW__FUNCTION_CALLING_LLM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionCallingLlm(LargeLanguageModel newFunctionCallingLlm) {
		eDynamicSet(CrewaiPackage.CREW__FUNCTION_CALLING_LLM, CrewaiPackage.Literals.CREW__FUNCTION_CALLING_LLM, newFunctionCallingLlm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LargeLanguageModel getPlanningLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.CREW__PLANNING_LLM, CrewaiPackage.Literals.CREW__PLANNING_LLM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeLanguageModel basicGetPlanningLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.CREW__PLANNING_LLM, CrewaiPackage.Literals.CREW__PLANNING_LLM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanningLlm(LargeLanguageModel newPlanningLlm) {
		eDynamicSet(CrewaiPackage.CREW__PLANNING_LLM, CrewaiPackage.Literals.CREW__PLANNING_LLM, newPlanningLlm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getEmbedder() {
		return (Code)eDynamicGet(CrewaiPackage.CREW__EMBEDDER, CrewaiPackage.Literals.CREW__EMBEDDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetEmbedder() {
		return (Code)eDynamicGet(CrewaiPackage.CREW__EMBEDDER, CrewaiPackage.Literals.CREW__EMBEDDER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmbedder(Code newEmbedder) {
		eDynamicSet(CrewaiPackage.CREW__EMBEDDER, CrewaiPackage.Literals.CREW__EMBEDDER, newEmbedder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Callback getStepCallback() {
		return (Callback)eDynamicGet(CrewaiPackage.CREW__STEP_CALLBACK, CrewaiPackage.Literals.CREW__STEP_CALLBACK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callback basicGetStepCallback() {
		return (Callback)eDynamicGet(CrewaiPackage.CREW__STEP_CALLBACK, CrewaiPackage.Literals.CREW__STEP_CALLBACK, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepCallback(Callback newStepCallback) {
		eDynamicSet(CrewaiPackage.CREW__STEP_CALLBACK, CrewaiPackage.Literals.CREW__STEP_CALLBACK, newStepCallback);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Callback getTaskCallback() {
		return (Callback)eDynamicGet(CrewaiPackage.CREW__TASK_CALLBACK, CrewaiPackage.Literals.CREW__TASK_CALLBACK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callback basicGetTaskCallback() {
		return (Callback)eDynamicGet(CrewaiPackage.CREW__TASK_CALLBACK, CrewaiPackage.Literals.CREW__TASK_CALLBACK, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskCallback(Callback newTaskCallback) {
		eDynamicSet(CrewaiPackage.CREW__TASK_CALLBACK, CrewaiPackage.Literals.CREW__TASK_CALLBACK, newTaskCallback);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrewaiPackage.CREW__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.CREW__AGENTS:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.CREW__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.CREW__BEFORE_KICKOFF:
				return basicSetBeforeKickoff(null, msgs);
			case CrewaiPackage.CREW__AFTER_KICKOFF:
				return basicSetAfterKickoff(null, msgs);
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
			case CrewaiPackage.CREW__CODE:
				return getCode();
			case CrewaiPackage.CREW__IMPORTS:
				return getImports();
			case CrewaiPackage.CREW__COMMENT:
				return getComment();
			case CrewaiPackage.CREW__TOOLS:
				return getTools();
			case CrewaiPackage.CREW__AGENTS:
				return getAgents();
			case CrewaiPackage.CREW__TASKS:
				return getTasks();
			case CrewaiPackage.CREW__BEFORE_KICKOFF:
				return getBeforeKickoff();
			case CrewaiPackage.CREW__AFTER_KICKOFF:
				return getAfterKickoff();
			case CrewaiPackage.CREW__PROCESS:
				return getProcess();
			case CrewaiPackage.CREW__KNOWLEDGE_SOURCES:
				return getKnowledgeSources();
			case CrewaiPackage.CREW__MANAGER_LLM:
				if (resolve) return getManagerLlm();
				return basicGetManagerLlm();
			case CrewaiPackage.CREW__FUNCTION_CALLING_LLM:
				if (resolve) return getFunctionCallingLlm();
				return basicGetFunctionCallingLlm();
			case CrewaiPackage.CREW__PLANNING_LLM:
				if (resolve) return getPlanningLlm();
				return basicGetPlanningLlm();
			case CrewaiPackage.CREW__EMBEDDER:
				if (resolve) return getEmbedder();
				return basicGetEmbedder();
			case CrewaiPackage.CREW__STEP_CALLBACK:
				if (resolve) return getStepCallback();
				return basicGetStepCallback();
			case CrewaiPackage.CREW__TASK_CALLBACK:
				if (resolve) return getTaskCallback();
				return basicGetTaskCallback();
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
			case CrewaiPackage.CREW__CODE:
				setCode((String)newValue);
				return;
			case CrewaiPackage.CREW__IMPORTS:
				setImports((String)newValue);
				return;
			case CrewaiPackage.CREW__COMMENT:
				setComment((String)newValue);
				return;
			case CrewaiPackage.CREW__TOOLS:
				getTools().clear();
				getTools().addAll((Collection<? extends Tool>)newValue);
				return;
			case CrewaiPackage.CREW__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends Agent>)newValue);
				return;
			case CrewaiPackage.CREW__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case CrewaiPackage.CREW__BEFORE_KICKOFF:
				setBeforeKickoff((Function)newValue);
				return;
			case CrewaiPackage.CREW__AFTER_KICKOFF:
				setAfterKickoff((Function)newValue);
				return;
			case CrewaiPackage.CREW__PROCESS:
				setProcess((org.nasdanika.models.crewai.Process)newValue);
				return;
			case CrewaiPackage.CREW__KNOWLEDGE_SOURCES:
				getKnowledgeSources().clear();
				getKnowledgeSources().addAll((Collection<? extends KnowledgeSource>)newValue);
				return;
			case CrewaiPackage.CREW__MANAGER_LLM:
				setManagerLlm((LargeLanguageModel)newValue);
				return;
			case CrewaiPackage.CREW__FUNCTION_CALLING_LLM:
				setFunctionCallingLlm((LargeLanguageModel)newValue);
				return;
			case CrewaiPackage.CREW__PLANNING_LLM:
				setPlanningLlm((LargeLanguageModel)newValue);
				return;
			case CrewaiPackage.CREW__EMBEDDER:
				setEmbedder((Code)newValue);
				return;
			case CrewaiPackage.CREW__STEP_CALLBACK:
				setStepCallback((Callback)newValue);
				return;
			case CrewaiPackage.CREW__TASK_CALLBACK:
				setTaskCallback((Callback)newValue);
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
			case CrewaiPackage.CREW__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case CrewaiPackage.CREW__IMPORTS:
				setImports(IMPORTS_EDEFAULT);
				return;
			case CrewaiPackage.CREW__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CrewaiPackage.CREW__TOOLS:
				getTools().clear();
				return;
			case CrewaiPackage.CREW__AGENTS:
				getAgents().clear();
				return;
			case CrewaiPackage.CREW__TASKS:
				getTasks().clear();
				return;
			case CrewaiPackage.CREW__BEFORE_KICKOFF:
				setBeforeKickoff((Function)null);
				return;
			case CrewaiPackage.CREW__AFTER_KICKOFF:
				setAfterKickoff((Function)null);
				return;
			case CrewaiPackage.CREW__PROCESS:
				setProcess(PROCESS_EDEFAULT);
				return;
			case CrewaiPackage.CREW__KNOWLEDGE_SOURCES:
				getKnowledgeSources().clear();
				return;
			case CrewaiPackage.CREW__MANAGER_LLM:
				setManagerLlm((LargeLanguageModel)null);
				return;
			case CrewaiPackage.CREW__FUNCTION_CALLING_LLM:
				setFunctionCallingLlm((LargeLanguageModel)null);
				return;
			case CrewaiPackage.CREW__PLANNING_LLM:
				setPlanningLlm((LargeLanguageModel)null);
				return;
			case CrewaiPackage.CREW__EMBEDDER:
				setEmbedder((Code)null);
				return;
			case CrewaiPackage.CREW__STEP_CALLBACK:
				setStepCallback((Callback)null);
				return;
			case CrewaiPackage.CREW__TASK_CALLBACK:
				setTaskCallback((Callback)null);
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
			case CrewaiPackage.CREW__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case CrewaiPackage.CREW__IMPORTS:
				return IMPORTS_EDEFAULT == null ? getImports() != null : !IMPORTS_EDEFAULT.equals(getImports());
			case CrewaiPackage.CREW__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case CrewaiPackage.CREW__TOOLS:
				return !getTools().isEmpty();
			case CrewaiPackage.CREW__AGENTS:
				return !getAgents().isEmpty();
			case CrewaiPackage.CREW__TASKS:
				return !getTasks().isEmpty();
			case CrewaiPackage.CREW__BEFORE_KICKOFF:
				return getBeforeKickoff() != null;
			case CrewaiPackage.CREW__AFTER_KICKOFF:
				return getAfterKickoff() != null;
			case CrewaiPackage.CREW__PROCESS:
				return getProcess() != PROCESS_EDEFAULT;
			case CrewaiPackage.CREW__KNOWLEDGE_SOURCES:
				return !getKnowledgeSources().isEmpty();
			case CrewaiPackage.CREW__MANAGER_LLM:
				return basicGetManagerLlm() != null;
			case CrewaiPackage.CREW__FUNCTION_CALLING_LLM:
				return basicGetFunctionCallingLlm() != null;
			case CrewaiPackage.CREW__PLANNING_LLM:
				return basicGetPlanningLlm() != null;
			case CrewaiPackage.CREW__EMBEDDER:
				return basicGetEmbedder() != null;
			case CrewaiPackage.CREW__STEP_CALLBACK:
				return basicGetStepCallback() != null;
			case CrewaiPackage.CREW__TASK_CALLBACK:
				return basicGetTaskCallback() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Code.class) {
			switch (derivedFeatureID) {
				case CrewaiPackage.CREW__CODE: return CrewaiPackage.CODE__CODE;
				case CrewaiPackage.CREW__IMPORTS: return CrewaiPackage.CODE__IMPORTS;
				case CrewaiPackage.CREW__COMMENT: return CrewaiPackage.CODE__COMMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Code.class) {
			switch (baseFeatureID) {
				case CrewaiPackage.CODE__CODE: return CrewaiPackage.CREW__CODE;
				case CrewaiPackage.CODE__IMPORTS: return CrewaiPackage.CREW__IMPORTS;
				case CrewaiPackage.CODE__COMMENT: return CrewaiPackage.CREW__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CrewImpl
