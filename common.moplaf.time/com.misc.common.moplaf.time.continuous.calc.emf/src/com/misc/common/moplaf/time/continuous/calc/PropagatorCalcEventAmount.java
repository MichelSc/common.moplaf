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