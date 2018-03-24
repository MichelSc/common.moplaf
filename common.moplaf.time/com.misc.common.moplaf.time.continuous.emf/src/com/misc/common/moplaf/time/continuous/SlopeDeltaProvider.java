/**
 */
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slope Delta Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.SlopeDeltaProvider#getEvent <em>Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.SlopeDeltaProvider#getSlopeDelta <em>Slope Delta</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeDeltaProvider()
 * @model
 * @generated
 */
public interface SlopeDeltaProvider extends EventProvider {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.SlopeDeltaAtomic#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(SlopeDeltaAtomic)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeDeltaProvider_Event()
	 * @see com.misc.common.moplaf.time.continuous.SlopeDeltaAtomic#getProvider
	 * @model opposite="Provider" containment="true"
	 * @generated
	 */
	SlopeDeltaAtomic getEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.SlopeDeltaProvider#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(SlopeDeltaAtomic value);

	/**
	 * Returns the value of the '<em><b>Slope Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope Delta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope Delta</em>' attribute.
	 * @see #setSlopeDelta(double)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeDeltaProvider_SlopeDelta()
	 * @model
	 * @generated
	 */
	double getSlopeDelta();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.SlopeDeltaProvider#getSlopeDelta <em>Slope Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope Delta</em>' attribute.
	 * @see #getSlopeDelta()
	 * @generated
	 */
	void setSlopeDelta(double value);

} // SlopeDeltaProvider
