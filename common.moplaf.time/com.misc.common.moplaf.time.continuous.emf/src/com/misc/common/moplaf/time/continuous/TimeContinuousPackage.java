/**
 */
package com.misc.common.moplaf.time.continuous;

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
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousFactory
 * @model kind="package"
 * @generated
 */
public interface TimeContinuousPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "continuous";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/time/continuous/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "timcont";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimeContinuousPackage eINSTANCE = com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl <em>Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getDistribution()
	 * @generated
	 */
	int DISTRIBUTION = 0;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__TIME_UNIT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Horizon Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__HORIZON_START = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Horizon End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__HORIZON_END = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__CHILD_EVENTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__SEQUENCE_EVENTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__START = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__END = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Events Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__EVENTS_PROVIDERS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__PARENT_DISTRIBUTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Child Distribution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__CHILD_DISTRIBUTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Provided Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__PROVIDED_EVENTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_PROPAGATOR_FUNCTION__ECLASS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Duration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_DURATION__DATE_DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_MOMENT__DATE_FLOAT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Event Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_EVENT_BEFORE__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Event Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_EVENT_STRICT_BEFORE__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Event After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_EVENT_AFTER__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Event Strict After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_EVENT_STRICT_AFTER__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_AMOUNT_BEFORE__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_AMOUNT_AFTER__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_AMOUNT__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_SLOPE_BEFORE__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_SLOPE_AFTER__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Min Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_MIN_AMOUNT__DATE_DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Max Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_MAX_AMOUNT__DATE_DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Average Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_AVERAGE_AMOUNT__DATE_DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Cumulated Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_CUMULATED_AMOUNT__DATE_DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Earliest Below</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_EARLIEST_BELOW__DATE_FLOAT_FLOAT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Latest Below</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_LATEST_BELOW__DATE_FLOAT_FLOAT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Earliest Above</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_EARLIEST_ABOVE__DATE_FLOAT_FLOAT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Latest Above</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_LATEST_ABOVE__DATE_FLOAT_FLOAT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Earliest Output Possible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_EARLIEST_OUTPUT_POSSIBLE__FLOAT_DATE_FLOAT_FLOAT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Refresh Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___REFRESH_INIT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Refresh Sequence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___REFRESH_SEQUENCE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Refresh Child Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___REFRESH_CHILD_EVENT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Refresh Provided Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___REFRESH_PROVIDED_EVENTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___ACCEPT__DATE_DATE_DISTRIBUTIONVISITOR = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl <em>Distribution Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getDistributionEvent()
	 * @generated
	 */
	int DISTRIBUTION_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__MOMENT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__EVENT_NR = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__NEXT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__PREVIOUS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__AMOUNT_BEFORE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__AMOUNT_AFTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__SLOPE_BEFORE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__SLOPE_AFTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__DISTRIBUTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Distribution Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___GET_AMOUNT_BEFORE__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___GET_AMOUNT_AFTER__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___IS_BEFORE__DISTRIBUTIONEVENT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___REFRESH_MOMENT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Distribution Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.OwnedEventImpl <em>Owned Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.OwnedEventImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getOwnedEvent()
	 * @generated
	 */
	int OWNED_EVENT = 26;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT__PROPAGATOR_FUNCTIONS = DISTRIBUTION_EVENT__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT__MOMENT = DISTRIBUTION_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT__EVENT_NR = DISTRIBUTION_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT__NEXT = DISTRIBUTION_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT__PREVIOUS = DISTRIBUTION_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT__AMOUNT_BEFORE = DISTRIBUTION_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT__AMOUNT_AFTER = DISTRIBUTION_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT__SLOPE_BEFORE = DISTRIBUTION_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT__SLOPE_AFTER = DISTRIBUTION_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT__DESCRIPTION = DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT__DISTRIBUTION_AS_SEQUENCE = DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT__DISTRIBUTION = DISTRIBUTION_EVENT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT = DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The number of structural features of the '<em>Owned Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT_FEATURE_COUNT = DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = DISTRIBUTION_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS = DISTRIBUTION_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT___GET_AMOUNT_BEFORE__DATE = DISTRIBUTION_EVENT___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT___GET_AMOUNT_AFTER__DATE = DISTRIBUTION_EVENT___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT___IS_BEFORE__DISTRIBUTIONEVENT = DISTRIBUTION_EVENT___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = DISTRIBUTION_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT___REFRESH_SLOPE_BEFORE = DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT___REFRESH_AMOUNT_BEFORE = DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT___REFRESH_AMOUNT_AFTER = DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT___REFRESH_SLOPE_AFTER = DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT___REFRESH_MOMENT = DISTRIBUTION_EVENT___REFRESH_MOMENT;

	/**
	 * The number of operations of the '<em>Owned Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_EVENT_OPERATION_COUNT = DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.ChildEventImpl <em>Child Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.ChildEventImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getChildEvent()
	 * @generated
	 */
	int CHILD_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__PROPAGATOR_FUNCTIONS = OWNED_EVENT__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__MOMENT = OWNED_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__EVENT_NR = OWNED_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__NEXT = OWNED_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__PREVIOUS = OWNED_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__AMOUNT_BEFORE = OWNED_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__AMOUNT_AFTER = OWNED_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__SLOPE_BEFORE = OWNED_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__SLOPE_AFTER = OWNED_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__DESCRIPTION = OWNED_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__DISTRIBUTION_AS_SEQUENCE = OWNED_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__DISTRIBUTION = OWNED_EVENT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT = OWNED_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__ORIGINAL = OWNED_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT_FEATURE_COUNT = OWNED_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = OWNED_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS = OWNED_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___GET_AMOUNT_BEFORE__DATE = OWNED_EVENT___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___GET_AMOUNT_AFTER__DATE = OWNED_EVENT___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___IS_BEFORE__DISTRIBUTIONEVENT = OWNED_EVENT___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = OWNED_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___REFRESH_SLOPE_BEFORE = OWNED_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___REFRESH_AMOUNT_BEFORE = OWNED_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___REFRESH_AMOUNT_AFTER = OWNED_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___REFRESH_SLOPE_AFTER = OWNED_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___REFRESH_MOMENT = OWNED_EVENT___REFRESH_MOMENT;

	/**
	 * The number of operations of the '<em>Child Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT_OPERATION_COUNT = OWNED_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.StartEventImpl <em>Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.StartEventImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getStartEvent()
	 * @generated
	 */
	int START_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__PROPAGATOR_FUNCTIONS = OWNED_EVENT__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__MOMENT = OWNED_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__EVENT_NR = OWNED_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__NEXT = OWNED_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__PREVIOUS = OWNED_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__AMOUNT_BEFORE = OWNED_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__AMOUNT_AFTER = OWNED_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__SLOPE_BEFORE = OWNED_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__SLOPE_AFTER = OWNED_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__DESCRIPTION = OWNED_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__DISTRIBUTION_AS_SEQUENCE = OWNED_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__DISTRIBUTION = OWNED_EVENT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT = OWNED_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Amount At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__AMOUNT_AT_START = OWNED_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slope At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__SLOPE_AT_START = OWNED_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_FEATURE_COUNT = OWNED_EVENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = OWNED_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS = OWNED_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___GET_AMOUNT_BEFORE__DATE = OWNED_EVENT___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___GET_AMOUNT_AFTER__DATE = OWNED_EVENT___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___IS_BEFORE__DISTRIBUTIONEVENT = OWNED_EVENT___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = OWNED_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___REFRESH_SLOPE_BEFORE = OWNED_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___REFRESH_AMOUNT_BEFORE = OWNED_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___REFRESH_AMOUNT_AFTER = OWNED_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___REFRESH_SLOPE_AFTER = OWNED_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___REFRESH_MOMENT = OWNED_EVENT___REFRESH_MOMENT;

	/**
	 * The number of operations of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_OPERATION_COUNT = OWNED_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.EndEventImpl <em>End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.EndEventImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getEndEvent()
	 * @generated
	 */
	int END_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__PROPAGATOR_FUNCTIONS = OWNED_EVENT__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__MOMENT = OWNED_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__EVENT_NR = OWNED_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__NEXT = OWNED_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__PREVIOUS = OWNED_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__AMOUNT_BEFORE = OWNED_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__AMOUNT_AFTER = OWNED_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__SLOPE_BEFORE = OWNED_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__SLOPE_AFTER = OWNED_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__DESCRIPTION = OWNED_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__DISTRIBUTION_AS_SEQUENCE = OWNED_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__DISTRIBUTION = OWNED_EVENT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT = OWNED_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The number of structural features of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_FEATURE_COUNT = OWNED_EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = OWNED_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS = OWNED_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___GET_AMOUNT_BEFORE__DATE = OWNED_EVENT___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___GET_AMOUNT_AFTER__DATE = OWNED_EVENT___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___IS_BEFORE__DISTRIBUTIONEVENT = OWNED_EVENT___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = OWNED_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___REFRESH_SLOPE_BEFORE = OWNED_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___REFRESH_AMOUNT_BEFORE = OWNED_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___REFRESH_AMOUNT_AFTER = OWNED_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___REFRESH_SLOPE_AFTER = OWNED_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___REFRESH_MOMENT = OWNED_EVENT___REFRESH_MOMENT;

	/**
	 * The number of operations of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_OPERATION_COUNT = OWNED_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.ProvidedEventImpl <em>Provided Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.ProvidedEventImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getProvidedEvent()
	 * @generated
	 */
	int PROVIDED_EVENT = 27;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT__PROPAGATOR_FUNCTIONS = DISTRIBUTION_EVENT__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT__MOMENT = DISTRIBUTION_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT__EVENT_NR = DISTRIBUTION_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT__NEXT = DISTRIBUTION_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT__PREVIOUS = DISTRIBUTION_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT__AMOUNT_BEFORE = DISTRIBUTION_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT__AMOUNT_AFTER = DISTRIBUTION_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT__SLOPE_BEFORE = DISTRIBUTION_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT__SLOPE_AFTER = DISTRIBUTION_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT__DESCRIPTION = DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT__DISTRIBUTION_AS_SEQUENCE = DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT__DISTRIBUTION = DISTRIBUTION_EVENT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT = DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Event Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT__EVENT_PROVIDER = DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provided Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT_FEATURE_COUNT = DISTRIBUTION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = DISTRIBUTION_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS = DISTRIBUTION_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT___GET_AMOUNT_BEFORE__DATE = DISTRIBUTION_EVENT___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT___GET_AMOUNT_AFTER__DATE = DISTRIBUTION_EVENT___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT___IS_BEFORE__DISTRIBUTIONEVENT = DISTRIBUTION_EVENT___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = DISTRIBUTION_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT___REFRESH_SLOPE_BEFORE = DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT___REFRESH_AMOUNT_BEFORE = DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT___REFRESH_AMOUNT_AFTER = DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT___REFRESH_SLOPE_AFTER = DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT___REFRESH_MOMENT = DISTRIBUTION_EVENT___REFRESH_MOMENT;

	/**
	 * The number of operations of the '<em>Provided Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EVENT_OPERATION_COUNT = DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountImpulsionImpl <em>Amount Impulsion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.AmountImpulsionImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getAmountImpulsion()
	 * @generated
	 */
	int AMOUNT_IMPULSION = 5;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__PROPAGATOR_FUNCTIONS = PROVIDED_EVENT__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__MOMENT = PROVIDED_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__EVENT_NR = PROVIDED_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__NEXT = PROVIDED_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__PREVIOUS = PROVIDED_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__AMOUNT_BEFORE = PROVIDED_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__AMOUNT_AFTER = PROVIDED_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__SLOPE_BEFORE = PROVIDED_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__SLOPE_AFTER = PROVIDED_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__DESCRIPTION = PROVIDED_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__DISTRIBUTION_AS_SEQUENCE = PROVIDED_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__DISTRIBUTION = PROVIDED_EVENT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__DISTRIBUTION_AS_PROVIDED_EVENT = PROVIDED_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Event Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__EVENT_PROVIDER = PROVIDED_EVENT__EVENT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Amount Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__AMOUNT_IMPULSION = PROVIDED_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Amount Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_FEATURE_COUNT = PROVIDED_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PROVIDED_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___GET_PROPAGATOR_FUNCTION__ECLASS = PROVIDED_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___GET_AMOUNT_BEFORE__DATE = PROVIDED_EVENT___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___GET_AMOUNT_AFTER__DATE = PROVIDED_EVENT___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___IS_BEFORE__DISTRIBUTIONEVENT = PROVIDED_EVENT___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = PROVIDED_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___REFRESH_SLOPE_BEFORE = PROVIDED_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___REFRESH_AMOUNT_BEFORE = PROVIDED_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___REFRESH_AMOUNT_AFTER = PROVIDED_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___REFRESH_SLOPE_AFTER = PROVIDED_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___REFRESH_MOMENT = PROVIDED_EVENT___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Amount Impulsion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___REFRESH_AMOUNT_IMPULSION = PROVIDED_EVENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Amount Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_OPERATION_COUNT = PROVIDED_EVENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionImpl <em>Slope Impulsion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getSlopeImpulsion()
	 * @generated
	 */
	int SLOPE_IMPULSION = 6;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__PROPAGATOR_FUNCTIONS = PROVIDED_EVENT__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__MOMENT = PROVIDED_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__EVENT_NR = PROVIDED_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__NEXT = PROVIDED_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__PREVIOUS = PROVIDED_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__AMOUNT_BEFORE = PROVIDED_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__AMOUNT_AFTER = PROVIDED_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__SLOPE_BEFORE = PROVIDED_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__SLOPE_AFTER = PROVIDED_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__DESCRIPTION = PROVIDED_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__DISTRIBUTION_AS_SEQUENCE = PROVIDED_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__DISTRIBUTION = PROVIDED_EVENT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__DISTRIBUTION_AS_PROVIDED_EVENT = PROVIDED_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Event Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__EVENT_PROVIDER = PROVIDED_EVENT__EVENT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Slope Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__SLOPE_IMPULSION = PROVIDED_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Slope Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_FEATURE_COUNT = PROVIDED_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PROVIDED_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___GET_PROPAGATOR_FUNCTION__ECLASS = PROVIDED_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___GET_AMOUNT_BEFORE__DATE = PROVIDED_EVENT___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___GET_AMOUNT_AFTER__DATE = PROVIDED_EVENT___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___IS_BEFORE__DISTRIBUTIONEVENT = PROVIDED_EVENT___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = PROVIDED_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___REFRESH_SLOPE_BEFORE = PROVIDED_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___REFRESH_AMOUNT_BEFORE = PROVIDED_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___REFRESH_AMOUNT_AFTER = PROVIDED_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___REFRESH_SLOPE_AFTER = PROVIDED_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___REFRESH_MOMENT = PROVIDED_EVENT___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Slope Impulsion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___REFRESH_SLOPE_IMPULSION = PROVIDED_EVENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Slope Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_OPERATION_COUNT = PROVIDED_EVENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteImpl <em>Amount Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getAmountAbsolute()
	 * @generated
	 */
	int AMOUNT_ABSOLUTE = 7;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__PROPAGATOR_FUNCTIONS = PROVIDED_EVENT__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__MOMENT = PROVIDED_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__EVENT_NR = PROVIDED_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__NEXT = PROVIDED_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__PREVIOUS = PROVIDED_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__AMOUNT_BEFORE = PROVIDED_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__AMOUNT_AFTER = PROVIDED_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__SLOPE_BEFORE = PROVIDED_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__SLOPE_AFTER = PROVIDED_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__DESCRIPTION = PROVIDED_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__DISTRIBUTION_AS_SEQUENCE = PROVIDED_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__DISTRIBUTION = PROVIDED_EVENT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__DISTRIBUTION_AS_PROVIDED_EVENT = PROVIDED_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Event Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__EVENT_PROVIDER = PROVIDED_EVENT__EVENT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Amount Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE = PROVIDED_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Amount Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_FEATURE_COUNT = PROVIDED_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PROVIDED_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___GET_PROPAGATOR_FUNCTION__ECLASS = PROVIDED_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___GET_AMOUNT_BEFORE__DATE = PROVIDED_EVENT___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___GET_AMOUNT_AFTER__DATE = PROVIDED_EVENT___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___IS_BEFORE__DISTRIBUTIONEVENT = PROVIDED_EVENT___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = PROVIDED_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___REFRESH_SLOPE_BEFORE = PROVIDED_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___REFRESH_AMOUNT_BEFORE = PROVIDED_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___REFRESH_AMOUNT_AFTER = PROVIDED_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___REFRESH_SLOPE_AFTER = PROVIDED_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___REFRESH_MOMENT = PROVIDED_EVENT___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Amount Absolute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___REFRESH_AMOUNT_ABSOLUTE = PROVIDED_EVENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Amount Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_OPERATION_COUNT = PROVIDED_EVENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteImpl <em>Slope Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getSlopeAbsolute()
	 * @generated
	 */
	int SLOPE_ABSOLUTE = 8;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__PROPAGATOR_FUNCTIONS = PROVIDED_EVENT__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__MOMENT = PROVIDED_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__EVENT_NR = PROVIDED_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__NEXT = PROVIDED_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__PREVIOUS = PROVIDED_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__AMOUNT_BEFORE = PROVIDED_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__AMOUNT_AFTER = PROVIDED_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__SLOPE_BEFORE = PROVIDED_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__SLOPE_AFTER = PROVIDED_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__DESCRIPTION = PROVIDED_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__DISTRIBUTION_AS_SEQUENCE = PROVIDED_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__DISTRIBUTION = PROVIDED_EVENT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__DISTRIBUTION_AS_PROVIDED_EVENT = PROVIDED_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Event Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__EVENT_PROVIDER = PROVIDED_EVENT__EVENT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Slope Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__SLOPE_ABSOLUTE = PROVIDED_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Slope Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_FEATURE_COUNT = PROVIDED_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PROVIDED_EVENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___GET_PROPAGATOR_FUNCTION__ECLASS = PROVIDED_EVENT___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___GET_AMOUNT_BEFORE__DATE = PROVIDED_EVENT___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___GET_AMOUNT_AFTER__DATE = PROVIDED_EVENT___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___IS_BEFORE__DISTRIBUTIONEVENT = PROVIDED_EVENT___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = PROVIDED_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___REFRESH_SLOPE_BEFORE = PROVIDED_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___REFRESH_AMOUNT_BEFORE = PROVIDED_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___REFRESH_AMOUNT_AFTER = PROVIDED_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___REFRESH_SLOPE_AFTER = PROVIDED_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___REFRESH_MOMENT = PROVIDED_EVENT___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Slope Absolute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___REFRESH_SLOPE_ABSOLUTE = PROVIDED_EVENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Slope Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_OPERATION_COUNT = PROVIDED_EVENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeStartImpl <em>Capacity Change Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.CapacityChangeStartImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getCapacityChangeStart()
	 * @generated
	 */
	int CAPACITY_CHANGE_START = 9;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__PROPAGATOR_FUNCTIONS = AMOUNT_IMPULSION__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__MOMENT = AMOUNT_IMPULSION__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__EVENT_NR = AMOUNT_IMPULSION__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__NEXT = AMOUNT_IMPULSION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__PREVIOUS = AMOUNT_IMPULSION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__AMOUNT_BEFORE = AMOUNT_IMPULSION__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__AMOUNT_AFTER = AMOUNT_IMPULSION__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__SLOPE_BEFORE = AMOUNT_IMPULSION__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__SLOPE_AFTER = AMOUNT_IMPULSION__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__DESCRIPTION = AMOUNT_IMPULSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__DISTRIBUTION_AS_SEQUENCE = AMOUNT_IMPULSION__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__DISTRIBUTION = AMOUNT_IMPULSION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__DISTRIBUTION_AS_PROVIDED_EVENT = AMOUNT_IMPULSION__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Event Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__EVENT_PROVIDER = AMOUNT_IMPULSION__EVENT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Amount Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__AMOUNT_IMPULSION = AMOUNT_IMPULSION__AMOUNT_IMPULSION;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__PROVIDER = AMOUNT_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capacity Change Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START_FEATURE_COUNT = AMOUNT_IMPULSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = AMOUNT_IMPULSION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START___GET_PROPAGATOR_FUNCTION__ECLASS = AMOUNT_IMPULSION___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START___GET_AMOUNT_BEFORE__DATE = AMOUNT_IMPULSION___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START___GET_AMOUNT_AFTER__DATE = AMOUNT_IMPULSION___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START___IS_BEFORE__DISTRIBUTIONEVENT = AMOUNT_IMPULSION___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = AMOUNT_IMPULSION___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START___REFRESH_SLOPE_BEFORE = AMOUNT_IMPULSION___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START___REFRESH_AMOUNT_BEFORE = AMOUNT_IMPULSION___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START___REFRESH_AMOUNT_AFTER = AMOUNT_IMPULSION___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START___REFRESH_SLOPE_AFTER = AMOUNT_IMPULSION___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START___REFRESH_MOMENT = AMOUNT_IMPULSION___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Amount Impulsion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START___REFRESH_AMOUNT_IMPULSION = AMOUNT_IMPULSION___REFRESH_AMOUNT_IMPULSION;

	/**
	 * The number of operations of the '<em>Capacity Change Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START_OPERATION_COUNT = AMOUNT_IMPULSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeEndImpl <em>Capacity Change End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.CapacityChangeEndImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getCapacityChangeEnd()
	 * @generated
	 */
	int CAPACITY_CHANGE_END = 10;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__PROPAGATOR_FUNCTIONS = AMOUNT_IMPULSION__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__MOMENT = AMOUNT_IMPULSION__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__EVENT_NR = AMOUNT_IMPULSION__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__NEXT = AMOUNT_IMPULSION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__PREVIOUS = AMOUNT_IMPULSION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__AMOUNT_BEFORE = AMOUNT_IMPULSION__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__AMOUNT_AFTER = AMOUNT_IMPULSION__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__SLOPE_BEFORE = AMOUNT_IMPULSION__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__SLOPE_AFTER = AMOUNT_IMPULSION__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__DESCRIPTION = AMOUNT_IMPULSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__DISTRIBUTION_AS_SEQUENCE = AMOUNT_IMPULSION__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__DISTRIBUTION = AMOUNT_IMPULSION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__DISTRIBUTION_AS_PROVIDED_EVENT = AMOUNT_IMPULSION__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Event Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__EVENT_PROVIDER = AMOUNT_IMPULSION__EVENT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Amount Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__AMOUNT_IMPULSION = AMOUNT_IMPULSION__AMOUNT_IMPULSION;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__PROVIDER = AMOUNT_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capacity Change End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END_FEATURE_COUNT = AMOUNT_IMPULSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = AMOUNT_IMPULSION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END___GET_PROPAGATOR_FUNCTION__ECLASS = AMOUNT_IMPULSION___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END___GET_AMOUNT_BEFORE__DATE = AMOUNT_IMPULSION___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END___GET_AMOUNT_AFTER__DATE = AMOUNT_IMPULSION___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END___IS_BEFORE__DISTRIBUTIONEVENT = AMOUNT_IMPULSION___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = AMOUNT_IMPULSION___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END___REFRESH_SLOPE_BEFORE = AMOUNT_IMPULSION___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END___REFRESH_AMOUNT_BEFORE = AMOUNT_IMPULSION___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END___REFRESH_AMOUNT_AFTER = AMOUNT_IMPULSION___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END___REFRESH_SLOPE_AFTER = AMOUNT_IMPULSION___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END___REFRESH_MOMENT = AMOUNT_IMPULSION___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Amount Impulsion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END___REFRESH_AMOUNT_IMPULSION = AMOUNT_IMPULSION___REFRESH_AMOUNT_IMPULSION;

	/**
	 * The number of operations of the '<em>Capacity Change End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END_OPERATION_COUNT = AMOUNT_IMPULSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.StockChangeStartImpl <em>Stock Change Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.StockChangeStartImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getStockChangeStart()
	 * @generated
	 */
	int STOCK_CHANGE_START = 11;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__PROPAGATOR_FUNCTIONS = SLOPE_IMPULSION__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__MOMENT = SLOPE_IMPULSION__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__EVENT_NR = SLOPE_IMPULSION__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__NEXT = SLOPE_IMPULSION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__PREVIOUS = SLOPE_IMPULSION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__AMOUNT_BEFORE = SLOPE_IMPULSION__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__AMOUNT_AFTER = SLOPE_IMPULSION__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__SLOPE_BEFORE = SLOPE_IMPULSION__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__SLOPE_AFTER = SLOPE_IMPULSION__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__DESCRIPTION = SLOPE_IMPULSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__DISTRIBUTION_AS_SEQUENCE = SLOPE_IMPULSION__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__DISTRIBUTION = SLOPE_IMPULSION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__DISTRIBUTION_AS_PROVIDED_EVENT = SLOPE_IMPULSION__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Event Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__EVENT_PROVIDER = SLOPE_IMPULSION__EVENT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Slope Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__SLOPE_IMPULSION = SLOPE_IMPULSION__SLOPE_IMPULSION;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__PROVIDER = SLOPE_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stock Change Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START_FEATURE_COUNT = SLOPE_IMPULSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = SLOPE_IMPULSION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START___GET_PROPAGATOR_FUNCTION__ECLASS = SLOPE_IMPULSION___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START___GET_AMOUNT_BEFORE__DATE = SLOPE_IMPULSION___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START___GET_AMOUNT_AFTER__DATE = SLOPE_IMPULSION___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START___IS_BEFORE__DISTRIBUTIONEVENT = SLOPE_IMPULSION___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = SLOPE_IMPULSION___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START___REFRESH_SLOPE_BEFORE = SLOPE_IMPULSION___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START___REFRESH_AMOUNT_BEFORE = SLOPE_IMPULSION___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START___REFRESH_AMOUNT_AFTER = SLOPE_IMPULSION___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START___REFRESH_SLOPE_AFTER = SLOPE_IMPULSION___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START___REFRESH_MOMENT = SLOPE_IMPULSION___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Slope Impulsion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START___REFRESH_SLOPE_IMPULSION = SLOPE_IMPULSION___REFRESH_SLOPE_IMPULSION;

	/**
	 * The number of operations of the '<em>Stock Change Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START_OPERATION_COUNT = SLOPE_IMPULSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.StockChangeEndImpl <em>Stock Change End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.StockChangeEndImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getStockChangeEnd()
	 * @generated
	 */
	int STOCK_CHANGE_END = 12;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__PROPAGATOR_FUNCTIONS = SLOPE_IMPULSION__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__MOMENT = SLOPE_IMPULSION__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__EVENT_NR = SLOPE_IMPULSION__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__NEXT = SLOPE_IMPULSION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__PREVIOUS = SLOPE_IMPULSION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__AMOUNT_BEFORE = SLOPE_IMPULSION__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__AMOUNT_AFTER = SLOPE_IMPULSION__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__SLOPE_BEFORE = SLOPE_IMPULSION__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__SLOPE_AFTER = SLOPE_IMPULSION__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__DESCRIPTION = SLOPE_IMPULSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__DISTRIBUTION_AS_SEQUENCE = SLOPE_IMPULSION__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__DISTRIBUTION = SLOPE_IMPULSION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__DISTRIBUTION_AS_PROVIDED_EVENT = SLOPE_IMPULSION__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Event Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__EVENT_PROVIDER = SLOPE_IMPULSION__EVENT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Slope Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__SLOPE_IMPULSION = SLOPE_IMPULSION__SLOPE_IMPULSION;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__PROVIDER = SLOPE_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stock Change End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END_FEATURE_COUNT = SLOPE_IMPULSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = SLOPE_IMPULSION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END___GET_PROPAGATOR_FUNCTION__ECLASS = SLOPE_IMPULSION___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END___GET_AMOUNT_BEFORE__DATE = SLOPE_IMPULSION___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END___GET_AMOUNT_AFTER__DATE = SLOPE_IMPULSION___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END___IS_BEFORE__DISTRIBUTIONEVENT = SLOPE_IMPULSION___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = SLOPE_IMPULSION___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END___REFRESH_SLOPE_BEFORE = SLOPE_IMPULSION___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END___REFRESH_AMOUNT_BEFORE = SLOPE_IMPULSION___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END___REFRESH_AMOUNT_AFTER = SLOPE_IMPULSION___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END___REFRESH_SLOPE_AFTER = SLOPE_IMPULSION___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END___REFRESH_MOMENT = SLOPE_IMPULSION___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Slope Impulsion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END___REFRESH_SLOPE_IMPULSION = SLOPE_IMPULSION___REFRESH_SLOPE_IMPULSION;

	/**
	 * The number of operations of the '<em>Stock Change End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END_OPERATION_COUNT = SLOPE_IMPULSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountImpulsionAtomicImpl <em>Amount Impulsion Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.AmountImpulsionAtomicImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getAmountImpulsionAtomic()
	 * @generated
	 */
	int AMOUNT_IMPULSION_ATOMIC = 13;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__PROPAGATOR_FUNCTIONS = AMOUNT_IMPULSION__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__MOMENT = AMOUNT_IMPULSION__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__EVENT_NR = AMOUNT_IMPULSION__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__NEXT = AMOUNT_IMPULSION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__PREVIOUS = AMOUNT_IMPULSION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__AMOUNT_BEFORE = AMOUNT_IMPULSION__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__AMOUNT_AFTER = AMOUNT_IMPULSION__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__SLOPE_BEFORE = AMOUNT_IMPULSION__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__SLOPE_AFTER = AMOUNT_IMPULSION__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__DESCRIPTION = AMOUNT_IMPULSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__DISTRIBUTION_AS_SEQUENCE = AMOUNT_IMPULSION__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__DISTRIBUTION = AMOUNT_IMPULSION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__DISTRIBUTION_AS_PROVIDED_EVENT = AMOUNT_IMPULSION__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Event Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__EVENT_PROVIDER = AMOUNT_IMPULSION__EVENT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Amount Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__AMOUNT_IMPULSION = AMOUNT_IMPULSION__AMOUNT_IMPULSION;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__PROVIDER = AMOUNT_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Amount Impulsion Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC_FEATURE_COUNT = AMOUNT_IMPULSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = AMOUNT_IMPULSION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC___GET_PROPAGATOR_FUNCTION__ECLASS = AMOUNT_IMPULSION___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC___GET_AMOUNT_BEFORE__DATE = AMOUNT_IMPULSION___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC___GET_AMOUNT_AFTER__DATE = AMOUNT_IMPULSION___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC___IS_BEFORE__DISTRIBUTIONEVENT = AMOUNT_IMPULSION___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = AMOUNT_IMPULSION___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC___REFRESH_SLOPE_BEFORE = AMOUNT_IMPULSION___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC___REFRESH_AMOUNT_BEFORE = AMOUNT_IMPULSION___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC___REFRESH_AMOUNT_AFTER = AMOUNT_IMPULSION___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC___REFRESH_SLOPE_AFTER = AMOUNT_IMPULSION___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC___REFRESH_MOMENT = AMOUNT_IMPULSION___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Amount Impulsion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC___REFRESH_AMOUNT_IMPULSION = AMOUNT_IMPULSION___REFRESH_AMOUNT_IMPULSION;

	/**
	 * The number of operations of the '<em>Amount Impulsion Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC_OPERATION_COUNT = AMOUNT_IMPULSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionAtomicImpl <em>Slope Impulsion Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionAtomicImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getSlopeImpulsionAtomic()
	 * @generated
	 */
	int SLOPE_IMPULSION_ATOMIC = 14;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__PROPAGATOR_FUNCTIONS = SLOPE_IMPULSION__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__MOMENT = SLOPE_IMPULSION__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__EVENT_NR = SLOPE_IMPULSION__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__NEXT = SLOPE_IMPULSION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__PREVIOUS = SLOPE_IMPULSION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__AMOUNT_BEFORE = SLOPE_IMPULSION__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__AMOUNT_AFTER = SLOPE_IMPULSION__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__SLOPE_BEFORE = SLOPE_IMPULSION__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__SLOPE_AFTER = SLOPE_IMPULSION__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__DESCRIPTION = SLOPE_IMPULSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__DISTRIBUTION_AS_SEQUENCE = SLOPE_IMPULSION__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__DISTRIBUTION = SLOPE_IMPULSION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__DISTRIBUTION_AS_PROVIDED_EVENT = SLOPE_IMPULSION__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Event Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__EVENT_PROVIDER = SLOPE_IMPULSION__EVENT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Slope Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__SLOPE_IMPULSION = SLOPE_IMPULSION__SLOPE_IMPULSION;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__PROVIDER = SLOPE_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Slope Impulsion Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC_FEATURE_COUNT = SLOPE_IMPULSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = SLOPE_IMPULSION___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC___GET_PROPAGATOR_FUNCTION__ECLASS = SLOPE_IMPULSION___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC___GET_AMOUNT_BEFORE__DATE = SLOPE_IMPULSION___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC___GET_AMOUNT_AFTER__DATE = SLOPE_IMPULSION___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC___IS_BEFORE__DISTRIBUTIONEVENT = SLOPE_IMPULSION___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = SLOPE_IMPULSION___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC___REFRESH_SLOPE_BEFORE = SLOPE_IMPULSION___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC___REFRESH_AMOUNT_BEFORE = SLOPE_IMPULSION___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC___REFRESH_AMOUNT_AFTER = SLOPE_IMPULSION___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC___REFRESH_SLOPE_AFTER = SLOPE_IMPULSION___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC___REFRESH_MOMENT = SLOPE_IMPULSION___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Slope Impulsion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC___REFRESH_SLOPE_IMPULSION = SLOPE_IMPULSION___REFRESH_SLOPE_IMPULSION;

	/**
	 * The number of operations of the '<em>Slope Impulsion Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC_OPERATION_COUNT = SLOPE_IMPULSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteAtomicImpl <em>Amount Absolute Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteAtomicImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getAmountAbsoluteAtomic()
	 * @generated
	 */
	int AMOUNT_ABSOLUTE_ATOMIC = 15;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__PROPAGATOR_FUNCTIONS = AMOUNT_ABSOLUTE__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__MOMENT = AMOUNT_ABSOLUTE__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__EVENT_NR = AMOUNT_ABSOLUTE__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__NEXT = AMOUNT_ABSOLUTE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__PREVIOUS = AMOUNT_ABSOLUTE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__AMOUNT_BEFORE = AMOUNT_ABSOLUTE__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__AMOUNT_AFTER = AMOUNT_ABSOLUTE__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__SLOPE_BEFORE = AMOUNT_ABSOLUTE__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__SLOPE_AFTER = AMOUNT_ABSOLUTE__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__DESCRIPTION = AMOUNT_ABSOLUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__DISTRIBUTION_AS_SEQUENCE = AMOUNT_ABSOLUTE__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__DISTRIBUTION = AMOUNT_ABSOLUTE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__DISTRIBUTION_AS_PROVIDED_EVENT = AMOUNT_ABSOLUTE__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Event Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__EVENT_PROVIDER = AMOUNT_ABSOLUTE__EVENT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Amount Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__AMOUNT_ABSOLUTE = AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC__PROVIDER = AMOUNT_ABSOLUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Amount Absolute Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC_FEATURE_COUNT = AMOUNT_ABSOLUTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = AMOUNT_ABSOLUTE___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC___GET_PROPAGATOR_FUNCTION__ECLASS = AMOUNT_ABSOLUTE___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC___GET_AMOUNT_BEFORE__DATE = AMOUNT_ABSOLUTE___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC___GET_AMOUNT_AFTER__DATE = AMOUNT_ABSOLUTE___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC___IS_BEFORE__DISTRIBUTIONEVENT = AMOUNT_ABSOLUTE___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = AMOUNT_ABSOLUTE___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC___REFRESH_SLOPE_BEFORE = AMOUNT_ABSOLUTE___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC___REFRESH_AMOUNT_BEFORE = AMOUNT_ABSOLUTE___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC___REFRESH_AMOUNT_AFTER = AMOUNT_ABSOLUTE___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC___REFRESH_SLOPE_AFTER = AMOUNT_ABSOLUTE___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC___REFRESH_MOMENT = AMOUNT_ABSOLUTE___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Amount Absolute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC___REFRESH_AMOUNT_ABSOLUTE = AMOUNT_ABSOLUTE___REFRESH_AMOUNT_ABSOLUTE;

	/**
	 * The number of operations of the '<em>Amount Absolute Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_ATOMIC_OPERATION_COUNT = AMOUNT_ABSOLUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteAtomicImpl <em>Slope Absolute Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteAtomicImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getSlopeAbsoluteAtomic()
	 * @generated
	 */
	int SLOPE_ABSOLUTE_ATOMIC = 16;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__PROPAGATOR_FUNCTIONS = SLOPE_ABSOLUTE__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__MOMENT = SLOPE_ABSOLUTE__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__EVENT_NR = SLOPE_ABSOLUTE__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__NEXT = SLOPE_ABSOLUTE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__PREVIOUS = SLOPE_ABSOLUTE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__AMOUNT_BEFORE = SLOPE_ABSOLUTE__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__AMOUNT_AFTER = SLOPE_ABSOLUTE__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__SLOPE_BEFORE = SLOPE_ABSOLUTE__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__SLOPE_AFTER = SLOPE_ABSOLUTE__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__DESCRIPTION = SLOPE_ABSOLUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__DISTRIBUTION_AS_SEQUENCE = SLOPE_ABSOLUTE__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__DISTRIBUTION = SLOPE_ABSOLUTE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Distribution As Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__DISTRIBUTION_AS_PROVIDED_EVENT = SLOPE_ABSOLUTE__DISTRIBUTION_AS_PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Event Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__EVENT_PROVIDER = SLOPE_ABSOLUTE__EVENT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Slope Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__SLOPE_ABSOLUTE = SLOPE_ABSOLUTE__SLOPE_ABSOLUTE;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC__PROVIDER = SLOPE_ABSOLUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Slope Absolute Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC_FEATURE_COUNT = SLOPE_ABSOLUTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = SLOPE_ABSOLUTE___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC___GET_PROPAGATOR_FUNCTION__ECLASS = SLOPE_ABSOLUTE___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC___GET_AMOUNT_BEFORE__DATE = SLOPE_ABSOLUTE___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC___GET_AMOUNT_AFTER__DATE = SLOPE_ABSOLUTE___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC___IS_BEFORE__DISTRIBUTIONEVENT = SLOPE_ABSOLUTE___IS_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Is Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = SLOPE_ABSOLUTE___IS_STRICT_BEFORE__DISTRIBUTIONEVENT;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC___REFRESH_SLOPE_BEFORE = SLOPE_ABSOLUTE___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC___REFRESH_AMOUNT_BEFORE = SLOPE_ABSOLUTE___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC___REFRESH_AMOUNT_AFTER = SLOPE_ABSOLUTE___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC___REFRESH_SLOPE_AFTER = SLOPE_ABSOLUTE___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC___REFRESH_MOMENT = SLOPE_ABSOLUTE___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Slope Absolute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC___REFRESH_SLOPE_ABSOLUTE = SLOPE_ABSOLUTE___REFRESH_SLOPE_ABSOLUTE;

	/**
	 * The number of operations of the '<em>Slope Absolute Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_ATOMIC_OPERATION_COUNT = SLOPE_ABSOLUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.EventsProviderAbstractImpl <em>Events Provider Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.EventsProviderAbstractImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getEventsProviderAbstract()
	 * @generated
	 */
	int EVENTS_PROVIDER_ABSTRACT = 17;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER_ABSTRACT__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER_ABSTRACT__DISTRIBUTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Events Provider Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER_ABSTRACT_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER_ABSTRACT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER_ABSTRACT___GET_PROPAGATOR_FUNCTION__ECLASS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Refresh Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER_ABSTRACT___REFRESH_EVENTS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Events Provider Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER_ABSTRACT_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.EventsProviderImpl <em>Events Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.EventsProviderImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getEventsProvider()
	 * @generated
	 */
	int EVENTS_PROVIDER = 18;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER__PROPAGATOR_FUNCTIONS = EVENTS_PROVIDER_ABSTRACT__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER__DISTRIBUTION = EVENTS_PROVIDER_ABSTRACT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Provided Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER__PROVIDED_EVENTS = EVENTS_PROVIDER_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Events Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER_FEATURE_COUNT = EVENTS_PROVIDER_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = EVENTS_PROVIDER_ABSTRACT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER___GET_PROPAGATOR_FUNCTION__ECLASS = EVENTS_PROVIDER_ABSTRACT___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Refresh Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER___REFRESH_EVENTS = EVENTS_PROVIDER_ABSTRACT___REFRESH_EVENTS;

	/**
	 * The number of operations of the '<em>Events Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_PROVIDER_OPERATION_COUNT = EVENTS_PROVIDER_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.StockChangeImpl <em>Stock Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.StockChangeImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getStockChange()
	 * @generated
	 */
	int STOCK_CHANGE = 19;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__PROPAGATOR_FUNCTIONS = EVENTS_PROVIDER__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__DISTRIBUTION = EVENTS_PROVIDER__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Provided Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__PROVIDED_EVENTS = EVENTS_PROVIDER__PROVIDED_EVENTS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__START = EVENTS_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__END = EVENTS_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__SLOPE = EVENTS_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__START_EVENT = EVENTS_PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__END_EVENT = EVENTS_PROVIDER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Stock Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_FEATURE_COUNT = EVENTS_PROVIDER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = EVENTS_PROVIDER___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE___GET_PROPAGATOR_FUNCTION__ECLASS = EVENTS_PROVIDER___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Refresh Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE___REFRESH_EVENTS = EVENTS_PROVIDER___REFRESH_EVENTS;

	/**
	 * The number of operations of the '<em>Stock Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_OPERATION_COUNT = EVENTS_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeImpl <em>Capacity Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.CapacityChangeImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getCapacityChange()
	 * @generated
	 */
	int CAPACITY_CHANGE = 20;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__PROPAGATOR_FUNCTIONS = EVENTS_PROVIDER__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__DISTRIBUTION = EVENTS_PROVIDER__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Provided Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__PROVIDED_EVENTS = EVENTS_PROVIDER__PROVIDED_EVENTS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__START = EVENTS_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__END = EVENTS_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__AMOUNT = EVENTS_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__START_EVENT = EVENTS_PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__END_EVENT = EVENTS_PROVIDER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Capacity Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_FEATURE_COUNT = EVENTS_PROVIDER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = EVENTS_PROVIDER___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE___GET_PROPAGATOR_FUNCTION__ECLASS = EVENTS_PROVIDER___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Refresh Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE___REFRESH_EVENTS = EVENTS_PROVIDER___REFRESH_EVENTS;

	/**
	 * The number of operations of the '<em>Capacity Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_OPERATION_COUNT = EVENTS_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.EventProviderImpl <em>Event Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.EventProviderImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getEventProvider()
	 * @generated
	 */
	int EVENT_PROVIDER = 21;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PROVIDER__PROPAGATOR_FUNCTIONS = EVENTS_PROVIDER_ABSTRACT__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PROVIDER__DISTRIBUTION = EVENTS_PROVIDER_ABSTRACT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PROVIDER__PROVIDED_EVENT = EVENTS_PROVIDER_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PROVIDER__MOMENT = EVENTS_PROVIDER_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PROVIDER_FEATURE_COUNT = EVENTS_PROVIDER_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PROVIDER___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = EVENTS_PROVIDER_ABSTRACT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PROVIDER___GET_PROPAGATOR_FUNCTION__ECLASS = EVENTS_PROVIDER_ABSTRACT___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Refresh Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PROVIDER___REFRESH_EVENTS = EVENTS_PROVIDER_ABSTRACT___REFRESH_EVENTS;

	/**
	 * The number of operations of the '<em>Event Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PROVIDER_OPERATION_COUNT = EVENTS_PROVIDER_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionProviderImpl <em>Slope Impulsion Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionProviderImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getSlopeImpulsionProvider()
	 * @generated
	 */
	int SLOPE_IMPULSION_PROVIDER = 22;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_PROVIDER__PROPAGATOR_FUNCTIONS = EVENT_PROVIDER__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_PROVIDER__DISTRIBUTION = EVENT_PROVIDER__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_PROVIDER__PROVIDED_EVENT = EVENT_PROVIDER__PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_PROVIDER__MOMENT = EVENT_PROVIDER__MOMENT;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_PROVIDER__EVENT = EVENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slope Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_PROVIDER__SLOPE_IMPULSION = EVENT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Slope Impulsion Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_PROVIDER_FEATURE_COUNT = EVENT_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_PROVIDER___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = EVENT_PROVIDER___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_PROVIDER___GET_PROPAGATOR_FUNCTION__ECLASS = EVENT_PROVIDER___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Refresh Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_PROVIDER___REFRESH_EVENTS = EVENT_PROVIDER___REFRESH_EVENTS;

	/**
	 * The number of operations of the '<em>Slope Impulsion Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_PROVIDER_OPERATION_COUNT = EVENT_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteProviderImpl <em>Slope Absolute Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteProviderImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getSlopeAbsoluteProvider()
	 * @generated
	 */
	int SLOPE_ABSOLUTE_PROVIDER = 23;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_PROVIDER__PROPAGATOR_FUNCTIONS = EVENT_PROVIDER__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_PROVIDER__DISTRIBUTION = EVENT_PROVIDER__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_PROVIDER__PROVIDED_EVENT = EVENT_PROVIDER__PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_PROVIDER__MOMENT = EVENT_PROVIDER__MOMENT;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_PROVIDER__EVENT = EVENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slope Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_PROVIDER__SLOPE_ABSOLUTE = EVENT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Slope Absolute Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_PROVIDER_FEATURE_COUNT = EVENT_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_PROVIDER___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = EVENT_PROVIDER___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_PROVIDER___GET_PROPAGATOR_FUNCTION__ECLASS = EVENT_PROVIDER___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Refresh Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_PROVIDER___REFRESH_EVENTS = EVENT_PROVIDER___REFRESH_EVENTS;

	/**
	 * The number of operations of the '<em>Slope Absolute Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_PROVIDER_OPERATION_COUNT = EVENT_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountImpulsionProviderImpl <em>Amount Impulsion Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.AmountImpulsionProviderImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getAmountImpulsionProvider()
	 * @generated
	 */
	int AMOUNT_IMPULSION_PROVIDER = 24;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_PROVIDER__PROPAGATOR_FUNCTIONS = EVENT_PROVIDER__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_PROVIDER__DISTRIBUTION = EVENT_PROVIDER__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_PROVIDER__PROVIDED_EVENT = EVENT_PROVIDER__PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_PROVIDER__MOMENT = EVENT_PROVIDER__MOMENT;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_PROVIDER__EVENT = EVENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_PROVIDER__AMOUNT_IMPULSION = EVENT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Amount Impulsion Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_PROVIDER_FEATURE_COUNT = EVENT_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_PROVIDER___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = EVENT_PROVIDER___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_PROVIDER___GET_PROPAGATOR_FUNCTION__ECLASS = EVENT_PROVIDER___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Refresh Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_PROVIDER___REFRESH_EVENTS = EVENT_PROVIDER___REFRESH_EVENTS;

	/**
	 * The number of operations of the '<em>Amount Impulsion Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_PROVIDER_OPERATION_COUNT = EVENT_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteProviderImpl <em>Amount Absolute Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteProviderImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getAmountAbsoluteProvider()
	 * @generated
	 */
	int AMOUNT_ABSOLUTE_PROVIDER = 25;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_PROVIDER__PROPAGATOR_FUNCTIONS = EVENT_PROVIDER__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_PROVIDER__DISTRIBUTION = EVENT_PROVIDER__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_PROVIDER__PROVIDED_EVENT = EVENT_PROVIDER__PROVIDED_EVENT;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_PROVIDER__MOMENT = EVENT_PROVIDER__MOMENT;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_PROVIDER__EVENT = EVENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_PROVIDER__AMOUNT_ABSOLUTE = EVENT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Amount Absolute Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_PROVIDER_FEATURE_COUNT = EVENT_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_PROVIDER___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = EVENT_PROVIDER___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_PROVIDER___GET_PROPAGATOR_FUNCTION__ECLASS = EVENT_PROVIDER___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Refresh Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_PROVIDER___REFRESH_EVENTS = EVENT_PROVIDER___REFRESH_EVENTS;

	/**
	 * The number of operations of the '<em>Amount Absolute Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_PROVIDER_OPERATION_COUNT = EVENT_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionImpl <em>Propagator Function Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getPropagatorFunctionDistribution()
	 * @generated
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION = 28;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propagator Function Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Function Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionEventImpl <em>Propagator Function Distribution Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionEventImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getPropagatorFunctionDistributionEvent()
	 * @generated
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT = 29;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DISTRIBUTION_EVENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propagator Function Distribution Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Function Distribution Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionEventsProviderImpl <em>Propagator Function Events Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionEventsProviderImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getPropagatorFunctionEventsProvider()
	 * @generated
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER = 30;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Events Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER__EVENTS_PROVIDER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propagator Function Events Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Function Events Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_EVENTS_PROVIDER_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.TimeUnit
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 31;

	/**
	 * The meta object id for the '<em>Distribution Visitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.DistributionVisitor
	 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getDistributionVisitor()
	 * @generated
	 */
	int DISTRIBUTION_VISITOR = 32;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution</em>'.
	 * @see com.misc.common.moplaf.time.continuous.Distribution
	 * @generated
	 */
	EClass getDistribution();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.Distribution#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getTimeUnit()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_TimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.Distribution#getHorizonStart <em>Horizon Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizon Start</em>'.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getHorizonStart()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_HorizonStart();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.Distribution#getHorizonEnd <em>Horizon End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizon End</em>'.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getHorizonEnd()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_HorizonEnd();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.time.continuous.Distribution#getChildEvents <em>Child Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getChildEvents()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_ChildEvents();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.time.continuous.Distribution#getSequenceEvents <em>Sequence Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sequence Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getSequenceEvents()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_SequenceEvents();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.time.continuous.Distribution#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getStart()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_Start();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.time.continuous.Distribution#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getEnd()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_End();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.time.continuous.Distribution#getEventsProviders <em>Events Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events Providers</em>'.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getEventsProviders()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_EventsProviders();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.Distribution#getParentDistribution <em>Parent Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Distribution</em>'.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getParentDistribution()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_ParentDistribution();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.time.continuous.Distribution#getChildDistribution <em>Child Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Distribution</em>'.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getChildDistribution()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_ChildDistribution();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.time.continuous.Distribution#getProvidedEvents <em>Provided Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getProvidedEvents()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_ProvidedEvents();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getDuration(java.util.Date, java.util.Date) <em>Get Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Duration</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getDuration(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetDuration__Date_Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getMoment(java.util.Date, float) <em>Get Moment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Moment</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getMoment(java.util.Date, float)
	 * @generated
	 */
	EOperation getDistribution__GetMoment__Date_float();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getEventBefore(java.util.Date) <em>Get Event Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Event Before</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getEventBefore(java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetEventBefore__Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getEventStrictBefore(java.util.Date) <em>Get Event Strict Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Event Strict Before</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getEventStrictBefore(java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetEventStrictBefore__Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getEventAfter(java.util.Date) <em>Get Event After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Event After</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getEventAfter(java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetEventAfter__Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getEventStrictAfter(java.util.Date) <em>Get Event Strict After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Event Strict After</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getEventStrictAfter(java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetEventStrictAfter__Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getAmountBefore(java.util.Date) <em>Get Amount Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Amount Before</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getAmountBefore(java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetAmountBefore__Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getAmountAfter(java.util.Date) <em>Get Amount After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Amount After</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getAmountAfter(java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetAmountAfter__Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getAmount(java.util.Date) <em>Get Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Amount</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getAmount(java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetAmount__Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getSlopeBefore(java.util.Date) <em>Get Slope Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Slope Before</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getSlopeBefore(java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetSlopeBefore__Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getSlopeAfter(java.util.Date) <em>Get Slope After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Slope After</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getSlopeAfter(java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetSlopeAfter__Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getMinAmount(java.util.Date, java.util.Date) <em>Get Min Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Min Amount</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getMinAmount(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetMinAmount__Date_Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getMaxAmount(java.util.Date, java.util.Date) <em>Get Max Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Max Amount</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getMaxAmount(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetMaxAmount__Date_Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getAverageAmount(java.util.Date, java.util.Date) <em>Get Average Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Average Amount</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getAverageAmount(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetAverageAmount__Date_Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getCumulatedAmount(java.util.Date, java.util.Date) <em>Get Cumulated Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cumulated Amount</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getCumulatedAmount(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetCumulatedAmount__Date_Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getEarliestBelow(java.util.Date, float, float) <em>Get Earliest Below</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Earliest Below</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getEarliestBelow(java.util.Date, float, float)
	 * @generated
	 */
	EOperation getDistribution__GetEarliestBelow__Date_float_float();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getLatestBelow(java.util.Date, float, float) <em>Get Latest Below</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Latest Below</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getLatestBelow(java.util.Date, float, float)
	 * @generated
	 */
	EOperation getDistribution__GetLatestBelow__Date_float_float();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getEarliestAbove(java.util.Date, float, float) <em>Get Earliest Above</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Earliest Above</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getEarliestAbove(java.util.Date, float, float)
	 * @generated
	 */
	EOperation getDistribution__GetEarliestAbove__Date_float_float();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getLatestAbove(java.util.Date, float, float) <em>Get Latest Above</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Latest Above</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getLatestAbove(java.util.Date, float, float)
	 * @generated
	 */
	EOperation getDistribution__GetLatestAbove__Date_float_float();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getEarliestOutputPossible(float, java.util.Date, float, float) <em>Get Earliest Output Possible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Earliest Output Possible</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getEarliestOutputPossible(float, java.util.Date, float, float)
	 * @generated
	 */
	EOperation getDistribution__GetEarliestOutputPossible__float_Date_float_float();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#refreshInit() <em>Refresh Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Init</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#refreshInit()
	 * @generated
	 */
	EOperation getDistribution__RefreshInit();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#refreshSequence() <em>Refresh Sequence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Sequence</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#refreshSequence()
	 * @generated
	 */
	EOperation getDistribution__RefreshSequence();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#refreshChildEvent() <em>Refresh Child Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Child Event</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#refreshChildEvent()
	 * @generated
	 */
	EOperation getDistribution__RefreshChildEvent();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#refreshProvidedEvents() <em>Refresh Provided Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Provided Events</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#refreshProvidedEvents()
	 * @generated
	 */
	EOperation getDistribution__RefreshProvidedEvents();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#accept(java.util.Date, java.util.Date, com.misc.common.moplaf.time.continuous.DistributionVisitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#accept(java.util.Date, java.util.Date, com.misc.common.moplaf.time.continuous.DistributionVisitor)
	 * @generated
	 */
	EOperation getDistribution__Accept__Date_Date_DistributionVisitor();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.DistributionEvent <em>Distribution Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent
	 * @generated
	 */
	EClass getDistributionEvent();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getMoment <em>Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getMoment()
	 * @see #getDistributionEvent()
	 * @generated
	 */
	EAttribute getDistributionEvent_Moment();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getEventNr <em>Event Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Nr</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getEventNr()
	 * @see #getDistributionEvent()
	 * @generated
	 */
	EAttribute getDistributionEvent_EventNr();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getNext()
	 * @see #getDistributionEvent()
	 * @generated
	 */
	EReference getDistributionEvent_Next();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getPrevious()
	 * @see #getDistributionEvent()
	 * @generated
	 */
	EReference getDistributionEvent_Previous();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getAmountBefore <em>Amount Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Before</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getAmountBefore()
	 * @see #getDistributionEvent()
	 * @generated
	 */
	EAttribute getDistributionEvent_AmountBefore();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getAmountAfter <em>Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getAmountAfter()
	 * @see #getDistributionEvent()
	 * @generated
	 */
	EAttribute getDistributionEvent_AmountAfter();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getSlopeBefore <em>Slope Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope Before</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getSlopeBefore()
	 * @see #getDistributionEvent()
	 * @generated
	 */
	EAttribute getDistributionEvent_SlopeBefore();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getSlopeAfter <em>Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getSlopeAfter()
	 * @see #getDistributionEvent()
	 * @generated
	 */
	EAttribute getDistributionEvent_SlopeAfter();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getDescription()
	 * @see #getDistributionEvent()
	 * @generated
	 */
	EAttribute getDistributionEvent_Description();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getDistributionAsSequence <em>Distribution As Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distribution As Sequence</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getDistributionAsSequence()
	 * @see #getDistributionEvent()
	 * @generated
	 */
	EReference getDistributionEvent_DistributionAsSequence();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distribution</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getDistribution()
	 * @see #getDistributionEvent()
	 * @generated
	 */
	EReference getDistributionEvent_Distribution();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getDistributionAsProvidedEvent <em>Distribution As Provided Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distribution As Provided Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getDistributionAsProvidedEvent()
	 * @see #getDistributionEvent()
	 * @generated
	 */
	EReference getDistributionEvent_DistributionAsProvidedEvent();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getAmountBefore(java.util.Date) <em>Get Amount Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Amount Before</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getAmountBefore(java.util.Date)
	 * @generated
	 */
	EOperation getDistributionEvent__GetAmountBefore__Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#getAmountAfter(java.util.Date) <em>Get Amount After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Amount After</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#getAmountAfter(java.util.Date)
	 * @generated
	 */
	EOperation getDistributionEvent__GetAmountAfter__Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#isBefore(com.misc.common.moplaf.time.continuous.DistributionEvent) <em>Is Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Before</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#isBefore(com.misc.common.moplaf.time.continuous.DistributionEvent)
	 * @generated
	 */
	EOperation getDistributionEvent__IsBefore__DistributionEvent();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#isStrictBefore(com.misc.common.moplaf.time.continuous.DistributionEvent) <em>Is Strict Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Strict Before</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#isStrictBefore(com.misc.common.moplaf.time.continuous.DistributionEvent)
	 * @generated
	 */
	EOperation getDistributionEvent__IsStrictBefore__DistributionEvent();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#refreshSlopeBefore() <em>Refresh Slope Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Slope Before</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#refreshSlopeBefore()
	 * @generated
	 */
	EOperation getDistributionEvent__RefreshSlopeBefore();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#refreshAmountBefore() <em>Refresh Amount Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Amount Before</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#refreshAmountBefore()
	 * @generated
	 */
	EOperation getDistributionEvent__RefreshAmountBefore();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#refreshAmountAfter() <em>Refresh Amount After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Amount After</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#refreshAmountAfter()
	 * @generated
	 */
	EOperation getDistributionEvent__RefreshAmountAfter();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#refreshSlopeAfter() <em>Refresh Slope After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Slope After</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#refreshSlopeAfter()
	 * @generated
	 */
	EOperation getDistributionEvent__RefreshSlopeAfter();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#refreshMoment() <em>Refresh Moment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Moment</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#refreshMoment()
	 * @generated
	 */
	EOperation getDistributionEvent__RefreshMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.ChildEvent <em>Child Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.ChildEvent
	 * @generated
	 */
	EClass getChildEvent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.ChildEvent#getOriginal <em>Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original</em>'.
	 * @see com.misc.common.moplaf.time.continuous.ChildEvent#getOriginal()
	 * @see #getChildEvent()
	 * @generated
	 */
	EReference getChildEvent_Original();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StartEvent
	 * @generated
	 */
	EClass getStartEvent();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.StartEvent#getAmountAtStart <em>Amount At Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount At Start</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StartEvent#getAmountAtStart()
	 * @see #getStartEvent()
	 * @generated
	 */
	EAttribute getStartEvent_AmountAtStart();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.StartEvent#getSlopeAtStart <em>Slope At Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope At Start</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StartEvent#getSlopeAtStart()
	 * @see #getStartEvent()
	 * @generated
	 */
	EAttribute getStartEvent_SlopeAtStart();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.EndEvent
	 * @generated
	 */
	EClass getEndEvent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.AmountImpulsion <em>Amount Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amount Impulsion</em>'.
	 * @see com.misc.common.moplaf.time.continuous.AmountImpulsion
	 * @generated
	 */
	EClass getAmountImpulsion();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.AmountImpulsion#getAmountImpulsion <em>Amount Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Impulsion</em>'.
	 * @see com.misc.common.moplaf.time.continuous.AmountImpulsion#getAmountImpulsion()
	 * @see #getAmountImpulsion()
	 * @generated
	 */
	EAttribute getAmountImpulsion_AmountImpulsion();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.AmountImpulsion#refreshAmountImpulsion() <em>Refresh Amount Impulsion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Amount Impulsion</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.AmountImpulsion#refreshAmountImpulsion()
	 * @generated
	 */
	EOperation getAmountImpulsion__RefreshAmountImpulsion();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsion <em>Slope Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slope Impulsion</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeImpulsion
	 * @generated
	 */
	EClass getSlopeImpulsion();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsion#getSlopeImpulsion <em>Slope Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope Impulsion</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeImpulsion#getSlopeImpulsion()
	 * @see #getSlopeImpulsion()
	 * @generated
	 */
	EAttribute getSlopeImpulsion_SlopeImpulsion();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsion#refreshSlopeImpulsion() <em>Refresh Slope Impulsion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Slope Impulsion</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.SlopeImpulsion#refreshSlopeImpulsion()
	 * @generated
	 */
	EOperation getSlopeImpulsion__RefreshSlopeImpulsion();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.AmountAbsolute <em>Amount Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amount Absolute</em>'.
	 * @see com.misc.common.moplaf.time.continuous.AmountAbsolute
	 * @generated
	 */
	EClass getAmountAbsolute();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.AmountAbsolute#getAmountAbsolute <em>Amount Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Absolute</em>'.
	 * @see com.misc.common.moplaf.time.continuous.AmountAbsolute#getAmountAbsolute()
	 * @see #getAmountAbsolute()
	 * @generated
	 */
	EAttribute getAmountAbsolute_AmountAbsolute();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.AmountAbsolute#refreshAmountAbsolute() <em>Refresh Amount Absolute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Amount Absolute</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.AmountAbsolute#refreshAmountAbsolute()
	 * @generated
	 */
	EOperation getAmountAbsolute__RefreshAmountAbsolute();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.SlopeAbsolute <em>Slope Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slope Absolute</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeAbsolute
	 * @generated
	 */
	EClass getSlopeAbsolute();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.SlopeAbsolute#getSlopeAbsolute <em>Slope Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope Absolute</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeAbsolute#getSlopeAbsolute()
	 * @see #getSlopeAbsolute()
	 * @generated
	 */
	EAttribute getSlopeAbsolute_SlopeAbsolute();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.SlopeAbsolute#refreshSlopeAbsolute() <em>Refresh Slope Absolute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Slope Absolute</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.SlopeAbsolute#refreshSlopeAbsolute()
	 * @generated
	 */
	EOperation getSlopeAbsolute__RefreshSlopeAbsolute();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.CapacityChangeStart <em>Capacity Change Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capacity Change Start</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChangeStart
	 * @generated
	 */
	EClass getCapacityChangeStart();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.CapacityChangeStart#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChangeStart#getProvider()
	 * @see #getCapacityChangeStart()
	 * @generated
	 */
	EReference getCapacityChangeStart_Provider();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.CapacityChangeEnd <em>Capacity Change End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capacity Change End</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChangeEnd
	 * @generated
	 */
	EClass getCapacityChangeEnd();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.CapacityChangeEnd#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChangeEnd#getProvider()
	 * @see #getCapacityChangeEnd()
	 * @generated
	 */
	EReference getCapacityChangeEnd_Provider();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.StockChangeStart <em>Stock Change Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock Change Start</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StockChangeStart
	 * @generated
	 */
	EClass getStockChangeStart();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.StockChangeStart#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StockChangeStart#getProvider()
	 * @see #getStockChangeStart()
	 * @generated
	 */
	EReference getStockChangeStart_Provider();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.StockChangeEnd <em>Stock Change End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock Change End</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StockChangeEnd
	 * @generated
	 */
	EClass getStockChangeEnd();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.StockChangeEnd#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StockChangeEnd#getProvider()
	 * @see #getStockChangeEnd()
	 * @generated
	 */
	EReference getStockChangeEnd_Provider();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.AmountImpulsionAtomic <em>Amount Impulsion Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amount Impulsion Atomic</em>'.
	 * @see com.misc.common.moplaf.time.continuous.AmountImpulsionAtomic
	 * @generated
	 */
	EClass getAmountImpulsionAtomic();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.AmountImpulsionAtomic#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.AmountImpulsionAtomic#getProvider()
	 * @see #getAmountImpulsionAtomic()
	 * @generated
	 */
	EReference getAmountImpulsionAtomic_Provider();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic <em>Slope Impulsion Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slope Impulsion Atomic</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic
	 * @generated
	 */
	EClass getSlopeImpulsionAtomic();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic#getProvider()
	 * @see #getSlopeImpulsionAtomic()
	 * @generated
	 */
	EReference getSlopeImpulsionAtomic_Provider();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic <em>Amount Absolute Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amount Absolute Atomic</em>'.
	 * @see com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic
	 * @generated
	 */
	EClass getAmountAbsoluteAtomic();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic#getProvider()
	 * @see #getAmountAbsoluteAtomic()
	 * @generated
	 */
	EReference getAmountAbsoluteAtomic_Provider();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic <em>Slope Absolute Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slope Absolute Atomic</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic
	 * @generated
	 */
	EClass getSlopeAbsoluteAtomic();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic#getProvider()
	 * @see #getSlopeAbsoluteAtomic()
	 * @generated
	 */
	EReference getSlopeAbsoluteAtomic_Provider();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.EventsProviderAbstract <em>Events Provider Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Events Provider Abstract</em>'.
	 * @see com.misc.common.moplaf.time.continuous.EventsProviderAbstract
	 * @generated
	 */
	EClass getEventsProviderAbstract();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.EventsProviderAbstract#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Distribution</em>'.
	 * @see com.misc.common.moplaf.time.continuous.EventsProviderAbstract#getDistribution()
	 * @see #getEventsProviderAbstract()
	 * @generated
	 */
	EReference getEventsProviderAbstract_Distribution();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.EventsProviderAbstract#refreshEvents() <em>Refresh Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Events</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.EventsProviderAbstract#refreshEvents()
	 * @generated
	 */
	EOperation getEventsProviderAbstract__RefreshEvents();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.EventsProvider <em>Events Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Events Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.EventsProvider
	 * @generated
	 */
	EClass getEventsProvider();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.time.continuous.EventsProvider#getProvidedEvents <em>Provided Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.EventsProvider#getProvidedEvents()
	 * @see #getEventsProvider()
	 * @generated
	 */
	EReference getEventsProvider_ProvidedEvents();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.StockChange <em>Stock Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock Change</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StockChange
	 * @generated
	 */
	EClass getStockChange();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.StockChange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StockChange#getStart()
	 * @see #getStockChange()
	 * @generated
	 */
	EAttribute getStockChange_Start();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.StockChange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StockChange#getEnd()
	 * @see #getStockChange()
	 * @generated
	 */
	EAttribute getStockChange_End();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.StockChange#getSlope <em>Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StockChange#getSlope()
	 * @see #getStockChange()
	 * @generated
	 */
	EAttribute getStockChange_Slope();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.time.continuous.StockChange#getStartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StockChange#getStartEvent()
	 * @see #getStockChange()
	 * @generated
	 */
	EReference getStockChange_StartEvent();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.time.continuous.StockChange#getEndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StockChange#getEndEvent()
	 * @see #getStockChange()
	 * @generated
	 */
	EReference getStockChange_EndEvent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.CapacityChange <em>Capacity Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capacity Change</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChange
	 * @generated
	 */
	EClass getCapacityChange();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChange#getStart()
	 * @see #getCapacityChange()
	 * @generated
	 */
	EAttribute getCapacityChange_Start();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChange#getEnd()
	 * @see #getCapacityChange()
	 * @generated
	 */
	EAttribute getCapacityChange_End();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChange#getAmount()
	 * @see #getCapacityChange()
	 * @generated
	 */
	EAttribute getCapacityChange_Amount();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getStartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChange#getStartEvent()
	 * @see #getCapacityChange()
	 * @generated
	 */
	EReference getCapacityChange_StartEvent();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getEndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChange#getEndEvent()
	 * @see #getCapacityChange()
	 * @generated
	 */
	EReference getCapacityChange_EndEvent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.EventProvider <em>Event Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.EventProvider
	 * @generated
	 */
	EClass getEventProvider();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.EventProvider#getProvidedEvent <em>Provided Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.EventProvider#getProvidedEvent()
	 * @see #getEventProvider()
	 * @generated
	 */
	EReference getEventProvider_ProvidedEvent();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.EventProvider#getMoment <em>Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.EventProvider#getMoment()
	 * @see #getEventProvider()
	 * @generated
	 */
	EAttribute getEventProvider_Moment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider <em>Slope Impulsion Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slope Impulsion Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider
	 * @generated
	 */
	EClass getSlopeImpulsionProvider();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider#getEvent()
	 * @see #getSlopeImpulsionProvider()
	 * @generated
	 */
	EReference getSlopeImpulsionProvider_Event();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider#getSlopeImpulsion <em>Slope Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope Impulsion</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider#getSlopeImpulsion()
	 * @see #getSlopeImpulsionProvider()
	 * @generated
	 */
	EAttribute getSlopeImpulsionProvider_SlopeImpulsion();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider <em>Slope Absolute Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slope Absolute Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider
	 * @generated
	 */
	EClass getSlopeAbsoluteProvider();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider#getEvent()
	 * @see #getSlopeAbsoluteProvider()
	 * @generated
	 */
	EReference getSlopeAbsoluteProvider_Event();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider#getSlopeAbsolute <em>Slope Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope Absolute</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider#getSlopeAbsolute()
	 * @see #getSlopeAbsoluteProvider()
	 * @generated
	 */
	EAttribute getSlopeAbsoluteProvider_SlopeAbsolute();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.AmountImpulsionProvider <em>Amount Impulsion Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amount Impulsion Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.AmountImpulsionProvider
	 * @generated
	 */
	EClass getAmountImpulsionProvider();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.time.continuous.AmountImpulsionProvider#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.AmountImpulsionProvider#getEvent()
	 * @see #getAmountImpulsionProvider()
	 * @generated
	 */
	EReference getAmountImpulsionProvider_Event();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.AmountImpulsionProvider#getAmountImpulsion <em>Amount Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Impulsion</em>'.
	 * @see com.misc.common.moplaf.time.continuous.AmountImpulsionProvider#getAmountImpulsion()
	 * @see #getAmountImpulsionProvider()
	 * @generated
	 */
	EAttribute getAmountImpulsionProvider_AmountImpulsion();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider <em>Amount Absolute Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amount Absolute Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider
	 * @generated
	 */
	EClass getAmountAbsoluteProvider();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider#getEvent()
	 * @see #getAmountAbsoluteProvider()
	 * @generated
	 */
	EReference getAmountAbsoluteProvider_Event();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider#getAmountAbsolute <em>Amount Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Absolute</em>'.
	 * @see com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider#getAmountAbsolute()
	 * @see #getAmountAbsoluteProvider()
	 * @generated
	 */
	EAttribute getAmountAbsoluteProvider_AmountAbsolute();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.OwnedEvent <em>Owned Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owned Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.OwnedEvent
	 * @generated
	 */
	EClass getOwnedEvent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.ProvidedEvent <em>Provided Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.ProvidedEvent
	 * @generated
	 */
	EClass getProvidedEvent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.ProvidedEvent#getEventProvider <em>Event Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.ProvidedEvent#getEventProvider()
	 * @see #getProvidedEvent()
	 * @generated
	 */
	EReference getProvidedEvent_EventProvider();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution <em>Propagator Function Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Function Distribution</em>'.
	 * @see com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution
	 * @generated
	 */
	EClass getPropagatorFunctionDistribution();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distribution</em>'.
	 * @see com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution#getDistribution()
	 * @see #getPropagatorFunctionDistribution()
	 * @generated
	 */
	EReference getPropagatorFunctionDistribution_Distribution();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionEvent <em>Propagator Function Distribution Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Function Distribution Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionEvent
	 * @generated
	 */
	EClass getPropagatorFunctionDistributionEvent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionEvent#getDistributionEvent <em>Distribution Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distribution Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionEvent#getDistributionEvent()
	 * @see #getPropagatorFunctionDistributionEvent()
	 * @generated
	 */
	EReference getPropagatorFunctionDistributionEvent_DistributionEvent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.PropagatorFunctionEventsProvider <em>Propagator Function Events Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Function Events Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.PropagatorFunctionEventsProvider
	 * @generated
	 */
	EClass getPropagatorFunctionEventsProvider();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.PropagatorFunctionEventsProvider#getEventsProvider <em>Events Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Events Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.PropagatorFunctionEventsProvider#getEventsProvider()
	 * @see #getPropagatorFunctionEventsProvider()
	 * @generated
	 */
	EReference getPropagatorFunctionEventsProvider_EventsProvider();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.time.continuous.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see com.misc.common.moplaf.time.continuous.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.time.continuous.DistributionVisitor <em>Distribution Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Distribution Visitor</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionVisitor
	 * @model instanceClass="com.misc.common.moplaf.time.continuous.DistributionVisitor"
	 * @generated
	 */
	EDataType getDistributionVisitor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimeContinuousFactory getTimeContinuousFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl <em>Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.DistributionImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getDistribution()
		 * @generated
		 */
		EClass DISTRIBUTION = eINSTANCE.getDistribution();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__TIME_UNIT = eINSTANCE.getDistribution_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Horizon Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__HORIZON_START = eINSTANCE.getDistribution_HorizonStart();

		/**
		 * The meta object literal for the '<em><b>Horizon End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__HORIZON_END = eINSTANCE.getDistribution_HorizonEnd();

		/**
		 * The meta object literal for the '<em><b>Child Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__CHILD_EVENTS = eINSTANCE.getDistribution_ChildEvents();

		/**
		 * The meta object literal for the '<em><b>Sequence Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__SEQUENCE_EVENTS = eINSTANCE.getDistribution_SequenceEvents();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__START = eINSTANCE.getDistribution_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__END = eINSTANCE.getDistribution_End();

		/**
		 * The meta object literal for the '<em><b>Events Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__EVENTS_PROVIDERS = eINSTANCE.getDistribution_EventsProviders();

		/**
		 * The meta object literal for the '<em><b>Parent Distribution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__PARENT_DISTRIBUTION = eINSTANCE.getDistribution_ParentDistribution();

		/**
		 * The meta object literal for the '<em><b>Child Distribution</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__CHILD_DISTRIBUTION = eINSTANCE.getDistribution_ChildDistribution();

		/**
		 * The meta object literal for the '<em><b>Provided Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__PROVIDED_EVENTS = eINSTANCE.getDistribution_ProvidedEvents();

		/**
		 * The meta object literal for the '<em><b>Get Duration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_DURATION__DATE_DATE = eINSTANCE.getDistribution__GetDuration__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Moment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_MOMENT__DATE_FLOAT = eINSTANCE.getDistribution__GetMoment__Date_float();

		/**
		 * The meta object literal for the '<em><b>Get Event Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_EVENT_BEFORE__DATE = eINSTANCE.getDistribution__GetEventBefore__Date();

		/**
		 * The meta object literal for the '<em><b>Get Event Strict Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_EVENT_STRICT_BEFORE__DATE = eINSTANCE.getDistribution__GetEventStrictBefore__Date();

		/**
		 * The meta object literal for the '<em><b>Get Event After</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_EVENT_AFTER__DATE = eINSTANCE.getDistribution__GetEventAfter__Date();

		/**
		 * The meta object literal for the '<em><b>Get Event Strict After</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_EVENT_STRICT_AFTER__DATE = eINSTANCE.getDistribution__GetEventStrictAfter__Date();

		/**
		 * The meta object literal for the '<em><b>Get Amount Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_AMOUNT_BEFORE__DATE = eINSTANCE.getDistribution__GetAmountBefore__Date();

		/**
		 * The meta object literal for the '<em><b>Get Amount After</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_AMOUNT_AFTER__DATE = eINSTANCE.getDistribution__GetAmountAfter__Date();

		/**
		 * The meta object literal for the '<em><b>Get Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_AMOUNT__DATE = eINSTANCE.getDistribution__GetAmount__Date();

		/**
		 * The meta object literal for the '<em><b>Get Slope Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_SLOPE_BEFORE__DATE = eINSTANCE.getDistribution__GetSlopeBefore__Date();

		/**
		 * The meta object literal for the '<em><b>Get Slope After</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_SLOPE_AFTER__DATE = eINSTANCE.getDistribution__GetSlopeAfter__Date();

		/**
		 * The meta object literal for the '<em><b>Get Min Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_MIN_AMOUNT__DATE_DATE = eINSTANCE.getDistribution__GetMinAmount__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Max Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_MAX_AMOUNT__DATE_DATE = eINSTANCE.getDistribution__GetMaxAmount__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Average Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_AVERAGE_AMOUNT__DATE_DATE = eINSTANCE.getDistribution__GetAverageAmount__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Cumulated Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_CUMULATED_AMOUNT__DATE_DATE = eINSTANCE.getDistribution__GetCumulatedAmount__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Earliest Below</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_EARLIEST_BELOW__DATE_FLOAT_FLOAT = eINSTANCE.getDistribution__GetEarliestBelow__Date_float_float();

		/**
		 * The meta object literal for the '<em><b>Get Latest Below</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_LATEST_BELOW__DATE_FLOAT_FLOAT = eINSTANCE.getDistribution__GetLatestBelow__Date_float_float();

		/**
		 * The meta object literal for the '<em><b>Get Earliest Above</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_EARLIEST_ABOVE__DATE_FLOAT_FLOAT = eINSTANCE.getDistribution__GetEarliestAbove__Date_float_float();

		/**
		 * The meta object literal for the '<em><b>Get Latest Above</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_LATEST_ABOVE__DATE_FLOAT_FLOAT = eINSTANCE.getDistribution__GetLatestAbove__Date_float_float();

		/**
		 * The meta object literal for the '<em><b>Get Earliest Output Possible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_EARLIEST_OUTPUT_POSSIBLE__FLOAT_DATE_FLOAT_FLOAT = eINSTANCE.getDistribution__GetEarliestOutputPossible__float_Date_float_float();

		/**
		 * The meta object literal for the '<em><b>Refresh Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___REFRESH_INIT = eINSTANCE.getDistribution__RefreshInit();

		/**
		 * The meta object literal for the '<em><b>Refresh Sequence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___REFRESH_SEQUENCE = eINSTANCE.getDistribution__RefreshSequence();

		/**
		 * The meta object literal for the '<em><b>Refresh Child Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___REFRESH_CHILD_EVENT = eINSTANCE.getDistribution__RefreshChildEvent();

		/**
		 * The meta object literal for the '<em><b>Refresh Provided Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___REFRESH_PROVIDED_EVENTS = eINSTANCE.getDistribution__RefreshProvidedEvents();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___ACCEPT__DATE_DATE_DISTRIBUTIONVISITOR = eINSTANCE.getDistribution__Accept__Date_Date_DistributionVisitor();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl <em>Distribution Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getDistributionEvent()
		 * @generated
		 */
		EClass DISTRIBUTION_EVENT = eINSTANCE.getDistributionEvent();

		/**
		 * The meta object literal for the '<em><b>Moment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_EVENT__MOMENT = eINSTANCE.getDistributionEvent_Moment();

		/**
		 * The meta object literal for the '<em><b>Event Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_EVENT__EVENT_NR = eINSTANCE.getDistributionEvent_EventNr();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_EVENT__NEXT = eINSTANCE.getDistributionEvent_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_EVENT__PREVIOUS = eINSTANCE.getDistributionEvent_Previous();

		/**
		 * The meta object literal for the '<em><b>Amount Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_EVENT__AMOUNT_BEFORE = eINSTANCE.getDistributionEvent_AmountBefore();

		/**
		 * The meta object literal for the '<em><b>Amount After</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_EVENT__AMOUNT_AFTER = eINSTANCE.getDistributionEvent_AmountAfter();

		/**
		 * The meta object literal for the '<em><b>Slope Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_EVENT__SLOPE_BEFORE = eINSTANCE.getDistributionEvent_SlopeBefore();

		/**
		 * The meta object literal for the '<em><b>Slope After</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_EVENT__SLOPE_AFTER = eINSTANCE.getDistributionEvent_SlopeAfter();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_EVENT__DESCRIPTION = eINSTANCE.getDistributionEvent_Description();

		/**
		 * The meta object literal for the '<em><b>Distribution As Sequence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE = eINSTANCE.getDistributionEvent_DistributionAsSequence();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_EVENT__DISTRIBUTION = eINSTANCE.getDistributionEvent_Distribution();

		/**
		 * The meta object literal for the '<em><b>Distribution As Provided Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT = eINSTANCE.getDistributionEvent_DistributionAsProvidedEvent();

		/**
		 * The meta object literal for the '<em><b>Get Amount Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION_EVENT___GET_AMOUNT_BEFORE__DATE = eINSTANCE.getDistributionEvent__GetAmountBefore__Date();

		/**
		 * The meta object literal for the '<em><b>Get Amount After</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION_EVENT___GET_AMOUNT_AFTER__DATE = eINSTANCE.getDistributionEvent__GetAmountAfter__Date();

		/**
		 * The meta object literal for the '<em><b>Is Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION_EVENT___IS_BEFORE__DISTRIBUTIONEVENT = eINSTANCE.getDistributionEvent__IsBefore__DistributionEvent();

		/**
		 * The meta object literal for the '<em><b>Is Strict Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT = eINSTANCE.getDistributionEvent__IsStrictBefore__DistributionEvent();

		/**
		 * The meta object literal for the '<em><b>Refresh Slope Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE = eINSTANCE.getDistributionEvent__RefreshSlopeBefore();

		/**
		 * The meta object literal for the '<em><b>Refresh Amount Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE = eINSTANCE.getDistributionEvent__RefreshAmountBefore();

		/**
		 * The meta object literal for the '<em><b>Refresh Amount After</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER = eINSTANCE.getDistributionEvent__RefreshAmountAfter();

		/**
		 * The meta object literal for the '<em><b>Refresh Slope After</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER = eINSTANCE.getDistributionEvent__RefreshSlopeAfter();

		/**
		 * The meta object literal for the '<em><b>Refresh Moment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION_EVENT___REFRESH_MOMENT = eINSTANCE.getDistributionEvent__RefreshMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.ChildEventImpl <em>Child Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.ChildEventImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getChildEvent()
		 * @generated
		 */
		EClass CHILD_EVENT = eINSTANCE.getChildEvent();

		/**
		 * The meta object literal for the '<em><b>Original</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_EVENT__ORIGINAL = eINSTANCE.getChildEvent_Original();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.StartEventImpl <em>Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.StartEventImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getStartEvent()
		 * @generated
		 */
		EClass START_EVENT = eINSTANCE.getStartEvent();

		/**
		 * The meta object literal for the '<em><b>Amount At Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_EVENT__AMOUNT_AT_START = eINSTANCE.getStartEvent_AmountAtStart();

		/**
		 * The meta object literal for the '<em><b>Slope At Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_EVENT__SLOPE_AT_START = eINSTANCE.getStartEvent_SlopeAtStart();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.EndEventImpl <em>End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.EndEventImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getEndEvent()
		 * @generated
		 */
		EClass END_EVENT = eINSTANCE.getEndEvent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountImpulsionImpl <em>Amount Impulsion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.AmountImpulsionImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getAmountImpulsion()
		 * @generated
		 */
		EClass AMOUNT_IMPULSION = eINSTANCE.getAmountImpulsion();

		/**
		 * The meta object literal for the '<em><b>Amount Impulsion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMOUNT_IMPULSION__AMOUNT_IMPULSION = eINSTANCE.getAmountImpulsion_AmountImpulsion();

		/**
		 * The meta object literal for the '<em><b>Refresh Amount Impulsion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AMOUNT_IMPULSION___REFRESH_AMOUNT_IMPULSION = eINSTANCE.getAmountImpulsion__RefreshAmountImpulsion();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionImpl <em>Slope Impulsion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getSlopeImpulsion()
		 * @generated
		 */
		EClass SLOPE_IMPULSION = eINSTANCE.getSlopeImpulsion();

		/**
		 * The meta object literal for the '<em><b>Slope Impulsion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOPE_IMPULSION__SLOPE_IMPULSION = eINSTANCE.getSlopeImpulsion_SlopeImpulsion();

		/**
		 * The meta object literal for the '<em><b>Refresh Slope Impulsion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLOPE_IMPULSION___REFRESH_SLOPE_IMPULSION = eINSTANCE.getSlopeImpulsion__RefreshSlopeImpulsion();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteImpl <em>Amount Absolute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getAmountAbsolute()
		 * @generated
		 */
		EClass AMOUNT_ABSOLUTE = eINSTANCE.getAmountAbsolute();

		/**
		 * The meta object literal for the '<em><b>Amount Absolute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE = eINSTANCE.getAmountAbsolute_AmountAbsolute();

		/**
		 * The meta object literal for the '<em><b>Refresh Amount Absolute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AMOUNT_ABSOLUTE___REFRESH_AMOUNT_ABSOLUTE = eINSTANCE.getAmountAbsolute__RefreshAmountAbsolute();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteImpl <em>Slope Absolute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getSlopeAbsolute()
		 * @generated
		 */
		EClass SLOPE_ABSOLUTE = eINSTANCE.getSlopeAbsolute();

		/**
		 * The meta object literal for the '<em><b>Slope Absolute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOPE_ABSOLUTE__SLOPE_ABSOLUTE = eINSTANCE.getSlopeAbsolute_SlopeAbsolute();

		/**
		 * The meta object literal for the '<em><b>Refresh Slope Absolute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLOPE_ABSOLUTE___REFRESH_SLOPE_ABSOLUTE = eINSTANCE.getSlopeAbsolute__RefreshSlopeAbsolute();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeStartImpl <em>Capacity Change Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.CapacityChangeStartImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getCapacityChangeStart()
		 * @generated
		 */
		EClass CAPACITY_CHANGE_START = eINSTANCE.getCapacityChangeStart();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPACITY_CHANGE_START__PROVIDER = eINSTANCE.getCapacityChangeStart_Provider();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeEndImpl <em>Capacity Change End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.CapacityChangeEndImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getCapacityChangeEnd()
		 * @generated
		 */
		EClass CAPACITY_CHANGE_END = eINSTANCE.getCapacityChangeEnd();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPACITY_CHANGE_END__PROVIDER = eINSTANCE.getCapacityChangeEnd_Provider();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.StockChangeStartImpl <em>Stock Change Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.StockChangeStartImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getStockChangeStart()
		 * @generated
		 */
		EClass STOCK_CHANGE_START = eINSTANCE.getStockChangeStart();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_CHANGE_START__PROVIDER = eINSTANCE.getStockChangeStart_Provider();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.StockChangeEndImpl <em>Stock Change End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.StockChangeEndImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getStockChangeEnd()
		 * @generated
		 */
		EClass STOCK_CHANGE_END = eINSTANCE.getStockChangeEnd();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_CHANGE_END__PROVIDER = eINSTANCE.getStockChangeEnd_Provider();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountImpulsionAtomicImpl <em>Amount Impulsion Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.AmountImpulsionAtomicImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getAmountImpulsionAtomic()
		 * @generated
		 */
		EClass AMOUNT_IMPULSION_ATOMIC = eINSTANCE.getAmountImpulsionAtomic();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMOUNT_IMPULSION_ATOMIC__PROVIDER = eINSTANCE.getAmountImpulsionAtomic_Provider();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionAtomicImpl <em>Slope Impulsion Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionAtomicImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getSlopeImpulsionAtomic()
		 * @generated
		 */
		EClass SLOPE_IMPULSION_ATOMIC = eINSTANCE.getSlopeImpulsionAtomic();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOPE_IMPULSION_ATOMIC__PROVIDER = eINSTANCE.getSlopeImpulsionAtomic_Provider();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteAtomicImpl <em>Amount Absolute Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteAtomicImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getAmountAbsoluteAtomic()
		 * @generated
		 */
		EClass AMOUNT_ABSOLUTE_ATOMIC = eINSTANCE.getAmountAbsoluteAtomic();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMOUNT_ABSOLUTE_ATOMIC__PROVIDER = eINSTANCE.getAmountAbsoluteAtomic_Provider();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteAtomicImpl <em>Slope Absolute Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteAtomicImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getSlopeAbsoluteAtomic()
		 * @generated
		 */
		EClass SLOPE_ABSOLUTE_ATOMIC = eINSTANCE.getSlopeAbsoluteAtomic();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOPE_ABSOLUTE_ATOMIC__PROVIDER = eINSTANCE.getSlopeAbsoluteAtomic_Provider();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.EventsProviderAbstractImpl <em>Events Provider Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.EventsProviderAbstractImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getEventsProviderAbstract()
		 * @generated
		 */
		EClass EVENTS_PROVIDER_ABSTRACT = eINSTANCE.getEventsProviderAbstract();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_PROVIDER_ABSTRACT__DISTRIBUTION = eINSTANCE.getEventsProviderAbstract_Distribution();

		/**
		 * The meta object literal for the '<em><b>Refresh Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENTS_PROVIDER_ABSTRACT___REFRESH_EVENTS = eINSTANCE.getEventsProviderAbstract__RefreshEvents();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.EventsProviderImpl <em>Events Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.EventsProviderImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getEventsProvider()
		 * @generated
		 */
		EClass EVENTS_PROVIDER = eINSTANCE.getEventsProvider();

		/**
		 * The meta object literal for the '<em><b>Provided Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_PROVIDER__PROVIDED_EVENTS = eINSTANCE.getEventsProvider_ProvidedEvents();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.StockChangeImpl <em>Stock Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.StockChangeImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getStockChange()
		 * @generated
		 */
		EClass STOCK_CHANGE = eINSTANCE.getStockChange();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_CHANGE__START = eINSTANCE.getStockChange_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_CHANGE__END = eINSTANCE.getStockChange_End();

		/**
		 * The meta object literal for the '<em><b>Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_CHANGE__SLOPE = eINSTANCE.getStockChange_Slope();

		/**
		 * The meta object literal for the '<em><b>Start Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_CHANGE__START_EVENT = eINSTANCE.getStockChange_StartEvent();

		/**
		 * The meta object literal for the '<em><b>End Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_CHANGE__END_EVENT = eINSTANCE.getStockChange_EndEvent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeImpl <em>Capacity Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.CapacityChangeImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getCapacityChange()
		 * @generated
		 */
		EClass CAPACITY_CHANGE = eINSTANCE.getCapacityChange();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY_CHANGE__START = eINSTANCE.getCapacityChange_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY_CHANGE__END = eINSTANCE.getCapacityChange_End();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY_CHANGE__AMOUNT = eINSTANCE.getCapacityChange_Amount();

		/**
		 * The meta object literal for the '<em><b>Start Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPACITY_CHANGE__START_EVENT = eINSTANCE.getCapacityChange_StartEvent();

		/**
		 * The meta object literal for the '<em><b>End Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPACITY_CHANGE__END_EVENT = eINSTANCE.getCapacityChange_EndEvent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.EventProviderImpl <em>Event Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.EventProviderImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getEventProvider()
		 * @generated
		 */
		EClass EVENT_PROVIDER = eINSTANCE.getEventProvider();

		/**
		 * The meta object literal for the '<em><b>Provided Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_PROVIDER__PROVIDED_EVENT = eINSTANCE.getEventProvider_ProvidedEvent();

		/**
		 * The meta object literal for the '<em><b>Moment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_PROVIDER__MOMENT = eINSTANCE.getEventProvider_Moment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionProviderImpl <em>Slope Impulsion Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionProviderImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getSlopeImpulsionProvider()
		 * @generated
		 */
		EClass SLOPE_IMPULSION_PROVIDER = eINSTANCE.getSlopeImpulsionProvider();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOPE_IMPULSION_PROVIDER__EVENT = eINSTANCE.getSlopeImpulsionProvider_Event();

		/**
		 * The meta object literal for the '<em><b>Slope Impulsion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOPE_IMPULSION_PROVIDER__SLOPE_IMPULSION = eINSTANCE.getSlopeImpulsionProvider_SlopeImpulsion();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteProviderImpl <em>Slope Absolute Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteProviderImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getSlopeAbsoluteProvider()
		 * @generated
		 */
		EClass SLOPE_ABSOLUTE_PROVIDER = eINSTANCE.getSlopeAbsoluteProvider();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOPE_ABSOLUTE_PROVIDER__EVENT = eINSTANCE.getSlopeAbsoluteProvider_Event();

		/**
		 * The meta object literal for the '<em><b>Slope Absolute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOPE_ABSOLUTE_PROVIDER__SLOPE_ABSOLUTE = eINSTANCE.getSlopeAbsoluteProvider_SlopeAbsolute();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountImpulsionProviderImpl <em>Amount Impulsion Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.AmountImpulsionProviderImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getAmountImpulsionProvider()
		 * @generated
		 */
		EClass AMOUNT_IMPULSION_PROVIDER = eINSTANCE.getAmountImpulsionProvider();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMOUNT_IMPULSION_PROVIDER__EVENT = eINSTANCE.getAmountImpulsionProvider_Event();

		/**
		 * The meta object literal for the '<em><b>Amount Impulsion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMOUNT_IMPULSION_PROVIDER__AMOUNT_IMPULSION = eINSTANCE.getAmountImpulsionProvider_AmountImpulsion();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteProviderImpl <em>Amount Absolute Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteProviderImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getAmountAbsoluteProvider()
		 * @generated
		 */
		EClass AMOUNT_ABSOLUTE_PROVIDER = eINSTANCE.getAmountAbsoluteProvider();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMOUNT_ABSOLUTE_PROVIDER__EVENT = eINSTANCE.getAmountAbsoluteProvider_Event();

		/**
		 * The meta object literal for the '<em><b>Amount Absolute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMOUNT_ABSOLUTE_PROVIDER__AMOUNT_ABSOLUTE = eINSTANCE.getAmountAbsoluteProvider_AmountAbsolute();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.OwnedEventImpl <em>Owned Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.OwnedEventImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getOwnedEvent()
		 * @generated
		 */
		EClass OWNED_EVENT = eINSTANCE.getOwnedEvent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.ProvidedEventImpl <em>Provided Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.ProvidedEventImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getProvidedEvent()
		 * @generated
		 */
		EClass PROVIDED_EVENT = eINSTANCE.getProvidedEvent();

		/**
		 * The meta object literal for the '<em><b>Event Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_EVENT__EVENT_PROVIDER = eINSTANCE.getProvidedEvent_EventProvider();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionImpl <em>Propagator Function Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getPropagatorFunctionDistribution()
		 * @generated
		 */
		EClass PROPAGATOR_FUNCTION_DISTRIBUTION = eINSTANCE.getPropagatorFunctionDistribution();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION = eINSTANCE.getPropagatorFunctionDistribution_Distribution();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionEventImpl <em>Propagator Function Distribution Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionEventImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getPropagatorFunctionDistributionEvent()
		 * @generated
		 */
		EClass PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT = eINSTANCE.getPropagatorFunctionDistributionEvent();

		/**
		 * The meta object literal for the '<em><b>Distribution Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DISTRIBUTION_EVENT = eINSTANCE.getPropagatorFunctionDistributionEvent_DistributionEvent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionEventsProviderImpl <em>Propagator Function Events Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionEventsProviderImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getPropagatorFunctionEventsProvider()
		 * @generated
		 */
		EClass PROPAGATOR_FUNCTION_EVENTS_PROVIDER = eINSTANCE.getPropagatorFunctionEventsProvider();

		/**
		 * The meta object literal for the '<em><b>Events Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_FUNCTION_EVENTS_PROVIDER__EVENTS_PROVIDER = eINSTANCE.getPropagatorFunctionEventsProvider_EventsProvider();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.TimeUnit
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '<em>Distribution Visitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.DistributionVisitor
		 * @see com.misc.common.moplaf.time.continuous.impl.TimeContinuousPackageImpl#getDistributionVisitor()
		 * @generated
		 */
		EDataType DISTRIBUTION_VISITOR = eINSTANCE.getDistributionVisitor();

	}

} //TimeContinuousPackage
