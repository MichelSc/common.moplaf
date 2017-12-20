/**
 */
package com.misc.common.moplaf.job.jobclient;

import com.misc.common.moplaf.common.EnabledFeedback;

import com.misc.common.moplaf.job.Run;
import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getJobs <em>Jobs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getEngines <em>Engines</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getStartFeedback <em>Start Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getStopFeedback <em>Stop Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getRefreshFeedback <em>Refresh Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getStatus <em>Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getRefreshRate <em>Refresh Rate</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#isRunning <em>Running</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getNrJobsWaiting <em>Nr Jobs Waiting</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getNrJobsRunning <em>Nr Jobs Running</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getNrJobsFailed <em>Nr Jobs Failed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getNrJobsCancelled <em>Nr Jobs Cancelled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getLastRefresh <em>Last Refresh</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getLastFeedback <em>Last Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getCurrentScheduleNr <em>Current Schedule Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler()
 * @model
 * @generated
 */
public interface JobScheduler extends EObject {
	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobclient.JobScheduled}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_Jobs()
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduler
	 * @model opposite="Scheduler" containment="true"
	 * @generated
	 */
	EList<JobScheduled> getJobs();

	/**
	 * Returns the value of the '<em><b>Engines</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobclient.JobEngine}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engines</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_Engines()
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#getScheduler
	 * @model opposite="Scheduler" containment="true"
	 * @generated
	 */
	EList<JobEngine> getEngines();

	/**
	 * Returns the value of the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_StartFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getStartFeedback();

	/**
	 * Returns the value of the '<em><b>Stop Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_StopFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getStopFeedback();

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_Running()
	 * @model default="false" transient="true"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Nr Jobs Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Jobs Waiting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Jobs Waiting</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_NrJobsWaiting()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNrJobsWaiting();

	/**
	 * Returns the value of the '<em><b>Nr Jobs Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Jobs Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Jobs Running</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_NrJobsRunning()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNrJobsRunning();

	/**
	 * Returns the value of the '<em><b>Nr Jobs Failed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Jobs Failed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Jobs Failed</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_NrJobsFailed()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNrJobsFailed();

	/**
	 * Returns the value of the '<em><b>Nr Jobs Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Jobs Cancelled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Jobs Cancelled</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_NrJobsCancelled()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNrJobsCancelled();

	/**
	 * Returns the value of the '<em><b>Last Refresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Refresh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Refresh</em>' attribute.
	 * @see #setLastRefresh(Date)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_LastRefresh()
	 * @model
	 * @generated
	 */
	Date getLastRefresh();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getLastRefresh <em>Last Refresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Refresh</em>' attribute.
	 * @see #getLastRefresh()
	 * @generated
	 */
	void setLastRefresh(Date value);

	/**
	 * Returns the value of the '<em><b>Last Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Feedback</em>' attribute.
	 * @see #setLastFeedback(Date)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_LastFeedback()
	 * @model
	 * @generated
	 */
	Date getLastFeedback();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getLastFeedback <em>Last Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Feedback</em>' attribute.
	 * @see #getLastFeedback()
	 * @generated
	 */
	void setLastFeedback(Date value);

	/**
	 * Returns the value of the '<em><b>Current Schedule Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Schedule Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Schedule Nr</em>' attribute.
	 * @see #setCurrentScheduleNr(int)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_CurrentScheduleNr()
	 * @model
	 * @generated
	 */
	int getCurrentScheduleNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getCurrentScheduleNr <em>Current Schedule Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Schedule Nr</em>' attribute.
	 * @see #getCurrentScheduleNr()
	 * @generated
	 */
	void setCurrentScheduleNr(int value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobclient.JobSource}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobSource#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_Sources()
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#getScheduler
	 * @model opposite="Scheduler" containment="true"
	 * @generated
	 */
	EList<JobSource> getSources();

	/**
	 * Returns the value of the '<em><b>Refresh Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_RefreshFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getRefreshFeedback();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Refresh Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Rate</em>' attribute.
	 * @see #setRefreshRate(float)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_RefreshRate()
	 * @model
	 * @generated
	 */
	float getRefreshRate();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getRefreshRate <em>Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Rate</em>' attribute.
	 * @see #getRefreshRate()
	 * @generated
	 */
	void setRefreshRate(float value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobScheduler_Status()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stop();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	JobScheduled submitRun(Run run);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setLastFeedback();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int makeNewScheduleNr();

} // JobScheduler
