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
package com.misc.common.moplaf.job.jobxmlrpc.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobStatus;
import com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl;
import com.misc.common.moplaf.job.jobxmlrpc.JobEngineClient;
import com.misc.common.moplaf.job.jobxmlrpc.JobXmlRpcPackage;

import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Engine Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobxmlrpc.impl.JobEngineClientImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobxmlrpc.impl.JobEngineClientImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobxmlrpc.impl.JobEngineClientImpl#getPath <em>Path</em>}</li>
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
	protected static final String PATH_EDEFAULT = "xmlrpc";
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
		return JobXmlRpcPackage.Literals.JOB_ENGINE_CLIENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobXmlRpcPackage.JOB_ENGINE_CLIENT__HOST, oldHost, host));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobXmlRpcPackage.JOB_ENGINE_CLIENT__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobXmlRpcPackage.JOB_ENGINE_CLIENT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobXmlRpcPackage.JOB_ENGINE_CLIENT__HOST:
				return getHost();
			case JobXmlRpcPackage.JOB_ENGINE_CLIENT__PORT:
				return getPort();
			case JobXmlRpcPackage.JOB_ENGINE_CLIENT__PATH:
				return getPath();
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
			case JobXmlRpcPackage.JOB_ENGINE_CLIENT__HOST:
				setHost((String)newValue);
				return;
			case JobXmlRpcPackage.JOB_ENGINE_CLIENT__PORT:
				setPort((Integer)newValue);
				return;
			case JobXmlRpcPackage.JOB_ENGINE_CLIENT__PATH:
				setPath((String)newValue);
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
			case JobXmlRpcPackage.JOB_ENGINE_CLIENT__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case JobXmlRpcPackage.JOB_ENGINE_CLIENT__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case JobXmlRpcPackage.JOB_ENGINE_CLIENT__PATH:
				setPath(PATH_EDEFAULT);
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
			case JobXmlRpcPackage.JOB_ENGINE_CLIENT__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case JobXmlRpcPackage.JOB_ENGINE_CLIENT__PORT:
				return port != PORT_EDEFAULT;
			case JobXmlRpcPackage.JOB_ENGINE_CLIENT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
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
		result.append(')');
		return result.toString();
	}
	
	@Override
	public EnabledFeedback getExecuteEnabledFeedback() {
		return EnabledFeedback.NOFEEDBACK;
	}


	/**
	 * 
	 */
	@Override
	protected int executeJobImpl(JobScheduled job) {
		// the server connection
		String host        = this.getHost();
		int    port        = this.getPort();
		String path        = this.getPath();
		String urlAsString = String.format("http://%s:%d/%s", host, port, path);
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		Plugin.INSTANCE.logInfo("JobEngineClient, url="+urlAsString);
	    try {
			config.setServerURL(new URL(urlAsString));
		} catch (MalformedURLException e) {
			Plugin.INSTANCE.logError("JobEngineClient.runJobImpl, connect exception "+ e.getMessage());
		}
	    XmlRpcClient client = new XmlRpcClient();
	    client.setConfig(config);
	    
		// the job
	    // create resourceFactory, resourceSet
	    XMLResourceFactoryImpl rf = new XMLResourceFactoryImpl(); 
	    ResourceSet            rs = new ResourceSetImpl();
	    rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", rf);
	    URI uri = URI.createURI("http://www.misc.com/tmp/job.xml");
	    XMLResource resource = (XMLResource)rs.createResource(uri);
	    EObject copyJob = EcoreUtil.copy(job.getRun());
	    resource.getContents().add(copyJob);
	    StringWriter stringWriter = new StringWriter();
	    try {
			resource.save(stringWriter, null);
		} catch (IOException e) {
			Plugin.INSTANCE.logError("JobEngineClient.runJobImpl, serialize "+ e.getMessage());
		}
	    
	    // do the call
    	Object resultAsObject = null;
    	int executeNr = -1;
	    String jobAsString = stringWriter.toString();
	    Object[] params = new Object[]{jobAsString};
	    try {
	    	// parameter 1: the method being performed
	    	resultAsObject = client.execute("handlejob.runJob", params);
		} catch (XmlRpcException e) {
			Plugin.INSTANCE.logError("JobEngineClient.runJobImpl, client.execute"+ e.getMessage());
		}
	    if ( resultAsObject instanceof Integer) {
	    	executeNr = ((Integer)resultAsObject).intValue(); // to be kept somewhere
			Plugin.INSTANCE.logInfo(String.format("JobEngineClient.runJobImpl, result %d", executeNr));
	    } else if ( resultAsObject == null ){
	    	Plugin.INSTANCE.logError(String.format("JobEngineClient.runJobImpl, no value returned"));
	    } else {
	    	Plugin.INSTANCE.logError(String.format("JobEngineClient.runJobImpl, unexpected value returned %s ", resultAsObject.getClass().getName()));
	    }
	    
		Plugin.INSTANCE.logInfo("HandleJob.runJob: call finished");
		return executeNr;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void refreshJobStatus(JobScheduled job) {
		JobStatus status = null;
		if ( status!=null) {
			switch (status) {
			case COMPLETE:
				job.setReturn(ReturnFeedback.SUCCESS);
				break;
			case FAILLED:
				job.setReturn(ReturnFeedback.FAILURE);
				break;
			case RUNNING:
				job.setRunning();
				break;
			}
		}
	}



} //JobEngineClientImpl
