/**
 */
package com.misc.common.moplaf.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The feature id for the '<em><b>Parent Run</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__PARENT_RUN = 1;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RUN_FEEDBACK = 2;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__CANCEL_FEEDBACK = 3;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RETURN_SUCCESS = 4;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RETURN_FEEDBACK = 5;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__RETURN_INFORMATION = 6;

	/**
	 * The number of structural features of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FEATURE_COUNT = 7;

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
	int RUN___RUN__RUN = 1;

	/**
	 * The operation id for the '<em>Run Background</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___RUN_BACKGROUND = 2;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___CANCEL = 3;

	/**
	 * The operation id for the '<em>On Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN___ON_PROGRESS__STRING_FLOAT = 4;

	/**
	 * The number of operations of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_OPERATION_COUNT = 5;

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
	 * The feature id for the '<em><b>Parent Run</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PARENT_RUN = RUN__PARENT_RUN;

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
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__START_TIME = RUN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__END_TIME = RUN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DURATION = RUN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CREATED = RUN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RUNNING = RUN_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STOPPED = RUN_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__FINISHED = RUN_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ARGS = RUN_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = RUN_FEATURE_COUNT + 11;

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
	int JOB___RUN__RUN = RUN___RUN__RUN;

	/**
	 * The operation id for the '<em>Run Background</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___RUN_BACKGROUND = RUN___RUN_BACKGROUND;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___CANCEL = RUN___CANCEL;

	/**
	 * The operation id for the '<em>On Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___ON_PROGRESS__STRING_FLOAT = RUN___ON_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Get Arg As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_ARG_AS_STRING__INT = RUN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Arg As Int</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_ARG_AS_INT__INT = RUN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Arg As Float</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_ARG_AS_FLOAT__INT = RUN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Arg As Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_ARG_AS_DATE__INT = RUN_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Arg As Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB___GET_ARG_AS_DATE__INT_STRING = RUN_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = RUN_OPERATION_COUNT + 5;


	/**
	 * The meta object id for the '<em>Command Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.CommandFeedback
	 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getCommandFeedback()
	 * @generated
	 */
	int COMMAND_FEEDBACK = 2;


	/**
	 * The meta object id for the '<em>Return Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.ReturnFeedback
	 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getReturnFeedback()
	 * @generated
	 */
	int RETURN_FEEDBACK = 3;


	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 4;


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
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.common.Run#getParentRun <em>Parent Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Run</em>'.
	 * @see com.misc.common.moplaf.common.Run#getParentRun()
	 * @see #getRun()
	 * @generated
	 */
	EReference getRun_ParentRun();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Run#run(com.misc.common.moplaf.common.Run) <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see com.misc.common.moplaf.common.Run#run(com.misc.common.moplaf.common.Run)
	 * @generated
	 */
	EOperation getRun__Run__Run();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Run#runBackground() <em>Run Background</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run Background</em>' operation.
	 * @see com.misc.common.moplaf.common.Run#runBackground()
	 * @generated
	 */
	EOperation getRun__RunBackground();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.common.Run#onProgress(java.lang.String, float) <em>On Progress</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Progress</em>' operation.
	 * @see com.misc.common.moplaf.common.Run#onProgress(java.lang.String, float)
	 * @generated
	 */
	EOperation getRun__OnProgress__String_float();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.common.CommandFeedback <em>Command Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Command Feedback</em>'.
	 * @see com.misc.common.moplaf.common.CommandFeedback
	 * @model instanceClass="com.misc.common.moplaf.common.CommandFeedback"
	 * @generated
	 */
	EDataType getCommandFeedback();

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
		 * The meta object literal for the '<em><b>Parent Run</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN__PARENT_RUN = eINSTANCE.getRun_ParentRun();

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
		EOperation RUN___RUN__RUN = eINSTANCE.getRun__Run__Run();

		/**
		 * The meta object literal for the '<em><b>Run Background</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN___RUN_BACKGROUND = eINSTANCE.getRun__RunBackground();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN___CANCEL = eINSTANCE.getRun__Cancel();

		/**
		 * The meta object literal for the '<em><b>On Progress</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUN___ON_PROGRESS__STRING_FLOAT = eINSTANCE.getRun__OnProgress__String_float();

		/**
		 * The meta object literal for the '<em>Command Feedback</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.CommandFeedback
		 * @see com.misc.common.moplaf.common.impl.CommonPackageImpl#getCommandFeedback()
		 * @generated
		 */
		EDataType COMMAND_FEEDBACK = eINSTANCE.getCommandFeedback();

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

	}

} //CommonPackage
