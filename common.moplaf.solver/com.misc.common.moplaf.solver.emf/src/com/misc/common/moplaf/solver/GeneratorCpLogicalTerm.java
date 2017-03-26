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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Cp Logical Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorCpLogicalTerm#isNot <em>Not</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorCpLogicalTerm#getCpCons <em>Cp Cons</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpLogicalTerm()
 * @model
 * @generated
 */
public interface GeneratorCpLogicalTerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' attribute.
	 * @see #setNot(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpLogicalTerm_Not()
	 * @model
	 * @generated
	 */
	boolean isNot();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorCpLogicalTerm#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' attribute.
	 * @see #isNot()
	 * @generated
	 */
	void setNot(boolean value);

	/**
	 * Returns the value of the '<em><b>Cp Cons</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cp Cons</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cp Cons</em>' reference.
	 * @see #setCpCons(GeneratorCpCons)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpLogicalTerm_CpCons()
	 * @model
	 * @generated
	 */
	GeneratorCpCons getCpCons();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorCpLogicalTerm#getCpCons <em>Cp Cons</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cp Cons</em>' reference.
	 * @see #getCpCons()
	 * @generated
	 */
	void setCpCons(GeneratorCpCons value);

} // GeneratorCpLogicalTerm
