/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Lp Var Binder Custom</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVarBinderCustom()
 * @model
 * @generated
 */
public interface GeneratorLpVarBinderCustom extends GeneratorLpVarBinder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double getLowerBound(GeneratorLpVar var, SolutionLp solution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double getUpperBound(GeneratorLpVar var, SolutionLp solution);

} // GeneratorLpVarBinderCustom
