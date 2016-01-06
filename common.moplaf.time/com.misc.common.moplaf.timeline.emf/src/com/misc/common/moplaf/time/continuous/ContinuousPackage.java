/**
 */
package com.misc.common.moplaf.time.continuous;

import com.misc.common.moplaf.propagator.PropagatorPackage;
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
 * @see com.misc.common.moplaf.time.continuous.ContinuousFactory
 * @model kind="package"
 * @generated
 */
public interface ContinuousPackage extends EPackage {
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
	String eNS_URI = "http://com.misc.common.moplaf.timeline.time.continuous";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContinuousPackage eINSTANCE = com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl <em>Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getDistribution()
	 * @generated
	 */
	int DISTRIBUTION = 0;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__TIME_UNIT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Horizon Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__HORIZON_START = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Horizon End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__HORIZON_END = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__CHILD_EVENT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__SEQUENCE_EVENT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__START = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__END = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Events Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__EVENTS_PROVIDERS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__PARENT_DISTRIBUTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Child Distribution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__CHILD_DISTRIBUTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___ADD_PROPAGATOR_FUNCTION_ADAPTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Get Duration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_DURATION__DATE_DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Event Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_EVENT_BEFORE__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Event After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_EVENT_AFTER__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_AMOUNT_BEFORE__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_AMOUNT_AFTER__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_SLOPE_BEFORE__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_SLOPE_AFTER__DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Min Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_MIN_AMOUNT__DATE_DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Max Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_MAX_AMOUNT__DATE_DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Average Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_AVERAGE_AMOUNT__DATE_DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Integral Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___GET_INTEGRAL_AMOUNT__DATE_DATE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Refresh Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___REFRESH_INIT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Refresh Sequence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___REFRESH_SEQUENCE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Refresh Child Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___REFRESH_CHILD_EVENT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION___REFRESH = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl <em>Distribution Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getDistributionEvent()
	 * @generated
	 */
	int DISTRIBUTION_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__MOMENT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__EVENT_NR = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__NEXT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__PREVIOUS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__AMOUNT_BEFORE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__AMOUNT_AFTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__SLOPE_BEFORE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__SLOPE_AFTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Distribution Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___REFRESH_MOMENT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT___REFRESH_DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Distribution Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENT_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.DistributionEventsProvider <em>Distribution Events Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.DistributionEventsProvider
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getDistributionEventsProvider()
	 * @generated
	 */
	int DISTRIBUTION_EVENTS_PROVIDER = 2;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENTS_PROVIDER__DISTRIBUTION = 0;

