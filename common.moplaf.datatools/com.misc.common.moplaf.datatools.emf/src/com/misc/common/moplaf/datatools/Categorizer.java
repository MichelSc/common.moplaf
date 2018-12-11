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
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getCategorizer()
 * @model abstract="true"
 * @generated
 */
public interface Categorizer extends DataTool {
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
	String getCategoryLabel(Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model typeRequired="true"
	 * @generated
	 */
	boolean isValidElementType(EClass type);

} // Categorizer
