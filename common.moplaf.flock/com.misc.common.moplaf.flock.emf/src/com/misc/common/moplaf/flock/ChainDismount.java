/**
 */
package com.misc.common.moplaf.flock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain Dismount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.ChainDismount#getDismountPoint <em>Dismount Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.flock.FlockPackage#getChainDismount()
 * @model
 * @generated
 */
public interface ChainDismount extends ChainFlockConfiguration {
	/**
	 * Returns the value of the '<em><b>Dismount Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dismount Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dismount Point</em>' reference.
	 * @see #setDismountPoint(ChainConfiguration)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainDismount_DismountPoint()
	 * @model required="true"
	 * @generated
	 */
	ChainConfiguration getDismountPoint();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.ChainDismount#getDismountPoint <em>Dismount Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dismount Point</em>' reference.
	 * @see #getDismountPoint()
	 * @generated
	 */
	void setDismountPoint(ChainConfiguration value);

} // ChainDismount
