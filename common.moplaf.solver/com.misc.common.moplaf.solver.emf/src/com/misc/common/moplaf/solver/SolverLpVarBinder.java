/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Var Binder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverLpVarBinder()
 * @model
 * @generated
 */
public interface SolverLpVarBinder extends SolverVarBinder {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	float getLowerBound(GeneratorLpVar var);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	float getUpperBound(GeneratorLpVar var);
} // SolverLpVarBinder
