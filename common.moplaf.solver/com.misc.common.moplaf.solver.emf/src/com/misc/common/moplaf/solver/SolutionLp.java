/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Lp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionLp#getGoalValue <em>Goal Value</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionLp()
 * @model
 * @generated
 */
public interface SolutionLp extends Solution {

	/**
	 * Returns the value of the '<em><b>Goal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Value</em>' attribute.
	 * @see #setGoalValue(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionLp_GoalValue()
	 * @model
	 * @generated
	 */
	float getGoalValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionLp#getGoalValue <em>Goal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Value</em>' attribute.
	 * @see #getGoalValue()
	 * @generated
	 */
	void setGoalValue(float value);
} // SolutionLp
