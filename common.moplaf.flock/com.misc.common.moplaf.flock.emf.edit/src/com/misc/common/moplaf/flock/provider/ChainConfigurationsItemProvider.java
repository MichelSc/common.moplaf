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
package com.misc.common.moplaf.flock.provider;


import org.eclipse.emf.common.notify.AdapterFactory;

import com.misc.common.moplaf.flock.Chain;

public class ChainConfigurationsItemProvider extends TransientChainItemProvider {

	public ChainConfigurationsItemProvider(AdapterFactory adapterFactory, Chain chain) {
		super(adapterFactory, chain);
	}


	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		return "Configurations";
	}

}
