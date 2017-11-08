/**
 */
package com.misc.common.moplaf.scheduler.impl;

import com.misc.common.moplaf.common.util.EObjectListDerived;
import com.misc.common.moplaf.localsearch.Plugin;
import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.impl.StrategyImpl;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.Scheduler;
import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Task;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.scheduler.impl.SchedulerImpl#getSchedules <em>Schedules</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SchedulerImpl extends StrategyImpl implements Scheduler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Schedule> getSchedules() {
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<Schedule> newList = new EObjectListDerived<Schedule>(Schedule.class, this, SchedulerPackage.SCHEDULER__SCHEDULES, true);
		for ( Solution solution: this.getSolutions()){
			if ( solution instanceof Schedule){
				Schedule schedule= (Schedule)solution;
				newList.add(schedule);
			} else {
				String logMessage = String.format("The children of the Scheduler %s must be a Schedules and not %s",
		                this.getClass().getName(),
		                solution == null ? "null" : solution.getClass().getName());
				Plugin.INSTANCE.logError(logMessage);
			}
		}
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Score constructScore() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateTasks(Schedule schedule) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateResources(Schedule schedule) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Task constructTask(EObject task) {
		Task new_task = SchedulerFactory.eINSTANCE.createTask();
		return new_task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Resource constructResource(EObject resource) {
		Resource new_resource = SchedulerFactory.eINSTANCE.createResource();
		return new_resource;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULER__SCHEDULES:
				return getSchedules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULER__SCHEDULES:
				return !getSchedules().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SchedulerPackage.SCHEDULER___CONSTRUCT_SCORE:
				return constructScore();
			case SchedulerPackage.SCHEDULER___GENERATE_TASKS__SCHEDULE:
				generateTasks((Schedule)arguments.get(0));
				return null;
			case SchedulerPackage.SCHEDULER___GENERATE_RESOURCES__SCHEDULE:
				generateResources((Schedule)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SchedulerImpl
