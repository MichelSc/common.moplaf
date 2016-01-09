/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.EventProvider;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.EventProviderImpl#getProvidedEvent <em>Provided Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.EventProviderImpl#getMoment <em>Moment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EventProviderImpl extends EventsProviderAbstractImpl implements EventProvider {
	/**
	 * The cached value of the '{@link #getProvidedEvent() <em>Provided Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedEvent()
	 * @generated
	 * @ordered
	 */
	protected DistributionEvent providedEvent;

	/**
	 * The default value of the '{@link #getMoment() <em>Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoment()
	 * @generated
	 * @ordered
	 */
	protected static final Date MOMENT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMoment() <em>Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoment()
	 * @generated
	 * @ordered
	 */
	protected Date moment = MOMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.EVENT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionEvent getProvidedEvent() {
		if (providedEvent != null && providedEvent.eIsProxy()) {
			InternalEObject oldProvidedEvent = (InternalEObject)providedEvent;
			providedEvent = (DistributionEvent)eResolveProxy(oldProvidedEvent);
			if (providedEvent != oldProvidedEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContinuousPackage.EVENT_PROVIDER__PROVIDED_EVENT, oldProvidedEvent, providedEvent));
			}
		}
		return providedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionEvent basicGetProvidedEvent() {
		return providedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedEvent(DistributionEvent newProvidedEvent) {
		DistributionEvent oldProvidedEvent = providedEvent;
		providedEvent = newProvidedEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.EVENT_PROVIDER__PROVIDED_EVENT, oldProvidedEvent, providedEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getMoment() {
		return moment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoment(Date newMoment) {
		Date oldMoment = moment;
		moment = newMoment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.EVENT_PROVIDER__MOMENT, oldMoment, moment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContinuousPackage.EVENT_PROVIDER__PROVIDED_EVENT:
				if (resolve) return getProvidedEvent();
				return basicGetProvidedEvent();
			case ContinuousPackage.EVENT_PROVIDER__MOMENT:
				return getMoment();
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
			case ContinuousPackage.EVENT_PROVIDER__PROVIDED_EVENT:
				setProvidedEvent((DistributionEvent)newValue);
				return;
			case ContinuousPackage.EVENT_PROVIDER__MOMENT:
				setMoment((Date)newValue);
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
			case ContinuousPackage.EVENT_PROVIDER__PROVIDED_EVENT:
				setProvidedEvent((DistributionEvent)null);
				return;
			case ContinuousPackage.EVENT_PROVIDER__MOMENT:
				setMoment(MOMENT_EDEFAULT);
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
			case ContinuousPackage.EVENT_PROVIDER__PROVIDED_EVENT:
				return providedEvent != null;
			case ContinuousPackage.EVENT_PROVIDER__MOMENT:
				return MOMENT_EDEFAULT == null ? moment != null : !MOMENT_EDEFAULT.equals(moment);
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
		result.append(" (Moment: ");
		result.append(moment);
		result.append(')');
		return result.toString();
	}

} //EventProviderImpl
