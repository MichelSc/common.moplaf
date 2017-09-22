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
 * A representation of the model object '<em><b>Lp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverLp#getSolOptimalityGap <em>Sol Optimality Gap</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverLp()
 * @model abstract="true"
 * @generated
 */
public interface SolverLp extends Solver, SolverLpParams {

	/**
	 * Returns the value of the '<em><b>Sol Optimality Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sol Optimality Gap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sol Optimality Gap</em>' attribute.
	 * @see #setSolOptimalityGap(double)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverLp_SolOptimalityGap()
	 * @model
	 * @generated
	 */
	double getSolOptimalityGap();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverLp#getSolOptimalityGap <em>Sol Optimality Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sol Optimality Gap</em>' attribute.
	 * @see #getSolOptimalityGap()
	 * @generated
	 */
	void setSolOptimalityGap(double value);

} // SolverLp
