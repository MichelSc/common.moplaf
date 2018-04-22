/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calc Distribution Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionSequence#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionSequence#getAntecedentCalcDistributionProvidedEvents <em>Antecedent Calc Distribution Provided Events</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getCalcDistributionSequence()
 * @model
 * @generated
 */
public interface CalcDistributionSequence extends PropagatorFunctionDistribution {
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
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getCalcDistributionSequence_ConcreteParent()
	 * @model
	 * @generated
	 */
	ScopeDistribution getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionSequence#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(ScopeDistribution value);

	/**
	 * Returns the value of the '<em><b>Antecedent Calc Distribution Provided Events</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Calc Distribution Provided Events</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Calc Distribution Provided Events</em>' reference.
	 * @see #setAntecedentCalcDistributionProvidedEvents(CalcDistributionProvidedEvents)
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getCalcDistributionSequence_AntecedentCalcDistributionProvidedEvents()
	 * @model
	 * @generated
	 */
	CalcDistributionProvidedEvents getAntecedentCalcDistributionProvidedEvents();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionSequence#getAntecedentCalcDistributionProvidedEvents <em>Antecedent Calc Distribution Provided Events</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Calc Distribution Provided Events</em>' reference.
	 * @see #getAntecedentCalcDistributionProvidedEvents()
	 * @generated
	 */
	void setAntecedentCalcDistributionProvidedEvents(CalcDistributionProvidedEvents value);

} // CalcDistributionSequence