	/**
	 * The feature id for the '<em><b>Provided Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENTS_PROVIDER__PROVIDED_EVENTS = 1;

	/**
	 * The number of structural features of the '<em>Distribution Events Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENTS_PROVIDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Distribution Events Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_EVENTS_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountImpulsionImpl <em>Amount Impulsion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.AmountImpulsionImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getAmountImpulsion()
	 * @generated
	 */
	int AMOUNT_IMPULSION = 6;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionImpl <em>Slope Impulsion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getSlopeImpulsion()
	 * @generated
	 */
	int SLOPE_IMPULSION = 7;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteImpl <em>Amount Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getAmountAbsolute()
	 * @generated
	 */
	int AMOUNT_ABSOLUTE = 8;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteImpl <em>Slope Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getSlopeAbsolute()
	 * @generated
	 */
	int SLOPE_ABSOLUTE = 9;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.ChildEventImpl <em>Child Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.ChildEventImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getChildEvent()
	 * @generated
	 */
	int CHILD_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__MOMENT = DISTRIBUTION_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__EVENT_NR = DISTRIBUTION_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__NEXT = DISTRIBUTION_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__PREVIOUS = DISTRIBUTION_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__AMOUNT_BEFORE = DISTRIBUTION_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__AMOUNT_AFTER = DISTRIBUTION_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__SLOPE_BEFORE = DISTRIBUTION_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__SLOPE_AFTER = DISTRIBUTION_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__DESCRIPTION = DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__DISTRIBUTION_AS_SEQUENCE = DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT__ORIGINAL = DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT_FEATURE_COUNT = DISTRIBUTION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER = DISTRIBUTION_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___REFRESH_SLOPE_BEFORE = DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___REFRESH_AMOUNT_BEFORE = DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___REFRESH_AMOUNT_AFTER = DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___REFRESH_SLOPE_AFTER = DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___REFRESH_MOMENT = DISTRIBUTION_EVENT___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT___REFRESH_DESCRIPTION = DISTRIBUTION_EVENT___REFRESH_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Child Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_EVENT_OPERATION_COUNT = DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.StartEventImpl <em>Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.StartEventImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getStartEvent()
	 * @generated
	 */
	int START_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__MOMENT = DISTRIBUTION_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__EVENT_NR = DISTRIBUTION_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__NEXT = DISTRIBUTION_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__PREVIOUS = DISTRIBUTION_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__AMOUNT_BEFORE = DISTRIBUTION_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__AMOUNT_AFTER = DISTRIBUTION_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__SLOPE_BEFORE = DISTRIBUTION_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__SLOPE_AFTER = DISTRIBUTION_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__DESCRIPTION = DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__DISTRIBUTION_AS_SEQUENCE = DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Amount At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__AMOUNT_AT_START = DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slope At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__SLOPE_AT_START = DISTRIBUTION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Distribution As Start</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__DISTRIBUTION_AS_START = DISTRIBUTION_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_FEATURE_COUNT = DISTRIBUTION_EVENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER = DISTRIBUTION_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___REFRESH_SLOPE_BEFORE = DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___REFRESH_AMOUNT_BEFORE = DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___REFRESH_AMOUNT_AFTER = DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___REFRESH_SLOPE_AFTER = DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___REFRESH_MOMENT = DISTRIBUTION_EVENT___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT___REFRESH_DESCRIPTION = DISTRIBUTION_EVENT___REFRESH_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_OPERATION_COUNT = DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.EndEventImpl <em>End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.EndEventImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getEndEvent()
	 * @generated
	 */
	int END_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__MOMENT = DISTRIBUTION_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__EVENT_NR = DISTRIBUTION_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__NEXT = DISTRIBUTION_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__PREVIOUS = DISTRIBUTION_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__AMOUNT_BEFORE = DISTRIBUTION_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__AMOUNT_AFTER = DISTRIBUTION_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__SLOPE_BEFORE = DISTRIBUTION_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__SLOPE_AFTER = DISTRIBUTION_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__DESCRIPTION = DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__DISTRIBUTION_AS_SEQUENCE = DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Distribution As End</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__DISTRIBUTION_AS_END = DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_FEATURE_COUNT = DISTRIBUTION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER = DISTRIBUTION_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___REFRESH_SLOPE_BEFORE = DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___REFRESH_AMOUNT_BEFORE = DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___REFRESH_AMOUNT_AFTER = DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___REFRESH_SLOPE_AFTER = DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___REFRESH_MOMENT = DISTRIBUTION_EVENT___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT___REFRESH_DESCRIPTION = DISTRIBUTION_EVENT___REFRESH_DESCRIPTION;

