/**
 */
package com.misc.common.moplaf.job.jobclient;

import com.misc.common.moplaf.common.EnabledFeedback;

import com.misc.common.moplaf.job.ProgressFeedback;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Engine Old</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#getSubmittedJobs <em>Submitted Jobs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#isRunning <em>Running</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#getStartFeedback <em>Start Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#getStopFeedback <em>Stop Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobEngineOld()
 * @model abstract="true"
 * @generated
 */
public interface JobEngineOld extends EObject {
	/**
	 * Returns the value of the '<em><b>Submitted Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobclient.SubmittedJob}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.SubmittedJob#getJobEngine <em>Job Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submitted Jobs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submitted Jobs</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobEngineOld_SubmittedJobs()
	 * @see com.misc.common.moplaf.job.jobclient.SubmittedJob#getJobEngine
	 * @model opposite="JobEngine" containment="true"
	 * @generated
	 */
	EList<SubmittedJob> getSubmittedJobs();

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
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobEngineOld_Running()
	 * @model transient="true"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

	/**
	 * Returns the value of the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobEngineOld_StartFeedback()
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
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobEngineOld_StopFeedback()
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
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobEngineOld_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobEngineOld_Label()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

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
	 * @model progressDataType="com.misc.common.moplaf.job.ProgressFeedback"
	 * @generated
	 */
	boolean onJobProgress(SubmittedJob job, ProgressFeedback progress);

} // JobEngineOld
