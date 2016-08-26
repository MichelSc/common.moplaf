/**
 */
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Amount Impulsion Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.AmountImpulsionProvider#getEvent <em>Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.AmountImpulsionProvider#getAmountImpulsion <em>Amount Impulsion</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getAmountImpulsionProvider()
 * @model
 * @generated
 */
public interface AmountImpulsionProvider extends EventProvider {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.AmountImpulsionAtomic#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(AmountImpulsionAtomic)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getAmountImpulsionProvider_Event()
	 * @see com.misc.common.moplaf.time.continuous.AmountImpulsionAtomic#getProvider
	 * @model opposite="Provider" containment="true"
	 * @generated
	 */
	AmountImpulsionAtomic getEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.AmountImpulsionProvider#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(AmountImpulsionAtomic value);

	/**
	 * Returns the value of the '<em><b>Amount Impulsion</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Impulsion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Impulsion</em>' attribute.
	 * @see #setAmountImpulsion(float)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getAmountImpulsionProvider_AmountImpulsion()
	 * @model default="0.0"
	 * @generated
	 */
	float getAmountImpulsion();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.AmountImpulsionProvider#getAmountImpulsion <em>Amount Impulsion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Impulsion</em>' attribute.
	 * @see #getAmountImpulsion()
	 * @generated
	 */
	void setAmountImpulsion(float value);

} // AmountImpulsionProvider
