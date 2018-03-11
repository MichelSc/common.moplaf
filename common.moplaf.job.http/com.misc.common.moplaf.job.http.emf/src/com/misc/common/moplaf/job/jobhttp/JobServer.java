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
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.JobServer#getHandlersAsSelected <em>Handlers As Selected</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.JobServer#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.JobServer#getHandlerAsOwned <em>Handler As Owned</em>}</li>
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
	 * Returns the value of the '<em><b>Handlers As Selected</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobhttp.JobEngineServer}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobhttp.JobEngineServer#getSelectedServer <em>Selected Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers As Selected</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers As Selected</em>' reference list.
	 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobServer_HandlersAsSelected()
	 * @see com.misc.common.moplaf.job.jobhttp.JobEngineServer#getSelectedServer
	 * @model opposite="SelectedServer"
	 * @generated
	 */
	EList<JobEngineServer> getHandlersAsSelected();

	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobhttp.JobEngineServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' reference list.
	 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobServer_Handlers()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<JobEngineServer> getHandlers();

	/**
	 * Returns the value of the '<em><b>Handler As Owned</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobhttp.JobEngineServer#getOwnerServer <em>Owner Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler As Owned</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler As Owned</em>' container reference.
	 * @see #setHandlerAsOwned(JobEngineServer)
	 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobServer_HandlerAsOwned()
	 * @see com.misc.common.moplaf.job.jobhttp.JobEngineServer#getOwnerServer
	 * @model opposite="OwnerServer" transient="false"
	 * @generated
	 */
	JobEngineServer getHandlerAsOwned();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobhttp.JobServer#getHandlerAsOwned <em>Handler As Owned</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler As Owned</em>' container reference.
	 * @see #getHandlerAsOwned()
	 * @generated
	 */
	void setHandlerAsOwned(JobEngineServer value);

} // JobServer
