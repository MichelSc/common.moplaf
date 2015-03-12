/**
 */
package com.misc.common.moplaf.flock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Way Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.FlockWayPoint#getWayPointLocation <em>Way Point Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.FlockWayPoint#getChainOwner <em>Chain Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockWayPoint()
 * @model
 * @generated
 */
public interface FlockWayPoint extends Flock {
	/**
	 * Returns the value of the '<em><b>Way Point Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Way Point Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Way Point Location</em>' reference.
	 * @see #setWayPointLocation(Location)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockWayPoint_WayPointLocation()
	 * @model
	 * @generated
	 */
	Location getWayPointLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.FlockWayPoint#getWayPointLocation <em>Way Point Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Way Point Location</em>' reference.
	 * @see #getWayPointLocation()
	 * @generated
	 */
	void setWayPointLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Chain Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.ChainWayPoint#getFlockAsOwner <em>Flock As Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain Owner</em>' container reference.
	 * @see #setChainOwner(ChainWayPoint)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockWayPoint_ChainOwner()
	 * @see com.misc.common.moplaf.flock.ChainWayPoint#getFlockAsOwner
	 * @model opposite="FlockAsOwner" transient="false"
	 * @generated
	 */
	ChainWayPoint getChainOwner();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.FlockWayPoint#getChainOwner <em>Chain Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain Owner</em>' container reference.
	 * @see #getChainOwner()
	 * @generated
	 */
	void setChainOwner(ChainWayPoint value);

} // FlockWayPoint
