/**
 */
package com.misc.common.moplaf.flock;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain Flock Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.ChainFlockConfiguration#getFlockConfiguration <em>Flock Configuration</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.ChainFlockConfiguration#getMountedChainAsOwner <em>Mounted Chain As Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.flock.FlockPackage#getChainFlockConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface ChainFlockConfiguration extends ChainFlock {
	/**
	 * Returns the value of the '<em><b>Flock Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flock Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flock Configuration</em>' reference.
	 * @see #setFlockConfiguration(FlockConfiguration)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainFlockConfiguration_FlockConfiguration()
	 * @model required="true"
	 * @generated
	 */
	FlockConfiguration getFlockConfiguration();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.ChainFlockConfiguration#getFlockConfiguration <em>Flock Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flock Configuration</em>' reference.
	 * @see #getFlockConfiguration()
	 * @generated
	 */
	void setFlockConfiguration(FlockConfiguration value);

	/**
	 * Returns the value of the '<em><b>Mounted Chain As Owner</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.flock.ChainMounted}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounted Chain As Owner</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounted Chain As Owner</em>' containment reference list.
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainFlockConfiguration_MountedChainAsOwner()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChainMounted> getMountedChainAsOwner();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshChainMounted();

} // ChainFlockConfiguration
