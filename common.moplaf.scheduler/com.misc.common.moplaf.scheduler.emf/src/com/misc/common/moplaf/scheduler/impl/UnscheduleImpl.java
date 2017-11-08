/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.scheduler.SchedulerPackage;
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
public class UnscheduleImpl extends MoveScheduleImpl implements Unschedule {
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
	public String getValidFeedback() {
		String feedback = super.getValidFeedback();
		if ( feedback!=null) {
			return feedback;
		} else if ( this.getTaskToSchedule().getScheduledResource()==null) {
			return "Task not scheduled";
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
