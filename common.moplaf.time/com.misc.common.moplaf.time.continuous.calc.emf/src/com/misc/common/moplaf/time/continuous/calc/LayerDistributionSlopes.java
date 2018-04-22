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
 * A representation of the model object '<em><b>Layer Distribution Slopes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.LayerDistributionSlopes#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.LayerDistributionSlopes#getAntecedentCalcDistributionSequence <em>Antecedent Calc Distribution Sequence</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getLayerDistributionSlopes()
 * @model
 * @generated
 */
public interface LayerDistributionSlopes extends PropagatorFunctionDistribution {
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
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getLayerDistributionSlopes_ConcreteParent()
	 * @model
	 * @generated
	 */
	ScopeDistribution getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.LayerDistributionSlopes#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(ScopeDistribution value);

	/**
	 * Returns the value of the '<em><b>Antecedent Calc Distribution Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Calc Distribution Sequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Calc Distribution Sequence</em>' reference.
	 * @see #setAntecedentCalcDistributionSequence(CalcDistributionSequence)
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getLayerDistributionSlopes_AntecedentCalcDistributionSequence()
	 * @model
	 * @generated
	 */
	CalcDistributionSequence getAntecedentCalcDistributionSequence();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.LayerDistributionSlopes#getAntecedentCalcDistributionSequence <em>Antecedent Calc Distribution Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Calc Distribution Sequence</em>' reference.
	 * @see #getAntecedentCalcDistributionSequence()
	 * @generated
	 */
	void setAntecedentCalcDistributionSequence(CalcDistributionSequence value);

} // LayerDistributionSlopes
