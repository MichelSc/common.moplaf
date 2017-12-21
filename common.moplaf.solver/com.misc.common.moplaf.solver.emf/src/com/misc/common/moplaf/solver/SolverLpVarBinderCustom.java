/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Var Binder Custom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverLpVarBinderCustom#getSelectedSolution <em>Selected Solution</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverLpVarBinderCustom()
 * @model
 * @generated
 */
public interface SolverLpVarBinderCustom extends SolverLpVarBinder {
	/**
	 * Returns the value of the '<em><b>Selected Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Solution</em>' reference.
	 * @see #setSelectedSolution(SolutionLp)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverLpVarBinderCustom_SelectedSolution()
	 * @model required="true"
	 * @generated
	 */
	SolutionLp getSelectedSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverLpVarBinderCustom#getSelectedSolution <em>Selected Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Solution</em>' reference.
	 * @see #getSelectedSolution()
	 * @generated
	 */
	void setSelectedSolution(SolutionLp value);

} // SolverLpVarBinderCustom
