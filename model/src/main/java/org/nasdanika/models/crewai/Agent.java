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
 *   <li>{@link org.nasdanika.models.crewai.Agent#getTools <em>Tools</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getLlm <em>Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getFunctionCallingLlm <em>Function Calling Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getStepCallback <em>Step Callback</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getKnowledgeSources <em>Knowledge Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.crewai.Agent#getEmbedder <em>Embedder</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.crewai.CrewaiPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends Configurable, Commented {
	/**
	 * Returns the value of the '<em><b>Tools</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.crewai.Tool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getAgent_Tools()
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Sources</em>' reference list.
	 * @see org.nasdanika.models.crewai.CrewaiPackage#getAgent_KnowledgeSources()
	 * @model
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

} // Agent
