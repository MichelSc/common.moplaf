/**
 */
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slope Impulsion Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider#getEvent <em>Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider#getSlopeImpulsion <em>Slope Impulsion</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getSlopeImpulsionProvider()
 * @model
 * @generated
 */
public interface SlopeImpulsionProvider extends EventProvider {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(SlopeImpulsionAtomic)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getSlopeImpulsionProvider_Event()
	 * @see com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic#getProvider
	 * @model opposite="Provider" containment="true"
	 * @generated
	 */
	SlopeImpulsionAtomic getEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(SlopeImpulsionAtomic value);

	/**
	 * Returns the value of the '<em><b>Slope Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope Impulsion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope Impulsion</em>' attribute.
	 * @see #setSlopeImpulsion(float)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getSlopeImpulsionProvider_SlopeImpulsion()
	 * @model
	 * @generated
	 */
	float getSlopeImpulsion();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider#getSlopeImpulsion <em>Slope Impulsion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope Impulsion</em>' attribute.
	 * @see #getSlopeImpulsion()
	 * @generated
	 */
	void setSlopeImpulsion(float value);

} // SlopeImpulsionProvider
