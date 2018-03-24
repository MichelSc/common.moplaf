/**
 */
package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Composite Event Refresh</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh#getAntecedenCalcDistributionInitialization <em>Anteceden Calc Distribution Initialization</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getLayerCompositeEventRefresh()
 * @model
 * @generated
 */
public interface LayerCompositeEventRefresh extends PropagatorFunctionDistribution {
	/**
	 * Returns the value of the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Parent</em>' reference.
	 * @see #setConcreteParent(ScopeDistribution)
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getLayerCompositeEventRefresh_ConcreteParent()
	 * @model
	 * @generated
	 */
	ScopeDistribution getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(ScopeDistribution value);

	/**
	 * Returns the value of the '<em><b>Anteceden Calc Distribution Initialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anteceden Calc Distribution Initialization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anteceden Calc Distribution Initialization</em>' reference.
	 * @see #setAntecedenCalcDistributionInitialization(CalcDistributionInitialization)
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getLayerCompositeEventRefresh_AntecedenCalcDistributionInitialization()
	 * @model
	 * @generated
	 */
	CalcDistributionInitialization getAntecedenCalcDistributionInitialization();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh#getAntecedenCalcDistributionInitialization <em>Anteceden Calc Distribution Initialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anteceden Calc Distribution Initialization</em>' reference.
	 * @see #getAntecedenCalcDistributionInitialization()
	 * @generated
	 */
	void setAntecedenCalcDistributionInitialization(CalcDistributionInitialization value);

} // LayerCompositeEventRefresh
