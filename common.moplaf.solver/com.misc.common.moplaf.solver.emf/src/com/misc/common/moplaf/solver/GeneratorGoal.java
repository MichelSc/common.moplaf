/**
 */
package com.misc.common.moplaf.solver;

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
	 * @model exceptions="com.misc.common.moplaf.solver.Exception"
	 * @generated
	 */
	void build(Solver builder) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.solver.Exception"
	 * @generated
	 */
	void buildCons(Solver solver, Solver previousSolver) throws Exception;

	/**
	 * Returns the value of the '<em><b>Sub Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Goal</em>' reference.
	 * @see #setSubGoal(GeneratorGoal)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorGoal_SubGoal()
	 * @model
	 * @generated
	 */
	GeneratorGoal getSubGoal();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorGoal#getSubGoal <em>Sub Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Goal</em>' reference.
	 * @see #getSubGoal()
	 * @generated
	 */
	void setSubGoal(GeneratorGoal value);

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
