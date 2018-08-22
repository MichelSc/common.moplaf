/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columnizers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.Columnizers#getColumnizers <em>Columnizers</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizers()
 * @model
 * @generated
 */
public interface Columnizers extends EObject {
	/**
	 * Returns the value of the '<em><b>Columnizers</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.ColumnizerAbstract}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnizers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnizers</em>' containment reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizers_Columnizers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnizerAbstract> getColumnizers();

} // Columnizers
