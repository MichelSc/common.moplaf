/**
 */
package com.misc.common.moplaf.job;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.misc.common.moplaf.job.JobPackage#getTaskDomain()
 * @model
 * @generated
 */
public interface TaskDomain extends Docs, Tasks {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return an exemplar of every task type supported by this TaskDomain.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Task> getNewTasks();
} // TaskDomain
