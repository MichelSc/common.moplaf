/**
 */
package com.misc.common.moplaf.flock;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.FlockEvent#getTime <em>Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.FlockEvent#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.FlockEvent#getFlockAsStart <em>Flock As Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.FlockEvent#getFlockAsEnd <em>Flock As End</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockEvent()
 * @model
 * @generated
 */
public interface FlockEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockEvent_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.FlockEvent#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockEvent_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.FlockEvent#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Flock As Start</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.flock.Flock}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.Flock#getStartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flock As Start</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flock As Start</em>' reference list.
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockEvent_FlockAsStart()
	 * @see com.misc.common.moplaf.flock.Flock#getStartEvent
	 * @model opposite="StartEvent"
	 * @generated
	 */
	EList<Flock> getFlockAsStart();

	/**
	 * Returns the value of the '<em><b>Flock As End</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.flock.Flock}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.Flock#getEndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flock As End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flock As End</em>' reference list.
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockEvent_FlockAsEnd()
	 * @see com.misc.common.moplaf.flock.Flock#getEndEvent
	 * @model opposite="EndEvent"
	 * @generated
	 */
	EList<Flock> getFlockAsEnd();

} // FlockEvent
