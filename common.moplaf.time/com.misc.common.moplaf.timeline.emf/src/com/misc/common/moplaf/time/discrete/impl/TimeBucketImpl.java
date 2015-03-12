/**
 */
package com.misc.common.moplaf.time.discrete.impl;

import com.misc.common.moplaf.time.discrete.DiscretePackage;
import com.misc.common.moplaf.time.discrete.TimeBucket;
import com.misc.common.moplaf.time.discrete.TimeLine;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeBucketImpl#getBucketStart <em>Bucket Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeBucketImpl#getBucketEnd <em>Bucket End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeBucketImpl#getNext <em>Next</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeBucketImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeBucketImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeBucketImpl#getSeconds <em>Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeBucketImpl extends MinimalEObjectImpl.Container implements TimeBucket {
	/**
	 * The default value of the '{@link #getBucketStart() <em>Bucket Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date BUCKET_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketStart() <em>Bucket Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketStart()
	 * @generated
	 * @ordered
	 */
	protected Date bucketStart = BUCKET_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getBucketEnd() <em>Bucket End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date BUCKET_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketEnd() <em>Bucket End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketEnd()
	 * @generated
	 * @ordered
	 */
	protected Date bucketEnd = BUCKET_END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected TimeBucket next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected TimeBucket previous;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final int SECONDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
	protected int seconds = SECONDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiscretePackage.Literals.TIME_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBucketStart() {
		return bucketStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucketStart(Date newBucketStart) {
		Date oldBucketStart = bucketStart;
		bucketStart = newBucketStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_BUCKET__BUCKET_START, oldBucketStart, bucketStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBucketEnd() {
		return bucketEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucketEnd(Date newBucketEnd) {
		Date oldBucketEnd = bucketEnd;
		bucketEnd = newBucketEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_BUCKET__BUCKET_END, oldBucketEnd, bucketEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (TimeBucket)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscretePackage.TIME_BUCKET__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(TimeBucket newNext, NotificationChain msgs) {
		TimeBucket oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_BUCKET__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(TimeBucket newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, DiscretePackage.TIME_BUCKET__PREVIOUS, TimeBucket.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, DiscretePackage.TIME_BUCKET__PREVIOUS, TimeBucket.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_BUCKET__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (TimeBucket)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscretePackage.TIME_BUCKET__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(TimeBucket newPrevious, NotificationChain msgs) {
		TimeBucket oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_BUCKET__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(TimeBucket newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, DiscretePackage.TIME_BUCKET__NEXT, TimeBucket.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, DiscretePackage.TIME_BUCKET__NEXT, TimeBucket.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_BUCKET__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_BUCKET__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeconds() {
		return seconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeconds(int newSeconds) {
		int oldSeconds = seconds;
		seconds = newSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_BUCKET__SECONDS, oldSeconds, seconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean contains(Date sometime) {
		boolean contains = this.getBucketStart().compareTo(sometime)<=0 && sometime.compareTo(this.getBucketEnd())<0;
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isBefore(TimeBucket other) {
		boolean isbefore = this.getBucketEnd().compareTo(other.getBucketStart())<=0;
		return isbefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getSecondsIntersection(Date from, Date to) {
		Date thisfrom = this.getBucketStart();
		Date thisto   = this.getBucketEnd();
		int seconds = TimeLine.Util.getSecondsIntersection(from, to, thisfrom, thisto);
		return seconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiscretePackage.TIME_BUCKET__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, DiscretePackage.TIME_BUCKET__PREVIOUS, TimeBucket.class, msgs);
				return basicSetNext((TimeBucket)otherEnd, msgs);
			case DiscretePackage.TIME_BUCKET__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, DiscretePackage.TIME_BUCKET__NEXT, TimeBucket.class, msgs);
				return basicSetPrevious((TimeBucket)otherEnd, msgs);
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
			case DiscretePackage.TIME_BUCKET__NEXT:
				return basicSetNext(null, msgs);
			case DiscretePackage.TIME_BUCKET__PREVIOUS:
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
			case DiscretePackage.TIME_BUCKET__BUCKET_START:
				return getBucketStart();
			case DiscretePackage.TIME_BUCKET__BUCKET_END:
				return getBucketEnd();
			case DiscretePackage.TIME_BUCKET__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case DiscretePackage.TIME_BUCKET__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case DiscretePackage.TIME_BUCKET__DESCRIPTION:
				return getDescription();
			case DiscretePackage.TIME_BUCKET__SECONDS:
				return getSeconds();
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
			case DiscretePackage.TIME_BUCKET__BUCKET_START:
				setBucketStart((Date)newValue);
				return;
			case DiscretePackage.TIME_BUCKET__BUCKET_END:
				setBucketEnd((Date)newValue);
				return;
			case DiscretePackage.TIME_BUCKET__NEXT:
				setNext((TimeBucket)newValue);
				return;
			case DiscretePackage.TIME_BUCKET__PREVIOUS:
				setPrevious((TimeBucket)newValue);
				return;
			case DiscretePackage.TIME_BUCKET__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DiscretePackage.TIME_BUCKET__SECONDS:
				setSeconds((Integer)newValue);
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
			case DiscretePackage.TIME_BUCKET__BUCKET_START:
				setBucketStart(BUCKET_START_EDEFAULT);
				return;
			case DiscretePackage.TIME_BUCKET__BUCKET_END:
				setBucketEnd(BUCKET_END_EDEFAULT);
				return;
			case DiscretePackage.TIME_BUCKET__NEXT:
				setNext((TimeBucket)null);
				return;
			case DiscretePackage.TIME_BUCKET__PREVIOUS:
				setPrevious((TimeBucket)null);
				return;
			case DiscretePackage.TIME_BUCKET__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DiscretePackage.TIME_BUCKET__SECONDS:
				setSeconds(SECONDS_EDEFAULT);
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
			case DiscretePackage.TIME_BUCKET__BUCKET_START:
				return BUCKET_START_EDEFAULT == null ? bucketStart != null : !BUCKET_START_EDEFAULT.equals(bucketStart);
			case DiscretePackage.TIME_BUCKET__BUCKET_END:
				return BUCKET_END_EDEFAULT == null ? bucketEnd != null : !BUCKET_END_EDEFAULT.equals(bucketEnd);
			case DiscretePackage.TIME_BUCKET__NEXT:
				return next != null;
			case DiscretePackage.TIME_BUCKET__PREVIOUS:
				return previous != null;
			case DiscretePackage.TIME_BUCKET__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DiscretePackage.TIME_BUCKET__SECONDS:
				return seconds != SECONDS_EDEFAULT;
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
			case DiscretePackage.TIME_BUCKET___CONTAINS__DATE:
				return contains((Date)arguments.get(0));
			case DiscretePackage.TIME_BUCKET___IS_BEFORE__TIMEBUCKET:
				return isBefore((TimeBucket)arguments.get(0));
			case DiscretePackage.TIME_BUCKET___GET_SECONDS_INTERSECTION__DATE_DATE:
				return getSecondsIntersection((Date)arguments.get(0), (Date)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BucketStart: ");
		result.append(bucketStart);
		result.append(", BucketEnd: ");
		result.append(bucketEnd);
		result.append(", Description: ");
		result.append(description);
		result.append(", Seconds: ");
		result.append(seconds);
		result.append(')');
		return result.toString();
	}

} //TimeBucketImpl