	/**
	 * The number of operations of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_OPERATION_COUNT = DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__MOMENT = DISTRIBUTION_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__EVENT_NR = DISTRIBUTION_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__NEXT = DISTRIBUTION_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__PREVIOUS = DISTRIBUTION_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__AMOUNT_BEFORE = DISTRIBUTION_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__AMOUNT_AFTER = DISTRIBUTION_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__SLOPE_BEFORE = DISTRIBUTION_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__SLOPE_AFTER = DISTRIBUTION_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__DESCRIPTION = DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__DISTRIBUTION_AS_SEQUENCE = DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Amount Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION__AMOUNT_IMPULSION = DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Amount Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_FEATURE_COUNT = DISTRIBUTION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___ADD_PROPAGATOR_FUNCTION_ADAPTER = DISTRIBUTION_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___REFRESH_SLOPE_BEFORE = DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___REFRESH_AMOUNT_BEFORE = DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___REFRESH_AMOUNT_AFTER = DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___REFRESH_SLOPE_AFTER = DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___REFRESH_MOMENT = DISTRIBUTION_EVENT___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___REFRESH_DESCRIPTION = DISTRIBUTION_EVENT___REFRESH_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Amount Impulsion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION___REFRESH_AMOUNT_IMPULSION = DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Amount Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_OPERATION_COUNT = DISTRIBUTION_EVENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__MOMENT = DISTRIBUTION_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__EVENT_NR = DISTRIBUTION_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__NEXT = DISTRIBUTION_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__PREVIOUS = DISTRIBUTION_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__AMOUNT_BEFORE = DISTRIBUTION_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__AMOUNT_AFTER = DISTRIBUTION_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__SLOPE_BEFORE = DISTRIBUTION_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__SLOPE_AFTER = DISTRIBUTION_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__DESCRIPTION = DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__DISTRIBUTION_AS_SEQUENCE = DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Slope Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION__SLOPE_IMPULSION = DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Slope Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_FEATURE_COUNT = DISTRIBUTION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___ADD_PROPAGATOR_FUNCTION_ADAPTER = DISTRIBUTION_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___REFRESH_SLOPE_BEFORE = DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___REFRESH_AMOUNT_BEFORE = DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___REFRESH_AMOUNT_AFTER = DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___REFRESH_SLOPE_AFTER = DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___REFRESH_MOMENT = DISTRIBUTION_EVENT___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___REFRESH_DESCRIPTION = DISTRIBUTION_EVENT___REFRESH_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Slope Impulsion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION___REFRESH_SLOPE_IMPULSION = DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Slope Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_OPERATION_COUNT = DISTRIBUTION_EVENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__MOMENT = DISTRIBUTION_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__EVENT_NR = DISTRIBUTION_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__NEXT = DISTRIBUTION_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__PREVIOUS = DISTRIBUTION_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__AMOUNT_BEFORE = DISTRIBUTION_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__AMOUNT_AFTER = DISTRIBUTION_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__SLOPE_BEFORE = DISTRIBUTION_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__SLOPE_AFTER = DISTRIBUTION_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__DESCRIPTION = DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__DISTRIBUTION_AS_SEQUENCE = DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Amount Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE = DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Amount Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_FEATURE_COUNT = DISTRIBUTION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___ADD_PROPAGATOR_FUNCTION_ADAPTER = DISTRIBUTION_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___REFRESH_SLOPE_BEFORE = DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___REFRESH_AMOUNT_BEFORE = DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___REFRESH_AMOUNT_AFTER = DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___REFRESH_SLOPE_AFTER = DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___REFRESH_MOMENT = DISTRIBUTION_EVENT___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE___REFRESH_DESCRIPTION = DISTRIBUTION_EVENT___REFRESH_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Amount Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_ABSOLUTE_OPERATION_COUNT = DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__MOMENT = DISTRIBUTION_EVENT__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__EVENT_NR = DISTRIBUTION_EVENT__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__NEXT = DISTRIBUTION_EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__PREVIOUS = DISTRIBUTION_EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__AMOUNT_BEFORE = DISTRIBUTION_EVENT__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__AMOUNT_AFTER = DISTRIBUTION_EVENT__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__SLOPE_BEFORE = DISTRIBUTION_EVENT__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__SLOPE_AFTER = DISTRIBUTION_EVENT__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__DESCRIPTION = DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution As Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__DISTRIBUTION_AS_SEQUENCE = DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Slope Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE__SLOPE_ABSOLUTE = DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Slope Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_FEATURE_COUNT = DISTRIBUTION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___ADD_PROPAGATOR_FUNCTION_ADAPTER = DISTRIBUTION_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___REFRESH_SLOPE_BEFORE = DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___REFRESH_AMOUNT_BEFORE = DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___REFRESH_AMOUNT_AFTER = DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___REFRESH_SLOPE_AFTER = DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___REFRESH_MOMENT = DISTRIBUTION_EVENT___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE___REFRESH_DESCRIPTION = DISTRIBUTION_EVENT___REFRESH_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Slope Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_ABSOLUTE_OPERATION_COUNT = DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.CompositeEventImpl <em>Composite Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.CompositeEventImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getCompositeEvent()
	 * @generated
	 */
	int COMPOSITE_EVENT = 18;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EVENT__DISTRIBUTION = DISTRIBUTION_EVENTS_PROVIDER__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Provided Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EVENT__PROVIDED_EVENTS = DISTRIBUTION_EVENTS_PROVIDER__PROVIDED_EVENTS;

