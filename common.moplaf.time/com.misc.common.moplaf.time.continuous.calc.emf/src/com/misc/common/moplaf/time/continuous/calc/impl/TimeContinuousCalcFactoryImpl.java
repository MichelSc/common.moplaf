/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
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
			case TimeContinuousCalcPackage.SCOPE_DISTRIBUTION: return createScopeDistribution();
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_INITIALIZATION: return createCalcDistributionInitialization();
			case TimeContinuousCalcPackage.LAYER_COMPOSITE_EVENT_REFRESH: return createLayerCompositeEventRefresh();
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_CHILD_EVENTS: return createCalcDistributionChildEvents();
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS: return createCalcDistributionProvidedEvents();
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_SEQUENCE: return createCalcDistributionSequence();
			case TimeContinuousCalcPackage.LAYER_DISTRIBUTION_SLOPES: return createLayerDistributionSlopes();
			case TimeContinuousCalcPackage.LAYER_DISTRIBUTION_AMOUNTS: return createLayerDistributionAmounts();
			case TimeContinuousCalcPackage.CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE: return createCalcAmountAbsoluteAmountAbsolute();
			case TimeContinuousCalcPackage.CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER: return createCalcAmountAbsoluteAmountAfter();
			case TimeContinuousCalcPackage.CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE: return createCalcAmountAbsoluteAtomicAmountAbsolute();
			case TimeContinuousCalcPackage.CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT: return createCalcAmountAbsoluteAtomicMoment();
			case TimeContinuousCalcPackage.CALC_AMOUNT_DELTA_AMOUNT_AFTER: return createCalcAmountDeltaAmountAfter();
			case TimeContinuousCalcPackage.CALC_AMOUNT_DELTA_AMOUNT_DELTA: return createCalcAmountDeltaAmountDelta();
			case TimeContinuousCalcPackage.CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA: return createCalcAmountDeltaAtomicAmountDelta();
			case TimeContinuousCalcPackage.CALC_AMOUNT_DELTA_ATOMIC_MOMENT: return createCalcAmountDeltaAtomicMoment();
			case TimeContinuousCalcPackage.CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA: return createCalcCapacityChangeEndAmountDelta();
			case TimeContinuousCalcPackage.CALC_CAPACITY_CHANGE_END_MOMENT: return createCalcCapacityChangeEndMoment();
			case TimeContinuousCalcPackage.CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA: return createCalcCapacityChangeStartAmountDelta();
			case TimeContinuousCalcPackage.CALC_CAPACITY_CHANGE_START_MOMENT: return createCalcCapacityChangeStartMoment();
			case TimeContinuousCalcPackage.CALC_CHILD_EVENT_AMOUNT_AFTER: return createCalcChildEventAmountAfter();
			case TimeContinuousCalcPackage.CALC_CHILD_EVENT_MOMENT: return createCalcChildEventMoment();
			case TimeContinuousCalcPackage.CALC_CHILD_EVENT_SLOPE_AFTER: return createCalcChildEventSlopeAfter();
			case TimeContinuousCalcPackage.CALC_END_EVENT_MOMENT: return createCalcEndEventMoment();
			case TimeContinuousCalcPackage.CALC_EVENT_AMOUNT_AFTER: return createCalcEventAmountAfter();
			case TimeContinuousCalcPackage.CALC_EVENT_AMOUNT_BEFORE: return createCalcEventAmountBefore();
			case TimeContinuousCalcPackage.CALC_EVENT_MOMENT: return createCalcEventMoment();
			case TimeContinuousCalcPackage.CALC_EVENT_SLOPE_AFTER: return createCalcEventSlopeAfter();
			case TimeContinuousCalcPackage.CALC_EVENT_SLOPE_BEFORE: return createCalcEventSlopeBefore();
			case TimeContinuousCalcPackage.CALC_EVENTS_PROVIDER_REFRESH_EVENTS: return createCalcEventsProviderRefreshEvents();
			case TimeContinuousCalcPackage.CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT: return createCalcSlopeAbsoluteAtomicMoment();
			case TimeContinuousCalcPackage.CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE: return createCalcSlopeAbsoluteAtomicSlopeAbsolute();
			case TimeContinuousCalcPackage.CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE: return createCalcSlopeAbsoluteSlopeAbsolute();
			case TimeContinuousCalcPackage.CALC_SLOPE_ABSOLUTE_SLOPE_AFTER: return createCalcSlopeAbsoluteSlopeAfter();
			case TimeContinuousCalcPackage.CALC_SLOPE_DELTA_ATOMIC_MOMENT: return createCalcSlopeDeltaAtomicMoment();
			case TimeContinuousCalcPackage.CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA: return createCalcSlopeDeltaAtomicSlopeDelta();
			case TimeContinuousCalcPackage.CALC_SLOPE_DELTA_SLOPE_AFTER: return createCalcSlopeDeltaSlopeAfter();
			case TimeContinuousCalcPackage.CALC_SLOPE_DELTA_SLOPE_DELTA: return createCalcSlopeDeltaSlopeDelta();
			case TimeContinuousCalcPackage.CALC_START_EVENT_AMOUNT_AFTER: return createCalcStartEventAmountAfter();
			case TimeContinuousCalcPackage.CALC_START_EVENT_MOMENT: return createCalcStartEventMoment();
			case TimeContinuousCalcPackage.CALC_START_EVENT_SLOPE_AFTER: return createCalcStartEventSlopeAfter();
			case TimeContinuousCalcPackage.CALC_STOCK_CHANGE_END_MOMENT: return createCalcStockChangeEndMoment();
			case TimeContinuousCalcPackage.CALC_STOCK_CHANGE_END_SLOPE_DELTA: return createCalcStockChangeEndSlopeDelta();
			case TimeContinuousCalcPackage.CALC_STOCK_CHANGE_START_MOMENT: return createCalcStockChangeStartMoment();
			case TimeContinuousCalcPackage.CALC_STOCK_CHANGE_START_SLOPE_DELTA: return createCalcStockChangeStartSlopeDelta();
			case TimeContinuousCalcPackage.CALC_EVENT_SLOPE: return createCalcEventSlope();
			case TimeContinuousCalcPackage.CALC_EVENT_AMOUNT: return createCalcEventAmount();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDistribution createScopeDistribution() {
		ScopeDistributionImpl scopeDistribution = new ScopeDistributionImpl();
		return scopeDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcDistributionInitialization createCalcDistributionInitialization() {
		CalcDistributionInitializationImpl calcDistributionInitialization = new CalcDistributionInitializationImpl();
		return calcDistributionInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerCompositeEventRefresh createLayerCompositeEventRefresh() {
		LayerCompositeEventRefreshImpl layerCompositeEventRefresh = new LayerCompositeEventRefreshImpl();
		return layerCompositeEventRefresh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcDistributionChildEvents createCalcDistributionChildEvents() {
		CalcDistributionChildEventsImpl calcDistributionChildEvents = new CalcDistributionChildEventsImpl();
		return calcDistributionChildEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcDistributionProvidedEvents createCalcDistributionProvidedEvents() {
		CalcDistributionProvidedEventsImpl calcDistributionProvidedEvents = new CalcDistributionProvidedEventsImpl();
		return calcDistributionProvidedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcDistributionSequence createCalcDistributionSequence() {
		CalcDistributionSequenceImpl calcDistributionSequence = new CalcDistributionSequenceImpl();
		return calcDistributionSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerDistributionSlopes createLayerDistributionSlopes() {
		LayerDistributionSlopesImpl layerDistributionSlopes = new LayerDistributionSlopesImpl();
		return layerDistributionSlopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerDistributionAmounts createLayerDistributionAmounts() {
		LayerDistributionAmountsImpl layerDistributionAmounts = new LayerDistributionAmountsImpl();
		return layerDistributionAmounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcAmountAbsoluteAmountAbsolute createCalcAmountAbsoluteAmountAbsolute() {
		CalcAmountAbsoluteAmountAbsoluteImpl calcAmountAbsoluteAmountAbsolute = new CalcAmountAbsoluteAmountAbsoluteImpl();
		return calcAmountAbsoluteAmountAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcAmountAbsoluteAmountAfter createCalcAmountAbsoluteAmountAfter() {
		CalcAmountAbsoluteAmountAfterImpl calcAmountAbsoluteAmountAfter = new CalcAmountAbsoluteAmountAfterImpl();
		return calcAmountAbsoluteAmountAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcAmountAbsoluteAtomicAmountAbsolute createCalcAmountAbsoluteAtomicAmountAbsolute() {
		CalcAmountAbsoluteAtomicAmountAbsoluteImpl calcAmountAbsoluteAtomicAmountAbsolute = new CalcAmountAbsoluteAtomicAmountAbsoluteImpl();
		return calcAmountAbsoluteAtomicAmountAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcAmountAbsoluteAtomicMoment createCalcAmountAbsoluteAtomicMoment() {
		CalcAmountAbsoluteAtomicMomentImpl calcAmountAbsoluteAtomicMoment = new CalcAmountAbsoluteAtomicMomentImpl();
		return calcAmountAbsoluteAtomicMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcAmountDeltaAmountAfter createCalcAmountDeltaAmountAfter() {
		CalcAmountDeltaAmountAfterImpl calcAmountDeltaAmountAfter = new CalcAmountDeltaAmountAfterImpl();
		return calcAmountDeltaAmountAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcAmountDeltaAmountDelta createCalcAmountDeltaAmountDelta() {
		CalcAmountDeltaAmountDeltaImpl calcAmountDeltaAmountDelta = new CalcAmountDeltaAmountDeltaImpl();
		return calcAmountDeltaAmountDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcAmountDeltaAtomicAmountDelta createCalcAmountDeltaAtomicAmountDelta() {
		CalcAmountDeltaAtomicAmountDeltaImpl calcAmountDeltaAtomicAmountDelta = new CalcAmountDeltaAtomicAmountDeltaImpl();
		return calcAmountDeltaAtomicAmountDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcAmountDeltaAtomicMoment createCalcAmountDeltaAtomicMoment() {
		CalcAmountDeltaAtomicMomentImpl calcAmountDeltaAtomicMoment = new CalcAmountDeltaAtomicMomentImpl();
		return calcAmountDeltaAtomicMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcCapacityChangeEndAmountDelta createCalcCapacityChangeEndAmountDelta() {
		CalcCapacityChangeEndAmountDeltaImpl calcCapacityChangeEndAmountDelta = new CalcCapacityChangeEndAmountDeltaImpl();
		return calcCapacityChangeEndAmountDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcCapacityChangeEndMoment createCalcCapacityChangeEndMoment() {
		CalcCapacityChangeEndMomentImpl calcCapacityChangeEndMoment = new CalcCapacityChangeEndMomentImpl();
		return calcCapacityChangeEndMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcCapacityChangeStartAmountDelta createCalcCapacityChangeStartAmountDelta() {
		CalcCapacityChangeStartAmountDeltaImpl calcCapacityChangeStartAmountDelta = new CalcCapacityChangeStartAmountDeltaImpl();
		return calcCapacityChangeStartAmountDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcCapacityChangeStartMoment createCalcCapacityChangeStartMoment() {
		CalcCapacityChangeStartMomentImpl calcCapacityChangeStartMoment = new CalcCapacityChangeStartMomentImpl();
		return calcCapacityChangeStartMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcChildEventAmountAfter createCalcChildEventAmountAfter() {
		CalcChildEventAmountAfterImpl calcChildEventAmountAfter = new CalcChildEventAmountAfterImpl();
		return calcChildEventAmountAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcChildEventMoment createCalcChildEventMoment() {
		CalcChildEventMomentImpl calcChildEventMoment = new CalcChildEventMomentImpl();
		return calcChildEventMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcChildEventSlopeAfter createCalcChildEventSlopeAfter() {
		CalcChildEventSlopeAfterImpl calcChildEventSlopeAfter = new CalcChildEventSlopeAfterImpl();
		return calcChildEventSlopeAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcEndEventMoment createCalcEndEventMoment() {
		CalcEndEventMomentImpl calcEndEventMoment = new CalcEndEventMomentImpl();
		return calcEndEventMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcEventAmountAfter createCalcEventAmountAfter() {
		CalcEventAmountAfterImpl calcEventAmountAfter = new CalcEventAmountAfterImpl();
		return calcEventAmountAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcEventAmountBefore createCalcEventAmountBefore() {
		CalcEventAmountBeforeImpl calcEventAmountBefore = new CalcEventAmountBeforeImpl();
		return calcEventAmountBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcEventMoment createCalcEventMoment() {
		CalcEventMomentImpl calcEventMoment = new CalcEventMomentImpl();
		return calcEventMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcEventSlopeAfter createCalcEventSlopeAfter() {
		CalcEventSlopeAfterImpl calcEventSlopeAfter = new CalcEventSlopeAfterImpl();
		return calcEventSlopeAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcEventSlopeBefore createCalcEventSlopeBefore() {
		CalcEventSlopeBeforeImpl calcEventSlopeBefore = new CalcEventSlopeBeforeImpl();
		return calcEventSlopeBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcEventsProviderRefreshEvents createCalcEventsProviderRefreshEvents() {
		CalcEventsProviderRefreshEventsImpl calcEventsProviderRefreshEvents = new CalcEventsProviderRefreshEventsImpl();
		return calcEventsProviderRefreshEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcSlopeAbsoluteAtomicMoment createCalcSlopeAbsoluteAtomicMoment() {
		CalcSlopeAbsoluteAtomicMomentImpl calcSlopeAbsoluteAtomicMoment = new CalcSlopeAbsoluteAtomicMomentImpl();
		return calcSlopeAbsoluteAtomicMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcSlopeAbsoluteAtomicSlopeAbsolute createCalcSlopeAbsoluteAtomicSlopeAbsolute() {
		CalcSlopeAbsoluteAtomicSlopeAbsoluteImpl calcSlopeAbsoluteAtomicSlopeAbsolute = new CalcSlopeAbsoluteAtomicSlopeAbsoluteImpl();
		return calcSlopeAbsoluteAtomicSlopeAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcSlopeAbsoluteSlopeAbsolute createCalcSlopeAbsoluteSlopeAbsolute() {
		CalcSlopeAbsoluteSlopeAbsoluteImpl calcSlopeAbsoluteSlopeAbsolute = new CalcSlopeAbsoluteSlopeAbsoluteImpl();
		return calcSlopeAbsoluteSlopeAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcSlopeAbsoluteSlopeAfter createCalcSlopeAbsoluteSlopeAfter() {
		CalcSlopeAbsoluteSlopeAfterImpl calcSlopeAbsoluteSlopeAfter = new CalcSlopeAbsoluteSlopeAfterImpl();
		return calcSlopeAbsoluteSlopeAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcSlopeDeltaAtomicMoment createCalcSlopeDeltaAtomicMoment() {
		CalcSlopeDeltaAtomicMomentImpl calcSlopeDeltaAtomicMoment = new CalcSlopeDeltaAtomicMomentImpl();
		return calcSlopeDeltaAtomicMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcSlopeDeltaAtomicSlopeDelta createCalcSlopeDeltaAtomicSlopeDelta() {
		CalcSlopeDeltaAtomicSlopeDeltaImpl calcSlopeDeltaAtomicSlopeDelta = new CalcSlopeDeltaAtomicSlopeDeltaImpl();
		return calcSlopeDeltaAtomicSlopeDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcSlopeDeltaSlopeAfter createCalcSlopeDeltaSlopeAfter() {
		CalcSlopeDeltaSlopeAfterImpl calcSlopeDeltaSlopeAfter = new CalcSlopeDeltaSlopeAfterImpl();
		return calcSlopeDeltaSlopeAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcSlopeDeltaSlopeDelta createCalcSlopeDeltaSlopeDelta() {
		CalcSlopeDeltaSlopeDeltaImpl calcSlopeDeltaSlopeDelta = new CalcSlopeDeltaSlopeDeltaImpl();
		return calcSlopeDeltaSlopeDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcStartEventAmountAfter createCalcStartEventAmountAfter() {
		CalcStartEventAmountAfterImpl calcStartEventAmountAfter = new CalcStartEventAmountAfterImpl();
		return calcStartEventAmountAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcStartEventMoment createCalcStartEventMoment() {
		CalcStartEventMomentImpl calcStartEventMoment = new CalcStartEventMomentImpl();
		return calcStartEventMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcStartEventSlopeAfter createCalcStartEventSlopeAfter() {
		CalcStartEventSlopeAfterImpl calcStartEventSlopeAfter = new CalcStartEventSlopeAfterImpl();
		return calcStartEventSlopeAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcStockChangeEndMoment createCalcStockChangeEndMoment() {
		CalcStockChangeEndMomentImpl calcStockChangeEndMoment = new CalcStockChangeEndMomentImpl();
		return calcStockChangeEndMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcStockChangeEndSlopeDelta createCalcStockChangeEndSlopeDelta() {
		CalcStockChangeEndSlopeDeltaImpl calcStockChangeEndSlopeDelta = new CalcStockChangeEndSlopeDeltaImpl();
		return calcStockChangeEndSlopeDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcStockChangeStartMoment createCalcStockChangeStartMoment() {
		CalcStockChangeStartMomentImpl calcStockChangeStartMoment = new CalcStockChangeStartMomentImpl();
		return calcStockChangeStartMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcStockChangeStartSlopeDelta createCalcStockChangeStartSlopeDelta() {
		CalcStockChangeStartSlopeDeltaImpl calcStockChangeStartSlopeDelta = new CalcStockChangeStartSlopeDeltaImpl();
		return calcStockChangeStartSlopeDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcEventSlope createCalcEventSlope() {
		CalcEventSlopeImpl calcEventSlope = new CalcEventSlopeImpl();
		return calcEventSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcEventAmount createCalcEventAmount() {
		CalcEventAmountImpl calcEventAmount = new CalcEventAmountImpl();
		return calcEventAmount;
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
