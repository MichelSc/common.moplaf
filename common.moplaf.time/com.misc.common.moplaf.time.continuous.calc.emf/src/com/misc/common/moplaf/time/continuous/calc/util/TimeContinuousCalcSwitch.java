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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage
 * @generated
 */
public class TimeContinuousCalcSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimeContinuousCalcPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeContinuousCalcSwitch() {
		if (modelPackage == null) {
			modelPackage = TimeContinuousCalcPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TimeContinuousCalcPackage.SCOPE_DISTRIBUTION: {
				ScopeDistribution scopeDistribution = (ScopeDistribution)theEObject;
				T result = caseScopeDistribution(scopeDistribution);
				if (result == null) result = casePropagatorFunctionDistribution(scopeDistribution);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(scopeDistribution);
				if (result == null) result = casePropagatorFunctionBindings(scopeDistribution);
				if (result == null) result = casePropagatorFunction(scopeDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_INITIALIZATION: {
				CalcDistributionInitialization calcDistributionInitialization = (CalcDistributionInitialization)theEObject;
				T result = caseCalcDistributionInitialization(calcDistributionInitialization);
				if (result == null) result = casePropagatorFunctionDistribution(calcDistributionInitialization);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcDistributionInitialization);
				if (result == null) result = casePropagatorFunctionBindings(calcDistributionInitialization);
				if (result == null) result = casePropagatorFunction(calcDistributionInitialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.LAYER_COMPOSITE_EVENT_REFRESH: {
				LayerCompositeEventRefresh layerCompositeEventRefresh = (LayerCompositeEventRefresh)theEObject;
				T result = caseLayerCompositeEventRefresh(layerCompositeEventRefresh);
				if (result == null) result = casePropagatorFunctionDistribution(layerCompositeEventRefresh);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(layerCompositeEventRefresh);
				if (result == null) result = casePropagatorFunctionBindings(layerCompositeEventRefresh);
				if (result == null) result = casePropagatorFunction(layerCompositeEventRefresh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_CHILD_EVENTS: {
				CalcDistributionChildEvents calcDistributionChildEvents = (CalcDistributionChildEvents)theEObject;
				T result = caseCalcDistributionChildEvents(calcDistributionChildEvents);
				if (result == null) result = casePropagatorFunctionDistribution(calcDistributionChildEvents);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcDistributionChildEvents);
				if (result == null) result = casePropagatorFunctionBindings(calcDistributionChildEvents);
				if (result == null) result = casePropagatorFunction(calcDistributionChildEvents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS: {
				CalcDistributionProvidedEvents calcDistributionProvidedEvents = (CalcDistributionProvidedEvents)theEObject;
				T result = caseCalcDistributionProvidedEvents(calcDistributionProvidedEvents);
				if (result == null) result = casePropagatorFunctionDistribution(calcDistributionProvidedEvents);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcDistributionProvidedEvents);
				if (result == null) result = casePropagatorFunctionBindings(calcDistributionProvidedEvents);
				if (result == null) result = casePropagatorFunction(calcDistributionProvidedEvents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_SEQUENCE: {
				CalcDistributionSequence calcDistributionSequence = (CalcDistributionSequence)theEObject;
				T result = caseCalcDistributionSequence(calcDistributionSequence);
				if (result == null) result = casePropagatorFunctionDistribution(calcDistributionSequence);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcDistributionSequence);
				if (result == null) result = casePropagatorFunctionBindings(calcDistributionSequence);
				if (result == null) result = casePropagatorFunction(calcDistributionSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.LAYER_DISTRIBUTION_SLOPES: {
				LayerDistributionSlopes layerDistributionSlopes = (LayerDistributionSlopes)theEObject;
				T result = caseLayerDistributionSlopes(layerDistributionSlopes);
				if (result == null) result = casePropagatorFunctionDistribution(layerDistributionSlopes);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(layerDistributionSlopes);
				if (result == null) result = casePropagatorFunctionBindings(layerDistributionSlopes);
				if (result == null) result = casePropagatorFunction(layerDistributionSlopes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.LAYER_DISTRIBUTION_AMOUNTS: {
				LayerDistributionAmounts layerDistributionAmounts = (LayerDistributionAmounts)theEObject;
				T result = caseLayerDistributionAmounts(layerDistributionAmounts);
				if (result == null) result = casePropagatorFunctionDistribution(layerDistributionAmounts);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(layerDistributionAmounts);
				if (result == null) result = casePropagatorFunctionBindings(layerDistributionAmounts);
				if (result == null) result = casePropagatorFunction(layerDistributionAmounts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE: {
				CalcAmountAbsoluteAmountAbsolute calcAmountAbsoluteAmountAbsolute = (CalcAmountAbsoluteAmountAbsolute)theEObject;
				T result = caseCalcAmountAbsoluteAmountAbsolute(calcAmountAbsoluteAmountAbsolute);
				if (result == null) result = caseCalcEventAmount(calcAmountAbsoluteAmountAbsolute);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcAmountAbsoluteAmountAbsolute);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcAmountAbsoluteAmountAbsolute);
				if (result == null) result = casePropagatorFunctionBindings(calcAmountAbsoluteAmountAbsolute);
				if (result == null) result = casePropagatorFunction(calcAmountAbsoluteAmountAbsolute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER: {
				CalcAmountAbsoluteAmountAfter calcAmountAbsoluteAmountAfter = (CalcAmountAbsoluteAmountAfter)theEObject;
				T result = caseCalcAmountAbsoluteAmountAfter(calcAmountAbsoluteAmountAfter);
				if (result == null) result = caseCalcEventAmountAfter(calcAmountAbsoluteAmountAfter);
				if (result == null) result = caseCalcEventAmount(calcAmountAbsoluteAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcAmountAbsoluteAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcAmountAbsoluteAmountAfter);
				if (result == null) result = casePropagatorFunctionBindings(calcAmountAbsoluteAmountAfter);
				if (result == null) result = casePropagatorFunction(calcAmountAbsoluteAmountAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE: {
				CalcAmountAbsoluteAtomicAmountAbsolute calcAmountAbsoluteAtomicAmountAbsolute = (CalcAmountAbsoluteAtomicAmountAbsolute)theEObject;
				T result = caseCalcAmountAbsoluteAtomicAmountAbsolute(calcAmountAbsoluteAtomicAmountAbsolute);
				if (result == null) result = caseCalcAmountAbsoluteAmountAbsolute(calcAmountAbsoluteAtomicAmountAbsolute);
				if (result == null) result = caseCalcEventAmount(calcAmountAbsoluteAtomicAmountAbsolute);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcAmountAbsoluteAtomicAmountAbsolute);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcAmountAbsoluteAtomicAmountAbsolute);
				if (result == null) result = casePropagatorFunctionBindings(calcAmountAbsoluteAtomicAmountAbsolute);
				if (result == null) result = casePropagatorFunction(calcAmountAbsoluteAtomicAmountAbsolute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT: {
				CalcAmountAbsoluteAtomicMoment calcAmountAbsoluteAtomicMoment = (CalcAmountAbsoluteAtomicMoment)theEObject;
				T result = caseCalcAmountAbsoluteAtomicMoment(calcAmountAbsoluteAtomicMoment);
				if (result == null) result = caseCalcEventMoment(calcAmountAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcAmountAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcAmountAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorFunctionBindings(calcAmountAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorFunction(calcAmountAbsoluteAtomicMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_AMOUNT_DELTA_AMOUNT_AFTER: {
				CalcAmountDeltaAmountAfter calcAmountDeltaAmountAfter = (CalcAmountDeltaAmountAfter)theEObject;
				T result = caseCalcAmountDeltaAmountAfter(calcAmountDeltaAmountAfter);
				if (result == null) result = caseCalcEventAmountAfter(calcAmountDeltaAmountAfter);
				if (result == null) result = caseCalcEventAmount(calcAmountDeltaAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcAmountDeltaAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcAmountDeltaAmountAfter);
				if (result == null) result = casePropagatorFunctionBindings(calcAmountDeltaAmountAfter);
				if (result == null) result = casePropagatorFunction(calcAmountDeltaAmountAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_AMOUNT_DELTA_AMOUNT_DELTA: {
				CalcAmountDeltaAmountDelta calcAmountDeltaAmountDelta = (CalcAmountDeltaAmountDelta)theEObject;
				T result = caseCalcAmountDeltaAmountDelta(calcAmountDeltaAmountDelta);
				if (result == null) result = caseCalcEventAmount(calcAmountDeltaAmountDelta);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcAmountDeltaAmountDelta);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcAmountDeltaAmountDelta);
				if (result == null) result = casePropagatorFunctionBindings(calcAmountDeltaAmountDelta);
				if (result == null) result = casePropagatorFunction(calcAmountDeltaAmountDelta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA: {
				CalcAmountDeltaAtomicAmountDelta calcAmountDeltaAtomicAmountDelta = (CalcAmountDeltaAtomicAmountDelta)theEObject;
				T result = caseCalcAmountDeltaAtomicAmountDelta(calcAmountDeltaAtomicAmountDelta);
				if (result == null) result = caseCalcAmountDeltaAmountDelta(calcAmountDeltaAtomicAmountDelta);
				if (result == null) result = caseCalcEventAmount(calcAmountDeltaAtomicAmountDelta);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcAmountDeltaAtomicAmountDelta);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcAmountDeltaAtomicAmountDelta);
				if (result == null) result = casePropagatorFunctionBindings(calcAmountDeltaAtomicAmountDelta);
				if (result == null) result = casePropagatorFunction(calcAmountDeltaAtomicAmountDelta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_AMOUNT_DELTA_ATOMIC_MOMENT: {
				CalcAmountDeltaAtomicMoment calcAmountDeltaAtomicMoment = (CalcAmountDeltaAtomicMoment)theEObject;
				T result = caseCalcAmountDeltaAtomicMoment(calcAmountDeltaAtomicMoment);
				if (result == null) result = caseCalcEventMoment(calcAmountDeltaAtomicMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcAmountDeltaAtomicMoment);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcAmountDeltaAtomicMoment);
				if (result == null) result = casePropagatorFunctionBindings(calcAmountDeltaAtomicMoment);
				if (result == null) result = casePropagatorFunction(calcAmountDeltaAtomicMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA: {
				CalcCapacityChangeEndAmountDelta calcCapacityChangeEndAmountDelta = (CalcCapacityChangeEndAmountDelta)theEObject;
				T result = caseCalcCapacityChangeEndAmountDelta(calcCapacityChangeEndAmountDelta);
				if (result == null) result = caseCalcAmountDeltaAmountDelta(calcCapacityChangeEndAmountDelta);
				if (result == null) result = caseCalcEventAmount(calcCapacityChangeEndAmountDelta);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcCapacityChangeEndAmountDelta);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcCapacityChangeEndAmountDelta);
				if (result == null) result = casePropagatorFunctionBindings(calcCapacityChangeEndAmountDelta);
				if (result == null) result = casePropagatorFunction(calcCapacityChangeEndAmountDelta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_CAPACITY_CHANGE_END_MOMENT: {
				CalcCapacityChangeEndMoment calcCapacityChangeEndMoment = (CalcCapacityChangeEndMoment)theEObject;
				T result = caseCalcCapacityChangeEndMoment(calcCapacityChangeEndMoment);
				if (result == null) result = caseCalcEventMoment(calcCapacityChangeEndMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcCapacityChangeEndMoment);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcCapacityChangeEndMoment);
				if (result == null) result = casePropagatorFunctionBindings(calcCapacityChangeEndMoment);
				if (result == null) result = casePropagatorFunction(calcCapacityChangeEndMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA: {
				CalcCapacityChangeStartAmountDelta calcCapacityChangeStartAmountDelta = (CalcCapacityChangeStartAmountDelta)theEObject;
				T result = caseCalcCapacityChangeStartAmountDelta(calcCapacityChangeStartAmountDelta);
				if (result == null) result = caseCalcAmountDeltaAmountDelta(calcCapacityChangeStartAmountDelta);
				if (result == null) result = caseCalcEventAmount(calcCapacityChangeStartAmountDelta);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcCapacityChangeStartAmountDelta);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcCapacityChangeStartAmountDelta);
				if (result == null) result = casePropagatorFunctionBindings(calcCapacityChangeStartAmountDelta);
				if (result == null) result = casePropagatorFunction(calcCapacityChangeStartAmountDelta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_CAPACITY_CHANGE_START_MOMENT: {
				CalcCapacityChangeStartMoment calcCapacityChangeStartMoment = (CalcCapacityChangeStartMoment)theEObject;
				T result = caseCalcCapacityChangeStartMoment(calcCapacityChangeStartMoment);
				if (result == null) result = caseCalcEventMoment(calcCapacityChangeStartMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcCapacityChangeStartMoment);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcCapacityChangeStartMoment);
				if (result == null) result = casePropagatorFunctionBindings(calcCapacityChangeStartMoment);
				if (result == null) result = casePropagatorFunction(calcCapacityChangeStartMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_CHILD_EVENT_AMOUNT_AFTER: {
				CalcChildEventAmountAfter calcChildEventAmountAfter = (CalcChildEventAmountAfter)theEObject;
				T result = caseCalcChildEventAmountAfter(calcChildEventAmountAfter);
				if (result == null) result = caseCalcEventAmountAfter(calcChildEventAmountAfter);
				if (result == null) result = caseCalcEventAmount(calcChildEventAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcChildEventAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcChildEventAmountAfter);
				if (result == null) result = casePropagatorFunctionBindings(calcChildEventAmountAfter);
				if (result == null) result = casePropagatorFunction(calcChildEventAmountAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_CHILD_EVENT_MOMENT: {
				CalcChildEventMoment calcChildEventMoment = (CalcChildEventMoment)theEObject;
				T result = caseCalcChildEventMoment(calcChildEventMoment);
				if (result == null) result = caseCalcEventMoment(calcChildEventMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcChildEventMoment);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcChildEventMoment);
				if (result == null) result = casePropagatorFunctionBindings(calcChildEventMoment);
				if (result == null) result = casePropagatorFunction(calcChildEventMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_CHILD_EVENT_SLOPE_AFTER: {
				CalcChildEventSlopeAfter calcChildEventSlopeAfter = (CalcChildEventSlopeAfter)theEObject;
				T result = caseCalcChildEventSlopeAfter(calcChildEventSlopeAfter);
				if (result == null) result = caseCalcEventSlopeAfter(calcChildEventSlopeAfter);
				if (result == null) result = caseCalcEventSlope(calcChildEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcChildEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcChildEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionBindings(calcChildEventSlopeAfter);
				if (result == null) result = casePropagatorFunction(calcChildEventSlopeAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_END_EVENT_MOMENT: {
				CalcEndEventMoment calcEndEventMoment = (CalcEndEventMoment)theEObject;
				T result = caseCalcEndEventMoment(calcEndEventMoment);
				if (result == null) result = caseCalcEventMoment(calcEndEventMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcEndEventMoment);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcEndEventMoment);
				if (result == null) result = casePropagatorFunctionBindings(calcEndEventMoment);
				if (result == null) result = casePropagatorFunction(calcEndEventMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_EVENT_AMOUNT_AFTER: {
				CalcEventAmountAfter calcEventAmountAfter = (CalcEventAmountAfter)theEObject;
				T result = caseCalcEventAmountAfter(calcEventAmountAfter);
				if (result == null) result = caseCalcEventAmount(calcEventAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcEventAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcEventAmountAfter);
				if (result == null) result = casePropagatorFunctionBindings(calcEventAmountAfter);
				if (result == null) result = casePropagatorFunction(calcEventAmountAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_EVENT_AMOUNT_BEFORE: {
				CalcEventAmountBefore calcEventAmountBefore = (CalcEventAmountBefore)theEObject;
				T result = caseCalcEventAmountBefore(calcEventAmountBefore);
				if (result == null) result = caseCalcEventAmount(calcEventAmountBefore);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcEventAmountBefore);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcEventAmountBefore);
				if (result == null) result = casePropagatorFunctionBindings(calcEventAmountBefore);
				if (result == null) result = casePropagatorFunction(calcEventAmountBefore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_EVENT_MOMENT: {
				CalcEventMoment calcEventMoment = (CalcEventMoment)theEObject;
				T result = caseCalcEventMoment(calcEventMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcEventMoment);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcEventMoment);
				if (result == null) result = casePropagatorFunctionBindings(calcEventMoment);
				if (result == null) result = casePropagatorFunction(calcEventMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_EVENT_SLOPE_AFTER: {
				CalcEventSlopeAfter calcEventSlopeAfter = (CalcEventSlopeAfter)theEObject;
				T result = caseCalcEventSlopeAfter(calcEventSlopeAfter);
				if (result == null) result = caseCalcEventSlope(calcEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionBindings(calcEventSlopeAfter);
				if (result == null) result = casePropagatorFunction(calcEventSlopeAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_EVENT_SLOPE_BEFORE: {
				CalcEventSlopeBefore calcEventSlopeBefore = (CalcEventSlopeBefore)theEObject;
				T result = caseCalcEventSlopeBefore(calcEventSlopeBefore);
				if (result == null) result = caseCalcEventSlope(calcEventSlopeBefore);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcEventSlopeBefore);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcEventSlopeBefore);
				if (result == null) result = casePropagatorFunctionBindings(calcEventSlopeBefore);
				if (result == null) result = casePropagatorFunction(calcEventSlopeBefore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_EVENTS_PROVIDER_REFRESH_EVENTS: {
				CalcEventsProviderRefreshEvents calcEventsProviderRefreshEvents = (CalcEventsProviderRefreshEvents)theEObject;
				T result = caseCalcEventsProviderRefreshEvents(calcEventsProviderRefreshEvents);
				if (result == null) result = casePropagatorFunctionEventsProvider(calcEventsProviderRefreshEvents);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcEventsProviderRefreshEvents);
				if (result == null) result = casePropagatorFunctionBindings(calcEventsProviderRefreshEvents);
				if (result == null) result = casePropagatorFunction(calcEventsProviderRefreshEvents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT: {
				CalcSlopeAbsoluteAtomicMoment calcSlopeAbsoluteAtomicMoment = (CalcSlopeAbsoluteAtomicMoment)theEObject;
				T result = caseCalcSlopeAbsoluteAtomicMoment(calcSlopeAbsoluteAtomicMoment);
				if (result == null) result = caseCalcEventMoment(calcSlopeAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcSlopeAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcSlopeAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorFunctionBindings(calcSlopeAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorFunction(calcSlopeAbsoluteAtomicMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE: {
				CalcSlopeAbsoluteAtomicSlopeAbsolute calcSlopeAbsoluteAtomicSlopeAbsolute = (CalcSlopeAbsoluteAtomicSlopeAbsolute)theEObject;
				T result = caseCalcSlopeAbsoluteAtomicSlopeAbsolute(calcSlopeAbsoluteAtomicSlopeAbsolute);
				if (result == null) result = caseCalcSlopeAbsoluteSlopeAbsolute(calcSlopeAbsoluteAtomicSlopeAbsolute);
				if (result == null) result = caseCalcEventSlope(calcSlopeAbsoluteAtomicSlopeAbsolute);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcSlopeAbsoluteAtomicSlopeAbsolute);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcSlopeAbsoluteAtomicSlopeAbsolute);
				if (result == null) result = casePropagatorFunctionBindings(calcSlopeAbsoluteAtomicSlopeAbsolute);
				if (result == null) result = casePropagatorFunction(calcSlopeAbsoluteAtomicSlopeAbsolute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE: {
				CalcSlopeAbsoluteSlopeAbsolute calcSlopeAbsoluteSlopeAbsolute = (CalcSlopeAbsoluteSlopeAbsolute)theEObject;
				T result = caseCalcSlopeAbsoluteSlopeAbsolute(calcSlopeAbsoluteSlopeAbsolute);
				if (result == null) result = caseCalcEventSlope(calcSlopeAbsoluteSlopeAbsolute);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcSlopeAbsoluteSlopeAbsolute);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcSlopeAbsoluteSlopeAbsolute);
				if (result == null) result = casePropagatorFunctionBindings(calcSlopeAbsoluteSlopeAbsolute);
				if (result == null) result = casePropagatorFunction(calcSlopeAbsoluteSlopeAbsolute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_SLOPE_ABSOLUTE_SLOPE_AFTER: {
				CalcSlopeAbsoluteSlopeAfter calcSlopeAbsoluteSlopeAfter = (CalcSlopeAbsoluteSlopeAfter)theEObject;
				T result = caseCalcSlopeAbsoluteSlopeAfter(calcSlopeAbsoluteSlopeAfter);
				if (result == null) result = caseCalcEventSlopeAfter(calcSlopeAbsoluteSlopeAfter);
				if (result == null) result = caseCalcEventSlope(calcSlopeAbsoluteSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcSlopeAbsoluteSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcSlopeAbsoluteSlopeAfter);
				if (result == null) result = casePropagatorFunctionBindings(calcSlopeAbsoluteSlopeAfter);
				if (result == null) result = casePropagatorFunction(calcSlopeAbsoluteSlopeAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_SLOPE_DELTA_ATOMIC_MOMENT: {
				CalcSlopeDeltaAtomicMoment calcSlopeDeltaAtomicMoment = (CalcSlopeDeltaAtomicMoment)theEObject;
				T result = caseCalcSlopeDeltaAtomicMoment(calcSlopeDeltaAtomicMoment);
				if (result == null) result = caseCalcEventMoment(calcSlopeDeltaAtomicMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcSlopeDeltaAtomicMoment);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcSlopeDeltaAtomicMoment);
				if (result == null) result = casePropagatorFunctionBindings(calcSlopeDeltaAtomicMoment);
				if (result == null) result = casePropagatorFunction(calcSlopeDeltaAtomicMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA: {
				CalcSlopeDeltaAtomicSlopeDelta calcSlopeDeltaAtomicSlopeDelta = (CalcSlopeDeltaAtomicSlopeDelta)theEObject;
				T result = caseCalcSlopeDeltaAtomicSlopeDelta(calcSlopeDeltaAtomicSlopeDelta);
				if (result == null) result = caseCalcSlopeDeltaSlopeDelta(calcSlopeDeltaAtomicSlopeDelta);
				if (result == null) result = caseCalcEventSlope(calcSlopeDeltaAtomicSlopeDelta);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcSlopeDeltaAtomicSlopeDelta);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcSlopeDeltaAtomicSlopeDelta);
				if (result == null) result = casePropagatorFunctionBindings(calcSlopeDeltaAtomicSlopeDelta);
				if (result == null) result = casePropagatorFunction(calcSlopeDeltaAtomicSlopeDelta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_SLOPE_DELTA_SLOPE_AFTER: {
				CalcSlopeDeltaSlopeAfter calcSlopeDeltaSlopeAfter = (CalcSlopeDeltaSlopeAfter)theEObject;
				T result = caseCalcSlopeDeltaSlopeAfter(calcSlopeDeltaSlopeAfter);
				if (result == null) result = caseCalcEventSlopeAfter(calcSlopeDeltaSlopeAfter);
				if (result == null) result = caseCalcEventSlope(calcSlopeDeltaSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcSlopeDeltaSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcSlopeDeltaSlopeAfter);
				if (result == null) result = casePropagatorFunctionBindings(calcSlopeDeltaSlopeAfter);
				if (result == null) result = casePropagatorFunction(calcSlopeDeltaSlopeAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_SLOPE_DELTA_SLOPE_DELTA: {
				CalcSlopeDeltaSlopeDelta calcSlopeDeltaSlopeDelta = (CalcSlopeDeltaSlopeDelta)theEObject;
				T result = caseCalcSlopeDeltaSlopeDelta(calcSlopeDeltaSlopeDelta);
				if (result == null) result = caseCalcEventSlope(calcSlopeDeltaSlopeDelta);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcSlopeDeltaSlopeDelta);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcSlopeDeltaSlopeDelta);
				if (result == null) result = casePropagatorFunctionBindings(calcSlopeDeltaSlopeDelta);
				if (result == null) result = casePropagatorFunction(calcSlopeDeltaSlopeDelta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_START_EVENT_AMOUNT_AFTER: {
				CalcStartEventAmountAfter calcStartEventAmountAfter = (CalcStartEventAmountAfter)theEObject;
				T result = caseCalcStartEventAmountAfter(calcStartEventAmountAfter);
				if (result == null) result = caseCalcEventAmountAfter(calcStartEventAmountAfter);
				if (result == null) result = caseCalcEventAmount(calcStartEventAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcStartEventAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcStartEventAmountAfter);
				if (result == null) result = casePropagatorFunctionBindings(calcStartEventAmountAfter);
				if (result == null) result = casePropagatorFunction(calcStartEventAmountAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_START_EVENT_MOMENT: {
				CalcStartEventMoment calcStartEventMoment = (CalcStartEventMoment)theEObject;
				T result = caseCalcStartEventMoment(calcStartEventMoment);
				if (result == null) result = caseCalcEventMoment(calcStartEventMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcStartEventMoment);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcStartEventMoment);
				if (result == null) result = casePropagatorFunctionBindings(calcStartEventMoment);
				if (result == null) result = casePropagatorFunction(calcStartEventMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_START_EVENT_SLOPE_AFTER: {
				CalcStartEventSlopeAfter calcStartEventSlopeAfter = (CalcStartEventSlopeAfter)theEObject;
				T result = caseCalcStartEventSlopeAfter(calcStartEventSlopeAfter);
				if (result == null) result = caseCalcEventSlopeAfter(calcStartEventSlopeAfter);
				if (result == null) result = caseCalcEventSlope(calcStartEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcStartEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcStartEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionBindings(calcStartEventSlopeAfter);
				if (result == null) result = casePropagatorFunction(calcStartEventSlopeAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_STOCK_CHANGE_END_MOMENT: {
				CalcStockChangeEndMoment calcStockChangeEndMoment = (CalcStockChangeEndMoment)theEObject;
				T result = caseCalcStockChangeEndMoment(calcStockChangeEndMoment);
				if (result == null) result = caseCalcEventMoment(calcStockChangeEndMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcStockChangeEndMoment);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcStockChangeEndMoment);
				if (result == null) result = casePropagatorFunctionBindings(calcStockChangeEndMoment);
				if (result == null) result = casePropagatorFunction(calcStockChangeEndMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_STOCK_CHANGE_END_SLOPE_DELTA: {
				CalcStockChangeEndSlopeDelta calcStockChangeEndSlopeDelta = (CalcStockChangeEndSlopeDelta)theEObject;
				T result = caseCalcStockChangeEndSlopeDelta(calcStockChangeEndSlopeDelta);
				if (result == null) result = caseCalcSlopeDeltaSlopeDelta(calcStockChangeEndSlopeDelta);
				if (result == null) result = caseCalcEventSlope(calcStockChangeEndSlopeDelta);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcStockChangeEndSlopeDelta);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcStockChangeEndSlopeDelta);
				if (result == null) result = casePropagatorFunctionBindings(calcStockChangeEndSlopeDelta);
				if (result == null) result = casePropagatorFunction(calcStockChangeEndSlopeDelta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_STOCK_CHANGE_START_MOMENT: {
				CalcStockChangeStartMoment calcStockChangeStartMoment = (CalcStockChangeStartMoment)theEObject;
				T result = caseCalcStockChangeStartMoment(calcStockChangeStartMoment);
				if (result == null) result = caseCalcEventMoment(calcStockChangeStartMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcStockChangeStartMoment);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcStockChangeStartMoment);
				if (result == null) result = casePropagatorFunctionBindings(calcStockChangeStartMoment);
				if (result == null) result = casePropagatorFunction(calcStockChangeStartMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_STOCK_CHANGE_START_SLOPE_DELTA: {
				CalcStockChangeStartSlopeDelta calcStockChangeStartSlopeDelta = (CalcStockChangeStartSlopeDelta)theEObject;
				T result = caseCalcStockChangeStartSlopeDelta(calcStockChangeStartSlopeDelta);
				if (result == null) result = caseCalcSlopeDeltaSlopeDelta(calcStockChangeStartSlopeDelta);
				if (result == null) result = caseCalcEventSlope(calcStockChangeStartSlopeDelta);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcStockChangeStartSlopeDelta);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcStockChangeStartSlopeDelta);
				if (result == null) result = casePropagatorFunctionBindings(calcStockChangeStartSlopeDelta);
				if (result == null) result = casePropagatorFunction(calcStockChangeStartSlopeDelta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_EVENT_SLOPE: {
				CalcEventSlope calcEventSlope = (CalcEventSlope)theEObject;
				T result = caseCalcEventSlope(calcEventSlope);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcEventSlope);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcEventSlope);
				if (result == null) result = casePropagatorFunctionBindings(calcEventSlope);
				if (result == null) result = casePropagatorFunction(calcEventSlope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.CALC_EVENT_AMOUNT: {
				CalcEventAmount calcEventAmount = (CalcEventAmount)theEObject;
				T result = caseCalcEventAmount(calcEventAmount);
				if (result == null) result = casePropagatorFunctionDistributionEvent(calcEventAmount);
				if (result == null) result = casePropagatorFunctionDistributionAbstract(calcEventAmount);
				if (result == null) result = casePropagatorFunctionBindings(calcEventAmount);
				if (result == null) result = casePropagatorFunction(calcEventAmount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopeDistribution(ScopeDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Distribution Initialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Distribution Initialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcDistributionInitialization(CalcDistributionInitialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Composite Event Refresh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Composite Event Refresh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerCompositeEventRefresh(LayerCompositeEventRefresh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Distribution Child Events</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Distribution Child Events</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcDistributionChildEvents(CalcDistributionChildEvents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Distribution Provided Events</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Distribution Provided Events</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcDistributionProvidedEvents(CalcDistributionProvidedEvents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Distribution Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Distribution Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcDistributionSequence(CalcDistributionSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Distribution Slopes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Distribution Slopes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerDistributionSlopes(LayerDistributionSlopes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Distribution Amounts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Distribution Amounts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerDistributionAmounts(LayerDistributionAmounts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Amount Absolute Amount Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Amount Absolute Amount Absolute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcAmountAbsoluteAmountAbsolute(CalcAmountAbsoluteAmountAbsolute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Amount Absolute Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Amount Absolute Amount After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcAmountAbsoluteAmountAfter(CalcAmountAbsoluteAmountAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Amount Absolute Atomic Amount Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Amount Absolute Atomic Amount Absolute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcAmountAbsoluteAtomicAmountAbsolute(CalcAmountAbsoluteAtomicAmountAbsolute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Amount Absolute Atomic Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Amount Absolute Atomic Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcAmountAbsoluteAtomicMoment(CalcAmountAbsoluteAtomicMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Amount Delta Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Amount Delta Amount After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcAmountDeltaAmountAfter(CalcAmountDeltaAmountAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Amount Delta Amount Delta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Amount Delta Amount Delta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcAmountDeltaAmountDelta(CalcAmountDeltaAmountDelta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Amount Delta Atomic Amount Delta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Amount Delta Atomic Amount Delta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcAmountDeltaAtomicAmountDelta(CalcAmountDeltaAtomicAmountDelta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Amount Delta Atomic Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Amount Delta Atomic Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcAmountDeltaAtomicMoment(CalcAmountDeltaAtomicMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Capacity Change End Amount Delta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Capacity Change End Amount Delta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcCapacityChangeEndAmountDelta(CalcCapacityChangeEndAmountDelta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Capacity Change End Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Capacity Change End Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcCapacityChangeEndMoment(CalcCapacityChangeEndMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Capacity Change Start Amount Delta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Capacity Change Start Amount Delta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcCapacityChangeStartAmountDelta(CalcCapacityChangeStartAmountDelta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Capacity Change Start Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Capacity Change Start Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcCapacityChangeStartMoment(CalcCapacityChangeStartMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Child Event Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Child Event Amount After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcChildEventAmountAfter(CalcChildEventAmountAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Child Event Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Child Event Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcChildEventMoment(CalcChildEventMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Child Event Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Child Event Slope After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcChildEventSlopeAfter(CalcChildEventSlopeAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc End Event Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc End Event Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcEndEventMoment(CalcEndEventMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Event Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Event Amount After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcEventAmountAfter(CalcEventAmountAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Event Amount Before</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Event Amount Before</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcEventAmountBefore(CalcEventAmountBefore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Event Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Event Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcEventMoment(CalcEventMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Event Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Event Slope After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcEventSlopeAfter(CalcEventSlopeAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Event Slope Before</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Event Slope Before</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcEventSlopeBefore(CalcEventSlopeBefore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Events Provider Refresh Events</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Events Provider Refresh Events</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcEventsProviderRefreshEvents(CalcEventsProviderRefreshEvents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Slope Absolute Atomic Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Slope Absolute Atomic Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcSlopeAbsoluteAtomicMoment(CalcSlopeAbsoluteAtomicMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Slope Absolute Atomic Slope Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Slope Absolute Atomic Slope Absolute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcSlopeAbsoluteAtomicSlopeAbsolute(CalcSlopeAbsoluteAtomicSlopeAbsolute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Slope Absolute Slope Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Slope Absolute Slope Absolute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcSlopeAbsoluteSlopeAbsolute(CalcSlopeAbsoluteSlopeAbsolute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Slope Absolute Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Slope Absolute Slope After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcSlopeAbsoluteSlopeAfter(CalcSlopeAbsoluteSlopeAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Slope Delta Atomic Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Slope Delta Atomic Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcSlopeDeltaAtomicMoment(CalcSlopeDeltaAtomicMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Slope Delta Atomic Slope Delta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Slope Delta Atomic Slope Delta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcSlopeDeltaAtomicSlopeDelta(CalcSlopeDeltaAtomicSlopeDelta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Slope Delta Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Slope Delta Slope After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcSlopeDeltaSlopeAfter(CalcSlopeDeltaSlopeAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Slope Delta Slope Delta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Slope Delta Slope Delta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcSlopeDeltaSlopeDelta(CalcSlopeDeltaSlopeDelta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Start Event Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Start Event Amount After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcStartEventAmountAfter(CalcStartEventAmountAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Start Event Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Start Event Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcStartEventMoment(CalcStartEventMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Start Event Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Start Event Slope After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcStartEventSlopeAfter(CalcStartEventSlopeAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Stock Change End Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Stock Change End Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcStockChangeEndMoment(CalcStockChangeEndMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Stock Change End Slope Delta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Stock Change End Slope Delta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcStockChangeEndSlopeDelta(CalcStockChangeEndSlopeDelta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Stock Change Start Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Stock Change Start Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcStockChangeStartMoment(CalcStockChangeStartMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Stock Change Start Slope Delta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Stock Change Start Slope Delta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcStockChangeStartSlopeDelta(CalcStockChangeStartSlopeDelta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Event Slope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Event Slope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcEventSlope(CalcEventSlope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Event Amount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Event Amount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcEventAmount(CalcEventAmount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorFunction(PropagatorFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Bindings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorFunctionBindings(PropagatorFunctionBindings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Function Distribution Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Function Distribution Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorFunctionDistributionAbstract(PropagatorFunctionDistributionAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Function Distribution Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Function Distribution Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorFunctionDistributionEvent(PropagatorFunctionDistributionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Function Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Function Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorFunctionDistribution(PropagatorFunctionDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Function Events Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Function Events Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorFunctionEventsProvider(PropagatorFunctionEventsProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TimeContinuousCalcSwitch
