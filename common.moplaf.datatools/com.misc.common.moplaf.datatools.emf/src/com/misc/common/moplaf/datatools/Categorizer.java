/**
 */
package com.misc.common.moplaf.datatools;

import java.util.Set;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.Categorizer#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategorizer()
 * @model
 * @generated
 */
public interface Categorizer extends CategoryAbstract {
	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.CategoryCriteria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategorizer_Criteria()
	 * @model
	 * @generated
	 */
	EList<CategoryCriteria> getCriteria();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model docRequired="true"
	 * @generated
	 */
	boolean isValidRoot(EObject doc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model insDataType="com.misc.common.moplaf.datatools.EObjectsSet"
	 * @generated
	 */
	void refreshCats(Set<EObject> ins);

} // Categorizer
