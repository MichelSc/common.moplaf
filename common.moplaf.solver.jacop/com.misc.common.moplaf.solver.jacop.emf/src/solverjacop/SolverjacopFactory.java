/**
 */
package solverjacop;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see solverjacop.SolverjacopPackage
 * @generated
 */
public interface SolverjacopFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverjacopFactory eINSTANCE = solverjacop.impl.SolverjacopFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Solver Jacop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solver Jacop</em>'.
	 * @generated
	 */
	SolverJacop createSolverJacop();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SolverjacopPackage getSolverjacopPackage();

} //SolverjacopFactory
