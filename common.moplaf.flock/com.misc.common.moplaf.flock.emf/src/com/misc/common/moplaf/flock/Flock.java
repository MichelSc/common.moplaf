/**
 */
package com.misc.common.moplaf.flock;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.Flock#getChains <em>Chains</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.Flock#getChainRoot <em>Chain Root</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.Flock#getDurationMin <em>Duration Min</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.Flock#getDurationMax <em>Duration Max</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.Flock#getStartEarliest <em>Start Earliest</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.Flock#getEndLatest <em>End Latest</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.Flock#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.Flock#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.Flock#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.Flock#getEndLocation <em>End Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.Flock#getStartEvent <em>Start Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.Flock#getEndEvent <em>End Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.Flock#getFlockScope <em>Flock Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.flock.FlockPackage#getFlock()
 * @model
 * @generated
 */
public interface Flock extends EObject {
	/**
	 * Returns the value of the '<em><b>Chains</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.flock.ChainFlock}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.ChainFlock#getFlock <em>Flock</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chains</em>' reference list.
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlock_Chains()
	 * @see com.misc.common.moplaf.flock.ChainFlock#getFlock
	 * @model opposite="Flock"
	 * @generated
	 */
	EList<ChainFlock> getChains();

	/**
	 * Returns the value of the '<em><b>Chain Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain Root</em>' reference.
	 * @see #setChainRoot(ChainFlock)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlock_ChainRoot()
	 * @model
	 * @generated
	 */
	ChainFlock getChainRoot();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.Flock#getChainRoot <em>Chain Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain Root</em>' reference.
	 * @see #getChainRoot()
	 * @generated
	 */
	void setChainRoot(ChainFlock value);

	/**
	 * Returns the value of the '<em><b>Duration Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Min</em>' attribute.
	 * @see #setDurationMin(float)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlock_DurationMin()
	 * @model
	 * @generated
	 */
	float getDurationMin();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.Flock#getDurationMin <em>Duration Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Min</em>' attribute.
	 * @see #getDurationMin()
	 * @generated
	 */
	void setDurationMin(float value);

	/**
	 * Returns the value of the '<em><b>Duration Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Max</em>' attribute.
	 * @see #setDurationMax(float)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlock_DurationMax()
	 * @model
	 * @generated
	 */
	float getDurationMax();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.Flock#getDurationMax <em>Duration Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Max</em>' attribute.
	 * @see #getDurationMax()
	 * @generated
	 */
	void setDurationMax(float value);

	/**
	 * Returns the value of the '<em><b>Start Earliest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Earliest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Earliest</em>' attribute.
	 * @see #setStartEarliest(Date)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlock_StartEarliest()
	 * @model
	 * @generated
	 */
	Date getStartEarliest();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.Flock#getStartEarliest <em>Start Earliest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Earliest</em>' attribute.
	 * @see #getStartEarliest()
	 * @generated
	 */
	void setStartEarliest(Date value);

	/**
	 * Returns the value of the '<em><b>End Latest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Latest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Latest</em>' attribute.
	 * @see #setEndLatest(Date)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlock_EndLatest()
	 * @model
	 * @generated
	 */
	Date getEndLatest();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.Flock#getEndLatest <em>End Latest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Latest</em>' attribute.
	 * @see #getEndLatest()
	 * @generated
	 */
	void setEndLatest(Date value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlock_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.Flock#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlock_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.Flock#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Start Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Location</em>' reference.
	 * @see #setStartLocation(Location)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlock_StartLocation()
	 * @model
	 * @generated
	 */
	Location getStartLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.Flock#getStartLocation <em>Start Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Location</em>' reference.
	 * @see #getStartLocation()
	 * @generated
	 */
	void setStartLocation(Location value);

	/**
	 * Returns the value of the '<em><b>End Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Location</em>' reference.
	 * @see #setEndLocation(Location)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlock_EndLocation()
	 * @model
	 * @generated
	 */
	Location getEndLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.Flock#getEndLocation <em>End Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Location</em>' reference.
	 * @see #getEndLocation()
	 * @generated
	 */
	void setEndLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Start Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.FlockEvent#getFlockAsStart <em>Flock As Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Event</em>' reference.
	 * @see #setStartEvent(FlockEvent)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlock_StartEvent()
	 * @see com.misc.common.moplaf.flock.FlockEvent#getFlockAsStart
	 * @model opposite="FlockAsStart" required="true"
	 * @generated
	 */
	FlockEvent getStartEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.Flock#getStartEvent <em>Start Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Event</em>' reference.
	 * @see #getStartEvent()
	 * @generated
	 */
	void setStartEvent(FlockEvent value);

	/**
	 * Returns the value of the '<em><b>End Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.FlockEvent#getFlockAsEnd <em>Flock As End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Event</em>' reference.
	 * @see #setEndEvent(FlockEvent)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlock_EndEvent()
	 * @see com.misc.common.moplaf.flock.FlockEvent#getFlockAsEnd
	 * @model opposite="FlockAsEnd" required="true"
	 * @generated
	 */
	FlockEvent getEndEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.Flock#getEndEvent <em>End Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Event</em>' reference.
	 * @see #getEndEvent()
	 * @generated
	 */
	void setEndEvent(FlockEvent value);

	/**
	 * Returns the value of the '<em><b>Flock Scope</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.FlockScope#getFlocks <em>Flocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flock Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flock Scope</em>' reference.
	 * @see #setFlockScope(FlockScope)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlock_FlockScope()
	 * @see com.misc.common.moplaf.flock.FlockScope#getFlocks
	 * @model opposite="Flocks" required="true"
	 * @generated
	 */
	FlockScope getFlockScope();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.Flock#getFlockScope <em>Flock Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flock Scope</em>' reference.
	 * @see #getFlockScope()
	 * @generated
	 */
	void setFlockScope(FlockScope value);

} // Flock
