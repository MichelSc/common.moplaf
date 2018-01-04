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
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorVarBinder#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorVarBinder#getLabel <em>Label</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorVarBinder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorVarBinder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorVarBinder_Label()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double getBoundValue(GeneratorVar var, SolverVarBinder binder);

} // GeneratorVarBinder
