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

import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.RunContext;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
import com.misc.common.moplaf.job.jobclient.JobStatus;
import com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl;
import com.misc.common.moplaf.job.jobxmlrpc.JobEngineServer;
import com.misc.common.moplaf.job.jobxmlrpc.JobXmlRpcPackage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.XmlRpcRequest;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.RequestProcessorFactoryFactory;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Engine Server</b></em>'.
 * <p>
 * This Engine implements an Http server and answers to xmlrpc calls.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobxmlrpc.impl.JobEngineServerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobxmlrpc.impl.JobEngineServerImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobEngineServerImpl extends JobSourceImpl implements JobEngineServer {
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
	protected JobEngineServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobXmlRpcPackage.Literals.JOB_ENGINE_SERVER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobXmlRpcPackage.JOB_ENGINE_SERVER__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobXmlRpcPackage.JOB_ENGINE_SERVER__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobXmlRpcPackage.JOB_ENGINE_SERVER__PORT:
				return getPort();
			case JobXmlRpcPackage.JOB_ENGINE_SERVER__PATH:
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
			case JobXmlRpcPackage.JOB_ENGINE_SERVER__PORT:
				setPort((Integer)newValue);
				return;
			case JobXmlRpcPackage.JOB_ENGINE_SERVER__PATH:
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
			case JobXmlRpcPackage.JOB_ENGINE_SERVER__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case JobXmlRpcPackage.JOB_ENGINE_SERVER__PATH:
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
			case JobXmlRpcPackage.JOB_ENGINE_SERVER__PORT:
				return port != PORT_EDEFAULT;
			case JobXmlRpcPackage.JOB_ENGINE_SERVER__PATH:
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
		result.append(" (Port: ");
		result.append(port);
		result.append(", Path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}


	/**
	 * 
	 */
	private WebServer webServer = null;
	
	/**
	 * 
	 * @author michel
	 *
	 */
	public class JobEngineRequestProcessorFactoryFactory implements RequestProcessorFactoryFactory {
		// the factory
		private final RequestProcessorFactory factory = new JobEngineRequestProcessorFactory();

		public RequestProcessorFactory getRequestProcessorFactory(Class aClass) throws XmlRpcException {
			return factory;
		}

		private class JobEngineRequestProcessorFactory implements RequestProcessorFactory {
			public Object getRequestProcessor(XmlRpcRequest xmlRpcRequest) throws XmlRpcException {
				return JobEngineServerImpl.this.runJobHandler;
			}
		}
	}
	
	/**
	 * The interface called by a remote client.
	 * @author michel
	 *
	 */
	public interface ServerCallInterface {
		public int runJob(String jobAsString);
		public int getJobStatus(int jobExecuteNr);
	}
	
	/**
	 * The handler instance for this {@link JobEngineServerImpl}
	 * 
	 */
	private ServerCallInterface runJobHandler = new ServerCallInterfaceImpl();
	
	
	/**
	 * @author michel
	 *
	 */
	public class ServerCallInterfaceImpl implements ServerCallInterface {
		
		public ServerCallInterfaceImpl() {};

		/**
		 * Run this job
		 * <p>
		 * Deserialize the job as string, execute is by calling the method {@link Run#run(RunContext)}.
		 * Its result is then serialized and returned as String.
		 */
		@Override
		public int runJob(String jobAsString) {
			Plugin.INSTANCE.logInfo("ServerCallInterface.runJob: called ");

			JobEngineServer jobEngineServer = JobEngineServerImpl.this;
			JobScheduler scheduler = jobEngineServer.getScheduler();
			
			InputStream inputStream = new ByteArrayInputStream(jobAsString.getBytes());
		    URI uri = URI.createURI("http://www.misc.com/tmp/job.xml");
		    XMLResource resource = new XMLResourceImpl(uri);
		    try {
		    	resource.load(inputStream, null);
			} catch (IOException e) {
				Plugin.INSTANCE.logError("ServerCallInterface.runJob: exception in load: "+e.getMessage());
				return -1;
			}

		    int result =-1;
		    try {
			    // get the jogs
		    	EList<Run> jobs = new BasicEList<Run>();
				for (Object object : resource.getContents()){
			    	if ( object instanceof Run) {
			    		Run job = (Run) object;
			    		jobs.add(job);
			    		Plugin.INSTANCE.logInfo("ServerCallInterface.runJob: job received");
			    	}
				}
			    // add the jobs
				for ( Run job : jobs){
		    		JobScheduled submittedJob = scheduler.submitRun(job);
		    		result = submittedJob.getScheduleNr();
					jobEngineServer.getJobsScheduled().add(submittedJob);
		    		Plugin.INSTANCE.logInfo("ServerCallInterface.runJob: job submitted");
				}
		    }
			catch (Exception e) {
				Plugin.INSTANCE.logError("ServerCallInterface.runJob: exception "+e.getMessage());
			}
			
			Plugin.INSTANCE.logInfo("ServerCallInterface.runJob: call done ");
			return result;
		}

		/**
		 * 
		 */
		@Override
		public int getJobStatus(int jobExecuteNr) {
			Plugin.INSTANCE.logInfo(String.format("ServerCallInterface.getJobStatuts: jobExecutenr= %d", jobExecuteNr));
			JobEngineServer jobEngineServer = JobEngineServerImpl.this;
			JobScheduled job = jobEngineServer.getJobsScheduled()
					.stream()
					.filter(j -> j.getExecuteNr()==jobExecuteNr)
					.findFirst()
					.orElse(null);
			if ( job == null ) {
				Plugin.INSTANCE.logError(String.format("ServerCallInterface.getJobStatuts: jobExecutenr= %d, job not found", jobExecuteNr));
				return JobStatus.UNKNOWN_VALUE;
			}
					
			return job.getStatus().getValue();
		}
	};


	/**
	 * Specified by JobSource
	 */
	@Override
	protected void startImpl() {
		Plugin.INSTANCE.logInfo("JobEngineServer.start: called");
		// handler mapping
		PropertyHandlerMapping mapping = new PropertyHandlerMapping(){
			
		};
		
		try {
			Plugin.INSTANCE.logInfo("JobEngineServer.start: intialize MappingHandler");
			mapping.setRequestProcessorFactoryFactory(new JobEngineRequestProcessorFactoryFactory());
			Plugin.INSTANCE.logInfo("JobEngineServer.start: done with adding factory");
			mapping.addHandler("handlejob", ServerCallInterface.class);
			Plugin.INSTANCE.logInfo("JobEngineServer.start: done with adding handler");
		} catch (XmlRpcException e1) {
			Plugin.INSTANCE.logError("JobEngineServer.start: exception when starting the server "+e1.getMessage());
			e1.printStackTrace();
		}
		
		// web server
		Plugin.INSTANCE.logInfo("JobEngineServer.start: going to create webserver");
		WebServer webserver = new WebServer(this.getPort());
		XmlRpcServerConfigImpl config = new XmlRpcServerConfigImpl();
		XmlRpcServer server = webserver.getXmlRpcServer();
		server.setConfig(config);
		server.setHandlerMapping(mapping);
		try {
			Plugin.INSTANCE.logInfo("JobEngineServer.start: going to start");
			webserver.start();
			Plugin.INSTANCE.logInfo("JobEngineServer.start: started");
		} catch (IOException e) {
			Plugin.INSTANCE.logError("JobEngineServer.start: exception when starting the server "+e.getMessage());
			e.printStackTrace();
		}
		
		this.webServer = webserver;
	}

	/**
	 * Specified by JobSource
	 */
	@Override
	protected void stopImpl() {
		if ( this.webServer!=null){
			Plugin.INSTANCE.logInfo("JobEngineServer.shutdown: before");
			this.webServer.shutdown();
			this.webServer = null;
			Plugin.INSTANCE.logInfo("JobEngineServer.shutdown: before");
		}
	}
	
	

} //JobEngineServerImpl
