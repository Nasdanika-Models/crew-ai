/**
 */
package org.nasdanika.models.crewai.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.common.Adaptable;

import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.crewai.Function;

import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.DocumentedNamedElement;
import org.nasdanika.ncore.DocumentedNamedStringIdentity;
import org.nasdanika.ncore.Marker;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.Property;
import org.nasdanika.ncore.StringIdentity;

import org.nasdanika.persistence.Marked;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.impl.FunctionImpl#getMarkers <em>Markers</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.FunctionImpl#getUris <em>Uris</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.FunctionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.FunctionImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.FunctionImpl#getLabelPrototype <em>Label Prototype</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.FunctionImpl#getRepresentations <em>Representations</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.FunctionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.FunctionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.FunctionImpl#getContextHelp <em>Context Help</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.FunctionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.FunctionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends CodeImpl implements Function {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrewaiPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Marker> getMarkers() {
		return (EList<Marker>)eDynamicGet(CrewaiPackage.FUNCTION__MARKERS, NcorePackage.Literals.MARKED__MARKERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getUris() {
		return (EList<String>)eDynamicGet(CrewaiPackage.FUNCTION__URIS, NcorePackage.Literals.MODEL_ELEMENT__URIS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(CrewaiPackage.FUNCTION__DESCRIPTION, NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(CrewaiPackage.FUNCTION__DESCRIPTION, NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return (String)eDynamicGet(CrewaiPackage.FUNCTION__UUID, NcorePackage.Literals.MODEL_ELEMENT__UUID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		eDynamicSet(CrewaiPackage.FUNCTION__UUID, NcorePackage.Literals.MODEL_ELEMENT__UUID, newUuid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getLabelPrototype() {
		return (EObject)eDynamicGet(CrewaiPackage.FUNCTION__LABEL_PROTOTYPE, NcorePackage.Literals.MODEL_ELEMENT__LABEL_PROTOTYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelPrototype(EObject newLabelPrototype, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLabelPrototype, CrewaiPackage.FUNCTION__LABEL_PROTOTYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelPrototype(EObject newLabelPrototype) {
		eDynamicSet(CrewaiPackage.FUNCTION__LABEL_PROTOTYPE, NcorePackage.Literals.MODEL_ELEMENT__LABEL_PROTOTYPE, newLabelPrototype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getRepresentations() {
		return (EMap<String, String>)eDynamicGet(CrewaiPackage.FUNCTION__REPRESENTATIONS, NcorePackage.Literals.MODEL_ELEMENT__REPRESENTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Property> getAnnotations() {
		return (EList<Property>)eDynamicGet(CrewaiPackage.FUNCTION__ANNOTATIONS, NcorePackage.Literals.MODEL_ELEMENT__ANNOTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(CrewaiPackage.FUNCTION__NAME, NcorePackage.Literals.NAMED_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(CrewaiPackage.FUNCTION__NAME, NcorePackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(CrewaiPackage.FUNCTION__DOCUMENTATION, NcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getContextHelp() {
		return (EList<EObject>)eDynamicGet(CrewaiPackage.FUNCTION__CONTEXT_HELP, NcorePackage.Literals.DOCUMENTED__CONTEXT_HELP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(CrewaiPackage.FUNCTION__ID, NcorePackage.Literals.STRING_IDENTITY__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(CrewaiPackage.FUNCTION__ID, NcorePackage.Literals.STRING_IDENTITY__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getParameters() {
		return (EList<String>)eDynamicGet(CrewaiPackage.FUNCTION__PARAMETERS, CrewaiPackage.Literals.FUNCTION__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrewaiPackage.FUNCTION__MARKERS:
				return ((InternalEList<?>)getMarkers()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.FUNCTION__LABEL_PROTOTYPE:
				return basicSetLabelPrototype(null, msgs);
			case CrewaiPackage.FUNCTION__REPRESENTATIONS:
				return ((InternalEList<?>)getRepresentations()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.FUNCTION__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.FUNCTION__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.FUNCTION__CONTEXT_HELP:
				return ((InternalEList<?>)getContextHelp()).basicRemove(otherEnd, msgs);
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
			case CrewaiPackage.FUNCTION__MARKERS:
				return getMarkers();
			case CrewaiPackage.FUNCTION__URIS:
				return getUris();
			case CrewaiPackage.FUNCTION__DESCRIPTION:
				return getDescription();
			case CrewaiPackage.FUNCTION__UUID:
				return getUuid();
			case CrewaiPackage.FUNCTION__LABEL_PROTOTYPE:
				return getLabelPrototype();
			case CrewaiPackage.FUNCTION__REPRESENTATIONS:
				if (coreType) return getRepresentations();
				else return getRepresentations().map();
			case CrewaiPackage.FUNCTION__ANNOTATIONS:
				return getAnnotations();
			case CrewaiPackage.FUNCTION__NAME:
				return getName();
			case CrewaiPackage.FUNCTION__DOCUMENTATION:
				return getDocumentation();
			case CrewaiPackage.FUNCTION__CONTEXT_HELP:
				return getContextHelp();
			case CrewaiPackage.FUNCTION__ID:
				return getId();
			case CrewaiPackage.FUNCTION__PARAMETERS:
				return getParameters();
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
			case CrewaiPackage.FUNCTION__MARKERS:
				getMarkers().clear();
				getMarkers().addAll((Collection<? extends Marker>)newValue);
				return;
			case CrewaiPackage.FUNCTION__URIS:
				getUris().clear();
				getUris().addAll((Collection<? extends String>)newValue);
				return;
			case CrewaiPackage.FUNCTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CrewaiPackage.FUNCTION__UUID:
				setUuid((String)newValue);
				return;
			case CrewaiPackage.FUNCTION__LABEL_PROTOTYPE:
				setLabelPrototype((EObject)newValue);
				return;
			case CrewaiPackage.FUNCTION__REPRESENTATIONS:
				((EStructuralFeature.Setting)getRepresentations()).set(newValue);
				return;
			case CrewaiPackage.FUNCTION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Property>)newValue);
				return;
			case CrewaiPackage.FUNCTION__NAME:
				setName((String)newValue);
				return;
			case CrewaiPackage.FUNCTION__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
				return;
			case CrewaiPackage.FUNCTION__CONTEXT_HELP:
				getContextHelp().clear();
				getContextHelp().addAll((Collection<? extends EObject>)newValue);
				return;
			case CrewaiPackage.FUNCTION__ID:
				setId((String)newValue);
				return;
			case CrewaiPackage.FUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
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
			case CrewaiPackage.FUNCTION__MARKERS:
				getMarkers().clear();
				return;
			case CrewaiPackage.FUNCTION__URIS:
				getUris().clear();
				return;
			case CrewaiPackage.FUNCTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CrewaiPackage.FUNCTION__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case CrewaiPackage.FUNCTION__LABEL_PROTOTYPE:
				setLabelPrototype((EObject)null);
				return;
			case CrewaiPackage.FUNCTION__REPRESENTATIONS:
				getRepresentations().clear();
				return;
			case CrewaiPackage.FUNCTION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CrewaiPackage.FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CrewaiPackage.FUNCTION__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case CrewaiPackage.FUNCTION__CONTEXT_HELP:
				getContextHelp().clear();
				return;
			case CrewaiPackage.FUNCTION__ID:
				setId(ID_EDEFAULT);
				return;
			case CrewaiPackage.FUNCTION__PARAMETERS:
				getParameters().clear();
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
			case CrewaiPackage.FUNCTION__MARKERS:
				return !getMarkers().isEmpty();
			case CrewaiPackage.FUNCTION__URIS:
				return !getUris().isEmpty();
			case CrewaiPackage.FUNCTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case CrewaiPackage.FUNCTION__UUID:
				return UUID_EDEFAULT == null ? getUuid() != null : !UUID_EDEFAULT.equals(getUuid());
			case CrewaiPackage.FUNCTION__LABEL_PROTOTYPE:
				return getLabelPrototype() != null;
			case CrewaiPackage.FUNCTION__REPRESENTATIONS:
				return !getRepresentations().isEmpty();
			case CrewaiPackage.FUNCTION__ANNOTATIONS:
				return !getAnnotations().isEmpty();
			case CrewaiPackage.FUNCTION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CrewaiPackage.FUNCTION__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case CrewaiPackage.FUNCTION__CONTEXT_HELP:
				return !getContextHelp().isEmpty();
			case CrewaiPackage.FUNCTION__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CrewaiPackage.FUNCTION__PARAMETERS:
				return !getParameters().isEmpty();
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
		if (baseClass == Marked.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == org.nasdanika.ncore.Marked.class) {
			switch (derivedFeatureID) {
				case CrewaiPackage.FUNCTION__MARKERS: return NcorePackage.MARKED__MARKERS;
				default: return -1;
			}
		}
		if (baseClass == Adaptable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case CrewaiPackage.FUNCTION__URIS: return NcorePackage.MODEL_ELEMENT__URIS;
				case CrewaiPackage.FUNCTION__DESCRIPTION: return NcorePackage.MODEL_ELEMENT__DESCRIPTION;
				case CrewaiPackage.FUNCTION__UUID: return NcorePackage.MODEL_ELEMENT__UUID;
				case CrewaiPackage.FUNCTION__LABEL_PROTOTYPE: return NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE;
				case CrewaiPackage.FUNCTION__REPRESENTATIONS: return NcorePackage.MODEL_ELEMENT__REPRESENTATIONS;
				case CrewaiPackage.FUNCTION__ANNOTATIONS: return NcorePackage.MODEL_ELEMENT__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case CrewaiPackage.FUNCTION__NAME: return NcorePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Documented.class) {
			switch (derivedFeatureID) {
				case CrewaiPackage.FUNCTION__DOCUMENTATION: return NcorePackage.DOCUMENTED__DOCUMENTATION;
				case CrewaiPackage.FUNCTION__CONTEXT_HELP: return NcorePackage.DOCUMENTED__CONTEXT_HELP;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == StringIdentity.class) {
			switch (derivedFeatureID) {
				case CrewaiPackage.FUNCTION__ID: return NcorePackage.STRING_IDENTITY__ID;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedStringIdentity.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == Marked.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == org.nasdanika.ncore.Marked.class) {
			switch (baseFeatureID) {
				case NcorePackage.MARKED__MARKERS: return CrewaiPackage.FUNCTION__MARKERS;
				default: return -1;
			}
		}
		if (baseClass == Adaptable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case NcorePackage.MODEL_ELEMENT__URIS: return CrewaiPackage.FUNCTION__URIS;
				case NcorePackage.MODEL_ELEMENT__DESCRIPTION: return CrewaiPackage.FUNCTION__DESCRIPTION;
				case NcorePackage.MODEL_ELEMENT__UUID: return CrewaiPackage.FUNCTION__UUID;
				case NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE: return CrewaiPackage.FUNCTION__LABEL_PROTOTYPE;
				case NcorePackage.MODEL_ELEMENT__REPRESENTATIONS: return CrewaiPackage.FUNCTION__REPRESENTATIONS;
				case NcorePackage.MODEL_ELEMENT__ANNOTATIONS: return CrewaiPackage.FUNCTION__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case NcorePackage.NAMED_ELEMENT__NAME: return CrewaiPackage.FUNCTION__NAME;
				default: return -1;
			}
		}
		if (baseClass == Documented.class) {
			switch (baseFeatureID) {
				case NcorePackage.DOCUMENTED__DOCUMENTATION: return CrewaiPackage.FUNCTION__DOCUMENTATION;
				case NcorePackage.DOCUMENTED__CONTEXT_HELP: return CrewaiPackage.FUNCTION__CONTEXT_HELP;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == StringIdentity.class) {
			switch (baseFeatureID) {
				case NcorePackage.STRING_IDENTITY__ID: return CrewaiPackage.FUNCTION__ID;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedStringIdentity.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FunctionImpl
