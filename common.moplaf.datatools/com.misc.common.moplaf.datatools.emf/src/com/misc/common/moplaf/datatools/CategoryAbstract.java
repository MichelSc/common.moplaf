/**
 */
package com.misc.common.moplaf.datatools;

import java.util.Set;
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
 *   <li>{@link com.misc.common.moplaf.datatools.CategoryAbstract#getCategoryColumnizer <em>Category Columnizer</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategoryAbstract()
 * @model abstract="true"
 * @generated
 */
public interface CategoryAbstract extends EObject {
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
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategoryAbstract_CategoryLabel()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	String getCategoryLabel();

	/**
	 * Returns the value of the '<em><b>Category Columnizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Columnizer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Columnizer</em>' reference.
	 * @see #setCategoryColumnizer(Columnizer)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategoryAbstract_CategoryColumnizer()
	 * @model
	 * @generated
	 */
	Columnizer getCategoryColumnizer();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.CategoryAbstract#getCategoryColumnizer <em>Category Columnizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Columnizer</em>' reference.
	 * @see #getCategoryColumnizer()
	 * @generated
	 */
	void setCategoryColumnizer(Columnizer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getSubcategory(EObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tobeDataType="com.misc.common.moplaf.datatools.EObjectsSet"
	 * @generated
	 */
	void refreshCats(Set<EObject> tobe, Categorizer categorizer, int level);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setColumnizerAll(Columnizer columnizer);

} // CategoryAbstract
