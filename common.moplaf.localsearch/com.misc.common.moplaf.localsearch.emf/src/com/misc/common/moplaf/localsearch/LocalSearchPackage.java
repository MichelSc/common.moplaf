/**
 */
package com.misc.common.moplaf.localsearch;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.propagator2.PropagatorPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see com.misc.common.moplaf.localsearch.LocalSearchFactory
 * @model kind="package"
 * @generated
 */
public interface LocalSearchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "localsearch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/localsearch/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ls";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LocalSearchPackage eINSTANCE = com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.localsearch.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.localsearch.impl.SolutionImpl
	 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 0;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SCORE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SOLUTION_NR = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ancestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__ANCESTOR = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__DESCENDANTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__STRATEGY = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___GET_PROPAGATOR_FUNCTION__ECLASS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Add Propagator Functions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___ADD_PROPAGATOR_FUNCTIONS__STRING = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTIONS__STRING;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___CLONE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___REFRESH = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.localsearch.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.localsearch.impl.ActionImpl
	 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 1;

	/**
	 * The feature id for the '<em><b>Root Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ROOT_MOVES = 0;

	/**
	 * The feature id for the '<em><b>Current Move</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CURRENT_MOVE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALID = 3;

	/**
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALID_FEEDBACK = 4;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SOLUTION = 5;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___INITIALIZE = 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___RUN = 1;

	/**
	 * The operation id for the '<em>Finalize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___FINALIZE = 2;

	/**
	 * The operation id for the '<em>Select</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___SELECT__MOVE = 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.localsearch.impl.ScoreImpl <em>Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.localsearch.impl.ScoreImpl
	 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getScore()
	 * @generated
	 */
	int SCORE = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.localsearch.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.localsearch.impl.MoveImpl
	 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__SCORE = 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__PREVIOUS = 2;

	/**
	 * The feature id for the '<em><b>Next Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__NEXT_MOVES = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__VALID = 5;

	/**
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__VALID_FEEDBACK = 6;

	/**
	 * The feature id for the '<em><b>Do Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__DO_ENABLED_FEEDBACK = 7;

	/**
	 * The feature id for the '<em><b>Undo Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__UNDO_ENABLED_FEEDBACK = 8;

	/**
	 * The feature id for the '<em><b>Select Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__SELECT_ENABLED_FEEDBACK = 9;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__CURRENT = 10;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__SOLUTION = 11;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Do </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE___DO_ = 0;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE___UNDO = 1;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Feasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__FEASIBLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Is Better</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE___IS_BETTER__SCORE = 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE___CLONE = 1;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE___COPY__SCORE = 2;

	/**
	 * The number of operations of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.localsearch.impl.StrategyImpl
	 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__RUN_FEEDBACK = JobPackage.RUN__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CANCEL_FEEDBACK = JobPackage.RUN__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__RESET_FEEDBACK = JobPackage.RUN__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CANCELED = JobPackage.RUN__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__RETURN_SUCCESS = JobPackage.RUN__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__RETURN_FEEDBACK = JobPackage.RUN__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__RETURN_INFORMATION = JobPackage.RUN__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Improvments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IMPROVMENTS = JobPackage.RUN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Best Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__BEST_SOLUTION = JobPackage.RUN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__SOLUTIONS = JobPackage.RUN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CURRENT_SOLUTION_NR = JobPackage.RUN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Nr Solutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__MAX_NR_SOLUTIONS = JobPackage.RUN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NAME = JobPackage.RUN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Chance Select Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CHANCE_SELECT_BEST = JobPackage.RUN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Chance Select Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CHANCE_SELECT_WORST = JobPackage.RUN_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = JobPackage.RUN_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___COPY_PARAMS__RUNPARAMS = JobPackage.RUN___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___RESET = JobPackage.RUN___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___RUN = JobPackage.RUN___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___RUN__RUNCONTEXT = JobPackage.RUN___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___CANCEL = JobPackage.RUN___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___SET_PROGRESS__STRING_FLOAT = JobPackage.RUN___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___SET_PROGRESS__PROGRESSFEEDBACK = JobPackage.RUN___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___GET_RETURN = JobPackage.RUN___GET_RETURN;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___SET_RETURN__RETURNFEEDBACK = JobPackage.RUN___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___CONSTRUCT_PARAMS = JobPackage.RUN___CONSTRUCT_PARAMS;

	/**
	 * The operation id for the '<em>Select Good Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___SELECT_GOOD_SOLUTION = JobPackage.RUN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Select Bad Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___SELECT_BAD_SOLUTION = JobPackage.RUN_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = JobPackage.RUN_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl <em>Improvment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.localsearch.impl.ImprovmentImpl
	 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getImprovment()
	 * @generated
	 */
	int IMPROVMENT = 5;

	/**
	 * The feature id for the '<em><b>Max Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT__MAX_ITERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Max Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT__MAX_SECONDS = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT__SOLUTION = 3;

	/**
	 * The feature id for the '<em><b>Improvments Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT__IMPROVMENTS_START = 4;

	/**
	 * The feature id for the '<em><b>Improvments End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT__IMPROVMENTS_END = 5;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT__ITERATIONS = 6;

	/**
	 * The feature id for the '<em><b>Duration Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT__DURATION_TOTAL = 7;

	/**
	 * The feature id for the '<em><b>Duration Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT__DURATION_AVERAGE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT__NAME = 9;

	/**
	 * The number of structural features of the '<em>Improvment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Do Iteration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT___DO_ITERATION = 0;

	/**
	 * The number of operations of the '<em>Improvment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT_OPERATION_COUNT = 1;


	/**
	 * The meta object id for the '<em>Enabled Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.EnabledFeedback
	 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getEnabledFeedback()
	 * @generated
	 */
	int ENABLED_FEEDBACK = 6;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.localsearch.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.localsearch.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.localsearch.Solution#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Score</em>'.
	 * @see com.misc.common.moplaf.localsearch.Solution#getScore()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Score();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Solution#getSolutionNr <em>Solution Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solution Nr</em>'.
	 * @see com.misc.common.moplaf.localsearch.Solution#getSolutionNr()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_SolutionNr();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.localsearch.Solution#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ancestor</em>'.
	 * @see com.misc.common.moplaf.localsearch.Solution#getAncestor()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Ancestor();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.localsearch.Solution#getDescendants <em>Descendants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Descendants</em>'.
	 * @see com.misc.common.moplaf.localsearch.Solution#getDescendants()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Descendants();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.localsearch.Solution#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Strategy</em>'.
	 * @see com.misc.common.moplaf.localsearch.Solution#getStrategy()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Strategy();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Solution#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Solution#clone()
	 * @generated
	 */
	EOperation getSolution__Clone();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Solution#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Solution#refresh()
	 * @generated
	 */
	EOperation getSolution__Refresh();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.localsearch.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see com.misc.common.moplaf.localsearch.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.localsearch.Action#getRootMoves <em>Root Moves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Moves</em>'.
	 * @see com.misc.common.moplaf.localsearch.Action#getRootMoves()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_RootMoves();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.localsearch.Action#getCurrentMove <em>Current Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Move</em>'.
	 * @see com.misc.common.moplaf.localsearch.Action#getCurrentMove()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_CurrentMove();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Action#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.localsearch.Action#getDescription()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Action#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see com.misc.common.moplaf.localsearch.Action#isValid()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Valid();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.localsearch.Action#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.localsearch.Action#getSolution()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Solution();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Action#getValidFeedback <em>Valid Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Feedback</em>'.
	 * @see com.misc.common.moplaf.localsearch.Action#getValidFeedback()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ValidFeedback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Action#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Action#initialize()
	 * @generated
	 */
	EOperation getAction__Initialize();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Action#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Action#run()
	 * @generated
	 */
	EOperation getAction__Run();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Action#finalize() <em>Finalize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Finalize</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Action#finalize()
	 * @generated
	 */
	EOperation getAction__Finalize();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Action#select(com.misc.common.moplaf.localsearch.Move) <em>Select</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Select</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Action#select(com.misc.common.moplaf.localsearch.Move)
	 * @generated
	 */
	EOperation getAction__Select__Move();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.localsearch.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see com.misc.common.moplaf.localsearch.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.localsearch.Move#getNextMoves <em>Next Moves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next Moves</em>'.
	 * @see com.misc.common.moplaf.localsearch.Move#getNextMoves()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_NextMoves();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Move#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.localsearch.Move#getDescription()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Move#getValidFeedback <em>Valid Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Feedback</em>'.
	 * @see com.misc.common.moplaf.localsearch.Move#getValidFeedback()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_ValidFeedback();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.localsearch.Move#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Previous</em>'.
	 * @see com.misc.common.moplaf.localsearch.Move#getPrevious()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Previous();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Move#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see com.misc.common.moplaf.localsearch.Move#isValid()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Valid();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Move#getDoEnabledFeedback <em>Do Enabled Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Enabled Feedback</em>'.
	 * @see com.misc.common.moplaf.localsearch.Move#getDoEnabledFeedback()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_DoEnabledFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Move#getUndoEnabledFeedback <em>Undo Enabled Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undo Enabled Feedback</em>'.
	 * @see com.misc.common.moplaf.localsearch.Move#getUndoEnabledFeedback()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_UndoEnabledFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Move#getSelectEnabledFeedback <em>Select Enabled Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Enabled Feedback</em>'.
	 * @see com.misc.common.moplaf.localsearch.Move#getSelectEnabledFeedback()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_SelectEnabledFeedback();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.localsearch.Move#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Score</em>'.
	 * @see com.misc.common.moplaf.localsearch.Move#getScore()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Score();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.localsearch.Move#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see com.misc.common.moplaf.localsearch.Move#getAction()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Action();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Move#isCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see com.misc.common.moplaf.localsearch.Move#isCurrent()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Current();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Move#isSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.localsearch.Move#isSolution()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Solution();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Move#do_() <em>Do </em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do </em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Move#do_()
	 * @generated
	 */
	EOperation getMove__Do_();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Move#undo() <em>Undo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undo</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Move#undo()
	 * @generated
	 */
	EOperation getMove__Undo();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.localsearch.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score</em>'.
	 * @see com.misc.common.moplaf.localsearch.Score
	 * @generated
	 */
	EClass getScore();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Score#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.localsearch.Score#getDescription()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Score#isFeasible <em>Feasible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feasible</em>'.
	 * @see com.misc.common.moplaf.localsearch.Score#isFeasible()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_Feasible();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Score#isBetter(com.misc.common.moplaf.localsearch.Score) <em>Is Better</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Better</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Score#isBetter(com.misc.common.moplaf.localsearch.Score)
	 * @generated
	 */
	EOperation getScore__IsBetter__Score();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Score#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Score#clone()
	 * @generated
	 */
	EOperation getScore__Clone();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Score#copy(com.misc.common.moplaf.localsearch.Score) <em>Copy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Score#copy(com.misc.common.moplaf.localsearch.Score)
	 * @generated
	 */
	EOperation getScore__Copy__Score();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.localsearch.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see com.misc.common.moplaf.localsearch.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.localsearch.Strategy#getImprovments <em>Improvments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Improvments</em>'.
	 * @see com.misc.common.moplaf.localsearch.Strategy#getImprovments()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Improvments();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.localsearch.Strategy#getBestSolution <em>Best Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Best Solution</em>'.
	 * @see com.misc.common.moplaf.localsearch.Strategy#getBestSolution()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_BestSolution();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.localsearch.Strategy#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solutions</em>'.
	 * @see com.misc.common.moplaf.localsearch.Strategy#getSolutions()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Solutions();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Strategy#getCurrentSolutionNr <em>Current Solution Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Solution Nr</em>'.
	 * @see com.misc.common.moplaf.localsearch.Strategy#getCurrentSolutionNr()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_CurrentSolutionNr();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Strategy#getMaxNrSolutions <em>Max Nr Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Nr Solutions</em>'.
	 * @see com.misc.common.moplaf.localsearch.Strategy#getMaxNrSolutions()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_MaxNrSolutions();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Strategy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.localsearch.Strategy#getName()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Strategy#getChanceSelectBest <em>Chance Select Best</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chance Select Best</em>'.
	 * @see com.misc.common.moplaf.localsearch.Strategy#getChanceSelectBest()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_ChanceSelectBest();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Strategy#getChanceSelectWorst <em>Chance Select Worst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chance Select Worst</em>'.
	 * @see com.misc.common.moplaf.localsearch.Strategy#getChanceSelectWorst()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_ChanceSelectWorst();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Strategy#selectGoodSolution() <em>Select Good Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Select Good Solution</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Strategy#selectGoodSolution()
	 * @generated
	 */
	EOperation getStrategy__SelectGoodSolution();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Strategy#selectBadSolution() <em>Select Bad Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Select Bad Solution</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Strategy#selectBadSolution()
	 * @generated
	 */
	EOperation getStrategy__SelectBadSolution();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.localsearch.Improvment <em>Improvment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Improvment</em>'.
	 * @see com.misc.common.moplaf.localsearch.Improvment
	 * @generated
	 */
	EClass getImprovment();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Improvment#getMaxIterations <em>Max Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Iterations</em>'.
	 * @see com.misc.common.moplaf.localsearch.Improvment#getMaxIterations()
	 * @see #getImprovment()
	 * @generated
	 */
	EAttribute getImprovment_MaxIterations();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Improvment#getMaxSeconds <em>Max Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Seconds</em>'.
	 * @see com.misc.common.moplaf.localsearch.Improvment#getMaxSeconds()
	 * @see #getImprovment()
	 * @generated
	 */
	EAttribute getImprovment_MaxSeconds();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.localsearch.Improvment#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see com.misc.common.moplaf.localsearch.Improvment#getActions()
	 * @see #getImprovment()
	 * @generated
	 */
	EReference getImprovment_Actions();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.localsearch.Improvment#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.localsearch.Improvment#getSolution()
	 * @see #getImprovment()
	 * @generated
	 */
	EReference getImprovment_Solution();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Improvment#getImprovmentsStart <em>Improvments Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Improvments Start</em>'.
	 * @see com.misc.common.moplaf.localsearch.Improvment#getImprovmentsStart()
	 * @see #getImprovment()
	 * @generated
	 */
	EAttribute getImprovment_ImprovmentsStart();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Improvment#getImprovmentsEnd <em>Improvments End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Improvments End</em>'.
	 * @see com.misc.common.moplaf.localsearch.Improvment#getImprovmentsEnd()
	 * @see #getImprovment()
	 * @generated
	 */
	EAttribute getImprovment_ImprovmentsEnd();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Improvment#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterations</em>'.
	 * @see com.misc.common.moplaf.localsearch.Improvment#getIterations()
	 * @see #getImprovment()
	 * @generated
	 */
	EAttribute getImprovment_Iterations();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Improvment#getDurationTotal <em>Duration Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Total</em>'.
	 * @see com.misc.common.moplaf.localsearch.Improvment#getDurationTotal()
	 * @see #getImprovment()
	 * @generated
	 */
	EAttribute getImprovment_DurationTotal();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Improvment#getDurationAverage <em>Duration Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Average</em>'.
	 * @see com.misc.common.moplaf.localsearch.Improvment#getDurationAverage()
	 * @see #getImprovment()
	 * @generated
	 */
	EAttribute getImprovment_DurationAverage();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Improvment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.localsearch.Improvment#getName()
	 * @see #getImprovment()
	 * @generated
	 */
	EAttribute getImprovment_Name();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Improvment#doIteration() <em>Do Iteration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Iteration</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Improvment#doIteration()
	 * @generated
	 */
	EOperation getImprovment__DoIteration();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.common.EnabledFeedback <em>Enabled Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enabled Feedback</em>'.
	 * @see com.misc.common.moplaf.common.EnabledFeedback
	 * @model instanceClass="com.misc.common.moplaf.common.EnabledFeedback"
	 * @generated
	 */
	EDataType getEnabledFeedback();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LocalSearchFactory getLocalSearchFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.localsearch.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.localsearch.impl.SolutionImpl
		 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__SCORE = eINSTANCE.getSolution_Score();

		/**
		 * The meta object literal for the '<em><b>Solution Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__SOLUTION_NR = eINSTANCE.getSolution_SolutionNr();

		/**
		 * The meta object literal for the '<em><b>Ancestor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__ANCESTOR = eINSTANCE.getSolution_Ancestor();

		/**
		 * The meta object literal for the '<em><b>Descendants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__DESCENDANTS = eINSTANCE.getSolution_Descendants();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__STRATEGY = eINSTANCE.getSolution_Strategy();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___CLONE = eINSTANCE.getSolution__Clone();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___REFRESH = eINSTANCE.getSolution__Refresh();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.localsearch.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.localsearch.impl.ActionImpl
		 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Root Moves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ROOT_MOVES = eINSTANCE.getAction_RootMoves();

		/**
		 * The meta object literal for the '<em><b>Current Move</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CURRENT_MOVE = eINSTANCE.getAction_CurrentMove();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DESCRIPTION = eINSTANCE.getAction_Description();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__VALID = eINSTANCE.getAction_Valid();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__SOLUTION = eINSTANCE.getAction_Solution();

		/**
		 * The meta object literal for the '<em><b>Valid Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__VALID_FEEDBACK = eINSTANCE.getAction_ValidFeedback();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___INITIALIZE = eINSTANCE.getAction__Initialize();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___RUN = eINSTANCE.getAction__Run();

		/**
		 * The meta object literal for the '<em><b>Finalize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___FINALIZE = eINSTANCE.getAction__Finalize();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___SELECT__MOVE = eINSTANCE.getAction__Select__Move();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.localsearch.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.localsearch.impl.MoveImpl
		 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Next Moves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__NEXT_MOVES = eINSTANCE.getMove_NextMoves();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__DESCRIPTION = eINSTANCE.getMove_Description();

		/**
		 * The meta object literal for the '<em><b>Valid Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__VALID_FEEDBACK = eINSTANCE.getMove_ValidFeedback();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__PREVIOUS = eINSTANCE.getMove_Previous();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__VALID = eINSTANCE.getMove_Valid();

		/**
		 * The meta object literal for the '<em><b>Do Enabled Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__DO_ENABLED_FEEDBACK = eINSTANCE.getMove_DoEnabledFeedback();

		/**
		 * The meta object literal for the '<em><b>Undo Enabled Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__UNDO_ENABLED_FEEDBACK = eINSTANCE.getMove_UndoEnabledFeedback();

		/**
		 * The meta object literal for the '<em><b>Select Enabled Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__SELECT_ENABLED_FEEDBACK = eINSTANCE.getMove_SelectEnabledFeedback();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__SCORE = eINSTANCE.getMove_Score();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__ACTION = eINSTANCE.getMove_Action();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__CURRENT = eINSTANCE.getMove_Current();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__SOLUTION = eINSTANCE.getMove_Solution();

		/**
		 * The meta object literal for the '<em><b>Do </b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOVE___DO_ = eINSTANCE.getMove__Do_();

		/**
		 * The meta object literal for the '<em><b>Undo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOVE___UNDO = eINSTANCE.getMove__Undo();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.localsearch.impl.ScoreImpl <em>Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.localsearch.impl.ScoreImpl
		 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getScore()
		 * @generated
		 */
		EClass SCORE = eINSTANCE.getScore();


		/**
		 * The meta object literal for the '<em><b>Feasible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__FEASIBLE = eINSTANCE.getScore_Feasible();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__DESCRIPTION = eINSTANCE.getScore_Description();

		/**
		 * The meta object literal for the '<em><b>Is Better</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCORE___IS_BETTER__SCORE = eINSTANCE.getScore__IsBetter__Score();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCORE___CLONE = eINSTANCE.getScore__Clone();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCORE___COPY__SCORE = eINSTANCE.getScore__Copy__Score();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.localsearch.impl.StrategyImpl
		 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Improvments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__IMPROVMENTS = eINSTANCE.getStrategy_Improvments();

		/**
		 * The meta object literal for the '<em><b>Best Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__BEST_SOLUTION = eINSTANCE.getStrategy_BestSolution();

		/**
		 * The meta object literal for the '<em><b>Solutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__SOLUTIONS = eINSTANCE.getStrategy_Solutions();

		/**
		 * The meta object literal for the '<em><b>Current Solution Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__CURRENT_SOLUTION_NR = eINSTANCE.getStrategy_CurrentSolutionNr();

		/**
		 * The meta object literal for the '<em><b>Max Nr Solutions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__MAX_NR_SOLUTIONS = eINSTANCE.getStrategy_MaxNrSolutions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__NAME = eINSTANCE.getStrategy_Name();

		/**
		 * The meta object literal for the '<em><b>Chance Select Best</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__CHANCE_SELECT_BEST = eINSTANCE.getStrategy_ChanceSelectBest();

		/**
		 * The meta object literal for the '<em><b>Chance Select Worst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__CHANCE_SELECT_WORST = eINSTANCE.getStrategy_ChanceSelectWorst();

		/**
		 * The meta object literal for the '<em><b>Select Good Solution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY___SELECT_GOOD_SOLUTION = eINSTANCE.getStrategy__SelectGoodSolution();

		/**
		 * The meta object literal for the '<em><b>Select Bad Solution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY___SELECT_BAD_SOLUTION = eINSTANCE.getStrategy__SelectBadSolution();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl <em>Improvment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.localsearch.impl.ImprovmentImpl
		 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getImprovment()
		 * @generated
		 */
		EClass IMPROVMENT = eINSTANCE.getImprovment();

		/**
		 * The meta object literal for the '<em><b>Max Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPROVMENT__MAX_ITERATIONS = eINSTANCE.getImprovment_MaxIterations();

		/**
		 * The meta object literal for the '<em><b>Max Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPROVMENT__MAX_SECONDS = eINSTANCE.getImprovment_MaxSeconds();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPROVMENT__ACTIONS = eINSTANCE.getImprovment_Actions();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPROVMENT__SOLUTION = eINSTANCE.getImprovment_Solution();

		/**
		 * The meta object literal for the '<em><b>Improvments Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPROVMENT__IMPROVMENTS_START = eINSTANCE.getImprovment_ImprovmentsStart();

		/**
		 * The meta object literal for the '<em><b>Improvments End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPROVMENT__IMPROVMENTS_END = eINSTANCE.getImprovment_ImprovmentsEnd();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPROVMENT__ITERATIONS = eINSTANCE.getImprovment_Iterations();

		/**
		 * The meta object literal for the '<em><b>Duration Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPROVMENT__DURATION_TOTAL = eINSTANCE.getImprovment_DurationTotal();

		/**
		 * The meta object literal for the '<em><b>Duration Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPROVMENT__DURATION_AVERAGE = eINSTANCE.getImprovment_DurationAverage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPROVMENT__NAME = eINSTANCE.getImprovment_Name();

		/**
		 * The meta object literal for the '<em><b>Do Iteration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPROVMENT___DO_ITERATION = eINSTANCE.getImprovment__DoIteration();

		/**
		 * The meta object literal for the '<em>Enabled Feedback</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.EnabledFeedback
		 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getEnabledFeedback()
		 * @generated
		 */
		EDataType ENABLED_FEEDBACK = eINSTANCE.getEnabledFeedback();

	}

} //LocalSearchPackage
