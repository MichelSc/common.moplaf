/**
 */
package com.misc.common.moplaf.job;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.TaskOutput#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getTaskOutput()
 * @model
 * @generated
 */
public interface TaskOutput extends TaskDoc {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.Task#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' container reference.
	 * @see #setTask(Task)
	 * @see com.misc.common.moplaf.job.JobPackage#getTaskOutput_Task()
	 * @see com.misc.common.moplaf.job.Task#getOutputs
	 * @model opposite="Outputs" required="true" transient="false"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.TaskOutput#getTask <em>Task</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' container reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // TaskOutput
