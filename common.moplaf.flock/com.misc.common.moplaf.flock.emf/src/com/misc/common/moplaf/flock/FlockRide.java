/**
 */
package com.misc.common.moplaf.flock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ride</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.FlockRide#getStartRide <em>Start Ride</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.FlockRide#getToRide <em>To Ride</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.FlockRide#getChainOwner <em>Chain Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockRide()
 * @model
 * @generated
 */
public interface FlockRide extends Flock {
	/**
	 * Returns the value of the '<em><b>Start Ride</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Ride</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Ride</em>' reference.
	 * @see #setStartRide(Location)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockRide_StartRide()
	 * @model required="true"
	 * @generated
	 */
	Location getStartRide();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.FlockRide#getStartRide <em>Start Ride</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Ride</em>' reference.
	 * @see #getStartRide()
	 * @generated
	 */
	void setStartRide(Location value);

	/**
	 * Returns the value of the '<em><b>To Ride</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Ride</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Ride</em>' reference.
	 * @see #setToRide(Location)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockRide_ToRide()
	 * @model required="true"
	 * @generated
	 */
	Location getToRide();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.FlockRide#getToRide <em>To Ride</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Ride</em>' reference.
	 * @see #getToRide()
	 * @generated
	 */
	void setToRide(Location value);

	/**
	 * Returns the value of the '<em><b>Chain Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.ChainRide#getFlockAsOwner <em>Flock As Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain Owner</em>' container reference.
	 * @see #setChainOwner(ChainRide)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockRide_ChainOwner()
	 * @see com.misc.common.moplaf.flock.ChainRide#getFlockAsOwner
	 * @model opposite="FlockAsOwner" transient="false"
	 * @generated
	 */
	ChainRide getChainOwner();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.FlockRide#getChainOwner <em>Chain Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain Owner</em>' container reference.
	 * @see #getChainOwner()
	 * @generated
	 */
	void setChainOwner(ChainRide value);

} // FlockRide
