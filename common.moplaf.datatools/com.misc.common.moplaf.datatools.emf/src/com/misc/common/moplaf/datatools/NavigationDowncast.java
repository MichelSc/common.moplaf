/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Downcast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.NavigationDowncast#getDowncastType <em>Downcast Type</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getNavigationDowncast()
 * @model
 * @generated
 */
public interface NavigationDowncast extends NavigationAxis {
	/**
	 * Returns the value of the '<em><b>Downcast Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Downcast Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downcast Type</em>' reference.
	 * @see #setDowncastType(EClass)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getNavigationDowncast_DowncastType()
	 * @model
	 * @generated
	 */
	EClass getDowncastType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.NavigationDowncast#getDowncastType <em>Downcast Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downcast Type</em>' reference.
	 * @see #getDowncastType()
	 * @generated
	 */
	void setDowncastType(EClass value);

} // NavigationDowncast