	/**
	 * The number of structural features of the '<em>Composite Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EVENT_FEATURE_COUNT = DISTRIBUTION_EVENTS_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER = DISTRIBUTION_EVENTS_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EVENT___REFRESH_EVENT = DISTRIBUTION_EVENTS_PROVIDER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EVENT_OPERATION_COUNT = DISTRIBUTION_EVENTS_PROVIDER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeImpl <em>Capacity Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.CapacityChangeImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getCapacityChange()
	 * @generated
	 */
	int CAPACITY_CHANGE = 10;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__DISTRIBUTION = COMPOSITE_EVENT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Provided Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__PROVIDED_EVENTS = COMPOSITE_EVENT__PROVIDED_EVENTS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__START = COMPOSITE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__END = COMPOSITE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__AMOUNT = COMPOSITE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Capacity Change Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__CAPACITY_CHANGE_START = COMPOSITE_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Capacity Change End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE__CAPACITY_CHANGE_END = COMPOSITE_EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Capacity Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_FEATURE_COUNT = COMPOSITE_EVENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE___ADD_PROPAGATOR_FUNCTION_ADAPTER = COMPOSITE_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE___REFRESH_EVENT = COMPOSITE_EVENT___REFRESH_EVENT;

	/**
	 * The number of operations of the '<em>Capacity Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_OPERATION_COUNT = COMPOSITE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.StockChangeImpl <em>Stock Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.StockChangeImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getStockChange()
	 * @generated
	 */
	int STOCK_CHANGE = 13;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.StockChangeStartImpl <em>Stock Change Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.StockChangeStartImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getStockChangeStart()
	 * @generated
	 */
	int STOCK_CHANGE_START = 14;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.StockChangeEndImpl <em>Stock Change End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.StockChangeEndImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getStockChangeEnd()
	 * @generated
	 */
	int STOCK_CHANGE_END = 15;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeStartImpl <em>Capacity Change Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.impl.CapacityChangeStartImpl
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getCapacityChangeStart()
	 * @generated
	 */
	int CAPACITY_CHANGE_START = 11;

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
	 * The feature id for the '<em><b>Amount Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__AMOUNT_IMPULSION = AMOUNT_IMPULSION__AMOUNT_IMPULSION;

	/**
	 * The feature id for the '<em><b>Capacity Change</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START__CAPACITY_CHANGE = AMOUNT_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capacity Change Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START_FEATURE_COUNT = AMOUNT_IMPULSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START___ADD_PROPAGATOR_FUNCTION_ADAPTER = AMOUNT_IMPULSION___ADD_PROPAGATOR_FUNCTION_ADAPTER;

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
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_START___REFRESH_DESCRIPTION = AMOUNT_IMPULSION___REFRESH_DESCRIPTION;

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
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getCapacityChangeEnd()
	 * @generated
	 */
	int CAPACITY_CHANGE_END = 12;

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
	 * The feature id for the '<em><b>Amount Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__AMOUNT_IMPULSION = AMOUNT_IMPULSION__AMOUNT_IMPULSION;

