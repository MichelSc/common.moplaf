/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Cp Linear Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorCpLinearTerm#getCoeff <em>Coeff</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorCpLinearTerm#getCpVar <em>Cp Var</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpLinearTerm()
 * @model
 * @generated
 */
public interface GeneratorCpLinearTerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coeff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coeff</em>' attribute.
	 * @see #setCoeff(int)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpLinearTerm_Coeff()
	 * @model
	 * @generated
	 */
	int getCoeff();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorCpLinearTerm#getCoeff <em>Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coeff</em>' attribute.
	 * @see #getCoeff()
	 * @generated
	 */
	void setCoeff(int value);

	/**
	 * Returns the value of the '<em><b>Cp Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cp Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cp Var</em>' reference.
	 * @see #setCpVar(GeneratorCpVarAtomic)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpLinearTerm_CpVar()
	 * @model
	 * @generated
	 */
	GeneratorCpVarAtomic getCpVar();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorCpLinearTerm#getCpVar <em>Cp Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cp Var</em>' reference.
	 * @see #getCpVar()
	 * @generated
	 */
	void setCpVar(GeneratorCpVarAtomic value);

} // GeneratorCpLinearTerm
