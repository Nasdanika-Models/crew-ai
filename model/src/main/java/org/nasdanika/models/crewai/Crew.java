/**
 */
package org.nasdanika.models.crewai;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.DocumentedNamedStringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crew</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getTools <em>Tools</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getAgents <em>Agents</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getBeforeKickoff <em>Before Kickoff</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getAfterKickoff <em>After Kickoff</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew()
 * @model
 * @generated
 */
public interface Crew extends DocumentedNamedStringIdentity {

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Tool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_Tools()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_Agents()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_Tasks()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Before Kickoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Kickoff</em>' containment reference.
	 * @see #setBeforeKickoff(Function)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_BeforeKickoff()
	 * @model containment="true"
	 * @generated
	 */
	Function getBeforeKickoff();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Crew#getBeforeKickoff <em>Before Kickoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Kickoff</em>' containment reference.
	 * @see #getBeforeKickoff()
	 * @generated
	 */
	void setBeforeKickoff(Function value);

	/**
	 * Returns the value of the '<em><b>After Kickoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Kickoff</em>' containment reference.
	 * @see #setAfterKickoff(Function)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_AfterKickoff()
	 * @model containment="true"
	 * @generated
	 */
	Function getAfterKickoff();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Crew#getAfterKickoff <em>After Kickoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Kickoff</em>' containment reference.
	 * @see #getAfterKickoff()
	 * @generated
	 */
	void setAfterKickoff(Function value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.crewai.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' attribute.
	 * @see org.nasdanika.models.crewai.Process
	 * @see #setProcess(org.nasdanika.models.crewai.Process)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_Process()
	 * @model
	 * @generated
	 */
	org.nasdanika.models.crewai.Process getProcess();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Crew#getProcess <em>Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' attribute.
	 * @see org.nasdanika.models.crewai.Process
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(org.nasdanika.models.crewai.Process value);
} // Crew
