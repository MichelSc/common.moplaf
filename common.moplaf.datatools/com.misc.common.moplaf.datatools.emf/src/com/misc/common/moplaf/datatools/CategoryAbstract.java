/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.common.util.PropertiesProvider;
import com.misc.common.moplaf.datatools.util.ObjectSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Abstract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.CategoryAbstract#getNbElements <em>Nb Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.CategoryAbstract#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.CategoryAbstract#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.CategoryAbstract#getSuperCategory <em>Super Category</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.CategoryAbstract#getRootCategory <em>Root Category</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategoryAbstract()
 * @model abstract="true"
 * @generated
 */
public interface CategoryAbstract extends EObject {
	static IPropertiesProvider PROPERTIES = new PropertiesProvider() {{
		addProperty(DatatoolsPackage.Literals.CATEGORY_ABSTRACT__NB_ELEMENTS, 70).setPropertyTraits(1); // TODO
	}};

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
	 * Returns the value of the '<em><b>Sub Categories</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Categories</em>' containment reference isn't clear,
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
	 * Returns the value of the '<em><b>Super Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Category</em>' reference.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategoryAbstract_SuperCategory()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	CategoryAbstract getSuperCategory();

	/**
	 * Returns the value of the '<em><b>Root Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Category</em>' reference.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategoryAbstract_RootCategory()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	CategoryAbstract getRootCategory();

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
	 * @model providerDataType="com.misc.common.moplaf.datatools.IPropertiesProvider"
	 * @generated
	 */
	Object getPropertyAggregation(IPropertiesProvider provider, Object property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model els_tobeDataType="com.misc.common.moplaf.datatools.EObjectsSet" categorizersMany="true"
	 * @generated
	 */
	void refresh(CategoryFactory factory, ObjectSet els_tobe, EList<Categorizer> categorizers, int level);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isIn(CategoryAbstract super_category);

} // CategoryAbstract
