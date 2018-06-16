/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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
package com.misc.common.moplaf.job;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see com.misc.common.moplaf.job.JobFactory
 * @model kind="package"
 * @generated
 */
public interface JobPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "job";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/job/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "job";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobPackage eINSTANCE = com.misc.common.moplaf.job.impl.JobPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.JobParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.JobParameterImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getJobParameter()
	 * @generated
	 */
	int JOB_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Job Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PARAMETER__JOB_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PARAMETER__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.RunParamsImpl <em>Run Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.RunParamsImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getRunParams()
	 * @generated
	 */
	int RUN_PARAMS = 1;

	/**
	 * The number of structural features of the '<em>Run Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_PARAMS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_PARAMS___COPY_PARAMS__RUNPARAMS = 0;

	/**
	 * The number of operations of the '<em>Run Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_PARAMS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.RunImpl <em>Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.RunImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getRun()
	 * @generated
	 */
	int RUN = 2;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RUN_FEEDBACK = RUN_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__CANCEL_FEEDBACK = RUN_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RESET_FEEDBACK = RUN_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__LABEL = RUN_PARAMS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__CANCELLED = RUN_PARAMS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RETURNED = RUN_PARAMS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RETURN_SUCCESS = RUN_PARAMS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RETURN_FEEDBACK = RUN_PARAMS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RETURN_INFORMATION = RUN_PARAMS_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FEATURE_COUNT = RUN_PARAMS_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___COPY_PARAMS__RUNPARAMS = RUN_PARAMS___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___RESET = RUN_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___RUN = RUN_PARAMS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___RUN__RUNCONTEXT = RUN_PARAMS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___RUN_ASYNCH__RUNCONTEXT = RUN_PARAMS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___RUN_ASYNCH__RUNCONTEXT_BOOLEAN = RUN_PARAMS_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___CANCEL = RUN_PARAMS_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___SET_PROGRESS__STRING_FLOAT = RUN_PARAMS_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___SET_PROGRESS__PROGRESSFEEDBACK = RUN_PARAMS_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___SET_RETURN__RETURNFEEDBACK = RUN_PARAMS_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___GET_RETURN = RUN_PARAMS_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___CONSTRUCT_PARAMS = RUN_PARAMS_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_OPERATION_COUNT = RUN_PARAMS_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.JobImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 3;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RUN_FEEDBACK = RUN__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CANCEL_FEEDBACK = RUN__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RESET_FEEDBACK = RUN__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__LABEL = RUN__LABEL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CANCELLED = RUN__CANCELLED;

	/**
	 * The feature id for the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RETURNED = RUN__RETURNED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RETURN_SUCCESS = RUN__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RETURN_FEEDBACK = RUN__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RETURN_INFORMATION = RUN__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STATUS = RUN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DESCRIPTION = RUN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__START_TIME = RUN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__END_TIME = RUN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DURATION = RUN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STARTED = RUN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__FINISHED = RUN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = RUN_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = RUN_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___COPY_PARAMS__RUNPARAMS = RUN___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___RESET = RUN___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___RUN = RUN___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___RUN__RUNCONTEXT = RUN___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___RUN_ASYNCH__RUNCONTEXT = RUN___RUN_ASYNCH__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___RUN_ASYNCH__RUNCONTEXT_BOOLEAN = RUN___RUN_ASYNCH__RUNCONTEXT_BOOLEAN;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___CANCEL = RUN___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___SET_PROGRESS__STRING_FLOAT = RUN___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___SET_PROGRESS__PROGRESSFEEDBACK = RUN___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___SET_RETURN__RETURNFEEDBACK = RUN___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_RETURN = RUN___GET_RETURN;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___CONSTRUCT_PARAMS = RUN___CONSTRUCT_PARAMS;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = RUN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.JobConsoleImpl <em>Console</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.JobConsoleImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getJobConsole()
	 * @generated
	 */
	int JOB_CONSOLE = 4;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__RUN_FEEDBACK = JOB__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__CANCEL_FEEDBACK = JOB__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__RESET_FEEDBACK = JOB__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__LABEL = JOB__LABEL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__CANCELLED = JOB__CANCELLED;

	/**
	 * The feature id for the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__RETURNED = JOB__RETURNED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__RETURN_SUCCESS = JOB__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__RETURN_FEEDBACK = JOB__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__RETURN_INFORMATION = JOB__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__STATUS = JOB__STATUS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__DESCRIPTION = JOB__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__START_TIME = JOB__START_TIME;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__END_TIME = JOB__END_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__DURATION = JOB__DURATION;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__STARTED = JOB__STARTED;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__FINISHED = JOB__FINISHED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__NAME = JOB__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__PARAMETERS = JOB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Help Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__HELP_TEXT = JOB_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE__ARGS = JOB_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Console</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE_FEATURE_COUNT = JOB_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___COPY_PARAMS__RUNPARAMS = JOB___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___RESET = JOB___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___RUN = JOB___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___RUN__RUNCONTEXT = JOB___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___RUN_ASYNCH__RUNCONTEXT = JOB___RUN_ASYNCH__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___RUN_ASYNCH__RUNCONTEXT_BOOLEAN = JOB___RUN_ASYNCH__RUNCONTEXT_BOOLEAN;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___CANCEL = JOB___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___SET_PROGRESS__STRING_FLOAT = JOB___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___SET_PROGRESS__PROGRESSFEEDBACK = JOB___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___SET_RETURN__RETURNFEEDBACK = JOB___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___GET_RETURN = JOB___GET_RETURN;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___CONSTRUCT_PARAMS = JOB___CONSTRUCT_PARAMS;

	/**
	 * The operation id for the '<em>Add Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___ADD_PARAMETER__STRING_JOBPARAMETERTYPE_EATTRIBUTE_STRING = JOB_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___REFRESH_PARAMETERS = JOB_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Arg As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___GET_ARG_AS_STRING__INT = JOB_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Arg As Int</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___GET_ARG_AS_INT__INT = JOB_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Arg As Float</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___GET_ARG_AS_FLOAT__INT = JOB_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Arg As Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___GET_ARG_AS_DATE__INT = JOB_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Arg As Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___GET_ARG_AS_DATE__INT_STRING = JOB_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Args</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE___SET_ARGS = JOB_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Console</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_CONSOLE_OPERATION_COUNT = JOB_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.JobFileHandlerImpl <em>File Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.JobFileHandlerImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getJobFileHandler()
	 * @generated
	 */
	int JOB_FILE_HANDLER = 11;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.SetterImpl <em>Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.SetterImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getSetter()
	 * @generated
	 */
	int SETTER = 5;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__REMARKS = 2;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__TARGET_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER___ACCEPT__EOBJECT = 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER___INIT__EOBJECT = 1;

	/**
	 * The number of operations of the '<em>Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.SetterStructuralFeatureImpl <em>Setter Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.SetterStructuralFeatureImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getSetterStructuralFeature()
	 * @generated
	 */
	int SETTER_STRUCTURAL_FEATURE = 6;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_STRUCTURAL_FEATURE__SETTER = 0;

	/**
	 * The feature id for the '<em><b>Feature To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_STRUCTURAL_FEATURE__FEATURE_TO_SET = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_STRUCTURAL_FEATURE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Setter Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_STRUCTURAL_FEATURE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_STRUCTURAL_FEATURE___ACCEPT__EOBJECT = 0;

	/**
	 * The number of operations of the '<em>Setter Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_STRUCTURAL_FEATURE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.SetterAttributeImpl <em>Setter Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.SetterAttributeImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getSetterAttribute()
	 * @generated
	 */
	int SETTER_ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE__SETTER = SETTER_STRUCTURAL_FEATURE__SETTER;

	/**
	 * The feature id for the '<em><b>Feature To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE__FEATURE_TO_SET = SETTER_STRUCTURAL_FEATURE__FEATURE_TO_SET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE__DESCRIPTION = SETTER_STRUCTURAL_FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attribute To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE__ATTRIBUTE_TO_SET = SETTER_STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Setter Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_FEATURE_COUNT = SETTER_STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE___ACCEPT__EOBJECT = SETTER_STRUCTURAL_FEATURE___ACCEPT__EOBJECT;

	/**
	 * The number of operations of the '<em>Setter Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_OPERATION_COUNT = SETTER_STRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.SetterAttributeIntImpl <em>Setter Attribute Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.SetterAttributeIntImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getSetterAttributeInt()
	 * @generated
	 */
	int SETTER_ATTRIBUTE_INT = 8;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_INT__SETTER = SETTER_ATTRIBUTE__SETTER;

	/**
	 * The feature id for the '<em><b>Feature To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_INT__FEATURE_TO_SET = SETTER_ATTRIBUTE__FEATURE_TO_SET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_INT__DESCRIPTION = SETTER_ATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attribute To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_INT__ATTRIBUTE_TO_SET = SETTER_ATTRIBUTE__ATTRIBUTE_TO_SET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_INT__VALUE = SETTER_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Setter Attribute Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_INT_FEATURE_COUNT = SETTER_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_INT___ACCEPT__EOBJECT = SETTER_ATTRIBUTE___ACCEPT__EOBJECT;

	/**
	 * The number of operations of the '<em>Setter Attribute Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_INT_OPERATION_COUNT = SETTER_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.SetterAttributeFloatImpl <em>Setter Attribute Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.SetterAttributeFloatImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getSetterAttributeFloat()
	 * @generated
	 */
	int SETTER_ATTRIBUTE_FLOAT = 9;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_FLOAT__SETTER = SETTER_ATTRIBUTE__SETTER;

	/**
	 * The feature id for the '<em><b>Feature To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_FLOAT__FEATURE_TO_SET = SETTER_ATTRIBUTE__FEATURE_TO_SET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_FLOAT__DESCRIPTION = SETTER_ATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attribute To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_FLOAT__ATTRIBUTE_TO_SET = SETTER_ATTRIBUTE__ATTRIBUTE_TO_SET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_FLOAT__VALUE = SETTER_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Setter Attribute Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_FLOAT_FEATURE_COUNT = SETTER_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_FLOAT___ACCEPT__EOBJECT = SETTER_ATTRIBUTE___ACCEPT__EOBJECT;

	/**
	 * The number of operations of the '<em>Setter Attribute Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_ATTRIBUTE_FLOAT_OPERATION_COUNT = SETTER_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.ParamsHolderImpl <em>Params Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.ParamsHolderImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getParamsHolder()
	 * @generated
	 */
	int PARAMS_HOLDER = 10;

	/**
	 * The feature id for the '<em><b>Runs Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMS_HOLDER__RUNS_PARAMS = 0;

	/**
	 * The number of structural features of the '<em>Params Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMS_HOLDER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMS_HOLDER___CONSTRUCT_PARAMS__RUN = 0;

	/**
	 * The number of operations of the '<em>Params Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMS_HOLDER_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__RUN_FEEDBACK = JOB__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__CANCEL_FEEDBACK = JOB__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__RESET_FEEDBACK = JOB__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__LABEL = JOB__LABEL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__CANCELLED = JOB__CANCELLED;

	/**
	 * The feature id for the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__RETURNED = JOB__RETURNED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__RETURN_SUCCESS = JOB__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__RETURN_FEEDBACK = JOB__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__RETURN_INFORMATION = JOB__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__STATUS = JOB__STATUS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__DESCRIPTION = JOB__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__START_TIME = JOB__START_TIME;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__END_TIME = JOB__END_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__DURATION = JOB__DURATION;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__STARTED = JOB__STARTED;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__FINISHED = JOB__FINISHED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__NAME = JOB__NAME;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__FILES = JOB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__SELECTED_FILE = JOB_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Handled File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER__HANDLED_FILE = JOB_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>File Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER_FEATURE_COUNT = JOB_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER___COPY_PARAMS__RUNPARAMS = JOB___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER___RESET = JOB___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER___RUN = JOB___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER___RUN__RUNCONTEXT = JOB___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER___RUN_ASYNCH__RUNCONTEXT = JOB___RUN_ASYNCH__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER___RUN_ASYNCH__RUNCONTEXT_BOOLEAN = JOB___RUN_ASYNCH__RUNCONTEXT_BOOLEAN;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER___CANCEL = JOB___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER___SET_PROGRESS__STRING_FLOAT = JOB___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER___SET_PROGRESS__PROGRESSFEEDBACK = JOB___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER___SET_RETURN__RETURNFEEDBACK = JOB___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER___GET_RETURN = JOB___GET_RETURN;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER___CONSTRUCT_PARAMS = JOB___CONSTRUCT_PARAMS;

	/**
	 * The number of operations of the '<em>File Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FILE_HANDLER_OPERATION_COUNT = JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.RunsImpl <em>Runs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.RunsImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getRuns()
	 * @generated
	 */
	int RUNS = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Runs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNS__RUNS = 1;

	/**
	 * The number of structural features of the '<em>Runs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Runs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.TaskImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 18;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.DomainTaskImpl <em>Domain Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.DomainTaskImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getDomainTask()
	 * @generated
	 */
	int DOMAIN_TASK = 19;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.TaskDocImpl <em>Task Doc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.TaskDocImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getTaskDoc()
	 * @generated
	 */
	int TASK_DOC = 20;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.TaskInputImpl <em>Task Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.TaskInputImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getTaskInput()
	 * @generated
	 */
	int TASK_INPUT = 21;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.TaskOutputImpl <em>Task Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.TaskOutputImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getTaskOutput()
	 * @generated
	 */
	int TASK_OUTPUT = 22;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.DocImpl <em>Doc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.DocImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getDoc()
	 * @generated
	 */
	int DOC = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__LOADED = 1;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__REFS = 2;

	/**
	 * The number of structural features of the '<em>Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC___SAVE = 0;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC___LOAD = 1;

	/**
	 * The operation id for the '<em>Flush</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC___FLUSH = 2;

	/**
	 * The number of operations of the '<em>Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.DocRefImpl <em>Doc Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.DocRefImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getDocRef()
	 * @generated
	 */
	int DOC_REF = 14;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_REF__DOC = 0;

	/**
	 * The number of structural features of the '<em>Doc Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Doc Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.TasksImpl <em>Tasks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.TasksImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getTasks()
	 * @generated
	 */
	int TASKS = 23;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.DocsImpl <em>Docs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.DocsImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getDocs()
	 * @generated
	 */
	int DOCS = 24;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.TaskDomainImpl <em>Task Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.TaskDomainImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getTaskDomain()
	 * @generated
	 */
	int TASK_DOMAIN = 25;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.DocsHolderImpl <em>Docs Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.DocsHolderImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getDocsHolder()
	 * @generated
	 */
	int DOCS_HOLDER = 15;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCS_HOLDER__DOCS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCS_HOLDER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Docs Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCS_HOLDER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Doc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCS_HOLDER___ADD_DOC__DOC = 0;

	/**
	 * The operation id for the '<em>Add Docs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCS_HOLDER___ADD_DOCS__ELIST = 1;

	/**
	 * The number of operations of the '<em>Docs Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCS_HOLDER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.CompoundDocImpl <em>Compound Doc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.CompoundDocImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getCompoundDoc()
	 * @generated
	 */
	int COMPOUND_DOC = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DOC__DESCRIPTION = DOC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DOC__LOADED = DOC__LOADED;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DOC__REFS = DOC__REFS;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DOC__DOCS = DOC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DOC__NAME = DOC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compound Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DOC_FEATURE_COUNT = DOC_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DOC___SAVE = DOC___SAVE;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DOC___LOAD = DOC___LOAD;

	/**
	 * The operation id for the '<em>Flush</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DOC___FLUSH = DOC___FLUSH;

	/**
	 * The operation id for the '<em>Add Doc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DOC___ADD_DOC__DOC = DOC_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Docs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DOC___ADD_DOCS__ELIST = DOC_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compound Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DOC_OPERATION_COUNT = DOC_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.impl.DocInDocsHolderImpl <em>Doc In Docs Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.impl.DocInDocsHolderImpl
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getDocInDocsHolder()
	 * @generated
	 */
	int DOC_IN_DOCS_HOLDER = 17;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_IN_DOCS_HOLDER__DOC = DOC_REF__DOC;

	/**
	 * The feature id for the '<em><b>Docs Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_IN_DOCS_HOLDER__DOCS_HOLDER = DOC_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Doc In Docs Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_IN_DOCS_HOLDER_FEATURE_COUNT = DOC_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Doc In Docs Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_IN_DOCS_HOLDER_OPERATION_COUNT = DOC_REF_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RUN_FEEDBACK = RUN__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CANCEL_FEEDBACK = RUN__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RESET_FEEDBACK = RUN__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LABEL = RUN__LABEL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CANCELLED = RUN__CANCELLED;

	/**
	 * The feature id for the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RETURNED = RUN__RETURNED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RETURN_SUCCESS = RUN__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RETURN_FEEDBACK = RUN__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RETURN_INFORMATION = RUN__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = RUN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = RUN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUTS = RUN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUTS = RUN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = RUN_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___COPY_PARAMS__RUNPARAMS = RUN___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RESET = RUN___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RUN = RUN___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RUN__RUNCONTEXT = RUN___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RUN_ASYNCH__RUNCONTEXT = RUN___RUN_ASYNCH__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RUN_ASYNCH__RUNCONTEXT_BOOLEAN = RUN___RUN_ASYNCH__RUNCONTEXT_BOOLEAN;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CANCEL = RUN___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SET_PROGRESS__STRING_FLOAT = RUN___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SET_PROGRESS__PROGRESSFEEDBACK = RUN___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SET_RETURN__RETURNFEEDBACK = RUN___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_RETURN = RUN___GET_RETURN;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CONSTRUCT_PARAMS = RUN___CONSTRUCT_PARAMS;

	/**
	 * The operation id for the '<em>Add Input Doc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___ADD_INPUT_DOC__DOC = RUN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Input Docs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___ADD_INPUT_DOCS__ELIST = RUN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Init Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___INIT_OUTPUTS = RUN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Output Doc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___ADD_OUTPUT_DOC__DOC = RUN_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Output Docs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___ADD_OUTPUT_DOCS__ELIST = RUN_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = RUN_OPERATION_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK__RUN_FEEDBACK = TASK__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK__CANCEL_FEEDBACK = TASK__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK__RESET_FEEDBACK = TASK__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK__LABEL = TASK__LABEL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK__CANCELLED = TASK__CANCELLED;

	/**
	 * The feature id for the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK__RETURNED = TASK__RETURNED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK__RETURN_SUCCESS = TASK__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK__RETURN_FEEDBACK = TASK__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK__RETURN_INFORMATION = TASK__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK__INPUTS = TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK__DOMAIN = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___COPY_PARAMS__RUNPARAMS = TASK___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___RESET = TASK___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___RUN = TASK___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___RUN__RUNCONTEXT = TASK___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___RUN_ASYNCH__RUNCONTEXT = TASK___RUN_ASYNCH__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___RUN_ASYNCH__RUNCONTEXT_BOOLEAN = TASK___RUN_ASYNCH__RUNCONTEXT_BOOLEAN;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___CANCEL = TASK___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___SET_PROGRESS__STRING_FLOAT = TASK___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___SET_PROGRESS__PROGRESSFEEDBACK = TASK___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___SET_RETURN__RETURNFEEDBACK = TASK___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___GET_RETURN = TASK___GET_RETURN;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___CONSTRUCT_PARAMS = TASK___CONSTRUCT_PARAMS;

	/**
	 * The operation id for the '<em>Add Input Doc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___ADD_INPUT_DOC__DOC = TASK___ADD_INPUT_DOC__DOC;

	/**
	 * The operation id for the '<em>Add Input Docs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___ADD_INPUT_DOCS__ELIST = TASK___ADD_INPUT_DOCS__ELIST;

	/**
	 * The operation id for the '<em>Init Outputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___INIT_OUTPUTS = TASK___INIT_OUTPUTS;

	/**
	 * The operation id for the '<em>Add Output Doc</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___ADD_OUTPUT_DOC__DOC = TASK___ADD_OUTPUT_DOC__DOC;

	/**
	 * The operation id for the '<em>Add Output Docs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK___ADD_OUTPUT_DOCS__ELIST = TASK___ADD_OUTPUT_DOCS__ELIST;

	/**
	 * The number of operations of the '<em>Domain Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DOC__DOC = DOC_REF__DOC;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DOC__ROLE = DOC_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DOC_FEATURE_COUNT = DOC_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DOC_OPERATION_COUNT = DOC_REF_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT__DOC = TASK_DOC__DOC;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT__ROLE = TASK_DOC__ROLE;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT__CONSUMER = TASK_DOC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_FEATURE_COUNT = TASK_DOC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_OPERATION_COUNT = TASK_DOC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT__DOC = TASK_DOC__DOC;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT__ROLE = TASK_DOC__ROLE;

	/**
	 * The feature id for the '<em><b>Producer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT__PRODUCER = TASK_DOC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_FEATURE_COUNT = TASK_DOC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_OPERATION_COUNT = TASK_DOC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS__TASKS = 0;

	/**
	 * The number of structural features of the '<em>Tasks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tasks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCS__DOCS = 0;

	/**
	 * The number of structural features of the '<em>Docs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Garbage Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCS___GARBAGE_COLLECT = 0;

	/**
	 * The number of operations of the '<em>Docs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCS_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DOMAIN__DOCS = DOCS__DOCS;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DOMAIN__TASKS = DOCS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DOMAIN_FEATURE_COUNT = DOCS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Garbage Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DOMAIN___GARBAGE_COLLECT = DOCS___GARBAGE_COLLECT;

	/**
	 * The operation id for the '<em>Get New Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DOMAIN___GET_NEW_TASKS = DOCS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DOMAIN_OPERATION_COUNT = DOCS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.JobParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.JobParameterType
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getJobParameterType()
	 * @generated
	 */
	int JOB_PARAMETER_TYPE = 26;

	/**
	 * The meta object id for the '<em>Progress Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.ProgressFeedback
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getProgressFeedback()
	 * @generated
	 */
	int PROGRESS_FEEDBACK = 27;

	/**
	 * The meta object id for the '<em>Run Context</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.RunContext
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getRunContext()
	 * @generated
	 */
	int RUN_CONTEXT = 28;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 29;

	/**
	 * The meta object id for the '<em>Return Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.ReturnFeedback
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getReturnFeedback()
	 * @generated
	 */
	int RETURN_FEEDBACK = 30;

	/**
	 * The meta object id for the '<em>Enabled Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.EnabledFeedback
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getEnabledFeedback()
	 * @generated
	 */
	int ENABLED_FEEDBACK = 31;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.JobParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.misc.common.moplaf.job.JobParameter
	 * @generated
	 */
	EClass getJobParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.JobParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.job.JobParameter#getName()
	 * @see #getJobParameter()
	 * @generated
	 */
	EAttribute getJobParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.JobParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.misc.common.moplaf.job.JobParameter#getType()
	 * @see #getJobParameter()
	 * @generated
	 */
	EAttribute getJobParameter_Type();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.JobParameter#getJobAttribute <em>Job Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job Attribute</em>'.
	 * @see com.misc.common.moplaf.job.JobParameter#getJobAttribute()
	 * @see #getJobParameter()
	 * @generated
	 */
	EReference getJobParameter_JobAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.JobParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.job.JobParameter#getDescription()
	 * @see #getJobParameter()
	 * @generated
	 */
	EAttribute getJobParameter_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.RunParams <em>Run Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Params</em>'.
	 * @see com.misc.common.moplaf.job.RunParams
	 * @generated
	 */
	EClass getRunParams();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.RunParams#copyParams(com.misc.common.moplaf.job.RunParams) <em>Copy Params</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Params</em>' operation.
	 * @see com.misc.common.moplaf.job.RunParams#copyParams(com.misc.common.moplaf.job.RunParams)
	 * @generated
	 */
	EOperation getRunParams__CopyParams__RunParams();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run</em>'.
	 * @see com.misc.common.moplaf.job.Run
	 * @generated
	 */
	EClass getRun();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Run#getRunFeedback <em>Run Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Feedback</em>'.
	 * @see com.misc.common.moplaf.job.Run#getRunFeedback()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_RunFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Run#getCancelFeedback <em>Cancel Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Feedback</em>'.
	 * @see com.misc.common.moplaf.job.Run#getCancelFeedback()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_CancelFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Run#getResetFeedback <em>Reset Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Feedback</em>'.
	 * @see com.misc.common.moplaf.job.Run#getResetFeedback()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_ResetFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Run#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.misc.common.moplaf.job.Run#getLabel()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Label();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Run#isCancelled <em>Cancelled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancelled</em>'.
	 * @see com.misc.common.moplaf.job.Run#isCancelled()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Cancelled();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Run#isReturned <em>Returned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Returned</em>'.
	 * @see com.misc.common.moplaf.job.Run#isReturned()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Returned();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Run#isReturnSuccess <em>Return Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Success</em>'.
	 * @see com.misc.common.moplaf.job.Run#isReturnSuccess()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_ReturnSuccess();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Run#getReturnFeedback <em>Return Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Feedback</em>'.
	 * @see com.misc.common.moplaf.job.Run#getReturnFeedback()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_ReturnFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Run#getReturnInformation <em>Return Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Information</em>'.
	 * @see com.misc.common.moplaf.job.Run#getReturnInformation()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_ReturnInformation();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Run#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see com.misc.common.moplaf.job.Run#reset()
	 * @generated
	 */
	EOperation getRun__Reset();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Run#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see com.misc.common.moplaf.job.Run#run()
	 * @generated
	 */
	EOperation getRun__Run();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Run#run(com.misc.common.moplaf.job.RunContext) <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see com.misc.common.moplaf.job.Run#run(com.misc.common.moplaf.job.RunContext)
	 * @generated
	 */
	EOperation getRun__Run__RunContext();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Run#runAsynch(com.misc.common.moplaf.job.RunContext) <em>Run Asynch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run Asynch</em>' operation.
	 * @see com.misc.common.moplaf.job.Run#runAsynch(com.misc.common.moplaf.job.RunContext)
	 * @generated
	 */
	EOperation getRun__RunAsynch__RunContext();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Run#runAsynch(com.misc.common.moplaf.job.RunContext, boolean) <em>Run Asynch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run Asynch</em>' operation.
	 * @see com.misc.common.moplaf.job.Run#runAsynch(com.misc.common.moplaf.job.RunContext, boolean)
	 * @generated
	 */
	EOperation getRun__RunAsynch__RunContext_boolean();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Run#cancel() <em>Cancel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel</em>' operation.
	 * @see com.misc.common.moplaf.job.Run#cancel()
	 * @generated
	 */
	EOperation getRun__Cancel();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Run#setProgress(java.lang.String, float) <em>Set Progress</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Progress</em>' operation.
	 * @see com.misc.common.moplaf.job.Run#setProgress(java.lang.String, float)
	 * @generated
	 */
	EOperation getRun__SetProgress__String_float();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Run#setProgress(com.misc.common.moplaf.job.ProgressFeedback) <em>Set Progress</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Progress</em>' operation.
	 * @see com.misc.common.moplaf.job.Run#setProgress(com.misc.common.moplaf.job.ProgressFeedback)
	 * @generated
	 */
	EOperation getRun__SetProgress__ProgressFeedback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Run#getReturn() <em>Get Return</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Return</em>' operation.
	 * @see com.misc.common.moplaf.job.Run#getReturn()
	 * @generated
	 */
	EOperation getRun__GetReturn();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Run#setReturn(com.misc.common.moplaf.common.ReturnFeedback) <em>Set Return</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Return</em>' operation.
	 * @see com.misc.common.moplaf.job.Run#setReturn(com.misc.common.moplaf.common.ReturnFeedback)
	 * @generated
	 */
	EOperation getRun__SetReturn__ReturnFeedback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Run#constructParams() <em>Construct Params</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Params</em>' operation.
	 * @see com.misc.common.moplaf.job.Run#constructParams()
	 * @generated
	 */
	EOperation getRun__ConstructParams();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see com.misc.common.moplaf.job.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Job#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.misc.common.moplaf.job.Job#getStatus()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Status();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Job#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.job.Job#getDescription()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Job#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see com.misc.common.moplaf.job.Job#getStartTime()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Job#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see com.misc.common.moplaf.job.Job#getEndTime()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Job#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see com.misc.common.moplaf.job.Job#getDuration()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Duration();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Job#isStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see com.misc.common.moplaf.job.Job#isStarted()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Started();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Job#isFinished <em>Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished</em>'.
	 * @see com.misc.common.moplaf.job.Job#isFinished()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Finished();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.job.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.JobConsole <em>Console</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Console</em>'.
	 * @see com.misc.common.moplaf.job.JobConsole
	 * @generated
	 */
	EClass getJobConsole();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.JobConsole#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.misc.common.moplaf.job.JobConsole#getParameters()
	 * @see #getJobConsole()
	 * @generated
	 */
	EReference getJobConsole_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.JobConsole#getHelpText <em>Help Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help Text</em>'.
	 * @see com.misc.common.moplaf.job.JobConsole#getHelpText()
	 * @see #getJobConsole()
	 * @generated
	 */
	EAttribute getJobConsole_HelpText();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.common.moplaf.job.JobConsole#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see com.misc.common.moplaf.job.JobConsole#getArgs()
	 * @see #getJobConsole()
	 * @generated
	 */
	EAttribute getJobConsole_Args();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.JobConsole#addParameter(java.lang.String, com.misc.common.moplaf.job.JobParameterType, org.eclipse.emf.ecore.EAttribute, java.lang.String) <em>Add Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Parameter</em>' operation.
	 * @see com.misc.common.moplaf.job.JobConsole#addParameter(java.lang.String, com.misc.common.moplaf.job.JobParameterType, org.eclipse.emf.ecore.EAttribute, java.lang.String)
	 * @generated
	 */
	EOperation getJobConsole__AddParameter__String_JobParameterType_EAttribute_String();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.JobConsole#refreshParameters() <em>Refresh Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Parameters</em>' operation.
	 * @see com.misc.common.moplaf.job.JobConsole#refreshParameters()
	 * @generated
	 */
	EOperation getJobConsole__RefreshParameters();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.JobConsole#getArgAsString(int) <em>Get Arg As String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arg As String</em>' operation.
	 * @see com.misc.common.moplaf.job.JobConsole#getArgAsString(int)
	 * @generated
	 */
	EOperation getJobConsole__GetArgAsString__int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.JobConsole#getArgAsInt(int) <em>Get Arg As Int</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arg As Int</em>' operation.
	 * @see com.misc.common.moplaf.job.JobConsole#getArgAsInt(int)
	 * @generated
	 */
	EOperation getJobConsole__GetArgAsInt__int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.JobConsole#getArgAsFloat(int) <em>Get Arg As Float</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arg As Float</em>' operation.
	 * @see com.misc.common.moplaf.job.JobConsole#getArgAsFloat(int)
	 * @generated
	 */
	EOperation getJobConsole__GetArgAsFloat__int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.JobConsole#getArgAsDate(int) <em>Get Arg As Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arg As Date</em>' operation.
	 * @see com.misc.common.moplaf.job.JobConsole#getArgAsDate(int)
	 * @generated
	 */
	EOperation getJobConsole__GetArgAsDate__int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.JobConsole#getArgAsDate(int, java.lang.String) <em>Get Arg As Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arg As Date</em>' operation.
	 * @see com.misc.common.moplaf.job.JobConsole#getArgAsDate(int, java.lang.String)
	 * @generated
	 */
	EOperation getJobConsole__GetArgAsDate__int_String();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.JobConsole#setArgs() <em>Set Args</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Args</em>' operation.
	 * @see com.misc.common.moplaf.job.JobConsole#setArgs()
	 * @generated
	 */
	EOperation getJobConsole__SetArgs();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.JobFileHandler <em>File Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Handler</em>'.
	 * @see com.misc.common.moplaf.job.JobFileHandler
	 * @generated
	 */
	EClass getJobFileHandler();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.Runs <em>Runs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runs</em>'.
	 * @see com.misc.common.moplaf.job.Runs
	 * @generated
	 */
	EClass getRuns();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Runs#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.job.Runs#getName()
	 * @see #getRuns()
	 * @generated
	 */
	EAttribute getRuns_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.Runs#getRuns <em>Runs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runs</em>'.
	 * @see com.misc.common.moplaf.job.Runs#getRuns()
	 * @see #getRuns()
	 * @generated
	 */
	EReference getRuns_Runs();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see com.misc.common.moplaf.job.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.Task#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see com.misc.common.moplaf.job.Task#getOutputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.Task#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see com.misc.common.moplaf.job.Task#getInputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Inputs();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.job.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.job.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Task#addInputDoc(com.misc.common.moplaf.job.Doc) <em>Add Input Doc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Input Doc</em>' operation.
	 * @see com.misc.common.moplaf.job.Task#addInputDoc(com.misc.common.moplaf.job.Doc)
	 * @generated
	 */
	EOperation getTask__AddInputDoc__Doc();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Task#addInputDocs(org.eclipse.emf.common.util.EList) <em>Add Input Docs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Input Docs</em>' operation.
	 * @see com.misc.common.moplaf.job.Task#addInputDocs(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTask__AddInputDocs__EList();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Task#initOutputs() <em>Init Outputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Outputs</em>' operation.
	 * @see com.misc.common.moplaf.job.Task#initOutputs()
	 * @generated
	 */
	EOperation getTask__InitOutputs();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Task#addOutputDoc(com.misc.common.moplaf.job.Doc) <em>Add Output Doc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Output Doc</em>' operation.
	 * @see com.misc.common.moplaf.job.Task#addOutputDoc(com.misc.common.moplaf.job.Doc)
	 * @generated
	 */
	EOperation getTask__AddOutputDoc__Doc();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Task#addOutputDocs(org.eclipse.emf.common.util.EList) <em>Add Output Docs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Output Docs</em>' operation.
	 * @see com.misc.common.moplaf.job.Task#addOutputDocs(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTask__AddOutputDocs__EList();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.DomainTask <em>Domain Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Task</em>'.
	 * @see com.misc.common.moplaf.job.DomainTask
	 * @generated
	 */
	EClass getDomainTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.DomainTask#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see com.misc.common.moplaf.job.DomainTask#getDomain()
	 * @see #getDomainTask()
	 * @generated
	 */
	EReference getDomainTask_Domain();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.TaskDoc <em>Task Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Doc</em>'.
	 * @see com.misc.common.moplaf.job.TaskDoc
	 * @generated
	 */
	EClass getTaskDoc();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.TaskDoc#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see com.misc.common.moplaf.job.TaskDoc#getRole()
	 * @see #getTaskDoc()
	 * @generated
	 */
	EAttribute getTaskDoc_Role();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.TaskInput <em>Task Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Input</em>'.
	 * @see com.misc.common.moplaf.job.TaskInput
	 * @generated
	 */
	EClass getTaskInput();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.job.TaskInput#getConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Consumer</em>'.
	 * @see com.misc.common.moplaf.job.TaskInput#getConsumer()
	 * @see #getTaskInput()
	 * @generated
	 */
	EReference getTaskInput_Consumer();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.TaskOutput <em>Task Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Output</em>'.
	 * @see com.misc.common.moplaf.job.TaskOutput
	 * @generated
	 */
	EClass getTaskOutput();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.job.TaskOutput#getProducer <em>Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Producer</em>'.
	 * @see com.misc.common.moplaf.job.TaskOutput#getProducer()
	 * @see #getTaskOutput()
	 * @generated
	 */
	EReference getTaskOutput_Producer();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.Doc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc</em>'.
	 * @see com.misc.common.moplaf.job.Doc
	 * @generated
	 */
	EClass getDoc();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.job.Doc#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refs</em>'.
	 * @see com.misc.common.moplaf.job.Doc#getRefs()
	 * @see #getDoc()
	 * @generated
	 */
	EReference getDoc_Refs();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Doc#isLoaded <em>Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loaded</em>'.
	 * @see com.misc.common.moplaf.job.Doc#isLoaded()
	 * @see #getDoc()
	 * @generated
	 */
	EAttribute getDoc_Loaded();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Doc#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.job.Doc#getDescription()
	 * @see #getDoc()
	 * @generated
	 */
	EAttribute getDoc_Description();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Doc#save() <em>Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save</em>' operation.
	 * @see com.misc.common.moplaf.job.Doc#save()
	 * @generated
	 */
	EOperation getDoc__Save();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Doc#load() <em>Load</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load</em>' operation.
	 * @see com.misc.common.moplaf.job.Doc#load()
	 * @generated
	 */
	EOperation getDoc__Load();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Doc#flush() <em>Flush</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Flush</em>' operation.
	 * @see com.misc.common.moplaf.job.Doc#flush()
	 * @generated
	 */
	EOperation getDoc__Flush();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.DocRef <em>Doc Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Ref</em>'.
	 * @see com.misc.common.moplaf.job.DocRef
	 * @generated
	 */
	EClass getDocRef();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.DocRef#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Doc</em>'.
	 * @see com.misc.common.moplaf.job.DocRef#getDoc()
	 * @see #getDocRef()
	 * @generated
	 */
	EReference getDocRef_Doc();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.Tasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tasks</em>'.
	 * @see com.misc.common.moplaf.job.Tasks
	 * @generated
	 */
	EClass getTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.Tasks#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see com.misc.common.moplaf.job.Tasks#getTasks()
	 * @see #getTasks()
	 * @generated
	 */
	EReference getTasks_Tasks();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.Docs <em>Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docs</em>'.
	 * @see com.misc.common.moplaf.job.Docs
	 * @generated
	 */
	EClass getDocs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.Docs#getDocs <em>Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Docs</em>'.
	 * @see com.misc.common.moplaf.job.Docs#getDocs()
	 * @see #getDocs()
	 * @generated
	 */
	EReference getDocs_Docs();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Docs#garbageCollect() <em>Garbage Collect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Garbage Collect</em>' operation.
	 * @see com.misc.common.moplaf.job.Docs#garbageCollect()
	 * @generated
	 */
	EOperation getDocs__GarbageCollect();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.TaskDomain <em>Task Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Domain</em>'.
	 * @see com.misc.common.moplaf.job.TaskDomain
	 * @generated
	 */
	EClass getTaskDomain();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.TaskDomain#getNewTasks() <em>Get New Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Tasks</em>' operation.
	 * @see com.misc.common.moplaf.job.TaskDomain#getNewTasks()
	 * @generated
	 */
	EOperation getTaskDomain__GetNewTasks();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.DocsHolder <em>Docs Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docs Holder</em>'.
	 * @see com.misc.common.moplaf.job.DocsHolder
	 * @generated
	 */
	EClass getDocsHolder();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.DocsHolder#getDocs <em>Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Docs</em>'.
	 * @see com.misc.common.moplaf.job.DocsHolder#getDocs()
	 * @see #getDocsHolder()
	 * @generated
	 */
	EReference getDocsHolder_Docs();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.DocsHolder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.job.DocsHolder#getName()
	 * @see #getDocsHolder()
	 * @generated
	 */
	EAttribute getDocsHolder_Name();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.DocsHolder#addDoc(com.misc.common.moplaf.job.Doc) <em>Add Doc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Doc</em>' operation.
	 * @see com.misc.common.moplaf.job.DocsHolder#addDoc(com.misc.common.moplaf.job.Doc)
	 * @generated
	 */
	EOperation getDocsHolder__AddDoc__Doc();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.DocsHolder#addDocs(org.eclipse.emf.common.util.EList) <em>Add Docs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Docs</em>' operation.
	 * @see com.misc.common.moplaf.job.DocsHolder#addDocs(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDocsHolder__AddDocs__EList();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.CompoundDoc <em>Compound Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Doc</em>'.
	 * @see com.misc.common.moplaf.job.CompoundDoc
	 * @generated
	 */
	EClass getCompoundDoc();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.DocInDocsHolder <em>Doc In Docs Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc In Docs Holder</em>'.
	 * @see com.misc.common.moplaf.job.DocInDocsHolder
	 * @generated
	 */
	EClass getDocInDocsHolder();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.job.DocInDocsHolder#getDocsHolder <em>Docs Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Docs Holder</em>'.
	 * @see com.misc.common.moplaf.job.DocInDocsHolder#getDocsHolder()
	 * @see #getDocInDocsHolder()
	 * @generated
	 */
	EReference getDocInDocsHolder_DocsHolder();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.Setter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setter</em>'.
	 * @see com.misc.common.moplaf.job.Setter
	 * @generated
	 */
	EClass getSetter();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.Setter#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see com.misc.common.moplaf.job.Setter#getFeatures()
	 * @see #getSetter()
	 * @generated
	 */
	EReference getSetter_Features();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Setter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.job.Setter#getName()
	 * @see #getSetter()
	 * @generated
	 */
	EAttribute getSetter_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.Setter#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see com.misc.common.moplaf.job.Setter#getRemarks()
	 * @see #getSetter()
	 * @generated
	 */
	EAttribute getSetter_Remarks();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.Setter#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Class</em>'.
	 * @see com.misc.common.moplaf.job.Setter#getTargetClass()
	 * @see #getSetter()
	 * @generated
	 */
	EReference getSetter_TargetClass();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Setter#accept(org.eclipse.emf.ecore.EObject) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see com.misc.common.moplaf.job.Setter#accept(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSetter__Accept__EObject();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.Setter#init(org.eclipse.emf.ecore.EObject) <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see com.misc.common.moplaf.job.Setter#init(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSetter__Init__EObject();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.SetterStructuralFeature <em>Setter Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setter Structural Feature</em>'.
	 * @see com.misc.common.moplaf.job.SetterStructuralFeature
	 * @generated
	 */
	EClass getSetterStructuralFeature();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.job.SetterStructuralFeature#getSetter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Setter</em>'.
	 * @see com.misc.common.moplaf.job.SetterStructuralFeature#getSetter()
	 * @see #getSetterStructuralFeature()
	 * @generated
	 */
	EReference getSetterStructuralFeature_Setter();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.SetterStructuralFeature#getFeatureToSet <em>Feature To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature To Set</em>'.
	 * @see com.misc.common.moplaf.job.SetterStructuralFeature#getFeatureToSet()
	 * @see #getSetterStructuralFeature()
	 * @generated
	 */
	EReference getSetterStructuralFeature_FeatureToSet();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.SetterStructuralFeature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.job.SetterStructuralFeature#getDescription()
	 * @see #getSetterStructuralFeature()
	 * @generated
	 */
	EAttribute getSetterStructuralFeature_Description();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.SetterStructuralFeature#accept(org.eclipse.emf.ecore.EObject) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see com.misc.common.moplaf.job.SetterStructuralFeature#accept(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSetterStructuralFeature__Accept__EObject();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.SetterAttribute <em>Setter Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setter Attribute</em>'.
	 * @see com.misc.common.moplaf.job.SetterAttribute
	 * @generated
	 */
	EClass getSetterAttribute();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.job.SetterAttribute#getAttributeToSet <em>Attribute To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute To Set</em>'.
	 * @see com.misc.common.moplaf.job.SetterAttribute#getAttributeToSet()
	 * @see #getSetterAttribute()
	 * @generated
	 */
	EReference getSetterAttribute_AttributeToSet();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.SetterAttributeInt <em>Setter Attribute Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setter Attribute Int</em>'.
	 * @see com.misc.common.moplaf.job.SetterAttributeInt
	 * @generated
	 */
	EClass getSetterAttributeInt();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.SetterAttributeInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.misc.common.moplaf.job.SetterAttributeInt#getValue()
	 * @see #getSetterAttributeInt()
	 * @generated
	 */
	EAttribute getSetterAttributeInt_Value();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.SetterAttributeFloat <em>Setter Attribute Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setter Attribute Float</em>'.
	 * @see com.misc.common.moplaf.job.SetterAttributeFloat
	 * @generated
	 */
	EClass getSetterAttributeFloat();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.SetterAttributeFloat#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.misc.common.moplaf.job.SetterAttributeFloat#getValue()
	 * @see #getSetterAttributeFloat()
	 * @generated
	 */
	EAttribute getSetterAttributeFloat_Value();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.ParamsHolder <em>Params Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Params Holder</em>'.
	 * @see com.misc.common.moplaf.job.ParamsHolder
	 * @generated
	 */
	EClass getParamsHolder();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.job.ParamsHolder#getRunsParams <em>Runs Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runs Params</em>'.
	 * @see com.misc.common.moplaf.job.ParamsHolder#getRunsParams()
	 * @see #getParamsHolder()
	 * @generated
	 */
	EReference getParamsHolder_RunsParams();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.job.ParamsHolder#constructParams(com.misc.common.moplaf.job.Run) <em>Construct Params</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Params</em>' operation.
	 * @see com.misc.common.moplaf.job.ParamsHolder#constructParams(com.misc.common.moplaf.job.Run)
	 * @generated
	 */
	EOperation getParamsHolder__ConstructParams__Run();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.job.JobParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see com.misc.common.moplaf.job.JobParameterType
	 * @generated
	 */
	EEnum getJobParameterType();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.job.ProgressFeedback <em>Progress Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Progress Feedback</em>'.
	 * @see com.misc.common.moplaf.job.ProgressFeedback
	 * @model instanceClass="com.misc.common.moplaf.job.ProgressFeedback"
	 * @generated
	 */
	EDataType getProgressFeedback();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.job.RunContext <em>Run Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Run Context</em>'.
	 * @see com.misc.common.moplaf.job.RunContext
	 * @model instanceClass="com.misc.common.moplaf.job.RunContext"
	 * @generated
	 */
	EDataType getRunContext();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.common.ReturnFeedback <em>Return Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Return Feedback</em>'.
	 * @see com.misc.common.moplaf.common.ReturnFeedback
	 * @model instanceClass="com.misc.common.moplaf.common.ReturnFeedback"
	 * @generated
	 */
	EDataType getReturnFeedback();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.common.EnabledFeedback <em>Enabled Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enabled Feedback</em>'.
	 * @see com.misc.common.moplaf.common.EnabledFeedback
	 * @model instanceClass="com.misc.common.moplaf.common.EnabledFeedback"
	 * @generated
	 */
	EDataType getEnabledFeedback();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JobFactory getJobFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.JobParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.JobParameterImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getJobParameter()
		 * @generated
		 */
		EClass JOB_PARAMETER = eINSTANCE.getJobParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_PARAMETER__NAME = eINSTANCE.getJobParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_PARAMETER__TYPE = eINSTANCE.getJobParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Job Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_PARAMETER__JOB_ATTRIBUTE = eINSTANCE.getJobParameter_JobAttribute();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_PARAMETER__DESCRIPTION = eINSTANCE.getJobParameter_Description();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.RunParamsImpl <em>Run Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.RunParamsImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getRunParams()
		 * @generated
		 */
		EClass RUN_PARAMS = eINSTANCE.getRunParams();

		/**
		 * The meta object literal for the '<em><b>Copy Params</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN_PARAMS___COPY_PARAMS__RUNPARAMS = eINSTANCE.getRunParams__CopyParams__RunParams();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.RunImpl <em>Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.RunImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getRun()
		 * @generated
		 */
		EClass RUN = eINSTANCE.getRun();

		/**
		 * The meta object literal for the '<em><b>Run Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__RUN_FEEDBACK = eINSTANCE.getRun_RunFeedback();

		/**
		 * The meta object literal for the '<em><b>Cancel Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__CANCEL_FEEDBACK = eINSTANCE.getRun_CancelFeedback();

		/**
		 * The meta object literal for the '<em><b>Reset Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__RESET_FEEDBACK = eINSTANCE.getRun_ResetFeedback();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__LABEL = eINSTANCE.getRun_Label();

		/**
		 * The meta object literal for the '<em><b>Cancelled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__CANCELLED = eINSTANCE.getRun_Cancelled();

		/**
		 * The meta object literal for the '<em><b>Returned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__RETURNED = eINSTANCE.getRun_Returned();

		/**
		 * The meta object literal for the '<em><b>Return Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__RETURN_SUCCESS = eINSTANCE.getRun_ReturnSuccess();

		/**
		 * The meta object literal for the '<em><b>Return Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__RETURN_FEEDBACK = eINSTANCE.getRun_ReturnFeedback();

		/**
		 * The meta object literal for the '<em><b>Return Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__RETURN_INFORMATION = eINSTANCE.getRun_ReturnInformation();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN___RESET = eINSTANCE.getRun__Reset();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN___RUN = eINSTANCE.getRun__Run();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN___RUN__RUNCONTEXT = eINSTANCE.getRun__Run__RunContext();

		/**
		 * The meta object literal for the '<em><b>Run Asynch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN___RUN_ASYNCH__RUNCONTEXT = eINSTANCE.getRun__RunAsynch__RunContext();

		/**
		 * The meta object literal for the '<em><b>Run Asynch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN___RUN_ASYNCH__RUNCONTEXT_BOOLEAN = eINSTANCE.getRun__RunAsynch__RunContext_boolean();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN___CANCEL = eINSTANCE.getRun__Cancel();

		/**
		 * The meta object literal for the '<em><b>Set Progress</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN___SET_PROGRESS__STRING_FLOAT = eINSTANCE.getRun__SetProgress__String_float();

		/**
		 * The meta object literal for the '<em><b>Set Progress</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN___SET_PROGRESS__PROGRESSFEEDBACK = eINSTANCE.getRun__SetProgress__ProgressFeedback();

		/**
		 * The meta object literal for the '<em><b>Get Return</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN___GET_RETURN = eINSTANCE.getRun__GetReturn();

		/**
		 * The meta object literal for the '<em><b>Set Return</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN___SET_RETURN__RETURNFEEDBACK = eINSTANCE.getRun__SetReturn__ReturnFeedback();

		/**
		 * The meta object literal for the '<em><b>Construct Params</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN___CONSTRUCT_PARAMS = eINSTANCE.getRun__ConstructParams();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.JobImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__STATUS = eINSTANCE.getJob_Status();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__DESCRIPTION = eINSTANCE.getJob_Description();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__START_TIME = eINSTANCE.getJob_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__END_TIME = eINSTANCE.getJob_EndTime();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__DURATION = eINSTANCE.getJob_Duration();

		/**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__STARTED = eINSTANCE.getJob_Started();

		/**
		 * The meta object literal for the '<em><b>Finished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__FINISHED = eINSTANCE.getJob_Finished();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NAME = eINSTANCE.getJob_Name();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.JobConsoleImpl <em>Console</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.JobConsoleImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getJobConsole()
		 * @generated
		 */
		EClass JOB_CONSOLE = eINSTANCE.getJobConsole();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_CONSOLE__PARAMETERS = eINSTANCE.getJobConsole_Parameters();

		/**
		 * The meta object literal for the '<em><b>Help Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_CONSOLE__HELP_TEXT = eINSTANCE.getJobConsole_HelpText();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_CONSOLE__ARGS = eINSTANCE.getJobConsole_Args();

		/**
		 * The meta object literal for the '<em><b>Add Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_CONSOLE___ADD_PARAMETER__STRING_JOBPARAMETERTYPE_EATTRIBUTE_STRING = eINSTANCE.getJobConsole__AddParameter__String_JobParameterType_EAttribute_String();

		/**
		 * The meta object literal for the '<em><b>Refresh Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_CONSOLE___REFRESH_PARAMETERS = eINSTANCE.getJobConsole__RefreshParameters();

		/**
		 * The meta object literal for the '<em><b>Get Arg As String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_CONSOLE___GET_ARG_AS_STRING__INT = eINSTANCE.getJobConsole__GetArgAsString__int();

		/**
		 * The meta object literal for the '<em><b>Get Arg As Int</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_CONSOLE___GET_ARG_AS_INT__INT = eINSTANCE.getJobConsole__GetArgAsInt__int();

		/**
		 * The meta object literal for the '<em><b>Get Arg As Float</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_CONSOLE___GET_ARG_AS_FLOAT__INT = eINSTANCE.getJobConsole__GetArgAsFloat__int();

		/**
		 * The meta object literal for the '<em><b>Get Arg As Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_CONSOLE___GET_ARG_AS_DATE__INT = eINSTANCE.getJobConsole__GetArgAsDate__int();

		/**
		 * The meta object literal for the '<em><b>Get Arg As Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_CONSOLE___GET_ARG_AS_DATE__INT_STRING = eINSTANCE.getJobConsole__GetArgAsDate__int_String();

		/**
		 * The meta object literal for the '<em><b>Set Args</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB_CONSOLE___SET_ARGS = eINSTANCE.getJobConsole__SetArgs();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.JobFileHandlerImpl <em>File Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.JobFileHandlerImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getJobFileHandler()
		 * @generated
		 */
		EClass JOB_FILE_HANDLER = eINSTANCE.getJobFileHandler();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.RunsImpl <em>Runs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.RunsImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getRuns()
		 * @generated
		 */
		EClass RUNS = eINSTANCE.getRuns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNS__NAME = eINSTANCE.getRuns_Name();

		/**
		 * The meta object literal for the '<em><b>Runs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNS__RUNS = eINSTANCE.getRuns_Runs();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.TaskImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTPUTS = eINSTANCE.getTask_Outputs();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUTS = eINSTANCE.getTask_Inputs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Add Input Doc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___ADD_INPUT_DOC__DOC = eINSTANCE.getTask__AddInputDoc__Doc();

		/**
		 * The meta object literal for the '<em><b>Add Input Docs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___ADD_INPUT_DOCS__ELIST = eINSTANCE.getTask__AddInputDocs__EList();

		/**
		 * The meta object literal for the '<em><b>Init Outputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___INIT_OUTPUTS = eINSTANCE.getTask__InitOutputs();

		/**
		 * The meta object literal for the '<em><b>Add Output Doc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___ADD_OUTPUT_DOC__DOC = eINSTANCE.getTask__AddOutputDoc__Doc();

		/**
		 * The meta object literal for the '<em><b>Add Output Docs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___ADD_OUTPUT_DOCS__ELIST = eINSTANCE.getTask__AddOutputDocs__EList();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.DomainTaskImpl <em>Domain Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.DomainTaskImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getDomainTask()
		 * @generated
		 */
		EClass DOMAIN_TASK = eINSTANCE.getDomainTask();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TASK__DOMAIN = eINSTANCE.getDomainTask_Domain();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.TaskDocImpl <em>Task Doc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.TaskDocImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getTaskDoc()
		 * @generated
		 */
		EClass TASK_DOC = eINSTANCE.getTaskDoc();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_DOC__ROLE = eINSTANCE.getTaskDoc_Role();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.TaskInputImpl <em>Task Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.TaskInputImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getTaskInput()
		 * @generated
		 */
		EClass TASK_INPUT = eINSTANCE.getTaskInput();

		/**
		 * The meta object literal for the '<em><b>Consumer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INPUT__CONSUMER = eINSTANCE.getTaskInput_Consumer();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.TaskOutputImpl <em>Task Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.TaskOutputImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getTaskOutput()
		 * @generated
		 */
		EClass TASK_OUTPUT = eINSTANCE.getTaskOutput();

		/**
		 * The meta object literal for the '<em><b>Producer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_OUTPUT__PRODUCER = eINSTANCE.getTaskOutput_Producer();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.DocImpl <em>Doc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.DocImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getDoc()
		 * @generated
		 */
		EClass DOC = eINSTANCE.getDoc();

		/**
		 * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC__REFS = eINSTANCE.getDoc_Refs();

		/**
		 * The meta object literal for the '<em><b>Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOC__LOADED = eINSTANCE.getDoc_Loaded();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOC__DESCRIPTION = eINSTANCE.getDoc_Description();

		/**
		 * The meta object literal for the '<em><b>Save</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOC___SAVE = eINSTANCE.getDoc__Save();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOC___LOAD = eINSTANCE.getDoc__Load();

		/**
		 * The meta object literal for the '<em><b>Flush</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOC___FLUSH = eINSTANCE.getDoc__Flush();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.DocRefImpl <em>Doc Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.DocRefImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getDocRef()
		 * @generated
		 */
		EClass DOC_REF = eINSTANCE.getDocRef();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_REF__DOC = eINSTANCE.getDocRef_Doc();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.TasksImpl <em>Tasks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.TasksImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getTasks()
		 * @generated
		 */
		EClass TASKS = eINSTANCE.getTasks();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKS__TASKS = eINSTANCE.getTasks_Tasks();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.DocsImpl <em>Docs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.DocsImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getDocs()
		 * @generated
		 */
		EClass DOCS = eINSTANCE.getDocs();

		/**
		 * The meta object literal for the '<em><b>Docs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCS__DOCS = eINSTANCE.getDocs_Docs();

		/**
		 * The meta object literal for the '<em><b>Garbage Collect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCS___GARBAGE_COLLECT = eINSTANCE.getDocs__GarbageCollect();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.TaskDomainImpl <em>Task Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.TaskDomainImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getTaskDomain()
		 * @generated
		 */
		EClass TASK_DOMAIN = eINSTANCE.getTaskDomain();

		/**
		 * The meta object literal for the '<em><b>Get New Tasks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_DOMAIN___GET_NEW_TASKS = eINSTANCE.getTaskDomain__GetNewTasks();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.DocsHolderImpl <em>Docs Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.DocsHolderImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getDocsHolder()
		 * @generated
		 */
		EClass DOCS_HOLDER = eINSTANCE.getDocsHolder();

		/**
		 * The meta object literal for the '<em><b>Docs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCS_HOLDER__DOCS = eINSTANCE.getDocsHolder_Docs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCS_HOLDER__NAME = eINSTANCE.getDocsHolder_Name();

		/**
		 * The meta object literal for the '<em><b>Add Doc</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCS_HOLDER___ADD_DOC__DOC = eINSTANCE.getDocsHolder__AddDoc__Doc();

		/**
		 * The meta object literal for the '<em><b>Add Docs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCS_HOLDER___ADD_DOCS__ELIST = eINSTANCE.getDocsHolder__AddDocs__EList();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.CompoundDocImpl <em>Compound Doc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.CompoundDocImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getCompoundDoc()
		 * @generated
		 */
		EClass COMPOUND_DOC = eINSTANCE.getCompoundDoc();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.DocInDocsHolderImpl <em>Doc In Docs Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.DocInDocsHolderImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getDocInDocsHolder()
		 * @generated
		 */
		EClass DOC_IN_DOCS_HOLDER = eINSTANCE.getDocInDocsHolder();

		/**
		 * The meta object literal for the '<em><b>Docs Holder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_IN_DOCS_HOLDER__DOCS_HOLDER = eINSTANCE.getDocInDocsHolder_DocsHolder();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.SetterImpl <em>Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.SetterImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getSetter()
		 * @generated
		 */
		EClass SETTER = eINSTANCE.getSetter();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTER__FEATURES = eINSTANCE.getSetter_Features();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTER__NAME = eINSTANCE.getSetter_Name();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTER__REMARKS = eINSTANCE.getSetter_Remarks();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTER__TARGET_CLASS = eINSTANCE.getSetter_TargetClass();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SETTER___ACCEPT__EOBJECT = eINSTANCE.getSetter__Accept__EObject();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SETTER___INIT__EOBJECT = eINSTANCE.getSetter__Init__EObject();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.SetterStructuralFeatureImpl <em>Setter Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.SetterStructuralFeatureImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getSetterStructuralFeature()
		 * @generated
		 */
		EClass SETTER_STRUCTURAL_FEATURE = eINSTANCE.getSetterStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Setter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTER_STRUCTURAL_FEATURE__SETTER = eINSTANCE.getSetterStructuralFeature_Setter();

		/**
		 * The meta object literal for the '<em><b>Feature To Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTER_STRUCTURAL_FEATURE__FEATURE_TO_SET = eINSTANCE.getSetterStructuralFeature_FeatureToSet();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTER_STRUCTURAL_FEATURE__DESCRIPTION = eINSTANCE.getSetterStructuralFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SETTER_STRUCTURAL_FEATURE___ACCEPT__EOBJECT = eINSTANCE.getSetterStructuralFeature__Accept__EObject();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.SetterAttributeImpl <em>Setter Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.SetterAttributeImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getSetterAttribute()
		 * @generated
		 */
		EClass SETTER_ATTRIBUTE = eINSTANCE.getSetterAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute To Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTER_ATTRIBUTE__ATTRIBUTE_TO_SET = eINSTANCE.getSetterAttribute_AttributeToSet();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.SetterAttributeIntImpl <em>Setter Attribute Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.SetterAttributeIntImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getSetterAttributeInt()
		 * @generated
		 */
		EClass SETTER_ATTRIBUTE_INT = eINSTANCE.getSetterAttributeInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTER_ATTRIBUTE_INT__VALUE = eINSTANCE.getSetterAttributeInt_Value();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.SetterAttributeFloatImpl <em>Setter Attribute Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.SetterAttributeFloatImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getSetterAttributeFloat()
		 * @generated
		 */
		EClass SETTER_ATTRIBUTE_FLOAT = eINSTANCE.getSetterAttributeFloat();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTER_ATTRIBUTE_FLOAT__VALUE = eINSTANCE.getSetterAttributeFloat_Value();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.impl.ParamsHolderImpl <em>Params Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.impl.ParamsHolderImpl
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getParamsHolder()
		 * @generated
		 */
		EClass PARAMS_HOLDER = eINSTANCE.getParamsHolder();

		/**
		 * The meta object literal for the '<em><b>Runs Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMS_HOLDER__RUNS_PARAMS = eINSTANCE.getParamsHolder_RunsParams();

		/**
		 * The meta object literal for the '<em><b>Construct Params</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMS_HOLDER___CONSTRUCT_PARAMS__RUN = eINSTANCE.getParamsHolder__ConstructParams__Run();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.JobParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.JobParameterType
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getJobParameterType()
		 * @generated
		 */
		EEnum JOB_PARAMETER_TYPE = eINSTANCE.getJobParameterType();

		/**
		 * The meta object literal for the '<em>Progress Feedback</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.ProgressFeedback
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getProgressFeedback()
		 * @generated
		 */
		EDataType PROGRESS_FEEDBACK = eINSTANCE.getProgressFeedback();

		/**
		 * The meta object literal for the '<em>Run Context</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.RunContext
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getRunContext()
		 * @generated
		 */
		EDataType RUN_CONTEXT = eINSTANCE.getRunContext();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>Return Feedback</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.ReturnFeedback
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getReturnFeedback()
		 * @generated
		 */
		EDataType RETURN_FEEDBACK = eINSTANCE.getReturnFeedback();

		/**
		 * The meta object literal for the '<em>Enabled Feedback</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.EnabledFeedback
		 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getEnabledFeedback()
		 * @generated
		 */
		EDataType ENABLED_FEEDBACK = eINSTANCE.getEnabledFeedback();

	}

} //JobPackage
