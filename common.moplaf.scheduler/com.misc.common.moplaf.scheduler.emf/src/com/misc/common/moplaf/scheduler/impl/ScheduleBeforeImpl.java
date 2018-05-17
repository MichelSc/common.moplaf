/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.ScheduleBefore;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.common.moplaf.scheduler.util.Util;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Before</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScheduleBeforeImpl extends ScheduleTaskImpl implements ScheduleBefore {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleBeforeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SCHEDULE_BEFORE;
	}

	/**
	 * 
	 */
	@Override
	public String getDescription() {
		Task task1 = this.getTaskToSchedule();
		Task task2 = this.getInsertionPoint();
		String description = String.format("Schedule %s before %s", 
						task1 == null ? "null" : task1.getName(),
                        task2 == null ? "after last" : task2.getName());
		return description;
	}
	
	/**
	 * 
	 */
	@Override
	public void doImpl() {
		Task task = this.getTaskToSchedule();
        Schedule schedule = task.getSchedule();

        Task to_be_task_after = this.getInsertionPoint();
		Task to_be_task_before = to_be_task_after==null 
	                           ? this.getResource().getLastTask()
	                           : to_be_task_after.getPreviousTask();
        Resource tobe_resource = to_be_task_after==null 
                               ? this.getResource()
                               : to_be_task_after.getScheduledResource();
			
        Util.schedule(schedule, task, tobe_resource, to_be_task_before, to_be_task_after);
	}
} //ScheduleBeforeImpl
