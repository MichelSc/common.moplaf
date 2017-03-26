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
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.solver.LPTimeBucket;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;
import com.misc.common.moplaf.time.discrete.TimeBucket;
import com.misc.common.moplaf.time.discrete.TimeDiscretePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Time Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTimeBucketImpl#getBucket <em>Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTimeBucketImpl#getNext <em>Next</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTimeBucketImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTimeBucketImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPTimeBucketImpl extends LPTupleImpl implements LPTimeBucket {
	/**
	 * The cached value of the '{@link #getBucket() <em>Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucket()
	 * @generated
	 * @ordered
	 */
	protected TimeBucket bucket;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected ObjectTimeBucket next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected ObjectTimeBucket previous;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPTimeBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_TIME_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket getBucket() {
		if (bucket != null && bucket.eIsProxy()) {
			InternalEObject oldBucket = (InternalEObject)bucket;
			bucket = (TimeBucket)eResolveProxy(oldBucket);
			if (bucket != oldBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_TIME_BUCKET__BUCKET, oldBucket, bucket));
			}
		}
		return bucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket basicGetBucket() {
		return bucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucket(TimeBucket newBucket) {
		TimeBucket oldBucket = bucket;
		bucket = newBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_TIME_BUCKET__BUCKET, oldBucket, bucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (ObjectTimeBucket)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_TIME_BUCKET__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(ObjectTimeBucket newNext, NotificationChain msgs) {
		ObjectTimeBucket oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_TIME_BUCKET__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(ObjectTimeBucket newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, TimeDiscretePackage.OBJECT_TIME_BUCKET__PREVIOUS, ObjectTimeBucket.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, TimeDiscretePackage.OBJECT_TIME_BUCKET__PREVIOUS, ObjectTimeBucket.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_TIME_BUCKET__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (ObjectTimeBucket)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_TIME_BUCKET__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(ObjectTimeBucket newPrevious, NotificationChain msgs) {
		ObjectTimeBucket oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_TIME_BUCKET__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(ObjectTimeBucket newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, TimeDiscretePackage.OBJECT_TIME_BUCKET__NEXT, ObjectTimeBucket.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, TimeDiscretePackage.OBJECT_TIME_BUCKET__NEXT, ObjectTimeBucket.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_TIME_BUCKET__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getContent() {
		return "no content";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, TimeDiscretePackage.OBJECT_TIME_BUCKET__PREVIOUS, ObjectTimeBucket.class, msgs);
				return basicSetNext((ObjectTimeBucket)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, TimeDiscretePackage.OBJECT_TIME_BUCKET__NEXT, ObjectTimeBucket.class, msgs);
				return basicSetPrevious((ObjectTimeBucket)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__NEXT:
				return basicSetNext(null, msgs);
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__PREVIOUS:
				return basicSetPrevious(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__BUCKET:
				if (resolve) return getBucket();
				return basicGetBucket();
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__CONTENT:
				return getContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__BUCKET:
				setBucket((TimeBucket)newValue);
				return;
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__NEXT:
				setNext((ObjectTimeBucket)newValue);
				return;
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__PREVIOUS:
				setPrevious((ObjectTimeBucket)newValue);
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
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__BUCKET:
				setBucket((TimeBucket)null);
				return;
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__NEXT:
				setNext((ObjectTimeBucket)null);
				return;
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__PREVIOUS:
				setPrevious((ObjectTimeBucket)null);
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
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__BUCKET:
				return bucket != null;
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__NEXT:
				return next != null;
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__PREVIOUS:
				return previous != null;
			case MacroPlannerSolverPackage.LP_TIME_BUCKET__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ObjectTimeBucket.class) {
			switch (derivedFeatureID) {
				case MacroPlannerSolverPackage.LP_TIME_BUCKET__BUCKET: return TimeDiscretePackage.OBJECT_TIME_BUCKET__BUCKET;
				case MacroPlannerSolverPackage.LP_TIME_BUCKET__NEXT: return TimeDiscretePackage.OBJECT_TIME_BUCKET__NEXT;
				case MacroPlannerSolverPackage.LP_TIME_BUCKET__PREVIOUS: return TimeDiscretePackage.OBJECT_TIME_BUCKET__PREVIOUS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ObjectTimeBucket.class) {
			switch (baseFeatureID) {
				case TimeDiscretePackage.OBJECT_TIME_BUCKET__BUCKET: return MacroPlannerSolverPackage.LP_TIME_BUCKET__BUCKET;
				case TimeDiscretePackage.OBJECT_TIME_BUCKET__NEXT: return MacroPlannerSolverPackage.LP_TIME_BUCKET__NEXT;
				case TimeDiscretePackage.OBJECT_TIME_BUCKET__PREVIOUS: return MacroPlannerSolverPackage.LP_TIME_BUCKET__PREVIOUS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ObjectTimeBucket.class) {
			switch (baseOperationID) {
				case TimeDiscretePackage.OBJECT_TIME_BUCKET___DISPOSE: return MacroPlannerSolverPackage.LP_TIME_BUCKET___DISPOSE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MacroPlannerSolverPackage.LP_TIME_BUCKET___DISPOSE:
				dispose();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getBucketShortName() {
		TimeBucket bucket = this.getBucket();
		String name = String.format("bu%04d", bucket.getBucketNr());
		return name;
	}

} //LPTimeBucketImpl
