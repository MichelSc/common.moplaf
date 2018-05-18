/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.localsearch.Plugin;
import com.misc.common.moplaf.localsearch.impl.SolutionImpl;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.Scheduler;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Task;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ScheduleImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ScheduleImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ScheduleImpl#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ScheduleImpl#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ScheduleImpl#getNotScheduledTasks <em>Not Scheduled Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ScheduleImpl extends SolutionImpl implements Schedule {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The default value of the '{@link #getNrScheduledTasks() <em>Nr Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrScheduledTasks()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_SCHEDULED_TASKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrScheduledTasks() <em>Nr Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrScheduledTasks()
	 * @generated
	 * @ordered
	 */
	protected int nrScheduledTasks = NR_SCHEDULED_TASKS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotScheduledTasks() <em>Not Scheduled Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotScheduledTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> notScheduledTasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentWithInverseEList<Task>(Task.class, this, SchedulerPackage.SCHEDULE__TASKS, SchedulerPackage.TASK__SCHEDULE);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, SchedulerPackage.SCHEDULE__RESOURCES, SchedulerPackage.RESOURCE__SCHEDULE);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getScheduler() {
		Scheduler scheduler = basicGetScheduler();
		return scheduler != null && scheduler.eIsProxy() ? (Scheduler)eResolveProxy((InternalEObject)scheduler) : scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Scheduler basicGetScheduler() {
		EObject container = this.eContainer();
		while ( container != null ) {
			if ( container instanceof Scheduler ) {
				return (Scheduler)container;
			} 
			container = container.eContainer();
		}
		String logMessage = String.format("The owner of the Schedule %s must be a Scheduler",
                this.getClass().getName());
		Plugin.INSTANCE.logError(logMessage);
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getNotScheduledTasks() {
		if (notScheduledTasks == null) {
			notScheduledTasks = new EObjectResolvingEList<Task>(Task.class, this, SchedulerPackage.SCHEDULE__NOT_SCHEDULED_TASKS);
		}
		return notScheduledTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void schedule(Task from, Task to, Resource resource, Task previous, Task next) {
		if ( from.isScheduled() ) {
			this.unsetPreviousNext(from, to);
		}
		
		if ( resource!=null ) {
			// set previous and next
			if ( previous==null ) {
				resource.setFirstTask(from);
			} else {
				previous.setNextTask(from);
			}

			// after: set next
			if ( next==null) {
				resource.setLastTask(to);
			} else {
				to.setNextTask(next);
			}	
		}
		
		// set the association Task/Resource
		int position = next==null ? resource.getScheduledTasks().size() : resource.getScheduledTasks().indexOf(next);
		Task current = from;
		do {
			this.scheduleResource(resource, current, position);
			position++;
			current = from.getNextTask();
		} while ( current != to);


	}
	
	private void scheduleResource(Resource resource, Task task, int position) {
		Resource resource_asis = task.getScheduledResource();
		Resource resource_tobe = resource;

		if ( resource_asis != resource_tobe ) {
			if ( resource_asis==null ) {
				this.getNotScheduledTasks().remove(task);
			} else {
				resource_asis.setNrScheduledTasks(resource_asis.getNrScheduledTasks()-1);
				resource_asis.getScheduledTasks().remove(task);
			} 

			if ( resource_tobe==null ) {
				this.getNotScheduledTasks().add(task);
			} else {
				resource_tobe.setNrScheduledTasks(resource_tobe.getNrScheduledTasks()+1);
				resource_tobe.getScheduledTasks().add(position, task);
			}
	
			task.setScheduledResource(resource_tobe);
		} else if ( resource!=null ) {
			resource.getScheduledTasks().move(position, task);
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private void unsetPreviousNext(Task from, Task  to) {
		Task previous = from.getPreviousTask();
		Task next = to.getNextTask();
		Resource resource_asis = from.getScheduledResource();

		// before
		if ( previous==null ) {
			// this task was the first task
			resource_asis.setFirstTask(next);
		} else {
			previous.setNextTask(next);
		} 

		// after
		if ( next==null) {
			// this task was the last task
			resource_asis.setLastTask(previous);
		} else {
			to.setNextTask(null);
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFeedback scheduleFeedback(Task from, Task to, Resource resource, Task previous, Task next) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void flush() {
		this.getTasks().clear();
		this.getResources().clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrScheduledTasks() {
		return nrScheduledTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrScheduledTasks(int newNrScheduledTasks) {
		int oldNrScheduledTasks = nrScheduledTasks;
		nrScheduledTasks = newNrScheduledTasks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULE__NR_SCHEDULED_TASKS, oldNrScheduledTasks, nrScheduledTasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void initialize() {
		super.initialize();

		// fill the schedule with tasks and resources
		this.initializeImpl();
		
		// make it ready for scheduling
		this.getNotScheduledTasks().clear();
		for (Task task : this.getTasks()) {
			if ( !task.isScheduled() ) {
				this.getNotScheduledTasks().add(task);
			}
		}
	}
	
	protected void initializeImpl() {
		
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
			case SchedulerPackage.SCHEDULE__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
			case SchedulerPackage.SCHEDULE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
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
			case SchedulerPackage.SCHEDULE__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case SchedulerPackage.SCHEDULE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case SchedulerPackage.SCHEDULE__TASKS:
				return getTasks();
			case SchedulerPackage.SCHEDULE__RESOURCES:
				return getResources();
			case SchedulerPackage.SCHEDULE__NR_SCHEDULED_TASKS:
				return getNrScheduledTasks();
			case SchedulerPackage.SCHEDULE__SCHEDULER:
				if (resolve) return getScheduler();
				return basicGetScheduler();
			case SchedulerPackage.SCHEDULE__NOT_SCHEDULED_TASKS:
				return getNotScheduledTasks();
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
			case SchedulerPackage.SCHEDULE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case SchedulerPackage.SCHEDULE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case SchedulerPackage.SCHEDULE__NR_SCHEDULED_TASKS:
				setNrScheduledTasks((Integer)newValue);
				return;
			case SchedulerPackage.SCHEDULE__NOT_SCHEDULED_TASKS:
				getNotScheduledTasks().clear();
				getNotScheduledTasks().addAll((Collection<? extends Task>)newValue);
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
			case SchedulerPackage.SCHEDULE__TASKS:
				getTasks().clear();
				return;
			case SchedulerPackage.SCHEDULE__RESOURCES:
				getResources().clear();
				return;
			case SchedulerPackage.SCHEDULE__NR_SCHEDULED_TASKS:
				setNrScheduledTasks(NR_SCHEDULED_TASKS_EDEFAULT);
				return;
			case SchedulerPackage.SCHEDULE__NOT_SCHEDULED_TASKS:
				getNotScheduledTasks().clear();
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
			case SchedulerPackage.SCHEDULE__TASKS:
				return tasks != null && !tasks.isEmpty();
			case SchedulerPackage.SCHEDULE__RESOURCES:
				return resources != null && !resources.isEmpty();
			case SchedulerPackage.SCHEDULE__NR_SCHEDULED_TASKS:
				return nrScheduledTasks != NR_SCHEDULED_TASKS_EDEFAULT;
			case SchedulerPackage.SCHEDULE__SCHEDULER:
				return basicGetScheduler() != null;
			case SchedulerPackage.SCHEDULE__NOT_SCHEDULED_TASKS:
				return notScheduledTasks != null && !notScheduledTasks.isEmpty();
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
			case SchedulerPackage.SCHEDULE___SCHEDULE__TASK_TASK_RESOURCE_TASK_TASK:
				schedule((Task)arguments.get(0), (Task)arguments.get(1), (Resource)arguments.get(2), (Task)arguments.get(3), (Task)arguments.get(4));
				return null;
			case SchedulerPackage.SCHEDULE___SCHEDULE_FEEDBACK__TASK_TASK_RESOURCE_TASK_TASK:
				return scheduleFeedback((Task)arguments.get(0), (Task)arguments.get(1), (Resource)arguments.get(2), (Task)arguments.get(3), (Task)arguments.get(4));
			case SchedulerPackage.SCHEDULE___FLUSH:
				flush();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (NrScheduledTasks: ");
		result.append(nrScheduledTasks);
		result.append(')');
		return result.toString();
	}

} //ScheduleImpl
