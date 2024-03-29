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
package com.misc.common.moplaf.solver.solverjavailp;

import com.misc.common.moplaf.solver.ILpWriter;
import com.misc.common.moplaf.solver.SolverLp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solver Java ILP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solverjavailp.SolverJavaILP#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.solverjavailp.SolverjavailpPackage#getSolverJavaILP()
 * @model
 * @generated
 */
public interface SolverJavaILP extends SolverLp, ILpWriter {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"GLPK"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.solverjavailp.SolverJavaILPType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.solverjavailp.SolverJavaILPType
	 * @see #setType(SolverJavaILPType)
	 * @see com.misc.common.moplaf.solver.solverjavailp.SolverjavailpPackage#getSolverJavaILP_Type()
	 * @model default="GLPK"
	 * @generated
	 */
	SolverJavaILPType getType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverjavailp.SolverJavaILP#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.solverjavailp.SolverJavaILPType
	 * @see #getType()
	 * @generated
	 */
	void setType(SolverJavaILPType value);

} // SolverJavaILP
