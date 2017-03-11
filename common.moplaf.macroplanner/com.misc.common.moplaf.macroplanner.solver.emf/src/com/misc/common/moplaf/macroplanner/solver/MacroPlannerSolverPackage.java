/**
 */
package com.misc.common.moplaf.macroplanner.solver;

import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory
 * @model kind="package"
 * @generated
 */
public interface MacroPlannerSolverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "solver";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/macroplanner/solver/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MacroPlannerSolverPackage eINSTANCE = com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.ScenarioImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>LPs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__LPS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Scenario Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SCENARIO_START = 2;

	/**
	 * The feature id for the '<em><b>Scenario End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SCENARIO_END = 3;

	/**
	 * The feature id for the '<em><b>Selected Master Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SELECTED_MASTER_DATA = 4;

	/**
	 * The feature id for the '<em><b>Selected Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SELECTED_DATA = 5;

	/**
	 * The feature id for the '<em><b>Selected Routings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SELECTED_ROUTINGS = 6;

	/**
	 * The feature id for the '<em><b>Selected Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SELECTED_LIMITS = 7;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl <em>LP Macro Planner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPMacroPlanner()
	 * @generated
	 */
	int LP_MACRO_PLANNER = 1;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__RUN_FEEDBACK = SolverPackage.GENERATOR__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__CANCEL_FEEDBACK = SolverPackage.GENERATOR__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__RESET_FEEDBACK = SolverPackage.GENERATOR__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__CANCELED = SolverPackage.GENERATOR__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__RETURN_SUCCESS = SolverPackage.GENERATOR__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__RETURN_FEEDBACK = SolverPackage.GENERATOR__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__RETURN_INFORMATION = SolverPackage.GENERATOR__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Tuple Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__TUPLE_ROOT = SolverPackage.GENERATOR__TUPLE_ROOT;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__GOALS = SolverPackage.GENERATOR__GOALS;

	/**
	 * The feature id for the '<em><b>Generator Feature Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__GENERATOR_FEATURE_MODES = SolverPackage.GENERATOR__GENERATOR_FEATURE_MODES;

	/**
	 * The feature id for the '<em><b>Solution Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__SOLUTION_PROVIDER = SolverPackage.GENERATOR__SOLUTION_PROVIDER;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__REMARKS = SolverPackage.GENERATOR__REMARKS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__FOOTPRINT_NOF_VARS = SolverPackage.GENERATOR__FOOTPRINT_NOF_VARS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__FOOTPRINT_NOF_CONS = SolverPackage.GENERATOR__FOOTPRINT_NOF_CONS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__FOOTPRINT_NOF_TERMS = SolverPackage.GENERATOR__FOOTPRINT_NOF_TERMS;

	/**
	 * The feature id for the '<em><b>Count Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__COUNT_CONS = SolverPackage.GENERATOR__COUNT_CONS;

	/**
	 * The feature id for the '<em><b>Count Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__COUNT_VARS = SolverPackage.GENERATOR__COUNT_VARS;

	/**
	 * The feature id for the '<em><b>ELp Var Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__ELP_VAR_COUNT = SolverPackage.GENERATOR__ELP_VAR_COUNT;

	/**
	 * The feature id for the '<em><b>ELp Cons Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__ELP_CONS_COUNT = SolverPackage.GENERATOR__ELP_CONS_COUNT;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__CODE = SolverPackage.GENERATOR__CODE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__SELECTED = SolverPackage.GENERATOR__SELECTED;

	/**
	 * The feature id for the '<em><b>Bucket Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__BUCKET_SIZE = SolverPackage.GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__PRODUCT_SET = SolverPackage.GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__RESOURCE_SET = SolverPackage.GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Routing Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__ROUTING_SET = SolverPackage.GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__SCENARIO = SolverPackage.GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__TIME_LINE = SolverPackage.GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cost Routings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__COST_ROUTINGS = SolverPackage.GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cost Supplies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__COST_SUPPLIES = SolverPackage.GENERATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Cost Capacities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__COST_CAPACITIES = SolverPackage.GENERATOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cost Availabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__COST_AVAILABILITIES = SolverPackage.GENERATOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Penalty Capacities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__PENALTY_CAPACITIES = SolverPackage.GENERATOR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Penalty Availabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER__PENALTY_AVAILABILITIES = SolverPackage.GENERATOR_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>LP Macro Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER_FEATURE_COUNT = SolverPackage.GENERATOR_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___RESET = SolverPackage.GENERATOR___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___RUN = SolverPackage.GENERATOR___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___RUN__RUNCONTEXT = SolverPackage.GENERATOR___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___CANCEL = SolverPackage.GENERATOR___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___SET_PROGRESS__STRING_FLOAT = SolverPackage.GENERATOR___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___SET_PROGRESS__PROGRESSFEEDBACK = SolverPackage.GENERATOR___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___GET_RETURN = SolverPackage.GENERATOR___GET_RETURN;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___SET_RETURN__RETURNFEEDBACK = SolverPackage.GENERATOR___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___GENERATE = SolverPackage.GENERATOR___GENERATE;

	/**
	 * The operation id for the '<em>Generate Root Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___GENERATE_ROOT_TUPLES = SolverPackage.GENERATOR___GENERATE_ROOT_TUPLES;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___GENERATE_TUPLES = SolverPackage.GENERATOR___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Generate Tuple XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___GENERATE_TUPLE_XREFERENCES = SolverPackage.GENERATOR___GENERATE_TUPLE_XREFERENCES;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___GENERATE_VARS = SolverPackage.GENERATOR___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___GENERATE_CONS = SolverPackage.GENERATOR___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___GENERATE_GOALS = SolverPackage.GENERATOR___GENERATE_GOALS;

	/**
	 * The operation id for the '<em>Accept Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___ACCEPT_SOLUTION__SOLUTION = SolverPackage.GENERATOR___ACCEPT_SOLUTION__SOLUTION;

	/**
	 * The operation id for the '<em>Select Feature Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE = SolverPackage.GENERATOR___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER___REFRESH_SELECTED_SOLUTION = SolverPackage.GENERATOR___REFRESH_SELECTED_SOLUTION;

	/**
	 * The number of operations of the '<em>LP Macro Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_MACRO_PLANNER_OPERATION_COUNT = SolverPackage.GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTupleImpl <em>LP Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPTupleImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPTuple()
	 * @generated
	 */
	int LP_TUPLE = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE__GENERATOR_AS_ROOT = SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE__TUPLE_ELEMENT = SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE__TUPLE_CONTAINER = SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE__VAR = SolverPackage.GENERATOR_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE__CONS = SolverPackage.GENERATOR_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE__NAME = SolverPackage.GENERATOR_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE__MEMBERS = SolverPackage.GENERATOR_TUPLE__MEMBERS;

	/**
	 * The number of structural features of the '<em>LP Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE_FEATURE_COUNT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE___REFRESH_SELECTED_SOLUTION = SolverPackage.GENERATOR_TUPLE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE___GENERATE_VARS = SolverPackage.GENERATOR_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE___GENERATE_CONS = SolverPackage.GENERATOR_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE___GENERATE_TUPLES = SolverPackage.GENERATOR_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE___GENERATE_XREFERENCES = SolverPackage.GENERATOR_TUPLE___GENERATE_XREFERENCES;

	/**
	 * The number of operations of the '<em>LP Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TUPLE_OPERATION_COUNT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTimeLineImpl <em>LP Time Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPTimeLineImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPTimeLine()
	 * @generated
	 */
	int LP_TIME_LINE = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE__CODE = LP_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE__GENERATOR_AS_ROOT = LP_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE__TUPLE_ELEMENT = LP_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE__TUPLE_CONTAINER = LP_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE__VAR = LP_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE__CONS = LP_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE__NAME = LP_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE__MEMBERS = LP_TUPLE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Buckets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE__BUCKETS = LP_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE__LAST_BUCKET = LP_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE__FIRST_BUCKET = LP_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE__START_BUCKET = LP_TUPLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE__END_BUCKET = LP_TUPLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>LP Time Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE_FEATURE_COUNT = LP_TUPLE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE___GET_GENERATOR = LP_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE___REFRESH_SELECTED_SOLUTION = LP_TUPLE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE___GENERATE_VARS = LP_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE___GENERATE_CONS = LP_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE___GENERATE_TUPLES = LP_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE___VISIT_TUPLES__ITUPLEVISITOR = LP_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE___GENERATE_XREFERENCES = LP_TUPLE___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Get Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE___GET_BUCKET__TIMEBUCKET = LP_TUPLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Construct Object Time Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET = LP_TUPLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE___REFRESH = LP_TUPLE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>LP Time Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_LINE_OPERATION_COUNT = LP_TUPLE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTimeBucketImpl <em>LP Time Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPTimeBucketImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPTimeBucket()
	 * @generated
	 */
	int LP_TIME_BUCKET = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET__CODE = LP_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET__GENERATOR_AS_ROOT = LP_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET__TUPLE_ELEMENT = LP_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET__TUPLE_CONTAINER = LP_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET__VAR = LP_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET__CONS = LP_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET__NAME = LP_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET__MEMBERS = LP_TUPLE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET__BUCKET = LP_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET__NEXT = LP_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET__PREVIOUS = LP_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LP Time Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET_FEATURE_COUNT = LP_TUPLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET___GET_GENERATOR = LP_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET___REFRESH_SELECTED_SOLUTION = LP_TUPLE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET___GENERATE_VARS = LP_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET___GENERATE_CONS = LP_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET___GENERATE_TUPLES = LP_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET___VISIT_TUPLES__ITUPLEVISITOR = LP_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET___GENERATE_XREFERENCES = LP_TUPLE___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET___DISPOSE = LP_TUPLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>LP Time Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_TIME_BUCKET_OPERATION_COUNT = LP_TUPLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductSetImpl <em>LP Product Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPProductSetImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPProductSet()
	 * @generated
	 */
	int LP_PRODUCT_SET = 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET__GENERATOR_AS_ROOT = SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET__TUPLE_ELEMENT = SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET__TUPLE_CONTAINER = SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET__VAR = SolverPackage.GENERATOR_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET__CONS = SolverPackage.GENERATOR_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET__NAME = SolverPackage.GENERATOR_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET__MEMBERS = SolverPackage.GENERATOR_TUPLE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Macro Planner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET__MACRO_PLANNER = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET__PRODUCTS = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LP Product Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET_FEATURE_COUNT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET___REFRESH_SELECTED_SOLUTION = SolverPackage.GENERATOR_TUPLE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET___GENERATE_VARS = SolverPackage.GENERATOR_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET___GENERATE_CONS = SolverPackage.GENERATOR_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET___GENERATE_TUPLES = SolverPackage.GENERATOR_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET___GENERATE_XREFERENCES = SolverPackage.GENERATOR_TUPLE___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Get Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET___GET_PRODUCT__LOCATIONPRODUCT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>LP Product Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_SET_OPERATION_COUNT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductImpl <em>LP Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPProductImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPProduct()
	 * @generated
	 */
	int LP_PRODUCT = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__CODE = LP_TIME_LINE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__GENERATOR_AS_ROOT = LP_TIME_LINE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__TUPLE_ELEMENT = LP_TIME_LINE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__TUPLE_CONTAINER = LP_TIME_LINE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__VAR = LP_TIME_LINE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__CONS = LP_TIME_LINE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__NAME = LP_TIME_LINE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__MEMBERS = LP_TIME_LINE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Buckets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__BUCKETS = LP_TIME_LINE__BUCKETS;

	/**
	 * The feature id for the '<em><b>Last Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__LAST_BUCKET = LP_TIME_LINE__LAST_BUCKET;

	/**
	 * The feature id for the '<em><b>First Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__FIRST_BUCKET = LP_TIME_LINE__FIRST_BUCKET;

	/**
	 * The feature id for the '<em><b>Start Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__START_BUCKET = LP_TIME_LINE__START_BUCKET;

	/**
	 * The feature id for the '<em><b>End Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__END_BUCKET = LP_TIME_LINE__END_BUCKET;

	/**
	 * The feature id for the '<em><b>Product Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__PRODUCT_SET = LP_TIME_LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supplies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__SUPPLIES = LP_TIME_LINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capacities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__CAPACITIES = LP_TIME_LINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__PRODUCT = LP_TIME_LINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>LP Buckets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT__LP_BUCKETS = LP_TIME_LINE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>LP Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_FEATURE_COUNT = LP_TIME_LINE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT___GET_GENERATOR = LP_TIME_LINE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT___REFRESH_SELECTED_SOLUTION = LP_TIME_LINE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT___GENERATE_VARS = LP_TIME_LINE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT___GENERATE_CONS = LP_TIME_LINE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT___GENERATE_TUPLES = LP_TIME_LINE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT___VISIT_TUPLES__ITUPLEVISITOR = LP_TIME_LINE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT___GENERATE_XREFERENCES = LP_TIME_LINE___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Get Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT___GET_BUCKET__TIMEBUCKET = LP_TIME_LINE___GET_BUCKET__TIMEBUCKET;

	/**
	 * The operation id for the '<em>Construct Object Time Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT___CONSTRUCT_OBJECT_TIME_BUCKET = LP_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT___REFRESH = LP_TIME_LINE___REFRESH;

	/**
	 * The number of operations of the '<em>LP Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_OPERATION_COUNT = LP_TIME_LINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl <em>LP Product Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPProductBucket()
	 * @generated
	 */
	int LP_PRODUCT_BUCKET = 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__CODE = LP_TIME_BUCKET__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__GENERATOR_AS_ROOT = LP_TIME_BUCKET__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__TUPLE_ELEMENT = LP_TIME_BUCKET__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__TUPLE_CONTAINER = LP_TIME_BUCKET__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__VAR = LP_TIME_BUCKET__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__CONS = LP_TIME_BUCKET__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__NAME = LP_TIME_BUCKET__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__MEMBERS = LP_TIME_BUCKET__MEMBERS;

	/**
	 * The feature id for the '<em><b>Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__BUCKET = LP_TIME_BUCKET__BUCKET;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__NEXT = LP_TIME_BUCKET__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__PREVIOUS = LP_TIME_BUCKET__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__PRODUCT = LP_TIME_BUCKET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__CAPACITIES = LP_TIME_BUCKET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supplies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__SUPPLIES = LP_TIME_BUCKET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Consumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__CONSUMPTIONS = LP_TIME_BUCKET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Consumed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__CONSUMED = LP_TIME_BUCKET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Supplied</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__SUPPLIED = LP_TIME_BUCKET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stocked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__STOCKED = LP_TIME_BUCKET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Calc Consumed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__CALC_CONSUMED = LP_TIME_BUCKET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Calc Supplied</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__CALC_SUPPLIED = LP_TIME_BUCKET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Calc Stocked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__CALC_STOCKED = LP_TIME_BUCKET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET__BALANCE = LP_TIME_BUCKET_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>LP Product Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET_FEATURE_COUNT = LP_TIME_BUCKET_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET___GET_GENERATOR = LP_TIME_BUCKET___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET___REFRESH_SELECTED_SOLUTION = LP_TIME_BUCKET___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET___GENERATE_VARS = LP_TIME_BUCKET___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET___GENERATE_CONS = LP_TIME_BUCKET___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET___GENERATE_TUPLES = LP_TIME_BUCKET___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET___VISIT_TUPLES__ITUPLEVISITOR = LP_TIME_BUCKET___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET___GENERATE_XREFERENCES = LP_TIME_BUCKET___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET___DISPOSE = LP_TIME_BUCKET___DISPOSE;

	/**
	 * The number of operations of the '<em>LP Product Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_PRODUCT_BUCKET_OPERATION_COUNT = LP_TIME_BUCKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyImpl <em>LP Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPSupply()
	 * @generated
	 */
	int LP_SUPPLY = 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__CODE = LP_TIME_LINE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__GENERATOR_AS_ROOT = LP_TIME_LINE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__TUPLE_ELEMENT = LP_TIME_LINE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__TUPLE_CONTAINER = LP_TIME_LINE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__VAR = LP_TIME_LINE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__CONS = LP_TIME_LINE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__NAME = LP_TIME_LINE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__MEMBERS = LP_TIME_LINE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Buckets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__BUCKETS = LP_TIME_LINE__BUCKETS;

	/**
	 * The feature id for the '<em><b>Last Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__LAST_BUCKET = LP_TIME_LINE__LAST_BUCKET;

	/**
	 * The feature id for the '<em><b>First Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__FIRST_BUCKET = LP_TIME_LINE__FIRST_BUCKET;

	/**
	 * The feature id for the '<em><b>Start Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__START_BUCKET = LP_TIME_LINE__START_BUCKET;

	/**
	 * The feature id for the '<em><b>End Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__END_BUCKET = LP_TIME_LINE__END_BUCKET;

	/**
	 * The feature id for the '<em><b>Supply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__SUPPLY = LP_TIME_LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>LP Buckets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__LP_BUCKETS = LP_TIME_LINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY__PRODUCT = LP_TIME_LINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LP Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_FEATURE_COUNT = LP_TIME_LINE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY___GET_GENERATOR = LP_TIME_LINE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY___REFRESH_SELECTED_SOLUTION = LP_TIME_LINE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY___GENERATE_VARS = LP_TIME_LINE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY___GENERATE_CONS = LP_TIME_LINE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY___GENERATE_TUPLES = LP_TIME_LINE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY___VISIT_TUPLES__ITUPLEVISITOR = LP_TIME_LINE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY___GENERATE_XREFERENCES = LP_TIME_LINE___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Get Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY___GET_BUCKET__TIMEBUCKET = LP_TIME_LINE___GET_BUCKET__TIMEBUCKET;

	/**
	 * The operation id for the '<em>Construct Object Time Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY___CONSTRUCT_OBJECT_TIME_BUCKET = LP_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY___REFRESH = LP_TIME_LINE___REFRESH;

	/**
	 * The number of operations of the '<em>LP Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_OPERATION_COUNT = LP_TIME_LINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyBucketImpl <em>LP Supply Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyBucketImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPSupplyBucket()
	 * @generated
	 */
	int LP_SUPPLY_BUCKET = 9;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__CODE = LP_TIME_BUCKET__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__GENERATOR_AS_ROOT = LP_TIME_BUCKET__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__TUPLE_ELEMENT = LP_TIME_BUCKET__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__TUPLE_CONTAINER = LP_TIME_BUCKET__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__VAR = LP_TIME_BUCKET__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__CONS = LP_TIME_BUCKET__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__NAME = LP_TIME_BUCKET__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__MEMBERS = LP_TIME_BUCKET__MEMBERS;

	/**
	 * The feature id for the '<em><b>Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__BUCKET = LP_TIME_BUCKET__BUCKET;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__NEXT = LP_TIME_BUCKET__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__PREVIOUS = LP_TIME_BUCKET__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Supply</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__SUPPLY = LP_TIME_BUCKET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__PRODUCT_BUCKET = LP_TIME_BUCKET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supplied</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__SUPPLIED = LP_TIME_BUCKET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET__FRACTION = LP_TIME_BUCKET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>LP Supply Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET_FEATURE_COUNT = LP_TIME_BUCKET_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET___GET_GENERATOR = LP_TIME_BUCKET___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET___REFRESH_SELECTED_SOLUTION = LP_TIME_BUCKET___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET___GENERATE_VARS = LP_TIME_BUCKET___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET___GENERATE_CONS = LP_TIME_BUCKET___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET___GENERATE_TUPLES = LP_TIME_BUCKET___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET___VISIT_TUPLES__ITUPLEVISITOR = LP_TIME_BUCKET___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET___GENERATE_XREFERENCES = LP_TIME_BUCKET___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET___DISPOSE = LP_TIME_BUCKET___DISPOSE;

	/**
	 * The number of operations of the '<em>LP Supply Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_SUPPLY_BUCKET_OPERATION_COUNT = LP_TIME_BUCKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityImpl <em>LP Capacity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPCapacity()
	 * @generated
	 */
	int LP_CAPACITY = 10;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__CODE = LP_TIME_LINE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__GENERATOR_AS_ROOT = LP_TIME_LINE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__TUPLE_ELEMENT = LP_TIME_LINE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__TUPLE_CONTAINER = LP_TIME_LINE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__VAR = LP_TIME_LINE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__CONS = LP_TIME_LINE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__NAME = LP_TIME_LINE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__MEMBERS = LP_TIME_LINE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Buckets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__BUCKETS = LP_TIME_LINE__BUCKETS;

	/**
	 * The feature id for the '<em><b>Last Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__LAST_BUCKET = LP_TIME_LINE__LAST_BUCKET;

	/**
	 * The feature id for the '<em><b>First Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__FIRST_BUCKET = LP_TIME_LINE__FIRST_BUCKET;

	/**
	 * The feature id for the '<em><b>Start Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__START_BUCKET = LP_TIME_LINE__START_BUCKET;

	/**
	 * The feature id for the '<em><b>End Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__END_BUCKET = LP_TIME_LINE__END_BUCKET;

	/**
	 * The feature id for the '<em><b>Product</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__PRODUCT = LP_TIME_LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__CAPACITY = LP_TIME_LINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>LP Buckets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY__LP_BUCKETS = LP_TIME_LINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LP Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_FEATURE_COUNT = LP_TIME_LINE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY___GET_GENERATOR = LP_TIME_LINE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY___REFRESH_SELECTED_SOLUTION = LP_TIME_LINE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY___GENERATE_VARS = LP_TIME_LINE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY___GENERATE_CONS = LP_TIME_LINE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY___GENERATE_TUPLES = LP_TIME_LINE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY___VISIT_TUPLES__ITUPLEVISITOR = LP_TIME_LINE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY___GENERATE_XREFERENCES = LP_TIME_LINE___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Get Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY___GET_BUCKET__TIMEBUCKET = LP_TIME_LINE___GET_BUCKET__TIMEBUCKET;

	/**
	 * The operation id for the '<em>Construct Object Time Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY___CONSTRUCT_OBJECT_TIME_BUCKET = LP_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY___REFRESH = LP_TIME_LINE___REFRESH;

	/**
	 * The number of operations of the '<em>LP Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_OPERATION_COUNT = LP_TIME_LINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityBucketImpl <em>LP Capacity Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityBucketImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPCapacityBucket()
	 * @generated
	 */
	int LP_CAPACITY_BUCKET = 11;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__CODE = LP_TIME_BUCKET__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__GENERATOR_AS_ROOT = LP_TIME_BUCKET__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__TUPLE_ELEMENT = LP_TIME_BUCKET__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__TUPLE_CONTAINER = LP_TIME_BUCKET__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__VAR = LP_TIME_BUCKET__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__CONS = LP_TIME_BUCKET__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__NAME = LP_TIME_BUCKET__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__MEMBERS = LP_TIME_BUCKET__MEMBERS;

	/**
	 * The feature id for the '<em><b>Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__BUCKET = LP_TIME_BUCKET__BUCKET;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__NEXT = LP_TIME_BUCKET__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__PREVIOUS = LP_TIME_BUCKET__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__CAPACITY = LP_TIME_BUCKET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__PRODUCT_BUCKET = LP_TIME_BUCKET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stocked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__STOCKED = LP_TIME_BUCKET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Slack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__SLACK = LP_TIME_BUCKET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET__BALANCE = LP_TIME_BUCKET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>LP Capacity Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET_FEATURE_COUNT = LP_TIME_BUCKET_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET___GET_GENERATOR = LP_TIME_BUCKET___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET___REFRESH_SELECTED_SOLUTION = LP_TIME_BUCKET___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET___GENERATE_VARS = LP_TIME_BUCKET___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET___GENERATE_CONS = LP_TIME_BUCKET___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET___GENERATE_TUPLES = LP_TIME_BUCKET___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET___VISIT_TUPLES__ITUPLEVISITOR = LP_TIME_BUCKET___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET___GENERATE_XREFERENCES = LP_TIME_BUCKET___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET___DISPOSE = LP_TIME_BUCKET___DISPOSE;

	/**
	 * The number of operations of the '<em>LP Capacity Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_CAPACITY_BUCKET_OPERATION_COUNT = LP_TIME_BUCKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceSetImpl <em>LP Resource Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPResourceSetImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPResourceSet()
	 * @generated
	 */
	int LP_RESOURCE_SET = 12;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET__CODE = LP_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET__GENERATOR_AS_ROOT = LP_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET__TUPLE_ELEMENT = LP_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET__TUPLE_CONTAINER = LP_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET__VAR = LP_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET__CONS = LP_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET__NAME = LP_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET__MEMBERS = LP_TUPLE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Macro Planner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET__MACRO_PLANNER = LP_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET__RESOURCES = LP_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LP Resource Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET_FEATURE_COUNT = LP_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET___GET_GENERATOR = LP_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET___REFRESH_SELECTED_SOLUTION = LP_TUPLE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET___GENERATE_VARS = LP_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET___GENERATE_CONS = LP_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET___GENERATE_TUPLES = LP_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET___VISIT_TUPLES__ITUPLEVISITOR = LP_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET___GENERATE_XREFERENCES = LP_TUPLE___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Get Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET___GET_RESOURCE__LOCATIONRESOURCE = LP_TUPLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>LP Resource Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_SET_OPERATION_COUNT = LP_TUPLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceImpl <em>LP Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPResourceImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPResource()
	 * @generated
	 */
	int LP_RESOURCE = 13;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__CODE = LP_TIME_LINE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__GENERATOR_AS_ROOT = LP_TIME_LINE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__TUPLE_ELEMENT = LP_TIME_LINE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__TUPLE_CONTAINER = LP_TIME_LINE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__VAR = LP_TIME_LINE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__CONS = LP_TIME_LINE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__NAME = LP_TIME_LINE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__MEMBERS = LP_TIME_LINE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Buckets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__BUCKETS = LP_TIME_LINE__BUCKETS;

	/**
	 * The feature id for the '<em><b>Last Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__LAST_BUCKET = LP_TIME_LINE__LAST_BUCKET;

	/**
	 * The feature id for the '<em><b>First Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__FIRST_BUCKET = LP_TIME_LINE__FIRST_BUCKET;

	/**
	 * The feature id for the '<em><b>Start Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__START_BUCKET = LP_TIME_LINE__START_BUCKET;

	/**
	 * The feature id for the '<em><b>End Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__END_BUCKET = LP_TIME_LINE__END_BUCKET;

	/**
	 * The feature id for the '<em><b>Resource Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__RESOURCE_SET = LP_TIME_LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Availabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__AVAILABILITIES = LP_TIME_LINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__RESOURCE = LP_TIME_LINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>LP Buckets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE__LP_BUCKETS = LP_TIME_LINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>LP Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_FEATURE_COUNT = LP_TIME_LINE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE___GET_GENERATOR = LP_TIME_LINE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE___REFRESH_SELECTED_SOLUTION = LP_TIME_LINE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE___GENERATE_VARS = LP_TIME_LINE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE___GENERATE_CONS = LP_TIME_LINE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE___GENERATE_TUPLES = LP_TIME_LINE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE___VISIT_TUPLES__ITUPLEVISITOR = LP_TIME_LINE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE___GENERATE_XREFERENCES = LP_TIME_LINE___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Get Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE___GET_BUCKET__TIMEBUCKET = LP_TIME_LINE___GET_BUCKET__TIMEBUCKET;

	/**
	 * The operation id for the '<em>Construct Object Time Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE___CONSTRUCT_OBJECT_TIME_BUCKET = LP_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE___REFRESH = LP_TIME_LINE___REFRESH;

	/**
	 * The number of operations of the '<em>LP Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_OPERATION_COUNT = LP_TIME_LINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl <em>LP Resource Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPResourceBucket()
	 * @generated
	 */
	int LP_RESOURCE_BUCKET = 14;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__CODE = LP_TIME_BUCKET__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__GENERATOR_AS_ROOT = LP_TIME_BUCKET__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__TUPLE_ELEMENT = LP_TIME_BUCKET__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__TUPLE_CONTAINER = LP_TIME_BUCKET__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__VAR = LP_TIME_BUCKET__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__CONS = LP_TIME_BUCKET__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__NAME = LP_TIME_BUCKET__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__MEMBERS = LP_TIME_BUCKET__MEMBERS;

	/**
	 * The feature id for the '<em><b>Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__BUCKET = LP_TIME_BUCKET__BUCKET;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__NEXT = LP_TIME_BUCKET__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__PREVIOUS = LP_TIME_BUCKET__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__RESOURCE = LP_TIME_BUCKET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Availabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__AVAILABILITIES = LP_TIME_BUCKET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reservations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__RESERVATIONS = LP_TIME_BUCKET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reserved</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__RESERVED = LP_TIME_BUCKET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Planned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__PLANNED = LP_TIME_BUCKET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Calc Reserved</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__CALC_RESERVED = LP_TIME_BUCKET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Calc Planned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__CALC_PLANNED = LP_TIME_BUCKET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET__BALANCE = LP_TIME_BUCKET_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>LP Resource Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET_FEATURE_COUNT = LP_TIME_BUCKET_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET___GET_GENERATOR = LP_TIME_BUCKET___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET___REFRESH_SELECTED_SOLUTION = LP_TIME_BUCKET___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET___GENERATE_VARS = LP_TIME_BUCKET___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET___GENERATE_CONS = LP_TIME_BUCKET___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET___GENERATE_TUPLES = LP_TIME_BUCKET___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET___VISIT_TUPLES__ITUPLEVISITOR = LP_TIME_BUCKET___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET___GENERATE_XREFERENCES = LP_TIME_BUCKET___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET___DISPOSE = LP_TIME_BUCKET___DISPOSE;

	/**
	 * The number of operations of the '<em>LP Resource Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_RESOURCE_BUCKET_OPERATION_COUNT = LP_TIME_BUCKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityImpl <em>LP Availability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPAvailability()
	 * @generated
	 */
	int LP_AVAILABILITY = 15;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__CODE = LP_TIME_LINE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__GENERATOR_AS_ROOT = LP_TIME_LINE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__TUPLE_ELEMENT = LP_TIME_LINE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__TUPLE_CONTAINER = LP_TIME_LINE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__VAR = LP_TIME_LINE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__CONS = LP_TIME_LINE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__NAME = LP_TIME_LINE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__MEMBERS = LP_TIME_LINE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Buckets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__BUCKETS = LP_TIME_LINE__BUCKETS;

	/**
	 * The feature id for the '<em><b>Last Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__LAST_BUCKET = LP_TIME_LINE__LAST_BUCKET;

	/**
	 * The feature id for the '<em><b>First Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__FIRST_BUCKET = LP_TIME_LINE__FIRST_BUCKET;

	/**
	 * The feature id for the '<em><b>Start Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__START_BUCKET = LP_TIME_LINE__START_BUCKET;

	/**
	 * The feature id for the '<em><b>End Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__END_BUCKET = LP_TIME_LINE__END_BUCKET;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__RESOURCE = LP_TIME_LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__AVAILABILITY = LP_TIME_LINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>LP Buckets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY__LP_BUCKETS = LP_TIME_LINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LP Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_FEATURE_COUNT = LP_TIME_LINE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY___GET_GENERATOR = LP_TIME_LINE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY___REFRESH_SELECTED_SOLUTION = LP_TIME_LINE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY___GENERATE_VARS = LP_TIME_LINE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY___GENERATE_CONS = LP_TIME_LINE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY___GENERATE_TUPLES = LP_TIME_LINE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY___VISIT_TUPLES__ITUPLEVISITOR = LP_TIME_LINE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY___GENERATE_XREFERENCES = LP_TIME_LINE___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Get Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY___GET_BUCKET__TIMEBUCKET = LP_TIME_LINE___GET_BUCKET__TIMEBUCKET;

	/**
	 * The operation id for the '<em>Construct Object Time Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY___CONSTRUCT_OBJECT_TIME_BUCKET = LP_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY___REFRESH = LP_TIME_LINE___REFRESH;

	/**
	 * The number of operations of the '<em>LP Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_OPERATION_COUNT = LP_TIME_LINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityBucketImpl <em>LP Availability Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityBucketImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPAvailabilityBucket()
	 * @generated
	 */
	int LP_AVAILABILITY_BUCKET = 16;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__CODE = LP_TIME_BUCKET__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__GENERATOR_AS_ROOT = LP_TIME_BUCKET__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__TUPLE_ELEMENT = LP_TIME_BUCKET__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__TUPLE_CONTAINER = LP_TIME_BUCKET__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__VAR = LP_TIME_BUCKET__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__CONS = LP_TIME_BUCKET__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__NAME = LP_TIME_BUCKET__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__MEMBERS = LP_TIME_BUCKET__MEMBERS;

	/**
	 * The feature id for the '<em><b>Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__BUCKET = LP_TIME_BUCKET__BUCKET;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__NEXT = LP_TIME_BUCKET__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__PREVIOUS = LP_TIME_BUCKET__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__AVAILABILITY = LP_TIME_BUCKET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__RESOURCE_BUCKET = LP_TIME_BUCKET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reserved</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__RESERVED = LP_TIME_BUCKET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Slack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__SLACK = LP_TIME_BUCKET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET__BALANCE = LP_TIME_BUCKET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>LP Availability Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET_FEATURE_COUNT = LP_TIME_BUCKET_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET___GET_GENERATOR = LP_TIME_BUCKET___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET___REFRESH_SELECTED_SOLUTION = LP_TIME_BUCKET___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET___GENERATE_VARS = LP_TIME_BUCKET___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET___GENERATE_CONS = LP_TIME_BUCKET___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET___GENERATE_TUPLES = LP_TIME_BUCKET___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET___VISIT_TUPLES__ITUPLEVISITOR = LP_TIME_BUCKET___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET___GENERATE_XREFERENCES = LP_TIME_BUCKET___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET___DISPOSE = LP_TIME_BUCKET___DISPOSE;

	/**
	 * The number of operations of the '<em>LP Availability Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_AVAILABILITY_BUCKET_OPERATION_COUNT = LP_TIME_BUCKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingSetImpl <em>LP Routing Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingSetImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPRoutingSet()
	 * @generated
	 */
	int LP_ROUTING_SET = 17;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET__CODE = LP_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET__GENERATOR_AS_ROOT = LP_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET__TUPLE_ELEMENT = LP_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET__TUPLE_CONTAINER = LP_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET__VAR = LP_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET__CONS = LP_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET__NAME = LP_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET__MEMBERS = LP_TUPLE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Macro Planner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET__MACRO_PLANNER = LP_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Routings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET__ROUTINGS = LP_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LP Routing Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET_FEATURE_COUNT = LP_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET___GET_GENERATOR = LP_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET___REFRESH_SELECTED_SOLUTION = LP_TUPLE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET___GENERATE_VARS = LP_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET___GENERATE_CONS = LP_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET___GENERATE_TUPLES = LP_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET___VISIT_TUPLES__ITUPLEVISITOR = LP_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET___GENERATE_XREFERENCES = LP_TUPLE___GENERATE_XREFERENCES;

	/**
	 * The number of operations of the '<em>LP Routing Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_SET_OPERATION_COUNT = LP_TUPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingImpl <em>LP Routing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPRouting()
	 * @generated
	 */
	int LP_ROUTING = 18;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__CODE = LP_TIME_LINE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__GENERATOR_AS_ROOT = LP_TIME_LINE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__TUPLE_ELEMENT = LP_TIME_LINE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__TUPLE_CONTAINER = LP_TIME_LINE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__VAR = LP_TIME_LINE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__CONS = LP_TIME_LINE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__NAME = LP_TIME_LINE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__MEMBERS = LP_TIME_LINE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Buckets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__BUCKETS = LP_TIME_LINE__BUCKETS;

	/**
	 * The feature id for the '<em><b>Last Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__LAST_BUCKET = LP_TIME_LINE__LAST_BUCKET;

	/**
	 * The feature id for the '<em><b>First Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__FIRST_BUCKET = LP_TIME_LINE__FIRST_BUCKET;

	/**
	 * The feature id for the '<em><b>Start Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__START_BUCKET = LP_TIME_LINE__START_BUCKET;

	/**
	 * The feature id for the '<em><b>End Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__END_BUCKET = LP_TIME_LINE__END_BUCKET;

	/**
	 * The feature id for the '<em><b>Routing Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__ROUTING_SET = LP_TIME_LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__ROUTING = LP_TIME_LINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>LP Buckets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__LP_BUCKETS = LP_TIME_LINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__PRODUCTS = LP_TIME_LINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING__RESOURCES = LP_TIME_LINE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>LP Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_FEATURE_COUNT = LP_TIME_LINE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING___GET_GENERATOR = LP_TIME_LINE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING___REFRESH_SELECTED_SOLUTION = LP_TIME_LINE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING___GENERATE_VARS = LP_TIME_LINE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING___GENERATE_CONS = LP_TIME_LINE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING___GENERATE_TUPLES = LP_TIME_LINE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING___VISIT_TUPLES__ITUPLEVISITOR = LP_TIME_LINE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING___GENERATE_XREFERENCES = LP_TIME_LINE___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Get Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING___GET_BUCKET__TIMEBUCKET = LP_TIME_LINE___GET_BUCKET__TIMEBUCKET;

	/**
	 * The operation id for the '<em>Construct Object Time Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING___CONSTRUCT_OBJECT_TIME_BUCKET = LP_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING___REFRESH = LP_TIME_LINE___REFRESH;

	/**
	 * The number of operations of the '<em>LP Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_OPERATION_COUNT = LP_TIME_LINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketImpl <em>LP Routing Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPRoutingBucket()
	 * @generated
	 */
	int LP_ROUTING_BUCKET = 21;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketProductImpl <em>LP Routing Bucket Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketProductImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPRoutingBucketProduct()
	 * @generated
	 */
	int LP_ROUTING_BUCKET_PRODUCT = 22;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketResourceImpl <em>LP Routing Bucket Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketResourceImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPRoutingBucketResource()
	 * @generated
	 */
	int LP_ROUTING_BUCKET_RESOURCE = 23;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingProductImpl <em>LP Routing Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingProductImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPRoutingProduct()
	 * @generated
	 */
	int LP_ROUTING_PRODUCT = 19;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT__GENERATOR_AS_ROOT = SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT__TUPLE_ELEMENT = SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT__TUPLE_CONTAINER = SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT__VAR = SolverPackage.GENERATOR_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT__CONS = SolverPackage.GENERATOR_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT__NAME = SolverPackage.GENERATOR_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT__MEMBERS = SolverPackage.GENERATOR_TUPLE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT__ROUTING = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT__PRODUCT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Routing Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT__ROUTING_PRODUCT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>LP Buckets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT__LP_BUCKETS = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>LP Routing Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT_FEATURE_COUNT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT___REFRESH_SELECTED_SOLUTION = SolverPackage.GENERATOR_TUPLE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT___GENERATE_VARS = SolverPackage.GENERATOR_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT___GENERATE_CONS = SolverPackage.GENERATOR_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT___GENERATE_TUPLES = SolverPackage.GENERATOR_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT___GENERATE_XREFERENCES = SolverPackage.GENERATOR_TUPLE___GENERATE_XREFERENCES;

	/**
	 * The number of operations of the '<em>LP Routing Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_PRODUCT_OPERATION_COUNT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingResourceImpl <em>LP Routing Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingResourceImpl
	 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPRoutingResource()
	 * @generated
	 */
	int LP_ROUTING_RESOURCE = 20;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE__GENERATOR_AS_ROOT = SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE__TUPLE_ELEMENT = SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE__TUPLE_CONTAINER = SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE__VAR = SolverPackage.GENERATOR_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE__CONS = SolverPackage.GENERATOR_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE__NAME = SolverPackage.GENERATOR_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE__MEMBERS = SolverPackage.GENERATOR_TUPLE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE__ROUTING = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE__RESOURCE = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Routing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE__ROUTING_RESOURCE = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>LP Buckets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE__LP_BUCKETS = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>LP Routing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE_FEATURE_COUNT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE___REFRESH_SELECTED_SOLUTION = SolverPackage.GENERATOR_TUPLE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE___GENERATE_VARS = SolverPackage.GENERATOR_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE___GENERATE_CONS = SolverPackage.GENERATOR_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE___GENERATE_TUPLES = SolverPackage.GENERATOR_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE___GENERATE_XREFERENCES = SolverPackage.GENERATOR_TUPLE___GENERATE_XREFERENCES;

	/**
	 * The number of operations of the '<em>LP Routing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_RESOURCE_OPERATION_COUNT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__CODE = LP_TIME_BUCKET__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__GENERATOR_AS_ROOT = LP_TIME_BUCKET__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__TUPLE_ELEMENT = LP_TIME_BUCKET__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__TUPLE_CONTAINER = LP_TIME_BUCKET__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__VAR = LP_TIME_BUCKET__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__CONS = LP_TIME_BUCKET__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__NAME = LP_TIME_BUCKET__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__MEMBERS = LP_TIME_BUCKET__MEMBERS;

	/**
	 * The feature id for the '<em><b>Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__BUCKET = LP_TIME_BUCKET__BUCKET;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__NEXT = LP_TIME_BUCKET__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__PREVIOUS = LP_TIME_BUCKET__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__ROUTING = LP_TIME_BUCKET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__PRODUCTS = LP_TIME_BUCKET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__RESOURCES = LP_TIME_BUCKET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Planned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET__PLANNED = LP_TIME_BUCKET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>LP Routing Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_FEATURE_COUNT = LP_TIME_BUCKET_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET___GET_GENERATOR = LP_TIME_BUCKET___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET___REFRESH_SELECTED_SOLUTION = LP_TIME_BUCKET___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET___GENERATE_VARS = LP_TIME_BUCKET___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET___GENERATE_CONS = LP_TIME_BUCKET___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET___GENERATE_TUPLES = LP_TIME_BUCKET___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET___VISIT_TUPLES__ITUPLEVISITOR = LP_TIME_BUCKET___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET___GENERATE_XREFERENCES = LP_TIME_BUCKET___GENERATE_XREFERENCES;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET___DISPOSE = LP_TIME_BUCKET___DISPOSE;

	/**
	 * The number of operations of the '<em>LP Routing Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_OPERATION_COUNT = LP_TIME_BUCKET_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT__CODE = LP_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT__GENERATOR_AS_ROOT = LP_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT__TUPLE_ELEMENT = LP_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT__TUPLE_CONTAINER = LP_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT__VAR = LP_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT__CONS = LP_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT__NAME = LP_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT__MEMBERS = LP_TUPLE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Product Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT__PRODUCT_BUCKET = LP_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Routing Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT = LP_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT__ROUTING = LP_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LP Routing Bucket Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT_FEATURE_COUNT = LP_TUPLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT___GET_GENERATOR = LP_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT___REFRESH_SELECTED_SOLUTION = LP_TUPLE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT___GENERATE_VARS = LP_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT___GENERATE_CONS = LP_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT___GENERATE_TUPLES = LP_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT___VISIT_TUPLES__ITUPLEVISITOR = LP_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT___GENERATE_XREFERENCES = LP_TUPLE___GENERATE_XREFERENCES;

	/**
	 * The number of operations of the '<em>LP Routing Bucket Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_PRODUCT_OPERATION_COUNT = LP_TUPLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE__CODE = LP_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE__GENERATOR_AS_ROOT = LP_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE__TUPLE_ELEMENT = LP_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE__TUPLE_CONTAINER = LP_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE__VAR = LP_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE__CONS = LP_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE__NAME = LP_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE__MEMBERS = LP_TUPLE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Resource Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE__RESOURCE_BUCKET = LP_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Routing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE = LP_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE__ROUTING = LP_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LP Routing Bucket Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE_FEATURE_COUNT = LP_TUPLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE___GET_GENERATOR = LP_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE___REFRESH_SELECTED_SOLUTION = LP_TUPLE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE___GENERATE_VARS = LP_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE___GENERATE_CONS = LP_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE___GENERATE_TUPLES = LP_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE___VISIT_TUPLES__ITUPLEVISITOR = LP_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE___GENERATE_XREFERENCES = LP_TUPLE___GENERATE_XREFERENCES;

	/**
	 * The number of operations of the '<em>LP Routing Bucket Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROUTING_BUCKET_RESOURCE_OPERATION_COUNT = LP_TUPLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getLPs <em>LPs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LPs</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.Scenario#getLPs()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_LPs();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getScenarioStart <em>Scenario Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scenario Start</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.Scenario#getScenarioStart()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_ScenarioStart();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getScenarioEnd <em>Scenario End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scenario End</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.Scenario#getScenarioEnd()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_ScenarioEnd();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getSelectedMasterData <em>Selected Master Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Master Data</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.Scenario#getSelectedMasterData()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_SelectedMasterData();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getSelectedData <em>Selected Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Data</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.Scenario#getSelectedData()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_SelectedData();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getSelectedRoutings <em>Selected Routings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Routings</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.Scenario#getSelectedRoutings()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_SelectedRoutings();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getSelectedLimits <em>Selected Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Limits</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.Scenario#getSelectedLimits()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_SelectedLimits();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner <em>LP Macro Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Macro Planner</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner
	 * @generated
	 */
	EClass getLPMacroPlanner();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getBucketSize <em>Bucket Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket Size</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getBucketSize()
	 * @see #getLPMacroPlanner()
	 * @generated
	 */
	EAttribute getLPMacroPlanner_BucketSize();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getProductSet <em>Product Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product Set</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getProductSet()
	 * @see #getLPMacroPlanner()
	 * @generated
	 */
	EReference getLPMacroPlanner_ProductSet();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getResourceSet <em>Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Set</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getResourceSet()
	 * @see #getLPMacroPlanner()
	 * @generated
	 */
	EReference getLPMacroPlanner_ResourceSet();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getRoutingSet <em>Routing Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Routing Set</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getRoutingSet()
	 * @see #getLPMacroPlanner()
	 * @generated
	 */
	EReference getLPMacroPlanner_RoutingSet();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getScenario()
	 * @see #getLPMacroPlanner()
	 * @generated
	 */
	EReference getLPMacroPlanner_Scenario();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getTimeLine <em>Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Line</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getTimeLine()
	 * @see #getLPMacroPlanner()
	 * @generated
	 */
	EReference getLPMacroPlanner_TimeLine();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostRoutings <em>Cost Routings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cost Routings</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostRoutings()
	 * @see #getLPMacroPlanner()
	 * @generated
	 */
	EReference getLPMacroPlanner_CostRoutings();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostSupplies <em>Cost Supplies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cost Supplies</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostSupplies()
	 * @see #getLPMacroPlanner()
	 * @generated
	 */
	EReference getLPMacroPlanner_CostSupplies();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostCapacities <em>Cost Capacities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cost Capacities</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostCapacities()
	 * @see #getLPMacroPlanner()
	 * @generated
	 */
	EReference getLPMacroPlanner_CostCapacities();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostAvailabilities <em>Cost Availabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cost Availabilities</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostAvailabilities()
	 * @see #getLPMacroPlanner()
	 * @generated
	 */
	EReference getLPMacroPlanner_CostAvailabilities();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getPenaltyCapacities <em>Penalty Capacities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Penalty Capacities</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getPenaltyCapacities()
	 * @see #getLPMacroPlanner()
	 * @generated
	 */
	EReference getLPMacroPlanner_PenaltyCapacities();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getPenaltyAvailabilities <em>Penalty Availabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Penalty Availabilities</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getPenaltyAvailabilities()
	 * @see #getLPMacroPlanner()
	 * @generated
	 */
	EReference getLPMacroPlanner_PenaltyAvailabilities();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPTuple <em>LP Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Tuple</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPTuple
	 * @generated
	 */
	EClass getLPTuple();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPTimeLine <em>LP Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Time Line</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPTimeLine
	 * @generated
	 */
	EClass getLPTimeLine();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPTimeBucket <em>LP Time Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Time Bucket</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPTimeBucket
	 * @generated
	 */
	EClass getLPTimeBucket();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPProductSet <em>LP Product Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Product Set</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductSet
	 * @generated
	 */
	EClass getLPProductSet();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPProductSet#getMacroPlanner <em>Macro Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Macro Planner</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductSet#getMacroPlanner()
	 * @see #getLPProductSet()
	 * @generated
	 */
	EReference getLPProductSet_MacroPlanner();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPProductSet#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductSet#getProducts()
	 * @see #getLPProductSet()
	 * @generated
	 */
	EReference getLPProductSet_Products();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.macroplanner.solver.LPProductSet#getProduct(com.misc.common.moplaf.macroplanner.LocationProduct) <em>Get Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Product</em>' operation.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductSet#getProduct(com.misc.common.moplaf.macroplanner.LocationProduct)
	 * @generated
	 */
	EOperation getLPProductSet__GetProduct__LocationProduct();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPProduct <em>LP Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProduct
	 * @generated
	 */
	EClass getLPProduct();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getProductSet <em>Product Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Product Set</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProduct#getProductSet()
	 * @see #getLPProduct()
	 * @generated
	 */
	EReference getLPProduct_ProductSet();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getSupplies <em>Supplies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supplies</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProduct#getSupplies()
	 * @see #getLPProduct()
	 * @generated
	 */
	EReference getLPProduct_Supplies();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getCapacities <em>Capacities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capacities</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProduct#getCapacities()
	 * @see #getLPProduct()
	 * @generated
	 */
	EReference getLPProduct_Capacities();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProduct#getProduct()
	 * @see #getLPProduct()
	 * @generated
	 */
	EReference getLPProduct_Product();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LP Buckets</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProduct#getLPBuckets()
	 * @see #getLPProduct()
	 * @generated
	 */
	EReference getLPProduct_LPBuckets();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket <em>LP Product Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Product Bucket</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket
	 * @generated
	 */
	EClass getLPProductBucket();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getProduct()
	 * @see #getLPProductBucket()
	 * @generated
	 */
	EReference getLPProductBucket_Product();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCapacities <em>Capacities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capacities</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCapacities()
	 * @see #getLPProductBucket()
	 * @generated
	 */
	EReference getLPProductBucket_Capacities();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getSupplies <em>Supplies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supplies</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getSupplies()
	 * @see #getLPProductBucket()
	 * @generated
	 */
	EReference getLPProductBucket_Supplies();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getConsumptions <em>Consumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumptions</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getConsumptions()
	 * @see #getLPProductBucket()
	 * @generated
	 */
	EReference getLPProductBucket_Consumptions();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getConsumed <em>Consumed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consumed</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getConsumed()
	 * @see #getLPProductBucket()
	 * @generated
	 */
	EReference getLPProductBucket_Consumed();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getSupplied <em>Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supplied</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getSupplied()
	 * @see #getLPProductBucket()
	 * @generated
	 */
	EReference getLPProductBucket_Supplied();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getStocked <em>Stocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stocked</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getStocked()
	 * @see #getLPProductBucket()
	 * @generated
	 */
	EReference getLPProductBucket_Stocked();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCalcConsumed <em>Calc Consumed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calc Consumed</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCalcConsumed()
	 * @see #getLPProductBucket()
	 * @generated
	 */
	EReference getLPProductBucket_CalcConsumed();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCalcSupplied <em>Calc Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calc Supplied</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCalcSupplied()
	 * @see #getLPProductBucket()
	 * @generated
	 */
	EReference getLPProductBucket_CalcSupplied();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCalcStocked <em>Calc Stocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calc Stocked</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCalcStocked()
	 * @see #getLPProductBucket()
	 * @generated
	 */
	EReference getLPProductBucket_CalcStocked();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Balance</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getBalance()
	 * @see #getLPProductBucket()
	 * @generated
	 */
	EReference getLPProductBucket_Balance();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPSupply <em>LP Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Supply</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupply
	 * @generated
	 */
	EClass getLPSupply();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPSupply#getSupply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supply</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupply#getSupply()
	 * @see #getLPSupply()
	 * @generated
	 */
	EReference getLPSupply_Supply();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPSupply#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LP Buckets</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupply#getLPBuckets()
	 * @see #getLPSupply()
	 * @generated
	 */
	EReference getLPSupply_LPBuckets();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPSupply#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupply#getProduct()
	 * @see #getLPSupply()
	 * @generated
	 */
	EReference getLPSupply_Product();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket <em>LP Supply Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Supply Bucket</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket
	 * @generated
	 */
	EClass getLPSupplyBucket();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getSupply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Supply</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getSupply()
	 * @see #getLPSupplyBucket()
	 * @generated
	 */
	EReference getLPSupplyBucket_Supply();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getProductBucket <em>Product Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Bucket</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getProductBucket()
	 * @see #getLPSupplyBucket()
	 * @generated
	 */
	EReference getLPSupplyBucket_ProductBucket();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getSupplied <em>Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supplied</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getSupplied()
	 * @see #getLPSupplyBucket()
	 * @generated
	 */
	EReference getLPSupplyBucket_Supplied();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getFraction <em>Fraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fraction</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getFraction()
	 * @see #getLPSupplyBucket()
	 * @generated
	 */
	EAttribute getLPSupplyBucket_Fraction();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacity <em>LP Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Capacity</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacity
	 * @generated
	 */
	EClass getLPCapacity();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacity#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacity#getProduct()
	 * @see #getLPCapacity()
	 * @generated
	 */
	EReference getLPCapacity_Product();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacity#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capacity</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacity#getCapacity()
	 * @see #getLPCapacity()
	 * @generated
	 */
	EReference getLPCapacity_Capacity();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacity#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LP Buckets</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacity#getLPBuckets()
	 * @see #getLPCapacity()
	 * @generated
	 */
	EReference getLPCapacity_LPBuckets();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket <em>LP Capacity Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Capacity Bucket</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket
	 * @generated
	 */
	EClass getLPCapacityBucket();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Capacity</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getCapacity()
	 * @see #getLPCapacityBucket()
	 * @generated
	 */
	EReference getLPCapacityBucket_Capacity();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getProductBucket <em>Product Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Bucket</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getProductBucket()
	 * @see #getLPCapacityBucket()
	 * @generated
	 */
	EReference getLPCapacityBucket_ProductBucket();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getStocked <em>Stocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stocked</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getStocked()
	 * @see #getLPCapacityBucket()
	 * @generated
	 */
	EReference getLPCapacityBucket_Stocked();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getSlack <em>Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slack</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getSlack()
	 * @see #getLPCapacityBucket()
	 * @generated
	 */
	EReference getLPCapacityBucket_Slack();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Balance</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getBalance()
	 * @see #getLPCapacityBucket()
	 * @generated
	 */
	EReference getLPCapacityBucket_Balance();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceSet <em>LP Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Resource Set</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceSet
	 * @generated
	 */
	EClass getLPResourceSet();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceSet#getMacroPlanner <em>Macro Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Macro Planner</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceSet#getMacroPlanner()
	 * @see #getLPResourceSet()
	 * @generated
	 */
	EReference getLPResourceSet_MacroPlanner();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceSet#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceSet#getResources()
	 * @see #getLPResourceSet()
	 * @generated
	 */
	EReference getLPResourceSet_Resources();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceSet#getResource(com.misc.common.moplaf.macroplanner.LocationResource) <em>Get Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource</em>' operation.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceSet#getResource(com.misc.common.moplaf.macroplanner.LocationResource)
	 * @generated
	 */
	EOperation getLPResourceSet__GetResource__LocationResource();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPResource <em>LP Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResource
	 * @generated
	 */
	EClass getLPResource();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPResource#getAvailabilities <em>Availabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Availabilities</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResource#getAvailabilities()
	 * @see #getLPResource()
	 * @generated
	 */
	EReference getLPResource_Availabilities();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPResource#getResourceSet <em>Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Set</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResource#getResourceSet()
	 * @see #getLPResource()
	 * @generated
	 */
	EReference getLPResource_ResourceSet();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResource#getResource()
	 * @see #getLPResource()
	 * @generated
	 */
	EReference getLPResource_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPResource#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LP Buckets</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResource#getLPBuckets()
	 * @see #getLPResource()
	 * @generated
	 */
	EReference getLPResource_LPBuckets();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket <em>LP Resource Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Resource Bucket</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceBucket
	 * @generated
	 */
	EClass getLPResourceBucket();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getResource()
	 * @see #getLPResourceBucket()
	 * @generated
	 */
	EReference getLPResourceBucket_Resource();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getAvailabilities <em>Availabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Availabilities</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getAvailabilities()
	 * @see #getLPResourceBucket()
	 * @generated
	 */
	EReference getLPResourceBucket_Availabilities();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getReservations <em>Reservations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reservations</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getReservations()
	 * @see #getLPResourceBucket()
	 * @generated
	 */
	EReference getLPResourceBucket_Reservations();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getReserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reserved</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getReserved()
	 * @see #getLPResourceBucket()
	 * @generated
	 */
	EReference getLPResourceBucket_Reserved();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getPlanned <em>Planned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Planned</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getPlanned()
	 * @see #getLPResourceBucket()
	 * @generated
	 */
	EReference getLPResourceBucket_Planned();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getCalcReserved <em>Calc Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calc Reserved</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getCalcReserved()
	 * @see #getLPResourceBucket()
	 * @generated
	 */
	EReference getLPResourceBucket_CalcReserved();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getCalcPlanned <em>Calc Planned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calc Planned</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getCalcPlanned()
	 * @see #getLPResourceBucket()
	 * @generated
	 */
	EReference getLPResourceBucket_CalcPlanned();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Balance</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getBalance()
	 * @see #getLPResourceBucket()
	 * @generated
	 */
	EReference getLPResourceBucket_Balance();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailability <em>LP Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Availability</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailability
	 * @generated
	 */
	EClass getLPAvailability();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailability#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailability#getResource()
	 * @see #getLPAvailability()
	 * @generated
	 */
	EReference getLPAvailability_Resource();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailability#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Availability</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailability#getAvailability()
	 * @see #getLPAvailability()
	 * @generated
	 */
	EReference getLPAvailability_Availability();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailability#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LP Buckets</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailability#getLPBuckets()
	 * @see #getLPAvailability()
	 * @generated
	 */
	EReference getLPAvailability_LPBuckets();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket <em>LP Availability Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Availability Bucket</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket
	 * @generated
	 */
	EClass getLPAvailabilityBucket();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Availability</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getAvailability()
	 * @see #getLPAvailabilityBucket()
	 * @generated
	 */
	EReference getLPAvailabilityBucket_Availability();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getResourceBucket <em>Resource Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Bucket</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getResourceBucket()
	 * @see #getLPAvailabilityBucket()
	 * @generated
	 */
	EReference getLPAvailabilityBucket_ResourceBucket();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getReserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reserved</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getReserved()
	 * @see #getLPAvailabilityBucket()
	 * @generated
	 */
	EReference getLPAvailabilityBucket_Reserved();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getSlack <em>Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slack</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getSlack()
	 * @see #getLPAvailabilityBucket()
	 * @generated
	 */
	EReference getLPAvailabilityBucket_Slack();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Balance</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getBalance()
	 * @see #getLPAvailabilityBucket()
	 * @generated
	 */
	EReference getLPAvailabilityBucket_Balance();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingSet <em>LP Routing Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Routing Set</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingSet
	 * @generated
	 */
	EClass getLPRoutingSet();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingSet#getMacroPlanner <em>Macro Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Macro Planner</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingSet#getMacroPlanner()
	 * @see #getLPRoutingSet()
	 * @generated
	 */
	EReference getLPRoutingSet_MacroPlanner();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingSet#getRoutings <em>Routings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routings</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingSet#getRoutings()
	 * @see #getLPRoutingSet()
	 * @generated
	 */
	EReference getLPRoutingSet_Routings();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPRouting <em>LP Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Routing</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRouting
	 * @generated
	 */
	EClass getLPRouting();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getRoutingSet <em>Routing Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Routing Set</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRouting#getRoutingSet()
	 * @see #getLPRouting()
	 * @generated
	 */
	EReference getLPRouting_RoutingSet();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Routing</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRouting#getRouting()
	 * @see #getLPRouting()
	 * @generated
	 */
	EReference getLPRouting_Routing();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LP Buckets</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRouting#getLPBuckets()
	 * @see #getLPRouting()
	 * @generated
	 */
	EReference getLPRouting_LPBuckets();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRouting#getProducts()
	 * @see #getLPRouting()
	 * @generated
	 */
	EReference getLPRouting_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRouting#getResources()
	 * @see #getLPRouting()
	 * @generated
	 */
	EReference getLPRouting_Resources();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket <em>LP Routing Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Routing Bucket</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket
	 * @generated
	 */
	EClass getLPRoutingBucket();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Routing</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getRouting()
	 * @see #getLPRoutingBucket()
	 * @generated
	 */
	EReference getLPRoutingBucket_Routing();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getProducts()
	 * @see #getLPRoutingBucket()
	 * @generated
	 */
	EReference getLPRoutingBucket_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getResources()
	 * @see #getLPRoutingBucket()
	 * @generated
	 */
	EReference getLPRoutingBucket_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getPlanned <em>Planned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Planned</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getPlanned()
	 * @see #getLPRoutingBucket()
	 * @generated
	 */
	EReference getLPRoutingBucket_Planned();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct <em>LP Routing Bucket Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Routing Bucket Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct
	 * @generated
	 */
	EClass getLPRoutingBucketProduct();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getProductBucket <em>Product Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Bucket</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getProductBucket()
	 * @see #getLPRoutingBucketProduct()
	 * @generated
	 */
	EReference getLPRoutingBucketProduct_ProductBucket();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getRoutingProduct <em>Routing Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Routing Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getRoutingProduct()
	 * @see #getLPRoutingBucketProduct()
	 * @generated
	 */
	EReference getLPRoutingBucketProduct_RoutingProduct();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Routing</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getRouting()
	 * @see #getLPRoutingBucketProduct()
	 * @generated
	 */
	EReference getLPRoutingBucketProduct_Routing();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource <em>LP Routing Bucket Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Routing Bucket Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource
	 * @generated
	 */
	EClass getLPRoutingBucketResource();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getResourceBucket <em>Resource Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Bucket</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getResourceBucket()
	 * @see #getLPRoutingBucketResource()
	 * @generated
	 */
	EReference getLPRoutingBucketResource_ResourceBucket();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getRoutingResource <em>Routing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Routing Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getRoutingResource()
	 * @see #getLPRoutingBucketResource()
	 * @generated
	 */
	EReference getLPRoutingBucketResource_RoutingResource();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Routing</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getRouting()
	 * @see #getLPRoutingBucketResource()
	 * @generated
	 */
	EReference getLPRoutingBucketResource_Routing();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct <em>LP Routing Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Routing Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct
	 * @generated
	 */
	EClass getLPRoutingProduct();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Routing</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getRouting()
	 * @see #getLPRoutingProduct()
	 * @generated
	 */
	EReference getLPRoutingProduct_Routing();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getProduct()
	 * @see #getLPRoutingProduct()
	 * @generated
	 */
	EReference getLPRoutingProduct_Product();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getRoutingProduct <em>Routing Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Routing Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getRoutingProduct()
	 * @see #getLPRoutingProduct()
	 * @generated
	 */
	EReference getLPRoutingProduct_RoutingProduct();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>LP Buckets</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getLPBuckets()
	 * @see #getLPRoutingProduct()
	 * @generated
	 */
	EReference getLPRoutingProduct_LPBuckets();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource <em>LP Routing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LP Routing Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingResource
	 * @generated
	 */
	EClass getLPRoutingResource();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Routing</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getRouting()
	 * @see #getLPRoutingResource()
	 * @generated
	 */
	EReference getLPRoutingResource_Routing();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getResource()
	 * @see #getLPRoutingResource()
	 * @generated
	 */
	EReference getLPRoutingResource_Resource();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getRoutingResource <em>Routing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Routing Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getRoutingResource()
	 * @see #getLPRoutingResource()
	 * @generated
	 */
	EReference getLPRoutingResource_RoutingResource();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>LP Buckets</em>'.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getLPBuckets()
	 * @see #getLPRoutingResource()
	 * @generated
	 */
	EReference getLPRoutingResource_LPBuckets();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MacroPlannerSolverFactory getMacroPlannerSolverFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.ScenarioImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>LPs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__LPS = eINSTANCE.getScenario_LPs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Scenario Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__SCENARIO_START = eINSTANCE.getScenario_ScenarioStart();

		/**
		 * The meta object literal for the '<em><b>Scenario End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__SCENARIO_END = eINSTANCE.getScenario_ScenarioEnd();

		/**
		 * The meta object literal for the '<em><b>Selected Master Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SELECTED_MASTER_DATA = eINSTANCE.getScenario_SelectedMasterData();

		/**
		 * The meta object literal for the '<em><b>Selected Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SELECTED_DATA = eINSTANCE.getScenario_SelectedData();

		/**
		 * The meta object literal for the '<em><b>Selected Routings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SELECTED_ROUTINGS = eINSTANCE.getScenario_SelectedRoutings();

		/**
		 * The meta object literal for the '<em><b>Selected Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SELECTED_LIMITS = eINSTANCE.getScenario_SelectedLimits();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl <em>LP Macro Planner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPMacroPlanner()
		 * @generated
		 */
		EClass LP_MACRO_PLANNER = eINSTANCE.getLPMacroPlanner();

		/**
		 * The meta object literal for the '<em><b>Bucket Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LP_MACRO_PLANNER__BUCKET_SIZE = eINSTANCE.getLPMacroPlanner_BucketSize();

		/**
		 * The meta object literal for the '<em><b>Product Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_MACRO_PLANNER__PRODUCT_SET = eINSTANCE.getLPMacroPlanner_ProductSet();

		/**
		 * The meta object literal for the '<em><b>Resource Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_MACRO_PLANNER__RESOURCE_SET = eINSTANCE.getLPMacroPlanner_ResourceSet();

		/**
		 * The meta object literal for the '<em><b>Routing Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_MACRO_PLANNER__ROUTING_SET = eINSTANCE.getLPMacroPlanner_RoutingSet();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_MACRO_PLANNER__SCENARIO = eINSTANCE.getLPMacroPlanner_Scenario();

		/**
		 * The meta object literal for the '<em><b>Time Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_MACRO_PLANNER__TIME_LINE = eINSTANCE.getLPMacroPlanner_TimeLine();

		/**
		 * The meta object literal for the '<em><b>Cost Routings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_MACRO_PLANNER__COST_ROUTINGS = eINSTANCE.getLPMacroPlanner_CostRoutings();

		/**
		 * The meta object literal for the '<em><b>Cost Supplies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_MACRO_PLANNER__COST_SUPPLIES = eINSTANCE.getLPMacroPlanner_CostSupplies();

		/**
		 * The meta object literal for the '<em><b>Cost Capacities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_MACRO_PLANNER__COST_CAPACITIES = eINSTANCE.getLPMacroPlanner_CostCapacities();

		/**
		 * The meta object literal for the '<em><b>Cost Availabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_MACRO_PLANNER__COST_AVAILABILITIES = eINSTANCE.getLPMacroPlanner_CostAvailabilities();

		/**
		 * The meta object literal for the '<em><b>Penalty Capacities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_MACRO_PLANNER__PENALTY_CAPACITIES = eINSTANCE.getLPMacroPlanner_PenaltyCapacities();

		/**
		 * The meta object literal for the '<em><b>Penalty Availabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_MACRO_PLANNER__PENALTY_AVAILABILITIES = eINSTANCE.getLPMacroPlanner_PenaltyAvailabilities();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTupleImpl <em>LP Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPTupleImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPTuple()
		 * @generated
		 */
		EClass LP_TUPLE = eINSTANCE.getLPTuple();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTimeLineImpl <em>LP Time Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPTimeLineImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPTimeLine()
		 * @generated
		 */
		EClass LP_TIME_LINE = eINSTANCE.getLPTimeLine();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTimeBucketImpl <em>LP Time Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPTimeBucketImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPTimeBucket()
		 * @generated
		 */
		EClass LP_TIME_BUCKET = eINSTANCE.getLPTimeBucket();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductSetImpl <em>LP Product Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPProductSetImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPProductSet()
		 * @generated
		 */
		EClass LP_PRODUCT_SET = eINSTANCE.getLPProductSet();

		/**
		 * The meta object literal for the '<em><b>Macro Planner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT_SET__MACRO_PLANNER = eINSTANCE.getLPProductSet_MacroPlanner();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT_SET__PRODUCTS = eINSTANCE.getLPProductSet_Products();

		/**
		 * The meta object literal for the '<em><b>Get Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LP_PRODUCT_SET___GET_PRODUCT__LOCATIONPRODUCT = eINSTANCE.getLPProductSet__GetProduct__LocationProduct();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductImpl <em>LP Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPProductImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPProduct()
		 * @generated
		 */
		EClass LP_PRODUCT = eINSTANCE.getLPProduct();

		/**
		 * The meta object literal for the '<em><b>Product Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT__PRODUCT_SET = eINSTANCE.getLPProduct_ProductSet();

		/**
		 * The meta object literal for the '<em><b>Supplies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT__SUPPLIES = eINSTANCE.getLPProduct_Supplies();

		/**
		 * The meta object literal for the '<em><b>Capacities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT__CAPACITIES = eINSTANCE.getLPProduct_Capacities();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT__PRODUCT = eINSTANCE.getLPProduct_Product();

		/**
		 * The meta object literal for the '<em><b>LP Buckets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT__LP_BUCKETS = eINSTANCE.getLPProduct_LPBuckets();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl <em>LP Product Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPProductBucket()
		 * @generated
		 */
		EClass LP_PRODUCT_BUCKET = eINSTANCE.getLPProductBucket();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT_BUCKET__PRODUCT = eINSTANCE.getLPProductBucket_Product();

		/**
		 * The meta object literal for the '<em><b>Capacities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT_BUCKET__CAPACITIES = eINSTANCE.getLPProductBucket_Capacities();

		/**
		 * The meta object literal for the '<em><b>Supplies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT_BUCKET__SUPPLIES = eINSTANCE.getLPProductBucket_Supplies();

		/**
		 * The meta object literal for the '<em><b>Consumptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT_BUCKET__CONSUMPTIONS = eINSTANCE.getLPProductBucket_Consumptions();

		/**
		 * The meta object literal for the '<em><b>Consumed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT_BUCKET__CONSUMED = eINSTANCE.getLPProductBucket_Consumed();

		/**
		 * The meta object literal for the '<em><b>Supplied</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT_BUCKET__SUPPLIED = eINSTANCE.getLPProductBucket_Supplied();

		/**
		 * The meta object literal for the '<em><b>Stocked</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT_BUCKET__STOCKED = eINSTANCE.getLPProductBucket_Stocked();

		/**
		 * The meta object literal for the '<em><b>Calc Consumed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT_BUCKET__CALC_CONSUMED = eINSTANCE.getLPProductBucket_CalcConsumed();

		/**
		 * The meta object literal for the '<em><b>Calc Supplied</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT_BUCKET__CALC_SUPPLIED = eINSTANCE.getLPProductBucket_CalcSupplied();

		/**
		 * The meta object literal for the '<em><b>Calc Stocked</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT_BUCKET__CALC_STOCKED = eINSTANCE.getLPProductBucket_CalcStocked();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_PRODUCT_BUCKET__BALANCE = eINSTANCE.getLPProductBucket_Balance();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyImpl <em>LP Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPSupply()
		 * @generated
		 */
		EClass LP_SUPPLY = eINSTANCE.getLPSupply();

		/**
		 * The meta object literal for the '<em><b>Supply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_SUPPLY__SUPPLY = eINSTANCE.getLPSupply_Supply();

		/**
		 * The meta object literal for the '<em><b>LP Buckets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_SUPPLY__LP_BUCKETS = eINSTANCE.getLPSupply_LPBuckets();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_SUPPLY__PRODUCT = eINSTANCE.getLPSupply_Product();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyBucketImpl <em>LP Supply Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyBucketImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPSupplyBucket()
		 * @generated
		 */
		EClass LP_SUPPLY_BUCKET = eINSTANCE.getLPSupplyBucket();

		/**
		 * The meta object literal for the '<em><b>Supply</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_SUPPLY_BUCKET__SUPPLY = eINSTANCE.getLPSupplyBucket_Supply();

		/**
		 * The meta object literal for the '<em><b>Product Bucket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_SUPPLY_BUCKET__PRODUCT_BUCKET = eINSTANCE.getLPSupplyBucket_ProductBucket();

		/**
		 * The meta object literal for the '<em><b>Supplied</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_SUPPLY_BUCKET__SUPPLIED = eINSTANCE.getLPSupplyBucket_Supplied();

		/**
		 * The meta object literal for the '<em><b>Fraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LP_SUPPLY_BUCKET__FRACTION = eINSTANCE.getLPSupplyBucket_Fraction();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityImpl <em>LP Capacity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPCapacity()
		 * @generated
		 */
		EClass LP_CAPACITY = eINSTANCE.getLPCapacity();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_CAPACITY__PRODUCT = eINSTANCE.getLPCapacity_Product();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_CAPACITY__CAPACITY = eINSTANCE.getLPCapacity_Capacity();

		/**
		 * The meta object literal for the '<em><b>LP Buckets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_CAPACITY__LP_BUCKETS = eINSTANCE.getLPCapacity_LPBuckets();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityBucketImpl <em>LP Capacity Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityBucketImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPCapacityBucket()
		 * @generated
		 */
		EClass LP_CAPACITY_BUCKET = eINSTANCE.getLPCapacityBucket();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_CAPACITY_BUCKET__CAPACITY = eINSTANCE.getLPCapacityBucket_Capacity();

		/**
		 * The meta object literal for the '<em><b>Product Bucket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_CAPACITY_BUCKET__PRODUCT_BUCKET = eINSTANCE.getLPCapacityBucket_ProductBucket();

		/**
		 * The meta object literal for the '<em><b>Stocked</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_CAPACITY_BUCKET__STOCKED = eINSTANCE.getLPCapacityBucket_Stocked();

		/**
		 * The meta object literal for the '<em><b>Slack</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_CAPACITY_BUCKET__SLACK = eINSTANCE.getLPCapacityBucket_Slack();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_CAPACITY_BUCKET__BALANCE = eINSTANCE.getLPCapacityBucket_Balance();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceSetImpl <em>LP Resource Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPResourceSetImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPResourceSet()
		 * @generated
		 */
		EClass LP_RESOURCE_SET = eINSTANCE.getLPResourceSet();

		/**
		 * The meta object literal for the '<em><b>Macro Planner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_RESOURCE_SET__MACRO_PLANNER = eINSTANCE.getLPResourceSet_MacroPlanner();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_RESOURCE_SET__RESOURCES = eINSTANCE.getLPResourceSet_Resources();

		/**
		 * The meta object literal for the '<em><b>Get Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LP_RESOURCE_SET___GET_RESOURCE__LOCATIONRESOURCE = eINSTANCE.getLPResourceSet__GetResource__LocationResource();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceImpl <em>LP Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPResourceImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPResource()
		 * @generated
		 */
		EClass LP_RESOURCE = eINSTANCE.getLPResource();

		/**
		 * The meta object literal for the '<em><b>Availabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_RESOURCE__AVAILABILITIES = eINSTANCE.getLPResource_Availabilities();

		/**
		 * The meta object literal for the '<em><b>Resource Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_RESOURCE__RESOURCE_SET = eINSTANCE.getLPResource_ResourceSet();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_RESOURCE__RESOURCE = eINSTANCE.getLPResource_Resource();

		/**
		 * The meta object literal for the '<em><b>LP Buckets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_RESOURCE__LP_BUCKETS = eINSTANCE.getLPResource_LPBuckets();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl <em>LP Resource Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPResourceBucket()
		 * @generated
		 */
		EClass LP_RESOURCE_BUCKET = eINSTANCE.getLPResourceBucket();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_RESOURCE_BUCKET__RESOURCE = eINSTANCE.getLPResourceBucket_Resource();

		/**
		 * The meta object literal for the '<em><b>Availabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_RESOURCE_BUCKET__AVAILABILITIES = eINSTANCE.getLPResourceBucket_Availabilities();

		/**
		 * The meta object literal for the '<em><b>Reservations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_RESOURCE_BUCKET__RESERVATIONS = eINSTANCE.getLPResourceBucket_Reservations();

		/**
		 * The meta object literal for the '<em><b>Reserved</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_RESOURCE_BUCKET__RESERVED = eINSTANCE.getLPResourceBucket_Reserved();

		/**
		 * The meta object literal for the '<em><b>Planned</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_RESOURCE_BUCKET__PLANNED = eINSTANCE.getLPResourceBucket_Planned();

		/**
		 * The meta object literal for the '<em><b>Calc Reserved</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_RESOURCE_BUCKET__CALC_RESERVED = eINSTANCE.getLPResourceBucket_CalcReserved();

		/**
		 * The meta object literal for the '<em><b>Calc Planned</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_RESOURCE_BUCKET__CALC_PLANNED = eINSTANCE.getLPResourceBucket_CalcPlanned();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_RESOURCE_BUCKET__BALANCE = eINSTANCE.getLPResourceBucket_Balance();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityImpl <em>LP Availability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPAvailability()
		 * @generated
		 */
		EClass LP_AVAILABILITY = eINSTANCE.getLPAvailability();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_AVAILABILITY__RESOURCE = eINSTANCE.getLPAvailability_Resource();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_AVAILABILITY__AVAILABILITY = eINSTANCE.getLPAvailability_Availability();

		/**
		 * The meta object literal for the '<em><b>LP Buckets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_AVAILABILITY__LP_BUCKETS = eINSTANCE.getLPAvailability_LPBuckets();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityBucketImpl <em>LP Availability Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityBucketImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPAvailabilityBucket()
		 * @generated
		 */
		EClass LP_AVAILABILITY_BUCKET = eINSTANCE.getLPAvailabilityBucket();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_AVAILABILITY_BUCKET__AVAILABILITY = eINSTANCE.getLPAvailabilityBucket_Availability();

		/**
		 * The meta object literal for the '<em><b>Resource Bucket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_AVAILABILITY_BUCKET__RESOURCE_BUCKET = eINSTANCE.getLPAvailabilityBucket_ResourceBucket();

		/**
		 * The meta object literal for the '<em><b>Reserved</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_AVAILABILITY_BUCKET__RESERVED = eINSTANCE.getLPAvailabilityBucket_Reserved();

		/**
		 * The meta object literal for the '<em><b>Slack</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_AVAILABILITY_BUCKET__SLACK = eINSTANCE.getLPAvailabilityBucket_Slack();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_AVAILABILITY_BUCKET__BALANCE = eINSTANCE.getLPAvailabilityBucket_Balance();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingSetImpl <em>LP Routing Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingSetImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPRoutingSet()
		 * @generated
		 */
		EClass LP_ROUTING_SET = eINSTANCE.getLPRoutingSet();

		/**
		 * The meta object literal for the '<em><b>Macro Planner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_SET__MACRO_PLANNER = eINSTANCE.getLPRoutingSet_MacroPlanner();

		/**
		 * The meta object literal for the '<em><b>Routings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_SET__ROUTINGS = eINSTANCE.getLPRoutingSet_Routings();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingImpl <em>LP Routing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPRouting()
		 * @generated
		 */
		EClass LP_ROUTING = eINSTANCE.getLPRouting();

		/**
		 * The meta object literal for the '<em><b>Routing Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING__ROUTING_SET = eINSTANCE.getLPRouting_RoutingSet();

		/**
		 * The meta object literal for the '<em><b>Routing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING__ROUTING = eINSTANCE.getLPRouting_Routing();

		/**
		 * The meta object literal for the '<em><b>LP Buckets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING__LP_BUCKETS = eINSTANCE.getLPRouting_LPBuckets();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING__PRODUCTS = eINSTANCE.getLPRouting_Products();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING__RESOURCES = eINSTANCE.getLPRouting_Resources();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketImpl <em>LP Routing Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPRoutingBucket()
		 * @generated
		 */
		EClass LP_ROUTING_BUCKET = eINSTANCE.getLPRoutingBucket();

		/**
		 * The meta object literal for the '<em><b>Routing</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_BUCKET__ROUTING = eINSTANCE.getLPRoutingBucket_Routing();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_BUCKET__PRODUCTS = eINSTANCE.getLPRoutingBucket_Products();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_BUCKET__RESOURCES = eINSTANCE.getLPRoutingBucket_Resources();

		/**
		 * The meta object literal for the '<em><b>Planned</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_BUCKET__PLANNED = eINSTANCE.getLPRoutingBucket_Planned();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketProductImpl <em>LP Routing Bucket Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketProductImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPRoutingBucketProduct()
		 * @generated
		 */
		EClass LP_ROUTING_BUCKET_PRODUCT = eINSTANCE.getLPRoutingBucketProduct();

		/**
		 * The meta object literal for the '<em><b>Product Bucket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_BUCKET_PRODUCT__PRODUCT_BUCKET = eINSTANCE.getLPRoutingBucketProduct_ProductBucket();

		/**
		 * The meta object literal for the '<em><b>Routing Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT = eINSTANCE.getLPRoutingBucketProduct_RoutingProduct();

		/**
		 * The meta object literal for the '<em><b>Routing</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_BUCKET_PRODUCT__ROUTING = eINSTANCE.getLPRoutingBucketProduct_Routing();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketResourceImpl <em>LP Routing Bucket Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketResourceImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPRoutingBucketResource()
		 * @generated
		 */
		EClass LP_ROUTING_BUCKET_RESOURCE = eINSTANCE.getLPRoutingBucketResource();

		/**
		 * The meta object literal for the '<em><b>Resource Bucket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_BUCKET_RESOURCE__RESOURCE_BUCKET = eINSTANCE.getLPRoutingBucketResource_ResourceBucket();

		/**
		 * The meta object literal for the '<em><b>Routing Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE = eINSTANCE.getLPRoutingBucketResource_RoutingResource();

		/**
		 * The meta object literal for the '<em><b>Routing</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_BUCKET_RESOURCE__ROUTING = eINSTANCE.getLPRoutingBucketResource_Routing();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingProductImpl <em>LP Routing Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingProductImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPRoutingProduct()
		 * @generated
		 */
		EClass LP_ROUTING_PRODUCT = eINSTANCE.getLPRoutingProduct();

		/**
		 * The meta object literal for the '<em><b>Routing</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_PRODUCT__ROUTING = eINSTANCE.getLPRoutingProduct_Routing();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_PRODUCT__PRODUCT = eINSTANCE.getLPRoutingProduct_Product();

		/**
		 * The meta object literal for the '<em><b>Routing Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_PRODUCT__ROUTING_PRODUCT = eINSTANCE.getLPRoutingProduct_RoutingProduct();

		/**
		 * The meta object literal for the '<em><b>LP Buckets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_PRODUCT__LP_BUCKETS = eINSTANCE.getLPRoutingProduct_LPBuckets();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingResourceImpl <em>LP Routing Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingResourceImpl
		 * @see com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverPackageImpl#getLPRoutingResource()
		 * @generated
		 */
		EClass LP_ROUTING_RESOURCE = eINSTANCE.getLPRoutingResource();

		/**
		 * The meta object literal for the '<em><b>Routing</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_RESOURCE__ROUTING = eINSTANCE.getLPRoutingResource_Routing();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_RESOURCE__RESOURCE = eINSTANCE.getLPRoutingResource_Resource();

		/**
		 * The meta object literal for the '<em><b>Routing Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_RESOURCE__ROUTING_RESOURCE = eINSTANCE.getLPRoutingResource_RoutingResource();

		/**
		 * The meta object literal for the '<em><b>LP Buckets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROUTING_RESOURCE__LP_BUCKETS = eINSTANCE.getLPRoutingResource_LPBuckets();

	}

} //MacroPlannerSolverPackage
