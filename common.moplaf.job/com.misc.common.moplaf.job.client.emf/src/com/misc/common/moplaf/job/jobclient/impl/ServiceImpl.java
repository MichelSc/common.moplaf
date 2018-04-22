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
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.Service;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.ServiceImpl#getStartFeedback <em>Start Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.ServiceImpl#getStopFeedback <em>Stop Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.ServiceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.ServiceImpl#isRunning <em>Running</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.ServiceImpl#isAutoStartStop <em>Auto Start Stop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The default value of the '{@link #getStartFeedback() <em>Start Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback START_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStopFeedback() <em>Stop Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback STOP_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean running = RUNNING_EDEFAULT;

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
	 * The default value of the '{@link #isAutoStartStop() <em>Auto Start Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoStartStop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_START_STOP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoStartStop() <em>Auto Start Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoStartStop()
	 * @generated
	 * @ordered
	 */
	protected boolean autoStartStop = AUTO_START_STOP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobClientPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getStartFeedback() {
		if ( this.isRunning()){
			return new EnabledFeedback(false, "Service started");
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getStopFeedback() {
		if ( !this.isRunning()){
			return new EnabledFeedback(false, "Service not yet started");
		}
		return EnabledFeedback.NOFEEDBACK;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunning(boolean newRunning) {
		boolean oldRunning = running;
		running = newRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.SERVICE__RUNNING, oldRunning, running));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getStatus() {
		String status = this.isRunning() ? "Running" : "Stopped";
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoStartStop() {
		return autoStartStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoStartStop(boolean newAutoStartStop) {
		boolean oldAutoStartStop = autoStartStop;
		autoStartStop = newAutoStartStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.SERVICE__AUTO_START_STOP, oldAutoStartStop, autoStartStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void start() {
		Plugin.INSTANCE.logInfo(String.format("Service %s about to start", this.getName()));
		this.startImpl();
		this.setRunning(true);
		Plugin.INSTANCE.logInfo(String.format("Service %s started", this.getName()));
	}
	
	/**
	 * 
	 */
	protected void startImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void stop() {
		Plugin.INSTANCE.logInfo(String.format("Service %s about to stop", this.getName()));
		this.stopImpl();
		this.setRunning(false);
		Plugin.INSTANCE.logInfo(String.format("Service %s stopped", this.getName()));
	}

	/**
	 * 
	 */
	protected void stopImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobClientPackage.SERVICE__START_FEEDBACK:
				return getStartFeedback();
			case JobClientPackage.SERVICE__STOP_FEEDBACK:
				return getStopFeedback();
			case JobClientPackage.SERVICE__STATUS:
				return getStatus();
			case JobClientPackage.SERVICE__RUNNING:
				return isRunning();
			case JobClientPackage.SERVICE__NAME:
				return getName();
			case JobClientPackage.SERVICE__AUTO_START_STOP:
				return isAutoStartStop();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JobClientPackage.SERVICE__RUNNING:
				setRunning((Boolean)newValue);
				return;
			case JobClientPackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case JobClientPackage.SERVICE__AUTO_START_STOP:
				setAutoStartStop((Boolean)newValue);
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
			case JobClientPackage.SERVICE__RUNNING:
				setRunning(RUNNING_EDEFAULT);
				return;
			case JobClientPackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JobClientPackage.SERVICE__AUTO_START_STOP:
				setAutoStartStop(AUTO_START_STOP_EDEFAULT);
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
			case JobClientPackage.SERVICE__START_FEEDBACK:
				return START_FEEDBACK_EDEFAULT == null ? getStartFeedback() != null : !START_FEEDBACK_EDEFAULT.equals(getStartFeedback());
			case JobClientPackage.SERVICE__STOP_FEEDBACK:
				return STOP_FEEDBACK_EDEFAULT == null ? getStopFeedback() != null : !STOP_FEEDBACK_EDEFAULT.equals(getStopFeedback());
			case JobClientPackage.SERVICE__STATUS:
				return STATUS_EDEFAULT == null ? getStatus() != null : !STATUS_EDEFAULT.equals(getStatus());
			case JobClientPackage.SERVICE__RUNNING:
				return running != RUNNING_EDEFAULT;
			case JobClientPackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JobClientPackage.SERVICE__AUTO_START_STOP:
				return autoStartStop != AUTO_START_STOP_EDEFAULT;
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
			case JobClientPackage.SERVICE___START:
				start();
				return null;
			case JobClientPackage.SERVICE___STOP:
				stop();
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
		result.append(" (Running: ");
		result.append(running);
		result.append(", Name: ");
		result.append(name);
		result.append(", AutoStartStop: ");
		result.append(autoStartStop);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
