/**
 */
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.EndEvent#getDistributionAsEnd <em>Distribution As End</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getEndEvent()
 * @model
 * @generated
 */
public interface EndEvent extends DistributionEvent {
	/**
	 * Returns the value of the '<em><b>Distribution As End</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.Distribution#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution As End</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution As End</em>' container reference.
	 * @see #setDistributionAsEnd(Distribution)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getEndEvent_DistributionAsEnd()
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getEnd
	 * @model opposite="End" required="true" transient="false"
	 * @generated
	 */
	Distribution getDistributionAsEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.EndEvent#getDistributionAsEnd <em>Distribution As End</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution As End</em>' container reference.
	 * @see #getDistributionAsEnd()
	 * @generated
	 */
	void setDistributionAsEnd(Distribution value);

} // EndEvent
