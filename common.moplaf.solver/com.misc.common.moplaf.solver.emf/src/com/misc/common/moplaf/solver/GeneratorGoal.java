/**
 */
package com.misc.common.moplaf.solver;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorGoal#getGeneratorAsRoot <em>Generator As Root</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorGoal#getSubGoal <em>Sub Goal</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorGoal#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorGoal()
 * @model abstract="true"
 * @generated
 */
public interface GeneratorGoal extends GeneratorElement {
	/**
	 * Returns the value of the '<em><b>Generator As Root</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.Generator#getGoalsRoot <em>Goals Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator As Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator As Root</em>' reference.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorGoal_GeneratorAsRoot()
	 * @see com.misc.common.moplaf.solver.Generator#getGoalsRoot
	 * @model opposite="GoalsRoot" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Generator getGeneratorAsRoot();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Generator getGenerator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception"
	 * @generated
	 */
	void build(Solver builder) throws Exception;

	/**
	 * Returns the value of the '<em><b>Sub Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Goal</em>' reference.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorGoal_SubGoal()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	GeneratorGoal getSubGoal();

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

} // GeneratorGoal
