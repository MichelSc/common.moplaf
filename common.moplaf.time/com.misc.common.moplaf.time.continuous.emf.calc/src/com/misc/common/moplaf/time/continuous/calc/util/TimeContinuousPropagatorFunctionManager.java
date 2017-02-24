package com.misc.common.moplaf.time.continuous.calc.util;


import org.eclipse.emf.common.CommonPlugin;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionManagerAdapter;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsConstructor;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsConstructors;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsFactory;
import com.misc.common.moplaf.time.continuous.AmountAbsolute;
import com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic;
import com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider;
import com.misc.common.moplaf.time.continuous.AmountImpulsion;
import com.misc.common.moplaf.time.continuous.AmountImpulsionAtomic;
import com.misc.common.moplaf.time.continuous.AmountImpulsionProvider;
import com.misc.common.moplaf.time.continuous.CapacityChange;
import com.misc.common.moplaf.time.continuous.CapacityChangeEnd;
import com.misc.common.moplaf.time.continuous.CapacityChangeStart;
import com.misc.common.moplaf.time.continuous.ChildEvent;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.EndEvent;
import com.misc.common.moplaf.time.continuous.EventProvider;
import com.misc.common.moplaf.time.continuous.EventsProvider;
import com.misc.common.moplaf.time.continuous.EventsProviderAbstract;
import com.misc.common.moplaf.time.continuous.OwnedEvent;
import com.misc.common.moplaf.time.continuous.ProvidedEvent;
import com.misc.common.moplaf.time.continuous.SlopeAbsolute;
import com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic;
import com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider;
import com.misc.common.moplaf.time.continuous.SlopeImpulsion;
import com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic;
import com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider;
import com.misc.common.moplaf.time.continuous.StartEvent;
import com.misc.common.moplaf.time.continuous.StockChange;
import com.misc.common.moplaf.time.continuous.StockChangeEnd;
import com.misc.common.moplaf.time.continuous.StockChangeStart;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionChildEvents;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionInitialization;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEndEventMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountBefore;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeBefore;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventsProviderRefreshEvents;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteAtomicMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionAtomicMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionAtomicSlopeImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeEndMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeEndSlopeImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartSlopeImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes;
import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcFactory;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAtomicAmountAbsolute;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAtomicMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAtomicAmountImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountImpulsionAtomicMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeEndAmountImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeEndMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeStartAmountImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeStartMoment;
import com.misc.common.moplaf.time.continuous.util.TimeContinuousSwitch;

public class TimeContinuousPropagatorFunctionManager extends PropagatorFunctionManagerAdapter {

	/**
	 * Constructor
	 */
	public TimeContinuousPropagatorFunctionManager() {
		super( constructor);
	}

	/**
	 * Helper for refreshing a Distribution
	 * @param project
	 */
	static void refreshDistribution(Distribution distribution){
		 CommonPlugin.INSTANCE.log( "TimeContinuous, refresh called: distribution");
		 PropagatorScopeDistribution scopeDistribution = distribution.getPropagatorFunction(PropagatorScopeDistribution.class);
		 if ( scopeDistribution !=null){
			 scopeDistribution.refresh();
		 }
	}


