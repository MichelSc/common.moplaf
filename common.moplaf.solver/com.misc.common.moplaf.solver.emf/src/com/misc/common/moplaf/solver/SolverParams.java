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
 * A representation of the model object '<em><b>Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverParams#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolverParams#getSolverMaxDuration <em>Solver Max Duration</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverParams()
 * @model
 * @generated
 */
public interface SolverParams extends SolutionProviderParams {
	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remarks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverParams_Remarks()
	 * @model
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverParams#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Solver Max Duration</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum duration (in secs) allocated to the server
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solver Max Duration</em>' attribute.
	 * @see #setSolverMaxDuration(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverParams_SolverMaxDuration()
	 * @model default="100"
	 * @generated
	 */
	float getSolverMaxDuration();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverParams#getSolverMaxDuration <em>Solver Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Max Duration</em>' attribute.
	 * @see #getSolverMaxDuration()
	 * @generated
	 */
	void setSolverMaxDuration(float value);

} // SolverParams
