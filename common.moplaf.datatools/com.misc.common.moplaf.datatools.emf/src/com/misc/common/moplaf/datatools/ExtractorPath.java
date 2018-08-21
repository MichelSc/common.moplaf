/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extractor Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.ExtractorPath#getRootType <em>Root Type</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getExtractorPath()
 * @model
 * @generated
 */
public interface ExtractorPath extends Extractor, NavigationPath {

	/**
	 * Returns the value of the '<em><b>Root Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Type</em>' reference.
	 * @see #setRootType(EClass)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getExtractorPath_RootType()
	 * @model
	 * @generated
	 */
	EClass getRootType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.ExtractorPath#getRootType <em>Root Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Type</em>' reference.
	 * @see #getRootType()
	 * @generated
	 */
	void setRootType(EClass value);
} // ExtractorPath
