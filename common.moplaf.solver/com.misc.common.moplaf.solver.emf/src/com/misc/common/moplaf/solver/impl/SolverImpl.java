/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.EnumSolverLogLevel;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorGoal;
import com.misc.common.moplaf.solver.IGeneratorTool;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getSolverOptimalityTolerance <em>Solver Optimality Tolerance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getSolverMaxDuration <em>Solver Max Duration</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#isSolverLinearRelaxation <em>Solver Linear Relaxation</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#isSolverBackground <em>Solver Background</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getSolverLogLevel <em>Solver Log Level</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#isSolverDump <em>Solver Dump</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getRunStarted <em>Run Started</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getRunInitializationEnded <em>Run Initialization Ended</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getRunSolvingEnded <em>Run Solving Ended</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getRunFinalizationEnded <em>Run Finalization Ended</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getRunDurationInitialization <em>Run Duration Initialization</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getRunDurationFinalization <em>Run Duration Finalization</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getRunDurationSolving <em>Run Duration Solving</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#isRunRequestTerminate <em>Run Request Terminate</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getSolOptimalityGap <em>Sol Optimality Gap</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#isSolUnfeasible <em>Sol Unfeasible</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#isSolFeasible <em>Sol Feasible</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#isSolOptimal <em>Sol Optimal</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#getSolValue <em>Sol Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#isRunInterrupted <em>Run Interrupted</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#isSolving <em>Solving</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#isFinalizing <em>Finalizing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#isFinished <em>Finished</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#isRunTimeOut <em>Run Time Out</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverImpl#isInitializing <em>Initializing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/**
 * @author michel
 *
 */
/**
 * @author michel
 *
 */
/**
 * @author michel
 *
 */
public abstract class SolverImpl extends SolutionProviderImpl implements Solver {
	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolverMaxDuration() <em>Solver Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverMaxDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float SOLVER_MAX_DURATION_EDEFAULT = 100.0F;

	/**
	 * The cached value of the '{@link #getSolverMaxDuration() <em>Solver Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverMaxDuration()
	 * @generated
	 * @ordered
	 */
	protected float solverMaxDuration = SOLVER_MAX_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSolverBackground() <em>Solver Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolverBackground()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOLVER_BACKGROUND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSolverBackground() <em>Solver Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolverBackground()
	 * @generated
	 * @ordered
	 */
	protected boolean solverBackground = SOLVER_BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolValue() <em>Sol Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolValue()
	 * @generated
	 * @ordered
	 */
	protected static final float SOL_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSolValue() <em>Sol Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolValue()
	 * @generated
	 * @ordered
	 */
	protected float solValue = SOL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolverLogLevel() <em>Solver Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverLogLevel()
	 * @generated
	 * @ordered
	 */
	protected static final EnumSolverLogLevel SOLVER_LOG_LEVEL_EDEFAULT = EnumSolverLogLevel.ENUM_NORMAL;

	/**
	 * The cached value of the '{@link #getSolverLogLevel() <em>Solver Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverLogLevel()
	 * @generated
	 * @ordered
	 */
	protected EnumSolverLogLevel solverLogLevel = SOLVER_LOG_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isSolverDump() <em>Solver Dump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolverDump()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOLVER_DUMP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSolverDump() <em>Solver Dump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolverDump()
	 * @generated
	 * @ordered
	 */
	protected boolean solverDump = SOLVER_DUMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunStarted() <em>Run Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunStarted()
	 * @generated
	 * @ordered
	 */
	protected static final Date RUN_STARTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunStarted() <em>Run Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunStarted()
	 * @generated
	 * @ordered
	 */
	protected Date runStarted = RUN_STARTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunInitializationEnded() <em>Run Initialization Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunInitializationEnded()
	 * @generated
	 * @ordered
	 */
	protected static final Date RUN_INITIALIZATION_ENDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunInitializationEnded() <em>Run Initialization Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunInitializationEnded()
	 * @generated
	 * @ordered
	 */
	protected Date runInitializationEnded = RUN_INITIALIZATION_ENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunSolvingEnded() <em>Run Solving Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunSolvingEnded()
	 * @generated
	 * @ordered
	 */
	protected static final Date RUN_SOLVING_ENDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunSolvingEnded() <em>Run Solving Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunSolvingEnded()
	 * @generated
	 * @ordered
	 */
	protected Date runSolvingEnded = RUN_SOLVING_ENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunFinalizationEnded() <em>Run Finalization Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunFinalizationEnded()
	 * @generated
	 * @ordered
	 */
	protected static final Date RUN_FINALIZATION_ENDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunFinalizationEnded() <em>Run Finalization Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunFinalizationEnded()
	 * @generated
	 * @ordered
	 */
	protected Date runFinalizationEnded = RUN_FINALIZATION_ENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunDurationInitialization() <em>Run Duration Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunDurationInitialization()
	 * @generated
	 * @ordered
	 */
	protected static final float RUN_DURATION_INITIALIZATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRunDurationInitialization() <em>Run Duration Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunDurationInitialization()
	 * @generated
	 * @ordered
	 */
	protected float runDurationInitialization = RUN_DURATION_INITIALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunDurationFinalization() <em>Run Duration Finalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunDurationFinalization()
	 * @generated
	 * @ordered
	 */
	protected static final float RUN_DURATION_FINALIZATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRunDurationFinalization() <em>Run Duration Finalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunDurationFinalization()
	 * @generated
	 * @ordered
	 */
	protected float runDurationFinalization = RUN_DURATION_FINALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunDurationSolving() <em>Run Duration Solving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunDurationSolving()
	 * @generated
	 * @ordered
	 */
	protected static final float RUN_DURATION_SOLVING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRunDurationSolving() <em>Run Duration Solving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunDurationSolving()
	 * @generated
	 * @ordered
	 */
	protected float runDurationSolving = RUN_DURATION_SOLVING_EDEFAULT;

