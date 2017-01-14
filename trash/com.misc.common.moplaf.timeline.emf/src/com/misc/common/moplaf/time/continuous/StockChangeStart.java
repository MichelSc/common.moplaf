/**
 */
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stock Change Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.StockChangeStart#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getStockChangeStart()
 * @model
 * @generated
 */
public interface StockChangeStart extends SlopeImpulsion {

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.StockChange#getStartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' container reference.
	 * @see #setProvider(StockChange)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getStockChangeStart_Provider()
	 * @see com.misc.common.moplaf.time.continuous.StockChange#getStartEvent
	 * @model opposite="StartEvent" required="true" transient="false"
	 * @generated
	 */
	StockChange getProvider();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StockChangeStart#getProvider <em>Provider</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' container reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(StockChange value);
} // StockChangeStart
