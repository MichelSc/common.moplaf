/**
 */
package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagator Calc Event Amount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmount#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorCalcEventAmount()
 * @model
 * @generated
 */
public interface PropagatorCalcEventAmount extends PropagatorFunctionDistributionEvent {
	/**
	 * Returns the value of the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Parent</em>' reference.
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorCalcEventAmount_ConcreteParent()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	PropagatorLayerDistributionAmounts getConcreteParent();

} // PropagatorCalcEventAmount
