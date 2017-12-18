/**
 */
package com.misc.common.moplaf.job.jobclient;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobSource#getJobScheduled <em>Job Scheduled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobSource#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobSource#getStartFeedback <em>Start Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobSource#getStopFeedback <em>Stop Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobSource#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobSource#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobSource#getStatus <em>Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobSource#isAutoStartStop <em>Auto Start Stop</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobSource#isRunning <em>Running</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSource()
 * @model
 * @generated
 */
public interface JobSource extends EObject {
	/**
	 * Returns the value of the '<em><b>Job Scheduled</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobclient.JobScheduled}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Scheduled</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Scheduled</em>' reference list.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSource_JobScheduled()
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getSource
	 * @model opposite="Source"
	 * @generated
	 */
	EList<JobScheduled> getJobScheduled();

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' container reference.
	 * @see #setScheduler(JobScheduler)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSource_Scheduler()
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getSources
	 * @model opposite="Sources" required="true" transient="false"
	 * @generated
	 */
	JobScheduler getScheduler();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobSource#getScheduler <em>Scheduler</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' container reference.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(JobScheduler value);

	/**
	 * Returns the value of the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSource_StartFeedback()
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
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSource_StopFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getStopFeedback();

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
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobSource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSource_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSource_Status()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getStatus();

	/**
	 * Returns the value of the '<em><b>Auto Start Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Start Stop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Start Stop</em>' attribute.
	 * @see #setAutoStartStop(boolean)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSource_AutoStartStop()
	 * @model
	 * @generated
	 */
	boolean isAutoStartStop();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobSource#isAutoStartStop <em>Auto Start Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Start Stop</em>' attribute.
	 * @see #isAutoStartStop()
	 * @generated
	 */
	void setAutoStartStop(boolean value);

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
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSource_Running()
	 * @model default="false" transient="true"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobSource#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

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
	void onJobRunning(JobScheduled job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model feedbackDataType="com.misc.common.moplaf.job.ReturnFeedback"
	 * @generated
	 */
	void onJobReturned(JobScheduled job, ReturnFeedback feedback);

} // JobSource
