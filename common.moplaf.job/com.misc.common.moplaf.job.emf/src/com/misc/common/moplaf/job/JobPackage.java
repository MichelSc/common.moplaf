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
	 * The meta object id for the '{@link com.misc.common.moplaf.job.JobParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.JobParameterType
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getJobParameterType()
	 * @generated
	 */
	int JOB_PARAMETER_TYPE = 11;

	/**
	 * The meta object id for the '<em>Progress Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.ProgressFeedback
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getProgressFeedback()
	 * @generated
	 */
	int PROGRESS_FEEDBACK = 12;

	/**
	 * The meta object id for the '<em>Run Context</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.RunContext
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getRunContext()
	 * @generated
	 */
	int RUN_CONTEXT = 13;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 14;

	/**
	 * The meta object id for the '<em>Return Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.ReturnFeedback
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getReturnFeedback()
	 * @generated
	 */
	int RETURN_FEEDBACK = 15;

	/**
	 * The meta object id for the '<em>Enabled Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.EnabledFeedback
	 * @see com.misc.common.moplaf.job.impl.JobPackageImpl#getEnabledFeedback()
	 * @generated
	 */
	int ENABLED_FEEDBACK = 16;


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
