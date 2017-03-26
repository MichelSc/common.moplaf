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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Lp Linear</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpLinear#getLpTerm <em>Lp Term</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpLinear()
 * @model
 * @generated
 */
public interface GeneratorLpLinear extends EObject {
	/**
	 * Returns the value of the '<em><b>Lp Term</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorLpTerm}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getLpLinear <em>Lp Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Term</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Term</em>' containment reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpLinear_LpTerm()
	 * @see com.misc.common.moplaf.solver.GeneratorLpTerm#getLpLinear
	 * @model opposite="LpLinear" containment="true"
	 * @generated
	 */
	EList<GeneratorLpTerm> getLpTerm();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GeneratorLpTerm constructTerm(GeneratorLpVar var, float coef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GeneratorLpTerm contributeTerm(GeneratorLpVar var, float coef);

} // GeneratorLpLinear
