/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.FlockResource;
import com.misc.common.moplaf.scheduler.FlockTask;
import com.misc.common.moplaf.scheduler.SchedulerPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flock Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.FlockTaskImpl#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.FlockTaskImpl#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.FlockTaskImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlockTaskImpl extends TaskImpl implements FlockTask {
	/**
	 * The cached value of the '{@link #getPredecessors() <em>Predecessors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessors()
	 * @generated
	 * @ordered
	 */
	protected EList<FlockTask> predecessors;

	/**
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<FlockTask> successors;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected FlockResource resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlockTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.FLOCK_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlockTask> getPredecessors() {
		if (predecessors == null) {
			predecessors = new EObjectWithInverseResolvingEList.ManyInverse<FlockTask>(FlockTask.class, this, SchedulerPackage.FLOCK_TASK__PREDECESSORS, SchedulerPackage.FLOCK_TASK__SUCCESSORS);
		}
		return predecessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlockTask> getSuccessors() {
		if (successors == null) {
			successors = new EObjectWithInverseResolvingEList.ManyInverse<FlockTask>(FlockTask.class, this, SchedulerPackage.FLOCK_TASK__SUCCESSORS, SchedulerPackage.FLOCK_TASK__PREDECESSORS);
		}
		return successors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockResource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (FlockResource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.FLOCK_TASK__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockResource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(FlockResource newResource, NotificationChain msgs) {
		FlockResource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.FLOCK_TASK__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(FlockResource newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, SchedulerPackage.FLOCK_RESOURCE__TASKS, FlockResource.class, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, SchedulerPackage.FLOCK_RESOURCE__TASKS, FlockResource.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.FLOCK_TASK__RESOURCE, newResource, newResource));
	}
	
	private void visitTask(FlockTask task, 
			               Set<FlockTask> visitedTasks, 
			               Set<FlockTask> toVisitTasks, 
			               EList<FlockTask> congruentTasks) {
		toVisitTasks.remove(task);
		visitedTasks.add(task);
		for (FlockTask successor : task.getSuccessors()) {
			if ( !visitedTasks.contains(successor) ) {
				toVisitTasks.add(successor);
			}
		}
		for (FlockTask predecessor : task.getPredecessors()) {
			if ( !visitedTasks.contains(predecessor)) {
				visitTask(predecessor, visitedTasks, toVisitTasks, congruentTasks);
			}
		}
		FlockResource resource = this.getResource();
		if ( resource!=null && resource.isKeepTogether() && resource==task.getResource() ) {
			congruentTasks.add(task);
		}
		visitedTasks.add(task);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<FlockTask> getCongruentTasks() {
		HashSet<FlockTask> visitedTasks = new HashSet<FlockTask>();
		HashSet<FlockTask> toVisitTasks = new HashSet<FlockTask>();
		BasicEList<FlockTask> congruentTasks = new BasicEList<FlockTask>();
		
		toVisitTasks.add(this);
		while ( toVisitTasks.size()>0 ) {
			FlockTask selected = toVisitTasks.iterator().next();
			this.visitTask(selected, visitedTasks, toVisitTasks, congruentTasks);
		}
		
		return congruentTasks;
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
			case SchedulerPackage.FLOCK_TASK__PREDECESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredecessors()).basicAdd(otherEnd, msgs);
			case SchedulerPackage.FLOCK_TASK__SUCCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuccessors()).basicAdd(otherEnd, msgs);
			case SchedulerPackage.FLOCK_TASK__RESOURCE:
				if (resource != null)
					msgs = ((InternalEObject)resource).eInverseRemove(this, SchedulerPackage.FLOCK_RESOURCE__TASKS, FlockResource.class, msgs);
				return basicSetResource((FlockResource)otherEnd, msgs);
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
			case SchedulerPackage.FLOCK_TASK__PREDECESSORS:
				return ((InternalEList<?>)getPredecessors()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.FLOCK_TASK__SUCCESSORS:
				return ((InternalEList<?>)getSuccessors()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.FLOCK_TASK__RESOURCE:
				return basicSetResource(null, msgs);
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
			case SchedulerPackage.FLOCK_TASK__PREDECESSORS:
				return getPredecessors();
			case SchedulerPackage.FLOCK_TASK__SUCCESSORS:
				return getSuccessors();
			case SchedulerPackage.FLOCK_TASK__RESOURCE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulerPackage.FLOCK_TASK__PREDECESSORS:
				getPredecessors().clear();
				getPredecessors().addAll((Collection<? extends FlockTask>)newValue);
				return;
			case SchedulerPackage.FLOCK_TASK__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends FlockTask>)newValue);
				return;
			case SchedulerPackage.FLOCK_TASK__RESOURCE:
				setResource((FlockResource)newValue);
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
			case SchedulerPackage.FLOCK_TASK__PREDECESSORS:
				getPredecessors().clear();
				return;
			case SchedulerPackage.FLOCK_TASK__SUCCESSORS:
				getSuccessors().clear();
				return;
			case SchedulerPackage.FLOCK_TASK__RESOURCE:
				setResource((FlockResource)null);
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
			case SchedulerPackage.FLOCK_TASK__PREDECESSORS:
				return predecessors != null && !predecessors.isEmpty();
			case SchedulerPackage.FLOCK_TASK__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case SchedulerPackage.FLOCK_TASK__RESOURCE:
				return resource != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SchedulerPackage.FLOCK_TASK___GET_CONGRUENT_TASKS:
				return getCongruentTasks();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FlockTaskImpl
