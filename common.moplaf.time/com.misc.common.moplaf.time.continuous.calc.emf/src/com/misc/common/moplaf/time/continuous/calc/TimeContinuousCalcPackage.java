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
package com.misc.common.moplaf.time.continuous.calc;


import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcFactory
 * @model kind="package"
 * @generated
 */
public interface TimeContinuousCalcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "calc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/time/continuous/calc/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "timcontc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimeContinuousCalcPackage eINSTANCE = com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAmountAbsoluteImpl <em>Propagator Calc Amount Absolute Amount Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAmountAbsoluteImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountAbsoluteAmountAbsolute()
	 * @generated
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE = 8;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventAmountAfterImpl <em>Propagator Calc Event Amount After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventAmountAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventAmountAfter()
	 * @generated
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER = 24;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAmountAfterImpl <em>Propagator Calc Amount Absolute Amount After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAmountAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountAbsoluteAmountAfter()
	 * @generated
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER = 9;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAtomicAmountAbsoluteImpl <em>Propagator Calc Amount Absolute Atomic Amount Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAtomicAmountAbsoluteImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountAbsoluteAtomicAmountAbsolute()
	 * @generated
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE = 10;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventMomentImpl <em>Propagator Calc Event Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventMoment()
	 * @generated
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT = 26;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAmountAfterImpl <em>Propagator Calc Amount Impulsion Amount After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAmountAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountImpulsionAmountAfter()
	 * @generated
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER = 12;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAmountImpulsionImpl <em>Propagator Calc Amount Impulsion Amount Impulsion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAmountImpulsionImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountImpulsionAmountImpulsion()
	 * @generated
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION = 13;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAtomicAmountImpulsionImpl <em>Propagator Calc Amount Impulsion Atomic Amount Impulsion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAtomicAmountImpulsionImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountImpulsionAtomicAmountImpulsion()
	 * @generated
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION = 14;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeEndAmountImpulsionImpl <em>Propagator Calc Capacity Change End Amount Impulsion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeEndAmountImpulsionImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcCapacityChangeEndAmountImpulsion()
	 * @generated
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION = 16;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeEndMomentImpl <em>Propagator Calc Capacity Change End Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeEndMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcCapacityChangeEndMoment()
	 * @generated
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT = 17;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeStartAmountImpulsionImpl <em>Propagator Calc Capacity Change Start Amount Impulsion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeStartAmountImpulsionImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcCapacityChangeStartAmountImpulsion()
	 * @generated
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION = 18;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeStartMomentImpl <em>Propagator Calc Capacity Change Start Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeStartMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcCapacityChangeStartMoment()
	 * @generated
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT = 19;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcChildEventAmountAfterImpl <em>Propagator Calc Child Event Amount After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcChildEventAmountAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcChildEventAmountAfter()
	 * @generated
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER = 20;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcChildEventMomentImpl <em>Propagator Calc Child Event Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcChildEventMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcChildEventMoment()
	 * @generated
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT = 21;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventSlopeAfterImpl <em>Propagator Calc Event Slope After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventSlopeAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventSlopeAfter()
	 * @generated
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER = 27;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcChildEventSlopeAfterImpl <em>Propagator Calc Child Event Slope After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcChildEventSlopeAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcChildEventSlopeAfter()
	 * @generated
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER = 22;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionChildEventsImpl <em>Propagator Calc Distribution Child Events</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionChildEventsImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcDistributionChildEvents()
	 * @generated
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionInitializationImpl <em>Propagator Calc Distribution Initialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionInitializationImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcDistributionInitialization()
	 * @generated
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionProvidedEventsImpl <em>Propagator Calc Distribution Provided Events</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionProvidedEventsImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcDistributionProvidedEvents()
	 * @generated
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS = 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionSequenceImpl <em>Propagator Calc Distribution Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionSequenceImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcDistributionSequence()
	 * @generated
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE = 5;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEndEventMomentImpl <em>Propagator Calc End Event Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEndEventMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEndEventMoment()
	 * @generated
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT = 23;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventAmountBeforeImpl <em>Propagator Calc Event Amount Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventAmountBeforeImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventAmountBefore()
	 * @generated
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE = 25;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventSlopeBeforeImpl <em>Propagator Calc Event Slope Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventSlopeBeforeImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventSlopeBefore()
	 * @generated
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE = 28;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventsProviderRefreshEventsImpl <em>Propagator Calc Events Provider Refresh Events</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventsProviderRefreshEventsImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventsProviderRefreshEvents()
	 * @generated
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS = 29;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteSlopeAbsoluteImpl <em>Propagator Calc Slope Absolute Slope Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteSlopeAbsoluteImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeAbsoluteSlopeAbsolute()
	 * @generated
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE = 32;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteImpl <em>Propagator Calc Slope Absolute Atomic Slope Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute()
	 * @generated
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE = 31;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteSlopeAfterImpl <em>Propagator Calc Slope Absolute Slope After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteSlopeAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeAbsoluteSlopeAfter()
	 * @generated
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER = 33;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionSlopeImpulsionImpl <em>Propagator Calc Slope Impulsion Slope Impulsion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionSlopeImpulsionImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeImpulsionSlopeImpulsion()
	 * @generated
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION = 37;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionAtomicSlopeImpulsionImpl <em>Propagator Calc Slope Impulsion Atomic Slope Impulsion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionAtomicSlopeImpulsionImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeImpulsionAtomicSlopeImpulsion()
	 * @generated
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION = 35;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionSlopeAfterImpl <em>Propagator Calc Slope Impulsion Slope After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionSlopeAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeImpulsionSlopeAfter()
	 * @generated
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER = 36;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStartEventAmountAfterImpl <em>Propagator Calc Start Event Amount After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStartEventAmountAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcStartEventAmountAfter()
	 * @generated
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER = 38;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStartEventMomentImpl <em>Propagator Calc Start Event Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStartEventMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcStartEventMoment()
	 * @generated
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT = 39;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStartEventSlopeAfterImpl <em>Propagator Calc Start Event Slope After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStartEventSlopeAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcStartEventSlopeAfter()
	 * @generated
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER = 40;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeEndMomentImpl <em>Propagator Calc Stock Change End Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeEndMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcStockChangeEndMoment()
	 * @generated
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT = 41;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeEndSlopeImpulsionImpl <em>Propagator Calc Stock Change End Slope Impulsion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeEndSlopeImpulsionImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcStockChangeEndSlopeImpulsion()
	 * @generated
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION = 42;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeStartMomentImpl <em>Propagator Calc Stock Change Start Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeStartMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcStockChangeStartMoment()
	 * @generated
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT = 43;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeStartSlopeImpulsionImpl <em>Propagator Calc Stock Change Start Slope Impulsion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeStartSlopeImpulsionImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcStockChangeStartSlopeImpulsion()
	 * @generated
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION = 44;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerCompositeEventRefreshImpl <em>Propagator Layer Composite Event Refresh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerCompositeEventRefreshImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorLayerCompositeEventRefresh()
	 * @generated
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerDistributionAmountsImpl <em>Propagator Layer Distribution Amounts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerDistributionAmountsImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorLayerDistributionAmounts()
	 * @generated
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS = 7;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerDistributionSlopesImpl <em>Propagator Layer Distribution Slopes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerDistributionSlopesImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorLayerDistributionSlopes()
	 * @generated
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES = 6;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorScopeDistributionImpl <em>Propagator Scope Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorScopeDistributionImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorScopeDistribution()
	 * @generated
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The number of structural features of the '<em>Propagator Scope Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Scope Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DISTRIBUTION_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propagator Calc Distribution Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Distribution Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anteceden Calc Distribution Initialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Propagator Layer Composite Event Refresh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Layer Composite Event Refresh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propagator Calc Distribution Child Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Distribution Child Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antecedent Layer Compositeevent Refresh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_LAYER_COMPOSITEEVENT_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Antecedent Calc Distributionchild Events</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_CALC_DISTRIBUTIONCHILD_EVENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Propagator Calc Distribution Provided Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Distribution Provided Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antecedent Calc Distribution Provided Events</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__ANTECEDENT_CALC_DISTRIBUTION_PROVIDED_EVENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Propagator Calc Distribution Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Distribution Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antecedent Calc Distribution Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__ANTECEDENT_CALC_DISTRIBUTION_SEQUENCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Propagator Layer Distribution Slopes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Layer Distribution Slopes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_SLOPES_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antecedent Layer Distribution Slopes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENT_LAYER_DISTRIBUTION_SLOPES = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Propagator Layer Distribution Amounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Layer Distribution Amounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventAmountImpl <em>Propagator Calc Event Amount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventAmountImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventAmount()
	 * @generated
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT = 46;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__DISTRIBUTION_EVENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propagator Calc Event Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Event Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__PARENT = PROPAGATOR_CALC_EVENT_AMOUNT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_AMOUNT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHED = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHERS = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__ENABLED = PROPAGATOR_CALC_EVENT_AMOUNT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_AMOUNT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TYPE = PROPAGATOR_CALC_EVENT_AMOUNT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__OBJECT = PROPAGATOR_CALC_EVENT_AMOUNT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__INSTANCE = PROPAGATOR_CALC_EVENT_AMOUNT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__DESCRIPTION = PROPAGATOR_CALC_EVENT_AMOUNT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_AMOUNT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Amount Absolute Amount Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___INIT = PROPAGATOR_CALC_EVENT_AMOUNT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___ENABLE = PROPAGATOR_CALC_EVENT_AMOUNT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DISABLE = PROPAGATOR_CALC_EVENT_AMOUNT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___RESET = PROPAGATOR_CALC_EVENT_AMOUNT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___UNTOUCH = PROPAGATOR_CALC_EVENT_AMOUNT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___GET_SCOPE = PROPAGATOR_CALC_EVENT_AMOUNT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_AMOUNT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_AMOUNT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Amount Absolute Amount Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__PARENT = PROPAGATOR_CALC_EVENT_AMOUNT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_AMOUNT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHERS = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ENABLED = PROPAGATOR_CALC_EVENT_AMOUNT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_AMOUNT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TYPE = PROPAGATOR_CALC_EVENT_AMOUNT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__OBJECT = PROPAGATOR_CALC_EVENT_AMOUNT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__INSTANCE = PROPAGATOR_CALC_EVENT_AMOUNT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__DESCRIPTION = PROPAGATOR_CALC_EVENT_AMOUNT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_AMOUNT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Event Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___INIT = PROPAGATOR_CALC_EVENT_AMOUNT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___ENABLE = PROPAGATOR_CALC_EVENT_AMOUNT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DISABLE = PROPAGATOR_CALC_EVENT_AMOUNT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___RESET = PROPAGATOR_CALC_EVENT_AMOUNT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___UNTOUCH = PROPAGATOR_CALC_EVENT_AMOUNT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___GET_SCOPE = PROPAGATOR_CALC_EVENT_AMOUNT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_AMOUNT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_AMOUNT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Event Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_AFTER_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__TOUCHED = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__TOUCHERS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__ENABLED = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__TYPE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__OBJECT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__INSTANCE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__DESCRIPTION = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Amount Absolute Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___INIT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___ENABLE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___DISABLE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___RESET = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___UNTOUCH = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___DO_REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___GET_SCOPE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Amount Absolute Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__PARENT = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__ANTECEDENTS = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__TOUCHED = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__TOUCHED_CHILDREN = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__TOUCHERS = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__ENABLED = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__TYPE = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__OBJECT = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__INSTANCE = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__DESCRIPTION = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__TOUCHED_PARENT = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__DISTRIBUTION_EVENT = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__CONCRETE_PARENT = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Amount Absolute Atomic Amount Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE_FEATURE_COUNT = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___INIT = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___ENABLE = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___DISABLE = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___RESET = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___TOUCH__EOBJECT = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___UNTOUCH = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___REFRESH = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___REFRESH__REFRESHER = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___DO_GET_PARENT = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___DO_REFRESH = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___GET_SCOPE = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___GET_FACTORY_ID = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___DO_GET_BINDINGS = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Amount Absolute Atomic Amount Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE_OPERATION_COUNT = PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__DISTRIBUTION_EVENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propagator Calc Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_MOMENT_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAtomicMomentImpl <em>Propagator Calc Amount Absolute Atomic Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAtomicMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountAbsoluteAtomicMoment()
	 * @generated
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__PARENT = PROPAGATOR_CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__TOUCHED = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__TOUCHERS = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__ENABLED = PROPAGATOR_CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__TYPE = PROPAGATOR_CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__OBJECT = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__INSTANCE = PROPAGATOR_CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__DESCRIPTION = PROPAGATOR_CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Amount Absolute Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___INIT = PROPAGATOR_CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___ENABLE = PROPAGATOR_CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___DISABLE = PROPAGATOR_CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___RESET = PROPAGATOR_CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___UNTOUCH = PROPAGATOR_CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___DO_REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___GET_SCOPE = PROPAGATOR_CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Amount Absolute Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__TOUCHED = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__TOUCHERS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__ENABLED = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__TYPE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__OBJECT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__INSTANCE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__DESCRIPTION = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Amount Impulsion Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___INIT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___ENABLE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___DISABLE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___RESET = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___UNTOUCH = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___DO_REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___GET_SCOPE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Amount Impulsion Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__PARENT = PROPAGATOR_CALC_EVENT_AMOUNT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_AMOUNT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHED = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHERS = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__ENABLED = PROPAGATOR_CALC_EVENT_AMOUNT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_AMOUNT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TYPE = PROPAGATOR_CALC_EVENT_AMOUNT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__OBJECT = PROPAGATOR_CALC_EVENT_AMOUNT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__INSTANCE = PROPAGATOR_CALC_EVENT_AMOUNT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__DESCRIPTION = PROPAGATOR_CALC_EVENT_AMOUNT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_AMOUNT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Amount Impulsion Amount Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___INIT = PROPAGATOR_CALC_EVENT_AMOUNT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___ENABLE = PROPAGATOR_CALC_EVENT_AMOUNT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DISABLE = PROPAGATOR_CALC_EVENT_AMOUNT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___RESET = PROPAGATOR_CALC_EVENT_AMOUNT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___UNTOUCH = PROPAGATOR_CALC_EVENT_AMOUNT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___GET_SCOPE = PROPAGATOR_CALC_EVENT_AMOUNT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_AMOUNT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_AMOUNT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Amount Impulsion Amount Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__PARENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__ANTECEDENTS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__TOUCHED = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__TOUCHED_CHILDREN = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__TOUCHERS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__ENABLED = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__TYPE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__OBJECT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__INSTANCE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__DESCRIPTION = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__TOUCHED_PARENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__DISTRIBUTION_EVENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION__CONCRETE_PARENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Amount Impulsion Atomic Amount Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION_FEATURE_COUNT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___INIT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___ENABLE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___DISABLE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___RESET = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___TOUCH__EOBJECT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___UNTOUCH = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___REFRESH = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___REFRESH__REFRESHER = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___DO_GET_PARENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___DO_REFRESH = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___GET_SCOPE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___GET_FACTORY_ID = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___DO_GET_BINDINGS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Amount Impulsion Atomic Amount Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION_OPERATION_COUNT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAtomicMomentImpl <em>Propagator Calc Amount Impulsion Atomic Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAtomicMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountImpulsionAtomicMoment()
	 * @generated
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT = 15;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__PARENT = PROPAGATOR_CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__TOUCHED = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__TOUCHERS = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__ENABLED = PROPAGATOR_CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__TYPE = PROPAGATOR_CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__OBJECT = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__INSTANCE = PROPAGATOR_CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__DESCRIPTION = PROPAGATOR_CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Amount Impulsion Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___INIT = PROPAGATOR_CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___ENABLE = PROPAGATOR_CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___DISABLE = PROPAGATOR_CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___RESET = PROPAGATOR_CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___UNTOUCH = PROPAGATOR_CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___DO_REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___GET_SCOPE = PROPAGATOR_CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Amount Impulsion Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__PARENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__ANTECEDENTS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__TOUCHED = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__TOUCHED_CHILDREN = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__TOUCHERS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__ENABLED = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__TYPE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__OBJECT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__INSTANCE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__DESCRIPTION = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__TOUCHED_PARENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__DISTRIBUTION_EVENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION__CONCRETE_PARENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Capacity Change End Amount Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION_FEATURE_COUNT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___INIT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___ENABLE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___DISABLE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___RESET = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___TOUCH__EOBJECT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___UNTOUCH = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___REFRESH = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___REFRESH__REFRESHER = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___DO_GET_PARENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___DO_REFRESH = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___GET_SCOPE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___GET_FACTORY_ID = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___DO_GET_BINDINGS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Capacity Change End Amount Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION_OPERATION_COUNT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__PARENT = PROPAGATOR_CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__TOUCHED = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__TOUCHERS = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__ENABLED = PROPAGATOR_CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__TYPE = PROPAGATOR_CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__OBJECT = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__INSTANCE = PROPAGATOR_CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__DESCRIPTION = PROPAGATOR_CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Capacity Change End Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___INIT = PROPAGATOR_CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___ENABLE = PROPAGATOR_CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___DISABLE = PROPAGATOR_CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___RESET = PROPAGATOR_CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___UNTOUCH = PROPAGATOR_CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___DO_REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___GET_SCOPE = PROPAGATOR_CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Capacity Change End Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__PARENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__ANTECEDENTS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__TOUCHED = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__TOUCHED_CHILDREN = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__TOUCHERS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__ENABLED = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__TYPE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__OBJECT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__INSTANCE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__DESCRIPTION = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__TOUCHED_PARENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__DISTRIBUTION_EVENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION__CONCRETE_PARENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Capacity Change Start Amount Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION_FEATURE_COUNT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___INIT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___ENABLE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___DISABLE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___RESET = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___TOUCH__EOBJECT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___UNTOUCH = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___REFRESH = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___REFRESH__REFRESHER = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___DO_GET_PARENT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___DO_REFRESH = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___GET_SCOPE = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___GET_FACTORY_ID = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___DO_GET_BINDINGS = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Capacity Change Start Amount Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION_OPERATION_COUNT = PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__PARENT = PROPAGATOR_CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__TOUCHED = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__TOUCHERS = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__ENABLED = PROPAGATOR_CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__TYPE = PROPAGATOR_CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__OBJECT = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__INSTANCE = PROPAGATOR_CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__DESCRIPTION = PROPAGATOR_CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Capacity Change Start Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___INIT = PROPAGATOR_CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___ENABLE = PROPAGATOR_CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___DISABLE = PROPAGATOR_CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___RESET = PROPAGATOR_CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___UNTOUCH = PROPAGATOR_CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___DO_REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___GET_SCOPE = PROPAGATOR_CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Capacity Change Start Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__TOUCHED = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__TOUCHERS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__ENABLED = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__TYPE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__OBJECT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__INSTANCE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__DESCRIPTION = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Child Event Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___INIT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___ENABLE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___DISABLE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___RESET = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___UNTOUCH = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___DO_REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___GET_SCOPE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Child Event Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__PARENT = PROPAGATOR_CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__TOUCHED = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__TOUCHERS = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__ENABLED = PROPAGATOR_CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__TYPE = PROPAGATOR_CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__OBJECT = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__INSTANCE = PROPAGATOR_CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__DESCRIPTION = PROPAGATOR_CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Child Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___INIT = PROPAGATOR_CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___ENABLE = PROPAGATOR_CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___DISABLE = PROPAGATOR_CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___RESET = PROPAGATOR_CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___UNTOUCH = PROPAGATOR_CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___DO_REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___GET_SCOPE = PROPAGATOR_CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Child Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_MOMENT_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventSlopeImpl <em>Propagator Calc Event Slope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventSlopeImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventSlope()
	 * @generated
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE = 45;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__DISTRIBUTION_EVENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propagator Calc Event Slope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Event Slope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__PARENT = PROPAGATOR_CALC_EVENT_SLOPE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_SLOPE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHERS = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ENABLED = PROPAGATOR_CALC_EVENT_SLOPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_SLOPE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TYPE = PROPAGATOR_CALC_EVENT_SLOPE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__OBJECT = PROPAGATOR_CALC_EVENT_SLOPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__INSTANCE = PROPAGATOR_CALC_EVENT_SLOPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__DESCRIPTION = PROPAGATOR_CALC_EVENT_SLOPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_SLOPE__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_SLOPE__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Event Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___INIT = PROPAGATOR_CALC_EVENT_SLOPE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___ENABLE = PROPAGATOR_CALC_EVENT_SLOPE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DISABLE = PROPAGATOR_CALC_EVENT_SLOPE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___RESET = PROPAGATOR_CALC_EVENT_SLOPE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___UNTOUCH = PROPAGATOR_CALC_EVENT_SLOPE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_REFRESH = PROPAGATOR_CALC_EVENT_SLOPE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___GET_SCOPE = PROPAGATOR_CALC_EVENT_SLOPE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_SLOPE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_SLOPE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Event Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_AFTER_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__TOUCHED = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__TOUCHERS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__ENABLED = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__TYPE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__OBJECT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__INSTANCE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__DESCRIPTION = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Child Event Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___INIT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___ENABLE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___DISABLE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___RESET = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___UNTOUCH = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___REFRESH = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___DO_REFRESH = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___GET_SCOPE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Child Event Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__PARENT = PROPAGATOR_CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__TOUCHED = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__TOUCHERS = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__ENABLED = PROPAGATOR_CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__TYPE = PROPAGATOR_CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__OBJECT = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__INSTANCE = PROPAGATOR_CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__DESCRIPTION = PROPAGATOR_CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc End Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___INIT = PROPAGATOR_CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___ENABLE = PROPAGATOR_CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___DISABLE = PROPAGATOR_CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___RESET = PROPAGATOR_CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___UNTOUCH = PROPAGATOR_CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___DO_REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___GET_SCOPE = PROPAGATOR_CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc End Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_END_EVENT_MOMENT_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__PARENT = PROPAGATOR_CALC_EVENT_AMOUNT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_AMOUNT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__TOUCHED = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__TOUCHERS = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__ENABLED = PROPAGATOR_CALC_EVENT_AMOUNT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_AMOUNT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__TYPE = PROPAGATOR_CALC_EVENT_AMOUNT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__OBJECT = PROPAGATOR_CALC_EVENT_AMOUNT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__INSTANCE = PROPAGATOR_CALC_EVENT_AMOUNT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__DESCRIPTION = PROPAGATOR_CALC_EVENT_AMOUNT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_AMOUNT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Event Amount Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___INIT = PROPAGATOR_CALC_EVENT_AMOUNT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___ENABLE = PROPAGATOR_CALC_EVENT_AMOUNT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___DISABLE = PROPAGATOR_CALC_EVENT_AMOUNT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___RESET = PROPAGATOR_CALC_EVENT_AMOUNT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___UNTOUCH = PROPAGATOR_CALC_EVENT_AMOUNT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___DO_REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___GET_SCOPE = PROPAGATOR_CALC_EVENT_AMOUNT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_AMOUNT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_AMOUNT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_AMOUNT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Event Amount Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__PARENT = PROPAGATOR_CALC_EVENT_SLOPE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_SLOPE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__TOUCHED = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__TOUCHERS = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__ENABLED = PROPAGATOR_CALC_EVENT_SLOPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_SLOPE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__TYPE = PROPAGATOR_CALC_EVENT_SLOPE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__OBJECT = PROPAGATOR_CALC_EVENT_SLOPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__INSTANCE = PROPAGATOR_CALC_EVENT_SLOPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__DESCRIPTION = PROPAGATOR_CALC_EVENT_SLOPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_SLOPE__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_SLOPE__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Event Slope Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___INIT = PROPAGATOR_CALC_EVENT_SLOPE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___ENABLE = PROPAGATOR_CALC_EVENT_SLOPE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___DISABLE = PROPAGATOR_CALC_EVENT_SLOPE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___RESET = PROPAGATOR_CALC_EVENT_SLOPE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___UNTOUCH = PROPAGATOR_CALC_EVENT_SLOPE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___REFRESH = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___DO_REFRESH = PROPAGATOR_CALC_EVENT_SLOPE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___GET_SCOPE = PROPAGATOR_CALC_EVENT_SLOPE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_SLOPE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_SLOPE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Event Slope Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENT_SLOPE_BEFORE_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Events Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__EVENTS_PROVIDER = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__EVENTS_PROVIDER;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propagator Calc Events Provider Refresh Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Events Provider Refresh Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteAtomicMomentImpl <em>Propagator Calc Slope Absolute Atomic Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteAtomicMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeAbsoluteAtomicMoment()
	 * @generated
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT = 30;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__PARENT = PROPAGATOR_CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__TOUCHED = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__TOUCHERS = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__ENABLED = PROPAGATOR_CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__TYPE = PROPAGATOR_CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__OBJECT = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__INSTANCE = PROPAGATOR_CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__DESCRIPTION = PROPAGATOR_CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Slope Absolute Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___INIT = PROPAGATOR_CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___ENABLE = PROPAGATOR_CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___DISABLE = PROPAGATOR_CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___RESET = PROPAGATOR_CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___UNTOUCH = PROPAGATOR_CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___DO_REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___GET_SCOPE = PROPAGATOR_CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Slope Absolute Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__PARENT = PROPAGATOR_CALC_EVENT_SLOPE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_SLOPE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHED = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHERS = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__ENABLED = PROPAGATOR_CALC_EVENT_SLOPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_SLOPE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TYPE = PROPAGATOR_CALC_EVENT_SLOPE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__OBJECT = PROPAGATOR_CALC_EVENT_SLOPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__INSTANCE = PROPAGATOR_CALC_EVENT_SLOPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__DESCRIPTION = PROPAGATOR_CALC_EVENT_SLOPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_SLOPE__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_SLOPE__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Slope Absolute Slope Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___INIT = PROPAGATOR_CALC_EVENT_SLOPE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___ENABLE = PROPAGATOR_CALC_EVENT_SLOPE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DISABLE = PROPAGATOR_CALC_EVENT_SLOPE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___RESET = PROPAGATOR_CALC_EVENT_SLOPE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___UNTOUCH = PROPAGATOR_CALC_EVENT_SLOPE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_REFRESH = PROPAGATOR_CALC_EVENT_SLOPE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___GET_SCOPE = PROPAGATOR_CALC_EVENT_SLOPE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_SLOPE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_SLOPE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Slope Absolute Slope Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__PARENT = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__ANTECEDENTS = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__TOUCHED = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__TOUCHED_CHILDREN = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__TOUCHERS = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__ENABLED = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__TYPE = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__OBJECT = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__INSTANCE = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__DESCRIPTION = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__TOUCHED_PARENT = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__DISTRIBUTION_EVENT = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__CONCRETE_PARENT = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Slope Absolute Atomic Slope Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE_FEATURE_COUNT = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___INIT = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___ENABLE = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___DISABLE = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___RESET = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___TOUCH__EOBJECT = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___UNTOUCH = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___REFRESH = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___REFRESH__REFRESHER = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___DO_GET_PARENT = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___DO_REFRESH = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___GET_SCOPE = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___GET_FACTORY_ID = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___DO_GET_BINDINGS = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Slope Absolute Atomic Slope Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE_OPERATION_COUNT = PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__TOUCHED = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__TOUCHERS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__ENABLED = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__TYPE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__OBJECT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__INSTANCE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__DESCRIPTION = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Slope Absolute Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___INIT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___ENABLE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___DISABLE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___RESET = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___UNTOUCH = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___REFRESH = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___DO_REFRESH = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___GET_SCOPE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Slope Absolute Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionAtomicMomentImpl <em>Propagator Calc Slope Impulsion Atomic Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionAtomicMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeImpulsionAtomicMoment()
	 * @generated
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT = 34;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__PARENT = PROPAGATOR_CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__TOUCHED = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__TOUCHERS = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__ENABLED = PROPAGATOR_CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__TYPE = PROPAGATOR_CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__OBJECT = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__INSTANCE = PROPAGATOR_CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__DESCRIPTION = PROPAGATOR_CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Slope Impulsion Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___INIT = PROPAGATOR_CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___ENABLE = PROPAGATOR_CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___DISABLE = PROPAGATOR_CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___RESET = PROPAGATOR_CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___UNTOUCH = PROPAGATOR_CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___DO_REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___GET_SCOPE = PROPAGATOR_CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Slope Impulsion Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__PARENT = PROPAGATOR_CALC_EVENT_SLOPE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_SLOPE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHED = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHERS = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__ENABLED = PROPAGATOR_CALC_EVENT_SLOPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_SLOPE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TYPE = PROPAGATOR_CALC_EVENT_SLOPE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__OBJECT = PROPAGATOR_CALC_EVENT_SLOPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__INSTANCE = PROPAGATOR_CALC_EVENT_SLOPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__DESCRIPTION = PROPAGATOR_CALC_EVENT_SLOPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_SLOPE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_SLOPE__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_SLOPE__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Slope Impulsion Slope Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___INIT = PROPAGATOR_CALC_EVENT_SLOPE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___ENABLE = PROPAGATOR_CALC_EVENT_SLOPE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DISABLE = PROPAGATOR_CALC_EVENT_SLOPE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___RESET = PROPAGATOR_CALC_EVENT_SLOPE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___UNTOUCH = PROPAGATOR_CALC_EVENT_SLOPE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_REFRESH = PROPAGATOR_CALC_EVENT_SLOPE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___GET_SCOPE = PROPAGATOR_CALC_EVENT_SLOPE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_SLOPE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_SLOPE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_SLOPE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Slope Impulsion Slope Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__PARENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__ANTECEDENTS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__TOUCHED = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__TOUCHED_CHILDREN = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__TOUCHERS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__ENABLED = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__TYPE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__OBJECT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__INSTANCE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__DESCRIPTION = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__TOUCHED_PARENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__DISTRIBUTION_EVENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION__CONCRETE_PARENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Slope Impulsion Atomic Slope Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION_FEATURE_COUNT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___INIT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___ENABLE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___DISABLE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___RESET = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___TOUCH__EOBJECT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___UNTOUCH = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___REFRESH = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___REFRESH__REFRESHER = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___DO_GET_PARENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___DO_REFRESH = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___GET_SCOPE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___GET_FACTORY_ID = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___DO_GET_BINDINGS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Slope Impulsion Atomic Slope Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION_OPERATION_COUNT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__TOUCHED = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__TOUCHERS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__ENABLED = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__TYPE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__OBJECT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__INSTANCE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__DESCRIPTION = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Slope Impulsion Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___INIT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___ENABLE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___DISABLE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___RESET = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___UNTOUCH = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___REFRESH = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___DO_REFRESH = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___GET_SCOPE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Slope Impulsion Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__TOUCHED = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__TOUCHERS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__ENABLED = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__TYPE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__OBJECT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__INSTANCE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__DESCRIPTION = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Start Event Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___INIT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___ENABLE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___DISABLE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___RESET = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___UNTOUCH = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___DO_REFRESH = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___GET_SCOPE = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Start Event Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_AMOUNT_AFTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__PARENT = PROPAGATOR_CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__TOUCHED = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__TOUCHERS = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__ENABLED = PROPAGATOR_CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__TYPE = PROPAGATOR_CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__OBJECT = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__INSTANCE = PROPAGATOR_CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__DESCRIPTION = PROPAGATOR_CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Start Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___INIT = PROPAGATOR_CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___ENABLE = PROPAGATOR_CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___DISABLE = PROPAGATOR_CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___RESET = PROPAGATOR_CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___UNTOUCH = PROPAGATOR_CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___DO_REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___GET_SCOPE = PROPAGATOR_CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Start Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_MOMENT_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__TOUCHED = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__TOUCHERS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__ENABLED = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__TYPE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__OBJECT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__INSTANCE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__DESCRIPTION = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Start Event Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___INIT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___ENABLE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___DISABLE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___RESET = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___UNTOUCH = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___REFRESH = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___DO_REFRESH = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___GET_SCOPE = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Start Event Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_SLOPE_AFTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__PARENT = PROPAGATOR_CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__TOUCHED = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__TOUCHERS = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__ENABLED = PROPAGATOR_CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__TYPE = PROPAGATOR_CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__OBJECT = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__INSTANCE = PROPAGATOR_CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__DESCRIPTION = PROPAGATOR_CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Stock Change End Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___INIT = PROPAGATOR_CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___ENABLE = PROPAGATOR_CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___DISABLE = PROPAGATOR_CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___RESET = PROPAGATOR_CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___UNTOUCH = PROPAGATOR_CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___DO_REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___GET_SCOPE = PROPAGATOR_CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Stock Change End Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__PARENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__ANTECEDENTS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__TOUCHED = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__TOUCHED_CHILDREN = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__TOUCHERS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__ENABLED = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__TYPE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__OBJECT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__INSTANCE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__DESCRIPTION = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__TOUCHED_PARENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__DISTRIBUTION_EVENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION__CONCRETE_PARENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Stock Change End Slope Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION_FEATURE_COUNT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___INIT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___ENABLE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___DISABLE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___RESET = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___TOUCH__EOBJECT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___UNTOUCH = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___REFRESH = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___REFRESH__REFRESHER = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___DO_GET_PARENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___DO_REFRESH = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___GET_SCOPE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___GET_FACTORY_ID = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___DO_GET_BINDINGS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Stock Change End Slope Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION_OPERATION_COUNT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__PARENT = PROPAGATOR_CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__TOUCHED = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__TOUCHED_CHILDREN = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__TOUCHERS = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__ENABLED = PROPAGATOR_CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__TYPE = PROPAGATOR_CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__OBJECT = PROPAGATOR_CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__INSTANCE = PROPAGATOR_CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__DESCRIPTION = PROPAGATOR_CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__TOUCHED_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__DISTRIBUTION_EVENT = PROPAGATOR_CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT__CONCRETE_PARENT = PROPAGATOR_CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Stock Change Start Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT_FEATURE_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___INIT = PROPAGATOR_CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___ENABLE = PROPAGATOR_CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___DISABLE = PROPAGATOR_CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___RESET = PROPAGATOR_CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___TOUCH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___UNTOUCH = PROPAGATOR_CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___REFRESH__REFRESHER = PROPAGATOR_CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___DO_GET_PARENT = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___DO_REFRESH = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___GET_SCOPE = PROPAGATOR_CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___GET_FACTORY_ID = PROPAGATOR_CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___DO_GET_BINDINGS = PROPAGATOR_CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Stock Change Start Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT_OPERATION_COUNT = PROPAGATOR_CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__PARENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__ANTECEDENTS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__ANTECEDENTS_SIBLING = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__TOUCHED = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__TOUCHED_CHILDREN = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__TOUCHERS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__ENABLED = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__TYPE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__OBJECT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__INSTANCE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__DESCRIPTION = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__TOUCHED_PARENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__DISTRIBUTION_EVENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION__CONCRETE_PARENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Stock Change Start Slope Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION_FEATURE_COUNT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___INIT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___ENABLE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___DISABLE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___RESET = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___TOUCH__EOBJECT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___UNTOUCH = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___REFRESH_ANTECEDENTS__REFRESHER = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___REFRESH_THIS__REFRESHER = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___REFRESH_CHILDREN_AND_THIS__REFRESHER = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___REFRESH = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___REFRESH__REFRESHER = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___DO_GET_ANTECEDENTS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___DO_GET_PARENT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___DO_REFRESH = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___DO_REFRESH__EOBJECT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___GET_SCOPE = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___GET_FACTORY_ID = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___DO_GET_BINDINGS = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Stock Change Start Slope Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION_OPERATION_COUNT = PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAmountAbsolute <em>Propagator Calc Amount Absolute Amount Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Amount Absolute Amount Absolute</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAmountAbsolute
	 * @generated
	 */
	EClass getPropagatorCalcAmountAbsoluteAmountAbsolute();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAmountAfter <em>Propagator Calc Amount Absolute Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Amount Absolute Amount After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAmountAfter
	 * @generated
	 */
	EClass getPropagatorCalcAmountAbsoluteAmountAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAtomicAmountAbsolute <em>Propagator Calc Amount Absolute Atomic Amount Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Amount Absolute Atomic Amount Absolute</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAtomicAmountAbsolute
	 * @generated
	 */
	EClass getPropagatorCalcAmountAbsoluteAtomicAmountAbsolute();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAtomicMoment <em>Propagator Calc Amount Absolute Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Amount Absolute Atomic Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAtomicMoment
	 * @generated
	 */
	EClass getPropagatorCalcAmountAbsoluteAtomicMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAmountAfter <em>Propagator Calc Amount Impulsion Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Amount Impulsion Amount After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAmountAfter
	 * @generated
	 */
	EClass getPropagatorCalcAmountImpulsionAmountAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAmountImpulsion <em>Propagator Calc Amount Impulsion Amount Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Amount Impulsion Amount Impulsion</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAmountImpulsion
	 * @generated
	 */
	EClass getPropagatorCalcAmountImpulsionAmountImpulsion();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAtomicAmountImpulsion <em>Propagator Calc Amount Impulsion Atomic Amount Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Amount Impulsion Atomic Amount Impulsion</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAtomicAmountImpulsion
	 * @generated
	 */
	EClass getPropagatorCalcAmountImpulsionAtomicAmountImpulsion();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAtomicMoment <em>Propagator Calc Amount Impulsion Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Amount Impulsion Atomic Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAtomicMoment
	 * @generated
	 */
	EClass getPropagatorCalcAmountImpulsionAtomicMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeEndAmountImpulsion <em>Propagator Calc Capacity Change End Amount Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Capacity Change End Amount Impulsion</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeEndAmountImpulsion
	 * @generated
	 */
	EClass getPropagatorCalcCapacityChangeEndAmountImpulsion();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeEndMoment <em>Propagator Calc Capacity Change End Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Capacity Change End Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeEndMoment
	 * @generated
	 */
	EClass getPropagatorCalcCapacityChangeEndMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeStartAmountImpulsion <em>Propagator Calc Capacity Change Start Amount Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Capacity Change Start Amount Impulsion</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeStartAmountImpulsion
	 * @generated
	 */
	EClass getPropagatorCalcCapacityChangeStartAmountImpulsion();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeStartMoment <em>Propagator Calc Capacity Change Start Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Capacity Change Start Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeStartMoment
	 * @generated
	 */
	EClass getPropagatorCalcCapacityChangeStartMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventAmountAfter <em>Propagator Calc Child Event Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Child Event Amount After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventAmountAfter
	 * @generated
	 */
	EClass getPropagatorCalcChildEventAmountAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventMoment <em>Propagator Calc Child Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Child Event Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventMoment
	 * @generated
	 */
	EClass getPropagatorCalcChildEventMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventSlopeAfter <em>Propagator Calc Child Event Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Child Event Slope After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventSlopeAfter
	 * @generated
	 */
	EClass getPropagatorCalcChildEventSlopeAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionChildEvents <em>Propagator Calc Distribution Child Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Distribution Child Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionChildEvents
	 * @generated
	 */
	EClass getPropagatorCalcDistributionChildEvents();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionChildEvents#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionChildEvents#getConcreteParent()
	 * @see #getPropagatorCalcDistributionChildEvents()
	 * @generated
	 */
	EReference getPropagatorCalcDistributionChildEvents_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionInitialization <em>Propagator Calc Distribution Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Distribution Initialization</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionInitialization
	 * @generated
	 */
	EClass getPropagatorCalcDistributionInitialization();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionInitialization#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionInitialization#getConcreteParent()
	 * @see #getPropagatorCalcDistributionInitialization()
	 * @generated
	 */
	EReference getPropagatorCalcDistributionInitialization_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents <em>Propagator Calc Distribution Provided Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Distribution Provided Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents
	 * @generated
	 */
	EClass getPropagatorCalcDistributionProvidedEvents();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents#getConcreteParent()
	 * @see #getPropagatorCalcDistributionProvidedEvents()
	 * @generated
	 */
	EReference getPropagatorCalcDistributionProvidedEvents_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents#getAntecedentLayerCompositeeventRefresh <em>Antecedent Layer Compositeevent Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Layer Compositeevent Refresh</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents#getAntecedentLayerCompositeeventRefresh()
	 * @see #getPropagatorCalcDistributionProvidedEvents()
	 * @generated
	 */
	EReference getPropagatorCalcDistributionProvidedEvents_AntecedentLayerCompositeeventRefresh();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents#getAntecedentCalcDistributionchildEvents <em>Antecedent Calc Distributionchild Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Calc Distributionchild Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents#getAntecedentCalcDistributionchildEvents()
	 * @see #getPropagatorCalcDistributionProvidedEvents()
	 * @generated
	 */
	EReference getPropagatorCalcDistributionProvidedEvents_AntecedentCalcDistributionchildEvents();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence <em>Propagator Calc Distribution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Distribution Sequence</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence
	 * @generated
	 */
	EClass getPropagatorCalcDistributionSequence();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence#getConcreteParent()
	 * @see #getPropagatorCalcDistributionSequence()
	 * @generated
	 */
	EReference getPropagatorCalcDistributionSequence_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence#getAntecedentCalcDistributionProvidedEvents <em>Antecedent Calc Distribution Provided Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Calc Distribution Provided Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence#getAntecedentCalcDistributionProvidedEvents()
	 * @see #getPropagatorCalcDistributionSequence()
	 * @generated
	 */
	EReference getPropagatorCalcDistributionSequence_AntecedentCalcDistributionProvidedEvents();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEndEventMoment <em>Propagator Calc End Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc End Event Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEndEventMoment
	 * @generated
	 */
	EClass getPropagatorCalcEndEventMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountAfter <em>Propagator Calc Event Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Event Amount After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountAfter
	 * @generated
	 */
	EClass getPropagatorCalcEventAmountAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountBefore <em>Propagator Calc Event Amount Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Event Amount Before</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountBefore
	 * @generated
	 */
	EClass getPropagatorCalcEventAmountBefore();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventMoment <em>Propagator Calc Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Event Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventMoment
	 * @generated
	 */
	EClass getPropagatorCalcEventMoment();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventMoment#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventMoment#getConcreteParent()
	 * @see #getPropagatorCalcEventMoment()
	 * @generated
	 */
	EReference getPropagatorCalcEventMoment_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeAfter <em>Propagator Calc Event Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Event Slope After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeAfter
	 * @generated
	 */
	EClass getPropagatorCalcEventSlopeAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeBefore <em>Propagator Calc Event Slope Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Event Slope Before</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeBefore
	 * @generated
	 */
	EClass getPropagatorCalcEventSlopeBefore();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventsProviderRefreshEvents <em>Propagator Calc Events Provider Refresh Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Events Provider Refresh Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventsProviderRefreshEvents
	 * @generated
	 */
	EClass getPropagatorCalcEventsProviderRefreshEvents();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventsProviderRefreshEvents#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventsProviderRefreshEvents#getConcreteParent()
	 * @see #getPropagatorCalcEventsProviderRefreshEvents()
	 * @generated
	 */
	EReference getPropagatorCalcEventsProviderRefreshEvents_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteAtomicMoment <em>Propagator Calc Slope Absolute Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Slope Absolute Atomic Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteAtomicMoment
	 * @generated
	 */
	EClass getPropagatorCalcSlopeAbsoluteAtomicMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute <em>Propagator Calc Slope Absolute Atomic Slope Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Slope Absolute Atomic Slope Absolute</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute
	 * @generated
	 */
	EClass getPropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteSlopeAbsolute <em>Propagator Calc Slope Absolute Slope Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Slope Absolute Slope Absolute</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteSlopeAbsolute
	 * @generated
	 */
	EClass getPropagatorCalcSlopeAbsoluteSlopeAbsolute();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteSlopeAfter <em>Propagator Calc Slope Absolute Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Slope Absolute Slope After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteSlopeAfter
	 * @generated
	 */
	EClass getPropagatorCalcSlopeAbsoluteSlopeAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionAtomicMoment <em>Propagator Calc Slope Impulsion Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Slope Impulsion Atomic Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionAtomicMoment
	 * @generated
	 */
	EClass getPropagatorCalcSlopeImpulsionAtomicMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionAtomicSlopeImpulsion <em>Propagator Calc Slope Impulsion Atomic Slope Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Slope Impulsion Atomic Slope Impulsion</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionAtomicSlopeImpulsion
	 * @generated
	 */
	EClass getPropagatorCalcSlopeImpulsionAtomicSlopeImpulsion();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionSlopeAfter <em>Propagator Calc Slope Impulsion Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Slope Impulsion Slope After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionSlopeAfter
	 * @generated
	 */
	EClass getPropagatorCalcSlopeImpulsionSlopeAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionSlopeImpulsion <em>Propagator Calc Slope Impulsion Slope Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Slope Impulsion Slope Impulsion</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionSlopeImpulsion
	 * @generated
	 */
	EClass getPropagatorCalcSlopeImpulsionSlopeImpulsion();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventAmountAfter <em>Propagator Calc Start Event Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Start Event Amount After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventAmountAfter
	 * @generated
	 */
	EClass getPropagatorCalcStartEventAmountAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventMoment <em>Propagator Calc Start Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Start Event Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventMoment
	 * @generated
	 */
	EClass getPropagatorCalcStartEventMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventSlopeAfter <em>Propagator Calc Start Event Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Start Event Slope After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventSlopeAfter
	 * @generated
	 */
	EClass getPropagatorCalcStartEventSlopeAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeEndMoment <em>Propagator Calc Stock Change End Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Stock Change End Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeEndMoment
	 * @generated
	 */
	EClass getPropagatorCalcStockChangeEndMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeEndSlopeImpulsion <em>Propagator Calc Stock Change End Slope Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Stock Change End Slope Impulsion</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeEndSlopeImpulsion
	 * @generated
	 */
	EClass getPropagatorCalcStockChangeEndSlopeImpulsion();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartMoment <em>Propagator Calc Stock Change Start Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Stock Change Start Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartMoment
	 * @generated
	 */
	EClass getPropagatorCalcStockChangeStartMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartSlopeImpulsion <em>Propagator Calc Stock Change Start Slope Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Stock Change Start Slope Impulsion</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartSlopeImpulsion
	 * @generated
	 */
	EClass getPropagatorCalcStockChangeStartSlopeImpulsion();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlope <em>Propagator Calc Event Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Event Slope</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlope
	 * @generated
	 */
	EClass getPropagatorCalcEventSlope();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlope#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlope#getConcreteParent()
	 * @see #getPropagatorCalcEventSlope()
	 * @generated
	 */
	EReference getPropagatorCalcEventSlope_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmount <em>Propagator Calc Event Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Event Amount</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmount
	 * @generated
	 */
	EClass getPropagatorCalcEventAmount();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmount#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmount#getConcreteParent()
	 * @see #getPropagatorCalcEventAmount()
	 * @generated
	 */
	EReference getPropagatorCalcEventAmount_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh <em>Propagator Layer Composite Event Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Layer Composite Event Refresh</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh
	 * @generated
	 */
	EClass getPropagatorLayerCompositeEventRefresh();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh#getConcreteParent()
	 * @see #getPropagatorLayerCompositeEventRefresh()
	 * @generated
	 */
	EReference getPropagatorLayerCompositeEventRefresh_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh#getAntecedenCalcDistributionInitialization <em>Anteceden Calc Distribution Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Anteceden Calc Distribution Initialization</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh#getAntecedenCalcDistributionInitialization()
	 * @see #getPropagatorLayerCompositeEventRefresh()
	 * @generated
	 */
	EReference getPropagatorLayerCompositeEventRefresh_AntecedenCalcDistributionInitialization();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts <em>Propagator Layer Distribution Amounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Layer Distribution Amounts</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts
	 * @generated
	 */
	EClass getPropagatorLayerDistributionAmounts();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts#getConcreteParent()
	 * @see #getPropagatorLayerDistributionAmounts()
	 * @generated
	 */
	EReference getPropagatorLayerDistributionAmounts_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts#getAntecedentLayerDistributionSlopes <em>Antecedent Layer Distribution Slopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Layer Distribution Slopes</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts#getAntecedentLayerDistributionSlopes()
	 * @see #getPropagatorLayerDistributionAmounts()
	 * @generated
	 */
	EReference getPropagatorLayerDistributionAmounts_AntecedentLayerDistributionSlopes();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes <em>Propagator Layer Distribution Slopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Layer Distribution Slopes</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes
	 * @generated
	 */
	EClass getPropagatorLayerDistributionSlopes();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes#getConcreteParent()
	 * @see #getPropagatorLayerDistributionSlopes()
	 * @generated
	 */
	EReference getPropagatorLayerDistributionSlopes_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes#getAntecedentCalcDistributionSequence <em>Antecedent Calc Distribution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Calc Distribution Sequence</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes#getAntecedentCalcDistributionSequence()
	 * @see #getPropagatorLayerDistributionSlopes()
	 * @generated
	 */
	EReference getPropagatorLayerDistributionSlopes_AntecedentCalcDistributionSequence();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution <em>Propagator Scope Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Scope Distribution</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution
	 * @generated
	 */
	EClass getPropagatorScopeDistribution();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimeContinuousCalcFactory getTimeContinuousCalcFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAmountAbsoluteImpl <em>Propagator Calc Amount Absolute Amount Absolute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAmountAbsoluteImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountAbsoluteAmountAbsolute()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE = eINSTANCE.getPropagatorCalcAmountAbsoluteAmountAbsolute();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAmountAfterImpl <em>Propagator Calc Amount Absolute Amount After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAmountAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountAbsoluteAmountAfter()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER = eINSTANCE.getPropagatorCalcAmountAbsoluteAmountAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAtomicAmountAbsoluteImpl <em>Propagator Calc Amount Absolute Atomic Amount Absolute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAtomicAmountAbsoluteImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountAbsoluteAtomicAmountAbsolute()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE = eINSTANCE.getPropagatorCalcAmountAbsoluteAtomicAmountAbsolute();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAtomicMomentImpl <em>Propagator Calc Amount Absolute Atomic Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountAbsoluteAtomicMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountAbsoluteAtomicMoment()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT = eINSTANCE.getPropagatorCalcAmountAbsoluteAtomicMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAmountAfterImpl <em>Propagator Calc Amount Impulsion Amount After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAmountAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountImpulsionAmountAfter()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER = eINSTANCE.getPropagatorCalcAmountImpulsionAmountAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAmountImpulsionImpl <em>Propagator Calc Amount Impulsion Amount Impulsion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAmountImpulsionImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountImpulsionAmountImpulsion()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION = eINSTANCE.getPropagatorCalcAmountImpulsionAmountImpulsion();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAtomicAmountImpulsionImpl <em>Propagator Calc Amount Impulsion Atomic Amount Impulsion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAtomicAmountImpulsionImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountImpulsionAtomicAmountImpulsion()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION = eINSTANCE.getPropagatorCalcAmountImpulsionAtomicAmountImpulsion();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAtomicMomentImpl <em>Propagator Calc Amount Impulsion Atomic Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcAmountImpulsionAtomicMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcAmountImpulsionAtomicMoment()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT = eINSTANCE.getPropagatorCalcAmountImpulsionAtomicMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeEndAmountImpulsionImpl <em>Propagator Calc Capacity Change End Amount Impulsion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeEndAmountImpulsionImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcCapacityChangeEndAmountImpulsion()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION = eINSTANCE.getPropagatorCalcCapacityChangeEndAmountImpulsion();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeEndMomentImpl <em>Propagator Calc Capacity Change End Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeEndMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcCapacityChangeEndMoment()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT = eINSTANCE.getPropagatorCalcCapacityChangeEndMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeStartAmountImpulsionImpl <em>Propagator Calc Capacity Change Start Amount Impulsion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeStartAmountImpulsionImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcCapacityChangeStartAmountImpulsion()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION = eINSTANCE.getPropagatorCalcCapacityChangeStartAmountImpulsion();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeStartMomentImpl <em>Propagator Calc Capacity Change Start Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcCapacityChangeStartMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcCapacityChangeStartMoment()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT = eINSTANCE.getPropagatorCalcCapacityChangeStartMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcChildEventAmountAfterImpl <em>Propagator Calc Child Event Amount After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcChildEventAmountAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcChildEventAmountAfter()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER = eINSTANCE.getPropagatorCalcChildEventAmountAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcChildEventMomentImpl <em>Propagator Calc Child Event Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcChildEventMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcChildEventMoment()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_CHILD_EVENT_MOMENT = eINSTANCE.getPropagatorCalcChildEventMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcChildEventSlopeAfterImpl <em>Propagator Calc Child Event Slope After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcChildEventSlopeAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcChildEventSlopeAfter()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER = eINSTANCE.getPropagatorCalcChildEventSlopeAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionChildEventsImpl <em>Propagator Calc Distribution Child Events</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionChildEventsImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcDistributionChildEvents()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS = eINSTANCE.getPropagatorCalcDistributionChildEvents();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS__CONCRETE_PARENT = eINSTANCE.getPropagatorCalcDistributionChildEvents_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionInitializationImpl <em>Propagator Calc Distribution Initialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionInitializationImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcDistributionInitialization()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION = eINSTANCE.getPropagatorCalcDistributionInitialization();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION__CONCRETE_PARENT = eINSTANCE.getPropagatorCalcDistributionInitialization_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionProvidedEventsImpl <em>Propagator Calc Distribution Provided Events</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionProvidedEventsImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcDistributionProvidedEvents()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS = eINSTANCE.getPropagatorCalcDistributionProvidedEvents();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__CONCRETE_PARENT = eINSTANCE.getPropagatorCalcDistributionProvidedEvents_ConcreteParent();

		/**
		 * The meta object literal for the '<em><b>Antecedent Layer Compositeevent Refresh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_LAYER_COMPOSITEEVENT_REFRESH = eINSTANCE.getPropagatorCalcDistributionProvidedEvents_AntecedentLayerCompositeeventRefresh();

		/**
		 * The meta object literal for the '<em><b>Antecedent Calc Distributionchild Events</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_CALC_DISTRIBUTIONCHILD_EVENTS = eINSTANCE.getPropagatorCalcDistributionProvidedEvents_AntecedentCalcDistributionchildEvents();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionSequenceImpl <em>Propagator Calc Distribution Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionSequenceImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcDistributionSequence()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE = eINSTANCE.getPropagatorCalcDistributionSequence();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__CONCRETE_PARENT = eINSTANCE.getPropagatorCalcDistributionSequence_ConcreteParent();

		/**
		 * The meta object literal for the '<em><b>Antecedent Calc Distribution Provided Events</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__ANTECEDENT_CALC_DISTRIBUTION_PROVIDED_EVENTS = eINSTANCE.getPropagatorCalcDistributionSequence_AntecedentCalcDistributionProvidedEvents();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEndEventMomentImpl <em>Propagator Calc End Event Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEndEventMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEndEventMoment()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_END_EVENT_MOMENT = eINSTANCE.getPropagatorCalcEndEventMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventAmountAfterImpl <em>Propagator Calc Event Amount After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventAmountAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventAmountAfter()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_EVENT_AMOUNT_AFTER = eINSTANCE.getPropagatorCalcEventAmountAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventAmountBeforeImpl <em>Propagator Calc Event Amount Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventAmountBeforeImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventAmountBefore()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE = eINSTANCE.getPropagatorCalcEventAmountBefore();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventMomentImpl <em>Propagator Calc Event Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventMoment()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_EVENT_MOMENT = eINSTANCE.getPropagatorCalcEventMoment();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_CALC_EVENT_MOMENT__CONCRETE_PARENT = eINSTANCE.getPropagatorCalcEventMoment_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventSlopeAfterImpl <em>Propagator Calc Event Slope After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventSlopeAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventSlopeAfter()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_EVENT_SLOPE_AFTER = eINSTANCE.getPropagatorCalcEventSlopeAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventSlopeBeforeImpl <em>Propagator Calc Event Slope Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventSlopeBeforeImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventSlopeBefore()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_EVENT_SLOPE_BEFORE = eINSTANCE.getPropagatorCalcEventSlopeBefore();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventsProviderRefreshEventsImpl <em>Propagator Calc Events Provider Refresh Events</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventsProviderRefreshEventsImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventsProviderRefreshEvents()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS = eINSTANCE.getPropagatorCalcEventsProviderRefreshEvents();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__CONCRETE_PARENT = eINSTANCE.getPropagatorCalcEventsProviderRefreshEvents_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteAtomicMomentImpl <em>Propagator Calc Slope Absolute Atomic Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteAtomicMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeAbsoluteAtomicMoment()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT = eINSTANCE.getPropagatorCalcSlopeAbsoluteAtomicMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteImpl <em>Propagator Calc Slope Absolute Atomic Slope Absolute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE = eINSTANCE.getPropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteSlopeAbsoluteImpl <em>Propagator Calc Slope Absolute Slope Absolute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteSlopeAbsoluteImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeAbsoluteSlopeAbsolute()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE = eINSTANCE.getPropagatorCalcSlopeAbsoluteSlopeAbsolute();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteSlopeAfterImpl <em>Propagator Calc Slope Absolute Slope After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeAbsoluteSlopeAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeAbsoluteSlopeAfter()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER = eINSTANCE.getPropagatorCalcSlopeAbsoluteSlopeAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionAtomicMomentImpl <em>Propagator Calc Slope Impulsion Atomic Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionAtomicMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeImpulsionAtomicMoment()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT = eINSTANCE.getPropagatorCalcSlopeImpulsionAtomicMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionAtomicSlopeImpulsionImpl <em>Propagator Calc Slope Impulsion Atomic Slope Impulsion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionAtomicSlopeImpulsionImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeImpulsionAtomicSlopeImpulsion()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION = eINSTANCE.getPropagatorCalcSlopeImpulsionAtomicSlopeImpulsion();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionSlopeAfterImpl <em>Propagator Calc Slope Impulsion Slope After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionSlopeAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeImpulsionSlopeAfter()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER = eINSTANCE.getPropagatorCalcSlopeImpulsionSlopeAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionSlopeImpulsionImpl <em>Propagator Calc Slope Impulsion Slope Impulsion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcSlopeImpulsionSlopeImpulsionImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcSlopeImpulsionSlopeImpulsion()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION = eINSTANCE.getPropagatorCalcSlopeImpulsionSlopeImpulsion();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStartEventAmountAfterImpl <em>Propagator Calc Start Event Amount After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStartEventAmountAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcStartEventAmountAfter()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER = eINSTANCE.getPropagatorCalcStartEventAmountAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStartEventMomentImpl <em>Propagator Calc Start Event Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStartEventMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcStartEventMoment()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_START_EVENT_MOMENT = eINSTANCE.getPropagatorCalcStartEventMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStartEventSlopeAfterImpl <em>Propagator Calc Start Event Slope After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStartEventSlopeAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcStartEventSlopeAfter()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER = eINSTANCE.getPropagatorCalcStartEventSlopeAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeEndMomentImpl <em>Propagator Calc Stock Change End Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeEndMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcStockChangeEndMoment()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT = eINSTANCE.getPropagatorCalcStockChangeEndMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeEndSlopeImpulsionImpl <em>Propagator Calc Stock Change End Slope Impulsion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeEndSlopeImpulsionImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcStockChangeEndSlopeImpulsion()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION = eINSTANCE.getPropagatorCalcStockChangeEndSlopeImpulsion();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeStartMomentImpl <em>Propagator Calc Stock Change Start Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeStartMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcStockChangeStartMoment()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT = eINSTANCE.getPropagatorCalcStockChangeStartMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeStartSlopeImpulsionImpl <em>Propagator Calc Stock Change Start Slope Impulsion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcStockChangeStartSlopeImpulsionImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcStockChangeStartSlopeImpulsion()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION = eINSTANCE.getPropagatorCalcStockChangeStartSlopeImpulsion();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventSlopeImpl <em>Propagator Calc Event Slope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventSlopeImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventSlope()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_EVENT_SLOPE = eINSTANCE.getPropagatorCalcEventSlope();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_CALC_EVENT_SLOPE__CONCRETE_PARENT = eINSTANCE.getPropagatorCalcEventSlope_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventAmountImpl <em>Propagator Calc Event Amount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventAmountImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorCalcEventAmount()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_EVENT_AMOUNT = eINSTANCE.getPropagatorCalcEventAmount();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_CALC_EVENT_AMOUNT__CONCRETE_PARENT = eINSTANCE.getPropagatorCalcEventAmount_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerCompositeEventRefreshImpl <em>Propagator Layer Composite Event Refresh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerCompositeEventRefreshImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorLayerCompositeEventRefresh()
		 * @generated
		 */
		EClass PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH = eINSTANCE.getPropagatorLayerCompositeEventRefresh();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT = eINSTANCE.getPropagatorLayerCompositeEventRefresh_ConcreteParent();

		/**
		 * The meta object literal for the '<em><b>Anteceden Calc Distribution Initialization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION = eINSTANCE.getPropagatorLayerCompositeEventRefresh_AntecedenCalcDistributionInitialization();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerDistributionAmountsImpl <em>Propagator Layer Distribution Amounts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerDistributionAmountsImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorLayerDistributionAmounts()
		 * @generated
		 */
		EClass PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS = eINSTANCE.getPropagatorLayerDistributionAmounts();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__CONCRETE_PARENT = eINSTANCE.getPropagatorLayerDistributionAmounts_ConcreteParent();

		/**
		 * The meta object literal for the '<em><b>Antecedent Layer Distribution Slopes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENT_LAYER_DISTRIBUTION_SLOPES = eINSTANCE.getPropagatorLayerDistributionAmounts_AntecedentLayerDistributionSlopes();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerDistributionSlopesImpl <em>Propagator Layer Distribution Slopes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerDistributionSlopesImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorLayerDistributionSlopes()
		 * @generated
		 */
		EClass PROPAGATOR_LAYER_DISTRIBUTION_SLOPES = eINSTANCE.getPropagatorLayerDistributionSlopes();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__CONCRETE_PARENT = eINSTANCE.getPropagatorLayerDistributionSlopes_ConcreteParent();

		/**
		 * The meta object literal for the '<em><b>Antecedent Calc Distribution Sequence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__ANTECEDENT_CALC_DISTRIBUTION_SEQUENCE = eINSTANCE.getPropagatorLayerDistributionSlopes_AntecedentCalcDistributionSequence();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorScopeDistributionImpl <em>Propagator Scope Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.PropagatorScopeDistributionImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getPropagatorScopeDistribution()
		 * @generated
		 */
		EClass PROPAGATOR_SCOPE_DISTRIBUTION = eINSTANCE.getPropagatorScopeDistribution();

	}

} //TimeContinuousCalcPackage
