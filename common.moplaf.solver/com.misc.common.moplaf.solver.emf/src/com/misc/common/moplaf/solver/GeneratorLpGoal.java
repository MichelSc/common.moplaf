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
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Lp Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getSelectedSolutionValue <em>Selected Solution Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getMinValueIndicative <em>Min Value Indicative</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getMaxValueIndicative <em>Max Value Indicative</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpGoal()
 * @model
 * @generated
 */
public interface GeneratorLpGoal extends GeneratorGoal, GeneratorLpLinear {
	/**
	 * Returns the value of the '<em><b>Selected Solution Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Solution Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Solution Value</em>' attribute.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpGoal_SelectedSolutionValue()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getSelectedSolutionValue();

	/**
	 * Returns the value of the '<em><b>Min Value Indicative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Indicative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Indicative</em>' attribute.
	 * @see #setMinValueIndicative(double)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpGoal_MinValueIndicative()
	 * @model
	 * @generated
	 */
	double getMinValueIndicative();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getMinValueIndicative <em>Min Value Indicative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Indicative</em>' attribute.
	 * @see #getMinValueIndicative()
	 * @generated
	 */
	void setMinValueIndicative(double value);

	/**
	 * Returns the value of the '<em><b>Max Value Indicative</b></em>' attribute.
	 * The default value is <code>"100000000000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Indicative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Indicative</em>' attribute.
	 * @see #setMaxValueIndicative(double)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpGoal_MaxValueIndicative()
	 * @model default="100000000000"
	 * @generated
	 */
	double getMaxValueIndicative();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getMaxValueIndicative <em>Max Value Indicative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Indicative</em>' attribute.
	 * @see #getMaxValueIndicative()
	 * @generated
	 */
	void setMaxValueIndicative(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double getSolutionValue(Solution solution);

} // GeneratorLpGoal
