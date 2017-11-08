/**
 */
package com.misc.common.moplaf.scheduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.MoveTask#getInsertionPoint <em>Insertion Point</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.MoveTask#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getMoveTask()
 * @model abstract="true"
 * @generated
 */
public interface MoveTask extends MoveSchedule {
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
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getMoveTask_InsertionPoint()
	 * @model required="true"
	 * @generated
	 */
	Task getInsertionPoint();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.MoveTask#getInsertionPoint <em>Insertion Point</em>}' reference.
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
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getMoveTask_Resource()
	 * @model required="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.MoveTask#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // MoveTask
