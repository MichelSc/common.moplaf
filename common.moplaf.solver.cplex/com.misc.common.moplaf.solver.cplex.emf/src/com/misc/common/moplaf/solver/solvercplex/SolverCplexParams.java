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
package com.misc.common.moplaf.solver.solvercplex;

import com.misc.common.moplaf.solver.SolverLpParams;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solver Cplex Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsCliques <em>Mip Cuts Cliques</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsCovers <em>Mip Cuts Covers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsFlowCovers <em>Mip Cuts Flow Covers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsGomory <em>Mip Cuts Gomory</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsGUBCovers <em>Mip Cuts GUB Covers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsImplied <em>Mip Cuts Implied</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsMIRCut <em>Mip Cuts MIR Cut</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsPathCut <em>Mip Cuts Path Cut</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyBacktrack <em>Mip Strategy Backtrack</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyHeuristicFreq <em>Mip Strategy Heuristic Freq</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyProbe <em>Mip Strategy Probe</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyPresolveNode <em>Mip Strategy Presolve Node</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipLimitsCutsFactor <em>Mip Limits Cuts Factor</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#getSolverCplexParams()
 * @model
 * @generated
 */
public interface SolverCplexParams extends SolverLpParams {
	/**
	 * Returns the value of the '<em><b>Mip Cuts Cliques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mip Cuts Cliques</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mip Cuts Cliques</em>' attribute.
	 * @see #setMipCutsCliques(int)
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#getSolverCplexParams_MipCutsCliques()
	 * @model
	 * @generated
	 */
	int getMipCutsCliques();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsCliques <em>Mip Cuts Cliques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mip Cuts Cliques</em>' attribute.
	 * @see #getMipCutsCliques()
	 * @generated
	 */
	void setMipCutsCliques(int value);

	/**
	 * Returns the value of the '<em><b>Mip Cuts Covers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mip Cuts Covers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mip Cuts Covers</em>' attribute.
	 * @see #setMipCutsCovers(int)
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#getSolverCplexParams_MipCutsCovers()
	 * @model
	 * @generated
	 */
	int getMipCutsCovers();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsCovers <em>Mip Cuts Covers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mip Cuts Covers</em>' attribute.
	 * @see #getMipCutsCovers()
	 * @generated
	 */
	void setMipCutsCovers(int value);

	/**
	 * Returns the value of the '<em><b>Mip Cuts Flow Covers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mip Cuts Flow Covers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mip Cuts Flow Covers</em>' attribute.
	 * @see #setMipCutsFlowCovers(int)
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#getSolverCplexParams_MipCutsFlowCovers()
	 * @model
	 * @generated
	 */
	int getMipCutsFlowCovers();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsFlowCovers <em>Mip Cuts Flow Covers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mip Cuts Flow Covers</em>' attribute.
	 * @see #getMipCutsFlowCovers()
	 * @generated
	 */
	void setMipCutsFlowCovers(int value);

	/**
	 * Returns the value of the '<em><b>Mip Cuts Gomory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mip Cuts Gomory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mip Cuts Gomory</em>' attribute.
	 * @see #setMipCutsGomory(int)
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#getSolverCplexParams_MipCutsGomory()
	 * @model
	 * @generated
	 */
	int getMipCutsGomory();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsGomory <em>Mip Cuts Gomory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mip Cuts Gomory</em>' attribute.
	 * @see #getMipCutsGomory()
	 * @generated
	 */
	void setMipCutsGomory(int value);

	/**
	 * Returns the value of the '<em><b>Mip Cuts GUB Covers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mip Cuts GUB Covers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mip Cuts GUB Covers</em>' attribute.
	 * @see #setMipCutsGUBCovers(int)
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#getSolverCplexParams_MipCutsGUBCovers()
	 * @model
	 * @generated
	 */
	int getMipCutsGUBCovers();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsGUBCovers <em>Mip Cuts GUB Covers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mip Cuts GUB Covers</em>' attribute.
	 * @see #getMipCutsGUBCovers()
	 * @generated
	 */
	void setMipCutsGUBCovers(int value);

	/**
	 * Returns the value of the '<em><b>Mip Cuts Implied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mip Cuts Implied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mip Cuts Implied</em>' attribute.
	 * @see #setMipCutsImplied(int)
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#getSolverCplexParams_MipCutsImplied()
	 * @model
	 * @generated
	 */
	int getMipCutsImplied();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsImplied <em>Mip Cuts Implied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mip Cuts Implied</em>' attribute.
	 * @see #getMipCutsImplied()
	 * @generated
	 */
	void setMipCutsImplied(int value);

