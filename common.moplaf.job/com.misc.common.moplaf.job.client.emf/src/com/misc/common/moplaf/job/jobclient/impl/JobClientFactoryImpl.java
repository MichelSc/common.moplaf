/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.job.jobclient.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class JobClientFactoryImpl extends EFactoryImpl implements JobClientFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobClientFactory init() {
		try {
			JobClientFactory theJobClientFactory = (JobClientFactory)EPackage.Registry.INSTANCE.getEFactory(JobClientPackage.eNS_URI);
			if (theJobClientFactory != null) {
				return theJobClientFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JobClientFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobClientFactoryImpl() {
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
			case JobClientPackage.JOB_REMOTE: return createJobRemote();
			case JobClientPackage.JOB_REMOTE_RESULT: return createJobRemoteResult();
			case JobClientPackage.SUBMITTED_JOB: return createSubmittedJob();
			case JobClientPackage.JOB_ENGINE_IN_PROCESS: return createJobEngineInProcess();
			case JobClientPackage.JOB_SCHEDULER: return createJobScheduler();
			case JobClientPackage.JOB_SCHEDULED: return createJobScheduled();
			case JobClientPackage.JOB_SOURCE: return createJobSource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JobClientPackage.JOB_STATUS:
				return createJobStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JobClientPackage.JOB_STATUS:
				return convertJobStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public SubmittedJob createSubmittedJob() {
		SubmittedJobImpl submittedJob = new SubmittedJobImpl();
		return submittedJob;
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
	public JobScheduler createJobScheduler() {
		JobSchedulerImpl jobScheduler = new JobSchedulerImpl();
		return jobScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobScheduled createJobScheduled() {
		JobScheduledImpl jobScheduled = new JobScheduledImpl();
		return jobScheduled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobSource createJobSource() {
		JobSourceImpl jobSource = new JobSourceImpl();
		return jobSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobStatus createJobStatusFromString(EDataType eDataType, String initialValue) {
		JobStatus result = JobStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJobStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobClientPackage getJobClientPackage() {
		return (JobClientPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JobClientPackage getPackage() {
		return JobClientPackage.eINSTANCE;
	}

} //JobClientFactoryImpl
