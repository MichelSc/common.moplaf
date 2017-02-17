/**
 */
package com.misc.common.moplaf.propagator2;

import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionSource;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PropagatorFunctionBindings</b></em>'.
 * <p>
 * A PropagatorFunctionBindings implements its Bindings logic with the contribution of 2 auxiliary
 * classes
 * <ul>
 * <li>
 * The class {@link Bindings}, that implements the actual logic as a function of configured dependent
 * model elements. This configuration normally does not change at run time and can be statically set
 * by the concrete PropagatorFunctionBindings. The Bindings instance is provided by the concrete 
 * implementation through the method {@link #doGetBindings()}. 
 * </li>
 * <li>
 * The class {@link PropagatorFunctionSourceBindings}, that is attached to the 
 * {@link PropagatorFunctionAdatper} of its target {@link EObject}. The PropagatorFunctionSourceBindings
 * is a {@link PropagatorFunctionSource}, implementing the logic for its owner {@link PropagatorFunction}
 * and its target {@link EObject} by delegating to its {@link Bindings}.
 * </ul> 
 * <p>
 * The PropagatorFunctionBindings implements the derivation of its Antecedents via 2 mechanisms
 * <ul>
 * <li>
 * The Antecedents derived from the Bindings and collected via the method 
 * {@link PropagatorFunctionSource#collectAntecedents(EList, java.util.function.Predicate)}
 * <li>
 * The Antecedents explicitly provided by the concrete implementation by implementing the method
 * {@link #doCollectExplicitAntecedents(EList)}
 * </ul>
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
	 * @model antecedentsMany="true"
	 * @generated
	 */
	void doCollectExplicitAntecedents(EList<PropagatorFunction> antecedents);
} // PropagatorFunctionBindings
