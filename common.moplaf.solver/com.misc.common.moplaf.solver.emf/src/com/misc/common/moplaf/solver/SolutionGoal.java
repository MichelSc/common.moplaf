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
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionGoal#getGoal <em>Goal</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionGoal#getLabel <em>Label</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionGoal#isConstrained <em>Constrained</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionGoal#isOptimized <em>Optimized</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionGoal#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionGoal()
 * @model
 * @generated
 */
public interface SolutionGoal extends SolutionElement {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorGoal#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(GeneratorGoal)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionGoal_Goal()
	 * @see com.misc.common.moplaf.solver.GeneratorGoal#getSolution
	 * @model opposite="Solution" required="true"
	 * @generated
	 */
	GeneratorGoal getGoal();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionGoal#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(GeneratorGoal value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionGoal_Label()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Constrained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained</em>' attribute.
	 * @see #setConstrained(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionGoal_Constrained()
	 * @model
	 * @generated
	 */
	boolean isConstrained();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionGoal#isConstrained <em>Constrained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained</em>' attribute.
	 * @see #isConstrained()
	 * @generated
	 */
	void setConstrained(boolean value);

	/**
	 * Returns the value of the '<em><b>Optimized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimized</em>' attribute.
	 * @see #setOptimized(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionGoal_Optimized()
	 * @model
	 * @generated
	 */
	boolean isOptimized();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionGoal#isOptimized <em>Optimized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimized</em>' attribute.
	 * @see #isOptimized()
	 * @generated
	 */
	void setOptimized(boolean value);

	/**
	 * Returns the value of the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' attribute.
	 * @see #setBound(double)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionGoal_Bound()
	 * @model
	 * @generated
	 */
	double getBound();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionGoal#getBound <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' attribute.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void constructGoal(Solver solver);

} // SolutionGoal
