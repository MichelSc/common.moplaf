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

} // CategoryAbstract