	/**
	 * The default value of the '{@link #isRunRequestTerminate() <em>Run Request Terminate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunRequestTerminate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUN_REQUEST_TERMINATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunRequestTerminate() <em>Run Request Terminate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunRequestTerminate()
	 * @generated
	 * @ordered
	 */
	protected boolean runRequestTerminate = RUN_REQUEST_TERMINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSolUnfeasible() <em>Sol Unfeasible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolUnfeasible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOL_UNFEASIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSolUnfeasible() <em>Sol Unfeasible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolUnfeasible()
	 * @generated
	 * @ordered
	 */
	protected boolean solUnfeasible = SOL_UNFEASIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSolFeasible() <em>Sol Feasible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolFeasible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOL_FEASIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSolFeasible() <em>Sol Feasible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolFeasible()
	 * @generated
	 * @ordered
	 */
	protected boolean solFeasible = SOL_FEASIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSolOptimal() <em>Sol Optimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolOptimal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOL_OPTIMAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSolOptimal() <em>Sol Optimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolOptimal()
	 * @generated
	 * @ordered
	 */
	protected boolean solOptimal = SOL_OPTIMAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isRunInterrupted() <em>Run Interrupted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunInterrupted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUN_INTERRUPTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunInterrupted() <em>Run Interrupted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunInterrupted()
	 * @generated
	 * @ordered
	 */
	protected boolean runInterrupted = RUN_INTERRUPTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isSolving() <em>Solving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolving()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOLVING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSolving() <em>Solving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolving()
	 * @generated
	 * @ordered
	 */
	protected boolean solving = SOLVING_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinalizing() <em>Finalizing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalizing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINALIZING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinalizing() <em>Finalizing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalizing()
	 * @generated
	 * @ordered
	 */
	protected boolean finalizing = FINALIZING_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinished()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINISHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinished()
	 * @generated
	 * @ordered
	 */
	protected boolean finished = FINISHED_EDEFAULT;

	/**
	 * The default value of the '{@link #isRunTimeOut() <em>Run Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunTimeOut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUN_TIME_OUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunTimeOut() <em>Run Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunTimeOut()
	 * @generated
	 * @ordered
	 */
	protected boolean runTimeOut = RUN_TIME_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInitializing() <em>Initializing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitializing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitializing() <em>Initializing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitializing()
	 * @generated
	 * @ordered
	 */
	protected boolean initializing = INITIALIZING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGoalToSolve() <em>Goal To Solve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalToSolve()
	 * @generated
	 * @ordered
	 */
	protected GeneratorGoal goalToSolve;

	/**
	 * The cached value of the '{@link #getInitialSolution() <em>Initial Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialSolution()
	 * @generated
	 * @ordered
	 */
	protected Solution initialSolution;

