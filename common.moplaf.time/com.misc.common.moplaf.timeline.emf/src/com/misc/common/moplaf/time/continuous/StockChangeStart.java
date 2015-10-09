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
 *   <li>{@link com.misc.common.moplaf.time.continuous.StockChangeStart#getStockChange <em>Stock Change</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getStockChangeStart()
 * @model
 * @generated
 */
public interface StockChangeStart extends SlopeImpulsion {

	/**
	 * Returns the value of the '<em><b>Stock Change</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.StockChange#getStockChangeStart <em>Stock Change Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Change</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Change</em>' container reference.
	 * @see #setStockChange(StockChange)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getStockChangeStart_StockChange()
	 * @see com.misc.common.moplaf.time.continuous.StockChange#getStockChangeStart
	 * @model opposite="StockChangeStart" required="true" transient="false"
	 * @generated
	 */
	StockChange getStockChange();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StockChangeStart#getStockChange <em>Stock Change</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock Change</em>' container reference.
	 * @see #getStockChange()
	 * @generated
	 */
	void setStockChange(StockChange value);
} // StockChangeStart
