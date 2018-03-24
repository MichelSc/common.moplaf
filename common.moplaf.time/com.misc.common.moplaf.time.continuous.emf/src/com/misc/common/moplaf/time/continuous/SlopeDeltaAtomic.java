/**
 */
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slope Delta Atomic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.SlopeDeltaAtomic#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeDeltaAtomic()
 * @model
 * @generated
 */
public interface SlopeDeltaAtomic extends SlopeDelta {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.SlopeDeltaProvider#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' container reference.
	 * @see #setProvider(SlopeDeltaProvider)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeDeltaAtomic_Provider()
	 * @see com.misc.common.moplaf.time.continuous.SlopeDeltaProvider#getEvent
	 * @model opposite="Event" required="true" transient="false"
	 * @generated
	 */
	SlopeDeltaProvider getProvider();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.SlopeDeltaAtomic#getProvider <em>Provider</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' container reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(SlopeDeltaProvider value);

} // SlopeDeltaAtomic
