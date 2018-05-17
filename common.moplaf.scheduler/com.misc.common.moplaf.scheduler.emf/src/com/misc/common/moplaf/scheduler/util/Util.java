package com.misc.common.moplaf.scheduler.util;

import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.Task;

public class Util {
	// plan 1 task
	public static void schedule(Schedule schedule, Task task, Resource resource, Task previous, Task next) {
		schedule.schedule(task, task, resource, previous, next);
	}
	// unschedule 1 task
	public static void unschedule(Task task) {
		Schedule schedule = task.getSchedule();
		schedule.schedule(task, task, null, null, null);
	}
	// unschedule a sequence of tasks
	public static void unschedule(Task from, Task to) {
		Schedule schedule = from.getSchedule();
		schedule.schedule(from, to, null, null, null);
	}

}
