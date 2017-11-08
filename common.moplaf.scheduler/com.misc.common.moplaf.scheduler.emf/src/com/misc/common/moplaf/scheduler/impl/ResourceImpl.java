/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;

import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Task;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ResourceImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ResourceImpl#getScheduledTasks <em>Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ResourceImpl#getFirstTask <em>First Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ResourceImpl#getLastTask <em>Last Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ResourceImpl#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.ResourceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends ObjectWithPropagatorFunctionsImpl implements Resource {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduledTasks() <em>Scheduled Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> scheduledTasks;

	/**
	 * The cached value of the '{@link #getFirstTask() <em>First Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstTask()
	 * @generated
	 * @ordered
	 */
	protected Task firstTask;

	/**
	 * The cached value of the '{@link #getLastTask() <em>Last Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTask()
	 * @generated
	 * @ordered
	 */
	protected Task lastTask;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule getSchedule() {
		if (eContainerFeatureID() != SchedulerPackage.RESOURCE__SCHEDULE) return null;
		return (Schedule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(Schedule newSchedule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchedule, SchedulerPackage.RESOURCE__SCHEDULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Schedule newSchedule) {
		if (newSchedule != eInternalContainer() || (eContainerFeatureID() != SchedulerPackage.RESOURCE__SCHEDULE && newSchedule != null)) {
			if (EcoreUtil.isAncestor(this, newSchedule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, SchedulerPackage.SCHEDULE__RESOURCES, Schedule.class, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.RESOURCE__SCHEDULE, newSchedule, newSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		Schedule solution = this.getSchedule();
		String description = String.format("sol %d, resource %s", solution.getSolutionNr(), this.getName());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getScheduledTasks() {
		if (scheduledTasks == null) {
			scheduledTasks = new EObjectWithInverseResolvingEList<Task>(Task.class, this, SchedulerPackage.RESOURCE__SCHEDULED_TASKS, SchedulerPackage.TASK__SCHEDULED_RESOURCE);
		}
		return scheduledTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getFirstTask() {
		if (firstTask != null && firstTask.eIsProxy()) {
			InternalEObject oldFirstTask = (InternalEObject)firstTask;
			firstTask = (Task)eResolveProxy(oldFirstTask);
			if (firstTask != oldFirstTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.RESOURCE__FIRST_TASK, oldFirstTask, firstTask));
			}
		}
		return firstTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetFirstTask() {
		return firstTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstTask(Task newFirstTask) {
		Task oldFirstTask = firstTask;
		firstTask = newFirstTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.RESOURCE__FIRST_TASK, oldFirstTask, firstTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getLastTask() {
		if (lastTask != null && lastTask.eIsProxy()) {
			InternalEObject oldLastTask = (InternalEObject)lastTask;
			lastTask = (Task)eResolveProxy(oldLastTask);
			if (lastTask != oldLastTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.RESOURCE__LAST_TASK, oldLastTask, lastTask));
			}
		}
		return lastTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetLastTask() {
		return lastTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastTask(Task newLastTask) {
		Task oldLastTask = lastTask;
		lastTask = newLastTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.RESOURCE__LAST_TASK, oldLastTask, lastTask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.RESOURCE__NR_SCHEDULED_TASKS, oldNrScheduledTasks, nrScheduledTasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.RESOURCE__NAME, oldName, name));
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
			case SchedulerPackage.RESOURCE__SCHEDULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchedule((Schedule)otherEnd, msgs);
			case SchedulerPackage.RESOURCE__SCHEDULED_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduledTasks()).basicAdd(otherEnd, msgs);
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
			case SchedulerPackage.RESOURCE__SCHEDULE:
				return basicSetSchedule(null, msgs);
			case SchedulerPackage.RESOURCE__SCHEDULED_TASKS:
				return ((InternalEList<?>)getScheduledTasks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SchedulerPackage.RESOURCE__SCHEDULE:
				return eInternalContainer().eInverseRemove(this, SchedulerPackage.SCHEDULE__RESOURCES, Schedule.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.RESOURCE__SCHEDULE:
				return getSchedule();
			case SchedulerPackage.RESOURCE__DESCRIPTION:
				return getDescription();
			case SchedulerPackage.RESOURCE__SCHEDULED_TASKS:
				return getScheduledTasks();
			case SchedulerPackage.RESOURCE__FIRST_TASK:
				if (resolve) return getFirstTask();
				return basicGetFirstTask();
			case SchedulerPackage.RESOURCE__LAST_TASK:
				if (resolve) return getLastTask();
				return basicGetLastTask();
			case SchedulerPackage.RESOURCE__NR_SCHEDULED_TASKS:
				return getNrScheduledTasks();
			case SchedulerPackage.RESOURCE__NAME:
				return getName();
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
			case SchedulerPackage.RESOURCE__SCHEDULE:
				setSchedule((Schedule)newValue);
				return;
			case SchedulerPackage.RESOURCE__SCHEDULED_TASKS:
				getScheduledTasks().clear();
				getScheduledTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case SchedulerPackage.RESOURCE__FIRST_TASK:
				setFirstTask((Task)newValue);
				return;
			case SchedulerPackage.RESOURCE__LAST_TASK:
				setLastTask((Task)newValue);
				return;
			case SchedulerPackage.RESOURCE__NR_SCHEDULED_TASKS:
				setNrScheduledTasks((Integer)newValue);
				return;
			case SchedulerPackage.RESOURCE__NAME:
				setName((String)newValue);
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
			case SchedulerPackage.RESOURCE__SCHEDULE:
				setSchedule((Schedule)null);
				return;
			case SchedulerPackage.RESOURCE__SCHEDULED_TASKS:
				getScheduledTasks().clear();
				return;
			case SchedulerPackage.RESOURCE__FIRST_TASK:
				setFirstTask((Task)null);
				return;
			case SchedulerPackage.RESOURCE__LAST_TASK:
				setLastTask((Task)null);
				return;
			case SchedulerPackage.RESOURCE__NR_SCHEDULED_TASKS:
				setNrScheduledTasks(NR_SCHEDULED_TASKS_EDEFAULT);
				return;
			case SchedulerPackage.RESOURCE__NAME:
				setName(NAME_EDEFAULT);
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
			case SchedulerPackage.RESOURCE__SCHEDULE:
				return getSchedule() != null;
			case SchedulerPackage.RESOURCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case SchedulerPackage.RESOURCE__SCHEDULED_TASKS:
				return scheduledTasks != null && !scheduledTasks.isEmpty();
			case SchedulerPackage.RESOURCE__FIRST_TASK:
				return firstTask != null;
			case SchedulerPackage.RESOURCE__LAST_TASK:
				return lastTask != null;
			case SchedulerPackage.RESOURCE__NR_SCHEDULED_TASKS:
				return nrScheduledTasks != NR_SCHEDULED_TASKS_EDEFAULT;
			case SchedulerPackage.RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (NrScheduledTasks: ");
		result.append(nrScheduledTasks);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
