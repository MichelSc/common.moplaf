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
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTuple#getGeneratorAsRoot <em>Generator As Root</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTuple#getTupleElement <em>Tuple Element</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTuple#getTupleContainer <em>Tuple Container</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTuple#getVar <em>Var</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTuple#getCons <em>Cons</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTuple#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
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
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorTuple_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorTuple#getCode <em>Code</em>}' attribute.
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
	 * @model kind="operation"
	 * @generated
	 */
	Generator getGenerator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception" visitorDataType="com.misc.common.moplaf.solver.ITupleVisitor"
	 * @generated
	 */
	void visitTuples(ITupleVisitor visitor) throws Exception;

} // GeneratorTuple
