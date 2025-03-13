/**
 */
package org.nasdanika.models.crewai;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.Code#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Code#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.crewai.CrewaiPackage#getCode()
 * @model
 * @generated
 */
public interface Code extends Commented {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCode_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Code#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute.
	 * @see #setImports(String)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCode_Imports()
	 * @model
	 * @generated
	 */
	String getImports();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Code#getImports <em>Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports</em>' attribute.
	 * @see #getImports()
	 * @generated
	 */
	void setImports(String value);

} // Code
