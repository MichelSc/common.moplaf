/**
 */
package com.misc.common.moplaf.localsearch;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.propagator2.PropagatorPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The feature id for the '<em><b>Strategy</b></em>' reference.
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
	 * The meta object id for the '{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl <em>Solution Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl
	 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getSolutionChange()
	 * @generated
	 */
	int SOLUTION_CHANGE = 7;

	/**
	 * The feature id for the '<em><b>End Solution Owned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CHANGE__END_SOLUTION_OWNED = 0;

	/**
	 * The feature id for the '<em><b>Start Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CHANGE__START_SOLUTION = 1;

	/**
	 * The feature id for the '<em><b>End Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CHANGE__END_SOLUTION = 2;

	/**
	 * The feature id for the '<em><b>Start Solution Owned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CHANGE__START_SOLUTION_OWNED = 3;

	/**
	 * The feature id for the '<em><b>Previous Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CHANGE__PREVIOUS_CHANGE = 4;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CHANGE__LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CHANGE__SOLUTIONS = 6;

	/**
	 * The feature id for the '<em><b>Sub Changes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CHANGE__SUB_CHANGES = 7;

	/**
	 * The feature id for the '<em><b>Current Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CHANGE__CURRENT_SOLUTION = 8;

	/**
	 * The number of structural features of the '<em>Solution Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CHANGE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Solution Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CHANGE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>End Solution Owned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__END_SOLUTION_OWNED = SOLUTION_CHANGE__END_SOLUTION_OWNED;

	/**
	 * The feature id for the '<em><b>Start Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__START_SOLUTION = SOLUTION_CHANGE__START_SOLUTION;

	/**
	 * The feature id for the '<em><b>End Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__END_SOLUTION = SOLUTION_CHANGE__END_SOLUTION;

	/**
	 * The feature id for the '<em><b>Start Solution Owned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__START_SOLUTION_OWNED = SOLUTION_CHANGE__START_SOLUTION_OWNED;

	/**
	 * The feature id for the '<em><b>Previous Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PREVIOUS_CHANGE = SOLUTION_CHANGE__PREVIOUS_CHANGE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LEVEL = SOLUTION_CHANGE__LEVEL;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SOLUTIONS = SOLUTION_CHANGE__SOLUTIONS;

	/**
	 * The feature id for the '<em><b>Sub Changes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SUB_CHANGES = SOLUTION_CHANGE__SUB_CHANGES;

	/**
	 * The feature id for the '<em><b>Current Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CURRENT_SOLUTION = SOLUTION_CHANGE__CURRENT_SOLUTION;

	/**
	 * The feature id for the '<em><b>Root Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ROOT_MOVES = SOLUTION_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Move</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CURRENT_MOVE = SOLUTION_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = SOLUTION_CHANGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALID = SOLUTION_CHANGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALID_FEEDBACK = SOLUTION_CHANGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_NR = SOLUTION_CHANGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__STEP = SOLUTION_CHANGE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = SOLUTION_CHANGE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___INITIALIZE = SOLUTION_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___RUN = SOLUTION_CHANGE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Finalize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___FINALIZE = SOLUTION_CHANGE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Select</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___SELECT__MOVE = SOLUTION_CHANGE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = SOLUTION_CHANGE_OPERATION_COUNT + 4;

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
	 * The feature id for the '<em><b>Phases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__PHASES = JobPackage.RUN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__SOLUTIONS = JobPackage.RUN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CURRENT_SOLUTION_NR = JobPackage.RUN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Nr Solutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__MAX_NR_SOLUTIONS = JobPackage.RUN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NAME = JobPackage.RUN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Select Best Chance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__SELECT_BEST_CHANCE = JobPackage.RUN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Select Worst Chance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__SELECT_WORST_CHANCE = JobPackage.RUN_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = JobPackage.RUN_FEATURE_COUNT + 7;

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
	 * The operation id for the '<em>Sort Solutions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___SORT_SOLUTIONS = JobPackage.RUN_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = JobPackage.RUN_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl <em>Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.localsearch.impl.PhaseImpl
	 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getPhase()
	 * @generated
	 */
	int PHASE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Keep Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__KEEP_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Max Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__MAX_STEPS = 2;

	/**
	 * The feature id for the '<em><b>Max Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__MAX_SECONDS = 3;

	/**
	 * The feature id for the '<em><b>Phase Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__PHASE_START = 4;

	/**
	 * The feature id for the '<em><b>Phase End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__PHASE_END = 5;

	/**
	 * The feature id for the '<em><b>Nr Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__NR_STEPS = 6;

	/**
	 * The feature id for the '<em><b>Duration Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__DURATION_TOTAL = 7;

	/**
	 * The feature id for the '<em><b>Duration Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__DURATION_AVERAGE = 8;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__STRATEGY = 9;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__STEPS = 10;

	/**
	 * The number of structural features of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Do Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE___DO_STEP__STEP = 0;

	/**
	 * The number of operations of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.localsearch.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.localsearch.impl.StepImpl
	 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 6;

	/**
	 * The feature id for the '<em><b>End Solution Owned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__END_SOLUTION_OWNED = SOLUTION_CHANGE__END_SOLUTION_OWNED;

	/**
	 * The feature id for the '<em><b>Start Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__START_SOLUTION = SOLUTION_CHANGE__START_SOLUTION;

	/**
	 * The feature id for the '<em><b>End Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__END_SOLUTION = SOLUTION_CHANGE__END_SOLUTION;

	/**
	 * The feature id for the '<em><b>Start Solution Owned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__START_SOLUTION_OWNED = SOLUTION_CHANGE__START_SOLUTION_OWNED;

	/**
	 * The feature id for the '<em><b>Previous Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PREVIOUS_CHANGE = SOLUTION_CHANGE__PREVIOUS_CHANGE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LEVEL = SOLUTION_CHANGE__LEVEL;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SOLUTIONS = SOLUTION_CHANGE__SOLUTIONS;

	/**
	 * The feature id for the '<em><b>Sub Changes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SUB_CHANGES = SOLUTION_CHANGE__SUB_CHANGES;

	/**
	 * The feature id for the '<em><b>Current Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CURRENT_SOLUTION = SOLUTION_CHANGE__CURRENT_SOLUTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ACTIONS = SOLUTION_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Step Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STEP_NR = SOLUTION_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PHASE = SOLUTION_CHANGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = SOLUTION_CHANGE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP___DO_ACTION__ACTION = SOLUTION_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = SOLUTION_CHANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.localsearch.StrategyLevel <em>Strategy Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.localsearch.StrategyLevel
	 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getStrategyLevel()
	 * @generated
	 */
	int STRATEGY_LEVEL = 8;

	/**
	 * The meta object id for the '<em>Enabled Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.EnabledFeedback
	 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getEnabledFeedback()
	 * @generated
	 */
	int ENABLED_FEEDBACK = 9;


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
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.localsearch.Solution#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Strategy</em>'.
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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Action#getActionNr <em>Action Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Nr</em>'.
	 * @see com.misc.common.moplaf.localsearch.Action#getActionNr()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionNr();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.localsearch.Action#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step</em>'.
	 * @see com.misc.common.moplaf.localsearch.Action#getStep()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Step();

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
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.localsearch.Strategy#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phases</em>'.
	 * @see com.misc.common.moplaf.localsearch.Strategy#getPhases()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Phases();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Strategy#getSelectBestChance <em>Select Best Chance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Best Chance</em>'.
	 * @see com.misc.common.moplaf.localsearch.Strategy#getSelectBestChance()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_SelectBestChance();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Strategy#getSelectWorstChance <em>Select Worst Chance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Worst Chance</em>'.
	 * @see com.misc.common.moplaf.localsearch.Strategy#getSelectWorstChance()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_SelectWorstChance();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Strategy#sortSolutions() <em>Sort Solutions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sort Solutions</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Strategy#sortSolutions()
	 * @generated
	 */
	EOperation getStrategy__SortSolutions();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.localsearch.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase</em>'.
	 * @see com.misc.common.moplaf.localsearch.Phase
	 * @generated
	 */
	EClass getPhase();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Phase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.localsearch.Phase#getName()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Phase#getKeepLevel <em>Keep Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keep Level</em>'.
	 * @see com.misc.common.moplaf.localsearch.Phase#getKeepLevel()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_KeepLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Phase#getMaxSteps <em>Max Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Steps</em>'.
	 * @see com.misc.common.moplaf.localsearch.Phase#getMaxSteps()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_MaxSteps();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Phase#getMaxSeconds <em>Max Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Seconds</em>'.
	 * @see com.misc.common.moplaf.localsearch.Phase#getMaxSeconds()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_MaxSeconds();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Phase#getPhaseStart <em>Phase Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Start</em>'.
	 * @see com.misc.common.moplaf.localsearch.Phase#getPhaseStart()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_PhaseStart();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Phase#getPhaseEnd <em>Phase End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase End</em>'.
	 * @see com.misc.common.moplaf.localsearch.Phase#getPhaseEnd()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_PhaseEnd();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Phase#getNrSteps <em>Nr Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Steps</em>'.
	 * @see com.misc.common.moplaf.localsearch.Phase#getNrSteps()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_NrSteps();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Phase#getDurationTotal <em>Duration Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Total</em>'.
	 * @see com.misc.common.moplaf.localsearch.Phase#getDurationTotal()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_DurationTotal();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Phase#getDurationAverage <em>Duration Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Average</em>'.
	 * @see com.misc.common.moplaf.localsearch.Phase#getDurationAverage()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_DurationAverage();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.localsearch.Phase#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Strategy</em>'.
	 * @see com.misc.common.moplaf.localsearch.Phase#getStrategy()
	 * @see #getPhase()
	 * @generated
	 */
	EReference getPhase_Strategy();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.localsearch.Phase#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see com.misc.common.moplaf.localsearch.Phase#getSteps()
	 * @see #getPhase()
	 * @generated
	 */
	EReference getPhase_Steps();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Phase#doStep(com.misc.common.moplaf.localsearch.Step) <em>Do Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Step</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Phase#doStep(com.misc.common.moplaf.localsearch.Step)
	 * @generated
	 */
	EOperation getPhase__DoStep__Step();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.localsearch.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see com.misc.common.moplaf.localsearch.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.localsearch.Step#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see com.misc.common.moplaf.localsearch.Step#getActions()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Actions();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.Step#getStepNr <em>Step Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Nr</em>'.
	 * @see com.misc.common.moplaf.localsearch.Step#getStepNr()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_StepNr();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.localsearch.Step#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Phase</em>'.
	 * @see com.misc.common.moplaf.localsearch.Step#getPhase()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Phase();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.localsearch.Step#doAction(com.misc.common.moplaf.localsearch.Action) <em>Do Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Action</em>' operation.
	 * @see com.misc.common.moplaf.localsearch.Step#doAction(com.misc.common.moplaf.localsearch.Action)
	 * @generated
	 */
	EOperation getStep__DoAction__Action();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.localsearch.SolutionChange <em>Solution Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Change</em>'.
	 * @see com.misc.common.moplaf.localsearch.SolutionChange
	 * @generated
	 */
	EClass getSolutionChange();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.localsearch.SolutionChange#getEndSolutionOwned <em>End Solution Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Solution Owned</em>'.
	 * @see com.misc.common.moplaf.localsearch.SolutionChange#getEndSolutionOwned()
	 * @see #getSolutionChange()
	 * @generated
	 */
	EReference getSolutionChange_EndSolutionOwned();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.localsearch.SolutionChange#getStartSolution <em>Start Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Solution</em>'.
	 * @see com.misc.common.moplaf.localsearch.SolutionChange#getStartSolution()
	 * @see #getSolutionChange()
	 * @generated
	 */
	EReference getSolutionChange_StartSolution();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.localsearch.SolutionChange#getEndSolution <em>End Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Solution</em>'.
	 * @see com.misc.common.moplaf.localsearch.SolutionChange#getEndSolution()
	 * @see #getSolutionChange()
	 * @generated
	 */
	EReference getSolutionChange_EndSolution();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.localsearch.SolutionChange#getStartSolutionOwned <em>Start Solution Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Solution Owned</em>'.
	 * @see com.misc.common.moplaf.localsearch.SolutionChange#getStartSolutionOwned()
	 * @see #getSolutionChange()
	 * @generated
	 */
	EReference getSolutionChange_StartSolutionOwned();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.localsearch.SolutionChange#getPreviousChange <em>Previous Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Change</em>'.
	 * @see com.misc.common.moplaf.localsearch.SolutionChange#getPreviousChange()
	 * @see #getSolutionChange()
	 * @generated
	 */
	EReference getSolutionChange_PreviousChange();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.localsearch.SolutionChange#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see com.misc.common.moplaf.localsearch.SolutionChange#getLevel()
	 * @see #getSolutionChange()
	 * @generated
	 */
	EAttribute getSolutionChange_Level();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.localsearch.SolutionChange#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solutions</em>'.
	 * @see com.misc.common.moplaf.localsearch.SolutionChange#getSolutions()
	 * @see #getSolutionChange()
	 * @generated
	 */
	EReference getSolutionChange_Solutions();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.localsearch.SolutionChange#getSubChanges <em>Sub Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Changes</em>'.
	 * @see com.misc.common.moplaf.localsearch.SolutionChange#getSubChanges()
	 * @see #getSolutionChange()
	 * @generated
	 */
	EReference getSolutionChange_SubChanges();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.localsearch.SolutionChange#getCurrentSolution <em>Current Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Solution</em>'.
	 * @see com.misc.common.moplaf.localsearch.SolutionChange#getCurrentSolution()
	 * @see #getSolutionChange()
	 * @generated
	 */
	EReference getSolutionChange_CurrentSolution();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.localsearch.StrategyLevel <em>Strategy Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Strategy Level</em>'.
	 * @see com.misc.common.moplaf.localsearch.StrategyLevel
	 * @generated
	 */
	EEnum getStrategyLevel();

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
		 * The meta object literal for the '<em><b>Strategy</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Action Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION_NR = eINSTANCE.getAction_ActionNr();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__STEP = eINSTANCE.getAction_Step();

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
		 * The meta object literal for the '<em><b>Phases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__PHASES = eINSTANCE.getStrategy_Phases();

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
		 * The meta object literal for the '<em><b>Select Best Chance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__SELECT_BEST_CHANCE = eINSTANCE.getStrategy_SelectBestChance();

		/**
		 * The meta object literal for the '<em><b>Select Worst Chance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__SELECT_WORST_CHANCE = eINSTANCE.getStrategy_SelectWorstChance();

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
		 * The meta object literal for the '<em><b>Sort Solutions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY___SORT_SOLUTIONS = eINSTANCE.getStrategy__SortSolutions();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl <em>Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.localsearch.impl.PhaseImpl
		 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getPhase()
		 * @generated
		 */
		EClass PHASE = eINSTANCE.getPhase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__NAME = eINSTANCE.getPhase_Name();

		/**
		 * The meta object literal for the '<em><b>Keep Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__KEEP_LEVEL = eINSTANCE.getPhase_KeepLevel();

		/**
		 * The meta object literal for the '<em><b>Max Steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__MAX_STEPS = eINSTANCE.getPhase_MaxSteps();

		/**
		 * The meta object literal for the '<em><b>Max Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__MAX_SECONDS = eINSTANCE.getPhase_MaxSeconds();

		/**
		 * The meta object literal for the '<em><b>Phase Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__PHASE_START = eINSTANCE.getPhase_PhaseStart();

		/**
		 * The meta object literal for the '<em><b>Phase End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__PHASE_END = eINSTANCE.getPhase_PhaseEnd();

		/**
		 * The meta object literal for the '<em><b>Nr Steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__NR_STEPS = eINSTANCE.getPhase_NrSteps();

		/**
		 * The meta object literal for the '<em><b>Duration Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__DURATION_TOTAL = eINSTANCE.getPhase_DurationTotal();

		/**
		 * The meta object literal for the '<em><b>Duration Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__DURATION_AVERAGE = eINSTANCE.getPhase_DurationAverage();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE__STRATEGY = eINSTANCE.getPhase_Strategy();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE__STEPS = eINSTANCE.getPhase_Steps();

		/**
		 * The meta object literal for the '<em><b>Do Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PHASE___DO_STEP__STEP = eINSTANCE.getPhase__DoStep__Step();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.localsearch.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.localsearch.impl.StepImpl
		 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ACTIONS = eINSTANCE.getStep_Actions();

		/**
		 * The meta object literal for the '<em><b>Step Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__STEP_NR = eINSTANCE.getStep_StepNr();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PHASE = eINSTANCE.getStep_Phase();

		/**
		 * The meta object literal for the '<em><b>Do Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STEP___DO_ACTION__ACTION = eINSTANCE.getStep__DoAction__Action();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl <em>Solution Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl
		 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getSolutionChange()
		 * @generated
		 */
		EClass SOLUTION_CHANGE = eINSTANCE.getSolutionChange();

		/**
		 * The meta object literal for the '<em><b>End Solution Owned</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_CHANGE__END_SOLUTION_OWNED = eINSTANCE.getSolutionChange_EndSolutionOwned();

		/**
		 * The meta object literal for the '<em><b>Start Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_CHANGE__START_SOLUTION = eINSTANCE.getSolutionChange_StartSolution();

		/**
		 * The meta object literal for the '<em><b>End Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_CHANGE__END_SOLUTION = eINSTANCE.getSolutionChange_EndSolution();

		/**
		 * The meta object literal for the '<em><b>Start Solution Owned</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_CHANGE__START_SOLUTION_OWNED = eINSTANCE.getSolutionChange_StartSolutionOwned();

		/**
		 * The meta object literal for the '<em><b>Previous Change</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_CHANGE__PREVIOUS_CHANGE = eINSTANCE.getSolutionChange_PreviousChange();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_CHANGE__LEVEL = eINSTANCE.getSolutionChange_Level();

		/**
		 * The meta object literal for the '<em><b>Solutions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_CHANGE__SOLUTIONS = eINSTANCE.getSolutionChange_Solutions();

		/**
		 * The meta object literal for the '<em><b>Sub Changes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_CHANGE__SUB_CHANGES = eINSTANCE.getSolutionChange_SubChanges();

		/**
		 * The meta object literal for the '<em><b>Current Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_CHANGE__CURRENT_SOLUTION = eINSTANCE.getSolutionChange_CurrentSolution();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.localsearch.StrategyLevel <em>Strategy Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.localsearch.StrategyLevel
		 * @see com.misc.common.moplaf.localsearch.impl.LocalSearchPackageImpl#getStrategyLevel()
		 * @generated
		 */
		EEnum STRATEGY_LEVEL = eINSTANCE.getStrategyLevel();

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
