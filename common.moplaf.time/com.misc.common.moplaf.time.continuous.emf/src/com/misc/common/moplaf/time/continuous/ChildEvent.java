/**
 */
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.ChildEvent#getOriginal <em>Original</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getChildEvent()
 * @model
 * @generated
 */
public interface ChildEvent extends OwnedEvent {
	/**
	 * Returns the value of the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original</em>' reference.
	 * @see #setOriginal(DistributionEvent)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getChildEvent_Original()
	 * @model required="true"
	 * @generated
	 */
	DistributionEvent getOriginal();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.ChildEvent#getOriginal <em>Original</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original</em>' reference.
	 * @see #getOriginal()
	 * @generated
	 */
	void setOriginal(DistributionEvent value);

} // ChildEvent
