package com.misc.common.moplaf.scheduler.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;

import com.misc.common.moplaf.emf.edit.ui.provider.TransientItemProviderAdapter;
import com.misc.common.moplaf.scheduler.Schedule;

public class ScheduleNodesItemProvider extends TransientItemProviderAdapter {

	public ScheduleNodesItemProvider(AdapterFactory adapterFactory, Schedule schedule) {
		super(adapterFactory);
		schedule.eAdapters().add(this);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SchedulerEditPlugin.INSTANCE;
	}

}
