/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
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
public class TimeDiscreteFactoryImpl extends EFactoryImpl implements TimeDiscreteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeDiscreteFactory init() {
		try {
			TimeDiscreteFactory theTimeDiscreteFactory = (TimeDiscreteFactory)EPackage.Registry.INSTANCE.getEFactory(TimeDiscretePackage.eNS_URI);
			if (theTimeDiscreteFactory != null) {
				return theTimeDiscreteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimeDiscreteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDiscreteFactoryImpl() {
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
			case TimeDiscretePackage.TIME_BUCKET: return createTimeBucket();
			case TimeDiscretePackage.TIME_LINE: return createTimeLine();
			case TimeDiscretePackage.TIME_LINE_MERGE: return createTimeLineMerge();
			case TimeDiscretePackage.MERGE_ELEMENT: return createMergeElement();
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE: return createObjectWithTimeLine();
			case TimeDiscretePackage.OBJECT_TIME_BUCKET: return createObjectTimeBucket();
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
			case TimeDiscretePackage.BUCKET_TYPE:
				return createBucketTypeFromString(eDataType, initialValue);
			case TimeDiscretePackage.BUCKET_ITERATOR:
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
			case TimeDiscretePackage.BUCKET_TYPE:
				return convertBucketTypeToString(eDataType, instanceValue);
			case TimeDiscretePackage.BUCKET_ITERATOR:
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
	public TimeDiscretePackage getTimeDiscretePackage() {
		return (TimeDiscretePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimeDiscretePackage getPackage() {
		return TimeDiscretePackage.eINSTANCE;
	}

} //DiscreteFactoryImpl
