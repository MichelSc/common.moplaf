/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.job.JobPackage;

import com.misc.common.moplaf.job.jobclient.JobClientFactory;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobEngine;
import com.misc.common.moplaf.job.jobclient.JobEngineInProcess;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
import com.misc.common.moplaf.job.jobclient.JobSchedulerService;
import com.misc.common.moplaf.job.jobclient.JobSource;
import com.misc.common.moplaf.job.jobclient.JobStatus;
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
	private EClass jobSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobSchedulerServiceEClass = null;

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
	public EAttribute getJobScheduler_CurrentScheduleNr() {
		return (EAttribute)jobSchedulerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobScheduler_Services() {
		return (EReference)jobSchedulerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobScheduler_Sources() {
		return (EReference)jobSchedulerEClass.getEStructuralFeatures().get(18);
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
	public EOperation getJobScheduler__SubmitRun__Run_boolean() {
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
	public EOperation getJobScheduler__MakeNewScheduleNr() {
		return jobSchedulerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobScheduler__Flush() {
		return jobSchedulerEClass.getEOperations().get(6);
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
	public EAttribute getJobScheduled_ExecuteNr() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobScheduled_OwnedRun() {
		return (EReference)jobScheduledEClass.getEStructuralFeatures().get(20);
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
	public EAttribute getJobScheduled_ScheduleNr() {
		return (EAttribute)jobScheduledEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobScheduled_Source() {
		return (EReference)jobScheduledEClass.getEStructuralFeatures().get(18);
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
	public EReference getJobEngine_JobsScheduled() {
		return (EReference)jobEngineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngine_ExecuteEnabledFeedback() {
		return (EAttribute)jobEngineEClass.getEStructuralFeatures().get(1);
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
	public EOperation getJobEngine__RefreshJobStatus__JobScheduled() {
		return jobEngineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobSource() {
		return jobSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobSource_JobsScheduled() {
		return (EReference)jobSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobSource__Refresh() {
		return jobSourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobSource__OnJobRunning__JobScheduled() {
		return jobSourceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobSource__OnJobReturned__JobScheduled_ReturnFeedback() {
		return jobSourceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobSchedulerService() {
		return jobSchedulerServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobSchedulerService_StartFeedback() {
		return (EAttribute)jobSchedulerServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobSchedulerService_StopFeedback() {
		return (EAttribute)jobSchedulerServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobSchedulerService_AutoStartStop() {
		return (EAttribute)jobSchedulerServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobSchedulerService_Name() {
		return (EAttribute)jobSchedulerServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobSchedulerService_Description() {
		return (EAttribute)jobSchedulerServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobSchedulerService_Status() {
		return (EAttribute)jobSchedulerServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobSchedulerService_Running() {
		return (EAttribute)jobSchedulerServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobSchedulerService_Scheduler() {
		return (EReference)jobSchedulerServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobSchedulerService__Start() {
		return jobSchedulerServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobSchedulerService__Stop() {
		return jobSchedulerServiceEClass.getEOperations().get(1);
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
		createEAttribute(jobSchedulerEClass, JOB_SCHEDULER__CURRENT_SCHEDULE_NR);
		createEReference(jobSchedulerEClass, JOB_SCHEDULER__SERVICES);
		createEReference(jobSchedulerEClass, JOB_SCHEDULER__SOURCES);
		createEOperation(jobSchedulerEClass, JOB_SCHEDULER___START);
		createEOperation(jobSchedulerEClass, JOB_SCHEDULER___STOP);
		createEOperation(jobSchedulerEClass, JOB_SCHEDULER___REFRESH);
		createEOperation(jobSchedulerEClass, JOB_SCHEDULER___SUBMIT_RUN__RUN_BOOLEAN);
		createEOperation(jobSchedulerEClass, JOB_SCHEDULER___SET_LAST_FEEDBACK);
		createEOperation(jobSchedulerEClass, JOB_SCHEDULER___MAKE_NEW_SCHEDULE_NR);
		createEOperation(jobSchedulerEClass, JOB_SCHEDULER___FLUSH);

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
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__SCHEDULE_NR);
		createEReference(jobScheduledEClass, JOB_SCHEDULED__SOURCE);
		createEAttribute(jobScheduledEClass, JOB_SCHEDULED__EXECUTE_NR);
		createEReference(jobScheduledEClass, JOB_SCHEDULED__OWNED_RUN);
		createEOperation(jobScheduledEClass, JOB_SCHEDULED___CANCEL);
		createEOperation(jobScheduledEClass, JOB_SCHEDULED___SET_RUNNING);
		createEOperation(jobScheduledEClass, JOB_SCHEDULED___SET_RETURN__RETURNFEEDBACK);

		jobEngineEClass = createEClass(JOB_ENGINE);
		createEReference(jobEngineEClass, JOB_ENGINE__JOBS_SCHEDULED);
		createEAttribute(jobEngineEClass, JOB_ENGINE__EXECUTE_ENABLED_FEEDBACK);
		createEOperation(jobEngineEClass, JOB_ENGINE___EXECUTE_JOB__JOBSCHEDULED);
		createEOperation(jobEngineEClass, JOB_ENGINE___REFRESH_JOB_STATUS__JOBSCHEDULED);

		jobSourceEClass = createEClass(JOB_SOURCE);
		createEReference(jobSourceEClass, JOB_SOURCE__JOBS_SCHEDULED);
		createEOperation(jobSourceEClass, JOB_SOURCE___REFRESH);
		createEOperation(jobSourceEClass, JOB_SOURCE___ON_JOB_RUNNING__JOBSCHEDULED);
		createEOperation(jobSourceEClass, JOB_SOURCE___ON_JOB_RETURNED__JOBSCHEDULED_RETURNFEEDBACK);

		jobSchedulerServiceEClass = createEClass(JOB_SCHEDULER_SERVICE);
		createEAttribute(jobSchedulerServiceEClass, JOB_SCHEDULER_SERVICE__START_FEEDBACK);
		createEAttribute(jobSchedulerServiceEClass, JOB_SCHEDULER_SERVICE__STOP_FEEDBACK);
		createEAttribute(jobSchedulerServiceEClass, JOB_SCHEDULER_SERVICE__AUTO_START_STOP);
		createEAttribute(jobSchedulerServiceEClass, JOB_SCHEDULER_SERVICE__NAME);
		createEAttribute(jobSchedulerServiceEClass, JOB_SCHEDULER_SERVICE__DESCRIPTION);
		createEAttribute(jobSchedulerServiceEClass, JOB_SCHEDULER_SERVICE__STATUS);
		createEAttribute(jobSchedulerServiceEClass, JOB_SCHEDULER_SERVICE__RUNNING);
		createEReference(jobSchedulerServiceEClass, JOB_SCHEDULER_SERVICE__SCHEDULER);
		createEOperation(jobSchedulerServiceEClass, JOB_SCHEDULER_SERVICE___START);
		createEOperation(jobSchedulerServiceEClass, JOB_SCHEDULER_SERVICE___STOP);

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
		jobEngineEClass.getESuperTypes().add(this.getJobSchedulerService());
		jobSourceEClass.getESuperTypes().add(this.getJobSchedulerService());

		// Initialize classes, features, and operations; add parameters
		initEClass(jobEngineInProcessEClass, JobEngineInProcess.class, "JobEngineInProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jobSchedulerEClass, JobScheduler.class, "JobScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobScheduler_Jobs(), this.getJobScheduled(), this.getJobScheduled_Scheduler(), "Jobs", null, 0, -1, JobScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobScheduler_Engines(), this.getJobEngine(), null, "Engines", null, 0, -1, JobScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getJobScheduler_CurrentScheduleNr(), ecorePackage.getEInt(), "CurrentScheduleNr", null, 0, 1, JobScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobScheduler_Services(), this.getJobSchedulerService(), null, "Services", null, 0, -1, JobScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getJobScheduler_Sources(), this.getJobSource(), null, "Sources", null, 0, -1, JobScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getJobScheduler__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobScheduler__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobScheduler__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getJobScheduler__SubmitRun__Run_boolean(), this.getJobScheduled(), "submitRun", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJobPackage.getRun(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "takes_ownership", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobScheduler__SetLastFeedback(), null, "setLastFeedback", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobScheduler__MakeNewScheduleNr(), ecorePackage.getEInt(), "makeNewScheduleNr", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobScheduler__Flush(), null, "flush", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobScheduledEClass, JobScheduled.class, "JobScheduled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobScheduled_Run(), theJobPackage.getRun(), null, "Run", null, 1, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobScheduled_ScheduledOn(), this.getJobEngine(), this.getJobEngine_JobsScheduled(), "ScheduledOn", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getJobScheduled_Scheduler(), this.getJobScheduler(), this.getJobScheduler_Jobs(), "Scheduler", null, 1, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_ScheduleNr(), ecorePackage.getEInt(), "ScheduleNr", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobScheduled_Source(), this.getJobSource(), this.getJobSource_JobsScheduled(), "Source", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobScheduled_ExecuteNr(), ecorePackage.getEInt(), "ExecuteNr", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobScheduled_OwnedRun(), theJobPackage.getRun(), null, "OwnedRun", null, 0, 1, JobScheduled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getJobScheduled__Cancel(), null, "cancel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobScheduled__SetRunning(), null, "setRunning", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobScheduled__SetReturn__ReturnFeedback(), null, "setReturn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJobPackage.getReturnFeedback(), "feedback", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobEngineEClass, JobEngine.class, "JobEngine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobEngine_JobsScheduled(), this.getJobScheduled(), this.getJobScheduled_ScheduledOn(), "JobsScheduled", null, 0, -1, JobEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngine_ExecuteEnabledFeedback(), theJobPackage.getEnabledFeedback(), "ExecuteEnabledFeedback", null, 0, 1, JobEngine.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getJobEngine__ExecuteJob__JobScheduled(), null, "executeJob", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobScheduled(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobEngine__RefreshJobStatus__JobScheduled(), null, "refreshJobStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobScheduled(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobSourceEClass, JobSource.class, "JobSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobSource_JobsScheduled(), this.getJobScheduled(), this.getJobScheduled_Source(), "JobsScheduled", null, 0, -1, JobSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getJobSource__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobSource__OnJobRunning__JobScheduled(), null, "onJobRunning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobScheduled(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobSource__OnJobReturned__JobScheduled_ReturnFeedback(), null, "onJobReturned", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobScheduled(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJobPackage.getReturnFeedback(), "feedback", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobSchedulerServiceEClass, JobSchedulerService.class, "JobSchedulerService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobSchedulerService_StartFeedback(), theJobPackage.getEnabledFeedback(), "StartFeedback", null, 0, 1, JobSchedulerService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobSchedulerService_StopFeedback(), theJobPackage.getEnabledFeedback(), "StopFeedback", null, 0, 1, JobSchedulerService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobSchedulerService_AutoStartStop(), ecorePackage.getEBoolean(), "AutoStartStop", null, 0, 1, JobSchedulerService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobSchedulerService_Name(), ecorePackage.getEString(), "Name", null, 0, 1, JobSchedulerService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobSchedulerService_Description(), ecorePackage.getEString(), "Description", null, 0, 1, JobSchedulerService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobSchedulerService_Status(), ecorePackage.getEString(), "Status", null, 0, 1, JobSchedulerService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobSchedulerService_Running(), ecorePackage.getEBoolean(), "Running", "false", 0, 1, JobSchedulerService.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobSchedulerService_Scheduler(), this.getJobScheduler(), null, "Scheduler", null, 0, 1, JobSchedulerService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getJobSchedulerService__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobSchedulerService__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(jobStatusEEnum, JobStatus.class, "JobStatus");
		addEEnumLiteral(jobStatusEEnum, JobStatus.UNKNOWN);
		addEEnumLiteral(jobStatusEEnum, JobStatus.NOT_READY);
		addEEnumLiteral(jobStatusEEnum, JobStatus.WAITING);
		addEEnumLiteral(jobStatusEEnum, JobStatus.SCHEDULED);
		addEEnumLiteral(jobStatusEEnum, JobStatus.RUNNING);
		addEEnumLiteral(jobStatusEEnum, JobStatus.COMPLETE);
		addEEnumLiteral(jobStatusEEnum, JobStatus.FAILLED);

		// Create resource
		createResource(eNS_URI);
	}

} //JobClientPackageImpl
