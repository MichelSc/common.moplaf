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
 * A representation of the model object '<em><b>Lp Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverLpParams#getSolverOptimalityTolerance <em>Solver Optimality Tolerance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolverLpParams#isSolverLinearRelaxation <em>Solver Linear Relaxation</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverLpParams()
 * @model
 * @generated
 */
public interface SolverLpParams extends SolverParams {
	/**
	 * Returns the value of the '<em><b>Solver Optimality Tolerance</b></em>' attribute.
	 * The default value is <code>"0.05"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Optimality Tolerance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Optimality Tolerance</em>' attribute.
	 * @see #setSolverOptimalityTolerance(double)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverLpParams_SolverOptimalityTolerance()
	 * @model default="0.05"
	 * @generated
	 */
	double getSolverOptimalityTolerance();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverLpParams#getSolverOptimalityTolerance <em>Solver Optimality Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Optimality Tolerance</em>' attribute.
	 * @see #getSolverOptimalityTolerance()
	 * @generated
	 */
	void setSolverOptimalityTolerance(double value);

	/**
	 * Returns the value of the '<em><b>Solver Linear Relaxation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Linear Relaxation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Linear Relaxation</em>' attribute.
	 * @see #setSolverLinearRelaxation(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverLpParams_SolverLinearRelaxation()
	 * @model
	 * @generated
	 */
	boolean isSolverLinearRelaxation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverLpParams#isSolverLinearRelaxation <em>Solver Linear Relaxation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Linear Relaxation</em>' attribute.
	 * @see #isSolverLinearRelaxation()
	 * @generated
	 */
	void setSolverLinearRelaxation(boolean value);

} // SolverLpParams
