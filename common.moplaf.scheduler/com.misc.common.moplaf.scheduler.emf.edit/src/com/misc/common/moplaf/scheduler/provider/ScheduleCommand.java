package com.misc.common.moplaf.scheduler.provider;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.emf.edit.command.BaseCommand;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.Task;

public class ScheduleCommand extends BaseCommand {
	private Schedule schedule;
	private EList<Task> tasks;
	private Resource resource;
	private Task previous;
	private Task next;
	private boolean propagate; 

	public ScheduleCommand(boolean propagate, Schedule schedule, EList<Task> tasks, Resource on, Task previous, Task next) {
		super("Schedule", "Schedule Tasks");
		this.propagate = propagate;
		this.schedule = schedule;
		this.tasks    = tasks;
		this.resource = on;
		this.previous = previous;
		this.next     = next;
	}
	
	public ScheduleCommand(boolean propagate, Schedule schedule, Task task, Resource on, Task previous, Task next) {
		super("Schedule", "Schedule Tasks");
		this.propagate = propagate;
		this.schedule = schedule;
		this.tasks    = new BasicEList<Task>();
		this.resource = on;
		this.previous = previous;
		this.next     = next;
		this.tasks.add(task);
	}
	
	public ScheduleCommand(Schedule schedule, Task task, Resource on, Task previous, Task next) {
		super("Schedule", "Schedule Tasks");
		this.propagate = true;
		this.schedule = schedule;
		this.tasks    = new BasicEList<Task>();
		this.resource = on;
		this.previous = previous;
		this.next     = next;
		this.tasks.add(task);
	}
	
	
	@Override
	protected boolean prepare(){
		boolean isExecutable = true;
		EnabledFeedback feedback = this.schedule.scheduleFeedback(this.tasks.get(0), this.tasks.get(0), this.resource, this.previous, this.next);
		if ( !feedback.isEnabled() ) {
			isExecutable = false;
			this.setDescription(feedback.getFeedback());
		}
		return isExecutable;
	}

	@Override
	public void execute() {
		
		if ( propagate ) {
			this.schedule.enable();
			this.schedule.schedule(this.tasks, this.resource, this.previous, this.next);
			this.schedule.refresh();
			
		} else {
			this.schedule.schedule(this.tasks, this.resource, this.previous, this.next);
		}
	}
}
