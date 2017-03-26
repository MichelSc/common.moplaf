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
package com.misc.common.moplaf.time.continuous.util;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.time.continuous.*;

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
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage
 * @generated
 */
public class TimeContinuousSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimeContinuousPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeContinuousSwitch() {
		if (modelPackage == null) {
			modelPackage = TimeContinuousPackage.eINSTANCE;
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
			case TimeContinuousPackage.DISTRIBUTION: {
				Distribution distribution = (Distribution)theEObject;
				T result = caseDistribution(distribution);
				if (result == null) result = caseObjectWithPropagatorFunctions(distribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.DISTRIBUTION_EVENT: {
				DistributionEvent distributionEvent = (DistributionEvent)theEObject;
				T result = caseDistributionEvent(distributionEvent);
				if (result == null) result = caseObjectWithPropagatorFunctions(distributionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.CHILD_EVENT: {
				ChildEvent childEvent = (ChildEvent)theEObject;
				T result = caseChildEvent(childEvent);
				if (result == null) result = caseOwnedEvent(childEvent);
				if (result == null) result = caseDistributionEvent(childEvent);
				if (result == null) result = caseObjectWithPropagatorFunctions(childEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.START_EVENT: {
				StartEvent startEvent = (StartEvent)theEObject;
				T result = caseStartEvent(startEvent);
				if (result == null) result = caseOwnedEvent(startEvent);
				if (result == null) result = caseDistributionEvent(startEvent);
				if (result == null) result = caseObjectWithPropagatorFunctions(startEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.END_EVENT: {
				EndEvent endEvent = (EndEvent)theEObject;
				T result = caseEndEvent(endEvent);
				if (result == null) result = caseOwnedEvent(endEvent);
				if (result == null) result = caseDistributionEvent(endEvent);
				if (result == null) result = caseObjectWithPropagatorFunctions(endEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.AMOUNT_IMPULSION: {
				AmountImpulsion amountImpulsion = (AmountImpulsion)theEObject;
				T result = caseAmountImpulsion(amountImpulsion);
				if (result == null) result = caseProvidedEvent(amountImpulsion);
				if (result == null) result = caseDistributionEvent(amountImpulsion);
				if (result == null) result = caseObjectWithPropagatorFunctions(amountImpulsion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.SLOPE_IMPULSION: {
				SlopeImpulsion slopeImpulsion = (SlopeImpulsion)theEObject;
				T result = caseSlopeImpulsion(slopeImpulsion);
				if (result == null) result = caseProvidedEvent(slopeImpulsion);
				if (result == null) result = caseDistributionEvent(slopeImpulsion);
				if (result == null) result = caseObjectWithPropagatorFunctions(slopeImpulsion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.AMOUNT_ABSOLUTE: {
				AmountAbsolute amountAbsolute = (AmountAbsolute)theEObject;
				T result = caseAmountAbsolute(amountAbsolute);
				if (result == null) result = caseProvidedEvent(amountAbsolute);
				if (result == null) result = caseDistributionEvent(amountAbsolute);
				if (result == null) result = caseObjectWithPropagatorFunctions(amountAbsolute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.SLOPE_ABSOLUTE: {
				SlopeAbsolute slopeAbsolute = (SlopeAbsolute)theEObject;
				T result = caseSlopeAbsolute(slopeAbsolute);
				if (result == null) result = caseProvidedEvent(slopeAbsolute);
				if (result == null) result = caseDistributionEvent(slopeAbsolute);
				if (result == null) result = caseObjectWithPropagatorFunctions(slopeAbsolute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.CAPACITY_CHANGE_START: {
				CapacityChangeStart capacityChangeStart = (CapacityChangeStart)theEObject;
				T result = caseCapacityChangeStart(capacityChangeStart);
				if (result == null) result = caseAmountImpulsion(capacityChangeStart);
				if (result == null) result = caseProvidedEvent(capacityChangeStart);
				if (result == null) result = caseDistributionEvent(capacityChangeStart);
				if (result == null) result = caseObjectWithPropagatorFunctions(capacityChangeStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.CAPACITY_CHANGE_END: {
				CapacityChangeEnd capacityChangeEnd = (CapacityChangeEnd)theEObject;
				T result = caseCapacityChangeEnd(capacityChangeEnd);
				if (result == null) result = caseAmountImpulsion(capacityChangeEnd);
				if (result == null) result = caseProvidedEvent(capacityChangeEnd);
				if (result == null) result = caseDistributionEvent(capacityChangeEnd);
				if (result == null) result = caseObjectWithPropagatorFunctions(capacityChangeEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.STOCK_CHANGE_START: {
				StockChangeStart stockChangeStart = (StockChangeStart)theEObject;
				T result = caseStockChangeStart(stockChangeStart);
				if (result == null) result = caseSlopeImpulsion(stockChangeStart);
				if (result == null) result = caseProvidedEvent(stockChangeStart);
				if (result == null) result = caseDistributionEvent(stockChangeStart);
				if (result == null) result = caseObjectWithPropagatorFunctions(stockChangeStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.STOCK_CHANGE_END: {
				StockChangeEnd stockChangeEnd = (StockChangeEnd)theEObject;
				T result = caseStockChangeEnd(stockChangeEnd);
				if (result == null) result = caseSlopeImpulsion(stockChangeEnd);
				if (result == null) result = caseProvidedEvent(stockChangeEnd);
				if (result == null) result = caseDistributionEvent(stockChangeEnd);
				if (result == null) result = caseObjectWithPropagatorFunctions(stockChangeEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.AMOUNT_IMPULSION_ATOMIC: {
				AmountImpulsionAtomic amountImpulsionAtomic = (AmountImpulsionAtomic)theEObject;
				T result = caseAmountImpulsionAtomic(amountImpulsionAtomic);
				if (result == null) result = caseAmountImpulsion(amountImpulsionAtomic);
				if (result == null) result = caseProvidedEvent(amountImpulsionAtomic);
				if (result == null) result = caseDistributionEvent(amountImpulsionAtomic);
				if (result == null) result = caseObjectWithPropagatorFunctions(amountImpulsionAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.SLOPE_IMPULSION_ATOMIC: {
				SlopeImpulsionAtomic slopeImpulsionAtomic = (SlopeImpulsionAtomic)theEObject;
				T result = caseSlopeImpulsionAtomic(slopeImpulsionAtomic);
				if (result == null) result = caseSlopeImpulsion(slopeImpulsionAtomic);
				if (result == null) result = caseProvidedEvent(slopeImpulsionAtomic);
				if (result == null) result = caseDistributionEvent(slopeImpulsionAtomic);
				if (result == null) result = caseObjectWithPropagatorFunctions(slopeImpulsionAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.AMOUNT_ABSOLUTE_ATOMIC: {
				AmountAbsoluteAtomic amountAbsoluteAtomic = (AmountAbsoluteAtomic)theEObject;
				T result = caseAmountAbsoluteAtomic(amountAbsoluteAtomic);
				if (result == null) result = caseAmountAbsolute(amountAbsoluteAtomic);
				if (result == null) result = caseProvidedEvent(amountAbsoluteAtomic);
				if (result == null) result = caseDistributionEvent(amountAbsoluteAtomic);
				if (result == null) result = caseObjectWithPropagatorFunctions(amountAbsoluteAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.SLOPE_ABSOLUTE_ATOMIC: {
				SlopeAbsoluteAtomic slopeAbsoluteAtomic = (SlopeAbsoluteAtomic)theEObject;
				T result = caseSlopeAbsoluteAtomic(slopeAbsoluteAtomic);
				if (result == null) result = caseSlopeAbsolute(slopeAbsoluteAtomic);
				if (result == null) result = caseProvidedEvent(slopeAbsoluteAtomic);
				if (result == null) result = caseDistributionEvent(slopeAbsoluteAtomic);
				if (result == null) result = caseObjectWithPropagatorFunctions(slopeAbsoluteAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.EVENTS_PROVIDER_ABSTRACT: {
				EventsProviderAbstract eventsProviderAbstract = (EventsProviderAbstract)theEObject;
				T result = caseEventsProviderAbstract(eventsProviderAbstract);
				if (result == null) result = caseObjectWithPropagatorFunctions(eventsProviderAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.EVENTS_PROVIDER: {
				EventsProvider eventsProvider = (EventsProvider)theEObject;
				T result = caseEventsProvider(eventsProvider);
				if (result == null) result = caseEventsProviderAbstract(eventsProvider);
				if (result == null) result = caseObjectWithPropagatorFunctions(eventsProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.STOCK_CHANGE: {
				StockChange stockChange = (StockChange)theEObject;
				T result = caseStockChange(stockChange);
				if (result == null) result = caseEventsProvider(stockChange);
				if (result == null) result = caseEventsProviderAbstract(stockChange);
				if (result == null) result = caseObjectWithPropagatorFunctions(stockChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.CAPACITY_CHANGE: {
				CapacityChange capacityChange = (CapacityChange)theEObject;
				T result = caseCapacityChange(capacityChange);
				if (result == null) result = caseEventsProvider(capacityChange);
				if (result == null) result = caseEventsProviderAbstract(capacityChange);
				if (result == null) result = caseObjectWithPropagatorFunctions(capacityChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.EVENT_PROVIDER: {
				EventProvider eventProvider = (EventProvider)theEObject;
				T result = caseEventProvider(eventProvider);
				if (result == null) result = caseEventsProviderAbstract(eventProvider);
				if (result == null) result = caseObjectWithPropagatorFunctions(eventProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.SLOPE_IMPULSION_PROVIDER: {
				SlopeImpulsionProvider slopeImpulsionProvider = (SlopeImpulsionProvider)theEObject;
				T result = caseSlopeImpulsionProvider(slopeImpulsionProvider);
				if (result == null) result = caseEventProvider(slopeImpulsionProvider);
				if (result == null) result = caseEventsProviderAbstract(slopeImpulsionProvider);
				if (result == null) result = caseObjectWithPropagatorFunctions(slopeImpulsionProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.SLOPE_ABSOLUTE_PROVIDER: {
				SlopeAbsoluteProvider slopeAbsoluteProvider = (SlopeAbsoluteProvider)theEObject;
				T result = caseSlopeAbsoluteProvider(slopeAbsoluteProvider);
				if (result == null) result = caseEventProvider(slopeAbsoluteProvider);
				if (result == null) result = caseEventsProviderAbstract(slopeAbsoluteProvider);
				if (result == null) result = caseObjectWithPropagatorFunctions(slopeAbsoluteProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER: {
				AmountImpulsionProvider amountImpulsionProvider = (AmountImpulsionProvider)theEObject;
				T result = caseAmountImpulsionProvider(amountImpulsionProvider);
				if (result == null) result = caseEventProvider(amountImpulsionProvider);
				if (result == null) result = caseEventsProviderAbstract(amountImpulsionProvider);
				if (result == null) result = caseObjectWithPropagatorFunctions(amountImpulsionProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER: {
				AmountAbsoluteProvider amountAbsoluteProvider = (AmountAbsoluteProvider)theEObject;
				T result = caseAmountAbsoluteProvider(amountAbsoluteProvider);
				if (result == null) result = caseEventProvider(amountAbsoluteProvider);
				if (result == null) result = caseEventsProviderAbstract(amountAbsoluteProvider);
				if (result == null) result = caseObjectWithPropagatorFunctions(amountAbsoluteProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.OWNED_EVENT: {
				OwnedEvent ownedEvent = (OwnedEvent)theEObject;
				T result = caseOwnedEvent(ownedEvent);
				if (result == null) result = caseDistributionEvent(ownedEvent);
				if (result == null) result = caseObjectWithPropagatorFunctions(ownedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.PROVIDED_EVENT: {
				ProvidedEvent providedEvent = (ProvidedEvent)theEObject;
				T result = caseProvidedEvent(providedEvent);
				if (result == null) result = caseDistributionEvent(providedEvent);
				if (result == null) result = caseObjectWithPropagatorFunctions(providedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION: {
				PropagatorFunctionDistribution propagatorFunctionDistribution = (PropagatorFunctionDistribution)theEObject;
				T result = casePropagatorFunctionDistribution(propagatorFunctionDistribution);
				if (result == null) result = casePropagatorFunctionBindings(propagatorFunctionDistribution);
				if (result == null) result = casePropagatorFunction(propagatorFunctionDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT: {
				PropagatorFunctionDistributionEvent propagatorFunctionDistributionEvent = (PropagatorFunctionDistributionEvent)theEObject;
				T result = casePropagatorFunctionDistributionEvent(propagatorFunctionDistributionEvent);
				if (result == null) result = casePropagatorFunctionBindings(propagatorFunctionDistributionEvent);
				if (result == null) result = casePropagatorFunction(propagatorFunctionDistributionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER: {
				PropagatorFunctionEventsProvider propagatorFunctionEventsProvider = (PropagatorFunctionEventsProvider)theEObject;
				T result = casePropagatorFunctionEventsProvider(propagatorFunctionEventsProvider);
				if (result == null) result = casePropagatorFunctionBindings(propagatorFunctionEventsProvider);
				if (result == null) result = casePropagatorFunction(propagatorFunctionEventsProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistribution(Distribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributionEvent(DistributionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildEvent(ChildEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEvent(StartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndEvent(EndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amount Impulsion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amount Impulsion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmountImpulsion(AmountImpulsion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slope Impulsion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slope Impulsion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlopeImpulsion(SlopeImpulsion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amount Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amount Absolute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmountAbsolute(AmountAbsolute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slope Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slope Absolute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlopeAbsolute(SlopeAbsolute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capacity Change Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capacity Change Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapacityChangeStart(CapacityChangeStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capacity Change End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capacity Change End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapacityChangeEnd(CapacityChangeEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stock Change Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stock Change Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStockChangeStart(StockChangeStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stock Change End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stock Change End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStockChangeEnd(StockChangeEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amount Impulsion Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amount Impulsion Atomic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmountImpulsionAtomic(AmountImpulsionAtomic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slope Impulsion Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slope Impulsion Atomic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlopeImpulsionAtomic(SlopeImpulsionAtomic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amount Absolute Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amount Absolute Atomic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmountAbsoluteAtomic(AmountAbsoluteAtomic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slope Absolute Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slope Absolute Atomic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlopeAbsoluteAtomic(SlopeAbsoluteAtomic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Events Provider Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Events Provider Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventsProviderAbstract(EventsProviderAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Events Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Events Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventsProvider(EventsProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stock Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stock Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStockChange(StockChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capacity Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capacity Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapacityChange(CapacityChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventProvider(EventProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slope Impulsion Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slope Impulsion Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlopeImpulsionProvider(SlopeImpulsionProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slope Absolute Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slope Absolute Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlopeAbsoluteProvider(SlopeAbsoluteProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amount Impulsion Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amount Impulsion Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmountImpulsionProvider(AmountImpulsionProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amount Absolute Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amount Absolute Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmountAbsoluteProvider(AmountAbsoluteProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Owned Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Owned Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwnedEvent(OwnedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedEvent(ProvidedEvent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Object With Propagator Functions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object With Propagator Functions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectWithPropagatorFunctions(ObjectWithPropagatorFunctions object) {
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

} //TimeContinuousSwitch
