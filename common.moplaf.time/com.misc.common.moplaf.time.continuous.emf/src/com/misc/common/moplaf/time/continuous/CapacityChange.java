/**
 */
package com.misc.common.moplaf.time.continuous;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capacity Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A change in Amount for an given interval of time. The value of the Distribution is increased by the given Amount at the start of the interval of time and decreased by the same Amount at the end of the interval of time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.CapacityChange#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.CapacityChange#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.CapacityChange#getAmount <em>Amount</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.CapacityChange#getStartEvent <em>Start Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.CapacityChange#getEndEvent <em>End Event</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getCapacityChange()
 * @model extendedMetaData="name='StockChange'"
 * @generated
 */
public interface CapacityChange extends EventsProvider {
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
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getCapacityChange_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getStart <em>Start</em>}' attribute.
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
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getCapacityChange_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getCapacityChange_Amount()
	 * @model
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Start Event</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.CapacityChangeStart#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Event</em>' containment reference.
	 * @see #setStartEvent(CapacityChangeStart)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getCapacityChange_StartEvent()
	 * @see com.misc.common.moplaf.time.continuous.CapacityChangeStart#getProvider
	 * @model opposite="Provider" containment="true"
	 * @generated
	 */
	CapacityChangeStart getStartEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getStartEvent <em>Start Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Event</em>' containment reference.
	 * @see #getStartEvent()
	 * @generated
	 */
	void setStartEvent(CapacityChangeStart value);

	/**
	 * Returns the value of the '<em><b>End Event</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.CapacityChangeEnd#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Event</em>' containment reference.
	 * @see #setEndEvent(CapacityChangeEnd)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getCapacityChange_EndEvent()
	 * @see com.misc.common.moplaf.time.continuous.CapacityChangeEnd#getProvider
	 * @model opposite="Provider" containment="true"
	 * @generated
	 */
	CapacityChangeEnd getEndEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getEndEvent <em>End Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Event</em>' containment reference.
	 * @see #getEndEvent()
	 * @generated
	 */
	void setEndEvent(CapacityChangeEnd value);

} // CapacityChange
