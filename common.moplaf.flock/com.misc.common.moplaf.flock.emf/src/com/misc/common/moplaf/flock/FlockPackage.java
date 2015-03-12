/**
 */
package com.misc.common.moplaf.flock;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.flock.FlockFactory
 * @model kind="package"
 * @generated
 */
public interface FlockPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flock";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.common.moplaf.flock";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flock";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlockPackage eINSTANCE = com.misc.common.moplaf.flock.impl.FlockPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.FlockScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.FlockScopeImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlockScope()
	 * @generated
	 */
	int FLOCK_SCOPE = 0;

	/**
	 * The feature id for the '<em><b>Chains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE__CHAINS = 0;

	/**
	 * The feature id for the '<em><b>Flocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE__FLOCKS = 1;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Refresh Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE___REFRESH_CONFIGURATION = 0;

	/**
	 * The operation id for the '<em>Refresh Moves</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE___REFRESH_MOVES = 1;

	/**
	 * The operation id for the '<em>Refresh Idles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE___REFRESH_IDLES = 2;

	/**
	 * The number of operations of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.LocationImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.FlockImpl <em>Flock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.FlockImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlock()
	 * @generated
	 */
	int FLOCK = 2;

	/**
	 * The feature id for the '<em><b>Chains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK__CHAINS = 0;

	/**
	 * The feature id for the '<em><b>Chain Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK__CHAIN_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Duration Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK__DURATION_MIN = 2;

	/**
	 * The feature id for the '<em><b>Duration Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK__DURATION_MAX = 3;

	/**
	 * The feature id for the '<em><b>Start Earliest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK__START_EARLIEST = 4;

	/**
	 * The feature id for the '<em><b>End Latest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK__END_LATEST = 5;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK__START = 6;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK__END = 7;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK__START_LOCATION = 8;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK__END_LOCATION = 9;

	/**
	 * The feature id for the '<em><b>Start Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK__START_EVENT = 10;

	/**
	 * The feature id for the '<em><b>End Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK__END_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Flock Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK__FLOCK_SCOPE = 12;

	/**
	 * The number of structural features of the '<em>Flock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Flock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.FlockEventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.FlockEventImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlockEvent()
	 * @generated
	 */
	int FLOCK_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_EVENT__TIME = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_EVENT__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Flock As Start</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_EVENT__FLOCK_AS_START = 2;

	/**
	 * The feature id for the '<em><b>Flock As End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_EVENT__FLOCK_AS_END = 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.ChainFlockImpl <em>Chain Flock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.ChainFlockImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChainFlock()
	 * @generated
	 */
	int CHAIN_FLOCK = 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.FlockConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.FlockConfigurationImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlockConfiguration()
	 * @generated
	 */
	int FLOCK_CONFIGURATION = 5;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.FlockMoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.FlockMoveImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlockMove()
	 * @generated
	 */
	int FLOCK_MOVE = 6;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.FlockRideImpl <em>Ride</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.FlockRideImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlockRide()
	 * @generated
	 */
	int FLOCK_RIDE = 7;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.FlockWayPointImpl <em>Way Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.FlockWayPointImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlockWayPoint()
	 * @generated
	 */
	int FLOCK_WAY_POINT = 8;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.FlockIdleImpl <em>Idle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.FlockIdleImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlockIdle()
	 * @generated
	 */
	int FLOCK_IDLE = 9;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.ChainImpl <em>Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.ChainImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChain()
	 * @generated
	 */
	int CHAIN = 10;

	/**
	 * The feature id for the '<em><b>Mounted Flocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK__MOUNTED_FLOCKS = 0;

	/**
	 * The feature id for the '<em><b>Mounter Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK__MOUNTER_FLOCK = 1;

	/**
	 * The feature id for the '<em><b>Next Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK__NEXT_FLOCK = 2;

	/**
	 * The feature id for the '<em><b>Previous Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK__PREVIOUS_FLOCK = 3;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK__CHAIN = 4;

	/**
	 * The feature id for the '<em><b>Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK__FLOCK = 5;

	/**
	 * The feature id for the '<em><b>Sequence Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK__SEQUENCE_NR = 6;

	/**
	 * The number of structural features of the '<em>Chain Flock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Chain Flock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Chains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__CHAINS = FLOCK__CHAINS;

	/**
	 * The feature id for the '<em><b>Chain Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__CHAIN_ROOT = FLOCK__CHAIN_ROOT;

	/**
	 * The feature id for the '<em><b>Duration Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__DURATION_MIN = FLOCK__DURATION_MIN;

	/**
	 * The feature id for the '<em><b>Duration Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__DURATION_MAX = FLOCK__DURATION_MAX;

	/**
	 * The feature id for the '<em><b>Start Earliest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__START_EARLIEST = FLOCK__START_EARLIEST;

	/**
	 * The feature id for the '<em><b>End Latest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__END_LATEST = FLOCK__END_LATEST;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__START = FLOCK__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__END = FLOCK__END;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__START_LOCATION = FLOCK__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__END_LOCATION = FLOCK__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Start Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__START_EVENT = FLOCK__START_EVENT;

	/**
	 * The feature id for the '<em><b>End Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__END_EVENT = FLOCK__END_EVENT;

	/**
	 * The feature id for the '<em><b>Flock Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__FLOCK_SCOPE = FLOCK__FLOCK_SCOPE;

	/**
	 * The feature id for the '<em><b>Configuration Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__CONFIGURATION_LOCATION = FLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chain Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION__CHAIN_OWNER = FLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION_FEATURE_COUNT = FLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_CONFIGURATION_OPERATION_COUNT = FLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE__CHAINS = FLOCK__CHAINS;

	/**
	 * The feature id for the '<em><b>Chain Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE__CHAIN_ROOT = FLOCK__CHAIN_ROOT;

	/**
	 * The feature id for the '<em><b>Duration Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE__DURATION_MIN = FLOCK__DURATION_MIN;

	/**
	 * The feature id for the '<em><b>Duration Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE__DURATION_MAX = FLOCK__DURATION_MAX;

	/**
	 * The feature id for the '<em><b>Start Earliest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE__START_EARLIEST = FLOCK__START_EARLIEST;

	/**
	 * The feature id for the '<em><b>End Latest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE__END_LATEST = FLOCK__END_LATEST;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE__START = FLOCK__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE__END = FLOCK__END;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE__START_LOCATION = FLOCK__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE__END_LOCATION = FLOCK__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Start Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE__START_EVENT = FLOCK__START_EVENT;

	/**
	 * The feature id for the '<em><b>End Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE__END_EVENT = FLOCK__END_EVENT;

	/**
	 * The feature id for the '<em><b>Flock Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE__FLOCK_SCOPE = FLOCK__FLOCK_SCOPE;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE_FEATURE_COUNT = FLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_MOVE_OPERATION_COUNT = FLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__CHAINS = FLOCK__CHAINS;

	/**
	 * The feature id for the '<em><b>Chain Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__CHAIN_ROOT = FLOCK__CHAIN_ROOT;

	/**
	 * The feature id for the '<em><b>Duration Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__DURATION_MIN = FLOCK__DURATION_MIN;

	/**
	 * The feature id for the '<em><b>Duration Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__DURATION_MAX = FLOCK__DURATION_MAX;

	/**
	 * The feature id for the '<em><b>Start Earliest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__START_EARLIEST = FLOCK__START_EARLIEST;

	/**
	 * The feature id for the '<em><b>End Latest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__END_LATEST = FLOCK__END_LATEST;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__START = FLOCK__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__END = FLOCK__END;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__START_LOCATION = FLOCK__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__END_LOCATION = FLOCK__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Start Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__START_EVENT = FLOCK__START_EVENT;

	/**
	 * The feature id for the '<em><b>End Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__END_EVENT = FLOCK__END_EVENT;

	/**
	 * The feature id for the '<em><b>Flock Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__FLOCK_SCOPE = FLOCK__FLOCK_SCOPE;

	/**
	 * The feature id for the '<em><b>Start Ride</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__START_RIDE = FLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Ride</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__TO_RIDE = FLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Chain Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE__CHAIN_OWNER = FLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE_FEATURE_COUNT = FLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_RIDE_OPERATION_COUNT = FLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__CHAINS = FLOCK__CHAINS;

	/**
	 * The feature id for the '<em><b>Chain Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__CHAIN_ROOT = FLOCK__CHAIN_ROOT;

	/**
	 * The feature id for the '<em><b>Duration Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__DURATION_MIN = FLOCK__DURATION_MIN;

	/**
	 * The feature id for the '<em><b>Duration Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__DURATION_MAX = FLOCK__DURATION_MAX;

	/**
	 * The feature id for the '<em><b>Start Earliest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__START_EARLIEST = FLOCK__START_EARLIEST;

	/**
	 * The feature id for the '<em><b>End Latest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__END_LATEST = FLOCK__END_LATEST;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__START = FLOCK__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__END = FLOCK__END;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__START_LOCATION = FLOCK__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__END_LOCATION = FLOCK__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Start Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__START_EVENT = FLOCK__START_EVENT;

	/**
	 * The feature id for the '<em><b>End Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__END_EVENT = FLOCK__END_EVENT;

	/**
	 * The feature id for the '<em><b>Flock Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__FLOCK_SCOPE = FLOCK__FLOCK_SCOPE;

	/**
	 * The feature id for the '<em><b>Way Point Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__WAY_POINT_LOCATION = FLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chain Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT__CHAIN_OWNER = FLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Way Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT_FEATURE_COUNT = FLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Way Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_WAY_POINT_OPERATION_COUNT = FLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE__CHAINS = FLOCK__CHAINS;

	/**
	 * The feature id for the '<em><b>Chain Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE__CHAIN_ROOT = FLOCK__CHAIN_ROOT;

	/**
	 * The feature id for the '<em><b>Duration Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE__DURATION_MIN = FLOCK__DURATION_MIN;

	/**
	 * The feature id for the '<em><b>Duration Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE__DURATION_MAX = FLOCK__DURATION_MAX;

	/**
	 * The feature id for the '<em><b>Start Earliest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE__START_EARLIEST = FLOCK__START_EARLIEST;

	/**
	 * The feature id for the '<em><b>End Latest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE__END_LATEST = FLOCK__END_LATEST;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE__START = FLOCK__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE__END = FLOCK__END;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE__START_LOCATION = FLOCK__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE__END_LOCATION = FLOCK__END_LOCATION;

	/**
	 * The feature id for the '<em><b>Start Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE__START_EVENT = FLOCK__START_EVENT;

	/**
	 * The feature id for the '<em><b>End Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE__END_EVENT = FLOCK__END_EVENT;

	/**
	 * The feature id for the '<em><b>Flock Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE__FLOCK_SCOPE = FLOCK__FLOCK_SCOPE;

	/**
	 * The number of structural features of the '<em>Idle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE_FEATURE_COUNT = FLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Idle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_IDLE_OPERATION_COUNT = FLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__FLOCKS = 0;

	/**
	 * The feature id for the '<em><b>Flock Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__FLOCK_SCOPE = 1;

	/**
	 * The number of structural features of the '<em>Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Construct Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN___CONSTRUCT_MOVE__LOCATION_LOCATION = 0;

	/**
	 * The operation id for the '<em>Refresh Chain Flock Next Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN___REFRESH_CHAIN_FLOCK_NEXT_PREVIOUS = 1;

	/**
	 * The operation id for the '<em>Refresh Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN___REFRESH_INIT = 2;

	/**
	 * The number of operations of the '<em>Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.ChainRideImpl <em>Chain Ride</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.ChainRideImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChainRide()
	 * @generated
	 */
	int CHAIN_RIDE = 11;

	/**
	 * The feature id for the '<em><b>Mounted Flocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RIDE__MOUNTED_FLOCKS = CHAIN_FLOCK__MOUNTED_FLOCKS;

	/**
	 * The feature id for the '<em><b>Mounter Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RIDE__MOUNTER_FLOCK = CHAIN_FLOCK__MOUNTER_FLOCK;

	/**
	 * The feature id for the '<em><b>Next Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RIDE__NEXT_FLOCK = CHAIN_FLOCK__NEXT_FLOCK;

	/**
	 * The feature id for the '<em><b>Previous Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RIDE__PREVIOUS_FLOCK = CHAIN_FLOCK__PREVIOUS_FLOCK;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RIDE__CHAIN = CHAIN_FLOCK__CHAIN;

	/**
	 * The feature id for the '<em><b>Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RIDE__FLOCK = CHAIN_FLOCK__FLOCK;

	/**
	 * The feature id for the '<em><b>Sequence Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RIDE__SEQUENCE_NR = CHAIN_FLOCK__SEQUENCE_NR;

	/**
	 * The feature id for the '<em><b>Flock As Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RIDE__FLOCK_AS_OWNER = CHAIN_FLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chain Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RIDE_FEATURE_COUNT = CHAIN_FLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Chain Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RIDE_OPERATION_COUNT = CHAIN_FLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.ChainWayPointImpl <em>Chain Way Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.ChainWayPointImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChainWayPoint()
	 * @generated
	 */
	int CHAIN_WAY_POINT = 12;

	/**
	 * The feature id for the '<em><b>Mounted Flocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_WAY_POINT__MOUNTED_FLOCKS = CHAIN_FLOCK__MOUNTED_FLOCKS;

	/**
	 * The feature id for the '<em><b>Mounter Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_WAY_POINT__MOUNTER_FLOCK = CHAIN_FLOCK__MOUNTER_FLOCK;

	/**
	 * The feature id for the '<em><b>Next Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_WAY_POINT__NEXT_FLOCK = CHAIN_FLOCK__NEXT_FLOCK;

	/**
	 * The feature id for the '<em><b>Previous Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_WAY_POINT__PREVIOUS_FLOCK = CHAIN_FLOCK__PREVIOUS_FLOCK;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_WAY_POINT__CHAIN = CHAIN_FLOCK__CHAIN;

	/**
	 * The feature id for the '<em><b>Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_WAY_POINT__FLOCK = CHAIN_FLOCK__FLOCK;

	/**
	 * The feature id for the '<em><b>Sequence Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_WAY_POINT__SEQUENCE_NR = CHAIN_FLOCK__SEQUENCE_NR;

	/**
	 * The feature id for the '<em><b>Flock As Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_WAY_POINT__FLOCK_AS_OWNER = CHAIN_FLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chain Way Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_WAY_POINT_FEATURE_COUNT = CHAIN_FLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Chain Way Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_WAY_POINT_OPERATION_COUNT = CHAIN_FLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.ChainFlockConfigurationImpl <em>Chain Flock Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.ChainFlockConfigurationImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChainFlockConfiguration()
	 * @generated
	 */
	int CHAIN_FLOCK_CONFIGURATION = 13;

	/**
	 * The feature id for the '<em><b>Mounted Flocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK_CONFIGURATION__MOUNTED_FLOCKS = CHAIN_FLOCK__MOUNTED_FLOCKS;

	/**
	 * The feature id for the '<em><b>Mounter Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK_CONFIGURATION__MOUNTER_FLOCK = CHAIN_FLOCK__MOUNTER_FLOCK;

	/**
	 * The feature id for the '<em><b>Next Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK_CONFIGURATION__NEXT_FLOCK = CHAIN_FLOCK__NEXT_FLOCK;

	/**
	 * The feature id for the '<em><b>Previous Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK_CONFIGURATION__PREVIOUS_FLOCK = CHAIN_FLOCK__PREVIOUS_FLOCK;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK_CONFIGURATION__CHAIN = CHAIN_FLOCK__CHAIN;

	/**
	 * The feature id for the '<em><b>Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK_CONFIGURATION__FLOCK = CHAIN_FLOCK__FLOCK;

	/**
	 * The feature id for the '<em><b>Sequence Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK_CONFIGURATION__SEQUENCE_NR = CHAIN_FLOCK__SEQUENCE_NR;

	/**
	 * The feature id for the '<em><b>Flock Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK_CONFIGURATION__FLOCK_CONFIGURATION = CHAIN_FLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mounted Chain As Owner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK_CONFIGURATION__MOUNTED_CHAIN_AS_OWNER = CHAIN_FLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chain Flock Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK_CONFIGURATION_FEATURE_COUNT = CHAIN_FLOCK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh Chain Mounted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK_CONFIGURATION___REFRESH_CHAIN_MOUNTED = CHAIN_FLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chain Flock Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FLOCK_CONFIGURATION_OPERATION_COUNT = CHAIN_FLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.ChainConfigurationImpl <em>Chain Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.ChainConfigurationImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChainConfiguration()
	 * @generated
	 */
	int CHAIN_CONFIGURATION = 14;

	/**
	 * The feature id for the '<em><b>Mounted Flocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION__MOUNTED_FLOCKS = CHAIN_FLOCK_CONFIGURATION__MOUNTED_FLOCKS;

	/**
	 * The feature id for the '<em><b>Mounter Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION__MOUNTER_FLOCK = CHAIN_FLOCK_CONFIGURATION__MOUNTER_FLOCK;

	/**
	 * The feature id for the '<em><b>Next Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION__NEXT_FLOCK = CHAIN_FLOCK_CONFIGURATION__NEXT_FLOCK;

	/**
	 * The feature id for the '<em><b>Previous Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION__PREVIOUS_FLOCK = CHAIN_FLOCK_CONFIGURATION__PREVIOUS_FLOCK;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION__CHAIN = CHAIN_FLOCK_CONFIGURATION__CHAIN;

	/**
	 * The feature id for the '<em><b>Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION__FLOCK = CHAIN_FLOCK_CONFIGURATION__FLOCK;

	/**
	 * The feature id for the '<em><b>Sequence Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION__SEQUENCE_NR = CHAIN_FLOCK_CONFIGURATION__SEQUENCE_NR;

	/**
	 * The feature id for the '<em><b>Flock Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION__FLOCK_CONFIGURATION = CHAIN_FLOCK_CONFIGURATION__FLOCK_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Mounted Chain As Owner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION__MOUNTED_CHAIN_AS_OWNER = CHAIN_FLOCK_CONFIGURATION__MOUNTED_CHAIN_AS_OWNER;

	/**
	 * The feature id for the '<em><b>Flock As Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION__FLOCK_AS_OWNER = CHAIN_FLOCK_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attach Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION__ATTACH_POINT = CHAIN_FLOCK_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chain Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION_FEATURE_COUNT = CHAIN_FLOCK_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh Chain Mounted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION___REFRESH_CHAIN_MOUNTED = CHAIN_FLOCK_CONFIGURATION___REFRESH_CHAIN_MOUNTED;

	/**
	 * The operation id for the '<em>Refresh Flock Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION___REFRESH_FLOCK_CONFIGURATION = CHAIN_FLOCK_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chain Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_CONFIGURATION_OPERATION_COUNT = CHAIN_FLOCK_CONFIGURATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.ChainMountImpl <em>Chain Mount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.ChainMountImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChainMount()
	 * @generated
	 */
	int CHAIN_MOUNT = 15;

	/**
	 * The feature id for the '<em><b>Mounted Flocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNT__MOUNTED_FLOCKS = CHAIN_FLOCK_CONFIGURATION__MOUNTED_FLOCKS;

	/**
	 * The feature id for the '<em><b>Mounter Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNT__MOUNTER_FLOCK = CHAIN_FLOCK_CONFIGURATION__MOUNTER_FLOCK;

	/**
	 * The feature id for the '<em><b>Next Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNT__NEXT_FLOCK = CHAIN_FLOCK_CONFIGURATION__NEXT_FLOCK;

	/**
	 * The feature id for the '<em><b>Previous Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNT__PREVIOUS_FLOCK = CHAIN_FLOCK_CONFIGURATION__PREVIOUS_FLOCK;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNT__CHAIN = CHAIN_FLOCK_CONFIGURATION__CHAIN;

	/**
	 * The feature id for the '<em><b>Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNT__FLOCK = CHAIN_FLOCK_CONFIGURATION__FLOCK;

	/**
	 * The feature id for the '<em><b>Sequence Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNT__SEQUENCE_NR = CHAIN_FLOCK_CONFIGURATION__SEQUENCE_NR;

	/**
	 * The feature id for the '<em><b>Flock Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNT__FLOCK_CONFIGURATION = CHAIN_FLOCK_CONFIGURATION__FLOCK_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Mounted Chain As Owner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNT__MOUNTED_CHAIN_AS_OWNER = CHAIN_FLOCK_CONFIGURATION__MOUNTED_CHAIN_AS_OWNER;

	/**
	 * The feature id for the '<em><b>Mount Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNT__MOUNT_POINT = CHAIN_FLOCK_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chain Mount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNT_FEATURE_COUNT = CHAIN_FLOCK_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Chain Mounted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNT___REFRESH_CHAIN_MOUNTED = CHAIN_FLOCK_CONFIGURATION___REFRESH_CHAIN_MOUNTED;

	/**
	 * The number of operations of the '<em>Chain Mount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNT_OPERATION_COUNT = CHAIN_FLOCK_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.flock.impl.ChainMountedImpl <em>Chain Mounted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.flock.impl.ChainMountedImpl
	 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChainMounted()
	 * @generated
	 */
	int CHAIN_MOUNTED = 16;

	/**
	 * The feature id for the '<em><b>Mounted Flocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNTED__MOUNTED_FLOCKS = CHAIN_FLOCK_CONFIGURATION__MOUNTED_FLOCKS;

	/**
	 * The feature id for the '<em><b>Mounter Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNTED__MOUNTER_FLOCK = CHAIN_FLOCK_CONFIGURATION__MOUNTER_FLOCK;

	/**
	 * The feature id for the '<em><b>Next Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNTED__NEXT_FLOCK = CHAIN_FLOCK_CONFIGURATION__NEXT_FLOCK;

	/**
	 * The feature id for the '<em><b>Previous Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNTED__PREVIOUS_FLOCK = CHAIN_FLOCK_CONFIGURATION__PREVIOUS_FLOCK;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNTED__CHAIN = CHAIN_FLOCK_CONFIGURATION__CHAIN;

	/**
	 * The feature id for the '<em><b>Flock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNTED__FLOCK = CHAIN_FLOCK_CONFIGURATION__FLOCK;

	/**
	 * The feature id for the '<em><b>Sequence Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNTED__SEQUENCE_NR = CHAIN_FLOCK_CONFIGURATION__SEQUENCE_NR;

	/**
	 * The feature id for the '<em><b>Flock Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNTED__FLOCK_CONFIGURATION = CHAIN_FLOCK_CONFIGURATION__FLOCK_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Mounted Chain As Owner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNTED__MOUNTED_CHAIN_AS_OWNER = CHAIN_FLOCK_CONFIGURATION__MOUNTED_CHAIN_AS_OWNER;

	/**
	 * The number of structural features of the '<em>Chain Mounted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNTED_FEATURE_COUNT = CHAIN_FLOCK_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh Chain Mounted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNTED___REFRESH_CHAIN_MOUNTED = CHAIN_FLOCK_CONFIGURATION___REFRESH_CHAIN_MOUNTED;

	/**
	 * The number of operations of the '<em>Chain Mounted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_MOUNTED_OPERATION_COUNT = CHAIN_FLOCK_CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.FlockScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see com.misc.common.moplaf.flock.FlockScope
	 * @generated
	 */
	EClass getFlockScope();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.flock.FlockScope#getChains <em>Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Chains</em>'.
	 * @see com.misc.common.moplaf.flock.FlockScope#getChains()
	 * @see #getFlockScope()
	 * @generated
	 */
	EReference getFlockScope_Chains();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.flock.FlockScope#getFlocks <em>Flocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flocks</em>'.
	 * @see com.misc.common.moplaf.flock.FlockScope#getFlocks()
	 * @see #getFlockScope()
	 * @generated
	 */
	EReference getFlockScope_Flocks();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.flock.FlockScope#refreshConfiguration() <em>Refresh Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Configuration</em>' operation.
	 * @see com.misc.common.moplaf.flock.FlockScope#refreshConfiguration()
	 * @generated
	 */
	EOperation getFlockScope__RefreshConfiguration();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.flock.FlockScope#refreshMoves() <em>Refresh Moves</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Moves</em>' operation.
	 * @see com.misc.common.moplaf.flock.FlockScope#refreshMoves()
	 * @generated
	 */
	EOperation getFlockScope__RefreshMoves();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.flock.FlockScope#refreshIdles() <em>Refresh Idles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Idles</em>' operation.
	 * @see com.misc.common.moplaf.flock.FlockScope#refreshIdles()
	 * @generated
	 */
	EOperation getFlockScope__RefreshIdles();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see com.misc.common.moplaf.flock.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.Flock <em>Flock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flock</em>'.
	 * @see com.misc.common.moplaf.flock.Flock
	 * @generated
	 */
	EClass getFlock();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.flock.Flock#getChains <em>Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Chains</em>'.
	 * @see com.misc.common.moplaf.flock.Flock#getChains()
	 * @see #getFlock()
	 * @generated
	 */
	EReference getFlock_Chains();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.Flock#getChainRoot <em>Chain Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chain Root</em>'.
	 * @see com.misc.common.moplaf.flock.Flock#getChainRoot()
	 * @see #getFlock()
	 * @generated
	 */
	EReference getFlock_ChainRoot();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.flock.Flock#getDurationMin <em>Duration Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Min</em>'.
	 * @see com.misc.common.moplaf.flock.Flock#getDurationMin()
	 * @see #getFlock()
	 * @generated
	 */
	EAttribute getFlock_DurationMin();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.flock.Flock#getDurationMax <em>Duration Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Max</em>'.
	 * @see com.misc.common.moplaf.flock.Flock#getDurationMax()
	 * @see #getFlock()
	 * @generated
	 */
	EAttribute getFlock_DurationMax();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.flock.Flock#getStartEarliest <em>Start Earliest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Earliest</em>'.
	 * @see com.misc.common.moplaf.flock.Flock#getStartEarliest()
	 * @see #getFlock()
	 * @generated
	 */
	EAttribute getFlock_StartEarliest();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.flock.Flock#getEndLatest <em>End Latest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Latest</em>'.
	 * @see com.misc.common.moplaf.flock.Flock#getEndLatest()
	 * @see #getFlock()
	 * @generated
	 */
	EAttribute getFlock_EndLatest();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.flock.Flock#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.misc.common.moplaf.flock.Flock#getStart()
	 * @see #getFlock()
	 * @generated
	 */
	EAttribute getFlock_Start();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.flock.Flock#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see com.misc.common.moplaf.flock.Flock#getEnd()
	 * @see #getFlock()
	 * @generated
	 */
	EAttribute getFlock_End();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.Flock#getStartLocation <em>Start Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Location</em>'.
	 * @see com.misc.common.moplaf.flock.Flock#getStartLocation()
	 * @see #getFlock()
	 * @generated
	 */
	EReference getFlock_StartLocation();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.Flock#getEndLocation <em>End Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Location</em>'.
	 * @see com.misc.common.moplaf.flock.Flock#getEndLocation()
	 * @see #getFlock()
	 * @generated
	 */
	EReference getFlock_EndLocation();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.Flock#getStartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Event</em>'.
	 * @see com.misc.common.moplaf.flock.Flock#getStartEvent()
	 * @see #getFlock()
	 * @generated
	 */
	EReference getFlock_StartEvent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.Flock#getEndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Event</em>'.
	 * @see com.misc.common.moplaf.flock.Flock#getEndEvent()
	 * @see #getFlock()
	 * @generated
	 */
	EReference getFlock_EndEvent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.Flock#getFlockScope <em>Flock Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flock Scope</em>'.
	 * @see com.misc.common.moplaf.flock.Flock#getFlockScope()
	 * @see #getFlock()
	 * @generated
	 */
	EReference getFlock_FlockScope();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.FlockEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see com.misc.common.moplaf.flock.FlockEvent
	 * @generated
	 */
	EClass getFlockEvent();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.flock.FlockEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see com.misc.common.moplaf.flock.FlockEvent#getTime()
	 * @see #getFlockEvent()
	 * @generated
	 */
	EAttribute getFlockEvent_Time();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.FlockEvent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see com.misc.common.moplaf.flock.FlockEvent#getLocation()
	 * @see #getFlockEvent()
	 * @generated
	 */
	EReference getFlockEvent_Location();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.flock.FlockEvent#getFlockAsStart <em>Flock As Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flock As Start</em>'.
	 * @see com.misc.common.moplaf.flock.FlockEvent#getFlockAsStart()
	 * @see #getFlockEvent()
	 * @generated
	 */
	EReference getFlockEvent_FlockAsStart();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.flock.FlockEvent#getFlockAsEnd <em>Flock As End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flock As End</em>'.
	 * @see com.misc.common.moplaf.flock.FlockEvent#getFlockAsEnd()
	 * @see #getFlockEvent()
	 * @generated
	 */
	EReference getFlockEvent_FlockAsEnd();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.ChainFlock <em>Chain Flock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Flock</em>'.
	 * @see com.misc.common.moplaf.flock.ChainFlock
	 * @generated
	 */
	EClass getChainFlock();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.flock.ChainFlock#getMountedFlocks <em>Mounted Flocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mounted Flocks</em>'.
	 * @see com.misc.common.moplaf.flock.ChainFlock#getMountedFlocks()
	 * @see #getChainFlock()
	 * @generated
	 */
	EReference getChainFlock_MountedFlocks();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.ChainFlock#getMounterFlock <em>Mounter Flock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mounter Flock</em>'.
	 * @see com.misc.common.moplaf.flock.ChainFlock#getMounterFlock()
	 * @see #getChainFlock()
	 * @generated
	 */
	EReference getChainFlock_MounterFlock();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.ChainFlock#getNextFlock <em>Next Flock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Flock</em>'.
	 * @see com.misc.common.moplaf.flock.ChainFlock#getNextFlock()
	 * @see #getChainFlock()
	 * @generated
	 */
	EReference getChainFlock_NextFlock();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.ChainFlock#getPreviousFlock <em>Previous Flock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Flock</em>'.
	 * @see com.misc.common.moplaf.flock.ChainFlock#getPreviousFlock()
	 * @see #getChainFlock()
	 * @generated
	 */
	EReference getChainFlock_PreviousFlock();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.ChainFlock#getChain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chain</em>'.
	 * @see com.misc.common.moplaf.flock.ChainFlock#getChain()
	 * @see #getChainFlock()
	 * @generated
	 */
	EReference getChainFlock_Chain();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.ChainFlock#getFlock <em>Flock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flock</em>'.
	 * @see com.misc.common.moplaf.flock.ChainFlock#getFlock()
	 * @see #getChainFlock()
	 * @generated
	 */
	EReference getChainFlock_Flock();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.flock.ChainFlock#getSequenceNr <em>Sequence Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Nr</em>'.
	 * @see com.misc.common.moplaf.flock.ChainFlock#getSequenceNr()
	 * @see #getChainFlock()
	 * @generated
	 */
	EAttribute getChainFlock_SequenceNr();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.FlockConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see com.misc.common.moplaf.flock.FlockConfiguration
	 * @generated
	 */
	EClass getFlockConfiguration();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.FlockConfiguration#getConfigurationLocation <em>Configuration Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration Location</em>'.
	 * @see com.misc.common.moplaf.flock.FlockConfiguration#getConfigurationLocation()
	 * @see #getFlockConfiguration()
	 * @generated
	 */
	EReference getFlockConfiguration_ConfigurationLocation();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.FlockConfiguration#getChainOwner <em>Chain Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chain Owner</em>'.
	 * @see com.misc.common.moplaf.flock.FlockConfiguration#getChainOwner()
	 * @see #getFlockConfiguration()
	 * @generated
	 */
	EReference getFlockConfiguration_ChainOwner();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.FlockMove <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see com.misc.common.moplaf.flock.FlockMove
	 * @generated
	 */
	EClass getFlockMove();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.FlockRide <em>Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ride</em>'.
	 * @see com.misc.common.moplaf.flock.FlockRide
	 * @generated
	 */
	EClass getFlockRide();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.FlockRide#getStartRide <em>Start Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Ride</em>'.
	 * @see com.misc.common.moplaf.flock.FlockRide#getStartRide()
	 * @see #getFlockRide()
	 * @generated
	 */
	EReference getFlockRide_StartRide();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.FlockRide#getToRide <em>To Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Ride</em>'.
	 * @see com.misc.common.moplaf.flock.FlockRide#getToRide()
	 * @see #getFlockRide()
	 * @generated
	 */
	EReference getFlockRide_ToRide();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.flock.FlockRide#getChainOwner <em>Chain Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Chain Owner</em>'.
	 * @see com.misc.common.moplaf.flock.FlockRide#getChainOwner()
	 * @see #getFlockRide()
	 * @generated
	 */
	EReference getFlockRide_ChainOwner();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.FlockWayPoint <em>Way Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Way Point</em>'.
	 * @see com.misc.common.moplaf.flock.FlockWayPoint
	 * @generated
	 */
	EClass getFlockWayPoint();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.FlockWayPoint#getWayPointLocation <em>Way Point Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Way Point Location</em>'.
	 * @see com.misc.common.moplaf.flock.FlockWayPoint#getWayPointLocation()
	 * @see #getFlockWayPoint()
	 * @generated
	 */
	EReference getFlockWayPoint_WayPointLocation();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.flock.FlockWayPoint#getChainOwner <em>Chain Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Chain Owner</em>'.
	 * @see com.misc.common.moplaf.flock.FlockWayPoint#getChainOwner()
	 * @see #getFlockWayPoint()
	 * @generated
	 */
	EReference getFlockWayPoint_ChainOwner();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.FlockIdle <em>Idle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Idle</em>'.
	 * @see com.misc.common.moplaf.flock.FlockIdle
	 * @generated
	 */
	EClass getFlockIdle();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.Chain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain</em>'.
	 * @see com.misc.common.moplaf.flock.Chain
	 * @generated
	 */
	EClass getChain();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.flock.Chain#getFlocks <em>Flocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flocks</em>'.
	 * @see com.misc.common.moplaf.flock.Chain#getFlocks()
	 * @see #getChain()
	 * @generated
	 */
	EReference getChain_Flocks();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.Chain#getFlockScope <em>Flock Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flock Scope</em>'.
	 * @see com.misc.common.moplaf.flock.Chain#getFlockScope()
	 * @see #getChain()
	 * @generated
	 */
	EReference getChain_FlockScope();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.flock.Chain#constructMove(com.misc.common.moplaf.flock.Location, com.misc.common.moplaf.flock.Location) <em>Construct Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Move</em>' operation.
	 * @see com.misc.common.moplaf.flock.Chain#constructMove(com.misc.common.moplaf.flock.Location, com.misc.common.moplaf.flock.Location)
	 * @generated
	 */
	EOperation getChain__ConstructMove__Location_Location();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.flock.Chain#refreshChainFlockNextPrevious() <em>Refresh Chain Flock Next Previous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Chain Flock Next Previous</em>' operation.
	 * @see com.misc.common.moplaf.flock.Chain#refreshChainFlockNextPrevious()
	 * @generated
	 */
	EOperation getChain__RefreshChainFlockNextPrevious();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.flock.Chain#refreshInit() <em>Refresh Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Init</em>' operation.
	 * @see com.misc.common.moplaf.flock.Chain#refreshInit()
	 * @generated
	 */
	EOperation getChain__RefreshInit();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.ChainRide <em>Chain Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Ride</em>'.
	 * @see com.misc.common.moplaf.flock.ChainRide
	 * @generated
	 */
	EClass getChainRide();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.flock.ChainRide#getFlockAsOwner <em>Flock As Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flock As Owner</em>'.
	 * @see com.misc.common.moplaf.flock.ChainRide#getFlockAsOwner()
	 * @see #getChainRide()
	 * @generated
	 */
	EReference getChainRide_FlockAsOwner();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.ChainWayPoint <em>Chain Way Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Way Point</em>'.
	 * @see com.misc.common.moplaf.flock.ChainWayPoint
	 * @generated
	 */
	EClass getChainWayPoint();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.flock.ChainWayPoint#getFlockAsOwner <em>Flock As Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flock As Owner</em>'.
	 * @see com.misc.common.moplaf.flock.ChainWayPoint#getFlockAsOwner()
	 * @see #getChainWayPoint()
	 * @generated
	 */
	EReference getChainWayPoint_FlockAsOwner();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.ChainFlockConfiguration <em>Chain Flock Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Flock Configuration</em>'.
	 * @see com.misc.common.moplaf.flock.ChainFlockConfiguration
	 * @generated
	 */
	EClass getChainFlockConfiguration();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.ChainFlockConfiguration#getFlockConfiguration <em>Flock Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flock Configuration</em>'.
	 * @see com.misc.common.moplaf.flock.ChainFlockConfiguration#getFlockConfiguration()
	 * @see #getChainFlockConfiguration()
	 * @generated
	 */
	EReference getChainFlockConfiguration_FlockConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.flock.ChainFlockConfiguration#getMountedChainAsOwner <em>Mounted Chain As Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mounted Chain As Owner</em>'.
	 * @see com.misc.common.moplaf.flock.ChainFlockConfiguration#getMountedChainAsOwner()
	 * @see #getChainFlockConfiguration()
	 * @generated
	 */
	EReference getChainFlockConfiguration_MountedChainAsOwner();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.flock.ChainFlockConfiguration#refreshChainMounted() <em>Refresh Chain Mounted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Chain Mounted</em>' operation.
	 * @see com.misc.common.moplaf.flock.ChainFlockConfiguration#refreshChainMounted()
	 * @generated
	 */
	EOperation getChainFlockConfiguration__RefreshChainMounted();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.ChainConfiguration <em>Chain Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Configuration</em>'.
	 * @see com.misc.common.moplaf.flock.ChainConfiguration
	 * @generated
	 */
	EClass getChainConfiguration();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.ChainConfiguration#getFlockAsOwner <em>Flock As Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flock As Owner</em>'.
	 * @see com.misc.common.moplaf.flock.ChainConfiguration#getFlockAsOwner()
	 * @see #getChainConfiguration()
	 * @generated
	 */
	EReference getChainConfiguration_FlockAsOwner();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.ChainConfiguration#getAttachPoint <em>Attach Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attach Point</em>'.
	 * @see com.misc.common.moplaf.flock.ChainConfiguration#getAttachPoint()
	 * @see #getChainConfiguration()
	 * @generated
	 */
	EReference getChainConfiguration_AttachPoint();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.flock.ChainConfiguration#refreshFlockConfiguration() <em>Refresh Flock Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Flock Configuration</em>' operation.
	 * @see com.misc.common.moplaf.flock.ChainConfiguration#refreshFlockConfiguration()
	 * @generated
	 */
	EOperation getChainConfiguration__RefreshFlockConfiguration();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.ChainMount <em>Chain Mount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Mount</em>'.
	 * @see com.misc.common.moplaf.flock.ChainMount
	 * @generated
	 */
	EClass getChainMount();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.flock.ChainMount#getMountPoint <em>Mount Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mount Point</em>'.
	 * @see com.misc.common.moplaf.flock.ChainMount#getMountPoint()
	 * @see #getChainMount()
	 * @generated
	 */
	EReference getChainMount_MountPoint();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.flock.ChainMounted <em>Chain Mounted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Mounted</em>'.
	 * @see com.misc.common.moplaf.flock.ChainMounted
	 * @generated
	 */
	EClass getChainMounted();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlockFactory getFlockFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.FlockScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.FlockScopeImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlockScope()
		 * @generated
		 */
		EClass FLOCK_SCOPE = eINSTANCE.getFlockScope();

		/**
		 * The meta object literal for the '<em><b>Chains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK_SCOPE__CHAINS = eINSTANCE.getFlockScope_Chains();

		/**
		 * The meta object literal for the '<em><b>Flocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK_SCOPE__FLOCKS = eINSTANCE.getFlockScope_Flocks();

		/**
		 * The meta object literal for the '<em><b>Refresh Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLOCK_SCOPE___REFRESH_CONFIGURATION = eINSTANCE.getFlockScope__RefreshConfiguration();

		/**
		 * The meta object literal for the '<em><b>Refresh Moves</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLOCK_SCOPE___REFRESH_MOVES = eINSTANCE.getFlockScope__RefreshMoves();

		/**
		 * The meta object literal for the '<em><b>Refresh Idles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLOCK_SCOPE___REFRESH_IDLES = eINSTANCE.getFlockScope__RefreshIdles();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.LocationImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.FlockImpl <em>Flock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.FlockImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlock()
		 * @generated
		 */
		EClass FLOCK = eINSTANCE.getFlock();

		/**
		 * The meta object literal for the '<em><b>Chains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK__CHAINS = eINSTANCE.getFlock_Chains();

		/**
		 * The meta object literal for the '<em><b>Chain Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK__CHAIN_ROOT = eINSTANCE.getFlock_ChainRoot();

		/**
		 * The meta object literal for the '<em><b>Duration Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOCK__DURATION_MIN = eINSTANCE.getFlock_DurationMin();

		/**
		 * The meta object literal for the '<em><b>Duration Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOCK__DURATION_MAX = eINSTANCE.getFlock_DurationMax();

		/**
		 * The meta object literal for the '<em><b>Start Earliest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOCK__START_EARLIEST = eINSTANCE.getFlock_StartEarliest();

		/**
		 * The meta object literal for the '<em><b>End Latest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOCK__END_LATEST = eINSTANCE.getFlock_EndLatest();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOCK__START = eINSTANCE.getFlock_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOCK__END = eINSTANCE.getFlock_End();

		/**
		 * The meta object literal for the '<em><b>Start Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK__START_LOCATION = eINSTANCE.getFlock_StartLocation();

		/**
		 * The meta object literal for the '<em><b>End Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK__END_LOCATION = eINSTANCE.getFlock_EndLocation();

		/**
		 * The meta object literal for the '<em><b>Start Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK__START_EVENT = eINSTANCE.getFlock_StartEvent();

		/**
		 * The meta object literal for the '<em><b>End Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK__END_EVENT = eINSTANCE.getFlock_EndEvent();

		/**
		 * The meta object literal for the '<em><b>Flock Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK__FLOCK_SCOPE = eINSTANCE.getFlock_FlockScope();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.FlockEventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.FlockEventImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlockEvent()
		 * @generated
		 */
		EClass FLOCK_EVENT = eINSTANCE.getFlockEvent();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOCK_EVENT__TIME = eINSTANCE.getFlockEvent_Time();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK_EVENT__LOCATION = eINSTANCE.getFlockEvent_Location();

		/**
		 * The meta object literal for the '<em><b>Flock As Start</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK_EVENT__FLOCK_AS_START = eINSTANCE.getFlockEvent_FlockAsStart();

		/**
		 * The meta object literal for the '<em><b>Flock As End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK_EVENT__FLOCK_AS_END = eINSTANCE.getFlockEvent_FlockAsEnd();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.ChainFlockImpl <em>Chain Flock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.ChainFlockImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChainFlock()
		 * @generated
		 */
		EClass CHAIN_FLOCK = eINSTANCE.getChainFlock();

		/**
		 * The meta object literal for the '<em><b>Mounted Flocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_FLOCK__MOUNTED_FLOCKS = eINSTANCE.getChainFlock_MountedFlocks();

		/**
		 * The meta object literal for the '<em><b>Mounter Flock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_FLOCK__MOUNTER_FLOCK = eINSTANCE.getChainFlock_MounterFlock();

		/**
		 * The meta object literal for the '<em><b>Next Flock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_FLOCK__NEXT_FLOCK = eINSTANCE.getChainFlock_NextFlock();

		/**
		 * The meta object literal for the '<em><b>Previous Flock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_FLOCK__PREVIOUS_FLOCK = eINSTANCE.getChainFlock_PreviousFlock();

		/**
		 * The meta object literal for the '<em><b>Chain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_FLOCK__CHAIN = eINSTANCE.getChainFlock_Chain();

		/**
		 * The meta object literal for the '<em><b>Flock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_FLOCK__FLOCK = eINSTANCE.getChainFlock_Flock();

		/**
		 * The meta object literal for the '<em><b>Sequence Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAIN_FLOCK__SEQUENCE_NR = eINSTANCE.getChainFlock_SequenceNr();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.FlockConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.FlockConfigurationImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlockConfiguration()
		 * @generated
		 */
		EClass FLOCK_CONFIGURATION = eINSTANCE.getFlockConfiguration();

		/**
		 * The meta object literal for the '<em><b>Configuration Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK_CONFIGURATION__CONFIGURATION_LOCATION = eINSTANCE.getFlockConfiguration_ConfigurationLocation();

		/**
		 * The meta object literal for the '<em><b>Chain Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK_CONFIGURATION__CHAIN_OWNER = eINSTANCE.getFlockConfiguration_ChainOwner();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.FlockMoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.FlockMoveImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlockMove()
		 * @generated
		 */
		EClass FLOCK_MOVE = eINSTANCE.getFlockMove();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.FlockRideImpl <em>Ride</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.FlockRideImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlockRide()
		 * @generated
		 */
		EClass FLOCK_RIDE = eINSTANCE.getFlockRide();

		/**
		 * The meta object literal for the '<em><b>Start Ride</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK_RIDE__START_RIDE = eINSTANCE.getFlockRide_StartRide();

		/**
		 * The meta object literal for the '<em><b>To Ride</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK_RIDE__TO_RIDE = eINSTANCE.getFlockRide_ToRide();

		/**
		 * The meta object literal for the '<em><b>Chain Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK_RIDE__CHAIN_OWNER = eINSTANCE.getFlockRide_ChainOwner();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.FlockWayPointImpl <em>Way Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.FlockWayPointImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlockWayPoint()
		 * @generated
		 */
		EClass FLOCK_WAY_POINT = eINSTANCE.getFlockWayPoint();

		/**
		 * The meta object literal for the '<em><b>Way Point Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK_WAY_POINT__WAY_POINT_LOCATION = eINSTANCE.getFlockWayPoint_WayPointLocation();

		/**
		 * The meta object literal for the '<em><b>Chain Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK_WAY_POINT__CHAIN_OWNER = eINSTANCE.getFlockWayPoint_ChainOwner();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.FlockIdleImpl <em>Idle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.FlockIdleImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getFlockIdle()
		 * @generated
		 */
		EClass FLOCK_IDLE = eINSTANCE.getFlockIdle();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.ChainImpl <em>Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.ChainImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChain()
		 * @generated
		 */
		EClass CHAIN = eINSTANCE.getChain();

		/**
		 * The meta object literal for the '<em><b>Flocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN__FLOCKS = eINSTANCE.getChain_Flocks();

		/**
		 * The meta object literal for the '<em><b>Flock Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN__FLOCK_SCOPE = eINSTANCE.getChain_FlockScope();

		/**
		 * The meta object literal for the '<em><b>Construct Move</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHAIN___CONSTRUCT_MOVE__LOCATION_LOCATION = eINSTANCE.getChain__ConstructMove__Location_Location();

		/**
		 * The meta object literal for the '<em><b>Refresh Chain Flock Next Previous</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHAIN___REFRESH_CHAIN_FLOCK_NEXT_PREVIOUS = eINSTANCE.getChain__RefreshChainFlockNextPrevious();

		/**
		 * The meta object literal for the '<em><b>Refresh Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHAIN___REFRESH_INIT = eINSTANCE.getChain__RefreshInit();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.ChainRideImpl <em>Chain Ride</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.ChainRideImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChainRide()
		 * @generated
		 */
		EClass CHAIN_RIDE = eINSTANCE.getChainRide();

		/**
		 * The meta object literal for the '<em><b>Flock As Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_RIDE__FLOCK_AS_OWNER = eINSTANCE.getChainRide_FlockAsOwner();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.ChainWayPointImpl <em>Chain Way Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.ChainWayPointImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChainWayPoint()
		 * @generated
		 */
		EClass CHAIN_WAY_POINT = eINSTANCE.getChainWayPoint();

		/**
		 * The meta object literal for the '<em><b>Flock As Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_WAY_POINT__FLOCK_AS_OWNER = eINSTANCE.getChainWayPoint_FlockAsOwner();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.ChainFlockConfigurationImpl <em>Chain Flock Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.ChainFlockConfigurationImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChainFlockConfiguration()
		 * @generated
		 */
		EClass CHAIN_FLOCK_CONFIGURATION = eINSTANCE.getChainFlockConfiguration();

		/**
		 * The meta object literal for the '<em><b>Flock Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_FLOCK_CONFIGURATION__FLOCK_CONFIGURATION = eINSTANCE.getChainFlockConfiguration_FlockConfiguration();

		/**
		 * The meta object literal for the '<em><b>Mounted Chain As Owner</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_FLOCK_CONFIGURATION__MOUNTED_CHAIN_AS_OWNER = eINSTANCE.getChainFlockConfiguration_MountedChainAsOwner();

		/**
		 * The meta object literal for the '<em><b>Refresh Chain Mounted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHAIN_FLOCK_CONFIGURATION___REFRESH_CHAIN_MOUNTED = eINSTANCE.getChainFlockConfiguration__RefreshChainMounted();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.ChainConfigurationImpl <em>Chain Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.ChainConfigurationImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChainConfiguration()
		 * @generated
		 */
		EClass CHAIN_CONFIGURATION = eINSTANCE.getChainConfiguration();

		/**
		 * The meta object literal for the '<em><b>Flock As Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_CONFIGURATION__FLOCK_AS_OWNER = eINSTANCE.getChainConfiguration_FlockAsOwner();

		/**
		 * The meta object literal for the '<em><b>Attach Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_CONFIGURATION__ATTACH_POINT = eINSTANCE.getChainConfiguration_AttachPoint();

		/**
		 * The meta object literal for the '<em><b>Refresh Flock Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHAIN_CONFIGURATION___REFRESH_FLOCK_CONFIGURATION = eINSTANCE.getChainConfiguration__RefreshFlockConfiguration();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.ChainMountImpl <em>Chain Mount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.ChainMountImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChainMount()
		 * @generated
		 */
		EClass CHAIN_MOUNT = eINSTANCE.getChainMount();

		/**
		 * The meta object literal for the '<em><b>Mount Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_MOUNT__MOUNT_POINT = eINSTANCE.getChainMount_MountPoint();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.flock.impl.ChainMountedImpl <em>Chain Mounted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.flock.impl.ChainMountedImpl
		 * @see com.misc.common.moplaf.flock.impl.FlockPackageImpl#getChainMounted()
		 * @generated
		 */
		EClass CHAIN_MOUNTED = eINSTANCE.getChainMounted();

	}

} //FlockPackage
