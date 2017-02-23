/**
 */
package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagator Calc Distribution Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence#getAntecedentCalcDistributionProvidedEvents <em>Antecedent Calc Distribution Provided Events</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorCalcDistributionSequence()
 * @model
 * @generated
 */
public interface PropagatorCalcDistributionSequence extends PropagatorFunctionDistribution {

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
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorCalcDistributionSequence_ConcreteParent()
	 * @model
	 * @generated
	 */
	PropagatorScopeDistribution getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(PropagatorScopeDistribution value);

	/**
	 * Returns the value of the '<em><b>Antecedent Calc Distribution Provided Events</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Calc Distribution Provided Events</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Calc Distribution Provided Events</em>' reference.
	 * @see #setAntecedentCalcDistributionProvidedEvents(PropagatorCalcDistributionProvidedEvents)
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorCalcDistributionSequence_AntecedentCalcDistributionProvidedEvents()
	 * @model
	 * @generated
	 */
	PropagatorCalcDistributionProvidedEvents getAntecedentCalcDistributionProvidedEvents();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence#getAntecedentCalcDistributionProvidedEvents <em>Antecedent Calc Distribution Provided Events</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Calc Distribution Provided Events</em>' reference.
	 * @see #getAntecedentCalcDistributionProvidedEvents()
	 * @generated
	 */
	void setAntecedentCalcDistributionProvidedEvents(PropagatorCalcDistributionProvidedEvents value);
} // PropagatorCalcDistributionSequence
