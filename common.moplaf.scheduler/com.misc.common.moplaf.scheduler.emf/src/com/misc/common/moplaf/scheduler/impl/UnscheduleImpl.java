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

import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.common.moplaf.scheduler.Unschedule;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unschedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UnscheduleImpl extends ScheduleDeltaImpl implements Unschedule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnscheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.UNSCHEDULE;
	}

	/**
	 * 
	 */
	@Override
	public String getDescription() {
		Task task1 = this.getTaskToSchedule();
		String description = String.format("Unschedule %s", 
											task1 == null ? "null" : task1.getName());
		return description;
	}

	/**
	 * 
	 */
	@Override
	public EnabledFeedback getValidFeedback() {
		EnabledFeedback feedback = super.getValidFeedback();
		if ( !feedback.isEnabled() ) {
			return feedback;
		} else if ( this.getTaskToSchedule().getScheduledResource()==null) {
			return new EnabledFeedback(false, "Task not scheduled");
		}
		return null;
	}

	/**
	 * 
	 */
	@Override
	public void doImpl() {
		Task task = this.getTaskToSchedule();
		Resource scheduled_resource = task.getScheduledResource();
		if ( scheduled_resource==null) {
		}

		task.unschedule();
	}

} //UnscheduleImpl
