/**
 */
package com.misc.common.moplaf.solver.solvergurobi;

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
 * @see com.misc.common.moplaf.solver.solvergurobi.SolvergurobiFactory
 * @model kind="package"
 * @generated
 */
public interface SolvergurobiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "solvergurobi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common.moplaf.solver.gurobi.emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "svrgr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolvergurobiPackage eINSTANCE = com.misc.common.moplaf.solver.solvergurobi.impl.SolvergurobiPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.solvergurobi.impl.SolverGurobiImpl <em>Solver Gurobi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.solvergurobi.impl.SolverGurobiImpl
	 * @see com.misc.common.moplaf.solver.solvergurobi.impl.SolvergurobiPackageImpl#getSolverGurobi()
	 * @generated
	 */
	int SOLVER_GUROBI = 0;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__SOLUTION = SolverPackage.SOLVER_LP__SOLUTION;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__CURRENT_SOLUTION_NR = SolverPackage.SOLVER_LP__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__CODE = SolverPackage.SOLVER_LP__CODE;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__REMARKS = SolverPackage.SOLVER_LP__REMARKS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__STATUS = SolverPackage.SOLVER_LP__STATUS;

	/**
	 * The feature id for the '<em><b>Solver Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__SOLVER_MAX_DURATION = SolverPackage.SOLVER_LP__SOLVER_MAX_DURATION;

	/**
	 * The feature id for the '<em><b>Solver Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__SOLVER_BACKGROUND = SolverPackage.SOLVER_LP__SOLVER_BACKGROUND;

	/**
	 * The feature id for the '<em><b>Solver Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__SOLVER_LOG_LEVEL = SolverPackage.SOLVER_LP__SOLVER_LOG_LEVEL;

	/**
	 * The feature id for the '<em><b>Solver Dump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__SOLVER_DUMP = SolverPackage.SOLVER_LP__SOLVER_DUMP;

	/**
	 * The feature id for the '<em><b>Run Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__RUN_STARTED = SolverPackage.SOLVER_LP__RUN_STARTED;

	/**
	 * The feature id for the '<em><b>Run Initialization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__RUN_INITIALIZATION_ENDED = SolverPackage.SOLVER_LP__RUN_INITIALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Solving Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__RUN_SOLVING_ENDED = SolverPackage.SOLVER_LP__RUN_SOLVING_ENDED;

	/**
	 * The feature id for the '<em><b>Run Finalization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__RUN_FINALIZATION_ENDED = SolverPackage.SOLVER_LP__RUN_FINALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Duration Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__RUN_DURATION_INITIALIZATION = SolverPackage.SOLVER_LP__RUN_DURATION_INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Finalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__RUN_DURATION_FINALIZATION = SolverPackage.SOLVER_LP__RUN_DURATION_FINALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__RUN_DURATION_SOLVING = SolverPackage.SOLVER_LP__RUN_DURATION_SOLVING;

	/**
	 * The feature id for the '<em><b>Run Request Terminate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__RUN_REQUEST_TERMINATE = SolverPackage.SOLVER_LP__RUN_REQUEST_TERMINATE;

	/**
	 * The feature id for the '<em><b>Run Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__RUN_TIME_OUT = SolverPackage.SOLVER_LP__RUN_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Sol Unfeasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__SOL_UNFEASIBLE = SolverPackage.SOLVER_LP__SOL_UNFEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Feasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__SOL_FEASIBLE = SolverPackage.SOLVER_LP__SOL_FEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Optimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__SOL_OPTIMAL = SolverPackage.SOLVER_LP__SOL_OPTIMAL;

	/**
	 * The feature id for the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__SOL_VALUE = SolverPackage.SOLVER_LP__SOL_VALUE;

	/**
	 * The feature id for the '<em><b>Run Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__RUN_INTERRUPTED = SolverPackage.SOLVER_LP__RUN_INTERRUPTED;

	/**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__INITIALIZING = SolverPackage.SOLVER_LP__INITIALIZING;

	/**
	 * The feature id for the '<em><b>Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__SOLVING = SolverPackage.SOLVER_LP__SOLVING;

	/**
	 * The feature id for the '<em><b>Finalizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__FINALIZING = SolverPackage.SOLVER_LP__FINALIZING;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__FINISHED = SolverPackage.SOLVER_LP__FINISHED;

	/**
	 * The feature id for the '<em><b>Initial Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__INITIAL_SOLUTION = SolverPackage.SOLVER_LP__INITIAL_SOLUTION;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__GOALS = SolverPackage.SOLVER_LP__GOALS;

	/**
	 * The feature id for the '<em><b>Solver Optimality Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__SOLVER_OPTIMALITY_TOLERANCE = SolverPackage.SOLVER_LP__SOLVER_OPTIMALITY_TOLERANCE;

	/**
	 * The feature id for the '<em><b>Solver Linear Relaxation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__SOLVER_LINEAR_RELAXATION = SolverPackage.SOLVER_LP__SOLVER_LINEAR_RELAXATION;

	/**
	 * The feature id for the '<em><b>Sol Optimality Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__SOL_OPTIMALITY_GAP = SolverPackage.SOLVER_LP__SOL_OPTIMALITY_GAP;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__FILE_PATH = SolverPackage.SOLVER_LP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__FILE_FORMAT = SolverPackage.SOLVER_LP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Compressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__FILE_COMPRESSED = SolverPackage.SOLVER_LP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Nof Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__MAX_NOF_THREADS = SolverPackage.SOLVER_LP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Solver Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI__SOLVER_LOG = SolverPackage.SOLVER_LP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Solver Gurobi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI_FEATURE_COUNT = SolverPackage.SOLVER_LP_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___GET_GENERATOR = SolverPackage.SOLVER_LP___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___DISPOSE = SolverPackage.SOLVER_LP___DISPOSE;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___SOLUTION_FACTORY = SolverPackage.SOLVER_LP___SOLUTION_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___CONSTRUCT_SOLUTION = SolverPackage.SOLVER_LP___CONSTRUCT_SOLUTION;

	/**
	 * The operation id for the '<em>Solve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___SOLVE = SolverPackage.SOLVER_LP___SOLVE;

	/**
	 * The operation id for the '<em>Build Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___BUILD_VARS = SolverPackage.SOLVER_LP___BUILD_VARS;

	/**
	 * The operation id for the '<em>Build Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___BUILD_VAR__GENERATORVAR = SolverPackage.SOLVER_LP___BUILD_VAR__GENERATORVAR;

	/**
	 * The operation id for the '<em>Build Lp Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___BUILD_LP_VAR__GENERATORLPVAR = SolverPackage.SOLVER_LP___BUILD_LP_VAR__GENERATORLPVAR;

	/**
	 * The operation id for the '<em>Build Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___BUILD_CONS = SolverPackage.SOLVER_LP___BUILD_CONS;

	/**
	 * The operation id for the '<em>Build Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___BUILD_CONS__GENERATORCONS = SolverPackage.SOLVER_LP___BUILD_CONS__GENERATORCONS;

	/**
	 * The operation id for the '<em>Build Lp Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___BUILD_LP_CONS__GENERATORLPCONS = SolverPackage.SOLVER_LP___BUILD_LP_CONS__GENERATORLPCONS;

	/**
	 * The operation id for the '<em>Build Lp Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___BUILD_LP_CONS__GENERATORELEMENT_GENERATORLPLINEAR_FLOAT_ENUMLPCONSTYPE = SolverPackage.SOLVER_LP___BUILD_LP_CONS__GENERATORELEMENT_GENERATORLPLINEAR_FLOAT_ENUMLPCONSTYPE;

	/**
	 * The operation id for the '<em>Build Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___BUILD_GOALS = SolverPackage.SOLVER_LP___BUILD_GOALS;

	/**
	 * The operation id for the '<em>Build Lp Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___BUILD_LP_GOAL__GENERATORLPGOAL_FLOAT = SolverPackage.SOLVER_LP___BUILD_LP_GOAL__GENERATORLPGOAL_FLOAT;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___CONSTRUCT_SOLVER_GOAL__GENERATORGOAL = SolverPackage.SOLVER_LP___CONSTRUCT_SOLVER_GOAL__GENERATORGOAL;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___CONSTRUCT_SOLVER_GOAL__SOLUTION = SolverPackage.SOLVER_LP___CONSTRUCT_SOLVER_GOAL__SOLUTION;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___CONSTRUCT_SOLVER_GOAL__SOLVER = SolverPackage.SOLVER_LP___CONSTRUCT_SOLVER_GOAL__SOLVER;

	/**
	 * The operation id for the '<em>Make Solution Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___MAKE_SOLUTION_GOALS__SOLUTION = SolverPackage.SOLVER_LP___MAKE_SOLUTION_GOALS__SOLUTION;

	/**
	 * The operation id for the '<em>Write Lp To File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___WRITE_LP_TO_FILE = SolverPackage.SOLVER_LP_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Lp As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI___GET_LP_AS_STRING = SolverPackage.SOLVER_LP_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Solver Gurobi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GUROBI_OPERATION_COUNT = SolverPackage.SOLVER_LP_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.solvergurobi.SolverGurobi <em>Solver Gurobi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solver Gurobi</em>'.
	 * @see com.misc.common.moplaf.solver.solvergurobi.SolverGurobi
	 * @generated
	 */
	EClass getSolverGurobi();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvergurobi.SolverGurobi#getMaxNofThreads <em>Max Nof Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Nof Threads</em>'.
	 * @see com.misc.common.moplaf.solver.solvergurobi.SolverGurobi#getMaxNofThreads()
	 * @see #getSolverGurobi()
	 * @generated
	 */
	EAttribute getSolverGurobi_MaxNofThreads();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solvergurobi.SolverGurobi#getSolverLog <em>Solver Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Log</em>'.
	 * @see com.misc.common.moplaf.solver.solvergurobi.SolverGurobi#getSolverLog()
	 * @see #getSolverGurobi()
	 * @generated
	 */
	EAttribute getSolverGurobi_SolverLog();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SolvergurobiFactory getSolvergurobiFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.solvergurobi.impl.SolverGurobiImpl <em>Solver Gurobi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.solvergurobi.impl.SolverGurobiImpl
		 * @see com.misc.common.moplaf.solver.solvergurobi.impl.SolvergurobiPackageImpl#getSolverGurobi()
		 * @generated
		 */
		EClass SOLVER_GUROBI = eINSTANCE.getSolverGurobi();

		/**
		 * The meta object literal for the '<em><b>Max Nof Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_GUROBI__MAX_NOF_THREADS = eINSTANCE.getSolverGurobi_MaxNofThreads();

		/**
		 * The meta object literal for the '<em><b>Solver Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_GUROBI__SOLVER_LOG = eINSTANCE.getSolverGurobi_SolverLog();

	}

} //SolvergurobiPackage
