/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.solver.LPTimeLine;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;
import com.misc.common.moplaf.time.discrete.ObjectWithTimeLine;
import com.misc.common.moplaf.time.discrete.TimeBucket;
import com.misc.common.moplaf.time.discrete.TimeDiscretePackage;
import com.misc.common.moplaf.time.discrete.util.Util;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Time Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTimeLineImpl#getBuckets <em>Buckets</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTimeLineImpl#getLastBucket <em>Last Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTimeLineImpl#getFirstBucket <em>First Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTimeLineImpl#getStartBucket <em>Start Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPTimeLineImpl#getEndBucket <em>End Bucket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPTimeLineImpl extends LPTupleImpl implements LPTimeLine {
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
	protected LPTimeLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_TIME_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTimeBucket> getBuckets() {
		if (buckets == null) {
			buckets = new EObjectResolvingEList<ObjectTimeBucket>(ObjectTimeBucket.class, this, MacroPlannerSolverPackage.LP_TIME_LINE__BUCKETS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_TIME_LINE__LAST_BUCKET, oldLastBucket, lastBucket));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_TIME_LINE__LAST_BUCKET, oldLastBucket, lastBucket));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_TIME_LINE__FIRST_BUCKET, oldFirstBucket, firstBucket));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_TIME_LINE__FIRST_BUCKET, oldFirstBucket, firstBucket));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_TIME_LINE__START_BUCKET, oldStartBucket, startBucket));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_TIME_LINE__START_BUCKET, oldStartBucket, startBucket));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_TIME_LINE__END_BUCKET, oldEndBucket, endBucket));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_TIME_LINE__END_BUCKET, oldEndBucket, endBucket));
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
	 */
	public ObjectTimeBucket getBucket(TimeBucket bucket) {
		this.currentObjectBucket =  Util.getBucket(this, bucket, this.currentObjectBucket);
		
		return currentObjectBucket;
	}

	ObjectTimeBucket currentObjectBucket = null;
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
			case MacroPlannerSolverPackage.LP_TIME_LINE__BUCKETS:
				return getBuckets();
			case MacroPlannerSolverPackage.LP_TIME_LINE__LAST_BUCKET:
				if (resolve) return getLastBucket();
				return basicGetLastBucket();
			case MacroPlannerSolverPackage.LP_TIME_LINE__FIRST_BUCKET:
				if (resolve) return getFirstBucket();
				return basicGetFirstBucket();
			case MacroPlannerSolverPackage.LP_TIME_LINE__START_BUCKET:
				if (resolve) return getStartBucket();
				return basicGetStartBucket();
			case MacroPlannerSolverPackage.LP_TIME_LINE__END_BUCKET:
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
			case MacroPlannerSolverPackage.LP_TIME_LINE__BUCKETS:
				getBuckets().clear();
				getBuckets().addAll((Collection<? extends ObjectTimeBucket>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_TIME_LINE__LAST_BUCKET:
				setLastBucket((ObjectTimeBucket)newValue);
				return;
			case MacroPlannerSolverPackage.LP_TIME_LINE__FIRST_BUCKET:
				setFirstBucket((ObjectTimeBucket)newValue);
				return;
			case MacroPlannerSolverPackage.LP_TIME_LINE__START_BUCKET:
				setStartBucket((TimeBucket)newValue);
				return;
			case MacroPlannerSolverPackage.LP_TIME_LINE__END_BUCKET:
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
			case MacroPlannerSolverPackage.LP_TIME_LINE__BUCKETS:
				getBuckets().clear();
				return;
			case MacroPlannerSolverPackage.LP_TIME_LINE__LAST_BUCKET:
				setLastBucket((ObjectTimeBucket)null);
				return;
			case MacroPlannerSolverPackage.LP_TIME_LINE__FIRST_BUCKET:
				setFirstBucket((ObjectTimeBucket)null);
				return;
			case MacroPlannerSolverPackage.LP_TIME_LINE__START_BUCKET:
				setStartBucket((TimeBucket)null);
				return;
			case MacroPlannerSolverPackage.LP_TIME_LINE__END_BUCKET:
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
			case MacroPlannerSolverPackage.LP_TIME_LINE__BUCKETS:
				return buckets != null && !buckets.isEmpty();
			case MacroPlannerSolverPackage.LP_TIME_LINE__LAST_BUCKET:
				return lastBucket != null;
			case MacroPlannerSolverPackage.LP_TIME_LINE__FIRST_BUCKET:
				return firstBucket != null;
			case MacroPlannerSolverPackage.LP_TIME_LINE__START_BUCKET:
				return startBucket != null;
			case MacroPlannerSolverPackage.LP_TIME_LINE__END_BUCKET:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ObjectWithTimeLine.class) {
			switch (derivedFeatureID) {
				case MacroPlannerSolverPackage.LP_TIME_LINE__BUCKETS: return TimeDiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS;
				case MacroPlannerSolverPackage.LP_TIME_LINE__LAST_BUCKET: return TimeDiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET;
				case MacroPlannerSolverPackage.LP_TIME_LINE__FIRST_BUCKET: return TimeDiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET;
				case MacroPlannerSolverPackage.LP_TIME_LINE__START_BUCKET: return TimeDiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET;
				case MacroPlannerSolverPackage.LP_TIME_LINE__END_BUCKET: return TimeDiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET;
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
		if (baseClass == ObjectWithTimeLine.class) {
			switch (baseFeatureID) {
				case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS: return MacroPlannerSolverPackage.LP_TIME_LINE__BUCKETS;
				case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET: return MacroPlannerSolverPackage.LP_TIME_LINE__LAST_BUCKET;
				case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET: return MacroPlannerSolverPackage.LP_TIME_LINE__FIRST_BUCKET;
				case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET: return MacroPlannerSolverPackage.LP_TIME_LINE__START_BUCKET;
				case TimeDiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET: return MacroPlannerSolverPackage.LP_TIME_LINE__END_BUCKET;
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
		if (baseClass == ObjectWithTimeLine.class) {
			switch (baseOperationID) {
				case TimeDiscretePackage.OBJECT_WITH_TIME_LINE___GET_BUCKET__TIMEBUCKET: return MacroPlannerSolverPackage.LP_TIME_LINE___GET_BUCKET__TIMEBUCKET;
				case TimeDiscretePackage.OBJECT_WITH_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET: return MacroPlannerSolverPackage.LP_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET;
				case TimeDiscretePackage.OBJECT_WITH_TIME_LINE___REFRESH: return MacroPlannerSolverPackage.LP_TIME_LINE___REFRESH;
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
			case MacroPlannerSolverPackage.LP_TIME_LINE___GET_BUCKET__TIMEBUCKET:
				return getBucket((TimeBucket)arguments.get(0));
			case MacroPlannerSolverPackage.LP_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET:
				return constructObjectTimeBucket();
			case MacroPlannerSolverPackage.LP_TIME_LINE___REFRESH:
				refresh();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //LPTimeLineImpl
