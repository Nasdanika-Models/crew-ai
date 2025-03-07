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
 *   <li>{@link org.nasdanika.models.crewai.SourceUnit#getCrews <em>Crews</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.SourceUnit#getProlog <em>Prolog</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.SourceUnit#getEpilog <em>Epilog</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.crewai.CrewaiPackage#getSourceUnit()
 * @model
 * @generated
 */
public interface SourceUnit extends Resource, SourceElement {
	/**
	 * Returns the value of the '<em><b>Crews</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Crew}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' containment reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getSourceUnit_Crews()
	 * @model containment="true"
	 * @generated
	 */
	EList<Crew> getCrews();

	/**
	 * Returns the value of the '<em><b>Prolog</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.SourceElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prolog</em>' containment reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getSourceUnit_Prolog()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceElement> getProlog();

	/**
	 * Returns the value of the '<em><b>Epilog</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.SourceElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epilog</em>' containment reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getSourceUnit_Epilog()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceElement> getEpilog();

} // SourceUnit