		static PropagatorFunctionsConstructors distributionPropagatorFunctionsConstructors = PropagatorFunctionsFactory.constructPropagatorFunctionsConstructors() 
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_SCOPE_DISTRIBUTION)
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION)
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH)
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS)
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS)
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE)
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES)
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS)
				;

		static PropagatorFunctionsConstructors distributionEventPropagatorFunctionsConstructors = PropagatorFunctionsFactory.constructPropagatorFunctionsConstructors() 
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_EVENT_SLOPE_BEFORE)
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE)
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_EVENT_SLOPE_AFTER)
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_EVENT_AMOUNT_AFTER)
				;

		static PropagatorFunctionsConstructors childEventPropagatorFunctionsConstructors = PropagatorFunctionsFactory.constructPropagatorFunctionsConstructors() 
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_CHILD_EVENT_MOMENT)
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER)
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER)
				;

		static PropagatorFunctionsConstructors startEventPropagatorFunctionsConstructors = PropagatorFunctionsFactory.constructPropagatorFunctionsConstructors() 
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER)
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER)
				.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_START_EVENT_MOMENT)
				;
		
		static PropagatorFunctionsFactory constructor = PropagatorFunctionsFactory.constructPropagatorFunctionsFactory()
				.addPropagatorFunctionsFactory(TimeContinuousPackage.Literals.DISTRIBUTION,       distributionPropagatorFunctionsConstructors)
				.addPropagatorFunctionsFactory(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT, distributionEventPropagatorFunctionsConstructors)
				.addPropagatorFunctionsFactory(TimeContinuousPackage.Literals.START_EVENT,        startEventPropagatorFunctionsConstructors)
				;
		

		@Override
		public Boolean caseEndEvent(EndEvent object) {
			PropagatorCalcEndEventMoment calcEndEventMoment = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcEndEventMoment();
			object.addPropagatorFunction(calcEndEventMoment);

			return null;
		}

		@Override
		public Boolean caseAmountImpulsion(AmountImpulsion object) {
			PropagatorCalcAmountImpulsionAmountAfter calcAmountImpulsionAmountAfter = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcAmountImpulsionAmountAfter();
			object.addPropagatorFunction(calcAmountImpulsionAmountAfter);

			return null;
		}

		@Override
		public Boolean caseSlopeImpulsion(SlopeImpulsion object) {
			PropagatorCalcSlopeImpulsionSlopeAfter calcSlopeImpulsionSlopeAfter = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcSlopeImpulsionSlopeAfter();
			object.addPropagatorFunction(calcSlopeImpulsionSlopeAfter );

			return null;
		}

		@Override
		public Boolean caseAmountAbsolute(AmountAbsolute object) {
			PropagatorCalcAmountAbsoluteAmountAfter calcAmountAbsoluteAmountAfter= TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcAmountAbsoluteAmountAfter();
			object.addPropagatorFunction(calcAmountAbsoluteAmountAfter);

			return null;
		}

		@Override
		public Boolean caseSlopeAbsolute(SlopeAbsolute object) {
			PropagatorCalcSlopeAbsoluteSlopeAfter calcSlopeAbsoluteSlopeAfter = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcSlopeAbsoluteSlopeAfter();
			object.addPropagatorFunction(calcSlopeAbsoluteSlopeAfter);

			return null;
		}

		@Override
		public Boolean caseCapacityChangeStart(CapacityChangeStart object) {
			PropagatorCalcCapacityChangeStartAmountImpulsion calcCapacityChangeStartAmountImpulsion = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcCapacityChangeStartAmountImpulsion();
			object.addPropagatorFunction(calcCapacityChangeStartAmountImpulsion);

			PropagatorCalcCapacityChangeStartMoment calcCapacityChangeStartMoment= TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcCapacityChangeStartMoment();
			object.addPropagatorFunction(calcCapacityChangeStartMoment);

			return null;
		}

		@Override
		public Boolean caseCapacityChangeEnd(CapacityChangeEnd object) {
			PropagatorCalcCapacityChangeEndAmountImpulsion calcCapacityChangeEndAmountImpulsion = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcCapacityChangeEndAmountImpulsion();
			object.addPropagatorFunction(calcCapacityChangeEndAmountImpulsion);

			PropagatorCalcCapacityChangeEndMoment calcCapacityChangeEndMoment = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcCapacityChangeEndMoment();
			object.addPropagatorFunction(calcCapacityChangeEndMoment);

			return null;
		}

		@Override
		public Boolean caseStockChangeStart(StockChangeStart object) {
			PropagatorCalcStockChangeStartSlopeImpulsion calcStockChangeStartSlopeImpulsion = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcStockChangeStartSlopeImpulsion();
			object.addPropagatorFunction(calcStockChangeStartSlopeImpulsion);
			
			PropagatorCalcStockChangeStartMoment calcStockChangeStartMoment= TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcStockChangeStartMoment();
			object.addPropagatorFunction(calcStockChangeStartMoment);
			
			return null;
		}

		@Override
		public Boolean caseStockChangeEnd(StockChangeEnd object) {
			PropagatorCalcStockChangeEndSlopeImpulsion calcStockChangeEndSlopeImpulsion= TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcStockChangeEndSlopeImpulsion();
			object.addPropagatorFunction(calcStockChangeEndSlopeImpulsion);

			PropagatorCalcStockChangeEndMoment calcStockChangeEndMoment = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcStockChangeEndMoment();
			object.addPropagatorFunction(calcStockChangeEndMoment);

			return null;
		}

		@Override
		public Boolean caseAmountImpulsionAtomic(AmountImpulsionAtomic object) {
			PropagatorCalcAmountImpulsionAtomicMoment calcAmountImpulsionAtomicMoment = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcAmountImpulsionAtomicMoment();
			object.addPropagatorFunction(calcAmountImpulsionAtomicMoment);

			PropagatorCalcAmountImpulsionAtomicAmountImpulsion calcAmountImpulsionAtomicAmountImpulsion = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcAmountImpulsionAtomicAmountImpulsion();
			object.addPropagatorFunction(calcAmountImpulsionAtomicAmountImpulsion);

			return null;
		}

		@Override
		public Boolean caseSlopeImpulsionAtomic(SlopeImpulsionAtomic object) {
			PropagatorCalcSlopeImpulsionAtomicMoment calcSlopeImpulsionAtomicMoment= TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcSlopeImpulsionAtomicMoment();
			object.addPropagatorFunction(calcSlopeImpulsionAtomicMoment);

			PropagatorCalcSlopeImpulsionAtomicSlopeImpulsion calcSlopeImpulsionAtomicSlopeImpulsion = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcSlopeImpulsionAtomicSlopeImpulsion();
			object.addPropagatorFunction(calcSlopeImpulsionAtomicSlopeImpulsion);

			return null;
		}

		@Override
		public Boolean caseAmountAbsoluteAtomic(AmountAbsoluteAtomic object) {
			PropagatorCalcAmountAbsoluteAtomicMoment calcAmountAbsoluteAtomicMoment = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcAmountAbsoluteAtomicMoment();
			object.addPropagatorFunction(calcAmountAbsoluteAtomicMoment);

			PropagatorCalcAmountAbsoluteAtomicAmountAbsolute calcAmountAbsoluteAtomicAmountAbsolute = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcAmountAbsoluteAtomicAmountAbsolute();
			object.addPropagatorFunction(calcAmountAbsoluteAtomicAmountAbsolute);

			return null;
		}

		@Override
		public Boolean caseSlopeAbsoluteAtomic(SlopeAbsoluteAtomic object) {
			PropagatorCalcSlopeAbsoluteAtomicMoment calcSlopeAbsoluteAtomicMoment = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcSlopeAbsoluteAtomicMoment();
			object.addPropagatorFunction(calcSlopeAbsoluteAtomicMoment);

			PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute calcSlopeAbsoluteAtomicSlopeAbsolute = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute();
			object.addPropagatorFunction(calcSlopeAbsoluteAtomicSlopeAbsolute);

			return null;
		}

		@Override
		public Boolean caseEventsProviderAbstract(EventsProviderAbstract object) {
			PropagatorCalcEventsProviderRefreshEvents calcEventsProviderRefreshEvents = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcEventsProviderRefreshEvents();
			object.addPropagatorFunction(calcEventsProviderRefreshEvents);

			return null;
		}

		@Override
		public Boolean caseEventsProvider(EventsProvider object) {
			return null;
		}

		@Override
		public Boolean caseStockChange(StockChange object) {
			return null;
		}

		@Override
		public Boolean caseCapacityChange(CapacityChange object) {
			return null;
		}

		@Override
		public Boolean caseEventProvider(EventProvider object) {
			return null;
		}

		@Override
		public Boolean caseSlopeImpulsionProvider(SlopeImpulsionProvider object) {
			return null;
		}

		@Override
		public Boolean caseSlopeAbsoluteProvider(SlopeAbsoluteProvider object) {
			return null;
		}

		@Override
		public Boolean caseAmountImpulsionProvider(AmountImpulsionProvider object) {
			return null;
		}

		@Override
		public Boolean caseAmountAbsoluteProvider(AmountAbsoluteProvider object) {
			return null;
		}

		@Override
		public Boolean caseOwnedEvent(OwnedEvent object) {
			return null;
		}

		@Override
		public Boolean caseProvidedEvent(ProvidedEvent object) {
			return null;
		}

	} // class PropagatorFunctionsConstructor
}
