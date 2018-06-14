/**
 */
package com.misc.common.moplaf.job;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.TaskInput#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getTaskInput()
 * @model
 * @generated
 */
public interface TaskInput extends TaskDoc {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.Task#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' container reference.
	 * @see #setTask(Task)
	 * @see com.misc.common.moplaf.job.JobPackage#getTaskInput_Task()
	 * @see com.misc.common.moplaf.job.Task#getInputs
	 * @model opposite="Inputs" required="true" transient="false"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.TaskInput#getTask <em>Task</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' container reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // TaskInput
