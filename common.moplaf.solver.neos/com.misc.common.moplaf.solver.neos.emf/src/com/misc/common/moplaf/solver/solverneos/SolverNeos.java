/**
 */
package com.misc.common.moplaf.solver.solverneos;

import com.misc.common.moplaf.solver.ILpWriter;
import com.misc.common.moplaf.solver.SolutionReader;
import com.misc.common.moplaf.solver.SolverLp;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solver Neos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getLpWriter <em>Lp Writer</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolReader <em>Sol Reader</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getServerHost <em>Server Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getServerPort <em>Server Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverCategory <em>Solver Category</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverName <em>Solver Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverInput <em>Solver Input</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverPollDuration <em>Solver Poll Duration</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#isJobSubmitted <em>Job Submitted</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#isJobDone <em>Job Done</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#isJobResultRetrieved <em>Job Result Retrieved</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobNumber <em>Job Number</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobPassword <em>Job Password</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobStatus <em>Job Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobLastStatus <em>Job Last Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobNeosStatus <em>Job Neos Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobSubmitterEmail <em>Job Submitter Email</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobResult <em>Job Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos()
 * @model
 * @generated
 */
public interface SolverNeos extends SolverLp {
	/**
	 * Returns the value of the '<em><b>Lp Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp Writer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp Writer</em>' reference.
	 * @see #setLpWriter(ILpWriter)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_LpWriter()
	 * @model
	 * @generated
	 */
	ILpWriter getLpWriter();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getLpWriter <em>Lp Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp Writer</em>' reference.
	 * @see #getLpWriter()
	 * @generated
	 */
	void setLpWriter(ILpWriter value);

	/**
	 * Returns the value of the '<em><b>Sol Reader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sol Reader</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sol Reader</em>' containment reference.
	 * @see #setSolReader(SolutionReader)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_SolReader()
	 * @model containment="true"
	 * @generated
	 */
	SolutionReader getSolReader();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolReader <em>Sol Reader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sol Reader</em>' containment reference.
	 * @see #getSolReader()
	 * @generated
	 */
	void setSolReader(SolutionReader value);

	/**
	 * Returns the value of the '<em><b>Server Host</b></em>' attribute.
	 * The default value is <code>"www.neos-server.org"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Host</em>' attribute.
	 * @see #setServerHost(String)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_ServerHost()
	 * @model default="www.neos-server.org"
	 * @generated
	 */
	String getServerHost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getServerHost <em>Server Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Host</em>' attribute.
	 * @see #getServerHost()
	 * @generated
	 */
	void setServerHost(String value);

	/**
	 * Returns the value of the '<em><b>Server Port</b></em>' attribute.
	 * The default value is <code>"3332"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Port</em>' attribute.
	 * @see #setServerPort(String)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_ServerPort()
	 * @model default="3332"
	 * @generated
	 */
	String getServerPort();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getServerPort <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Port</em>' attribute.
	 * @see #getServerPort()
	 * @generated
	 */
	void setServerPort(String value);

	/**
	 * Returns the value of the '<em><b>Solver Category</b></em>' attribute.
	 * The default value is <code>"MILP"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.solverneos.EnumNeosSolverCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Category</em>' attribute.
	 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverCategory
	 * @see #setSolverCategory(EnumNeosSolverCategory)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_SolverCategory()
	 * @model default="MILP"
	 * @generated
	 */
	EnumNeosSolverCategory getSolverCategory();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverCategory <em>Solver Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Category</em>' attribute.
	 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverCategory
	 * @see #getSolverCategory()
	 * @generated
	 */
	void setSolverCategory(EnumNeosSolverCategory value);

	/**
	 * Returns the value of the '<em><b>Solver Name</b></em>' attribute.
	 * The default value is <code>"scip"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.solverneos.EnumNeosSolverName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Name</em>' attribute.
	 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverName
	 * @see #setSolverName(EnumNeosSolverName)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_SolverName()
	 * @model default="scip"
	 * @generated
	 */
	EnumNeosSolverName getSolverName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverName <em>Solver Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Name</em>' attribute.
	 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverName
	 * @see #getSolverName()
	 * @generated
	 */
	void setSolverName(EnumNeosSolverName value);

	/**
	 * Returns the value of the '<em><b>Solver Input</b></em>' attribute.
	 * The default value is <code>"MPS"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.solverneos.EnumNeosSolverInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Input</em>' attribute.
	 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverInput
	 * @see #setSolverInput(EnumNeosSolverInput)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_SolverInput()
	 * @model default="MPS"
	 * @generated
	 */
	EnumNeosSolverInput getSolverInput();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverInput <em>Solver Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Input</em>' attribute.
	 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverInput
	 * @see #getSolverInput()
	 * @generated
	 */
	void setSolverInput(EnumNeosSolverInput value);

