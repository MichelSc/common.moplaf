/**
 */
package com.misc.common.moplaf.time.continuous.calc.util;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;
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
			public Adapter casePropagatorScopeDistribution(PropagatorScopeDistribution object) {
				return createPropagatorScopeDistributionAdapter();
			}
			@Override
			public Adapter casePropagatorCalcDistributionInitialization(PropagatorCalcDistributionInitialization object) {
				return createPropagatorCalcDistributionInitializationAdapter();
			}
			@Override
			public Adapter casePropagatorLayerCompositeEventRefresh(PropagatorLayerCompositeEventRefresh object) {
				return createPropagatorLayerCompositeEventRefreshAdapter();
			}
			@Override
			public Adapter casePropagatorCalcDistributionChildEvents(PropagatorCalcDistributionChildEvents object) {
				return createPropagatorCalcDistributionChildEventsAdapter();
			}
			@Override
			public Adapter casePropagatorCalcDistributionProvidedEvents(PropagatorCalcDistributionProvidedEvents object) {
				return createPropagatorCalcDistributionProvidedEventsAdapter();
			}
			@Override
			public Adapter casePropagatorCalcDistributionSequence(PropagatorCalcDistributionSequence object) {
				return createPropagatorCalcDistributionSequenceAdapter();
			}
			@Override
			public Adapter casePropagatorLayerDistributionSlopes(PropagatorLayerDistributionSlopes object) {
				return createPropagatorLayerDistributionSlopesAdapter();
			}
			@Override
			public Adapter casePropagatorLayerDistributionAmounts(PropagatorLayerDistributionAmounts object) {
				return createPropagatorLayerDistributionAmountsAdapter();
			}
			@Override
			public Adapter casePropagatorCalcAmountAbsoluteAmountAbsolute(PropagatorCalcAmountAbsoluteAmountAbsolute object) {
				return createPropagatorCalcAmountAbsoluteAmountAbsoluteAdapter();
			}
			@Override
			public Adapter casePropagatorCalcAmountAbsoluteAmountAfter(PropagatorCalcAmountAbsoluteAmountAfter object) {
				return createPropagatorCalcAmountAbsoluteAmountAfterAdapter();
			}
			@Override
			public Adapter casePropagatorCalcAmountAbsoluteAtomicAmountAbsolute(PropagatorCalcAmountAbsoluteAtomicAmountAbsolute object) {
				return createPropagatorCalcAmountAbsoluteAtomicAmountAbsoluteAdapter();
			}
			@Override
			public Adapter casePropagatorCalcAmountAbsoluteAtomicMoment(PropagatorCalcAmountAbsoluteAtomicMoment object) {
				return createPropagatorCalcAmountAbsoluteAtomicMomentAdapter();
			}
			@Override
			public Adapter casePropagatorCalcAmountImpulsionAmountAfter(PropagatorCalcAmountImpulsionAmountAfter object) {
				return createPropagatorCalcAmountImpulsionAmountAfterAdapter();
			}
			@Override
			public Adapter casePropagatorCalcAmountImpulsionAmountImpulsion(PropagatorCalcAmountImpulsionAmountImpulsion object) {
				return createPropagatorCalcAmountImpulsionAmountImpulsionAdapter();
			}
			@Override
			public Adapter casePropagatorCalcAmountImpulsionAtomicAmountImpulsion(PropagatorCalcAmountImpulsionAtomicAmountImpulsion object) {
				return createPropagatorCalcAmountImpulsionAtomicAmountImpulsionAdapter();
			}
			@Override
			public Adapter casePropagatorCalcAmountImpulsionAtomicMoment(PropagatorCalcAmountImpulsionAtomicMoment object) {
				return createPropagatorCalcAmountImpulsionAtomicMomentAdapter();
			}
			@Override
			public Adapter casePropagatorCalcCapacityChangeEndAmountImpulsion(PropagatorCalcCapacityChangeEndAmountImpulsion object) {
				return createPropagatorCalcCapacityChangeEndAmountImpulsionAdapter();
			}
			@Override
			public Adapter casePropagatorCalcCapacityChangeEndMoment(PropagatorCalcCapacityChangeEndMoment object) {
				return createPropagatorCalcCapacityChangeEndMomentAdapter();
			}
			@Override
			public Adapter casePropagatorCalcCapacityChangeStartAmountImpulsion(PropagatorCalcCapacityChangeStartAmountImpulsion object) {
				return createPropagatorCalcCapacityChangeStartAmountImpulsionAdapter();
			}
			@Override
			public Adapter casePropagatorCalcCapacityChangeStartMoment(PropagatorCalcCapacityChangeStartMoment object) {
				return createPropagatorCalcCapacityChangeStartMomentAdapter();
			}
			@Override
			public Adapter casePropagatorCalcChildEventAmountAfter(PropagatorCalcChildEventAmountAfter object) {
				return createPropagatorCalcChildEventAmountAfterAdapter();
			}
			@Override
			public Adapter casePropagatorCalcChildEventMoment(PropagatorCalcChildEventMoment object) {
				return createPropagatorCalcChildEventMomentAdapter();
			}
			@Override
			public Adapter casePropagatorCalcChildEventSlopeAfter(PropagatorCalcChildEventSlopeAfter object) {
				return createPropagatorCalcChildEventSlopeAfterAdapter();
			}
			@Override
			public Adapter casePropagatorCalcEndEventMoment(PropagatorCalcEndEventMoment object) {
				return createPropagatorCalcEndEventMomentAdapter();
			}
			@Override
			public Adapter casePropagatorCalcEventAmountAfter(PropagatorCalcEventAmountAfter object) {
				return createPropagatorCalcEventAmountAfterAdapter();
			}
			@Override
			public Adapter casePropagatorCalcEventAmountBefore(PropagatorCalcEventAmountBefore object) {
				return createPropagatorCalcEventAmountBeforeAdapter();
			}
			@Override
			public Adapter casePropagatorCalcEventMoment(PropagatorCalcEventMoment object) {
				return createPropagatorCalcEventMomentAdapter();
			}
			@Override
			public Adapter casePropagatorCalcEventSlopeAfter(PropagatorCalcEventSlopeAfter object) {
				return createPropagatorCalcEventSlopeAfterAdapter();
			}
			@Override
			public Adapter casePropagatorCalcEventSlopeBefore(PropagatorCalcEventSlopeBefore object) {
				return createPropagatorCalcEventSlopeBeforeAdapter();
			}
			@Override
			public Adapter casePropagatorCalcEventsProviderRefreshEvents(PropagatorCalcEventsProviderRefreshEvents object) {
				return createPropagatorCalcEventsProviderRefreshEventsAdapter();
			}
			@Override
			public Adapter casePropagatorCalcSlopeAbsoluteAtomicMoment(PropagatorCalcSlopeAbsoluteAtomicMoment object) {
				return createPropagatorCalcSlopeAbsoluteAtomicMomentAdapter();
			}
			@Override
			public Adapter casePropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute(PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute object) {
				return createPropagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteAdapter();
			}
			@Override
			public Adapter casePropagatorCalcSlopeAbsoluteSlopeAbsolute(PropagatorCalcSlopeAbsoluteSlopeAbsolute object) {
				return createPropagatorCalcSlopeAbsoluteSlopeAbsoluteAdapter();
			}
			@Override
			public Adapter casePropagatorCalcSlopeAbsoluteSlopeAfter(PropagatorCalcSlopeAbsoluteSlopeAfter object) {
				return createPropagatorCalcSlopeAbsoluteSlopeAfterAdapter();
			}
			@Override
			public Adapter casePropagatorCalcSlopeImpulsionAtomicMoment(PropagatorCalcSlopeImpulsionAtomicMoment object) {
				return createPropagatorCalcSlopeImpulsionAtomicMomentAdapter();
			}
			@Override
			public Adapter casePropagatorCalcSlopeImpulsionAtomicSlopeImpulsion(PropagatorCalcSlopeImpulsionAtomicSlopeImpulsion object) {
				return createPropagatorCalcSlopeImpulsionAtomicSlopeImpulsionAdapter();
			}
			@Override
			public Adapter casePropagatorCalcSlopeImpulsionSlopeAfter(PropagatorCalcSlopeImpulsionSlopeAfter object) {
				return createPropagatorCalcSlopeImpulsionSlopeAfterAdapter();
			}
			@Override
			public Adapter casePropagatorCalcSlopeImpulsionSlopeImpulsion(PropagatorCalcSlopeImpulsionSlopeImpulsion object) {
				return createPropagatorCalcSlopeImpulsionSlopeImpulsionAdapter();
			}
			@Override
			public Adapter casePropagatorCalcStartEventAmountAfter(PropagatorCalcStartEventAmountAfter object) {
				return createPropagatorCalcStartEventAmountAfterAdapter();
			}
			@Override
			public Adapter casePropagatorCalcStartEventMoment(PropagatorCalcStartEventMoment object) {
				return createPropagatorCalcStartEventMomentAdapter();
			}
			@Override
			public Adapter casePropagatorCalcStartEventSlopeAfter(PropagatorCalcStartEventSlopeAfter object) {
				return createPropagatorCalcStartEventSlopeAfterAdapter();
			}
			@Override
			public Adapter casePropagatorCalcStockChangeEndMoment(PropagatorCalcStockChangeEndMoment object) {
				return createPropagatorCalcStockChangeEndMomentAdapter();
			}
			@Override
			public Adapter casePropagatorCalcStockChangeEndSlopeImpulsion(PropagatorCalcStockChangeEndSlopeImpulsion object) {
				return createPropagatorCalcStockChangeEndSlopeImpulsionAdapter();
			}
			@Override
			public Adapter casePropagatorCalcStockChangeStartMoment(PropagatorCalcStockChangeStartMoment object) {
				return createPropagatorCalcStockChangeStartMomentAdapter();
			}
			@Override
			public Adapter casePropagatorCalcStockChangeStartSlopeImpulsion(PropagatorCalcStockChangeStartSlopeImpulsion object) {
				return createPropagatorCalcStockChangeStartSlopeImpulsionAdapter();
			}
			@Override
			public Adapter casePropagatorCalcEventSlope(PropagatorCalcEventSlope object) {
				return createPropagatorCalcEventSlopeAdapter();
			}
			@Override
			public Adapter casePropagatorCalcAmount(PropagatorCalcAmount object) {
				return createPropagatorCalcAmountAdapter();
			}
			@Override
			public Adapter casePropagatorCalcEventAmount(PropagatorCalcEventAmount object) {
				return createPropagatorCalcEventAmountAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAmountAbsolute <em>Propagator Calc Amount Absolute Amount Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAmountAbsolute
	 * @generated
	 */
	public Adapter createPropagatorCalcAmountAbsoluteAmountAbsoluteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAmountAfter <em>Propagator Calc Amount Absolute Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAmountAfter
	 * @generated
	 */
	public Adapter createPropagatorCalcAmountAbsoluteAmountAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAtomicAmountAbsolute <em>Propagator Calc Amount Absolute Atomic Amount Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAtomicAmountAbsolute
	 * @generated
	 */
	public Adapter createPropagatorCalcAmountAbsoluteAtomicAmountAbsoluteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAtomicMoment <em>Propagator Calc Amount Absolute Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAtomicMoment
	 * @generated
	 */
	public Adapter createPropagatorCalcAmountAbsoluteAtomicMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAmountAfter <em>Propagator Calc Amount Impulsion Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAmountAfter
	 * @generated
	 */
	public Adapter createPropagatorCalcAmountImpulsionAmountAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAmountImpulsion <em>Propagator Calc Amount Impulsion Amount Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAmountImpulsion
	 * @generated
	 */
	public Adapter createPropagatorCalcAmountImpulsionAmountImpulsionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAtomicAmountImpulsion <em>Propagator Calc Amount Impulsion Atomic Amount Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAtomicAmountImpulsion
	 * @generated
	 */
	public Adapter createPropagatorCalcAmountImpulsionAtomicAmountImpulsionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAtomicMoment <em>Propagator Calc Amount Impulsion Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAtomicMoment
	 * @generated
	 */
	public Adapter createPropagatorCalcAmountImpulsionAtomicMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeEndAmountImpulsion <em>Propagator Calc Capacity Change End Amount Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeEndAmountImpulsion
	 * @generated
	 */
	public Adapter createPropagatorCalcCapacityChangeEndAmountImpulsionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeEndMoment <em>Propagator Calc Capacity Change End Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeEndMoment
	 * @generated
	 */
	public Adapter createPropagatorCalcCapacityChangeEndMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeStartAmountImpulsion <em>Propagator Calc Capacity Change Start Amount Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeStartAmountImpulsion
	 * @generated
	 */
	public Adapter createPropagatorCalcCapacityChangeStartAmountImpulsionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeStartMoment <em>Propagator Calc Capacity Change Start Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeStartMoment
	 * @generated
	 */
	public Adapter createPropagatorCalcCapacityChangeStartMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventAmountAfter <em>Propagator Calc Child Event Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventAmountAfter
	 * @generated
	 */
	public Adapter createPropagatorCalcChildEventAmountAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventMoment <em>Propagator Calc Child Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventMoment
	 * @generated
	 */
	public Adapter createPropagatorCalcChildEventMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventSlopeAfter <em>Propagator Calc Child Event Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventSlopeAfter
	 * @generated
	 */
	public Adapter createPropagatorCalcChildEventSlopeAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionChildEvents <em>Propagator Calc Distribution Child Events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionChildEvents
	 * @generated
	 */
	public Adapter createPropagatorCalcDistributionChildEventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionInitialization <em>Propagator Calc Distribution Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionInitialization
	 * @generated
	 */
	public Adapter createPropagatorCalcDistributionInitializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents <em>Propagator Calc Distribution Provided Events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents
	 * @generated
	 */
	public Adapter createPropagatorCalcDistributionProvidedEventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence <em>Propagator Calc Distribution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence
	 * @generated
	 */
	public Adapter createPropagatorCalcDistributionSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEndEventMoment <em>Propagator Calc End Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEndEventMoment
	 * @generated
	 */
	public Adapter createPropagatorCalcEndEventMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountAfter <em>Propagator Calc Event Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountAfter
	 * @generated
	 */
	public Adapter createPropagatorCalcEventAmountAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountBefore <em>Propagator Calc Event Amount Before</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountBefore
	 * @generated
	 */
	public Adapter createPropagatorCalcEventAmountBeforeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventMoment <em>Propagator Calc Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventMoment
	 * @generated
	 */
	public Adapter createPropagatorCalcEventMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeAfter <em>Propagator Calc Event Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeAfter
	 * @generated
	 */
	public Adapter createPropagatorCalcEventSlopeAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeBefore <em>Propagator Calc Event Slope Before</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeBefore
	 * @generated
	 */
	public Adapter createPropagatorCalcEventSlopeBeforeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventsProviderRefreshEvents <em>Propagator Calc Events Provider Refresh Events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventsProviderRefreshEvents
	 * @generated
	 */
	public Adapter createPropagatorCalcEventsProviderRefreshEventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteAtomicMoment <em>Propagator Calc Slope Absolute Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteAtomicMoment
	 * @generated
	 */
	public Adapter createPropagatorCalcSlopeAbsoluteAtomicMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute <em>Propagator Calc Slope Absolute Atomic Slope Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute
	 * @generated
	 */
	public Adapter createPropagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteSlopeAbsolute <em>Propagator Calc Slope Absolute Slope Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteSlopeAbsolute
	 * @generated
	 */
	public Adapter createPropagatorCalcSlopeAbsoluteSlopeAbsoluteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteSlopeAfter <em>Propagator Calc Slope Absolute Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteSlopeAfter
	 * @generated
	 */
	public Adapter createPropagatorCalcSlopeAbsoluteSlopeAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionAtomicMoment <em>Propagator Calc Slope Impulsion Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionAtomicMoment
	 * @generated
	 */
	public Adapter createPropagatorCalcSlopeImpulsionAtomicMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionAtomicSlopeImpulsion <em>Propagator Calc Slope Impulsion Atomic Slope Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionAtomicSlopeImpulsion
	 * @generated
	 */
	public Adapter createPropagatorCalcSlopeImpulsionAtomicSlopeImpulsionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionSlopeAfter <em>Propagator Calc Slope Impulsion Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionSlopeAfter
	 * @generated
	 */
	public Adapter createPropagatorCalcSlopeImpulsionSlopeAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionSlopeImpulsion <em>Propagator Calc Slope Impulsion Slope Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionSlopeImpulsion
	 * @generated
	 */
	public Adapter createPropagatorCalcSlopeImpulsionSlopeImpulsionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventAmountAfter <em>Propagator Calc Start Event Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventAmountAfter
	 * @generated
	 */
	public Adapter createPropagatorCalcStartEventAmountAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventMoment <em>Propagator Calc Start Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventMoment
	 * @generated
	 */
	public Adapter createPropagatorCalcStartEventMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventSlopeAfter <em>Propagator Calc Start Event Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventSlopeAfter
	 * @generated
	 */
	public Adapter createPropagatorCalcStartEventSlopeAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeEndMoment <em>Propagator Calc Stock Change End Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeEndMoment
	 * @generated
	 */
	public Adapter createPropagatorCalcStockChangeEndMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeEndSlopeImpulsion <em>Propagator Calc Stock Change End Slope Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeEndSlopeImpulsion
	 * @generated
	 */
	public Adapter createPropagatorCalcStockChangeEndSlopeImpulsionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartMoment <em>Propagator Calc Stock Change Start Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartMoment
	 * @generated
	 */
	public Adapter createPropagatorCalcStockChangeStartMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartSlopeImpulsion <em>Propagator Calc Stock Change Start Slope Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartSlopeImpulsion
	 * @generated
	 */
	public Adapter createPropagatorCalcStockChangeStartSlopeImpulsionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlope <em>Propagator Calc Event Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlope
	 * @generated
	 */
	public Adapter createPropagatorCalcEventSlopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmount <em>Propagator Calc Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmount
	 * @generated
	 */
	public Adapter createPropagatorCalcAmountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmount <em>Propagator Calc Event Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmount
	 * @generated
	 */
	public Adapter createPropagatorCalcEventAmountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh <em>Propagator Layer Composite Event Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh
	 * @generated
	 */
	public Adapter createPropagatorLayerCompositeEventRefreshAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts <em>Propagator Layer Distribution Amounts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts
	 * @generated
	 */
	public Adapter createPropagatorLayerDistributionAmountsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes <em>Propagator Layer Distribution Slopes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes
	 * @generated
	 */
	public Adapter createPropagatorLayerDistributionSlopesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution <em>Propagator Scope Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution
	 * @generated
	 */
	public Adapter createPropagatorScopeDistributionAdapter() {
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
