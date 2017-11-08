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
package com.misc.common.moplaf.job.jobclient.util;

import com.misc.common.moplaf.job.jobclient.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage
 * @generated
 */
public class JobclientSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JobclientPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobclientSwitch() {
		if (modelPackage == null) {
			modelPackage = JobclientPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JobclientPackage.JOB_REMOTE: {
				JobRemote jobRemote = (JobRemote)theEObject;
				T result = caseJobRemote(jobRemote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobclientPackage.JOB_ENGINE_PROXY: {
				JobEngineProxy jobEngineProxy = (JobEngineProxy)theEObject;
				T result = caseJobEngineProxy(jobEngineProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobclientPackage.JOB_REMOTE_RESULT: {
				JobRemoteResult jobRemoteResult = (JobRemoteResult)theEObject;
				T result = caseJobRemoteResult(jobRemoteResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobclientPackage.JOB_ENGINE: {
				JobEngine jobEngine = (JobEngine)theEObject;
				T result = caseJobEngine(jobEngine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobclientPackage.SUBMITTED_JOB: {
				SubmittedJob submittedJob = (SubmittedJob)theEObject;
				T result = caseSubmittedJob(submittedJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobclientPackage.JOB_ENGINE_IN_PROCESS: {
				JobEngineInProcess jobEngineInProcess = (JobEngineInProcess)theEObject;
				T result = caseJobEngineInProcess(jobEngineInProcess);
				if (result == null) result = caseJobEngineProxy(jobEngineInProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobclientPackage.JOB_SCHEDULER: {
				JobScheduler jobScheduler = (JobScheduler)theEObject;
				T result = caseJobScheduler(jobScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobclientPackage.JOB_SCHEDULED: {
				JobScheduled jobScheduled = (JobScheduled)theEObject;
				T result = caseJobScheduled(jobScheduled);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobclientPackage.ENGINE: {
				Engine engine = (Engine)theEObject;
				T result = caseEngine(engine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job Remote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job Remote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobRemote(JobRemote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job Engine Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job Engine Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobEngineProxy(JobEngineProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobEngine(JobEngine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submitted Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submitted Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmittedJob(SubmittedJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job Engine In Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job Engine In Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobEngineInProcess(JobEngineInProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobScheduler(JobScheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job Scheduled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job Scheduled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobScheduled(JobScheduled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngine(Engine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job Remote Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job Remote Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobRemoteResult(JobRemoteResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JobclientSwitch
