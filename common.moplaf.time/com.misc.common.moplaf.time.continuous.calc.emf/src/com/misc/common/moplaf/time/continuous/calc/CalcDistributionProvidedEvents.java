/**
 */
package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calc Distribution Provided Events</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents#getAntecedentLayerCompositeeventRefresh <em>Antecedent Layer Compositeevent Refresh</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents#getAntecedentCalcDistributionchildEvents <em>Antecedent Calc Distributionchild Events</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getCalcDistributionProvidedEvents()
 * @model
 * @generated
 */
public interface CalcDistributionProvidedEvents extends PropagatorFunctionDistribution {
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
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getCalcDistributionProvidedEvents_ConcreteParent()
	 * @model
	 * @generated
	 */
	ScopeDistribution getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(ScopeDistribution value);

	/**
	 * Returns the value of the '<em><b>Antecedent Layer Compositeevent Refresh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Layer Compositeevent Refresh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Layer Compositeevent Refresh</em>' reference.
	 * @see #setAntecedentLayerCompositeeventRefresh(LayerCompositeEventRefresh)
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getCalcDistributionProvidedEvents_AntecedentLayerCompositeeventRefresh()
	 * @model
	 * @generated
	 */
	LayerCompositeEventRefresh getAntecedentLayerCompositeeventRefresh();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents#getAntecedentLayerCompositeeventRefresh <em>Antecedent Layer Compositeevent Refresh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Layer Compositeevent Refresh</em>' reference.
	 * @see #getAntecedentLayerCompositeeventRefresh()
	 * @generated
	 */
	void setAntecedentLayerCompositeeventRefresh(LayerCompositeEventRefresh value);

	/**
	 * Returns the value of the '<em><b>Antecedent Calc Distributionchild Events</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Calc Distributionchild Events</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Calc Distributionchild Events</em>' reference.
	 * @see #setAntecedentCalcDistributionchildEvents(CalcDistributionChildEvents)
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getCalcDistributionProvidedEvents_AntecedentCalcDistributionchildEvents()
	 * @model
	 * @generated
	 */
	CalcDistributionChildEvents getAntecedentCalcDistributionchildEvents();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents#getAntecedentCalcDistributionchildEvents <em>Antecedent Calc Distributionchild Events</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Calc Distributionchild Events</em>' reference.
	 * @see #getAntecedentCalcDistributionchildEvents()
	 * @generated
	 */
	void setAntecedentCalcDistributionchildEvents(CalcDistributionChildEvents value);

} // CalcDistributionProvidedEvents