	/**
	 * The feature id for the '<em><b>Capacity Change</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END__CAPACITY_CHANGE = AMOUNT_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capacity Change End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END_FEATURE_COUNT = AMOUNT_IMPULSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END___ADD_PROPAGATOR_FUNCTION_ADAPTER = AMOUNT_IMPULSION___ADD_PROPAGATOR_FUNCTION_ADAPTER;

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
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_CHANGE_END___REFRESH_DESCRIPTION = AMOUNT_IMPULSION___REFRESH_DESCRIPTION;

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
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__DISTRIBUTION = COMPOSITE_EVENT__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Provided Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__PROVIDED_EVENTS = COMPOSITE_EVENT__PROVIDED_EVENTS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__START = COMPOSITE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__END = COMPOSITE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__SLOPE = COMPOSITE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stock Change Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__STOCK_CHANGE_START = COMPOSITE_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stock Change End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE__STOCK_CHANGE_END = COMPOSITE_EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Stock Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_FEATURE_COUNT = COMPOSITE_EVENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE___ADD_PROPAGATOR_FUNCTION_ADAPTER = COMPOSITE_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE___REFRESH_EVENT = COMPOSITE_EVENT___REFRESH_EVENT;

	/**
	 * The number of operations of the '<em>Stock Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_OPERATION_COUNT = COMPOSITE_EVENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Slope Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__SLOPE_IMPULSION = SLOPE_IMPULSION__SLOPE_IMPULSION;

	/**
	 * The feature id for the '<em><b>Stock Change</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START__STOCK_CHANGE = SLOPE_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stock Change Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START_FEATURE_COUNT = SLOPE_IMPULSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START___ADD_PROPAGATOR_FUNCTION_ADAPTER = SLOPE_IMPULSION___ADD_PROPAGATOR_FUNCTION_ADAPTER;

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
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_START___REFRESH_DESCRIPTION = SLOPE_IMPULSION___REFRESH_DESCRIPTION;

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
	 * The feature id for the '<em><b>Slope Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__SLOPE_IMPULSION = SLOPE_IMPULSION__SLOPE_IMPULSION;

	/**
	 * The feature id for the '<em><b>Stock Change</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END__STOCK_CHANGE = SLOPE_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stock Change End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END_FEATURE_COUNT = SLOPE_IMPULSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END___ADD_PROPAGATOR_FUNCTION_ADAPTER = SLOPE_IMPULSION___ADD_PROPAGATOR_FUNCTION_ADAPTER;

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
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_CHANGE_END___REFRESH_DESCRIPTION = SLOPE_IMPULSION___REFRESH_DESCRIPTION;

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
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getAmountImpulsionAtomic()
	 * @generated
	 */
	int AMOUNT_IMPULSION_ATOMIC = 16;

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
	 * The feature id for the '<em><b>Amount Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__AMOUNT_IMPULSION = AMOUNT_IMPULSION__AMOUNT_IMPULSION;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__DISTRIBUTION = AMOUNT_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC__PROVIDED_EVENTS = AMOUNT_IMPULSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Amount Impulsion Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC_FEATURE_COUNT = AMOUNT_IMPULSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC___ADD_PROPAGATOR_FUNCTION_ADAPTER = AMOUNT_IMPULSION___ADD_PROPAGATOR_FUNCTION_ADAPTER;

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
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_IMPULSION_ATOMIC___REFRESH_DESCRIPTION = AMOUNT_IMPULSION___REFRESH_DESCRIPTION;

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
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getSlopeImpulsionAtomic()
	 * @generated
	 */
	int SLOPE_IMPULSION_ATOMIC = 17;

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
	 * The feature id for the '<em><b>Slope Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__SLOPE_IMPULSION = SLOPE_IMPULSION__SLOPE_IMPULSION;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__DISTRIBUTION = SLOPE_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC__PROVIDED_EVENTS = SLOPE_IMPULSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Slope Impulsion Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC_FEATURE_COUNT = SLOPE_IMPULSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC___ADD_PROPAGATOR_FUNCTION_ADAPTER = SLOPE_IMPULSION___ADD_PROPAGATOR_FUNCTION_ADAPTER;

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
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_IMPULSION_ATOMIC___REFRESH_DESCRIPTION = SLOPE_IMPULSION___REFRESH_DESCRIPTION;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.TimeUnit
	 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 19;


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
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.time.continuous.Distribution#getSequenceEvent <em>Sequence Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sequence Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getSequenceEvent()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_SequenceEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.time.continuous.Distribution#getChildEvent <em>Child Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getChildEvent()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_ChildEvent();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getDuration(java.util.Date, java.util.Date) <em>Get Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Duration</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getDuration(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetDuration__Date_Date();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getEventAfter(java.util.Date) <em>Get Event After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Event After</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getEventAfter(java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetEventAfter__Date();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#getIntegralAmount(java.util.Date, java.util.Date) <em>Get Integral Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Integral Amount</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getIntegralAmount(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getDistribution__GetIntegralAmount__Date_Date();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.Distribution#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.Distribution#refresh()
	 * @generated
	 */
	EOperation getDistribution__Refresh();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.DistributionEvent#refreshDescription() <em>Refresh Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Description</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEvent#refreshDescription()
	 * @generated
	 */
	EOperation getDistributionEvent__RefreshDescription();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.DistributionEventsProvider <em>Distribution Events Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Events Provider</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEventsProvider
	 * @generated
	 */
	EClass getDistributionEventsProvider();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.DistributionEventsProvider#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distribution</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEventsProvider#getDistribution()
	 * @see #getDistributionEventsProvider()
	 * @generated
	 */
	EReference getDistributionEventsProvider_Distribution();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.time.continuous.DistributionEventsProvider#getProvidedEvents <em>Provided Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.DistributionEventsProvider#getProvidedEvents()
	 * @see #getDistributionEventsProvider()
	 * @generated
	 */
	EReference getDistributionEventsProvider_ProvidedEvents();

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
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getCapacityChangeStart <em>Capacity Change Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capacity Change Start</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChange#getCapacityChangeStart()
	 * @see #getCapacityChange()
	 * @generated
	 */
	EReference getCapacityChange_CapacityChangeStart();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.time.continuous.CapacityChange#getCapacityChangeEnd <em>Capacity Change End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capacity Change End</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChange#getCapacityChangeEnd()
	 * @see #getCapacityChange()
	 * @generated
	 */
	EReference getCapacityChange_CapacityChangeEnd();

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
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.time.continuous.StockChange#getStockChangeStart <em>Stock Change Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stock Change Start</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StockChange#getStockChangeStart()
	 * @see #getStockChange()
	 * @generated
	 */
	EReference getStockChange_StockChangeStart();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.time.continuous.StockChange#getStockChangeEnd <em>Stock Change End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stock Change End</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StockChange#getStockChangeEnd()
	 * @see #getStockChange()
	 * @generated
	 */
	EReference getStockChange_StockChangeEnd();

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.StockChangeStart#getStockChange <em>Stock Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Stock Change</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StockChangeStart#getStockChange()
	 * @see #getStockChangeStart()
	 * @generated
	 */
	EReference getStockChangeStart_StockChange();

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.StockChangeEnd#getStockChange <em>Stock Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Stock Change</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StockChangeEnd#getStockChange()
	 * @see #getStockChangeEnd()
	 * @generated
	 */
	EReference getStockChangeEnd_StockChange();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic <em>Slope Impulsion Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slope Impulsion Atomic</em>'.
	 * @see com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic
	 * @generated
	 */
	EClass getSlopeImpulsionAtomic();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.CompositeEvent <em>Composite Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Event</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CompositeEvent
	 * @generated
	 */
	EClass getCompositeEvent();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.continuous.CompositeEvent#refreshEvent() <em>Refresh Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Event</em>' operation.
	 * @see com.misc.common.moplaf.time.continuous.CompositeEvent#refreshEvent()
	 * @generated
	 */
	EOperation getCompositeEvent__RefreshEvent();

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.StartEvent#getDistributionAsStart <em>Distribution As Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Distribution As Start</em>'.
	 * @see com.misc.common.moplaf.time.continuous.StartEvent#getDistributionAsStart()
	 * @see #getStartEvent()
	 * @generated
	 */
	EReference getStartEvent_DistributionAsStart();

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.EndEvent#getDistributionAsEnd <em>Distribution As End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Distribution As End</em>'.
	 * @see com.misc.common.moplaf.time.continuous.EndEvent#getDistributionAsEnd()
	 * @see #getEndEvent()
	 * @generated
	 */
	EReference getEndEvent_DistributionAsEnd();

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.CapacityChangeStart#getCapacityChange <em>Capacity Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Capacity Change</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChangeStart#getCapacityChange()
	 * @see #getCapacityChangeStart()
	 * @generated
	 */
	EReference getCapacityChangeStart_CapacityChange();

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.time.continuous.CapacityChangeEnd#getCapacityChange <em>Capacity Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Capacity Change</em>'.
	 * @see com.misc.common.moplaf.time.continuous.CapacityChangeEnd#getCapacityChange()
	 * @see #getCapacityChangeEnd()
	 * @generated
	 */
	EReference getCapacityChangeEnd_CapacityChange();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContinuousFactory getContinuousFactory();

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
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getDistribution()
		 * @generated
		 */
		EClass DISTRIBUTION = eINSTANCE.getDistribution();

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
		 * The meta object literal for the '<em><b>Sequence Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__SEQUENCE_EVENT = eINSTANCE.getDistribution_SequenceEvent();

