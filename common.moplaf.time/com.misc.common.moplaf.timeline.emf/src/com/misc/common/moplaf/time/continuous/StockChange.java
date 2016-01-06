/**
 */
package com.misc.common.moplaf.time.continuous;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stock Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A change of Amount spread in a given interval of time. The amount of the Distribution increases with a given Slope during the given time interval
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.StockChange#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.StockChange#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.StockChange#getSlope <em>Slope</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.StockChange#getStockChangeStart <em>Stock Change Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.StockChange#getStockChangeEnd <em>Stock Change End</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getStockChange()
 * @model
 * @generated
 */
public interface StockChange extends CompositeEvent {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getStockChange_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StockChange#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getStockChange_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StockChange#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope</em>' attribute.
	 * @see #setSlope(float)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getStockChange_Slope()
	 * @model
	 * @generated
	 */
	float getSlope();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StockChange#getSlope <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope</em>' attribute.
	 * @see #getSlope()
	 * @generated
	 */
	void setSlope(float value);

	/**
	 * Returns the value of the '<em><b>Stock Change Start</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.StockChangeStart#getStockChange <em>Stock Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Change Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Change Start</em>' containment reference.
	 * @see #setStockChangeStart(StockChangeStart)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getStockChange_StockChangeStart()
	 * @see com.misc.common.moplaf.time.continuous.StockChangeStart#getStockChange
	 * @model opposite="StockChange" containment="true"
	 * @generated
	 */
	StockChangeStart getStockChangeStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StockChange#getStockChangeStart <em>Stock Change Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock Change Start</em>' containment reference.
	 * @see #getStockChangeStart()
	 * @generated
	 */
	void setStockChangeStart(StockChangeStart value);

	/**
	 * Returns the value of the '<em><b>Stock Change End</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.StockChangeEnd#getStockChange <em>Stock Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Change End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Change End</em>' containment reference.
	 * @see #setStockChangeEnd(StockChangeEnd)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getStockChange_StockChangeEnd()
	 * @see com.misc.common.moplaf.time.continuous.StockChangeEnd#getStockChange
	 * @model opposite="StockChange" containment="true"
	 * @generated
	 */
	StockChangeEnd getStockChangeEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StockChange#getStockChangeEnd <em>Stock Change End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock Change End</em>' containment reference.
	 * @see #getStockChangeEnd()
	 * @generated
	 */
	void setStockChangeEnd(StockChangeEnd value);

} // StockChange
