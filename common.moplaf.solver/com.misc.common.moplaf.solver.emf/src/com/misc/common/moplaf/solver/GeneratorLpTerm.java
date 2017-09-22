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
 * A representation of the model object '<em><b>Generator Lp Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getLpVar <em>Lp Var</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getCoeff <em>Coeff</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getLpLinear <em>Lp Linear</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpTerm()
 * @model
 * @generated
 */
public interface GeneratorLpTerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Lp Var</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorLpVar#getLpTerm <em>Lp Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Var</em>' reference.
	 * @see #setLpVar(GeneratorLpVar)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpTerm_LpVar()
	 * @see com.misc.common.moplaf.solver.GeneratorLpVar#getLpTerm
	 * @model opposite="LpTerm" required="true"
	 * @generated
	 */
	GeneratorLpVar getLpVar();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getLpVar <em>Lp Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp Var</em>' reference.
	 * @see #getLpVar()
	 * @generated
	 */
	void setLpVar(GeneratorLpVar value);

	/**
	 * Returns the value of the '<em><b>Coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coeff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coeff</em>' attribute.
	 * @see #setCoeff(double)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpTerm_Coeff()
	 * @model
	 * @generated
	 */
	double getCoeff();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getCoeff <em>Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coeff</em>' attribute.
	 * @see #getCoeff()
	 * @generated
	 */
	void setCoeff(double value);

	/**
	 * Returns the value of the '<em><b>Lp Linear</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorLpLinear#getLpTerm <em>Lp Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Linear</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Linear</em>' container reference.
	 * @see #setLpLinear(GeneratorLpLinear)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpTerm_LpLinear()
	 * @see com.misc.common.moplaf.solver.GeneratorLpLinear#getLpTerm
	 * @model opposite="LpTerm" required="true" transient="false"
	 * @generated
	 */
	GeneratorLpLinear getLpLinear();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getLpLinear <em>Lp Linear</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp Linear</em>' container reference.
	 * @see #getLpLinear()
	 * @generated
	 */
	void setLpLinear(GeneratorLpLinear value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpTerm_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

} // GeneratorLpTerm
