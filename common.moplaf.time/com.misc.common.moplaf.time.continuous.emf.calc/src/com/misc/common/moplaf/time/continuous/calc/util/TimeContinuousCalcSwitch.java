/**
 */
package com.misc.common.moplaf.time.continuous.calc.util;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;
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
			case TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION: {
				PropagatorScopeDistribution propagatorScopeDistribution = (PropagatorScopeDistribution)theEObject;
				T result = casePropagatorScopeDistribution(propagatorScopeDistribution);
				if (result == null) result = casePropagatorFunctionDistribution(propagatorScopeDistribution);
				if (result == null) result = casePropagatorFunctionBindings(propagatorScopeDistribution);
				if (result == null) result = casePropagatorFunction(propagatorScopeDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION: {
				PropagatorCalcDistributionInitialization propagatorCalcDistributionInitialization = (PropagatorCalcDistributionInitialization)theEObject;
				T result = casePropagatorCalcDistributionInitialization(propagatorCalcDistributionInitialization);
				if (result == null) result = casePropagatorFunctionDistribution(propagatorCalcDistributionInitialization);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcDistributionInitialization);
				if (result == null) result = casePropagatorFunction(propagatorCalcDistributionInitialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH: {
				PropagatorLayerCompositeEventRefresh propagatorLayerCompositeEventRefresh = (PropagatorLayerCompositeEventRefresh)theEObject;
				T result = casePropagatorLayerCompositeEventRefresh(propagatorLayerCompositeEventRefresh);
				if (result == null) result = casePropagatorFunctionDistribution(propagatorLayerCompositeEventRefresh);
				if (result == null) result = casePropagatorFunctionBindings(propagatorLayerCompositeEventRefresh);
				if (result == null) result = casePropagatorFunction(propagatorLayerCompositeEventRefresh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS: {
				PropagatorCalcDistributionChildEvents propagatorCalcDistributionChildEvents = (PropagatorCalcDistributionChildEvents)theEObject;
				T result = casePropagatorCalcDistributionChildEvents(propagatorCalcDistributionChildEvents);
				if (result == null) result = casePropagatorFunctionDistribution(propagatorCalcDistributionChildEvents);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcDistributionChildEvents);
				if (result == null) result = casePropagatorFunction(propagatorCalcDistributionChildEvents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS: {
				PropagatorCalcDistributionProvidedEvents propagatorCalcDistributionProvidedEvents = (PropagatorCalcDistributionProvidedEvents)theEObject;
				T result = casePropagatorCalcDistributionProvidedEvents(propagatorCalcDistributionProvidedEvents);
				if (result == null) result = casePropagatorFunctionDistribution(propagatorCalcDistributionProvidedEvents);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcDistributionProvidedEvents);
				if (result == null) result = casePropagatorFunction(propagatorCalcDistributionProvidedEvents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE: {
				PropagatorCalcDistributionSequence propagatorCalcDistributionSequence = (PropagatorCalcDistributionSequence)theEObject;
				T result = casePropagatorCalcDistributionSequence(propagatorCalcDistributionSequence);
				if (result == null) result = casePropagatorFunctionDistribution(propagatorCalcDistributionSequence);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcDistributionSequence);
				if (result == null) result = casePropagatorFunction(propagatorCalcDistributionSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES: {
				PropagatorLayerDistributionSlopes propagatorLayerDistributionSlopes = (PropagatorLayerDistributionSlopes)theEObject;
				T result = casePropagatorLayerDistributionSlopes(propagatorLayerDistributionSlopes);
				if (result == null) result = casePropagatorFunctionDistribution(propagatorLayerDistributionSlopes);
				if (result == null) result = casePropagatorFunctionBindings(propagatorLayerDistributionSlopes);
				if (result == null) result = casePropagatorFunction(propagatorLayerDistributionSlopes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS: {
				PropagatorLayerDistributionAmounts propagatorLayerDistributionAmounts = (PropagatorLayerDistributionAmounts)theEObject;
				T result = casePropagatorLayerDistributionAmounts(propagatorLayerDistributionAmounts);
				if (result == null) result = casePropagatorFunctionDistribution(propagatorLayerDistributionAmounts);
				if (result == null) result = casePropagatorFunctionBindings(propagatorLayerDistributionAmounts);
				if (result == null) result = casePropagatorFunction(propagatorLayerDistributionAmounts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE: {
				PropagatorCalcAmountAbsoluteAmountAbsolute propagatorCalcAmountAbsoluteAmountAbsolute = (PropagatorCalcAmountAbsoluteAmountAbsolute)theEObject;
				T result = casePropagatorCalcAmountAbsoluteAmountAbsolute(propagatorCalcAmountAbsoluteAmountAbsolute);
				if (result == null) result = casePropagatorCalcEventAmount(propagatorCalcAmountAbsoluteAmountAbsolute);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcAmountAbsoluteAmountAbsolute);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcAmountAbsoluteAmountAbsolute);
				if (result == null) result = casePropagatorFunction(propagatorCalcAmountAbsoluteAmountAbsolute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER: {
				PropagatorCalcAmountAbsoluteAmountAfter propagatorCalcAmountAbsoluteAmountAfter = (PropagatorCalcAmountAbsoluteAmountAfter)theEObject;
				T result = casePropagatorCalcAmountAbsoluteAmountAfter(propagatorCalcAmountAbsoluteAmountAfter);
				if (result == null) result = casePropagatorCalcEventAmountAfter(propagatorCalcAmountAbsoluteAmountAfter);
				if (result == null) result = casePropagatorCalcEventAmount(propagatorCalcAmountAbsoluteAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcAmountAbsoluteAmountAfter);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcAmountAbsoluteAmountAfter);
				if (result == null) result = casePropagatorFunction(propagatorCalcAmountAbsoluteAmountAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE: {
				PropagatorCalcAmountAbsoluteAtomicAmountAbsolute propagatorCalcAmountAbsoluteAtomicAmountAbsolute = (PropagatorCalcAmountAbsoluteAtomicAmountAbsolute)theEObject;
				T result = casePropagatorCalcAmountAbsoluteAtomicAmountAbsolute(propagatorCalcAmountAbsoluteAtomicAmountAbsolute);
				if (result == null) result = casePropagatorCalcAmountAbsoluteAmountAbsolute(propagatorCalcAmountAbsoluteAtomicAmountAbsolute);
				if (result == null) result = casePropagatorCalcEventAmount(propagatorCalcAmountAbsoluteAtomicAmountAbsolute);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcAmountAbsoluteAtomicAmountAbsolute);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcAmountAbsoluteAtomicAmountAbsolute);
				if (result == null) result = casePropagatorFunction(propagatorCalcAmountAbsoluteAtomicAmountAbsolute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT: {
				PropagatorCalcAmountAbsoluteAtomicMoment propagatorCalcAmountAbsoluteAtomicMoment = (PropagatorCalcAmountAbsoluteAtomicMoment)theEObject;
				T result = casePropagatorCalcAmountAbsoluteAtomicMoment(propagatorCalcAmountAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorCalcEventMoment(propagatorCalcAmountAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcAmountAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcAmountAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorFunction(propagatorCalcAmountAbsoluteAtomicMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER: {
				PropagatorCalcAmountImpulsionAmountAfter propagatorCalcAmountImpulsionAmountAfter = (PropagatorCalcAmountImpulsionAmountAfter)theEObject;
				T result = casePropagatorCalcAmountImpulsionAmountAfter(propagatorCalcAmountImpulsionAmountAfter);
				if (result == null) result = casePropagatorCalcEventAmountAfter(propagatorCalcAmountImpulsionAmountAfter);
				if (result == null) result = casePropagatorCalcEventAmount(propagatorCalcAmountImpulsionAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcAmountImpulsionAmountAfter);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcAmountImpulsionAmountAfter);
				if (result == null) result = casePropagatorFunction(propagatorCalcAmountImpulsionAmountAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_IMPULSION: {
				PropagatorCalcAmountImpulsionAmountImpulsion propagatorCalcAmountImpulsionAmountImpulsion = (PropagatorCalcAmountImpulsionAmountImpulsion)theEObject;
				T result = casePropagatorCalcAmountImpulsionAmountImpulsion(propagatorCalcAmountImpulsionAmountImpulsion);
				if (result == null) result = casePropagatorCalcEventAmount(propagatorCalcAmountImpulsionAmountImpulsion);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcAmountImpulsionAmountImpulsion);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcAmountImpulsionAmountImpulsion);
				if (result == null) result = casePropagatorFunction(propagatorCalcAmountImpulsionAmountImpulsion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION: {
				PropagatorCalcAmountImpulsionAtomicAmountImpulsion propagatorCalcAmountImpulsionAtomicAmountImpulsion = (PropagatorCalcAmountImpulsionAtomicAmountImpulsion)theEObject;
				T result = casePropagatorCalcAmountImpulsionAtomicAmountImpulsion(propagatorCalcAmountImpulsionAtomicAmountImpulsion);
				if (result == null) result = casePropagatorCalcAmountImpulsionAmountImpulsion(propagatorCalcAmountImpulsionAtomicAmountImpulsion);
				if (result == null) result = casePropagatorCalcEventAmount(propagatorCalcAmountImpulsionAtomicAmountImpulsion);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcAmountImpulsionAtomicAmountImpulsion);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcAmountImpulsionAtomicAmountImpulsion);
				if (result == null) result = casePropagatorFunction(propagatorCalcAmountImpulsionAtomicAmountImpulsion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT: {
				PropagatorCalcAmountImpulsionAtomicMoment propagatorCalcAmountImpulsionAtomicMoment = (PropagatorCalcAmountImpulsionAtomicMoment)theEObject;
				T result = casePropagatorCalcAmountImpulsionAtomicMoment(propagatorCalcAmountImpulsionAtomicMoment);
				if (result == null) result = casePropagatorCalcEventMoment(propagatorCalcAmountImpulsionAtomicMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcAmountImpulsionAtomicMoment);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcAmountImpulsionAtomicMoment);
				if (result == null) result = casePropagatorFunction(propagatorCalcAmountImpulsionAtomicMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION: {
				PropagatorCalcCapacityChangeEndAmountImpulsion propagatorCalcCapacityChangeEndAmountImpulsion = (PropagatorCalcCapacityChangeEndAmountImpulsion)theEObject;
				T result = casePropagatorCalcCapacityChangeEndAmountImpulsion(propagatorCalcCapacityChangeEndAmountImpulsion);
				if (result == null) result = casePropagatorCalcAmountImpulsionAmountImpulsion(propagatorCalcCapacityChangeEndAmountImpulsion);
				if (result == null) result = casePropagatorCalcEventAmount(propagatorCalcCapacityChangeEndAmountImpulsion);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcCapacityChangeEndAmountImpulsion);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcCapacityChangeEndAmountImpulsion);
				if (result == null) result = casePropagatorFunction(propagatorCalcCapacityChangeEndAmountImpulsion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT: {
				PropagatorCalcCapacityChangeEndMoment propagatorCalcCapacityChangeEndMoment = (PropagatorCalcCapacityChangeEndMoment)theEObject;
				T result = casePropagatorCalcCapacityChangeEndMoment(propagatorCalcCapacityChangeEndMoment);
				if (result == null) result = casePropagatorCalcEventMoment(propagatorCalcCapacityChangeEndMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcCapacityChangeEndMoment);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcCapacityChangeEndMoment);
				if (result == null) result = casePropagatorFunction(propagatorCalcCapacityChangeEndMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION: {
				PropagatorCalcCapacityChangeStartAmountImpulsion propagatorCalcCapacityChangeStartAmountImpulsion = (PropagatorCalcCapacityChangeStartAmountImpulsion)theEObject;
				T result = casePropagatorCalcCapacityChangeStartAmountImpulsion(propagatorCalcCapacityChangeStartAmountImpulsion);
				if (result == null) result = casePropagatorCalcAmountImpulsionAmountImpulsion(propagatorCalcCapacityChangeStartAmountImpulsion);
				if (result == null) result = casePropagatorCalcEventAmount(propagatorCalcCapacityChangeStartAmountImpulsion);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcCapacityChangeStartAmountImpulsion);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcCapacityChangeStartAmountImpulsion);
				if (result == null) result = casePropagatorFunction(propagatorCalcCapacityChangeStartAmountImpulsion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT: {
				PropagatorCalcCapacityChangeStartMoment propagatorCalcCapacityChangeStartMoment = (PropagatorCalcCapacityChangeStartMoment)theEObject;
				T result = casePropagatorCalcCapacityChangeStartMoment(propagatorCalcCapacityChangeStartMoment);
				if (result == null) result = casePropagatorCalcEventMoment(propagatorCalcCapacityChangeStartMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcCapacityChangeStartMoment);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcCapacityChangeStartMoment);
				if (result == null) result = casePropagatorFunction(propagatorCalcCapacityChangeStartMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER: {
				PropagatorCalcChildEventAmountAfter propagatorCalcChildEventAmountAfter = (PropagatorCalcChildEventAmountAfter)theEObject;
				T result = casePropagatorCalcChildEventAmountAfter(propagatorCalcChildEventAmountAfter);
				if (result == null) result = casePropagatorCalcEventAmountAfter(propagatorCalcChildEventAmountAfter);
				if (result == null) result = casePropagatorCalcEventAmount(propagatorCalcChildEventAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcChildEventAmountAfter);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcChildEventAmountAfter);
				if (result == null) result = casePropagatorFunction(propagatorCalcChildEventAmountAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_CHILD_EVENT_MOMENT: {
				PropagatorCalcChildEventMoment propagatorCalcChildEventMoment = (PropagatorCalcChildEventMoment)theEObject;
				T result = casePropagatorCalcChildEventMoment(propagatorCalcChildEventMoment);
				if (result == null) result = casePropagatorCalcEventMoment(propagatorCalcChildEventMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcChildEventMoment);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcChildEventMoment);
				if (result == null) result = casePropagatorFunction(propagatorCalcChildEventMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER: {
				PropagatorCalcChildEventSlopeAfter propagatorCalcChildEventSlopeAfter = (PropagatorCalcChildEventSlopeAfter)theEObject;
				T result = casePropagatorCalcChildEventSlopeAfter(propagatorCalcChildEventSlopeAfter);
				if (result == null) result = casePropagatorCalcEventSlopeAfter(propagatorCalcChildEventSlopeAfter);
				if (result == null) result = casePropagatorCalcEventSlope(propagatorCalcChildEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcChildEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcChildEventSlopeAfter);
				if (result == null) result = casePropagatorFunction(propagatorCalcChildEventSlopeAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_END_EVENT_MOMENT: {
				PropagatorCalcEndEventMoment propagatorCalcEndEventMoment = (PropagatorCalcEndEventMoment)theEObject;
				T result = casePropagatorCalcEndEventMoment(propagatorCalcEndEventMoment);
				if (result == null) result = casePropagatorCalcEventMoment(propagatorCalcEndEventMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcEndEventMoment);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcEndEventMoment);
				if (result == null) result = casePropagatorFunction(propagatorCalcEndEventMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENT_AMOUNT_AFTER: {
				PropagatorCalcEventAmountAfter propagatorCalcEventAmountAfter = (PropagatorCalcEventAmountAfter)theEObject;
				T result = casePropagatorCalcEventAmountAfter(propagatorCalcEventAmountAfter);
				if (result == null) result = casePropagatorCalcEventAmount(propagatorCalcEventAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcEventAmountAfter);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcEventAmountAfter);
				if (result == null) result = casePropagatorFunction(propagatorCalcEventAmountAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE: {
				PropagatorCalcEventAmountBefore propagatorCalcEventAmountBefore = (PropagatorCalcEventAmountBefore)theEObject;
				T result = casePropagatorCalcEventAmountBefore(propagatorCalcEventAmountBefore);
				if (result == null) result = casePropagatorCalcEventAmount(propagatorCalcEventAmountBefore);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcEventAmountBefore);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcEventAmountBefore);
				if (result == null) result = casePropagatorFunction(propagatorCalcEventAmountBefore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENT_MOMENT: {
				PropagatorCalcEventMoment propagatorCalcEventMoment = (PropagatorCalcEventMoment)theEObject;
				T result = casePropagatorCalcEventMoment(propagatorCalcEventMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcEventMoment);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcEventMoment);
				if (result == null) result = casePropagatorFunction(propagatorCalcEventMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENT_SLOPE_AFTER: {
				PropagatorCalcEventSlopeAfter propagatorCalcEventSlopeAfter = (PropagatorCalcEventSlopeAfter)theEObject;
				T result = casePropagatorCalcEventSlopeAfter(propagatorCalcEventSlopeAfter);
				if (result == null) result = casePropagatorCalcEventSlope(propagatorCalcEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcEventSlopeAfter);
				if (result == null) result = casePropagatorFunction(propagatorCalcEventSlopeAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENT_SLOPE_BEFORE: {
				PropagatorCalcEventSlopeBefore propagatorCalcEventSlopeBefore = (PropagatorCalcEventSlopeBefore)theEObject;
				T result = casePropagatorCalcEventSlopeBefore(propagatorCalcEventSlopeBefore);
				if (result == null) result = casePropagatorCalcEventSlope(propagatorCalcEventSlopeBefore);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcEventSlopeBefore);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcEventSlopeBefore);
				if (result == null) result = casePropagatorFunction(propagatorCalcEventSlopeBefore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS: {
				PropagatorCalcEventsProviderRefreshEvents propagatorCalcEventsProviderRefreshEvents = (PropagatorCalcEventsProviderRefreshEvents)theEObject;
				T result = casePropagatorCalcEventsProviderRefreshEvents(propagatorCalcEventsProviderRefreshEvents);
				if (result == null) result = casePropagatorFunctionEventsProvider(propagatorCalcEventsProviderRefreshEvents);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcEventsProviderRefreshEvents);
				if (result == null) result = casePropagatorFunction(propagatorCalcEventsProviderRefreshEvents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT: {
				PropagatorCalcSlopeAbsoluteAtomicMoment propagatorCalcSlopeAbsoluteAtomicMoment = (PropagatorCalcSlopeAbsoluteAtomicMoment)theEObject;
				T result = casePropagatorCalcSlopeAbsoluteAtomicMoment(propagatorCalcSlopeAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorCalcEventMoment(propagatorCalcSlopeAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcSlopeAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcSlopeAbsoluteAtomicMoment);
				if (result == null) result = casePropagatorFunction(propagatorCalcSlopeAbsoluteAtomicMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE: {
				PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute propagatorCalcSlopeAbsoluteAtomicSlopeAbsolute = (PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute)theEObject;
				T result = casePropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute(propagatorCalcSlopeAbsoluteAtomicSlopeAbsolute);
				if (result == null) result = casePropagatorCalcSlopeAbsoluteSlopeAbsolute(propagatorCalcSlopeAbsoluteAtomicSlopeAbsolute);
				if (result == null) result = casePropagatorCalcEventSlope(propagatorCalcSlopeAbsoluteAtomicSlopeAbsolute);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcSlopeAbsoluteAtomicSlopeAbsolute);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcSlopeAbsoluteAtomicSlopeAbsolute);
				if (result == null) result = casePropagatorFunction(propagatorCalcSlopeAbsoluteAtomicSlopeAbsolute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE: {
				PropagatorCalcSlopeAbsoluteSlopeAbsolute propagatorCalcSlopeAbsoluteSlopeAbsolute = (PropagatorCalcSlopeAbsoluteSlopeAbsolute)theEObject;
				T result = casePropagatorCalcSlopeAbsoluteSlopeAbsolute(propagatorCalcSlopeAbsoluteSlopeAbsolute);
				if (result == null) result = casePropagatorCalcEventSlope(propagatorCalcSlopeAbsoluteSlopeAbsolute);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcSlopeAbsoluteSlopeAbsolute);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcSlopeAbsoluteSlopeAbsolute);
				if (result == null) result = casePropagatorFunction(propagatorCalcSlopeAbsoluteSlopeAbsolute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER: {
				PropagatorCalcSlopeAbsoluteSlopeAfter propagatorCalcSlopeAbsoluteSlopeAfter = (PropagatorCalcSlopeAbsoluteSlopeAfter)theEObject;
				T result = casePropagatorCalcSlopeAbsoluteSlopeAfter(propagatorCalcSlopeAbsoluteSlopeAfter);
				if (result == null) result = casePropagatorCalcEventSlopeAfter(propagatorCalcSlopeAbsoluteSlopeAfter);
				if (result == null) result = casePropagatorCalcEventSlope(propagatorCalcSlopeAbsoluteSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcSlopeAbsoluteSlopeAfter);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcSlopeAbsoluteSlopeAfter);
				if (result == null) result = casePropagatorFunction(propagatorCalcSlopeAbsoluteSlopeAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT: {
				PropagatorCalcSlopeImpulsionAtomicMoment propagatorCalcSlopeImpulsionAtomicMoment = (PropagatorCalcSlopeImpulsionAtomicMoment)theEObject;
				T result = casePropagatorCalcSlopeImpulsionAtomicMoment(propagatorCalcSlopeImpulsionAtomicMoment);
				if (result == null) result = casePropagatorCalcEventMoment(propagatorCalcSlopeImpulsionAtomicMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcSlopeImpulsionAtomicMoment);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcSlopeImpulsionAtomicMoment);
				if (result == null) result = casePropagatorFunction(propagatorCalcSlopeImpulsionAtomicMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION: {
				PropagatorCalcSlopeImpulsionAtomicSlopeImpulsion propagatorCalcSlopeImpulsionAtomicSlopeImpulsion = (PropagatorCalcSlopeImpulsionAtomicSlopeImpulsion)theEObject;
				T result = casePropagatorCalcSlopeImpulsionAtomicSlopeImpulsion(propagatorCalcSlopeImpulsionAtomicSlopeImpulsion);
				if (result == null) result = casePropagatorCalcSlopeImpulsionSlopeImpulsion(propagatorCalcSlopeImpulsionAtomicSlopeImpulsion);
				if (result == null) result = casePropagatorCalcEventSlope(propagatorCalcSlopeImpulsionAtomicSlopeImpulsion);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcSlopeImpulsionAtomicSlopeImpulsion);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcSlopeImpulsionAtomicSlopeImpulsion);
				if (result == null) result = casePropagatorFunction(propagatorCalcSlopeImpulsionAtomicSlopeImpulsion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER: {
				PropagatorCalcSlopeImpulsionSlopeAfter propagatorCalcSlopeImpulsionSlopeAfter = (PropagatorCalcSlopeImpulsionSlopeAfter)theEObject;
				T result = casePropagatorCalcSlopeImpulsionSlopeAfter(propagatorCalcSlopeImpulsionSlopeAfter);
				if (result == null) result = casePropagatorCalcEventSlopeAfter(propagatorCalcSlopeImpulsionSlopeAfter);
				if (result == null) result = casePropagatorCalcEventSlope(propagatorCalcSlopeImpulsionSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcSlopeImpulsionSlopeAfter);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcSlopeImpulsionSlopeAfter);
				if (result == null) result = casePropagatorFunction(propagatorCalcSlopeImpulsionSlopeAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION: {
				PropagatorCalcSlopeImpulsionSlopeImpulsion propagatorCalcSlopeImpulsionSlopeImpulsion = (PropagatorCalcSlopeImpulsionSlopeImpulsion)theEObject;
				T result = casePropagatorCalcSlopeImpulsionSlopeImpulsion(propagatorCalcSlopeImpulsionSlopeImpulsion);
				if (result == null) result = casePropagatorCalcEventSlope(propagatorCalcSlopeImpulsionSlopeImpulsion);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcSlopeImpulsionSlopeImpulsion);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcSlopeImpulsionSlopeImpulsion);
				if (result == null) result = casePropagatorFunction(propagatorCalcSlopeImpulsionSlopeImpulsion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER: {
				PropagatorCalcStartEventAmountAfter propagatorCalcStartEventAmountAfter = (PropagatorCalcStartEventAmountAfter)theEObject;
				T result = casePropagatorCalcStartEventAmountAfter(propagatorCalcStartEventAmountAfter);
				if (result == null) result = casePropagatorCalcEventAmountAfter(propagatorCalcStartEventAmountAfter);
				if (result == null) result = casePropagatorCalcEventAmount(propagatorCalcStartEventAmountAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcStartEventAmountAfter);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcStartEventAmountAfter);
				if (result == null) result = casePropagatorFunction(propagatorCalcStartEventAmountAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_START_EVENT_MOMENT: {
				PropagatorCalcStartEventMoment propagatorCalcStartEventMoment = (PropagatorCalcStartEventMoment)theEObject;
				T result = casePropagatorCalcStartEventMoment(propagatorCalcStartEventMoment);
				if (result == null) result = casePropagatorCalcEventMoment(propagatorCalcStartEventMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcStartEventMoment);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcStartEventMoment);
				if (result == null) result = casePropagatorFunction(propagatorCalcStartEventMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER: {
				PropagatorCalcStartEventSlopeAfter propagatorCalcStartEventSlopeAfter = (PropagatorCalcStartEventSlopeAfter)theEObject;
				T result = casePropagatorCalcStartEventSlopeAfter(propagatorCalcStartEventSlopeAfter);
				if (result == null) result = casePropagatorCalcEventSlopeAfter(propagatorCalcStartEventSlopeAfter);
				if (result == null) result = casePropagatorCalcEventSlope(propagatorCalcStartEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcStartEventSlopeAfter);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcStartEventSlopeAfter);
				if (result == null) result = casePropagatorFunction(propagatorCalcStartEventSlopeAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT: {
				PropagatorCalcStockChangeEndMoment propagatorCalcStockChangeEndMoment = (PropagatorCalcStockChangeEndMoment)theEObject;
				T result = casePropagatorCalcStockChangeEndMoment(propagatorCalcStockChangeEndMoment);
				if (result == null) result = casePropagatorCalcEventMoment(propagatorCalcStockChangeEndMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcStockChangeEndMoment);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcStockChangeEndMoment);
				if (result == null) result = casePropagatorFunction(propagatorCalcStockChangeEndMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION: {
				PropagatorCalcStockChangeEndSlopeImpulsion propagatorCalcStockChangeEndSlopeImpulsion = (PropagatorCalcStockChangeEndSlopeImpulsion)theEObject;
				T result = casePropagatorCalcStockChangeEndSlopeImpulsion(propagatorCalcStockChangeEndSlopeImpulsion);
				if (result == null) result = casePropagatorCalcSlopeImpulsionSlopeImpulsion(propagatorCalcStockChangeEndSlopeImpulsion);
				if (result == null) result = casePropagatorCalcEventSlope(propagatorCalcStockChangeEndSlopeImpulsion);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcStockChangeEndSlopeImpulsion);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcStockChangeEndSlopeImpulsion);
				if (result == null) result = casePropagatorFunction(propagatorCalcStockChangeEndSlopeImpulsion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT: {
				PropagatorCalcStockChangeStartMoment propagatorCalcStockChangeStartMoment = (PropagatorCalcStockChangeStartMoment)theEObject;
				T result = casePropagatorCalcStockChangeStartMoment(propagatorCalcStockChangeStartMoment);
				if (result == null) result = casePropagatorCalcEventMoment(propagatorCalcStockChangeStartMoment);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcStockChangeStartMoment);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcStockChangeStartMoment);
				if (result == null) result = casePropagatorFunction(propagatorCalcStockChangeStartMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION: {
				PropagatorCalcStockChangeStartSlopeImpulsion propagatorCalcStockChangeStartSlopeImpulsion = (PropagatorCalcStockChangeStartSlopeImpulsion)theEObject;
				T result = casePropagatorCalcStockChangeStartSlopeImpulsion(propagatorCalcStockChangeStartSlopeImpulsion);
				if (result == null) result = casePropagatorCalcSlopeImpulsionSlopeImpulsion(propagatorCalcStockChangeStartSlopeImpulsion);
				if (result == null) result = casePropagatorCalcEventSlope(propagatorCalcStockChangeStartSlopeImpulsion);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcStockChangeStartSlopeImpulsion);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcStockChangeStartSlopeImpulsion);
				if (result == null) result = casePropagatorFunction(propagatorCalcStockChangeStartSlopeImpulsion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENT_SLOPE: {
				PropagatorCalcEventSlope propagatorCalcEventSlope = (PropagatorCalcEventSlope)theEObject;
				T result = casePropagatorCalcEventSlope(propagatorCalcEventSlope);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcEventSlope);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcEventSlope);
				if (result == null) result = casePropagatorFunction(propagatorCalcEventSlope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_AMOUNT: {
				PropagatorCalcAmount propagatorCalcAmount = (PropagatorCalcAmount)theEObject;
				T result = casePropagatorCalcAmount(propagatorCalcAmount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENT_AMOUNT: {
				PropagatorCalcEventAmount propagatorCalcEventAmount = (PropagatorCalcEventAmount)theEObject;
				T result = casePropagatorCalcEventAmount(propagatorCalcEventAmount);
				if (result == null) result = casePropagatorFunctionDistributionEvent(propagatorCalcEventAmount);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcEventAmount);
				if (result == null) result = casePropagatorFunction(propagatorCalcEventAmount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Scope Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Scope Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorScopeDistribution(PropagatorScopeDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Distribution Initialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Distribution Initialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcDistributionInitialization(PropagatorCalcDistributionInitialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Layer Composite Event Refresh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Layer Composite Event Refresh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorLayerCompositeEventRefresh(PropagatorLayerCompositeEventRefresh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Distribution Child Events</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Distribution Child Events</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcDistributionChildEvents(PropagatorCalcDistributionChildEvents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Distribution Provided Events</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Distribution Provided Events</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcDistributionProvidedEvents(PropagatorCalcDistributionProvidedEvents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Distribution Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Distribution Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcDistributionSequence(PropagatorCalcDistributionSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Layer Distribution Slopes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Layer Distribution Slopes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorLayerDistributionSlopes(PropagatorLayerDistributionSlopes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Layer Distribution Amounts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Layer Distribution Amounts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorLayerDistributionAmounts(PropagatorLayerDistributionAmounts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Amount Absolute Amount Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Amount Absolute Amount Absolute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcAmountAbsoluteAmountAbsolute(PropagatorCalcAmountAbsoluteAmountAbsolute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Amount Absolute Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Amount Absolute Amount After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcAmountAbsoluteAmountAfter(PropagatorCalcAmountAbsoluteAmountAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Amount Absolute Atomic Amount Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Amount Absolute Atomic Amount Absolute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcAmountAbsoluteAtomicAmountAbsolute(PropagatorCalcAmountAbsoluteAtomicAmountAbsolute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Amount Absolute Atomic Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Amount Absolute Atomic Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcAmountAbsoluteAtomicMoment(PropagatorCalcAmountAbsoluteAtomicMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Amount Impulsion Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Amount Impulsion Amount After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcAmountImpulsionAmountAfter(PropagatorCalcAmountImpulsionAmountAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Amount Impulsion Amount Impulsion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Amount Impulsion Amount Impulsion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcAmountImpulsionAmountImpulsion(PropagatorCalcAmountImpulsionAmountImpulsion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Amount Impulsion Atomic Amount Impulsion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Amount Impulsion Atomic Amount Impulsion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcAmountImpulsionAtomicAmountImpulsion(PropagatorCalcAmountImpulsionAtomicAmountImpulsion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Amount Impulsion Atomic Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Amount Impulsion Atomic Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcAmountImpulsionAtomicMoment(PropagatorCalcAmountImpulsionAtomicMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Capacity Change End Amount Impulsion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Capacity Change End Amount Impulsion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcCapacityChangeEndAmountImpulsion(PropagatorCalcCapacityChangeEndAmountImpulsion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Capacity Change End Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Capacity Change End Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcCapacityChangeEndMoment(PropagatorCalcCapacityChangeEndMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Capacity Change Start Amount Impulsion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Capacity Change Start Amount Impulsion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcCapacityChangeStartAmountImpulsion(PropagatorCalcCapacityChangeStartAmountImpulsion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Capacity Change Start Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Capacity Change Start Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcCapacityChangeStartMoment(PropagatorCalcCapacityChangeStartMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Child Event Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Child Event Amount After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcChildEventAmountAfter(PropagatorCalcChildEventAmountAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Child Event Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Child Event Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcChildEventMoment(PropagatorCalcChildEventMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Child Event Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Child Event Slope After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcChildEventSlopeAfter(PropagatorCalcChildEventSlopeAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc End Event Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc End Event Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcEndEventMoment(PropagatorCalcEndEventMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Event Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Event Amount After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcEventAmountAfter(PropagatorCalcEventAmountAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Event Amount Before</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Event Amount Before</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcEventAmountBefore(PropagatorCalcEventAmountBefore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Event Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Event Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcEventMoment(PropagatorCalcEventMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Event Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Event Slope After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcEventSlopeAfter(PropagatorCalcEventSlopeAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Event Slope Before</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Event Slope Before</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcEventSlopeBefore(PropagatorCalcEventSlopeBefore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Events Provider Refresh Events</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Events Provider Refresh Events</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcEventsProviderRefreshEvents(PropagatorCalcEventsProviderRefreshEvents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Slope Absolute Atomic Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Slope Absolute Atomic Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcSlopeAbsoluteAtomicMoment(PropagatorCalcSlopeAbsoluteAtomicMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Slope Absolute Atomic Slope Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Slope Absolute Atomic Slope Absolute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute(PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Slope Absolute Slope Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Slope Absolute Slope Absolute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcSlopeAbsoluteSlopeAbsolute(PropagatorCalcSlopeAbsoluteSlopeAbsolute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Slope Absolute Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Slope Absolute Slope After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcSlopeAbsoluteSlopeAfter(PropagatorCalcSlopeAbsoluteSlopeAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Slope Impulsion Atomic Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Slope Impulsion Atomic Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcSlopeImpulsionAtomicMoment(PropagatorCalcSlopeImpulsionAtomicMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Slope Impulsion Atomic Slope Impulsion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Slope Impulsion Atomic Slope Impulsion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcSlopeImpulsionAtomicSlopeImpulsion(PropagatorCalcSlopeImpulsionAtomicSlopeImpulsion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Slope Impulsion Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Slope Impulsion Slope After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcSlopeImpulsionSlopeAfter(PropagatorCalcSlopeImpulsionSlopeAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Slope Impulsion Slope Impulsion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Slope Impulsion Slope Impulsion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcSlopeImpulsionSlopeImpulsion(PropagatorCalcSlopeImpulsionSlopeImpulsion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Start Event Amount After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Start Event Amount After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcStartEventAmountAfter(PropagatorCalcStartEventAmountAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Start Event Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Start Event Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcStartEventMoment(PropagatorCalcStartEventMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Start Event Slope After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Start Event Slope After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcStartEventSlopeAfter(PropagatorCalcStartEventSlopeAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Stock Change End Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Stock Change End Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcStockChangeEndMoment(PropagatorCalcStockChangeEndMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Stock Change End Slope Impulsion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Stock Change End Slope Impulsion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcStockChangeEndSlopeImpulsion(PropagatorCalcStockChangeEndSlopeImpulsion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Stock Change Start Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Stock Change Start Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcStockChangeStartMoment(PropagatorCalcStockChangeStartMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Stock Change Start Slope Impulsion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Stock Change Start Slope Impulsion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcStockChangeStartSlopeImpulsion(PropagatorCalcStockChangeStartSlopeImpulsion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Event Slope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Event Slope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcEventSlope(PropagatorCalcEventSlope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Amount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Amount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcAmount(PropagatorCalcAmount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Event Amount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Event Amount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcEventAmount(PropagatorCalcEventAmount object) {
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
