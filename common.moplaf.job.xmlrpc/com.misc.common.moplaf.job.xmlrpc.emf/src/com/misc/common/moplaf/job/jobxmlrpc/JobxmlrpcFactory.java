/**
 */
package com.misc.common.moplaf.job.jobxmlrpc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.job.jobxmlrpc.JobxmlrpcPackage
 * @generated
 */
public interface JobxmlrpcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobxmlrpcFactory eINSTANCE = com.misc.common.moplaf.job.jobxmlrpc.impl.JobxmlrpcFactoryImpl.init();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JobxmlrpcPackage getJobxmlrpcPackage();

} //JobxmlrpcFactory
