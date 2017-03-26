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
package com.misc.common.moplaf.time.continuous.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;

public class DistributionDistributionEventsItemProvider extends DistributionNodesItemProvider {

	public DistributionDistributionEventsItemProvider(AdapterFactory adapterFactory,
			Distribution distribution) {
		super(adapterFactory, distribution);
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TimeContinuousPackage.Literals.DISTRIBUTION__SEQUENCE_EVENTS);
		}
		return childrenFeatures;
	}

@Override
	public String getText(Object object) {
		return "Sequence Events";
	}
}
