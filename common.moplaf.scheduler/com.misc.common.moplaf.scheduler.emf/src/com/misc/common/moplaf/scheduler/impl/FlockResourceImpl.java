/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.FlockResource;
import com.misc.common.moplaf.scheduler.FlockTask;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.SchedulerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flock Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.FlockResourceImpl#getPlannedResource <em>Planned Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.FlockResourceImpl#isKeepTogether <em>Keep Together</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.FlockResourceImpl#isFullyPlanned <em>Fully Planned</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.FlockResourceImpl#isResourceInvalid <em>Resource Invalid</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.FlockResourceImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlockResourceImpl extends MinimalEObjectImpl.Container implements FlockResource {
	/**
	 * The cached value of the '{@link #getPlannedResource() <em>Planned Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedResource()
	 * @generated
	 * @ordered
	 */
	protected Resource plannedResource;

	/**
	 * The default value of the '{@link #isKeepTogether() <em>Keep Together</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeepTogether()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEEP_TOGETHER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKeepTogether() <em>Keep Together</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeepTogether()
	 * @generated
	 * @ordered
	 */
	protected boolean keepTogether = KEEP_TOGETHER_EDEFAULT;

	/**
	 * The default value of the '{@link #isFullyPlanned() <em>Fully Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFullyPlanned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FULLY_PLANNED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isResourceInvalid() <em>Resource Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResourceInvalid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOURCE_INVALID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<FlockTask> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlockResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.FLOCK_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getPlannedResource() {
		if (plannedResource != null && plannedResource.eIsProxy()) {
			InternalEObject oldPlannedResource = (InternalEObject)plannedResource;
			plannedResource = (Resource)eResolveProxy(oldPlannedResource);
			if (plannedResource != oldPlannedResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.FLOCK_RESOURCE__PLANNED_RESOURCE, oldPlannedResource, plannedResource));
			}
		}
		return plannedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetPlannedResource() {
		return plannedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlannedResource(Resource newPlannedResource) {
		Resource oldPlannedResource = plannedResource;
		plannedResource = newPlannedResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.FLOCK_RESOURCE__PLANNED_RESOURCE, oldPlannedResource, plannedResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKeepTogether() {
		return keepTogether;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeepTogether(boolean newKeepTogether) {
		boolean oldKeepTogether = keepTogether;
		keepTogether = newKeepTogether;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.FLOCK_RESOURCE__KEEP_TOGETHER, oldKeepTogether, keepTogether));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isFullyPlanned() {
		boolean fully_planned = this.getTasks().stream().allMatch(t -> t.isScheduled());
		return fully_planned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isResourceInvalid() {
		boolean valid = this.getTasks().stream().map(t -> t.getScheduledResource()).distinct().count()<=1;
		return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlockTask> getTasks() {
		if (tasks == null) {
			tasks = new EObjectWithInverseResolvingEList<FlockTask>(FlockTask.class, this, SchedulerPackage.FLOCK_RESOURCE__TASKS, SchedulerPackage.FLOCK_TASK__RESOURCE);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulerPackage.FLOCK_RESOURCE__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulerPackage.FLOCK_RESOURCE__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.FLOCK_RESOURCE__PLANNED_RESOURCE:
				if (resolve) return getPlannedResource();
				return basicGetPlannedResource();
			case SchedulerPackage.FLOCK_RESOURCE__KEEP_TOGETHER:
				return isKeepTogether();
			case SchedulerPackage.FLOCK_RESOURCE__FULLY_PLANNED:
				return isFullyPlanned();
			case SchedulerPackage.FLOCK_RESOURCE__RESOURCE_INVALID:
				return isResourceInvalid();
			case SchedulerPackage.FLOCK_RESOURCE__TASKS:
				return getTasks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulerPackage.FLOCK_RESOURCE__PLANNED_RESOURCE:
				setPlannedResource((Resource)newValue);
				return;
			case SchedulerPackage.FLOCK_RESOURCE__KEEP_TOGETHER:
				setKeepTogether((Boolean)newValue);
				return;
			case SchedulerPackage.FLOCK_RESOURCE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends FlockTask>)newValue);
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
			case SchedulerPackage.FLOCK_RESOURCE__PLANNED_RESOURCE:
				setPlannedResource((Resource)null);
				return;
			case SchedulerPackage.FLOCK_RESOURCE__KEEP_TOGETHER:
				setKeepTogether(KEEP_TOGETHER_EDEFAULT);
				return;
			case SchedulerPackage.FLOCK_RESOURCE__TASKS:
				getTasks().clear();
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
			case SchedulerPackage.FLOCK_RESOURCE__PLANNED_RESOURCE:
				return plannedResource != null;
			case SchedulerPackage.FLOCK_RESOURCE__KEEP_TOGETHER:
				return keepTogether != KEEP_TOGETHER_EDEFAULT;
			case SchedulerPackage.FLOCK_RESOURCE__FULLY_PLANNED:
				return isFullyPlanned() != FULLY_PLANNED_EDEFAULT;
			case SchedulerPackage.FLOCK_RESOURCE__RESOURCE_INVALID:
				return isResourceInvalid() != RESOURCE_INVALID_EDEFAULT;
			case SchedulerPackage.FLOCK_RESOURCE__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (KeepTogether: ");
		result.append(keepTogether);
		result.append(')');
		return result.toString();
	}

} //FlockResourceImpl
