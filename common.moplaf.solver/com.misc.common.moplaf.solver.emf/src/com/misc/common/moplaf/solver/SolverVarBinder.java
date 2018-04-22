/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Binder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverVarBinder#getSolver <em>Solver</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolverVarBinder#getVarBinder <em>Var Binder</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolverVarBinder#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverVarBinder()
 * @model
 * @generated
 */
public interface SolverVarBinder extends EObject {
	/**
	 * Returns the value of the '<em><b>Solver</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.Solver#getVarBinders <em>Var Binders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver</em>' container reference.
	 * @see #setSolver(Solver)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverVarBinder_Solver()
	 * @see com.misc.common.moplaf.solver.Solver#getVarBinders
	 * @model opposite="VarBinders" required="true" transient="false"
	 * @generated
	 */
	Solver getSolver();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverVarBinder#getSolver <em>Solver</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver</em>' container reference.
	 * @see #getSolver()
	 * @generated
	 */
	void setSolver(Solver value);

	/**
	 * Returns the value of the '<em><b>Var Binder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Binder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Binder</em>' reference.
	 * @see #setVarBinder(GeneratorVarBinder)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverVarBinder_VarBinder()
	 * @model
	 * @generated
	 */
	GeneratorVarBinder getVarBinder();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverVarBinder#getVarBinder <em>Var Binder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Binder</em>' reference.
	 * @see #getVarBinder()
	 * @generated
	 */
	void setVarBinder(GeneratorVarBinder value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverVarBinder_Label()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

} // SolverVarBinder
