/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverCp#isSearchAll <em>Search All</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverCp()
 * @model abstract="true"
 * @generated
 */
public interface SolverCp extends Solver {

	/**
	 * Returns the value of the '<em><b>Search All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search All</em>' attribute.
	 * @see #setSearchAll(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverCp_SearchAll()
	 * @model
	 * @generated
	 */
	boolean isSearchAll();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverCp#isSearchAll <em>Search All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search All</em>' attribute.
	 * @see #isSearchAll()
	 * @generated
	 */
	void setSearchAll(boolean value);
} // SolverCp
