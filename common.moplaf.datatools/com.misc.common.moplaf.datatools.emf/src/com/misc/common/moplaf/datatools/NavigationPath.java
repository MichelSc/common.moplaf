/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.NavigationPath#getPathElements <em>Path Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.NavigationPath#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.NavigationPath#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.NavigationPath#isMany <em>Many</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.NavigationPath#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getNavigationPath()
 * @model abstract="true"
 * @generated
 */
public interface NavigationPath extends DataToolAbstract {
	/**
	 * Returns the value of the '<em><b>Path Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.NavigationAxis}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.datatools.NavigationAxis#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Elements</em>' containment reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getNavigationPath_PathElements()
	 * @see com.misc.common.moplaf.datatools.NavigationAxis#getPath
	 * @model opposite="Path" containment="true"
	 * @generated
	 */
	EList<NavigationAxis> getPathElements();

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' reference.
	 * @see #setSourceType(EClass)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getNavigationPath_SourceType()
	 * @model
	 * @generated
	 */
	EClass getSourceType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.NavigationPath#getSourceType <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' reference.
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(EClass value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' reference.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getNavigationPath_TargetType()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EClass getTargetType();

	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getNavigationPath_Many()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isMany();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getNavigationPath_Path()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getPath();


} // NavigationPath
