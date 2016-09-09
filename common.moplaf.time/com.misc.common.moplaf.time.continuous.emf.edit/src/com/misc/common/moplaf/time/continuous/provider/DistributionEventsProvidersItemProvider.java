package com.misc.common.moplaf.time.continuous.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;

public class DistributionEventsProvidersItemProvider extends DistributionNodesItemProvider {

	public DistributionEventsProvidersItemProvider(AdapterFactory adapterFactory,
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

@Override
public void notifyChanged(Notification notification) {
	updateChildren(notification);

	switch (notification.getFeatureID(Distribution.class)) {
//		case ContinuousPackage.DISTRIBUTION__TIME_UNIT:
//		case ContinuousPackage.DISTRIBUTION__HORIZON_START:
//		case ContinuousPackage.DISTRIBUTION__HORIZON_END:
//		case ContinuousPackage.DISTRIBUTION__CHILD_EVENTS:
//		case ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS:
//		case ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
//		case ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
//			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
//			return;
		case ContinuousPackage.DISTRIBUTION__EVENTS_PROVIDERS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), 
					          true,     // content refresh 
					          false));  // label update
			return; 
	}
	super.notifyChanged(notification);
}


}