	/**
	 * Returns the value of the '<em><b>Mip Cuts MIR Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mip Cuts MIR Cut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mip Cuts MIR Cut</em>' attribute.
	 * @see #setMipCutsMIRCut(int)
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#getSolverCplexParams_MipCutsMIRCut()
	 * @model
	 * @generated
	 */
	int getMipCutsMIRCut();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsMIRCut <em>Mip Cuts MIR Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mip Cuts MIR Cut</em>' attribute.
	 * @see #getMipCutsMIRCut()
	 * @generated
	 */
	void setMipCutsMIRCut(int value);

	/**
	 * Returns the value of the '<em><b>Mip Cuts Path Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mip Cuts Path Cut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mip Cuts Path Cut</em>' attribute.
	 * @see #setMipCutsPathCut(int)
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#getSolverCplexParams_MipCutsPathCut()
	 * @model
	 * @generated
	 */
	int getMipCutsPathCut();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsPathCut <em>Mip Cuts Path Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mip Cuts Path Cut</em>' attribute.
	 * @see #getMipCutsPathCut()
	 * @generated
	 */
	void setMipCutsPathCut(int value);

	/**
	 * Returns the value of the '<em><b>Mip Strategy Backtrack</b></em>' attribute.
	 * The default value is <code>"0.9999 "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mip Strategy Backtrack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mip Strategy Backtrack</em>' attribute.
	 * @see #setMipStrategyBacktrack(double)
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#getSolverCplexParams_MipStrategyBacktrack()
	 * @model default="0.9999 "
	 * @generated
	 */
	double getMipStrategyBacktrack();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyBacktrack <em>Mip Strategy Backtrack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mip Strategy Backtrack</em>' attribute.
	 * @see #getMipStrategyBacktrack()
	 * @generated
	 */
	void setMipStrategyBacktrack(double value);

	/**
	 * Returns the value of the '<em><b>Mip Strategy Heuristic Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mip Strategy Heuristic Freq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mip Strategy Heuristic Freq</em>' attribute.
	 * @see #setMipStrategyHeuristicFreq(int)
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#getSolverCplexParams_MipStrategyHeuristicFreq()
	 * @model
	 * @generated
	 */
	int getMipStrategyHeuristicFreq();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyHeuristicFreq <em>Mip Strategy Heuristic Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mip Strategy Heuristic Freq</em>' attribute.
	 * @see #getMipStrategyHeuristicFreq()
	 * @generated
	 */
	void setMipStrategyHeuristicFreq(int value);

	/**
	 * Returns the value of the '<em><b>Mip Strategy Probe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mip Strategy Probe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mip Strategy Probe</em>' attribute.
	 * @see #setMipStrategyProbe(int)
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#getSolverCplexParams_MipStrategyProbe()
	 * @model
	 * @generated
	 */
	int getMipStrategyProbe();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyProbe <em>Mip Strategy Probe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mip Strategy Probe</em>' attribute.
	 * @see #getMipStrategyProbe()
	 * @generated
	 */
	void setMipStrategyProbe(int value);

	/**
	 * Returns the value of the '<em><b>Mip Strategy Presolve Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mip Strategy Presolve Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mip Strategy Presolve Node</em>' attribute.
	 * @see #setMipStrategyPresolveNode(int)
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#getSolverCplexParams_MipStrategyPresolveNode()
	 * @model
	 * @generated
	 */
	int getMipStrategyPresolveNode();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyPresolveNode <em>Mip Strategy Presolve Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mip Strategy Presolve Node</em>' attribute.
	 * @see #getMipStrategyPresolveNode()
	 * @generated
	 */
	void setMipStrategyPresolveNode(int value);

	/**
	 * Returns the value of the '<em><b>Mip Limits Cuts Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mip Limits Cuts Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mip Limits Cuts Factor</em>' attribute.
	 * @see #setMipLimitsCutsFactor(int)
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage#getSolverCplexParams_MipLimitsCutsFactor()
	 * @model
	 * @generated
	 */
	int getMipLimitsCutsFactor();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipLimitsCutsFactor <em>Mip Limits Cuts Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mip Limits Cuts Factor</em>' attribute.
	 * @see #getMipLimitsCutsFactor()
	 * @generated
	 */
	void setMipLimitsCutsFactor(int value);

} // SolverCplexParams
