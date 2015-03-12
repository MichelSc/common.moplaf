/**
 */
package com.misc.common.moplaf.flock;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.FlockScope#getChains <em>Chains</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.FlockScope#getFlocks <em>Flocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockScope()
 * @model
 * @generated
 */
public interface FlockScope extends EObject {
	/**
	 * Returns the value of the '<em><b>Chains</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.flock.Chain}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.Chain#getFlockScope <em>Flock Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chains</em>' reference list.
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockScope_Chains()
	 * @see com.misc.common.moplaf.flock.Chain#getFlockScope
	 * @model opposite="FlockScope"
	 * @generated
	 */
	EList<Chain> getChains();

	/**
	 * Returns the value of the '<em><b>Flocks</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.flock.Flock}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.Flock#getFlockScope <em>Flock Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flocks</em>' reference list.
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockScope_Flocks()
	 * @see com.misc.common.moplaf.flock.Flock#getFlockScope
	 * @model opposite="FlockScope"
	 * @generated
	 */
	EList<Flock> getFlocks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshConfiguration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshMoves();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshIdles();

} // FlockScope
