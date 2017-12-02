/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.job.JobPackage;

import com.misc.common.moplaf.job.jobclient.JobClientFactory;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobEngine;
import com.misc.common.moplaf.job.jobclient.JobEngineInProcess;
import com.misc.common.moplaf.job.jobclient.JobEngineOld;
import com.misc.common.moplaf.job.jobclient.JobEngineProxy;
import com.misc.common.moplaf.job.jobclient.JobRemote;
import com.misc.common.moplaf.job.jobclient.JobRemoteResult;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
import com.misc.common.moplaf.job.jobclient.JobStatus;
import com.misc.common.moplaf.job.jobclient.SubmittedJob;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobClientPackageImpl extends EPackageImpl implements JobClientPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobRemoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEngineProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobRemoteResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEngineOldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submittedJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEngineInProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobSchedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobScheduledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jobStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JobClientPackageImpl() {
		super(eNS_URI, JobClientFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JobClientPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JobClientPackage init() {
		if (isInited) return (JobClientPackage)EPackage.Registry.INSTANCE.getEPackage(JobClientPackage.eNS_URI);

		// Obtain or create and register package
		JobClientPackageImpl theJobClientPackage = (JobClientPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JobClientPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JobClientPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		JobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJobClientPackage.createPackageContents();

		// Initialize created meta-data
		theJobClientPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJobClientPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JobClientPackage.eNS_URI, theJobClientPackage);
		return theJobClientPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobRemote() {
		return jobRemoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobRemote_SubmissionID() {
		return (EAttribute)jobRemoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobRemote_Result() {
		return (EReference)jobRemoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobRemote_LastProgress() {
		return (EAttribute)jobRemoteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobRemote_LastProgressWork() {
		return (EAttribute)jobRemoteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobRemote_LastProgressTask() {
		return (EAttribute)jobRemoteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobRemote_Job() {
		return (EReference)jobRemoteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobRemote_Jobremote() {
		return (EReference)jobRemoteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobRemote_JobremoteeOpposite() {
		return (EReference)jobRemoteEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobRemote_Name() {
		return (EAttribute)jobRemoteEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobRemote_Progress() {
		return (EAttribute)jobRemoteEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobRemote_StartTime() {
		return (EAttribute)jobRemoteEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobRemote__OnProgress__ProgressFeedback() {
		return jobRemoteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobRemote__OnReturn__ReturnFeedback() {
		return jobRemoteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobRemote__RefreshProgress() {
		return jobRemoteEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobRemote__Run__SubmittedJob() {
		return jobRemoteEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobEngineProxy() {
		return jobEngineProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineProxy_Name() {
		return (EAttribute)jobEngineProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobEngineProxy__SubmitJob__JobRemote() {
		return jobEngineProxyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobEngineProxy__GetJob__int() {
		return jobEngineProxyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobRemoteResult() {
		return jobRemoteResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobEngineOld() {
		return jobEngineOldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobEngineOld_SubmittedJobs() {
		return (EReference)jobEngineOldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineOld_Running() {
		return (EAttribute)jobEngineOldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineOld_StartFeedback() {
		return (EAttribute)jobEngineOldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineOld_StopFeedback() {
		return (EAttribute)jobEngineOldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineOld_Name() {
		return (EAttribute)jobEngineOldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineOld_Label() {
		return (EAttribute)jobEngineOldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobEngineOld__Start() {
		return jobEngineOldEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobEngineOld__Stop() {
		return jobEngineOldEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobEngineOld__OnJobProgress__SubmittedJob_ProgressFeedback() {
		return jobEngineOldEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubmittedJob() {
		return submittedJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmittedJob_Job() {
		return (EReference)submittedJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmittedJob_JobEngine() {
		return (EReference)submittedJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobEngineInProcess() {
		return jobEngineInProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobScheduler() {
		return jobSchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobScheduler_Jobs() {
		return (EReference)jobSchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobScheduler_Engines() {
		return (EReference)jobSchedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_StartFeedback() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_StopFeedback() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_Running() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_Description() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_NrJobsWaiting() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_NrJobsRunning() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_NrJobsFailed() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_NrJobsCancelled() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_LastRefresh() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_LastFeedback() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_CurrentJobNr() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_RefreshFeedback() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_Name() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_RefreshRate() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduler_Status() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobScheduler__Start() {
		return jobSchedulerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobScheduler__Stop() {
		return jobSchedulerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobScheduler__Refresh() {
		return jobSchedulerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobScheduler__SubmitRun__Run() {
		return jobSchedulerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobScheduler__SetLastFeedback() {
		return jobSchedulerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobScheduler__MakeNewJobNr() {
		return jobSchedulerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobScheduled() {
		return jobScheduledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobScheduled_Run() {
		return (EReference)jobScheduledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobScheduled_ScheduledOn() {
		return (EReference)jobScheduledEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_NotReadyToRun() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_ReadyToRun() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_Running() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_Returned() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_Cancelled() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_Failed() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_Feedback() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_SubmissionTime() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_StartTime() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_EndTime() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_Description() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_Status() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_CancelTime() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_CancelEnabledFeedback() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobScheduled_Scheduler() {
		return (EReference)jobScheduledEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobScheduled_JobNr() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobScheduled__Cancel() {
		return jobScheduledEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobScheduled__SetRunning() {
		return jobScheduledEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobScheduled__SetReturn__ReturnFeedback() {
		return jobScheduledEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobEngine() {
		return jobEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobEngine_JobScheduled() {
		return (EReference)jobEngineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngine_Name() {
		return (EAttribute)jobEngineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobEngine_Scheduler() {
		return (EReference)jobEngineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngine_ExecuteEnabledFeedback() {
		return (EAttribute)jobEngineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobEngine__ExecuteJob__JobScheduled() {
		return jobEngineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJobStatus() {
		return jobStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobClientFactory getJobClientFactory() {
		return (JobClientFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jobRemoteEClass = createEClass(JOB_REMOTE);
		createEAttribute(jobRemoteEClass, JOB_REMOTE__SUBMISSION_ID);
		createEReference(jobRemoteEClass, JOB_REMOTE__RESULT);
		createEAttribute(jobRemoteEClass, JOB_REMOTE__LAST_PROGRESS);
		createEAttribute(jobRemoteEClass, JOB_REMOTE__LAST_PROGRESS_WORK);
		createEAttribute(jobRemoteEClass, JOB_REMOTE__LAST_PROGRESS_TASK);
		createEReference(jobRemoteEClass, JOB_REMOTE__JOB);
		createEReference(jobRemoteEClass, JOB_REMOTE__JOBREMOTE);
		createEReference(jobRemoteEClass, JOB_REMOTE__JOBREMOTEE_OPPOSITE);
		createEAttribute(jobRemoteEClass, JOB_REMOTE__NAME);
		createEAttribute(jobRemoteEClass, JOB_REMOTE__PROGRESS);
		createEAttribute(jobRemoteEClass, JOB_REMOTE__START_TIME);
		createEOperation(jobRemoteEClass, JOB_REMOTE___ON_PROGRESS__PROGRESSFEEDBACK);
		createEOperation(jobRemoteEClass, JOB_REMOTE___ON_RETURN__RETURNFEEDBACK);
		createEOperation(jobRemoteEClass, JOB_REMOTE___REFRESH_PROGRESS);
		createEOperation(jobRemoteEClass, JOB_REMOTE___RUN__SUBMITTEDJOB);

		jobEngineProxyEClass = createEClass(JOB_ENGINE_PROXY);
		createEAttribute(jobEngineProxyEClass, JOB_ENGINE_PROXY__NAME);
		createEOperation(jobEngineProxyEClass, JOB_ENGINE_PROXY___SUBMIT_JOB__JOBREMOTE);
		createEOperation(jobEngineProxyEClass, JOB_ENGINE_PROXY___GET_JOB__INT);

		jobRemoteResultEClass = createEClass(JOB_REMOTE_RESULT);

		jobEngineOldEClass = createEClass(JOB_ENGINE_OLD);
		createEReference(jobEngineOldEClass, JOB_ENGINE_OLD__SUBMITTED_JOBS);
		createEAttribute(jobEngineOldEClass, JOB_ENGINE_OLD__RUNNING);
		createEAttribute(jobEngineOldEClass, JOB_ENGINE_OLD__START_FEEDBACK);
		createEAttribute(jobEngineOldEClass, JOB_ENGINE_OLD__STOP_FEEDBACK);
		createEAttribute(jobEngineOldEClass, JOB_ENGINE_OLD__NAME);
		createEAttribute(jobEngineOldEClass, JOB_ENGINE_OLD__LABEL);
		createEOperation(jobEngineOldEClass, JOB_ENGINE_OLD___START);
		createEOperation(jobEngineOldEClass, JOB_ENGINE_OLD___STOP);
		createEOperation(jobEngineOldEClass, JOB_ENGINE_OLD___ON_JOB_PROGRESS__SUBMITTEDJOB_PROGRESSFEEDBACK);

		submittedJobEClass = createEClass(SUBMITTED_JOB);
		createEReference(submittedJobEClass, SUBMITTED_JOB__JOB);
		createEReference(submittedJobEClass, SUBMITTED_JOB__JOB_ENGINE);

		jobEngineInProcessEClass = createEClass(JOB_ENGINE_IN_PROCESS);

		jobSchedulerEClass = createEClass(JOB_SCHEDULER);
		createEReference(jobSchedulerEClass, JOB_SCHEDULER__JOBS);
		createEReference(jobSchedulerEClass, JOB_SCHEDULER__ENGINES);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__START_FEEDBACK);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__STOP_FEEDBACK);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__REFRESH_FEEDBACK);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__STATUS);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__DESCRIPTION);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__NAME);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__REFRESH_RATE);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__RUNNING);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__NR_JOBS_WAITING);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__NR_JOBS_RUNNING);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__NR_JOBS_FAILED);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__NR_JOBS_CANCELLED);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__LAST_REFRESH);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__LAST_FEEDBACK);
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__CURRENT_JOB_NR);
		createEOperation(jobSchedulerEClass, JOB_SCHEDULER___START);
		createEOperation(jobSchedulerEClass, JOB_SCHEDULER___STOP);
		createEOperation(jobSchedulerEClass, JOB_SCHEDULER___REFRESH);
		createEOperation(jobSchedulerEClass, JOB_SCHEDULER___SUBMIT_RUN__RUN);
		createEOperation(jobSchedulerEClass, JOB_SCHEDULER___SET_LAST_FEEDBACK);
		createEOperation(jobSchedulerEClass, JOB_SCHEDULER___MAKE_NEW_JOB_NR);

		jobScheduledEClass = createEClass(JOB_SCHEDULED);
		createEReference(jobScheduledEClass, JOB_SCHEDULED__RUN);
		createEReference(jobScheduledEClass, JOB_SCHEDULED__SCHEDULED_ON);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__NOT_READY_TO_RUN);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__READY_TO_RUN);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__RUNNING);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__RETURNED);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__CANCELLED);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__FAILED);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__FEEDBACK);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__SUBMISSION_TIME);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__START_TIME);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__END_TIME);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__CANCEL_TIME);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__DESCRIPTION);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__STATUS);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__CANCEL_ENABLED_FEEDBACK);
		createEReference(jobScheduledEClass, JOB_SCHEDULED__SCHEDULER);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__JOB_NR);
		createEOperation(jobScheduledEClass, JOB_SCHEDULED___CANCEL);
		createEOperation(jobScheduledEClass, JOB_SCHEDULED___SET_RUNNING);
		createEOperation(jobScheduledEClass, JOB_SCHEDULED___SET_RETURN__RETURNFEEDBACK);

		jobEngineEClass = createEClass(JOB_ENGINE);
		createEReference(jobEngineEClass, JOB_ENGINE__JOB_SCHEDULED);
		createEAttribute(jobEngineEClass, JOB_ENGINE__NAME);
		createEReference(jobEngineEClass, JOB_ENGINE__SCHEDULER);
		createEAttribute(jobEngineEClass, JOB_ENGINE__EXECUTE_ENABLED_FEEDBACK);
		createEOperation(jobEngineEClass, JOB_ENGINE___EXECUTE_JOB__JOBSCHEDULED);

		// Create enums
		jobStatusEEnum = createEEnum(JOB_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		JobPackage theJobPackage = (JobPackage)EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jobEngineInProcessEClass.getESuperTypes().add(this.getJobEngine());

		// Initialize classes, features, and operations; add parameters
		initEClass(jobRemoteEClass, JobRemote.class, "JobRemote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobRemote_SubmissionID(), ecorePackage.getEInt(), "SubmissionID", null, 0, 1, JobRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobRemote_Result(), this.getJobRemoteResult(), null, "Result", null, 0, 1, JobRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobRemote_LastProgress(), ecorePackage.getEDate(), "LastProgress", null, 0, 1, JobRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobRemote_LastProgressWork(), ecorePackage.getEFloat(), "LastProgressWork", null, 0, 1, JobRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobRemote_LastProgressTask(), ecorePackage.getEString(), "LastProgressTask", null, 0, 1, JobRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobRemote_Job(), theJobPackage.getJob(), null, "job", null, 0, -1, JobRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobRemote_Jobremote(), this.getJobRemote(), this.getJobRemote_JobremoteeOpposite(), "jobremote", null, 0, 1, JobRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobRemote_JobremoteeOpposite(), this.getJobRemote(), this.getJobRemote_Jobremote(), "jobremoteeOpposite", null, 0, 1, JobRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobRemote_Name(), ecorePackage.getEString(), "Name", null, 0, 1, JobRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobRemote_Progress(), theJobPackage.getProgressFeedback(), "Progress", null, 0, 1, JobRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobRemote_StartTime(), ecorePackage.getEDate(), "StartTime", null, 0, 1, JobRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getJobRemote__OnProgress__ProgressFeedback(), null, "onProgress", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJobPackage.getProgressFeedback(), "feedback", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobRemote__OnReturn__ReturnFeedback(), null, "onReturn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJobPackage.getReturnFeedback(), "feedback", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobRemote__RefreshProgress(), null, "refreshProgress", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobRemote__Run__SubmittedJob(), theJobPackage.getReturnFeedback(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSubmittedJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobEngineProxyEClass, JobEngineProxy.class, "JobEngineProxy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobEngineProxy_Name(), ecorePackage.getEString(), "Name", null, 0, 1, JobEngineProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getJobEngineProxy__SubmitJob__JobRemote(), ecorePackage.getEInt(), "submitJob", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobRemote(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobEngineProxy__GetJob__int(), this.getJobRemote(), "getJob", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "submissionID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobRemoteResultEClass, JobRemoteResult.class, "JobRemoteResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jobEngineOldEClass, JobEngineOld.class, "JobEngineOld", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobEngineOld_SubmittedJobs(), this.getSubmittedJob(), this.getSubmittedJob_JobEngine(), "SubmittedJobs", null, 0, -1, JobEngineOld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngineOld_Running(), ecorePackage.getEBoolean(), "Running", null, 0, 1, JobEngineOld.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngineOld_StartFeedback(), theJobPackage.getEnabledFeedback(), "StartFeedback", null, 0, 1, JobEngineOld.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngineOld_StopFeedback(), theJobPackage.getEnabledFeedback(), "StopFeedback", null, 0, 1, JobEngineOld.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngineOld_Name(), ecorePackage.getEString(), "Name", null, 0, 1, JobEngineOld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngineOld_Label(), ecorePackage.getEString(), "Label", null, 0, 1, JobEngineOld.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getJobEngineOld__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobEngineOld__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobEngineOld__OnJobProgress__SubmittedJob_ProgressFeedback(), ecorePackage.getEBoolean(), "onJobProgress", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSubmittedJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJobPackage.getProgressFeedback(), "progress", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(submittedJobEClass, SubmittedJob.class, "SubmittedJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubmittedJob_Job(), this.getJobRemote(), null, "Job", null, 0, 1, SubmittedJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmittedJob_JobEngine(), this.getJobEngineOld(), this.getJobEngineOld_SubmittedJobs(), "JobEngine", null, 1, 1, SubmittedJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobEngineInProcessEClass, JobEngineInProcess.class, "JobEngineInProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jobSchedulerEClass, JobScheduler.class, "JobScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobScheduler_Jobs(), this.getJobScheduled(), this.getJobScheduled_Scheduler(), "Jobs", null, 0, -1, JobScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobScheduler_Engines(), this.getJobEngine(), this.getJobEngine_Scheduler(), "Engines", null, 0, -1, JobScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_StartFeedback(), theJobPackage.getEnabledFeedback(), "StartFeedback", null, 0, 1, JobScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_StopFeedback(), theJobPackage.getEnabledFeedback(), "StopFeedback", null, 0, 1, JobScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_RefreshFeedback(), theJobPackage.getEnabledFeedback(), "RefreshFeedback", null, 0, 1, JobScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_Status(), ecorePackage.getEString(), "Status", null, 0, 1, JobScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_Description(), ecorePackage.getEString(), "Description", null, 0, 1, JobScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_Name(), ecorePackage.getEString(), "Name", null, 0, 1, JobScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_RefreshRate(), ecorePackage.getEFloat(), "RefreshRate", null, 0, 1, JobScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_Running(), ecorePackage.getEBoolean(), "Running", "false", 0, 1, JobScheduler.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_NrJobsWaiting(), ecorePackage.getEInt(), "NrJobsWaiting", null, 0, 1, JobScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_NrJobsRunning(), ecorePackage.getEInt(), "NrJobsRunning", null, 0, 1, JobScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_NrJobsFailed(), ecorePackage.getEInt(), "NrJobsFailed", null, 0, 1, JobScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_NrJobsCancelled(), ecorePackage.getEInt(), "NrJobsCancelled", null, 0, 1, JobScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_LastRefresh(), ecorePackage.getEDate(), "LastRefresh", null, 0, 1, JobScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_LastFeedback(), ecorePackage.getEDate(), "LastFeedback", null, 0, 1, JobScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduler_CurrentJobNr(), ecorePackage.getEInt(), "CurrentJobNr", null, 0, 1, JobScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getJobScheduler__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobScheduler__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobScheduler__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobScheduler__SubmitRun__Run(), null, "submitRun", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJobPackage.getRun(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobScheduler__SetLastFeedback(), null, "setLastFeedback", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobScheduler__MakeNewJobNr(), ecorePackage.getEInt(), "makeNewJobNr", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobScheduledEClass, JobScheduled.class, "JobScheduled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobScheduled_Run(), theJobPackage.getRun(), null, "Run", null, 1, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobScheduled_ScheduledOn(), this.getJobEngine(), this.getJobEngine_JobScheduled(), "ScheduledOn", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_NotReadyToRun(), ecorePackage.getEBoolean(), "NotReadyToRun", null, 0, 1, JobScheduled.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_ReadyToRun(), ecorePackage.getEBoolean(), "ReadyToRun", null, 0, 1, JobScheduled.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_Running(), ecorePackage.getEBoolean(), "Running", null, 0, 1, JobScheduled.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_Returned(), ecorePackage.getEBoolean(), "Returned", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_Cancelled(), ecorePackage.getEBoolean(), "Cancelled", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_Failed(), ecorePackage.getEBoolean(), "Failed", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_Feedback(), ecorePackage.getEString(), "Feedback", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_SubmissionTime(), ecorePackage.getEDate(), "SubmissionTime", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_StartTime(), ecorePackage.getEDate(), "StartTime", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_EndTime(), ecorePackage.getEDate(), "EndTime", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_CancelTime(), ecorePackage.getEDate(), "CancelTime", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_Description(), ecorePackage.getEString(), "Description", null, 0, 1, JobScheduled.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_Status(), this.getJobStatus(), "Status", null, 0, 1, JobScheduled.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_CancelEnabledFeedback(), theJobPackage.getEnabledFeedback(), "CancelEnabledFeedback", null, 0, 1, JobScheduled.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getJobScheduled_Scheduler(), this.getJobScheduler(), this.getJobScheduler_Jobs(), "Scheduler", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_JobNr(), ecorePackage.getEInt(), "JobNr", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getJobScheduled__Cancel(), null, "cancel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobScheduled__SetRunning(), null, "setRunning", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobScheduled__SetReturn__ReturnFeedback(), null, "setReturn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJobPackage.getReturnFeedback(), "feedback", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobEngineEClass, JobEngine.class, "JobEngine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobEngine_JobScheduled(), this.getJobScheduled(), this.getJobScheduled_ScheduledOn(), "JobScheduled", null, 0, 1, JobEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngine_Name(), ecorePackage.getEString(), "Name", null, 0, 1, JobEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobEngine_Scheduler(), this.getJobScheduler(), this.getJobScheduler_Engines(), "Scheduler", null, 1, 1, JobEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngine_ExecuteEnabledFeedback(), theJobPackage.getEnabledFeedback(), "ExecuteEnabledFeedback", null, 0, 1, JobEngine.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getJobEngine__ExecuteJob__JobScheduled(), null, "executeJob", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobScheduled(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(jobStatusEEnum, JobStatus.class, "JobStatus");
		addEEnumLiteral(jobStatusEEnum, JobStatus.UNKNOWN);
		addEEnumLiteral(jobStatusEEnum, JobStatus.NOT_READY);
		addEEnumLiteral(jobStatusEEnum, JobStatus.WAITING);
		addEEnumLiteral(jobStatusEEnum, JobStatus.RUNNING);
		addEEnumLiteral(jobStatusEEnum, JobStatus.COMPLETE);
		addEEnumLiteral(jobStatusEEnum, JobStatus.FAILLED);

		// Create resource
		createResource(eNS_URI);
	}

} //JobClientPackageImpl
