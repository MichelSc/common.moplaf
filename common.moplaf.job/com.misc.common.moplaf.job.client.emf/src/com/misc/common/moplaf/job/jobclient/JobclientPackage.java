/**
 */
package com.misc.common.moplaf.job.jobclient;

import com.misc.common.moplaf.job.JobPackage;

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
 * @see com.misc.common.moplaf.job.jobclient.JobclientFactory
 * @model kind="package"
 * @generated
 */
public interface JobclientPackage extends EPackage {
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
	String eNS_URI = "//www.misc.com/common/moplaf/job/client/model/0.1";

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
	JobclientPackage eINSTANCE = com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl <em>Job Remote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobRemote()
	 * @generated
	 */
	int JOB_REMOTE = 0;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__RUN_FEEDBACK = JobPackage.JOB__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__CANCEL_FEEDBACK = JobPackage.JOB__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__RESET_FEEDBACK = JobPackage.JOB__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__CANCELED = JobPackage.JOB__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__RETURN_SUCCESS = JobPackage.JOB__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__RETURN_FEEDBACK = JobPackage.JOB__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__RETURN_INFORMATION = JobPackage.JOB__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__STATUS = JobPackage.JOB__STATUS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__DESCRIPTION = JobPackage.JOB__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__START_TIME = JobPackage.JOB__START_TIME;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__END_TIME = JobPackage.JOB__END_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__DURATION = JobPackage.JOB__DURATION;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__STARTED = JobPackage.JOB__STARTED;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__FINISHED = JobPackage.JOB__FINISHED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__NAME = JobPackage.JOB__NAME;

	/**
	 * The feature id for the '<em><b>Submission ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__SUBMISSION_ID = JobPackage.JOB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handling Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__HANDLING_ENGINE = JobPackage.JOB_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE__RESULT = JobPackage.JOB_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Job Remote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE_FEATURE_COUNT = JobPackage.JOB_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE___RESET = JobPackage.JOB___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE___RUN = JobPackage.JOB___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE___RUN__RUNCONTEXT = JobPackage.JOB___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE___CANCEL = JobPackage.JOB___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE___SET_PROGRESS__STRING_FLOAT = JobPackage.JOB___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE___SET_PROGRESS__PROGRESSFEEDBACK = JobPackage.JOB___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE___GET_RETURN = JobPackage.JOB___GET_RETURN;

	/**
	 * The operation id for the '<em>On Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE___ON_PROGRESS__PROGRESSFEEDBACK = JobPackage.JOB_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>On Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE___ON_RETURN__RETURNFEEDBACK = JobPackage.JOB_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Job Remote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REMOTE_OPERATION_COUNT = JobPackage.JOB_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineProxyImpl <em>Job Engine Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineProxyImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobEngineProxy()
	 * @generated
	 */
	int JOB_ENGINE_PROXY = 1;

	/**
	 * The feature id for the '<em><b>Submitted Jobs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_PROXY__SUBMITTED_JOBS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_PROXY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Job Engine Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_PROXY_FEATURE_COUNT = 2;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl <em>Job Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobEngine()
	 * @generated
	 */
	int JOB_ENGINE = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.SubmittedJobImpl <em>Submitted Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.SubmittedJobImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getSubmittedJob()
	 * @generated
	 */
	int SUBMITTED_JOB = 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteResultImpl <em>Job Remote Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobRemoteResultImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobRemoteResult()
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
	 * The feature id for the '<em><b>Submitted Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__SUBMITTED_JOBS = 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__RUNNING = 1;

	/**
	 * The feature id for the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__START_FEEDBACK = 2;

	/**
	 * The feature id for the '<em><b>Stop Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__STOP_FEEDBACK = 3;

	/**
	 * The number of structural features of the '<em>Job Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE___START = 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE___STOP = 1;

	/**
	 * The number of operations of the '<em>Job Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Job</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITTED_JOB__JOB = 0;

	/**
	 * The number of structural features of the '<em>Submitted Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITTED_JOB_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Submitted Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITTED_JOB_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineInProcessImpl <em>Job Engine In Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineInProcessImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobEngineInProcess()
	 * @generated
	 */
	int JOB_ENGINE_IN_PROCESS = 5;

