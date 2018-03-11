/**
 */
package com.misc.common.moplaf.job.jobclient;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Scheduler Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobSchedulerService#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobSchedulerService#getScheduler <em>Scheduler</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSchedulerService()
 * @model
 * @generated
 */
public interface JobSchedulerService extends Service {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSchedulerService_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' reference.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSchedulerService_Scheduler()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	JobScheduler getScheduler();

} // JobSchedulerService
