/**
 */
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.StartEvent#getAmountAtStart <em>Amount At Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.StartEvent#getSlopeAtStart <em>Slope At Start</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getStartEvent()
 * @model
 * @generated
 */
public interface StartEvent extends OwnedEvent {
	/**
	 * Returns the value of the '<em><b>Amount At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount At Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount At Start</em>' attribute.
	 * @see #setAmountAtStart(float)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getStartEvent_AmountAtStart()
	 * @model
	 * @generated
	 */
	float getAmountAtStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StartEvent#getAmountAtStart <em>Amount At Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount At Start</em>' attribute.
	 * @see #getAmountAtStart()
	 * @generated
	 */
	void setAmountAtStart(float value);

	/**
	 * Returns the value of the '<em><b>Slope At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope At Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope At Start</em>' attribute.
	 * @see #setSlopeAtStart(float)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getStartEvent_SlopeAtStart()
	 * @model
	 * @generated
	 */
	float getSlopeAtStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StartEvent#getSlopeAtStart <em>Slope At Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope At Start</em>' attribute.
	 * @see #getSlopeAtStart()
	 * @generated
	 */
	void setSlopeAtStart(float value);

} // StartEvent
