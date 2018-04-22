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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Cons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionCons#getCons <em>Cons</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionCons()
 * @model
 * @generated
 */
public interface SolutionCons extends SolutionElement {
	/**
	 * Returns the value of the '<em><b>Cons</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorCons#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cons</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cons</em>' reference.
	 * @see #setCons(GeneratorCons)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionCons_Cons()
	 * @see com.misc.common.moplaf.solver.GeneratorCons#getSolution
	 * @model opposite="Solution" required="true"
	 * @generated
	 */
	GeneratorCons getCons();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionCons#getCons <em>Cons</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cons</em>' reference.
	 * @see #getCons()
	 * @generated
	 */
	void setCons(GeneratorCons value);

} // SolutionCons
