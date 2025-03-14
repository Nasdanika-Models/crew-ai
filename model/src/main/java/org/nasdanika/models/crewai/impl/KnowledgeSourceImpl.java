/**
 */
package org.nasdanika.models.crewai.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.crewai.KnowledgeSource;
import org.nasdanika.ncore.impl.DocumentedNamedStringIdentityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class KnowledgeSourceImpl extends DocumentedNamedStringIdentityImpl implements KnowledgeSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrewaiPackage.Literals.KNOWLEDGE_SOURCE;
	}

} //KnowledgeSourceImpl
