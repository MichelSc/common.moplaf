/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Lp Cons Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpConsCount#getLpConsCountElement <em>Lp Cons Count Element</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpConsCount#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpConsCount()
 * @model
 * @generated
 */
public interface GeneratorLpConsCount extends EObject {
	/**
	 * Returns the value of the '<em><b>Lp Cons Count Element</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorLpConsCountElement}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorLpConsCountElement#getELpConsCount <em>ELp Cons Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Cons Count Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Cons Count Element</em>' containment reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpConsCount_LpConsCountElement()
	 * @see com.misc.common.moplaf.solver.GeneratorLpConsCountElement#getELpConsCount
	 * @model opposite="ELpConsCount" containment="true"
	 * @generated
	 */
	EList<GeneratorLpConsCountElement> getLpConsCountElement();

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.Generator#getELpConsCount <em>ELp Cons Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' container reference.
	 * @see #setGenerator(Generator)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpConsCount_Generator()
	 * @see com.misc.common.moplaf.solver.Generator#getELpConsCount
	 * @model opposite="ELpConsCount" required="true" transient="false"
	 * @generated
	 */
	Generator getGenerator();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpConsCount#getGenerator <em>Generator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' container reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(Generator value);

} // GeneratorLpConsCount
