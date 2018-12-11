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
 *   <li>{@link com.misc.common.moplaf.datatools.Category#getCategoryLabel <em>Category Label</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.Category#getCategoryValue <em>Category Value</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends CategoryAbstract {
 	/**
	 * Returns the value of the '<em><b>Category Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Label</em>' attribute.
	 * @see #setCategoryLabel(String)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategory_CategoryLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getCategoryLabel();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.Category#getCategoryLabel <em>Category Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Label</em>' attribute.
	 * @see #getCategoryLabel()
	 * @generated
	 */
	void setCategoryLabel(String value);

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
