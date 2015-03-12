/**
 */
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.StartEvent#getAmountAtStart <em>Amount At Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.StartEvent#getSlopeAtStart <em>Slope At Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.StartEvent#getDistributionAsStart <em>Distribution As Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getStartEvent()
 * @model
 * @generated
 */
public interface StartEvent extends DistributionEvent {
	/**
	 * Returns the value of the '<em><b>Amount At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount At Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount At Start</em>' attribute.
	 * @see #setAmountAtStart(float)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getStartEvent_AmountAtStart()
	 * @model
	 * @generated
	 */
	float getAmountAtStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StartEvent#getAmountAtStart <em>Amount At Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount At Start</em>' attribute.
	 * @see #getAmountAtStart()
	 * @generated
	 */
	void setAmountAtStart(float value);

	/**
	 * Returns the value of the '<em><b>Slope At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope At Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope At Start</em>' attribute.
	 * @see #setSlopeAtStart(float)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getStartEvent_SlopeAtStart()
	 * @model
	 * @generated
	 */
	float getSlopeAtStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StartEvent#getSlopeAtStart <em>Slope At Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope At Start</em>' attribute.
	 * @see #getSlopeAtStart()
	 * @generated
	 */
	void setSlopeAtStart(float value);

	/**
	 * Returns the value of the '<em><b>Distribution As Start</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.Distribution#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution As Start</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution As Start</em>' container reference.
	 * @see #setDistributionAsStart(Distribution)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getStartEvent_DistributionAsStart()
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getStart
	 * @model opposite="Start" required="true" transient="false"
	 * @generated
	 */
	Distribution getDistributionAsStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StartEvent#getDistributionAsStart <em>Distribution As Start</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution As Start</em>' container reference.
	 * @see #getDistributionAsStart()
	 * @generated
	 */
	void setDistributionAsStart(Distribution value);

} // StartEvent
