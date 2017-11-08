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

import com.misc.common.moplaf.job.jobclient.JobEngineInProcess;
import com.misc.common.moplaf.job.jobclient.JobRemote;
import com.misc.common.moplaf.job.jobclient.JobclientPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Engine In Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineInProcessImpl#isAsynchronous <em>Asynchronous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobEngineInProcessImpl extends JobEngineProxyImpl implements JobEngineInProcess {
	/**
	 * The default value of the '{@link #isAsynchronous() <em>Asynchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsynchronous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASYNCHRONOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAsynchronous() <em>Asynchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsynchronous()
	 * @generated
	 * @ordered
	 */
	protected boolean asynchronous = ASYNCHRONOUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobEngineInProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobclientPackage.Literals.JOB_ENGINE_IN_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAsynchronous() {
		return asynchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsynchronous(boolean newAsynchronous) {
		boolean oldAsynchronous = asynchronous;
		asynchronous = newAsynchronous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_ENGINE_IN_PROCESS__ASYNCHRONOUS, oldAsynchronous, asynchronous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobclientPackage.JOB_ENGINE_IN_PROCESS__ASYNCHRONOUS:
				return isAsynchronous();
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
			case JobclientPackage.JOB_ENGINE_IN_PROCESS__ASYNCHRONOUS:
				setAsynchronous((Boolean)newValue);
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
			case JobclientPackage.JOB_ENGINE_IN_PROCESS__ASYNCHRONOUS:
				setAsynchronous(ASYNCHRONOUS_EDEFAULT);
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
			case JobclientPackage.JOB_ENGINE_IN_PROCESS__ASYNCHRONOUS:
				return asynchronous != ASYNCHRONOUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (Asynchronous: ");
		result.append(asynchronous);
		result.append(')');
		return result.toString();
	}

	@Override
	public int submitJob(JobRemote job) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 
	 */	/*BART
	@Override
	protected ReturnFeedback runJobImpl(JobRemote job) {
		RunContext runContext = null;
		ReturnFeedback result = job.run(runContext);
		return result;
	}*/
	
	

} //JobEngineInProcessImpl
