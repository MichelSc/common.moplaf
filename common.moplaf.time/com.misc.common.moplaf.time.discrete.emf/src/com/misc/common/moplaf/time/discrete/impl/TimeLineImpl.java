/**
 */
package com.misc.common.moplaf.time.discrete.impl;

import com.misc.common.moplaf.time.Util;
import com.misc.common.moplaf.time.discrete.BucketIterator;
import com.misc.common.moplaf.time.discrete.BucketType;
import com.misc.common.moplaf.time.discrete.DiscreteFactory;
import com.misc.common.moplaf.time.discrete.DiscretePackage;
import com.misc.common.moplaf.time.discrete.TimeBucket;
import com.misc.common.moplaf.time.discrete.TimeLine;

import java.lang.reflect.InvocationTargetException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineImpl#getBucketType <em>Bucket Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineImpl#getBucketTypeRefreshed <em>Bucket Type Refreshed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineImpl#getTimeZoneID <em>Time Zone ID</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineImpl#getLocaleLanguage <em>Locale Language</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineImpl#getLocaleCountry <em>Locale Country</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineImpl#getHorizonStart <em>Horizon Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineImpl#getHorizonEnd <em>Horizon End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineImpl#getBuckets <em>Buckets</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineImpl#getFirstBucket <em>First Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.discrete.impl.TimeLineImpl#getLastBucket <em>Last Bucket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeLineImpl extends MinimalEObjectImpl.Container implements TimeLine {
	/**
	 * The default value of the '{@link #getBucketType() <em>Bucket Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketType()
	 * @generated
	 * @ordered
	 */
	protected static final BucketType BUCKET_TYPE_EDEFAULT = BucketType.TL_HOUR;

	/**
	 * The cached value of the '{@link #getBucketType() <em>Bucket Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketType()
	 * @generated
	 * @ordered
	 */
	protected BucketType bucketType = BUCKET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBucketTypeRefreshed() <em>Bucket Type Refreshed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketTypeRefreshed()
	 * @generated
	 * @ordered
	 */
	protected static final BucketType BUCKET_TYPE_REFRESHED_EDEFAULT = BucketType.TL_HOUR;

	/**
	 * The cached value of the '{@link #getBucketTypeRefreshed() <em>Bucket Type Refreshed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketTypeRefreshed()
	 * @generated
	 * @ordered
	 */
	protected BucketType bucketTypeRefreshed = BUCKET_TYPE_REFRESHED_EDEFAULT;

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
	 * The default value of the '{@link #getTimeZoneID() <em>Time Zone ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZoneID()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_ZONE_ID_EDEFAULT = "Europe/Brussels";

	/**
	 * The cached value of the '{@link #getTimeZoneID() <em>Time Zone ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZoneID()
	 * @generated
	 * @ordered
	 */
	protected String timeZoneID = TIME_ZONE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocaleLanguage() <em>Locale Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_LANGUAGE_EDEFAULT = "fr";

	/**
	 * The cached value of the '{@link #getLocaleLanguage() <em>Locale Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleLanguage()
	 * @generated
	 * @ordered
	 */
	protected String localeLanguage = LOCALE_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocaleCountry() <em>Locale Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_COUNTRY_EDEFAULT = "BE";

	/**
	 * The cached value of the '{@link #getLocaleCountry() <em>Locale Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleCountry()
	 * @generated
	 * @ordered
	 */
	protected String localeCountry = LOCALE_COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizonStart() <em>Horizon Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizonStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date HORIZON_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizonStart() <em>Horizon Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizonStart()
	 * @generated
	 * @ordered
	 */
	protected Date horizonStart = HORIZON_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizonEnd() <em>Horizon End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizonEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date HORIZON_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizonEnd() <em>Horizon End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizonEnd()
	 * @generated
	 * @ordered
	 */
	protected Date horizonEnd = HORIZON_END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBuckets() <em>Buckets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeBucket> buckets;

	/**
	 * The cached value of the '{@link #getFirstBucket() <em>First Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstBucket()
	 * @generated
	 * @ordered
	 */
	protected TimeBucket firstBucket;

	/**
	 * The cached value of the '{@link #getLastBucket() <em>Last Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastBucket()
	 * @generated
	 * @ordered
	 */
	protected TimeBucket lastBucket;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiscretePackage.Literals.TIME_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BucketType getBucketType() {
		return bucketType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucketType(BucketType newBucketType) {
		BucketType oldBucketType = bucketType;
		bucketType = newBucketType == null ? BUCKET_TYPE_EDEFAULT : newBucketType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_LINE__BUCKET_TYPE, oldBucketType, bucketType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BucketType getBucketTypeRefreshed() {
		return bucketTypeRefreshed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucketTypeRefreshed(BucketType newBucketTypeRefreshed) {
		BucketType oldBucketTypeRefreshed = bucketTypeRefreshed;
		bucketTypeRefreshed = newBucketTypeRefreshed == null ? BUCKET_TYPE_REFRESHED_EDEFAULT : newBucketTypeRefreshed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_LINE__BUCKET_TYPE_REFRESHED, oldBucketTypeRefreshed, bucketTypeRefreshed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_LINE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeZoneID() {
		return timeZoneID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeZoneID(String newTimeZoneID) {
		String oldTimeZoneID = timeZoneID;
		timeZoneID = newTimeZoneID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_LINE__TIME_ZONE_ID, oldTimeZoneID, timeZoneID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocaleLanguage() {
		return localeLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocaleLanguage(String newLocaleLanguage) {
		String oldLocaleLanguage = localeLanguage;
		localeLanguage = newLocaleLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_LINE__LOCALE_LANGUAGE, oldLocaleLanguage, localeLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocaleCountry() {
		return localeCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocaleCountry(String newLocaleCountry) {
		String oldLocaleCountry = localeCountry;
		localeCountry = newLocaleCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_LINE__LOCALE_COUNTRY, oldLocaleCountry, localeCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getHorizonStart() {
		return horizonStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizonStart(Date newHorizonStart) {
		Date oldHorizonStart = horizonStart;
		horizonStart = newHorizonStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_LINE__HORIZON_START, oldHorizonStart, horizonStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getHorizonEnd() {
		return horizonEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizonEnd(Date newHorizonEnd) {
		Date oldHorizonEnd = horizonEnd;
		horizonEnd = newHorizonEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_LINE__HORIZON_END, oldHorizonEnd, horizonEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeBucket> getBuckets() {
		if (buckets == null) {
			buckets = new EObjectContainmentWithInverseEList<TimeBucket>(TimeBucket.class, this, DiscretePackage.TIME_LINE__BUCKETS, DiscretePackage.TIME_BUCKET__TIME_LINE);
		}
		return buckets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket getFirstBucket() {
		if (firstBucket != null && firstBucket.eIsProxy()) {
			InternalEObject oldFirstBucket = (InternalEObject)firstBucket;
			firstBucket = (TimeBucket)eResolveProxy(oldFirstBucket);
			if (firstBucket != oldFirstBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscretePackage.TIME_LINE__FIRST_BUCKET, oldFirstBucket, firstBucket));
			}
		}
		return firstBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket basicGetFirstBucket() {
		return firstBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstBucket(TimeBucket newFirstBucket) {
		TimeBucket oldFirstBucket = firstBucket;
		firstBucket = newFirstBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_LINE__FIRST_BUCKET, oldFirstBucket, firstBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket getLastBucket() {
		if (lastBucket != null && lastBucket.eIsProxy()) {
			InternalEObject oldLastBucket = (InternalEObject)lastBucket;
			lastBucket = (TimeBucket)eResolveProxy(oldLastBucket);
			if (lastBucket != oldLastBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiscretePackage.TIME_LINE__LAST_BUCKET, oldLastBucket, lastBucket));
			}
		}
		return lastBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket basicGetLastBucket() {
		return lastBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastBucket(TimeBucket newLastBucket) {
		TimeBucket oldLastBucket = lastBucket;
		lastBucket = newLastBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiscretePackage.TIME_LINE__LAST_BUCKET, oldLastBucket, lastBucket));
	}

	public TimeBucket constructBucket(Date sometime){
		TimeBucket newbucket = this.createBucket();
		this.bucketRounder.roundBucket(newbucket, sometime);
		return newbucket;
	}


	/**
	 * <!-- begin-user-doc -->
		 * Retrieve the bucket containing a given time
		 *   undefined behavior if given time not in horizon
	 * <!-- end-user-doc -->
	 */
	public TimeBucket getBucket(Date sometime) {
		if ( this.getFirstBucket()==null) return null;
		if ( sometime.compareTo(this.getFirstBucket().getBucketStart())<0) return null;
		if ( sometime.compareTo(this.getLastBucket().getBucketEnd())>0) return null;
		// this logic should be reimplemented with complexity log(n)
		TimeBucket currentbucket = this.getFirstBucket();
		while ( currentbucket!=null){
			if ( currentbucket.contains(sometime)) return currentbucket;
			currentbucket = currentbucket.getNext();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TimeBucket createBucket() {
		return DiscreteFactory.eINSTANCE.createTimeBucket();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiscretePackage.TIME_LINE__BUCKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBuckets()).basicAdd(otherEnd, msgs);
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
			case DiscretePackage.TIME_LINE__BUCKETS:
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
			case DiscretePackage.TIME_LINE__BUCKET_TYPE:
				return getBucketType();
			case DiscretePackage.TIME_LINE__BUCKET_TYPE_REFRESHED:
				return getBucketTypeRefreshed();
			case DiscretePackage.TIME_LINE__DESCRIPTION:
				return getDescription();
			case DiscretePackage.TIME_LINE__TIME_ZONE_ID:
				return getTimeZoneID();
			case DiscretePackage.TIME_LINE__LOCALE_LANGUAGE:
				return getLocaleLanguage();
			case DiscretePackage.TIME_LINE__LOCALE_COUNTRY:
				return getLocaleCountry();
			case DiscretePackage.TIME_LINE__HORIZON_START:
				return getHorizonStart();
			case DiscretePackage.TIME_LINE__HORIZON_END:
				return getHorizonEnd();
			case DiscretePackage.TIME_LINE__BUCKETS:
				return getBuckets();
			case DiscretePackage.TIME_LINE__FIRST_BUCKET:
				if (resolve) return getFirstBucket();
				return basicGetFirstBucket();
			case DiscretePackage.TIME_LINE__LAST_BUCKET:
				if (resolve) return getLastBucket();
				return basicGetLastBucket();
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
			case DiscretePackage.TIME_LINE__BUCKET_TYPE:
				setBucketType((BucketType)newValue);
				return;
			case DiscretePackage.TIME_LINE__BUCKET_TYPE_REFRESHED:
				setBucketTypeRefreshed((BucketType)newValue);
				return;
			case DiscretePackage.TIME_LINE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DiscretePackage.TIME_LINE__TIME_ZONE_ID:
				setTimeZoneID((String)newValue);
				return;
			case DiscretePackage.TIME_LINE__LOCALE_LANGUAGE:
				setLocaleLanguage((String)newValue);
				return;
			case DiscretePackage.TIME_LINE__LOCALE_COUNTRY:
				setLocaleCountry((String)newValue);
				return;
			case DiscretePackage.TIME_LINE__HORIZON_START:
				setHorizonStart((Date)newValue);
				return;
			case DiscretePackage.TIME_LINE__HORIZON_END:
				setHorizonEnd((Date)newValue);
				return;
			case DiscretePackage.TIME_LINE__BUCKETS:
				getBuckets().clear();
				getBuckets().addAll((Collection<? extends TimeBucket>)newValue);
				return;
			case DiscretePackage.TIME_LINE__FIRST_BUCKET:
				setFirstBucket((TimeBucket)newValue);
				return;
			case DiscretePackage.TIME_LINE__LAST_BUCKET:
				setLastBucket((TimeBucket)newValue);
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
			case DiscretePackage.TIME_LINE__BUCKET_TYPE:
				setBucketType(BUCKET_TYPE_EDEFAULT);
				return;
			case DiscretePackage.TIME_LINE__BUCKET_TYPE_REFRESHED:
				setBucketTypeRefreshed(BUCKET_TYPE_REFRESHED_EDEFAULT);
				return;
			case DiscretePackage.TIME_LINE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DiscretePackage.TIME_LINE__TIME_ZONE_ID:
				setTimeZoneID(TIME_ZONE_ID_EDEFAULT);
				return;
			case DiscretePackage.TIME_LINE__LOCALE_LANGUAGE:
				setLocaleLanguage(LOCALE_LANGUAGE_EDEFAULT);
				return;
			case DiscretePackage.TIME_LINE__LOCALE_COUNTRY:
				setLocaleCountry(LOCALE_COUNTRY_EDEFAULT);
				return;
			case DiscretePackage.TIME_LINE__HORIZON_START:
				setHorizonStart(HORIZON_START_EDEFAULT);
				return;
			case DiscretePackage.TIME_LINE__HORIZON_END:
				setHorizonEnd(HORIZON_END_EDEFAULT);
				return;
			case DiscretePackage.TIME_LINE__BUCKETS:
				getBuckets().clear();
				return;
			case DiscretePackage.TIME_LINE__FIRST_BUCKET:
				setFirstBucket((TimeBucket)null);
				return;
			case DiscretePackage.TIME_LINE__LAST_BUCKET:
				setLastBucket((TimeBucket)null);
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
			case DiscretePackage.TIME_LINE__BUCKET_TYPE:
				return bucketType != BUCKET_TYPE_EDEFAULT;
			case DiscretePackage.TIME_LINE__BUCKET_TYPE_REFRESHED:
				return bucketTypeRefreshed != BUCKET_TYPE_REFRESHED_EDEFAULT;
			case DiscretePackage.TIME_LINE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DiscretePackage.TIME_LINE__TIME_ZONE_ID:
				return TIME_ZONE_ID_EDEFAULT == null ? timeZoneID != null : !TIME_ZONE_ID_EDEFAULT.equals(timeZoneID);
			case DiscretePackage.TIME_LINE__LOCALE_LANGUAGE:
				return LOCALE_LANGUAGE_EDEFAULT == null ? localeLanguage != null : !LOCALE_LANGUAGE_EDEFAULT.equals(localeLanguage);
			case DiscretePackage.TIME_LINE__LOCALE_COUNTRY:
				return LOCALE_COUNTRY_EDEFAULT == null ? localeCountry != null : !LOCALE_COUNTRY_EDEFAULT.equals(localeCountry);
			case DiscretePackage.TIME_LINE__HORIZON_START:
				return HORIZON_START_EDEFAULT == null ? horizonStart != null : !HORIZON_START_EDEFAULT.equals(horizonStart);
			case DiscretePackage.TIME_LINE__HORIZON_END:
				return HORIZON_END_EDEFAULT == null ? horizonEnd != null : !HORIZON_END_EDEFAULT.equals(horizonEnd);
			case DiscretePackage.TIME_LINE__BUCKETS:
				return buckets != null && !buckets.isEmpty();
			case DiscretePackage.TIME_LINE__FIRST_BUCKET:
				return firstBucket != null;
			case DiscretePackage.TIME_LINE__LAST_BUCKET:
				return lastBucket != null;
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
			case DiscretePackage.TIME_LINE___REFRESH_HORIZON:
				refreshHorizon();
				return null;
			case DiscretePackage.TIME_LINE___ITERATOR__DATE_DATE_BOOLEAN:
				return iterator((Date)arguments.get(0), (Date)arguments.get(1), (Boolean)arguments.get(2));
			case DiscretePackage.TIME_LINE___GET_BUCKET__DATE:
				return getBucket((Date)arguments.get(0));
			case DiscretePackage.TIME_LINE___CREATE_BUCKET:
				return createBucket();
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
		result.append(" (BucketType: ");
		result.append(bucketType);
		result.append(", BucketTypeRefreshed: ");
		result.append(bucketTypeRefreshed);
		result.append(", Description: ");
		result.append(description);
		result.append(", TimeZoneID: ");
		result.append(timeZoneID);
		result.append(", LocaleLanguage: ");
		result.append(localeLanguage);
		result.append(", LocaleCountry: ");
		result.append(localeCountry);
		result.append(", HorizonStart: ");
		result.append(horizonStart);
		result.append(", HorizonEnd: ");
		result.append(horizonEnd);
		result.append(')');
		return result.toString();
	}

	/**
	 * A BucketRounder implements the logic deriving the start and end time of the bucket containing a given time
	 * <p>
	 * A specialization must implement the method {@link #roundBucketProtected(TimeBucket, Date)}
	 * @author michel
	 *
	 */
	public class BucketRounder {
		public BucketType getType(){
			return null;
		}
		
		protected void roundBucketProtected(TimeBucket newbucket, Date sometime) {
			// to be overloaded
		}
		public void roundBucket(TimeBucket newbucket, Date sometime) {
			this.roundBucketProtected(newbucket, sometime);
			int seconds = Util.getSeconds(newbucket.getBucketStart(), newbucket.getBucketEnd());
			newbucket.setSeconds(seconds);
		}
		
	}
	
	/**
	 * A MonthBucketRounder provides month buckets
	 * @author michel
	 *
	 */
	public class MonthBucketRounder extends BucketRounder {
		public BucketType getType(){
			return BucketType.TL_MONTH;
		}
		protected void roundBucketProtected(TimeBucket newbucket, Date sometime) {
			Calendar sometimeascalendar = constructCalendar(sometime);
			int year = sometimeascalendar.get(Calendar.YEAR);
			int month = sometimeascalendar.get(Calendar.MONTH);
			
			Calendar beginofmonthascalendar = constructCalendar();
			beginofmonthascalendar.set(Calendar.YEAR, year);
			beginofmonthascalendar.set(Calendar.MONTH, month);
			
			Calendar endofmonthascalendar = (Calendar)beginofmonthascalendar.clone();
			endofmonthascalendar.add(Calendar.MONTH, 1);
			
			Date startofbucket = beginofmonthascalendar.getTime();
			Date endofbucket   = endofmonthascalendar.getTime();
			Format formatter = new SimpleDateFormat("yyyy-MM", constructLocale());
			String description = "Month["+formatter.format(startofbucket)+"]";
			
			newbucket.setBucketStart(startofbucket);
			newbucket.setBucketEnd(endofbucket);
			newbucket.setDescription(description);
		}
		
	}

	/**
	 * A WeekBucketRounder provides week buckets
	 * @author michel
	 *
	 */
	public class WeekBucketRounder extends BucketRounder {
		public BucketType getType(){
			return BucketType.TL_WEEK;
		}
		protected void roundBucketProtected(TimeBucket newbucket, Date sometime) {
			Calendar sometimeascalendar = constructCalendar(sometime);
			int year = sometimeascalendar.get(Calendar.YEAR);
			int month = sometimeascalendar.get(Calendar.MONTH);
			int day   = sometimeascalendar.get(Calendar.DAY_OF_MONTH);

			Calendar beginofweekascalendar = constructCalendar();
			beginofweekascalendar.set(Calendar.YEAR, year);
			beginofweekascalendar.set(Calendar.MONTH, month);
			beginofweekascalendar.set(Calendar.DAY_OF_MONTH, day);
			while (beginofweekascalendar.get(Calendar.DAY_OF_WEEK)!=beginofweekascalendar.getFirstDayOfWeek()){
				beginofweekascalendar.add(Calendar.DAY_OF_YEAR, -1);
			}

			Calendar endofweekascalendar = (Calendar)beginofweekascalendar.clone();
			endofweekascalendar.add(Calendar.WEEK_OF_YEAR, 1);
			
			Calendar yearoftheweekascalendar = (Calendar)endofweekascalendar.clone();
			yearoftheweekascalendar.add(Calendar.DAY_OF_YEAR, -yearoftheweekascalendar.getMinimalDaysInFirstWeek());
			
			Date startofbucket = beginofweekascalendar.getTime();
			Date endofbucket   = endofweekascalendar.getTime();
			Format formatter = new SimpleDateFormat("yyyy-ww", constructLocale());
			String description = "Week["+formatter.format(yearoftheweekascalendar.getTime())+"]";
//			String description = String.format("Day[%1$tF", startofbucket);
			
			newbucket.setBucketStart(startofbucket);
			newbucket.setBucketEnd(endofbucket);
			newbucket.setDescription(description);
		}
	}

	/**
	 * A DayBucketRounder provides day buckets
	 * 
	 * @author michel
	 *
	 */
	public class DayBucketRounder extends BucketRounder {
		public BucketType getType(){
			return BucketType.TL_DAY;
		}
		protected void roundBucketProtected(TimeBucket newbucket, Date sometime) {
			Calendar sometimeascalendar = constructCalendar(sometime);
			int year  = sometimeascalendar.get(Calendar.YEAR);
			int month = sometimeascalendar.get(Calendar.MONTH);
			int day   = sometimeascalendar.get(Calendar.DAY_OF_MONTH); 
			
			Calendar beginofdayascalendar = constructCalendar();
			beginofdayascalendar.set(Calendar.YEAR, year);
			beginofdayascalendar.set(Calendar.MONTH, month);
			beginofdayascalendar.set(Calendar.DAY_OF_MONTH, day);
			
			Calendar endofdayascalendar = (Calendar)beginofdayascalendar.clone();
			endofdayascalendar.add(Calendar.DAY_OF_YEAR, 1);
			
			Date startofbucket = beginofdayascalendar.getTime();
			Date endofbucket   = endofdayascalendar.getTime();
//			Format formatter = new SimpleDateFormat("dd/MM/yyyy", constructLocale());
	//		String description = "Day:["+formatter.format(startofbucket)+"]";
			String description = String.format("Day[%1$tF]", startofbucket);
			
			newbucket.setBucketStart(startofbucket);
			newbucket.setBucketEnd(endofbucket);
			newbucket.setDescription(description);
		}
	}
	
	public class DayBucketRounderAbstract extends BucketRounder {
		
		protected int getNofHours(){
			return 24;
		}
		
		@Override
		protected void roundBucketProtected(TimeBucket newbucket, Date sometime) {
			Calendar sometimeascalendar = constructCalendar(sometime);
			int year  = sometimeascalendar.get(Calendar.YEAR);
			int month = sometimeascalendar.get(Calendar.MONTH);
			int day   = sometimeascalendar.get(Calendar.DAY_OF_MONTH); 
			int hour   = sometimeascalendar.get(Calendar.HOUR_OF_DAY); 
			
			int bucketLength = this.getNofHours();
			int bucketNr = Math.floorDiv(hour, bucketLength);
			int bucketstart = bucketNr*bucketLength;
			int bucketend   = bucketstart+bucketLength;
			
			Calendar beginBucketAsCalendar = constructCalendar();
			beginBucketAsCalendar.set(Calendar.YEAR, year);
			beginBucketAsCalendar.set(Calendar.MONTH, month);
			beginBucketAsCalendar.set(Calendar.DAY_OF_MONTH, day);
			beginBucketAsCalendar.set(Calendar.HOUR_OF_DAY, bucketstart);
			
			Calendar endBucketAsCalendar = constructCalendar();
			endBucketAsCalendar.set(Calendar.YEAR, year);
			endBucketAsCalendar.set(Calendar.MONTH, month);
			endBucketAsCalendar.set(Calendar.DAY_OF_MONTH, day);
			endBucketAsCalendar.set(Calendar.HOUR_OF_DAY, bucketend);
			
			Date startofbucket = beginBucketAsCalendar.getTime();
			Date endofbucket   = endBucketAsCalendar.getTime();
			String description = String.format("Hours[%1$tF %2$02d>%3$02d]", startofbucket, bucketstart, bucketend);
			
			newbucket.setBucketStart(startofbucket);
			newbucket.setBucketEnd(endofbucket);
			newbucket.setDescription(description);
		}
	}
	
	/**
	 * A HalfDayBucketRounder provides 12 hours buckets
	 * 
	 * @author michel
	 *
	 */
	public class HalfDayBucketRounder extends DayBucketRounderAbstract {

		@Override
		protected int getNofHours() {
			return 12;
		}

		@Override
		public BucketType getType() {
			return BucketType.TL_HALF_DAY;
		}
	}

	/**
	 * A EightHoursBucketRounder provides 8 hours buckets
	 * 
	 * @author michel
	 *
	 */
	public class EightHoursBucketRounder extends DayBucketRounderAbstract {

		@Override
		protected int getNofHours() {
			return 8;
		}

		@Override
		public BucketType getType() {
			return BucketType.TL_EIGHT_HOURS;
		}
	}

	/**
	 * A SixHoursBucketRounder provides 6 hours buckets
	 * 
	 * @author michel
	 *
	 */
	public class SixHoursBucketRounder extends DayBucketRounderAbstract {

		@Override
		protected int getNofHours() {
			return 6;
		}

		@Override
		public BucketType getType() {
			return BucketType.TL_SIX_HOURS;
		}
	}

	/**
	 * A FourHoursBucketRounder provides 4 hours buckets
	 * 
	 * @author michel
	 *
	 */
	public class FourHoursBucketRounder extends DayBucketRounderAbstract {

		@Override
		protected int getNofHours() {
			return 4;
		}

		@Override
		public BucketType getType() {
			return BucketType.TL_FOUR_HOURS;
		}
	}

	/**
	 * A TwoHoursBucketRounder provides 2 hours buckets
	 * 
	 * @author michel
	 *
	 */
	public class TwoHoursBucketRounder extends DayBucketRounderAbstract {

		@Override
		protected int getNofHours() {
			return 2;
		}

		@Override
		public BucketType getType() {
			return BucketType.TL_TWO_HOURS;
		}
	}

	/**
	 * A HourBucketRounderAbstract provides common logic for buckets that are part of an hour
	 * 
	 * @author michel
	 *
	 */	
	public abstract class HourBucketRounderAbstract extends BucketRounder{
		protected abstract int getNofParts();

		protected Calendar getHourStart(Date sometime) {
			Calendar sometimeascalendar = constructCalendar(sometime);
			int year   = sometimeascalendar.get(Calendar.YEAR);
			int month  = sometimeascalendar.get(Calendar.MONTH);
			int day    = sometimeascalendar.get(Calendar.DAY_OF_MONTH);
			int hour   = sometimeascalendar.get(Calendar.HOUR_OF_DAY);
			int offset = sometimeascalendar.get(Calendar.DST_OFFSET);
			
			Calendar beginofhourascalendar = constructCalendar();
			beginofhourascalendar.set(Calendar.YEAR, year);
			beginofhourascalendar.set(Calendar.MONTH, month);
			beginofhourascalendar.set(Calendar.DAY_OF_MONTH, day);
			beginofhourascalendar.set(Calendar.HOUR_OF_DAY, hour);
			beginofhourascalendar.set(Calendar.DST_OFFSET, offset);
			return beginofhourascalendar;
		}
		
		protected Calendar getHourEnd(Calendar hourStart){
			Calendar endofhourascalendar = (Calendar)hourStart.clone();
			endofhourascalendar.add(Calendar.HOUR_OF_DAY, 1);
			
			return endofhourascalendar;
		}

		protected long roundBucketProtectedHour(TimeBucket newbucket, Date sometime) {
			Calendar beginofhourascalendar = this.getHourStart(sometime);
			Date hourStart = beginofhourascalendar.getTime();
			
			long secondsFromStart = Util.getSeconds(hourStart, sometime);
			long secondsInPart = 3600/this.getNofParts();
			long part = Math.floorDiv(secondsFromStart, secondsInPart);
			long bucketStart = hourStart.getTime()+part*secondsInPart*1000;
			long bucketEnd   = bucketStart+secondsInPart*1000;
			
			Date startOfBucket = new Date(bucketStart);
			Date endOfBucket   = new Date(bucketEnd);
			   			
			newbucket.setBucketStart(startOfBucket);
			newbucket.setBucketEnd(endOfBucket);
			
			return part;
		}
	}

	/**
	 * A HourBucketRounder provides hour buckets
	 * 
	 * @author michel
	 *
	 */
	public class HourBucketRounder extends HourBucketRounderAbstract{
		
		@Override
		protected int getNofParts() {
			return 1;
		}

		@Override
		public BucketType getType(){
			return BucketType.TL_HOUR;
		}
		
		@Override
		protected void roundBucketProtected(TimeBucket newbucket, Date sometime) {
			this.roundBucketProtectedHour(newbucket, sometime);
			String description = String.format("Hour[%1$tF %1$tH]", newbucket.getBucketStart());
			newbucket.setDescription(description);
		}
	}
	
	/**
	 * A HalfHourBucketRounder provides half hour buckets
	 * 
	 * @author michel
	 *
	 */
	public class HalfHourBucketRounder extends HourBucketRounderAbstract{
		@Override
		protected int getNofParts() {
			return 2;
		}

		@Override
		public BucketType getType(){
			return BucketType.TL_HALF_HOUR;
		}
		
		@Override
		protected void roundBucketProtected(TimeBucket newbucket, Date sometime) {
			long part = this.roundBucketProtectedHour(newbucket, sometime);
			String description = String.format("Hour[%1$tF %1$tH %2$d/%3$d]", newbucket.getBucketStart(), part, this.getNofParts());
			newbucket.setDescription(description);
		}
	}
	
	/**
	 * A QuarterHourBucketRounder provides quarter of an hour buckets
	 * 
	 * @author michel
	 *
	 */
	public class QuarterHourBucketRounder extends HourBucketRounderAbstract{
		@Override
		protected int getNofParts() {
			return 4;
		}

		public BucketType getType(){
			return BucketType.TL_QUARTER_HOUR;
		}
		
		@Override
		protected void roundBucketProtected(TimeBucket newbucket, Date sometime) {
			long part = this.roundBucketProtectedHour(newbucket, sometime);
			String description = String.format("Hour[%1$tF %1$tH %2$d/%3$d]", newbucket.getBucketStart(), part, this.getNofParts());
			newbucket.setDescription(description);
		}
	}
	
	/**
	 * Select the BucketRounder to use as a function of the bucket type
	 */
	protected BucketRounder bucketRounder = null;
	private void refreshBucketRounder(){
		BucketRounder oldbucketrounder = this.bucketRounder;
		if ( oldbucketrounder!=null && oldbucketrounder.getType()==this.getBucketType()) { return; }

		BucketRounder newbucketrounder = null;
		switch( this.getBucketType()){
			case TL_MONTH        : newbucketrounder = new MonthBucketRounder();       break;
			case TL_WEEK         : newbucketrounder = new WeekBucketRounder();        break;
			case TL_DAY          : newbucketrounder = new DayBucketRounder();         break;
			case TL_HALF_DAY     : newbucketrounder = new HalfDayBucketRounder();     break;
			case TL_EIGHT_HOURS  : newbucketrounder = new EightHoursBucketRounder();  break;
			case TL_SIX_HOURS    : newbucketrounder = new SixHoursBucketRounder();    break;
			case TL_FOUR_HOURS   : newbucketrounder = new FourHoursBucketRounder();   break;
			case TL_TWO_HOURS    : newbucketrounder = new TwoHoursBucketRounder();    break;
			case TL_HOUR         : newbucketrounder = new HourBucketRounder();        break;
			case TL_HALF_HOUR    : newbucketrounder = new HalfHourBucketRounder();    break;
			case TL_QUARTER_HOUR : newbucketrounder = new QuarterHourBucketRounder(); break;
			default              : newbucketrounder = null;
		}
		this.bucketRounder = newbucketrounder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Refreshes the buckets of the time scale
	 * <!-- end-user-doc -->
	 */
	public void refreshHorizon() {
		if (this.getHorizonStart()==null ) { return; }
		if (this.getHorizonEnd()==null ) { return; }
		
		// refresh the bucket rounder
		this.refreshBucketRounder();
		
		// flush the buckets if wrong type
		if ( !this.getBucketTypeRefreshed().equals(this.getBucketType())){
			Iterator<TimeBucket> iterator = this.getBuckets().iterator();
			while ( iterator.hasNext()){
				TimeBucket bucket = iterator.next();
				bucket.setNext(null);
				bucket.setPrevious(null);
				iterator.remove();
			}
			this.setFirstBucket(null);
			this.setLastBucket(null);
			this.bucketTypeRefreshed = this.getBucketType();
		}

		// refresh the buckets
		int maxiterations = 30000;
		
		// remove the too much at the head
		while (this.getFirstBucket()!=null 
			&& this.getFirstBucket().getBucketEnd().compareTo(this.getHorizonStart())<=0
			&& --maxiterations>0){
			// remove first
			TimeBucket oldfirst = this.getFirstBucket();
			TimeBucket newfirst = oldfirst.getNext();
			oldfirst.setNext(null);
			this.setFirstBucket(newfirst);
			EcoreUtil.delete(oldfirst);
		}
		
		// remove the too much at the tail
		while (this.getLastBucket()!=null 
			&& this.getLastBucket().getBucketStart().compareTo(this.getHorizonEnd())>=0
			&& --maxiterations>0){
			// remove last
			TimeBucket oldlast = this.getLastBucket();
			TimeBucket newlast = oldlast.getPrevious();
			oldlast.setPrevious(null);
			this.setLastBucket(newlast);
			EcoreUtil.delete(oldlast);
		}
		
		if (   this.getHorizonStart().compareTo(this.getHorizonEnd())>0
			&& --maxiterations>0){
			// empty period
			return;
		}
		
		if ( this.getFirstBucket()==null)	{
			// the time scale is presently empty
			// create an initial bucket
			TimeBucket initialbucket = this.constructBucket(getHorizonStart());
			this.setFirstBucket(initialbucket);
			this.setLastBucket(initialbucket);
			this.getBuckets().add(initialbucket);
		}
		
		while  ( this.getFirstBucket().getBucketStart().compareTo(this.getHorizonStart())>0
			&& --maxiterations>0){
			// add a new first previous to the old first
			TimeBucket oldfirst = this.getFirstBucket();
			Date sometimeinnewbucket = new Date(this.getFirstBucket().getBucketStart().getTime()-1);// one milli earlier
			TimeBucket newfirst = this.constructBucket(sometimeinnewbucket); 
			newfirst.setNext(oldfirst);
			this.setFirstBucket(newfirst);
			this.getBuckets().add(0, newfirst); // adds as first
		}
		while  ( this.getLastBucket().getBucketEnd().compareTo(this.getHorizonEnd())<0){
			// add a new last next to the old last
			TimeBucket oldlast = this.getLastBucket();
			Date sometimeinnewbucket = new Date(this.getLastBucket().getBucketEnd().getTime()+1);// one milli later
			TimeBucket newlast = this.constructBucket(sometimeinnewbucket);
			newlast.setPrevious(oldlast);
			this.setLastBucket(newlast);
			this.getBuckets().add(newlast);  // adds as last
		}
		
		// refresh bucketNr
		TimeBucket currentBucket = this.getFirstBucket();
		int bucketNr = 0;
		while ( currentBucket != null) {
			currentBucket.setBucketNr(bucketNr);
			// loop control
			bucketNr++;
			currentBucket = currentBucket.getNext();
		}
	}
	
/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
		class BucketIteratorImpl implements BucketIterator {
		private TimeBucket bucket = null;
		private Date fromDate;
		private Date toDate;
		private int seconds;
		private boolean isNaked = false;
		float partInThis;
		boolean isBeforeFirst = false;
		boolean isAfterLast = false;
		boolean isValid = false;
		private Date partFromDate;
		private Date partToDate;
		private int partSeconds;
		
		@Override
		public TimeBucket getBucket() {
			return this.bucket;
		}

		@Override
		public Date getFromDate() {
			return this.fromDate;
		}

		@Override
		public Date getToDate() {
			return this.toDate;
		}

		@Override
		public float getPartInThis() {
			return this.partInThis;
		}

		@Override
		public TimeLine getTimeLine() {
		return TimeLineImpl.this;
		}

		@Override
		public int getSeconds() {
			return this.seconds;
		}

		@Override
		public boolean isBeforeFirst() {
			return this.isBeforeFirst;
		}

		@Override
		public boolean isAfterLast() {
			return this.isAfterLast;
		}

		@Override
		public boolean isValid() {
			return this.isValid;
		}

		@Override
		public Date getPartFromDate() {
			return this.partFromDate;
		}

		@Override
		public Date getPartToDate() {
			return this.partToDate;
		}

		@Override
		public int getPartSeconds() {
			return this.partSeconds;
		}

		@Override
		public boolean hasNext() {
			return this.isBeforeFirst || this.isValid || this.isAfterLast;
		}
		
		private void refreshDependents(){
			Date partfrom = null;
			Date partto = null;
			int partseconds = 0;
			float part = 0f;
			// calculate partfrom and partto
			if ( this.isBeforeFirst){
				partfrom = this.fromDate;
				partto = new Date(Math.min(getFirstBucket().getBucketStart().getTime(), this.toDate.getTime()));
				}
			else if ( this.isAfterLast ) {
				partfrom = getLastBucket().getBucketEnd();
				partto = this.toDate;
				}
			else if ( this.isValid() ){
				partfrom = this.bucket.getBucketStart();
				partto   = new Date(Math.min(this.bucket.getBucketEnd().getTime(), this.toDate.getTime()));
			}
			// calculate partseconds and part
			if ( partfrom!=null && partto!=null){
				partseconds = Util.getSecondsIntersection(this.fromDate, this.toDate, partfrom, partto);
				part = (float)partseconds / this.seconds;
			}
			// set calculated values
			this.partFromDate  = partfrom;
			this.partToDate    = partto;
			this.partSeconds   = partseconds;
			this.partInThis    = part;
		}

		public BucketIteratorImpl(Date aFromDate, Date aToDate, boolean naked){
			// initialization
			int totalseconds = 0;
			boolean isvalid = false;
			boolean isbeforefirst = false;
			boolean isafterlast = false;
			TimeBucket bucket = null;

			if ( aFromDate!=null && aToDate!=null){
				totalseconds = Util.getSeconds(aFromDate, aToDate);
				// pointing before the first part
				if ( aToDate.compareTo(getFirstBucket().getBucketStart())<0 && !naked){
					isbeforefirst = true;
				}
				else if (  aFromDate.compareTo(getFirstBucket().getBucketStart())<=0 
						&& aToDate.compareTo(getFirstBucket().getBucketStart())>0){
					// aToDate is after the start of the first bucket
					bucket = getFirstBucket();
					isvalid = true;
				}
				else if ( getLastBucket().getBucketEnd().compareTo(aFromDate)<0 && !naked){
					isafterlast = true;
				}
				else {
					bucket = TimeLineImpl.this.getBucket(aFromDate);
					isvalid = bucket!=null;
				}
			}
			
			this.fromDate      = aFromDate;
			this.toDate        = aToDate;
			this.isNaked       = naked;
			this.seconds       = totalseconds;
			this.isBeforeFirst = isbeforefirst;
			this.isAfterLast   = isafterlast;
			this.isValid       = isvalid;
			this.bucket        = bucket;
			
			this.refreshDependents();
		}
		
		@Override
		public TimeBucket next() {
			boolean isvalid = false;
			boolean isbeforefirst = false;
			boolean isafterlast = false;
			TimeBucket nextbucket = null;
			
			// pointing to some part
			if ( this.isAfterLast){
				// we are done, stop
			}
			else if ( this.isBeforeFirst ){
				if ( this.toDate.compareTo(getFirstBucket().getBucketStart())<=0){
					// we are done
				} else {
					isvalid = true;
					nextbucket = getFirstBucket();
				}
			} 
			else {
				// pointing to some bucket
				if ( this.getBucket().getBucketEnd().compareTo(this.toDate)>=0){
					//we are done
				}
				else {
					nextbucket = this.bucket.getNext();
					isvalid = nextbucket!=null;
					isafterlast = !isvalid && !this.isNaked;
				}
			}
			this.isBeforeFirst = isbeforefirst;
			this.isAfterLast   = isafterlast;
			this.isValid       = isvalid;
			this.bucket        = nextbucket;
			
			this.refreshDependents();
			
			return nextbucket;
		}  // method next
		
		@Override
		public void remove() {
			// not implemented
		}

	};
	
	public BucketIterator iterator(Date from, Date to, boolean naked) {
		return new BucketIteratorImpl(from, to, naked);
	}

	public Iterator<TimeBucket> iterator() {
				return iterator(this.getHorizonStart(), this.getHorizonEnd(), true);
	}
	/**
	 * <!-- begin-user-doc -->
	 * Create a Calendar for the time zone of the time scale, time is the current time
	 * <!-- end-user-doc -->
	 */
	public Calendar constructCalendar(){
		TimeZone timezone = TimeZone.getTimeZone(getTimeZoneID());
		Locale locale = new Locale(this.getLocaleLanguage(), this.getLocaleCountry());
		Calendar calendar = Calendar.getInstance(timezone, locale);
		calendar.clear();
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Create a Calendar for the time zone of the time scale, time is the given time
	 * <!-- end-user-doc -->
	 */
	public Calendar constructCalendar(Date sometime){
		Calendar newcalendar = this.constructCalendar();
		newcalendar.setTime(sometime);
		return newcalendar;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Create a Locale for the TimeScale
	 * <!-- end-user-doc -->
	 */
	public Locale constructLocale(){
		Locale newlocale = new Locale(this.getLocaleLanguage(), this.getLocaleCountry());
		return newlocale;
	}

} //TimeLineImpl
