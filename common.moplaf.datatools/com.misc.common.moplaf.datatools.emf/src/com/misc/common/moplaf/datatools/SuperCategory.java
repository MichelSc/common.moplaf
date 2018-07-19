/**
 */
package com.misc.common.moplaf.datatools;

import java.util.Set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.SuperCategory#getCategorizers <em>Categorizers</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getSuperCategory()
 * @model
 * @generated
 */
public interface SuperCategory extends CategoryAbstract {
	/**
	 * Returns the value of the '<em><b>Categorizers</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.Categorizer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorizers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorizers</em>' reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getSuperCategory_Categorizers()
	 * @model
	 * @generated
	 */
	EList<Categorizer> getCategorizers();

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

} // SuperCategory
