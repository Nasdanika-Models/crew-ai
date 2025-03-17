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
import org.nasdanika.models.crewai.Agent;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.crewai.Task;
import org.nasdanika.models.crewai.Tool;
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
 * An implementation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.impl.ToolImpl#getMarkers <em>Markers</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ToolImpl#getUris <em>Uris</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ToolImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ToolImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ToolImpl#getLabelPrototype <em>Label Prototype</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ToolImpl#getRepresentations <em>Representations</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ToolImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ToolImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ToolImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ToolImpl#getContextHelp <em>Context Help</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ToolImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ToolImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ToolImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.ToolImpl#getAgents <em>Agents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToolImpl extends CodeImpl implements Tool {
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
	 * The default value of the '{@link #getDeclarations() <em>Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARATIONS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrewaiPackage.Literals.TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Marker> getMarkers() {
		return (EList<Marker>)eDynamicGet(CrewaiPackage.TOOL__MARKERS, NcorePackage.Literals.MARKED__MARKERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getUris() {
		return (EList<String>)eDynamicGet(CrewaiPackage.TOOL__URIS, NcorePackage.Literals.MODEL_ELEMENT__URIS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(CrewaiPackage.TOOL__DESCRIPTION, NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(CrewaiPackage.TOOL__DESCRIPTION, NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return (String)eDynamicGet(CrewaiPackage.TOOL__UUID, NcorePackage.Literals.MODEL_ELEMENT__UUID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		eDynamicSet(CrewaiPackage.TOOL__UUID, NcorePackage.Literals.MODEL_ELEMENT__UUID, newUuid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getLabelPrototype() {
		return (EObject)eDynamicGet(CrewaiPackage.TOOL__LABEL_PROTOTYPE, NcorePackage.Literals.MODEL_ELEMENT__LABEL_PROTOTYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelPrototype(EObject newLabelPrototype, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLabelPrototype, CrewaiPackage.TOOL__LABEL_PROTOTYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelPrototype(EObject newLabelPrototype) {
		eDynamicSet(CrewaiPackage.TOOL__LABEL_PROTOTYPE, NcorePackage.Literals.MODEL_ELEMENT__LABEL_PROTOTYPE, newLabelPrototype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getRepresentations() {
		return (EMap<String, String>)eDynamicGet(CrewaiPackage.TOOL__REPRESENTATIONS, NcorePackage.Literals.MODEL_ELEMENT__REPRESENTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Property> getAnnotations() {
		return (EList<Property>)eDynamicGet(CrewaiPackage.TOOL__ANNOTATIONS, NcorePackage.Literals.MODEL_ELEMENT__ANNOTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(CrewaiPackage.TOOL__NAME, NcorePackage.Literals.NAMED_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(CrewaiPackage.TOOL__NAME, NcorePackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(CrewaiPackage.TOOL__DOCUMENTATION, NcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getContextHelp() {
		return (EList<EObject>)eDynamicGet(CrewaiPackage.TOOL__CONTEXT_HELP, NcorePackage.Literals.DOCUMENTED__CONTEXT_HELP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(CrewaiPackage.TOOL__ID, NcorePackage.Literals.STRING_IDENTITY__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(CrewaiPackage.TOOL__ID, NcorePackage.Literals.STRING_IDENTITY__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclarations() {
		return (String)eDynamicGet(CrewaiPackage.TOOL__DECLARATIONS, CrewaiPackage.Literals.TOOL__DECLARATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarations(String newDeclarations) {
		eDynamicSet(CrewaiPackage.TOOL__DECLARATIONS, CrewaiPackage.Literals.TOOL__DECLARATIONS, newDeclarations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Task> getTasks() {
		return (EList<Task>)eDynamicGet(CrewaiPackage.TOOL__TASKS, CrewaiPackage.Literals.TOOL__TASKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Agent> getAgents() {
		return (EList<Agent>)eDynamicGet(CrewaiPackage.TOOL__AGENTS, CrewaiPackage.Literals.TOOL__AGENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrewaiPackage.TOOL__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
			case CrewaiPackage.TOOL__AGENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAgents()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrewaiPackage.TOOL__MARKERS:
				return ((InternalEList<?>)getMarkers()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.TOOL__LABEL_PROTOTYPE:
				return basicSetLabelPrototype(null, msgs);
			case CrewaiPackage.TOOL__REPRESENTATIONS:
				return ((InternalEList<?>)getRepresentations()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.TOOL__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.TOOL__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.TOOL__CONTEXT_HELP:
				return ((InternalEList<?>)getContextHelp()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.TOOL__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.TOOL__AGENTS:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
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
			case CrewaiPackage.TOOL__MARKERS:
				return getMarkers();
			case CrewaiPackage.TOOL__URIS:
				return getUris();
			case CrewaiPackage.TOOL__DESCRIPTION:
				return getDescription();
			case CrewaiPackage.TOOL__UUID:
				return getUuid();
			case CrewaiPackage.TOOL__LABEL_PROTOTYPE:
				return getLabelPrototype();
			case CrewaiPackage.TOOL__REPRESENTATIONS:
				if (coreType) return getRepresentations();
				else return getRepresentations().map();
			case CrewaiPackage.TOOL__ANNOTATIONS:
				return getAnnotations();
			case CrewaiPackage.TOOL__NAME:
				return getName();
			case CrewaiPackage.TOOL__DOCUMENTATION:
				return getDocumentation();
			case CrewaiPackage.TOOL__CONTEXT_HELP:
				return getContextHelp();
			case CrewaiPackage.TOOL__ID:
				return getId();
			case CrewaiPackage.TOOL__DECLARATIONS:
				return getDeclarations();
			case CrewaiPackage.TOOL__TASKS:
				return getTasks();
			case CrewaiPackage.TOOL__AGENTS:
				return getAgents();
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
			case CrewaiPackage.TOOL__MARKERS:
				getMarkers().clear();
				getMarkers().addAll((Collection<? extends Marker>)newValue);
				return;
			case CrewaiPackage.TOOL__URIS:
				getUris().clear();
				getUris().addAll((Collection<? extends String>)newValue);
				return;
			case CrewaiPackage.TOOL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CrewaiPackage.TOOL__UUID:
				setUuid((String)newValue);
				return;
			case CrewaiPackage.TOOL__LABEL_PROTOTYPE:
				setLabelPrototype((EObject)newValue);
				return;
			case CrewaiPackage.TOOL__REPRESENTATIONS:
				((EStructuralFeature.Setting)getRepresentations()).set(newValue);
				return;
			case CrewaiPackage.TOOL__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Property>)newValue);
				return;
			case CrewaiPackage.TOOL__NAME:
				setName((String)newValue);
				return;
			case CrewaiPackage.TOOL__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
				return;
			case CrewaiPackage.TOOL__CONTEXT_HELP:
				getContextHelp().clear();
				getContextHelp().addAll((Collection<? extends EObject>)newValue);
				return;
			case CrewaiPackage.TOOL__ID:
				setId((String)newValue);
				return;
			case CrewaiPackage.TOOL__DECLARATIONS:
				setDeclarations((String)newValue);
				return;
			case CrewaiPackage.TOOL__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case CrewaiPackage.TOOL__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends Agent>)newValue);
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
			case CrewaiPackage.TOOL__MARKERS:
				getMarkers().clear();
				return;
			case CrewaiPackage.TOOL__URIS:
				getUris().clear();
				return;
			case CrewaiPackage.TOOL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CrewaiPackage.TOOL__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case CrewaiPackage.TOOL__LABEL_PROTOTYPE:
				setLabelPrototype((EObject)null);
				return;
			case CrewaiPackage.TOOL__REPRESENTATIONS:
				getRepresentations().clear();
				return;
			case CrewaiPackage.TOOL__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CrewaiPackage.TOOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CrewaiPackage.TOOL__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case CrewaiPackage.TOOL__CONTEXT_HELP:
				getContextHelp().clear();
				return;
			case CrewaiPackage.TOOL__ID:
				setId(ID_EDEFAULT);
				return;
			case CrewaiPackage.TOOL__DECLARATIONS:
				setDeclarations(DECLARATIONS_EDEFAULT);
				return;
			case CrewaiPackage.TOOL__TASKS:
				getTasks().clear();
				return;
			case CrewaiPackage.TOOL__AGENTS:
				getAgents().clear();
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
			case CrewaiPackage.TOOL__MARKERS:
				return !getMarkers().isEmpty();
			case CrewaiPackage.TOOL__URIS:
				return !getUris().isEmpty();
			case CrewaiPackage.TOOL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case CrewaiPackage.TOOL__UUID:
				return UUID_EDEFAULT == null ? getUuid() != null : !UUID_EDEFAULT.equals(getUuid());
			case CrewaiPackage.TOOL__LABEL_PROTOTYPE:
				return getLabelPrototype() != null;
			case CrewaiPackage.TOOL__REPRESENTATIONS:
				return !getRepresentations().isEmpty();
			case CrewaiPackage.TOOL__ANNOTATIONS:
				return !getAnnotations().isEmpty();
			case CrewaiPackage.TOOL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CrewaiPackage.TOOL__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case CrewaiPackage.TOOL__CONTEXT_HELP:
				return !getContextHelp().isEmpty();
			case CrewaiPackage.TOOL__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CrewaiPackage.TOOL__DECLARATIONS:
				return DECLARATIONS_EDEFAULT == null ? getDeclarations() != null : !DECLARATIONS_EDEFAULT.equals(getDeclarations());
			case CrewaiPackage.TOOL__TASKS:
				return !getTasks().isEmpty();
			case CrewaiPackage.TOOL__AGENTS:
				return !getAgents().isEmpty();
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
				case CrewaiPackage.TOOL__MARKERS: return NcorePackage.MARKED__MARKERS;
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
				case CrewaiPackage.TOOL__URIS: return NcorePackage.MODEL_ELEMENT__URIS;
				case CrewaiPackage.TOOL__DESCRIPTION: return NcorePackage.MODEL_ELEMENT__DESCRIPTION;
				case CrewaiPackage.TOOL__UUID: return NcorePackage.MODEL_ELEMENT__UUID;
				case CrewaiPackage.TOOL__LABEL_PROTOTYPE: return NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE;
				case CrewaiPackage.TOOL__REPRESENTATIONS: return NcorePackage.MODEL_ELEMENT__REPRESENTATIONS;
				case CrewaiPackage.TOOL__ANNOTATIONS: return NcorePackage.MODEL_ELEMENT__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case CrewaiPackage.TOOL__NAME: return NcorePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Documented.class) {
			switch (derivedFeatureID) {
				case CrewaiPackage.TOOL__DOCUMENTATION: return NcorePackage.DOCUMENTED__DOCUMENTATION;
				case CrewaiPackage.TOOL__CONTEXT_HELP: return NcorePackage.DOCUMENTED__CONTEXT_HELP;
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
				case CrewaiPackage.TOOL__ID: return NcorePackage.STRING_IDENTITY__ID;
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
				case NcorePackage.MARKED__MARKERS: return CrewaiPackage.TOOL__MARKERS;
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
				case NcorePackage.MODEL_ELEMENT__URIS: return CrewaiPackage.TOOL__URIS;
				case NcorePackage.MODEL_ELEMENT__DESCRIPTION: return CrewaiPackage.TOOL__DESCRIPTION;
				case NcorePackage.MODEL_ELEMENT__UUID: return CrewaiPackage.TOOL__UUID;
				case NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE: return CrewaiPackage.TOOL__LABEL_PROTOTYPE;
				case NcorePackage.MODEL_ELEMENT__REPRESENTATIONS: return CrewaiPackage.TOOL__REPRESENTATIONS;
				case NcorePackage.MODEL_ELEMENT__ANNOTATIONS: return CrewaiPackage.TOOL__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case NcorePackage.NAMED_ELEMENT__NAME: return CrewaiPackage.TOOL__NAME;
				default: return -1;
			}
		}
		if (baseClass == Documented.class) {
			switch (baseFeatureID) {
				case NcorePackage.DOCUMENTED__DOCUMENTATION: return CrewaiPackage.TOOL__DOCUMENTATION;
				case NcorePackage.DOCUMENTED__CONTEXT_HELP: return CrewaiPackage.TOOL__CONTEXT_HELP;
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
				case NcorePackage.STRING_IDENTITY__ID: return CrewaiPackage.TOOL__ID;
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

} //ToolImpl
