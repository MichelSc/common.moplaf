/**
 */
package com.misc.common.moplaf.job.jobclient;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Engine In Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngineInProcess#isAsynchronous <em>Asynchronous</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobEngineInProcess()
 * @model
 * @generated
 */
public interface JobEngineInProcess extends JobEngineProxy {
	/**
	 * Returns the value of the '<em><b>Asynchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asynchronous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asynchronous</em>' attribute.
	 * @see #setAsynchronous(boolean)
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#getJobEngineInProcess_Asynchronous()
	 * @model
	 * @generated
	 */
	boolean isAsynchronous();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobEngineInProcess#isAsynchronous <em>Asynchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asynchronous</em>' attribute.
	 * @see #isAsynchronous()
	 * @generated
	 */
	void setAsynchronous(boolean value);

} // JobEngineInProcess
