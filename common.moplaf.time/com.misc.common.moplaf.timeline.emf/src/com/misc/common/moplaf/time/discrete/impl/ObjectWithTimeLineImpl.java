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
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl#getTimeLine <em>Time Line</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl#getBuckets <em>Buckets</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl#getLastBucket <em>Last Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl#getFirstBucket <em>First Bucket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectWithTimeLineImpl extends MinimalEObjectImpl.Container implements ObjectWithTimeLine {
	/**
	 * The cached value of the '{@link #getTimeLine() <em>Time Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLine()
	 * @generated
	 * @ordered
	 */
	protected TimeLine timeLine;

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
	public TimeLine getTimeLine() {
		if (timeLine != null && timeLine.eIsProxy()) {
			InternalEObject oldTimeLine = (InternalEObject)timeLine;
			timeLine = (TimeLine)eResolveProxy(oldTimeLine);
			if (timeLine != oldTimeLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscretePackage.OBJECT_WITH_TIME_LINE__TIME_LINE, oldTimeLine, timeLine));
			}
		}
		return timeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLine basicGetTimeLine() {
		return timeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeLine(TimeLine newTimeLine) {
		TimeLine oldTimeLine = timeLine;
		timeLine = newTimeLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.OBJECT_WITH_TIME_LINE__TIME_LINE, oldTimeLine, timeLine));
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
	 */
	public void init(TimeLine timeLine) {
		this.init(timeLine, timeLine.getFirstBucket(), timeLine.getLastBucket());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void init(TimeLine timeLine, TimeBucket start, TimeBucket end) {
		TimeBucket currentBucket = timeLine.getFirstBucket();
		ObjectTimeBucket previousBucket = null;
		while ( currentBucket != null ){
			if ( start.isBefore(currentBucket) || currentBucket.isBefore(end) ){
				ObjectTimeBucket new_object_time_bucket = this.constructObjectTimeBucket();
				new_object_time_bucket.setBucket(currentBucket);
				if ( previousBucket == null){
					this.setFirstBucket(new_object_time_bucket);
				} else {
					previousBucket.setNext(new_object_time_bucket);
				}
			}
			currentBucket = currentBucket.getNext();
		}  // traverse the time line buckets
		this.setLastBucket(previousBucket);
		
		this.currentObjectBucket = this.getFirstBucket();
	}

	private ObjectTimeBucket currentObjectBucket = null; // cache for performances 
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ObjectTimeBucket getBucket(TimeBucket bucket) {
		// try to achieve constant time perfs if the target bucket is close 
		//    to the first bucket 
		//    or to the last bucket
		//    or to the previous target bucket
		ObjectTimeBucket current = this.currentObjectBucket;
		int dist_to_curr  = bucket.getBucketNr()-current.getBucket().getBucketNr();

		// compare current and first
		int dist_to_first = bucket.getBucketNr()-this.getFirstBucket().getBucket().getBucketNr();
		if ( dist_to_first<0 ) { return null; }
		if ( dist_to_first<Math.abs(dist_to_curr)){
			current = this.getFirstBucket();
			dist_to_curr = dist_to_first;
		}

		// compare current and last
		int dist_to_last  = bucket.getBucketNr()-this.getLastBucket().getBucket().getBucketNr();
		if ( dist_to_last>0 ) { return null; }
		if ( dist_to_last>-Math.abs(dist_to_curr)){
			current = this.getLastBucket();
			dist_to_curr = dist_to_last;
		}
		
		// walk from current to the target
		while ( Math.abs(dist_to_curr)>0){
			if ( dist_to_curr>0){
				current = current.getNext();
				dist_to_curr--;
			} else {
				current = current.getPrevious();
				dist_to_curr++;
			}
		}

		this.currentObjectBucket = current;
				
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket constructObjectTimeBucket() {
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE__TIME_LINE:
				if (resolve) return getTimeLine();
				return basicGetTimeLine();
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE__TIME_LINE:
				setTimeLine((TimeLine)newValue);
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE__TIME_LINE:
				setTimeLine((TimeLine)null);
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE__TIME_LINE:
				return timeLine != null;
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE___INIT__TIMELINE:
				init((TimeLine)arguments.get(0));
				return null;
			case DiscretePackage.OBJECT_WITH_TIME_LINE___INIT__TIMELINE_TIMEBUCKET_TIMEBUCKET:
				init((TimeLine)arguments.get(0), (TimeBucket)arguments.get(1), (TimeBucket)arguments.get(2));
				return null;
			case DiscretePackage.OBJECT_WITH_TIME_LINE___GET_BUCKET__TIMEBUCKET:
				return getBucket((TimeBucket)arguments.get(0));
			case DiscretePackage.OBJECT_WITH_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET:
				return constructObjectTimeBucket();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ObjectWithTimeLineImpl
