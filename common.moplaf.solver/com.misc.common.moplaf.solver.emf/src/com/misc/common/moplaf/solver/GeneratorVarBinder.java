/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Var Binder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorVarBinder#getBoundVars <em>Bound Vars</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorVarBinder()
 * @model
 * @generated
 */
public interface GeneratorVarBinder extends EObject {
	/**
	 * Returns the value of the '<em><b>Bound Vars</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Vars</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Vars</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorVarBinder_BoundVars()
	 * @model
	 * @generated
	 */
	EList<GeneratorVar> getBoundVars();

} // GeneratorVarBinder
