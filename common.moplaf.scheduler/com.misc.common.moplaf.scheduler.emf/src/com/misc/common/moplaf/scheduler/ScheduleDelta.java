/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.localsearch.Delta;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Delta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.ScheduleDelta#getTaskToSchedule <em>Task To Schedule</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduleDelta()
 * @model abstract="true"
 * @generated
 */
public interface ScheduleDelta extends Delta {
	/**
	 * Returns the value of the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task To Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task To Schedule</em>' reference.
	 * @see #setTaskToSchedule(Task)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getScheduleDelta_TaskToSchedule()
	 * @model required="true"
	 * @generated
	 */
	Task getTaskToSchedule();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.ScheduleDelta#getTaskToSchedule <em>Task To Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task To Schedule</em>' reference.
	 * @see #getTaskToSchedule()
	 * @generated
	 */
	void setTaskToSchedule(Task value);

} // ScheduleDelta
