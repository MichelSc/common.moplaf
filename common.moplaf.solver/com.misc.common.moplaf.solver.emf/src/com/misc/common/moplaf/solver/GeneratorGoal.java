/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorGoal#getGenerator <em>Generator</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorGoal#getSubGoal <em>Sub Goal</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorGoal#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorGoal#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorGoal()
 * @model abstract="true"
 * @generated
 */
public interface GeneratorGoal extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.SolutionGoal}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.SolutionGoal#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorGoal_Solution()
	 * @see com.misc.common.moplaf.solver.SolutionGoal#getGoal
	 * @model opposite="Goal"
	 * @generated
	 */
	EList<SolutionGoal> getSolution();

} // GeneratorGoal