	/**
	 * The feature id for the '<em><b>Submitted Jobs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__SUBMITTED_JOBS = JOB_ENGINE_PROXY__SUBMITTED_JOBS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__NAME = JOB_ENGINE_PROXY__NAME;

	/**
	 * The feature id for the '<em><b>Asynchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS__ASYNCHRONOUS = JOB_ENGINE_PROXY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Job Engine In Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS_FEATURE_COUNT = JOB_ENGINE_PROXY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Submit Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS___SUBMIT_JOB__JOBREMOTE = JOB_ENGINE_PROXY___SUBMIT_JOB__JOBREMOTE;

	/**
	 * The operation id for the '<em>Get Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS___GET_JOB__INT = JOB_ENGINE_PROXY___GET_JOB__INT;

	/**
	 * The number of operations of the '<em>Job Engine In Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_IN_PROCESS_OPERATION_COUNT = JOB_ENGINE_PROXY_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getHandlingEngine <em>Handling Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handling Engine</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getHandlingEngine()
	 * @see #getJobRemote()
	 * @generated
	 */
	EReference getJobRemote_HandlingEngine();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.JobEngineProxy <em>Job Engine Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Engine Proxy</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineProxy
	 * @generated
	 */
	EClass getJobEngineProxy();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.job.jobclient.JobEngineProxy#getSubmittedJobs <em>Submitted Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Submitted Jobs</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineProxy#getSubmittedJobs()
	 * @see #getJobEngineProxy()
	 * @generated
	 */
	EReference getJobEngineProxy_SubmittedJobs();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.JobEngine <em>Job Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Engine</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine
	 * @generated
	 */
	EClass getJobEngine();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getSubmittedJobs <em>Submitted Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submitted Jobs</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#getSubmittedJobs()
	 * @see #getJobEngine()
	 * @generated
	 */
	EReference getJobEngine_SubmittedJobs();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobEngine#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#isRunning()
	 * @see #getJobEngine()
	 * @generated
	 */
	EAttribute getJobEngine_Running();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getStartFeedback <em>Start Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#getStartFeedback()
	 * @see #getJobEngine()
	 * @generated
	 */
	EAttribute getJobEngine_StartFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getStopFeedback <em>Stop Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Feedback</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#getStopFeedback()
	 * @see #getJobEngine()
	 * @generated
	 */
	EAttribute getJobEngine_StopFeedback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobEngine#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#start()
	 * @generated
	 */
	EOperation getJobEngine__Start();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobEngine#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#stop()
	 * @generated
	 */
	EOperation getJobEngine__Stop();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.JobEngineInProcess <em>Job Engine In Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Engine In Process</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineInProcess
	 * @generated
	 */
	EClass getJobEngineInProcess();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobEngineInProcess#isAsynchronous <em>Asynchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asynchronous</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngineInProcess#isAsynchronous()
	 * @see #getJobEngineInProcess()
	 * @generated
	 */
	EAttribute getJobEngineInProcess_Asynchronous();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JobclientFactory getJobclientFactory();

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
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobRemote()
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
		 * The meta object literal for the '<em><b>Handling Engine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_REMOTE__HANDLING_ENGINE = eINSTANCE.getJobRemote_HandlingEngine();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_REMOTE__RESULT = eINSTANCE.getJobRemote_Result();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineProxyImpl <em>Job Engine Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineProxyImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobEngineProxy()
		 * @generated
		 */
		EClass JOB_ENGINE_PROXY = eINSTANCE.getJobEngineProxy();

		/**
		 * The meta object literal for the '<em><b>Submitted Jobs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_ENGINE_PROXY__SUBMITTED_JOBS = eINSTANCE.getJobEngineProxy_SubmittedJobs();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl <em>Job Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobEngine()
		 * @generated
		 */
		EClass JOB_ENGINE = eINSTANCE.getJobEngine();

		/**
		 * The meta object literal for the '<em><b>Submitted Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_ENGINE__SUBMITTED_JOBS = eINSTANCE.getJobEngine_SubmittedJobs();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE__RUNNING = eINSTANCE.getJobEngine_Running();

		/**
		 * The meta object literal for the '<em><b>Start Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE__START_FEEDBACK = eINSTANCE.getJobEngine_StartFeedback();

		/**
		 * The meta object literal for the '<em><b>Stop Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE__STOP_FEEDBACK = eINSTANCE.getJobEngine_StopFeedback();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_ENGINE___START = eINSTANCE.getJobEngine__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_ENGINE___STOP = eINSTANCE.getJobEngine__Stop();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.SubmittedJobImpl <em>Submitted Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.SubmittedJobImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getSubmittedJob()
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
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineInProcessImpl <em>Job Engine In Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineInProcessImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobEngineInProcess()
		 * @generated
		 */
		EClass JOB_ENGINE_IN_PROCESS = eINSTANCE.getJobEngineInProcess();

		/**
		 * The meta object literal for the '<em><b>Asynchronous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE_IN_PROCESS__ASYNCHRONOUS = eINSTANCE.getJobEngineInProcess_Asynchronous();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteResultImpl <em>Job Remote Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobRemoteResultImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobRemoteResult()
		 * @generated
		 */
		EClass JOB_REMOTE_RESULT = eINSTANCE.getJobRemoteResult();

	}

} //JobclientPackage
