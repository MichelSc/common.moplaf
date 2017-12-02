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

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.Run#getRunFeedback <em>Run Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Run#getCancelFeedback <em>Cancel Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Run#getResetFeedback <em>Reset Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Run#getLabel <em>Label</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Run#isCancelled <em>Cancelled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Run#isReturned <em>Returned</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Run#isReturnSuccess <em>Return Success</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Run#getReturnFeedback <em>Return Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Run#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getRun()
 * @model abstract="true"
 * @generated
 */
public interface Run extends RunParams {
	/**
	 * Returns the value of the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.JobPackage#getRun_RunFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getRunFeedback();

	/**
	 * Returns the value of the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.JobPackage#getRun_CancelFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getCancelFeedback();

	/**
	 * Returns the value of the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.JobPackage#getRun_ResetFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getResetFeedback();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see com.misc.common.moplaf.job.JobPackage#getRun_Label()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancelled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancelled</em>' attribute.
	 * @see #setCancelled(boolean)
	 * @see com.misc.common.moplaf.job.JobPackage#getRun_Cancelled()
	 * @model
	 * @generated
	 */
	boolean isCancelled();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.Run#isCancelled <em>Cancelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancelled</em>' attribute.
	 * @see #isCancelled()
	 * @generated
	 */
	void setCancelled(boolean value);

	/**
	 * Returns the value of the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returned</em>' attribute.
	 * @see #setReturned(boolean)
	 * @see com.misc.common.moplaf.job.JobPackage#getRun_Returned()
	 * @model
	 * @generated
	 */
	boolean isReturned();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.Run#isReturned <em>Returned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returned</em>' attribute.
	 * @see #isReturned()
	 * @generated
	 */
	void setReturned(boolean value);

	/**
	 * Returns the value of the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Success</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Success</em>' attribute.
	 * @see #setReturnSuccess(boolean)
	 * @see com.misc.common.moplaf.job.JobPackage#getRun_ReturnSuccess()
	 * @model
	 * @generated
	 */
	boolean isReturnSuccess();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.Run#isReturnSuccess <em>Return Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Success</em>' attribute.
	 * @see #isReturnSuccess()
	 * @generated
	 */
	void setReturnSuccess(boolean value);

	/**
	 * Returns the value of the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Feedback</em>' attribute.
	 * @see #setReturnFeedback(String)
	 * @see com.misc.common.moplaf.job.JobPackage#getRun_ReturnFeedback()
	 * @model
	 * @generated
	 */
	String getReturnFeedback();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.Run#getReturnFeedback <em>Return Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Feedback</em>' attribute.
	 * @see #getReturnFeedback()
	 * @generated
	 */
	void setReturnFeedback(String value);

	/**
	 * Returns the value of the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Information</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Information</em>' attribute.
	 * @see #setReturnInformation(String)
	 * @see com.misc.common.moplaf.job.JobPackage#getRun_ReturnInformation()
	 * @model
	 * @generated
	 */
	String getReturnInformation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.Run#getReturnInformation <em>Return Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Information</em>' attribute.
	 * @see #getReturnInformation()
	 * @generated
	 */
	void setReturnInformation(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.job.ReturnFeedback"
	 * @generated
	 */
	ReturnFeedback run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.job.ReturnFeedback" runContextDataType="com.misc.common.moplaf.job.RunContext"
	 * @generated
	 */
	ReturnFeedback run(RunContext runContext);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model runContextDataType="com.misc.common.moplaf.job.RunContext"
	 * @generated
	 */
	void runAsynch(RunContext runContext);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model runContextDataType="com.misc.common.moplaf.job.RunContext"
	 * @generated
	 */
	void runAsynch(RunContext runContext, boolean background);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean setProgress(String task, float work);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model progressDataType="com.misc.common.moplaf.job.ProgressFeedback"
	 * @generated
	 */
	boolean setProgress(ProgressFeedback progress);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="com.misc.common.moplaf.job.ReturnFeedback"
	 * @generated
	 */
	ReturnFeedback getReturn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model feedbackDataType="com.misc.common.moplaf.job.ReturnFeedback"
	 * @generated
	 */
	void setReturn(ReturnFeedback feedback);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RunParams constructParams();

} // Run
