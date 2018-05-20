package com.misc.common.moplaf.scheduler.provider;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.emf.edit.command.BaseCommand;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.Task;

public class ScheduleCommand extends BaseCommand {
	private Schedule schedule;
	private Task fromTask;
	private Task toTask;
	private Resource resource;
	private Task previous;
	private Task next;
	private boolean propagate; 

	public ScheduleCommand(boolean propagate, Schedule schedule, Task from, Task to, Resource on, Task previous, Task next) {
		super("Schedule", "Schedule Tasks");
		this.propagate = propagate;
		this.schedule = schedule;
		this.fromTask = from;
		this.toTask   = to;
		this.resource = on;
		this.previous = previous;
		this.next     = next;
	}
	
	public ScheduleCommand(Schedule schedule, Task from, Task to, Resource on, Task previous, Task next) {
		super("Schedule", "Schedule Tasks");
		this.propagate = false;
		this.schedule = schedule;
		this.fromTask = from;
		this.toTask   = to;
		this.resource = on;
		this.previous = previous;
		this.next     = next;
	}
	
	@Override
	protected boolean prepare(){
		boolean isExecutable = true;
		EnabledFeedback feedback = this.schedule.scheduleFeedback(this.fromTask, this.toTask, this.resource, this.previous, this.next);
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
			this.schedule.schedule(this.fromTask, this.toTask, this.resource, this.previous, this.next);
			this.schedule.refresh();
			
		} else {
			this.schedule.schedule(this.fromTask, this.toTask, this.resource, this.previous, this.next);
		}
	}
}
