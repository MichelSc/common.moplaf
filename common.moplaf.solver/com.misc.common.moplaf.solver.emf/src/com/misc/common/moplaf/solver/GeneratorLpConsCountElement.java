/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Lp Cons Count Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpConsCountElement#getELpConsCount <em>ELp Cons Count</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpConsCountElement#getECount <em>ECount</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpConsCountElement#getEClass <em>EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpConsCountElement()
 * @model
 * @generated
 */
public interface GeneratorLpConsCountElement extends EObject {
	/**
	 * Returns the value of the '<em><b>ELp Cons Count</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorLpConsCount#getLpConsCountElement <em>Lp Cons Count Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELp Cons Count</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELp Cons Count</em>' container reference.
	 * @see #setELpConsCount(GeneratorLpConsCount)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpConsCountElement_ELpConsCount()
	 * @see com.misc.common.moplaf.solver.GeneratorLpConsCount#getLpConsCountElement
	 * @model opposite="LpConsCountElement" required="true" transient="false"
	 * @generated
	 */
	GeneratorLpConsCount getELpConsCount();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpConsCountElement#getELpConsCount <em>ELp Cons Count</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ELp Cons Count</em>' container reference.
	 * @see #getELpConsCount()
	 * @generated
	 */
	void setELpConsCount(GeneratorLpConsCount value);

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
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpConsCountElement_ECount()
	 * @model
	 * @generated
	 */
	int getECount();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpConsCountElement#getECount <em>ECount</em>}' attribute.
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
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpConsCountElement_EClass()
	 * @model
	 * @generated
	 */
	String getEClass();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpConsCountElement#getEClass <em>EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' attribute.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(String value);

} // GeneratorLpConsCountElement
