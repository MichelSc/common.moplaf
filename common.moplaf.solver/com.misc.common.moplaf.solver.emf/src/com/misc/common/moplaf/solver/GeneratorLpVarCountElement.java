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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Lp Var Count Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpVarCountElement#getELpVarCount <em>ELp Var Count</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpVarCountElement#getECount <em>ECount</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpVarCountElement#getEClass <em>EClass</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVarCountElement()
 * @model
 * @generated
 */
public interface GeneratorLpVarCountElement extends EObject {
	/**
	 * Returns the value of the '<em><b>ELp Var Count</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorLpVarCount#getELpVarCountElement <em>ELp Var Count Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELp Var Count</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELp Var Count</em>' container reference.
	 * @see #setELpVarCount(GeneratorLpVarCount)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVarCountElement_ELpVarCount()
	 * @see com.misc.common.moplaf.solver.GeneratorLpVarCount#getELpVarCountElement
	 * @model opposite="ELpVarCountElement" required="true" transient="false"
	 * @generated
	 */
	GeneratorLpVarCount getELpVarCount();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpVarCountElement#getELpVarCount <em>ELp Var Count</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ELp Var Count</em>' container reference.
	 * @see #getELpVarCount()
	 * @generated
	 */
	void setELpVarCount(GeneratorLpVarCount value);

	/**
	 * Returns the value of the '<em><b>ECount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECount</em>' attribute.
	 * @see #setECount(int)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVarCountElement_ECount()
	 * @model
	 * @generated
	 */
	int getECount();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpVarCountElement#getECount <em>ECount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECount</em>' attribute.
	 * @see #getECount()
	 * @generated
	 */
	void setECount(int value);

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' attribute.
	 * @see #setEClass(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpVarCountElement_EClass()
	 * @model
	 * @generated
	 */
	String getEClass();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpVarCountElement#getEClass <em>EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' attribute.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(String value);

} // GeneratorLpVarCountElement
