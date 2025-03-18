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
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.crewai.Guardrail;
import org.nasdanika.models.crewai.Task;
import org.nasdanika.models.crewai.Tool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.impl.TaskImpl#getTaskDescription <em>Task Description</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.TaskImpl#getExpectedOutput <em>Expected Output</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.TaskImpl#getGuardrail <em>Guardrail</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.TaskImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.TaskImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.TaskImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.TaskImpl#getCallback <em>Callback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends ConfigurableImpl implements Task {
	/**
	 * The default value of the '{@link #getTaskDescription() <em>Task Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_DESCRIPTION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getExpectedOutput() <em>Expected Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTED_OUTPUT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrewaiPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaskDescription() {
		return (String)eDynamicGet(CrewaiPackage.TASK__TASK_DESCRIPTION, CrewaiPackage.Literals.TASK__TASK_DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskDescription(String newTaskDescription) {
		eDynamicSet(CrewaiPackage.TASK__TASK_DESCRIPTION, CrewaiPackage.Literals.TASK__TASK_DESCRIPTION, newTaskDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpectedOutput() {
		return (String)eDynamicGet(CrewaiPackage.TASK__EXPECTED_OUTPUT, CrewaiPackage.Literals.TASK__EXPECTED_OUTPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedOutput(String newExpectedOutput) {
		eDynamicSet(CrewaiPackage.TASK__EXPECTED_OUTPUT, CrewaiPackage.Literals.TASK__EXPECTED_OUTPUT, newExpectedOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Guardrail getGuardrail() {
		return (Guardrail)eDynamicGet(CrewaiPackage.TASK__GUARDRAIL, CrewaiPackage.Literals.TASK__GUARDRAIL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guardrail basicGetGuardrail() {
		return (Guardrail)eDynamicGet(CrewaiPackage.TASK__GUARDRAIL, CrewaiPackage.Literals.TASK__GUARDRAIL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuardrail(Guardrail newGuardrail) {
		eDynamicSet(CrewaiPackage.TASK__GUARDRAIL, CrewaiPackage.Literals.TASK__GUARDRAIL, newGuardrail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent getAgent() {
		return (Agent)eDynamicGet(CrewaiPackage.TASK__AGENT, CrewaiPackage.Literals.TASK__AGENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetAgent() {
		return (Agent)eDynamicGet(CrewaiPackage.TASK__AGENT, CrewaiPackage.Literals.TASK__AGENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgent(Agent newAgent, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAgent, CrewaiPackage.TASK__AGENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgent(Agent newAgent) {
		eDynamicSet(CrewaiPackage.TASK__AGENT, CrewaiPackage.Literals.TASK__AGENT, newAgent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Tool> getTools() {
		return (EList<Tool>)eDynamicGet(CrewaiPackage.TASK__TOOLS, CrewaiPackage.Literals.TASK__TOOLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Task> getContext() {
		return (EList<Task>)eDynamicGet(CrewaiPackage.TASK__CONTEXT, CrewaiPackage.Literals.TASK__CONTEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Callback getCallback() {
		return (Callback)eDynamicGet(CrewaiPackage.TASK__CALLBACK, CrewaiPackage.Literals.TASK__CALLBACK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callback basicGetCallback() {
		return (Callback)eDynamicGet(CrewaiPackage.TASK__CALLBACK, CrewaiPackage.Literals.TASK__CALLBACK, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallback(Callback newCallback) {
		eDynamicSet(CrewaiPackage.TASK__CALLBACK, CrewaiPackage.Literals.TASK__CALLBACK, newCallback);
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
			case CrewaiPackage.TASK__AGENT:
				Agent agent = basicGetAgent();
				if (agent != null)
					msgs = ((InternalEObject)agent).eInverseRemove(this, CrewaiPackage.AGENT__TASKS, Agent.class, msgs);
				return basicSetAgent((Agent)otherEnd, msgs);
			case CrewaiPackage.TASK__TOOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTools()).basicAdd(otherEnd, msgs);
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
			case CrewaiPackage.TASK__AGENT:
				return basicSetAgent(null, msgs);
			case CrewaiPackage.TASK__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
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
			case CrewaiPackage.TASK__TASK_DESCRIPTION:
				return getTaskDescription();
			case CrewaiPackage.TASK__EXPECTED_OUTPUT:
				return getExpectedOutput();
			case CrewaiPackage.TASK__GUARDRAIL:
				if (resolve) return getGuardrail();
				return basicGetGuardrail();
			case CrewaiPackage.TASK__AGENT:
				if (resolve) return getAgent();
				return basicGetAgent();
			case CrewaiPackage.TASK__TOOLS:
				return getTools();
			case CrewaiPackage.TASK__CONTEXT:
				return getContext();
			case CrewaiPackage.TASK__CALLBACK:
				if (resolve) return getCallback();
				return basicGetCallback();
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
			case CrewaiPackage.TASK__TASK_DESCRIPTION:
				setTaskDescription((String)newValue);
				return;
			case CrewaiPackage.TASK__EXPECTED_OUTPUT:
				setExpectedOutput((String)newValue);
				return;
			case CrewaiPackage.TASK__GUARDRAIL:
				setGuardrail((Guardrail)newValue);
				return;
			case CrewaiPackage.TASK__AGENT:
				setAgent((Agent)newValue);
				return;
			case CrewaiPackage.TASK__TOOLS:
				getTools().clear();
				getTools().addAll((Collection<? extends Tool>)newValue);
				return;
			case CrewaiPackage.TASK__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends Task>)newValue);
				return;
			case CrewaiPackage.TASK__CALLBACK:
				setCallback((Callback)newValue);
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
			case CrewaiPackage.TASK__TASK_DESCRIPTION:
				setTaskDescription(TASK_DESCRIPTION_EDEFAULT);
				return;
			case CrewaiPackage.TASK__EXPECTED_OUTPUT:
				setExpectedOutput(EXPECTED_OUTPUT_EDEFAULT);
				return;
			case CrewaiPackage.TASK__GUARDRAIL:
				setGuardrail((Guardrail)null);
				return;
			case CrewaiPackage.TASK__AGENT:
				setAgent((Agent)null);
				return;
			case CrewaiPackage.TASK__TOOLS:
				getTools().clear();
				return;
			case CrewaiPackage.TASK__CONTEXT:
				getContext().clear();
				return;
			case CrewaiPackage.TASK__CALLBACK:
				setCallback((Callback)null);
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
			case CrewaiPackage.TASK__TASK_DESCRIPTION:
				return TASK_DESCRIPTION_EDEFAULT == null ? getTaskDescription() != null : !TASK_DESCRIPTION_EDEFAULT.equals(getTaskDescription());
			case CrewaiPackage.TASK__EXPECTED_OUTPUT:
				return EXPECTED_OUTPUT_EDEFAULT == null ? getExpectedOutput() != null : !EXPECTED_OUTPUT_EDEFAULT.equals(getExpectedOutput());
			case CrewaiPackage.TASK__GUARDRAIL:
				return basicGetGuardrail() != null;
			case CrewaiPackage.TASK__AGENT:
				return basicGetAgent() != null;
			case CrewaiPackage.TASK__TOOLS:
				return !getTools().isEmpty();
			case CrewaiPackage.TASK__CONTEXT:
				return !getContext().isEmpty();
			case CrewaiPackage.TASK__CALLBACK:
				return basicGetCallback() != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public Map<String, Object> getConfigMap() {
		Map<String, Object> configMap = super.getConfigMap();
		String taskDescription = getTaskDescription();
		if (!Util.isBlank(taskDescription)) {
			configMap.put(TASK_DESCRIPTION_KEY, taskDescription);
		}
		String expectedOutput = getExpectedOutput();
		if (!Util.isBlank(expectedOutput)) {
			configMap.put(EXPECTED_OUTPUT_KEY, expectedOutput);
		}			
		
		return configMap;
	}

} //TaskImpl
