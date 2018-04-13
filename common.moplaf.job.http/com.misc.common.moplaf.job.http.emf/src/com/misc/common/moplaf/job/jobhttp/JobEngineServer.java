/**
 */
package com.misc.common.moplaf.job.jobhttp;

import org.eclipse.jetty.server.handler.AbstractHandler;

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
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.JobEngineServer#getSelectedServer <em>Selected Server</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.JobEngineServer#getOwnerServer <em>Owner Server</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.JobEngineServer#getServer <em>Server</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.JobEngineServer#getTmpFolder <em>Tmp Folder</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobEngineServer()
 * @model
 * @generated
 */
public interface JobEngineServer extends JobSource {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>"default_path"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobEngineServer_Path()
	 * @model default="default_path"
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
	 * Returns the value of the '<em><b>Selected Server</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobhttp.JobServer#getHandlersAsSelected <em>Handlers As Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Server</em>' reference.
	 * @see #setSelectedServer(JobServer)
	 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobEngineServer_SelectedServer()
	 * @see com.misc.common.moplaf.job.jobhttp.JobServer#getHandlersAsSelected
	 * @model opposite="HandlersAsSelected"
	 * @generated
	 */
	JobServer getSelectedServer();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobhttp.JobEngineServer#getSelectedServer <em>Selected Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Server</em>' reference.
	 * @see #getSelectedServer()
	 * @generated
	 */
	void setSelectedServer(JobServer value);

	/**
	 * Returns the value of the '<em><b>Owner Server</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobhttp.JobServer#getHandlerAsOwned <em>Handler As Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Server</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Server</em>' containment reference.
	 * @see #setOwnerServer(JobServer)
	 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobEngineServer_OwnerServer()
	 * @see com.misc.common.moplaf.job.jobhttp.JobServer#getHandlerAsOwned
	 * @model opposite="HandlerAsOwned" containment="true"
	 * @generated
	 */
	JobServer getOwnerServer();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobhttp.JobEngineServer#getOwnerServer <em>Owner Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Server</em>' containment reference.
	 * @see #getOwnerServer()
	 * @generated
	 */
	void setOwnerServer(JobServer value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobEngineServer_Server()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	JobServer getServer();
	
	/**
	 * Returns the value of the '<em><b>Tmp Folder</b></em>' attribute.
	 * The default value is <code>"C:\\tmp"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmp Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmp Folder</em>' attribute.
	 * @see #setTmpFolder(String)
	 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#getJobEngineServer_TmpFolder()
	 * @model default="C:\\tmp"
	 * @generated
	 */
	String getTmpFolder();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobhttp.JobEngineServer#getTmpFolder <em>Tmp Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmp Folder</em>' attribute.
	 * @see #getTmpFolder()
	 * @generated
	 */
	void setTmpFolder(String value);

	/**
	 * Construct a submitjob handler
	 * @return
	 */
	public AbstractHandler constructSubmitJobHandler();

	/**
	 * Construct a submitfile handler
	 * @return
	 */
	public AbstractHandler constructSubmitFileHandler();

	/**
	 * Construct a getjobstatus handler
	 * @return
	 */
	public AbstractHandler constructGetJobStatusHandler();


} // JobEngineServer
