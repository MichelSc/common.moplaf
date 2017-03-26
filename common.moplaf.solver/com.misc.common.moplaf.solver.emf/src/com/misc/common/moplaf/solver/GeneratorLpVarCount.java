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
 * A representation of the model object '<em><b>Generator Lp Var Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpVarCount#getELpVarCountElement <em>ELp Var Count Element</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpVarCount#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVarCount()
 * @model
 * @generated
 */
public interface GeneratorLpVarCount extends EObject {
	/**
	 * Returns the value of the '<em><b>ELp Var Count Element</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorLpVarCountElement}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorLpVarCountElement#getELpVarCount <em>ELp Var Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELp Var Count Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELp Var Count Element</em>' containment reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVarCount_ELpVarCountElement()
	 * @see com.misc.common.moplaf.solver.GeneratorLpVarCountElement#getELpVarCount
	 * @model opposite="ELpVarCount" containment="true"
	 * @generated
	 */
	EList<GeneratorLpVarCountElement> getELpVarCountElement();

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.Generator#getELpVarCount <em>ELp Var Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' container reference.
	 * @see #setGenerator(Generator)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVarCount_Generator()
	 * @see com.misc.common.moplaf.solver.Generator#getELpVarCount
	 * @model opposite="ELpVarCount" required="true" transient="false"
	 * @generated
	 */
	Generator getGenerator();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpVarCount#getGenerator <em>Generator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' container reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(Generator value);

} // GeneratorLpVarCount
