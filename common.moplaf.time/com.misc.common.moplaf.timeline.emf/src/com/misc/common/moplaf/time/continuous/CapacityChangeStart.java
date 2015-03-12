/**
 */
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capacity Change Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.CapacityChangeStart#getCapacityChange <em>Capacity Change</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCapacityChangeStart()
 * @model extendedMetaData="name='SlopeImpulsion'"
 * @generated
 */
public interface CapacityChangeStart extends AmountImpulsion {

	/**
	 * Returns the value of the '<em><b>Capacity Change</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getCapacityChangeStart <em>Capacity Change Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity Change</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Change</em>' container reference.
	 * @see #setCapacityChange(CapacityChange)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCapacityChangeStart_CapacityChange()
	 * @see com.misc.common.moplaf.time.continuous.CapacityChange#getCapacityChangeStart
	 * @model opposite="CapacityChangeStart" transient="false"
	 * @generated
	 */
	CapacityChange getCapacityChange();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.CapacityChangeStart#getCapacityChange <em>Capacity Change</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Change</em>' container reference.
	 * @see #getCapacityChange()
	 * @generated
	 */
	void setCapacityChange(CapacityChange value);
} // CapacityChangeStart
