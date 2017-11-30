/**
 */
package com.misc.common.moplaf.job.jobclient;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.job.jobclient.JobClientFactory
 * @model kind="package"
 * @generated
 */
public interface JobClientPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jobclient";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/job/client/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jbc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobClientPackage eINSTANCE = com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl <em>Job Remote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobRemote()
	 * @generated
	 */
	int JOB_REMOTE = 0;

	/**
	 * The feature id for the '<em><b>Submission ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__SUBMISSION_ID = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__RESULT = 1;

	/**
	 * The feature id for the '<em><b>Last Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__LAST_PROGRESS = 2;

	/**
	 * The feature id for the '<em><b>Last Progress Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__LAST_PROGRESS_WORK = 3;

	/**
	 * The feature id for the '<em><b>Last Progress Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__LAST_PROGRESS_TASK = 4;

	/**
	 * The feature id for the '<em><b>Job</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__JOB = 5;

	/**
	 * The feature id for the '<em><b>Jobremote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__JOBREMOTE = 6;

	/**
	 * The feature id for the '<em><b>Jobremotee Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__JOBREMOTEE_OPPOSITE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__PROGRESS = 9;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__START_TIME = 10;

	/**
	 * The number of structural features of the '<em>Job Remote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>On Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE___ON_PROGRESS__PROGRESSFEEDBACK = 0;

	/**
	 * The operation id for the '<em>On Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE___ON_RETURN__RETURNFEEDBACK = 1;

	/**
	 * The operation id for the '<em>Refresh Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE___REFRESH_PROGRESS = 2;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE___RUN__SUBMITTEDJOB = 3;

	/**
	 * The number of operations of the '<em>Job Remote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineProxyImpl <em>Job Engine Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineProxyImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobEngineProxy()
	 * @generated
	 */
	int JOB_ENGINE_PROXY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_PROXY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Job Engine Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_PROXY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Submit Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_PROXY___SUBMIT_JOB__JOBREMOTE = 0;

	/**
	 * The operation id for the '<em>Get Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_PROXY___GET_JOB__INT = 1;

	/**
	 * The number of operations of the '<em>Job Engine Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_PROXY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteResultImpl <em>Job Remote Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobRemoteResultImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobRemoteResult()
	 * @generated
	 */
	int JOB_REMOTE_RESULT = 2;

	/**
	 * The number of structural features of the '<em>Job Remote Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE_RESULT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Job Remote Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineOldImpl <em>Job Engine Old</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineOldImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobEngineOld()
	 * @generated
	 */
	int JOB_ENGINE_OLD = 3;

	/**
	 * The feature id for the '<em><b>Submitted Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OLD__SUBMITTED_JOBS = 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OLD__RUNNING = 1;

	/**
	 * The feature id for the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OLD__START_FEEDBACK = 2;

	/**
	 * The feature id for the '<em><b>Stop Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OLD__STOP_FEEDBACK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OLD__NAME = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OLD__LABEL = 5;

	/**
	 * The number of structural features of the '<em>Job Engine Old</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OLD_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OLD___START = 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OLD___STOP = 1;

	/**
	 * The operation id for the '<em>On Job Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OLD___ON_JOB_PROGRESS__SUBMITTEDJOB_PROGRESSFEEDBACK = 2;

	/**
	 * The number of operations of the '<em>Job Engine Old</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OLD_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.SubmittedJobImpl <em>Submitted Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.SubmittedJobImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getSubmittedJob()
	 * @generated
	 */
	int SUBMITTED_JOB = 4;

	/**
	 * The feature id for the '<em><b>Job</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITTED_JOB__JOB = 0;

	/**
	 * The feature id for the '<em><b>Job Engine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITTED_JOB__JOB_ENGINE = 1;

	/**
	 * The number of structural features of the '<em>Submitted Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITTED_JOB_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Submitted Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITTED_JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl <em>Job Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobEngine()
	 * @generated
	 */
	int JOB_ENGINE = 8;

	/**
	 * The feature id for the '<em><b>Job Scheduled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__JOB_SCHEDULED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__SCHEDULER = 2;

	/**
	 * The feature id for the '<em><b>Execute Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__EXECUTE_ENABLED_FEEDBACK = 3;

	/**
	 * The number of structural features of the '<em>Job Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Execute Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE___EXECUTE_JOB__JOBSCHEDULED = 0;

	/**
	 * The number of operations of the '<em>Job Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineInProcessImpl <em>Job Engine In Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineInProcessImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobEngineInProcess()
	 * @generated
	 */
	int JOB_ENGINE_IN_PROCESS = 5;

	/**
	 * The feature id for the '<em><b>Job Scheduled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__JOB_SCHEDULED = JOB_ENGINE__JOB_SCHEDULED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__NAME = JOB_ENGINE__NAME;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__SCHEDULER = JOB_ENGINE__SCHEDULER;

	/**
	 * The feature id for the '<em><b>Execute Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__EXECUTE_ENABLED_FEEDBACK = JOB_ENGINE__EXECUTE_ENABLED_FEEDBACK;

	/**
	 * The number of structural features of the '<em>Job Engine In Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS_FEATURE_COUNT = JOB_ENGINE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS___EXECUTE_JOB__JOBSCHEDULED = JOB_ENGINE___EXECUTE_JOB__JOBSCHEDULED;

	/**
	 * The number of operations of the '<em>Job Engine In Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS_OPERATION_COUNT = JOB_ENGINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl <em>Job Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobScheduler()
	 * @generated
	 */
	int JOB_SCHEDULER = 6;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__JOBS = 0;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__ENGINES = 1;

	/**
	 * The feature id for the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__START_FEEDBACK = 2;

	/**
	 * The feature id for the '<em><b>Stop Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__STOP_FEEDBACK = 3;

	/**
	 * The feature id for the '<em><b>Refresh Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__REFRESH_FEEDBACK = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__STATUS = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__NAME = 7;

	/**
	 * The feature id for the '<em><b>Refresh Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__REFRESH_RATE = 8;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__RUNNING = 9;

	/**
	 * The feature id for the '<em><b>Nr Jobs Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__NR_JOBS_WAITING = 10;

	/**
	 * The feature id for the '<em><b>Nr Jobs Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__NR_JOBS_RUNNING = 11;

	/**
	 * The feature id for the '<em><b>Nr Jobs Failed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__NR_JOBS_FAILED = 12;

	/**
	 * The feature id for the '<em><b>Nr Jobs Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__NR_JOBS_CANCELLED = 13;

	/**
	 * The number of structural features of the '<em>Job Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_FEATURE_COUNT = 14;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER___START = 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER___STOP = 1;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER___REFRESH = 2;

	/**
	 * The operation id for the '<em>Submit Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER___SUBMIT_RUN__RUN = 3;

	/**
	 * The number of operations of the '<em>Job Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl <em>Job Scheduled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobScheduled()
	 * @generated
	 */
	int JOB_SCHEDULED = 7;

	/**
	 * The feature id for the '<em><b>Run</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__RUN = 0;

	/**
	 * The feature id for the '<em><b>Scheduled On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__SCHEDULED_ON = 1;

	/**
	 * The feature id for the '<em><b>Not Ready To Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__NOT_READY_TO_RUN = 2;

	/**
	 * The feature id for the '<em><b>Ready To Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__READY_TO_RUN = 3;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__RUNNING = 4;

	/**
	 * The feature id for the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__RETURNED = 5;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__CANCELLED = 6;

	/**
	 * The feature id for the '<em><b>Failed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__FAILED = 7;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__FEEDBACK = 8;

	/**
	 * The feature id for the '<em><b>Submission Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__SUBMISSION_TIME = 9;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__START_TIME = 10;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__END_TIME = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__DESCRIPTION = 12;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__STATUS = 13;

	/**
	 * The feature id for the '<em><b>Cancel Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__CANCEL_TIME = 14;

	/**
	 * The feature id for the '<em><b>Cancel Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__CANCEL_ENABLED_FEEDBACK = 15;

	/**
	 * The number of structural features of the '<em>Job Scheduled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED_FEATURE_COUNT = 16;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED___CANCEL = 0;

	/**
	 * The operation id for the '<em>Set Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED___SET_RUNNING = 1;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED___SET_RETURN__RETURNFEEDBACK = 2;

	/**
	 * The number of operations of the '<em>Job Scheduled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED_OPERATION_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.JobRemote <em>Job Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Remote</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote
	 * @generated
	 */
	EClass getJobRemote();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getSubmissionID <em>Submission ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submission ID</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getSubmissionID()
	 * @see #getJobRemote()
	 * @generated
	 */
	EAttribute getJobRemote_SubmissionID();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getResult()
	 * @see #getJobRemote()
	 * @generated
	 */
	EReference getJobRemote_Result();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgress <em>Last Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Progress</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgress()
	 * @see #getJobRemote()
	 * @generated
	 */
	EAttribute getJobRemote_LastProgress();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgressWork <em>Last Progress Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Progress Work</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgressWork()
	 * @see #getJobRemote()
	 * @generated
	 */
	EAttribute getJobRemote_LastProgressWork();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgressTask <em>Last Progress Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Progress Task</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgressTask()
	 * @see #getJobRemote()
	 * @generated
	 */
	EAttribute getJobRemote_LastProgressTask();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Job</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getJob()
	 * @see #getJobRemote()
	 * @generated
	 */
	EReference getJobRemote_Job();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getJobremote <em>Jobremote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jobremote</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getJobremote()
	 * @see #getJobRemote()
	 * @generated
	 */
	EReference getJobRemote_Jobremote();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getJobremoteeOpposite <em>Jobremotee Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jobremotee Opposite</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getJobremoteeOpposite()
	 * @see #getJobRemote()
	 * @generated
	 */
	EReference getJobRemote_JobremoteeOpposite();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getName()
	 * @see #getJobRemote()
	 * @generated
	 */
	EAttribute getJobRemote_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getProgress <em>Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getProgress()
	 * @see #getJobRemote()
	 * @generated
	 */
	EAttribute getJobRemote_Progress();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getStartTime()
	 * @see #getJobRemote()
	 * @generated
	 */
	EAttribute getJobRemote_StartTime();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#onProgress(com.misc.common.moplaf.job.ProgressFeedback) <em>On Progress</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Progress</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#onProgress(com.misc.common.moplaf.job.ProgressFeedback)
	 * @generated
	 */
	EOperation getJobRemote__OnProgress__ProgressFeedback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#onReturn(com.misc.common.moplaf.common.ReturnFeedback) <em>On Return</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Return</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#onReturn(com.misc.common.moplaf.common.ReturnFeedback)
	 * @generated
	 */
	EOperation getJobRemote__OnReturn__ReturnFeedback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#refreshProgress() <em>Refresh Progress</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Progress</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#refreshProgress()
	 * @generated
	 */
	EOperation getJobRemote__RefreshProgress();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#run(com.misc.common.moplaf.job.jobclient.SubmittedJob) <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#run(com.misc.common.moplaf.job.jobclient.SubmittedJob)
	 * @generated
	 */
	EOperation getJobRemote__Run__SubmittedJob();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.JobEngineProxy <em>Job Engine Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Engine Proxy</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineProxy
	 * @generated
	 */
	EClass getJobEngineProxy();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobEngineProxy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineProxy#getName()
	 * @see #getJobEngineProxy()
	 * @generated
	 */
	EAttribute getJobEngineProxy_Name();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobEngineProxy#submitJob(com.misc.common.moplaf.job.jobclient.JobRemote) <em>Submit Job</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Submit Job</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineProxy#submitJob(com.misc.common.moplaf.job.jobclient.JobRemote)
	 * @generated
	 */
	EOperation getJobEngineProxy__SubmitJob__JobRemote();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobEngineProxy#getJob(int) <em>Get Job</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Job</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineProxy#getJob(int)
	 * @generated
	 */
	EOperation getJobEngineProxy__GetJob__int();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.JobRemoteResult <em>Job Remote Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Remote Result</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemoteResult
	 * @generated
	 */
	EClass getJobRemoteResult();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.JobEngineOld <em>Job Engine Old</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Engine Old</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineOld
	 * @generated
	 */
	EClass getJobEngineOld();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#getSubmittedJobs <em>Submitted Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submitted Jobs</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineOld#getSubmittedJobs()
	 * @see #getJobEngineOld()
	 * @generated
	 */
	EReference getJobEngineOld_SubmittedJobs();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineOld#isRunning()
	 * @see #getJobEngineOld()
	 * @generated
	 */
	EAttribute getJobEngineOld_Running();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#getStartFeedback <em>Start Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineOld#getStartFeedback()
	 * @see #getJobEngineOld()
	 * @generated
	 */
	EAttribute getJobEngineOld_StartFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#getStopFeedback <em>Stop Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineOld#getStopFeedback()
	 * @see #getJobEngineOld()
	 * @generated
	 */
	EAttribute getJobEngineOld_StopFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineOld#getName()
	 * @see #getJobEngineOld()
	 * @generated
	 */
	EAttribute getJobEngineOld_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineOld#getLabel()
	 * @see #getJobEngineOld()
	 * @generated
	 */
	EAttribute getJobEngineOld_Label();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineOld#start()
	 * @generated
	 */
	EOperation getJobEngineOld__Start();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineOld#stop()
	 * @generated
	 */
	EOperation getJobEngineOld__Stop();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobEngineOld#onJobProgress(com.misc.common.moplaf.job.jobclient.SubmittedJob, com.misc.common.moplaf.job.ProgressFeedback) <em>On Job Progress</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Job Progress</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineOld#onJobProgress(com.misc.common.moplaf.job.jobclient.SubmittedJob, com.misc.common.moplaf.job.ProgressFeedback)
	 * @generated
	 */
	EOperation getJobEngineOld__OnJobProgress__SubmittedJob_ProgressFeedback();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.SubmittedJob <em>Submitted Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submitted Job</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.SubmittedJob
	 * @generated
	 */
	EClass getSubmittedJob();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.job.jobclient.SubmittedJob#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Job</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.SubmittedJob#getJob()
	 * @see #getSubmittedJob()
	 * @generated
	 */
	EReference getSubmittedJob_Job();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.job.jobclient.SubmittedJob#getJobEngine <em>Job Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Job Engine</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.SubmittedJob#getJobEngine()
	 * @see #getSubmittedJob()
	 * @generated
	 */
	EReference getSubmittedJob_JobEngine();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.JobEngineInProcess <em>Job Engine In Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Engine In Process</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineInProcess
	 * @generated
	 */
	EClass getJobEngineInProcess();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.JobScheduler <em>Job Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Scheduler</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler
	 * @generated
	 */
	EClass getJobScheduler();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getJobs()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EReference getJobScheduler_Jobs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getEngines <em>Engines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Engines</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getEngines()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EReference getJobScheduler_Engines();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getStartFeedback <em>Start Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getStartFeedback()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_StartFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getStopFeedback <em>Stop Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getStopFeedback()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_StopFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#isRunning()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_Running();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getDescription()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getNrJobsWaiting <em>Nr Jobs Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Jobs Waiting</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getNrJobsWaiting()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_NrJobsWaiting();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getNrJobsRunning <em>Nr Jobs Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Jobs Running</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getNrJobsRunning()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_NrJobsRunning();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getNrJobsFailed <em>Nr Jobs Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Jobs Failed</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getNrJobsFailed()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_NrJobsFailed();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getNrJobsCancelled <em>Nr Jobs Cancelled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Jobs Cancelled</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getNrJobsCancelled()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_NrJobsCancelled();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getRefreshFeedback <em>Refresh Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getRefreshFeedback()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_RefreshFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getName()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getRefreshRate <em>Refresh Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Rate</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getRefreshRate()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_RefreshRate();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getStatus()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_Status();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#start()
	 * @generated
	 */
	EOperation getJobScheduler__Start();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#stop()
	 * @generated
	 */
	EOperation getJobScheduler__Stop();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#refresh()
	 * @generated
	 */
	EOperation getJobScheduler__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#submitRun(com.misc.common.moplaf.job.Run) <em>Submit Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Submit Run</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#submitRun(com.misc.common.moplaf.job.Run)
	 * @generated
	 */
	EOperation getJobScheduler__SubmitRun__Run();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.JobScheduled <em>Job Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Scheduled</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled
	 * @generated
	 */
	EClass getJobScheduled();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Run</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getRun()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EReference getJobScheduled_Run();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduledOn <em>Scheduled On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduled On</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduledOn()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EReference getJobScheduled_ScheduledOn();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isNotReadyToRun <em>Not Ready To Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Ready To Run</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#isNotReadyToRun()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_NotReadyToRun();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isReadyToRun <em>Ready To Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ready To Run</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#isReadyToRun()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_ReadyToRun();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#isRunning()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_Running();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isReturned <em>Returned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Returned</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#isReturned()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_Returned();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isCancelled <em>Cancelled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancelled</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#isCancelled()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_Cancelled();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#isFailed <em>Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failed</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#isFailed()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_Failed();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getFeedback()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_Feedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getSubmissionTime <em>Submission Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submission Time</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getSubmissionTime()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_SubmissionTime();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getStartTime()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getEndTime()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getDescription()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getStatus()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_Status();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getCancelTime <em>Cancel Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Time</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getCancelTime()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_CancelTime();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getCancelEnabledFeedback <em>Cancel Enabled Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Enabled Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getCancelEnabledFeedback()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_CancelEnabledFeedback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#cancel() <em>Cancel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#cancel()
	 * @generated
	 */
	EOperation getJobScheduled__Cancel();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#setRunning() <em>Set Running</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Running</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#setRunning()
	 * @generated
	 */
	EOperation getJobScheduled__SetRunning();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#setReturn(com.misc.common.moplaf.common.ReturnFeedback) <em>Set Return</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Return</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#setReturn(com.misc.common.moplaf.common.ReturnFeedback)
	 * @generated
	 */
	EOperation getJobScheduled__SetReturn__ReturnFeedback();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.JobEngine <em>Job Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Engine</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine
	 * @generated
	 */
	EClass getJobEngine();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getJobScheduled <em>Job Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job Scheduled</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#getJobScheduled()
	 * @see #getJobEngine()
	 * @generated
	 */
	EReference getJobEngine_JobScheduled();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#getName()
	 * @see #getJobEngine()
	 * @generated
	 */
	EAttribute getJobEngine_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scheduler</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#getScheduler()
	 * @see #getJobEngine()
	 * @generated
	 */
	EReference getJobEngine_Scheduler();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getExecuteEnabledFeedback <em>Execute Enabled Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execute Enabled Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#getExecuteEnabledFeedback()
	 * @see #getJobEngine()
	 * @generated
	 */
	EAttribute getJobEngine_ExecuteEnabledFeedback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobEngine#executeJob(com.misc.common.moplaf.job.jobclient.JobScheduled) <em>Execute Job</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute Job</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#executeJob(com.misc.common.moplaf.job.jobclient.JobScheduled)
	 * @generated
	 */
	EOperation getJobEngine__ExecuteJob__JobScheduled();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JobClientFactory getJobClientFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl <em>Job Remote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobRemote()
		 * @generated
		 */
		EClass JOB_REMOTE = eINSTANCE.getJobRemote();

		/**
		 * The meta object literal for the '<em><b>Submission ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REMOTE__SUBMISSION_ID = eINSTANCE.getJobRemote_SubmissionID();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_REMOTE__RESULT = eINSTANCE.getJobRemote_Result();

		/**
		 * The meta object literal for the '<em><b>Last Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REMOTE__LAST_PROGRESS = eINSTANCE.getJobRemote_LastProgress();

		/**
		 * The meta object literal for the '<em><b>Last Progress Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REMOTE__LAST_PROGRESS_WORK = eINSTANCE.getJobRemote_LastProgressWork();

		/**
		 * The meta object literal for the '<em><b>Last Progress Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REMOTE__LAST_PROGRESS_TASK = eINSTANCE.getJobRemote_LastProgressTask();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_REMOTE__JOB = eINSTANCE.getJobRemote_Job();

		/**
		 * The meta object literal for the '<em><b>Jobremote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_REMOTE__JOBREMOTE = eINSTANCE.getJobRemote_Jobremote();

		/**
		 * The meta object literal for the '<em><b>Jobremotee Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_REMOTE__JOBREMOTEE_OPPOSITE = eINSTANCE.getJobRemote_JobremoteeOpposite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REMOTE__NAME = eINSTANCE.getJobRemote_Name();

		/**
		 * The meta object literal for the '<em><b>Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REMOTE__PROGRESS = eINSTANCE.getJobRemote_Progress();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REMOTE__START_TIME = eINSTANCE.getJobRemote_StartTime();

		/**
		 * The meta object literal for the '<em><b>On Progress</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_REMOTE___ON_PROGRESS__PROGRESSFEEDBACK = eINSTANCE.getJobRemote__OnProgress__ProgressFeedback();

		/**
		 * The meta object literal for the '<em><b>On Return</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_REMOTE___ON_RETURN__RETURNFEEDBACK = eINSTANCE.getJobRemote__OnReturn__ReturnFeedback();

		/**
		 * The meta object literal for the '<em><b>Refresh Progress</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_REMOTE___REFRESH_PROGRESS = eINSTANCE.getJobRemote__RefreshProgress();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_REMOTE___RUN__SUBMITTEDJOB = eINSTANCE.getJobRemote__Run__SubmittedJob();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineProxyImpl <em>Job Engine Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineProxyImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobEngineProxy()
		 * @generated
		 */
		EClass JOB_ENGINE_PROXY = eINSTANCE.getJobEngineProxy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE_PROXY__NAME = eINSTANCE.getJobEngineProxy_Name();

		/**
		 * The meta object literal for the '<em><b>Submit Job</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_ENGINE_PROXY___SUBMIT_JOB__JOBREMOTE = eINSTANCE.getJobEngineProxy__SubmitJob__JobRemote();

		/**
		 * The meta object literal for the '<em><b>Get Job</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_ENGINE_PROXY___GET_JOB__INT = eINSTANCE.getJobEngineProxy__GetJob__int();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteResultImpl <em>Job Remote Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobRemoteResultImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobRemoteResult()
		 * @generated
		 */
		EClass JOB_REMOTE_RESULT = eINSTANCE.getJobRemoteResult();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineOldImpl <em>Job Engine Old</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineOldImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobEngineOld()
		 * @generated
		 */
		EClass JOB_ENGINE_OLD = eINSTANCE.getJobEngineOld();

		/**
		 * The meta object literal for the '<em><b>Submitted Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_ENGINE_OLD__SUBMITTED_JOBS = eINSTANCE.getJobEngineOld_SubmittedJobs();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE_OLD__RUNNING = eINSTANCE.getJobEngineOld_Running();

		/**
		 * The meta object literal for the '<em><b>Start Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE_OLD__START_FEEDBACK = eINSTANCE.getJobEngineOld_StartFeedback();

		/**
		 * The meta object literal for the '<em><b>Stop Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE_OLD__STOP_FEEDBACK = eINSTANCE.getJobEngineOld_StopFeedback();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE_OLD__NAME = eINSTANCE.getJobEngineOld_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE_OLD__LABEL = eINSTANCE.getJobEngineOld_Label();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_ENGINE_OLD___START = eINSTANCE.getJobEngineOld__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_ENGINE_OLD___STOP = eINSTANCE.getJobEngineOld__Stop();

		/**
		 * The meta object literal for the '<em><b>On Job Progress</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_ENGINE_OLD___ON_JOB_PROGRESS__SUBMITTEDJOB_PROGRESSFEEDBACK = eINSTANCE.getJobEngineOld__OnJobProgress__SubmittedJob_ProgressFeedback();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.SubmittedJobImpl <em>Submitted Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.SubmittedJobImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getSubmittedJob()
		 * @generated
		 */
		EClass SUBMITTED_JOB = eINSTANCE.getSubmittedJob();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMITTED_JOB__JOB = eINSTANCE.getSubmittedJob_Job();

		/**
		 * The meta object literal for the '<em><b>Job Engine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMITTED_JOB__JOB_ENGINE = eINSTANCE.getSubmittedJob_JobEngine();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineInProcessImpl <em>Job Engine In Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineInProcessImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobEngineInProcess()
		 * @generated
		 */
		EClass JOB_ENGINE_IN_PROCESS = eINSTANCE.getJobEngineInProcess();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl <em>Job Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobScheduler()
		 * @generated
		 */
		EClass JOB_SCHEDULER = eINSTANCE.getJobScheduler();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SCHEDULER__JOBS = eINSTANCE.getJobScheduler_Jobs();

		/**
		 * The meta object literal for the '<em><b>Engines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SCHEDULER__ENGINES = eINSTANCE.getJobScheduler_Engines();

		/**
		 * The meta object literal for the '<em><b>Start Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__START_FEEDBACK = eINSTANCE.getJobScheduler_StartFeedback();

		/**
		 * The meta object literal for the '<em><b>Stop Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__STOP_FEEDBACK = eINSTANCE.getJobScheduler_StopFeedback();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__RUNNING = eINSTANCE.getJobScheduler_Running();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__DESCRIPTION = eINSTANCE.getJobScheduler_Description();

		/**
		 * The meta object literal for the '<em><b>Nr Jobs Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__NR_JOBS_WAITING = eINSTANCE.getJobScheduler_NrJobsWaiting();

		/**
		 * The meta object literal for the '<em><b>Nr Jobs Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__NR_JOBS_RUNNING = eINSTANCE.getJobScheduler_NrJobsRunning();

		/**
		 * The meta object literal for the '<em><b>Nr Jobs Failed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__NR_JOBS_FAILED = eINSTANCE.getJobScheduler_NrJobsFailed();

		/**
		 * The meta object literal for the '<em><b>Nr Jobs Cancelled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__NR_JOBS_CANCELLED = eINSTANCE.getJobScheduler_NrJobsCancelled();

		/**
		 * The meta object literal for the '<em><b>Refresh Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__REFRESH_FEEDBACK = eINSTANCE.getJobScheduler_RefreshFeedback();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__NAME = eINSTANCE.getJobScheduler_Name();

		/**
		 * The meta object literal for the '<em><b>Refresh Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__REFRESH_RATE = eINSTANCE.getJobScheduler_RefreshRate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__STATUS = eINSTANCE.getJobScheduler_Status();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SCHEDULER___START = eINSTANCE.getJobScheduler__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SCHEDULER___STOP = eINSTANCE.getJobScheduler__Stop();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SCHEDULER___REFRESH = eINSTANCE.getJobScheduler__Refresh();

		/**
		 * The meta object literal for the '<em><b>Submit Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SCHEDULER___SUBMIT_RUN__RUN = eINSTANCE.getJobScheduler__SubmitRun__Run();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl <em>Job Scheduled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobScheduled()
		 * @generated
		 */
		EClass JOB_SCHEDULED = eINSTANCE.getJobScheduled();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SCHEDULED__RUN = eINSTANCE.getJobScheduled_Run();

		/**
		 * The meta object literal for the '<em><b>Scheduled On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SCHEDULED__SCHEDULED_ON = eINSTANCE.getJobScheduled_ScheduledOn();

		/**
		 * The meta object literal for the '<em><b>Not Ready To Run</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__NOT_READY_TO_RUN = eINSTANCE.getJobScheduled_NotReadyToRun();

		/**
		 * The meta object literal for the '<em><b>Ready To Run</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__READY_TO_RUN = eINSTANCE.getJobScheduled_ReadyToRun();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__RUNNING = eINSTANCE.getJobScheduled_Running();

		/**
		 * The meta object literal for the '<em><b>Returned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__RETURNED = eINSTANCE.getJobScheduled_Returned();

		/**
		 * The meta object literal for the '<em><b>Cancelled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__CANCELLED = eINSTANCE.getJobScheduled_Cancelled();

		/**
		 * The meta object literal for the '<em><b>Failed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__FAILED = eINSTANCE.getJobScheduled_Failed();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__FEEDBACK = eINSTANCE.getJobScheduled_Feedback();

		/**
		 * The meta object literal for the '<em><b>Submission Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__SUBMISSION_TIME = eINSTANCE.getJobScheduled_SubmissionTime();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__START_TIME = eINSTANCE.getJobScheduled_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__END_TIME = eINSTANCE.getJobScheduled_EndTime();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__DESCRIPTION = eINSTANCE.getJobScheduled_Description();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__STATUS = eINSTANCE.getJobScheduled_Status();

		/**
		 * The meta object literal for the '<em><b>Cancel Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__CANCEL_TIME = eINSTANCE.getJobScheduled_CancelTime();

		/**
		 * The meta object literal for the '<em><b>Cancel Enabled Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__CANCEL_ENABLED_FEEDBACK = eINSTANCE.getJobScheduled_CancelEnabledFeedback();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SCHEDULED___CANCEL = eINSTANCE.getJobScheduled__Cancel();

		/**
		 * The meta object literal for the '<em><b>Set Running</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SCHEDULED___SET_RUNNING = eINSTANCE.getJobScheduled__SetRunning();

		/**
		 * The meta object literal for the '<em><b>Set Return</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SCHEDULED___SET_RETURN__RETURNFEEDBACK = eINSTANCE.getJobScheduled__SetReturn__ReturnFeedback();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl <em>Job Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobEngine()
		 * @generated
		 */
		EClass JOB_ENGINE = eINSTANCE.getJobEngine();

		/**
		 * The meta object literal for the '<em><b>Job Scheduled</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_ENGINE__JOB_SCHEDULED = eINSTANCE.getJobEngine_JobScheduled();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE__NAME = eINSTANCE.getJobEngine_Name();

		/**
		 * The meta object literal for the '<em><b>Scheduler</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_ENGINE__SCHEDULER = eINSTANCE.getJobEngine_Scheduler();

		/**
		 * The meta object literal for the '<em><b>Execute Enabled Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE__EXECUTE_ENABLED_FEEDBACK = eINSTANCE.getJobEngine_ExecuteEnabledFeedback();

		/**
		 * The meta object literal for the '<em><b>Execute Job</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_ENGINE___EXECUTE_JOB__JOBSCHEDULED = eINSTANCE.getJobEngine__ExecuteJob__JobScheduled();

	}

} //JobClientPackage
