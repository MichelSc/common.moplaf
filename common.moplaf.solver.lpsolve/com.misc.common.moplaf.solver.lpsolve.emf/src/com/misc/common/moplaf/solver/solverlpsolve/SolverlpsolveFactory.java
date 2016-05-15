/**
 */
package com.misc.common.moplaf.solver.solverlpsolve;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.solverlpsolve.SolverlpsolvePackage
 * @generated
 */
public interface SolverlpsolveFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverlpsolveFactory eINSTANCE = com.misc.common.moplaf.solver.solverlpsolve.impl.SolverlpsolveFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Solver Lp Solve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solver Lp Solve</em>'.
	 * @generated
	 */
	SolverLpSolve createSolverLpSolve();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SolverlpsolvePackage getSolverlpsolvePackage();

} //SolverlpsolveFactory
