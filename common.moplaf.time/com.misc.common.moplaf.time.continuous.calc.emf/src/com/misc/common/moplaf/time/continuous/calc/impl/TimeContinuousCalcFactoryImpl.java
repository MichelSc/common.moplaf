/**
 */
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.time.continuous.calc.*;

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
public class TimeContinuousCalcFactoryImpl extends EFactoryImpl implements TimeContinuousCalcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeContinuousCalcFactory init() {
		try {
			TimeContinuousCalcFactory theTimeContinuousCalcFactory = (TimeContinuousCalcFactory)EPackage.Registry.INSTANCE.getEFactory(TimeContinuousCalcPackage.eNS_URI);
			if (theTimeContinuousCalcFactory != null) {
				return theTimeContinuousCalcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimeContinuousCalcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeContinuousCalcFactoryImpl() {
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
			case TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION: return createPropagatorScopeDistribution();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION: return createPropagatorCalcDistributionInitialization();
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH: return createPropagatorLayerCompositeEventRefresh();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS: return createPropagatorCalcDistributionChildEvents();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS: return createPropagatorCalcDistributionProvidedEvents();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE: return createPropagatorCalcDistributionSequence();
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES: return createPropagatorLayerDistributionSlopes();
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS: return createPropagatorLayerDistributionAmounts();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE: return createPropagatorCalcAmountAbsoluteAmountAbsolute();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER: return createPropagatorCalcAmountAbsoluteAmountAfter();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE: return createPropagatorCalcAmountAbsoluteAtomicAmountAbsolute();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT: return createPropagatorCalcAmountAbsoluteAtomicMoment();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER: return createPropagatorCalcAmountImpulsionAmountAfter();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION: return createPropagatorCalcAmountImpulsionAmountImpulsion();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION: return createPropagatorCalcAmountImpulsionAtomicAmountImpulsion();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT: return createPropagatorCalcAmountImpulsionAtomicMoment();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION: return createPropagatorCalcCapacityChangeEndAmountImpulsion();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT: return createPropagatorCalcCapacityChangeEndMoment();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION: return createPropagatorCalcCapacityChangeStartAmountImpulsion();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT: return createPropagatorCalcCapacityChangeStartMoment();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER: return createPropagatorCalcChildEventAmountAfter();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_CHILD_EVENT_MOMENT: return createPropagatorCalcChildEventMoment();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER: return createPropagatorCalcChildEventSlopeAfter();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_END_EVENT_MOMENT: return createPropagatorCalcEndEventMoment();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENT_AMOUNT_AFTER: return createPropagatorCalcEventAmountAfter();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE: return createPropagatorCalcEventAmountBefore();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENT_MOMENT: return createPropagatorCalcEventMoment();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENT_SLOPE_AFTER: return createPropagatorCalcEventSlopeAfter();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENT_SLOPE_BEFORE: return createPropagatorCalcEventSlopeBefore();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS: return createPropagatorCalcEventsProviderRefreshEvents();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT: return createPropagatorCalcSlopeAbsoluteAtomicMoment();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE: return createPropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE: return createPropagatorCalcSlopeAbsoluteSlopeAbsolute();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER: return createPropagatorCalcSlopeAbsoluteSlopeAfter();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT: return createPropagatorCalcSlopeImpulsionAtomicMoment();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION: return createPropagatorCalcSlopeImpulsionAtomicSlopeImpulsion();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER: return createPropagatorCalcSlopeImpulsionSlopeAfter();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION: return createPropagatorCalcSlopeImpulsionSlopeImpulsion();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER: return createPropagatorCalcStartEventAmountAfter();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_START_EVENT_MOMENT: return createPropagatorCalcStartEventMoment();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER: return createPropagatorCalcStartEventSlopeAfter();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT: return createPropagatorCalcStockChangeEndMoment();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION: return createPropagatorCalcStockChangeEndSlopeImpulsion();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT: return createPropagatorCalcStockChangeStartMoment();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION: return createPropagatorCalcStockChangeStartSlopeImpulsion();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENT_SLOPE: return createPropagatorCalcEventSlope();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENT_AMOUNT: return createPropagatorCalcEventAmount();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcAmountAbsoluteAmountAbsolute createPropagatorCalcAmountAbsoluteAmountAbsolute() {
		PropagatorCalcAmountAbsoluteAmountAbsoluteImpl propagatorCalcAmountAbsoluteAmountAbsolute = new PropagatorCalcAmountAbsoluteAmountAbsoluteImpl();
		return propagatorCalcAmountAbsoluteAmountAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcAmountAbsoluteAmountAfter createPropagatorCalcAmountAbsoluteAmountAfter() {
		PropagatorCalcAmountAbsoluteAmountAfterImpl propagatorCalcAmountAbsoluteAmountAfter = new PropagatorCalcAmountAbsoluteAmountAfterImpl();
		return propagatorCalcAmountAbsoluteAmountAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcAmountAbsoluteAtomicAmountAbsolute createPropagatorCalcAmountAbsoluteAtomicAmountAbsolute() {
		PropagatorCalcAmountAbsoluteAtomicAmountAbsoluteImpl propagatorCalcAmountAbsoluteAtomicAmountAbsolute = new PropagatorCalcAmountAbsoluteAtomicAmountAbsoluteImpl();
		return propagatorCalcAmountAbsoluteAtomicAmountAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcAmountAbsoluteAtomicMoment createPropagatorCalcAmountAbsoluteAtomicMoment() {
		PropagatorCalcAmountAbsoluteAtomicMomentImpl propagatorCalcAmountAbsoluteAtomicMoment = new PropagatorCalcAmountAbsoluteAtomicMomentImpl();
		return propagatorCalcAmountAbsoluteAtomicMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcAmountImpulsionAmountAfter createPropagatorCalcAmountImpulsionAmountAfter() {
		PropagatorCalcAmountImpulsionAmountAfterImpl propagatorCalcAmountImpulsionAmountAfter = new PropagatorCalcAmountImpulsionAmountAfterImpl();
		return propagatorCalcAmountImpulsionAmountAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcAmountImpulsionAmountImpulsion createPropagatorCalcAmountImpulsionAmountImpulsion() {
		PropagatorCalcAmountImpulsionAmountImpulsionImpl propagatorCalcAmountImpulsionAmountImpulsion = new PropagatorCalcAmountImpulsionAmountImpulsionImpl();
		return propagatorCalcAmountImpulsionAmountImpulsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcAmountImpulsionAtomicAmountImpulsion createPropagatorCalcAmountImpulsionAtomicAmountImpulsion() {
		PropagatorCalcAmountImpulsionAtomicAmountImpulsionImpl propagatorCalcAmountImpulsionAtomicAmountImpulsion = new PropagatorCalcAmountImpulsionAtomicAmountImpulsionImpl();
		return propagatorCalcAmountImpulsionAtomicAmountImpulsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcAmountImpulsionAtomicMoment createPropagatorCalcAmountImpulsionAtomicMoment() {
		PropagatorCalcAmountImpulsionAtomicMomentImpl propagatorCalcAmountImpulsionAtomicMoment = new PropagatorCalcAmountImpulsionAtomicMomentImpl();
		return propagatorCalcAmountImpulsionAtomicMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcCapacityChangeEndAmountImpulsion createPropagatorCalcCapacityChangeEndAmountImpulsion() {
		PropagatorCalcCapacityChangeEndAmountImpulsionImpl propagatorCalcCapacityChangeEndAmountImpulsion = new PropagatorCalcCapacityChangeEndAmountImpulsionImpl();
		return propagatorCalcCapacityChangeEndAmountImpulsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcCapacityChangeEndMoment createPropagatorCalcCapacityChangeEndMoment() {
		PropagatorCalcCapacityChangeEndMomentImpl propagatorCalcCapacityChangeEndMoment = new PropagatorCalcCapacityChangeEndMomentImpl();
		return propagatorCalcCapacityChangeEndMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcCapacityChangeStartAmountImpulsion createPropagatorCalcCapacityChangeStartAmountImpulsion() {
		PropagatorCalcCapacityChangeStartAmountImpulsionImpl propagatorCalcCapacityChangeStartAmountImpulsion = new PropagatorCalcCapacityChangeStartAmountImpulsionImpl();
		return propagatorCalcCapacityChangeStartAmountImpulsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcCapacityChangeStartMoment createPropagatorCalcCapacityChangeStartMoment() {
		PropagatorCalcCapacityChangeStartMomentImpl propagatorCalcCapacityChangeStartMoment = new PropagatorCalcCapacityChangeStartMomentImpl();
		return propagatorCalcCapacityChangeStartMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcChildEventAmountAfter createPropagatorCalcChildEventAmountAfter() {
		PropagatorCalcChildEventAmountAfterImpl propagatorCalcChildEventAmountAfter = new PropagatorCalcChildEventAmountAfterImpl();
		return propagatorCalcChildEventAmountAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcChildEventMoment createPropagatorCalcChildEventMoment() {
		PropagatorCalcChildEventMomentImpl propagatorCalcChildEventMoment = new PropagatorCalcChildEventMomentImpl();
		return propagatorCalcChildEventMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcChildEventSlopeAfter createPropagatorCalcChildEventSlopeAfter() {
		PropagatorCalcChildEventSlopeAfterImpl propagatorCalcChildEventSlopeAfter = new PropagatorCalcChildEventSlopeAfterImpl();
		return propagatorCalcChildEventSlopeAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcDistributionChildEvents createPropagatorCalcDistributionChildEvents() {
		PropagatorCalcDistributionChildEventsImpl propagatorCalcDistributionChildEvents = new PropagatorCalcDistributionChildEventsImpl();
		return propagatorCalcDistributionChildEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcDistributionInitialization createPropagatorCalcDistributionInitialization() {
		PropagatorCalcDistributionInitializationImpl propagatorCalcDistributionInitialization = new PropagatorCalcDistributionInitializationImpl();
		return propagatorCalcDistributionInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcDistributionProvidedEvents createPropagatorCalcDistributionProvidedEvents() {
		PropagatorCalcDistributionProvidedEventsImpl propagatorCalcDistributionProvidedEvents = new PropagatorCalcDistributionProvidedEventsImpl();
		return propagatorCalcDistributionProvidedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcDistributionSequence createPropagatorCalcDistributionSequence() {
		PropagatorCalcDistributionSequenceImpl propagatorCalcDistributionSequence = new PropagatorCalcDistributionSequenceImpl();
		return propagatorCalcDistributionSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcEndEventMoment createPropagatorCalcEndEventMoment() {
		PropagatorCalcEndEventMomentImpl propagatorCalcEndEventMoment = new PropagatorCalcEndEventMomentImpl();
		return propagatorCalcEndEventMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcEventAmountAfter createPropagatorCalcEventAmountAfter() {
		PropagatorCalcEventAmountAfterImpl propagatorCalcEventAmountAfter = new PropagatorCalcEventAmountAfterImpl();
		return propagatorCalcEventAmountAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcEventAmountBefore createPropagatorCalcEventAmountBefore() {
		PropagatorCalcEventAmountBeforeImpl propagatorCalcEventAmountBefore = new PropagatorCalcEventAmountBeforeImpl();
		return propagatorCalcEventAmountBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcEventMoment createPropagatorCalcEventMoment() {
		PropagatorCalcEventMomentImpl propagatorCalcEventMoment = new PropagatorCalcEventMomentImpl();
		return propagatorCalcEventMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcEventSlopeAfter createPropagatorCalcEventSlopeAfter() {
		PropagatorCalcEventSlopeAfterImpl propagatorCalcEventSlopeAfter = new PropagatorCalcEventSlopeAfterImpl();
		return propagatorCalcEventSlopeAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcEventSlopeBefore createPropagatorCalcEventSlopeBefore() {
		PropagatorCalcEventSlopeBeforeImpl propagatorCalcEventSlopeBefore = new PropagatorCalcEventSlopeBeforeImpl();
		return propagatorCalcEventSlopeBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcEventsProviderRefreshEvents createPropagatorCalcEventsProviderRefreshEvents() {
		PropagatorCalcEventsProviderRefreshEventsImpl propagatorCalcEventsProviderRefreshEvents = new PropagatorCalcEventsProviderRefreshEventsImpl();
		return propagatorCalcEventsProviderRefreshEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcSlopeAbsoluteAtomicMoment createPropagatorCalcSlopeAbsoluteAtomicMoment() {
		PropagatorCalcSlopeAbsoluteAtomicMomentImpl propagatorCalcSlopeAbsoluteAtomicMoment = new PropagatorCalcSlopeAbsoluteAtomicMomentImpl();
		return propagatorCalcSlopeAbsoluteAtomicMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute createPropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute() {
		PropagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteImpl propagatorCalcSlopeAbsoluteAtomicSlopeAbsolute = new PropagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteImpl();
		return propagatorCalcSlopeAbsoluteAtomicSlopeAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcSlopeAbsoluteSlopeAbsolute createPropagatorCalcSlopeAbsoluteSlopeAbsolute() {
		PropagatorCalcSlopeAbsoluteSlopeAbsoluteImpl propagatorCalcSlopeAbsoluteSlopeAbsolute = new PropagatorCalcSlopeAbsoluteSlopeAbsoluteImpl();
		return propagatorCalcSlopeAbsoluteSlopeAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcSlopeAbsoluteSlopeAfter createPropagatorCalcSlopeAbsoluteSlopeAfter() {
		PropagatorCalcSlopeAbsoluteSlopeAfterImpl propagatorCalcSlopeAbsoluteSlopeAfter = new PropagatorCalcSlopeAbsoluteSlopeAfterImpl();
		return propagatorCalcSlopeAbsoluteSlopeAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcSlopeImpulsionAtomicMoment createPropagatorCalcSlopeImpulsionAtomicMoment() {
		PropagatorCalcSlopeImpulsionAtomicMomentImpl propagatorCalcSlopeImpulsionAtomicMoment = new PropagatorCalcSlopeImpulsionAtomicMomentImpl();
		return propagatorCalcSlopeImpulsionAtomicMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcSlopeImpulsionAtomicSlopeImpulsion createPropagatorCalcSlopeImpulsionAtomicSlopeImpulsion() {
		PropagatorCalcSlopeImpulsionAtomicSlopeImpulsionImpl propagatorCalcSlopeImpulsionAtomicSlopeImpulsion = new PropagatorCalcSlopeImpulsionAtomicSlopeImpulsionImpl();
		return propagatorCalcSlopeImpulsionAtomicSlopeImpulsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcSlopeImpulsionSlopeAfter createPropagatorCalcSlopeImpulsionSlopeAfter() {
		PropagatorCalcSlopeImpulsionSlopeAfterImpl propagatorCalcSlopeImpulsionSlopeAfter = new PropagatorCalcSlopeImpulsionSlopeAfterImpl();
		return propagatorCalcSlopeImpulsionSlopeAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcSlopeImpulsionSlopeImpulsion createPropagatorCalcSlopeImpulsionSlopeImpulsion() {
		PropagatorCalcSlopeImpulsionSlopeImpulsionImpl propagatorCalcSlopeImpulsionSlopeImpulsion = new PropagatorCalcSlopeImpulsionSlopeImpulsionImpl();
		return propagatorCalcSlopeImpulsionSlopeImpulsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcStartEventAmountAfter createPropagatorCalcStartEventAmountAfter() {
		PropagatorCalcStartEventAmountAfterImpl propagatorCalcStartEventAmountAfter = new PropagatorCalcStartEventAmountAfterImpl();
		return propagatorCalcStartEventAmountAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcStartEventMoment createPropagatorCalcStartEventMoment() {
		PropagatorCalcStartEventMomentImpl propagatorCalcStartEventMoment = new PropagatorCalcStartEventMomentImpl();
		return propagatorCalcStartEventMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcStartEventSlopeAfter createPropagatorCalcStartEventSlopeAfter() {
		PropagatorCalcStartEventSlopeAfterImpl propagatorCalcStartEventSlopeAfter = new PropagatorCalcStartEventSlopeAfterImpl();
		return propagatorCalcStartEventSlopeAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcStockChangeEndMoment createPropagatorCalcStockChangeEndMoment() {
		PropagatorCalcStockChangeEndMomentImpl propagatorCalcStockChangeEndMoment = new PropagatorCalcStockChangeEndMomentImpl();
		return propagatorCalcStockChangeEndMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcStockChangeEndSlopeImpulsion createPropagatorCalcStockChangeEndSlopeImpulsion() {
		PropagatorCalcStockChangeEndSlopeImpulsionImpl propagatorCalcStockChangeEndSlopeImpulsion = new PropagatorCalcStockChangeEndSlopeImpulsionImpl();
		return propagatorCalcStockChangeEndSlopeImpulsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcStockChangeStartMoment createPropagatorCalcStockChangeStartMoment() {
		PropagatorCalcStockChangeStartMomentImpl propagatorCalcStockChangeStartMoment = new PropagatorCalcStockChangeStartMomentImpl();
		return propagatorCalcStockChangeStartMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcStockChangeStartSlopeImpulsion createPropagatorCalcStockChangeStartSlopeImpulsion() {
		PropagatorCalcStockChangeStartSlopeImpulsionImpl propagatorCalcStockChangeStartSlopeImpulsion = new PropagatorCalcStockChangeStartSlopeImpulsionImpl();
		return propagatorCalcStockChangeStartSlopeImpulsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcEventSlope createPropagatorCalcEventSlope() {
		PropagatorCalcEventSlopeImpl propagatorCalcEventSlope = new PropagatorCalcEventSlopeImpl();
		return propagatorCalcEventSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcEventAmount createPropagatorCalcEventAmount() {
		PropagatorCalcEventAmountImpl propagatorCalcEventAmount = new PropagatorCalcEventAmountImpl();
		return propagatorCalcEventAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorLayerCompositeEventRefresh createPropagatorLayerCompositeEventRefresh() {
		PropagatorLayerCompositeEventRefreshImpl propagatorLayerCompositeEventRefresh = new PropagatorLayerCompositeEventRefreshImpl();
		return propagatorLayerCompositeEventRefresh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorLayerDistributionAmounts createPropagatorLayerDistributionAmounts() {
		PropagatorLayerDistributionAmountsImpl propagatorLayerDistributionAmounts = new PropagatorLayerDistributionAmountsImpl();
		return propagatorLayerDistributionAmounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorLayerDistributionSlopes createPropagatorLayerDistributionSlopes() {
		PropagatorLayerDistributionSlopesImpl propagatorLayerDistributionSlopes = new PropagatorLayerDistributionSlopesImpl();
		return propagatorLayerDistributionSlopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorScopeDistribution createPropagatorScopeDistribution() {
		PropagatorScopeDistributionImpl propagatorScopeDistribution = new PropagatorScopeDistributionImpl();
		return propagatorScopeDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeContinuousCalcPackage getTimeContinuousCalcPackage() {
		return (TimeContinuousCalcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimeContinuousCalcPackage getPackage() {
		return TimeContinuousCalcPackage.eINSTANCE;
	}

} //TimeContinuousCalcFactoryImpl
