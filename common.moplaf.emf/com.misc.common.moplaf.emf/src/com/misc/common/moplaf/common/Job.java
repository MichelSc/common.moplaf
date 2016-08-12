/**
 */
package com.misc.common.moplaf.common;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.common.Job#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Job#getStatus <em>Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Job#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Job#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Job#getEndTime <em>End Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Job#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Job#isCreated <em>Created</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Job#isRunning <em>Running</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Job#isStopped <em>Stopped</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Job#isFinished <em>Finished</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.Job#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.common.CommonPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends Run {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.common.CommonPackage#getJob_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.common.Job#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see com.misc.common.moplaf.common.CommonPackage#getJob_Status()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getStatus();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.common.CommonPackage#getJob_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see com.misc.common.moplaf.common.CommonPackage#getJob_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.common.Job#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see com.misc.common.moplaf.common.CommonPackage#getJob_EndTime()
	 * @model
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.common.Job#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(float)
	 * @see com.misc.common.moplaf.common.CommonPackage#getJob_Duration()
	 * @model
	 * @generated
	 */
	float getDuration();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.common.Job#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(float value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(boolean)
	 * @see com.misc.common.moplaf.common.CommonPackage#getJob_Created()
	 * @model default="true"
	 * @generated
	 */
	boolean isCreated();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.common.Job#isCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #isCreated()
	 * @generated
	 */
	void setCreated(boolean value);

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see com.misc.common.moplaf.common.CommonPackage#getJob_Running()
	 * @model
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.common.Job#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

	/**
	 * Returns the value of the '<em><b>Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stopped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stopped</em>' attribute.
	 * @see #setStopped(boolean)
	 * @see com.misc.common.moplaf.common.CommonPackage#getJob_Stopped()
	 * @model
	 * @generated
	 */
	boolean isStopped();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.common.Job#isStopped <em>Stopped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stopped</em>' attribute.
	 * @see #isStopped()
	 * @generated
	 */
	void setStopped(boolean value);

	/**
	 * Returns the value of the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finished</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished</em>' attribute.
	 * @see #setFinished(boolean)
	 * @see com.misc.common.moplaf.common.CommonPackage#getJob_Finished()
	 * @model
	 * @generated
	 */
	boolean isFinished();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.common.Job#isFinished <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finished</em>' attribute.
	 * @see #isFinished()
	 * @generated
	 */
	void setFinished(boolean value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute list.
	 * @see com.misc.common.moplaf.common.CommonPackage#getJob_Args()
	 * @model
	 * @generated
	 */
	EList<String> getArgs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getArgAsString(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getArgAsInt(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	float getArgAsFloat(int index);

} // Job