	protected IProgressMonitor eMonitor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSolValue() {
		return solValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolValue(float newSolValue) {
		float oldSolValue = solValue;
		solValue = newSolValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOL_VALUE, oldSolValue, solValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunInterrupted() {
		return runInterrupted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunInterrupted(boolean newRunInterrupted) {
		boolean oldRunInterrupted = runInterrupted;
		runInterrupted = newRunInterrupted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_INTERRUPTED, oldRunInterrupted, runInterrupted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunTimeOut() {
		return runTimeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunTimeOut(boolean newRunTimeOut) {
		boolean oldRunTimeOut = runTimeOut;
		runTimeOut = newRunTimeOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_TIME_OUT, oldRunTimeOut, runTimeOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitializing() {
		return initializing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializing(boolean newInitializing) {
		boolean oldInitializing = initializing;
		initializing = newInitializing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__INITIALIZING, oldInitializing, initializing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorGoal getGoalToSolve() {
		if (goalToSolve != null && goalToSolve.eIsProxy()) {
			InternalEObject oldGoalToSolve = (InternalEObject)goalToSolve;
			goalToSolve = (GeneratorGoal)eResolveProxy(oldGoalToSolve);
			if (goalToSolve != oldGoalToSolve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLVER__GOAL_TO_SOLVE, oldGoalToSolve, goalToSolve));
			}
		}
		return goalToSolve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorGoal basicGetGoalToSolve() {
		return goalToSolve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalToSolve(GeneratorGoal newGoalToSolve) {
		GeneratorGoal oldGoalToSolve = goalToSolve;
		goalToSolve = newGoalToSolve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__GOAL_TO_SOLVE, oldGoalToSolve, goalToSolve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getInitialSolution() {
		if (initialSolution != null && initialSolution.eIsProxy()) {
			InternalEObject oldInitialSolution = (InternalEObject)initialSolution;
			initialSolution = (Solution)eResolveProxy(oldInitialSolution);
			if (initialSolution != oldInitialSolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLVER__INITIAL_SOLUTION, oldInitialSolution, initialSolution));
			}
		}
		return initialSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetInitialSolution() {
		return initialSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialSolution(Solution newInitialSolution) {
		Solution oldInitialSolution = initialSolution;
		initialSolution = newInitialSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__INITIAL_SOLUTION, oldInitialSolution, initialSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSolving() {
		return solving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolving(boolean newSolving) {
		boolean oldSolving = solving;
		solving = newSolving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOLVING, oldSolving, solving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinalizing() {
		return finalizing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalizing(boolean newFinalizing) {
		boolean oldFinalizing = finalizing;
		finalizing = newFinalizing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__FINALIZING, oldFinalizing, finalizing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinished() {
		return finished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinished(boolean newFinished) {
		boolean oldFinished = finished;
		finished = newFinished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__FINISHED, oldFinished, finished));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSolverMaxDuration() {
		return solverMaxDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverMaxDuration(float newSolverMaxDuration) {
		float oldSolverMaxDuration = solverMaxDuration;
		solverMaxDuration = newSolverMaxDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOLVER_MAX_DURATION, oldSolverMaxDuration, solverMaxDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSolverBackground() {
		return solverBackground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverBackground(boolean newSolverBackground) {
		boolean oldSolverBackground = solverBackground;
		solverBackground = newSolverBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOLVER_BACKGROUND, oldSolverBackground, solverBackground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumSolverLogLevel getSolverLogLevel() {
		return solverLogLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverLogLevel(EnumSolverLogLevel newSolverLogLevel) {
		EnumSolverLogLevel oldSolverLogLevel = solverLogLevel;
		solverLogLevel = newSolverLogLevel == null ? SOLVER_LOG_LEVEL_EDEFAULT : newSolverLogLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOLVER_LOG_LEVEL, oldSolverLogLevel, solverLogLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSolverDump() {
		return solverDump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverDump(boolean newSolverDump) {
		boolean oldSolverDump = solverDump;
		solverDump = newSolverDump;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOLVER_DUMP, oldSolverDump, solverDump));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRunStarted() {
		return runStarted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunStarted(Date newRunStarted) {
		Date oldRunStarted = runStarted;
		runStarted = newRunStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_STARTED, oldRunStarted, runStarted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRunInitializationEnded() {
		return runInitializationEnded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunInitializationEnded(Date newRunInitializationEnded) {
		Date oldRunInitializationEnded = runInitializationEnded;
		runInitializationEnded = newRunInitializationEnded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_INITIALIZATION_ENDED, oldRunInitializationEnded, runInitializationEnded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRunSolvingEnded() {
		return runSolvingEnded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunSolvingEnded(Date newRunSolvingEnded) {
		Date oldRunSolvingEnded = runSolvingEnded;
		runSolvingEnded = newRunSolvingEnded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_SOLVING_ENDED, oldRunSolvingEnded, runSolvingEnded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRunFinalizationEnded() {
		return runFinalizationEnded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunFinalizationEnded(Date newRunFinalizationEnded) {
		Date oldRunFinalizationEnded = runFinalizationEnded;
		runFinalizationEnded = newRunFinalizationEnded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_FINALIZATION_ENDED, oldRunFinalizationEnded, runFinalizationEnded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRunDurationInitialization() {
		return runDurationInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunDurationInitialization(float newRunDurationInitialization) {
		float oldRunDurationInitialization = runDurationInitialization;
		runDurationInitialization = newRunDurationInitialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_DURATION_INITIALIZATION, oldRunDurationInitialization, runDurationInitialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRunDurationFinalization() {
		return runDurationFinalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunDurationFinalization(float newRunDurationFinalization) {
		float oldRunDurationFinalization = runDurationFinalization;
		runDurationFinalization = newRunDurationFinalization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_DURATION_FINALIZATION, oldRunDurationFinalization, runDurationFinalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRunDurationSolving() {
		return runDurationSolving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunDurationSolving(float newRunDurationSolving) {
		float oldRunDurationSolving = runDurationSolving;
		runDurationSolving = newRunDurationSolving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_DURATION_SOLVING, oldRunDurationSolving, runDurationSolving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunRequestTerminate() {
		return runRequestTerminate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunRequestTerminate(boolean newRunRequestTerminate) {
		boolean oldRunRequestTerminate = runRequestTerminate;
		runRequestTerminate = newRunRequestTerminate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_REQUEST_TERMINATE, oldRunRequestTerminate, runRequestTerminate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSolUnfeasible() {
		return solUnfeasible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolUnfeasible(boolean newSolUnfeasible) {
		boolean oldSolUnfeasible = solUnfeasible;
		solUnfeasible = newSolUnfeasible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOL_UNFEASIBLE, oldSolUnfeasible, solUnfeasible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSolFeasible() {
		return solFeasible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolFeasible(boolean newSolFeasible) {
		boolean oldSolFeasible = solFeasible;
		solFeasible = newSolFeasible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOL_FEASIBLE, oldSolFeasible, solFeasible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSolOptimal() {
		return solOptimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolOptimal(boolean newSolOptimal) {
		boolean oldSolOptimal = solOptimal;
		solOptimal = newSolOptimal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOL_OPTIMAL, oldSolOptimal, solOptimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Start solving the problem
	 *   Implement the branch synchronous/asynchronous
	 * <!-- end-user-doc -->
	 */
	public void solve() {
		CommonPlugin.INSTANCE.log("ESolver.ESolve: called");
		Generator generator = this.getGenerator();
		
		if ( generator == null ) {
			CommonPlugin.INSTANCE.log("ESolver.ESolve: no generator set");
		}
		else  {
			this.setRunRequestTerminate(false);
			if ( this.isSolverBackground() ){
				  Job job = new Job("LP Solver in Background") {
					     protected IStatus run(IProgressMonitor monitor) {
					    	    eMonitor = monitor;
					    	    monitor.beginTask("Initialization", 100);
			  					CommonPlugin.INSTANCE.log("ESolver.ESolve: job started");
			  					SolverImpl.this.solveRun();
								eMonitor = null;
					            return Status.OK_STATUS;
					        }
					     };  // class Job
				  job.setPriority(Job.SHORT);
				  job.setUser(true);
				  job.setSystem(false);
				  CommonPlugin.INSTANCE.log("Solver: job submitted");
				  job.schedule(); // start as soon as possible			}
			}
			else {
				this.solveRun();
			} // synchronous
		    CommonPlugin.INSTANCE.log("Solver: finished");
		}
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * Implement the whole flow of a solving run
	 *   Make a copy of the run if already started, 
	 * <!-- end-user-doc -->
	 */
	private void solveRun(){
		if ( this.isInitializing() ){
			// solver already started
			// create a copy and reset its status
			EcoreUtil.Copier solverCopier = new EcoreUtil.Copier(){
				@Override
				protected void copyContainment(EReference eReference,
                         					   EObject eObject, 
                         					   EObject copyEObject) {
					if ( eReference==SolverPackage.Literals.SOLUTION_PROVIDER__SOLUTION ){ return; }
					super.copyContainment(eReference, eObject, copyEObject);
				}
			};
			SolverImpl newSolver = (SolverImpl) solverCopier.copy(this);
			solverCopier.copyReferences();
			EObject thisContainer = this.eContainer();
			EStructuralFeature containingFeature = this.eContainingFeature();
			if ( containingFeature.isMany()){
				newSolver.resetStatus();
				newSolver.setCode(this.getCode()+" (copy)");
				EList containedObjects = (EList) thisContainer.eGet(containingFeature);
				containedObjects.add(newSolver);
			}
		} 
		else {
			this.onStarted();
			this.solveSolver();
			this.onFinalizationEnd();
		}
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * To be implemented by the concrete solver to solver the linear formulation
	 * <!-- end-user-doc -->
	 */
	protected void solveSolver(){
		throw new UnsupportedOperationException();
		
	}

	
	private Date eLastMonitoredFeedback;
	private static int eMonitorRefreshRateMillis = 100;
	
	private void refreshStatus(){
		String status = "";
		if ( this.isFinished()){
			if ( this.isSolOptimal()){
				status = "Finished(optimal)";
			}
			else if ( this.isSolFeasible()){
				status = "Finished(feasible)";
			}
			else if ( this.isSolUnfeasible()){
				status = "Finished(unfeasible)";
			}
			else {
				status = "Finished(undecided)";
			}
		}
		else if ( this.isFinalizing()){
			status = "Finalizing";
		}
		else if ( this.isSolving()){
			status = "Solving";
		}
		else if ( this.isInitializing()){
			status = "Initializing";
		}
		this.setStatus(status);
	}
	
	private void resetStatus(){
		this.setInitializing(false);
		this.setSolving     (false); 
		this.setFinalizing  (false); 
		this.setFinished    (false);
		this.setRunDurationInitialization(0.0f);
		this.setRunDurationSolving(0.0f);
		this.setRunDurationFinalization(0.0f);
		this.setRunStarted(null);
		this.setRunInitializationEnded(null);
		this.setRunSolvingEnded(null);
		this.setRunFinalizationEnded(null);
		this.setRunInterrupted(false);
		this.setRunTimeOut(false);
		this.eLastMonitoredFeedback=null;
		this.setSolFeasible(false);
		this.setSolUnfeasible(false);
		this.setSolOptimal(false);
		this.setSolValue(0.0f);
		this.refreshStatus();
	}

	protected void onStarted() {
		if ( eMonitor!= null ){ 
			eMonitor.setTaskName("initializing");
			eMonitor.worked(0);
		}
		CommonPlugin.INSTANCE.log("Solver: STARTED");
		Date currenttime = new Date();
		this.setRunStarted(currenttime);
		this.setInitializing(true);
		this.refreshStatus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Called when initialization is finished
	 * <!-- end-user-doc -->
	 */
	protected void onInitializationEnd() {
		if ( !this.isInitializing() ){
			this.onStarted();
		}
		if ( eMonitor!= null ){ 
			eMonitor.setTaskName("solving");
			eMonitor.worked(0);
		}
		CommonPlugin.INSTANCE.log("Solver: INITIALIZED");
		Date currenttime = new Date();
		this.setRunInitializationEnded(currenttime);
		float duration = (currenttime.getTime()-this.getRunStarted().getTime())/1000.0f;
		this.setRunDurationInitialization(duration);
		this.setSolving(true);
		this.refreshStatus();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void onSolvingEnd() {
		if ( !this.isSolving()){
			this.onInitializationEnd();
		}
		if ( eMonitor!= null )		{ 
			eMonitor.setTaskName("finalizing");
			eMonitor.worked(100);
		}
		CommonPlugin.INSTANCE.log("Solver: SOLVED");
		Date currenttime = new Date();
		this.setRunSolvingEnded(currenttime);
		float duration = (currenttime.getTime()-this.getRunInitializationEnded().getTime())/1000.0f;
		this.setRunDurationSolving(duration);
		this.setFinalizing(true);
		this.refreshStatus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Called when finalization is finished
	 * <!-- end-user-doc -->
	 */
	protected void onFinalizationEnd() {
		if ( !this.isFinalizing()){
			this.onSolvingEnd();
		}
		if ( eMonitor!= null )	{ 
			eMonitor.setTaskName("finished");
			eMonitor.worked(100);
		}
		CommonPlugin.INSTANCE.log("Solver: FINISHED");
		Date currenttime = new Date();
		this.setRunFinalizationEnded(currenttime);
		float duration = (currenttime.getTime()-this.getRunSolvingEnded().getTime())/1000.0f;
		this.setRunDurationFinalization(duration);
		this.setFinished(true);
		this.refreshStatus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Called when the solver return some feedback
	 * <!-- end-user-doc -->
	 */
	protected void onSolverFeedback(String TreeFootprint, String Progress, float OptimalityGap, float BestValue, boolean Feasible) {
		String valueasstring = Feasible ? String.format("%1$8.2f", BestValue) : "unfeasible";
        String feedback = String.format("phase %1$s, gap %3$4.2f, value %4$s (%2$s)", Progress, TreeFootprint, OptimalityGap, valueasstring); 
		if ( eMonitor!= null )	{
			// task
			Date currenttime = new Date();
			if ( this.eLastMonitoredFeedback == null 
			 || currenttime.getTime()-eLastMonitoredFeedback.getTime()>eMonitorRefreshRateMillis) {
				eLastMonitoredFeedback = currenttime;
				long duration = (currenttime.getTime()-this.getRunInitializationEnded().getTime())/1000;
		        String task = String.format("%1$05d: %2$s", duration, feedback); // duration five digits zero padded 
				eMonitor.setTaskName(task);
				// work
				int work = (int)(100*(1.0f-OptimalityGap));
				eMonitor.worked(work);
				if ( eMonitor.isCanceled())				{
					this.setRunRequestTerminate(true);
				}
			}
		}
		else {
			//CommonPlugin.INSTANCE.log("ESolver.ESolve: "+feedback);
		}
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public IGeneratorTool getParentGeneratorTool() {
		EObject parent = this.eContainer();
		if ( parent instanceof IGeneratorTool ) {
			return (IGeneratorTool)parent;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Generator getGenerator() {
		EObject parent = this.eContainer();
		if ( parent instanceof IGeneratorTool ) {
			return ((IGeneratorTool)parent).getGenerator();
		}
		else if ( parent instanceof Generator){
			return (Generator)parent;
		}
		return null;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLVER__REMARKS:
				return getRemarks();
			case SolverPackage.SOLVER__STATUS:
				return getStatus();
			case SolverPackage.SOLVER__SOLVER_MAX_DURATION:
				return getSolverMaxDuration();
			case SolverPackage.SOLVER__SOLVER_BACKGROUND:
				return isSolverBackground();
			case SolverPackage.SOLVER__SOL_VALUE:
				return getSolValue();
			case SolverPackage.SOLVER__SOLVER_LOG_LEVEL:
				return getSolverLogLevel();
			case SolverPackage.SOLVER__SOLVER_DUMP:
				return isSolverDump();
			case SolverPackage.SOLVER__RUN_STARTED:
				return getRunStarted();
			case SolverPackage.SOLVER__RUN_INITIALIZATION_ENDED:
				return getRunInitializationEnded();
			case SolverPackage.SOLVER__RUN_SOLVING_ENDED:
				return getRunSolvingEnded();
			case SolverPackage.SOLVER__RUN_FINALIZATION_ENDED:
				return getRunFinalizationEnded();
			case SolverPackage.SOLVER__RUN_DURATION_INITIALIZATION:
				return getRunDurationInitialization();
			case SolverPackage.SOLVER__RUN_DURATION_FINALIZATION:
				return getRunDurationFinalization();
			case SolverPackage.SOLVER__RUN_DURATION_SOLVING:
				return getRunDurationSolving();
			case SolverPackage.SOLVER__RUN_REQUEST_TERMINATE:
				return isRunRequestTerminate();
			case SolverPackage.SOLVER__SOL_UNFEASIBLE:
				return isSolUnfeasible();
			case SolverPackage.SOLVER__SOL_FEASIBLE:
				return isSolFeasible();
			case SolverPackage.SOLVER__SOL_OPTIMAL:
				return isSolOptimal();
			case SolverPackage.SOLVER__RUN_INTERRUPTED:
				return isRunInterrupted();
			case SolverPackage.SOLVER__SOLVING:
				return isSolving();
			case SolverPackage.SOLVER__FINALIZING:
				return isFinalizing();
			case SolverPackage.SOLVER__FINISHED:
				return isFinished();
			case SolverPackage.SOLVER__RUN_TIME_OUT:
				return isRunTimeOut();
			case SolverPackage.SOLVER__INITIALIZING:
				return isInitializing();
			case SolverPackage.SOLVER__GOAL_TO_SOLVE:
				if (resolve) return getGoalToSolve();
				return basicGetGoalToSolve();
			case SolverPackage.SOLVER__INITIAL_SOLUTION:
				if (resolve) return getInitialSolution();
				return basicGetInitialSolution();
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
			case SolverPackage.SOLVER__REMARKS:
				setRemarks((String)newValue);
				return;
			case SolverPackage.SOLVER__STATUS:
				setStatus((String)newValue);
				return;
			case SolverPackage.SOLVER__SOLVER_MAX_DURATION:
				setSolverMaxDuration((Float)newValue);
				return;
			case SolverPackage.SOLVER__SOLVER_BACKGROUND:
				setSolverBackground((Boolean)newValue);
				return;
			case SolverPackage.SOLVER__SOL_VALUE:
				setSolValue((Float)newValue);
				return;
			case SolverPackage.SOLVER__SOLVER_LOG_LEVEL:
				setSolverLogLevel((EnumSolverLogLevel)newValue);
				return;
			case SolverPackage.SOLVER__SOLVER_DUMP:
				setSolverDump((Boolean)newValue);
				return;
			case SolverPackage.SOLVER__RUN_STARTED:
				setRunStarted((Date)newValue);
				return;
			case SolverPackage.SOLVER__RUN_INITIALIZATION_ENDED:
				setRunInitializationEnded((Date)newValue);
				return;
			case SolverPackage.SOLVER__RUN_SOLVING_ENDED:
				setRunSolvingEnded((Date)newValue);
				return;
			case SolverPackage.SOLVER__RUN_FINALIZATION_ENDED:
				setRunFinalizationEnded((Date)newValue);
				return;
			case SolverPackage.SOLVER__RUN_DURATION_INITIALIZATION:
				setRunDurationInitialization((Float)newValue);
				return;
			case SolverPackage.SOLVER__RUN_DURATION_FINALIZATION:
				setRunDurationFinalization((Float)newValue);
				return;
			case SolverPackage.SOLVER__RUN_DURATION_SOLVING:
				setRunDurationSolving((Float)newValue);
				return;
			case SolverPackage.SOLVER__RUN_REQUEST_TERMINATE:
				setRunRequestTerminate((Boolean)newValue);
				return;
			case SolverPackage.SOLVER__SOL_UNFEASIBLE:
				setSolUnfeasible((Boolean)newValue);
				return;
			case SolverPackage.SOLVER__SOL_FEASIBLE:
				setSolFeasible((Boolean)newValue);
				return;
			case SolverPackage.SOLVER__SOL_OPTIMAL:
				setSolOptimal((Boolean)newValue);
				return;
			case SolverPackage.SOLVER__RUN_INTERRUPTED:
				setRunInterrupted((Boolean)newValue);
				return;
			case SolverPackage.SOLVER__SOLVING:
				setSolving((Boolean)newValue);
				return;
			case SolverPackage.SOLVER__FINALIZING:
				setFinalizing((Boolean)newValue);
				return;
			case SolverPackage.SOLVER__FINISHED:
				setFinished((Boolean)newValue);
				return;
			case SolverPackage.SOLVER__RUN_TIME_OUT:
				setRunTimeOut((Boolean)newValue);
				return;
			case SolverPackage.SOLVER__INITIALIZING:
				setInitializing((Boolean)newValue);
				return;
			case SolverPackage.SOLVER__GOAL_TO_SOLVE:
				setGoalToSolve((GeneratorGoal)newValue);
				return;
			case SolverPackage.SOLVER__INITIAL_SOLUTION:
				setInitialSolution((Solution)newValue);
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
			case SolverPackage.SOLVER__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case SolverPackage.SOLVER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case SolverPackage.SOLVER__SOLVER_MAX_DURATION:
				setSolverMaxDuration(SOLVER_MAX_DURATION_EDEFAULT);
				return;
			case SolverPackage.SOLVER__SOLVER_BACKGROUND:
				setSolverBackground(SOLVER_BACKGROUND_EDEFAULT);
				return;
			case SolverPackage.SOLVER__SOL_VALUE:
				setSolValue(SOL_VALUE_EDEFAULT);
				return;
			case SolverPackage.SOLVER__SOLVER_LOG_LEVEL:
				setSolverLogLevel(SOLVER_LOG_LEVEL_EDEFAULT);
				return;
			case SolverPackage.SOLVER__SOLVER_DUMP:
				setSolverDump(SOLVER_DUMP_EDEFAULT);
				return;
			case SolverPackage.SOLVER__RUN_STARTED:
				setRunStarted(RUN_STARTED_EDEFAULT);
				return;
			case SolverPackage.SOLVER__RUN_INITIALIZATION_ENDED:
				setRunInitializationEnded(RUN_INITIALIZATION_ENDED_EDEFAULT);
				return;
			case SolverPackage.SOLVER__RUN_SOLVING_ENDED:
				setRunSolvingEnded(RUN_SOLVING_ENDED_EDEFAULT);
				return;
			case SolverPackage.SOLVER__RUN_FINALIZATION_ENDED:
				setRunFinalizationEnded(RUN_FINALIZATION_ENDED_EDEFAULT);
				return;
			case SolverPackage.SOLVER__RUN_DURATION_INITIALIZATION:
				setRunDurationInitialization(RUN_DURATION_INITIALIZATION_EDEFAULT);
				return;
			case SolverPackage.SOLVER__RUN_DURATION_FINALIZATION:
				setRunDurationFinalization(RUN_DURATION_FINALIZATION_EDEFAULT);
				return;
			case SolverPackage.SOLVER__RUN_DURATION_SOLVING:
				setRunDurationSolving(RUN_DURATION_SOLVING_EDEFAULT);
				return;
			case SolverPackage.SOLVER__RUN_REQUEST_TERMINATE:
				setRunRequestTerminate(RUN_REQUEST_TERMINATE_EDEFAULT);
				return;
			case SolverPackage.SOLVER__SOL_UNFEASIBLE:
				setSolUnfeasible(SOL_UNFEASIBLE_EDEFAULT);
				return;
			case SolverPackage.SOLVER__SOL_FEASIBLE:
				setSolFeasible(SOL_FEASIBLE_EDEFAULT);
				return;
			case SolverPackage.SOLVER__SOL_OPTIMAL:
				setSolOptimal(SOL_OPTIMAL_EDEFAULT);
				return;
			case SolverPackage.SOLVER__RUN_INTERRUPTED:
				setRunInterrupted(RUN_INTERRUPTED_EDEFAULT);
				return;
			case SolverPackage.SOLVER__SOLVING:
				setSolving(SOLVING_EDEFAULT);
				return;
			case SolverPackage.SOLVER__FINALIZING:
				setFinalizing(FINALIZING_EDEFAULT);
				return;
			case SolverPackage.SOLVER__FINISHED:
				setFinished(FINISHED_EDEFAULT);
				return;
			case SolverPackage.SOLVER__RUN_TIME_OUT:
				setRunTimeOut(RUN_TIME_OUT_EDEFAULT);
				return;
			case SolverPackage.SOLVER__INITIALIZING:
				setInitializing(INITIALIZING_EDEFAULT);
				return;
			case SolverPackage.SOLVER__GOAL_TO_SOLVE:
				setGoalToSolve((GeneratorGoal)null);
				return;
			case SolverPackage.SOLVER__INITIAL_SOLUTION:
				setInitialSolution((Solution)null);
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
			case SolverPackage.SOLVER__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case SolverPackage.SOLVER__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case SolverPackage.SOLVER__SOLVER_MAX_DURATION:
				return solverMaxDuration != SOLVER_MAX_DURATION_EDEFAULT;
			case SolverPackage.SOLVER__SOLVER_BACKGROUND:
				return solverBackground != SOLVER_BACKGROUND_EDEFAULT;
			case SolverPackage.SOLVER__SOL_VALUE:
				return solValue != SOL_VALUE_EDEFAULT;
			case SolverPackage.SOLVER__SOLVER_LOG_LEVEL:
				return solverLogLevel != SOLVER_LOG_LEVEL_EDEFAULT;
			case SolverPackage.SOLVER__SOLVER_DUMP:
				return solverDump != SOLVER_DUMP_EDEFAULT;
			case SolverPackage.SOLVER__RUN_STARTED:
				return RUN_STARTED_EDEFAULT == null ? runStarted != null : !RUN_STARTED_EDEFAULT.equals(runStarted);
			case SolverPackage.SOLVER__RUN_INITIALIZATION_ENDED:
				return RUN_INITIALIZATION_ENDED_EDEFAULT == null ? runInitializationEnded != null : !RUN_INITIALIZATION_ENDED_EDEFAULT.equals(runInitializationEnded);
			case SolverPackage.SOLVER__RUN_SOLVING_ENDED:
				return RUN_SOLVING_ENDED_EDEFAULT == null ? runSolvingEnded != null : !RUN_SOLVING_ENDED_EDEFAULT.equals(runSolvingEnded);
			case SolverPackage.SOLVER__RUN_FINALIZATION_ENDED:
				return RUN_FINALIZATION_ENDED_EDEFAULT == null ? runFinalizationEnded != null : !RUN_FINALIZATION_ENDED_EDEFAULT.equals(runFinalizationEnded);
			case SolverPackage.SOLVER__RUN_DURATION_INITIALIZATION:
				return runDurationInitialization != RUN_DURATION_INITIALIZATION_EDEFAULT;
			case SolverPackage.SOLVER__RUN_DURATION_FINALIZATION:
				return runDurationFinalization != RUN_DURATION_FINALIZATION_EDEFAULT;
			case SolverPackage.SOLVER__RUN_DURATION_SOLVING:
				return runDurationSolving != RUN_DURATION_SOLVING_EDEFAULT;
			case SolverPackage.SOLVER__RUN_REQUEST_TERMINATE:
				return runRequestTerminate != RUN_REQUEST_TERMINATE_EDEFAULT;
			case SolverPackage.SOLVER__SOL_UNFEASIBLE:
				return solUnfeasible != SOL_UNFEASIBLE_EDEFAULT;
			case SolverPackage.SOLVER__SOL_FEASIBLE:
				return solFeasible != SOL_FEASIBLE_EDEFAULT;
			case SolverPackage.SOLVER__SOL_OPTIMAL:
				return solOptimal != SOL_OPTIMAL_EDEFAULT;
			case SolverPackage.SOLVER__RUN_INTERRUPTED:
				return runInterrupted != RUN_INTERRUPTED_EDEFAULT;
			case SolverPackage.SOLVER__SOLVING:
				return solving != SOLVING_EDEFAULT;
			case SolverPackage.SOLVER__FINALIZING:
				return finalizing != FINALIZING_EDEFAULT;
			case SolverPackage.SOLVER__FINISHED:
				return finished != FINISHED_EDEFAULT;
			case SolverPackage.SOLVER__RUN_TIME_OUT:
				return runTimeOut != RUN_TIME_OUT_EDEFAULT;
			case SolverPackage.SOLVER__INITIALIZING:
				return initializing != INITIALIZING_EDEFAULT;
			case SolverPackage.SOLVER__GOAL_TO_SOLVE:
				return goalToSolve != null;
			case SolverPackage.SOLVER__INITIAL_SOLUTION:
				return initialSolution != null;
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
			case SolverPackage.SOLVER___SOLVE:
				solve();
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
		result.append(" (Remarks: ");
		result.append(remarks);
		result.append(", Status: ");
		result.append(status);
		result.append(", SolverMaxDuration: ");
		result.append(solverMaxDuration);
		result.append(", SolverBackground: ");
		result.append(solverBackground);
		result.append(", SolValue: ");
		result.append(solValue);
		result.append(", SolverLogLevel: ");
		result.append(solverLogLevel);
		result.append(", SolverDump: ");
		result.append(solverDump);
		result.append(", RunStarted: ");
		result.append(runStarted);
		result.append(", RunInitializationEnded: ");
		result.append(runInitializationEnded);
		result.append(", RunSolvingEnded: ");
		result.append(runSolvingEnded);
		result.append(", RunFinalizationEnded: ");
		result.append(runFinalizationEnded);
		result.append(", RunDurationInitialization: ");
		result.append(runDurationInitialization);
		result.append(", RunDurationFinalization: ");
		result.append(runDurationFinalization);
		result.append(", RunDurationSolving: ");
		result.append(runDurationSolving);
		result.append(", RunRequestTerminate: ");
		result.append(runRequestTerminate);
		result.append(", SolUnfeasible: ");
		result.append(solUnfeasible);
		result.append(", SolFeasible: ");
		result.append(solFeasible);
		result.append(", SolOptimal: ");
		result.append(solOptimal);
		result.append(", RunInterrupted: ");
		result.append(runInterrupted);
		result.append(", Solving: ");
		result.append(solving);
		result.append(", Finalizing: ");
		result.append(finalizing);
		result.append(", Finished: ");
		result.append(finished);
		result.append(", RunTimeOut: ");
		result.append(runTimeOut);
		result.append(", Initializing: ");
		result.append(initializing);
		result.append(')');
		return result.toString();
	}

	

} //SolverImpl
