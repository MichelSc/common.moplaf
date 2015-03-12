/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Lp Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getLpVar <em>Lp Var</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getCoeff <em>Coeff</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpTerm()
 * @model
 * @generated
 */
public interface GeneratorLpTerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Lp Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Var</em>' reference.
	 * @see #setLpVar(GeneratorLpVar)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpTerm_LpVar()
	 * @model required="true"
	 * @generated
	 */
	GeneratorLpVar getLpVar();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getLpVar <em>Lp Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp Var</em>' reference.
	 * @see #getLpVar()
	 * @generated
	 */
	void setLpVar(GeneratorLpVar value);

	/**
	 * Returns the value of the '<em><b>Coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coeff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coeff</em>' attribute.
	 * @see #setCoeff(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpTerm_Coeff()
	 * @model
	 * @generated
	 */
	float getCoeff();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getCoeff <em>Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coeff</em>' attribute.
	 * @see #getCoeff()
	 * @generated
	 */
	void setCoeff(float value);

} // GeneratorLpTerm
