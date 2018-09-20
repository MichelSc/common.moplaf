/**
 */
package com.misc.common.moplaf.datatools;

import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.common.util.PropertiesProvider;
import com.misc.common.moplaf.datatools.util.ObjectSet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Abstract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.CategoryAbstract#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.CategoryAbstract#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.CategoryAbstract#getNbElements <em>Nb Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.CategoryAbstract#getCategoryLabel <em>Category Label</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.CategoryAbstract#getCategoryColumnizers <em>Category Columnizers</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategoryAbstract()
 * @model abstract="true"
 * @generated
 */
public interface CategoryAbstract extends EObject {
	
	static IPropertiesProvider PROPERTIES = PropertiesProvider.constructPropertiesProvider()
			.addProperty(DatatoolsPackage.Literals.CATEGORY_ABSTRACT__NB_ELEMENTS, 70)
			;
	
	/**
	 * Returns the value of the '<em><b>Sub Categories</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Categories</em>' containment reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategoryAbstract_SubCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getSubCategories();

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
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategoryAbstract_Elements()
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
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategoryAbstract_NbElements()
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
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategoryAbstract_CategoryLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getCategoryLabel();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.CategoryAbstract#getCategoryLabel <em>Category Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Label</em>' attribute.
	 * @see #getCategoryLabel()
	 * @generated
	 */
	void setCategoryLabel(String value);

	/**
	 * Returns the value of the '<em><b>Category Columnizers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Columnizers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Columnizers</em>' reference.
	 * @see #setCategoryColumnizers(Columnizers)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategoryAbstract_CategoryColumnizers()
	 * @model
	 * @generated
	 */
	Columnizers getCategoryColumnizers();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.CategoryAbstract#getCategoryColumnizers <em>Category Columnizers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Columnizers</em>' reference.
	 * @see #getCategoryColumnizers()
	 * @generated
	 */
	void setCategoryColumnizers(Columnizers value);

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
	 * @model insDataType="com.misc.common.moplaf.datatools.EObjectsSet" categorizersMany="true"
	 * @generated
	 */
	void refreshCats(ObjectSet ins, EList<Categorizer> categorizers, int level);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setColumnizerAll(Columnizers columnizers);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void flush();

} // CategoryAbstract
