/**
 */
package com.misc.common.moplaf.scheduler;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flock Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An activity involving Resources. 
 * Typically that will take place at the same time(s) and location(s)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.FlockTask#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.FlockTask#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.FlockTask#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getFlockTask()
 * @model
 * @generated
 */
public interface FlockTask extends Task {
	/**
	 * Returns the value of the '<em><b>Predecessors</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.FlockTask}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.FlockTask#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessors</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getFlockTask_Predecessors()
	 * @see com.misc.common.moplaf.scheduler.FlockTask#getSuccessors
	 * @model opposite="Successors"
	 * @generated
	 */
	EList<FlockTask> getPredecessors();

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.FlockTask}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.FlockTask#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getFlockTask_Successors()
	 * @see com.misc.common.moplaf.scheduler.FlockTask#getPredecessors
	 * @model opposite="Predecessors"
	 * @generated
	 */
	EList<FlockTask> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.FlockResource#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(FlockResource)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getFlockTask_Resource()
	 * @see com.misc.common.moplaf.scheduler.FlockResource#getTasks
	 * @model opposite="Tasks"
	 * @generated
	 */
	FlockResource getResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.FlockTask#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(FlockResource value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the collection of Tasks to be planned together on the same Resource, in a sequence consistent with the Predecessors-Successors relationship
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FlockTask> getCongruentTasks();

} // FlockTask
