/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionVar#getOptimalValue <em>Optimal Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionVar#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionVar()
 * @model
 * @generated
 */
public interface SolutionVar extends SolutionElement {
	/**
	 * Returns the value of the '<em><b>Optimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimal Value</em>' attribute.
	 * @see #setOptimalValue(double)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionVar_OptimalValue()
	 * @model
	 * @generated
	 */
	double getOptimalValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionVar#getOptimalValue <em>Optimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimal Value</em>' attribute.
	 * @see #getOptimalValue()
	 * @generated
	 */
	void setOptimalValue(double value);

	/**
	 * Returns the value of the '<em><b>Var</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorVar#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' reference.
	 * @see #setVar(GeneratorVar)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionVar_Var()
	 * @see com.misc.common.moplaf.solver.GeneratorVar#getSolution
	 * @model opposite="Solution" required="true"
	 * @generated
	 */
	GeneratorVar getVar();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionVar#getVar <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(GeneratorVar value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isOne();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isZero();

} // SolutionVar