		/**
		 * The meta object literal for the '<em><b>Child Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__CHILD_EVENT = eINSTANCE.getDistribution_ChildEvent();

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
		 * The meta object literal for the '<em><b>Get Duration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_DURATION__DATE_DATE = eINSTANCE.getDistribution__GetDuration__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Event Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_EVENT_BEFORE__DATE = eINSTANCE.getDistribution__GetEventBefore__Date();

		/**
		 * The meta object literal for the '<em><b>Get Event After</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_EVENT_AFTER__DATE = eINSTANCE.getDistribution__GetEventAfter__Date();

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
		 * The meta object literal for the '<em><b>Get Integral Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___GET_INTEGRAL_AMOUNT__DATE_DATE = eINSTANCE.getDistribution__GetIntegralAmount__Date_Date();

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
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION___REFRESH = eINSTANCE.getDistribution__Refresh();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl <em>Distribution Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getDistributionEvent()
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
		 * The meta object literal for the '<em><b>Refresh Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISTRIBUTION_EVENT___REFRESH_DESCRIPTION = eINSTANCE.getDistributionEvent__RefreshDescription();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.DistributionEventsProvider <em>Distribution Events Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.DistributionEventsProvider
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getDistributionEventsProvider()
		 * @generated
		 */
		EClass DISTRIBUTION_EVENTS_PROVIDER = eINSTANCE.getDistributionEventsProvider();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_EVENTS_PROVIDER__DISTRIBUTION = eINSTANCE.getDistributionEventsProvider_Distribution();

