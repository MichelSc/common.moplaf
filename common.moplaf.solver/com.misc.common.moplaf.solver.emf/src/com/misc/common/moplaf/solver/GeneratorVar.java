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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorVar#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorVar#getSelectedSolutionValue <em>Selected Solution Value</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorVar()
 * @model abstract="true"
 * @generated
 */
public interface GeneratorVar extends GeneratorTupleMember {
	/**
	 * Returns the value of the '<em><b>Solution</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.SolutionVar}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.SolutionVar#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorVar_Solution()
	 * @see com.misc.common.moplaf.solver.SolutionVar#getVar
	 * @model opposite="var"
	 * @generated
	 */
	EList<SolutionVar> getSolution();

	/**
	 * Returns the value of the '<em><b>Selected Solution Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Solution Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Solution Value</em>' attribute.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorVar_SelectedSolutionValue()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getSelectedSolutionValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionVar getSolutionVar(Solution solution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isSolutionOne(Solution solver);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isSolutionZero(Solution solver);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	float getSolutionValue(Solution solver);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception"
	 * @generated
	 */
	void build(Solver builder, SolverVarBinder modifier) throws Exception;

} // GeneratorVar
