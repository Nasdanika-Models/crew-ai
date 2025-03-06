/**
 */
package org.nasdanika.models.crewai;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.crewai.CrewaiPackage
 * @generated
 */
public interface CrewaiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CrewaiFactory eINSTANCE = org.nasdanika.models.crewai.impl.CrewaiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Crew</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crew</em>'.
	 * @generated
	 */
	Crew createCrew();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CrewaiPackage getCrewaiPackage();

} //CrewaiFactory
