/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.job.jobclient.*;

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
public class JobclientFactoryImpl extends EFactoryImpl implements JobclientFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobclientFactory init() {
		try {
			JobclientFactory theJobclientFactory = (JobclientFactory)EPackage.Registry.INSTANCE.getEFactory(JobclientPackage.eNS_URI);
			if (theJobclientFactory != null) {
				return theJobclientFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JobclientFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobclientFactoryImpl() {
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
			case JobclientPackage.JOB_REMOTE: return createJobRemote();
			case JobclientPackage.JOB_REMOTE_RESULT: return createJobRemoteResult();
			case JobclientPackage.JOB_ENGINE_IN_PROCESS: return createJobEngineInProcess();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobRemote createJobRemote() {
		JobRemoteImpl jobRemote = new JobRemoteImpl();
		return jobRemote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobRemoteResult createJobRemoteResult() {
		JobRemoteResultImpl jobRemoteResult = new JobRemoteResultImpl();
		return jobRemoteResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEngineInProcess createJobEngineInProcess() {
		JobEngineInProcessImpl jobEngineInProcess = new JobEngineInProcessImpl();
		return jobEngineInProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobclientPackage getJobclientPackage() {
		return (JobclientPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JobclientPackage getPackage() {
		return JobclientPackage.eINSTANCE;
	}

} //JobclientFactoryImpl
