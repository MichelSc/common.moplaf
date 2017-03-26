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
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <p>
 * A Solution is some solution to a problem formulation {@link Generator} and is produced by
 * some {@link SolutionProvider}, typically a {@link Solver}.
 * <p>
 * A Solution contains
 * <ul>
 *   <li>the value of the solution: accessor {@link #getValue()}</li>
 *   <li>information relative to the solution for some variable: element {@link SolutionVar}</li>
 *   <li>information relative to the solution for some constraint: element {@link SolutionCons}</li>
 * </ul>
 * <p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getProvider <em>Provider</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getSolutionNr <em>Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getSolverAsInitialSolution <em>Solver As Initial Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getVars <em>Vars</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getCons <em>Cons</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getGoals <em>Goals</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends EObject {

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.SolutionProvider#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' container reference.
	 * @see #setProvider(SolutionProvider)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_Provider()
	 * @see com.misc.common.moplaf.solver.SolutionProvider#getSolution
	 * @model opposite="Solution" required="true" transient="false"
	 * @generated
	 */
	SolutionProvider getProvider();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solution#getProvider <em>Provider</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' container reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(SolutionProvider value);

	/**
	 * Returns the value of the '<em><b>Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Nr</em>' attribute.
	 * @see #setSolutionNr(int)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_SolutionNr()
	 * @model
	 * @generated
	 */
	int getSolutionNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solution#getSolutionNr <em>Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution Nr</em>' attribute.
	 * @see #getSolutionNr()
	 * @generated
	 */
	void setSolutionNr(int value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_Code()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Returns the value of the '<em><b>Solver As Initial Solution</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.Solver}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.Solver#getInitialSolution <em>Initial Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver As Initial Solution</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver As Initial Solution</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_SolverAsInitialSolution()
	 * @see com.misc.common.moplaf.solver.Solver#getInitialSolution
	 * @model opposite="InitialSolution"
	 * @generated
	 */
	EList<Solver> getSolverAsInitialSolution();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.SolutionElement}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.SolutionElement#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_Elements()
	 * @see com.misc.common.moplaf.solver.SolutionElement#getSolution
	 * @model opposite="Solution" containment="true"
	 * @generated
	 */
	EList<SolutionElement> getElements();

	/**
	 * Returns the value of the '<em><b>Vars</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.SolutionVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_Vars()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SolutionVar> getVars();

	/**
	 * Returns the value of the '<em><b>Cons</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.SolutionCons}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cons</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cons</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_Cons()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SolutionCons> getCons();

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.SolutionGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_Goals()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SolutionGoal> getGoals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionVar solutionVarFactory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionCons solutionConsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionGoal solutionGoalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionCons constructSolutionCons(GeneratorCons cons);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionGoal constructSolutionGoal(GeneratorGoal goal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionVar constructSolutionVar(GeneratorVar var);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void dispose();
} // Solution
