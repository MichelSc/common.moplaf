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
package com.misc.common.moplaf.time.continuous;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagator Function Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getPropagatorFunctionDistribution()
 * @model
 * @generated
 */
public interface PropagatorFunctionDistribution extends PropagatorFunctionDistributionAbstract {
	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' reference.
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getPropagatorFunctionDistribution_Distribution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Distribution getDistribution();
	
	public static String PropagatorFunctionFactoryID = "com.misc.common.moplaf.time.continuous.calc.factory";

} // PropagatorFunctionDistribution
