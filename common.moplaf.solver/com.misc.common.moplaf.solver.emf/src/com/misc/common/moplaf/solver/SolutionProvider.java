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

import com.misc.common.moplaf.job.Run;
import org.eclipse.emf.common.util.EList;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SolutionProvider is capable of providing a solution for a given linear formulation (a Generator).
 * Solution is provided as a collection of SolutionLpVars (resp. SolutionLpCons), giving properties of the solution for a particular variable GeneratorLpVar (resp. a particular constraint GeneratorLpCons)
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionProvider#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionProvider#getCurrentSolutionNr <em>Current Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.SolutionProvider#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionProvider()
 * @model abstract="true"
 * @generated
 */
public interface SolutionProvider extends Run, IGeneratorTool {

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.Solution}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.Solution#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' containment reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionProvider_Solution()
	 * @see com.misc.common.moplaf.solver.Solution#getProvider
	 * @model opposite="Provider" containment="true"
	 * @generated
	 */
	EList<Solution> getSolution();

	/**
	 * Returns the value of the '<em><b>Current Solution Nr</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Solution Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Solution Nr</em>' attribute.
	 * @see #setCurrentSolutionNr(int)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionProvider_CurrentSolutionNr()
	 * @model default="0"
	 * @generated
	 */
	int getCurrentSolutionNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionProvider#getCurrentSolutionNr <em>Current Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Solution Nr</em>' attribute.
	 * @see #getCurrentSolutionNr()
	 * @generated
	 */
	void setCurrentSolutionNr(int value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolutionProvider_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.SolutionProvider#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Solution solutionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Solution constructSolution();
} // SolutionProvider
