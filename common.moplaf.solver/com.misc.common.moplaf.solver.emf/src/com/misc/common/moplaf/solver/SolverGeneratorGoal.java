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
 * A representation of the model object '<em><b>Generator Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalToSolve <em>Goal To Solve</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalWeight <em>Goal Weight</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalBound <em>Goal Bound</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#isOptimize <em>Optimize</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#isConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGeneratorGoal()
 * @model
 * @generated
 */
public interface SolverGeneratorGoal extends SolverGoal {
	/**
	 * Returns the value of the '<em><b>Goal To Solve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal To Solve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal To Solve</em>' reference.
	 * @see #setGoalToSolve(GeneratorGoal)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGeneratorGoal_GoalToSolve()
	 * @model required="true"
	 * @generated
	 */
	GeneratorGoal getGoalToSolve();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalToSolve <em>Goal To Solve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal To Solve</em>' reference.
	 * @see #getGoalToSolve()
	 * @generated
	 */
	void setGoalToSolve(GeneratorGoal value);

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
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGeneratorGoal_GoalWeight()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getGoalWeight();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalWeight <em>Goal Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Weight</em>' attribute.
	 * @see #getGoalWeight()
	 * @generated
	 */
	void setGoalWeight(float value);

	/**
	 * Returns the value of the '<em><b>Goal Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Bound</em>' attribute.
	 * @see #setGoalBound(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGeneratorGoal_GoalBound()
	 * @model
	 * @generated
	 */
	float getGoalBound();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalBound <em>Goal Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Bound</em>' attribute.
	 * @see #getGoalBound()
	 * @generated
	 */
	void setGoalBound(float value);

	/**
	 * Returns the value of the '<em><b>Optimize</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimize</em>' attribute.
	 * @see #setOptimize(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGeneratorGoal_Optimize()
	 * @model default="true"
	 * @generated
	 */
	boolean isOptimize();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#isOptimize <em>Optimize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimize</em>' attribute.
	 * @see #isOptimize()
	 * @generated
	 */
	void setOptimize(boolean value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see #setConstraint(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolverGeneratorGoal_Constraint()
	 * @model default="false"
	 * @generated
	 */
	boolean isConstraint();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#isConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #isConstraint()
	 * @generated
	 */
	void setConstraint(boolean value);

} // SolverGeneratorGoal
