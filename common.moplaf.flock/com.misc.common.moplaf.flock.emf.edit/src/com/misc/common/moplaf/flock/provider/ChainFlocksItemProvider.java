package com.misc.common.moplaf.flock.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.misc.common.moplaf.flock.Chain;
import com.misc.common.moplaf.flock.FlockPackage;

public class ChainFlocksItemProvider extends TransientChainItemProvider {

	public ChainFlocksItemProvider(AdapterFactory adapterFactory, Chain chain) {
		super(adapterFactory, chain);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildrenFeatures(java.lang.Object)
	 */
	@Override
	protected Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if ( this.childrenFeatures==null){
			super.getChildrenFeatures(object);
			this.childrenFeatures.add(FlockPackage.Literals.CHAIN__FLOCKS);
		}
		return this.childrenFeatures;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		return "Flocks";
	}

}
