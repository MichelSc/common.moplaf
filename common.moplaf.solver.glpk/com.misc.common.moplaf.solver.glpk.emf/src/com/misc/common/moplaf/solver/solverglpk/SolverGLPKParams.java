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
package com.misc.common.moplaf.solver.solverglpk;

import com.misc.common.moplaf.solver.SolverLpParams;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solver GLPK Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnablePresolve <em>Enable Presolve</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableFeasibilityPump <em>Enable Feasibility Pump</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableGomoryCuts <em>Enable Gomory Cuts</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableGeneratingCliqueCuts <em>Enable Generating Clique Cuts</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableGeneratingMixedCoverCuts <em>Enable Generating Mixed Cover Cuts</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableMixedIntegerRoundingCuts <em>Enable Mixed Integer Rounding Cuts</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage#getSolverGLPKParams()
 * @model
 * @generated
 */
public interface SolverGLPKParams extends SolverLpParams {
	/**
	 * Returns the value of the '<em><b>Enable Feasibility Pump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Feasibility Pump</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Feasibility Pump</em>' attribute.
	 * @see #setEnableFeasibilityPump(boolean)
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage#getSolverGLPKParams_EnableFeasibilityPump()
	 * @model
	 * @generated
	 */
	boolean isEnableFeasibilityPump();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableFeasibilityPump <em>Enable Feasibility Pump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Feasibility Pump</em>' attribute.
	 * @see #isEnableFeasibilityPump()
	 * @generated
	 */
	void setEnableFeasibilityPump(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Gomory Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Gomory Cuts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Gomory Cuts</em>' attribute.
	 * @see #setEnableGomoryCuts(boolean)
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage#getSolverGLPKParams_EnableGomoryCuts()
	 * @model
	 * @generated
	 */
	boolean isEnableGomoryCuts();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableGomoryCuts <em>Enable Gomory Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Gomory Cuts</em>' attribute.
	 * @see #isEnableGomoryCuts()
	 * @generated
	 */
	void setEnableGomoryCuts(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Generating Clique Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Generating Clique Cuts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Generating Clique Cuts</em>' attribute.
	 * @see #setEnableGeneratingCliqueCuts(boolean)
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage#getSolverGLPKParams_EnableGeneratingCliqueCuts()
	 * @model
	 * @generated
	 */
	boolean isEnableGeneratingCliqueCuts();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableGeneratingCliqueCuts <em>Enable Generating Clique Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Generating Clique Cuts</em>' attribute.
	 * @see #isEnableGeneratingCliqueCuts()
	 * @generated
	 */
	void setEnableGeneratingCliqueCuts(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Generating Mixed Cover Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Generating Mixed Cover Cuts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Generating Mixed Cover Cuts</em>' attribute.
	 * @see #setEnableGeneratingMixedCoverCuts(boolean)
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage#getSolverGLPKParams_EnableGeneratingMixedCoverCuts()
	 * @model
	 * @generated
	 */
	boolean isEnableGeneratingMixedCoverCuts();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableGeneratingMixedCoverCuts <em>Enable Generating Mixed Cover Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Generating Mixed Cover Cuts</em>' attribute.
	 * @see #isEnableGeneratingMixedCoverCuts()
	 * @generated
	 */
	void setEnableGeneratingMixedCoverCuts(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Mixed Integer Rounding Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Mixed Integer Rounding Cuts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Mixed Integer Rounding Cuts</em>' attribute.
	 * @see #setEnableMixedIntegerRoundingCuts(boolean)
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage#getSolverGLPKParams_EnableMixedIntegerRoundingCuts()
	 * @model
	 * @generated
	 */
	boolean isEnableMixedIntegerRoundingCuts();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableMixedIntegerRoundingCuts <em>Enable Mixed Integer Rounding Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Mixed Integer Rounding Cuts</em>' attribute.
	 * @see #isEnableMixedIntegerRoundingCuts()
	 * @generated
	 */
	void setEnableMixedIntegerRoundingCuts(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Presolve</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Presolve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Presolve</em>' attribute.
	 * @see #setEnablePresolve(boolean)
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage#getSolverGLPKParams_EnablePresolve()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnablePresolve();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnablePresolve <em>Enable Presolve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Presolve</em>' attribute.
	 * @see #isEnablePresolve()
	 * @generated
	 */
	void setEnablePresolve(boolean value);

} // SolverGLPKParams
