/**
 */
package com.misc.common.moplaf.solver.solverneos;

import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see com.misc.common.moplaf.solver.solverneos.SolverneosFactory
 * @model kind="package"
 * @generated
 */
public interface SolverneosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "solverneos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/solver/neos/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "svrns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverneosPackage eINSTANCE = com.misc.common.moplaf.solver.solverneos.impl.SolverneosPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl <em>Solver Neos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl
	 * @see com.misc.common.moplaf.solver.solverneos.impl.SolverneosPackageImpl#getSolverNeos()
	 * @generated
	 */
	int SOLVER_NEOS = 0;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOLUTION = SolverPackage.SOLVER_LP__SOLUTION;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__CURRENT_SOLUTION_NR = SolverPackage.SOLVER_LP__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__CODE = SolverPackage.SOLVER_LP__CODE;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__REMARKS = SolverPackage.SOLVER_LP__REMARKS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__STATUS = SolverPackage.SOLVER_LP__STATUS;

	/**
	 * The feature id for the '<em><b>Solver Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOLVER_MAX_DURATION = SolverPackage.SOLVER_LP__SOLVER_MAX_DURATION;

	/**
	 * The feature id for the '<em><b>Solver Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOLVER_BACKGROUND = SolverPackage.SOLVER_LP__SOLVER_BACKGROUND;

	/**
	 * The feature id for the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOL_VALUE = SolverPackage.SOLVER_LP__SOL_VALUE;

	/**
	 * The feature id for the '<em><b>Solver Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOLVER_LOG_LEVEL = SolverPackage.SOLVER_LP__SOLVER_LOG_LEVEL;

	/**
	 * The feature id for the '<em><b>Solver Dump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOLVER_DUMP = SolverPackage.SOLVER_LP__SOLVER_DUMP;

	/**
	 * The feature id for the '<em><b>Run Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__RUN_STARTED = SolverPackage.SOLVER_LP__RUN_STARTED;

	/**
	 * The feature id for the '<em><b>Run Initialization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__RUN_INITIALIZATION_ENDED = SolverPackage.SOLVER_LP__RUN_INITIALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Solving Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__RUN_SOLVING_ENDED = SolverPackage.SOLVER_LP__RUN_SOLVING_ENDED;

	/**
	 * The feature id for the '<em><b>Run Finalization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__RUN_FINALIZATION_ENDED = SolverPackage.SOLVER_LP__RUN_FINALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Duration Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__RUN_DURATION_INITIALIZATION = SolverPackage.SOLVER_LP__RUN_DURATION_INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Finalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__RUN_DURATION_FINALIZATION = SolverPackage.SOLVER_LP__RUN_DURATION_FINALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__RUN_DURATION_SOLVING = SolverPackage.SOLVER_LP__RUN_DURATION_SOLVING;

	/**
	 * The feature id for the '<em><b>Run Request Terminate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__RUN_REQUEST_TERMINATE = SolverPackage.SOLVER_LP__RUN_REQUEST_TERMINATE;

	/**
	 * The feature id for the '<em><b>Sol Unfeasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOL_UNFEASIBLE = SolverPackage.SOLVER_LP__SOL_UNFEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Feasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOL_FEASIBLE = SolverPackage.SOLVER_LP__SOL_FEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Optimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOL_OPTIMAL = SolverPackage.SOLVER_LP__SOL_OPTIMAL;

	/**
	 * The feature id for the '<em><b>Run Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__RUN_INTERRUPTED = SolverPackage.SOLVER_LP__RUN_INTERRUPTED;

	/**
	 * The feature id for the '<em><b>Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOLVING = SolverPackage.SOLVER_LP__SOLVING;

	/**
	 * The feature id for the '<em><b>Finalizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__FINALIZING = SolverPackage.SOLVER_LP__FINALIZING;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__FINISHED = SolverPackage.SOLVER_LP__FINISHED;

	/**
	 * The feature id for the '<em><b>Run Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__RUN_TIME_OUT = SolverPackage.SOLVER_LP__RUN_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__INITIALIZING = SolverPackage.SOLVER_LP__INITIALIZING;

	/**
	 * The feature id for the '<em><b>Goal To Solve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__GOAL_TO_SOLVE = SolverPackage.SOLVER_LP__GOAL_TO_SOLVE;

	/**
	 * The feature id for the '<em><b>Initial Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__INITIAL_SOLUTION = SolverPackage.SOLVER_LP__INITIAL_SOLUTION;

	/**
	 * The feature id for the '<em><b>Solver Optimality Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOLVER_OPTIMALITY_TOLERANCE = SolverPackage.SOLVER_LP__SOLVER_OPTIMALITY_TOLERANCE;

	/**
	 * The feature id for the '<em><b>Solver Linear Relaxation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOLVER_LINEAR_RELAXATION = SolverPackage.SOLVER_LP__SOLVER_LINEAR_RELAXATION;

	/**
	 * The feature id for the '<em><b>Sol Optimality Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOL_OPTIMALITY_GAP = SolverPackage.SOLVER_LP__SOL_OPTIMALITY_GAP;

	/**
	 * The feature id for the '<em><b>Lp Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__LP_WRITER = SolverPackage.SOLVER_LP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sol Reader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOL_READER = SolverPackage.SOLVER_LP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Server Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SERVER_HOST = SolverPackage.SOLVER_LP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Server Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SERVER_PORT = SolverPackage.SOLVER_LP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Solver Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOLVER_CATEGORY = SolverPackage.SOLVER_LP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Solver Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOLVER_NAME = SolverPackage.SOLVER_LP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Solver Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOLVER_INPUT = SolverPackage.SOLVER_LP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Solver Poll Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__SOLVER_POLL_DURATION = SolverPackage.SOLVER_LP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Job Submitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__JOB_SUBMITTED = SolverPackage.SOLVER_LP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Job Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__JOB_DONE = SolverPackage.SOLVER_LP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Job Result Retrieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__JOB_RESULT_RETRIEVED = SolverPackage.SOLVER_LP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__JOB_NUMBER = SolverPackage.SOLVER_LP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Job Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__JOB_PASSWORD = SolverPackage.SOLVER_LP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Job Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__JOB_STATUS = SolverPackage.SOLVER_LP_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Job Last Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__JOB_LAST_STATUS = SolverPackage.SOLVER_LP_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Job Neos Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__JOB_NEOS_STATUS = SolverPackage.SOLVER_LP_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Job Submitter Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__JOB_SUBMITTER_EMAIL = SolverPackage.SOLVER_LP_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Job Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS__JOB_RESULT = SolverPackage.SOLVER_LP_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Solver Neos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS_FEATURE_COUNT = SolverPackage.SOLVER_LP_FEATURE_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Parent Generator Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS___GET_PARENT_GENERATOR_TOOL = SolverPackage.SOLVER_LP___GET_PARENT_GENERATOR_TOOL;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS___GET_GENERATOR = SolverPackage.SOLVER_LP___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS___SOLUTION_FACTORY = SolverPackage.SOLVER_LP___SOLUTION_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS___CONSTRUCT_SOLUTION = SolverPackage.SOLVER_LP___CONSTRUCT_SOLUTION;

	/**
	 * The operation id for the '<em>Solve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS___SOLVE = SolverPackage.SOLVER_LP___SOLVE;

	/**
	 * The operation id for the '<em>Retrieve Job Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS___RETRIEVE_JOB_STATUS = SolverPackage.SOLVER_LP_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Retrieve Job Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS___RETRIEVE_JOB_RESULT = SolverPackage.SOLVER_LP_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Kill Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS___KILL_JOB = SolverPackage.SOLVER_LP_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Submit Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS___SUBMIT_JOB = SolverPackage.SOLVER_LP_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Solver Neos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_NEOS_OPERATION_COUNT = SolverPackage.SOLVER_LP_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.solverneos.EnumNeosSolverCategory <em>Enum Neos Solver Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverCategory
	 * @see com.misc.common.moplaf.solver.solverneos.impl.SolverneosPackageImpl#getEnumNeosSolverCategory()
	 * @generated
	 */
	int ENUM_NEOS_SOLVER_CATEGORY = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.solverneos.EnumNeosSolverName <em>Enum Neos Solver Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverName
	 * @see com.misc.common.moplaf.solver.solverneos.impl.SolverneosPackageImpl#getEnumNeosSolverName()
	 * @generated
	 */
	int ENUM_NEOS_SOLVER_NAME = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.solverneos.EnumNeosSolverInput <em>Enum Neos Solver Input</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverInput
	 * @see com.misc.common.moplaf.solver.solverneos.impl.SolverneosPackageImpl#getEnumNeosSolverInput()
	 * @generated
	 */
	int ENUM_NEOS_SOLVER_INPUT = 3;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos <em>Solver Neos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solver Neos</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos
	 * @generated
	 */
	EClass getSolverNeos();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getLpWriter <em>Lp Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lp Writer</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getLpWriter()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EReference getSolverNeos_LpWriter();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolReader <em>Sol Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sol Reader</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolReader()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EReference getSolverNeos_SolReader();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getServerHost <em>Server Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Host</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getServerHost()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_ServerHost();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getServerPort <em>Server Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Port</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getServerPort()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_ServerPort();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverCategory <em>Solver Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Category</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverCategory()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_SolverCategory();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverName <em>Solver Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Name</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverName()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_SolverName();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverInput <em>Solver Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Input</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverInput()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_SolverInput();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverPollDuration <em>Solver Poll Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Poll Duration</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getSolverPollDuration()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_SolverPollDuration();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#isJobSubmitted <em>Job Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Submitted</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#isJobSubmitted()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_JobSubmitted();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#isJobDone <em>Job Done</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Done</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#isJobDone()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_JobDone();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#isJobResultRetrieved <em>Job Result Retrieved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Result Retrieved</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#isJobResultRetrieved()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_JobResultRetrieved();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobNumber <em>Job Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Number</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobNumber()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_JobNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobPassword <em>Job Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Password</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobPassword()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_JobPassword();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobStatus <em>Job Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Status</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobStatus()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_JobStatus();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobLastStatus <em>Job Last Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Last Status</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobLastStatus()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_JobLastStatus();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobNeosStatus <em>Job Neos Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Neos Status</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobNeosStatus()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_JobNeosStatus();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobSubmitterEmail <em>Job Submitter Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Submitter Email</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobSubmitterEmail()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_JobSubmitterEmail();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobResult <em>Job Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Result</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#getJobResult()
	 * @see #getSolverNeos()
	 * @generated
	 */
	EAttribute getSolverNeos_JobResult();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#retrieveJobStatus() <em>Retrieve Job Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Retrieve Job Status</em>' operation.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#retrieveJobStatus()
	 * @generated
	 */
	EOperation getSolverNeos__RetrieveJobStatus();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#retrieveJobResult() <em>Retrieve Job Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Retrieve Job Result</em>' operation.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#retrieveJobResult()
	 * @generated
	 */
	EOperation getSolverNeos__RetrieveJobResult();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#killJob() <em>Kill Job</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Kill Job</em>' operation.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#killJob()
	 * @generated
	 */
	EOperation getSolverNeos__KillJob();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.solverneos.SolverNeos#submitJob() <em>Submit Job</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Submit Job</em>' operation.
	 * @see com.misc.common.moplaf.solver.solverneos.SolverNeos#submitJob()
	 * @generated
	 */
	EOperation getSolverNeos__SubmitJob();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.solver.solverneos.EnumNeosSolverCategory <em>Enum Neos Solver Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Neos Solver Category</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverCategory
	 * @generated
	 */
	EEnum getEnumNeosSolverCategory();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.solver.solverneos.EnumNeosSolverName <em>Enum Neos Solver Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Neos Solver Name</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverName
	 * @generated
	 */
	EEnum getEnumNeosSolverName();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.solver.solverneos.EnumNeosSolverInput <em>Enum Neos Solver Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Neos Solver Input</em>'.
	 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverInput
	 * @generated
	 */
	EEnum getEnumNeosSolverInput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SolverneosFactory getSolverneosFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl <em>Solver Neos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.solverneos.impl.SolverNeosImpl
		 * @see com.misc.common.moplaf.solver.solverneos.impl.SolverneosPackageImpl#getSolverNeos()
		 * @generated
		 */
		EClass SOLVER_NEOS = eINSTANCE.getSolverNeos();

		/**
		 * The meta object literal for the '<em><b>Lp Writer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVER_NEOS__LP_WRITER = eINSTANCE.getSolverNeos_LpWriter();

		/**
		 * The meta object literal for the '<em><b>Sol Reader</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVER_NEOS__SOL_READER = eINSTANCE.getSolverNeos_SolReader();

		/**
		 * The meta object literal for the '<em><b>Server Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__SERVER_HOST = eINSTANCE.getSolverNeos_ServerHost();

		/**
		 * The meta object literal for the '<em><b>Server Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__SERVER_PORT = eINSTANCE.getSolverNeos_ServerPort();

		/**
		 * The meta object literal for the '<em><b>Solver Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__SOLVER_CATEGORY = eINSTANCE.getSolverNeos_SolverCategory();

		/**
		 * The meta object literal for the '<em><b>Solver Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__SOLVER_NAME = eINSTANCE.getSolverNeos_SolverName();

		/**
		 * The meta object literal for the '<em><b>Solver Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__SOLVER_INPUT = eINSTANCE.getSolverNeos_SolverInput();

		/**
		 * The meta object literal for the '<em><b>Solver Poll Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__SOLVER_POLL_DURATION = eINSTANCE.getSolverNeos_SolverPollDuration();

		/**
		 * The meta object literal for the '<em><b>Job Submitted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__JOB_SUBMITTED = eINSTANCE.getSolverNeos_JobSubmitted();

		/**
		 * The meta object literal for the '<em><b>Job Done</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__JOB_DONE = eINSTANCE.getSolverNeos_JobDone();

		/**
		 * The meta object literal for the '<em><b>Job Result Retrieved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__JOB_RESULT_RETRIEVED = eINSTANCE.getSolverNeos_JobResultRetrieved();

		/**
		 * The meta object literal for the '<em><b>Job Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__JOB_NUMBER = eINSTANCE.getSolverNeos_JobNumber();

		/**
		 * The meta object literal for the '<em><b>Job Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__JOB_PASSWORD = eINSTANCE.getSolverNeos_JobPassword();

		/**
		 * The meta object literal for the '<em><b>Job Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__JOB_STATUS = eINSTANCE.getSolverNeos_JobStatus();

		/**
		 * The meta object literal for the '<em><b>Job Last Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__JOB_LAST_STATUS = eINSTANCE.getSolverNeos_JobLastStatus();

		/**
		 * The meta object literal for the '<em><b>Job Neos Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__JOB_NEOS_STATUS = eINSTANCE.getSolverNeos_JobNeosStatus();

		/**
		 * The meta object literal for the '<em><b>Job Submitter Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__JOB_SUBMITTER_EMAIL = eINSTANCE.getSolverNeos_JobSubmitterEmail();

		/**
		 * The meta object literal for the '<em><b>Job Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_NEOS__JOB_RESULT = eINSTANCE.getSolverNeos_JobResult();

		/**
		 * The meta object literal for the '<em><b>Retrieve Job Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER_NEOS___RETRIEVE_JOB_STATUS = eINSTANCE.getSolverNeos__RetrieveJobStatus();

		/**
		 * The meta object literal for the '<em><b>Retrieve Job Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER_NEOS___RETRIEVE_JOB_RESULT = eINSTANCE.getSolverNeos__RetrieveJobResult();

		/**
		 * The meta object literal for the '<em><b>Kill Job</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER_NEOS___KILL_JOB = eINSTANCE.getSolverNeos__KillJob();

		/**
		 * The meta object literal for the '<em><b>Submit Job</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER_NEOS___SUBMIT_JOB = eINSTANCE.getSolverNeos__SubmitJob();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.solverneos.EnumNeosSolverCategory <em>Enum Neos Solver Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverCategory
		 * @see com.misc.common.moplaf.solver.solverneos.impl.SolverneosPackageImpl#getEnumNeosSolverCategory()
		 * @generated
		 */
		EEnum ENUM_NEOS_SOLVER_CATEGORY = eINSTANCE.getEnumNeosSolverCategory();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.solverneos.EnumNeosSolverName <em>Enum Neos Solver Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverName
		 * @see com.misc.common.moplaf.solver.solverneos.impl.SolverneosPackageImpl#getEnumNeosSolverName()
		 * @generated
		 */
		EEnum ENUM_NEOS_SOLVER_NAME = eINSTANCE.getEnumNeosSolverName();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.solverneos.EnumNeosSolverInput <em>Enum Neos Solver Input</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.solverneos.EnumNeosSolverInput
		 * @see com.misc.common.moplaf.solver.solverneos.impl.SolverneosPackageImpl#getEnumNeosSolverInput()
		 * @generated
		 */
		EEnum ENUM_NEOS_SOLVER_INPUT = eINSTANCE.getEnumNeosSolverInput();

	}

} //SolverneosPackage
