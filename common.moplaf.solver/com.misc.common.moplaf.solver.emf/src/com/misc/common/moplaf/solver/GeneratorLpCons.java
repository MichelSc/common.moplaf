/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Lp Cons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpCons#getType <em>Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpCons#getLpTerm <em>Lp Term</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorLpCons#getRighHandSide <em>Righ Hand Side</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpCons()
 * @model
 * @generated
 */
public interface GeneratorLpCons extends GeneratorCons {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Equal"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.EnumLpConsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumLpConsType
	 * @see #setType(EnumLpConsType)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpCons_Type()
	 * @model default="Equal"
	 * @generated
	 */
	EnumLpConsType getType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpCons#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumLpConsType
	 * @see #getType()
	 * @generated
	 */
	void setType(EnumLpConsType value);

	/**
	 * Returns the value of the '<em><b>Lp Term</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorLpTerm}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getLpCons <em>Lp Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Term</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Term</em>' containment reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpCons_LpTerm()
	 * @see com.misc.common.moplaf.solver.GeneratorLpTerm#getLpCons
	 * @model opposite="LpCons" containment="true"
	 * @generated
	 */
	EList<GeneratorLpTerm> getLpTerm();

	/**
	 * Returns the value of the '<em><b>Righ Hand Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Righ Hand Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Righ Hand Side</em>' attribute.
	 * @see #setRighHandSide(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorLpCons_RighHandSide()
	 * @model
	 * @generated
	 */
	float getRighHandSide();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorLpCons#getRighHandSide <em>Righ Hand Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Righ Hand Side</em>' attribute.
	 * @see #getRighHandSide()
	 * @generated
	 */
	void setRighHandSide(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GeneratorLpTerm constructTerm(GeneratorLpVar var, float coef);

} // GeneratorLpCons
