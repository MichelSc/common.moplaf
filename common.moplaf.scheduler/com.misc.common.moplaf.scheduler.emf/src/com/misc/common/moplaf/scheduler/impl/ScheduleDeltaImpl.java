/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.localsearch.impl.DeltaImpl;

import com.misc.common.moplaf.scheduler.ScheduleDelta;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Delta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ScheduleDeltaImpl#getTaskToSchedule <em>Task To Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ScheduleDeltaImpl extends DeltaImpl implements ScheduleDelta {
	/**
	 * The cached value of the '{@link #getTaskToSchedule() <em>Task To Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskToSchedule()
	 * @generated
	 * @ordered
	 */
	protected Task taskToSchedule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleDeltaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SCHEDULE_DELTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTaskToSchedule() {
		if (taskToSchedule != null && taskToSchedule.eIsProxy()) {
			InternalEObject oldTaskToSchedule = (InternalEObject)taskToSchedule;
			taskToSchedule = (Task)eResolveProxy(oldTaskToSchedule);
			if (taskToSchedule != oldTaskToSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SCHEDULE_DELTA__TASK_TO_SCHEDULE, oldTaskToSchedule, taskToSchedule));
			}
		}
		return taskToSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTaskToSchedule() {
		return taskToSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskToSchedule(Task newTaskToSchedule) {
		Task oldTaskToSchedule = taskToSchedule;
		taskToSchedule = newTaskToSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULE_DELTA__TASK_TO_SCHEDULE, oldTaskToSchedule, taskToSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULE_DELTA__TASK_TO_SCHEDULE:
				if (resolve) return getTaskToSchedule();
				return basicGetTaskToSchedule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULE_DELTA__TASK_TO_SCHEDULE:
				setTaskToSchedule((Task)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULE_DELTA__TASK_TO_SCHEDULE:
				setTaskToSchedule((Task)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULE_DELTA__TASK_TO_SCHEDULE:
				return taskToSchedule != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	public String getValidFeedback() {
		String feedback = super.getValidFeedback();
		if ( feedback!=null) {
			return feedback;
		} else if ( this.getTaskToSchedule()==null) {
			return "No task to schedule";
		}
		return null;
	}
} //ScheduleDeltaImpl