		/**
		 * The meta object literal for the '<em><b>Provided Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_EVENTS_PROVIDER__PROVIDED_EVENTS = eINSTANCE.getDistributionEventsProvider_ProvidedEvents();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountImpulsionImpl <em>Amount Impulsion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.AmountImpulsionImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getAmountImpulsion()
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
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getSlopeImpulsion()
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
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getAmountAbsolute()
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
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteImpl <em>Slope Absolute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getSlopeAbsolute()
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
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeImpl <em>Capacity Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.CapacityChangeImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getCapacityChange()
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
		 * The meta object literal for the '<em><b>Capacity Change Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPACITY_CHANGE__CAPACITY_CHANGE_START = eINSTANCE.getCapacityChange_CapacityChangeStart();

		/**
		 * The meta object literal for the '<em><b>Capacity Change End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPACITY_CHANGE__CAPACITY_CHANGE_END = eINSTANCE.getCapacityChange_CapacityChangeEnd();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.StockChangeImpl <em>Stock Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.StockChangeImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getStockChange()
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
		 * The meta object literal for the '<em><b>Stock Change Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_CHANGE__STOCK_CHANGE_START = eINSTANCE.getStockChange_StockChangeStart();

		/**
		 * The meta object literal for the '<em><b>Stock Change End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_CHANGE__STOCK_CHANGE_END = eINSTANCE.getStockChange_StockChangeEnd();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.StockChangeStartImpl <em>Stock Change Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.StockChangeStartImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getStockChangeStart()
		 * @generated
		 */
		EClass STOCK_CHANGE_START = eINSTANCE.getStockChangeStart();

