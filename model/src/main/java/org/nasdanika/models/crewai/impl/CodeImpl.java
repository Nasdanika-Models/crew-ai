/**
 */
package org.nasdanika.models.crewai.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.crewai.Code;
import org.nasdanika.models.crewai.CrewaiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.impl.CodeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CodeImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeImpl extends CommentedImpl implements Code {
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
	 * The default value of the '{@link #getImports() <em>Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrewaiPackage.Literals.CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return (String)eDynamicGet(CrewaiPackage.CODE__CODE, CrewaiPackage.Literals.CODE__CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		eDynamicSet(CrewaiPackage.CODE__CODE, CrewaiPackage.Literals.CODE__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImports() {
		return (String)eDynamicGet(CrewaiPackage.CODE__IMPORTS, CrewaiPackage.Literals.CODE__IMPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImports(String newImports) {
		eDynamicSet(CrewaiPackage.CODE__IMPORTS, CrewaiPackage.Literals.CODE__IMPORTS, newImports);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrewaiPackage.CODE__CODE:
				return getCode();
			case CrewaiPackage.CODE__IMPORTS:
				return getImports();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CrewaiPackage.CODE__CODE:
				setCode((String)newValue);
				return;
			case CrewaiPackage.CODE__IMPORTS:
				setImports((String)newValue);
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
			case CrewaiPackage.CODE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case CrewaiPackage.CODE__IMPORTS:
				setImports(IMPORTS_EDEFAULT);
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
			case CrewaiPackage.CODE__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case CrewaiPackage.CODE__IMPORTS:
				return IMPORTS_EDEFAULT == null ? getImports() != null : !IMPORTS_EDEFAULT.equals(getImports());
		}
		return super.eIsSet(featureID);
	}

} //CodeImpl
