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
 *   <li>{@link com.misc.common.moplaf.time.continuous.StockChange#getStartEvent <em>Start Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.StockChange#getEndEvent <em>End Event</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getStockChange()
 * @model
 * @generated
 */
public interface StockChange extends EventsProvider {
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
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getStockChange_Start()
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
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getStockChange_End()
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
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getStockChange_Slope()
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
	 * Returns the value of the '<em><b>Start Event</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.StockChangeStart#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Event</em>' containment reference.
	 * @see #setStartEvent(StockChangeStart)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getStockChange_StartEvent()
	 * @see com.misc.common.moplaf.time.continuous.StockChangeStart#getProvider
	 * @model opposite="Provider" containment="true"
	 * @generated
	 */
	StockChangeStart getStartEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StockChange#getStartEvent <em>Start Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Event</em>' containment reference.
	 * @see #getStartEvent()
	 * @generated
	 */
	void setStartEvent(StockChangeStart value);

	/**
	 * Returns the value of the '<em><b>End Event</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.StockChangeEnd#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Event</em>' containment reference.
	 * @see #setEndEvent(StockChangeEnd)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getStockChange_EndEvent()
	 * @see com.misc.common.moplaf.time.continuous.StockChangeEnd#getProvider
	 * @model opposite="Provider" containment="true"
	 * @generated
	 */
	StockChangeEnd getEndEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StockChange#getEndEvent <em>End Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Event</em>' containment reference.
	 * @see #getEndEvent()
	 * @generated
	 */
	void setEndEvent(StockChangeEnd value);

} // StockChange
