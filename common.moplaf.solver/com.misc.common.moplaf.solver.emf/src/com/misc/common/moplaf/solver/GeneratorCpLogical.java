/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Cp Logical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorCpLogical#getTerm <em>Term</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorCpLogical#isNot <em>Not</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.GeneratorCpLogical#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpLogical()
 * @model
 * @generated
 */
public interface GeneratorCpLogical extends GeneratorCpCons {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorCpLogicalTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpLogical_Term()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratorCpLogicalTerm> getTerm();

	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' attribute.
	 * @see #setNot(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpLogical_Not()
	 * @model
	 * @generated
	 */
	boolean isNot();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorCpLogical#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' attribute.
	 * @see #isNot()
	 * @generated
	 */
	void setNot(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.EnumCpLogicalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumCpLogicalType
	 * @see #setType(EnumCpLogicalType)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getGeneratorCpLogical_Type()
	 * @model
	 * @generated
	 */
	EnumCpLogicalType getType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.GeneratorCpLogical#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumCpLogicalType
	 * @see #getType()
	 * @generated
	 */
	void setType(EnumCpLogicalType value);

} // GeneratorCpLogical
