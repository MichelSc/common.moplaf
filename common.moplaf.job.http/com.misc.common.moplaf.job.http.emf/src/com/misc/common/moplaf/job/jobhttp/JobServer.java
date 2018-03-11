/**
 */
package com.misc.common.moplaf.job.jobhttp;

import com.misc.common.moplaf.job.jobclient.Service;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.JobServer#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.JobServer#getHandlers <em>Handlers</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobServer()
 * @model
 * @generated
 */
public interface JobServer extends Service {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"8080"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobServer_Port()
	 * @model default="8080"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobhttp.JobServer#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobhttp.JobEngineServer}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobhttp.JobEngineServer#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' reference list.
	 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobServer_Handlers()
	 * @see com.misc.common.moplaf.job.jobhttp.JobEngineServer#getServer
	 * @model opposite="Server"
	 * @generated
	 */
	EList<JobEngineServer> getHandlers();

} // JobServer
