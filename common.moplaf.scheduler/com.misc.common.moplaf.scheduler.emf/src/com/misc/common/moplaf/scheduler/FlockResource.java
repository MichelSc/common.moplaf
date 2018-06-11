/**
 */
package com.misc.common.moplaf.scheduler;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flock Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.FlockResource#getPlannedResource <em>Planned Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.FlockResource#isKeepTogether <em>Keep Together</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.FlockResource#isFullyPlanned <em>Fully Planned</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.FlockResource#isResourceInvalid <em>Resource Invalid</em>}</li>
 *   <li>{@link com.misc.common.moplaf.scheduler.FlockResource#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getFlockResource()
 * @model
 * @generated
 */
public interface FlockResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Planned Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Resource</em>' reference.
	 * @see #setPlannedResource(Resource)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getFlockResource_PlannedResource()
	 * @model
	 * @generated
	 */
	Resource getPlannedResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.FlockResource#getPlannedResource <em>Planned Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Resource</em>' reference.
	 * @see #getPlannedResource()
	 * @generated
	 */
	void setPlannedResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Keep Together</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Together</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Together</em>' attribute.
	 * @see #setKeepTogether(boolean)
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getFlockResource_KeepTogether()
	 * @model
	 * @generated
	 */
	boolean isKeepTogether();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.scheduler.FlockResource#isKeepTogether <em>Keep Together</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Together</em>' attribute.
	 * @see #isKeepTogether()
	 * @generated
	 */
	void setKeepTogether(boolean value);

	/**
	 * Returns the value of the '<em><b>Fully Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fully Planned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fully Planned</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getFlockResource_FullyPlanned()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isFullyPlanned();

	/**
	 * Returns the value of the '<em><b>Resource Invalid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Invalid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Invalid</em>' attribute.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getFlockResource_ResourceInvalid()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isResourceInvalid();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.scheduler.FlockTask}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.scheduler.FlockTask#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see com.misc.common.moplaf.scheduler.SchedulerPackage#getFlockResource_Tasks()
	 * @see com.misc.common.moplaf.scheduler.FlockTask#getResource
	 * @model opposite="Resource"
	 * @generated
	 */
	EList<FlockTask> getTasks();

} // FlockResource
