/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.Task#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Task#getNextTask <em>Next Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Task#getPreviousTask <em>Previous Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Task#getScheduledResource <em>Scheduled Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Task#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Task#isScheduled <em>Scheduled</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Next Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Task#getPreviousTask <em>Previous Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Task</em>' reference.
	 * @see #setNextTask(Task)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTask_NextTask()
	 * @see com.misc.common.moplaf.scheduler.Task#getPreviousTask
	 * @model opposite="PreviousTask"
	 * @generated
	 */
	Task getNextTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Task#getNextTask <em>Next Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Task</em>' reference.
	 * @see #getNextTask()
	 * @generated
	 */
	void setNextTask(Task value);

	/**
	 * Returns the value of the '<em><b>Previous Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Task#getNextTask <em>Next Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Task</em>' reference.
	 * @see #setPreviousTask(Task)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTask_PreviousTask()
	 * @see com.misc.common.moplaf.scheduler.Task#getNextTask
	 * @model opposite="NextTask"
	 * @generated
	 */
	Task getPreviousTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Task#getPreviousTask <em>Previous Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Task</em>' reference.
	 * @see #getPreviousTask()
	 * @generated
	 */
	void setPreviousTask(Task value);

	/**
	 * Returns the value of the '<em><b>Scheduled Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Resource#getScheduledTasks <em>Scheduled Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Resource</em>' reference.
	 * @see #setScheduledResource(Resource)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTask_ScheduledResource()
	 * @see com.misc.common.moplaf.scheduler.Resource#getScheduledTasks
	 * @model opposite="ScheduledTasks"
	 * @generated
	 */
	Resource getScheduledResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Task#getScheduledResource <em>Scheduled Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Resource</em>' reference.
	 * @see #getScheduledResource()
	 * @generated
	 */
	void setScheduledResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTask_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Schedule#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' container reference.
	 * @see #setSchedule(Schedule)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTask_Schedule()
	 * @see com.misc.common.moplaf.scheduler.Schedule#getTasks
	 * @model opposite="Tasks" required="true" transient="false"
	 * @generated
	 */
	Schedule getSchedule();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Task#getSchedule <em>Schedule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' container reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Schedule value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scheduled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getTask_Scheduled()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isScheduled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void schedule(Resource resource, Task previous, Task next);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unschedule();

} // Task
