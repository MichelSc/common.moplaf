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
		return TimelineEditPlugin.INSTANCE;
	}

}
