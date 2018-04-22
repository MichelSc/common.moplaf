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
package com.misc.common.moplaf.time.continuous.calc.util;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;
import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionAbstract;
import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionEvent;
import com.misc.common.moplaf.time.continuous.PropagatorFunctionEventsProvider;

import com.misc.common.moplaf.time.continuous.calc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage
 * @generated
 */
public class TimeContinuousCalcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimeContinuousCalcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeContinuousCalcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TimeContinuousCalcPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeContinuousCalcSwitch<Adapter> modelSwitch =
		new TimeContinuousCalcSwitch<Adapter>() {
			@Override
			public Adapter caseScopeDistribution(ScopeDistribution object) {
				return createScopeDistributionAdapter();
			}
			@Override
			public Adapter caseCalcDistributionInitialization(CalcDistributionInitialization object) {
				return createCalcDistributionInitializationAdapter();
			}
			@Override
			public Adapter caseLayerCompositeEventRefresh(LayerCompositeEventRefresh object) {
				return createLayerCompositeEventRefreshAdapter();
			}
			@Override
			public Adapter caseCalcDistributionChildEvents(CalcDistributionChildEvents object) {
				return createCalcDistributionChildEventsAdapter();
			}
			@Override
			public Adapter caseCalcDistributionProvidedEvents(CalcDistributionProvidedEvents object) {
				return createCalcDistributionProvidedEventsAdapter();
			}
			@Override
			public Adapter caseCalcDistributionSequence(CalcDistributionSequence object) {
				return createCalcDistributionSequenceAdapter();
			}
			@Override
			public Adapter caseLayerDistributionSlopes(LayerDistributionSlopes object) {
				return createLayerDistributionSlopesAdapter();
			}
			@Override
			public Adapter caseLayerDistributionAmounts(LayerDistributionAmounts object) {
				return createLayerDistributionAmountsAdapter();
			}
			@Override
			public Adapter caseCalcAmountAbsoluteAmountAbsolute(CalcAmountAbsoluteAmountAbsolute object) {
				return createCalcAmountAbsoluteAmountAbsoluteAdapter();
			}
			@Override
			public Adapter caseCalcAmountAbsoluteAmountAfter(CalcAmountAbsoluteAmountAfter object) {
				return createCalcAmountAbsoluteAmountAfterAdapter();
			}
			@Override
			public Adapter caseCalcAmountAbsoluteAtomicAmountAbsolute(CalcAmountAbsoluteAtomicAmountAbsolute object) {
				return createCalcAmountAbsoluteAtomicAmountAbsoluteAdapter();
			}
			@Override
			public Adapter caseCalcAmountAbsoluteAtomicMoment(CalcAmountAbsoluteAtomicMoment object) {
				return createCalcAmountAbsoluteAtomicMomentAdapter();
			}
			@Override
			public Adapter caseCalcAmountDeltaAmountAfter(CalcAmountDeltaAmountAfter object) {
				return createCalcAmountDeltaAmountAfterAdapter();
			}
			@Override
			public Adapter caseCalcAmountDeltaAmountDelta(CalcAmountDeltaAmountDelta object) {
				return createCalcAmountDeltaAmountDeltaAdapter();
			}
			@Override
			public Adapter caseCalcAmountDeltaAtomicAmountDelta(CalcAmountDeltaAtomicAmountDelta object) {
				return createCalcAmountDeltaAtomicAmountDeltaAdapter();
			}
			@Override
			public Adapter caseCalcAmountDeltaAtomicMoment(CalcAmountDeltaAtomicMoment object) {
				return createCalcAmountDeltaAtomicMomentAdapter();
			}
			@Override
			public Adapter caseCalcCapacityChangeEndAmountDelta(CalcCapacityChangeEndAmountDelta object) {
				return createCalcCapacityChangeEndAmountDeltaAdapter();
			}
			@Override
			public Adapter caseCalcCapacityChangeEndMoment(CalcCapacityChangeEndMoment object) {
				return createCalcCapacityChangeEndMomentAdapter();
			}
			@Override
			public Adapter caseCalcCapacityChangeStartAmountDelta(CalcCapacityChangeStartAmountDelta object) {
				return createCalcCapacityChangeStartAmountDeltaAdapter();
			}
			@Override
			public Adapter caseCalcCapacityChangeStartMoment(CalcCapacityChangeStartMoment object) {
				return createCalcCapacityChangeStartMomentAdapter();
			}
			@Override
			public Adapter caseCalcChildEventAmountAfter(CalcChildEventAmountAfter object) {
				return createCalcChildEventAmountAfterAdapter();
			}
			@Override
			public Adapter caseCalcChildEventMoment(CalcChildEventMoment object) {
				return createCalcChildEventMomentAdapter();
			}
			@Override
			public Adapter caseCalcChildEventSlopeAfter(CalcChildEventSlopeAfter object) {
				return createCalcChildEventSlopeAfterAdapter();
			}
			@Override
			public Adapter caseCalcEndEventMoment(CalcEndEventMoment object) {
				return createCalcEndEventMomentAdapter();
			}
			@Override
			public Adapter caseCalcEventAmountAfter(CalcEventAmountAfter object) {
				return createCalcEventAmountAfterAdapter();
			}
			@Override
			public Adapter caseCalcEventAmountBefore(CalcEventAmountBefore object) {
				return createCalcEventAmountBeforeAdapter();
			}
			@Override
			public Adapter caseCalcEventMoment(CalcEventMoment object) {
				return createCalcEventMomentAdapter();
			}
			@Override
			public Adapter caseCalcEventSlopeAfter(CalcEventSlopeAfter object) {
				return createCalcEventSlopeAfterAdapter();
			}
			@Override
			public Adapter caseCalcEventSlopeBefore(CalcEventSlopeBefore object) {
				return createCalcEventSlopeBeforeAdapter();
			}
			@Override
			public Adapter caseCalcEventsProviderRefreshEvents(CalcEventsProviderRefreshEvents object) {
				return createCalcEventsProviderRefreshEventsAdapter();
			}
			@Override
			public Adapter caseCalcSlopeAbsoluteAtomicMoment(CalcSlopeAbsoluteAtomicMoment object) {
				return createCalcSlopeAbsoluteAtomicMomentAdapter();
			}
			@Override
			public Adapter caseCalcSlopeAbsoluteAtomicSlopeAbsolute(CalcSlopeAbsoluteAtomicSlopeAbsolute object) {
				return createCalcSlopeAbsoluteAtomicSlopeAbsoluteAdapter();
			}
			@Override
			public Adapter caseCalcSlopeAbsoluteSlopeAbsolute(CalcSlopeAbsoluteSlopeAbsolute object) {
				return createCalcSlopeAbsoluteSlopeAbsoluteAdapter();
			}
			@Override
			public Adapter caseCalcSlopeAbsoluteSlopeAfter(CalcSlopeAbsoluteSlopeAfter object) {
				return createCalcSlopeAbsoluteSlopeAfterAdapter();
			}
			@Override
			public Adapter caseCalcSlopeDeltaAtomicMoment(CalcSlopeDeltaAtomicMoment object) {
				return createCalcSlopeDeltaAtomicMomentAdapter();
			}
			@Override
			public Adapter caseCalcSlopeDeltaAtomicSlopeDelta(CalcSlopeDeltaAtomicSlopeDelta object) {
				return createCalcSlopeDeltaAtomicSlopeDeltaAdapter();
			}
			@Override
			public Adapter caseCalcSlopeDeltaSlopeAfter(CalcSlopeDeltaSlopeAfter object) {
				return createCalcSlopeDeltaSlopeAfterAdapter();
			}
			@Override
			public Adapter caseCalcSlopeDeltaSlopeDelta(CalcSlopeDeltaSlopeDelta object) {
				return createCalcSlopeDeltaSlopeDeltaAdapter();
			}
			@Override
			public Adapter caseCalcStartEventAmountAfter(CalcStartEventAmountAfter object) {
				return createCalcStartEventAmountAfterAdapter();
			}
			@Override
			public Adapter caseCalcStartEventMoment(CalcStartEventMoment object) {
				return createCalcStartEventMomentAdapter();
			}
			@Override
			public Adapter caseCalcStartEventSlopeAfter(CalcStartEventSlopeAfter object) {
				return createCalcStartEventSlopeAfterAdapter();
			}
			@Override
			public Adapter caseCalcStockChangeEndMoment(CalcStockChangeEndMoment object) {
				return createCalcStockChangeEndMomentAdapter();
			}
			@Override
			public Adapter caseCalcStockChangeEndSlopeDelta(CalcStockChangeEndSlopeDelta object) {
				return createCalcStockChangeEndSlopeDeltaAdapter();
			}
			@Override
			public Adapter caseCalcStockChangeStartMoment(CalcStockChangeStartMoment object) {
				return createCalcStockChangeStartMomentAdapter();
			}
			@Override
			public Adapter caseCalcStockChangeStartSlopeDelta(CalcStockChangeStartSlopeDelta object) {
				return createCalcStockChangeStartSlopeDeltaAdapter();
			}
			@Override
			public Adapter caseCalcEventSlope(CalcEventSlope object) {
				return createCalcEventSlopeAdapter();
			}
			@Override
			public Adapter caseCalcEventAmount(CalcEventAmount object) {
				return createCalcEventAmountAdapter();
			}
			@Override
			public Adapter casePropagatorFunction(PropagatorFunction object) {
				return createPropagatorFunctionAdapter();
			}
			@Override
			public Adapter casePropagatorFunctionBindings(PropagatorFunctionBindings object) {
				return createPropagatorFunctionBindingsAdapter();
			}
			@Override
			public Adapter casePropagatorFunctionDistributionAbstract(PropagatorFunctionDistributionAbstract object) {
				return createPropagatorFunctionDistributionAbstractAdapter();
			}
			@Override
			public Adapter casePropagatorFunctionDistribution(PropagatorFunctionDistribution object) {
				return createPropagatorFunctionDistributionAdapter();
			}
			@Override
			public Adapter casePropagatorFunctionDistributionEvent(PropagatorFunctionDistributionEvent object) {
				return createPropagatorFunctionDistributionEventAdapter();
			}
			@Override
			public Adapter casePropagatorFunctionEventsProvider(PropagatorFunctionEventsProvider object) {
				return createPropagatorFunctionEventsProviderAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.ScopeDistribution <em>Scope Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.ScopeDistribution
	 * @generated
	 */
	public Adapter createScopeDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionInitialization <em>Calc Distribution Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionInitialization
	 * @generated
	 */
	public Adapter createCalcDistributionInitializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh <em>Layer Composite Event Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh
	 * @generated
	 */
	public Adapter createLayerCompositeEventRefreshAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionChildEvents <em>Calc Distribution Child Events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionChildEvents
	 * @generated
	 */
	public Adapter createCalcDistributionChildEventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents <em>Calc Distribution Provided Events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents
	 * @generated
	 */
	public Adapter createCalcDistributionProvidedEventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionSequence <em>Calc Distribution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionSequence
	 * @generated
	 */
	public Adapter createCalcDistributionSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.LayerDistributionSlopes <em>Layer Distribution Slopes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.LayerDistributionSlopes
	 * @generated
	 */
	public Adapter createLayerDistributionSlopesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.LayerDistributionAmounts <em>Layer Distribution Amounts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.LayerDistributionAmounts
	 * @generated
	 */
	public Adapter createLayerDistributionAmountsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAmountAbsolute <em>Calc Amount Absolute Amount Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAmountAbsolute
	 * @generated
	 */
	public Adapter createCalcAmountAbsoluteAmountAbsoluteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAmountAfter <em>Calc Amount Absolute Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAmountAfter
	 * @generated
	 */
	public Adapter createCalcAmountAbsoluteAmountAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAtomicAmountAbsolute <em>Calc Amount Absolute Atomic Amount Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAtomicAmountAbsolute
	 * @generated
	 */
	public Adapter createCalcAmountAbsoluteAtomicAmountAbsoluteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAtomicMoment <em>Calc Amount Absolute Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAtomicMoment
	 * @generated
	 */
	public Adapter createCalcAmountAbsoluteAtomicMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAmountAfter <em>Calc Amount Delta Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAmountAfter
	 * @generated
	 */
	public Adapter createCalcAmountDeltaAmountAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAmountDelta <em>Calc Amount Delta Amount Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAmountDelta
	 * @generated
	 */
	public Adapter createCalcAmountDeltaAmountDeltaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAtomicAmountDelta <em>Calc Amount Delta Atomic Amount Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAtomicAmountDelta
	 * @generated
	 */
	public Adapter createCalcAmountDeltaAtomicAmountDeltaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAtomicMoment <em>Calc Amount Delta Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAtomicMoment
	 * @generated
	 */
	public Adapter createCalcAmountDeltaAtomicMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeEndAmountDelta <em>Calc Capacity Change End Amount Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeEndAmountDelta
	 * @generated
	 */
	public Adapter createCalcCapacityChangeEndAmountDeltaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeEndMoment <em>Calc Capacity Change End Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeEndMoment
	 * @generated
	 */
	public Adapter createCalcCapacityChangeEndMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeStartAmountDelta <em>Calc Capacity Change Start Amount Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeStartAmountDelta
	 * @generated
	 */
	public Adapter createCalcCapacityChangeStartAmountDeltaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeStartMoment <em>Calc Capacity Change Start Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeStartMoment
	 * @generated
	 */
	public Adapter createCalcCapacityChangeStartMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcChildEventAmountAfter <em>Calc Child Event Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcChildEventAmountAfter
	 * @generated
	 */
	public Adapter createCalcChildEventAmountAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcChildEventMoment <em>Calc Child Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcChildEventMoment
	 * @generated
	 */
	public Adapter createCalcChildEventMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcChildEventSlopeAfter <em>Calc Child Event Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcChildEventSlopeAfter
	 * @generated
	 */
	public Adapter createCalcChildEventSlopeAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEndEventMoment <em>Calc End Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEndEventMoment
	 * @generated
	 */
	public Adapter createCalcEndEventMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventAmountAfter <em>Calc Event Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventAmountAfter
	 * @generated
	 */
	public Adapter createCalcEventAmountAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventAmountBefore <em>Calc Event Amount Before</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventAmountBefore
	 * @generated
	 */
	public Adapter createCalcEventAmountBeforeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventMoment <em>Calc Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventMoment
	 * @generated
	 */
	public Adapter createCalcEventMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventSlopeAfter <em>Calc Event Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventSlopeAfter
	 * @generated
	 */
	public Adapter createCalcEventSlopeAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventSlopeBefore <em>Calc Event Slope Before</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventSlopeBefore
	 * @generated
	 */
	public Adapter createCalcEventSlopeBeforeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventsProviderRefreshEvents <em>Calc Events Provider Refresh Events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventsProviderRefreshEvents
	 * @generated
	 */
	public Adapter createCalcEventsProviderRefreshEventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteAtomicMoment <em>Calc Slope Absolute Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteAtomicMoment
	 * @generated
	 */
	public Adapter createCalcSlopeAbsoluteAtomicMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteAtomicSlopeAbsolute <em>Calc Slope Absolute Atomic Slope Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteAtomicSlopeAbsolute
	 * @generated
	 */
	public Adapter createCalcSlopeAbsoluteAtomicSlopeAbsoluteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteSlopeAbsolute <em>Calc Slope Absolute Slope Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteSlopeAbsolute
	 * @generated
	 */
	public Adapter createCalcSlopeAbsoluteSlopeAbsoluteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteSlopeAfter <em>Calc Slope Absolute Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteSlopeAfter
	 * @generated
	 */
	public Adapter createCalcSlopeAbsoluteSlopeAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaAtomicMoment <em>Calc Slope Delta Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaAtomicMoment
	 * @generated
	 */
	public Adapter createCalcSlopeDeltaAtomicMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaAtomicSlopeDelta <em>Calc Slope Delta Atomic Slope Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaAtomicSlopeDelta
	 * @generated
	 */
	public Adapter createCalcSlopeDeltaAtomicSlopeDeltaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaSlopeAfter <em>Calc Slope Delta Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaSlopeAfter
	 * @generated
	 */
	public Adapter createCalcSlopeDeltaSlopeAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaSlopeDelta <em>Calc Slope Delta Slope Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaSlopeDelta
	 * @generated
	 */
	public Adapter createCalcSlopeDeltaSlopeDeltaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcStartEventAmountAfter <em>Calc Start Event Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcStartEventAmountAfter
	 * @generated
	 */
	public Adapter createCalcStartEventAmountAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcStartEventMoment <em>Calc Start Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcStartEventMoment
	 * @generated
	 */
	public Adapter createCalcStartEventMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcStartEventSlopeAfter <em>Calc Start Event Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcStartEventSlopeAfter
	 * @generated
	 */
	public Adapter createCalcStartEventSlopeAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcStockChangeEndMoment <em>Calc Stock Change End Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcStockChangeEndMoment
	 * @generated
	 */
	public Adapter createCalcStockChangeEndMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcStockChangeEndSlopeDelta <em>Calc Stock Change End Slope Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcStockChangeEndSlopeDelta
	 * @generated
	 */
	public Adapter createCalcStockChangeEndSlopeDeltaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcStockChangeStartMoment <em>Calc Stock Change Start Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcStockChangeStartMoment
	 * @generated
	 */
	public Adapter createCalcStockChangeStartMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcStockChangeStartSlopeDelta <em>Calc Stock Change Start Slope Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcStockChangeStartSlopeDelta
	 * @generated
	 */
	public Adapter createCalcStockChangeStartSlopeDeltaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventSlope <em>Calc Event Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventSlope
	 * @generated
	 */
	public Adapter createCalcEventSlopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventAmount <em>Calc Event Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventAmount
	 * @generated
	 */
	public Adapter createCalcEventAmountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator2.PropagatorFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction
	 * @generated
	 */
	public Adapter createPropagatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator2.PropagatorFunctionBindings <em>Function Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunctionBindings
	 * @generated
	 */
	public Adapter createPropagatorFunctionBindingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionAbstract <em>Propagator Function Distribution Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionAbstract
	 * @generated
	 */
	public Adapter createPropagatorFunctionDistributionAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionEvent <em>Propagator Function Distribution Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionEvent
	 * @generated
	 */
	public Adapter createPropagatorFunctionDistributionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution <em>Propagator Function Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution
	 * @generated
	 */
	public Adapter createPropagatorFunctionDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.PropagatorFunctionEventsProvider <em>Propagator Function Events Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.PropagatorFunctionEventsProvider
	 * @generated
	 */
	public Adapter createPropagatorFunctionEventsProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TimeContinuousCalcAdapterFactory
