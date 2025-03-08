/**
 */
package org.nasdanika.models.crewai;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.SourceElement#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.crewai.CrewaiPackage#getSourceElement()
 * @model
 * @generated
 */
public interface SourceElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getSourceElement_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String generate(String indent);

} // SourceElement
