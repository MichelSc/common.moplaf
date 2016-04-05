/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Lp Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionLpGoal#getOptimalValue <em>Optimal Value</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionLpGoal()
 * @model
 * @generated
 */
public interface SolutionLpGoal extends SolutionGoal {
	/**
	 * Returns the value of the '<em><b>Optimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimal Value</em>' attribute.
	 * @see #setOptimalValue(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionLpGoal_OptimalValue()
	 * @model
	 * @generated
	 */
	float getOptimalValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionLpGoal#getOptimalValue <em>Optimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimal Value</em>' attribute.
	 * @see #getOptimalValue()
	 * @generated
	 */
	void setOptimalValue(float value);

} // SolutionLpGoal
