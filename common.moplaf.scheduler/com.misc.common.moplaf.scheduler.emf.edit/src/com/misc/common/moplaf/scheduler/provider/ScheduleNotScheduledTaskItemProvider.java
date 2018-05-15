package com.misc.common.moplaf.scheduler.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;

import com.misc.common.moplaf.emf.edit.ui.provider.TransientItemProviderAdapter;

public class ScheduleNotScheduledTaskItemProvider extends TransientItemProviderAdapter {

	@Override
	public void setTarget(Notifier target) {
		// TODO Auto-generated method stub
		super.setTarget(target);
	}

	@Override
	public void unsetTarget(Notifier target) {
		// TODO Auto-generated method stub
		super.unsetTarget(target);
	}

	public ScheduleNotScheduledTaskItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		// TODO Auto-generated constructor stub
	}

}
