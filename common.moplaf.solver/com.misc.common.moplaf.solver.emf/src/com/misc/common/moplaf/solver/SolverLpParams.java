/**
 */
package com.misc.common.moplaf.solver;

import com.misc.common.moplaf.job.RunParams;

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
 *   <li>{@link com.misc.common.moplaf.solver.SolverLpParams#getSolOptimalityGap <em>Sol Optimality Gap</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverLpParams()
 * @model
 * @generated
 */
public interface SolverLpParams extends RunParams {
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
	 * @see #setSolverOptimalityTolerance(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverLpParams_SolverOptimalityTolerance()
	 * @model default="0.05"
	 * @generated
	 */
	float getSolverOptimalityTolerance();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverLpParams#getSolverOptimalityTolerance <em>Solver Optimality Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Optimality Tolerance</em>' attribute.
	 * @see #getSolverOptimalityTolerance()
	 * @generated
	 */
	void setSolverOptimalityTolerance(float value);

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

	/**
	 * Returns the value of the '<em><b>Sol Optimality Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sol Optimality Gap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sol Optimality Gap</em>' attribute.
	 * @see #setSolOptimalityGap(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverLpParams_SolOptimalityGap()
	 * @model
	 * @generated
	 */
	float getSolOptimalityGap();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverLpParams#getSolOptimalityGap <em>Sol Optimality Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sol Optimality Gap</em>' attribute.
	 * @see #getSolOptimalityGap()
	 * @generated
	 */
	void setSolOptimalityGap(float value);

} // SolverLpParams
