/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Binder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverVarBinder#getSolver <em>Solver</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolverVarBinder#getVarBinder <em>Var Binder</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverVarBinder()
 * @model
 * @generated
 */
public interface SolverVarBinder extends EObject {
	/**
	 * Returns the value of the '<em><b>Solver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.Solver#getVarBinders <em>Var Binders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver</em>' reference.
	 * @see #setSolver(Solver)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverVarBinder_Solver()
	 * @see com.misc.common.moplaf.solver.Solver#getVarBinders
	 * @model opposite="VarBinders" required="true"
	 * @generated
	 */
	Solver getSolver();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverVarBinder#getSolver <em>Solver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver</em>' reference.
	 * @see #getSolver()
	 * @generated
	 */
	void setSolver(Solver value);

	/**
	 * Returns the value of the '<em><b>Var Binder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Binder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Binder</em>' reference.
	 * @see #setVarBinder(GeneratorVarBinder)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverVarBinder_VarBinder()
	 * @model
	 * @generated
	 */
	GeneratorVarBinder getVarBinder();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverVarBinder#getVarBinder <em>Var Binder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Binder</em>' reference.
	 * @see #getVarBinder()
	 * @generated
	 */
	void setVarBinder(GeneratorVarBinder value);

} // SolverVarBinder
