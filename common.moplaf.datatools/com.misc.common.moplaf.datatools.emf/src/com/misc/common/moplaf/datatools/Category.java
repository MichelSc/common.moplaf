/**
 */
package com.misc.common.moplaf.datatools;

import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.common.util.PropertiesProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.Category#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.Category#getNbElements <em>Nb Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.Category#getCategoryLabel <em>Category Label</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.Category#getColumnizers <em>Columnizers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.Category#getCategoryValue <em>Category Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.Category#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.Category#getSuperCategory <em>Super Category</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
	static IPropertiesProvider PROPERTIES = PropertiesProvider.constructPropertiesProvider()
			.addProperty(DatatoolsPackage.Literals.CATEGORY__NB_ELEMENTS, 70)
			;
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategory_Elements()
	 * @model
	 * @generated
	 */
	EList<EObject> getElements();

	/**
	 * Returns the value of the '<em><b>Nb Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Elements</em>' attribute.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategory_NbElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNbElements();

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
	 * Returns the value of the '<em><b>Columnizers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnizers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnizers</em>' reference.
	 * @see #setColumnizers(Columnizers)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategory_Columnizers()
	 * @model
	 * @generated
	 */
	Columnizers getColumnizers();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.Category#getColumnizers <em>Columnizers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnizers</em>' reference.
	 * @see #getColumnizers()
	 * @generated
	 */
	void setColumnizers(Columnizers value);

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

	/**
	 * Returns the value of the '<em><b>Sub Categories</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.Category}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.datatools.Category#getSuperCategory <em>Super Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Categories</em>' containment reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategory_SubCategories()
	 * @see com.misc.common.moplaf.datatools.Category#getSuperCategory
	 * @model opposite="SuperCategory" containment="true"
	 * @generated
	 */
	EList<Category> getSubCategories();

	/**
	 * Returns the value of the '<em><b>Super Category</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.datatools.Category#getSubCategories <em>Sub Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Category</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Category</em>' container reference.
	 * @see #setSuperCategory(Category)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategory_SuperCategory()
	 * @see com.misc.common.moplaf.datatools.Category#getSubCategories
	 * @model opposite="SubCategories" transient="false"
	 * @generated
	 */
	Category getSuperCategory();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.Category#getSuperCategory <em>Super Category</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Category</em>' container reference.
	 * @see #getSuperCategory()
	 * @generated
	 */
	void setSuperCategory(Category value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Category getSubcategory(EObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setColumnizerAll(Columnizers columnizers);

} // Category
