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
 *   <li>{@link com.misc.common.moplaf.time.continuous.CapacityChangeEnd#getCapacityChange <em>Capacity Change</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCapacityChangeEnd()
 * @model extendedMetaData="name='SlopeImpulsion'"
 * @generated
 */
public interface CapacityChangeEnd extends AmountImpulsion {

	/**
	 * Returns the value of the '<em><b>Capacity Change</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getCapacityChangeEnd <em>Capacity Change End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity Change</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Change</em>' container reference.
	 * @see #setCapacityChange(CapacityChange)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCapacityChangeEnd_CapacityChange()
	 * @see com.misc.common.moplaf.time.continuous.CapacityChange#getCapacityChangeEnd
	 * @model opposite="CapacityChangeEnd" transient="false"
	 * @generated
	 */
	CapacityChange getCapacityChange();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.CapacityChangeEnd#getCapacityChange <em>Capacity Change</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Change</em>' container reference.
	 * @see #getCapacityChange()
	 * @generated
	 */
	void setCapacityChange(CapacityChange value);
} // CapacityChangeEnd
