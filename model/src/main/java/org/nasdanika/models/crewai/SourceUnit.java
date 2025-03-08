/**
 */
package org.nasdanika.models.crewai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.SourceUnit#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.crewai.CrewaiPackage#getSourceUnit()
 * @model
 * @generated
 */
public interface SourceUnit extends Resource, SourceElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.SourceElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getSourceUnit_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceElement> getElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String generate();

} // SourceUnit
