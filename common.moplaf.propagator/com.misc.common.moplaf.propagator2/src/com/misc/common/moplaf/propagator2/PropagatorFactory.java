/**
 */
package com.misc.common.moplaf.propagator2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.propagator2.PropagatorPackage
 * @generated
 */
public interface PropagatorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropagatorFactory eINSTANCE = com.misc.common.moplaf.propagator2.impl.PropagatorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Object With Propagator Functions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object With Propagator Functions</em>'.
	 * @generated
	 */
	ObjectWithPropagatorFunctions createObjectWithPropagatorFunctions();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	PropagatorFunction createPropagatorFunction();

	/**
	 * Returns a new object of class '<em>Function Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Bindings</em>'.
	 * @generated
	 */
	PropagatorFunctionBindings createPropagatorFunctionBindings();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PropagatorPackage getPropagatorPackage();

} //PropagatorFactory
