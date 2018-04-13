/**
 */
package com.misc.common.moplaf.job.jobhttp.impl;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.file.FileFactory;
import com.misc.common.moplaf.file.FileLocal;
import com.misc.common.moplaf.job.JobFileHandler;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
import com.misc.common.moplaf.job.jobclient.JobStatus;
import com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl;

import com.misc.common.moplaf.job.jobhttp.JobEngineServer;
import com.misc.common.moplaf.job.jobhttp.JobHttpPackage;
import com.misc.common.moplaf.job.jobhttp.JobServer;
import com.misc.common.moplaf.job.jobhttp.util.Util;
import com.misc.common.moplaf.job.util.RunFactory;
import com.misc.common.moplaf.serialize.xmi.XMIScheme;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Engine Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobEngineServerImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobEngineServerImpl#getSelectedServer <em>Selected Server</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobEngineServerImpl#getOwnerServer <em>Owner Server</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobEngineServerImpl#getServer <em>Server</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobEngineServerImpl#getTmpFolder <em>Tmp Folder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobEngineServerImpl extends JobSourceImpl implements JobEngineServer {
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
	 * The cached value of the '{@link #getSelectedServer() <em>Selected Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedServer()
	 * @generated
	 * @ordered
	 */
	protected JobServer selectedServer;

	/**
	 * The cached value of the '{@link #getOwnerServer() <em>Owner Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerServer()
	 * @generated
	 * @ordered
	 */
	protected JobServer ownerServer;

	/**
	 * The default value of the '{@link #getTmpFolder() <em>Tmp Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmpFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String TMP_FOLDER_EDEFAULT = "C:\\tmp";

	/**
	 * The cached value of the '{@link #getTmpFolder() <em>Tmp Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmpFolder()
	 * @generated
	 * @ordered
	 */
	protected String tmpFolder = TMP_FOLDER_EDEFAULT;

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
		return JobHttpPackage.Literals.JOB_ENGINE_SERVER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_SERVER__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobServer getSelectedServer() {
		if (selectedServer != null && selectedServer.eIsProxy()) {
			InternalEObject oldSelectedServer = (InternalEObject)selectedServer;
			selectedServer = (JobServer)eResolveProxy(oldSelectedServer);
			if (selectedServer != oldSelectedServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER, oldSelectedServer, selectedServer));
			}
		}
		return selectedServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobServer basicGetSelectedServer() {
		return selectedServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedServer(JobServer newSelectedServer, NotificationChain msgs) {
		JobServer oldSelectedServer = selectedServer;
		selectedServer = newSelectedServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER, oldSelectedServer, newSelectedServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedServer(JobServer newSelectedServer) {
		if (newSelectedServer != selectedServer) {
			NotificationChain msgs = null;
			if (selectedServer != null)
				msgs = ((InternalEObject)selectedServer).eInverseRemove(this, JobHttpPackage.JOB_SERVER__HANDLERS_AS_SELECTED, JobServer.class, msgs);
			if (newSelectedServer != null)
				msgs = ((InternalEObject)newSelectedServer).eInverseAdd(this, JobHttpPackage.JOB_SERVER__HANDLERS_AS_SELECTED, JobServer.class, msgs);
			msgs = basicSetSelectedServer(newSelectedServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER, newSelectedServer, newSelectedServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobServer getOwnerServer() {
		return ownerServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerServer(JobServer newOwnerServer, NotificationChain msgs) {
		JobServer oldOwnerServer = ownerServer;
		ownerServer = newOwnerServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER, oldOwnerServer, newOwnerServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerServer(JobServer newOwnerServer) {
		if (newOwnerServer != ownerServer) {
			NotificationChain msgs = null;
			if (ownerServer != null)
				msgs = ((InternalEObject)ownerServer).eInverseRemove(this, JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED, JobServer.class, msgs);
			if (newOwnerServer != null)
				msgs = ((InternalEObject)newOwnerServer).eInverseAdd(this, JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED, JobServer.class, msgs);
			msgs = basicSetOwnerServer(newOwnerServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER, newOwnerServer, newOwnerServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobServer getServer() {
		JobServer server = basicGetServer();
		return server != null && server.eIsProxy() ? (JobServer)eResolveProxy((InternalEObject)server) : server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public JobServer basicGetServer() {
		JobServer server = this.getOwnerServer();
		if ( server!=null) {
			return server;
		}
		return this.getSelectedServer();
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTmpFolder() {
		return tmpFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmpFolder(String newTmpFolder) {
		String oldTmpFolder = tmpFolder;
		tmpFolder = newTmpFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_SERVER__TMP_FOLDER, oldTmpFolder, tmpFolder));
	}

	@Override
	protected void startImpl() {
		
		JobServer server = this.getServer();
		if ( server == null ) {
			return;
		}
		
		// start the server
		if ( !server.isRunning()) {
			if ( server.isAutoStartStop() && server.getStartFeedback().isEnabled() ) {
				server.start();
			} else {
				// server is not running and may not be started
				return;
			}
		}
		// do things specific for starting this engine
		// ...
	}

	@Override
	protected void stopImpl() {
		// do things specific for starting this engine
		// ...
		
		// stop the server
		JobServer server = this.getServer();
		if ( server!=null ) {
			if ( server.isAutoStartStop() 
				&& server.getStopFeedback().isEnabled() 
				&& server.getHandlers().size()<=1 ) {
				server.stop();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER:
				if (selectedServer != null)
					msgs = ((InternalEObject)selectedServer).eInverseRemove(this, JobHttpPackage.JOB_SERVER__HANDLERS_AS_SELECTED, JobServer.class, msgs);
				return basicSetSelectedServer((JobServer)otherEnd, msgs);
			case JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER:
				if (ownerServer != null)
					msgs = ((InternalEObject)ownerServer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER, null, msgs);
				return basicSetOwnerServer((JobServer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER:
				return basicSetSelectedServer(null, msgs);
			case JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER:
				return basicSetOwnerServer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobHttpPackage.JOB_ENGINE_SERVER__PATH:
				return getPath();
			case JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER:
				if (resolve) return getSelectedServer();
				return basicGetSelectedServer();
			case JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER:
				return getOwnerServer();
			case JobHttpPackage.JOB_ENGINE_SERVER__SERVER:
				if (resolve) return getServer();
				return basicGetServer();
			case JobHttpPackage.JOB_ENGINE_SERVER__TMP_FOLDER:
				return getTmpFolder();
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
			case JobHttpPackage.JOB_ENGINE_SERVER__PATH:
				setPath((String)newValue);
				return;
			case JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER:
				setSelectedServer((JobServer)newValue);
				return;
			case JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER:
				setOwnerServer((JobServer)newValue);
				return;
			case JobHttpPackage.JOB_ENGINE_SERVER__TMP_FOLDER:
				setTmpFolder((String)newValue);
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
			case JobHttpPackage.JOB_ENGINE_SERVER__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER:
				setSelectedServer((JobServer)null);
				return;
			case JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER:
				setOwnerServer((JobServer)null);
				return;
			case JobHttpPackage.JOB_ENGINE_SERVER__TMP_FOLDER:
				setTmpFolder(TMP_FOLDER_EDEFAULT);
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
			case JobHttpPackage.JOB_ENGINE_SERVER__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER:
				return selectedServer != null;
			case JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER:
				return ownerServer != null;
			case JobHttpPackage.JOB_ENGINE_SERVER__SERVER:
				return basicGetServer() != null;
			case JobHttpPackage.JOB_ENGINE_SERVER__TMP_FOLDER:
				return TMP_FOLDER_EDEFAULT == null ? tmpFolder != null : !TMP_FOLDER_EDEFAULT.equals(tmpFolder);
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
		result.append(" (Path: ");
		result.append(path);
		result.append(", TmpFolder: ");
		result.append(tmpFolder);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public AbstractHandler constructSubmitJobHandler() {
		return new SubmitJobHandler();
	}

	@Override
	public AbstractHandler constructSubmitFileHandler() {
		return new SubmitFileHandler();
	}

	@Override
	public AbstractHandler constructGetJobStatusHandler() {
		return new GetJobStatusHandler();
	}

	/**
	 * 
	 * @author MiSc
	 *
	 */
	private class SubmitJobHandler extends AbstractHandler {
		
		@Override
	    public void handle( String target,
	                        Request baseRequest,
	                        HttpServletRequest request,
	                        HttpServletResponse response ) throws IOException,
	                                                      ServletException
	    {
			JobEngineServerImpl outer_this = JobEngineServerImpl.this;
			
			Plugin.INSTANCE.logInfo(String.format("jetty.JobServer.submit: called, method=%s, query=%s", request.getMethod(), request.getQueryString()));
			Map<String, String> params = Util.getQueryParams(request.getQueryString());

			// get the scheme
	        String scheme = params.get("scheme");
			Plugin.INSTANCE.logInfo("jetty.JobServer.submit: scheme="+ scheme);

			// get the serialized job
	        Reader in = null;
	        String filename = params.get("filename");
	        if ( filename!=null ) {
		        String filepath = String.format("%s\\%s", outer_this.getTmpFolder(), filename);
				Plugin.INSTANCE.logInfo("jetty.JobServer.submit: filepath="+ filepath);
				in = new FileReader(filepath);
	        } else {
				Plugin.INSTANCE.logInfo(String.format("jetty.JobServer.submit: content l=%d, encoding=%s, type=%s",
						request.getContentLength(), 
						request.getCharacterEncoding(),
						request.getContentType()));
				in = request.getReader();
	        }

	        // do the submit
	        int submit_nr = scheme==null 
     		       ? outer_this.runJob(in)
       		       : outer_this.runJob(scheme, in);

     		Plugin.INSTANCE.logInfo("jetty.JobServer.submit: submitted, nr="+ submit_nr);

     		// make the response
	        response.setContentType("text/html; charset=utf-8");
	        response.setStatus(HttpServletResponse.SC_OK);
     		PrintWriter out = response.getWriter();
     		out.format("%s", submit_nr);
     		out.close();

     		Plugin.INSTANCE.logInfo("jetty.JobServer.submit: output written");

	        baseRequest.setHandled(true);
     		Plugin.INSTANCE.logInfo("jetty.JobServer.submit: request handled");
	    }
	};

	
	/**
	 * 
	 * @author MiSc
	 *
	 */
	private class SubmitFileHandler extends AbstractHandler {
		
		@Override
	    public void handle( String target,
	                        Request baseRequest,
	                        HttpServletRequest request,
	                        HttpServletResponse response ) throws IOException,
	                                                      ServletException
	    {
			JobEngineServerImpl outer_this = JobEngineServerImpl.this;
			
			Plugin.INSTANCE.logInfo(String.format("jetty.JobServer.submitFile: called, method=%s, query=%s", request.getMethod(), request.getQueryString()));
			Map<String, String> params = Util.getQueryParams(request.getQueryString());

			// get the scheme
	        String job_type = params.get("jobtype");
			Plugin.INSTANCE.logInfo("jetty.JobServer.submitFile: jobtype="+ job_type);

			// get the file
			String filepath = null;
	        String filename = params.get("filename");
	        if ( filename!=null ) {
		        filepath = String.format("%s\\%s", outer_this.getTmpFolder(), filename);
				Plugin.INSTANCE.logInfo("jetty.JobServer.submitFile: filepath="+ filepath);
	        } else {
				Plugin.INSTANCE.logInfo(String.format("jetty.JobServer.submitFile: content l=%d, encoding=%s, type=%s",
						request.getContentLength(), 
						request.getCharacterEncoding(),
						request.getContentType()));
		        filepath = String.format("%s\\file_%tQ", outer_this.getTmpFolder(), new Date());
		        OutputStream file = new FileOutputStream(filepath);
		        InputStream in = request.getInputStream();
		        IOUtils.copy(in, file);
	        }

	        // do the submit
	        int submit_nr = outer_this.runFile(job_type, filepath);

     		Plugin.INSTANCE.logInfo("jetty.JobServer.submitFile: submitted, nr="+ submit_nr);

     		// make the response
	        response.setContentType("text/html; charset=utf-8");
	        response.setStatus(HttpServletResponse.SC_OK);
     		PrintWriter out = response.getWriter();
     		out.format("%s", submit_nr);
     		out.close();

     		Plugin.INSTANCE.logInfo("jetty.JobServer.submit: output written");

	        baseRequest.setHandled(true);
     		Plugin.INSTANCE.logInfo("jetty.JobServer.submit: request handled");
	    }
	};


	/**
	 * 
	 * @author MiSc
	 *
	 */
	private class GetJobStatusHandler extends AbstractHandler {
		
		@Override
	    public void handle( String target,
	                        Request baseRequest,
	                        HttpServletRequest request,
	                        HttpServletResponse response ) throws IOException,
	                                                      ServletException
	    {
			JobEngineServerImpl outer_this = JobEngineServerImpl.this;
			
			Plugin.INSTANCE.logInfo(String.format("jetty.JobServer.getjobstatus: called, method=%s, query=%s", request.getMethod(), request.getQueryString()));
			Map<String, String> params = Util.getQueryParams(request.getQueryString());

			// get the submit id
			int execution_nr = -1;
			try {
		        String submtid = params.get("submitid");
				Plugin.INSTANCE.logInfo("jetty.JobServer.getjobstatus: submtid="+ submtid);
				execution_nr = Integer.parseInt(submtid);
			} catch(NumberFormatException e) {
				Plugin.INSTANCE.logInfo("jetty.JobServer.getjobstatus: invalid submtid");
			}

			if ( execution_nr>=0 ) {
		        // get the status
		        int status = outer_this.getJobStatus(execution_nr);

	     		Plugin.INSTANCE.logInfo("jetty.JobServer.getjobstatus: status="+ status);

	     		// make the response
		        response.setContentType("text/html; charset=utf-8");
		        response.setStatus(HttpServletResponse.SC_OK);
	     		PrintWriter out = response.getWriter();
	     		out.format("%s", status);
	     		out.close();

	     		Plugin.INSTANCE.logInfo("jetty.JobServer.getjobstatus: output written");

		        baseRequest.setHandled(true);
	     		Plugin.INSTANCE.logInfo("jetty.JobServer.getjobstatus: request handled");
			}
	    }
	};


	/**
	 * Run a job
	 * <p>
	 * Deserialize the job as string with the given scheme, and submit it to the scheduler.
	 * Returns the submit id
	 */
	private int runJob(String serializeSchemeID, Reader reader) {
		Plugin.INSTANCE.logInfo("JobEngineServer.runJob: called ");

		JobEngineServer jobEngineServer = JobEngineServerImpl.this;
		JobScheduler scheduler = jobEngineServer.getScheduler();
		
    	EObject object = com.misc.common.moplaf.serialize.util.Util.deserialize(serializeSchemeID, reader);

	    if ( object==null ) {
			Plugin.INSTANCE.logError("JobEngineServer.runJob: job not deserialized");
			return -1;
	    } else if ( object instanceof Run) {
    		Run job = (Run) object;
    		Plugin.INSTANCE.logInfo("JobEngineServer.runJob: job received");
    		JobScheduled submittedJob = scheduler.submitRun(jobEngineServer, job, true);  // takes ownership
    		int result = submittedJob.getScheduleNr();
    		Plugin.INSTANCE.logInfo("JobEngineServer.runJob: job submitted, nr="+result);
    		return result;
    		
    	} else {
			Plugin.INSTANCE.logError("JobEngineServer.runJob: deserialized object is not a Run");
			return -1;
    	}
	}

	/**
	 * Create a job for the given type. The job type must be a JobFileHandler.
	 * Attach the file to the job and submit the job to the scheduler.
	 * Returns the submit id.
	 */
	private int runFile(String job_type_id, String filepath) {
		Plugin.INSTANCE.logInfo(String.format("JobEngineServer.runFile: called, type=%s, file=+s ", job_type_id, filepath));

		JobEngineServer jobEngineServer = JobEngineServerImpl.this;
		JobScheduler scheduler = jobEngineServer.getScheduler();

		// get the job factory
		RunFactory factory = com.misc.common.moplaf.job.util.Util.getRunFactory(job_type_id);
		if ( factory == null ) {
			Plugin.INSTANCE.logError(String.format("JobEngineServer.runFile: unknown job type %s ", job_type_id));
			return -1;
		}
		
		// get the job
		Run job = factory.createRun();
		if ( !(job instanceof JobFileHandler)) {
			Plugin.INSTANCE.logError(String.format("JobEngineServer.runFile: job must be of type JobFileHandler, and not of type %s ", job.eClass().getName()));
			return -1;
		}
		JobFileHandler file_handler = (JobFileHandler)job;

		// make the file
		FileLocal file = FileFactory.eINSTANCE.createFileLocal();
		file.setFilePath(filepath);
		file_handler.getFiles().add(file); // owning
		
		// schedule the job
		JobScheduled submittedJob = scheduler.submitRun(jobEngineServer, job, true);  // takes ownership
		int result = submittedJob.getScheduleNr();
		Plugin.INSTANCE.logInfo("JobEngineServer.runJob: job submitted, nr="+result);
		
		return result;
	}


	
	/**
	 * Run a job
	 * <p>
	 * Deserialize the job as string with the given scheme, and submit it to the scheduler.
	 */
	private int runJob(Reader reader) {
		Plugin.INSTANCE.logInfo("JobEngineServer.runJob: called ");
		return this.runJob(XMIScheme.SCHEME_ID, reader);
	}
		
	/**
	 * 
	 */
	private int getJobStatus(int jobExecuteNr) {
		Plugin.INSTANCE.logInfo(String.format("JobEngineServer.getJobStatus: jobExecutenr= %d", jobExecuteNr));
		JobEngineServerImpl jobEngineServer = JobEngineServerImpl.this;
		JobScheduled job = jobEngineServer.getJobScheduled(jobExecuteNr);
		if ( job == null ) {
			Plugin.INSTANCE.logError(String.format("JobEngineServer.getJobStatus: jobExecutenr= %d, job not found", jobExecuteNr));
			return JobStatus.UNKNOWN_VALUE;
		}

		int status = job.getStatus().getValue();
		Plugin.INSTANCE.logInfo(String.format("JobEngineServer.getJobStatus: status= %d", status));
		return status;
	}

	private String getJobResult(String serializeSchemeID, int jobExecuteNr) {
		Plugin.INSTANCE.logInfo(String.format("JobEngineServer.getJobResult: jobExecutenr= %d", jobExecuteNr));
		JobEngineServerImpl jobEngineServer = JobEngineServerImpl.this;
		JobScheduled job = jobEngineServer.getJobScheduled(jobExecuteNr);
		if ( job == null ) {
			Plugin.INSTANCE.logError(String.format("JobEngineServer.getJobResult: jobExecutenr= %d, job not found", jobExecuteNr));
			return "";
		}
	    StringWriter stringWriter = new StringWriter();
	    boolean serialized = com.misc.common.moplaf.serialize.util.Util.serialize(serializeSchemeID, job.getRun(), stringWriter);
		if ( !serialized ) {
			Plugin.INSTANCE.logError(String.format("JobEngineServer.getJobResult: result not serialized"));
			return "";
		}
	    String jobAsString = stringWriter.toString();
	    return jobAsString;
	}
		
	private String getJobResult(int jobExecuteNr) {
		return getJobResult(XMIScheme.SCHEME_ID, jobExecuteNr);
	}

	protected JobScheduled getJobScheduled(int job_execute_nr) {
		JobScheduled job = this.getJobsScheduled()
				.stream()
				.filter(j -> j.getExecuteNr()==job_execute_nr)
				.findFirst()
				.orElse(null);
		return job;
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
