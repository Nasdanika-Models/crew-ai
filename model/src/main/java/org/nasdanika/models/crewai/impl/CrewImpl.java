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
import org.nasdanika.models.crewai.Crew;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.crewai.Function;
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
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getBeforeKickoff <em>Before Kickoff</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getAfterKickoff <em>After Kickoff</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrewImpl extends DocumentedNamedStringIdentityImpl implements Crew {
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
		}
		return super.eIsSet(featureID);
	}

} //CrewImpl
