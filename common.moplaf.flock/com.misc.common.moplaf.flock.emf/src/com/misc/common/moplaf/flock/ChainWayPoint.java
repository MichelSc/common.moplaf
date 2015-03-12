/**
 */
package com.misc.common.moplaf.flock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain Way Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.ChainWayPoint#getFlockAsOwner <em>Flock As Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.flock.FlockPackage#getChainWayPoint()
 * @model
 * @generated
 */
public interface ChainWayPoint extends ChainFlock {
	/**
	 * Returns the value of the '<em><b>Flock As Owner</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.FlockWayPoint#getChainOwner <em>Chain Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flock As Owner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flock As Owner</em>' containment reference.
	 * @see #setFlockAsOwner(FlockWayPoint)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainWayPoint_FlockAsOwner()
	 * @see com.misc.common.moplaf.flock.FlockWayPoint#getChainOwner
	 * @model opposite="ChainOwner" containment="true"
	 * @generated
	 */
	FlockWayPoint getFlockAsOwner();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.ChainWayPoint#getFlockAsOwner <em>Flock As Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flock As Owner</em>' containment reference.
	 * @see #getFlockAsOwner()
	 * @generated
	 */
	void setFlockAsOwner(FlockWayPoint value);

} // ChainWayPoint
