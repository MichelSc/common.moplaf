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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

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
	protected static final String PATH_EDEFAULT = "/default_path";

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
	protected boolean executeJobImpl(JobScheduled job) {
		Plugin.INSTANCE.logInfo("JobEngineClient: submitjob: called");
		
		// serialize the job
	    StringWriter stringWriter = new StringWriter();
	    String scheme = this.getScheme();
	    boolean serialized = Util.serialize(scheme == null ? XMIScheme.SCHEME_ID : scheme, job.getRun(), stringWriter);
	    String jobAsString = null;
		if ( serialized ) {
		    jobAsString = stringWriter.toString();
		} else {
			Plugin.INSTANCE.logError("JobEngineClient: submitjob: job not serialized");
			return false;
		}
		Plugin.INSTANCE.logInfo("JobEngineClient: submitjob: job serialized");
		
		// params
		String query = null;
		if ( this.getScheme()!=null && this.getScheme().length()>0 ) {
			query = "scheme="+this.getScheme();
		} 

		// the the http post
		try {
			// URI
			String path = this.getPath()+"/submitjob"; 
			URI requesturi = new URI(
					"http", // scheme 
					null, // user info
					this.getHost(), 
					this.getPort(), 
					path, 
					query, 
					null);    // fragment
			URL url2 = requesturi.toURL();
			Plugin.INSTANCE.logInfo("JobEngineClient: url2: "+url2.toString());
			HttpURLConnection connection = (HttpURLConnection)url2.openConnection();
	
			// connection 
			//connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded"); // default is ISO-8859-1
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8"); // default is ISO-8859-1
			//connection.setRequestProperty("Content-Length", "" + Integer.toString(wr.size()));
			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			
			// body
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(wr, "UTF-8"));
			writer.write(jobAsString);
			writer.close();
			wr.close();
			
			// call
			connection.connect();
		
			// get the result
	    	InputStream resultContentIS = connection.getInputStream();
	    	String encoding = connection.getContentEncoding();
	        BufferedReader reader = encoding == null 
	        		             ? new BufferedReader(new InputStreamReader(resultContentIS))
	        		            : new BufferedReader(new InputStreamReader(resultContentIS, encoding));
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = reader.readLine()) != null) {
	            sb.append(line);
	        }
		    String resultContent = sb.toString();
			Plugin.INSTANCE.logInfo("JobEngineClient.submitjob: response="+ resultContent);
			int execution_nr = -1;
			try {
				execution_nr = Integer.parseInt(resultContent);
				job.setExecuteNr(execution_nr);
			} catch(NumberFormatException e) {
				Plugin.INSTANCE.logError("JobEngineClient.submitjob: invalid execution nr");
				return false;
			}
			return true;
		} catch(Exception e) {
			Plugin.INSTANCE.logError("JobEngineClient.submitjob: exception caught: "+e.getMessage());
			return false;
		}
	}
	
	private JobStatus callGetStatus(int executeNr) {
		Plugin.INSTANCE.logInfo("JobEngineClient: getjobstatus: called");
		
		// params
		String query = String.format("submitid=%d",  executeNr);

		// the the http post
		try {
			// URI
			String path = this.getPath()+"/getjobstatus"; 
			URI requesturi = new URI(
					"http", // scheme 
					null, // user info
					this.getHost(), 
					this.getPort(), 
					path, 
					query, 
					null);    // fragment
			URL url2 = requesturi.toURL();
			Plugin.INSTANCE.logInfo("JobEngineClient.getjobstatus: url2: "+url2.toString());
			HttpURLConnection connection = (HttpURLConnection)url2.openConnection();
	
			// connection 
			//connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded"); // default is ISO-8859-1
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8"); // default is ISO-8859-1
			//connection.setRequestProperty("Content-Length", "" + Integer.toString(wr.size()));
			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(false);
			
			// call
			connection.connect();
		
			// get the result
	    	InputStream resultContentIS = connection.getInputStream();
	    	String encoding = connection.getContentEncoding();
	        BufferedReader reader = encoding == null 
	        		            ? new BufferedReader(new InputStreamReader(resultContentIS))
	        		            : new BufferedReader(new InputStreamReader(resultContentIS, encoding));
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = reader.readLine()) != null) {
	            sb.append(line);
	        }
		    String resultContent = sb.toString();
			Plugin.INSTANCE.logInfo("JobEngineClient.getjobstatus: response="+ resultContent);
			int status_asint = -1;
			try {
				status_asint = Integer.parseInt(resultContent);
		    	JobStatus status = JobStatus.get(status_asint);
		    	return status;
			} catch(NumberFormatException e) {
				Plugin.INSTANCE.logError("JobEngineClient.getjobstatus: invalid execution nr");
				return JobStatus.UNKNOWN;
			}
		} catch(Exception e) {
			Plugin.INSTANCE.logError("JobEngineClient.getjobstatus: exception caught: "+e.getMessage());
			return JobStatus.UNKNOWN;
		}
	}
	
	private String callGetJobResult(int executeNr) {
		Plugin.INSTANCE.logInfo("JobEngineClient.callGetJobResult: called");
		
		// params
		String query = String.format("submitid=%d",  executeNr);

		// the the http post
		try {
			// URI
			String path = this.getPath()+"/getjobresult"; 
			URI requesturi = new URI(
					"http", // scheme 
					null, // user info
					this.getHost(), 
					this.getPort(), 
					path, 
					query, 
					null);    // fragment
			URL url2 = requesturi.toURL();
			Plugin.INSTANCE.logInfo("JobEngineClient.callGetJobResult: url2: "+url2.toString());
			HttpURLConnection connection = (HttpURLConnection)url2.openConnection();
	
			// connection 
			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(false);
			
			// call
			connection.connect();
		
			// get the result
	    	InputStream resultContentIS = connection.getInputStream();
	    	String encoding = connection.getContentEncoding();
	        BufferedReader reader = encoding == null 
	        		            ? new BufferedReader(new InputStreamReader(resultContentIS))
	        		            : new BufferedReader(new InputStreamReader(resultContentIS, encoding));
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = reader.readLine()) != null) {
	            sb.append(line);
	        }
		    String resultContent = sb.toString();
			Plugin.INSTANCE.logInfo("JobEngineClient.callGetJobResult: response="+ resultContent);
			return resultContent;
		} catch(Exception e) {
			Plugin.INSTANCE.logError("JobEngineClient.callGetJobResult: exception caught: "+e.getMessage());
			return "";
		}
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
				String result = this.callGetJobResult(job.getExecuteNr());
				if ( result==null ) {
					Plugin.INSTANCE.logError("JobEngineClient.refreshJobStatus: no result received, job not updated");
				} else {
					String scheme = this.getScheme();
					StringReader inputStream = new StringReader(result);
					EObject result_as_object = Util.deserialize(scheme == null ? XMIScheme.SCHEME_ID : scheme, inputStream);
					if ( result_as_object instanceof Run ) {
						Run result_run = (Run) result_as_object;
						EcoreUtil.replace(job.getRun(), result_run);
						job.setRun(result_run);
					} else {
						Plugin.INSTANCE.logError("JobEngineClient.refreshJobStatus: result is no instance of Run, job not updated");
					}
				}
				break;
			case FAILED:
				job.setReturn(ReturnFeedback.FAILURE);
				break;
			case RUNNING:
				job.setRunning();
				break;
			default:
				// do nothing
				break;
			}
		}
	}
	
	@Override
	protected void startImpl() {
		super.startImpl();
	}

	@Override
	protected void stopImpl() {
		super.stopImpl();
	}

} //JobEngineClientImpl
