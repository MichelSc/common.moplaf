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
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.ServiceImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__START_FEEDBACK = 0;

	/**
	 * The feature id for the '<em><b>Stop Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__STOP_FEEDBACK = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RUNNING = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Auto Start Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__AUTO_START_STOP = 5;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___START = 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___STOP = 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerServiceImpl <em>Job Scheduler Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobSchedulerServiceImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobSchedulerService()
	 * @generated
	 */
	int JOB_SCHEDULER_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_SERVICE__START_FEEDBACK = SERVICE__START_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Stop Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_SERVICE__STOP_FEEDBACK = SERVICE__STOP_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_SERVICE__STATUS = SERVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_SERVICE__RUNNING = SERVICE__RUNNING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Auto Start Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_SERVICE__AUTO_START_STOP = SERVICE__AUTO_START_STOP;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_SERVICE__DESCRIPTION = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_SERVICE__SCHEDULER = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Job Scheduler Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_SERVICE___START = SERVICE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_SERVICE___STOP = SERVICE___STOP;

	/**
	 * The number of operations of the '<em>Job Scheduler Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__START_FEEDBACK = JOB_SCHEDULER_SERVICE__START_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Stop Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__STOP_FEEDBACK = JOB_SCHEDULER_SERVICE__STOP_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__STATUS = JOB_SCHEDULER_SERVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__RUNNING = JOB_SCHEDULER_SERVICE__RUNNING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__NAME = JOB_SCHEDULER_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Auto Start Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__AUTO_START_STOP = JOB_SCHEDULER_SERVICE__AUTO_START_STOP;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__DESCRIPTION = JOB_SCHEDULER_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__SCHEDULER = JOB_SCHEDULER_SERVICE__SCHEDULER;

	/**
	 * The feature id for the '<em><b>Jobs Scheduled</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__JOBS_SCHEDULED = JOB_SCHEDULER_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Execute Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__EXECUTE_ENABLED_FEEDBACK = JOB_SCHEDULER_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Job Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_FEATURE_COUNT = JOB_SCHEDULER_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE___START = JOB_SCHEDULER_SERVICE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE___STOP = JOB_SCHEDULER_SERVICE___STOP;

	/**
	 * The operation id for the '<em>Execute Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE___EXECUTE_JOB__JOBSCHEDULED = JOB_SCHEDULER_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh Job Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE___REFRESH_JOB_STATUS__JOBSCHEDULED = JOB_SCHEDULER_SERVICE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Job Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OPERATION_COUNT = JOB_SCHEDULER_SERVICE_OPERATION_COUNT + 2;

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
	 * The feature id for the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__START_FEEDBACK = JOB_ENGINE__START_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Stop Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__STOP_FEEDBACK = JOB_ENGINE__STOP_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__STATUS = JOB_ENGINE__STATUS;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__RUNNING = JOB_ENGINE__RUNNING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__NAME = JOB_ENGINE__NAME;

	/**
	 * The feature id for the '<em><b>Auto Start Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__AUTO_START_STOP = JOB_ENGINE__AUTO_START_STOP;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__DESCRIPTION = JOB_ENGINE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__SCHEDULER = JOB_ENGINE__SCHEDULER;

	/**
	 * The feature id for the '<em><b>Jobs Scheduled</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__JOBS_SCHEDULED = JOB_ENGINE__JOBS_SCHEDULED;

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
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS___START = JOB_ENGINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS___STOP = JOB_ENGINE___STOP;

	/**
	 * The operation id for the '<em>Execute Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS___EXECUTE_JOB__JOBSCHEDULED = JOB_ENGINE___EXECUTE_JOB__JOBSCHEDULED;

	/**
	 * The operation id for the '<em>Refresh Job Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS___REFRESH_JOB_STATUS__JOBSCHEDULED = JOB_ENGINE___REFRESH_JOB_STATUS__JOBSCHEDULED;

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
	 * The feature id for the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__START_FEEDBACK = SERVICE__START_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Stop Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__STOP_FEEDBACK = SERVICE__STOP_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__STATUS = SERVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__RUNNING = SERVICE__RUNNING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Auto Start Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__AUTO_START_STOP = SERVICE__AUTO_START_STOP;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__JOBS = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__ENGINES = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refresh Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__REFRESH_FEEDBACK = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__DESCRIPTION = SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refresh Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__REFRESH_RATE = SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nr Jobs Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__NR_JOBS_WAITING = SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nr Jobs Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__NR_JOBS_RUNNING = SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nr Jobs Failed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__NR_JOBS_FAILED = SERVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Nr Jobs Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__NR_JOBS_CANCELLED = SERVICE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Last Refresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__LAST_REFRESH = SERVICE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Last Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__LAST_FEEDBACK = SERVICE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Current Schedule Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__CURRENT_SCHEDULE_NR = SERVICE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__SERVICES = SERVICE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__SOURCES = SERVICE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Job Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER___START = SERVICE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER___STOP = SERVICE___STOP;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER___REFRESH = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Submit Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER___SUBMIT_RUN__JOBSOURCE_RUN_BOOLEAN = SERVICE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Last Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER___SET_LAST_FEEDBACK = SERVICE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Make New Schedule Nr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER___MAKE_NEW_SCHEDULE_NR = SERVICE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Flush</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER___FLUSH = SERVICE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Job Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 5;

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
	 * The feature id for the '<em><b>Schedule Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__SCHEDULE_NR = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__SOURCE = 18;

	/**
	 * The feature id for the '<em><b>Execute Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__EXECUTE_NR = 19;

	/**
	 * The feature id for the '<em><b>Owned Run</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__OWNED_RUN = 20;

	/**
	 * The number of structural features of the '<em>Job Scheduled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED_FEATURE_COUNT = 21;

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
	 * The feature id for the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__START_FEEDBACK = JOB_SCHEDULER_SERVICE__START_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Stop Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__STOP_FEEDBACK = JOB_SCHEDULER_SERVICE__STOP_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__STATUS = JOB_SCHEDULER_SERVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__RUNNING = JOB_SCHEDULER_SERVICE__RUNNING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__NAME = JOB_SCHEDULER_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Auto Start Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__AUTO_START_STOP = JOB_SCHEDULER_SERVICE__AUTO_START_STOP;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__DESCRIPTION = JOB_SCHEDULER_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__SCHEDULER = JOB_SCHEDULER_SERVICE__SCHEDULER;

	/**
	 * The feature id for the '<em><b>Jobs Scheduled</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE__JOBS_SCHEDULED = JOB_SCHEDULER_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Job Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE_FEATURE_COUNT = JOB_SCHEDULER_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE___START = JOB_SCHEDULER_SERVICE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE___STOP = JOB_SCHEDULER_SERVICE___STOP;

	/**
	 * The operation id for the '<em>On Job Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE___ON_JOB_RUNNING__JOBSCHEDULED = JOB_SCHEDULER_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>On Job Returned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE___ON_JOB_RETURNED__JOBSCHEDULED_RETURNFEEDBACK = JOB_SCHEDULER_SERVICE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE___REFRESH = JOB_SCHEDULER_SERVICE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Job Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SOURCE_OPERATION_COUNT = JOB_SCHEDULER_SERVICE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.JobStatus <em>Job Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.JobStatus
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobStatus()
	 * @generated
	 */
	int JOB_STATUS = 7;


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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getCurrentScheduleNr <em>Current Schedule Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Schedule Nr</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getCurrentScheduleNr()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_CurrentScheduleNr();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getServices()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EReference getJobScheduler_Services();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#refresh()
	 * @generated
	 */
	EOperation getJobScheduler__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#submitRun(com.misc.common.moplaf.job.jobclient.JobSource, com.misc.common.moplaf.job.Run, boolean) <em>Submit Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Submit Run</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#submitRun(com.misc.common.moplaf.job.jobclient.JobSource, com.misc.common.moplaf.job.Run, boolean)
	 * @generated
	 */
	EOperation getJobScheduler__SubmitRun__JobSource_Run_boolean();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#makeNewScheduleNr() <em>Make New Schedule Nr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make New Schedule Nr</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#makeNewScheduleNr()
	 * @generated
	 */
	EOperation getJobScheduler__MakeNewScheduleNr();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#flush() <em>Flush</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Flush</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#flush()
	 * @generated
	 */
	EOperation getJobScheduler__Flush();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getExecuteNr <em>Execute Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execute Nr</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getExecuteNr()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_ExecuteNr();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getOwnedRun <em>Owned Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Run</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getOwnedRun()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EReference getJobScheduled_OwnedRun();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduleNr <em>Schedule Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Nr</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduleNr()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EAttribute getJobScheduled_ScheduleNr();

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
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getJobsScheduled <em>Jobs Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Jobs Scheduled</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#getJobsScheduled()
	 * @see #getJobEngine()
	 * @generated
	 */
	EReference getJobEngine_JobsScheduled();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobEngine#refreshJobStatus(com.misc.common.moplaf.job.jobclient.JobScheduled) <em>Refresh Job Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Job Status</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#refreshJobStatus(com.misc.common.moplaf.job.jobclient.JobScheduled)
	 * @generated
	 */
	EOperation getJobEngine__RefreshJobStatus__JobScheduled();

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
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.job.jobclient.JobSource#getJobsScheduled <em>Jobs Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Jobs Scheduled</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#getJobsScheduled()
	 * @see #getJobSource()
	 * @generated
	 */
	EReference getJobSource_JobsScheduled();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobSource#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobSource#refresh()
	 * @generated
	 */
	EOperation getJobSource__Refresh();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.JobSchedulerService <em>Job Scheduler Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Scheduler Service</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobSchedulerService
	 * @generated
	 */
	EClass getJobSchedulerService();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobSchedulerService#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobSchedulerService#getDescription()
	 * @see #getJobSchedulerService()
	 * @generated
	 */
	EAttribute getJobSchedulerService_Description();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.jobclient.JobSchedulerService#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduler</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobSchedulerService#getScheduler()
	 * @see #getJobSchedulerService()
	 * @generated
	 */
	EReference getJobSchedulerService_Scheduler();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.Service#getStartFeedback <em>Start Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.Service#getStartFeedback()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_StartFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.Service#getStopFeedback <em>Stop Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.Service#getStopFeedback()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_StopFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.Service#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.Service#isRunning()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Running();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.Service#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.Service#getStatus()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Status();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.Service#isAutoStartStop <em>Auto Start Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Start Stop</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.Service#isAutoStartStop()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_AutoStartStop();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.Service#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.Service#start()
	 * @generated
	 */
	EOperation getService__Start();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.Service#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.Service#stop()
	 * @generated
	 */
	EOperation getService__Stop();

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
		 * The meta object literal for the '<em><b>Current Schedule Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__CURRENT_SCHEDULE_NR = eINSTANCE.getJobScheduler_CurrentScheduleNr();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SCHEDULER__SERVICES = eINSTANCE.getJobScheduler_Services();

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
		 * The meta object literal for the '<em><b>Refresh Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__REFRESH_RATE = eINSTANCE.getJobScheduler_RefreshRate();

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
		EOperation JOB_SCHEDULER___SUBMIT_RUN__JOBSOURCE_RUN_BOOLEAN = eINSTANCE.getJobScheduler__SubmitRun__JobSource_Run_boolean();

		/**
		 * The meta object literal for the '<em><b>Set Last Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SCHEDULER___SET_LAST_FEEDBACK = eINSTANCE.getJobScheduler__SetLastFeedback();

		/**
		 * The meta object literal for the '<em><b>Make New Schedule Nr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SCHEDULER___MAKE_NEW_SCHEDULE_NR = eINSTANCE.getJobScheduler__MakeNewScheduleNr();

		/**
		 * The meta object literal for the '<em><b>Flush</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SCHEDULER___FLUSH = eINSTANCE.getJobScheduler__Flush();

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
		 * The meta object literal for the '<em><b>Execute Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__EXECUTE_NR = eINSTANCE.getJobScheduled_ExecuteNr();

		/**
		 * The meta object literal for the '<em><b>Owned Run</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SCHEDULED__OWNED_RUN = eINSTANCE.getJobScheduled_OwnedRun();

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
		 * The meta object literal for the '<em><b>Schedule Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULED__SCHEDULE_NR = eINSTANCE.getJobScheduled_ScheduleNr();

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
		 * The meta object literal for the '<em><b>Jobs Scheduled</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_ENGINE__JOBS_SCHEDULED = eINSTANCE.getJobEngine_JobsScheduled();

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
		 * The meta object literal for the '<em><b>Refresh Job Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_ENGINE___REFRESH_JOB_STATUS__JOBSCHEDULED = eINSTANCE.getJobEngine__RefreshJobStatus__JobScheduled();

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
		 * The meta object literal for the '<em><b>Jobs Scheduled</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SOURCE__JOBS_SCHEDULED = eINSTANCE.getJobSource_JobsScheduled();

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
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SOURCE___REFRESH = eINSTANCE.getJobSource__Refresh();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerServiceImpl <em>Job Scheduler Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobSchedulerServiceImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getJobSchedulerService()
		 * @generated
		 */
		EClass JOB_SCHEDULER_SERVICE = eINSTANCE.getJobSchedulerService();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER_SERVICE__DESCRIPTION = eINSTANCE.getJobSchedulerService_Description();

		/**
		 * The meta object literal for the '<em><b>Scheduler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SCHEDULER_SERVICE__SCHEDULER = eINSTANCE.getJobSchedulerService_Scheduler();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.ServiceImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobClientPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Start Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__START_FEEDBACK = eINSTANCE.getService_StartFeedback();

		/**
		 * The meta object literal for the '<em><b>Stop Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__STOP_FEEDBACK = eINSTANCE.getService_StopFeedback();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__RUNNING = eINSTANCE.getService_Running();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__STATUS = eINSTANCE.getService_Status();

		/**
		 * The meta object literal for the '<em><b>Auto Start Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__AUTO_START_STOP = eINSTANCE.getService_AutoStartStop();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE___START = eINSTANCE.getService__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE___STOP = eINSTANCE.getService__Stop();

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
