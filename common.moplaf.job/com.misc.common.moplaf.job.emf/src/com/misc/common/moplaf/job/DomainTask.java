/**
 */
package com.misc.common.moplaf.job;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.DomainTask#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getDomainTask()
 * @model abstract="true"
 * @generated
 */
public interface DomainTask extends Task {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see com.misc.common.moplaf.job.JobPackage#getDomainTask_Domain()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	TaskDomain getDomain();

} // DomainTask
