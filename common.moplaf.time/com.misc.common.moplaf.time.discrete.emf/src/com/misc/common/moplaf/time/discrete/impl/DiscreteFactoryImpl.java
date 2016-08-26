/**
 */
package com.misc.common.moplaf.time.discrete.impl;

import com.misc.common.moplaf.time.discrete.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscreteFactoryImpl extends EFactoryImpl implements DiscreteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiscreteFactory init() {
		try {
			DiscreteFactory theDiscreteFactory = (DiscreteFactory)EPackage.Registry.INSTANCE.getEFactory(DiscretePackage.eNS_URI);
			if (theDiscreteFactory != null) {
				return theDiscreteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiscreteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DiscretePackage.TIME_BUCKET: return createTimeBucket();
			case DiscretePackage.TIME_LINE: return createTimeLine();
			case DiscretePackage.TIME_LINE_MERGE: return createTimeLineMerge();
			case DiscretePackage.MERGE_ELEMENT: return createMergeElement();
			case DiscretePackage.OBJECT_WITH_TIME_LINE: return createObjectWithTimeLine();
			case DiscretePackage.OBJECT_TIME_BUCKET: return createObjectTimeBucket();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DiscretePackage.BUCKET_TYPE:
				return createBucketTypeFromString(eDataType, initialValue);
			case DiscretePackage.BUCKET_ITERATOR:
				return createBucketIteratorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DiscretePackage.BUCKET_TYPE:
				return convertBucketTypeToString(eDataType, instanceValue);
			case DiscretePackage.BUCKET_ITERATOR:
				return convertBucketIteratorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLine createTimeLine() {
		TimeLineImpl timeLine = new TimeLineImpl();
		return timeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket createTimeBucket() {
		TimeBucketImpl timeBucket = new TimeBucketImpl();
		return timeBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineMerge createTimeLineMerge() {
		TimeLineMergeImpl timeLineMerge = new TimeLineMergeImpl();
		return timeLineMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeElement createMergeElement() {
		MergeElementImpl mergeElement = new MergeElementImpl();
		return mergeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectWithTimeLine createObjectWithTimeLine() {
		ObjectWithTimeLineImpl objectWithTimeLine = new ObjectWithTimeLineImpl();
		return objectWithTimeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket createObjectTimeBucket() {
		ObjectTimeBucketImpl objectTimeBucket = new ObjectTimeBucketImpl();
		return objectTimeBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BucketType createBucketTypeFromString(EDataType eDataType, String initialValue) {
		BucketType result = BucketType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBucketTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BucketIterator createBucketIteratorFromString(EDataType eDataType, String initialValue) {
		return (BucketIterator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBucketIteratorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscretePackage getDiscretePackage() {
		return (DiscretePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiscretePackage getPackage() {
		return DiscretePackage.eINSTANCE;
	}

} //DiscreteFactoryImpl
