/**
 */
package com.misc.common.moplaf.flock.impl;

import com.misc.common.moplaf.flock.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlockFactoryImpl extends EFactoryImpl implements FlockFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FlockFactory init() {
		try {
			FlockFactory theFlockFactory = (FlockFactory)EPackage.Registry.INSTANCE.getEFactory(FlockPackage.eNS_URI);
			if (theFlockFactory != null) {
				return theFlockFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FlockFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FlockPackage.FLOCK_SCOPE: return createFlockScope();
			case FlockPackage.LOCATION: return createLocation();
			case FlockPackage.FLOCK: return createFlock();
			case FlockPackage.FLOCK_EVENT: return createFlockEvent();
			case FlockPackage.FLOCK_CONFIGURATION: return createFlockConfiguration();
			case FlockPackage.FLOCK_MOVE: return createFlockMove();
			case FlockPackage.FLOCK_RIDE: return createFlockRide();
			case FlockPackage.FLOCK_WAY_POINT: return createFlockWayPoint();
			case FlockPackage.FLOCK_IDLE: return createFlockIdle();
			case FlockPackage.CHAIN: return createChain();
			case FlockPackage.CHAIN_RIDE: return createChainRide();
			case FlockPackage.CHAIN_WAY_POINT: return createChainWayPoint();
			case FlockPackage.CHAIN_CONFIGURATION: return createChainConfiguration();
			case FlockPackage.CHAIN_MOUNT: return createChainMount();
			case FlockPackage.CHAIN_MOUNTED: return createChainMounted();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockScope createFlockScope() {
		FlockScopeImpl flockScope = new FlockScopeImpl();
		return flockScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flock createFlock() {
		FlockImpl flock = new FlockImpl();
		return flock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockEvent createFlockEvent() {
		FlockEventImpl flockEvent = new FlockEventImpl();
		return flockEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockConfiguration createFlockConfiguration() {
		FlockConfigurationImpl flockConfiguration = new FlockConfigurationImpl();
		return flockConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockMove createFlockMove() {
		FlockMoveImpl flockMove = new FlockMoveImpl();
		return flockMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockRide createFlockRide() {
		FlockRideImpl flockRide = new FlockRideImpl();
		return flockRide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockWayPoint createFlockWayPoint() {
		FlockWayPointImpl flockWayPoint = new FlockWayPointImpl();
		return flockWayPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockIdle createFlockIdle() {
		FlockIdleImpl flockIdle = new FlockIdleImpl();
		return flockIdle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain createChain() {
		ChainImpl chain = new ChainImpl();
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainRide createChainRide() {
		ChainRideImpl chainRide = new ChainRideImpl();
		return chainRide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainWayPoint createChainWayPoint() {
		ChainWayPointImpl chainWayPoint = new ChainWayPointImpl();
		return chainWayPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainConfiguration createChainConfiguration() {
		ChainConfigurationImpl chainConfiguration = new ChainConfigurationImpl();
		return chainConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainMount createChainMount() {
		ChainMountImpl chainMount = new ChainMountImpl();
		return chainMount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainMounted createChainMounted() {
		ChainMountedImpl chainMounted = new ChainMountedImpl();
		return chainMounted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockPackage getFlockPackage() {
		return (FlockPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FlockPackage getPackage() {
		return FlockPackage.eINSTANCE;
	}

} //FlockFactoryImpl
