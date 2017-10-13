/**
 */
package com.misc.common.moplaf.localsearch;

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
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALID_FEEDBACK = 3;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALID = 4;

	/**
	 * The feature id for the '<em><b>Current Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CURRENT_SOLUTION = 5;

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
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 3;

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
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__VALID_FEEDBACK = 5;

	/**
	 * The feature id for the '<em><b>Do Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__DO_ENABLED_FEEDBACK = 6;

	/**
	 * The feature id for the '<em><b>Undo Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__UNDO_ENABLED_FEEDBACK = 7;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__VALID = 8;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__CURRENT = 9;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = 10;

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
	 * The number of structural features of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE___COMPARE__SCORE = 0;

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
	 * The feature id for the '<em><b>Improvments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IMPROVMENTS = 0;

	/**
	 * The feature id for the '<em><b>Best Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__BEST_SOLUTION = 1;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__SOLUTIONS = 2;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Select Solutions To Improve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___SELECT_SOLUTIONS_TO_IMPROVE = 0;

	/**
	 * The operation id for the '<em>Prune Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___PRUNE_SOLUTION = 1;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = 2;

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
	 * The number of structural features of the '<em>Improvment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Create Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT___CREATE_ACTIONS = 0;

	/**
	 * The operation id for the '<em>Do Iteration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT___DO_ITERATION = 1;

	/**
	 * The number of operations of the '<em>Improvment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVMENT_OPERATION_COUNT = 2;


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
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.localsearch.Action#getCurrentSolution <em>Current Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Solution</em>'.
	 * @see com.misc.common.moplaf.localsearch.Action#getCurrentSolution()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_CurrentSolution();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Score#compare(com.misc.common.moplaf.localsearch.Score) <em>Compare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Score#compare(com.misc.common.moplaf.localsearch.Score)
	 * @generated
	 */
	EOperation getScore__Compare__Score();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Strategy#selectSolutionsToImprove() <em>Select Solutions To Improve</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Select Solutions To Improve</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Strategy#selectSolutionsToImprove()
	 * @generated
	 */
	EOperation getStrategy__SelectSolutionsToImprove();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Strategy#pruneSolution() <em>Prune Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prune Solution</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Strategy#pruneSolution()
	 * @generated
	 */
	EOperation getStrategy__PruneSolution();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Improvment#createActions() <em>Create Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Actions</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Improvment#createActions()
	 * @generated
	 */
	EOperation getImprovment__CreateActions();

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
		 * The meta object literal for the '<em><b>Current Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CURRENT_SOLUTION = eINSTANCE.getAction_CurrentSolution();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__VALID = eINSTANCE.getAction_Valid();

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
		 * The meta object literal for the '<em><b>Compare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCORE___COMPARE__SCORE = eINSTANCE.getScore__Compare__Score();

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
		 * The meta object literal for the '<em><b>Select Solutions To Improve</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY___SELECT_SOLUTIONS_TO_IMPROVE = eINSTANCE.getStrategy__SelectSolutionsToImprove();

		/**
		 * The meta object literal for the '<em><b>Prune Solution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY___PRUNE_SOLUTION = eINSTANCE.getStrategy__PruneSolution();

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
		 * The meta object literal for the '<em><b>Create Actions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPROVMENT___CREATE_ACTIONS = eINSTANCE.getImprovment__CreateActions();

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
