/**
 */
package com.misc.common.moplaf.job.jobclient;

import com.misc.common.moplaf.common.ReturnFeedback;

import com.misc.common.moplaf.job.Job;
import com.misc.common.moplaf.job.ProgressFeedback;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Remote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getSubmissionID <em>Submission ID</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getHandlingEngine <em>Handling Engine</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobRemote()
 * @model
 * @generated
 */
public interface JobRemote extends Job {
	/**
	 * Returns the value of the '<em><b>Submission ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submission ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submission ID</em>' attribute.
	 * @see #setSubmissionID(int)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobRemote_SubmissionID()
	 * @model
	 * @generated
	 */
	int getSubmissionID();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getSubmissionID <em>Submission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submission ID</em>' attribute.
	 * @see #getSubmissionID()
	 * @generated
	 */
	void setSubmissionID(int value);

	/**
	 * Returns the value of the '<em><b>Handling Engine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getSubmittedJobs <em>Submitted Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handling Engine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handling Engine</em>' reference.
	 * @see #setHandlingEngine(JobEngine)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobRemote_HandlingEngine()
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#getSubmittedJobs
	 * @model opposite="SubmittedJobs"
	 * @generated
	 */
	JobEngine getHandlingEngine();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getHandlingEngine <em>Handling Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handling Engine</em>' reference.
	 * @see #getHandlingEngine()
	 * @generated
	 */
	void setHandlingEngine(JobEngine value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(JobRemoteResult)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobRemote_Result()
	 * @model containment="true"
	 * @generated
	 */
	JobRemoteResult getResult();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(JobRemoteResult value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model feedbackDataType="com.misc.common.moplaf.job.ProgressFeedback"
	 * @generated
	 */
	void onProgress(ProgressFeedback feedback);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model feedbackDataType="com.misc.common.moplaf.job.ReturnFeedback"
	 * @generated
	 */
	void onReturn(ReturnFeedback feedback);

} // JobRemote
