/**
 */
package com.misc.common.moplaf.datatools;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.Category#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.Category#getCategoryValue <em>Category Value</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends CategoryAbstract {
	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' reference.
	 * @see #setCriteria(CategoryCriteria)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategory_Criteria()
	 * @model required="true"
	 * @generated
	 */
	CategoryCriteria getCriteria();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.Category#getCriteria <em>Criteria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria</em>' reference.
	 * @see #getCriteria()
	 * @generated
	 */
	void setCriteria(CategoryCriteria value);

	/**
	 * Returns the value of the '<em><b>Category Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Value</em>' attribute.
	 * @see #setCategoryValue(Object)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategory_CategoryValue()
	 * @model
	 * @generated
	 */
	Object getCategoryValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.Category#getCategoryValue <em>Category Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Value</em>' attribute.
	 * @see #getCategoryValue()
	 * @generated
	 */
	void setCategoryValue(Object value);

} // Category
