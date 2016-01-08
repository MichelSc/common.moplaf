/**
 */
package com.misc.common.moplaf.time.continuous.util;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
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
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage
 * @generated
 */
public class ContinuousSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContinuousPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousSwitch() {
		if (modelPackage == null) {
			modelPackage = ContinuousPackage.eINSTANCE;
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
			case ContinuousPackage.DISTRIBUTION: {
				Distribution distribution = (Distribution)theEObject;
				T result = caseDistribution(distribution);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(distribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.DISTRIBUTION_EVENT: {
				DistributionEvent distributionEvent = (DistributionEvent)theEObject;
				T result = caseDistributionEvent(distributionEvent);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(distributionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.CHILD_EVENT: {
				ChildEvent childEvent = (ChildEvent)theEObject;
				T result = caseChildEvent(childEvent);
				if (result == null) result = caseDistributionEvent(childEvent);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(childEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.START_EVENT: {
				StartEvent startEvent = (StartEvent)theEObject;
				T result = caseStartEvent(startEvent);
				if (result == null) result = caseDistributionEvent(startEvent);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(startEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.END_EVENT: {
				EndEvent endEvent = (EndEvent)theEObject;
				T result = caseEndEvent(endEvent);
				if (result == null) result = caseDistributionEvent(endEvent);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(endEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.AMOUNT_IMPULSION: {
				AmountImpulsion amountImpulsion = (AmountImpulsion)theEObject;
				T result = caseAmountImpulsion(amountImpulsion);
				if (result == null) result = caseDistributionEvent(amountImpulsion);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(amountImpulsion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.SLOPE_IMPULSION: {
				SlopeImpulsion slopeImpulsion = (SlopeImpulsion)theEObject;
				T result = caseSlopeImpulsion(slopeImpulsion);
				if (result == null) result = caseDistributionEvent(slopeImpulsion);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(slopeImpulsion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.AMOUNT_ABSOLUTE: {
				AmountAbsolute amountAbsolute = (AmountAbsolute)theEObject;
				T result = caseAmountAbsolute(amountAbsolute);
				if (result == null) result = caseDistributionEvent(amountAbsolute);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(amountAbsolute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.SLOPE_ABSOLUTE: {
				SlopeAbsolute slopeAbsolute = (SlopeAbsolute)theEObject;
				T result = caseSlopeAbsolute(slopeAbsolute);
				if (result == null) result = caseDistributionEvent(slopeAbsolute);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(slopeAbsolute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.CAPACITY_CHANGE_START: {
				CapacityChangeStart capacityChangeStart = (CapacityChangeStart)theEObject;
				T result = caseCapacityChangeStart(capacityChangeStart);
				if (result == null) result = caseAmountImpulsion(capacityChangeStart);
				if (result == null) result = caseDistributionEvent(capacityChangeStart);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(capacityChangeStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.CAPACITY_CHANGE_END: {
				CapacityChangeEnd capacityChangeEnd = (CapacityChangeEnd)theEObject;
				T result = caseCapacityChangeEnd(capacityChangeEnd);
				if (result == null) result = caseAmountImpulsion(capacityChangeEnd);
				if (result == null) result = caseDistributionEvent(capacityChangeEnd);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(capacityChangeEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.STOCK_CHANGE_START: {
				StockChangeStart stockChangeStart = (StockChangeStart)theEObject;
				T result = caseStockChangeStart(stockChangeStart);
				if (result == null) result = caseSlopeImpulsion(stockChangeStart);
				if (result == null) result = caseDistributionEvent(stockChangeStart);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(stockChangeStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.STOCK_CHANGE_END: {
				StockChangeEnd stockChangeEnd = (StockChangeEnd)theEObject;
				T result = caseStockChangeEnd(stockChangeEnd);
				if (result == null) result = caseSlopeImpulsion(stockChangeEnd);
				if (result == null) result = caseDistributionEvent(stockChangeEnd);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(stockChangeEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.AMOUNT_IMPULSION_ATOMIC: {
				AmountImpulsionAtomic amountImpulsionAtomic = (AmountImpulsionAtomic)theEObject;
				T result = caseAmountImpulsionAtomic(amountImpulsionAtomic);
				if (result == null) result = caseAmountImpulsion(amountImpulsionAtomic);
				if (result == null) result = caseDistributionEvent(amountImpulsionAtomic);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(amountImpulsionAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.SLOPE_IMPULSION_ATOMIC: {
				SlopeImpulsionAtomic slopeImpulsionAtomic = (SlopeImpulsionAtomic)theEObject;
				T result = caseSlopeImpulsionAtomic(slopeImpulsionAtomic);
				if (result == null) result = caseSlopeImpulsion(slopeImpulsionAtomic);
				if (result == null) result = caseDistributionEvent(slopeImpulsionAtomic);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(slopeImpulsionAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.AMOUNT_ABSOLUTE_ATOMIC: {
				AmountAbsoluteAtomic amountAbsoluteAtomic = (AmountAbsoluteAtomic)theEObject;
				T result = caseAmountAbsoluteAtomic(amountAbsoluteAtomic);
				if (result == null) result = caseAmountAbsolute(amountAbsoluteAtomic);
				if (result == null) result = caseDistributionEvent(amountAbsoluteAtomic);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(amountAbsoluteAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.SLOPE_ABSOLUTE_ATOMIC: {
				SlopeAbsoluteAtomic slopeAbsoluteAtomic = (SlopeAbsoluteAtomic)theEObject;
				T result = caseSlopeAbsoluteAtomic(slopeAbsoluteAtomic);
				if (result == null) result = caseSlopeAbsolute(slopeAbsoluteAtomic);
				if (result == null) result = caseDistributionEvent(slopeAbsoluteAtomic);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(slopeAbsoluteAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.EVENTS_PROVIDER_ABSTRACT: {
				EventsProviderAbstract eventsProviderAbstract = (EventsProviderAbstract)theEObject;
				T result = caseEventsProviderAbstract(eventsProviderAbstract);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(eventsProviderAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.EVENTS_PROVIDER: {
				EventsProvider eventsProvider = (EventsProvider)theEObject;
				T result = caseEventsProvider(eventsProvider);
				if (result == null) result = caseEventsProviderAbstract(eventsProvider);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(eventsProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.STOCK_CHANGE: {
				StockChange stockChange = (StockChange)theEObject;
				T result = caseStockChange(stockChange);
				if (result == null) result = caseEventsProvider(stockChange);
				if (result == null) result = caseEventsProviderAbstract(stockChange);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(stockChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.CAPACITY_CHANGE: {
				CapacityChange capacityChange = (CapacityChange)theEObject;
				T result = caseCapacityChange(capacityChange);
				if (result == null) result = caseEventsProvider(capacityChange);
				if (result == null) result = caseEventsProviderAbstract(capacityChange);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(capacityChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.EVENT_PROVIDER: {
				EventProvider eventProvider = (EventProvider)theEObject;
				T result = caseEventProvider(eventProvider);
				if (result == null) result = caseEventsProviderAbstract(eventProvider);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(eventProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.SLOPE_IMPULSION_PROVIDER: {
				SlopeImpulsionProvider slopeImpulsionProvider = (SlopeImpulsionProvider)theEObject;
				T result = caseSlopeImpulsionProvider(slopeImpulsionProvider);
				if (result == null) result = caseEventProvider(slopeImpulsionProvider);
				if (result == null) result = caseEventsProviderAbstract(slopeImpulsionProvider);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(slopeImpulsionProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.AMOUNT_IMPULSION_PROVIDER: {
				AmountImpulsionProvider amountImpulsionProvider = (AmountImpulsionProvider)theEObject;
				T result = caseAmountImpulsionProvider(amountImpulsionProvider);
				if (result == null) result = caseEventProvider(amountImpulsionProvider);
				if (result == null) result = caseEventsProviderAbstract(amountImpulsionProvider);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(amountImpulsionProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER: {
				AmountAbsoluteProvider amountAbsoluteProvider = (AmountAbsoluteProvider)theEObject;
				T result = caseAmountAbsoluteProvider(amountAbsoluteProvider);
				if (result == null) result = caseEventProvider(amountAbsoluteProvider);
				if (result == null) result = caseEventsProviderAbstract(amountAbsoluteProvider);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(amountAbsoluteProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER: {
				SlopeAbsoluteProvider slopeAbsoluteProvider = (SlopeAbsoluteProvider)theEObject;
				T result = caseSlopeAbsoluteProvider(slopeAbsoluteProvider);
				if (result == null) result = caseEventProvider(slopeAbsoluteProvider);
				if (result == null) result = caseEventsProviderAbstract(slopeAbsoluteProvider);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(slopeAbsoluteProvider);
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
	 * Returns the result of interpreting the object as an instance of '<em>Object With Propagator Function Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object With Propagator Function Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectWithPropagatorFunctionAdapter(ObjectWithPropagatorFunctionAdapter object) {
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

} //ContinuousSwitch
