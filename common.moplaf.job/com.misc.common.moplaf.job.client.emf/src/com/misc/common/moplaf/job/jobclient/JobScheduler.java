/**
 */
package com.misc.common.moplaf.job.jobclient;

import com.misc.common.moplaf.common.EnabledFeedback;

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
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getJobschedueled <em>Jobschedueled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getEngine <em>Engine</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getStartFeedback <em>Start Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getStopFeedback <em>Stop Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#isStarted <em>Started</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getNbOfEngines <em>Nb Of Engines</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getNbOfJobs <em>Nb Of Jobs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getRefreshFeedback <em>Refresh Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getRefreshRate <em>Refresh Rate</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobScheduler()
 * @model
 * @generated
 */
public interface JobScheduler extends EObject {
	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobclient.JobRemote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobScheduler_Jobs()
	 * @model containment="true"
	 * @generated
	 */
	EList<JobRemote> getJobs();

	/**
	 * Returns the value of the '<em><b>Jobschedueled</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobclient.JobScheduled}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobschedueled</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobschedueled</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobScheduler_Jobschedueled()
	 * @model containment="true"
	 * @generated
	 */
	EList<JobScheduled> getJobschedueled();

	/**
	 * Returns the value of the '<em><b>Engine</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobclient.Engine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobScheduler_Engine()
	 * @model containment="true"
	 * @generated
	 */
	EList<Engine> getEngine();

	/**
	 * Returns the value of the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobScheduler_StartFeedback()
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
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobScheduler_StopFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getStopFeedback();

	/**
	 * Returns the value of the '<em><b>Started</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started</em>' attribute.
	 * @see #setStarted(boolean)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobScheduler_Started()
	 * @model default="false"
	 * @generated
	 */
	boolean isStarted();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#isStarted <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' attribute.
	 * @see #isStarted()
	 * @generated
	 */
	void setStarted(boolean value);

	/**
	 * Returns the value of the '<em><b>Nb Of Engines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Of Engines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Of Engines</em>' attribute.
	 * @see #setNbOfEngines(int)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobScheduler_NbOfEngines()
	 * @model
	 * @generated
	 */
	int getNbOfEngines();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getNbOfEngines <em>Nb Of Engines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Of Engines</em>' attribute.
	 * @see #getNbOfEngines()
	 * @generated
	 */
	void setNbOfEngines(int value);

	/**
	 * Returns the value of the '<em><b>Nb Of Jobs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Of Jobs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Of Jobs</em>' attribute.
	 * @see #setNbOfJobs(int)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobScheduler_NbOfJobs()
	 * @model
	 * @generated
	 */
	int getNbOfJobs();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getNbOfJobs <em>Nb Of Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Of Jobs</em>' attribute.
	 * @see #getNbOfJobs()
	 * @generated
	 */
	void setNbOfJobs(int value);

	/**
	 * Returns the value of the '<em><b>Refresh Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobScheduler_RefreshFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getRefreshFeedback();

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
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobScheduler_RefreshRate()
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

} // JobScheduler
