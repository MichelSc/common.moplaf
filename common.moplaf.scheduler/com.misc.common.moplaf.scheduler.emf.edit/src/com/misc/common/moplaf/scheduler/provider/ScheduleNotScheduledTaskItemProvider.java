package com.misc.common.moplaf.scheduler.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.SchedulerPackage;

public class ScheduleNotScheduledTaskItemProvider extends ScheduleNodesItemProvider {

public ScheduleNotScheduledTaskItemProvider(AdapterFactory adapterFactory, Schedule schedule) {
		super(adapterFactory, schedule);
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SchedulerPackage.Literals.SCHEDULE__NOT_SCHEDULED_TASKS);
		}
		return childrenFeatures;
	}

	@Override
	public String getText(Object object) {
		return "Not scheduled tasks";
	}
}
