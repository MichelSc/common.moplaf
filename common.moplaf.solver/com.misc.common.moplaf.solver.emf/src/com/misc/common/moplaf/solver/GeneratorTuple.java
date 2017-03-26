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
 * A representation of the model object '<em><b>Generator Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTuple#getGeneratorAsRoot <em>Generator As Root</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTuple#getTupleElement <em>Tuple Element</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTuple#getTupleContainer <em>Tuple Container</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTuple#getVar <em>Var</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTuple#getCons <em>Cons</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTuple#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTuple#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorTuple()
 * @model abstract="true"
 * @generated
 */
public interface GeneratorTuple extends GeneratorElement {
	/**
	 * Returns the value of the '<em><b>Generator As Root</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.Generator#getTupleRoot <em>Tuple Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator As Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator As Root</em>' reference.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorTuple_GeneratorAsRoot()
	 * @see com.misc.common.moplaf.solver.Generator#getTupleRoot
	 * @model opposite="TupleRoot" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Generator getGeneratorAsRoot();

	/**
	 * Returns the value of the '<em><b>Tuple Element</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorTuple}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorTuple#getTupleContainer <em>Tuple Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Element</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorTuple_TupleElement()
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#getTupleContainer
	 * @model opposite="TupleContainer" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<GeneratorTuple> getTupleElement();

	/**
	 * Returns the value of the '<em><b>Tuple Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorTuple#getTupleElement <em>Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Container</em>' reference.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorTuple_TupleContainer()
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#getTupleElement
	 * @model opposite="TupleElement" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	GeneratorTuple getTupleContainer();

	/**
	 * Returns the value of the '<em><b>Var</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorTuple_Var()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<GeneratorVar> getVar();

	/**
	 * Returns the value of the '<em><b>Cons</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorCons}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cons</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorTuple_Cons()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<GeneratorCons> getCons();

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
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorTuple_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorTuple#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorTupleMember}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorTupleMember#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorTuple_Members()
	 * @see com.misc.common.moplaf.solver.GeneratorTupleMember#getTuple
	 * @model opposite="Tuple" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<GeneratorTupleMember> getMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateVars();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateCons();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateTuples();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception" visitorDataType="com.misc.common.moplaf.solver.ITupleVisitor"
	 * @generated
	 */
	void visitTuples(ITupleVisitor visitor) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateXReferences();

} // GeneratorTuple
