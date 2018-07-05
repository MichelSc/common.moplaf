/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.DataTool#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getDataTool()
 * @model abstract="true"
 * @generated
 */
public interface DataTool extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getDataTool_Context()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	DataTools getContext();

} // DataTool
