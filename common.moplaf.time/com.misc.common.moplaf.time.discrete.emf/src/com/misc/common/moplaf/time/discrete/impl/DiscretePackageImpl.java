/**
 */
package com.misc.common.moplaf.time.discrete.impl;

import com.misc.common.moplaf.time.discrete.BucketType;
import com.misc.common.moplaf.time.discrete.DiscreteFactory;
import com.misc.common.moplaf.time.discrete.DiscretePackage;
import com.misc.common.moplaf.time.discrete.MergeElement;
import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;
import com.misc.common.moplaf.time.discrete.ObjectWithTimeLine;
import com.misc.common.moplaf.time.discrete.TimeBucket;
import com.misc.common.moplaf.time.discrete.TimeLine;
import com.misc.common.moplaf.time.discrete.TimeLineMerge;
import com.misc.common.moplaf.time.discrete.BucketIterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscretePackageImpl extends EPackageImpl implements DiscretePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeLineMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectWithTimeLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTimeBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bucketTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bucketIteratorEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.common.moplaf.time.discrete.DiscretePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiscretePackageImpl() {
		super(eNS_URI, DiscreteFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DiscretePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiscretePackage init() {
		if (isInited) return (DiscretePackage)EPackage.Registry.INSTANCE.getEPackage(DiscretePackage.eNS_URI);

		// Obtain or create and register package
		DiscretePackageImpl theDiscretePackage = (DiscretePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiscretePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiscretePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDiscretePackage.createPackageContents();

		// Initialize created meta-data
		theDiscretePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiscretePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiscretePackage.eNS_URI, theDiscretePackage);
		return theDiscretePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeLine() {
		return timeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_BucketType() {
		return (EAttribute)timeLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_BucketTypeRefreshed() {
		return (EAttribute)timeLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_Description() {
		return (EAttribute)timeLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_TimeZoneID() {
		return (EAttribute)timeLineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_LocaleLanguage() {
		return (EAttribute)timeLineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_LocaleCountry() {
		return (EAttribute)timeLineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_HorizonStart() {
		return (EAttribute)timeLineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_HorizonEnd() {
		return (EAttribute)timeLineEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLine_Buckets() {
		return (EReference)timeLineEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLine_FirstBucket() {
		return (EReference)timeLineEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLine_LastBucket() {
		return (EReference)timeLineEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeLine__RefreshHorizon() {
		return timeLineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeLine__Iterator__Date_Date_boolean() {
		return timeLineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeLine__GetBucketFloor__Date() {
		return timeLineEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeLine__GetBucketCeil__Date() {
		return timeLineEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeLine__CreateBucket() {
		return timeLineEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeBucket() {
		return timeBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBucket_BucketStart() {
		return (EAttribute)timeBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBucket_BucketEnd() {
		return (EAttribute)timeBucketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBucket_Next() {
		return (EReference)timeBucketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBucket_Previous() {
		return (EReference)timeBucketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBucket_Description() {
		return (EAttribute)timeBucketEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBucket_Seconds() {
		return (EAttribute)timeBucketEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBucket_TimeLine() {
		return (EReference)timeBucketEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBucket_BucketNr() {
		return (EAttribute)timeBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeBucket__Contains__Date() {
		return timeBucketEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeBucket__IsBefore__TimeBucket() {
		return timeBucketEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeBucket__IsBeforeStrictly__TimeBucket() {
		return timeBucketEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeBucket__IsAfter__TimeBucket() {
		return timeBucketEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeBucket__IsAfterStrictly__TimeBucket() {
		return timeBucketEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeBucket__GetSecondsIntersection__Date_Date() {
		return timeBucketEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeLineMerge() {
		return timeLineMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLineMerge_Elements() {
		return (EReference)timeLineMergeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLineMerge_TimeLineTo() {
		return (EReference)timeLineMergeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLineMerge_FirstElement() {
		return (EReference)timeLineMergeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLineMerge_LastElement() {
		return (EReference)timeLineMergeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLineMerge_TimeLineFrom() {
		return (EReference)timeLineMergeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeLineMerge__Refresh() {
		return timeLineMergeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeElement() {
		return mergeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergeElement_BucketFrom() {
		return (EReference)mergeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergeElement_BucketTo() {
		return (EReference)mergeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergeElement_Previous() {
		return (EReference)mergeElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergeElement_Next() {
		return (EReference)mergeElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergeElement_PartFromInTo() {
		return (EAttribute)mergeElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergeElement_PartToInFrom() {
		return (EAttribute)mergeElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergeElement_ElementStart() {
		return (EAttribute)mergeElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergeElement_ElementEnd() {
		return (EAttribute)mergeElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergeElement_Seconds() {
		return (EAttribute)mergeElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectWithTimeLine() {
		return objectWithTimeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectWithTimeLine_Buckets() {
		return (EReference)objectWithTimeLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectWithTimeLine_LastBucket() {
		return (EReference)objectWithTimeLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectWithTimeLine_FirstBucket() {
		return (EReference)objectWithTimeLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectWithTimeLine_StartBucket() {
		return (EReference)objectWithTimeLineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectWithTimeLine_EndBucket() {
		return (EReference)objectWithTimeLineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectWithTimeLine__GetBucket__TimeBucket() {
		return objectWithTimeLineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectWithTimeLine__ConstructObjectTimeBucket() {
		return objectWithTimeLineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectWithTimeLine__Refresh() {
		return objectWithTimeLineEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTimeBucket() {
		return objectTimeBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTimeBucket_Bucket() {
		return (EReference)objectTimeBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTimeBucket_Next() {
		return (EReference)objectTimeBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTimeBucket_Previous() {
		return (EReference)objectTimeBucketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectTimeBucket__Dispose() {
		return objectTimeBucketEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBucketType() {
		return bucketTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBucketIterator() {
		return bucketIteratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteFactory getDiscreteFactory() {
		return (DiscreteFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		timeBucketEClass = createEClass(TIME_BUCKET);
		createEAttribute(timeBucketEClass, TIME_BUCKET__BUCKET_NR);
		createEAttribute(timeBucketEClass, TIME_BUCKET__BUCKET_START);
		createEAttribute(timeBucketEClass, TIME_BUCKET__BUCKET_END);
		createEReference(timeBucketEClass, TIME_BUCKET__NEXT);
		createEReference(timeBucketEClass, TIME_BUCKET__PREVIOUS);
		createEAttribute(timeBucketEClass, TIME_BUCKET__DESCRIPTION);
		createEAttribute(timeBucketEClass, TIME_BUCKET__SECONDS);
		createEReference(timeBucketEClass, TIME_BUCKET__TIME_LINE);
		createEOperation(timeBucketEClass, TIME_BUCKET___CONTAINS__DATE);
		createEOperation(timeBucketEClass, TIME_BUCKET___IS_BEFORE__TIMEBUCKET);
		createEOperation(timeBucketEClass, TIME_BUCKET___IS_BEFORE_STRICTLY__TIMEBUCKET);
		createEOperation(timeBucketEClass, TIME_BUCKET___IS_AFTER__TIMEBUCKET);
		createEOperation(timeBucketEClass, TIME_BUCKET___IS_AFTER_STRICTLY__TIMEBUCKET);
		createEOperation(timeBucketEClass, TIME_BUCKET___GET_SECONDS_INTERSECTION__DATE_DATE);

		timeLineEClass = createEClass(TIME_LINE);
		createEAttribute(timeLineEClass, TIME_LINE__BUCKET_TYPE);
		createEAttribute(timeLineEClass, TIME_LINE__BUCKET_TYPE_REFRESHED);
		createEAttribute(timeLineEClass, TIME_LINE__DESCRIPTION);
		createEAttribute(timeLineEClass, TIME_LINE__TIME_ZONE_ID);
		createEAttribute(timeLineEClass, TIME_LINE__LOCALE_LANGUAGE);
		createEAttribute(timeLineEClass, TIME_LINE__LOCALE_COUNTRY);
		createEAttribute(timeLineEClass, TIME_LINE__HORIZON_START);
		createEAttribute(timeLineEClass, TIME_LINE__HORIZON_END);
		createEReference(timeLineEClass, TIME_LINE__BUCKETS);
		createEReference(timeLineEClass, TIME_LINE__FIRST_BUCKET);
		createEReference(timeLineEClass, TIME_LINE__LAST_BUCKET);
		createEOperation(timeLineEClass, TIME_LINE___REFRESH_HORIZON);
		createEOperation(timeLineEClass, TIME_LINE___ITERATOR__DATE_DATE_BOOLEAN);
		createEOperation(timeLineEClass, TIME_LINE___GET_BUCKET_FLOOR__DATE);
		createEOperation(timeLineEClass, TIME_LINE___GET_BUCKET_CEIL__DATE);
		createEOperation(timeLineEClass, TIME_LINE___CREATE_BUCKET);

		timeLineMergeEClass = createEClass(TIME_LINE_MERGE);
		createEReference(timeLineMergeEClass, TIME_LINE_MERGE__ELEMENTS);
		createEReference(timeLineMergeEClass, TIME_LINE_MERGE__TIME_LINE_TO);
		createEReference(timeLineMergeEClass, TIME_LINE_MERGE__FIRST_ELEMENT);
		createEReference(timeLineMergeEClass, TIME_LINE_MERGE__LAST_ELEMENT);
		createEReference(timeLineMergeEClass, TIME_LINE_MERGE__TIME_LINE_FROM);
		createEOperation(timeLineMergeEClass, TIME_LINE_MERGE___REFRESH);

		mergeElementEClass = createEClass(MERGE_ELEMENT);
		createEReference(mergeElementEClass, MERGE_ELEMENT__BUCKET_FROM);
		createEReference(mergeElementEClass, MERGE_ELEMENT__BUCKET_TO);
		createEReference(mergeElementEClass, MERGE_ELEMENT__PREVIOUS);
		createEReference(mergeElementEClass, MERGE_ELEMENT__NEXT);
		createEAttribute(mergeElementEClass, MERGE_ELEMENT__PART_FROM_IN_TO);
		createEAttribute(mergeElementEClass, MERGE_ELEMENT__PART_TO_IN_FROM);
		createEAttribute(mergeElementEClass, MERGE_ELEMENT__ELEMENT_START);
		createEAttribute(mergeElementEClass, MERGE_ELEMENT__ELEMENT_END);
		createEAttribute(mergeElementEClass, MERGE_ELEMENT__SECONDS);

		objectWithTimeLineEClass = createEClass(OBJECT_WITH_TIME_LINE);
		createEReference(objectWithTimeLineEClass, OBJECT_WITH_TIME_LINE__BUCKETS);
		createEReference(objectWithTimeLineEClass, OBJECT_WITH_TIME_LINE__LAST_BUCKET);
		createEReference(objectWithTimeLineEClass, OBJECT_WITH_TIME_LINE__FIRST_BUCKET);
		createEReference(objectWithTimeLineEClass, OBJECT_WITH_TIME_LINE__START_BUCKET);
		createEReference(objectWithTimeLineEClass, OBJECT_WITH_TIME_LINE__END_BUCKET);
		createEOperation(objectWithTimeLineEClass, OBJECT_WITH_TIME_LINE___GET_BUCKET__TIMEBUCKET);
		createEOperation(objectWithTimeLineEClass, OBJECT_WITH_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET);
		createEOperation(objectWithTimeLineEClass, OBJECT_WITH_TIME_LINE___REFRESH);

		objectTimeBucketEClass = createEClass(OBJECT_TIME_BUCKET);
		createEReference(objectTimeBucketEClass, OBJECT_TIME_BUCKET__BUCKET);
		createEReference(objectTimeBucketEClass, OBJECT_TIME_BUCKET__NEXT);
		createEReference(objectTimeBucketEClass, OBJECT_TIME_BUCKET__PREVIOUS);
		createEOperation(objectTimeBucketEClass, OBJECT_TIME_BUCKET___DISPOSE);

		// Create enums
		bucketTypeEEnum = createEEnum(BUCKET_TYPE);

		// Create data types
		bucketIteratorEDataType = createEDataType(BUCKET_ITERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(timeBucketEClass, TimeBucket.class, "TimeBucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeBucket_BucketNr(), ecorePackage.getEInt(), "BucketNr", null, 0, 1, TimeBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBucket_BucketStart(), ecorePackage.getEDate(), "BucketStart", null, 0, 1, TimeBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBucket_BucketEnd(), ecorePackage.getEDate(), "BucketEnd", null, 0, 1, TimeBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeBucket_Next(), this.getTimeBucket(), this.getTimeBucket_Previous(), "Next", null, 0, 1, TimeBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeBucket_Previous(), this.getTimeBucket(), this.getTimeBucket_Next(), "Previous", null, 0, 1, TimeBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBucket_Description(), ecorePackage.getEString(), "Description", null, 0, 1, TimeBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBucket_Seconds(), ecorePackage.getEInt(), "Seconds", null, 0, 1, TimeBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeBucket_TimeLine(), this.getTimeLine(), this.getTimeLine_Buckets(), "TimeLine", null, 1, 1, TimeBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTimeBucket__Contains__Date(), ecorePackage.getEBoolean(), "contains", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "sometime", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeBucket__IsBefore__TimeBucket(), ecorePackage.getEBoolean(), "isBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeBucket(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeBucket__IsBeforeStrictly__TimeBucket(), ecorePackage.getEBoolean(), "isBeforeStrictly", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeBucket(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeBucket__IsAfter__TimeBucket(), ecorePackage.getEBoolean(), "isAfter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeBucket(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeBucket__IsAfterStrictly__TimeBucket(), ecorePackage.getEBoolean(), "isAfterStrictly", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeBucket(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeBucket__GetSecondsIntersection__Date_Date(), ecorePackage.getEInt(), "getSecondsIntersection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeLineEClass, TimeLine.class, "TimeLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeLine_BucketType(), this.getBucketType(), "BucketType", "Hour", 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeLine_BucketTypeRefreshed(), this.getBucketType(), "BucketTypeRefreshed", "Hour", 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeLine_Description(), ecorePackage.getEString(), "Description", null, 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeLine_TimeZoneID(), ecorePackage.getEString(), "TimeZoneID", "Europe/Brussels", 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeLine_LocaleLanguage(), ecorePackage.getEString(), "LocaleLanguage", "fr", 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeLine_LocaleCountry(), ecorePackage.getEString(), "LocaleCountry", "BE", 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeLine_HorizonStart(), ecorePackage.getEDate(), "HorizonStart", null, 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeLine_HorizonEnd(), ecorePackage.getEDate(), "HorizonEnd", null, 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLine_Buckets(), this.getTimeBucket(), this.getTimeBucket_TimeLine(), "Buckets", null, 0, -1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLine_FirstBucket(), this.getTimeBucket(), null, "FirstBucket", null, 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLine_LastBucket(), this.getTimeBucket(), null, "LastBucket", null, 0, 1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTimeLine__RefreshHorizon(), null, "refreshHorizon", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeLine__Iterator__Date_Date_boolean(), this.getBucketIterator(), "iterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "naked", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeLine__GetBucketFloor__Date(), this.getTimeBucket(), "getBucketFloor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "sometime", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeLine__GetBucketCeil__Date(), this.getTimeBucket(), "getBucketCeil", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "sometime", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTimeLine__CreateBucket(), this.getTimeBucket(), "createBucket", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeLineMergeEClass, TimeLineMerge.class, "TimeLineMerge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeLineMerge_Elements(), this.getMergeElement(), null, "Elements", null, 0, -1, TimeLineMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLineMerge_TimeLineTo(), this.getTimeLine(), null, "TimeLineTo", null, 0, 1, TimeLineMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLineMerge_FirstElement(), this.getMergeElement(), null, "FirstElement", null, 0, 1, TimeLineMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLineMerge_LastElement(), this.getMergeElement(), null, "LastElement", null, 0, 1, TimeLineMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLineMerge_TimeLineFrom(), this.getTimeLine(), null, "TimeLineFrom", null, 0, 1, TimeLineMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTimeLineMerge__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mergeElementEClass, MergeElement.class, "MergeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMergeElement_BucketFrom(), this.getTimeBucket(), null, "BucketFrom", null, 0, 1, MergeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeElement_BucketTo(), this.getTimeBucket(), null, "BucketTo", null, 0, 1, MergeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeElement_Previous(), this.getMergeElement(), this.getMergeElement_Next(), "Previous", null, 0, 1, MergeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeElement_Next(), this.getMergeElement(), this.getMergeElement_Previous(), "Next", null, 0, 1, MergeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeElement_PartFromInTo(), ecorePackage.getEFloat(), "PartFromInTo", null, 0, 1, MergeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeElement_PartToInFrom(), ecorePackage.getEFloat(), "PartToInFrom", null, 0, 1, MergeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeElement_ElementStart(), ecorePackage.getEDate(), "ElementStart", null, 0, 1, MergeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeElement_ElementEnd(), ecorePackage.getEDate(), "ElementEnd", null, 0, 1, MergeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeElement_Seconds(), ecorePackage.getEInt(), "Seconds", null, 0, 1, MergeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectWithTimeLineEClass, ObjectWithTimeLine.class, "ObjectWithTimeLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectWithTimeLine_Buckets(), this.getObjectTimeBucket(), null, "Buckets", null, 0, -1, ObjectWithTimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectWithTimeLine_LastBucket(), this.getObjectTimeBucket(), null, "LastBucket", null, 0, 1, ObjectWithTimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectWithTimeLine_FirstBucket(), this.getObjectTimeBucket(), null, "FirstBucket", null, 0, 1, ObjectWithTimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectWithTimeLine_StartBucket(), this.getTimeBucket(), null, "StartBucket", null, 0, 1, ObjectWithTimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectWithTimeLine_EndBucket(), this.getTimeBucket(), null, "EndBucket", null, 0, 1, ObjectWithTimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getObjectWithTimeLine__GetBucket__TimeBucket(), this.getObjectTimeBucket(), "getBucket", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeBucket(), "bucket", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getObjectWithTimeLine__ConstructObjectTimeBucket(), this.getObjectTimeBucket(), "constructObjectTimeBucket", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getObjectWithTimeLine__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectTimeBucketEClass, ObjectTimeBucket.class, "ObjectTimeBucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectTimeBucket_Bucket(), this.getTimeBucket(), null, "Bucket", null, 1, 1, ObjectTimeBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectTimeBucket_Next(), this.getObjectTimeBucket(), this.getObjectTimeBucket_Previous(), "Next", null, 0, 1, ObjectTimeBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectTimeBucket_Previous(), this.getObjectTimeBucket(), this.getObjectTimeBucket_Next(), "Previous", null, 0, 1, ObjectTimeBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getObjectTimeBucket__Dispose(), null, "dispose", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bucketTypeEEnum, BucketType.class, "BucketType");
		addEEnumLiteral(bucketTypeEEnum, BucketType.TL_MONTH);
		addEEnumLiteral(bucketTypeEEnum, BucketType.TL_WEEK);
		addEEnumLiteral(bucketTypeEEnum, BucketType.TL_DAY);
		addEEnumLiteral(bucketTypeEEnum, BucketType.TL_HALF_DAY);
		addEEnumLiteral(bucketTypeEEnum, BucketType.TL_EIGHT_HOURS);
		addEEnumLiteral(bucketTypeEEnum, BucketType.TL_SIX_HOURS);
		addEEnumLiteral(bucketTypeEEnum, BucketType.TL_FOUR_HOURS);
		addEEnumLiteral(bucketTypeEEnum, BucketType.TL_TWO_HOURS);
		addEEnumLiteral(bucketTypeEEnum, BucketType.TL_HOUR);
		addEEnumLiteral(bucketTypeEEnum, BucketType.TL_HALF_HOUR);
		addEEnumLiteral(bucketTypeEEnum, BucketType.TL_QUARTER_HOUR);

		// Initialize data types
		initEDataType(bucketIteratorEDataType, BucketIterator.class, "BucketIterator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DiscretePackageImpl
