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
 *   <li>{@link org.nasdanika.models.crewai.Task#getTaskDescription <em>Task Description</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Task#getExpectedOutput <em>Expected Output</em>}</li>
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
public interface Task extends Configurable {
	
	String EXPECTED_OUTPUT_KEY = "expected_output";
	String TASK_DESCRIPTION_KEY = "description";	
	
	/**
	 * Returns the value of the '<em><b>Task Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Description</em>' attribute.
	 * @see #setTaskDescription(String)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getTask_TaskDescription()
	 * @model
	 * @generated
	 */
	String getTaskDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Task#getTaskDescription <em>Task Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Description</em>' attribute.
	 * @see #getTaskDescription()
	 * @generated
	 */
	void setTaskDescription(String value);

	/**
	 * Returns the value of the '<em><b>Expected Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Output</em>' attribute.
	 * @see #setExpectedOutput(String)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getTask_ExpectedOutput()
	 * @model
	 * @generated
	 */
	String getExpectedOutput();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Task#getExpectedOutput <em>Expected Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Output</em>' attribute.
	 * @see #getExpectedOutput()
	 * @generated
	 */
	void setExpectedOutput(String value);

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
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.crewai.Agent#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference.
	 * @see #setAgent(Agent)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getTask_Agent()
	 * @see org.nasdanika.models.crewai.Agent#getTasks
	 * @model opposite="tasks"
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
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.crewai.Tool#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getTask_Tools()
	 * @see org.nasdanika.models.crewai.Tool#getTasks
	 * @model opposite="tasks"
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
