/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Previous Solver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverGoalPreviousSolver#getPreviousSolver <em>Previous Solver</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolverGoalPreviousSolver#getPreviousSolution <em>Previous Solution</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGoalPreviousSolver()
 * @model
 * @generated
 */
public interface SolverGoalPreviousSolver extends SolverGoal {
	/**
	 * Returns the value of the '<em><b>Previous Solver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Solver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Solver</em>' reference.
	 * @see #setPreviousSolver(Solver)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGoalPreviousSolver_PreviousSolver()
	 * @model required="true"
	 * @generated
	 */
	Solver getPreviousSolver();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverGoalPreviousSolver#getPreviousSolver <em>Previous Solver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Solver</em>' reference.
	 * @see #getPreviousSolver()
	 * @generated
	 */
	void setPreviousSolver(Solver value);

	/**
	 * Returns the value of the '<em><b>Previous Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Solution</em>' reference.
	 * @see #setPreviousSolution(Solution)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGoalPreviousSolver_PreviousSolution()
	 * @model
	 * @generated
	 */
	Solution getPreviousSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverGoalPreviousSolver#getPreviousSolution <em>Previous Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Solution</em>' reference.
	 * @see #getPreviousSolution()
	 * @generated
	 */
	void setPreviousSolution(Solution value);

} // SolverGoalPreviousSolver
