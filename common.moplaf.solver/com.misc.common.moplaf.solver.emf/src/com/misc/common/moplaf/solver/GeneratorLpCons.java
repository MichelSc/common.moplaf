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
 * A representation of the model object '<em><b>Generator Lp Cons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpCons#getType <em>Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpCons#getRighHandSide <em>Righ Hand Side</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpCons()
 * @model
 * @generated
 */
public interface GeneratorLpCons extends GeneratorCons, GeneratorLpLinear {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Equal"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.EnumLpConsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumLpConsType
	 * @see #setType(EnumLpConsType)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpCons_Type()
	 * @model default="Equal"
	 * @generated
	 */
	EnumLpConsType getType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpCons#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumLpConsType
	 * @see #getType()
	 * @generated
	 */
	void setType(EnumLpConsType value);

	/**
	 * Returns the value of the '<em><b>Righ Hand Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Righ Hand Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Righ Hand Side</em>' attribute.
	 * @see #setRighHandSide(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpCons_RighHandSide()
	 * @model
	 * @generated
	 */
	float getRighHandSide();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpCons#getRighHandSide <em>Righ Hand Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Righ Hand Side</em>' attribute.
	 * @see #getRighHandSide()
	 * @generated
	 */
	void setRighHandSide(float value);

} // GeneratorLpCons
