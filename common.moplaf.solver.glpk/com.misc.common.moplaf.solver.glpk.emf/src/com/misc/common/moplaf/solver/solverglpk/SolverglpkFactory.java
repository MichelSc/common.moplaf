/**
 */
package com.misc.common.moplaf.solver.solverglpk;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage
 * @generated
 */
public interface SolverglpkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverglpkFactory eINSTANCE = com.misc.common.moplaf.solver.solverglpk.impl.SolverglpkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Solver GLPK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solver GLPK</em>'.
	 * @generated
	 */
	SolverGLPK createSolverGLPK();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SolverglpkPackage getSolverglpkPackage();

} //SolverglpkFactory
