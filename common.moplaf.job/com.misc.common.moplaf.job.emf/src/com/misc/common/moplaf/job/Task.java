/**
 */
package com.misc.common.moplaf.job;

import com.misc.common.moplaf.common.EnabledFeedback;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.Task#getCloneFeedback <em>Clone Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Task#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Task#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Task#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends Run, KeyIndicatorsHolder {
	/**
	 * Returns the value of the '<em><b>Clone Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clone Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clone Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.JobPackage#getTask_CloneFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getCloneFeedback();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.TaskOutput}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.TaskOutput#getProducer <em>Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.JobPackage#getTask_Outputs()
	 * @see com.misc.common.moplaf.job.TaskOutput#getProducer
	 * @model opposite="Producer" containment="true"
	 * @generated
	 */
	EList<TaskOutput> getOutputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback"
	 * @generated
	 */
	EnabledFeedback isValidInput(Doc doc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback"
	 * @generated
	 */
	EnabledFeedback isValidOutput(Doc doc);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.TaskInput}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.TaskInput#getConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.JobPackage#getTask_Inputs()
	 * @see com.misc.common.moplaf.job.TaskInput#getConsumer
	 * @model opposite="Consumer" containment="true"
	 * @generated
	 */
	EList<TaskInput> getInputs();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.job.JobPackage#getTask_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"<new Task>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.job.JobPackage#getTask_Name()
	 * @model default="&lt;new Task&gt;"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addInputDoc(Doc doc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model docsMany="true"
	 * @generated
	 */
	void addInputDocs(EList<Doc> docs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initOutputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Task clone();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addOutputDoc(Doc doc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model docsMany="true"
	 * @generated
	 */
	void addOutputDocs(EList<Doc> docs);

} // Task
