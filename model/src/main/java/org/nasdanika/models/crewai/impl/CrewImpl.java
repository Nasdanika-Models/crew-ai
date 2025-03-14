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
import org.nasdanika.models.crewai.Callback;
import org.nasdanika.models.crewai.Code;
import org.nasdanika.models.crewai.Crew;
import org.nasdanika.models.crewai.CrewaiPackage;
import org.nasdanika.models.crewai.Function;
import org.nasdanika.models.crewai.KnowledgeSource;
import org.nasdanika.models.crewai.LargeLanguageModel;
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
 * An implementation of the model object '<em><b>Crew</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getMarkers <em>Markers</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getUris <em>Uris</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getLabelPrototype <em>Label Prototype</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getRepresentations <em>Representations</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getContextHelp <em>Context Help</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getBeforeKickoff <em>Before Kickoff</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getAfterKickoff <em>After Kickoff</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getKnowledgeSources <em>Knowledge Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getLanguageModels <em>Language Models</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getManagerAgent <em>Manager Agent</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getManagerLlm <em>Manager Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getFunctionCallingLlm <em>Function Calling Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getPlanningLlm <em>Planning Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getEmbedder <em>Embedder</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getStepCallback <em>Step Callback</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.impl.CrewImpl#getTaskCallback <em>Task Callback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrewImpl extends CodeImpl implements Crew {
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
	 * The default value of the '{@link #getProcess() <em>Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected static final org.nasdanika.models.crewai.Process PROCESS_EDEFAULT = org.nasdanika.models.crewai.Process.SEQUENTIAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrewaiPackage.Literals.CREW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Marker> getMarkers() {
		return (EList<Marker>)eDynamicGet(CrewaiPackage.CREW__MARKERS, NcorePackage.Literals.MARKED__MARKERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getUris() {
		return (EList<String>)eDynamicGet(CrewaiPackage.CREW__URIS, NcorePackage.Literals.MODEL_ELEMENT__URIS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(CrewaiPackage.CREW__DESCRIPTION, NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(CrewaiPackage.CREW__DESCRIPTION, NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return (String)eDynamicGet(CrewaiPackage.CREW__UUID, NcorePackage.Literals.MODEL_ELEMENT__UUID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		eDynamicSet(CrewaiPackage.CREW__UUID, NcorePackage.Literals.MODEL_ELEMENT__UUID, newUuid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getLabelPrototype() {
		return (EObject)eDynamicGet(CrewaiPackage.CREW__LABEL_PROTOTYPE, NcorePackage.Literals.MODEL_ELEMENT__LABEL_PROTOTYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelPrototype(EObject newLabelPrototype, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLabelPrototype, CrewaiPackage.CREW__LABEL_PROTOTYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelPrototype(EObject newLabelPrototype) {
		eDynamicSet(CrewaiPackage.CREW__LABEL_PROTOTYPE, NcorePackage.Literals.MODEL_ELEMENT__LABEL_PROTOTYPE, newLabelPrototype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getRepresentations() {
		return (EMap<String, String>)eDynamicGet(CrewaiPackage.CREW__REPRESENTATIONS, NcorePackage.Literals.MODEL_ELEMENT__REPRESENTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Property> getAnnotations() {
		return (EList<Property>)eDynamicGet(CrewaiPackage.CREW__ANNOTATIONS, NcorePackage.Literals.MODEL_ELEMENT__ANNOTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(CrewaiPackage.CREW__NAME, NcorePackage.Literals.NAMED_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(CrewaiPackage.CREW__NAME, NcorePackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(CrewaiPackage.CREW__DOCUMENTATION, NcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getContextHelp() {
		return (EList<EObject>)eDynamicGet(CrewaiPackage.CREW__CONTEXT_HELP, NcorePackage.Literals.DOCUMENTED__CONTEXT_HELP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(CrewaiPackage.CREW__ID, NcorePackage.Literals.STRING_IDENTITY__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(CrewaiPackage.CREW__ID, NcorePackage.Literals.STRING_IDENTITY__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Tool> getTools() {
		return (EList<Tool>)eDynamicGet(CrewaiPackage.CREW__TOOLS, CrewaiPackage.Literals.CREW__TOOLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Agent> getAgents() {
		return (EList<Agent>)eDynamicGet(CrewaiPackage.CREW__AGENTS, CrewaiPackage.Literals.CREW__AGENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Task> getTasks() {
		return (EList<Task>)eDynamicGet(CrewaiPackage.CREW__TASKS, CrewaiPackage.Literals.CREW__TASKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getBeforeKickoff() {
		return (Function)eDynamicGet(CrewaiPackage.CREW__BEFORE_KICKOFF, CrewaiPackage.Literals.CREW__BEFORE_KICKOFF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeforeKickoff(Function newBeforeKickoff, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBeforeKickoff, CrewaiPackage.CREW__BEFORE_KICKOFF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeforeKickoff(Function newBeforeKickoff) {
		eDynamicSet(CrewaiPackage.CREW__BEFORE_KICKOFF, CrewaiPackage.Literals.CREW__BEFORE_KICKOFF, newBeforeKickoff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getAfterKickoff() {
		return (Function)eDynamicGet(CrewaiPackage.CREW__AFTER_KICKOFF, CrewaiPackage.Literals.CREW__AFTER_KICKOFF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfterKickoff(Function newAfterKickoff, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAfterKickoff, CrewaiPackage.CREW__AFTER_KICKOFF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAfterKickoff(Function newAfterKickoff) {
		eDynamicSet(CrewaiPackage.CREW__AFTER_KICKOFF, CrewaiPackage.Literals.CREW__AFTER_KICKOFF, newAfterKickoff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.models.crewai.Process getProcess() {
		return (org.nasdanika.models.crewai.Process)eDynamicGet(CrewaiPackage.CREW__PROCESS, CrewaiPackage.Literals.CREW__PROCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcess(org.nasdanika.models.crewai.Process newProcess) {
		eDynamicSet(CrewaiPackage.CREW__PROCESS, CrewaiPackage.Literals.CREW__PROCESS, newProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KnowledgeSource> getKnowledgeSources() {
		return (EList<KnowledgeSource>)eDynamicGet(CrewaiPackage.CREW__KNOWLEDGE_SOURCES, CrewaiPackage.Literals.CREW__KNOWLEDGE_SOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<LargeLanguageModel> getLanguageModels() {
		return (EList<LargeLanguageModel>)eDynamicGet(CrewaiPackage.CREW__LANGUAGE_MODELS, CrewaiPackage.Literals.CREW__LANGUAGE_MODELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LargeLanguageModel getManagerLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.CREW__MANAGER_LLM, CrewaiPackage.Literals.CREW__MANAGER_LLM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeLanguageModel basicGetManagerLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.CREW__MANAGER_LLM, CrewaiPackage.Literals.CREW__MANAGER_LLM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagerLlm(LargeLanguageModel newManagerLlm) {
		eDynamicSet(CrewaiPackage.CREW__MANAGER_LLM, CrewaiPackage.Literals.CREW__MANAGER_LLM, newManagerLlm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent getManagerAgent() {
		return (Agent)eDynamicGet(CrewaiPackage.CREW__MANAGER_AGENT, CrewaiPackage.Literals.CREW__MANAGER_AGENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetManagerAgent() {
		return (Agent)eDynamicGet(CrewaiPackage.CREW__MANAGER_AGENT, CrewaiPackage.Literals.CREW__MANAGER_AGENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagerAgent(Agent newManagerAgent) {
		eDynamicSet(CrewaiPackage.CREW__MANAGER_AGENT, CrewaiPackage.Literals.CREW__MANAGER_AGENT, newManagerAgent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LargeLanguageModel getFunctionCallingLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.CREW__FUNCTION_CALLING_LLM, CrewaiPackage.Literals.CREW__FUNCTION_CALLING_LLM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeLanguageModel basicGetFunctionCallingLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.CREW__FUNCTION_CALLING_LLM, CrewaiPackage.Literals.CREW__FUNCTION_CALLING_LLM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionCallingLlm(LargeLanguageModel newFunctionCallingLlm) {
		eDynamicSet(CrewaiPackage.CREW__FUNCTION_CALLING_LLM, CrewaiPackage.Literals.CREW__FUNCTION_CALLING_LLM, newFunctionCallingLlm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LargeLanguageModel getPlanningLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.CREW__PLANNING_LLM, CrewaiPackage.Literals.CREW__PLANNING_LLM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeLanguageModel basicGetPlanningLlm() {
		return (LargeLanguageModel)eDynamicGet(CrewaiPackage.CREW__PLANNING_LLM, CrewaiPackage.Literals.CREW__PLANNING_LLM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanningLlm(LargeLanguageModel newPlanningLlm) {
		eDynamicSet(CrewaiPackage.CREW__PLANNING_LLM, CrewaiPackage.Literals.CREW__PLANNING_LLM, newPlanningLlm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getEmbedder() {
		return (Code)eDynamicGet(CrewaiPackage.CREW__EMBEDDER, CrewaiPackage.Literals.CREW__EMBEDDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetEmbedder() {
		return (Code)eDynamicGet(CrewaiPackage.CREW__EMBEDDER, CrewaiPackage.Literals.CREW__EMBEDDER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmbedder(Code newEmbedder) {
		eDynamicSet(CrewaiPackage.CREW__EMBEDDER, CrewaiPackage.Literals.CREW__EMBEDDER, newEmbedder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Callback getStepCallback() {
		return (Callback)eDynamicGet(CrewaiPackage.CREW__STEP_CALLBACK, CrewaiPackage.Literals.CREW__STEP_CALLBACK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callback basicGetStepCallback() {
		return (Callback)eDynamicGet(CrewaiPackage.CREW__STEP_CALLBACK, CrewaiPackage.Literals.CREW__STEP_CALLBACK, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepCallback(Callback newStepCallback) {
		eDynamicSet(CrewaiPackage.CREW__STEP_CALLBACK, CrewaiPackage.Literals.CREW__STEP_CALLBACK, newStepCallback);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Callback getTaskCallback() {
		return (Callback)eDynamicGet(CrewaiPackage.CREW__TASK_CALLBACK, CrewaiPackage.Literals.CREW__TASK_CALLBACK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callback basicGetTaskCallback() {
		return (Callback)eDynamicGet(CrewaiPackage.CREW__TASK_CALLBACK, CrewaiPackage.Literals.CREW__TASK_CALLBACK, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskCallback(Callback newTaskCallback) {
		eDynamicSet(CrewaiPackage.CREW__TASK_CALLBACK, CrewaiPackage.Literals.CREW__TASK_CALLBACK, newTaskCallback);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrewaiPackage.CREW__MARKERS:
				return ((InternalEList<?>)getMarkers()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.CREW__LABEL_PROTOTYPE:
				return basicSetLabelPrototype(null, msgs);
			case CrewaiPackage.CREW__REPRESENTATIONS:
				return ((InternalEList<?>)getRepresentations()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.CREW__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.CREW__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.CREW__CONTEXT_HELP:
				return ((InternalEList<?>)getContextHelp()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.CREW__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.CREW__AGENTS:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.CREW__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.CREW__BEFORE_KICKOFF:
				return basicSetBeforeKickoff(null, msgs);
			case CrewaiPackage.CREW__AFTER_KICKOFF:
				return basicSetAfterKickoff(null, msgs);
			case CrewaiPackage.CREW__KNOWLEDGE_SOURCES:
				return ((InternalEList<?>)getKnowledgeSources()).basicRemove(otherEnd, msgs);
			case CrewaiPackage.CREW__LANGUAGE_MODELS:
				return ((InternalEList<?>)getLanguageModels()).basicRemove(otherEnd, msgs);
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
			case CrewaiPackage.CREW__MARKERS:
				return getMarkers();
			case CrewaiPackage.CREW__URIS:
				return getUris();
			case CrewaiPackage.CREW__DESCRIPTION:
				return getDescription();
			case CrewaiPackage.CREW__UUID:
				return getUuid();
			case CrewaiPackage.CREW__LABEL_PROTOTYPE:
				return getLabelPrototype();
			case CrewaiPackage.CREW__REPRESENTATIONS:
				if (coreType) return getRepresentations();
				else return getRepresentations().map();
			case CrewaiPackage.CREW__ANNOTATIONS:
				return getAnnotations();
			case CrewaiPackage.CREW__NAME:
				return getName();
			case CrewaiPackage.CREW__DOCUMENTATION:
				return getDocumentation();
			case CrewaiPackage.CREW__CONTEXT_HELP:
				return getContextHelp();
			case CrewaiPackage.CREW__ID:
				return getId();
			case CrewaiPackage.CREW__TOOLS:
				return getTools();
			case CrewaiPackage.CREW__AGENTS:
				return getAgents();
			case CrewaiPackage.CREW__TASKS:
				return getTasks();
			case CrewaiPackage.CREW__BEFORE_KICKOFF:
				return getBeforeKickoff();
			case CrewaiPackage.CREW__AFTER_KICKOFF:
				return getAfterKickoff();
			case CrewaiPackage.CREW__PROCESS:
				return getProcess();
			case CrewaiPackage.CREW__KNOWLEDGE_SOURCES:
				return getKnowledgeSources();
			case CrewaiPackage.CREW__LANGUAGE_MODELS:
				return getLanguageModels();
			case CrewaiPackage.CREW__MANAGER_AGENT:
				if (resolve) return getManagerAgent();
				return basicGetManagerAgent();
			case CrewaiPackage.CREW__MANAGER_LLM:
				if (resolve) return getManagerLlm();
				return basicGetManagerLlm();
			case CrewaiPackage.CREW__FUNCTION_CALLING_LLM:
				if (resolve) return getFunctionCallingLlm();
				return basicGetFunctionCallingLlm();
			case CrewaiPackage.CREW__PLANNING_LLM:
				if (resolve) return getPlanningLlm();
				return basicGetPlanningLlm();
			case CrewaiPackage.CREW__EMBEDDER:
				if (resolve) return getEmbedder();
				return basicGetEmbedder();
			case CrewaiPackage.CREW__STEP_CALLBACK:
				if (resolve) return getStepCallback();
				return basicGetStepCallback();
			case CrewaiPackage.CREW__TASK_CALLBACK:
				if (resolve) return getTaskCallback();
				return basicGetTaskCallback();
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
			case CrewaiPackage.CREW__MARKERS:
				getMarkers().clear();
				getMarkers().addAll((Collection<? extends Marker>)newValue);
				return;
			case CrewaiPackage.CREW__URIS:
				getUris().clear();
				getUris().addAll((Collection<? extends String>)newValue);
				return;
			case CrewaiPackage.CREW__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CrewaiPackage.CREW__UUID:
				setUuid((String)newValue);
				return;
			case CrewaiPackage.CREW__LABEL_PROTOTYPE:
				setLabelPrototype((EObject)newValue);
				return;
			case CrewaiPackage.CREW__REPRESENTATIONS:
				((EStructuralFeature.Setting)getRepresentations()).set(newValue);
				return;
			case CrewaiPackage.CREW__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Property>)newValue);
				return;
			case CrewaiPackage.CREW__NAME:
				setName((String)newValue);
				return;
			case CrewaiPackage.CREW__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
				return;
			case CrewaiPackage.CREW__CONTEXT_HELP:
				getContextHelp().clear();
				getContextHelp().addAll((Collection<? extends EObject>)newValue);
				return;
			case CrewaiPackage.CREW__ID:
				setId((String)newValue);
				return;
			case CrewaiPackage.CREW__TOOLS:
				getTools().clear();
				getTools().addAll((Collection<? extends Tool>)newValue);
				return;
			case CrewaiPackage.CREW__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends Agent>)newValue);
				return;
			case CrewaiPackage.CREW__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case CrewaiPackage.CREW__BEFORE_KICKOFF:
				setBeforeKickoff((Function)newValue);
				return;
			case CrewaiPackage.CREW__AFTER_KICKOFF:
				setAfterKickoff((Function)newValue);
				return;
			case CrewaiPackage.CREW__PROCESS:
				setProcess((org.nasdanika.models.crewai.Process)newValue);
				return;
			case CrewaiPackage.CREW__KNOWLEDGE_SOURCES:
				getKnowledgeSources().clear();
				getKnowledgeSources().addAll((Collection<? extends KnowledgeSource>)newValue);
				return;
			case CrewaiPackage.CREW__LANGUAGE_MODELS:
				getLanguageModels().clear();
				getLanguageModels().addAll((Collection<? extends LargeLanguageModel>)newValue);
				return;
			case CrewaiPackage.CREW__MANAGER_AGENT:
				setManagerAgent((Agent)newValue);
				return;
			case CrewaiPackage.CREW__MANAGER_LLM:
				setManagerLlm((LargeLanguageModel)newValue);
				return;
			case CrewaiPackage.CREW__FUNCTION_CALLING_LLM:
				setFunctionCallingLlm((LargeLanguageModel)newValue);
				return;
			case CrewaiPackage.CREW__PLANNING_LLM:
				setPlanningLlm((LargeLanguageModel)newValue);
				return;
			case CrewaiPackage.CREW__EMBEDDER:
				setEmbedder((Code)newValue);
				return;
			case CrewaiPackage.CREW__STEP_CALLBACK:
				setStepCallback((Callback)newValue);
				return;
			case CrewaiPackage.CREW__TASK_CALLBACK:
				setTaskCallback((Callback)newValue);
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
			case CrewaiPackage.CREW__MARKERS:
				getMarkers().clear();
				return;
			case CrewaiPackage.CREW__URIS:
				getUris().clear();
				return;
			case CrewaiPackage.CREW__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CrewaiPackage.CREW__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case CrewaiPackage.CREW__LABEL_PROTOTYPE:
				setLabelPrototype((EObject)null);
				return;
			case CrewaiPackage.CREW__REPRESENTATIONS:
				getRepresentations().clear();
				return;
			case CrewaiPackage.CREW__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CrewaiPackage.CREW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CrewaiPackage.CREW__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case CrewaiPackage.CREW__CONTEXT_HELP:
				getContextHelp().clear();
				return;
			case CrewaiPackage.CREW__ID:
				setId(ID_EDEFAULT);
				return;
			case CrewaiPackage.CREW__TOOLS:
				getTools().clear();
				return;
			case CrewaiPackage.CREW__AGENTS:
				getAgents().clear();
				return;
			case CrewaiPackage.CREW__TASKS:
				getTasks().clear();
				return;
			case CrewaiPackage.CREW__BEFORE_KICKOFF:
				setBeforeKickoff((Function)null);
				return;
			case CrewaiPackage.CREW__AFTER_KICKOFF:
				setAfterKickoff((Function)null);
				return;
			case CrewaiPackage.CREW__PROCESS:
				setProcess(PROCESS_EDEFAULT);
				return;
			case CrewaiPackage.CREW__KNOWLEDGE_SOURCES:
				getKnowledgeSources().clear();
				return;
			case CrewaiPackage.CREW__LANGUAGE_MODELS:
				getLanguageModels().clear();
				return;
			case CrewaiPackage.CREW__MANAGER_AGENT:
				setManagerAgent((Agent)null);
				return;
			case CrewaiPackage.CREW__MANAGER_LLM:
				setManagerLlm((LargeLanguageModel)null);
				return;
			case CrewaiPackage.CREW__FUNCTION_CALLING_LLM:
				setFunctionCallingLlm((LargeLanguageModel)null);
				return;
			case CrewaiPackage.CREW__PLANNING_LLM:
				setPlanningLlm((LargeLanguageModel)null);
				return;
			case CrewaiPackage.CREW__EMBEDDER:
				setEmbedder((Code)null);
				return;
			case CrewaiPackage.CREW__STEP_CALLBACK:
				setStepCallback((Callback)null);
				return;
			case CrewaiPackage.CREW__TASK_CALLBACK:
				setTaskCallback((Callback)null);
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
			case CrewaiPackage.CREW__MARKERS:
				return !getMarkers().isEmpty();
			case CrewaiPackage.CREW__URIS:
				return !getUris().isEmpty();
			case CrewaiPackage.CREW__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case CrewaiPackage.CREW__UUID:
				return UUID_EDEFAULT == null ? getUuid() != null : !UUID_EDEFAULT.equals(getUuid());
			case CrewaiPackage.CREW__LABEL_PROTOTYPE:
				return getLabelPrototype() != null;
			case CrewaiPackage.CREW__REPRESENTATIONS:
				return !getRepresentations().isEmpty();
			case CrewaiPackage.CREW__ANNOTATIONS:
				return !getAnnotations().isEmpty();
			case CrewaiPackage.CREW__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CrewaiPackage.CREW__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case CrewaiPackage.CREW__CONTEXT_HELP:
				return !getContextHelp().isEmpty();
			case CrewaiPackage.CREW__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CrewaiPackage.CREW__TOOLS:
				return !getTools().isEmpty();
			case CrewaiPackage.CREW__AGENTS:
				return !getAgents().isEmpty();
			case CrewaiPackage.CREW__TASKS:
				return !getTasks().isEmpty();
			case CrewaiPackage.CREW__BEFORE_KICKOFF:
				return getBeforeKickoff() != null;
			case CrewaiPackage.CREW__AFTER_KICKOFF:
				return getAfterKickoff() != null;
			case CrewaiPackage.CREW__PROCESS:
				return getProcess() != PROCESS_EDEFAULT;
			case CrewaiPackage.CREW__KNOWLEDGE_SOURCES:
				return !getKnowledgeSources().isEmpty();
			case CrewaiPackage.CREW__LANGUAGE_MODELS:
				return !getLanguageModels().isEmpty();
			case CrewaiPackage.CREW__MANAGER_AGENT:
				return basicGetManagerAgent() != null;
			case CrewaiPackage.CREW__MANAGER_LLM:
				return basicGetManagerLlm() != null;
			case CrewaiPackage.CREW__FUNCTION_CALLING_LLM:
				return basicGetFunctionCallingLlm() != null;
			case CrewaiPackage.CREW__PLANNING_LLM:
				return basicGetPlanningLlm() != null;
			case CrewaiPackage.CREW__EMBEDDER:
				return basicGetEmbedder() != null;
			case CrewaiPackage.CREW__STEP_CALLBACK:
				return basicGetStepCallback() != null;
			case CrewaiPackage.CREW__TASK_CALLBACK:
				return basicGetTaskCallback() != null;
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
				case CrewaiPackage.CREW__MARKERS: return NcorePackage.MARKED__MARKERS;
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
				case CrewaiPackage.CREW__URIS: return NcorePackage.MODEL_ELEMENT__URIS;
				case CrewaiPackage.CREW__DESCRIPTION: return NcorePackage.MODEL_ELEMENT__DESCRIPTION;
				case CrewaiPackage.CREW__UUID: return NcorePackage.MODEL_ELEMENT__UUID;
				case CrewaiPackage.CREW__LABEL_PROTOTYPE: return NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE;
				case CrewaiPackage.CREW__REPRESENTATIONS: return NcorePackage.MODEL_ELEMENT__REPRESENTATIONS;
				case CrewaiPackage.CREW__ANNOTATIONS: return NcorePackage.MODEL_ELEMENT__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case CrewaiPackage.CREW__NAME: return NcorePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Documented.class) {
			switch (derivedFeatureID) {
				case CrewaiPackage.CREW__DOCUMENTATION: return NcorePackage.DOCUMENTED__DOCUMENTATION;
				case CrewaiPackage.CREW__CONTEXT_HELP: return NcorePackage.DOCUMENTED__CONTEXT_HELP;
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
				case CrewaiPackage.CREW__ID: return NcorePackage.STRING_IDENTITY__ID;
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
				case NcorePackage.MARKED__MARKERS: return CrewaiPackage.CREW__MARKERS;
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
				case NcorePackage.MODEL_ELEMENT__URIS: return CrewaiPackage.CREW__URIS;
				case NcorePackage.MODEL_ELEMENT__DESCRIPTION: return CrewaiPackage.CREW__DESCRIPTION;
				case NcorePackage.MODEL_ELEMENT__UUID: return CrewaiPackage.CREW__UUID;
				case NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE: return CrewaiPackage.CREW__LABEL_PROTOTYPE;
				case NcorePackage.MODEL_ELEMENT__REPRESENTATIONS: return CrewaiPackage.CREW__REPRESENTATIONS;
				case NcorePackage.MODEL_ELEMENT__ANNOTATIONS: return CrewaiPackage.CREW__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case NcorePackage.NAMED_ELEMENT__NAME: return CrewaiPackage.CREW__NAME;
				default: return -1;
			}
		}
		if (baseClass == Documented.class) {
			switch (baseFeatureID) {
				case NcorePackage.DOCUMENTED__DOCUMENTATION: return CrewaiPackage.CREW__DOCUMENTATION;
				case NcorePackage.DOCUMENTED__CONTEXT_HELP: return CrewaiPackage.CREW__CONTEXT_HELP;
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
				case NcorePackage.STRING_IDENTITY__ID: return CrewaiPackage.CREW__ID;
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

} //CrewImpl
