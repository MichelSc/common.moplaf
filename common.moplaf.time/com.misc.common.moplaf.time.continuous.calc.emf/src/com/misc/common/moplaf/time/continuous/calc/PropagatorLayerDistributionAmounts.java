/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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
 * A representation of the model object '<em><b>Propagator Layer Distribution Amounts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts#getAntecedentLayerDistributionSlopes <em>Antecedent Layer Distribution Slopes</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorLayerDistributionAmounts()
 * @model
 * @generated
 */
public interface PropagatorLayerDistributionAmounts extends PropagatorFunctionDistribution {

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
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorLayerDistributionAmounts_ConcreteParent()
	 * @model
	 * @generated
	 */
	PropagatorScopeDistribution getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(PropagatorScopeDistribution value);

	/**
	 * Returns the value of the '<em><b>Antecedent Layer Distribution Slopes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Layer Distribution Slopes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Layer Distribution Slopes</em>' reference.
	 * @see #setAntecedentLayerDistributionSlopes(PropagatorLayerDistributionSlopes)
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#getPropagatorLayerDistributionAmounts_AntecedentLayerDistributionSlopes()
	 * @model
	 * @generated
	 */
	PropagatorLayerDistributionSlopes getAntecedentLayerDistributionSlopes();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts#getAntecedentLayerDistributionSlopes <em>Antecedent Layer Distribution Slopes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Layer Distribution Slopes</em>' reference.
	 * @see #getAntecedentLayerDistributionSlopes()
	 * @generated
	 */
	void setAntecedentLayerDistributionSlopes(PropagatorLayerDistributionSlopes value);
} // PropagatorLayerDistributionAmounts
