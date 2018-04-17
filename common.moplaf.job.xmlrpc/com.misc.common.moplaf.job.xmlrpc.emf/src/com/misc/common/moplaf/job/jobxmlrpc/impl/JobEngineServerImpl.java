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

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.RunContext;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
import com.misc.common.moplaf.job.jobclient.JobStatus;
import com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl;
import com.misc.common.moplaf.job.jobxmlrpc.JobEngineServer;
import com.misc.common.moplaf.job.jobxmlrpc.JobXmlRpcPackage;
import com.misc.common.moplaf.serialize.util.Util;
import com.misc.common.moplaf.serialize.xmi.XMIScheme;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


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
		public int runJob(String serializeSchemeID, String jobAsString);
		public int runJob(String jobAsString);
		public int getJobStatus(int jobExecuteNr);
		public String getJobResult(int jobExecuteNr);
		public String getJobResult(String serializeSchemeID, int jobExecuteNr);
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
		public int runJob(String serializeSchemeID, String jobAsString) {
			Plugin.INSTANCE.logInfo("ServerCallInterface.runJob: called ");

			JobEngineServer jobEngineServer = JobEngineServerImpl.this;
			JobScheduler scheduler = jobEngineServer.getScheduler();

			StringReader inputStream = new StringReader(jobAsString);
	    	EList<EObject> objects = new BasicEList<EObject>();
	    	boolean deserialized = Util.deserialize(serializeSchemeID, objects, inputStream);

		    int result =-1;
		    if ( deserialized ) {
				for (EObject object : objects){
			    	if ( object instanceof Run) {
			    		Run job = (Run) object;
			    		Plugin.INSTANCE.logInfo("ServerCallInterface.runJob: job received");
			    		JobScheduled submittedJob = scheduler.submitRun(jobEngineServer, job, true);  // takes ownership
			    		result = submittedJob.getScheduleNr();
			    		Plugin.INSTANCE.logInfo("ServerCallInterface.runJob: job submitted");
			    	}
				}
		    } else {
				Plugin.INSTANCE.logError("ServerCallInterface.runJob: job not deserialized");
		    }
			
			Plugin.INSTANCE.logInfo("ServerCallInterface.runJob: call done ");
			return result;
		}

		@Override
		public int runJob(String jobAsString) {
			Plugin.INSTANCE.logInfo("ServerCallInterface.runJob: called ");
			return this.runJob(XMIScheme.SCHEME_ID, jobAsString);
		}
		
		/**
		 * 
		 */
		@Override
		public int getJobStatus(int jobExecuteNr) {
			Plugin.INSTANCE.logInfo(String.format("ServerCallInterface.getJobStatus: jobExecutenr= %d", jobExecuteNr));
			JobEngineServerImpl jobEngineServer = JobEngineServerImpl.this;
			JobScheduled job = jobEngineServer.getJobScheduled(jobExecuteNr);
			if ( job == null ) {
				Plugin.INSTANCE.logError(String.format("ServerCallInterface.getJobStatus: jobExecutenr= %d, job not found", jobExecuteNr));
				return JobStatus.UNKNOWN_VALUE;
			}

			int status = job.getStatus().getValue();
			Plugin.INSTANCE.logInfo(String.format("ServerCallInterface.getJobStatus: status= %d", status));
			return status;
		}

		@Override
		public String getJobResult(String serializeSchemeID, int jobExecuteNr) {
			Plugin.INSTANCE.logInfo(String.format("ServerCallInterface.getJobResult: jobExecutenr= %d", jobExecuteNr));
			JobEngineServerImpl jobEngineServer = JobEngineServerImpl.this;
			JobScheduled job = jobEngineServer.getJobScheduled(jobExecuteNr);
			if ( job == null ) {
				Plugin.INSTANCE.logError(String.format("ServerCallInterface.getJobResult: jobExecutenr= %d, job not found", jobExecuteNr));
				return "";
			}
		    StringWriter stringWriter = new StringWriter();
		    boolean serialized = Util.serialize(serializeSchemeID, job.getRun(), stringWriter);
			if ( !serialized ) {
				Plugin.INSTANCE.logError(String.format("ServerCallInterface.getJobResult: result not serialized"));
				return "";
			}
		    String jobAsString = stringWriter.toString();
		    return jobAsString;
		}
		
		@Override
		public String getJobResult(int jobExecuteNr) {
			return getJobResult(XMIScheme.SCHEME_ID, jobExecuteNr);
		}
	};

	protected JobScheduled getJobScheduled(int job_execute_nr) {
		JobScheduled job = this.getJobsScheduled()
				.stream()
				.filter(j -> j.getScheduleNr()==job_execute_nr)
				.findFirst()
				.orElse(null);
		return job;
	}

	/**
	 * Specified by JobSchedulerService
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
	 * Specified by JobSchedulerService
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

	/**
	 * Specified by JobSource
	 */
	@Override
	public void refresh() {
		super.refresh();
	}

	/**
	 * Specified by JobSource
	 */
	@Override
	public void onJobRunning(JobScheduled job) {
		super.onJobRunning(job);
	}

	/**
	 * Specified by JobSource
	 */
	@Override
	public void onJobReturned(JobScheduled job, ReturnFeedback feedback) {
		super.onJobReturned(job, feedback);
		Plugin.INSTANCE.logInfo("JobEngineServer.onJobReturned: called");
		//job.setRun(null); // release the run, as it is contained in no resource
	}
	
	
	
	

} //JobEngineServerImpl
