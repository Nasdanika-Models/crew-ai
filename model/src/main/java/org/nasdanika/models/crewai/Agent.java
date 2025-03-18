/**
 */
package org.nasdanika.models.crewai;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getBackstory <em>Backstory</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getTools <em>Tools</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getLlm <em>Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getFunctionCallingLlm <em>Function Calling Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getStepCallback <em>Step Callback</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getKnowledgeSources <em>Knowledge Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getEmbedder <em>Embedder</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.crewai.CrewaiPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends Configurable {
	
	String BACKSTORY_KEY = CrewaiPackage.Literals.AGENT__BACKSTORY.getName();
	String GOAL_KEY = CrewaiPackage.Literals.AGENT__GOAL.getName();
	String ROLE_KEY = CrewaiPackage.Literals.AGENT__ROLE.getName();
	
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getAgent_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Agent#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' attribute.
	 * @see #setGoal(String)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getAgent_Goal()
	 * @model
	 * @generated
	 */
	String getGoal();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Agent#getGoal <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' attribute.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(String value);

	/**
	 * Returns the value of the '<em><b>Backstory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backstory</em>' attribute.
	 * @see #setBackstory(String)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getAgent_Backstory()
	 * @model
	 * @generated
	 */
	String getBackstory();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Agent#getBackstory <em>Backstory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backstory</em>' attribute.
	 * @see #getBackstory()
	 * @generated
	 */
	void setBackstory(String value);

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Tool}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.crewai.Tool#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getAgent_Tools()
	 * @see org.nasdanika.models.crewai.Tool#getAgents
	 * @model opposite="agents"
	 * @generated
	 */
	EList<Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Llm</em>' reference.
	 * @see #setLlm(LargeLanguageModel)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getAgent_Llm()
	 * @model
	 * @generated
	 */
	LargeLanguageModel getLlm();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Agent#getLlm <em>Llm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Llm</em>' reference.
	 * @see #getLlm()
	 * @generated
	 */
	void setLlm(LargeLanguageModel value);

	/**
	 * Returns the value of the '<em><b>Function Calling Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Calling Llm</em>' reference.
	 * @see #setFunctionCallingLlm(LargeLanguageModel)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getAgent_FunctionCallingLlm()
	 * @model
	 * @generated
	 */
	LargeLanguageModel getFunctionCallingLlm();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Agent#getFunctionCallingLlm <em>Function Calling Llm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Calling Llm</em>' reference.
	 * @see #getFunctionCallingLlm()
	 * @generated
	 */
	void setFunctionCallingLlm(LargeLanguageModel value);

	/**
	 * Returns the value of the '<em><b>Step Callback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Callback</em>' reference.
	 * @see #setStepCallback(Callback)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getAgent_StepCallback()
	 * @model
	 * @generated
	 */
	Callback getStepCallback();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Agent#getStepCallback <em>Step Callback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Callback</em>' reference.
	 * @see #getStepCallback()
	 * @generated
	 */
	void setStepCallback(Callback value);

	/**
	 * Returns the value of the '<em><b>Knowledge Sources</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.KnowledgeSource}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.crewai.KnowledgeSource#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Sources</em>' reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getAgent_KnowledgeSources()
	 * @see org.nasdanika.models.crewai.KnowledgeSource#getAgents
	 * @model opposite="agents"
	 * @generated
	 */
	EList<KnowledgeSource> getKnowledgeSources();

	/**
	 * Returns the value of the '<em><b>Embedder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedder</em>' reference.
	 * @see #setEmbedder(Code)
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getAgent_Embedder()
	 * @model
	 * @generated
	 */
	Code getEmbedder();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.crewai.Agent#getEmbedder <em>Embedder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedder</em>' reference.
	 * @see #getEmbedder()
	 * @generated
	 */
	void setEmbedder(Code value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Task}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.crewai.Task#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getAgent_Tasks()
	 * @see org.nasdanika.models.crewai.Task#getAgent
	 * @model opposite="agent"
	 * @generated
	 */
	EList<Task> getTasks();

} // Agent
