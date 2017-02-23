/**
 */
package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagator Layer Distribution Slopes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes#getAntecedentCalcDistributionSequence <em>Antecedent Calc Distribution Sequence</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorLayerDistributionSlopes()
 * @model
 * @generated
 */
public interface PropagatorLayerDistributionSlopes extends PropagatorFunctionDistribution {

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
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorLayerDistributionSlopes_ConcreteParent()
	 * @model
	 * @generated
	 */
	PropagatorScopeDistribution getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(PropagatorScopeDistribution value);

	/**
	 * Returns the value of the '<em><b>Antecedent Calc Distribution Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Calc Distribution Sequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Calc Distribution Sequence</em>' reference.
	 * @see #setAntecedentCalcDistributionSequence(PropagatorCalcDistributionSequence)
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorLayerDistributionSlopes_AntecedentCalcDistributionSequence()
	 * @model
	 * @generated
	 */
	PropagatorCalcDistributionSequence getAntecedentCalcDistributionSequence();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes#getAntecedentCalcDistributionSequence <em>Antecedent Calc Distribution Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Calc Distribution Sequence</em>' reference.
	 * @see #getAntecedentCalcDistributionSequence()
	 * @generated
	 */
	void setAntecedentCalcDistributionSequence(PropagatorCalcDistributionSequence value);
} // PropagatorLayerDistributionSlopes
