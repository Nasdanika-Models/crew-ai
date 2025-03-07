/**
 */
package org.nasdanika.models.crewai.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.crewai.Crew;
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
 *   <li>{@link org.nasdanika.models.crewai.impl.SourceUnitImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.SourceUnitImpl#getCrews <em>Crews</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.SourceUnitImpl#getProlog <em>Prolog</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.SourceUnitImpl#getEpilog <em>Epilog</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceUnitImpl extends ResourceImpl implements SourceUnit {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

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
	@Override
	public String getCode() {
		return (String)eDynamicGet(CrewaiPackage.SOURCE_UNIT__CODE, CrewaiPackage.Literals.SOURCE_ELEMENT__CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		eDynamicSet(CrewaiPackage.SOURCE_UNIT__CODE, CrewaiPackage.Literals.SOURCE_ELEMENT__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Crew> getCrews() {
		return (EList<Crew>)eDynamicGet(CrewaiPackage.SOURCE_UNIT__CREWS, CrewaiPackage.Literals.SOURCE_UNIT__CREWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SourceElement> getProlog() {
		return (EList<SourceElement>)eDynamicGet(CrewaiPackage.SOURCE_UNIT__PROLOG, CrewaiPackage.Literals.SOURCE_UNIT__PROLOG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SourceElement> getEpilog() {
		return (EList<SourceElement>)eDynamicGet(CrewaiPackage.SOURCE_UNIT__EPILOG, CrewaiPackage.Literals.SOURCE_UNIT__EPILOG, true, true);
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
			case CrewaiPackage.SOURCE_UNIT__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.SOURCE_UNIT__PROLOG:
				return ((InternalEList<?>)getProlog()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.SOURCE_UNIT__EPILOG:
				return ((InternalEList<?>)getEpilog()).basicRemove(otherEnd, msgs);
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
			case CrewaiPackage.SOURCE_UNIT__CODE:
				return getCode();
			case CrewaiPackage.SOURCE_UNIT__CREWS:
				return getCrews();
			case CrewaiPackage.SOURCE_UNIT__PROLOG:
				return getProlog();
			case CrewaiPackage.SOURCE_UNIT__EPILOG:
				return getEpilog();
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
			case CrewaiPackage.SOURCE_UNIT__CODE:
				setCode((String)newValue);
				return;
			case CrewaiPackage.SOURCE_UNIT__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case CrewaiPackage.SOURCE_UNIT__PROLOG:
				getProlog().clear();
				getProlog().addAll((Collection<? extends SourceElement>)newValue);
				return;
			case CrewaiPackage.SOURCE_UNIT__EPILOG:
				getEpilog().clear();
				getEpilog().addAll((Collection<? extends SourceElement>)newValue);
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
			case CrewaiPackage.SOURCE_UNIT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case CrewaiPackage.SOURCE_UNIT__CREWS:
				getCrews().clear();
				return;
			case CrewaiPackage.SOURCE_UNIT__PROLOG:
				getProlog().clear();
				return;
			case CrewaiPackage.SOURCE_UNIT__EPILOG:
				getEpilog().clear();
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
			case CrewaiPackage.SOURCE_UNIT__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case CrewaiPackage.SOURCE_UNIT__CREWS:
				return !getCrews().isEmpty();
			case CrewaiPackage.SOURCE_UNIT__PROLOG:
				return !getProlog().isEmpty();
			case CrewaiPackage.SOURCE_UNIT__EPILOG:
				return !getEpilog().isEmpty();
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
				case CrewaiPackage.SOURCE_UNIT__CODE: return CrewaiPackage.SOURCE_ELEMENT__CODE;
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
				case CrewaiPackage.SOURCE_ELEMENT__CODE: return CrewaiPackage.SOURCE_UNIT__CODE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SourceUnitImpl
