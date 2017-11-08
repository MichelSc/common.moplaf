/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
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
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobEngineProxy()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE__LABEL = 5;

	/**
	 * The number of structural features of the '<em>Job Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_FEATURE_COUNT = 6;

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
	 * The operation id for the '<em>On Job Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE___ON_JOB_PROGRESS__SUBMITTEDJOB_PROGRESSFEEDBACK = 2;

	/**
	 * The number of operations of the '<em>Job Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_OPERATION_COUNT = 3;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineInProcessImpl <em>Job Engine In Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobEngineInProcessImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobEngineInProcess()
	 * @generated
	 */
	int JOB_ENGINE_IN_PROCESS = 5;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl <em>Job Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobScheduler()
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
	 * The feature id for the '<em><b>Jobschedueled</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__JOBSCHEDUELED = 1;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__ENGINE = 2;

	/**
	 * The feature id for the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__START_FEEDBACK = 3;

	/**
	 * The feature id for the '<em><b>Stop Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__STOP_FEEDBACK = 4;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__STARTED = 5;

	/**
	 * The feature id for the '<em><b>Nb Of Engines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__NB_OF_ENGINES = 6;

	/**
	 * The feature id for the '<em><b>Nb Of Jobs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER__NB_OF_JOBS = 7;

	/**
	 * The number of structural features of the '<em>Job Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_FEATURE_COUNT = 8;

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
	 * The number of operations of the '<em>Job Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl <em>Job Scheduled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobScheduled()
	 * @generated
	 */
	int JOB_SCHEDULED = 7;

	/**
	 * The feature id for the '<em><b>Job</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__JOB = 0;

	/**
	 * The feature id for the '<em><b>Scheduled On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED__SCHEDULED_ON = 1;

	/**
	 * The number of structural features of the '<em>Job Scheduled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Kill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED___KILL = 0;

	/**
	 * The number of operations of the '<em>Job Scheduled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_SCHEDULED_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobclient.impl.EngineImpl <em>Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobclient.impl.EngineImpl
	 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getEngine()
	 * @generated
	 */
	int ENGINE = 8;

	/**
	 * The feature id for the '<em><b>Jobschedueled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE__JOBSCHEDUELED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#getLabel()
	 * @see #getJobEngine()
	 * @generated
	 */
	EAttribute getJobEngine_Label();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobEngine#onJobProgress(com.misc.common.moplaf.job.jobclient.SubmittedJob, com.misc.common.moplaf.job.ProgressFeedback) <em>On Job Progress</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Job Progress</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobEngine#onJobProgress(com.misc.common.moplaf.job.jobclient.SubmittedJob, com.misc.common.moplaf.job.ProgressFeedback)
	 * @generated
	 */
	EOperation getJobEngine__OnJobProgress__SubmittedJob_ProgressFeedback();

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
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getJobschedueled <em>Jobschedueled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobschedueled</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getJobschedueled()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EReference getJobScheduler_Jobschedueled();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Engine</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getEngine()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EReference getJobScheduler_Engine();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#isStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#isStarted()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_Started();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getNbOfEngines <em>Nb Of Engines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Of Engines</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getNbOfEngines()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_NbOfEngines();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getNbOfJobs <em>Nb Of Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Of Jobs</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getNbOfJobs()
	 * @see #getJobScheduler()
	 * @generated
	 */
	EAttribute getJobScheduler_NbOfJobs();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.JobScheduled <em>Job Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Scheduled</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled
	 * @generated
	 */
	EClass getJobScheduled();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Job</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getJob()
	 * @see #getJobScheduled()
	 * @generated
	 */
	EReference getJobScheduled_Job();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#kill() <em>Kill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Kill</em>' operation.
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#kill()
	 * @generated
	 */
	EOperation getJobScheduled__Kill();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobclient.Engine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engine</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.Engine
	 * @generated
	 */
	EClass getEngine();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.jobclient.Engine#getJobschedueled <em>Jobschedueled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jobschedueled</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.Engine#getJobschedueled()
	 * @see #getEngine()
	 * @generated
	 */
	EReference getEngine_Jobschedueled();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobclient.Engine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.job.jobclient.Engine#getName()
	 * @see #getEngine()
	 * @generated
	 */
	EAttribute getEngine_Name();

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
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobEngineProxy()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE__NAME = eINSTANCE.getJobEngine_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE__LABEL = eINSTANCE.getJobEngine_Label();

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
		 * The meta object literal for the '<em><b>On Job Progress</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_ENGINE___ON_JOB_PROGRESS__SUBMITTEDJOB_PROGRESSFEEDBACK = eINSTANCE.getJobEngine__OnJobProgress__SubmittedJob_ProgressFeedback();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl <em>Job Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobScheduler()
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
		 * The meta object literal for the '<em><b>Jobschedueled</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SCHEDULER__JOBSCHEDUELED = eINSTANCE.getJobScheduler_Jobschedueled();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SCHEDULER__ENGINE = eINSTANCE.getJobScheduler_Engine();

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
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__STARTED = eINSTANCE.getJobScheduler_Started();

		/**
		 * The meta object literal for the '<em><b>Nb Of Engines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__NB_OF_ENGINES = eINSTANCE.getJobScheduler_NbOfEngines();

		/**
		 * The meta object literal for the '<em><b>Nb Of Jobs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_SCHEDULER__NB_OF_JOBS = eINSTANCE.getJobScheduler_NbOfJobs();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl <em>Job Scheduled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getJobScheduled()
		 * @generated
		 */
		EClass JOB_SCHEDULED = eINSTANCE.getJobScheduled();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SCHEDULED__JOB = eINSTANCE.getJobScheduled_Job();

		/**
		 * The meta object literal for the '<em><b>Scheduled On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_SCHEDULED__SCHEDULED_ON = eINSTANCE.getJobScheduled_ScheduledOn();

		/**
		 * The meta object literal for the '<em><b>Kill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_SCHEDULED___KILL = eINSTANCE.getJobScheduled__Kill();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobclient.impl.EngineImpl <em>Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobclient.impl.EngineImpl
		 * @see com.misc.common.moplaf.job.jobclient.impl.JobclientPackageImpl#getEngine()
		 * @generated
		 */
		EClass ENGINE = eINSTANCE.getEngine();

		/**
		 * The meta object literal for the '<em><b>Jobschedueled</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINE__JOBSCHEDUELED = eINSTANCE.getEngine_Jobschedueled();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINE__NAME = eINSTANCE.getEngine_Name();

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
