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
package com.misc.common.moplaf.time.continuous.calc.util;


import org.eclipse.emf.common.CommonPlugin;

import com.misc.common.moplaf.propagator2.util.PropagatorFunctionManagerAdapter;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsConstructors;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsFactory;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;

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

	public static PropagatorFunctionsFactory constructor = PropagatorFunctionsFactory.constructPropagatorFunctionsFactory(PropagatorFunctionDistribution.PropagatorFunctionFactoryID);

	static PropagatorFunctionsConstructors distributionPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.DISTRIBUTION) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_SCOPE_DISTRIBUTION)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_DISTRIBUTION_INITIALIZATION)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_DISTRIBUTION_CHILD_EVENTS)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_DISTRIBUTION_PROVIDED_EVENTS)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS)
			;

	static PropagatorFunctionsConstructors distributionEventPropagatorFunctionsConstructors =  
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_EVENT_SLOPE_BEFORE)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_EVENT_SLOPE_AFTER)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_EVENT_AMOUNT_AFTER)
			;

	static PropagatorFunctionsConstructors eventsProviderPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.EVENTS_PROVIDER_ABSTRACT) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS)
			;

	static PropagatorFunctionsConstructors childEventPropagatorFunctionsConstructors =  
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.CHILD_EVENT) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_CHILD_EVENT_MOMENT)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_CHILD_EVENT_SLOPE_AFTER)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_CHILD_EVENT_AMOUNT_AFTER)
			;

	static PropagatorFunctionsConstructors startEventPropagatorFunctionsConstructors =  
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.START_EVENT) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_START_EVENT_SLOPE_AFTER)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_START_EVENT_AMOUNT_AFTER)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_START_EVENT_MOMENT)
			;
	
	static PropagatorFunctionsConstructors endEventPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.END_EVENT) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_END_EVENT_MOMENT)
			;
	
	static PropagatorFunctionsConstructors slopeImpulsionsPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.SLOPE_IMPULSION) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_AFTER)
			;
					
	static PropagatorFunctionsConstructors amountImpulsionsPropagatorFunctionsConstructors =  
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.AMOUNT_IMPULSION) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_AMOUNT_IMPULSION_AMOUNT_AFTER)
			;
				
	static PropagatorFunctionsConstructors slopeAbsolutePropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.SLOPE_ABSOLUTE) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_SLOPE_ABSOLUTE_SLOPE_AFTER)
			;
							

	static PropagatorFunctionsConstructors capacityChangeStartPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.CAPACITY_CHANGE_START) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_CAPACITY_CHANGE_START_AMOUNT_IMPULSION)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_CAPACITY_CHANGE_START_MOMENT)
			;

	static PropagatorFunctionsConstructors capacityChangeEndPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.CAPACITY_CHANGE_END) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_CAPACITY_CHANGE_END_AMOUNT_IMPULSION)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_CAPACITY_CHANGE_END_MOMENT)
			;

	static PropagatorFunctionsConstructors stockChangeStartPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.STOCK_CHANGE_START) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_STOCK_CHANGE_START_MOMENT)
			;

	static PropagatorFunctionsConstructors stockChangeEndPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.STOCK_CHANGE_END) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_STOCK_CHANGE_END_SLOPE_IMPULSION)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_STOCK_CHANGE_END_MOMENT)
			;

	static PropagatorFunctionsConstructors amountImpulsionAtomicPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.AMOUNT_IMPULSION_ATOMIC) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_AMOUNT_IMPULSION)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_AMOUNT_IMPULSION_ATOMIC_MOMENT)
			;

	static PropagatorFunctionsConstructors slopeImpulsionAtomicPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.SLOPE_IMPULSION_ATOMIC) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_SLOPE_IMPULSION)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_SLOPE_IMPULSION_ATOMIC_MOMENT)
			;

	static PropagatorFunctionsConstructors amountAbsoluteAtomicPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.AMOUNT_ABSOLUTE_ATOMIC) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT)
			;

	static PropagatorFunctionsConstructors slopeAbsoluteAtomicPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(TimeContinuousPackage.Literals.SLOPE_ABSOLUTE_ATOMIC) 
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE)
			.addConstructor(TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT)
			;

}
