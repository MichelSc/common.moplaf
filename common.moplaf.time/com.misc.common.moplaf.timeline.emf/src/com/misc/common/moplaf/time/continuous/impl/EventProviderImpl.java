/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.EventProvider;

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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContinuousPackage.EVENT_PROVIDER__PROVIDED_EVENT:
				if (resolve) return getProvidedEvent();
				return basicGetProvidedEvent();
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
		}
		return super.eIsSet(featureID);
	}

} //EventProviderImpl
