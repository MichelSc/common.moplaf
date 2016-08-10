/**
 */
package com.misc.common.moplaf.time.discrete.impl;

import com.misc.common.moplaf.time.discrete.DiscretePackage;
import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;
import com.misc.common.moplaf.time.discrete.ObjectWithTimeLine;
import com.misc.common.moplaf.time.discrete.TimeBucket;
import com.misc.common.moplaf.time.discrete.TimeLine;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object With Time Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl#getTimeline <em>Timeline</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl#getBuckets <em>Buckets</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl#getLastBucket <em>Last Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl#getFirstBucket <em>First Bucket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectWithTimeLineImpl extends MinimalEObjectImpl.Container implements ObjectWithTimeLine {
	/**
	 * The cached value of the '{@link #getTimeline() <em>Timeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeline()
	 * @generated
	 * @ordered
	 */
	protected TimeLine timeline;

	/**
	 * The cached value of the '{@link #getBuckets() <em>Buckets</em>}' containment reference list.
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
		return DiscretePackage.Literals.OBJECT_WITH_TIME_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLine getTimeline() {
		if (timeline != null && timeline.eIsProxy()) {
			InternalEObject oldTimeline = (InternalEObject)timeline;
			timeline = (TimeLine)eResolveProxy(oldTimeline);
			if (timeline != oldTimeline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscretePackage.OBJECT_WITH_TIME_LINE__TIMELINE, oldTimeline, timeline));
			}
		}
		return timeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLine basicGetTimeline() {
		return timeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeline(TimeLine newTimeline) {
		TimeLine oldTimeline = timeline;
		timeline = newTimeline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.OBJECT_WITH_TIME_LINE__TIMELINE, oldTimeline, timeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTimeBucket> getBuckets() {
		if (buckets == null) {
			buckets = new EObjectContainmentEList<ObjectTimeBucket>(ObjectTimeBucket.class, this, DiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET, oldLastBucket, lastBucket));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET, oldLastBucket, lastBucket));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET, oldFirstBucket, firstBucket));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET, oldFirstBucket, firstBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(TimeBucket start, TimeBucket secondBucket) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket getBucket(TimeBucket bucket) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS:
				return ((InternalEList<?>)getBuckets()).basicRemove(otherEnd, msgs);
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE__TIMELINE:
				if (resolve) return getTimeline();
				return basicGetTimeline();
			case DiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS:
				return getBuckets();
			case DiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				if (resolve) return getLastBucket();
				return basicGetLastBucket();
			case DiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				if (resolve) return getFirstBucket();
				return basicGetFirstBucket();
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE__TIMELINE:
				setTimeline((TimeLine)newValue);
				return;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS:
				getBuckets().clear();
				getBuckets().addAll((Collection<? extends ObjectTimeBucket>)newValue);
				return;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				setLastBucket((ObjectTimeBucket)newValue);
				return;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				setFirstBucket((ObjectTimeBucket)newValue);
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE__TIMELINE:
				setTimeline((TimeLine)null);
				return;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS:
				getBuckets().clear();
				return;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				setLastBucket((ObjectTimeBucket)null);
				return;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				setFirstBucket((ObjectTimeBucket)null);
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE__TIMELINE:
				return timeline != null;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS:
				return buckets != null && !buckets.isEmpty();
			case DiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				return lastBucket != null;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				return firstBucket != null;
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE___INIT__TIMEBUCKET_TIMEBUCKET:
				init((TimeBucket)arguments.get(0), (TimeBucket)arguments.get(1));
				return null;
			case DiscretePackage.OBJECT_WITH_TIME_LINE___GET_BUCKET__TIMEBUCKET:
				return getBucket((TimeBucket)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ObjectWithTimeLineImpl
