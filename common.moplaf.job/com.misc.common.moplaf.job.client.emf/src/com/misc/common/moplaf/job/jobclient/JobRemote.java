/**
 */
package com.misc.common.moplaf.job.jobclient;

import com.misc.common.moplaf.common.ReturnFeedback;

import com.misc.common.moplaf.job.Job;
import com.misc.common.moplaf.job.ProgressFeedback;
import java.util.Date;

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
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgress <em>Last Progress</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgressWork <em>Last Progress Work</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgressTask <em>Last Progress Task</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobEngineProxy#getSubmittedJobs <em>Submitted Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handling Engine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handling Engine</em>' reference.
	 * @see #setHandlingEngine(JobEngineProxy)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobRemote_HandlingEngine()
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineProxy#getSubmittedJobs
	 * @model opposite="SubmittedJobs"
	 * @generated
	 */
	JobEngineProxy getHandlingEngine();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getHandlingEngine <em>Handling Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handling Engine</em>' reference.
	 * @see #getHandlingEngine()
	 * @generated
	 */
	void setHandlingEngine(JobEngineProxy value);

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
	 * Returns the value of the '<em><b>Last Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Progress</em>' attribute.
	 * @see #setLastProgress(Date)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobRemote_LastProgress()
	 * @model
	 * @generated
	 */
	Date getLastProgress();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgress <em>Last Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Progress</em>' attribute.
	 * @see #getLastProgress()
	 * @generated
	 */
	void setLastProgress(Date value);

	/**
	 * Returns the value of the '<em><b>Last Progress Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Progress Work</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Progress Work</em>' attribute.
	 * @see #setLastProgressWork(float)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobRemote_LastProgressWork()
	 * @model
	 * @generated
	 */
	float getLastProgressWork();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgressWork <em>Last Progress Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Progress Work</em>' attribute.
	 * @see #getLastProgressWork()
	 * @generated
	 */
	void setLastProgressWork(float value);

	/**
	 * Returns the value of the '<em><b>Last Progress Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Progress Task</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Progress Task</em>' attribute.
	 * @see #setLastProgressTask(String)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobRemote_LastProgressTask()
	 * @model
	 * @generated
	 */
	String getLastProgressTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgressTask <em>Last Progress Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Progress Task</em>' attribute.
	 * @see #getLastProgressTask()
	 * @generated
	 */
	void setLastProgressTask(String value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshProgress();

} // JobRemote
