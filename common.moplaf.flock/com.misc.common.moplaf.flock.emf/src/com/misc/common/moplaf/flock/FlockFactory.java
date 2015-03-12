/**
 */
package com.misc.common.moplaf.flock;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.flock.FlockPackage
 * @generated
 */
public interface FlockFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlockFactory eINSTANCE = com.misc.common.moplaf.flock.impl.FlockFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope</em>'.
	 * @generated
	 */
	FlockScope createFlockScope();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Flock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flock</em>'.
	 * @generated
	 */
	Flock createFlock();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	FlockEvent createFlockEvent();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	FlockConfiguration createFlockConfiguration();

	/**
	 * Returns a new object of class '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move</em>'.
	 * @generated
	 */
	FlockMove createFlockMove();

	/**
	 * Returns a new object of class '<em>Ride</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ride</em>'.
	 * @generated
	 */
	FlockRide createFlockRide();

	/**
	 * Returns a new object of class '<em>Way Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Way Point</em>'.
	 * @generated
	 */
	FlockWayPoint createFlockWayPoint();

	/**
	 * Returns a new object of class '<em>Idle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Idle</em>'.
	 * @generated
	 */
	FlockIdle createFlockIdle();

	/**
	 * Returns a new object of class '<em>Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chain</em>'.
	 * @generated
	 */
	Chain createChain();

	/**
	 * Returns a new object of class '<em>Chain Ride</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chain Ride</em>'.
	 * @generated
	 */
	ChainRide createChainRide();

	/**
	 * Returns a new object of class '<em>Chain Way Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chain Way Point</em>'.
	 * @generated
	 */
	ChainWayPoint createChainWayPoint();

	/**
	 * Returns a new object of class '<em>Chain Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chain Configuration</em>'.
	 * @generated
	 */
	ChainConfiguration createChainConfiguration();

	/**
	 * Returns a new object of class '<em>Chain Mount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chain Mount</em>'.
	 * @generated
	 */
	ChainMount createChainMount();

	/**
	 * Returns a new object of class '<em>Chain Mounted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chain Mounted</em>'.
	 * @generated
	 */
	ChainMounted createChainMounted();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FlockPackage getFlockPackage();

} //FlockFactory
