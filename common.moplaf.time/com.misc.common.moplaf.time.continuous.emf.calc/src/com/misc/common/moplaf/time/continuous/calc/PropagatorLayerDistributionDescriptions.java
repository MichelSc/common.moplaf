/**
 */
package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagator Layer Distribution Descriptions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionDescriptions#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionDescriptions#getAntecedentLayerDistributionAmounts <em>Antecedent Layer Distribution Amounts</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorLayerDistributionDescriptions()
 * @model
 * @generated
 */
public interface PropagatorLayerDistributionDescriptions extends PropagatorFunctionDistribution {

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
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorLayerDistributionDescriptions_ConcreteParent()
	 * @model
	 * @generated
	 */
	PropagatorScopeDistribution getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionDescriptions#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(PropagatorScopeDistribution value);

	/**
	 * Returns the value of the '<em><b>Antecedent Layer Distribution Amounts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Layer Distribution Amounts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Layer Distribution Amounts</em>' reference.
	 * @see #setAntecedentLayerDistributionAmounts(PropagatorLayerDistributionAmounts)
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorLayerDistributionDescriptions_AntecedentLayerDistributionAmounts()
	 * @model
	 * @generated
	 */
	PropagatorLayerDistributionAmounts getAntecedentLayerDistributionAmounts();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionDescriptions#getAntecedentLayerDistributionAmounts <em>Antecedent Layer Distribution Amounts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Layer Distribution Amounts</em>' reference.
	 * @see #getAntecedentLayerDistributionAmounts()
	 * @generated
	 */
	void setAntecedentLayerDistributionAmounts(PropagatorLayerDistributionAmounts value);
} // PropagatorLayerDistributionDescriptions
