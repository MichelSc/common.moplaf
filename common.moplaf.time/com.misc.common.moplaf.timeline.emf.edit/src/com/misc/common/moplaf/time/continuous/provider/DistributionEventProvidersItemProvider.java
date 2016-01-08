package com.misc.common.moplaf.time.continuous.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;

public class DistributionEventProvidersItemProvider extends DistributionNodesItemProvider {

	public DistributionEventProvidersItemProvider(AdapterFactory adapterFactory,
			Distribution distribution) {
		super(adapterFactory, distribution);
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS);
		}
		return childrenFeatures;
	}

@Override
	public String getText(Object object) {
		return "Event Providers";
	}
}
