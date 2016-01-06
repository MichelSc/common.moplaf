/**
 */
package com.misc.common.moplaf.time.continuous;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capacity Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A change in Amount for an given interval of time. The value of the Distribution is increased by the given Amount at the start of the interval of time and decreased by the same Amount at the end of the interval of time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.CapacityChange#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.CapacityChange#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.CapacityChange#getAmount <em>Amount</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.CapacityChange#getCapacityChangeStart <em>Capacity Change Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.CapacityChange#getCapacityChangeEnd <em>Capacity Change End</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCapacityChange()
 * @model extendedMetaData="name='StockChange'"
 * @generated
 */
public interface CapacityChange extends CompositeEvent {
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
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCapacityChange_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getStart <em>Start</em>}' attribute.
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
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCapacityChange_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCapacityChange_Amount()
	 * @model
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Capacity Change Start</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.CapacityChangeStart#getCapacityChange <em>Capacity Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity Change Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Change Start</em>' containment reference.
	 * @see #setCapacityChangeStart(CapacityChangeStart)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCapacityChange_CapacityChangeStart()
	 * @see com.misc.common.moplaf.time.continuous.CapacityChangeStart#getCapacityChange
	 * @model opposite="CapacityChange" containment="true"
	 * @generated
	 */
	CapacityChangeStart getCapacityChangeStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getCapacityChangeStart <em>Capacity Change Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Change Start</em>' containment reference.
	 * @see #getCapacityChangeStart()
	 * @generated
	 */
	void setCapacityChangeStart(CapacityChangeStart value);

	/**
	 * Returns the value of the '<em><b>Capacity Change End</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.CapacityChangeEnd#getCapacityChange <em>Capacity Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity Change End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Change End</em>' containment reference.
	 * @see #setCapacityChangeEnd(CapacityChangeEnd)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCapacityChange_CapacityChangeEnd()
	 * @see com.misc.common.moplaf.time.continuous.CapacityChangeEnd#getCapacityChange
	 * @model opposite="CapacityChange" containment="true"
	 * @generated
	 */
	CapacityChangeEnd getCapacityChangeEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getCapacityChangeEnd <em>Capacity Change End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Change End</em>' containment reference.
	 * @see #getCapacityChangeEnd()
	 * @generated
	 */
	void setCapacityChangeEnd(CapacityChangeEnd value);

} // CapacityChange
