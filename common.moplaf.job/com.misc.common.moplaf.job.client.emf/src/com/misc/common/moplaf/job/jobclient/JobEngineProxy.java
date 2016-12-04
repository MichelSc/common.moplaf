/**
 */
package com.misc.common.moplaf.job.jobclient;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Engine Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngineProxy#getSubmittedJobs <em>Submitted Jobs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngineProxy#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobEngineProxy()
 * @model abstract="true"
 * @generated
 */
public interface JobEngineProxy extends EObject {
	/**
	 * Returns the value of the '<em><b>Submitted Jobs</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobclient.JobRemote}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getHandlingEngine <em>Handling Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submitted Jobs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submitted Jobs</em>' reference list.
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobEngineProxy_SubmittedJobs()
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getHandlingEngine
	 * @model opposite="HandlingEngine"
	 * @generated
	 */
	EList<JobRemote> getSubmittedJobs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobEngineProxy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobEngineProxy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int submitJob(JobRemote job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	JobRemote getJob(int submissionID);

} // JobEngineProxy
