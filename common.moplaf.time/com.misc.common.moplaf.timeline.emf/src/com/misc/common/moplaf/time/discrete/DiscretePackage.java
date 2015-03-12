/**
 */
package com.misc.common.moplaf.time.discrete;

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
 * @see com.misc.common.moplaf.time.discrete.DiscreteFactory
 * @model kind="package"
 * @generated
 */
public interface DiscretePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "discrete";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.common.moplaf.timeline.time.discrete";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiscretePackage eINSTANCE = com.misc.common.moplaf.time.discrete.impl.DiscretePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.discrete.impl.TimeLineImpl <em>Time Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.discrete.impl.TimeLineImpl
	 * @see com.misc.common.moplaf.time.discrete.impl.DiscretePackageImpl#getTimeLine()
	 * @generated
	 */
	int TIME_LINE = 0;

	/**
	 * The feature id for the '<em><b>Bucket Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__BUCKET_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Time Zone ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__TIME_ZONE_ID = 2;

	/**
	 * The feature id for the '<em><b>Locale Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__LOCALE_LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Locale Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__LOCALE_COUNTRY = 4;

	/**
	 * The feature id for the '<em><b>Horizon Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__HORIZON_START = 5;

	/**
	 * The feature id for the '<em><b>Horizon End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__HORIZON_END = 6;

	/**
	 * The feature id for the '<em><b>Bucket</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__BUCKET = 7;

	/**
	 * The feature id for the '<em><b>First Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__FIRST_BUCKET = 8;

	/**
	 * The feature id for the '<em><b>Last Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__LAST_BUCKET = 9;

	/**
	 * The number of structural features of the '<em>Time Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Refresh Horizon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE___REFRESH_HORIZON = 0;

	/**
	 * The operation id for the '<em>Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE___ITERATOR__DATE_DATE_BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Get Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE___GET_BUCKET__DATE = 2;

	/**
	 * The operation id for the '<em>Get Seconds Intersection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE___GET_SECONDS_INTERSECTION__DATE_DATE_DATE_DATE = 3;

	/**
	 * The operation id for the '<em>Create Bucket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE___CREATE_BUCKET = 4;

	/**
	 * The number of operations of the '<em>Time Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.discrete.impl.TimeBucketImpl <em>Time Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.discrete.impl.TimeBucketImpl
	 * @see com.misc.common.moplaf.time.discrete.impl.DiscretePackageImpl#getTimeBucket()
	 * @generated
	 */
	int TIME_BUCKET = 1;

	/**
	 * The feature id for the '<em><b>Bucket Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BUCKET__BUCKET_START = 0;

	/**
	 * The feature id for the '<em><b>Bucket End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BUCKET__BUCKET_END = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BUCKET__NEXT = 2;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BUCKET__PREVIOUS = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BUCKET__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BUCKET__SECONDS = 5;

	/**
	 * The number of structural features of the '<em>Time Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BUCKET_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BUCKET___CONTAINS__DATE = 0;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BUCKET___IS_BEFORE__TIMEBUCKET = 1;

	/**
	 * The operation id for the '<em>Get Seconds Intersection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BUCKET___GET_SECONDS_INTERSECTION__DATE_DATE = 2;

	/**
	 * The number of operations of the '<em>Time Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BUCKET_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.discrete.impl.TimeLineMergeImpl <em>Time Line Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.discrete.impl.TimeLineMergeImpl
	 * @see com.misc.common.moplaf.time.discrete.impl.DiscretePackageImpl#getTimeLineMerge()
	 * @generated
	 */
	int TIME_LINE_MERGE = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_MERGE__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Time Line To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_MERGE__TIME_LINE_TO = 1;

	/**
	 * The feature id for the '<em><b>First Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_MERGE__FIRST_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Last Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_MERGE__LAST_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Time Line From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_MERGE__TIME_LINE_FROM = 4;

	/**
	 * The number of structural features of the '<em>Time Line Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_MERGE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_MERGE___REFRESH = 0;

	/**
	 * The number of operations of the '<em>Time Line Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_MERGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.discrete.impl.MergeElementImpl <em>Merge Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.discrete.impl.MergeElementImpl
	 * @see com.misc.common.moplaf.time.discrete.impl.DiscretePackageImpl#getMergeElement()
	 * @generated
	 */
	int MERGE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Bucket From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ELEMENT__BUCKET_FROM = 0;

	/**
	 * The feature id for the '<em><b>Bucket To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ELEMENT__BUCKET_TO = 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ELEMENT__PREVIOUS = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ELEMENT__NEXT = 3;

	/**
	 * The feature id for the '<em><b>Part From In To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ELEMENT__PART_FROM_IN_TO = 4;

	/**
	 * The feature id for the '<em><b>Part To In From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ELEMENT__PART_TO_IN_FROM = 5;

	/**
	 * The feature id for the '<em><b>Element Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ELEMENT__ELEMENT_START = 6;

	/**
	 * The feature id for the '<em><b>Element End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ELEMENT__ELEMENT_END = 7;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ELEMENT__SECONDS = 8;

	/**
	 * The number of structural features of the '<em>Merge Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ELEMENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Merge Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.discrete.BucketType <em>Bucket Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.discrete.BucketType
	 * @see com.misc.common.moplaf.time.discrete.impl.DiscretePackageImpl#getBucketType()
	 * @generated
	 */
	int BUCKET_TYPE = 4;

	/**
	 * The meta object id for the '<em>Bucket Iterator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.discrete.BucketIterator
	 * @see com.misc.common.moplaf.time.discrete.impl.DiscretePackageImpl#getBucketIterator()
	 * @generated
	 */
	int BUCKET_ITERATOR = 5;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.discrete.TimeLine <em>Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Line</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine
	 * @generated
	 */
	EClass getTimeLine();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.TimeLine#getBucketType <em>Bucket Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket Type</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#getBucketType()
	 * @see #getTimeLine()
	 * @generated
	 */
	EAttribute getTimeLine_BucketType();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.TimeLine#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#getDescription()
	 * @see #getTimeLine()
	 * @generated
	 */
	EAttribute getTimeLine_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.TimeLine#getTimeZoneID <em>Time Zone ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Zone ID</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#getTimeZoneID()
	 * @see #getTimeLine()
	 * @generated
	 */
	EAttribute getTimeLine_TimeZoneID();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.TimeLine#getLocaleLanguage <em>Locale Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale Language</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#getLocaleLanguage()
	 * @see #getTimeLine()
	 * @generated
	 */
	EAttribute getTimeLine_LocaleLanguage();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.TimeLine#getLocaleCountry <em>Locale Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale Country</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#getLocaleCountry()
	 * @see #getTimeLine()
	 * @generated
	 */
	EAttribute getTimeLine_LocaleCountry();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.TimeLine#getHorizonStart <em>Horizon Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizon Start</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#getHorizonStart()
	 * @see #getTimeLine()
	 * @generated
	 */
	EAttribute getTimeLine_HorizonStart();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.TimeLine#getHorizonEnd <em>Horizon End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizon End</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#getHorizonEnd()
	 * @see #getTimeLine()
	 * @generated
	 */
	EAttribute getTimeLine_HorizonEnd();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.time.discrete.TimeLine#getBucket <em>Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bucket</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#getBucket()
	 * @see #getTimeLine()
	 * @generated
	 */
	EReference getTimeLine_Bucket();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.discrete.TimeLine#getFirstBucket <em>First Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Bucket</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#getFirstBucket()
	 * @see #getTimeLine()
	 * @generated
	 */
	EReference getTimeLine_FirstBucket();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.discrete.TimeLine#getLastBucket <em>Last Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Bucket</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#getLastBucket()
	 * @see #getTimeLine()
	 * @generated
	 */
	EReference getTimeLine_LastBucket();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.discrete.TimeLine#refreshHorizon() <em>Refresh Horizon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Horizon</em>' operation.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#refreshHorizon()
	 * @generated
	 */
	EOperation getTimeLine__RefreshHorizon();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.discrete.TimeLine#iterator(java.util.Date, java.util.Date, boolean) <em>Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iterator</em>' operation.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#iterator(java.util.Date, java.util.Date, boolean)
	 * @generated
	 */
	EOperation getTimeLine__Iterator__Date_Date_boolean();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.discrete.TimeLine#getBucket(java.util.Date) <em>Get Bucket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bucket</em>' operation.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#getBucket(java.util.Date)
	 * @generated
	 */
	EOperation getTimeLine__GetBucket__Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.discrete.TimeLine#getSecondsIntersection(java.util.Date, java.util.Date, java.util.Date, java.util.Date) <em>Get Seconds Intersection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Seconds Intersection</em>' operation.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#getSecondsIntersection(java.util.Date, java.util.Date, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getTimeLine__GetSecondsIntersection__Date_Date_Date_Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.discrete.TimeLine#createBucket() <em>Create Bucket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Bucket</em>' operation.
	 * @see com.misc.common.moplaf.time.discrete.TimeLine#createBucket()
	 * @generated
	 */
	EOperation getTimeLine__CreateBucket();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.discrete.TimeBucket <em>Time Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Bucket</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeBucket
	 * @generated
	 */
	EClass getTimeBucket();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getBucketStart <em>Bucket Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket Start</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeBucket#getBucketStart()
	 * @see #getTimeBucket()
	 * @generated
	 */
	EAttribute getTimeBucket_BucketStart();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getBucketEnd <em>Bucket End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket End</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeBucket#getBucketEnd()
	 * @see #getTimeBucket()
	 * @generated
	 */
	EAttribute getTimeBucket_BucketEnd();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeBucket#getNext()
	 * @see #getTimeBucket()
	 * @generated
	 */
	EReference getTimeBucket_Next();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeBucket#getPrevious()
	 * @see #getTimeBucket()
	 * @generated
	 */
	EReference getTimeBucket_Previous();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeBucket#getDescription()
	 * @see #getTimeBucket()
	 * @generated
	 */
	EAttribute getTimeBucket_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeBucket#getSeconds()
	 * @see #getTimeBucket()
	 * @generated
	 */
	EAttribute getTimeBucket_Seconds();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.discrete.TimeBucket#contains(java.util.Date) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see com.misc.common.moplaf.time.discrete.TimeBucket#contains(java.util.Date)
	 * @generated
	 */
	EOperation getTimeBucket__Contains__Date();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.discrete.TimeBucket#isBefore(com.misc.common.moplaf.time.discrete.TimeBucket) <em>Is Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Before</em>' operation.
	 * @see com.misc.common.moplaf.time.discrete.TimeBucket#isBefore(com.misc.common.moplaf.time.discrete.TimeBucket)
	 * @generated
	 */
	EOperation getTimeBucket__IsBefore__TimeBucket();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.discrete.TimeBucket#getSecondsIntersection(java.util.Date, java.util.Date) <em>Get Seconds Intersection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Seconds Intersection</em>' operation.
	 * @see com.misc.common.moplaf.time.discrete.TimeBucket#getSecondsIntersection(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getTimeBucket__GetSecondsIntersection__Date_Date();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.discrete.TimeLineMerge <em>Time Line Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Line Merge</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLineMerge
	 * @generated
	 */
	EClass getTimeLineMerge();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLineMerge#getElement()
	 * @see #getTimeLineMerge()
	 * @generated
	 */
	EReference getTimeLineMerge_Element();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#getTimeLineTo <em>Time Line To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Line To</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLineMerge#getTimeLineTo()
	 * @see #getTimeLineMerge()
	 * @generated
	 */
	EReference getTimeLineMerge_TimeLineTo();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#getFirstElement <em>First Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Element</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLineMerge#getFirstElement()
	 * @see #getTimeLineMerge()
	 * @generated
	 */
	EReference getTimeLineMerge_FirstElement();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#getLastElement <em>Last Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Element</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLineMerge#getLastElement()
	 * @see #getTimeLineMerge()
	 * @generated
	 */
	EReference getTimeLineMerge_LastElement();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#getTimeLineFrom <em>Time Line From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Line From</em>'.
	 * @see com.misc.common.moplaf.time.discrete.TimeLineMerge#getTimeLineFrom()
	 * @see #getTimeLineMerge()
	 * @generated
	 */
	EReference getTimeLineMerge_TimeLineFrom();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.time.discrete.TimeLineMerge#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.time.discrete.TimeLineMerge#refresh()
	 * @generated
	 */
	EOperation getTimeLineMerge__Refresh();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.discrete.MergeElement <em>Merge Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Element</em>'.
	 * @see com.misc.common.moplaf.time.discrete.MergeElement
	 * @generated
	 */
	EClass getMergeElement();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.discrete.MergeElement#getBucketFrom <em>Bucket From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bucket From</em>'.
	 * @see com.misc.common.moplaf.time.discrete.MergeElement#getBucketFrom()
	 * @see #getMergeElement()
	 * @generated
	 */
	EReference getMergeElement_BucketFrom();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.discrete.MergeElement#getBucketTo <em>Bucket To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bucket To</em>'.
	 * @see com.misc.common.moplaf.time.discrete.MergeElement#getBucketTo()
	 * @see #getMergeElement()
	 * @generated
	 */
	EReference getMergeElement_BucketTo();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.discrete.MergeElement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see com.misc.common.moplaf.time.discrete.MergeElement#getPrevious()
	 * @see #getMergeElement()
	 * @generated
	 */
	EReference getMergeElement_Previous();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.discrete.MergeElement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see com.misc.common.moplaf.time.discrete.MergeElement#getNext()
	 * @see #getMergeElement()
	 * @generated
	 */
	EReference getMergeElement_Next();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.MergeElement#getPartFromInTo <em>Part From In To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part From In To</em>'.
	 * @see com.misc.common.moplaf.time.discrete.MergeElement#getPartFromInTo()
	 * @see #getMergeElement()
	 * @generated
	 */
	EAttribute getMergeElement_PartFromInTo();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.MergeElement#getPartToInFrom <em>Part To In From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part To In From</em>'.
	 * @see com.misc.common.moplaf.time.discrete.MergeElement#getPartToInFrom()
	 * @see #getMergeElement()
	 * @generated
	 */
	EAttribute getMergeElement_PartToInFrom();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.MergeElement#getElementStart <em>Element Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Start</em>'.
	 * @see com.misc.common.moplaf.time.discrete.MergeElement#getElementStart()
	 * @see #getMergeElement()
	 * @generated
	 */
	EAttribute getMergeElement_ElementStart();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.MergeElement#getElementEnd <em>Element End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element End</em>'.
	 * @see com.misc.common.moplaf.time.discrete.MergeElement#getElementEnd()
	 * @see #getMergeElement()
	 * @generated
	 */
	EAttribute getMergeElement_ElementEnd();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.time.discrete.MergeElement#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see com.misc.common.moplaf.time.discrete.MergeElement#getSeconds()
	 * @see #getMergeElement()
	 * @generated
	 */
	EAttribute getMergeElement_Seconds();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.time.discrete.BucketType <em>Bucket Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bucket Type</em>'.
	 * @see com.misc.common.moplaf.time.discrete.BucketType
	 * @generated
	 */
	EEnum getBucketType();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.time.discrete.BucketIterator <em>Bucket Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bucket Iterator</em>'.
	 * @see com.misc.common.moplaf.time.discrete.BucketIterator
	 * @model instanceClass="com.misc.common.moplaf.time.discrete.BucketIterator"
	 * @generated
	 */
	EDataType getBucketIterator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiscreteFactory getDiscreteFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.discrete.impl.TimeLineImpl <em>Time Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.discrete.impl.TimeLineImpl
		 * @see com.misc.common.moplaf.time.discrete.impl.DiscretePackageImpl#getTimeLine()
		 * @generated
		 */
		EClass TIME_LINE = eINSTANCE.getTimeLine();

		/**
		 * The meta object literal for the '<em><b>Bucket Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE__BUCKET_TYPE = eINSTANCE.getTimeLine_BucketType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE__DESCRIPTION = eINSTANCE.getTimeLine_Description();

		/**
		 * The meta object literal for the '<em><b>Time Zone ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE__TIME_ZONE_ID = eINSTANCE.getTimeLine_TimeZoneID();

		/**
		 * The meta object literal for the '<em><b>Locale Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE__LOCALE_LANGUAGE = eINSTANCE.getTimeLine_LocaleLanguage();

		/**
		 * The meta object literal for the '<em><b>Locale Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE__LOCALE_COUNTRY = eINSTANCE.getTimeLine_LocaleCountry();

		/**
		 * The meta object literal for the '<em><b>Horizon Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE__HORIZON_START = eINSTANCE.getTimeLine_HorizonStart();

		/**
		 * The meta object literal for the '<em><b>Horizon End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE__HORIZON_END = eINSTANCE.getTimeLine_HorizonEnd();

		/**
		 * The meta object literal for the '<em><b>Bucket</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE__BUCKET = eINSTANCE.getTimeLine_Bucket();

		/**
		 * The meta object literal for the '<em><b>First Bucket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE__FIRST_BUCKET = eINSTANCE.getTimeLine_FirstBucket();

		/**
		 * The meta object literal for the '<em><b>Last Bucket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE__LAST_BUCKET = eINSTANCE.getTimeLine_LastBucket();

		/**
		 * The meta object literal for the '<em><b>Refresh Horizon</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_LINE___REFRESH_HORIZON = eINSTANCE.getTimeLine__RefreshHorizon();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_LINE___ITERATOR__DATE_DATE_BOOLEAN = eINSTANCE.getTimeLine__Iterator__Date_Date_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Bucket</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_LINE___GET_BUCKET__DATE = eINSTANCE.getTimeLine__GetBucket__Date();

		/**
		 * The meta object literal for the '<em><b>Get Seconds Intersection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_LINE___GET_SECONDS_INTERSECTION__DATE_DATE_DATE_DATE = eINSTANCE.getTimeLine__GetSecondsIntersection__Date_Date_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Create Bucket</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_LINE___CREATE_BUCKET = eINSTANCE.getTimeLine__CreateBucket();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.discrete.impl.TimeBucketImpl <em>Time Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.discrete.impl.TimeBucketImpl
		 * @see com.misc.common.moplaf.time.discrete.impl.DiscretePackageImpl#getTimeBucket()
		 * @generated
		 */
		EClass TIME_BUCKET = eINSTANCE.getTimeBucket();

		/**
		 * The meta object literal for the '<em><b>Bucket Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BUCKET__BUCKET_START = eINSTANCE.getTimeBucket_BucketStart();

		/**
		 * The meta object literal for the '<em><b>Bucket End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BUCKET__BUCKET_END = eINSTANCE.getTimeBucket_BucketEnd();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BUCKET__NEXT = eINSTANCE.getTimeBucket_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BUCKET__PREVIOUS = eINSTANCE.getTimeBucket_Previous();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BUCKET__DESCRIPTION = eINSTANCE.getTimeBucket_Description();

		/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BUCKET__SECONDS = eINSTANCE.getTimeBucket_Seconds();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_BUCKET___CONTAINS__DATE = eINSTANCE.getTimeBucket__Contains__Date();

		/**
		 * The meta object literal for the '<em><b>Is Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_BUCKET___IS_BEFORE__TIMEBUCKET = eINSTANCE.getTimeBucket__IsBefore__TimeBucket();

		/**
		 * The meta object literal for the '<em><b>Get Seconds Intersection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_BUCKET___GET_SECONDS_INTERSECTION__DATE_DATE = eINSTANCE.getTimeBucket__GetSecondsIntersection__Date_Date();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.discrete.impl.TimeLineMergeImpl <em>Time Line Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.discrete.impl.TimeLineMergeImpl
		 * @see com.misc.common.moplaf.time.discrete.impl.DiscretePackageImpl#getTimeLineMerge()
		 * @generated
		 */
		EClass TIME_LINE_MERGE = eINSTANCE.getTimeLineMerge();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_MERGE__ELEMENT = eINSTANCE.getTimeLineMerge_Element();

		/**
		 * The meta object literal for the '<em><b>Time Line To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_MERGE__TIME_LINE_TO = eINSTANCE.getTimeLineMerge_TimeLineTo();

		/**
		 * The meta object literal for the '<em><b>First Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_MERGE__FIRST_ELEMENT = eINSTANCE.getTimeLineMerge_FirstElement();

		/**
		 * The meta object literal for the '<em><b>Last Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_MERGE__LAST_ELEMENT = eINSTANCE.getTimeLineMerge_LastElement();

		/**
		 * The meta object literal for the '<em><b>Time Line From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_MERGE__TIME_LINE_FROM = eINSTANCE.getTimeLineMerge_TimeLineFrom();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_LINE_MERGE___REFRESH = eINSTANCE.getTimeLineMerge__Refresh();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.discrete.impl.MergeElementImpl <em>Merge Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.discrete.impl.MergeElementImpl
		 * @see com.misc.common.moplaf.time.discrete.impl.DiscretePackageImpl#getMergeElement()
		 * @generated
		 */
		EClass MERGE_ELEMENT = eINSTANCE.getMergeElement();

		/**
		 * The meta object literal for the '<em><b>Bucket From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_ELEMENT__BUCKET_FROM = eINSTANCE.getMergeElement_BucketFrom();

		/**
		 * The meta object literal for the '<em><b>Bucket To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_ELEMENT__BUCKET_TO = eINSTANCE.getMergeElement_BucketTo();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_ELEMENT__PREVIOUS = eINSTANCE.getMergeElement_Previous();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_ELEMENT__NEXT = eINSTANCE.getMergeElement_Next();

		/**
		 * The meta object literal for the '<em><b>Part From In To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_ELEMENT__PART_FROM_IN_TO = eINSTANCE.getMergeElement_PartFromInTo();

		/**
		 * The meta object literal for the '<em><b>Part To In From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_ELEMENT__PART_TO_IN_FROM = eINSTANCE.getMergeElement_PartToInFrom();

		/**
		 * The meta object literal for the '<em><b>Element Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_ELEMENT__ELEMENT_START = eINSTANCE.getMergeElement_ElementStart();

		/**
		 * The meta object literal for the '<em><b>Element End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_ELEMENT__ELEMENT_END = eINSTANCE.getMergeElement_ElementEnd();

		/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_ELEMENT__SECONDS = eINSTANCE.getMergeElement_Seconds();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.discrete.BucketType <em>Bucket Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.discrete.BucketType
		 * @see com.misc.common.moplaf.time.discrete.impl.DiscretePackageImpl#getBucketType()
		 * @generated
		 */
		EEnum BUCKET_TYPE = eINSTANCE.getBucketType();

		/**
		 * The meta object literal for the '<em>Bucket Iterator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.discrete.BucketIterator
		 * @see com.misc.common.moplaf.time.discrete.impl.DiscretePackageImpl#getBucketIterator()
		 * @generated
		 */
		EDataType BUCKET_ITERATOR = eINSTANCE.getBucketIterator();

	}

} //DiscretePackage
