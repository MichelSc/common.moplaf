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
 * A representation of the model object '<em><b>Goal Lp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverGoalLp#getGoalWeight <em>Goal Weight</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGoalLp()
 * @model
 * @generated
 */
public interface SolverGoalLp extends SolverGoal {
	/**
	 * Returns the value of the '<em><b>Goal Weight</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Weight</em>' attribute.
	 * @see #setGoalWeight(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGoalLp_GoalWeight()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getGoalWeight();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverGoalLp#getGoalWeight <em>Goal Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Weight</em>' attribute.
	 * @see #getGoalWeight()
	 * @generated
	 */
	void setGoalWeight(float value);

} // SolverGoalLp
