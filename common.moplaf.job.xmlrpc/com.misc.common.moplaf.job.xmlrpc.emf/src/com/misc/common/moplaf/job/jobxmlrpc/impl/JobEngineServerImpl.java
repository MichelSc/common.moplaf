/**
 */
package com.misc.common.moplaf.job.jobxmlrpc.impl;

import com.misc.common.moplaf.job.jobclient.JobRemote;
import com.misc.common.moplaf.job.jobclient.JobclientFactory;
import com.misc.common.moplaf.job.jobclient.SubmittedJob;
import com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl;

import com.misc.common.moplaf.job.jobxmlrpc.JobEngineServer;
import com.misc.common.moplaf.job.jobxmlrpc.JobxmlrpcPackage;

import java.io.IOException;
import java.io.StringBufferInputStream;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.XmlRpcRequest;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.RequestProcessorFactoryFactory;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;
import org.eclipse.emf.common.CommonPlugin;
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
@SuppressWarnings("deprecation")
public class JobEngineServerImpl extends JobEngineImpl implements JobEngineServer {
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
		return JobxmlrpcPackage.Literals.JOB_ENGINE_SERVER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobxmlrpcPackage.JOB_ENGINE_SERVER__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobxmlrpcPackage.JOB_ENGINE_SERVER__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobxmlrpcPackage.JOB_ENGINE_SERVER__PORT:
				return getPort();
			case JobxmlrpcPackage.JOB_ENGINE_SERVER__PATH:
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
			case JobxmlrpcPackage.JOB_ENGINE_SERVER__PORT:
				setPort((Integer)newValue);
				return;
			case JobxmlrpcPackage.JOB_ENGINE_SERVER__PATH:
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
			case JobxmlrpcPackage.JOB_ENGINE_SERVER__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case JobxmlrpcPackage.JOB_ENGINE_SERVER__PATH:
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
			case JobxmlrpcPackage.JOB_ENGINE_SERVER__PORT:
				return port != PORT_EDEFAULT;
			case JobxmlrpcPackage.JOB_ENGINE_SERVER__PATH:
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
	
	public interface HandleJob {
		public String runJob(String jobAsString);
	}
	
	private HandleJob runJobHandler = new HandleJobImpl();
	
	public class HandleJobImpl implements HandleJob {
		
		public HandleJobImpl() {};

		public String runJob(String jobAsString) {
			CommonPlugin.INSTANCE.log("HandleJob.runJob: called ");

			JobEngineServer jobEngineServer = JobEngineServerImpl.this;
			
			@SuppressWarnings("deprecation")
			StringBufferInputStream stringReader= new StringBufferInputStream(jobAsString);
		    URI uri = URI.createURI("http://www.misc.com/tmp/job.xml");
		    XMLResource resource = new XMLResourceImpl(uri);
		    try {
		    	resource.load(stringReader, null);
			} catch (IOException e) {
				CommonPlugin.INSTANCE.log("HandleJob.runJob: exception in load: "+e.getMessage());
				return "erreur";
			}
		    
		    try {
			    // get the jogs
		    	EList<JobRemote> jobs = new BasicEList<JobRemote>();
				for (Object object : resource.getContents()){
			    	if ( object instanceof JobRemote) {
			    		JobRemote job = (JobRemote) object;
			    		jobs.add(job);
						CommonPlugin.INSTANCE.log("HandleJob.runJob: job received");
			    	}
				}
			    // add the jobs
				for ( JobRemote job : jobs){
		    		SubmittedJob submittedJob = JobclientFactory.eINSTANCE.createSubmittedJob();
		    		jobEngineServer.getSubmittedJobs().add(submittedJob);
		    		submittedJob.setJob(job);
					CommonPlugin.INSTANCE.log("HandleJob.runJob: job submitted");
				}
		    }
			catch (Exception e) {
				CommonPlugin.INSTANCE.log("HandleJob.runJob: exception "+e.getMessage());
			}
			
			return jobAsString;
		}
	};


	@Override
	protected void startImpl() {
		CommonPlugin.INSTANCE.log("JobEngineServer.start: called");
		// handler mapping
		PropertyHandlerMapping mapping = new PropertyHandlerMapping(){
			
		};
		
		try {
			CommonPlugin.INSTANCE.log("JobEngineServer.start: intialize MappingHandler");
			mapping.setRequestProcessorFactoryFactory(new JobEngineRequestProcessorFactoryFactory());
			CommonPlugin.INSTANCE.log("JobEngineServer.start: done with adding factory");
			mapping.addHandler("handlejob", HandleJob.class);
			CommonPlugin.INSTANCE.log("JobEngineServer.start: done with adding handler");
		} catch (XmlRpcException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// web server
		CommonPlugin.INSTANCE.log("JobEngineServer.start: going to create webserver");
		WebServer webserver = new WebServer(this.getPort());
		XmlRpcServerConfigImpl config = new XmlRpcServerConfigImpl();
		XmlRpcServer server = webserver.getXmlRpcServer();
		server.setConfig(config);
		server.setHandlerMapping(mapping);
		try {
			CommonPlugin.INSTANCE.log("JobEngineServer.start: going to start");
			webserver.start();
			CommonPlugin.INSTANCE.log("JobEngineServer.start: started");
		} catch (IOException e) {
			CommonPlugin.INSTANCE.log("JobEngineServer.start: exception when starting the server "+e.getMessage());
			e.printStackTrace();
		}
		
		this.webServer = webserver;
	}

	@Override
	protected void stopImpl() {
		if ( this.webServer!=null){
			this.webServer.shutdown();
			this.webServer = null;
		}
	}
	
	

} //JobEngineServerImpl
