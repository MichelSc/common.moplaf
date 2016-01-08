/**
 */
package com.misc.common.moplaf.time.continuous.util;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.common.moplaf.time.continuous.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage
 * @generated
 */
public class ContinuousAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContinuousPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContinuousPackage.eINSTANCE;
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
	protected ContinuousSwitch<Adapter> modelSwitch =
		new ContinuousSwitch<Adapter>() {
			@Override
			public Adapter caseDistribution(Distribution object) {
				return createDistributionAdapter();
			}
			@Override
			public Adapter caseDistributionEvent(DistributionEvent object) {
				return createDistributionEventAdapter();
			}
			@Override
			public Adapter caseChildEvent(ChildEvent object) {
				return createChildEventAdapter();
			}
			@Override
			public Adapter caseStartEvent(StartEvent object) {
				return createStartEventAdapter();
			}
			@Override
			public Adapter caseEndEvent(EndEvent object) {
				return createEndEventAdapter();
			}
			@Override
			public Adapter caseAmountImpulsion(AmountImpulsion object) {
				return createAmountImpulsionAdapter();
			}
			@Override
			public Adapter caseSlopeImpulsion(SlopeImpulsion object) {
				return createSlopeImpulsionAdapter();
			}
			@Override
			public Adapter caseAmountAbsolute(AmountAbsolute object) {
				return createAmountAbsoluteAdapter();
			}
			@Override
			public Adapter caseSlopeAbsolute(SlopeAbsolute object) {
				return createSlopeAbsoluteAdapter();
			}
			@Override
			public Adapter caseCapacityChangeStart(CapacityChangeStart object) {
				return createCapacityChangeStartAdapter();
			}
			@Override
			public Adapter caseCapacityChangeEnd(CapacityChangeEnd object) {
				return createCapacityChangeEndAdapter();
			}
			@Override
			public Adapter caseStockChangeStart(StockChangeStart object) {
				return createStockChangeStartAdapter();
			}
			@Override
			public Adapter caseStockChangeEnd(StockChangeEnd object) {
				return createStockChangeEndAdapter();
			}
			@Override
			public Adapter caseAmountImpulsionAtomic(AmountImpulsionAtomic object) {
				return createAmountImpulsionAtomicAdapter();
			}
			@Override
			public Adapter caseSlopeImpulsionAtomic(SlopeImpulsionAtomic object) {
				return createSlopeImpulsionAtomicAdapter();
			}
			@Override
			public Adapter caseAmountAbsoluteAtomic(AmountAbsoluteAtomic object) {
				return createAmountAbsoluteAtomicAdapter();
			}
			@Override
			public Adapter caseSlopeAbsoluteAtomic(SlopeAbsoluteAtomic object) {
				return createSlopeAbsoluteAtomicAdapter();
			}
			@Override
			public Adapter caseEventsProviderAbstract(EventsProviderAbstract object) {
				return createEventsProviderAbstractAdapter();
			}
			@Override
			public Adapter caseEventsProvider(EventsProvider object) {
				return createEventsProviderAdapter();
			}
			@Override
			public Adapter caseStockChange(StockChange object) {
				return createStockChangeAdapter();
			}
			@Override
			public Adapter caseCapacityChange(CapacityChange object) {
				return createCapacityChangeAdapter();
			}
			@Override
			public Adapter caseEventProvider(EventProvider object) {
				return createEventProviderAdapter();
			}
			@Override
			public Adapter caseSlopeImpulsionProvider(SlopeImpulsionProvider object) {
				return createSlopeImpulsionProviderAdapter();
			}
			@Override
			public Adapter caseAmountImpulsionProvider(AmountImpulsionProvider object) {
				return createAmountImpulsionProviderAdapter();
			}
			@Override
			public Adapter caseAmountAbsoluteProvider(AmountAbsoluteProvider object) {
				return createAmountAbsoluteProviderAdapter();
			}
			@Override
			public Adapter caseSlopeAbsoluteProvider(SlopeAbsoluteProvider object) {
				return createSlopeAbsoluteProviderAdapter();
			}
			@Override
			public Adapter caseObjectWithPropagatorFunctionAdapter(ObjectWithPropagatorFunctionAdapter object) {
				return createObjectWithPropagatorFunctionAdapterAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.Distribution
	 * @generated
	 */
	public Adapter createDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.DistributionEvent <em>Distribution Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent
	 * @generated
	 */
	public Adapter createDistributionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.AmountImpulsion <em>Amount Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.AmountImpulsion
	 * @generated
	 */
	public Adapter createAmountImpulsionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsion <em>Slope Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.SlopeImpulsion
	 * @generated
	 */
	public Adapter createSlopeImpulsionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.AmountAbsolute <em>Amount Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.AmountAbsolute
	 * @generated
	 */
	public Adapter createAmountAbsoluteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.SlopeAbsolute <em>Slope Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.SlopeAbsolute
	 * @generated
	 */
	public Adapter createSlopeAbsoluteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.CapacityChange <em>Capacity Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChange
	 * @generated
	 */
	public Adapter createCapacityChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.EventProvider <em>Event Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.EventProvider
	 * @generated
	 */
	public Adapter createEventProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider <em>Slope Impulsion Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider
	 * @generated
	 */
	public Adapter createSlopeImpulsionProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.AmountImpulsionProvider <em>Amount Impulsion Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.AmountImpulsionProvider
	 * @generated
	 */
	public Adapter createAmountImpulsionProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider <em>Amount Absolute Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider
	 * @generated
	 */
	public Adapter createAmountAbsoluteProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider <em>Slope Absolute Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider
	 * @generated
	 */
	public Adapter createSlopeAbsoluteProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.StockChange <em>Stock Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.StockChange
	 * @generated
	 */
	public Adapter createStockChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.StockChangeStart <em>Stock Change Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.StockChangeStart
	 * @generated
	 */
	public Adapter createStockChangeStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.StockChangeEnd <em>Stock Change End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.StockChangeEnd
	 * @generated
	 */
	public Adapter createStockChangeEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.AmountImpulsionAtomic <em>Amount Impulsion Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.AmountImpulsionAtomic
	 * @generated
	 */
	public Adapter createAmountImpulsionAtomicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic <em>Slope Impulsion Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic
	 * @generated
	 */
	public Adapter createSlopeImpulsionAtomicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic <em>Amount Absolute Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic
	 * @generated
	 */
	public Adapter createAmountAbsoluteAtomicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic <em>Slope Absolute Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic
	 * @generated
	 */
	public Adapter createSlopeAbsoluteAtomicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.EventsProviderAbstract <em>Events Provider Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.EventsProviderAbstract
	 * @generated
	 */
	public Adapter createEventsProviderAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.EventsProvider <em>Events Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.EventsProvider
	 * @generated
	 */
	public Adapter createEventsProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter <em>Object With Propagator Function Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter
	 * @generated
	 */
	public Adapter createObjectWithPropagatorFunctionAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.ChildEvent <em>Child Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.ChildEvent
	 * @generated
	 */
	public Adapter createChildEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.StartEvent
	 * @generated
	 */
	public Adapter createStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.EndEvent
	 * @generated
	 */
	public Adapter createEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.CapacityChangeStart <em>Capacity Change Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChangeStart
	 * @generated
	 */
	public Adapter createCapacityChangeStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.CapacityChangeEnd <em>Capacity Change End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChangeEnd
	 * @generated
	 */
	public Adapter createCapacityChangeEndAdapter() {
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

} //ContinuousAdapterFactory
