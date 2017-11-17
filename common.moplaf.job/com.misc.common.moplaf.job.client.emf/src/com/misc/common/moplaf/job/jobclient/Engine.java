/**
 */
package com.misc.common.moplaf.job.jobclient;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.Engine#getJobschedueled <em>Jobschedueled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.Engine#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getEngine()
 * @model
 * @generated
 */
public interface Engine extends EObject {
	/**
	 * Returns the value of the '<em><b>Jobschedueled</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduledOn <em>Scheduled On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobschedueled</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobschedueled</em>' reference.
	 * @see #setJobschedueled(JobScheduled)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getEngine_Jobschedueled()
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduledOn
	 * @model opposite="ScheduledOn"
	 * @generated
	 */
	JobScheduled getJobschedueled();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.Engine#getJobschedueled <em>Jobschedueled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jobschedueled</em>' reference.
	 * @see #getJobschedueled()
	 * @generated
	 */
	void setJobschedueled(JobScheduled value);

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
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getEngine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.Engine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Engine
