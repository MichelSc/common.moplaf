/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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
package com.misc.common.moplaf.time.continuous.calc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage
 * @generated
 */
public interface TimeContinuousCalcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimeContinuousCalcFactory eINSTANCE = com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scope Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope Distribution</em>'.
	 * @generated
	 */
	ScopeDistribution createScopeDistribution();

	/**
	 * Returns a new object of class '<em>Calc Distribution Initialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Distribution Initialization</em>'.
	 * @generated
	 */
	CalcDistributionInitialization createCalcDistributionInitialization();

	/**
	 * Returns a new object of class '<em>Layer Composite Event Refresh</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Composite Event Refresh</em>'.
	 * @generated
	 */
	LayerCompositeEventRefresh createLayerCompositeEventRefresh();

	/**
	 * Returns a new object of class '<em>Calc Distribution Child Events</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Distribution Child Events</em>'.
	 * @generated
	 */
	CalcDistributionChildEvents createCalcDistributionChildEvents();

	/**
	 * Returns a new object of class '<em>Calc Distribution Provided Events</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Distribution Provided Events</em>'.
	 * @generated
	 */
	CalcDistributionProvidedEvents createCalcDistributionProvidedEvents();

	/**
	 * Returns a new object of class '<em>Calc Distribution Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Distribution Sequence</em>'.
	 * @generated
	 */
	CalcDistributionSequence createCalcDistributionSequence();

	/**
	 * Returns a new object of class '<em>Layer Distribution Slopes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Distribution Slopes</em>'.
	 * @generated
	 */
	LayerDistributionSlopes createLayerDistributionSlopes();

	/**
	 * Returns a new object of class '<em>Layer Distribution Amounts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Distribution Amounts</em>'.
	 * @generated
	 */
	LayerDistributionAmounts createLayerDistributionAmounts();

	/**
	 * Returns a new object of class '<em>Calc Amount Absolute Amount Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Amount Absolute Amount Absolute</em>'.
	 * @generated
	 */
	CalcAmountAbsoluteAmountAbsolute createCalcAmountAbsoluteAmountAbsolute();

	/**
	 * Returns a new object of class '<em>Calc Amount Absolute Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Amount Absolute Amount After</em>'.
	 * @generated
	 */
	CalcAmountAbsoluteAmountAfter createCalcAmountAbsoluteAmountAfter();

	/**
	 * Returns a new object of class '<em>Calc Amount Absolute Atomic Amount Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Amount Absolute Atomic Amount Absolute</em>'.
	 * @generated
	 */
	CalcAmountAbsoluteAtomicAmountAbsolute createCalcAmountAbsoluteAtomicAmountAbsolute();

	/**
	 * Returns a new object of class '<em>Calc Amount Absolute Atomic Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Amount Absolute Atomic Moment</em>'.
	 * @generated
	 */
	CalcAmountAbsoluteAtomicMoment createCalcAmountAbsoluteAtomicMoment();

	/**
	 * Returns a new object of class '<em>Calc Amount Delta Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Amount Delta Amount After</em>'.
	 * @generated
	 */
	CalcAmountDeltaAmountAfter createCalcAmountDeltaAmountAfter();

	/**
	 * Returns a new object of class '<em>Calc Amount Delta Amount Delta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Amount Delta Amount Delta</em>'.
	 * @generated
	 */
	CalcAmountDeltaAmountDelta createCalcAmountDeltaAmountDelta();

	/**
	 * Returns a new object of class '<em>Calc Amount Delta Atomic Amount Delta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Amount Delta Atomic Amount Delta</em>'.
	 * @generated
	 */
	CalcAmountDeltaAtomicAmountDelta createCalcAmountDeltaAtomicAmountDelta();

	/**
	 * Returns a new object of class '<em>Calc Amount Delta Atomic Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Amount Delta Atomic Moment</em>'.
	 * @generated
	 */
	CalcAmountDeltaAtomicMoment createCalcAmountDeltaAtomicMoment();

	/**
	 * Returns a new object of class '<em>Calc Capacity Change End Amount Delta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Capacity Change End Amount Delta</em>'.
	 * @generated
	 */
	CalcCapacityChangeEndAmountDelta createCalcCapacityChangeEndAmountDelta();

	/**
	 * Returns a new object of class '<em>Calc Capacity Change End Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Capacity Change End Moment</em>'.
	 * @generated
	 */
	CalcCapacityChangeEndMoment createCalcCapacityChangeEndMoment();

	/**
	 * Returns a new object of class '<em>Calc Capacity Change Start Amount Delta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Capacity Change Start Amount Delta</em>'.
	 * @generated
	 */
	CalcCapacityChangeStartAmountDelta createCalcCapacityChangeStartAmountDelta();

	/**
	 * Returns a new object of class '<em>Calc Capacity Change Start Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Capacity Change Start Moment</em>'.
	 * @generated
	 */
	CalcCapacityChangeStartMoment createCalcCapacityChangeStartMoment();

	/**
	 * Returns a new object of class '<em>Calc Child Event Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Child Event Amount After</em>'.
	 * @generated
	 */
	CalcChildEventAmountAfter createCalcChildEventAmountAfter();

	/**
	 * Returns a new object of class '<em>Calc Child Event Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Child Event Moment</em>'.
	 * @generated
	 */
	CalcChildEventMoment createCalcChildEventMoment();

	/**
	 * Returns a new object of class '<em>Calc Child Event Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Child Event Slope After</em>'.
	 * @generated
	 */
	CalcChildEventSlopeAfter createCalcChildEventSlopeAfter();

	/**
	 * Returns a new object of class '<em>Calc End Event Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc End Event Moment</em>'.
	 * @generated
	 */
	CalcEndEventMoment createCalcEndEventMoment();

	/**
	 * Returns a new object of class '<em>Calc Event Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Event Amount After</em>'.
	 * @generated
	 */
	CalcEventAmountAfter createCalcEventAmountAfter();

	/**
	 * Returns a new object of class '<em>Calc Event Amount Before</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Event Amount Before</em>'.
	 * @generated
	 */
	CalcEventAmountBefore createCalcEventAmountBefore();

	/**
	 * Returns a new object of class '<em>Calc Event Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Event Moment</em>'.
	 * @generated
	 */
	CalcEventMoment createCalcEventMoment();

	/**
	 * Returns a new object of class '<em>Calc Event Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Event Slope After</em>'.
	 * @generated
	 */
	CalcEventSlopeAfter createCalcEventSlopeAfter();

	/**
	 * Returns a new object of class '<em>Calc Event Slope Before</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Event Slope Before</em>'.
	 * @generated
	 */
	CalcEventSlopeBefore createCalcEventSlopeBefore();

	/**
	 * Returns a new object of class '<em>Calc Events Provider Refresh Events</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Events Provider Refresh Events</em>'.
	 * @generated
	 */
	CalcEventsProviderRefreshEvents createCalcEventsProviderRefreshEvents();

	/**
	 * Returns a new object of class '<em>Calc Slope Absolute Atomic Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Slope Absolute Atomic Moment</em>'.
	 * @generated
	 */
	CalcSlopeAbsoluteAtomicMoment createCalcSlopeAbsoluteAtomicMoment();

	/**
	 * Returns a new object of class '<em>Calc Slope Absolute Atomic Slope Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Slope Absolute Atomic Slope Absolute</em>'.
	 * @generated
	 */
	CalcSlopeAbsoluteAtomicSlopeAbsolute createCalcSlopeAbsoluteAtomicSlopeAbsolute();

	/**
	 * Returns a new object of class '<em>Calc Slope Absolute Slope Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Slope Absolute Slope Absolute</em>'.
	 * @generated
	 */
	CalcSlopeAbsoluteSlopeAbsolute createCalcSlopeAbsoluteSlopeAbsolute();

	/**
	 * Returns a new object of class '<em>Calc Slope Absolute Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Slope Absolute Slope After</em>'.
	 * @generated
	 */
	CalcSlopeAbsoluteSlopeAfter createCalcSlopeAbsoluteSlopeAfter();

	/**
	 * Returns a new object of class '<em>Calc Slope Delta Atomic Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Slope Delta Atomic Moment</em>'.
	 * @generated
	 */
	CalcSlopeDeltaAtomicMoment createCalcSlopeDeltaAtomicMoment();

	/**
	 * Returns a new object of class '<em>Calc Slope Delta Atomic Slope Delta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Slope Delta Atomic Slope Delta</em>'.
	 * @generated
	 */
	CalcSlopeDeltaAtomicSlopeDelta createCalcSlopeDeltaAtomicSlopeDelta();

	/**
	 * Returns a new object of class '<em>Calc Slope Delta Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Slope Delta Slope After</em>'.
	 * @generated
	 */
	CalcSlopeDeltaSlopeAfter createCalcSlopeDeltaSlopeAfter();

	/**
	 * Returns a new object of class '<em>Calc Slope Delta Slope Delta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Slope Delta Slope Delta</em>'.
	 * @generated
	 */
	CalcSlopeDeltaSlopeDelta createCalcSlopeDeltaSlopeDelta();

	/**
	 * Returns a new object of class '<em>Calc Start Event Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Start Event Amount After</em>'.
	 * @generated
	 */
	CalcStartEventAmountAfter createCalcStartEventAmountAfter();

	/**
	 * Returns a new object of class '<em>Calc Start Event Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Start Event Moment</em>'.
	 * @generated
	 */
	CalcStartEventMoment createCalcStartEventMoment();

	/**
	 * Returns a new object of class '<em>Calc Start Event Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Start Event Slope After</em>'.
	 * @generated
	 */
	CalcStartEventSlopeAfter createCalcStartEventSlopeAfter();

	/**
	 * Returns a new object of class '<em>Calc Stock Change End Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Stock Change End Moment</em>'.
	 * @generated
	 */
	CalcStockChangeEndMoment createCalcStockChangeEndMoment();

	/**
	 * Returns a new object of class '<em>Calc Stock Change End Slope Delta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Stock Change End Slope Delta</em>'.
	 * @generated
	 */
	CalcStockChangeEndSlopeDelta createCalcStockChangeEndSlopeDelta();

	/**
	 * Returns a new object of class '<em>Calc Stock Change Start Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Stock Change Start Moment</em>'.
	 * @generated
	 */
	CalcStockChangeStartMoment createCalcStockChangeStartMoment();

	/**
	 * Returns a new object of class '<em>Calc Stock Change Start Slope Delta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Stock Change Start Slope Delta</em>'.
	 * @generated
	 */
	CalcStockChangeStartSlopeDelta createCalcStockChangeStartSlopeDelta();

	/**
	 * Returns a new object of class '<em>Calc Event Slope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Event Slope</em>'.
	 * @generated
	 */
	CalcEventSlope createCalcEventSlope();

	/**
	 * Returns a new object of class '<em>Calc Event Amount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Event Amount</em>'.
	 * @generated
	 */
	CalcEventAmount createCalcEventAmount();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimeContinuousCalcPackage getTimeContinuousCalcPackage();

} //TimeContinuousCalcFactory
