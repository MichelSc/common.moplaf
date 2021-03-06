/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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

import com.misc.common.moplaf.time.discrete.TimeDiscreteFactory;
import com.misc.common.moplaf.time.discrete.TimeDiscretePackage;
import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;
import com.misc.common.moplaf.time.discrete.ObjectWithTimeLine;
import com.misc.common.moplaf.time.discrete.TimeBucket;
import com.misc.common.moplaf.time.discrete.TimeLine;
import com.misc.common.moplaf.time.discrete.util.Util;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object With Time Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl#getBuckets <em>Buckets</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl#getLastBucket <em>Last Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl#getFirstBucket <em>First Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl#getStartBucket <em>Start Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl#getEndBucket <em>End Bucket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectWithTimeLineImpl extends MinimalEObjectImpl.Container implements ObjectWithTimeLine {
	/**
	 * The cached value of the '{@link #getBuckets() <em>Buckets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectTimeBucket> buckets;

	/**
	 * The cached value of the '{@link #getLastBucket() <em>Last Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastBucket()
	 * @generated
	 * @ordered
	 */
	protected ObjectTimeBucket lastBucket;

	/**
	 * The cached value of the '{@link #getFirstBucket() <em>First Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstBucket()
	 * @generated
	 * @ordered
	 */
	protected ObjectTimeBucket firstBucket;

	/**
	 * The cached value of the '{@link #getStartBucket() <em>Start Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartBucket()
	 * @generated
	 * @ordered
	 */
	protected TimeBucket startBucket;

	/**
	 * The cached value of the '{@link #getEndBucket() <em>End Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndBucket()
	 * @generated
	 * @ordered
	 */
	protected TimeBucket endBucket;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectWithTimeLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeDiscretePackage.Literals.OBJECT_WITH_TIME_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TimeLine basicGetTimeLine() {
		if ( this.getStartBucket()!=null){
			return this.getStartBucket().getTimeLine();
		} else if ( this.basicGetEndBucket()!= null){
			return this.getEndBucket().getTimeLine();
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTimeBucket> getBuckets() {
		if (buckets == null) {
			buckets = new EObjectResolvingEList<ObjectTimeBucket>(ObjectTimeBucket.class, this, TimeDiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS);
		}
		return buckets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket getLastBucket() {
		if (lastBucket != null && lastBucket.eIsProxy()) {
			InternalEObject oldLastBucket = (InternalEObject)lastBucket;
			lastBucket = (ObjectTimeBucket)eResolveProxy(oldLastBucket);
			if (lastBucket != oldLastBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeDiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET, oldLastBucket, lastBucket));
			}
		}
		return lastBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket basicGetLastBucket() {
		return lastBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastBucket(ObjectTimeBucket newLastBucket) {
		ObjectTimeBucket oldLastBucket = lastBucket;
		lastBucket = newLastBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET, oldLastBucket, lastBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket getFirstBucket() {
		if (firstBucket != null && firstBucket.eIsProxy()) {
			InternalEObject oldFirstBucket = (InternalEObject)firstBucket;
			firstBucket = (ObjectTimeBucket)eResolveProxy(oldFirstBucket);
			if (firstBucket != oldFirstBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeDiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET, oldFirstBucket, firstBucket));
			}
		}
		return firstBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket basicGetFirstBucket() {
		return firstBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstBucket(ObjectTimeBucket newFirstBucket) {
		ObjectTimeBucket oldFirstBucket = firstBucket;
		firstBucket = newFirstBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET, oldFirstBucket, firstBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket getStartBucket() {
		if (startBucket != null && startBucket.eIsProxy()) {
			InternalEObject oldStartBucket = (InternalEObject)startBucket;
			startBucket = (TimeBucket)eResolveProxy(oldStartBucket);
			if (startBucket != oldStartBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeDiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET, oldStartBucket, startBucket));
			}
		}
		return startBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket basicGetStartBucket() {
		return startBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartBucket(TimeBucket newStartBucket) {
		TimeBucket oldStartBucket = startBucket;
		startBucket = newStartBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET, oldStartBucket, startBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket getEndBucket() {
		if (endBucket != null && endBucket.eIsProxy()) {
			InternalEObject oldEndBucket = (InternalEObject)endBucket;
			endBucket = (TimeBucket)eResolveProxy(oldEndBucket);
			if (endBucket != oldEndBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeDiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET, oldEndBucket, endBucket));
			}
		}
		return endBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket basicGetEndBucket() {
		return endBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndBucket(TimeBucket newEndBucket) {
		TimeBucket oldEndBucket = endBucket;
		endBucket = newEndBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET, oldEndBucket, endBucket));
	}
	
	
	ObjectTimeBucket currentObjectBucket = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ObjectTimeBucket getBucket(TimeBucket bucket) {
		this.currentObjectBucket =  Util.getBucket(this, bucket, this.currentObjectBucket);
				
		return currentObjectBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * To be implemented by the concrete class.
	 * Must create and own the bucket.
	 * <!-- end-user-doc -->
	 */
	public ObjectTimeBucket constructObjectTimeBucket() {
		ObjectTimeBucket newObjectBucket = TimeDiscreteFactory.eINSTANCE.createObjectTimeBucket();
		return newObjectBucket;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		Util.refresh(this);
		this.currentObjectBucket = this.getFirstBucket();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS:
				return getBuckets();
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				if (resolve) return getLastBucket();
				return basicGetLastBucket();
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				if (resolve) return getFirstBucket();
				return basicGetFirstBucket();
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET:
				if (resolve) return getStartBucket();
				return basicGetStartBucket();
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET:
				if (resolve) return getEndBucket();
				return basicGetEndBucket();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS:
				getBuckets().clear();
				getBuckets().addAll((Collection<? extends ObjectTimeBucket>)newValue);
				return;
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				setLastBucket((ObjectTimeBucket)newValue);
				return;
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				setFirstBucket((ObjectTimeBucket)newValue);
				return;
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET:
				setStartBucket((TimeBucket)newValue);
				return;
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET:
				setEndBucket((TimeBucket)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS:
				getBuckets().clear();
				return;
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				setLastBucket((ObjectTimeBucket)null);
				return;
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				setFirstBucket((ObjectTimeBucket)null);
				return;
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET:
				setStartBucket((TimeBucket)null);
				return;
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET:
				setEndBucket((TimeBucket)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS:
				return buckets != null && !buckets.isEmpty();
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				return lastBucket != null;
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				return firstBucket != null;
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET:
				return startBucket != null;
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET:
				return endBucket != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE___GET_BUCKET__TIMEBUCKET:
				return getBucket((TimeBucket)arguments.get(0));
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET:
				return constructObjectTimeBucket();
			case TimeDiscretePackage.OBJECT_WITH_TIME_LINE___REFRESH:
				refresh();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ObjectWithTimeLineImpl
