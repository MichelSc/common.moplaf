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
 * A representation of the model object '<em><b>Generator Cp Cons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorCpCons#isPost <em>Post</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpCons()
 * @model abstract="true"
 * @generated
 */
public interface GeneratorCpCons extends GeneratorCons {
	/**
	 * Returns the value of the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' attribute.
	 * @see #setPost(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpCons_Post()
	 * @model
	 * @generated
	 */
	boolean isPost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorCpCons#isPost <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' attribute.
	 * @see #isPost()
	 * @generated
	 */
	void setPost(boolean value);

} // GeneratorCpCons
