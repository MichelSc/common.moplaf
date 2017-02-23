package com.misc.common.moplaf.time.continuous.calc.util;


import org.eclipse.emf.common.CommonPlugin;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionManagerAdapter;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsConstructor;
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
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventDescription;
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
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionDescriptions;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes;
import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcFactory;
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
		super( new Constructor());
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

	/**
	 * the factory for the PropagatorFunctions
	 * @author michel
	 *
	 */
	static public class Constructor extends TimeContinuousSwitch<Boolean> implements PropagatorFunctionsConstructor {
		@Override
		public void construct(ObjectWithPropagatorFunctions object) {
			doSwitch(object);
		}

		@Override
		public Boolean caseDistribution(Distribution object) {
			PropagatorScopeDistribution scopeDistribution = TimeContinuousCalcFactory.eINSTANCE.createPropagatorScopeDistribution();
			object.addPropagatorFunction(scopeDistribution);

			PropagatorCalcDistributionInitialization calcDistributionInitialization = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcDistributionInitialization();
			calcDistributionInitialization.setConcreteParent(scopeDistribution);
			object.addPropagatorFunction(calcDistributionInitialization, true);

			PropagatorLayerCompositeEventRefresh layerCompositeEventRefresh= TimeContinuousCalcFactory.eINSTANCE.createPropagatorLayerCompositeEventRefresh();
			layerCompositeEventRefresh.setConcreteParent(scopeDistribution);
			layerCompositeEventRefresh.setAntecedenCalcDistributionInitialization(calcDistributionInitialization);
			object.addPropagatorFunction(layerCompositeEventRefresh);

			PropagatorCalcDistributionChildEvents calcDistributionChildEvents = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcDistributionChildEvents();
			calcDistributionChildEvents.setConcreteParent(scopeDistribution);
			object.addPropagatorFunction(calcDistributionChildEvents);

			PropagatorCalcDistributionProvidedEvents calcDistributionProvidedEvents= TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcDistributionProvidedEvents();
			calcDistributionProvidedEvents.setConcreteParent(scopeDistribution);
			calcDistributionProvidedEvents.setAntecedentCalcDistributionchildEvents(calcDistributionChildEvents);
			calcDistributionProvidedEvents.setAntecedentLayerCompositeeventRefresh(layerCompositeEventRefresh);
			object.addPropagatorFunction(calcDistributionProvidedEvents);

			PropagatorCalcDistributionSequence calcDistributionSequence = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcDistributionSequence();
			calcDistributionSequence.setConcreteParent(scopeDistribution);
			calcDistributionSequence.setAntecedentCalcDistributionProvidedEvents(calcDistributionProvidedEvents);
			object.addPropagatorFunction(calcDistributionSequence);

			PropagatorLayerDistributionSlopes layerDistributionSlopes = TimeContinuousCalcFactory.eINSTANCE.createPropagatorLayerDistributionSlopes();
			layerDistributionSlopes.setConcreteParent(scopeDistribution);
			layerDistributionSlopes.setAntecedentCalcDistributionSequence(calcDistributionSequence);
			object.addPropagatorFunction(layerDistributionSlopes);

			PropagatorLayerDistributionAmounts layerDistributionAmounts = TimeContinuousCalcFactory.eINSTANCE.createPropagatorLayerDistributionAmounts();
			layerDistributionAmounts.setConcreteParent(scopeDistribution);
			layerDistributionAmounts.setAntecedentLayerDistributionSlopes(layerDistributionSlopes);
			object.addPropagatorFunction(layerDistributionAmounts);

			PropagatorLayerDistributionDescriptions layerDistributionDescriptions = TimeContinuousCalcFactory.eINSTANCE.createPropagatorLayerDistributionDescriptions();
			layerDistributionDescriptions.setConcreteParent(scopeDistribution);
			layerDistributionDescriptions.setAntecedentLayerDistributionAmounts(layerDistributionAmounts);
			object.addPropagatorFunction(layerDistributionDescriptions);

			return null;
		}

		@Override
		public Boolean caseDistributionEvent(DistributionEvent object) {
			PropagatorCalcEventSlopeBefore calcEventSlopeBefore= TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcEventSlopeBefore();
			object.addPropagatorFunction(calcEventSlopeBefore);

			PropagatorCalcEventAmountBefore calcEventAmountBefore= TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcEventAmountBefore();
			object.addPropagatorFunction(calcEventAmountBefore);

			PropagatorCalcEventSlopeAfter calcEventSlopeAfter= TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcEventSlopeAfter();
			object.addPropagatorFunction(calcEventSlopeAfter);

			PropagatorCalcEventAmountAfter calcEventAmountAfter= TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcEventAmountAfter();
			object.addPropagatorFunction(calcEventAmountAfter);

			PropagatorCalcEventDescription calcEventDescription= TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcEventDescription();
			object.addPropagatorFunction(calcEventDescription);

			return null;
		}

		@Override
		public Boolean caseChildEvent(ChildEvent object) {
			PropagatorCalcChildEventMoment calcChildEventMoment= TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcChildEventMoment();
			object.addPropagatorFunction(calcChildEventMoment);

			PropagatorCalcChildEventSlopeAfter calcChildEventSlopeAfter= TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcChildEventSlopeAfter();
			object.addPropagatorFunction(calcChildEventSlopeAfter);

			PropagatorCalcChildEventAmountAfter calcChildEventAmountAfter= TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcChildEventAmountAfter();
			object.addPropagatorFunction(calcChildEventAmountAfter);

			return null;
		}

		@Override
		public Boolean caseStartEvent(StartEvent object) {
			
			PropagatorCalcStartEventSlopeAfter calcStartEventSlopeAfter = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcStartEventSlopeAfter();
			object.addPropagatorFunction(calcStartEventSlopeAfter);

			PropagatorCalcStartEventAmountAfter calcStartEventAmountAfter = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcStartEventAmountAfter();
			object.addPropagatorFunction(calcStartEventAmountAfter);

			PropagatorCalcStartEventMoment calcStartEventMoment = TimeContinuousCalcFactory.eINSTANCE.createPropagatorCalcStartEventMoment();
			object.addPropagatorFunction(calcStartEventMoment);

			return null;
		}

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
