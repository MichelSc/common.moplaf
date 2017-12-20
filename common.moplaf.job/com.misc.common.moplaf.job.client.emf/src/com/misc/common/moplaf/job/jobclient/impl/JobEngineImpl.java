/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobEngine;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Engine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl#getJobScheduled <em>Job Scheduled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl#getExecuteEnabledFeedback <em>Execute Enabled Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JobEngineImpl extends MinimalEObjectImpl.Container implements JobEngine {
	/**
	 * The cached value of the '{@link #getJobScheduled() <em>Job Scheduled</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobScheduled()
	 * @generated
	 * @ordered
	 */
	protected EList<JobScheduled> jobScheduled;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecuteEnabledFeedback() <em>Execute Enabled Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecuteEnabledFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback EXECUTE_ENABLED_FEEDBACK_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobClientPackage.Literals.JOB_ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobScheduled> getJobScheduled() {
		if (jobScheduled == null) {
			jobScheduled = new EObjectWithInverseResolvingEList<JobScheduled>(JobScheduled.class, this, JobClientPackage.JOB_ENGINE__JOB_SCHEDULED, JobClientPackage.JOB_SCHEDULED__SCHEDULED_ON);
		}
		return jobScheduled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_ENGINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobScheduler getScheduler() {
		if (eContainerFeatureID() != JobClientPackage.JOB_ENGINE__SCHEDULER) return null;
		return (JobScheduler)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduler(JobScheduler newScheduler, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScheduler, JobClientPackage.JOB_ENGINE__SCHEDULER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler(JobScheduler newScheduler) {
		if (newScheduler != eInternalContainer() || (eContainerFeatureID() != JobClientPackage.JOB_ENGINE__SCHEDULER && newScheduler != null)) {
			if (EcoreUtil.isAncestor(this, newScheduler))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScheduler != null)
				msgs = ((InternalEObject)newScheduler).eInverseAdd(this, JobClientPackage.JOB_SCHEDULER__ENGINES, JobScheduler.class, msgs);
			msgs = basicSetScheduler(newScheduler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_ENGINE__SCHEDULER, newScheduler, newScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFeedback getExecuteEnabledFeedback() {
		// TODO: implement this method to return the 'Execute Enabled Feedback' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void executeJob(JobScheduled job) {
		Plugin.INSTANCE.logInfo("JobEngine.executeJob");
		this.getJobScheduled().add(job);
		this.executeJobImpl(job);
	}
	
	protected void executeJobImpl(JobScheduled job) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobClientPackage.JOB_ENGINE__JOB_SCHEDULED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJobScheduled()).basicAdd(otherEnd, msgs);
			case JobClientPackage.JOB_ENGINE__SCHEDULER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScheduler((JobScheduler)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	protected void stopImpl(){
		// to be overloaded by concrete engine
		// default does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobClientPackage.JOB_ENGINE__JOB_SCHEDULED:
				return ((InternalEList<?>)getJobScheduled()).basicRemove(otherEnd, msgs);
			case JobClientPackage.JOB_ENGINE__SCHEDULER:
				return basicSetScheduler(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JobClientPackage.JOB_ENGINE__SCHEDULER:
				return eInternalContainer().eInverseRemove(this, JobClientPackage.JOB_SCHEDULER__ENGINES, JobScheduler.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobClientPackage.JOB_ENGINE__JOB_SCHEDULED:
				return getJobScheduled();
			case JobClientPackage.JOB_ENGINE__NAME:
				return getName();
			case JobClientPackage.JOB_ENGINE__SCHEDULER:
				return getScheduler();
			case JobClientPackage.JOB_ENGINE__EXECUTE_ENABLED_FEEDBACK:
				return getExecuteEnabledFeedback();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JobClientPackage.JOB_ENGINE__JOB_SCHEDULED:
				getJobScheduled().clear();
				getJobScheduled().addAll((Collection<? extends JobScheduled>)newValue);
				return;
			case JobClientPackage.JOB_ENGINE__NAME:
				setName((String)newValue);
				return;
			case JobClientPackage.JOB_ENGINE__SCHEDULER:
				setScheduler((JobScheduler)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JobClientPackage.JOB_ENGINE__JOB_SCHEDULED:
				getJobScheduled().clear();
				return;
			case JobClientPackage.JOB_ENGINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JobClientPackage.JOB_ENGINE__SCHEDULER:
				setScheduler((JobScheduler)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JobClientPackage.JOB_ENGINE__JOB_SCHEDULED:
				return jobScheduled != null && !jobScheduled.isEmpty();
			case JobClientPackage.JOB_ENGINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JobClientPackage.JOB_ENGINE__SCHEDULER:
				return getScheduler() != null;
			case JobClientPackage.JOB_ENGINE__EXECUTE_ENABLED_FEEDBACK:
				return EXECUTE_ENABLED_FEEDBACK_EDEFAULT == null ? getExecuteEnabledFeedback() != null : !EXECUTE_ENABLED_FEEDBACK_EDEFAULT.equals(getExecuteEnabledFeedback());
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
			case JobClientPackage.JOB_ENGINE___EXECUTE_JOB__JOBSCHEDULED:
				executeJob((JobScheduled)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //JobEngineImpl
