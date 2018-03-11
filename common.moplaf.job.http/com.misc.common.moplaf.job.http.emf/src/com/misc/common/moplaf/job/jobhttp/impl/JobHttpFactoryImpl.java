/**
 */
package com.misc.common.moplaf.job.jobhttp.impl;

import com.misc.common.moplaf.job.jobhttp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobHttpFactoryImpl extends EFactoryImpl implements JobHttpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobHttpFactory init() {
		try {
			JobHttpFactory theJobHttpFactory = (JobHttpFactory)EPackage.Registry.INSTANCE.getEFactory(JobHttpPackage.eNS_URI);
			if (theJobHttpFactory != null) {
				return theJobHttpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JobHttpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobHttpFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JobHttpPackage.JOB_ENGINE_CLIENT: return createJobEngineClient();
			case JobHttpPackage.JOB_ENGINE_SERVER: return createJobEngineServer();
			case JobHttpPackage.JOB_SERVER: return createJobServer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEngineClient createJobEngineClient() {
		JobEngineClientImpl jobEngineClient = new JobEngineClientImpl();
		return jobEngineClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEngineServer createJobEngineServer() {
		JobEngineServerImpl jobEngineServer = new JobEngineServerImpl();
		return jobEngineServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobServer createJobServer() {
		JobServerImpl jobServer = new JobServerImpl();
		return jobServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobHttpPackage getJobHttpPackage() {
		return (JobHttpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JobHttpPackage getPackage() {
		return JobHttpPackage.eINSTANCE;
	}

} //JobHttpFactoryImpl
