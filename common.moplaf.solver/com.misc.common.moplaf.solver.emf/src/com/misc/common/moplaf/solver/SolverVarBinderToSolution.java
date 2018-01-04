/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Binder To Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverVarBinderToSolution#getSelectedSolution <em>Selected Solution</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverVarBinderToSolution()
 * @model
 * @generated
 */
public interface SolverVarBinderToSolution extends SolverVarBinder {
	/**
	 * Returns the value of the '<em><b>Selected Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Solution</em>' reference.
	 * @see #setSelectedSolution(Solution)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverVarBinderToSolution_SelectedSolution()
	 * @model required="true"
	 * @generated
	 */
	Solution getSelectedSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverVarBinderToSolution#getSelectedSolution <em>Selected Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Solution</em>' reference.
	 * @see #getSelectedSolution()
	 * @generated
	 */
	void setSelectedSolution(Solution value);

} // SolverVarBinderToSolution
