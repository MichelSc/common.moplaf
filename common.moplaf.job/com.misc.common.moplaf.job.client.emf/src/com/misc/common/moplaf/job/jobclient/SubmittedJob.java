/**
 */
package com.misc.common.moplaf.job.jobclient;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submitted Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.SubmittedJob#getJob <em>Job</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getSubmittedJob()
 * @model
 * @generated
 */
public interface SubmittedJob extends EObject {
	/**
	 * Returns the value of the '<em><b>Job</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' containment reference.
	 * @see #setJob(JobRemote)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getSubmittedJob_Job()
	 * @model containment="true"
	 * @generated
	 */
	JobRemote getJob();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.SubmittedJob#getJob <em>Job</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' containment reference.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(JobRemote value);

} // SubmittedJob
