/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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
package com.misc.common.moplaf.solver.solverglpk;

import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.solverglpk.SolverglpkFactory
 * @model kind="package"
 * @generated
 */
public interface SolverglpkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "solverglpk";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/solver/glpk/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "svrgl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverglpkPackage eINSTANCE = com.misc.common.moplaf.solver.solverglpk.impl.SolverglpkPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKImpl <em>Solver GLPK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKImpl
	 * @see com.misc.common.moplaf.solver.solverglpk.impl.SolverglpkPackageImpl#getSolverGLPK()
	 * @generated
	 */
	int SOLVER_GLPK = 0;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RUN_FEEDBACK = SolverPackage.SOLVER_LP__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__CANCEL_FEEDBACK = SolverPackage.SOLVER_LP__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RESET_FEEDBACK = SolverPackage.SOLVER_LP__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__LABEL = SolverPackage.SOLVER_LP__LABEL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__CANCELLED = SolverPackage.SOLVER_LP__CANCELLED;

	/**
	 * The feature id for the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RETURNED = SolverPackage.SOLVER_LP__RETURNED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RETURN_SUCCESS = SolverPackage.SOLVER_LP__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RETURN_FEEDBACK = SolverPackage.SOLVER_LP__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RETURN_INFORMATION = SolverPackage.SOLVER_LP__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__CODE = SolverPackage.SOLVER_LP__CODE;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__SOLUTION = SolverPackage.SOLVER_LP__SOLUTION;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__CURRENT_SOLUTION_NR = SolverPackage.SOLVER_LP__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__REMARKS = SolverPackage.SOLVER_LP__REMARKS;

	/**
	 * The feature id for the '<em><b>Solver Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__SOLVER_MAX_DURATION = SolverPackage.SOLVER_LP__SOLVER_MAX_DURATION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__STATUS = SolverPackage.SOLVER_LP__STATUS;

	/**
	 * The feature id for the '<em><b>Solver Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__SOLVER_LOG_LEVEL = SolverPackage.SOLVER_LP__SOLVER_LOG_LEVEL;

	/**
	 * The feature id for the '<em><b>Solver Dump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__SOLVER_DUMP = SolverPackage.SOLVER_LP__SOLVER_DUMP;

	/**
	 * The feature id for the '<em><b>Run Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RUN_STARTED = SolverPackage.SOLVER_LP__RUN_STARTED;

	/**
	 * The feature id for the '<em><b>Run Initialization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RUN_INITIALIZATION_ENDED = SolverPackage.SOLVER_LP__RUN_INITIALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Solving Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RUN_SOLVING_ENDED = SolverPackage.SOLVER_LP__RUN_SOLVING_ENDED;

	/**
	 * The feature id for the '<em><b>Run Finalization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RUN_FINALIZATION_ENDED = SolverPackage.SOLVER_LP__RUN_FINALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Duration Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RUN_DURATION_INITIALIZATION = SolverPackage.SOLVER_LP__RUN_DURATION_INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Finalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RUN_DURATION_FINALIZATION = SolverPackage.SOLVER_LP__RUN_DURATION_FINALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RUN_DURATION_SOLVING = SolverPackage.SOLVER_LP__RUN_DURATION_SOLVING;

	/**
	 * The feature id for the '<em><b>Run Request Terminate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RUN_REQUEST_TERMINATE = SolverPackage.SOLVER_LP__RUN_REQUEST_TERMINATE;

	/**
	 * The feature id for the '<em><b>Run Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RUN_TIME_OUT = SolverPackage.SOLVER_LP__RUN_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Sol Unfeasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__SOL_UNFEASIBLE = SolverPackage.SOLVER_LP__SOL_UNFEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Feasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__SOL_FEASIBLE = SolverPackage.SOLVER_LP__SOL_FEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Optimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__SOL_OPTIMAL = SolverPackage.SOLVER_LP__SOL_OPTIMAL;

	/**
	 * The feature id for the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__SOL_VALUE = SolverPackage.SOLVER_LP__SOL_VALUE;

	/**
	 * The feature id for the '<em><b>Run Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__RUN_INTERRUPTED = SolverPackage.SOLVER_LP__RUN_INTERRUPTED;

	/**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__INITIALIZING = SolverPackage.SOLVER_LP__INITIALIZING;

	/**
	 * The feature id for the '<em><b>Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__SOLVING = SolverPackage.SOLVER_LP__SOLVING;

	/**
	 * The feature id for the '<em><b>Finalizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__FINALIZING = SolverPackage.SOLVER_LP__FINALIZING;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__FINISHED = SolverPackage.SOLVER_LP__FINISHED;

	/**
	 * The feature id for the '<em><b>Initial Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__INITIAL_SOLUTION = SolverPackage.SOLVER_LP__INITIAL_SOLUTION;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__GOALS = SolverPackage.SOLVER_LP__GOALS;

	/**
	 * The feature id for the '<em><b>Var Binders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__VAR_BINDERS = SolverPackage.SOLVER_LP__VAR_BINDERS;

	/**
	 * The feature id for the '<em><b>Solver Optimality Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__SOLVER_OPTIMALITY_TOLERANCE = SolverPackage.SOLVER_LP__SOLVER_OPTIMALITY_TOLERANCE;

	/**
	 * The feature id for the '<em><b>Solver Linear Relaxation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__SOLVER_LINEAR_RELAXATION = SolverPackage.SOLVER_LP__SOLVER_LINEAR_RELAXATION;

	/**
	 * The feature id for the '<em><b>Sol Optimality Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__SOL_OPTIMALITY_GAP = SolverPackage.SOLVER_LP__SOL_OPTIMALITY_GAP;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__FILE_PATH = SolverPackage.SOLVER_LP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__FILE_FORMAT = SolverPackage.SOLVER_LP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Compressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__FILE_COMPRESSED = SolverPackage.SOLVER_LP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable Presolve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__ENABLE_PRESOLVE = SolverPackage.SOLVER_LP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enable Feasibility Pump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__ENABLE_FEASIBILITY_PUMP = SolverPackage.SOLVER_LP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enable Gomory Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__ENABLE_GOMORY_CUTS = SolverPackage.SOLVER_LP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Enable Generating Clique Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__ENABLE_GENERATING_CLIQUE_CUTS = SolverPackage.SOLVER_LP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Enable Generating Mixed Cover Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__ENABLE_GENERATING_MIXED_COVER_CUTS = SolverPackage.SOLVER_LP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Enable Mixed Integer Rounding Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK__ENABLE_MIXED_INTEGER_ROUNDING_CUTS = SolverPackage.SOLVER_LP_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Solver GLPK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_FEATURE_COUNT = SolverPackage.SOLVER_LP_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___COPY_PARAMS__RUNPARAMS = SolverPackage.SOLVER_LP___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___RESET = SolverPackage.SOLVER_LP___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___RUN = SolverPackage.SOLVER_LP___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___RUN__RUNCONTEXT = SolverPackage.SOLVER_LP___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___RUN_ASYNCH__RUNCONTEXT = SolverPackage.SOLVER_LP___RUN_ASYNCH__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___RUN_ASYNCH__RUNCONTEXT_BOOLEAN = SolverPackage.SOLVER_LP___RUN_ASYNCH__RUNCONTEXT_BOOLEAN;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___CANCEL = SolverPackage.SOLVER_LP___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___SET_PROGRESS__STRING_FLOAT = SolverPackage.SOLVER_LP___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___SET_PROGRESS__PROGRESSFEEDBACK = SolverPackage.SOLVER_LP___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___SET_RETURN__RETURNFEEDBACK = SolverPackage.SOLVER_LP___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___GET_RETURN = SolverPackage.SOLVER_LP___GET_RETURN;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___CONSTRUCT_PARAMS = SolverPackage.SOLVER_LP___CONSTRUCT_PARAMS;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___GET_GENERATOR = SolverPackage.SOLVER_LP___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___DISPOSE = SolverPackage.SOLVER_LP___DISPOSE;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___SOLUTION_FACTORY = SolverPackage.SOLVER_LP___SOLUTION_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___CONSTRUCT_SOLUTION = SolverPackage.SOLVER_LP___CONSTRUCT_SOLUTION;

	/**
	 * The operation id for the '<em>Solve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___SOLVE = SolverPackage.SOLVER_LP___SOLVE;

	/**
	 * The operation id for the '<em>Build Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___BUILD_VARS = SolverPackage.SOLVER_LP___BUILD_VARS;

	/**
	 * The operation id for the '<em>Build Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___BUILD_VAR__GENERATORVAR = SolverPackage.SOLVER_LP___BUILD_VAR__GENERATORVAR;

	/**
	 * The operation id for the '<em>Build Lp Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___BUILD_LP_VAR__GENERATORLPVAR_DOUBLE_DOUBLE_ENUMLPVARTYPE = SolverPackage.SOLVER_LP___BUILD_LP_VAR__GENERATORLPVAR_DOUBLE_DOUBLE_ENUMLPVARTYPE;

	/**
	 * The operation id for the '<em>Build Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___BUILD_CONS = SolverPackage.SOLVER_LP___BUILD_CONS;

	/**
	 * The operation id for the '<em>Build Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___BUILD_CONS__GENERATORCONS = SolverPackage.SOLVER_LP___BUILD_CONS__GENERATORCONS;

	/**
	 * The operation id for the '<em>Build Lp Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___BUILD_LP_CONS__GENERATORLPCONS = SolverPackage.SOLVER_LP___BUILD_LP_CONS__GENERATORLPCONS;

	/**
	 * The operation id for the '<em>Build Lp Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___BUILD_LP_CONS__GENERATORELEMENT_GENERATORLPLINEAR_DOUBLE_ENUMLPCONSTYPE = SolverPackage.SOLVER_LP___BUILD_LP_CONS__GENERATORELEMENT_GENERATORLPLINEAR_DOUBLE_ENUMLPCONSTYPE;

	/**
	 * The operation id for the '<em>Construct Var Binder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___CONSTRUCT_VAR_BINDER__GENERATORVARBINDER = SolverPackage.SOLVER_LP___CONSTRUCT_VAR_BINDER__GENERATORVARBINDER;

	/**
	 * The operation id for the '<em>Build Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___BUILD_GOALS = SolverPackage.SOLVER_LP___BUILD_GOALS;

	/**
	 * The operation id for the '<em>Build Lp Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___BUILD_LP_GOAL__GENERATORLPGOAL_DOUBLE = SolverPackage.SOLVER_LP___BUILD_LP_GOAL__GENERATORLPGOAL_DOUBLE;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___CONSTRUCT_SOLVER_GOAL__GENERATORGOAL = SolverPackage.SOLVER_LP___CONSTRUCT_SOLVER_GOAL__GENERATORGOAL;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___CONSTRUCT_SOLVER_GOAL__SOLUTION = SolverPackage.SOLVER_LP___CONSTRUCT_SOLVER_GOAL__SOLUTION;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___CONSTRUCT_SOLVER_GOAL__SOLVER = SolverPackage.SOLVER_LP___CONSTRUCT_SOLVER_GOAL__SOLVER;

	/**
	 * The operation id for the '<em>Make Solution Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___MAKE_SOLUTION_GOALS__SOLUTION = SolverPackage.SOLVER_LP___MAKE_SOLUTION_GOALS__SOLUTION;

	/**
	 * The operation id for the '<em>Write Lp To File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___WRITE_LP_TO_FILE = SolverPackage.SOLVER_LP_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Lp As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK___GET_LP_AS_STRING = SolverPackage.SOLVER_LP_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Solver GLPK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_OPERATION_COUNT = SolverPackage.SOLVER_LP_OPERATION_COUNT + 2;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKParamsImpl <em>Solver GLPK Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKParamsImpl
	 * @see com.misc.common.moplaf.solver.solverglpk.impl.SolverglpkPackageImpl#getSolverGLPKParams()
	 * @generated
	 */
	int SOLVER_GLPK_PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_PARAMS__CODE = SolverPackage.SOLVER_LP_PARAMS__CODE;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_PARAMS__REMARKS = SolverPackage.SOLVER_LP_PARAMS__REMARKS;

	/**
	 * The feature id for the '<em><b>Solver Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_PARAMS__SOLVER_MAX_DURATION = SolverPackage.SOLVER_LP_PARAMS__SOLVER_MAX_DURATION;

	/**
	 * The feature id for the '<em><b>Solver Optimality Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_PARAMS__SOLVER_OPTIMALITY_TOLERANCE = SolverPackage.SOLVER_LP_PARAMS__SOLVER_OPTIMALITY_TOLERANCE;

	/**
	 * The feature id for the '<em><b>Solver Linear Relaxation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_PARAMS__SOLVER_LINEAR_RELAXATION = SolverPackage.SOLVER_LP_PARAMS__SOLVER_LINEAR_RELAXATION;

	/**
	 * The feature id for the '<em><b>Enable Presolve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_PARAMS__ENABLE_PRESOLVE = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enable Feasibility Pump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_PARAMS__ENABLE_FEASIBILITY_PUMP = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enable Gomory Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_PARAMS__ENABLE_GOMORY_CUTS = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable Generating Clique Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_PARAMS__ENABLE_GENERATING_CLIQUE_CUTS = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enable Generating Mixed Cover Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_PARAMS__ENABLE_GENERATING_MIXED_COVER_CUTS = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enable Mixed Integer Rounding Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_PARAMS__ENABLE_MIXED_INTEGER_ROUNDING_CUTS = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Solver GLPK Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_PARAMS_FEATURE_COUNT = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_PARAMS___COPY_PARAMS__RUNPARAMS = SolverPackage.SOLVER_LP_PARAMS___COPY_PARAMS__RUNPARAMS;

	/**
	 * The number of operations of the '<em>Solver GLPK Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GLPK_PARAMS_OPERATION_COUNT = SolverPackage.SOLVER_LP_PARAMS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPK <em>Solver GLPK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solver GLPK</em>'.
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverGLPK
	 * @generated
	 */
	EClass getSolverGLPK();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams <em>Solver GLPK Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solver GLPK Params</em>'.
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams
	 * @generated
	 */
	EClass getSolverGLPKParams();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableFeasibilityPump <em>Enable Feasibility Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Feasibility Pump</em>'.
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableFeasibilityPump()
	 * @see #getSolverGLPKParams()
	 * @generated
	 */
	EAttribute getSolverGLPKParams_EnableFeasibilityPump();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableGomoryCuts <em>Enable Gomory Cuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Gomory Cuts</em>'.
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableGomoryCuts()
	 * @see #getSolverGLPKParams()
	 * @generated
	 */
	EAttribute getSolverGLPKParams_EnableGomoryCuts();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableGeneratingCliqueCuts <em>Enable Generating Clique Cuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Generating Clique Cuts</em>'.
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableGeneratingCliqueCuts()
	 * @see #getSolverGLPKParams()
	 * @generated
	 */
	EAttribute getSolverGLPKParams_EnableGeneratingCliqueCuts();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableGeneratingMixedCoverCuts <em>Enable Generating Mixed Cover Cuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Generating Mixed Cover Cuts</em>'.
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableGeneratingMixedCoverCuts()
	 * @see #getSolverGLPKParams()
	 * @generated
	 */
	EAttribute getSolverGLPKParams_EnableGeneratingMixedCoverCuts();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableMixedIntegerRoundingCuts <em>Enable Mixed Integer Rounding Cuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Mixed Integer Rounding Cuts</em>'.
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnableMixedIntegerRoundingCuts()
	 * @see #getSolverGLPKParams()
	 * @generated
	 */
	EAttribute getSolverGLPKParams_EnableMixedIntegerRoundingCuts();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnablePresolve <em>Enable Presolve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Presolve</em>'.
	 * @see com.misc.common.moplaf.solver.solverglpk.SolverGLPKParams#isEnablePresolve()
	 * @see #getSolverGLPKParams()
	 * @generated
	 */
	EAttribute getSolverGLPKParams_EnablePresolve();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SolverglpkFactory getSolverglpkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKImpl <em>Solver GLPK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKImpl
		 * @see com.misc.common.moplaf.solver.solverglpk.impl.SolverglpkPackageImpl#getSolverGLPK()
		 * @generated
		 */
		EClass SOLVER_GLPK = eINSTANCE.getSolverGLPK();
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKParamsImpl <em>Solver GLPK Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKParamsImpl
		 * @see com.misc.common.moplaf.solver.solverglpk.impl.SolverglpkPackageImpl#getSolverGLPKParams()
		 * @generated
		 */
		EClass SOLVER_GLPK_PARAMS = eINSTANCE.getSolverGLPKParams();
		/**
		 * The meta object literal for the '<em><b>Enable Feasibility Pump</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_GLPK_PARAMS__ENABLE_FEASIBILITY_PUMP = eINSTANCE.getSolverGLPKParams_EnableFeasibilityPump();
		/**
		 * The meta object literal for the '<em><b>Enable Gomory Cuts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_GLPK_PARAMS__ENABLE_GOMORY_CUTS = eINSTANCE.getSolverGLPKParams_EnableGomoryCuts();
		/**
		 * The meta object literal for the '<em><b>Enable Generating Clique Cuts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_GLPK_PARAMS__ENABLE_GENERATING_CLIQUE_CUTS = eINSTANCE.getSolverGLPKParams_EnableGeneratingCliqueCuts();
		/**
		 * The meta object literal for the '<em><b>Enable Generating Mixed Cover Cuts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_GLPK_PARAMS__ENABLE_GENERATING_MIXED_COVER_CUTS = eINSTANCE.getSolverGLPKParams_EnableGeneratingMixedCoverCuts();
		/**
		 * The meta object literal for the '<em><b>Enable Mixed Integer Rounding Cuts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_GLPK_PARAMS__ENABLE_MIXED_INTEGER_ROUNDING_CUTS = eINSTANCE.getSolverGLPKParams_EnableMixedIntegerRoundingCuts();
		/**
		 * The meta object literal for the '<em><b>Enable Presolve</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_GLPK_PARAMS__ENABLE_PRESOLVE = eINSTANCE.getSolverGLPKParams_EnablePresolve();

	}

} //SolverglpkPackage
