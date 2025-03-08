/**
 */
package org.nasdanika.models.crewai;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.DocumentedNamedStringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.Function#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.crewai.CrewaiPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Code, DocumentedNamedStringIdentity {

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getFunction_Parameters()
	 * @model
	 * @generated
	 */
	EList<String> getParameters();
} // Function
