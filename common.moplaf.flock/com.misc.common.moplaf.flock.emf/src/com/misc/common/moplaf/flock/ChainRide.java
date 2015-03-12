/**
 */
package com.misc.common.moplaf.flock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain Ride</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.ChainRide#getFlockAsOwner <em>Flock As Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.flock.FlockPackage#getChainRide()
 * @model
 * @generated
 */
public interface ChainRide extends ChainFlock {
	/**
	 * Returns the value of the '<em><b>Flock As Owner</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.FlockRide#getChainOwner <em>Chain Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flock As Owner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flock As Owner</em>' containment reference.
	 * @see #setFlockAsOwner(FlockRide)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainRide_FlockAsOwner()
	 * @see com.misc.common.moplaf.flock.FlockRide#getChainOwner
	 * @model opposite="ChainOwner" containment="true" required="true"
	 * @generated
	 */
	FlockRide getFlockAsOwner();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.ChainRide#getFlockAsOwner <em>Flock As Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flock As Owner</em>' containment reference.
	 * @see #getFlockAsOwner()
	 * @generated
	 */
	void setFlockAsOwner(FlockRide value);

} // ChainRide
