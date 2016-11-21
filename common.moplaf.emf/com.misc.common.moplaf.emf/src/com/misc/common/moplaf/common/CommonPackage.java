/**
 */
package com.misc.common.moplaf.common;

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
 * @see com.misc.common.moplaf.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/common/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cmn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = com.misc.common.moplaf.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.common.impl.RunImpl <em>Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.impl.RunImpl
	 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getRun()
	 * @generated
	 */
	int RUN = 1;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__CANCELED = 0;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RUN_FEEDBACK = 1;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__CANCEL_FEEDBACK = 2;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RETURN_SUCCESS = 3;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RETURN_FEEDBACK = 4;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RETURN_INFORMATION = 5;

	/**
	 * The number of structural features of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___RUN = 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___RUN__RUNCONTEXT = 1;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___CANCEL = 2;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___SET_PROGRESS__STRING_FLOAT = 3;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___SET_PROGRESS__PROGRESSFEEDBACK = 4;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___GET_RETURN = 5;

	/**
	 * The number of operations of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.common.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.impl.JobImpl
	 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 0;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CANCELED = RUN__CANCELED;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = RUN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STATUS = RUN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DESCRIPTION = RUN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Help Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__HELP_TEXT = RUN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__START_TIME = RUN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__END_TIME = RUN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DURATION = RUN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CREATED = RUN_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RUNNING = RUN_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STOPPED = RUN_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__FINISHED = RUN_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ARGS = RUN_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PARAMETERS = RUN_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = RUN_FEATURE_COUNT + 13;

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
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_RETURN = RUN___GET_RETURN;

	/**
	 * The operation id for the '<em>Add Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___ADD_PARAMETER__STRING_JOBPARAMETERTYPE_EATTRIBUTE_STRING = RUN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___REFRESH_PARAMETERS = RUN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Arg As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_ARG_AS_STRING__INT = RUN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Arg As Int</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_ARG_AS_INT__INT = RUN_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Arg As Float</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_ARG_AS_FLOAT__INT = RUN_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Arg As Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_ARG_AS_DATE__INT = RUN_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Arg As Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_ARG_AS_DATE__INT_STRING = RUN_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Args</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___SET_ARGS = RUN_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = RUN_OPERATION_COUNT + 8;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.common.impl.JobParameterImpl <em>Job Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.impl.JobParameterImpl
	 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getJobParameter()
	 * @generated
	 */
	int JOB_PARAMETER = 2;

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
	 * The number of structural features of the '<em>Job Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Job Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Run Context</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.RunContext
	 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getRunContext()
	 * @generated
	 */
	int RUN_CONTEXT = 8;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.common.JobParameterType <em>Job Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.JobParameterType
	 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getJobParameterType()
	 * @generated
	 */
	int JOB_PARAMETER_TYPE = 3;

	/**
	 * The meta object id for the '<em>Enabled Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.EnabledFeedback
	 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getEnabledFeedback()
	 * @generated
	 */
	int ENABLED_FEEDBACK = 4;

	/**
	 * The meta object id for the '<em>Return Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.ReturnFeedback
	 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getReturnFeedback()
	 * @generated
	 */
	int RETURN_FEEDBACK = 5;


	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 6;


	/**
	 * The meta object id for the '<em>Progress Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.ProgressFeedback
	 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getProgressFeedback()
	 * @generated
	 */
	int PROGRESS_FEEDBACK = 7;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.common.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see com.misc.common.moplaf.common.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.common.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Job#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.misc.common.moplaf.common.Job#getStatus()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Status();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Job#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.common.Job#getDescription()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Job#getHelpText <em>Help Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help Text</em>'.
	 * @see com.misc.common.moplaf.common.Job#getHelpText()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_HelpText();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Job#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see com.misc.common.moplaf.common.Job#getStartTime()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Job#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see com.misc.common.moplaf.common.Job#getEndTime()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Job#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see com.misc.common.moplaf.common.Job#getDuration()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Duration();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Job#isCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see com.misc.common.moplaf.common.Job#isCreated()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Created();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Job#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see com.misc.common.moplaf.common.Job#isRunning()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Running();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Job#isStopped <em>Stopped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stopped</em>'.
	 * @see com.misc.common.moplaf.common.Job#isStopped()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Stopped();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Job#isFinished <em>Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished</em>'.
	 * @see com.misc.common.moplaf.common.Job#isFinished()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Finished();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.common.moplaf.common.Job#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see com.misc.common.moplaf.common.Job#getArgs()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Args();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.common.Job#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.misc.common.moplaf.common.Job#getParameters()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Parameters();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Job#addParameter(java.lang.String, com.misc.common.moplaf.common.JobParameterType, org.eclipse.emf.ecore.EAttribute, java.lang.String) <em>Add Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Parameter</em>' operation.
	 * @see com.misc.common.moplaf.common.Job#addParameter(java.lang.String, com.misc.common.moplaf.common.JobParameterType, org.eclipse.emf.ecore.EAttribute, java.lang.String)
	 * @generated
	 */
	EOperation getJob__AddParameter__String_JobParameterType_EAttribute_String();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Job#refreshParameters() <em>Refresh Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Parameters</em>' operation.
	 * @see com.misc.common.moplaf.common.Job#refreshParameters()
	 * @generated
	 */
	EOperation getJob__RefreshParameters();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Job#getArgAsString(int) <em>Get Arg As String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arg As String</em>' operation.
	 * @see com.misc.common.moplaf.common.Job#getArgAsString(int)
	 * @generated
	 */
	EOperation getJob__GetArgAsString__int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Job#getArgAsInt(int) <em>Get Arg As Int</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arg As Int</em>' operation.
	 * @see com.misc.common.moplaf.common.Job#getArgAsInt(int)
	 * @generated
	 */
	EOperation getJob__GetArgAsInt__int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Job#getArgAsFloat(int) <em>Get Arg As Float</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arg As Float</em>' operation.
	 * @see com.misc.common.moplaf.common.Job#getArgAsFloat(int)
	 * @generated
	 */
	EOperation getJob__GetArgAsFloat__int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Job#getArgAsDate(int) <em>Get Arg As Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arg As Date</em>' operation.
	 * @see com.misc.common.moplaf.common.Job#getArgAsDate(int)
	 * @generated
	 */
	EOperation getJob__GetArgAsDate__int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Job#getArgAsDate(int, java.lang.String) <em>Get Arg As Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arg As Date</em>' operation.
	 * @see com.misc.common.moplaf.common.Job#getArgAsDate(int, java.lang.String)
	 * @generated
	 */
	EOperation getJob__GetArgAsDate__int_String();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Job#setArgs() <em>Set Args</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Args</em>' operation.
	 * @see com.misc.common.moplaf.common.Job#setArgs()
	 * @generated
	 */
	EOperation getJob__SetArgs();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.common.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run</em>'.
	 * @see com.misc.common.moplaf.common.Run
	 * @generated
	 */
	EClass getRun();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Run#isCanceled <em>Canceled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canceled</em>'.
	 * @see com.misc.common.moplaf.common.Run#isCanceled()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Canceled();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Run#getRunFeedback <em>Run Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Feedback</em>'.
	 * @see com.misc.common.moplaf.common.Run#getRunFeedback()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_RunFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Run#getCancelFeedback <em>Cancel Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Feedback</em>'.
	 * @see com.misc.common.moplaf.common.Run#getCancelFeedback()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_CancelFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Run#isReturnSuccess <em>Return Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Success</em>'.
	 * @see com.misc.common.moplaf.common.Run#isReturnSuccess()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_ReturnSuccess();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Run#getReturnFeedback <em>Return Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Feedback</em>'.
	 * @see com.misc.common.moplaf.common.Run#getReturnFeedback()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_ReturnFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.Run#getReturnInformation <em>Return Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Information</em>'.
	 * @see com.misc.common.moplaf.common.Run#getReturnInformation()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_ReturnInformation();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Run#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see com.misc.common.moplaf.common.Run#run()
	 * @generated
	 */
	EOperation getRun__Run();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Run#run(com.misc.common.moplaf.common.RunContext) <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see com.misc.common.moplaf.common.Run#run(com.misc.common.moplaf.common.RunContext)
	 * @generated
	 */
	EOperation getRun__Run__RunContext();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Run#cancel() <em>Cancel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel</em>' operation.
	 * @see com.misc.common.moplaf.common.Run#cancel()
	 * @generated
	 */
	EOperation getRun__Cancel();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Run#setProgress(java.lang.String, float) <em>Set Progress</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Progress</em>' operation.
	 * @see com.misc.common.moplaf.common.Run#setProgress(java.lang.String, float)
	 * @generated
	 */
	EOperation getRun__SetProgress__String_float();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Run#setProgress(com.misc.common.moplaf.common.ProgressFeedback) <em>Set Progress</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Progress</em>' operation.
	 * @see com.misc.common.moplaf.common.Run#setProgress(com.misc.common.moplaf.common.ProgressFeedback)
	 * @generated
	 */
	EOperation getRun__SetProgress__ProgressFeedback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Run#getReturn() <em>Get Return</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Return</em>' operation.
	 * @see com.misc.common.moplaf.common.Run#getReturn()
	 * @generated
	 */
	EOperation getRun__GetReturn();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.common.JobParameter <em>Job Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Parameter</em>'.
	 * @see com.misc.common.moplaf.common.JobParameter
	 * @generated
	 */
	EClass getJobParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.JobParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.common.JobParameter#getName()
	 * @see #getJobParameter()
	 * @generated
	 */
	EAttribute getJobParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.JobParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.misc.common.moplaf.common.JobParameter#getType()
	 * @see #getJobParameter()
	 * @generated
	 */
	EAttribute getJobParameter_Type();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.common.JobParameter#getJobAttribute <em>Job Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job Attribute</em>'.
	 * @see com.misc.common.moplaf.common.JobParameter#getJobAttribute()
	 * @see #getJobParameter()
	 * @generated
	 */
	EReference getJobParameter_JobAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.common.JobParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.common.JobParameter#getDescription()
	 * @see #getJobParameter()
	 * @generated
	 */
	EAttribute getJobParameter_Description();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.common.RunContext <em>Run Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Run Context</em>'.
	 * @see com.misc.common.moplaf.common.RunContext
	 * @model instanceClass="com.misc.common.moplaf.common.RunContext"
	 * @generated
	 */
	EDataType getRunContext();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.common.JobParameterType <em>Job Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Parameter Type</em>'.
	 * @see com.misc.common.moplaf.common.JobParameterType
	 * @generated
	 */
	EEnum getJobParameterType();

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
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.common.ProgressFeedback <em>Progress Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Progress Feedback</em>'.
	 * @see com.misc.common.moplaf.common.ProgressFeedback
	 * @model instanceClass="com.misc.common.moplaf.common.ProgressFeedback"
	 * @generated
	 */
	EDataType getProgressFeedback();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.common.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.impl.JobImpl
		 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NAME = eINSTANCE.getJob_Name();

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
		 * The meta object literal for the '<em><b>Help Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__HELP_TEXT = eINSTANCE.getJob_HelpText();

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
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__CREATED = eINSTANCE.getJob_Created();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__RUNNING = eINSTANCE.getJob_Running();

		/**
		 * The meta object literal for the '<em><b>Stopped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__STOPPED = eINSTANCE.getJob_Stopped();

		/**
		 * The meta object literal for the '<em><b>Finished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__FINISHED = eINSTANCE.getJob_Finished();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ARGS = eINSTANCE.getJob_Args();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__PARAMETERS = eINSTANCE.getJob_Parameters();

		/**
		 * The meta object literal for the '<em><b>Add Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB___ADD_PARAMETER__STRING_JOBPARAMETERTYPE_EATTRIBUTE_STRING = eINSTANCE.getJob__AddParameter__String_JobParameterType_EAttribute_String();

		/**
		 * The meta object literal for the '<em><b>Refresh Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB___REFRESH_PARAMETERS = eINSTANCE.getJob__RefreshParameters();

		/**
		 * The meta object literal for the '<em><b>Get Arg As String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB___GET_ARG_AS_STRING__INT = eINSTANCE.getJob__GetArgAsString__int();

		/**
		 * The meta object literal for the '<em><b>Get Arg As Int</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB___GET_ARG_AS_INT__INT = eINSTANCE.getJob__GetArgAsInt__int();

		/**
		 * The meta object literal for the '<em><b>Get Arg As Float</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB___GET_ARG_AS_FLOAT__INT = eINSTANCE.getJob__GetArgAsFloat__int();

		/**
		 * The meta object literal for the '<em><b>Get Arg As Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB___GET_ARG_AS_DATE__INT = eINSTANCE.getJob__GetArgAsDate__int();

		/**
		 * The meta object literal for the '<em><b>Get Arg As Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB___GET_ARG_AS_DATE__INT_STRING = eINSTANCE.getJob__GetArgAsDate__int_String();

		/**
		 * The meta object literal for the '<em><b>Set Args</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOB___SET_ARGS = eINSTANCE.getJob__SetArgs();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.common.impl.RunImpl <em>Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.impl.RunImpl
		 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getRun()
		 * @generated
		 */
		EClass RUN = eINSTANCE.getRun();

		/**
		 * The meta object literal for the '<em><b>Canceled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__CANCELED = eINSTANCE.getRun_Canceled();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.common.impl.JobParameterImpl <em>Job Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.impl.JobParameterImpl
		 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getJobParameter()
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
		 * The meta object literal for the '<em>Run Context</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.RunContext
		 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getRunContext()
		 * @generated
		 */
		EDataType RUN_CONTEXT = eINSTANCE.getRunContext();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.common.JobParameterType <em>Job Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.JobParameterType
		 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getJobParameterType()
		 * @generated
		 */
		EEnum JOB_PARAMETER_TYPE = eINSTANCE.getJobParameterType();

		/**
		 * The meta object literal for the '<em>Enabled Feedback</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.EnabledFeedback
		 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getEnabledFeedback()
		 * @generated
		 */
		EDataType ENABLED_FEEDBACK = eINSTANCE.getEnabledFeedback();

		/**
		 * The meta object literal for the '<em>Return Feedback</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.ReturnFeedback
		 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getReturnFeedback()
		 * @generated
		 */
		EDataType RETURN_FEEDBACK = eINSTANCE.getReturnFeedback();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>Progress Feedback</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.ProgressFeedback
		 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getProgressFeedback()
		 * @generated
		 */
		EDataType PROGRESS_FEEDBACK = eINSTANCE.getProgressFeedback();

	}

} //CommonPackage
