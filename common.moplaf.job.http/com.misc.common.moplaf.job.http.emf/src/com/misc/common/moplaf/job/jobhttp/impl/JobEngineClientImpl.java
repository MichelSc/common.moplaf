/**
 */
package com.misc.common.moplaf.job.jobhttp.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobStatus;
import com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl;

import com.misc.common.moplaf.job.jobhttp.JobEngineClient;
import com.misc.common.moplaf.job.jobhttp.JobHttpPackage;
import com.misc.common.moplaf.serialize.util.Util;
import com.misc.common.moplaf.serialize.xmi.XMIScheme;

import java.io.StringReader;
import java.io.StringWriter;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Engine Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobEngineClientImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobEngineClientImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobEngineClientImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobEngineClientImpl#getScheme <em>Scheme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobEngineClientImpl extends JobEngineImpl implements JobEngineClient {
	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = "localhost";

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 8080;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = "default_path";

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected String scheme = SCHEME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobEngineClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobHttpPackage.Literals.JOB_ENGINE_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_CLIENT__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_CLIENT__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_CLIENT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheme(String newScheme) {
		String oldScheme = scheme;
		scheme = newScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_CLIENT__SCHEME, oldScheme, scheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobHttpPackage.JOB_ENGINE_CLIENT__HOST:
				return getHost();
			case JobHttpPackage.JOB_ENGINE_CLIENT__PORT:
				return getPort();
			case JobHttpPackage.JOB_ENGINE_CLIENT__PATH:
				return getPath();
			case JobHttpPackage.JOB_ENGINE_CLIENT__SCHEME:
				return getScheme();
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
			case JobHttpPackage.JOB_ENGINE_CLIENT__HOST:
				setHost((String)newValue);
				return;
			case JobHttpPackage.JOB_ENGINE_CLIENT__PORT:
				setPort((Integer)newValue);
				return;
			case JobHttpPackage.JOB_ENGINE_CLIENT__PATH:
				setPath((String)newValue);
				return;
			case JobHttpPackage.JOB_ENGINE_CLIENT__SCHEME:
				setScheme((String)newValue);
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
			case JobHttpPackage.JOB_ENGINE_CLIENT__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case JobHttpPackage.JOB_ENGINE_CLIENT__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case JobHttpPackage.JOB_ENGINE_CLIENT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case JobHttpPackage.JOB_ENGINE_CLIENT__SCHEME:
				setScheme(SCHEME_EDEFAULT);
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
			case JobHttpPackage.JOB_ENGINE_CLIENT__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case JobHttpPackage.JOB_ENGINE_CLIENT__PORT:
				return port != PORT_EDEFAULT;
			case JobHttpPackage.JOB_ENGINE_CLIENT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case JobHttpPackage.JOB_ENGINE_CLIENT__SCHEME:
				return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
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
		result.append(" (Host: ");
		result.append(host);
		result.append(", Port: ");
		result.append(port);
		result.append(", Path: ");
		result.append(path);
		result.append(", Scheme: ");
		result.append(scheme);
		result.append(')');
		return result.toString();
	}

	@Override
	public EnabledFeedback getExecuteEnabledFeedback() {
		EnabledFeedback feedback = super.getExecuteEnabledFeedback();
		if ( !feedback.isEnabled()) {
			return feedback;
		}
		return EnabledFeedback.NOFEEDBACK;
	}


	/**
	 * 
	 */
	@Override
	protected int executeJobImpl(JobScheduled job) {
	    int executeNr = -1;
	    StringWriter stringWriter = new StringWriter();
	    String scheme = this.getScheme();
	    boolean serialized = Util.serialize(scheme == null ? XMIScheme.SCHEME_ID : scheme, job.getRun(), stringWriter);
		if ( serialized ) {
		    String jobAsString = stringWriter.toString();
		    executeNr = 0; // TODO do the call submit(scheme: String, job: String): int
		}
		Plugin.INSTANCE.logInfo("HandleJob.runJob: call finished");
		return executeNr;
	}
	
	private JobStatus callGetStatus(int executeNr) {
		JobStatus status = JobStatus.UNKNOWN;
		// TODO: do the call getStatus(executeNr: int):int 
	    return status;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void refreshJobStatus(JobScheduled job) {
		JobStatus status = this.callGetStatus(job.getExecuteNr());
		if ( status!=null) {
			switch (status) {
			case COMPLETE:
				job.setReturn(ReturnFeedback.SUCCESS);
				String result = ""; // TODO do the call getResult(executeNr: int):String
				String scheme = this.getScheme();
				StringReader inputStream = new StringReader(result);
				EObject result_as_object = Util.deserialize(scheme == null ? XMIScheme.SCHEME_ID : scheme, inputStream);
				if ( result_as_object instanceof Run ) {
					Run result_run = (Run) result_as_object;
					EcoreUtil.replace(job.getRun(), result_run);
					job.setRun(result_run);
				}
				break;
			case FAILED:
				job.setReturn(ReturnFeedback.FAILURE);
				break;
			case RUNNING:
				job.setRunning();
				break;
			}
		}
	}
	
	@Override
	protected void startImpl() {
		
		// the server connection
		String host        = this.getHost();
		int    port        = this.getPort();
		String path        = this.getPath();
		String urlAsString = String.format("http://%s:%d/%s", host, port, path);
		Plugin.INSTANCE.logInfo("JobEngineClient, url="+urlAsString);
		// TODO
	}

	@Override
	protected void stopImpl() {
		super.stopImpl();
		// TODO
	}

} //JobEngineClientImpl
