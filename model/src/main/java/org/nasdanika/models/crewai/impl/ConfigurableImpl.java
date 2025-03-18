/**
 */
package org.nasdanika.models.crewai.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.Util;
import org.nasdanika.models.crewai.Code;
import org.nasdanika.models.crewai.Configurable;
import org.nasdanika.models.crewai.CrewaiPackage;

import org.nasdanika.ncore.impl.DocumentedNamedStringIdentityImpl;
import org.yaml.snakeyaml.Yaml;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configurable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.impl.ConfigurableImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ConfigurableImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ConfigurableImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ConfigurableImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ConfigurableImpl#getConfigMap <em>Config Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurableImpl extends DocumentedNamedStringIdentityImpl implements Configurable {
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
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrewaiPackage.Literals.CONFIGURABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return (String)eDynamicGet(CrewaiPackage.CONFIGURABLE__CODE, CrewaiPackage.Literals.CODE__CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		eDynamicSet(CrewaiPackage.CONFIGURABLE__CODE, CrewaiPackage.Literals.CODE__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImports() {
		return (String)eDynamicGet(CrewaiPackage.CONFIGURABLE__IMPORTS, CrewaiPackage.Literals.CODE__IMPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImports(String newImports) {
		eDynamicSet(CrewaiPackage.CONFIGURABLE__IMPORTS, CrewaiPackage.Literals.CODE__IMPORTS, newImports);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return (String)eDynamicGet(CrewaiPackage.CONFIGURABLE__COMMENT, CrewaiPackage.Literals.CODE__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		eDynamicSet(CrewaiPackage.CONFIGURABLE__COMMENT, CrewaiPackage.Literals.CODE__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfiguration() {
		return (String)eDynamicGet(CrewaiPackage.CONFIGURABLE__CONFIGURATION, CrewaiPackage.Literals.CONFIGURABLE__CONFIGURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguration(String newConfiguration) {
		eDynamicSet(CrewaiPackage.CONFIGURABLE__CONFIGURATION, CrewaiPackage.Literals.CONFIGURABLE__CONFIGURATION, newConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Map<String, Object> getConfigMap() {
		Map<String, Object> configMap = new LinkedHashMap<>();
		String config = getConfiguration();
		if (!Util.isBlank(config)) {			
			Yaml yaml = new Yaml();
			Map<String, Object> configObj = yaml.load(config);
			configMap.putAll(configObj);
			
		}
		return configMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrewaiPackage.CONFIGURABLE__CODE:
				return getCode();
			case CrewaiPackage.CONFIGURABLE__IMPORTS:
				return getImports();
			case CrewaiPackage.CONFIGURABLE__COMMENT:
				return getComment();
			case CrewaiPackage.CONFIGURABLE__CONFIGURATION:
				return getConfiguration();
			case CrewaiPackage.CONFIGURABLE__CONFIG_MAP:
				return getConfigMap();
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
			case CrewaiPackage.CONFIGURABLE__CODE:
				setCode((String)newValue);
				return;
			case CrewaiPackage.CONFIGURABLE__IMPORTS:
				setImports((String)newValue);
				return;
			case CrewaiPackage.CONFIGURABLE__COMMENT:
				setComment((String)newValue);
				return;
			case CrewaiPackage.CONFIGURABLE__CONFIGURATION:
				setConfiguration((String)newValue);
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
			case CrewaiPackage.CONFIGURABLE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case CrewaiPackage.CONFIGURABLE__IMPORTS:
				setImports(IMPORTS_EDEFAULT);
				return;
			case CrewaiPackage.CONFIGURABLE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CrewaiPackage.CONFIGURABLE__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
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
			case CrewaiPackage.CONFIGURABLE__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case CrewaiPackage.CONFIGURABLE__IMPORTS:
				return IMPORTS_EDEFAULT == null ? getImports() != null : !IMPORTS_EDEFAULT.equals(getImports());
			case CrewaiPackage.CONFIGURABLE__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case CrewaiPackage.CONFIGURABLE__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? getConfiguration() != null : !CONFIGURATION_EDEFAULT.equals(getConfiguration());
			case CrewaiPackage.CONFIGURABLE__CONFIG_MAP:
				return getConfigMap() != null;
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
		if (baseClass == Code.class) {
			switch (derivedFeatureID) {
				case CrewaiPackage.CONFIGURABLE__CODE: return CrewaiPackage.CODE__CODE;
				case CrewaiPackage.CONFIGURABLE__IMPORTS: return CrewaiPackage.CODE__IMPORTS;
				case CrewaiPackage.CONFIGURABLE__COMMENT: return CrewaiPackage.CODE__COMMENT;
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
		if (baseClass == Code.class) {
			switch (baseFeatureID) {
				case CrewaiPackage.CODE__CODE: return CrewaiPackage.CONFIGURABLE__CODE;
				case CrewaiPackage.CODE__IMPORTS: return CrewaiPackage.CONFIGURABLE__IMPORTS;
				case CrewaiPackage.CODE__COMMENT: return CrewaiPackage.CONFIGURABLE__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConfigurableImpl
