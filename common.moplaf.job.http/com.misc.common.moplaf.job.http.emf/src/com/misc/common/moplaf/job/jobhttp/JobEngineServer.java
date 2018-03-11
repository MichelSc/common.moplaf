/**
 */
package com.misc.common.moplaf.job.jobhttp;

import com.misc.common.moplaf.job.jobclient.JobSource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Engine Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.JobEngineServer#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.JobEngineServer#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobEngineServer()
 * @model
 * @generated
 */
public interface JobEngineServer extends JobSource {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>"xmlrpc"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobEngineServer_Path()
	 * @model default="xmlrpc"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobhttp.JobEngineServer#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobhttp.JobServer#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(JobServer)
	 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobEngineServer_Server()
	 * @see com.misc.common.moplaf.job.jobhttp.JobServer#getHandlers
	 * @model opposite="Handlers" required="true"
	 * @generated
	 */
	JobServer getServer();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobhttp.JobEngineServer#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(JobServer value);

} // JobEngineServer
