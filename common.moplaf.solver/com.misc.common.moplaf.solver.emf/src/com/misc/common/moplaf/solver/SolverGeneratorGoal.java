/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalToSolve <em>Goal To Solve</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalWeight <em>Goal Weight</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGeneratorGoal()
 * @model
 * @generated
 */
public interface SolverGeneratorGoal extends SolverGoal {
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
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGeneratorGoal_GoalToSolve()
	 * @model required="true"
	 * @generated
	 */
	GeneratorGoal getGoalToSolve();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalToSolve <em>Goal To Solve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal To Solve</em>' reference.
	 * @see #getGoalToSolve()
	 * @generated
	 */
	void setGoalToSolve(GeneratorGoal value);

	/**
	 * Returns the value of the '<em><b>Goal Weight</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Weight</em>' attribute.
	 * @see #setGoalWeight(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGeneratorGoal_GoalWeight()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getGoalWeight();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalWeight <em>Goal Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Weight</em>' attribute.
	 * @see #getGoalWeight()
	 * @generated
	 */
	void setGoalWeight(float value);

} // SolverGeneratorGoal
