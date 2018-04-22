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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A goal for the generated problem.
 * A goal is expected to be directly contained to its Generator owner.
 * A goal may reference a secondary goal: a subgoal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorGoal#getGenerator <em>Generator</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorGoal#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorGoal#getSelectedSolutionDisplay <em>Selected Solution Display</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorGoal#getLabel <em>Label</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorGoal#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorGoal#getObjectiveType <em>Objective Type</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorGoal()
 * @model abstract="true"
 * @generated
 */
public interface GeneratorGoal extends GeneratorElement {
	/**
	 * Returns the value of the '<em><b>Generator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.Generator#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' reference.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorGoal_Generator()
	 * @see com.misc.common.moplaf.solver.Generator#getGoals
	 * @model opposite="Goals" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Generator getGenerator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionGoal getSolutionGoal(Solution solution);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorGoal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorGoal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Solution Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Solution Display</em>' attribute.
	 * @see #setSelectedSolutionDisplay(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorGoal_SelectedSolutionDisplay()
	 * @model
	 * @generated
	 */
	String getSelectedSolutionDisplay();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorGoal#getSelectedSolutionDisplay <em>Selected Solution Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Solution Display</em>' attribute.
	 * @see #getSelectedSolutionDisplay()
	 * @generated
	 */
	void setSelectedSolutionDisplay(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorGoal_Label()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.SolutionGoal}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.SolutionGoal#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorGoal_Solution()
	 * @see com.misc.common.moplaf.solver.SolutionGoal#getGoal
	 * @model opposite="Goal"
	 * @generated
	 */
	EList<SolutionGoal> getSolution();

	/**
	 * Returns the value of the '<em><b>Objective Type</b></em>' attribute.
	 * The default value is <code>"Maximum"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.EnumObjectiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumObjectiveType
	 * @see #setObjectiveType(EnumObjectiveType)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorGoal_ObjectiveType()
	 * @model default="Maximum"
	 * @generated
	 */
	EnumObjectiveType getObjectiveType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorGoal#getObjectiveType <em>Objective Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumObjectiveType
	 * @see #getObjectiveType()
	 * @generated
	 */
	void setObjectiveType(EnumObjectiveType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception"
	 * @generated
	 */
	void build(Solver builder, double weight) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception"
	 * @generated
	 */
	void buildCons(Solver builder, double rhs) throws Exception;

} // GeneratorGoal
