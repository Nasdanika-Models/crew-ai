/**
 */
package org.nasdanika.models.crewai;

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
} // Tool
