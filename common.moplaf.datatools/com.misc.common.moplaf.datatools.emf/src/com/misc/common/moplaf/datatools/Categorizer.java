/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link com.misc.common.moplaf.datatools.Categorizer#getCategorizedType <em>Categorized Type</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategorizer()
 * @model abstract="true"
 * @generated
 */
public interface Categorizer extends DataTool {
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
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategorizer_CategorizedType()
	 * @model
	 * @generated
	 */
	EClass getCategorizedType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.Categorizer#getCategorizedType <em>Categorized Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorized Type</em>' reference.
	 * @see #getCategorizedType()
	 * @generated
	 */
	void setCategorizedType(EClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object getCategoryValue(EObject object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getCategoryLabel(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model typeRequired="true"
	 * @generated
	 */
	boolean isValidElementType(EClass type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Category constructCategory();

} // Categorizer
