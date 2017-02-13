/**
 */
package com.misc.common.moplaf.propagator2;

import com.misc.common.moplaf.propagator2.util.Bindings;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Bindings</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getPropagatorFunctionBindings()
 * @model
 * @generated
 */
public interface PropagatorFunctionBindings extends PropagatorFunction {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.propagator2.Bindings"
	 * @generated
	 */
	Bindings doGetBindings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<PropagatorFunction> doGetExplicitAntecedents();
} // PropagatorFunctionBindings
