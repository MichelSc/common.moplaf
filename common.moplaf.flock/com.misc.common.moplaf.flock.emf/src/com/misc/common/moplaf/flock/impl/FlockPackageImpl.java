/**
 */
package com.misc.common.moplaf.flock.impl;

import com.misc.common.moplaf.flock.Chain;
import com.misc.common.moplaf.flock.ChainConfiguration;
import com.misc.common.moplaf.flock.ChainFlock;
import com.misc.common.moplaf.flock.ChainFlockConfiguration;
import com.misc.common.moplaf.flock.ChainMount;
import com.misc.common.moplaf.flock.ChainMounted;
import com.misc.common.moplaf.flock.ChainRide;
import com.misc.common.moplaf.flock.ChainWayPoint;
import com.misc.common.moplaf.flock.Flock;
import com.misc.common.moplaf.flock.FlockConfiguration;
import com.misc.common.moplaf.flock.FlockEvent;
import com.misc.common.moplaf.flock.FlockFactory;
import com.misc.common.moplaf.flock.FlockIdle;
import com.misc.common.moplaf.flock.FlockMove;
import com.misc.common.moplaf.flock.FlockPackage;
import com.misc.common.moplaf.flock.FlockRide;
import com.misc.common.moplaf.flock.FlockScope;
import com.misc.common.moplaf.flock.FlockWayPoint;
import com.misc.common.moplaf.flock.Location;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlockPackageImpl extends EPackageImpl implements FlockPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flockScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flockEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainFlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flockConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flockMoveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flockRideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flockWayPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flockIdleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainRideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainWayPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainFlockConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainMountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainMountedEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.common.moplaf.flock.FlockPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FlockPackageImpl() {
		super(eNS_URI, FlockFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FlockPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FlockPackage init() {
		if (isInited) return (FlockPackage)EPackage.Registry.INSTANCE.getEPackage(FlockPackage.eNS_URI);

		// Obtain or create and register package
		FlockPackageImpl theFlockPackage = (FlockPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FlockPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FlockPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFlockPackage.createPackageContents();

		// Initialize created meta-data
		theFlockPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFlockPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FlockPackage.eNS_URI, theFlockPackage);
		return theFlockPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlockScope() {
		return flockScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlockScope_Chains() {
		return (EReference)flockScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlockScope_Flocks() {
		return (EReference)flockScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFlockScope__RefreshConfiguration() {
		return flockScopeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFlockScope__RefreshMoves() {
		return flockScopeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFlockScope__RefreshIdles() {
		return flockScopeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlock() {
		return flockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlock_Chains() {
		return (EReference)flockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlock_ChainRoot() {
		return (EReference)flockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlock_DurationMin() {
		return (EAttribute)flockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlock_DurationMax() {
		return (EAttribute)flockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlock_StartEarliest() {
		return (EAttribute)flockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlock_EndLatest() {
		return (EAttribute)flockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlock_Start() {
		return (EAttribute)flockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlock_End() {
		return (EAttribute)flockEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlock_StartLocation() {
		return (EReference)flockEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlock_EndLocation() {
		return (EReference)flockEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlock_StartEvent() {
		return (EReference)flockEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlock_EndEvent() {
		return (EReference)flockEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlock_FlockScope() {
		return (EReference)flockEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlockEvent() {
		return flockEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlockEvent_Time() {
		return (EAttribute)flockEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlockEvent_Location() {
		return (EReference)flockEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlockEvent_FlockAsStart() {
		return (EReference)flockEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlockEvent_FlockAsEnd() {
		return (EReference)flockEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainFlock() {
		return chainFlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainFlock_MountedFlocks() {
		return (EReference)chainFlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainFlock_MounterFlock() {
		return (EReference)chainFlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainFlock_NextFlock() {
		return (EReference)chainFlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainFlock_PreviousFlock() {
		return (EReference)chainFlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainFlock_Chain() {
		return (EReference)chainFlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainFlock_Flock() {
		return (EReference)chainFlockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChainFlock_SequenceNr() {
		return (EAttribute)chainFlockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlockConfiguration() {
		return flockConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlockConfiguration_ConfigurationLocation() {
		return (EReference)flockConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlockConfiguration_ChainOwner() {
		return (EReference)flockConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlockMove() {
		return flockMoveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlockRide() {
		return flockRideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlockRide_StartRide() {
		return (EReference)flockRideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlockRide_ToRide() {
		return (EReference)flockRideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlockRide_ChainOwner() {
		return (EReference)flockRideEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlockWayPoint() {
		return flockWayPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlockWayPoint_WayPointLocation() {
		return (EReference)flockWayPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlockWayPoint_ChainOwner() {
		return (EReference)flockWayPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlockIdle() {
		return flockIdleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChain() {
		return chainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChain_Flocks() {
		return (EReference)chainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChain_FlockScope() {
		return (EReference)chainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChain__ConstructMove__Location_Location() {
		return chainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChain__RefreshChainFlockNextPrevious() {
		return chainEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChain__RefreshInit() {
		return chainEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainRide() {
		return chainRideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainRide_FlockAsOwner() {
		return (EReference)chainRideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainWayPoint() {
		return chainWayPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainWayPoint_FlockAsOwner() {
		return (EReference)chainWayPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainFlockConfiguration() {
		return chainFlockConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainFlockConfiguration_FlockConfiguration() {
		return (EReference)chainFlockConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainFlockConfiguration_MountedChainAsOwner() {
		return (EReference)chainFlockConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChainFlockConfiguration__RefreshChainMounted() {
		return chainFlockConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainConfiguration() {
		return chainConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainConfiguration_FlockAsOwner() {
		return (EReference)chainConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainConfiguration_AttachPoint() {
		return (EReference)chainConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChainConfiguration__RefreshFlockConfiguration() {
		return chainConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainMount() {
		return chainMountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainMount_MountPoint() {
		return (EReference)chainMountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainMounted() {
		return chainMountedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockFactory getFlockFactory() {
		return (FlockFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		flockScopeEClass = createEClass(FLOCK_SCOPE);
		createEReference(flockScopeEClass, FLOCK_SCOPE__CHAINS);
		createEReference(flockScopeEClass, FLOCK_SCOPE__FLOCKS);
		createEOperation(flockScopeEClass, FLOCK_SCOPE___REFRESH_CONFIGURATION);
		createEOperation(flockScopeEClass, FLOCK_SCOPE___REFRESH_MOVES);
		createEOperation(flockScopeEClass, FLOCK_SCOPE___REFRESH_IDLES);

		locationEClass = createEClass(LOCATION);

		flockEClass = createEClass(FLOCK);
		createEReference(flockEClass, FLOCK__CHAINS);
		createEReference(flockEClass, FLOCK__CHAIN_ROOT);
		createEAttribute(flockEClass, FLOCK__DURATION_MIN);
		createEAttribute(flockEClass, FLOCK__DURATION_MAX);
		createEAttribute(flockEClass, FLOCK__START_EARLIEST);
		createEAttribute(flockEClass, FLOCK__END_LATEST);
		createEAttribute(flockEClass, FLOCK__START);
		createEAttribute(flockEClass, FLOCK__END);
		createEReference(flockEClass, FLOCK__START_LOCATION);
		createEReference(flockEClass, FLOCK__END_LOCATION);
		createEReference(flockEClass, FLOCK__START_EVENT);
		createEReference(flockEClass, FLOCK__END_EVENT);
		createEReference(flockEClass, FLOCK__FLOCK_SCOPE);

		flockEventEClass = createEClass(FLOCK_EVENT);
		createEAttribute(flockEventEClass, FLOCK_EVENT__TIME);
		createEReference(flockEventEClass, FLOCK_EVENT__LOCATION);
		createEReference(flockEventEClass, FLOCK_EVENT__FLOCK_AS_START);
		createEReference(flockEventEClass, FLOCK_EVENT__FLOCK_AS_END);

		chainFlockEClass = createEClass(CHAIN_FLOCK);
		createEReference(chainFlockEClass, CHAIN_FLOCK__MOUNTED_FLOCKS);
		createEReference(chainFlockEClass, CHAIN_FLOCK__MOUNTER_FLOCK);
		createEReference(chainFlockEClass, CHAIN_FLOCK__NEXT_FLOCK);
		createEReference(chainFlockEClass, CHAIN_FLOCK__PREVIOUS_FLOCK);
		createEReference(chainFlockEClass, CHAIN_FLOCK__CHAIN);
		createEReference(chainFlockEClass, CHAIN_FLOCK__FLOCK);
		createEAttribute(chainFlockEClass, CHAIN_FLOCK__SEQUENCE_NR);

		flockConfigurationEClass = createEClass(FLOCK_CONFIGURATION);
		createEReference(flockConfigurationEClass, FLOCK_CONFIGURATION__CONFIGURATION_LOCATION);
		createEReference(flockConfigurationEClass, FLOCK_CONFIGURATION__CHAIN_OWNER);

		flockMoveEClass = createEClass(FLOCK_MOVE);

		flockRideEClass = createEClass(FLOCK_RIDE);
		createEReference(flockRideEClass, FLOCK_RIDE__START_RIDE);
		createEReference(flockRideEClass, FLOCK_RIDE__TO_RIDE);
		createEReference(flockRideEClass, FLOCK_RIDE__CHAIN_OWNER);

		flockWayPointEClass = createEClass(FLOCK_WAY_POINT);
		createEReference(flockWayPointEClass, FLOCK_WAY_POINT__WAY_POINT_LOCATION);
		createEReference(flockWayPointEClass, FLOCK_WAY_POINT__CHAIN_OWNER);

		flockIdleEClass = createEClass(FLOCK_IDLE);

		chainEClass = createEClass(CHAIN);
		createEReference(chainEClass, CHAIN__FLOCKS);
		createEReference(chainEClass, CHAIN__FLOCK_SCOPE);
		createEOperation(chainEClass, CHAIN___CONSTRUCT_MOVE__LOCATION_LOCATION);
		createEOperation(chainEClass, CHAIN___REFRESH_CHAIN_FLOCK_NEXT_PREVIOUS);
		createEOperation(chainEClass, CHAIN___REFRESH_INIT);

		chainRideEClass = createEClass(CHAIN_RIDE);
		createEReference(chainRideEClass, CHAIN_RIDE__FLOCK_AS_OWNER);

		chainWayPointEClass = createEClass(CHAIN_WAY_POINT);
		createEReference(chainWayPointEClass, CHAIN_WAY_POINT__FLOCK_AS_OWNER);

		chainFlockConfigurationEClass = createEClass(CHAIN_FLOCK_CONFIGURATION);
		createEReference(chainFlockConfigurationEClass, CHAIN_FLOCK_CONFIGURATION__FLOCK_CONFIGURATION);
		createEReference(chainFlockConfigurationEClass, CHAIN_FLOCK_CONFIGURATION__MOUNTED_CHAIN_AS_OWNER);
		createEOperation(chainFlockConfigurationEClass, CHAIN_FLOCK_CONFIGURATION___REFRESH_CHAIN_MOUNTED);

		chainConfigurationEClass = createEClass(CHAIN_CONFIGURATION);
		createEReference(chainConfigurationEClass, CHAIN_CONFIGURATION__FLOCK_AS_OWNER);
		createEReference(chainConfigurationEClass, CHAIN_CONFIGURATION__ATTACH_POINT);
		createEOperation(chainConfigurationEClass, CHAIN_CONFIGURATION___REFRESH_FLOCK_CONFIGURATION);

		chainMountEClass = createEClass(CHAIN_MOUNT);
		createEReference(chainMountEClass, CHAIN_MOUNT__MOUNT_POINT);

		chainMountedEClass = createEClass(CHAIN_MOUNTED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		flockConfigurationEClass.getESuperTypes().add(this.getFlock());
		flockMoveEClass.getESuperTypes().add(this.getFlock());
		flockRideEClass.getESuperTypes().add(this.getFlock());
		flockWayPointEClass.getESuperTypes().add(this.getFlock());
		flockIdleEClass.getESuperTypes().add(this.getFlock());
		chainRideEClass.getESuperTypes().add(this.getChainFlock());
		chainWayPointEClass.getESuperTypes().add(this.getChainFlock());
		chainFlockConfigurationEClass.getESuperTypes().add(this.getChainFlock());
		chainConfigurationEClass.getESuperTypes().add(this.getChainFlockConfiguration());
		chainMountEClass.getESuperTypes().add(this.getChainFlockConfiguration());
		chainMountedEClass.getESuperTypes().add(this.getChainFlockConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(flockScopeEClass, FlockScope.class, "FlockScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlockScope_Chains(), this.getChain(), this.getChain_FlockScope(), "Chains", null, 0, -1, FlockScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlockScope_Flocks(), this.getFlock(), this.getFlock_FlockScope(), "Flocks", null, 0, -1, FlockScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFlockScope__RefreshConfiguration(), null, "refreshConfiguration", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFlockScope__RefreshMoves(), null, "refreshMoves", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFlockScope__RefreshIdles(), null, "refreshIdles", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flockEClass, Flock.class, "Flock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlock_Chains(), this.getChainFlock(), this.getChainFlock_Flock(), "Chains", null, 0, -1, Flock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlock_ChainRoot(), this.getChainFlock(), null, "ChainRoot", null, 0, 1, Flock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlock_DurationMin(), ecorePackage.getEFloat(), "DurationMin", null, 0, 1, Flock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlock_DurationMax(), ecorePackage.getEFloat(), "DurationMax", null, 0, 1, Flock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlock_StartEarliest(), ecorePackage.getEDate(), "StartEarliest", null, 0, 1, Flock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlock_EndLatest(), ecorePackage.getEDate(), "EndLatest", null, 0, 1, Flock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlock_Start(), ecorePackage.getEDate(), "Start", null, 0, 1, Flock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlock_End(), ecorePackage.getEDate(), "End", null, 0, 1, Flock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlock_StartLocation(), this.getLocation(), null, "StartLocation", null, 0, 1, Flock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlock_EndLocation(), this.getLocation(), null, "EndLocation", null, 0, 1, Flock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlock_StartEvent(), this.getFlockEvent(), this.getFlockEvent_FlockAsStart(), "StartEvent", null, 1, 1, Flock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlock_EndEvent(), this.getFlockEvent(), this.getFlockEvent_FlockAsEnd(), "EndEvent", null, 1, 1, Flock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlock_FlockScope(), this.getFlockScope(), this.getFlockScope_Flocks(), "FlockScope", null, 1, 1, Flock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flockEventEClass, FlockEvent.class, "FlockEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlockEvent_Time(), ecorePackage.getEDate(), "Time", null, 0, 1, FlockEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlockEvent_Location(), this.getLocation(), null, "Location", null, 0, 1, FlockEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlockEvent_FlockAsStart(), this.getFlock(), this.getFlock_StartEvent(), "FlockAsStart", null, 0, -1, FlockEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlockEvent_FlockAsEnd(), this.getFlock(), this.getFlock_EndEvent(), "FlockAsEnd", null, 0, -1, FlockEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chainFlockEClass, ChainFlock.class, "ChainFlock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChainFlock_MountedFlocks(), this.getChainFlock(), this.getChainFlock_MounterFlock(), "MountedFlocks", null, 0, -1, ChainFlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainFlock_MounterFlock(), this.getChainFlock(), this.getChainFlock_MountedFlocks(), "MounterFlock", null, 0, 1, ChainFlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainFlock_NextFlock(), this.getChainFlock(), this.getChainFlock_PreviousFlock(), "NextFlock", null, 0, 1, ChainFlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainFlock_PreviousFlock(), this.getChainFlock(), this.getChainFlock_NextFlock(), "PreviousFlock", null, 0, 1, ChainFlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainFlock_Chain(), this.getChain(), this.getChain_Flocks(), "Chain", null, 0, 1, ChainFlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainFlock_Flock(), this.getFlock(), this.getFlock_Chains(), "Flock", null, 0, 1, ChainFlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChainFlock_SequenceNr(), ecorePackage.getEInt(), "SequenceNr", null, 0, 1, ChainFlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flockConfigurationEClass, FlockConfiguration.class, "FlockConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlockConfiguration_ConfigurationLocation(), this.getLocation(), null, "ConfigurationLocation", null, 0, 1, FlockConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlockConfiguration_ChainOwner(), this.getChainConfiguration(), this.getChainConfiguration_FlockAsOwner(), "ChainOwner", null, 0, 1, FlockConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flockMoveEClass, FlockMove.class, "FlockMove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flockRideEClass, FlockRide.class, "FlockRide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlockRide_StartRide(), this.getLocation(), null, "StartRide", null, 1, 1, FlockRide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlockRide_ToRide(), this.getLocation(), null, "ToRide", null, 1, 1, FlockRide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlockRide_ChainOwner(), this.getChainRide(), this.getChainRide_FlockAsOwner(), "ChainOwner", null, 0, 1, FlockRide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flockWayPointEClass, FlockWayPoint.class, "FlockWayPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlockWayPoint_WayPointLocation(), this.getLocation(), null, "WayPointLocation", null, 0, 1, FlockWayPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlockWayPoint_ChainOwner(), this.getChainWayPoint(), this.getChainWayPoint_FlockAsOwner(), "ChainOwner", null, 0, 1, FlockWayPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flockIdleEClass, FlockIdle.class, "FlockIdle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chainEClass, Chain.class, "Chain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChain_Flocks(), this.getChainFlock(), this.getChainFlock_Chain(), "Flocks", null, 0, -1, Chain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChain_FlockScope(), this.getFlockScope(), this.getFlockScope_Chains(), "FlockScope", null, 1, 1, Chain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getChain__ConstructMove__Location_Location(), null, "constructMove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocation(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocation(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getChain__RefreshChainFlockNextPrevious(), null, "refreshChainFlockNextPrevious", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getChain__RefreshInit(), null, "refreshInit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(chainRideEClass, ChainRide.class, "ChainRide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChainRide_FlockAsOwner(), this.getFlockRide(), this.getFlockRide_ChainOwner(), "FlockAsOwner", null, 1, 1, ChainRide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chainWayPointEClass, ChainWayPoint.class, "ChainWayPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChainWayPoint_FlockAsOwner(), this.getFlockWayPoint(), this.getFlockWayPoint_ChainOwner(), "FlockAsOwner", null, 0, 1, ChainWayPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chainFlockConfigurationEClass, ChainFlockConfiguration.class, "ChainFlockConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChainFlockConfiguration_FlockConfiguration(), this.getFlockConfiguration(), null, "FlockConfiguration", null, 1, 1, ChainFlockConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainFlockConfiguration_MountedChainAsOwner(), this.getChainMounted(), null, "MountedChainAsOwner", null, 0, -1, ChainFlockConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getChainFlockConfiguration__RefreshChainMounted(), null, "refreshChainMounted", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(chainConfigurationEClass, ChainConfiguration.class, "ChainConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChainConfiguration_FlockAsOwner(), this.getFlockConfiguration(), this.getFlockConfiguration_ChainOwner(), "FlockAsOwner", null, 1, 1, ChainConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainConfiguration_AttachPoint(), this.getChainConfiguration(), null, "AttachPoint", null, 0, 1, ChainConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getChainConfiguration__RefreshFlockConfiguration(), null, "refreshFlockConfiguration", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(chainMountEClass, ChainMount.class, "ChainMount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChainMount_MountPoint(), this.getChainConfiguration(), null, "MountPoint", null, 1, 1, ChainMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chainMountedEClass, ChainMounted.class, "ChainMounted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FlockPackageImpl
