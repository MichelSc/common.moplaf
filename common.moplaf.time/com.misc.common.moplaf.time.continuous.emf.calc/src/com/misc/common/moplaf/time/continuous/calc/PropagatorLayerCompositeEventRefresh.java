/**
 */
package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagator Layer Composite Event Refresh</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh#getAntecedenCalcDistributionInitialization <em>Anteceden Calc Distribution Initialization</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorLayerCompositeEventRefresh()
 * @model
 * @generated
 */
public interface PropagatorLayerCompositeEventRefresh extends PropagatorFunctionDistribution {
	/**
	 * Returns the value of the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Parent</em>' reference.
	 * @see #setConcreteParent(PropagatorScopeDistribution)
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorLayerCompositeEventRefresh_ConcreteParent()
	 * @model
	 * @generated
	 */
	PropagatorScopeDistribution getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(PropagatorScopeDistribution value);

	/**
	 * Returns the value of the '<em><b>Anteceden Calc Distribution Initialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anteceden Calc Distribution Initialization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anteceden Calc Distribution Initialization</em>' reference.
	 * @see #setAntecedenCalcDistributionInitialization(PropagatorCalcDistributionInitialization)
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorLayerCompositeEventRefresh_AntecedenCalcDistributionInitialization()
	 * @model
	 * @generated
	 */
	PropagatorCalcDistributionInitialization getAntecedenCalcDistributionInitialization();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh#getAntecedenCalcDistributionInitialization <em>Anteceden Calc Distribution Initialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anteceden Calc Distribution Initialization</em>' reference.
	 * @see #getAntecedenCalcDistributionInitialization()
	 * @generated
	 */
	void setAntecedenCalcDistributionInitialization(PropagatorCalcDistributionInitialization value);

} // PropagatorLayerCompositeEventRefresh
