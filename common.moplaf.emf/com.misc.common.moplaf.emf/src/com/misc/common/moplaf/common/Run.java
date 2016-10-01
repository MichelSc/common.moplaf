/**
 */
package com.misc.common.moplaf.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.common.Run#isCanceled <em>Canceled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Run#getParentRun <em>Parent Run</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Run#getRunFeedback <em>Run Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Run#getCancelFeedback <em>Cancel Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Run#isReturnSuccess <em>Return Success</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Run#getReturnFeedback <em>Return Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Run#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.common.CommonPackage#getRun()
 * @model
 * @generated
 */
public interface Run extends EObject {
	/**
	 * Returns the value of the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canceled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canceled</em>' attribute.
	 * @see #setCanceled(boolean)
	 * @see com.misc.common.moplaf.common.CommonPackage#getRun_Canceled()
	 * @model
	 * @generated
	 */
	boolean isCanceled();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.common.Run#isCanceled <em>Canceled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canceled</em>' attribute.
	 * @see #isCanceled()
	 * @generated
	 */
	void setCanceled(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Run</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Run</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Run</em>' reference.
	 * @see #setParentRun(Run)
	 * @see com.misc.common.moplaf.common.CommonPackage#getRun_ParentRun()
	 * @model
	 * @generated
	 */
	Run getParentRun();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.common.Run#getParentRun <em>Parent Run</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Run</em>' reference.
	 * @see #getParentRun()
	 * @generated
	 */
	void setParentRun(Run value);

	/**
	 * Returns the value of the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.common.CommonPackage#getRun_RunFeedback()
	 * @model dataType="com.misc.common.moplaf.common.CommandFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	CommandFeedback getRunFeedback();

	/**
	 * Returns the value of the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.common.CommonPackage#getRun_CancelFeedback()
	 * @model dataType="com.misc.common.moplaf.common.CommandFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	CommandFeedback getCancelFeedback();

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
	 * @see com.misc.common.moplaf.common.CommonPackage#getRun_ReturnSuccess()
	 * @model
	 * @generated
	 */
	boolean isReturnSuccess();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.common.Run#isReturnSuccess <em>Return Success</em>}' attribute.
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
	 * @see com.misc.common.moplaf.common.CommonPackage#getRun_ReturnFeedback()
	 * @model
	 * @generated
	 */
	String getReturnFeedback();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.common.Run#getReturnFeedback <em>Return Feedback</em>}' attribute.
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
	 * @see com.misc.common.moplaf.common.CommonPackage#getRun_ReturnInformation()
	 * @model
	 * @generated
	 */
	String getReturnInformation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.common.Run#getReturnInformation <em>Return Information</em>}' attribute.
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
	 * @model dataType="com.misc.common.moplaf.common.ReturnFeedback"
	 * @generated
	 */
	ReturnFeedback run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.common.ReturnFeedback"
	 * @generated
	 */
	ReturnFeedback run(Run parentRun);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void runBackground();

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
	boolean onProgress(String task, float work);

} // Run
