/**
 */
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAmountAbsolute;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAtomicAmountAbsolute;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAtomicMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAmountImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAtomicAmountImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAtomicMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeEndAmountImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeEndMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeStartAmountImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeStartMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionChildEvents;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionInitialization;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEndEventMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmount;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountBefore;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventDescription;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlope;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeBefore;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventsProviderRefreshEvents;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteAtomicMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteSlopeAbsolute;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionAtomicMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionAtomicSlopeImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionSlopeImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeEndMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeEndSlopeImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartSlopeImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionDescriptions;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes;
import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcFactory;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeContinuousCalcPackageImpl extends EPackageImpl implements TimeContinuousCalcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcAmountAbsoluteAmountAbsoluteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcAmountAbsoluteAmountAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcAmountAbsoluteAtomicAmountAbsoluteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcAmountAbsoluteAtomicMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcAmountImpulsionAmountAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcAmountImpulsionAmountImpulsionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcAmountImpulsionAtomicAmountImpulsionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcAmountImpulsionAtomicMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcCapacityChangeEndAmountImpulsionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcCapacityChangeEndMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcCapacityChangeStartAmountImpulsionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcCapacityChangeStartMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcChildEventAmountAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcChildEventMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcChildEventSlopeAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcDistributionChildEventsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcDistributionInitializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcDistributionProvidedEventsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcDistributionSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcEndEventMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcEventAmountAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcEventAmountBeforeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcEventDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcEventMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcEventSlopeAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcEventSlopeBeforeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcEventsProviderRefreshEventsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcSlopeAbsoluteAtomicMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcSlopeAbsoluteSlopeAbsoluteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcSlopeAbsoluteSlopeAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcSlopeImpulsionAtomicMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcSlopeImpulsionAtomicSlopeImpulsionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcSlopeImpulsionSlopeAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcSlopeImpulsionSlopeImpulsionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcStartEventAmountAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcStartEventMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcStartEventSlopeAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcStockChangeEndMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcStockChangeEndSlopeImpulsionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcStockChangeStartMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcStockChangeStartSlopeImpulsionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcEventSlopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcEventAmountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorLayerCompositeEventRefreshEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorLayerDistributionAmountsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorLayerDistributionDescriptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorLayerDistributionSlopesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorScopeDistributionEClass = null;

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
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimeContinuousCalcPackageImpl() {
		super(eNS_URI, TimeContinuousCalcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TimeContinuousCalcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimeContinuousCalcPackage init() {
		if (isInited) return (TimeContinuousCalcPackage)EPackage.Registry.INSTANCE.getEPackage(TimeContinuousCalcPackage.eNS_URI);

		// Obtain or create and register package
		TimeContinuousCalcPackageImpl theTimeContinuousCalcPackage = (TimeContinuousCalcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TimeContinuousCalcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TimeContinuousCalcPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TimeContinuousPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTimeContinuousCalcPackage.createPackageContents();

		// Initialize created meta-data
		theTimeContinuousCalcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimeContinuousCalcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimeContinuousCalcPackage.eNS_URI, theTimeContinuousCalcPackage);
		return theTimeContinuousCalcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcAmountAbsoluteAmountAbsolute() {
		return propagatorCalcAmountAbsoluteAmountAbsoluteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcAmountAbsoluteAmountAfter() {
		return propagatorCalcAmountAbsoluteAmountAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcAmountAbsoluteAtomicAmountAbsolute() {
		return propagatorCalcAmountAbsoluteAtomicAmountAbsoluteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcAmountAbsoluteAtomicMoment() {
		return propagatorCalcAmountAbsoluteAtomicMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcAmountImpulsionAmountAfter() {
		return propagatorCalcAmountImpulsionAmountAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcAmountImpulsionAmountImpulsion() {
		return propagatorCalcAmountImpulsionAmountImpulsionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcAmountImpulsionAtomicAmountImpulsion() {
		return propagatorCalcAmountImpulsionAtomicAmountImpulsionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcAmountImpulsionAtomicMoment() {
		return propagatorCalcAmountImpulsionAtomicMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcCapacityChangeEndAmountImpulsion() {
		return propagatorCalcCapacityChangeEndAmountImpulsionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcCapacityChangeEndMoment() {
		return propagatorCalcCapacityChangeEndMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcCapacityChangeStartAmountImpulsion() {
		return propagatorCalcCapacityChangeStartAmountImpulsionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcCapacityChangeStartMoment() {
		return propagatorCalcCapacityChangeStartMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcChildEventAmountAfter() {
		return propagatorCalcChildEventAmountAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcChildEventMoment() {
		return propagatorCalcChildEventMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcChildEventSlopeAfter() {
		return propagatorCalcChildEventSlopeAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcDistributionChildEvents() {
		return propagatorCalcDistributionChildEventsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorCalcDistributionChildEvents_ConcreteParent() {
		return (EReference)propagatorCalcDistributionChildEventsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcDistributionInitialization() {
		return propagatorCalcDistributionInitializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorCalcDistributionInitialization_ConcreteParent() {
		return (EReference)propagatorCalcDistributionInitializationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcDistributionProvidedEvents() {
		return propagatorCalcDistributionProvidedEventsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorCalcDistributionProvidedEvents_ConcreteParent() {
		return (EReference)propagatorCalcDistributionProvidedEventsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorCalcDistributionProvidedEvents_AntecedentLayerCompositeeventRefresh() {
		return (EReference)propagatorCalcDistributionProvidedEventsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorCalcDistributionProvidedEvents_AntecedentCalcDistributionchildEvents() {
		return (EReference)propagatorCalcDistributionProvidedEventsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcDistributionSequence() {
		return propagatorCalcDistributionSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorCalcDistributionSequence_ConcreteParent() {
		return (EReference)propagatorCalcDistributionSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorCalcDistributionSequence_AntecedentCalcDistributionProvidedEvents() {
		return (EReference)propagatorCalcDistributionSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcEndEventMoment() {
		return propagatorCalcEndEventMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcEventAmountAfter() {
		return propagatorCalcEventAmountAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcEventAmountBefore() {
		return propagatorCalcEventAmountBeforeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcEventDescription() {
		return propagatorCalcEventDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcEventMoment() {
		return propagatorCalcEventMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorCalcEventMoment_ConcreteParent() {
		return (EReference)propagatorCalcEventMomentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcEventSlopeAfter() {
		return propagatorCalcEventSlopeAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcEventSlopeBefore() {
		return propagatorCalcEventSlopeBeforeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcEventsProviderRefreshEvents() {
		return propagatorCalcEventsProviderRefreshEventsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorCalcEventsProviderRefreshEvents_ConcreteParent() {
		return (EReference)propagatorCalcEventsProviderRefreshEventsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcSlopeAbsoluteAtomicMoment() {
		return propagatorCalcSlopeAbsoluteAtomicMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute() {
		return propagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcSlopeAbsoluteSlopeAbsolute() {
		return propagatorCalcSlopeAbsoluteSlopeAbsoluteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcSlopeAbsoluteSlopeAfter() {
		return propagatorCalcSlopeAbsoluteSlopeAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcSlopeImpulsionAtomicMoment() {
		return propagatorCalcSlopeImpulsionAtomicMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcSlopeImpulsionAtomicSlopeImpulsion() {
		return propagatorCalcSlopeImpulsionAtomicSlopeImpulsionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcSlopeImpulsionSlopeAfter() {
		return propagatorCalcSlopeImpulsionSlopeAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcSlopeImpulsionSlopeImpulsion() {
		return propagatorCalcSlopeImpulsionSlopeImpulsionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcStartEventAmountAfter() {
		return propagatorCalcStartEventAmountAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcStartEventMoment() {
		return propagatorCalcStartEventMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcStartEventSlopeAfter() {
		return propagatorCalcStartEventSlopeAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcStockChangeEndMoment() {
		return propagatorCalcStockChangeEndMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcStockChangeEndSlopeImpulsion() {
		return propagatorCalcStockChangeEndSlopeImpulsionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcStockChangeStartMoment() {
		return propagatorCalcStockChangeStartMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcStockChangeStartSlopeImpulsion() {
		return propagatorCalcStockChangeStartSlopeImpulsionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcEventSlope() {
		return propagatorCalcEventSlopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorCalcEventSlope_ConcreteParent() {
		return (EReference)propagatorCalcEventSlopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcEventAmount() {
		return propagatorCalcEventAmountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorCalcEventAmount_ConcreteParent() {
		return (EReference)propagatorCalcEventAmountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorLayerCompositeEventRefresh() {
		return propagatorLayerCompositeEventRefreshEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorLayerCompositeEventRefresh_ConcreteParent() {
		return (EReference)propagatorLayerCompositeEventRefreshEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorLayerCompositeEventRefresh_AntecedenCalcDistributionInitialization() {
		return (EReference)propagatorLayerCompositeEventRefreshEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorLayerDistributionAmounts() {
		return propagatorLayerDistributionAmountsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorLayerDistributionAmounts_ConcreteParent() {
		return (EReference)propagatorLayerDistributionAmountsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorLayerDistributionAmounts_AntecedentLayerDistributionSlopes() {
		return (EReference)propagatorLayerDistributionAmountsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorLayerDistributionDescriptions() {
		return propagatorLayerDistributionDescriptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorLayerDistributionDescriptions_ConcreteParent() {
		return (EReference)propagatorLayerDistributionDescriptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorLayerDistributionDescriptions_AntecedentLayerDistributionAmounts() {
		return (EReference)propagatorLayerDistributionDescriptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorLayerDistributionSlopes() {
		return propagatorLayerDistributionSlopesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorLayerDistributionSlopes_ConcreteParent() {
		return (EReference)propagatorLayerDistributionSlopesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorLayerDistributionSlopes_AntecedentCalcDistributionSequence() {
		return (EReference)propagatorLayerDistributionSlopesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorScopeDistribution() {
		return propagatorScopeDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeContinuousCalcFactory getTimeContinuousCalcFactory() {
		return (TimeContinuousCalcFactory)getEFactoryInstance();
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
		propagatorScopeDistributionEClass = createEClass(PROPAGATOR_SCOPE_DISTRIBUTION);

		propagatorCalcDistributionInitializationEClass = createEClass(PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION);
		createEReference(propagatorCalcDistributionInitializationEClass, PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__CONCRETE_PARENT);

		propagatorLayerCompositeEventRefreshEClass = createEClass(PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH);
		createEReference(propagatorLayerCompositeEventRefreshEClass, PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT);
		createEReference(propagatorLayerCompositeEventRefreshEClass, PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION);

		propagatorCalcDistributionChildEventsEClass = createEClass(PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS);
		createEReference(propagatorCalcDistributionChildEventsEClass, PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__CONCRETE_PARENT);

		propagatorCalcDistributionProvidedEventsEClass = createEClass(PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS);
		createEReference(propagatorCalcDistributionProvidedEventsEClass, PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__CONCRETE_PARENT);
		createEReference(propagatorCalcDistributionProvidedEventsEClass, PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_LAYER_COMPOSITEEVENT_REFRESH);
		createEReference(propagatorCalcDistributionProvidedEventsEClass, PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_CALC_DISTRIBUTIONCHILD_EVENTS);

		propagatorCalcDistributionSequenceEClass = createEClass(PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE);
		createEReference(propagatorCalcDistributionSequenceEClass, PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__CONCRETE_PARENT);
		createEReference(propagatorCalcDistributionSequenceEClass, PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__ANTECEDENT_CALC_DISTRIBUTION_PROVIDED_EVENTS);

		propagatorLayerDistributionSlopesEClass = createEClass(PROPAGATOR_LAYER_DISTRIBUTION_SLOPES);
		createEReference(propagatorLayerDistributionSlopesEClass, PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__CONCRETE_PARENT);
		createEReference(propagatorLayerDistributionSlopesEClass, PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__ANTECEDENT_CALC_DISTRIBUTION_SEQUENCE);

		propagatorLayerDistributionAmountsEClass = createEClass(PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS);
		createEReference(propagatorLayerDistributionAmountsEClass, PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__CONCRETE_PARENT);
		createEReference(propagatorLayerDistributionAmountsEClass, PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENT_LAYER_DISTRIBUTION_SLOPES);

		propagatorLayerDistributionDescriptionsEClass = createEClass(PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS);
		createEReference(propagatorLayerDistributionDescriptionsEClass, PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS__CONCRETE_PARENT);
		createEReference(propagatorLayerDistributionDescriptionsEClass, PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS__ANTECEDENT_LAYER_DISTRIBUTION_AMOUNTS);

		propagatorCalcAmountAbsoluteAmountAbsoluteEClass = createEClass(PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE);

		propagatorCalcAmountAbsoluteAmountAfterEClass = createEClass(PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER);

		propagatorCalcAmountAbsoluteAtomicAmountAbsoluteEClass = createEClass(PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE);

		propagatorCalcAmountAbsoluteAtomicMomentEClass = createEClass(PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT);

		propagatorCalcAmountImpulsionAmountAfterEClass = createEClass(PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER);

		propagatorCalcAmountImpulsionAmountImpulsionEClass = createEClass(PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION);

		propagatorCalcAmountImpulsionAtomicAmountImpulsionEClass = createEClass(PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION);

		propagatorCalcAmountImpulsionAtomicMomentEClass = createEClass(PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT);

		propagatorCalcCapacityChangeEndAmountImpulsionEClass = createEClass(PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION);

		propagatorCalcCapacityChangeEndMomentEClass = createEClass(PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT);

		propagatorCalcCapacityChangeStartAmountImpulsionEClass = createEClass(PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION);

		propagatorCalcCapacityChangeStartMomentEClass = createEClass(PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT);

		propagatorCalcChildEventAmountAfterEClass = createEClass(PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER);

		propagatorCalcChildEventMomentEClass = createEClass(PROPAGATOR_CALC_CHILD_EVENT_MOMENT);

		propagatorCalcChildEventSlopeAfterEClass = createEClass(PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER);

		propagatorCalcEndEventMomentEClass = createEClass(PROPAGATOR_CALC_END_EVENT_MOMENT);

		propagatorCalcEventAmountAfterEClass = createEClass(PROPAGATOR_CALC_EVENT_AMOUNT_AFTER);

		propagatorCalcEventAmountBeforeEClass = createEClass(PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE);

		propagatorCalcEventDescriptionEClass = createEClass(PROPAGATOR_CALC_EVENT_DESCRIPTION);

		propagatorCalcEventMomentEClass = createEClass(PROPAGATOR_CALC_EVENT_MOMENT);
		createEReference(propagatorCalcEventMomentEClass, PROPAGATOR_CALC_EVENT_MOMENT__CONCRETE_PARENT);

		propagatorCalcEventSlopeAfterEClass = createEClass(PROPAGATOR_CALC_EVENT_SLOPE_AFTER);

		propagatorCalcEventSlopeBeforeEClass = createEClass(PROPAGATOR_CALC_EVENT_SLOPE_BEFORE);

		propagatorCalcEventsProviderRefreshEventsEClass = createEClass(PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS);
		createEReference(propagatorCalcEventsProviderRefreshEventsEClass, PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__CONCRETE_PARENT);

		propagatorCalcSlopeAbsoluteAtomicMomentEClass = createEClass(PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT);

		propagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteEClass = createEClass(PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE);

		propagatorCalcSlopeAbsoluteSlopeAbsoluteEClass = createEClass(PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE);

		propagatorCalcSlopeAbsoluteSlopeAfterEClass = createEClass(PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER);

		propagatorCalcSlopeImpulsionAtomicMomentEClass = createEClass(PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT);

		propagatorCalcSlopeImpulsionAtomicSlopeImpulsionEClass = createEClass(PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION);

		propagatorCalcSlopeImpulsionSlopeAfterEClass = createEClass(PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER);

		propagatorCalcSlopeImpulsionSlopeImpulsionEClass = createEClass(PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION);

		propagatorCalcStartEventAmountAfterEClass = createEClass(PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER);

		propagatorCalcStartEventMomentEClass = createEClass(PROPAGATOR_CALC_START_EVENT_MOMENT);

		propagatorCalcStartEventSlopeAfterEClass = createEClass(PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER);

		propagatorCalcStockChangeEndMomentEClass = createEClass(PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT);

		propagatorCalcStockChangeEndSlopeImpulsionEClass = createEClass(PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION);

		propagatorCalcStockChangeStartMomentEClass = createEClass(PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT);

		propagatorCalcStockChangeStartSlopeImpulsionEClass = createEClass(PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION);

		propagatorCalcEventSlopeEClass = createEClass(PROPAGATOR_CALC_EVENT_SLOPE);
		createEReference(propagatorCalcEventSlopeEClass, PROPAGATOR_CALC_EVENT_SLOPE__CONCRETE_PARENT);

		propagatorCalcEventAmountEClass = createEClass(PROPAGATOR_CALC_EVENT_AMOUNT);
		createEReference(propagatorCalcEventAmountEClass, PROPAGATOR_CALC_EVENT_AMOUNT__CONCRETE_PARENT);
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

		// Obtain other dependent packages
		TimeContinuousPackage theTimeContinuousPackage = (TimeContinuousPackage)EPackage.Registry.INSTANCE.getEPackage(TimeContinuousPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		propagatorScopeDistributionEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		propagatorCalcDistributionInitializationEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		propagatorLayerCompositeEventRefreshEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		propagatorCalcDistributionChildEventsEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		propagatorCalcDistributionProvidedEventsEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		propagatorCalcDistributionSequenceEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		propagatorLayerDistributionSlopesEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		propagatorLayerDistributionAmountsEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		propagatorLayerDistributionDescriptionsEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		propagatorCalcAmountAbsoluteAmountAbsoluteEClass.getESuperTypes().add(this.getPropagatorCalcEventAmount());
		propagatorCalcAmountAbsoluteAmountAfterEClass.getESuperTypes().add(this.getPropagatorCalcEventAmountAfter());
		propagatorCalcAmountAbsoluteAtomicAmountAbsoluteEClass.getESuperTypes().add(this.getPropagatorCalcAmountAbsoluteAmountAbsolute());
		propagatorCalcAmountAbsoluteAtomicMomentEClass.getESuperTypes().add(this.getPropagatorCalcEventMoment());
		propagatorCalcAmountImpulsionAmountAfterEClass.getESuperTypes().add(this.getPropagatorCalcEventAmountAfter());
		propagatorCalcAmountImpulsionAmountImpulsionEClass.getESuperTypes().add(this.getPropagatorCalcEventAmount());
		propagatorCalcAmountImpulsionAtomicAmountImpulsionEClass.getESuperTypes().add(this.getPropagatorCalcAmountImpulsionAmountImpulsion());
		propagatorCalcAmountImpulsionAtomicMomentEClass.getESuperTypes().add(this.getPropagatorCalcEventMoment());
		propagatorCalcCapacityChangeEndAmountImpulsionEClass.getESuperTypes().add(this.getPropagatorCalcAmountImpulsionAmountImpulsion());
		propagatorCalcCapacityChangeEndMomentEClass.getESuperTypes().add(this.getPropagatorCalcEventMoment());
		propagatorCalcCapacityChangeStartAmountImpulsionEClass.getESuperTypes().add(this.getPropagatorCalcAmountImpulsionAmountImpulsion());
		propagatorCalcCapacityChangeStartMomentEClass.getESuperTypes().add(this.getPropagatorCalcEventMoment());
		propagatorCalcChildEventAmountAfterEClass.getESuperTypes().add(this.getPropagatorCalcEventAmountAfter());
		propagatorCalcChildEventMomentEClass.getESuperTypes().add(this.getPropagatorCalcEventMoment());
		propagatorCalcChildEventSlopeAfterEClass.getESuperTypes().add(this.getPropagatorCalcEventSlopeAfter());
		propagatorCalcEndEventMomentEClass.getESuperTypes().add(this.getPropagatorCalcEventMoment());
		propagatorCalcEventAmountAfterEClass.getESuperTypes().add(this.getPropagatorCalcEventAmount());
		propagatorCalcEventAmountBeforeEClass.getESuperTypes().add(this.getPropagatorCalcEventAmount());
		propagatorCalcEventDescriptionEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistributionEvent());
		propagatorCalcEventMomentEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistributionEvent());
		propagatorCalcEventSlopeAfterEClass.getESuperTypes().add(this.getPropagatorCalcEventSlope());
		propagatorCalcEventSlopeBeforeEClass.getESuperTypes().add(this.getPropagatorCalcEventSlope());
		propagatorCalcEventsProviderRefreshEventsEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionEventsProvider());
		propagatorCalcSlopeAbsoluteAtomicMomentEClass.getESuperTypes().add(this.getPropagatorCalcEventMoment());
		propagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteEClass.getESuperTypes().add(this.getPropagatorCalcSlopeAbsoluteSlopeAbsolute());
		propagatorCalcSlopeAbsoluteSlopeAbsoluteEClass.getESuperTypes().add(this.getPropagatorCalcEventSlope());
		propagatorCalcSlopeAbsoluteSlopeAfterEClass.getESuperTypes().add(this.getPropagatorCalcEventSlopeAfter());
		propagatorCalcSlopeImpulsionAtomicMomentEClass.getESuperTypes().add(this.getPropagatorCalcEventMoment());
		propagatorCalcSlopeImpulsionAtomicSlopeImpulsionEClass.getESuperTypes().add(this.getPropagatorCalcSlopeImpulsionSlopeImpulsion());
		propagatorCalcSlopeImpulsionSlopeAfterEClass.getESuperTypes().add(this.getPropagatorCalcEventSlopeAfter());
		propagatorCalcSlopeImpulsionSlopeImpulsionEClass.getESuperTypes().add(this.getPropagatorCalcEventSlope());
		propagatorCalcStartEventAmountAfterEClass.getESuperTypes().add(this.getPropagatorCalcEventAmountAfter());
		propagatorCalcStartEventMomentEClass.getESuperTypes().add(this.getPropagatorCalcEventMoment());
		propagatorCalcStartEventSlopeAfterEClass.getESuperTypes().add(this.getPropagatorCalcEventSlopeAfter());
		propagatorCalcStockChangeEndMomentEClass.getESuperTypes().add(this.getPropagatorCalcEventMoment());
		propagatorCalcStockChangeEndSlopeImpulsionEClass.getESuperTypes().add(this.getPropagatorCalcSlopeImpulsionSlopeImpulsion());
		propagatorCalcStockChangeStartMomentEClass.getESuperTypes().add(this.getPropagatorCalcEventMoment());
		propagatorCalcStockChangeStartSlopeImpulsionEClass.getESuperTypes().add(this.getPropagatorCalcSlopeImpulsionSlopeImpulsion());
		propagatorCalcEventSlopeEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistributionEvent());
		propagatorCalcEventAmountEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistributionEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(propagatorScopeDistributionEClass, PropagatorScopeDistribution.class, "PropagatorScopeDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcDistributionInitializationEClass, PropagatorCalcDistributionInitialization.class, "PropagatorCalcDistributionInitialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorCalcDistributionInitialization_ConcreteParent(), this.getPropagatorScopeDistribution(), null, "ConcreteParent", null, 0, 1, PropagatorCalcDistributionInitialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagatorLayerCompositeEventRefreshEClass, PropagatorLayerCompositeEventRefresh.class, "PropagatorLayerCompositeEventRefresh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorLayerCompositeEventRefresh_ConcreteParent(), this.getPropagatorScopeDistribution(), null, "ConcreteParent", null, 0, 1, PropagatorLayerCompositeEventRefresh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagatorLayerCompositeEventRefresh_AntecedenCalcDistributionInitialization(), this.getPropagatorCalcDistributionInitialization(), null, "AntecedenCalcDistributionInitialization", null, 0, 1, PropagatorLayerCompositeEventRefresh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagatorCalcDistributionChildEventsEClass, PropagatorCalcDistributionChildEvents.class, "PropagatorCalcDistributionChildEvents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorCalcDistributionChildEvents_ConcreteParent(), this.getPropagatorScopeDistribution(), null, "ConcreteParent", null, 0, 1, PropagatorCalcDistributionChildEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagatorCalcDistributionProvidedEventsEClass, PropagatorCalcDistributionProvidedEvents.class, "PropagatorCalcDistributionProvidedEvents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorCalcDistributionProvidedEvents_ConcreteParent(), this.getPropagatorScopeDistribution(), null, "ConcreteParent", null, 0, 1, PropagatorCalcDistributionProvidedEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagatorCalcDistributionProvidedEvents_AntecedentLayerCompositeeventRefresh(), this.getPropagatorLayerCompositeEventRefresh(), null, "AntecedentLayerCompositeeventRefresh", null, 0, 1, PropagatorCalcDistributionProvidedEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagatorCalcDistributionProvidedEvents_AntecedentCalcDistributionchildEvents(), this.getPropagatorCalcDistributionChildEvents(), null, "AntecedentCalcDistributionchildEvents", null, 0, 1, PropagatorCalcDistributionProvidedEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagatorCalcDistributionSequenceEClass, PropagatorCalcDistributionSequence.class, "PropagatorCalcDistributionSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorCalcDistributionSequence_ConcreteParent(), this.getPropagatorScopeDistribution(), null, "ConcreteParent", null, 0, 1, PropagatorCalcDistributionSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagatorCalcDistributionSequence_AntecedentCalcDistributionProvidedEvents(), this.getPropagatorCalcDistributionProvidedEvents(), null, "AntecedentCalcDistributionProvidedEvents", null, 0, 1, PropagatorCalcDistributionSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagatorLayerDistributionSlopesEClass, PropagatorLayerDistributionSlopes.class, "PropagatorLayerDistributionSlopes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorLayerDistributionSlopes_ConcreteParent(), this.getPropagatorScopeDistribution(), null, "ConcreteParent", null, 0, 1, PropagatorLayerDistributionSlopes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagatorLayerDistributionSlopes_AntecedentCalcDistributionSequence(), this.getPropagatorCalcDistributionSequence(), null, "AntecedentCalcDistributionSequence", null, 0, 1, PropagatorLayerDistributionSlopes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagatorLayerDistributionAmountsEClass, PropagatorLayerDistributionAmounts.class, "PropagatorLayerDistributionAmounts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorLayerDistributionAmounts_ConcreteParent(), this.getPropagatorScopeDistribution(), null, "ConcreteParent", null, 0, 1, PropagatorLayerDistributionAmounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagatorLayerDistributionAmounts_AntecedentLayerDistributionSlopes(), this.getPropagatorLayerDistributionSlopes(), null, "AntecedentLayerDistributionSlopes", null, 0, 1, PropagatorLayerDistributionAmounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagatorLayerDistributionDescriptionsEClass, PropagatorLayerDistributionDescriptions.class, "PropagatorLayerDistributionDescriptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorLayerDistributionDescriptions_ConcreteParent(), this.getPropagatorScopeDistribution(), null, "ConcreteParent", null, 0, 1, PropagatorLayerDistributionDescriptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropagatorLayerDistributionDescriptions_AntecedentLayerDistributionAmounts(), this.getPropagatorLayerDistributionAmounts(), null, "AntecedentLayerDistributionAmounts", null, 0, 1, PropagatorLayerDistributionDescriptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propagatorCalcAmountAbsoluteAmountAbsoluteEClass, PropagatorCalcAmountAbsoluteAmountAbsolute.class, "PropagatorCalcAmountAbsoluteAmountAbsolute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcAmountAbsoluteAmountAfterEClass, PropagatorCalcAmountAbsoluteAmountAfter.class, "PropagatorCalcAmountAbsoluteAmountAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcAmountAbsoluteAtomicAmountAbsoluteEClass, PropagatorCalcAmountAbsoluteAtomicAmountAbsolute.class, "PropagatorCalcAmountAbsoluteAtomicAmountAbsolute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcAmountAbsoluteAtomicMomentEClass, PropagatorCalcAmountAbsoluteAtomicMoment.class, "PropagatorCalcAmountAbsoluteAtomicMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcAmountImpulsionAmountAfterEClass, PropagatorCalcAmountImpulsionAmountAfter.class, "PropagatorCalcAmountImpulsionAmountAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcAmountImpulsionAmountImpulsionEClass, PropagatorCalcAmountImpulsionAmountImpulsion.class, "PropagatorCalcAmountImpulsionAmountImpulsion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcAmountImpulsionAtomicAmountImpulsionEClass, PropagatorCalcAmountImpulsionAtomicAmountImpulsion.class, "PropagatorCalcAmountImpulsionAtomicAmountImpulsion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcAmountImpulsionAtomicMomentEClass, PropagatorCalcAmountImpulsionAtomicMoment.class, "PropagatorCalcAmountImpulsionAtomicMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcCapacityChangeEndAmountImpulsionEClass, PropagatorCalcCapacityChangeEndAmountImpulsion.class, "PropagatorCalcCapacityChangeEndAmountImpulsion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcCapacityChangeEndMomentEClass, PropagatorCalcCapacityChangeEndMoment.class, "PropagatorCalcCapacityChangeEndMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcCapacityChangeStartAmountImpulsionEClass, PropagatorCalcCapacityChangeStartAmountImpulsion.class, "PropagatorCalcCapacityChangeStartAmountImpulsion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcCapacityChangeStartMomentEClass, PropagatorCalcCapacityChangeStartMoment.class, "PropagatorCalcCapacityChangeStartMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcChildEventAmountAfterEClass, PropagatorCalcChildEventAmountAfter.class, "PropagatorCalcChildEventAmountAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcChildEventMomentEClass, PropagatorCalcChildEventMoment.class, "PropagatorCalcChildEventMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcChildEventSlopeAfterEClass, PropagatorCalcChildEventSlopeAfter.class, "PropagatorCalcChildEventSlopeAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcEndEventMomentEClass, PropagatorCalcEndEventMoment.class, "PropagatorCalcEndEventMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcEventAmountAfterEClass, PropagatorCalcEventAmountAfter.class, "PropagatorCalcEventAmountAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcEventAmountBeforeEClass, PropagatorCalcEventAmountBefore.class, "PropagatorCalcEventAmountBefore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcEventDescriptionEClass, PropagatorCalcEventDescription.class, "PropagatorCalcEventDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcEventMomentEClass, PropagatorCalcEventMoment.class, "PropagatorCalcEventMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorCalcEventMoment_ConcreteParent(), this.getPropagatorCalcDistributionSequence(), null, "ConcreteParent", null, 0, 1, PropagatorCalcEventMoment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propagatorCalcEventSlopeAfterEClass, PropagatorCalcEventSlopeAfter.class, "PropagatorCalcEventSlopeAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcEventSlopeBeforeEClass, PropagatorCalcEventSlopeBefore.class, "PropagatorCalcEventSlopeBefore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcEventsProviderRefreshEventsEClass, PropagatorCalcEventsProviderRefreshEvents.class, "PropagatorCalcEventsProviderRefreshEvents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorCalcEventsProviderRefreshEvents_ConcreteParent(), this.getPropagatorLayerCompositeEventRefresh(), null, "ConcreteParent", null, 0, 1, PropagatorCalcEventsProviderRefreshEvents.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propagatorCalcSlopeAbsoluteAtomicMomentEClass, PropagatorCalcSlopeAbsoluteAtomicMoment.class, "PropagatorCalcSlopeAbsoluteAtomicMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteEClass, PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute.class, "PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcSlopeAbsoluteSlopeAbsoluteEClass, PropagatorCalcSlopeAbsoluteSlopeAbsolute.class, "PropagatorCalcSlopeAbsoluteSlopeAbsolute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcSlopeAbsoluteSlopeAfterEClass, PropagatorCalcSlopeAbsoluteSlopeAfter.class, "PropagatorCalcSlopeAbsoluteSlopeAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcSlopeImpulsionAtomicMomentEClass, PropagatorCalcSlopeImpulsionAtomicMoment.class, "PropagatorCalcSlopeImpulsionAtomicMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcSlopeImpulsionAtomicSlopeImpulsionEClass, PropagatorCalcSlopeImpulsionAtomicSlopeImpulsion.class, "PropagatorCalcSlopeImpulsionAtomicSlopeImpulsion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcSlopeImpulsionSlopeAfterEClass, PropagatorCalcSlopeImpulsionSlopeAfter.class, "PropagatorCalcSlopeImpulsionSlopeAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcSlopeImpulsionSlopeImpulsionEClass, PropagatorCalcSlopeImpulsionSlopeImpulsion.class, "PropagatorCalcSlopeImpulsionSlopeImpulsion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcStartEventAmountAfterEClass, PropagatorCalcStartEventAmountAfter.class, "PropagatorCalcStartEventAmountAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcStartEventMomentEClass, PropagatorCalcStartEventMoment.class, "PropagatorCalcStartEventMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcStartEventSlopeAfterEClass, PropagatorCalcStartEventSlopeAfter.class, "PropagatorCalcStartEventSlopeAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcStockChangeEndMomentEClass, PropagatorCalcStockChangeEndMoment.class, "PropagatorCalcStockChangeEndMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcStockChangeEndSlopeImpulsionEClass, PropagatorCalcStockChangeEndSlopeImpulsion.class, "PropagatorCalcStockChangeEndSlopeImpulsion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcStockChangeStartMomentEClass, PropagatorCalcStockChangeStartMoment.class, "PropagatorCalcStockChangeStartMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcStockChangeStartSlopeImpulsionEClass, PropagatorCalcStockChangeStartSlopeImpulsion.class, "PropagatorCalcStockChangeStartSlopeImpulsion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcEventSlopeEClass, PropagatorCalcEventSlope.class, "PropagatorCalcEventSlope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorCalcEventSlope_ConcreteParent(), this.getPropagatorLayerDistributionSlopes(), null, "ConcreteParent", null, 0, 1, PropagatorCalcEventSlope.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propagatorCalcEventAmountEClass, PropagatorCalcEventAmount.class, "PropagatorCalcEventAmount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorCalcEventAmount_ConcreteParent(), this.getPropagatorLayerDistributionAmounts(), null, "ConcreteParent", null, 0, 1, PropagatorCalcEventAmount.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TimeContinuousCalcPackageImpl
