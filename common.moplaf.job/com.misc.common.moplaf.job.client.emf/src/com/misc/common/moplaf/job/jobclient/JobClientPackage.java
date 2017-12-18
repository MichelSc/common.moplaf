/**
 */
package com.misc.common.moplaf.job.jobclient;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl <em>Job Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobEngine()
	 * @generated
	 */
	int JOB_ENGINE = 3;

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
	int JOB_ENGINE_IN_PROCESS = 0;

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
	int JOB_SCHEDULER = 1;

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
	 * The feature id for the '<em><b>Last Refresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__LAST_REFRESH = 14;

	/**
	 * The feature id for the '<em><b>Last Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__LAST_FEEDBACK = 15;

	/**
	 * The feature id for the '<em><b>Current Job Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__CURRENT_JOB_NR = 16;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__SOURCES = 17;

	/**
	 * The number of structural features of the '<em>Job Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_FEATURE_COUNT = 18;

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
	 * The operation id for the '<em>Set Last Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER___SET_LAST_FEEDBACK = 4;

	/**
	 * The operation id for the '<em>Make New Job Nr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER___MAKE_NEW_JOB_NR = 5;

	/**
	 * The number of operations of the '<em>Job Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl <em>Job Scheduled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobScheduled()
	 * @generated
	 */
	int JOB_SCHEDULED = 2;

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
	 * The feature id for the '<em><b>Cancel Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__CANCEL_TIME = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__STATUS = 14;

	/**
	 * The feature id for the '<em><b>Cancel Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__CANCEL_ENABLED_FEEDBACK = 15;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__SCHEDULER = 16;

	/**
	 * The feature id for the '<em><b>Job Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__JOB_NR = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__SOURCE = 18;

	/**
	 * The number of structural features of the '<em>Job Scheduled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED_FEATURE_COUNT = 19;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl <em>Job Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobSource()
	 * @generated
	 */
	int JOB_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Job Scheduled</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__JOB_SCHEDULED = 0;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__SCHEDULER = 1;

	/**
	 * The feature id for the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__START_FEEDBACK = 2;

	/**
	 * The feature id for the '<em><b>Stop Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__STOP_FEEDBACK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__STATUS = 6;

	/**
	 * The feature id for the '<em><b>Auto Start Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__AUTO_START_STOP = 7;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__RUNNING = 8;

	/**
	 * The number of structural features of the '<em>Job Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE___START = 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE___STOP = 1;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE___REFRESH = 2;

	/**
	 * The operation id for the '<em>On Job Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE___ON_JOB_RUNNING__JOBSCHEDULED = 3;

	/**
	 * The operation id for the '<em>On Job Returned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE___ON_JOB_RETURNED__JOBSCHEDULED_RETURNFEEDBACK = 4;

	/**
	 * The number of operations of the '<em>Job Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.JobStatus <em>Job Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.JobStatus
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobStatus()
	 * @generated
	 */
	int JOB_STATUS = 5;


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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getLastRefresh <em>Last Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Refresh</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getLastRefresh()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_LastRefresh();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getLastFeedback <em>Last Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getLastFeedback()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_LastFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getCurrentJobNr <em>Current Job Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Job Nr</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getCurrentJobNr()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_CurrentJobNr();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getSources()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EReference getJobScheduler_Sources();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#setLastFeedback() <em>Set Last Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Last Feedback</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#setLastFeedback()
	 * @generated
	 */
	EOperation getJobScheduler__SetLastFeedback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#makeNewJobNr() <em>Make New Job Nr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make New Job Nr</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#makeNewJobNr()
	 * @generated
	 */
	EOperation getJobScheduler__MakeNewJobNr();

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scheduler</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduler()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EReference getJobScheduled_Scheduler();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getJobNr <em>Job Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Nr</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getJobNr()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_JobNr();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getSource()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EReference getJobScheduled_Source();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.JobSource <em>Job Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Source</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource
	 * @generated
	 */
	EClass getJobSource();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.job.jobclient.JobSource#getJobScheduled <em>Job Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Job Scheduled</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#getJobScheduled()
	 * @see #getJobSource()
	 * @generated
	 */
	EReference getJobSource_JobScheduled();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.job.jobclient.JobSource#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scheduler</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#getScheduler()
	 * @see #getJobSource()
	 * @generated
	 */
	EReference getJobSource_Scheduler();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobSource#getStartFeedback <em>Start Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#getStartFeedback()
	 * @see #getJobSource()
	 * @generated
	 */
	EAttribute getJobSource_StartFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobSource#getStopFeedback <em>Stop Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#getStopFeedback()
	 * @see #getJobSource()
	 * @generated
	 */
	EAttribute getJobSource_StopFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobSource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#getName()
	 * @see #getJobSource()
	 * @generated
	 */
	EAttribute getJobSource_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobSource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#getDescription()
	 * @see #getJobSource()
	 * @generated
	 */
	EAttribute getJobSource_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobSource#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#getStatus()
	 * @see #getJobSource()
	 * @generated
	 */
	EAttribute getJobSource_Status();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobSource#isAutoStartStop <em>Auto Start Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Start Stop</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#isAutoStartStop()
	 * @see #getJobSource()
	 * @generated
	 */
	EAttribute getJobSource_AutoStartStop();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobSource#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#isRunning()
	 * @see #getJobSource()
	 * @generated
	 */
	EAttribute getJobSource_Running();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobSource#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#start()
	 * @generated
	 */
	EOperation getJobSource__Start();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobSource#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#stop()
	 * @generated
	 */
	EOperation getJobSource__Stop();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobSource#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#refresh()
	 * @generated
	 */
	EOperation getJobSource__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobSource#onJobRunning(com.misc.common.moplaf.job.jobclient.JobScheduled) <em>On Job Running</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Job Running</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#onJobRunning(com.misc.common.moplaf.job.jobclient.JobScheduled)
	 * @generated
	 */
	EOperation getJobSource__OnJobRunning__JobScheduled();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobSource#onJobReturned(com.misc.common.moplaf.job.jobclient.JobScheduled, com.misc.common.moplaf.common.ReturnFeedback) <em>On Job Returned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Job Returned</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#onJobReturned(com.misc.common.moplaf.job.jobclient.JobScheduled, com.misc.common.moplaf.common.ReturnFeedback)
	 * @generated
	 */
	EOperation getJobSource__OnJobReturned__JobScheduled_ReturnFeedback();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.job.jobclient.JobStatus <em>Job Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Status</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobStatus
	 * @generated
	 */
	EEnum getJobStatus();

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
		 * The meta object literal for the '<em><b>Last Refresh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__LAST_REFRESH = eINSTANCE.getJobScheduler_LastRefresh();

		/**
		 * The meta object literal for the '<em><b>Last Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__LAST_FEEDBACK = eINSTANCE.getJobScheduler_LastFeedback();

		/**
		 * The meta object literal for the '<em><b>Current Job Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__CURRENT_JOB_NR = eINSTANCE.getJobScheduler_CurrentJobNr();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SCHEDULER__SOURCES = eINSTANCE.getJobScheduler_Sources();

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
		 * The meta object literal for the '<em><b>Set Last Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SCHEDULER___SET_LAST_FEEDBACK = eINSTANCE.getJobScheduler__SetLastFeedback();

		/**
		 * The meta object literal for the '<em><b>Make New Job Nr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SCHEDULER___MAKE_NEW_JOB_NR = eINSTANCE.getJobScheduler__MakeNewJobNr();

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
		 * The meta object literal for the '<em><b>Scheduler</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SCHEDULED__SCHEDULER = eINSTANCE.getJobScheduled_Scheduler();

		/**
		 * The meta object literal for the '<em><b>Job Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__JOB_NR = eINSTANCE.getJobScheduled_JobNr();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SCHEDULED__SOURCE = eINSTANCE.getJobScheduled_Source();

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

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl <em>Job Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobSource()
		 * @generated
		 */
		EClass JOB_SOURCE = eINSTANCE.getJobSource();

		/**
		 * The meta object literal for the '<em><b>Job Scheduled</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SOURCE__JOB_SCHEDULED = eINSTANCE.getJobSource_JobScheduled();

		/**
		 * The meta object literal for the '<em><b>Scheduler</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SOURCE__SCHEDULER = eINSTANCE.getJobSource_Scheduler();

		/**
		 * The meta object literal for the '<em><b>Start Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SOURCE__START_FEEDBACK = eINSTANCE.getJobSource_StartFeedback();

		/**
		 * The meta object literal for the '<em><b>Stop Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SOURCE__STOP_FEEDBACK = eINSTANCE.getJobSource_StopFeedback();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SOURCE__NAME = eINSTANCE.getJobSource_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SOURCE__DESCRIPTION = eINSTANCE.getJobSource_Description();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SOURCE__STATUS = eINSTANCE.getJobSource_Status();

		/**
		 * The meta object literal for the '<em><b>Auto Start Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SOURCE__AUTO_START_STOP = eINSTANCE.getJobSource_AutoStartStop();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SOURCE__RUNNING = eINSTANCE.getJobSource_Running();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SOURCE___START = eINSTANCE.getJobSource__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SOURCE___STOP = eINSTANCE.getJobSource__Stop();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SOURCE___REFRESH = eINSTANCE.getJobSource__Refresh();

		/**
		 * The meta object literal for the '<em><b>On Job Running</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SOURCE___ON_JOB_RUNNING__JOBSCHEDULED = eINSTANCE.getJobSource__OnJobRunning__JobScheduled();

		/**
		 * The meta object literal for the '<em><b>On Job Returned</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SOURCE___ON_JOB_RETURNED__JOBSCHEDULED_RETURNFEEDBACK = eINSTANCE.getJobSource__OnJobReturned__JobScheduled_ReturnFeedback();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.JobStatus <em>Job Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.JobStatus
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobStatus()
		 * @generated
		 */
		EEnum JOB_STATUS = eINSTANCE.getJobStatus();

	}

} //JobClientPackage
