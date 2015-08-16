/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Cons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorCons#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorCons#getNofTerms <em>Nof Terms</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCons()
 * @model abstract="true"
 * @generated
 */
public interface GeneratorCons extends GeneratorTupleMember {
	/**
	 * Returns the value of the '<em><b>Solution</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.SolutionCons}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.SolutionCons#getCons <em>Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCons_Solution()
	 * @see com.misc.common.moplaf.solver.SolutionCons#getCons
	 * @model opposite="cons"
	 * @generated
	 */
	EList<SolutionCons> getSolution();

	/**
	 * Returns the value of the '<em><b>Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nof Terms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nof Terms</em>' attribute.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCons_NofTerms()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNofTerms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionCons getSolution(Solution solver);

} // GeneratorCons
