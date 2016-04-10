/**
 */
package com.misc.common.moplaf.solver.solverneos.impl;

import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.ILpWriter;
import com.misc.common.moplaf.solver.SolutionReader;
import com.misc.common.moplaf.solver.impl.SolverLpImpl;
import com.misc.common.moplaf.solver.solverneos.EnumNeosSolverCategory;
import com.misc.common.moplaf.solver.solverneos.EnumNeosSolverInput;
import com.misc.common.moplaf.solver.solverneos.EnumNeosSolverName;
import com.misc.common.moplaf.solver.solverneos.SolverNeos;
import com.misc.common.moplaf.solver.solverneos.SolverneosPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Vector;
import org.apache.xmlrpc.XmlRpcException;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.neos.client.NeosJobXml;
import org.neos.client.NeosXmlRpcClient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solver Neos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getLpWriter <em>Lp Writer</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getSolReader <em>Sol Reader</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getServerHost <em>Server Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getServerPort <em>Server Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getSolverCategory <em>Solver Category</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getSolverName <em>Solver Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getSolverInput <em>Solver Input</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getSolverPollDuration <em>Solver Poll Duration</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#isJobSubmitted <em>Job Submitted</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#isJobDone <em>Job Done</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#isJobResultRetrieved <em>Job Result Retrieved</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getJobNumber <em>Job Number</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getJobPassword <em>Job Password</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getJobStatus <em>Job Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getJobLastStatus <em>Job Last Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getJobNeosStatus <em>Job Neos Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getJobSubmitterEmail <em>Job Submitter Email</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl#getJobResult <em>Job Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverNeosImpl extends SolverLpImpl implements SolverNeos {
	
	private NeosXmlRpcClient neosClient = null;
	
	private NeosXmlRpcClient getNeosClient(){
		if ( this.neosClient==null){
			this.neosClient = new NeosXmlRpcClient(this.getServerHost(), this.getServerPort());
			try {
				this.neosClient.connect();
			} 
			catch (XmlRpcException e) {
				String message = String.format("Unable to connect to server %s:%s\n%s",
							                   this.getServerHost(), 
							                   this.getServerPort(), 
							                   e.getMessage());
				CommonPlugin.INSTANCE.log("SolverNeos: connect failed: "+message);
				this.neosClient = null;
			}
		}
		return this.neosClient;
	}
	
	/**
	 * The cached value of the '{@link #getLpWriter() <em>Lp Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpWriter()
	 * @generated
	 * @ordered
	 */
	protected ILpWriter lpWriter;

	/**
	 * The cached value of the '{@link #getSolReader() <em>Sol Reader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolReader()
	 * @generated
	 * @ordered
	 */
	protected SolutionReader solReader;

	/**
	 * The default value of the '{@link #getServerHost() <em>Server Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerHost()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_HOST_EDEFAULT = "www.neos-server.org";

	/**
	 * The cached value of the '{@link #getServerHost() <em>Server Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerHost()
	 * @generated
	 * @ordered
	 */
	protected String serverHost = SERVER_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerPort() <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerPort()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_PORT_EDEFAULT = "3332";

	/**
	 * The cached value of the '{@link #getServerPort() <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerPort()
	 * @generated
	 * @ordered
	 */
	protected String serverPort = SERVER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolverCategory() <em>Solver Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverCategory()
	 * @generated
	 * @ordered
	 */
	protected static final EnumNeosSolverCategory SOLVER_CATEGORY_EDEFAULT = EnumNeosSolverCategory.MILP;

	/**
	 * The cached value of the '{@link #getSolverCategory() <em>Solver Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverCategory()
	 * @generated
	 * @ordered
	 */
	protected EnumNeosSolverCategory solverCategory = SOLVER_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolverName() <em>Solver Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverName()
	 * @generated
	 * @ordered
	 */
	protected static final EnumNeosSolverName SOLVER_NAME_EDEFAULT = EnumNeosSolverName.SCIP;

	/**
	 * The cached value of the '{@link #getSolverName() <em>Solver Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverName()
	 * @generated
	 * @ordered
	 */
	protected EnumNeosSolverName solverName = SOLVER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolverInput() <em>Solver Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverInput()
	 * @generated
	 * @ordered
	 */
	protected static final EnumNeosSolverInput SOLVER_INPUT_EDEFAULT = EnumNeosSolverInput.MPS;

	/**
	 * The cached value of the '{@link #getSolverInput() <em>Solver Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverInput()
	 * @generated
	 * @ordered
	 */
	protected EnumNeosSolverInput solverInput = SOLVER_INPUT_EDEFAULT;


	/**
	 * The default value of the '{@link #getSolverPollDuration() <em>Solver Poll Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverPollDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int SOLVER_POLL_DURATION_EDEFAULT = 30;

	/**
	 * The cached value of the '{@link #getSolverPollDuration() <em>Solver Poll Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverPollDuration()
	 * @generated
	 * @ordered
	 */
	protected int solverPollDuration = SOLVER_POLL_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isJobSubmitted() <em>Job Submitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJobSubmitted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JOB_SUBMITTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isJobSubmitted() <em>Job Submitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJobSubmitted()
	 * @generated
	 * @ordered
	 */
	protected boolean jobSubmitted = JOB_SUBMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isJobDone() <em>Job Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJobDone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JOB_DONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isJobDone() <em>Job Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJobDone()
	 * @generated
	 * @ordered
	 */
	protected boolean jobDone = JOB_DONE_EDEFAULT;

	/**
	 * The default value of the '{@link #isJobResultRetrieved() <em>Job Result Retrieved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJobResultRetrieved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JOB_RESULT_RETRIEVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isJobResultRetrieved() <em>Job Result Retrieved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJobResultRetrieved()
	 * @generated
	 * @ordered
	 */
	protected boolean jobResultRetrieved = JOB_RESULT_RETRIEVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobNumber() <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int JOB_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJobNumber() <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNumber()
	 * @generated
	 * @ordered
	 */
	protected int jobNumber = JOB_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobPassword() <em>Job Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobPassword() <em>Job Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPassword()
	 * @generated
	 * @ordered
	 */
	protected String jobPassword = JOB_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobStatus() <em>Job Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_STATUS_EDEFAULT = "created";

	/**
	 * The cached value of the '{@link #getJobStatus() <em>Job Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobStatus()
	 * @generated
	 * @ordered
	 */
	protected String jobStatus = JOB_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobLastStatus() <em>Job Last Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobLastStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Date JOB_LAST_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobLastStatus() <em>Job Last Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobLastStatus()
	 * @generated
	 * @ordered
	 */
	protected Date jobLastStatus = JOB_LAST_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobNeosStatus() <em>Job Neos Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNeosStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_NEOS_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobNeosStatus() <em>Job Neos Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNeosStatus()
	 * @generated
	 * @ordered
	 */
	protected String jobNeosStatus = JOB_NEOS_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobSubmitterEmail() <em>Job Submitter Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobSubmitterEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_SUBMITTER_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobSubmitterEmail() <em>Job Submitter Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobSubmitterEmail()
	 * @generated
	 * @ordered
	 */
	protected String jobSubmitterEmail = JOB_SUBMITTER_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobResult() <em>Job Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobResult()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobResult() <em>Job Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobResult()
	 * @generated
	 * @ordered
	 */
	protected String jobResult = JOB_RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverNeosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverneosPackage.Literals.SOLVER_NEOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILpWriter getLpWriter() {
		if (lpWriter != null && lpWriter.eIsProxy()) {
			InternalEObject oldLpWriter = (InternalEObject)lpWriter;
			lpWriter = (ILpWriter)eResolveProxy(oldLpWriter);
			if (lpWriter != oldLpWriter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverneosPackage.SOLVER_NEOS__LP_WRITER, oldLpWriter, lpWriter));
			}
		}
		return lpWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILpWriter basicGetLpWriter() {
		return lpWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLpWriter(ILpWriter newLpWriter) {
		ILpWriter oldLpWriter = lpWriter;
		lpWriter = newLpWriter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__LP_WRITER, oldLpWriter, lpWriter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionReader getSolReader() {
		return solReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolReader(SolutionReader newSolReader, NotificationChain msgs) {
		SolutionReader oldSolReader = solReader;
		solReader = newSolReader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__SOL_READER, oldSolReader, newSolReader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolReader(SolutionReader newSolReader) {
		if (newSolReader != solReader) {
			NotificationChain msgs = null;
			if (solReader != null)
				msgs = ((InternalEObject)solReader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolverneosPackage.SOLVER_NEOS__SOL_READER, null, msgs);
			if (newSolReader != null)
				msgs = ((InternalEObject)newSolReader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolverneosPackage.SOLVER_NEOS__SOL_READER, null, msgs);
			msgs = basicSetSolReader(newSolReader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__SOL_READER, newSolReader, newSolReader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerHost() {
		return serverHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerHost(String newServerHost) {
		String oldServerHost = serverHost;
		serverHost = newServerHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__SERVER_HOST, oldServerHost, serverHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerPort() {
		return serverPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerPort(String newServerPort) {
		String oldServerPort = serverPort;
		serverPort = newServerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__SERVER_PORT, oldServerPort, serverPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumNeosSolverCategory getSolverCategory() {
		return solverCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverCategory(EnumNeosSolverCategory newSolverCategory) {
		EnumNeosSolverCategory oldSolverCategory = solverCategory;
		solverCategory = newSolverCategory == null ? SOLVER_CATEGORY_EDEFAULT : newSolverCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__SOLVER_CATEGORY, oldSolverCategory, solverCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumNeosSolverName getSolverName() {
		return solverName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverName(EnumNeosSolverName newSolverName) {
		EnumNeosSolverName oldSolverName = solverName;
		solverName = newSolverName == null ? SOLVER_NAME_EDEFAULT : newSolverName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__SOLVER_NAME, oldSolverName, solverName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumNeosSolverInput getSolverInput() {
		return solverInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverInput(EnumNeosSolverInput newSolverInput) {
		EnumNeosSolverInput oldSolverInput = solverInput;
		solverInput = newSolverInput == null ? SOLVER_INPUT_EDEFAULT : newSolverInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__SOLVER_INPUT, oldSolverInput, solverInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSolverPollDuration() {
		return solverPollDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverPollDuration(int newSolverPollDuration) {
		int oldSolverPollDuration = solverPollDuration;
		solverPollDuration = newSolverPollDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__SOLVER_POLL_DURATION, oldSolverPollDuration, solverPollDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isJobSubmitted() {
		return jobSubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobSubmitted(boolean newJobSubmitted) {
		boolean oldJobSubmitted = jobSubmitted;
		jobSubmitted = newJobSubmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__JOB_SUBMITTED, oldJobSubmitted, jobSubmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isJobDone() {
		return jobDone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobDone(boolean newJobDone) {
		boolean oldJobDone = jobDone;
		jobDone = newJobDone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__JOB_DONE, oldJobDone, jobDone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isJobResultRetrieved() {
		return jobResultRetrieved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobResultRetrieved(boolean newJobResultRetrieved) {
		boolean oldJobResultRetrieved = jobResultRetrieved;
		jobResultRetrieved = newJobResultRetrieved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__JOB_RESULT_RETRIEVED, oldJobResultRetrieved, jobResultRetrieved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJobNumber() {
		return jobNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobNumber(int newJobNumber) {
		int oldJobNumber = jobNumber;
		jobNumber = newJobNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__JOB_NUMBER, oldJobNumber, jobNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobPassword() {
		return jobPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobPassword(String newJobPassword) {
		String oldJobPassword = jobPassword;
		jobPassword = newJobPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__JOB_PASSWORD, oldJobPassword, jobPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobStatus() {
		return jobStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobStatus(String newJobStatus) {
		String oldJobStatus = jobStatus;
		jobStatus = newJobStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__JOB_STATUS, oldJobStatus, jobStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getJobLastStatus() {
		return jobLastStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobLastStatus(Date newJobLastStatus) {
		Date oldJobLastStatus = jobLastStatus;
		jobLastStatus = newJobLastStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__JOB_LAST_STATUS, oldJobLastStatus, jobLastStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobNeosStatus() {
		return jobNeosStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobNeosStatus(String newJobNeosStatus) {
		String oldJobNeosStatus = jobNeosStatus;
		jobNeosStatus = newJobNeosStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__JOB_NEOS_STATUS, oldJobNeosStatus, jobNeosStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobSubmitterEmail() {
		return jobSubmitterEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobSubmitterEmail(String newJobSubmitterEmail) {
		String oldJobSubmitterEmail = jobSubmitterEmail;
		jobSubmitterEmail = newJobSubmitterEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__JOB_SUBMITTER_EMAIL, oldJobSubmitterEmail, jobSubmitterEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobResult() {
		return jobResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobResult(String newJobResult) {
		String oldJobResult = jobResult;
		jobResult = newJobResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverneosPackage.SOLVER_NEOS__JOB_RESULT, oldJobResult, jobResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void retrieveJobStatus() {
		if ( ! this.isJobSubmitted()) { return ; }
		if ( this.isJobDone() ) { return ; }
		CommonPlugin.INSTANCE.log("SolverNeos: getJobStatus");
		NeosXmlRpcClient neosclient = this.getNeosClient();
		Vector params = new Vector();
		params.add(this.getJobNumber());
		params.add(this.getJobPassword());
		String status = "";
		try {
			status = (String) neosclient.execute("getJobStatus", params);
		} catch (XmlRpcException e) {
			e.printStackTrace();
			CommonPlugin.INSTANCE.log("SolverNeos: getJobStatus failed, "+ e.getMessage());
		}	
		this.setJobNeosStatus(status);
		this.setJobLastStatus(new Date());
		if ( status.equals("Done")){
			this.setJobDone(true);
			this.setJobStatus("done");
		}
		CommonPlugin.INSTANCE.log("SolverNeos: getJobStatus: "+ status);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void retrieveJobResult() {
		if ( !this.isJobSubmitted()) { return ; }
		if ( !this.isJobDone() )     { return ; }
		CommonPlugin.INSTANCE.log("SolverNeos: retrieveJobResult");
		NeosXmlRpcClient neosclient = this.getNeosClient();
		Vector params = new Vector();
		params.add(this.getJobNumber());
		params.add(this.getJobPassword());
		String status = "";
		String result = "";
		try {
			Object retval = neosclient.execute("getFinalResults", params);
			if (retval instanceof String) {
				  result = (String) retval;
					CommonPlugin.INSTANCE.log("SolverNeos: result retrieved String");
				} else if (retval instanceof byte[]) {
				  result = (new String((byte[]) retval));
					CommonPlugin.INSTANCE.log("SolverNeos: result retrieved byte[]");
				} else {
					CommonPlugin.INSTANCE.log("SolverNeos: result retrieved "+ retval.getClass().toString());
					
				}
		} catch (XmlRpcException e) {
			e.printStackTrace();
			CommonPlugin.INSTANCE.log("SolverNeos: retrieveJobResult failed, "+e.getMessage());
		}	

		CommonPlugin.INSTANCE.log("SolverNeos: result "+result);
		
		this.setJobResultRetrieved(true);
		this.setJobResult(result);
		this.setJobStatus("retrieved");
		this.setJobLastStatus(new Date());
		
		SolutionReader solreader = this.getSolReader();
		if ( solreader == null){
			CommonPlugin.INSTANCE.log("SolverNeos: no reader, abort");
		}
		else {
			solreader.setSolAsString(result);

			CommonPlugin.INSTANCE.log("SolverNeos: solution constructed");
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void killJob() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void submitJob() {
		if ( this.isJobSubmitted()) { return ; }
		CommonPlugin.INSTANCE.log("SolverNeos: submitJob");

		// make the lp
		ILpWriter modelprovider = this.getLpWriter();
		if ( modelprovider==null){
			CommonPlugin.INSTANCE.log("SolverNeos: no lp writer, abort");
		}
		String model = modelprovider.getLpAsString();
		
		// get the client
		NeosXmlRpcClient neosclient = this.getNeosClient();
		
		NeosJobXml neosJob = new NeosJobXml(this.getSolverCategory().getLiteral(), 
				                            this.getSolverName()    .getLiteral(),
				                            this.getSolverInput()   .getLiteral());
		neosJob.addParam(this.getSolverInput().getLiteral().toLowerCase(), model);
		neosJob.addParam("email", this.getJobSubmitterEmail()); // not sure the right plance; might be before the model
		Generator generator = this.getGenerator();
		neosJob.addParam("maximize", "yes");

		// submit the job
		Vector params = new Vector();
		String jobString = neosJob.toXMLString();
		CommonPlugin.INSTANCE.log("SolverNeos: job xml, "+jobString);
		params.add(jobString);	
		Object[] results = null;
		try {
			results = (Object[]) neosclient.execute("submitJob", params);
		} catch (XmlRpcException e) {
			CommonPlugin.INSTANCE.log("SolverNeos: submitJob failed, "+e.getMessage());
			e.printStackTrace();
		}

		/* Get returned values of job number and job password */
		int jobNo = (Integer) results[0];
		String jobPass = (String) results[1];		
		this.setJobNumber(jobNo);
		this.setJobPassword(jobPass);
		this.setJobSubmitted(true);
		this.setJobStatus("submitted");
		this.setJobLastStatus(new Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverneosPackage.SOLVER_NEOS__SOL_READER:
				return basicSetSolReader(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	

	@Override
	protected void resetStatus() {
		this.jobSubmitted = false;
		super.resetStatus();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.solver.impl.SolverImpl#solveLp()
	 */
	@Override
	public void solveSolver() {
		this.submitJob();
		
		this.onInitializationEnd();
		
		boolean finished = false;
		while ( !finished ){
			Date currenttime = new Date();
			if ( this.isJobDone()){
				finished = true;
				
				this.onSolvingEnd();
				
				this.retrieveJobResult();
				
			}
			else if ( currenttime.getTime()-this.getRunInitializationEnded().getTime()>this.getSolverMaxDuration()*1000) {
				// more time elpased than allocated
				CommonPlugin.INSTANCE.log("SolverNeos: solver time out");
				this.setRunTimeOut(true);
				finished = true;
			} else if ( this.isRunRequestTerminate() ){
				// interrupted
				CommonPlugin.INSTANCE.log("SolverNeos: solver interrupted");
				this.setRunInterrupted(true);
				finished = true;
			} else if ( currenttime.getTime()-getJobLastStatus().getTime()<this.getSolverPollDuration()*1000 ){
				// not enough time elapsed, sleep a little
				try {
					Thread.sleep(this.getSolverPollDuration()*1000/10);
				} catch (InterruptedException e) {
					CommonPlugin.INSTANCE.log("SolverNeos: solver interrupted via interruption");
					this.setRunInterrupted(true);
					finished = true;
				};
			}
			else {
    			this.retrieveJobStatus();
			}
			this.onSolverFeedback("", this.getJobStatus(), 0.0f, 0.0f, false);
		} // while not finished
		
		return;
	}  // method solveLp

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverneosPackage.SOLVER_NEOS__LP_WRITER:
				if (resolve) return getLpWriter();
				return basicGetLpWriter();
			case SolverneosPackage.SOLVER_NEOS__SOL_READER:
				return getSolReader();
			case SolverneosPackage.SOLVER_NEOS__SERVER_HOST:
				return getServerHost();
			case SolverneosPackage.SOLVER_NEOS__SERVER_PORT:
				return getServerPort();
			case SolverneosPackage.SOLVER_NEOS__SOLVER_CATEGORY:
				return getSolverCategory();
			case SolverneosPackage.SOLVER_NEOS__SOLVER_NAME:
				return getSolverName();
			case SolverneosPackage.SOLVER_NEOS__SOLVER_INPUT:
				return getSolverInput();
			case SolverneosPackage.SOLVER_NEOS__SOLVER_POLL_DURATION:
				return getSolverPollDuration();
			case SolverneosPackage.SOLVER_NEOS__JOB_SUBMITTED:
				return isJobSubmitted();
			case SolverneosPackage.SOLVER_NEOS__JOB_DONE:
				return isJobDone();
			case SolverneosPackage.SOLVER_NEOS__JOB_RESULT_RETRIEVED:
				return isJobResultRetrieved();
			case SolverneosPackage.SOLVER_NEOS__JOB_NUMBER:
				return getJobNumber();
			case SolverneosPackage.SOLVER_NEOS__JOB_PASSWORD:
				return getJobPassword();
			case SolverneosPackage.SOLVER_NEOS__JOB_STATUS:
				return getJobStatus();
			case SolverneosPackage.SOLVER_NEOS__JOB_LAST_STATUS:
				return getJobLastStatus();
			case SolverneosPackage.SOLVER_NEOS__JOB_NEOS_STATUS:
				return getJobNeosStatus();
			case SolverneosPackage.SOLVER_NEOS__JOB_SUBMITTER_EMAIL:
				return getJobSubmitterEmail();
			case SolverneosPackage.SOLVER_NEOS__JOB_RESULT:
				return getJobResult();
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
			case SolverneosPackage.SOLVER_NEOS__LP_WRITER:
				setLpWriter((ILpWriter)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__SOL_READER:
				setSolReader((SolutionReader)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__SERVER_HOST:
				setServerHost((String)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__SERVER_PORT:
				setServerPort((String)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__SOLVER_CATEGORY:
				setSolverCategory((EnumNeosSolverCategory)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__SOLVER_NAME:
				setSolverName((EnumNeosSolverName)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__SOLVER_INPUT:
				setSolverInput((EnumNeosSolverInput)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__SOLVER_POLL_DURATION:
				setSolverPollDuration((Integer)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_SUBMITTED:
				setJobSubmitted((Boolean)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_DONE:
				setJobDone((Boolean)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_RESULT_RETRIEVED:
				setJobResultRetrieved((Boolean)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_NUMBER:
				setJobNumber((Integer)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_PASSWORD:
				setJobPassword((String)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_STATUS:
				setJobStatus((String)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_LAST_STATUS:
				setJobLastStatus((Date)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_NEOS_STATUS:
				setJobNeosStatus((String)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_SUBMITTER_EMAIL:
				setJobSubmitterEmail((String)newValue);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_RESULT:
				setJobResult((String)newValue);
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
			case SolverneosPackage.SOLVER_NEOS__LP_WRITER:
				setLpWriter((ILpWriter)null);
				return;
			case SolverneosPackage.SOLVER_NEOS__SOL_READER:
				setSolReader((SolutionReader)null);
				return;
			case SolverneosPackage.SOLVER_NEOS__SERVER_HOST:
				setServerHost(SERVER_HOST_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__SERVER_PORT:
				setServerPort(SERVER_PORT_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__SOLVER_CATEGORY:
				setSolverCategory(SOLVER_CATEGORY_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__SOLVER_NAME:
				setSolverName(SOLVER_NAME_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__SOLVER_INPUT:
				setSolverInput(SOLVER_INPUT_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__SOLVER_POLL_DURATION:
				setSolverPollDuration(SOLVER_POLL_DURATION_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_SUBMITTED:
				setJobSubmitted(JOB_SUBMITTED_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_DONE:
				setJobDone(JOB_DONE_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_RESULT_RETRIEVED:
				setJobResultRetrieved(JOB_RESULT_RETRIEVED_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_NUMBER:
				setJobNumber(JOB_NUMBER_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_PASSWORD:
				setJobPassword(JOB_PASSWORD_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_STATUS:
				setJobStatus(JOB_STATUS_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_LAST_STATUS:
				setJobLastStatus(JOB_LAST_STATUS_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_NEOS_STATUS:
				setJobNeosStatus(JOB_NEOS_STATUS_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_SUBMITTER_EMAIL:
				setJobSubmitterEmail(JOB_SUBMITTER_EMAIL_EDEFAULT);
				return;
			case SolverneosPackage.SOLVER_NEOS__JOB_RESULT:
				setJobResult(JOB_RESULT_EDEFAULT);
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
			case SolverneosPackage.SOLVER_NEOS__LP_WRITER:
				return lpWriter != null;
			case SolverneosPackage.SOLVER_NEOS__SOL_READER:
				return solReader != null;
			case SolverneosPackage.SOLVER_NEOS__SERVER_HOST:
				return SERVER_HOST_EDEFAULT == null ? serverHost != null : !SERVER_HOST_EDEFAULT.equals(serverHost);
			case SolverneosPackage.SOLVER_NEOS__SERVER_PORT:
				return SERVER_PORT_EDEFAULT == null ? serverPort != null : !SERVER_PORT_EDEFAULT.equals(serverPort);
			case SolverneosPackage.SOLVER_NEOS__SOLVER_CATEGORY:
				return solverCategory != SOLVER_CATEGORY_EDEFAULT;
			case SolverneosPackage.SOLVER_NEOS__SOLVER_NAME:
				return solverName != SOLVER_NAME_EDEFAULT;
			case SolverneosPackage.SOLVER_NEOS__SOLVER_INPUT:
				return solverInput != SOLVER_INPUT_EDEFAULT;
			case SolverneosPackage.SOLVER_NEOS__SOLVER_POLL_DURATION:
				return solverPollDuration != SOLVER_POLL_DURATION_EDEFAULT;
			case SolverneosPackage.SOLVER_NEOS__JOB_SUBMITTED:
				return jobSubmitted != JOB_SUBMITTED_EDEFAULT;
			case SolverneosPackage.SOLVER_NEOS__JOB_DONE:
				return jobDone != JOB_DONE_EDEFAULT;
			case SolverneosPackage.SOLVER_NEOS__JOB_RESULT_RETRIEVED:
				return jobResultRetrieved != JOB_RESULT_RETRIEVED_EDEFAULT;
			case SolverneosPackage.SOLVER_NEOS__JOB_NUMBER:
				return jobNumber != JOB_NUMBER_EDEFAULT;
			case SolverneosPackage.SOLVER_NEOS__JOB_PASSWORD:
				return JOB_PASSWORD_EDEFAULT == null ? jobPassword != null : !JOB_PASSWORD_EDEFAULT.equals(jobPassword);
			case SolverneosPackage.SOLVER_NEOS__JOB_STATUS:
				return JOB_STATUS_EDEFAULT == null ? jobStatus != null : !JOB_STATUS_EDEFAULT.equals(jobStatus);
			case SolverneosPackage.SOLVER_NEOS__JOB_LAST_STATUS:
				return JOB_LAST_STATUS_EDEFAULT == null ? jobLastStatus != null : !JOB_LAST_STATUS_EDEFAULT.equals(jobLastStatus);
			case SolverneosPackage.SOLVER_NEOS__JOB_NEOS_STATUS:
				return JOB_NEOS_STATUS_EDEFAULT == null ? jobNeosStatus != null : !JOB_NEOS_STATUS_EDEFAULT.equals(jobNeosStatus);
			case SolverneosPackage.SOLVER_NEOS__JOB_SUBMITTER_EMAIL:
				return JOB_SUBMITTER_EMAIL_EDEFAULT == null ? jobSubmitterEmail != null : !JOB_SUBMITTER_EMAIL_EDEFAULT.equals(jobSubmitterEmail);
			case SolverneosPackage.SOLVER_NEOS__JOB_RESULT:
				return JOB_RESULT_EDEFAULT == null ? jobResult != null : !JOB_RESULT_EDEFAULT.equals(jobResult);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SolverneosPackage.SOLVER_NEOS___RETRIEVE_JOB_STATUS:
				retrieveJobStatus();
				return null;
			case SolverneosPackage.SOLVER_NEOS___RETRIEVE_JOB_RESULT:
				retrieveJobResult();
				return null;
			case SolverneosPackage.SOLVER_NEOS___KILL_JOB:
				killJob();
				return null;
			case SolverneosPackage.SOLVER_NEOS___SUBMIT_JOB:
				submitJob();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (ServerHost: ");
		result.append(serverHost);
		result.append(", ServerPort: ");
		result.append(serverPort);
		result.append(", SolverCategory: ");
		result.append(solverCategory);
		result.append(", SolverName: ");
		result.append(solverName);
		result.append(", SolverInput: ");
		result.append(solverInput);
		result.append(", SolverPollDuration: ");
		result.append(solverPollDuration);
		result.append(", JobSubmitted: ");
		result.append(jobSubmitted);
		result.append(", JobDone: ");
		result.append(jobDone);
		result.append(", JobResultRetrieved: ");
		result.append(jobResultRetrieved);
		result.append(", JobNumber: ");
		result.append(jobNumber);
		result.append(", JobPassword: ");
		result.append(jobPassword);
		result.append(", JobStatus: ");
		result.append(jobStatus);
		result.append(", JobLastStatus: ");
		result.append(jobLastStatus);
		result.append(", JobNeosStatus: ");
		result.append(jobNeosStatus);
		result.append(", JobSubmitterEmail: ");
		result.append(jobSubmitterEmail);
		result.append(", JobResult: ");
		result.append(jobResult);
		result.append(')');
		return result.toString();
	}

} //SolverNeosImpl
