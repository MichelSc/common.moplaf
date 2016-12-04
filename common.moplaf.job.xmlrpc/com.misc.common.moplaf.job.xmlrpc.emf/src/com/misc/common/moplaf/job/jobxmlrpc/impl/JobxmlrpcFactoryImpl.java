/**
 */
package com.misc.common.moplaf.job.jobxmlrpc.impl;

import com.misc.common.moplaf.job.jobxmlrpc.*;

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
public class JobxmlrpcFactoryImpl extends EFactoryImpl implements JobxmlrpcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobxmlrpcFactory init() {
		try {
			JobxmlrpcFactory theJobxmlrpcFactory = (JobxmlrpcFactory)EPackage.Registry.INSTANCE.getEFactory(JobxmlrpcPackage.eNS_URI);
			if (theJobxmlrpcFactory != null) {
				return theJobxmlrpcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JobxmlrpcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobxmlrpcFactoryImpl() {
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
			case JobxmlrpcPackage.JOB_ENGINE_CLIENT: return createJobEngineClient();
			case JobxmlrpcPackage.JOB_ENGINE_SERVER: return createJobEngineServer();
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
	public JobxmlrpcPackage getJobxmlrpcPackage() {
		return (JobxmlrpcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JobxmlrpcPackage getPackage() {
		return JobxmlrpcPackage.eINSTANCE;
	}

} //JobxmlrpcFactoryImpl
