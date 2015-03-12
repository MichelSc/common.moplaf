package com.misc.common.moplaf.flock.provider;


import org.eclipse.emf.common.notify.AdapterFactory;

import com.misc.common.moplaf.flock.Chain;

public class ChainMountsItemProvider extends TransientChainItemProvider {

	public ChainMountsItemProvider(AdapterFactory adapterFactory, Chain chain) {
		super(adapterFactory, chain);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		return "Mounts";
	}

}
