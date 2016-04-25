/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverGoal#getGoalToSolve <em>Goal To Solve</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGoal()
 * @model
 * @generated
 */
public interface SolverGoal extends EObject {
	/**
	 * Returns the value of the '<em><b>Goal To Solve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal To Solve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal To Solve</em>' reference.
	 * @see #setGoalToSolve(GeneratorGoal)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGoal_GoalToSolve()
	 * @model required="true"
	 * @generated
	 */
	GeneratorGoal getGoalToSolve();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverGoal#getGoalToSolve <em>Goal To Solve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal To Solve</em>' reference.
	 * @see #getGoalToSolve()
	 * @generated
	 */
	void setGoalToSolve(GeneratorGoal value);

} // SolverGoal
