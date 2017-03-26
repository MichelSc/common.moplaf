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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Cp Linear</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorCpLinear#getType <em>Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorCpLinear#getRightHandSide <em>Right Hand Side</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorCpLinear#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpLinear()
 * @model
 * @generated
 */
public interface GeneratorCpLinear extends GeneratorCpCons {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.EnumCpLinearType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumCpLinearType
	 * @see #setType(EnumCpLinearType)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpLinear_Type()
	 * @model
	 * @generated
	 */
	EnumCpLinearType getType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorCpLinear#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumCpLinearType
	 * @see #getType()
	 * @generated
	 */
	void setType(EnumCpLinearType value);

	/**
	 * Returns the value of the '<em><b>Right Hand Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Hand Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Side</em>' attribute.
	 * @see #setRightHandSide(int)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpLinear_RightHandSide()
	 * @model
	 * @generated
	 */
	int getRightHandSide();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorCpLinear#getRightHandSide <em>Right Hand Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hand Side</em>' attribute.
	 * @see #getRightHandSide()
	 * @generated
	 */
	void setRightHandSide(int value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorCpLinearTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpLinear_Term()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratorCpLinearTerm> getTerm();

} // GeneratorCpLinear
