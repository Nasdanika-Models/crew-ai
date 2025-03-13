/**
 */
package org.nasdanika.models.crewai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.Task#getGuardrail <em>Guardrail</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Task#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Task#getTools <em>Tools</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Task#getContext <em>Context</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Task#getCallback <em>Callback</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.crewai.CrewaiPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends Configurable, Commented {
	/**
	 * Returns the value of the '<em><b>Guardrail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guardrail</em>' reference.
	 * @see #setGuardrail(Guardrail)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getTask_Guardrail()
	 * @model
	 * @generated
	 */
	Guardrail getGuardrail();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Task#getGuardrail <em>Guardrail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guardrail</em>' reference.
	 * @see #getGuardrail()
	 * @generated
	 */
	void setGuardrail(Guardrail value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference.
	 * @see #setAgent(Agent)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getTask_Agent()
	 * @model
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Task#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Tool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getTask_Tools()
	 * @model
	 * @generated
	 */
	EList<Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getTask_Context()
	 * @model
	 * @generated
	 */
	EList<Task> getContext();

	/**
	 * Returns the value of the '<em><b>Callback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callback</em>' reference.
	 * @see #setCallback(Callback)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getTask_Callback()
	 * @model
	 * @generated
	 */
	Callback getCallback();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Task#getCallback <em>Callback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callback</em>' reference.
	 * @see #getCallback()
	 * @generated
	 */
	void setCallback(Callback value);

} // Task
