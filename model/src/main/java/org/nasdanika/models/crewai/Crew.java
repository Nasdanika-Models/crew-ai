/**
 */
package org.nasdanika.models.crewai;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.DocumentedNamedStringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crew</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getTools <em>Tools</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getAgents <em>Agents</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getBeforeKickoff <em>Before Kickoff</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getAfterKickoff <em>After Kickoff</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getProcess <em>Process</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getKnowledgeSources <em>Knowledge Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getLanguageModels <em>Language Models</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getManagerAgent <em>Manager Agent</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getManagerLlm <em>Manager Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getFunctionCallingLlm <em>Function Calling Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getPlanningLlm <em>Planning Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getEmbedder <em>Embedder</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getStepCallback <em>Step Callback</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Crew#getTaskCallback <em>Task Callback</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew()
 * @model
 * @generated
 */
public interface Crew extends Code, DocumentedNamedStringIdentity {

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Tool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_Tools()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_Agents()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_Tasks()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Before Kickoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Kickoff</em>' containment reference.
	 * @see #setBeforeKickoff(Function)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_BeforeKickoff()
	 * @model containment="true"
	 * @generated
	 */
	Function getBeforeKickoff();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Crew#getBeforeKickoff <em>Before Kickoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Kickoff</em>' containment reference.
	 * @see #getBeforeKickoff()
	 * @generated
	 */
	void setBeforeKickoff(Function value);

	/**
	 * Returns the value of the '<em><b>After Kickoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Kickoff</em>' containment reference.
	 * @see #setAfterKickoff(Function)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_AfterKickoff()
	 * @model containment="true"
	 * @generated
	 */
	Function getAfterKickoff();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Crew#getAfterKickoff <em>After Kickoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Kickoff</em>' containment reference.
	 * @see #getAfterKickoff()
	 * @generated
	 */
	void setAfterKickoff(Function value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.crewai.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' attribute.
	 * @see org.nasdanika.models.crewai.Process
	 * @see #setProcess(org.nasdanika.models.crewai.Process)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_Process()
	 * @model
	 * @generated
	 */
	org.nasdanika.models.crewai.Process getProcess();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Crew#getProcess <em>Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' attribute.
	 * @see org.nasdanika.models.crewai.Process
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(org.nasdanika.models.crewai.Process value);

	/**
	 * Returns the value of the '<em><b>Knowledge Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.KnowledgeSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Sources</em>' containment reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_KnowledgeSources()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<KnowledgeSource> getKnowledgeSources();

	/**
	 * Returns the value of the '<em><b>Language Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.LargeLanguageModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Models</em>' containment reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_LanguageModels()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<LargeLanguageModel> getLanguageModels();

	/**
	 * Returns the value of the '<em><b>Manager Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Llm</em>' reference.
	 * @see #setManagerLlm(LargeLanguageModel)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_ManagerLlm()
	 * @model
	 * @generated
	 */
	LargeLanguageModel getManagerLlm();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Crew#getManagerLlm <em>Manager Llm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager Llm</em>' reference.
	 * @see #getManagerLlm()
	 * @generated
	 */
	void setManagerLlm(LargeLanguageModel value);

	/**
	 * Returns the value of the '<em><b>Manager Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Agent</em>' reference.
	 * @see #setManagerAgent(Agent)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_ManagerAgent()
	 * @model
	 * @generated
	 */
	Agent getManagerAgent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Crew#getManagerAgent <em>Manager Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager Agent</em>' reference.
	 * @see #getManagerAgent()
	 * @generated
	 */
	void setManagerAgent(Agent value);

	/**
	 * Returns the value of the '<em><b>Function Calling Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Calling Llm</em>' reference.
	 * @see #setFunctionCallingLlm(LargeLanguageModel)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_FunctionCallingLlm()
	 * @model
	 * @generated
	 */
	LargeLanguageModel getFunctionCallingLlm();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Crew#getFunctionCallingLlm <em>Function Calling Llm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Calling Llm</em>' reference.
	 * @see #getFunctionCallingLlm()
	 * @generated
	 */
	void setFunctionCallingLlm(LargeLanguageModel value);

	/**
	 * Returns the value of the '<em><b>Planning Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning Llm</em>' reference.
	 * @see #setPlanningLlm(LargeLanguageModel)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_PlanningLlm()
	 * @model
	 * @generated
	 */
	LargeLanguageModel getPlanningLlm();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Crew#getPlanningLlm <em>Planning Llm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning Llm</em>' reference.
	 * @see #getPlanningLlm()
	 * @generated
	 */
	void setPlanningLlm(LargeLanguageModel value);

	/**
	 * Returns the value of the '<em><b>Embedder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedder</em>' reference.
	 * @see #setEmbedder(Code)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_Embedder()
	 * @model
	 * @generated
	 */
	Code getEmbedder();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Crew#getEmbedder <em>Embedder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedder</em>' reference.
	 * @see #getEmbedder()
	 * @generated
	 */
	void setEmbedder(Code value);

	/**
	 * Returns the value of the '<em><b>Step Callback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Callback</em>' reference.
	 * @see #setStepCallback(Callback)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_StepCallback()
	 * @model
	 * @generated
	 */
	Callback getStepCallback();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Crew#getStepCallback <em>Step Callback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Callback</em>' reference.
	 * @see #getStepCallback()
	 * @generated
	 */
	void setStepCallback(Callback value);

	/**
	 * Returns the value of the '<em><b>Task Callback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Callback</em>' reference.
	 * @see #setTaskCallback(Callback)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getCrew_TaskCallback()
	 * @model
	 * @generated
	 */
	Callback getTaskCallback();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Crew#getTaskCallback <em>Task Callback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Callback</em>' reference.
	 * @see #getTaskCallback()
	 * @generated
	 */
	void setTaskCallback(Callback value);
} // Crew
