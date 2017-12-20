/**
 */
package com.misc.common.moplaf.job.jobclient;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.Run;
import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Scheduled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getRun <em>Run</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduledOn <em>Scheduled On</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isNotReadyToRun <em>Not Ready To Run</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isReadyToRun <em>Ready To Run</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isRunning <em>Running</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isReturned <em>Returned</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isCancelled <em>Cancelled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isFailed <em>Failed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getSubmissionTime <em>Submission Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getEndTime <em>End Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getCancelTime <em>Cancel Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getStatus <em>Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getCancelEnabledFeedback <em>Cancel Enabled Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getJobNr <em>Job Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled()
 * @model
 * @generated
 */
public interface JobScheduled extends EObject {
	/**
	 * Returns the value of the '<em><b>Run</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run</em>' reference.
	 * @see #setRun(Run)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_Run()
	 * @model required="true"
	 * @generated
	 */
	Run getRun();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getRun <em>Run</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run</em>' reference.
	 * @see #getRun()
	 * @generated
	 */
	void setRun(Run value);

	/**
	 * Returns the value of the '<em><b>Scheduled On</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getJobsScheduled <em>Jobs Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled On</em>' reference.
	 * @see #setScheduledOn(JobEngine)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_ScheduledOn()
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#getJobsScheduled
	 * @model opposite="JobsScheduled"
	 * @generated
	 */
	JobEngine getScheduledOn();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduledOn <em>Scheduled On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled On</em>' reference.
	 * @see #getScheduledOn()
	 * @generated
	 */
	void setScheduledOn(JobEngine value);

	/**
	 * Returns the value of the '<em><b>Not Ready To Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Ready To Run</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Ready To Run</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_NotReadyToRun()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isNotReadyToRun();

	/**
	 * Returns the value of the '<em><b>Ready To Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ready To Run</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ready To Run</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_ReadyToRun()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isReadyToRun();

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_Running()
	 * @model transient="true"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

	/**
	 * Returns the value of the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returned</em>' attribute.
	 * @see #setReturned(boolean)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_Returned()
	 * @model
	 * @generated
	 */
	boolean isReturned();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isReturned <em>Returned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returned</em>' attribute.
	 * @see #isReturned()
	 * @generated
	 */
	void setReturned(boolean value);

	/**
	 * Returns the value of the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancelled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancelled</em>' attribute.
	 * @see #setCancelled(boolean)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_Cancelled()
	 * @model
	 * @generated
	 */
	boolean isCancelled();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isCancelled <em>Cancelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancelled</em>' attribute.
	 * @see #isCancelled()
	 * @generated
	 */
	void setCancelled(boolean value);

	/**
	 * Returns the value of the '<em><b>Failed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed</em>' attribute.
	 * @see #setFailed(boolean)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_Failed()
	 * @model
	 * @generated
	 */
	boolean isFailed();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isFailed <em>Failed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed</em>' attribute.
	 * @see #isFailed()
	 * @generated
	 */
	void setFailed(boolean value);

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' attribute.
	 * @see #setFeedback(String)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_Feedback()
	 * @model
	 * @generated
	 */
	String getFeedback();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getFeedback <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback</em>' attribute.
	 * @see #getFeedback()
	 * @generated
	 */
	void setFeedback(String value);

	/**
	 * Returns the value of the '<em><b>Submission Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submission Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submission Time</em>' attribute.
	 * @see #setSubmissionTime(Date)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_SubmissionTime()
	 * @model
	 * @generated
	 */
	Date getSubmissionTime();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getSubmissionTime <em>Submission Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submission Time</em>' attribute.
	 * @see #getSubmissionTime()
	 * @generated
	 */
	void setSubmissionTime(Date value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_EndTime()
	 * @model
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.job.jobclient.JobStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobStatus
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_Status()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	JobStatus getStatus();

	/**
	 * Returns the value of the '<em><b>Cancel Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Time</em>' attribute.
	 * @see #setCancelTime(Date)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_CancelTime()
	 * @model
	 * @generated
	 */
	Date getCancelTime();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getCancelTime <em>Cancel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Time</em>' attribute.
	 * @see #getCancelTime()
	 * @generated
	 */
	void setCancelTime(Date value);

	/**
	 * Returns the value of the '<em><b>Cancel Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Enabled Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Enabled Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_CancelEnabledFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getCancelEnabledFeedback();

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' container reference.
	 * @see #setScheduler(JobScheduler)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_Scheduler()
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getJobs
	 * @model opposite="Jobs" required="true" transient="false"
	 * @generated
	 */
	JobScheduler getScheduler();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduler <em>Scheduler</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' container reference.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(JobScheduler value);

	/**
	 * Returns the value of the '<em><b>Job Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Nr</em>' attribute.
	 * @see #setJobNr(int)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_JobNr()
	 * @model
	 * @generated
	 */
	int getJobNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getJobNr <em>Job Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Nr</em>' attribute.
	 * @see #getJobNr()
	 * @generated
	 */
	void setJobNr(int value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobSource#getJobsScheduled <em>Jobs Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(JobSource)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduled_Source()
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#getJobsScheduled
	 * @model opposite="JobsScheduled"
	 * @generated
	 */
	JobSource getSource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(JobSource value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setRunning();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model feedbackDataType="com.misc.common.moplaf.job.ReturnFeedback"
	 * @generated
	 */
	void setReturn(ReturnFeedback feedback);

} // JobScheduled
