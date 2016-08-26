/**
 */
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capacity Change End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.CapacityChangeEnd#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCapacityChangeEnd()
 * @model
 * @generated
 */
public interface CapacityChangeEnd extends AmountImpulsion {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getEndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' container reference.
	 * @see #setProvider(CapacityChange)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCapacityChangeEnd_Provider()
	 * @see com.misc.common.moplaf.time.continuous.CapacityChange#getEndEvent
	 * @model opposite="EndEvent" required="true" transient="false"
	 * @generated
	 */
	CapacityChange getProvider();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.CapacityChangeEnd#getProvider <em>Provider</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' container reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(CapacityChange value);

} // CapacityChangeEnd
