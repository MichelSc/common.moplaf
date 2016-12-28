/**
 */
package com.misc.common.moplaf.job.jobclient;

import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf.job.RunContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submitted Job</b></em>'.
 * @implements RunContext
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.SubmittedJob#getJob <em>Job</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.SubmittedJob#getJobEngine <em>Job Engine</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getSubmittedJob()
 * @model
 * @generated
 */
public interface SubmittedJob extends EObject, RunContext {
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

	/**
	 * Returns the value of the '<em><b>Job Engine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getSubmittedJobs <em>Submitted Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Engine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Engine</em>' container reference.
	 * @see #setJobEngine(JobEngine)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getSubmittedJob_JobEngine()
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#getSubmittedJobs
	 * @model opposite="SubmittedJobs" required="true" transient="false"
	 * @generated
	 */
	JobEngine getJobEngine();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.SubmittedJob#getJobEngine <em>Job Engine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Engine</em>' container reference.
	 * @see #getJobEngine()
	 * @generated
	 */
	void setJobEngine(JobEngine value);

} // SubmittedJob
