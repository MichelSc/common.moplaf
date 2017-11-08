/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.MoveTask;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.MoveTaskImpl#getInsertionPoint <em>Insertion Point</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.MoveTaskImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MoveTaskImpl extends MoveScheduleImpl implements MoveTask {
	/**
	 * The cached value of the '{@link #getInsertionPoint() <em>Insertion Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertionPoint()
	 * @generated
	 * @ordered
	 */
	protected Task insertionPoint;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.MOVE_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getInsertionPoint() {
		if (insertionPoint != null && insertionPoint.eIsProxy()) {
			InternalEObject oldInsertionPoint = (InternalEObject)insertionPoint;
			insertionPoint = (Task)eResolveProxy(oldInsertionPoint);
			if (insertionPoint != oldInsertionPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.MOVE_TASK__INSERTION_POINT, oldInsertionPoint, insertionPoint));
			}
		}
		return insertionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetInsertionPoint() {
		return insertionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertionPoint(Task newInsertionPoint) {
		Task oldInsertionPoint = insertionPoint;
		insertionPoint = newInsertionPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.MOVE_TASK__INSERTION_POINT, oldInsertionPoint, insertionPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.MOVE_TASK__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.MOVE_TASK__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.MOVE_TASK__INSERTION_POINT:
				if (resolve) return getInsertionPoint();
				return basicGetInsertionPoint();
			case SchedulerPackage.MOVE_TASK__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
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
			case SchedulerPackage.MOVE_TASK__INSERTION_POINT:
				setInsertionPoint((Task)newValue);
				return;
			case SchedulerPackage.MOVE_TASK__RESOURCE:
				setResource((Resource)newValue);
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
			case SchedulerPackage.MOVE_TASK__INSERTION_POINT:
				setInsertionPoint((Task)null);
				return;
			case SchedulerPackage.MOVE_TASK__RESOURCE:
				setResource((Resource)null);
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
			case SchedulerPackage.MOVE_TASK__INSERTION_POINT:
				return insertionPoint != null;
			case SchedulerPackage.MOVE_TASK__RESOURCE:
				return resource != null;
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
		} else if ( this.getInsertionPoint()==null && this.getResource()==null) {
			return "No insertion point task and not Resource";

		} else if ( this.getTaskToSchedule()==this.getInsertionPoint()) {
			return "Insertion point equal to task to schedule";
		}
		return null;
	}
} //MoveTaskImpl
