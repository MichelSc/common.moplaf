/**
 */
package com.misc.common.moplaf.solver;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solver</b></em>'.
 * <p>
 * A Solver is a run of a concrete solver. It provides control how the run must be performed 
 * (MaxDuration, BackgroundProcess) and gives information how the run is or has been performed
 * (timestamps, status). 
 * <p>
 * A Solver solves a given a problem formulation provided by the interface {@link IGeneratorTool}
 * <p>
 * A Solver produces one or several {@link Solution} for the problem, as specified by its super class {@link SolutionProvider}.
 * <p>
 * To launch the run, call the method {@link #solve()}.
 * 
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#getStatus <em>Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#getSolverMaxDuration <em>Solver Max Duration</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#isSolverBackground <em>Solver Background</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#getSolValue <em>Sol Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#getSolverLogLevel <em>Solver Log Level</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#isSolverDump <em>Solver Dump</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#getRunStarted <em>Run Started</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#getRunInitializationEnded <em>Run Initialization Ended</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#getRunSolvingEnded <em>Run Solving Ended</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#getRunFinalizationEnded <em>Run Finalization Ended</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#getRunDurationInitialization <em>Run Duration Initialization</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#getRunDurationFinalization <em>Run Duration Finalization</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#getRunDurationSolving <em>Run Duration Solving</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#isRunRequestTerminate <em>Run Request Terminate</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#isSolUnfeasible <em>Sol Unfeasible</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#isSolFeasible <em>Sol Feasible</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#isSolOptimal <em>Sol Optimal</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#isRunInterrupted <em>Run Interrupted</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#isSolving <em>Solving</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#isFinalizing <em>Finalizing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#isFinished <em>Finished</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#isRunTimeOut <em>Run Time Out</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#isInitializing <em>Initializing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#getGoalToSolve <em>Goal To Solve</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solver#getInitialSolution <em>Initial Solution</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver()
 * @model abstract="true"
 * @generated
 */
public interface Solver extends SolutionProvider {
	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remarks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_Remarks()
	 * @model
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Solver Max Duration</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Max Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum duration (in secs) allocated to the server
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solver Max Duration</em>' attribute.
	 * @see #setSolverMaxDuration(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_SolverMaxDuration()
	 * @model default="100"
	 * @generated
	 */
	float getSolverMaxDuration();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#getSolverMaxDuration <em>Solver Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Max Duration</em>' attribute.
	 * @see #getSolverMaxDuration()
	 * @generated
	 */
	void setSolverMaxDuration(float value);

	/**
	 * Returns the value of the '<em><b>Solver Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Background</em>' attribute.
	 * @see #setSolverBackground(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_SolverBackground()
	 * @model
	 * @generated
	 */
	boolean isSolverBackground();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#isSolverBackground <em>Solver Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Background</em>' attribute.
	 * @see #isSolverBackground()
	 * @generated
	 */
	void setSolverBackground(boolean value);

	/**
	 * Returns the value of the '<em><b>Solver Log Level</b></em>' attribute.
	 * The default value is <code>"Normal"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.EnumSolverLogLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Log Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Log Level</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumSolverLogLevel
	 * @see #setSolverLogLevel(EnumSolverLogLevel)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_SolverLogLevel()
	 * @model default="Normal"
	 * @generated
	 */
	EnumSolverLogLevel getSolverLogLevel();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#getSolverLogLevel <em>Solver Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Log Level</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumSolverLogLevel
	 * @see #getSolverLogLevel()
	 * @generated
	 */
	void setSolverLogLevel(EnumSolverLogLevel value);

	/**
	 * Returns the value of the '<em><b>Solver Dump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Dump</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Dump</em>' attribute.
	 * @see #setSolverDump(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_SolverDump()
	 * @model
	 * @generated
	 */
	boolean isSolverDump();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#isSolverDump <em>Solver Dump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Dump</em>' attribute.
	 * @see #isSolverDump()
	 * @generated
	 */
	void setSolverDump(boolean value);

	/**
	 * Returns the value of the '<em><b>Run Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Started</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Started</em>' attribute.
	 * @see #setRunStarted(Date)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_RunStarted()
	 * @model
	 * @generated
	 */
	Date getRunStarted();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#getRunStarted <em>Run Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Started</em>' attribute.
	 * @see #getRunStarted()
	 * @generated
	 */
	void setRunStarted(Date value);

	/**
	 * Returns the value of the '<em><b>Run Initialization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Initialization Ended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Initialization Ended</em>' attribute.
	 * @see #setRunInitializationEnded(Date)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_RunInitializationEnded()
	 * @model
	 * @generated
	 */
	Date getRunInitializationEnded();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#getRunInitializationEnded <em>Run Initialization Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Initialization Ended</em>' attribute.
	 * @see #getRunInitializationEnded()
	 * @generated
	 */
	void setRunInitializationEnded(Date value);

	/**
	 * Returns the value of the '<em><b>Run Solving Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Solving Ended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Solving Ended</em>' attribute.
	 * @see #setRunSolvingEnded(Date)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_RunSolvingEnded()
	 * @model
	 * @generated
	 */
	Date getRunSolvingEnded();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#getRunSolvingEnded <em>Run Solving Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Solving Ended</em>' attribute.
	 * @see #getRunSolvingEnded()
	 * @generated
	 */
	void setRunSolvingEnded(Date value);

	/**
	 * Returns the value of the '<em><b>Run Finalization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Finalization Ended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Finalization Ended</em>' attribute.
	 * @see #setRunFinalizationEnded(Date)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_RunFinalizationEnded()
	 * @model
	 * @generated
	 */
	Date getRunFinalizationEnded();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#getRunFinalizationEnded <em>Run Finalization Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Finalization Ended</em>' attribute.
	 * @see #getRunFinalizationEnded()
	 * @generated
	 */
	void setRunFinalizationEnded(Date value);

	/**
	 * Returns the value of the '<em><b>Run Duration Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Duration Initialization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Duration Initialization</em>' attribute.
	 * @see #setRunDurationInitialization(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_RunDurationInitialization()
	 * @model
	 * @generated
	 */
	float getRunDurationInitialization();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#getRunDurationInitialization <em>Run Duration Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Duration Initialization</em>' attribute.
	 * @see #getRunDurationInitialization()
	 * @generated
	 */
	void setRunDurationInitialization(float value);

	/**
	 * Returns the value of the '<em><b>Run Duration Finalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Duration Finalization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Duration Finalization</em>' attribute.
	 * @see #setRunDurationFinalization(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_RunDurationFinalization()
	 * @model
	 * @generated
	 */
	float getRunDurationFinalization();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#getRunDurationFinalization <em>Run Duration Finalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Duration Finalization</em>' attribute.
	 * @see #getRunDurationFinalization()
	 * @generated
	 */
	void setRunDurationFinalization(float value);

	/**
	 * Returns the value of the '<em><b>Run Duration Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Duration Solving</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Duration Solving</em>' attribute.
	 * @see #setRunDurationSolving(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_RunDurationSolving()
	 * @model
	 * @generated
	 */
	float getRunDurationSolving();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#getRunDurationSolving <em>Run Duration Solving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Duration Solving</em>' attribute.
	 * @see #getRunDurationSolving()
	 * @generated
	 */
	void setRunDurationSolving(float value);

	/**
	 * Returns the value of the '<em><b>Run Request Terminate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Request Terminate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Request Terminate</em>' attribute.
	 * @see #setRunRequestTerminate(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_RunRequestTerminate()
	 * @model
	 * @generated
	 */
	boolean isRunRequestTerminate();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#isRunRequestTerminate <em>Run Request Terminate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Request Terminate</em>' attribute.
	 * @see #isRunRequestTerminate()
	 * @generated
	 */
	void setRunRequestTerminate(boolean value);

	/**
	 * Returns the value of the '<em><b>Sol Unfeasible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sol Unfeasible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sol Unfeasible</em>' attribute.
	 * @see #setSolUnfeasible(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_SolUnfeasible()
	 * @model default="false"
	 * @generated
	 */
	boolean isSolUnfeasible();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#isSolUnfeasible <em>Sol Unfeasible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sol Unfeasible</em>' attribute.
	 * @see #isSolUnfeasible()
	 * @generated
	 */
	void setSolUnfeasible(boolean value);

	/**
	 * Returns the value of the '<em><b>Sol Feasible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sol Feasible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sol Feasible</em>' attribute.
	 * @see #setSolFeasible(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_SolFeasible()
	 * @model default="false"
	 * @generated
	 */
	boolean isSolFeasible();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#isSolFeasible <em>Sol Feasible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sol Feasible</em>' attribute.
	 * @see #isSolFeasible()
	 * @generated
	 */
	void setSolFeasible(boolean value);

	/**
	 * Returns the value of the '<em><b>Sol Optimal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sol Optimal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sol Optimal</em>' attribute.
	 * @see #setSolOptimal(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_SolOptimal()
	 * @model default="false"
	 * @generated
	 */
	boolean isSolOptimal();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#isSolOptimal <em>Sol Optimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sol Optimal</em>' attribute.
	 * @see #isSolOptimal()
	 * @generated
	 */
	void setSolOptimal(boolean value);

	/**
	 * Returns the value of the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sol Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sol Value</em>' attribute.
	 * @see #setSolValue(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_SolValue()
	 * @model
	 * @generated
	 */
	float getSolValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#getSolValue <em>Sol Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sol Value</em>' attribute.
	 * @see #getSolValue()
	 * @generated
	 */
	void setSolValue(float value);

	/**
	 * Returns the value of the '<em><b>Run Interrupted</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Interrupted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Interrupted</em>' attribute.
	 * @see #setRunInterrupted(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_RunInterrupted()
	 * @model default="false"
	 * @generated
	 */
	boolean isRunInterrupted();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#isRunInterrupted <em>Run Interrupted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Interrupted</em>' attribute.
	 * @see #isRunInterrupted()
	 * @generated
	 */
	void setRunInterrupted(boolean value);

	/**
	 * Returns the value of the '<em><b>Run Time Out</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Time Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Time Out</em>' attribute.
	 * @see #setRunTimeOut(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_RunTimeOut()
	 * @model default="false"
	 * @generated
	 */
	boolean isRunTimeOut();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#isRunTimeOut <em>Run Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Time Out</em>' attribute.
	 * @see #isRunTimeOut()
	 * @generated
	 */
	void setRunTimeOut(boolean value);

	/**
	 * Returns the value of the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializing</em>' attribute.
	 * @see #setInitializing(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_Initializing()
	 * @model
	 * @generated
	 */
	boolean isInitializing();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#isInitializing <em>Initializing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializing</em>' attribute.
	 * @see #isInitializing()
	 * @generated
	 */
	void setInitializing(boolean value);

	/**
	 * Returns the value of the '<em><b>Goal To Solve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal To Solve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal To Solve</em>' reference.
	 * @see #setGoalToSolve(GeneratorGoal)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_GoalToSolve()
	 * @model
	 * @generated
	 */
	GeneratorGoal getGoalToSolve();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#getGoalToSolve <em>Goal To Solve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal To Solve</em>' reference.
	 * @see #getGoalToSolve()
	 * @generated
	 */
	void setGoalToSolve(GeneratorGoal value);

	/**
	 * Returns the value of the '<em><b>Initial Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Solution</em>' reference.
	 * @see #setInitialSolution(Solution)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_InitialSolution()
	 * @model
	 * @generated
	 */
	Solution getInitialSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#getInitialSolution <em>Initial Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Solution</em>' reference.
	 * @see #getInitialSolution()
	 * @generated
	 */
	void setInitialSolution(Solution value);

	/**
	 * Returns the value of the '<em><b>Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solving</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solving</em>' attribute.
	 * @see #setSolving(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_Solving()
	 * @model
	 * @generated
	 */
	boolean isSolving();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#isSolving <em>Solving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solving</em>' attribute.
	 * @see #isSolving()
	 * @generated
	 */
	void setSolving(boolean value);

	/**
	 * Returns the value of the '<em><b>Finalizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalizing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalizing</em>' attribute.
	 * @see #setFinalizing(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_Finalizing()
	 * @model
	 * @generated
	 */
	boolean isFinalizing();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#isFinalizing <em>Finalizing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalizing</em>' attribute.
	 * @see #isFinalizing()
	 * @generated
	 */
	void setFinalizing(boolean value);

	/**
	 * Returns the value of the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finished</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished</em>' attribute.
	 * @see #setFinished(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolver_Finished()
	 * @model
	 * @generated
	 */
	boolean isFinished();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solver#isFinished <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finished</em>' attribute.
	 * @see #isFinished()
	 * @generated
	 */
	void setFinished(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method to be called by the client to solve the lp and to produce the solution
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void solve();

} // Solver
