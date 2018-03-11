/**
 */
package com.misc.common.moplaf.job.jobhttp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage
 * @generated
 */
public interface JobHttpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobHttpFactory eINSTANCE = com.misc.common.moplaf.job.jobhttp.impl.JobHttpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Job Engine Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Engine Client</em>'.
	 * @generated
	 */
	JobEngineClient createJobEngineClient();

	/**
	 * Returns a new object of class '<em>Job Engine Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Engine Server</em>'.
	 * @generated
	 */
	JobEngineServer createJobEngineServer();

	/**
	 * Returns a new object of class '<em>Job Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Server</em>'.
	 * @generated
	 */
	JobServer createJobServer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JobHttpPackage getJobHttpPackage();

} //JobHttpFactory
