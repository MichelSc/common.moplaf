package com.misc.common.moplaf.time.continuous.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;

public class DistributionDistributionEventsItemProvider extends DistributionNodesItemProvider {

	public DistributionDistributionEventsItemProvider(AdapterFactory adapterFactory,
			Distribution distribution) {
		super(adapterFactory, distribution);
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ContinuousPackage.Literals.DISTRIBUTION__SEQUENCE_EVENTS);
		}
		return childrenFeatures;
	}

@Override
	public String getText(Object object) {
		return "Sequence Events";
	}
}