	/**
	 * Returns the value of the '<em><b>Solver Poll Duration</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Poll Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Poll Duration</em>' attribute.
	 * @see #setSolverPollDuration(int)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_SolverPollDuration()
	 * @model default="30"
	 * @generated
	 */
	int getSolverPollDuration();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverPollDuration <em>Solver Poll Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Poll Duration</em>' attribute.
	 * @see #getSolverPollDuration()
	 * @generated
	 */
	void setSolverPollDuration(int value);

	/**
	 * Returns the value of the '<em><b>Job Submitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Submitted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Submitted</em>' attribute.
	 * @see #setJobSubmitted(boolean)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_JobSubmitted()
	 * @model
	 * @generated
	 */
	boolean isJobSubmitted();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#isJobSubmitted <em>Job Submitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Submitted</em>' attribute.
	 * @see #isJobSubmitted()
	 * @generated
	 */
	void setJobSubmitted(boolean value);

	/**
	 * Returns the value of the '<em><b>Job Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Done</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Done</em>' attribute.
	 * @see #setJobDone(boolean)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_JobDone()
	 * @model
	 * @generated
	 */
	boolean isJobDone();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#isJobDone <em>Job Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Done</em>' attribute.
	 * @see #isJobDone()
	 * @generated
	 */
	void setJobDone(boolean value);

	/**
	 * Returns the value of the '<em><b>Job Result Retrieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Result Retrieved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Result Retrieved</em>' attribute.
	 * @see #setJobResultRetrieved(boolean)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_JobResultRetrieved()
	 * @model
	 * @generated
	 */
	boolean isJobResultRetrieved();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#isJobResultRetrieved <em>Job Result Retrieved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Result Retrieved</em>' attribute.
	 * @see #isJobResultRetrieved()
	 * @generated
	 */
	void setJobResultRetrieved(boolean value);

	/**
	 * Returns the value of the '<em><b>Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Number</em>' attribute.
	 * @see #setJobNumber(int)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_JobNumber()
	 * @model
	 * @generated
	 */
	int getJobNumber();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobNumber <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Number</em>' attribute.
	 * @see #getJobNumber()
	 * @generated
	 */
	void setJobNumber(int value);

	/**
	 * Returns the value of the '<em><b>Job Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Password</em>' attribute.
	 * @see #setJobPassword(String)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_JobPassword()
	 * @model
	 * @generated
	 */
	String getJobPassword();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobPassword <em>Job Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Password</em>' attribute.
	 * @see #getJobPassword()
	 * @generated
	 */
	void setJobPassword(String value);

	/**
	 * Returns the value of the '<em><b>Job Status</b></em>' attribute.
	 * The default value is <code>"created"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Status</em>' attribute.
	 * @see #setJobStatus(String)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_JobStatus()
	 * @model default="created"
	 * @generated
	 */
	String getJobStatus();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobStatus <em>Job Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Status</em>' attribute.
	 * @see #getJobStatus()
	 * @generated
	 */
	void setJobStatus(String value);

	/**
	 * Returns the value of the '<em><b>Job Last Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Last Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Last Status</em>' attribute.
	 * @see #setJobLastStatus(Date)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_JobLastStatus()
	 * @model
	 * @generated
	 */
	Date getJobLastStatus();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobLastStatus <em>Job Last Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Last Status</em>' attribute.
	 * @see #getJobLastStatus()
	 * @generated
	 */
	void setJobLastStatus(Date value);

	/**
	 * Returns the value of the '<em><b>Job Neos Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Neos Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Neos Status</em>' attribute.
	 * @see #setJobNeosStatus(String)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_JobNeosStatus()
	 * @model
	 * @generated
	 */
	String getJobNeosStatus();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobNeosStatus <em>Job Neos Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Neos Status</em>' attribute.
	 * @see #getJobNeosStatus()
	 * @generated
	 */
	void setJobNeosStatus(String value);

	/**
	 * Returns the value of the '<em><b>Job Submitter Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Submitter Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Submitter Email</em>' attribute.
	 * @see #setJobSubmitterEmail(String)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_JobSubmitterEmail()
	 * @model
	 * @generated
	 */
	String getJobSubmitterEmail();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobSubmitterEmail <em>Job Submitter Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Submitter Email</em>' attribute.
	 * @see #getJobSubmitterEmail()
	 * @generated
	 */
	void setJobSubmitterEmail(String value);

	/**
	 * Returns the value of the '<em><b>Job Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Result</em>' attribute.
	 * @see #setJobResult(String)
	 * @see com.misc.common.moplaf.solver.solverneos.SolverneosPackage#getSolverNeos_JobResult()
	 * @model
	 * @generated
	 */
	String getJobResult();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobResult <em>Job Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Result</em>' attribute.
	 * @see #getJobResult()
	 * @generated
	 */
	void setJobResult(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void retrieveJobStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void retrieveJobResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void killJob();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void submitJob();

} // SolverNeos
