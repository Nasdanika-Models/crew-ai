/**
 */
package org.nasdanika.models.crewai.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.crewai.Import;
import org.nasdanika.models.crewai.SourceElement;
import org.nasdanika.models.crewai.SourceUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.impl.SourceUnitImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.SourceUnitImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceUnitImpl extends ResourceImpl implements SourceUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrewaiPackage.Literals.SOURCE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Import> getImports() {
		return (EList<Import>)eDynamicGet(CrewaiPackage.SOURCE_UNIT__IMPORTS, CrewaiPackage.Literals.SOURCE_ELEMENT__IMPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SourceElement> getElements() {
		return (EList<SourceElement>)eDynamicGet(CrewaiPackage.SOURCE_UNIT__ELEMENTS, CrewaiPackage.Literals.SOURCE_UNIT__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String generate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String generate(String indent) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrewaiPackage.SOURCE_UNIT__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.SOURCE_UNIT__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrewaiPackage.SOURCE_UNIT__IMPORTS:
				return getImports();
			case CrewaiPackage.SOURCE_UNIT__ELEMENTS:
				return getElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CrewaiPackage.SOURCE_UNIT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case CrewaiPackage.SOURCE_UNIT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends SourceElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CrewaiPackage.SOURCE_UNIT__IMPORTS:
				getImports().clear();
				return;
			case CrewaiPackage.SOURCE_UNIT__ELEMENTS:
				getElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CrewaiPackage.SOURCE_UNIT__IMPORTS:
				return !getImports().isEmpty();
			case CrewaiPackage.SOURCE_UNIT__ELEMENTS:
				return !getElements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SourceElement.class) {
			switch (derivedFeatureID) {
				case CrewaiPackage.SOURCE_UNIT__IMPORTS: return CrewaiPackage.SOURCE_ELEMENT__IMPORTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SourceElement.class) {
			switch (baseFeatureID) {
				case CrewaiPackage.SOURCE_ELEMENT__IMPORTS: return CrewaiPackage.SOURCE_UNIT__IMPORTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == SourceElement.class) {
			switch (baseOperationID) {
				case CrewaiPackage.SOURCE_ELEMENT___GENERATE__STRING: return CrewaiPackage.SOURCE_UNIT___GENERATE__STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CrewaiPackage.SOURCE_UNIT___GENERATE:
				return generate();
			case CrewaiPackage.SOURCE_UNIT___GENERATE__STRING:
				return generate((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SourceUnitImpl
