/**
 */
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Amount Delta Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.AmountDeltaProvider#getEvent <em>Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.AmountDeltaProvider#getAmountDelta <em>Amount Delta</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getAmountDeltaProvider()
 * @model
 * @generated
 */
public interface AmountDeltaProvider extends EventProvider {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.AmountDeltaAtomic#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(AmountDeltaAtomic)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getAmountDeltaProvider_Event()
	 * @see com.misc.common.moplaf.time.continuous.AmountDeltaAtomic#getProvider
	 * @model opposite="Provider" containment="true"
	 * @generated
	 */
	AmountDeltaAtomic getEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.AmountDeltaProvider#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(AmountDeltaAtomic value);

	/**
	 * Returns the value of the '<em><b>Amount Delta</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Delta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Delta</em>' attribute.
	 * @see #setAmountDelta(double)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getAmountDeltaProvider_AmountDelta()
	 * @model default="0.0"
	 * @generated
	 */
	double getAmountDelta();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.AmountDeltaProvider#getAmountDelta <em>Amount Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Delta</em>' attribute.
	 * @see #getAmountDelta()
	 * @generated
	 */
	void setAmountDelta(double value);

} // AmountDeltaProvider
