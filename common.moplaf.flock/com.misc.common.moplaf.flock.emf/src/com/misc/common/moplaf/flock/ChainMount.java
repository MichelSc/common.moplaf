/**
 */
package com.misc.common.moplaf.flock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain Mount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.ChainMount#getMountPoint <em>Mount Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.flock.FlockPackage#getChainMount()
 * @model
 * @generated
 */
public interface ChainMount extends ChainFlockConfiguration {
	/**
	 * Returns the value of the '<em><b>Mount Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mount Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mount Point</em>' reference.
	 * @see #setMountPoint(ChainConfiguration)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainMount_MountPoint()
	 * @model required="true"
	 * @generated
	 */
	ChainConfiguration getMountPoint();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.ChainMount#getMountPoint <em>Mount Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount Point</em>' reference.
	 * @see #getMountPoint()
	 * @generated
	 */
	void setMountPoint(ChainConfiguration value);

} // ChainMount
