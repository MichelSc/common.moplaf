/**
 */
package com.misc.common.moplaf.solver.solvercplex;

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
 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexFactory
 * @model kind="package"
 * @generated
 */
public interface SolverCplexPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "solvercplex";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/solver/cplex/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "svrcp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverCplexPackage eINSTANCE = com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl <em>Solver Cplex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl
	 * @see com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexPackageImpl#getSolverCplex()
	 * @generated
	 */
	int SOLVER_CPLEX = 0;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RUN_FEEDBACK = SolverPackage.SOLVER_LP__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__CANCEL_FEEDBACK = SolverPackage.SOLVER_LP__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RESET_FEEDBACK = SolverPackage.SOLVER_LP__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__CANCELED = SolverPackage.SOLVER_LP__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RETURN_SUCCESS = SolverPackage.SOLVER_LP__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RETURN_FEEDBACK = SolverPackage.SOLVER_LP__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RETURN_INFORMATION = SolverPackage.SOLVER_LP__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__CODE = SolverPackage.SOLVER_LP__CODE;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__SOLUTION = SolverPackage.SOLVER_LP__SOLUTION;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__CURRENT_SOLUTION_NR = SolverPackage.SOLVER_LP__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__REMARKS = SolverPackage.SOLVER_LP__REMARKS;

	/**
	 * The feature id for the '<em><b>Solver Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__SOLVER_MAX_DURATION = SolverPackage.SOLVER_LP__SOLVER_MAX_DURATION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__STATUS = SolverPackage.SOLVER_LP__STATUS;

	/**
	 * The feature id for the '<em><b>Solver Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__SOLVER_LOG_LEVEL = SolverPackage.SOLVER_LP__SOLVER_LOG_LEVEL;

	/**
	 * The feature id for the '<em><b>Solver Dump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__SOLVER_DUMP = SolverPackage.SOLVER_LP__SOLVER_DUMP;

	/**
	 * The feature id for the '<em><b>Run Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RUN_STARTED = SolverPackage.SOLVER_LP__RUN_STARTED;

	/**
	 * The feature id for the '<em><b>Run Initialization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RUN_INITIALIZATION_ENDED = SolverPackage.SOLVER_LP__RUN_INITIALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Solving Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RUN_SOLVING_ENDED = SolverPackage.SOLVER_LP__RUN_SOLVING_ENDED;

	/**
	 * The feature id for the '<em><b>Run Finalization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RUN_FINALIZATION_ENDED = SolverPackage.SOLVER_LP__RUN_FINALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Duration Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RUN_DURATION_INITIALIZATION = SolverPackage.SOLVER_LP__RUN_DURATION_INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Finalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RUN_DURATION_FINALIZATION = SolverPackage.SOLVER_LP__RUN_DURATION_FINALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RUN_DURATION_SOLVING = SolverPackage.SOLVER_LP__RUN_DURATION_SOLVING;

	/**
	 * The feature id for the '<em><b>Run Request Terminate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RUN_REQUEST_TERMINATE = SolverPackage.SOLVER_LP__RUN_REQUEST_TERMINATE;

	/**
	 * The feature id for the '<em><b>Run Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RUN_TIME_OUT = SolverPackage.SOLVER_LP__RUN_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Sol Unfeasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__SOL_UNFEASIBLE = SolverPackage.SOLVER_LP__SOL_UNFEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Feasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__SOL_FEASIBLE = SolverPackage.SOLVER_LP__SOL_FEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Optimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__SOL_OPTIMAL = SolverPackage.SOLVER_LP__SOL_OPTIMAL;

	/**
	 * The feature id for the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__SOL_VALUE = SolverPackage.SOLVER_LP__SOL_VALUE;

	/**
	 * The feature id for the '<em><b>Run Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__RUN_INTERRUPTED = SolverPackage.SOLVER_LP__RUN_INTERRUPTED;

	/**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__INITIALIZING = SolverPackage.SOLVER_LP__INITIALIZING;

	/**
	 * The feature id for the '<em><b>Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__SOLVING = SolverPackage.SOLVER_LP__SOLVING;

	/**
	 * The feature id for the '<em><b>Finalizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__FINALIZING = SolverPackage.SOLVER_LP__FINALIZING;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__FINISHED = SolverPackage.SOLVER_LP__FINISHED;

	/**
	 * The feature id for the '<em><b>Initial Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__INITIAL_SOLUTION = SolverPackage.SOLVER_LP__INITIAL_SOLUTION;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__GOALS = SolverPackage.SOLVER_LP__GOALS;

	/**
	 * The feature id for the '<em><b>Solver Optimality Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__SOLVER_OPTIMALITY_TOLERANCE = SolverPackage.SOLVER_LP__SOLVER_OPTIMALITY_TOLERANCE;

	/**
	 * The feature id for the '<em><b>Solver Linear Relaxation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__SOLVER_LINEAR_RELAXATION = SolverPackage.SOLVER_LP__SOLVER_LINEAR_RELAXATION;

	/**
	 * The feature id for the '<em><b>Sol Optimality Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__SOL_OPTIMALITY_GAP = SolverPackage.SOLVER_LP__SOL_OPTIMALITY_GAP;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__FILE_PATH = SolverPackage.SOLVER_LP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__FILE_FORMAT = SolverPackage.SOLVER_LP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Compressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__FILE_COMPRESSED = SolverPackage.SOLVER_LP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mip Cuts Cliques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__MIP_CUTS_CLIQUES = SolverPackage.SOLVER_LP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mip Cuts Covers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__MIP_CUTS_COVERS = SolverPackage.SOLVER_LP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mip Cuts Flow Covers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__MIP_CUTS_FLOW_COVERS = SolverPackage.SOLVER_LP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Mip Cuts Gomory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__MIP_CUTS_GOMORY = SolverPackage.SOLVER_LP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mip Cuts GUB Covers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__MIP_CUTS_GUB_COVERS = SolverPackage.SOLVER_LP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mip Cuts Implied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__MIP_CUTS_IMPLIED = SolverPackage.SOLVER_LP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Mip Cuts MIR Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__MIP_CUTS_MIR_CUT = SolverPackage.SOLVER_LP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mip Cuts Path Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__MIP_CUTS_PATH_CUT = SolverPackage.SOLVER_LP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mip Strategy Backtrack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__MIP_STRATEGY_BACKTRACK = SolverPackage.SOLVER_LP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Mip Strategy Heuristic Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__MIP_STRATEGY_HEURISTIC_FREQ = SolverPackage.SOLVER_LP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Mip Strategy Probe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__MIP_STRATEGY_PROBE = SolverPackage.SOLVER_LP_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Mip Strategy Presolve Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__MIP_STRATEGY_PRESOLVE_NODE = SolverPackage.SOLVER_LP_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Mip Limits Cuts Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX__MIP_LIMITS_CUTS_FACTOR = SolverPackage.SOLVER_LP_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Solver Cplex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_FEATURE_COUNT = SolverPackage.SOLVER_LP_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___COPY_PARAMS__RUNPARAMS = SolverPackage.SOLVER_LP___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___RESET = SolverPackage.SOLVER_LP___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___RUN = SolverPackage.SOLVER_LP___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___RUN__RUNCONTEXT = SolverPackage.SOLVER_LP___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___CANCEL = SolverPackage.SOLVER_LP___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___SET_PROGRESS__STRING_FLOAT = SolverPackage.SOLVER_LP___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___SET_PROGRESS__PROGRESSFEEDBACK = SolverPackage.SOLVER_LP___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___GET_RETURN = SolverPackage.SOLVER_LP___GET_RETURN;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___SET_RETURN__RETURNFEEDBACK = SolverPackage.SOLVER_LP___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___CONSTRUCT_PARAMS = SolverPackage.SOLVER_LP___CONSTRUCT_PARAMS;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___GET_GENERATOR = SolverPackage.SOLVER_LP___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___DISPOSE = SolverPackage.SOLVER_LP___DISPOSE;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___SOLUTION_FACTORY = SolverPackage.SOLVER_LP___SOLUTION_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___CONSTRUCT_SOLUTION = SolverPackage.SOLVER_LP___CONSTRUCT_SOLUTION;

	/**
	 * The operation id for the '<em>Solve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___SOLVE = SolverPackage.SOLVER_LP___SOLVE;

	/**
	 * The operation id for the '<em>Build Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___BUILD_VARS = SolverPackage.SOLVER_LP___BUILD_VARS;

	/**
	 * The operation id for the '<em>Build Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___BUILD_VAR__GENERATORVAR = SolverPackage.SOLVER_LP___BUILD_VAR__GENERATORVAR;

	/**
	 * The operation id for the '<em>Build Lp Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___BUILD_LP_VAR__GENERATORLPVAR = SolverPackage.SOLVER_LP___BUILD_LP_VAR__GENERATORLPVAR;

	/**
	 * The operation id for the '<em>Build Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___BUILD_CONS = SolverPackage.SOLVER_LP___BUILD_CONS;

	/**
	 * The operation id for the '<em>Build Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___BUILD_CONS__GENERATORCONS = SolverPackage.SOLVER_LP___BUILD_CONS__GENERATORCONS;

	/**
	 * The operation id for the '<em>Build Lp Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___BUILD_LP_CONS__GENERATORLPCONS = SolverPackage.SOLVER_LP___BUILD_LP_CONS__GENERATORLPCONS;

	/**
	 * The operation id for the '<em>Build Lp Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___BUILD_LP_CONS__GENERATORELEMENT_GENERATORLPLINEAR_FLOAT_ENUMLPCONSTYPE = SolverPackage.SOLVER_LP___BUILD_LP_CONS__GENERATORELEMENT_GENERATORLPLINEAR_FLOAT_ENUMLPCONSTYPE;

	/**
	 * The operation id for the '<em>Build Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___BUILD_GOALS = SolverPackage.SOLVER_LP___BUILD_GOALS;

	/**
	 * The operation id for the '<em>Build Lp Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___BUILD_LP_GOAL__GENERATORLPGOAL_FLOAT = SolverPackage.SOLVER_LP___BUILD_LP_GOAL__GENERATORLPGOAL_FLOAT;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___CONSTRUCT_SOLVER_GOAL__GENERATORGOAL = SolverPackage.SOLVER_LP___CONSTRUCT_SOLVER_GOAL__GENERATORGOAL;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___CONSTRUCT_SOLVER_GOAL__SOLUTION = SolverPackage.SOLVER_LP___CONSTRUCT_SOLVER_GOAL__SOLUTION;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___CONSTRUCT_SOLVER_GOAL__SOLVER = SolverPackage.SOLVER_LP___CONSTRUCT_SOLVER_GOAL__SOLVER;

	/**
	 * The operation id for the '<em>Make Solution Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___MAKE_SOLUTION_GOALS__SOLUTION = SolverPackage.SOLVER_LP___MAKE_SOLUTION_GOALS__SOLUTION;

	/**
	 * The operation id for the '<em>Write Lp To File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___WRITE_LP_TO_FILE = SolverPackage.SOLVER_LP_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Lp As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX___GET_LP_AS_STRING = SolverPackage.SOLVER_LP_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Solver Cplex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_OPERATION_COUNT = SolverPackage.SOLVER_LP_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl <em>Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl
	 * @see com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexPackageImpl#getSolverCplexParams()
	 * @generated
	 */
	int SOLVER_CPLEX_PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__CODE = SolverPackage.SOLVER_LP_PARAMS__CODE;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__REMARKS = SolverPackage.SOLVER_LP_PARAMS__REMARKS;

	/**
	 * The feature id for the '<em><b>Solver Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__SOLVER_MAX_DURATION = SolverPackage.SOLVER_LP_PARAMS__SOLVER_MAX_DURATION;

	/**
	 * The feature id for the '<em><b>Solver Optimality Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__SOLVER_OPTIMALITY_TOLERANCE = SolverPackage.SOLVER_LP_PARAMS__SOLVER_OPTIMALITY_TOLERANCE;

	/**
	 * The feature id for the '<em><b>Solver Linear Relaxation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__SOLVER_LINEAR_RELAXATION = SolverPackage.SOLVER_LP_PARAMS__SOLVER_LINEAR_RELAXATION;

	/**
	 * The feature id for the '<em><b>Mip Cuts Cliques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__MIP_CUTS_CLIQUES = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mip Cuts Covers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__MIP_CUTS_COVERS = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mip Cuts Flow Covers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__MIP_CUTS_FLOW_COVERS = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mip Cuts Gomory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__MIP_CUTS_GOMORY = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mip Cuts GUB Covers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__MIP_CUTS_GUB_COVERS = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mip Cuts Implied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__MIP_CUTS_IMPLIED = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Mip Cuts MIR Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__MIP_CUTS_MIR_CUT = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mip Cuts Path Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__MIP_CUTS_PATH_CUT = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mip Strategy Backtrack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__MIP_STRATEGY_BACKTRACK = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Mip Strategy Heuristic Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__MIP_STRATEGY_HEURISTIC_FREQ = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mip Strategy Probe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PROBE = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mip Strategy Presolve Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PRESOLVE_NODE = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Mip Limits Cuts Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS__MIP_LIMITS_CUTS_FACTOR = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS_FEATURE_COUNT = SolverPackage.SOLVER_LP_PARAMS_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS___COPY_PARAMS__RUNPARAMS = SolverPackage.SOLVER_LP_PARAMS___COPY_PARAMS__RUNPARAMS;

	/**
	 * The number of operations of the '<em>Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CPLEX_PARAMS_OPERATION_COUNT = SolverPackage.SOLVER_LP_PARAMS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplex <em>Solver Cplex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solver Cplex</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplex
	 * @generated
	 */
	EClass getSolverCplex();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Params</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexParams
	 * @generated
	 */
	EClass getSolverCplexParams();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsCliques <em>Mip Cuts Cliques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mip Cuts Cliques</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsCliques()
	 * @see #getSolverCplexParams()
	 * @generated
	 */
	EAttribute getSolverCplexParams_MipCutsCliques();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsCovers <em>Mip Cuts Covers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mip Cuts Covers</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsCovers()
	 * @see #getSolverCplexParams()
	 * @generated
	 */
	EAttribute getSolverCplexParams_MipCutsCovers();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsFlowCovers <em>Mip Cuts Flow Covers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mip Cuts Flow Covers</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsFlowCovers()
	 * @see #getSolverCplexParams()
	 * @generated
	 */
	EAttribute getSolverCplexParams_MipCutsFlowCovers();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsGomory <em>Mip Cuts Gomory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mip Cuts Gomory</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsGomory()
	 * @see #getSolverCplexParams()
	 * @generated
	 */
	EAttribute getSolverCplexParams_MipCutsGomory();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsGUBCovers <em>Mip Cuts GUB Covers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mip Cuts GUB Covers</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsGUBCovers()
	 * @see #getSolverCplexParams()
	 * @generated
	 */
	EAttribute getSolverCplexParams_MipCutsGUBCovers();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsImplied <em>Mip Cuts Implied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mip Cuts Implied</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsImplied()
	 * @see #getSolverCplexParams()
	 * @generated
	 */
	EAttribute getSolverCplexParams_MipCutsImplied();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsMIRCut <em>Mip Cuts MIR Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mip Cuts MIR Cut</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsMIRCut()
	 * @see #getSolverCplexParams()
	 * @generated
	 */
	EAttribute getSolverCplexParams_MipCutsMIRCut();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsPathCut <em>Mip Cuts Path Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mip Cuts Path Cut</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipCutsPathCut()
	 * @see #getSolverCplexParams()
	 * @generated
	 */
	EAttribute getSolverCplexParams_MipCutsPathCut();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyBacktrack <em>Mip Strategy Backtrack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mip Strategy Backtrack</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyBacktrack()
	 * @see #getSolverCplexParams()
	 * @generated
	 */
	EAttribute getSolverCplexParams_MipStrategyBacktrack();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyHeuristicFreq <em>Mip Strategy Heuristic Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mip Strategy Heuristic Freq</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyHeuristicFreq()
	 * @see #getSolverCplexParams()
	 * @generated
	 */
	EAttribute getSolverCplexParams_MipStrategyHeuristicFreq();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyProbe <em>Mip Strategy Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mip Strategy Probe</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyProbe()
	 * @see #getSolverCplexParams()
	 * @generated
	 */
	EAttribute getSolverCplexParams_MipStrategyProbe();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyPresolveNode <em>Mip Strategy Presolve Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mip Strategy Presolve Node</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipStrategyPresolveNode()
	 * @see #getSolverCplexParams()
	 * @generated
	 */
	EAttribute getSolverCplexParams_MipStrategyPresolveNode();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipLimitsCutsFactor <em>Mip Limits Cuts Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mip Limits Cuts Factor</em>'.
	 * @see com.misc.common.moplaf.solver.solvercplex.SolverCplexParams#getMipLimitsCutsFactor()
	 * @see #getSolverCplexParams()
	 * @generated
	 */
	EAttribute getSolverCplexParams_MipLimitsCutsFactor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SolverCplexFactory getSolverCplexFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl <em>Solver Cplex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl
		 * @see com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexPackageImpl#getSolverCplex()
		 * @generated
		 */
		EClass SOLVER_CPLEX = eINSTANCE.getSolverCplex();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl <em>Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl
		 * @see com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexPackageImpl#getSolverCplexParams()
		 * @generated
		 */
		EClass SOLVER_CPLEX_PARAMS = eINSTANCE.getSolverCplexParams();

		/**
		 * The meta object literal for the '<em><b>Mip Cuts Cliques</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_CPLEX_PARAMS__MIP_CUTS_CLIQUES = eINSTANCE.getSolverCplexParams_MipCutsCliques();

		/**
		 * The meta object literal for the '<em><b>Mip Cuts Covers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_CPLEX_PARAMS__MIP_CUTS_COVERS = eINSTANCE.getSolverCplexParams_MipCutsCovers();

		/**
		 * The meta object literal for the '<em><b>Mip Cuts Flow Covers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_CPLEX_PARAMS__MIP_CUTS_FLOW_COVERS = eINSTANCE.getSolverCplexParams_MipCutsFlowCovers();

		/**
		 * The meta object literal for the '<em><b>Mip Cuts Gomory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_CPLEX_PARAMS__MIP_CUTS_GOMORY = eINSTANCE.getSolverCplexParams_MipCutsGomory();

		/**
		 * The meta object literal for the '<em><b>Mip Cuts GUB Covers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_CPLEX_PARAMS__MIP_CUTS_GUB_COVERS = eINSTANCE.getSolverCplexParams_MipCutsGUBCovers();

		/**
		 * The meta object literal for the '<em><b>Mip Cuts Implied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_CPLEX_PARAMS__MIP_CUTS_IMPLIED = eINSTANCE.getSolverCplexParams_MipCutsImplied();

		/**
		 * The meta object literal for the '<em><b>Mip Cuts MIR Cut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_CPLEX_PARAMS__MIP_CUTS_MIR_CUT = eINSTANCE.getSolverCplexParams_MipCutsMIRCut();

		/**
		 * The meta object literal for the '<em><b>Mip Cuts Path Cut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_CPLEX_PARAMS__MIP_CUTS_PATH_CUT = eINSTANCE.getSolverCplexParams_MipCutsPathCut();

		/**
		 * The meta object literal for the '<em><b>Mip Strategy Backtrack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_CPLEX_PARAMS__MIP_STRATEGY_BACKTRACK = eINSTANCE.getSolverCplexParams_MipStrategyBacktrack();

		/**
		 * The meta object literal for the '<em><b>Mip Strategy Heuristic Freq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_CPLEX_PARAMS__MIP_STRATEGY_HEURISTIC_FREQ = eINSTANCE.getSolverCplexParams_MipStrategyHeuristicFreq();

		/**
		 * The meta object literal for the '<em><b>Mip Strategy Probe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PROBE = eINSTANCE.getSolverCplexParams_MipStrategyProbe();

		/**
		 * The meta object literal for the '<em><b>Mip Strategy Presolve Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PRESOLVE_NODE = eINSTANCE.getSolverCplexParams_MipStrategyPresolveNode();

		/**
		 * The meta object literal for the '<em><b>Mip Limits Cuts Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_CPLEX_PARAMS__MIP_LIMITS_CUTS_FACTOR = eINSTANCE.getSolverCplexParams_MipLimitsCutsFactor();

	}

} //SolverCplexPackage