		/**
		 * The meta object literal for the '<em><b>Stock Change</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_CHANGE_START__STOCK_CHANGE = eINSTANCE.getStockChangeStart_StockChange();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.StockChangeEndImpl <em>Stock Change End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.StockChangeEndImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getStockChangeEnd()
		 * @generated
		 */
		EClass STOCK_CHANGE_END = eINSTANCE.getStockChangeEnd();

		/**
		 * The meta object literal for the '<em><b>Stock Change</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_CHANGE_END__STOCK_CHANGE = eINSTANCE.getStockChangeEnd_StockChange();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.AmountImpulsionAtomicImpl <em>Amount Impulsion Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.AmountImpulsionAtomicImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getAmountImpulsionAtomic()
		 * @generated
		 */
		EClass AMOUNT_IMPULSION_ATOMIC = eINSTANCE.getAmountImpulsionAtomic();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionAtomicImpl <em>Slope Impulsion Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionAtomicImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getSlopeImpulsionAtomic()
		 * @generated
		 */
		EClass SLOPE_IMPULSION_ATOMIC = eINSTANCE.getSlopeImpulsionAtomic();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.CompositeEventImpl <em>Composite Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.CompositeEventImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getCompositeEvent()
		 * @generated
		 */
		EClass COMPOSITE_EVENT = eINSTANCE.getCompositeEvent();

		/**
		 * The meta object literal for the '<em><b>Refresh Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSITE_EVENT___REFRESH_EVENT = eINSTANCE.getCompositeEvent__RefreshEvent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.ChildEventImpl <em>Child Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.ChildEventImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getChildEvent()
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
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getStartEvent()
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
		 * The meta object literal for the '<em><b>Distribution As Start</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_EVENT__DISTRIBUTION_AS_START = eINSTANCE.getStartEvent_DistributionAsStart();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.EndEventImpl <em>End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.EndEventImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getEndEvent()
		 * @generated
		 */
		EClass END_EVENT = eINSTANCE.getEndEvent();

		/**
		 * The meta object literal for the '<em><b>Distribution As End</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_EVENT__DISTRIBUTION_AS_END = eINSTANCE.getEndEvent_DistributionAsEnd();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeStartImpl <em>Capacity Change Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.CapacityChangeStartImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getCapacityChangeStart()
		 * @generated
		 */
		EClass CAPACITY_CHANGE_START = eINSTANCE.getCapacityChangeStart();

		/**
		 * The meta object literal for the '<em><b>Capacity Change</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPACITY_CHANGE_START__CAPACITY_CHANGE = eINSTANCE.getCapacityChangeStart_CapacityChange();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeEndImpl <em>Capacity Change End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.impl.CapacityChangeEndImpl
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getCapacityChangeEnd()
		 * @generated
		 */
		EClass CAPACITY_CHANGE_END = eINSTANCE.getCapacityChangeEnd();

		/**
		 * The meta object literal for the '<em><b>Capacity Change</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPACITY_CHANGE_END__CAPACITY_CHANGE = eINSTANCE.getCapacityChangeEnd_CapacityChange();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.TimeUnit
		 * @see com.misc.common.moplaf.time.continuous.impl.ContinuousPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

	}

} //ContinuousPackage
