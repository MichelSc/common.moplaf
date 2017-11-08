/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.Resource#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Resource#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Resource#getScheduledTasks <em>Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Resource#getFirstTask <em>First Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Resource#getLastTask <em>Last Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Resource#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.Resource#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Schedule#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' container reference.
	 * @see #setSchedule(Schedule)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getResource_Schedule()
	 * @see com.misc.common.moplaf.scheduler.Schedule#getResources
	 * @model opposite="Resources" required="true" transient="false"
	 * @generated
	 */
	Schedule getSchedule();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Resource#getSchedule <em>Schedule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' container reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Schedule value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getResource_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Scheduled Tasks</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.Task}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.Task#getScheduledResource <em>Scheduled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Tasks</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getResource_ScheduledTasks()
	 * @see com.misc.common.moplaf.scheduler.Task#getScheduledResource
	 * @model opposite="ScheduledResource"
	 * @generated
	 */
	EList<Task> getScheduledTasks();

	/**
	 * Returns the value of the '<em><b>First Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Task</em>' reference.
	 * @see #setFirstTask(Task)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getResource_FirstTask()
	 * @model
	 * @generated
	 */
	Task getFirstTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Resource#getFirstTask <em>First Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Task</em>' reference.
	 * @see #getFirstTask()
	 * @generated
	 */
	void setFirstTask(Task value);

	/**
	 * Returns the value of the '<em><b>Last Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Task</em>' reference.
	 * @see #setLastTask(Task)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getResource_LastTask()
	 * @model
	 * @generated
	 */
	Task getLastTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Resource#getLastTask <em>Last Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Task</em>' reference.
	 * @see #getLastTask()
	 * @generated
	 */
	void setLastTask(Task value);

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
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getResource_NrScheduledTasks()
	 * @model
	 * @generated
	 */
	int getNrScheduledTasks();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Resource#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Scheduled Tasks</em>' attribute.
	 * @see #getNrScheduledTasks()
	 * @generated
	 */
	void setNrScheduledTasks(int value);

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
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Resource
