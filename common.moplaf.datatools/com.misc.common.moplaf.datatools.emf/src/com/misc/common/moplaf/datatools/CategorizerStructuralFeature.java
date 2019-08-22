/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorizer Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.CategorizerStructuralFeature#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.CategorizerStructuralFeature#getCategorizedType <em>Categorized Type</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategorizerStructuralFeature()
 * @model
 * @generated
 */
public interface CategorizerStructuralFeature extends Categorizer, NavigationPath {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategorizerStructuralFeature_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.CategorizerStructuralFeature#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Categorized Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorized Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorized Type</em>' reference.
	 * @see #setCategorizedType(EClass)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategorizerStructuralFeature_CategorizedType()
	 * @model
	 * @generated
	 */
	EClass getCategorizedType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.CategorizerStructuralFeature#getCategorizedType <em>Categorized Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorized Type</em>' reference.
	 * @see #getCategorizedType()
	 * @generated
	 */
	void setCategorizedType(EClass value);

} // CategorizerStructuralFeature
