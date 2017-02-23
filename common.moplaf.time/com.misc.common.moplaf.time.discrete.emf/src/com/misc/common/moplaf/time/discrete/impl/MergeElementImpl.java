/**
 */
package com.misc.common.moplaf.time.discrete.impl;

import com.misc.common.moplaf.time.discrete.TimeDiscretePackage;
import com.misc.common.moplaf.time.discrete.MergeElement;
import com.misc.common.moplaf.time.discrete.TimeBucket;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.MergeElementImpl#getBucketFrom <em>Bucket From</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.MergeElementImpl#getBucketTo <em>Bucket To</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.MergeElementImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.MergeElementImpl#getNext <em>Next</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.MergeElementImpl#getPartFromInTo <em>Part From In To</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.MergeElementImpl#getPartToInFrom <em>Part To In From</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.MergeElementImpl#getElementStart <em>Element Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.MergeElementImpl#getElementEnd <em>Element End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.MergeElementImpl#getSeconds <em>Seconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergeElementImpl extends MinimalEObjectImpl.Container implements MergeElement {
	/**
	 * The cached value of the '{@link #getBucketFrom() <em>Bucket From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketFrom()
	 * @generated
	 * @ordered
	 */
	protected TimeBucket bucketFrom;

	/**
	 * The cached value of the '{@link #getBucketTo() <em>Bucket To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketTo()
	 * @generated
	 * @ordered
	 */
	protected TimeBucket bucketTo;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected MergeElement previous;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected MergeElement next;

	/**
	 * The default value of the '{@link #getPartFromInTo() <em>Part From In To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartFromInTo()
	 * @generated
	 * @ordered
	 */
	protected static final float PART_FROM_IN_TO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPartFromInTo() <em>Part From In To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartFromInTo()
	 * @generated
	 * @ordered
	 */
	protected float partFromInTo = PART_FROM_IN_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartToInFrom() <em>Part To In From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartToInFrom()
	 * @generated
	 * @ordered
	 */
	protected static final float PART_TO_IN_FROM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPartToInFrom() <em>Part To In From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartToInFrom()
	 * @generated
	 * @ordered
	 */
	protected float partToInFrom = PART_TO_IN_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementStart() <em>Element Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date ELEMENT_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementStart() <em>Element Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementStart()
	 * @generated
	 * @ordered
	 */
	protected Date elementStart = ELEMENT_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementEnd() <em>Element End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date ELEMENT_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementEnd() <em>Element End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementEnd()
	 * @generated
	 * @ordered
	 */
	protected Date elementEnd = ELEMENT_END_EDEFAULT;

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
	protected MergeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeDiscretePackage.Literals.MERGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket getBucketFrom() {
		if (bucketFrom != null && bucketFrom.eIsProxy()) {
			InternalEObject oldBucketFrom = (InternalEObject)bucketFrom;
			bucketFrom = (TimeBucket)eResolveProxy(oldBucketFrom);
			if (bucketFrom != oldBucketFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeDiscretePackage.MERGE_ELEMENT__BUCKET_FROM, oldBucketFrom, bucketFrom));
			}
		}
		return bucketFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket basicGetBucketFrom() {
		return bucketFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucketFrom(TimeBucket newBucketFrom) {
		TimeBucket oldBucketFrom = bucketFrom;
		bucketFrom = newBucketFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.MERGE_ELEMENT__BUCKET_FROM, oldBucketFrom, bucketFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket getBucketTo() {
		if (bucketTo != null && bucketTo.eIsProxy()) {
			InternalEObject oldBucketTo = (InternalEObject)bucketTo;
			bucketTo = (TimeBucket)eResolveProxy(oldBucketTo);
			if (bucketTo != oldBucketTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeDiscretePackage.MERGE_ELEMENT__BUCKET_TO, oldBucketTo, bucketTo));
			}
		}
		return bucketTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket basicGetBucketTo() {
		return bucketTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucketTo(TimeBucket newBucketTo) {
		TimeBucket oldBucketTo = bucketTo;
		bucketTo = newBucketTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.MERGE_ELEMENT__BUCKET_TO, oldBucketTo, bucketTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeElement getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (MergeElement)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeDiscretePackage.MERGE_ELEMENT__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeElement basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(MergeElement newPrevious, NotificationChain msgs) {
		MergeElement oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.MERGE_ELEMENT__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(MergeElement newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, TimeDiscretePackage.MERGE_ELEMENT__NEXT, MergeElement.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, TimeDiscretePackage.MERGE_ELEMENT__NEXT, MergeElement.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.MERGE_ELEMENT__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeElement getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (MergeElement)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeDiscretePackage.MERGE_ELEMENT__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeElement basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(MergeElement newNext, NotificationChain msgs) {
		MergeElement oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.MERGE_ELEMENT__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(MergeElement newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, TimeDiscretePackage.MERGE_ELEMENT__PREVIOUS, MergeElement.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, TimeDiscretePackage.MERGE_ELEMENT__PREVIOUS, MergeElement.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.MERGE_ELEMENT__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPartFromInTo() {
		return partFromInTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartFromInTo(float newPartFromInTo) {
		float oldPartFromInTo = partFromInTo;
		partFromInTo = newPartFromInTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.MERGE_ELEMENT__PART_FROM_IN_TO, oldPartFromInTo, partFromInTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPartToInFrom() {
		return partToInFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartToInFrom(float newPartToInFrom) {
		float oldPartToInFrom = partToInFrom;
		partToInFrom = newPartToInFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.MERGE_ELEMENT__PART_TO_IN_FROM, oldPartToInFrom, partToInFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getElementStart() {
		return elementStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementStart(Date newElementStart) {
		Date oldElementStart = elementStart;
		elementStart = newElementStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.MERGE_ELEMENT__ELEMENT_START, oldElementStart, elementStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getElementEnd() {
		return elementEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementEnd(Date newElementEnd) {
		Date oldElementEnd = elementEnd;
		elementEnd = newElementEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.MERGE_ELEMENT__ELEMENT_END, oldElementEnd, elementEnd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimeDiscretePackage.MERGE_ELEMENT__SECONDS, oldSeconds, seconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimeDiscretePackage.MERGE_ELEMENT__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, TimeDiscretePackage.MERGE_ELEMENT__NEXT, MergeElement.class, msgs);
				return basicSetPrevious((MergeElement)otherEnd, msgs);
			case TimeDiscretePackage.MERGE_ELEMENT__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, TimeDiscretePackage.MERGE_ELEMENT__PREVIOUS, MergeElement.class, msgs);
				return basicSetNext((MergeElement)otherEnd, msgs);
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
			case TimeDiscretePackage.MERGE_ELEMENT__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case TimeDiscretePackage.MERGE_ELEMENT__NEXT:
				return basicSetNext(null, msgs);
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
			case TimeDiscretePackage.MERGE_ELEMENT__BUCKET_FROM:
				if (resolve) return getBucketFrom();
				return basicGetBucketFrom();
			case TimeDiscretePackage.MERGE_ELEMENT__BUCKET_TO:
				if (resolve) return getBucketTo();
				return basicGetBucketTo();
			case TimeDiscretePackage.MERGE_ELEMENT__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case TimeDiscretePackage.MERGE_ELEMENT__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case TimeDiscretePackage.MERGE_ELEMENT__PART_FROM_IN_TO:
				return getPartFromInTo();
			case TimeDiscretePackage.MERGE_ELEMENT__PART_TO_IN_FROM:
				return getPartToInFrom();
			case TimeDiscretePackage.MERGE_ELEMENT__ELEMENT_START:
				return getElementStart();
			case TimeDiscretePackage.MERGE_ELEMENT__ELEMENT_END:
				return getElementEnd();
			case TimeDiscretePackage.MERGE_ELEMENT__SECONDS:
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
			case TimeDiscretePackage.MERGE_ELEMENT__BUCKET_FROM:
				setBucketFrom((TimeBucket)newValue);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__BUCKET_TO:
				setBucketTo((TimeBucket)newValue);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__PREVIOUS:
				setPrevious((MergeElement)newValue);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__NEXT:
				setNext((MergeElement)newValue);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__PART_FROM_IN_TO:
				setPartFromInTo((Float)newValue);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__PART_TO_IN_FROM:
				setPartToInFrom((Float)newValue);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__ELEMENT_START:
				setElementStart((Date)newValue);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__ELEMENT_END:
				setElementEnd((Date)newValue);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__SECONDS:
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
			case TimeDiscretePackage.MERGE_ELEMENT__BUCKET_FROM:
				setBucketFrom((TimeBucket)null);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__BUCKET_TO:
				setBucketTo((TimeBucket)null);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__PREVIOUS:
				setPrevious((MergeElement)null);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__NEXT:
				setNext((MergeElement)null);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__PART_FROM_IN_TO:
				setPartFromInTo(PART_FROM_IN_TO_EDEFAULT);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__PART_TO_IN_FROM:
				setPartToInFrom(PART_TO_IN_FROM_EDEFAULT);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__ELEMENT_START:
				setElementStart(ELEMENT_START_EDEFAULT);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__ELEMENT_END:
				setElementEnd(ELEMENT_END_EDEFAULT);
				return;
			case TimeDiscretePackage.MERGE_ELEMENT__SECONDS:
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
			case TimeDiscretePackage.MERGE_ELEMENT__BUCKET_FROM:
				return bucketFrom != null;
			case TimeDiscretePackage.MERGE_ELEMENT__BUCKET_TO:
				return bucketTo != null;
			case TimeDiscretePackage.MERGE_ELEMENT__PREVIOUS:
				return previous != null;
			case TimeDiscretePackage.MERGE_ELEMENT__NEXT:
				return next != null;
			case TimeDiscretePackage.MERGE_ELEMENT__PART_FROM_IN_TO:
				return partFromInTo != PART_FROM_IN_TO_EDEFAULT;
			case TimeDiscretePackage.MERGE_ELEMENT__PART_TO_IN_FROM:
				return partToInFrom != PART_TO_IN_FROM_EDEFAULT;
			case TimeDiscretePackage.MERGE_ELEMENT__ELEMENT_START:
				return ELEMENT_START_EDEFAULT == null ? elementStart != null : !ELEMENT_START_EDEFAULT.equals(elementStart);
			case TimeDiscretePackage.MERGE_ELEMENT__ELEMENT_END:
				return ELEMENT_END_EDEFAULT == null ? elementEnd != null : !ELEMENT_END_EDEFAULT.equals(elementEnd);
			case TimeDiscretePackage.MERGE_ELEMENT__SECONDS:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (PartFromInTo: ");
		result.append(partFromInTo);
		result.append(", PartToInFrom: ");
		result.append(partToInFrom);
		result.append(", ElementStart: ");
		result.append(elementStart);
		result.append(", ElementEnd: ");
		result.append(elementEnd);
		result.append(", Seconds: ");
		result.append(seconds);
		result.append(')');
		return result.toString();
	}

} //MergeElementImpl
