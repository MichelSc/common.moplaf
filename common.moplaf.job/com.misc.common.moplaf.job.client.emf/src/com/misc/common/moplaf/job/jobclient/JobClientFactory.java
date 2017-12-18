/**
 */
package com.misc.common.moplaf.job.jobclient;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage
 * @generated
 */
public interface JobClientFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobClientFactory eINSTANCE = com.misc.common.moplaf.job.jobclient.impl.JobClientFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Job Remote</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Remote</em>'.
	 * @generated
	 */
	JobRemote createJobRemote();

	/**
	 * Returns a new object of class '<em>Job Remote Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Remote Result</em>'.
	 * @generated
	 */
	JobRemoteResult createJobRemoteResult();

	/**
	 * Returns a new object of class '<em>Submitted Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submitted Job</em>'.
	 * @generated
	 */
	SubmittedJob createSubmittedJob();

	/**
	 * Returns a new object of class '<em>Job Engine In Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Engine In Process</em>'.
	 * @generated
	 */
	JobEngineInProcess createJobEngineInProcess();

	/**
	 * Returns a new object of class '<em>Job Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Scheduler</em>'.
	 * @generated
	 */
	JobScheduler createJobScheduler();

	/**
	 * Returns a new object of class '<em>Job Scheduled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Scheduled</em>'.
	 * @generated
	 */
	JobScheduled createJobScheduled();

	/**
	 * Returns a new object of class '<em>Job Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Source</em>'.
	 * @generated
	 */
	JobSource createJobSource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JobClientPackage getJobClientPackage();

} //JobClientFactory
