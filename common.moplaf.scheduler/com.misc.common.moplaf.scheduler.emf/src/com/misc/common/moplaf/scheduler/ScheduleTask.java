/**
 */
package com.misc.common.moplaf.scheduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.ScheduleTask#getInsertionPoint <em>Insertion Point</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.ScheduleTask#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduleTask()
 * @model abstract="true"
 * @generated
 */
public interface ScheduleTask extends ScheduleDelta {
	/**
	 * Returns the value of the '<em><b>Insertion Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insertion Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insertion Point</em>' reference.
	 * @see #setInsertionPoint(Task)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduleTask_InsertionPoint()
	 * @model required="true"
	 * @generated
	 */
	Task getInsertionPoint();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.ScheduleTask#getInsertionPoint <em>Insertion Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insertion Point</em>' reference.
	 * @see #getInsertionPoint()
	 * @generated
	 */
	void setInsertionPoint(Task value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduleTask_Resource()
	 * @model required="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.ScheduleTask#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // ScheduleTask
