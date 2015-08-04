/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Tuple Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTupleElement#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTupleElement#getTuple <em>Tuple</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTupleElement#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorTupleElement#getSelectedSolutionDisplay <em>Selected Solution Display</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorTupleElement()
 * @model
 * @generated
 */
public interface GeneratorTupleElement extends GeneratorElement {
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
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorTupleElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorTupleElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple</em>' reference.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorTupleElement_Tuple()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	GeneratorTuple getTuple();

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
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorTupleElement_Code()
	 * @model volatile="true" derived="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorTupleElement#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Solution Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Solution Display</em>' attribute.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorTupleElement_SelectedSolutionDisplay()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	String getSelectedSolutionDisplay();

} // GeneratorTupleElement
