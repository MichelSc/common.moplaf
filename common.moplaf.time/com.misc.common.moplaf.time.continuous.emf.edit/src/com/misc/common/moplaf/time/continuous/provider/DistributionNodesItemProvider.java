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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;

import com.misc.common.moplaf.emf.edit.ui.provider.TransientItemProviderAdapter;
import com.misc.common.moplaf.time.continuous.Distribution;

public class DistributionNodesItemProvider extends TransientItemProviderAdapter {

	public DistributionNodesItemProvider(AdapterFactory adapterFactory,
			Distribution distribution) {
		super(adapterFactory);

		distribution.eAdapters().add(this);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TimeContinuousEditPlugin.INSTANCE;
	}

}
