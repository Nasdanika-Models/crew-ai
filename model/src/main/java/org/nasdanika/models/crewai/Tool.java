/**
 */
package org.nasdanika.models.crewai;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.DocumentedNamedStringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.Tool#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Tool#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Tool#getAgents <em>Agents</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.crewai.CrewaiPackage#getTool()
 * @model
 * @generated
 */
public interface Tool extends Code, DocumentedNamedStringIdentity {

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' attribute.
	 * @see #setDeclarations(String)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getTool_Declarations()
	 * @model
	 * @generated
	 */
	String getDeclarations();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Tool#getDeclarations <em>Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declarations</em>' attribute.
	 * @see #getDeclarations()
	 * @generated
	 */
	void setDeclarations(String value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Task}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.crewai.Task#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getTool_Tasks()
	 * @see org.nasdanika.models.crewai.Task#getTools
	 * @model opposite="tools"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Agent}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.crewai.Agent#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getTool_Agents()
	 * @see org.nasdanika.models.crewai.Agent#getTools
	 * @model opposite="tools"
	 * @generated
	 */
	EList<Agent> getAgents();
} // Tool
