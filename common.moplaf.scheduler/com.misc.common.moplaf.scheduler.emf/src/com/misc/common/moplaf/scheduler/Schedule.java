/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.localsearch.Solution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Update the candidate solution with the parameter Move.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.Schedule#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Schedule#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Schedule#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Schedule#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Schedule#getNotScheduledTasks <em>Not Scheduled Tasks</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSchedule()
 * @model abstract="true"
 * @generated
 */
public interface Schedule extends Solution {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.Task}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Task#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSchedule_Tasks()
	 * @see com.misc.common.moplaf.scheduler.Task#getSchedule
	 * @model opposite="Schedule" containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.Resource}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Resource#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSchedule_Resources()
	 * @see com.misc.common.moplaf.scheduler.Resource#getSchedule
	 * @model opposite="Schedule" containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Nr Scheduled Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Scheduled Tasks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Scheduled Tasks</em>' attribute.
	 * @see #setNrScheduledTasks(int)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSchedule_NrScheduledTasks()
	 * @model
	 * @generated
	 */
	int getNrScheduledTasks();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Schedule#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Scheduled Tasks</em>' attribute.
	 * @see #getNrScheduledTasks()
	 * @generated
	 */
	void setNrScheduledTasks(int value);

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' reference.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSchedule_Scheduler()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Scheduler getScheduler();

	/**
	 * Returns the value of the '<em><b>Not Scheduled Tasks</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Scheduled Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Scheduled Tasks</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getSchedule_NotScheduledTasks()
	 * @model
	 * @generated
	 */
	EList<Task> getNotScheduledTasks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the unique entry point for scheduling or unscheduling Task(s) on Resource.
	 * 
	 * The following conditions must be satisfied by the parameters. 
	 * 
	 * Either from and to are both planned on the same Resource, and from is before to, or from and to refers to the same Task, which is not scheduled. So the couple (from, to) refers to a sequence of planned tasks, or to some unplanned task.
	 * 
	 * Either all of resource, previous, next are not set, or we have either previous is null and next is first, or previous.next = next and next.previous = previous, or previous is last and next is null and previous and next are scheduled on resource. So the triple (resource, previous, next) refers to an insertion point in some Resource planning.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void schedule(Task from, Task to, Resource resource, Task previous, Task next);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the unique entry point for scheduling or unscheduling Task(s) on Resource.
	 * The following conditions must be satisfied by the parameters. 
	 * 
	 * Either from and to are both planned on the same Resource, and from is before to, or from and to refers to the same Task, which is not scheduled. So the couple (from, to) refers to a sequence of planned tasks, or to some unplanned task.
	 * 
	 * Either all of resource, previous, next are not set, or we have either previous is null and next is first, or previous.next = next and next.previous = previous, or previous is last and next is null and previous and next are scheduled on resource. So the triple (resource, previous, next) refers to an insertion point in some Resource planning.
	 * <!-- end-model-doc -->
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback"
	 * @generated
	 */
	EnabledFeedback scheduleFeedback(Task from, Task to, Resource resource, Task previous, Task next);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void flush();

} // Schedule
