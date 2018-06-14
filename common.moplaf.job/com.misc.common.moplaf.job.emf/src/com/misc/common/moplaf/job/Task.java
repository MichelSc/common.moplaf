/**
 */
package com.misc.common.moplaf.job;

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
 *   <li>{@link com.misc.common.moplaf.job.Task#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Task#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends Run {
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.TaskOutput}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.TaskOutput#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.JobPackage#getTask_Outputs()
	 * @see com.misc.common.moplaf.job.TaskOutput#getTask
	 * @model opposite="Task" containment="true"
	 * @generated
	 */
	EList<TaskOutput> getOutputs();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.TaskInput}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.TaskInput#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.JobPackage#getTask_Inputs()
	 * @see com.misc.common.moplaf.job.TaskInput#getTask
	 * @model opposite="Task" containment="true"
	 * @generated
	 */
	EList<TaskInput> getInputs();

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
	void addOutputDoc(Doc doc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model docsMany="true"
	 * @generated
	 */
	void addOutputDocs(EList<Doc> docs);

} // Task
