/**
 */
package org.nasdanika.models.crewai;

import org.nasdanika.ncore.DocumentedNamedStringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.Configurable#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.crewai.CrewaiPackage#getConfigurable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='configuration'"
 * @generated
 */
public interface Configurable extends DocumentedNamedStringIdentity, Code {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(String)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getConfigurable_Configuration()
	 * @model
	 * @generated
	 */
	String getConfiguration();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Configurable#getConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(String value);

} // Configurable
