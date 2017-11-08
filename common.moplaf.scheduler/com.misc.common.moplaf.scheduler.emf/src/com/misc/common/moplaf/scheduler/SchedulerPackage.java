/**
 */
package com.misc.common.moplaf.scheduler;

import com.misc.common.moplaf.localsearch.LocalSearchPackage;

import com.misc.common.moplaf.propagator2.PropagatorPackage;

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
 * @see com.misc.common.moplaf.scheduler.SchedulerFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scheduler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/scheduler/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sched";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulerPackage eINSTANCE = com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.SchedulerImpl <em>Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 0;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__RUN_FEEDBACK = LocalSearchPackage.STRATEGY__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__CANCEL_FEEDBACK = LocalSearchPackage.STRATEGY__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__RESET_FEEDBACK = LocalSearchPackage.STRATEGY__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__CANCELED = LocalSearchPackage.STRATEGY__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__RETURN_SUCCESS = LocalSearchPackage.STRATEGY__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__RETURN_FEEDBACK = LocalSearchPackage.STRATEGY__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__RETURN_INFORMATION = LocalSearchPackage.STRATEGY__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__PHASES = LocalSearchPackage.STRATEGY__PHASES;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__SOLUTIONS = LocalSearchPackage.STRATEGY__SOLUTIONS;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__CURRENT_SOLUTION_NR = LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Max Nr Solutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__MAX_NR_SOLUTIONS = LocalSearchPackage.STRATEGY__MAX_NR_SOLUTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__NAME = LocalSearchPackage.STRATEGY__NAME;

	/**
	 * The feature id for the '<em><b>Select Best Chance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__SELECT_BEST_CHANCE = LocalSearchPackage.STRATEGY__SELECT_BEST_CHANCE;

	/**
	 * The feature id for the '<em><b>Select Worst Chance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__SELECT_WORST_CHANCE = LocalSearchPackage.STRATEGY__SELECT_WORST_CHANCE;

	/**
	 * The feature id for the '<em><b>Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__SCHEDULES = LocalSearchPackage.STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_FEATURE_COUNT = LocalSearchPackage.STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___COPY_PARAMS__RUNPARAMS = LocalSearchPackage.STRATEGY___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___RESET = LocalSearchPackage.STRATEGY___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___RUN = LocalSearchPackage.STRATEGY___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___RUN__RUNCONTEXT = LocalSearchPackage.STRATEGY___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___CANCEL = LocalSearchPackage.STRATEGY___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___SET_PROGRESS__STRING_FLOAT = LocalSearchPackage.STRATEGY___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___SET_PROGRESS__PROGRESSFEEDBACK = LocalSearchPackage.STRATEGY___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___GET_RETURN = LocalSearchPackage.STRATEGY___GET_RETURN;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___SET_RETURN__RETURNFEEDBACK = LocalSearchPackage.STRATEGY___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___CONSTRUCT_PARAMS = LocalSearchPackage.STRATEGY___CONSTRUCT_PARAMS;

	/**
	 * The operation id for the '<em>Select Good Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___SELECT_GOOD_SOLUTION = LocalSearchPackage.STRATEGY___SELECT_GOOD_SOLUTION;

	/**
	 * The operation id for the '<em>Select Bad Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___SELECT_BAD_SOLUTION = LocalSearchPackage.STRATEGY___SELECT_BAD_SOLUTION;

	/**
	 * The operation id for the '<em>Sort Solutions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___SORT_SOLUTIONS = LocalSearchPackage.STRATEGY___SORT_SOLUTIONS;

	/**
	 * The operation id for the '<em>Construct Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___CONSTRUCT_SCORE = LocalSearchPackage.STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___GENERATE_TASKS__SCHEDULE = LocalSearchPackage.STRATEGY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Resources</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___GENERATE_RESOURCES__SCHEDULE = LocalSearchPackage.STRATEGY_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_OPERATION_COUNT = LocalSearchPackage.STRATEGY_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ScheduleImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 1;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__PROPAGATOR_FUNCTIONS = LocalSearchPackage.SOLUTION__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__SCORE = LocalSearchPackage.SOLUTION__SCORE;

	/**
	 * The feature id for the '<em><b>Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__SOLUTION_NR = LocalSearchPackage.SOLUTION__SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Ancestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__ANCESTOR = LocalSearchPackage.SOLUTION__ANCESTOR;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__DESCENDANTS = LocalSearchPackage.SOLUTION__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__STRATEGY = LocalSearchPackage.SOLUTION__STRATEGY;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__TASKS = LocalSearchPackage.SOLUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__RESOURCES = LocalSearchPackage.SOLUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nr Scheduled Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__NR_SCHEDULED_TASKS = LocalSearchPackage.SOLUTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__SCHEDULER = LocalSearchPackage.SOLUTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = LocalSearchPackage.SOLUTION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = LocalSearchPackage.SOLUTION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE___GET_PROPAGATOR_FUNCTION__ECLASS = LocalSearchPackage.SOLUTION___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Add Propagator Functions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE___ADD_PROPAGATOR_FUNCTIONS__STRING = LocalSearchPackage.SOLUTION___ADD_PROPAGATOR_FUNCTIONS__STRING;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE___CLONE = LocalSearchPackage.SOLUTION___CLONE;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE___REFRESH = LocalSearchPackage.SOLUTION___REFRESH;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE___INITIALIZE = LocalSearchPackage.SOLUTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = LocalSearchPackage.SOLUTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ResourceImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SCHEDULE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scheduled Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SCHEDULED_TASKS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>First Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__FIRST_TASK = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LAST_TASK = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nr Scheduled Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NR_SCHEDULED_TASKS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___GET_PROPAGATOR_FUNCTION__ECLASS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Add Propagator Functions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___ADD_PROPAGATOR_FUNCTIONS__STRING = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTIONS__STRING;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.TaskImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 3;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SCHEDULE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NEXT_TASK = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PREVIOUS_TASK = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scheduled Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SCHEDULED_RESOURCE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scheduled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SCHEDULED = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_PROPAGATOR_FUNCTION__ECLASS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Add Propagator Functions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___ADD_PROPAGATOR_FUNCTIONS__STRING = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTIONS__STRING;

	/**
	 * The operation id for the '<em>Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SCHEDULE__RESOURCE_TASK_TASK = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Unschedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___UNSCHEDULE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.MoveScheduleImpl <em>Move Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.MoveScheduleImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMoveSchedule()
	 * @generated
	 */
	int MOVE_SCHEDULE = 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE__ACTION = LocalSearchPackage.MOVE__ACTION;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE__SCORE = LocalSearchPackage.MOVE__SCORE;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE__PREVIOUS = LocalSearchPackage.MOVE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE__NEXT_MOVES = LocalSearchPackage.MOVE__NEXT_MOVES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE__DESCRIPTION = LocalSearchPackage.MOVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE__VALID = LocalSearchPackage.MOVE__VALID;

	/**
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE__VALID_FEEDBACK = LocalSearchPackage.MOVE__VALID_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Do Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE__DO_ENABLED_FEEDBACK = LocalSearchPackage.MOVE__DO_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Undo Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE__UNDO_ENABLED_FEEDBACK = LocalSearchPackage.MOVE__UNDO_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Select Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE__SELECT_ENABLED_FEEDBACK = LocalSearchPackage.MOVE__SELECT_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE__CURRENT = LocalSearchPackage.MOVE__CURRENT;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE__SOLUTION = LocalSearchPackage.MOVE__SOLUTION;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE__TASK_TO_SCHEDULE = LocalSearchPackage.MOVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE_FEATURE_COUNT = LocalSearchPackage.MOVE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Do </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE___DO_ = LocalSearchPackage.MOVE___DO_;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE___UNDO = LocalSearchPackage.MOVE___UNDO;

	/**
	 * The number of operations of the '<em>Move Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_SCHEDULE_OPERATION_COUNT = LocalSearchPackage.MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.MoveTaskImpl <em>Move Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.MoveTaskImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMoveTask()
	 * @generated
	 */
	int MOVE_TASK = 5;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__ACTION = MOVE_SCHEDULE__ACTION;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__SCORE = MOVE_SCHEDULE__SCORE;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__PREVIOUS = MOVE_SCHEDULE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__NEXT_MOVES = MOVE_SCHEDULE__NEXT_MOVES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__DESCRIPTION = MOVE_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__VALID = MOVE_SCHEDULE__VALID;

	/**
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__VALID_FEEDBACK = MOVE_SCHEDULE__VALID_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Do Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__DO_ENABLED_FEEDBACK = MOVE_SCHEDULE__DO_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Undo Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__UNDO_ENABLED_FEEDBACK = MOVE_SCHEDULE__UNDO_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Select Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__SELECT_ENABLED_FEEDBACK = MOVE_SCHEDULE__SELECT_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__CURRENT = MOVE_SCHEDULE__CURRENT;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__SOLUTION = MOVE_SCHEDULE__SOLUTION;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__TASK_TO_SCHEDULE = MOVE_SCHEDULE__TASK_TO_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Insertion Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__INSERTION_POINT = MOVE_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK__RESOURCE = MOVE_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Move Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK_FEATURE_COUNT = MOVE_SCHEDULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Do </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK___DO_ = MOVE_SCHEDULE___DO_;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK___UNDO = MOVE_SCHEDULE___UNDO;

	/**
	 * The number of operations of the '<em>Move Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TASK_OPERATION_COUNT = MOVE_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleAfterImpl <em>Schedule After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ScheduleAfterImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleAfter()
	 * @generated
	 */
	int SCHEDULE_AFTER = 6;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__ACTION = MOVE_TASK__ACTION;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__SCORE = MOVE_TASK__SCORE;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__PREVIOUS = MOVE_TASK__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__NEXT_MOVES = MOVE_TASK__NEXT_MOVES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__DESCRIPTION = MOVE_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__VALID = MOVE_TASK__VALID;

	/**
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__VALID_FEEDBACK = MOVE_TASK__VALID_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Do Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__DO_ENABLED_FEEDBACK = MOVE_TASK__DO_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Undo Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__UNDO_ENABLED_FEEDBACK = MOVE_TASK__UNDO_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Select Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__SELECT_ENABLED_FEEDBACK = MOVE_TASK__SELECT_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__CURRENT = MOVE_TASK__CURRENT;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__SOLUTION = MOVE_TASK__SOLUTION;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__TASK_TO_SCHEDULE = MOVE_TASK__TASK_TO_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Insertion Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__INSERTION_POINT = MOVE_TASK__INSERTION_POINT;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER__RESOURCE = MOVE_TASK__RESOURCE;

	/**
	 * The number of structural features of the '<em>Schedule After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER_FEATURE_COUNT = MOVE_TASK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Do </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER___DO_ = MOVE_TASK___DO_;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER___UNDO = MOVE_TASK___UNDO;

	/**
	 * The number of operations of the '<em>Schedule After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_AFTER_OPERATION_COUNT = MOVE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleBeforeImpl <em>Schedule Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.ScheduleBeforeImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleBefore()
	 * @generated
	 */
	int SCHEDULE_BEFORE = 7;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__ACTION = MOVE_TASK__ACTION;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__SCORE = MOVE_TASK__SCORE;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__PREVIOUS = MOVE_TASK__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__NEXT_MOVES = MOVE_TASK__NEXT_MOVES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__DESCRIPTION = MOVE_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__VALID = MOVE_TASK__VALID;

	/**
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__VALID_FEEDBACK = MOVE_TASK__VALID_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Do Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__DO_ENABLED_FEEDBACK = MOVE_TASK__DO_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Undo Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__UNDO_ENABLED_FEEDBACK = MOVE_TASK__UNDO_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Select Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__SELECT_ENABLED_FEEDBACK = MOVE_TASK__SELECT_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__CURRENT = MOVE_TASK__CURRENT;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__SOLUTION = MOVE_TASK__SOLUTION;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__TASK_TO_SCHEDULE = MOVE_TASK__TASK_TO_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Insertion Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__INSERTION_POINT = MOVE_TASK__INSERTION_POINT;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE__RESOURCE = MOVE_TASK__RESOURCE;

	/**
	 * The number of structural features of the '<em>Schedule Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE_FEATURE_COUNT = MOVE_TASK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Do </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE___DO_ = MOVE_TASK___DO_;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE___UNDO = MOVE_TASK___UNDO;

	/**
	 * The number of operations of the '<em>Schedule Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_BEFORE_OPERATION_COUNT = MOVE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.scheduler.impl.UnscheduleImpl <em>Unschedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.scheduler.impl.UnscheduleImpl
	 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getUnschedule()
	 * @generated
	 */
	int UNSCHEDULE = 8;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__ACTION = MOVE_SCHEDULE__ACTION;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__SCORE = MOVE_SCHEDULE__SCORE;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__PREVIOUS = MOVE_SCHEDULE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__NEXT_MOVES = MOVE_SCHEDULE__NEXT_MOVES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__DESCRIPTION = MOVE_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__VALID = MOVE_SCHEDULE__VALID;

	/**
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__VALID_FEEDBACK = MOVE_SCHEDULE__VALID_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Do Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__DO_ENABLED_FEEDBACK = MOVE_SCHEDULE__DO_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Undo Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__UNDO_ENABLED_FEEDBACK = MOVE_SCHEDULE__UNDO_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Select Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__SELECT_ENABLED_FEEDBACK = MOVE_SCHEDULE__SELECT_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__CURRENT = MOVE_SCHEDULE__CURRENT;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__SOLUTION = MOVE_SCHEDULE__SOLUTION;

	/**
	 * The feature id for the '<em><b>Task To Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE__TASK_TO_SCHEDULE = MOVE_SCHEDULE__TASK_TO_SCHEDULE;

	/**
	 * The number of structural features of the '<em>Unschedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE_FEATURE_COUNT = MOVE_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Do </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE___DO_ = MOVE_SCHEDULE___DO_;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE___UNDO = MOVE_SCHEDULE___UNDO;

	/**
	 * The number of operations of the '<em>Unschedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSCHEDULE_OPERATION_COUNT = MOVE_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler</em>'.
	 * @see com.misc.common.moplaf.scheduler.Scheduler
	 * @generated
	 */
	EClass getScheduler();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.scheduler.Scheduler#getSchedules <em>Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedules</em>'.
	 * @see com.misc.common.moplaf.scheduler.Scheduler#getSchedules()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Schedules();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Scheduler#constructScore() <em>Construct Score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Score</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Scheduler#constructScore()
	 * @generated
	 */
	EOperation getScheduler__ConstructScore();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Scheduler#generateTasks(com.misc.common.moplaf.scheduler.Schedule) <em>Generate Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Tasks</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Scheduler#generateTasks(com.misc.common.moplaf.scheduler.Schedule)
	 * @generated
	 */
	EOperation getScheduler__GenerateTasks__Schedule();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Scheduler#generateResources(com.misc.common.moplaf.scheduler.Schedule) <em>Generate Resources</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Resources</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Scheduler#generateResources(com.misc.common.moplaf.scheduler.Schedule)
	 * @generated
	 */
	EOperation getScheduler__GenerateResources__Schedule();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see com.misc.common.moplaf.scheduler.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.scheduler.Schedule#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see com.misc.common.moplaf.scheduler.Schedule#getTasks()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.scheduler.Schedule#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.misc.common.moplaf.scheduler.Schedule#getResources()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Resources();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.Schedule#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduler</em>'.
	 * @see com.misc.common.moplaf.scheduler.Schedule#getScheduler()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Scheduler();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.Schedule#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Scheduled Tasks</em>'.
	 * @see com.misc.common.moplaf.scheduler.Schedule#getNrScheduledTasks()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_NrScheduledTasks();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Schedule#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Schedule#initialize()
	 * @generated
	 */
	EOperation getSchedule__Initialize();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.scheduler.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.scheduler.Resource#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schedule</em>'.
	 * @see com.misc.common.moplaf.scheduler.Resource#getSchedule()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Schedule();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.Resource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.scheduler.Resource#getDescription()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Description();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.scheduler.Resource#getScheduledTasks <em>Scheduled Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scheduled Tasks</em>'.
	 * @see com.misc.common.moplaf.scheduler.Resource#getScheduledTasks()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ScheduledTasks();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.Resource#getFirstTask <em>First Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.Resource#getFirstTask()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_FirstTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.Resource#getLastTask <em>Last Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.Resource#getLastTask()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_LastTask();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.Resource#getNrScheduledTasks <em>Nr Scheduled Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Scheduled Tasks</em>'.
	 * @see com.misc.common.moplaf.scheduler.Resource#getNrScheduledTasks()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_NrScheduledTasks();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.scheduler.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.Task#getNextTask <em>Next Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.Task#getNextTask()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_NextTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.Task#getPreviousTask <em>Previous Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.Task#getPreviousTask()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_PreviousTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.Task#getScheduledResource <em>Scheduled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduled Resource</em>'.
	 * @see com.misc.common.moplaf.scheduler.Task#getScheduledResource()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ScheduledResource();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.scheduler.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.scheduler.Task#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schedule</em>'.
	 * @see com.misc.common.moplaf.scheduler.Task#getSchedule()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Schedule();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.scheduler.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.scheduler.Task#isScheduled <em>Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduled</em>'.
	 * @see com.misc.common.moplaf.scheduler.Task#isScheduled()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Scheduled();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Task#schedule(com.misc.common.moplaf.scheduler.Resource, com.misc.common.moplaf.scheduler.Task, com.misc.common.moplaf.scheduler.Task) <em>Schedule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Schedule</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Task#schedule(com.misc.common.moplaf.scheduler.Resource, com.misc.common.moplaf.scheduler.Task, com.misc.common.moplaf.scheduler.Task)
	 * @generated
	 */
	EOperation getTask__Schedule__Resource_Task_Task();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.scheduler.Task#unschedule() <em>Unschedule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unschedule</em>' operation.
	 * @see com.misc.common.moplaf.scheduler.Task#unschedule()
	 * @generated
	 */
	EOperation getTask__Unschedule();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.MoveSchedule <em>Move Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Schedule</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveSchedule
	 * @generated
	 */
	EClass getMoveSchedule();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.MoveSchedule#getTaskToSchedule <em>Task To Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task To Schedule</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveSchedule#getTaskToSchedule()
	 * @see #getMoveSchedule()
	 * @generated
	 */
	EReference getMoveSchedule_TaskToSchedule();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.MoveTask <em>Move Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Task</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveTask
	 * @generated
	 */
	EClass getMoveTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.MoveTask#getInsertionPoint <em>Insertion Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Insertion Point</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveTask#getInsertionPoint()
	 * @see #getMoveTask()
	 * @generated
	 */
	EReference getMoveTask_InsertionPoint();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.scheduler.MoveTask#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.scheduler.MoveTask#getResource()
	 * @see #getMoveTask()
	 * @generated
	 */
	EReference getMoveTask_Resource();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ScheduleAfter <em>Schedule After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule After</em>'.
	 * @see com.misc.common.moplaf.scheduler.ScheduleAfter
	 * @generated
	 */
	EClass getScheduleAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.ScheduleBefore <em>Schedule Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Before</em>'.
	 * @see com.misc.common.moplaf.scheduler.ScheduleBefore
	 * @generated
	 */
	EClass getScheduleBefore();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.scheduler.Unschedule <em>Unschedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unschedule</em>'.
	 * @see com.misc.common.moplaf.scheduler.Unschedule
	 * @generated
	 */
	EClass getUnschedule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchedulerFactory getSchedulerFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.SchedulerImpl <em>Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduler()
		 * @generated
		 */
		EClass SCHEDULER = eINSTANCE.getScheduler();

		/**
		 * The meta object literal for the '<em><b>Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__SCHEDULES = eINSTANCE.getScheduler_Schedules();

		/**
		 * The meta object literal for the '<em><b>Construct Score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULER___CONSTRUCT_SCORE = eINSTANCE.getScheduler__ConstructScore();

		/**
		 * The meta object literal for the '<em><b>Generate Tasks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULER___GENERATE_TASKS__SCHEDULE = eINSTANCE.getScheduler__GenerateTasks__Schedule();

		/**
		 * The meta object literal for the '<em><b>Generate Resources</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULER___GENERATE_RESOURCES__SCHEDULE = eINSTANCE.getScheduler__GenerateResources__Schedule();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ScheduleImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__TASKS = eINSTANCE.getSchedule_Tasks();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__RESOURCES = eINSTANCE.getSchedule_Resources();

		/**
		 * The meta object literal for the '<em><b>Scheduler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__SCHEDULER = eINSTANCE.getSchedule_Scheduler();

		/**
		 * The meta object literal for the '<em><b>Nr Scheduled Tasks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__NR_SCHEDULED_TASKS = eINSTANCE.getSchedule_NrScheduledTasks();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULE___INITIALIZE = eINSTANCE.getSchedule__Initialize();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ResourceImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__SCHEDULE = eINSTANCE.getResource_Schedule();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DESCRIPTION = eINSTANCE.getResource_Description();

		/**
		 * The meta object literal for the '<em><b>Scheduled Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__SCHEDULED_TASKS = eINSTANCE.getResource_ScheduledTasks();

		/**
		 * The meta object literal for the '<em><b>First Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__FIRST_TASK = eINSTANCE.getResource_FirstTask();

		/**
		 * The meta object literal for the '<em><b>Last Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__LAST_TASK = eINSTANCE.getResource_LastTask();

		/**
		 * The meta object literal for the '<em><b>Nr Scheduled Tasks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NR_SCHEDULED_TASKS = eINSTANCE.getResource_NrScheduledTasks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.TaskImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Next Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__NEXT_TASK = eINSTANCE.getTask_NextTask();

		/**
		 * The meta object literal for the '<em><b>Previous Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PREVIOUS_TASK = eINSTANCE.getTask_PreviousTask();

		/**
		 * The meta object literal for the '<em><b>Scheduled Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SCHEDULED_RESOURCE = eINSTANCE.getTask_ScheduledResource();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SCHEDULE = eINSTANCE.getTask_Schedule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Scheduled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__SCHEDULED = eINSTANCE.getTask_Scheduled();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___SCHEDULE__RESOURCE_TASK_TASK = eINSTANCE.getTask__Schedule__Resource_Task_Task();

		/**
		 * The meta object literal for the '<em><b>Unschedule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___UNSCHEDULE = eINSTANCE.getTask__Unschedule();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.MoveScheduleImpl <em>Move Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.MoveScheduleImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMoveSchedule()
		 * @generated
		 */
		EClass MOVE_SCHEDULE = eINSTANCE.getMoveSchedule();

		/**
		 * The meta object literal for the '<em><b>Task To Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_SCHEDULE__TASK_TO_SCHEDULE = eINSTANCE.getMoveSchedule_TaskToSchedule();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.MoveTaskImpl <em>Move Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.MoveTaskImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getMoveTask()
		 * @generated
		 */
		EClass MOVE_TASK = eINSTANCE.getMoveTask();

		/**
		 * The meta object literal for the '<em><b>Insertion Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_TASK__INSERTION_POINT = eINSTANCE.getMoveTask_InsertionPoint();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_TASK__RESOURCE = eINSTANCE.getMoveTask_Resource();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleAfterImpl <em>Schedule After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ScheduleAfterImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleAfter()
		 * @generated
		 */
		EClass SCHEDULE_AFTER = eINSTANCE.getScheduleAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.ScheduleBeforeImpl <em>Schedule Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.ScheduleBeforeImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getScheduleBefore()
		 * @generated
		 */
		EClass SCHEDULE_BEFORE = eINSTANCE.getScheduleBefore();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.scheduler.impl.UnscheduleImpl <em>Unschedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.scheduler.impl.UnscheduleImpl
		 * @see com.misc.common.moplaf.scheduler.impl.SchedulerPackageImpl#getUnschedule()
		 * @generated
		 */
		EClass UNSCHEDULE = eINSTANCE.getUnschedule();

	}

} //SchedulerPackage
