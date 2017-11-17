/**
 */
package com.misc.common.moplaf.job.jobclient;

import com.misc.common.moplaf.job.Job;

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
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getJob <em>Job</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduledOn <em>Scheduled On</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobScheduled()
 * @model
 * @generated
 */
public interface JobScheduled extends EObject {
	/**
	 * Returns the value of the '<em><b>Job</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' containment reference.
	 * @see #setJob(Job)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobScheduled_Job()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Job getJob();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getJob <em>Job</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' containment reference.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(Job value);

	/**
	 * Returns the value of the '<em><b>Scheduled On</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.Engine#getJobschedueled <em>Jobschedueled</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled On</em>' reference.
	 * @see #setScheduledOn(Engine)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobScheduled_ScheduledOn()
	 * @see com.misc.common.moplaf.job.jobclient.Engine#getJobschedueled
	 * @model opposite="jobschedueled"
	 * @generated
	 */
	Engine getScheduledOn();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduledOn <em>Scheduled On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled On</em>' reference.
	 * @see #getScheduledOn()
	 * @generated
	 */
	void setScheduledOn(Engine value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void kill();

} // JobScheduled
