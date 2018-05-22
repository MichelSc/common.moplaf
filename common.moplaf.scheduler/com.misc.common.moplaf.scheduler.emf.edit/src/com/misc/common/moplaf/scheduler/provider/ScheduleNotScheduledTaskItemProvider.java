package com.misc.common.moplaf.scheduler.provider;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.misc.common.moplaf.localsearch.Plugin;
import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Task;

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
	
	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Schedule.class)) {
			case SchedulerPackage.SCHEDULE__NOT_SCHEDULED_TASKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	
	/**
	 * Create a drag and drop command for this Solution
	 */
	private class ScheduleNotPlannedTasksDragAndDropCommand extends DragAndDropCommand {

		public ScheduleNotPlannedTasksDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
				int operation, Collection<?> collection) {
			super(domain, owner, location, operations, operation, collection);
		}
	   	
	    /**
	     * This implementation of prepare is called again to implement {@link #validate validate}.
	     * The method {@link #reset} will have been called before doing so.
	     */
	    @Override
	    protected boolean prepare(){
	    	ScheduleNotScheduledTaskItemProvider adapter = (ScheduleNotScheduledTaskItemProvider)owner;
	    	Schedule schedule = (Schedule)adapter.target;
			Plugin.INSTANCE.logInfo("NotScheduledTasks, owner="+owner.getClass().getName()+", target "+schedule.getClass().getName());
//	    	Schedule schedule = (Schedule)owner;
	    	CompoundCommand compound = new CompoundCommand();
			for (Object element : collection){
				if ( element instanceof Task ) {
					Task task = (Task) element;
					Command cmd = new ScheduleCommand(true, schedule, task, task, null, null, null);
					compound.append(cmd);
				}
			}
	    	this.dragCommand = null;
			this.dropCommand = compound;
			this.isPrepared = true;
	    	return true;
	    } // prepare

		@Override
		public boolean validate(Object owner, float location, int operations, int operation, Collection<?> collection) {
			// TODO Auto-generated method stub
			return super.validate(owner, location, operations, operation, collection);
		}
	    
	    
	};
	
	/**
	 * Create a command for a drag and drop on this Solution
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		Plugin.INSTANCE.logInfo("NotScheduledTasks, target "+owner.getClass().getName());
		return new ScheduleNotPlannedTasksDragAndDropCommand(domain, owner, location, operations, operation, collection);
	}

}
