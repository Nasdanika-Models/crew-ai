/**
 */
package org.nasdanika.models.crewai.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.crewai.Agent;
import org.nasdanika.models.crewai.Callback;
import org.nasdanika.models.crewai.Commented;
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
 *   <li>{@link org.nasdanika.models.crewai.impl.TaskImpl#getComment <em>Comment</em>}</li>
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
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

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
	public String getComment() {
		return (String)eDynamicGet(CrewaiPackage.TASK__COMMENT, CrewaiPackage.Literals.COMMENTED__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		eDynamicSet(CrewaiPackage.TASK__COMMENT, CrewaiPackage.Literals.COMMENTED__COMMENT, newComment);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrewaiPackage.TASK__COMMENT:
				return getComment();
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
			case CrewaiPackage.TASK__COMMENT:
				setComment((String)newValue);
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
			case CrewaiPackage.TASK__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
			case CrewaiPackage.TASK__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Commented.class) {
			switch (derivedFeatureID) {
				case CrewaiPackage.TASK__COMMENT: return CrewaiPackage.COMMENTED__COMMENT;
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
		if (baseClass == Commented.class) {
			switch (baseFeatureID) {
				case CrewaiPackage.COMMENTED__COMMENT: return CrewaiPackage.TASK__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TaskImpl
