/**
 */
package com.misc.common.moplaf.time.discrete.impl;

import com.misc.common.moplaf.time.discrete.DiscreteFactory;
import com.misc.common.moplaf.time.discrete.DiscretePackage;
import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;
import com.misc.common.moplaf.time.discrete.ObjectWithTimeLine;
import com.misc.common.moplaf.time.discrete.TimeBucket;
import com.misc.common.moplaf.time.discrete.TimeLine;

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
		return DiscretePackage.Literals.OBJECT_WITH_TIME_LINE;
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
			buckets = new EObjectResolvingEList<ObjectTimeBucket>(ObjectTimeBucket.class, this, DiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS);
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
	public TimeBucket getStartBucket() {
		if (startBucket != null && startBucket.eIsProxy()) {
			InternalEObject oldStartBucket = (InternalEObject)startBucket;
			startBucket = (TimeBucket)eResolveProxy(oldStartBucket);
			if (startBucket != oldStartBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET, oldStartBucket, startBucket));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET, oldStartBucket, startBucket));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET, oldEndBucket, endBucket));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET, oldEndBucket, endBucket));
	}
	
	public static ObjectTimeBucket getBucket(ObjectWithTimeLine theTimeLine, TimeBucket bucket, ObjectTimeBucket hint){
		// try to achieve constant time perfs if the target bucket is close 
		//    to the first bucket 
		//    or to the last bucket
		//    or to the previous target bucket
		ObjectTimeBucket current = hint == null ? theTimeLine.getFirstBucket() : hint;
				
		int dist_to_curr  = bucket.getBucketNr()-current.getBucket().getBucketNr();

		// compare current and first
		int dist_to_first = bucket.getBucketNr()-theTimeLine.getFirstBucket().getBucket().getBucketNr();
		if ( dist_to_first<0 ) { return null; }
		if ( dist_to_first<Math.abs(dist_to_curr)){
			current = theTimeLine.getFirstBucket();
			dist_to_curr = dist_to_first;
		}

		// compare current and last
		int dist_to_last  = bucket.getBucketNr()-theTimeLine.getLastBucket().getBucket().getBucketNr();
		if ( dist_to_last>0 ) { return null; }
		if ( dist_to_last>-Math.abs(dist_to_curr)){
			current = theTimeLine.getLastBucket();
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

		return current;
	}
	
	ObjectTimeBucket currentObjectBucket = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ObjectTimeBucket getBucket(TimeBucket bucket) {
		this.currentObjectBucket =  ObjectWithTimeLineImpl.getBucket(this, bucket, this.currentObjectBucket);
				
		return currentObjectBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * To be implemented by the concrete class.
	 * Must create and own the bucket.
	 * <!-- end-user-doc -->
	 */
	public ObjectTimeBucket constructObjectTimeBucket() {
		ObjectTimeBucket newObjectBucket = DiscreteFactory.eINSTANCE.createObjectTimeBucket();
		return newObjectBucket;
	}
	
	public static void refresh(ObjectWithTimeLine theTimeLine){
		if (theTimeLine.getStartBucket()==null ) { return; }
		if (theTimeLine.getEndBucket()==null ) { return; }
		
		int maxiterations = 30000;
		
		// remove the too much at the head
		while (theTimeLine.getFirstBucket()!=null 
			&& theTimeLine.getFirstBucket().getBucket().isBeforeStrictly(theTimeLine.getStartBucket())
			&& --maxiterations>0 ) {
			// remove first
			ObjectTimeBucket oldfirst = theTimeLine.getFirstBucket();
			ObjectTimeBucket newfirst = oldfirst.getNext();
			oldfirst.dispose();
			oldfirst.setNext(null);
			theTimeLine.setFirstBucket(newfirst);
			oldfirst.setBucket(null);
			theTimeLine.getBuckets().remove(oldfirst);
		}
		
		// remove the too much at the tail
		while (theTimeLine.getLastBucket()!=null 
			&& theTimeLine.getLastBucket().getBucket().isAfterStrictly(theTimeLine.getEndBucket())
			&& --maxiterations>0){
			// remove last
			ObjectTimeBucket oldlast = theTimeLine.getLastBucket();
			ObjectTimeBucket newlast = oldlast.getPrevious();
			oldlast.dispose();
			oldlast.setPrevious(null);
			theTimeLine.setLastBucket(newlast);
			oldlast.setBucket(null);
			theTimeLine.getBuckets().remove(oldlast);
		}
		
		if (   theTimeLine.getStartBucket().isAfterStrictly( theTimeLine.getEndBucket() )) {
			// empty period
			return;
		}
		
		if ( theTimeLine.getFirstBucket()==null)	{
			// the time line is presently empty
			// create an initial bucket
			ObjectTimeBucket initialbucket = theTimeLine.constructObjectTimeBucket();
			initialbucket.setBucket(theTimeLine.getStartBucket());
			theTimeLine.setFirstBucket(initialbucket);
			theTimeLine.setLastBucket(initialbucket);
			theTimeLine.getBuckets().add(initialbucket);
		}
		
		while  ( theTimeLine.getFirstBucket().getBucket().isAfterStrictly(theTimeLine.getStartBucket() )
			&& --maxiterations>0){
			// add a new first previous to the old first
			ObjectTimeBucket oldfirst = theTimeLine.getFirstBucket();
			ObjectTimeBucket newfirst = theTimeLine.constructObjectTimeBucket();
			newfirst.setNext(oldfirst);
			theTimeLine.setFirstBucket(newfirst);
			newfirst.setBucket(oldfirst.getBucket().getPrevious());
			theTimeLine.getBuckets().add(0, newfirst); // adds as first
		}
		
		while  ( theTimeLine.getLastBucket().getBucket().isBeforeStrictly(theTimeLine.getEndBucket() )
				&& --maxiterations>0){
			// add a new last next to the old last
			ObjectTimeBucket oldlast = theTimeLine.getLastBucket();
			ObjectTimeBucket newlast = theTimeLine.constructObjectTimeBucket();
			newlast.setPrevious(oldlast);
			theTimeLine.setLastBucket(newlast);
			newlast.setBucket(oldlast.getBucket().getNext());
			theTimeLine.getBuckets().add(newlast);  // adds as last
		}
		
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		ObjectWithTimeLineImpl.refresh(this);
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS:
				return getBuckets();
			case DiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				if (resolve) return getLastBucket();
				return basicGetLastBucket();
			case DiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				if (resolve) return getFirstBucket();
				return basicGetFirstBucket();
			case DiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET:
				if (resolve) return getStartBucket();
				return basicGetStartBucket();
			case DiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET:
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET:
				setStartBucket((TimeBucket)newValue);
				return;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET:
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS:
				getBuckets().clear();
				return;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				setLastBucket((ObjectTimeBucket)null);
				return;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				setFirstBucket((ObjectTimeBucket)null);
				return;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET:
				setStartBucket((TimeBucket)null);
				return;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET:
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS:
				return buckets != null && !buckets.isEmpty();
			case DiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				return lastBucket != null;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				return firstBucket != null;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET:
				return startBucket != null;
			case DiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET:
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
			case DiscretePackage.OBJECT_WITH_TIME_LINE___GET_BUCKET__TIMEBUCKET:
				return getBucket((TimeBucket)arguments.get(0));
			case DiscretePackage.OBJECT_WITH_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET:
				return constructObjectTimeBucket();
			case DiscretePackage.OBJECT_WITH_TIME_LINE___REFRESH:
				refresh();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ObjectWithTimeLineImpl
