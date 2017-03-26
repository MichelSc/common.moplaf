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
package com.misc.common.moplaf.flock.calc;

import com.misc.common.moplaf.flock.FlockScope;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;

public class PropagatorLayerChainFlockNextPrevious extends
		PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		FlockScope flockScope = (FlockScope) this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(flockScope, PropagatorScopeFlockScope                                   .class);
		return parent;
	}

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		FlockScope flockScope = (FlockScope) this.target;
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		PropagatorFunctionAdapter layerInitialization = Util.getPropagatorFunctionAdapter(flockScope, PropagatorLayerFlockScopeInitializer.class);
		antecedents.add(layerInitialization);
		return antecedents;
	}
	
	
	
}
