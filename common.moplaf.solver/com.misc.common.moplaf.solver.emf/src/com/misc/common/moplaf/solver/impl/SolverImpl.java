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
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.RunContext;
import com.misc.common.moplaf.solver.EnumLpConsType;
import com.misc.common.moplaf.solver.EnumLpVarType;
import com.misc.common.moplaf.solver.EnumObjectiveType;
import com.misc.common.moplaf.solver.EnumSolverLogLevel;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorCons;
import com.misc.common.moplaf.solver.GeneratorElement;
import com.misc.common.moplaf.solver.GeneratorGoal;
import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.GeneratorLpLinear;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorLpVarBinder;
import com.misc.common.moplaf.solver.GeneratorLpVarBinderToSolution;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.GeneratorVarBinder;
import com.misc.common.moplaf.solver.IGeneratorTool;
import com.misc.common.moplaf.solver.ITupleVisitor;
import com.misc.common.moplaf.solver.Plugin;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionGoal;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.SolverGeneratorGoal;
import com.misc.common.moplaf.solver.SolverGoal;
import com.misc.common.moplaf.solver.SolverPackage;

import com.misc.common.moplaf.solver.SolverParams;
import com.misc.common.moplaf.solver.SolverVarBinder;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolverMaxDuration() <em>Solver Max Duration</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSolverMaxDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double SOLVER_MAX_DURATION_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getSolverMaxDuration() <em>Solver Max Duration</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSolverMaxDuration()
	 * @generated
	 * @ordered
	 */
	protected double solverMaxDuration = SOLVER_MAX_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolverLogLevel() <em>Solver Log Level</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSolverLogLevel()
	 * @generated
	 * @ordered
	 */
	protected static final EnumSolverLogLevel SOLVER_LOG_LEVEL_EDEFAULT = EnumSolverLogLevel.ENUM_NORMAL;

	/**
	 * The cached value of the '{@link #getSolverLogLevel() <em>Solver Log Level</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSolverLogLevel()
	 * @generated
	 * @ordered
	 */
	protected EnumSolverLogLevel solverLogLevel = SOLVER_LOG_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isSolverDump() <em>Solver Dump</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSolverDump()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOLVER_DUMP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSolverDump() <em>Solver Dump</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSolverDump()
	 * @generated
	 * @ordered
	 */
	protected boolean solverDump = SOLVER_DUMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunStarted() <em>Run Started</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRunStarted()
	 * @generated
	 * @ordered
	 */
	protected static final Date RUN_STARTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunStarted() <em>Run Started</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRunStarted()
	 * @generated
	 * @ordered
	 */
	protected Date runStarted = RUN_STARTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunInitializationEnded() <em>Run Initialization Ended</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRunInitializationEnded()
	 * @generated
	 * @ordered
	 */
	protected static final Date RUN_INITIALIZATION_ENDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunInitializationEnded() <em>Run Initialization Ended</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRunInitializationEnded()
	 * @generated
	 * @ordered
	 */
	protected Date runInitializationEnded = RUN_INITIALIZATION_ENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunSolvingEnded() <em>Run Solving Ended</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRunSolvingEnded()
	 * @generated
	 * @ordered
	 */
	protected static final Date RUN_SOLVING_ENDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunSolvingEnded() <em>Run Solving Ended</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRunSolvingEnded()
	 * @generated
	 * @ordered
	 */
	protected Date runSolvingEnded = RUN_SOLVING_ENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunFinalizationEnded() <em>Run Finalization Ended</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRunFinalizationEnded()
	 * @generated
	 * @ordered
	 */
	protected static final Date RUN_FINALIZATION_ENDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunFinalizationEnded() <em>Run Finalization Ended</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRunFinalizationEnded()
	 * @generated
	 * @ordered
	 */
	protected Date runFinalizationEnded = RUN_FINALIZATION_ENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunDurationInitialization() <em>Run Duration Initialization</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRunDurationInitialization()
	 * @generated
	 * @ordered
	 */
	protected static final double RUN_DURATION_INITIALIZATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRunDurationInitialization() <em>Run Duration Initialization</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRunDurationInitialization()
	 * @generated
	 * @ordered
	 */
	protected double runDurationInitialization = RUN_DURATION_INITIALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunDurationFinalization() <em>Run Duration Finalization</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRunDurationFinalization()
	 * @generated
	 * @ordered
	 */
	protected static final double RUN_DURATION_FINALIZATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRunDurationFinalization() <em>Run Duration Finalization</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRunDurationFinalization()
	 * @generated
	 * @ordered
	 */
	protected double runDurationFinalization = RUN_DURATION_FINALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunDurationSolving() <em>Run Duration Solving</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRunDurationSolving()
	 * @generated
	 * @ordered
	 */
	protected static final double RUN_DURATION_SOLVING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRunDurationSolving() <em>Run Duration Solving</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRunDurationSolving()
	 * @generated
	 * @ordered
	 */
	protected double runDurationSolving = RUN_DURATION_SOLVING_EDEFAULT;

	/**
	 * The default value of the '{@link #isRunRequestTerminate() <em>Run Request Terminate</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRunRequestTerminate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUN_REQUEST_TERMINATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunRequestTerminate() <em>Run Request Terminate</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRunRequestTerminate()
	 * @generated
	 * @ordered
	 */
	protected boolean runRequestTerminate = RUN_REQUEST_TERMINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRunTimeOut() <em>Run Time Out</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRunTimeOut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUN_TIME_OUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunTimeOut() <em>Run Time Out</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRunTimeOut()
	 * @generated
	 * @ordered
	 */
	protected boolean runTimeOut = RUN_TIME_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSolUnfeasible() <em>Sol
	 * Unfeasible</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isSolUnfeasible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOL_UNFEASIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSolUnfeasible() <em>Sol
	 * Unfeasible</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isSolUnfeasible()
	 * @generated
	 * @ordered
	 */
	protected boolean solUnfeasible = SOL_UNFEASIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSolFeasible() <em>Sol Feasible</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSolFeasible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOL_FEASIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSolFeasible() <em>Sol Feasible</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSolFeasible()
	 * @generated
	 * @ordered
	 */
	protected boolean solFeasible = SOL_FEASIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSolOptimal() <em>Sol Optimal</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSolOptimal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOL_OPTIMAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSolOptimal() <em>Sol Optimal</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSolOptimal()
	 * @generated
	 * @ordered
	 */
	protected boolean solOptimal = SOL_OPTIMAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolValue() <em>Sol Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSolValue()
	 * @generated
	 * @ordered
	 */
	protected static final float SOL_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSolValue() <em>Sol Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSolValue()
	 * @generated
	 * @ordered
	 */
	protected float solValue = SOL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRunInterrupted() <em>Run
	 * Interrupted</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isRunInterrupted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUN_INTERRUPTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunInterrupted() <em>Run
	 * Interrupted</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isRunInterrupted()
	 * @generated
	 * @ordered
	 */
	protected boolean runInterrupted = RUN_INTERRUPTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isInitializing() <em>Initializing</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isInitializing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitializing() <em>Initializing</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isInitializing()
	 * @generated
	 * @ordered
	 */
	protected boolean initializing = INITIALIZING_EDEFAULT;

	/**
	 * The default value of the '{@link #isSolving() <em>Solving</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSolving()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOLVING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSolving() <em>Solving</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSolving()
	 * @generated
	 * @ordered
	 */
	protected boolean solving = SOLVING_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinalizing() <em>Finalizing</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isFinalizing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINALIZING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinalizing() <em>Finalizing</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isFinalizing()
	 * @generated
	 * @ordered
	 */
	protected boolean finalizing = FINALIZING_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isFinished()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINISHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isFinished()
	 * @generated
	 * @ordered
	 */
	protected boolean finished = FINISHED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitialSolution() <em>Initial Solution</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInitialSolution()
	 * @generated
	 * @ordered
	 */
	protected Solution initialSolution;

	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<SolverGoal> goals;

	/**
	 * The cached value of the '{@link #getVarBinders() <em>Var Binders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarBinders()
	 * @generated
	 * @ordered
	 */
	protected EList<SolverVarBinder> varBinders;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.SOLVER__INITIAL_SOLUTION:
				if (initialSolution != null)
					msgs = ((InternalEObject)initialSolution).eInverseRemove(this, SolverPackage.SOLUTION__SOLVER_AS_INITIAL_SOLUTION, Solution.class, msgs);
				return basicSetInitialSolution((Solution)otherEnd, msgs);
			case SolverPackage.SOLVER__GOALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGoals()).basicAdd(otherEnd, msgs);
			case SolverPackage.SOLVER__VAR_BINDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVarBinders()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.SOLVER__INITIAL_SOLUTION:
				return basicSetInitialSolution(null, msgs);
			case SolverPackage.SOLVER__GOALS:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
			case SolverPackage.SOLVER__VAR_BINDERS:
				return ((InternalEList<?>)getVarBinders()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public float getSolValue() {
		return solValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolValue(float newSolValue) {
		float oldSolValue = solValue;
		solValue = newSolValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOL_VALUE, oldSolValue, solValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunInterrupted() {
		return runInterrupted;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunInterrupted(boolean newRunInterrupted) {
		boolean oldRunInterrupted = runInterrupted;
		runInterrupted = newRunInterrupted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_INTERRUPTED, oldRunInterrupted, runInterrupted));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunTimeOut() {
		return runTimeOut;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunTimeOut(boolean newRunTimeOut) {
		boolean oldRunTimeOut = runTimeOut;
		runTimeOut = newRunTimeOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_TIME_OUT, oldRunTimeOut, runTimeOut));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitializing() {
		return initializing;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializing(boolean newInitializing) {
		boolean oldInitializing = initializing;
		initializing = newInitializing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__INITIALIZING, oldInitializing, initializing));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetInitialSolution() {
		return initialSolution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialSolution(Solution newInitialSolution, NotificationChain msgs) {
		Solution oldInitialSolution = initialSolution;
		initialSolution = newInitialSolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__INITIAL_SOLUTION, oldInitialSolution, newInitialSolution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialSolution(Solution newInitialSolution) {
		if (newInitialSolution != initialSolution) {
			NotificationChain msgs = null;
			if (initialSolution != null)
				msgs = ((InternalEObject)initialSolution).eInverseRemove(this, SolverPackage.SOLUTION__SOLVER_AS_INITIAL_SOLUTION, Solution.class, msgs);
			if (newInitialSolution != null)
				msgs = ((InternalEObject)newInitialSolution).eInverseAdd(this, SolverPackage.SOLUTION__SOLVER_AS_INITIAL_SOLUTION, Solution.class, msgs);
			msgs = basicSetInitialSolution(newInitialSolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__INITIAL_SOLUTION, newInitialSolution, newInitialSolution));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolverGoal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentWithInverseEList<SolverGoal>(SolverGoal.class, this, SolverPackage.SOLVER__GOALS, SolverPackage.SOLVER_GOAL__SOLVER);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolverVarBinder> getVarBinders() {
		if (varBinders == null) {
			varBinders = new EObjectContainmentWithInverseEList<SolverVarBinder>(SolverVarBinder.class, this, SolverPackage.SOLVER__VAR_BINDERS, SolverPackage.SOLVER_VAR_BINDER__SOLVER);
		}
		return varBinders;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSolving() {
		return solving;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolving(boolean newSolving) {
		boolean oldSolving = solving;
		solving = newSolving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOLVING, oldSolving, solving));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinalizing() {
		return finalizing;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalizing(boolean newFinalizing) {
		boolean oldFinalizing = finalizing;
		finalizing = newFinalizing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__FINALIZING, oldFinalizing, finalizing));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinished() {
		return finished;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinished(boolean newFinished) {
		boolean oldFinished = finished;
		finished = newFinished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__FINISHED, oldFinished, finished));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getSolverMaxDuration() {
		return solverMaxDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverMaxDuration(double newSolverMaxDuration) {
		double oldSolverMaxDuration = solverMaxDuration;
		solverMaxDuration = newSolverMaxDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOLVER_MAX_DURATION, oldSolverMaxDuration, solverMaxDuration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EnumSolverLogLevel getSolverLogLevel() {
		return solverLogLevel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverLogLevel(EnumSolverLogLevel newSolverLogLevel) {
		EnumSolverLogLevel oldSolverLogLevel = solverLogLevel;
		solverLogLevel = newSolverLogLevel == null ? SOLVER_LOG_LEVEL_EDEFAULT : newSolverLogLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOLVER_LOG_LEVEL, oldSolverLogLevel, solverLogLevel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSolverDump() {
		return solverDump;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverDump(boolean newSolverDump) {
		boolean oldSolverDump = solverDump;
		solverDump = newSolverDump;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOLVER_DUMP, oldSolverDump, solverDump));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRunStarted() {
		return runStarted;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunStarted(Date newRunStarted) {
		Date oldRunStarted = runStarted;
		runStarted = newRunStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_STARTED, oldRunStarted, runStarted));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRunInitializationEnded() {
		return runInitializationEnded;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunInitializationEnded(Date newRunInitializationEnded) {
		Date oldRunInitializationEnded = runInitializationEnded;
		runInitializationEnded = newRunInitializationEnded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_INITIALIZATION_ENDED, oldRunInitializationEnded, runInitializationEnded));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRunSolvingEnded() {
		return runSolvingEnded;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunSolvingEnded(Date newRunSolvingEnded) {
		Date oldRunSolvingEnded = runSolvingEnded;
		runSolvingEnded = newRunSolvingEnded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_SOLVING_ENDED, oldRunSolvingEnded, runSolvingEnded));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRunFinalizationEnded() {
		return runFinalizationEnded;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunFinalizationEnded(Date newRunFinalizationEnded) {
		Date oldRunFinalizationEnded = runFinalizationEnded;
		runFinalizationEnded = newRunFinalizationEnded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_FINALIZATION_ENDED, oldRunFinalizationEnded, runFinalizationEnded));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getRunDurationInitialization() {
		return runDurationInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunDurationInitialization(double newRunDurationInitialization) {
		double oldRunDurationInitialization = runDurationInitialization;
		runDurationInitialization = newRunDurationInitialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_DURATION_INITIALIZATION, oldRunDurationInitialization, runDurationInitialization));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getRunDurationFinalization() {
		return runDurationFinalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunDurationFinalization(double newRunDurationFinalization) {
		double oldRunDurationFinalization = runDurationFinalization;
		runDurationFinalization = newRunDurationFinalization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_DURATION_FINALIZATION, oldRunDurationFinalization, runDurationFinalization));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getRunDurationSolving() {
		return runDurationSolving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunDurationSolving(double newRunDurationSolving) {
		double oldRunDurationSolving = runDurationSolving;
		runDurationSolving = newRunDurationSolving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_DURATION_SOLVING, oldRunDurationSolving, runDurationSolving));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunRequestTerminate() {
		return runRequestTerminate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunRequestTerminate(boolean newRunRequestTerminate) {
		boolean oldRunRequestTerminate = runRequestTerminate;
		runRequestTerminate = newRunRequestTerminate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__RUN_REQUEST_TERMINATE, oldRunRequestTerminate, runRequestTerminate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSolUnfeasible() {
		return solUnfeasible;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolUnfeasible(boolean newSolUnfeasible) {
		boolean oldSolUnfeasible = solUnfeasible;
		solUnfeasible = newSolUnfeasible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOL_UNFEASIBLE, oldSolUnfeasible, solUnfeasible));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSolFeasible() {
		return solFeasible;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolFeasible(boolean newSolFeasible) {
		boolean oldSolFeasible = solFeasible;
		solFeasible = newSolFeasible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOL_FEASIBLE, oldSolFeasible, solFeasible));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSolOptimal() {
		return solOptimal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolOptimal(boolean newSolOptimal) {
		boolean oldSolOptimal = solOptimal;
		solOptimal = newSolOptimal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__SOL_OPTIMAL, oldSolOptimal, solOptimal));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void buildVar(GeneratorVar var) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Called by the framework for every {@link GeneratorLpVar} to be added to the solver.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void buildLpVar(GeneratorLpVar var, double lowerBound, double upperBound, EnumLpVarType type) throws Exception {
		this.buildLpVarImpl(var, lowerBound, upperBound, type);
	}

	/**
	 * Method to be overriden by a concrete LpSolver for adding a var to the concrete solver.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected void buildLpVarImpl(GeneratorLpVar var, double lowerBound, double upperBound, EnumLpVarType type) throws Exception {
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Method called by the concrete solver when loading the model. Specify the vars to be loaded.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void buildVars() throws Exception {
		Generator generator = this.getGenerator();
		// gather the var binders
		HashMap<GeneratorVar, SolverVarBinder> binders = new HashMap<GeneratorVar, SolverVarBinder>();
		for ( SolverVarBinder var_binder : this.getVarBinders()){
			for ( GeneratorVar var : var_binder.getVarBinder().getBoundVars()){
				binders.put(var, var_binder);
			}
		}
		// build the vars
		class VarMapper implements ITupleVisitor {
			private HashMap<GeneratorVar, SolverVarBinder> binders = null;
			public VarMapper(HashMap<GeneratorVar, SolverVarBinder> binders) {
				super();
				this.binders = binders;
			}
			@Override
			public void visitTuple(GeneratorTuple tuple) throws Exception {
				for (GeneratorVar var : tuple.getVar()) {
					SolverVarBinder var_binder = this.binders.get(var);
					var.build(SolverImpl.this, var_binder);
				} // traverse the vars of the tuple
			} // method visitTuple
		}
		; // VarMapper
		VarMapper varmapper = new VarMapper(binders);
		generator.visitTuples(varmapper);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void buildCons(GeneratorCons cons) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Called by the framework for every {@link GeneratorLpCons} to be added to the solver.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void buildLpCons(GeneratorLpCons cons) throws Exception {
		this.buildLpCons(cons, cons, cons.getRighHandSide(), cons.getType());
	}

	/**
	 * Called by the framework for every constraints to be added to the solver. These constraints
	 * can be explicit constraint {@link GeneratorLpCons} or constraint induced by goal {@link GeneratorLpGoal}. 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void buildLpCons(GeneratorElement element, GeneratorLpLinear linear, double rhs, EnumLpConsType type)
			throws Exception {
//		if (element instanceof GeneratorLpGoal) {
//			this.generatorGoalsToConstraint.add((GeneratorGoal) element);
//		}
		this.buildLpConsImpl(element, linear, rhs, type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void constructVarBinder(GeneratorVarBinder binder) {
		SolverVarBinder solver_binder = null;
		if ( binder instanceof GeneratorLpVarBinderToSolution){
			solver_binder = SolverFactory.eINSTANCE.createSolverLpVarBinderToSolution();
		} else if ( binder instanceof GeneratorLpVarBinder){
			solver_binder = SolverFactory.eINSTANCE.createSolverLpVarBinderToValue();
		} else {
			throw new UnsupportedOperationException();
		}
		solver_binder.setVarBinder(binder);
		this.getVarBinders().add(solver_binder);
	}

	/**
	 * Method to be overriden by a concrete LpSolver for adding a constraint to the concrete solver.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected void buildLpConsImpl(GeneratorElement element, GeneratorLpLinear linear, double rhs, EnumLpConsType type)
			throws Exception {
		// to be overloaded
		throw new UnsupportedOperationException();
	}

	/**
	 * Called by the framework for every {@link GeneratorCons} to be added to the solver.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void buildCons() throws Exception {
		// build the normal constraints
		Generator generator = this.getGenerator();
		class ConsMapper implements ITupleVisitor {
			@Override
			public void visitTuple(GeneratorTuple tuple) throws Exception {
				for (GeneratorCons cons : tuple.getCons()) {
					cons.build(SolverImpl.this);
				}
			}
		}
		; // class ConsMapper
		ConsMapper consmapper = new ConsMapper();
		generator.visitTuples(consmapper);
	}

	/**
	 * Method called by the framework to add a contribution to the objective function.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void buildLpGoal(GeneratorLpGoal goal, double weight) throws Exception {
//		this.generatorGoalsToSolve.add(goal);
		
		for ( GeneratorLpTerm goalTerm : goal.getLpTerm()){
			GeneratorLpVar lpvar = goalTerm.getLpVar();
			double coefficient = goalTerm.getCoeff()*weight;
			if ( goal.getObjectiveType()==EnumObjectiveType.MAXIMUM){
				coefficient = - coefficient;
			}
			if ( coefficient!=0.0f){
				Double valueAsIs = this.objectiveTerms.get(lpvar);
				double valueToBe = coefficient + (valueAsIs==null ? 0.0f : valueAsIs);
				this.objectiveTerms.put(lpvar, valueToBe);
			}
		}
	}

	/**
	 * Method to be overriden by the concrete solver to add a contribution to the objective function.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected void buildLpGoalTermImpl(GeneratorLpVar var, double coefficient) throws Exception {
		throw new UnsupportedOperationException();
	}

	private Map<GeneratorLpVar, Double> objectiveTerms = null;

	/**
	 * Method called by the concrete solver while building the solver model.
	 * Delegate the building of the goals to the {@link SolverGoal}s
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void buildGoals() throws Exception {
		this.objectiveTerms = new HashMap<GeneratorLpVar, Double>();
		// build the constraints implied by previous solvers and the goal
		for (SolverGoal goal : this.getGoals()) {
			goal.buildGoal();
		}
		for ( Entry<GeneratorLpVar, Double> objectiveTerm : objectiveTerms.entrySet()){
			double coefficient = objectiveTerm.getValue();
			GeneratorLpVar var = objectiveTerm.getKey();
			if ( coefficient!=0.0f){
				this.buildLpGoalTermImpl(var, coefficient);
			}
		}
		this.objectiveTerms = null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public SolverGeneratorGoal constructSolverGoal(GeneratorGoal goal) {
		SolverGeneratorGoal newGoal = SolverFactory.eINSTANCE.createSolverGeneratorGoal();
		newGoal.setGoalToSolve(goal);
		this.getGoals().add(newGoal);
		return newGoal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void constructSolverGoal(Solution previousSolution) {
		if ( previousSolution!=null){
			for ( SolutionGoal solution_goal : previousSolution.getGoals()){
				solution_goal.constructGoal(this);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void constructSolverGoal(Solver previousSolver) {
		Solution previousSolution = null;
		if (previousSolver.getSolution().size() > 0) {
			previousSolution = previousSolver.getSolution().get(0);
			this.constructSolverGoal(previousSolution);
		}
	}

	/**
	 * Method called by the concrete implementation of {@link SolverImpl#solveImpl()}, when 
	 * handling a solution found, if any.
	 * <p>
	 * Traverse the {@link GeneratorGoal} and create {@link SolutionGoal} accordingly.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void makeSolutionGoals(Solution solution) {
		Generator generator = this.getGenerator();
		for (GeneratorGoal goal : generator.getGoals()) {
			// construct the solution goal and initialize it with the solution value
			SolutionGoal solutionGoal = solution.constructSolutionGoal(goal);
			// look up the solver goal
			for ( SolverGoal solverGoal : this.getGoals()){
				if ( solverGoal instanceof SolverGeneratorGoal ){
					SolverGeneratorGoal solverGeneratorGoal = (SolverGeneratorGoal)solverGoal;
					if ( goal == solverGeneratorGoal.getGoalToSolve()){
						if ( solverGeneratorGoal.isConstraint()){
							double goalBound = solverGeneratorGoal.getGoalBound();
							solutionGoal.setBound(goalBound);
							solutionGoal.setConstrained(true);
						}
						if ( solverGeneratorGoal.isOptimize()){
							solutionGoal.setOptimized(true);
						}
						break; // stop traversing the solver goals
					}
				}
			} // traverse the solver goals to retrieve the current generator goal
		}
	}


	/**
	 * <!-- begin-user-doc --> Release all the references to this Solver <!--
	 * end-user-doc -->
	 */
	@Override
	public void dispose() {
		super.dispose();
		// goal to solve
		// this.getGoalsToSolve().clear();
		this.setInitialSolution(null);
		// dispose solutions
		for (Solution solution : this.getSolution()) {
			solution.dispose();
		}

//		this.generatorGoalsToConstraint = null;
//		this.generatorGoalsToSolve = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.misc.common.moplaf.common.impl.RunImpl#getRunFeedback()
	 */
	@Override
	public EnabledFeedback getRunFeedback() {
		if ( this.isFinished()){
			return new EnabledFeedback(false, "finished");
		} else if ( this.isFinalizing()){
			return new EnabledFeedback(false, "finalizing");
		} else if ( this.isSolving()){
			return new EnabledFeedback(false, "solving");
		} else if (this.isInitializing()) {
			return new EnabledFeedback(false, "initializing");
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.misc.common.moplaf.common.impl.RunImpl#runImpl()
	 */
	@Override
	protected ReturnFeedback runImpl(RunContext runContext) {
		return this.solve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Implement the whole flow of a solving run
	 *   Make a copy of the run if already started, 
	 * Start solving the problem
	 * <!-- end-user-doc -->
	 */
	public ReturnFeedback solve() {
		Plugin.INSTANCE.logInfo("solve called");
		Generator generator = this.getGenerator();
		
		if ( generator == null ) {
			Plugin.INSTANCE.logError("solve, no generator set");
			return new ReturnFeedback(false, "Solver.solve: no generator", "");
		} 
			
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
			// copy the solver
			SolverImpl newSolver = (SolverImpl) solverCopier.copy(this);
			solverCopier.copyReferences();
			newSolver.resetStatus();
			newSolver.setCode(this.getCode()+" (copy)");
			
			// owns the new solver
			EObject thisContainer = this.eContainer();
			EStructuralFeature containingFeature = this.eContainingFeature();
			if ( containingFeature.isMany()){
				EList containedObjects = (EList) thisContainer.eGet(containingFeature);
				containedObjects.add(newSolver);
			}
			return ReturnFeedback.SUCCESS;
		} 
		else {
			Plugin.INSTANCE.logInfo("solve Started");
			this.onStarted();
			ReturnFeedback feedback = this.solveImpl();
			this.onFinalizationEnd();
			Plugin.INSTANCE.logInfo("solve finished");
			return feedback;
		}
	}

	/**
	 * <!-- begin-user-doc --> To be implemented by the concrete solver to
	 * solver the linear formulation <!-- end-user-doc -->
	 */
	protected ReturnFeedback solveImpl() {
		throw new UnsupportedOperationException();
	}

//	/**
//	 * Remember the goals to optimize.
//	 * This will be used when building the solution, that is in method {@link #makeSolutionGoals(Solution)}
//	 */
//	private HashSet<GeneratorGoal> generatorGoalsToSolve = new HashSet<GeneratorGoal>();
//
//	/**
//	 * Remember the goals used as constraint.
//	 * This will be used when building the solution, that is in method {@link #makeSolutionGoals(Solution)}
//	 */
//	private HashSet<GeneratorGoal> generatorGoalsToConstraint = new HashSet<GeneratorGoal>();

	private Date eLastMonitoredFeedback;
	private static int eMonitorRefreshRateMillis = 100;

	private void refreshStatus() {
		String status = "";
		if (this.isFinished()) {
			if (this.isSolOptimal()) {
				status = "Finished(optimal)";
			} else if (this.isSolFeasible()) {
				status = "Finished(feasible)";
			} else if (this.isSolUnfeasible()) {
				status = "Finished(unfeasible)";
			} else {
				status = "Finished(undecided)";
			}
		} else if (this.isFinalizing()) {
			status = "Finalizing";
		} else if (this.isSolving()) {
			status = "Solving";
		} else if (this.isInitializing()) {
			status = "Initializing";
		}
		this.setStatus(status);
	}

	protected void resetStatus() {
		this.setInitializing(false);
		this.setSolving(false);
		this.setFinalizing(false);
		this.setFinished(false);
		this.setRunDurationInitialization(0.0f);
		this.setRunDurationSolving(0.0f);
		this.setRunDurationFinalization(0.0f);
		this.setRunStarted(null);
		this.setRunInitializationEnded(null);
		this.setRunSolvingEnded(null);
		this.setRunFinalizationEnded(null);
		this.setRunInterrupted(false);
		this.setRunTimeOut(false);
		this.eLastMonitoredFeedback = null;
		this.setSolFeasible(false);
		this.setSolUnfeasible(false);
		this.setSolOptimal(false);
		this.setSolValue(0.0f);
		this.refreshStatus();
	}

	protected void onStarted() {
		// if ( eMonitor!= null ){
		// eMonitor.setTaskName("initializing");
		// eMonitor.worked(0);
		// }
		Plugin.INSTANCE.logInfo("STARTED");
		Date currenttime = new Date();
		this.setRunStarted(currenttime);
		this.setInitializing(true);
		this.refreshStatus();
	}

	/**
	 * <!-- begin-user-doc --> Called when initialization is finished <!--
	 * end-user-doc -->
	 */
	protected void onInitializationEnd() {
		if (!this.isInitializing()) {
			this.onStarted();
		}
		// if ( eMonitor!= null ){
		// eMonitor.setTaskName("solving");
		// eMonitor.worked(0);
		// }
		Plugin.INSTANCE.logInfo("INITIALIZED");
		Date currenttime = new Date();
		this.setRunInitializationEnded(currenttime);
		float duration = (currenttime.getTime() - this.getRunStarted().getTime()) / 1000.0f;
		this.setRunDurationInitialization(duration);
		this.setSolving(true);
		this.refreshStatus();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected void onSolvingEnd() {
		if (!this.isSolving()) {
			this.onInitializationEnd();
		}
		// if ( eMonitor!= null ) {
		// eMonitor.setTaskName("finalizing");
		// eMonitor.worked(100);
		// }
		Plugin.INSTANCE.logInfo("SOLVED");
		Date currenttime = new Date();
		this.setRunSolvingEnded(currenttime);
		float duration = (currenttime.getTime() - this.getRunInitializationEnded().getTime()) / 1000.0f;
		this.setRunDurationSolving(duration);
		this.setFinalizing(true);
		this.refreshStatus();
	}

	/**
	 * <!-- begin-user-doc --> Called when finalization is finished <!--
	 * end-user-doc -->
	 */
	protected void onFinalizationEnd() {
		if (!this.isFinalizing()) {
			this.onSolvingEnd();
		}
		// if ( eMonitor!= null ) {
		// eMonitor.setTaskName("finished");
		// eMonitor.worked(100);
		// }
		Plugin.INSTANCE.logInfo("FINISHED");
		Date currenttime = new Date();
		this.setRunFinalizationEnded(currenttime);
		float duration = (currenttime.getTime() - this.getRunSolvingEnded().getTime()) / 1000.0f;
		this.setRunDurationFinalization(duration);
		this.setFinished(true);
		this.refreshStatus();
	}

	/**
	 * <!-- begin-user-doc --> Called when the solver return some feedback <!--
	 * end-user-doc -->
	 */
	protected void onSolverFeedback(String TreeFootprint, String Progress, float OptimalityGap, float BestValue,
			boolean Feasible) {
		String valueasstring = Feasible ? String.format("%1$8.2f", BestValue) : "unfeasible";
		String feedback = String.format("phase %1$s, gap %3$4.2f, value %4$s (%2$s)", Progress, TreeFootprint,
				OptimalityGap, valueasstring);
		Date currenttime = new Date();
		boolean goOn = true;
		if (this.eLastMonitoredFeedback == null
				|| currenttime.getTime() - eLastMonitoredFeedback.getTime() > eMonitorRefreshRateMillis) {
			eLastMonitoredFeedback = currenttime;
			long duration = (currenttime.getTime() - this.getRunInitializationEnded().getTime()) / 1000;
			String task = String.format("%1$05d: %2$s", duration, feedback); // duration
																				// five
																				// digits
																				// zero
																				// padded
			// work
			int work = (int) (100 * (1.0f - OptimalityGap));
			String message = String.format("Progress %s %d", task, work);
			Plugin.INSTANCE.logInfo(message);
			goOn = this.setProgress(task, work);
		}
		if (!goOn) {
			this.setRunRequestTerminate(true);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public IGeneratorTool getParentGeneratorTool() {
		EObject parent = this.eContainer();
		if (parent instanceof IGeneratorTool) {
			return (IGeneratorTool) parent;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public Generator getGenerator() {
		EObject parent = this.eContainer();
		if (parent instanceof Generator) {
			return (Generator) parent;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLVER__REMARKS:
				return getRemarks();
			case SolverPackage.SOLVER__SOLVER_MAX_DURATION:
				return getSolverMaxDuration();
			case SolverPackage.SOLVER__STATUS:
				return getStatus();
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
			case SolverPackage.SOLVER__RUN_TIME_OUT:
				return isRunTimeOut();
			case SolverPackage.SOLVER__SOL_UNFEASIBLE:
				return isSolUnfeasible();
			case SolverPackage.SOLVER__SOL_FEASIBLE:
				return isSolFeasible();
			case SolverPackage.SOLVER__SOL_OPTIMAL:
				return isSolOptimal();
			case SolverPackage.SOLVER__SOL_VALUE:
				return getSolValue();
			case SolverPackage.SOLVER__RUN_INTERRUPTED:
				return isRunInterrupted();
			case SolverPackage.SOLVER__INITIALIZING:
				return isInitializing();
			case SolverPackage.SOLVER__SOLVING:
				return isSolving();
			case SolverPackage.SOLVER__FINALIZING:
				return isFinalizing();
			case SolverPackage.SOLVER__FINISHED:
				return isFinished();
			case SolverPackage.SOLVER__INITIAL_SOLUTION:
				if (resolve) return getInitialSolution();
				return basicGetInitialSolution();
			case SolverPackage.SOLVER__GOALS:
				return getGoals();
			case SolverPackage.SOLVER__VAR_BINDERS:
				return getVarBinders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolverPackage.SOLVER__REMARKS:
				setRemarks((String)newValue);
				return;
			case SolverPackage.SOLVER__SOLVER_MAX_DURATION:
				setSolverMaxDuration((Double)newValue);
				return;
			case SolverPackage.SOLVER__STATUS:
				setStatus((String)newValue);
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
				setRunDurationInitialization((Double)newValue);
				return;
			case SolverPackage.SOLVER__RUN_DURATION_FINALIZATION:
				setRunDurationFinalization((Double)newValue);
				return;
			case SolverPackage.SOLVER__RUN_DURATION_SOLVING:
				setRunDurationSolving((Double)newValue);
				return;
			case SolverPackage.SOLVER__RUN_REQUEST_TERMINATE:
				setRunRequestTerminate((Boolean)newValue);
				return;
			case SolverPackage.SOLVER__RUN_TIME_OUT:
				setRunTimeOut((Boolean)newValue);
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
			case SolverPackage.SOLVER__SOL_VALUE:
				setSolValue((Float)newValue);
				return;
			case SolverPackage.SOLVER__RUN_INTERRUPTED:
				setRunInterrupted((Boolean)newValue);
				return;
			case SolverPackage.SOLVER__INITIALIZING:
				setInitializing((Boolean)newValue);
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
			case SolverPackage.SOLVER__INITIAL_SOLUTION:
				setInitialSolution((Solution)newValue);
				return;
			case SolverPackage.SOLVER__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends SolverGoal>)newValue);
				return;
			case SolverPackage.SOLVER__VAR_BINDERS:
				getVarBinders().clear();
				getVarBinders().addAll((Collection<? extends SolverVarBinder>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SolverPackage.SOLVER__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case SolverPackage.SOLVER__SOLVER_MAX_DURATION:
				setSolverMaxDuration(SOLVER_MAX_DURATION_EDEFAULT);
				return;
			case SolverPackage.SOLVER__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case SolverPackage.SOLVER__RUN_TIME_OUT:
				setRunTimeOut(RUN_TIME_OUT_EDEFAULT);
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
			case SolverPackage.SOLVER__SOL_VALUE:
				setSolValue(SOL_VALUE_EDEFAULT);
				return;
			case SolverPackage.SOLVER__RUN_INTERRUPTED:
				setRunInterrupted(RUN_INTERRUPTED_EDEFAULT);
				return;
			case SolverPackage.SOLVER__INITIALIZING:
				setInitializing(INITIALIZING_EDEFAULT);
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
			case SolverPackage.SOLVER__INITIAL_SOLUTION:
				setInitialSolution((Solution)null);
				return;
			case SolverPackage.SOLVER__GOALS:
				getGoals().clear();
				return;
			case SolverPackage.SOLVER__VAR_BINDERS:
				getVarBinders().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SolverPackage.SOLVER__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case SolverPackage.SOLVER__SOLVER_MAX_DURATION:
				return solverMaxDuration != SOLVER_MAX_DURATION_EDEFAULT;
			case SolverPackage.SOLVER__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
			case SolverPackage.SOLVER__RUN_TIME_OUT:
				return runTimeOut != RUN_TIME_OUT_EDEFAULT;
			case SolverPackage.SOLVER__SOL_UNFEASIBLE:
				return solUnfeasible != SOL_UNFEASIBLE_EDEFAULT;
			case SolverPackage.SOLVER__SOL_FEASIBLE:
				return solFeasible != SOL_FEASIBLE_EDEFAULT;
			case SolverPackage.SOLVER__SOL_OPTIMAL:
				return solOptimal != SOL_OPTIMAL_EDEFAULT;
			case SolverPackage.SOLVER__SOL_VALUE:
				return solValue != SOL_VALUE_EDEFAULT;
			case SolverPackage.SOLVER__RUN_INTERRUPTED:
				return runInterrupted != RUN_INTERRUPTED_EDEFAULT;
			case SolverPackage.SOLVER__INITIALIZING:
				return initializing != INITIALIZING_EDEFAULT;
			case SolverPackage.SOLVER__SOLVING:
				return solving != SOLVING_EDEFAULT;
			case SolverPackage.SOLVER__FINALIZING:
				return finalizing != FINALIZING_EDEFAULT;
			case SolverPackage.SOLVER__FINISHED:
				return finished != FINISHED_EDEFAULT;
			case SolverPackage.SOLVER__INITIAL_SOLUTION:
				return initialSolution != null;
			case SolverPackage.SOLVER__GOALS:
				return goals != null && !goals.isEmpty();
			case SolverPackage.SOLVER__VAR_BINDERS:
				return varBinders != null && !varBinders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SolverParams.class) {
			switch (derivedFeatureID) {
				case SolverPackage.SOLVER__REMARKS: return SolverPackage.SOLVER_PARAMS__REMARKS;
				case SolverPackage.SOLVER__SOLVER_MAX_DURATION: return SolverPackage.SOLVER_PARAMS__SOLVER_MAX_DURATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SolverParams.class) {
			switch (baseFeatureID) {
				case SolverPackage.SOLVER_PARAMS__REMARKS: return SolverPackage.SOLVER__REMARKS;
				case SolverPackage.SOLVER_PARAMS__SOLVER_MAX_DURATION: return SolverPackage.SOLVER__SOLVER_MAX_DURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SolverPackage.SOLVER___SOLVE:
				return solve();
			case SolverPackage.SOLVER___BUILD_VARS:
				try {
					buildVars();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.SOLVER___BUILD_VAR__GENERATORVAR:
				try {
					buildVar((GeneratorVar)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.SOLVER___BUILD_LP_VAR__GENERATORLPVAR_DOUBLE_DOUBLE_ENUMLPVARTYPE:
				try {
					buildLpVar((GeneratorLpVar)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (EnumLpVarType)arguments.get(3));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.SOLVER___BUILD_CONS:
				try {
					buildCons();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.SOLVER___BUILD_CONS__GENERATORCONS:
				try {
					buildCons((GeneratorCons)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.SOLVER___BUILD_LP_CONS__GENERATORLPCONS:
				try {
					buildLpCons((GeneratorLpCons)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.SOLVER___BUILD_LP_CONS__GENERATORELEMENT_GENERATORLPLINEAR_DOUBLE_ENUMLPCONSTYPE:
				try {
					buildLpCons((GeneratorElement)arguments.get(0), (GeneratorLpLinear)arguments.get(1), (Double)arguments.get(2), (EnumLpConsType)arguments.get(3));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.SOLVER___CONSTRUCT_VAR_BINDER__GENERATORVARBINDER:
				constructVarBinder((GeneratorVarBinder)arguments.get(0));
				return null;
			case SolverPackage.SOLVER___BUILD_GOALS:
				try {
					buildGoals();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.SOLVER___BUILD_LP_GOAL__GENERATORLPGOAL_DOUBLE:
				try {
					buildLpGoal((GeneratorLpGoal)arguments.get(0), (Double)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.SOLVER___CONSTRUCT_SOLVER_GOAL__GENERATORGOAL:
				return constructSolverGoal((GeneratorGoal)arguments.get(0));
			case SolverPackage.SOLVER___CONSTRUCT_SOLVER_GOAL__SOLUTION:
				constructSolverGoal((Solution)arguments.get(0));
				return null;
			case SolverPackage.SOLVER___CONSTRUCT_SOLVER_GOAL__SOLVER:
				constructSolverGoal((Solver)arguments.get(0));
				return null;
			case SolverPackage.SOLVER___MAKE_SOLUTION_GOALS__SOLUTION:
				makeSolutionGoals((Solution)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Remarks: ");
		result.append(remarks);
		result.append(", SolverMaxDuration: ");
		result.append(solverMaxDuration);
		result.append(", Status: ");
		result.append(status);
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
		result.append(", RunTimeOut: ");
		result.append(runTimeOut);
		result.append(", SolUnfeasible: ");
		result.append(solUnfeasible);
		result.append(", SolFeasible: ");
		result.append(solFeasible);
		result.append(", SolOptimal: ");
		result.append(solOptimal);
		result.append(", SolValue: ");
		result.append(solValue);
		result.append(", RunInterrupted: ");
		result.append(runInterrupted);
		result.append(", Initializing: ");
		result.append(initializing);
		result.append(", Solving: ");
		result.append(solving);
		result.append(", Finalizing: ");
		result.append(finalizing);
		result.append(", Finished: ");
		result.append(finished);
		result.append(')');
		return result.toString();
	}

} // SolverImpl
