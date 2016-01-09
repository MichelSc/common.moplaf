/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.time.continuous.ContinuousFactory;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic;
import com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slope Absolute Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteProviderImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteProviderImpl#getSlopeAbsolute <em>Slope Absolute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlopeAbsoluteProviderImpl extends EventProviderImpl implements SlopeAbsoluteProvider {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected SlopeAbsoluteAtomic event;

	/**
	 * The default value of the '{@link #getSlopeAbsolute() <em>Slope Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeAbsolute()
	 * @generated
	 * @ordered
	 */
	protected static final float SLOPE_ABSOLUTE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSlopeAbsolute() <em>Slope Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeAbsolute()
	 * @generated
	 * @ordered
	 */
	protected float slopeAbsolute = SLOPE_ABSOLUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlopeAbsoluteProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.SLOPE_ABSOLUTE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlopeAbsoluteAtomic getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(SlopeAbsoluteAtomic newEvent, NotificationChain msgs) {
		SlopeAbsoluteAtomic oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(SlopeAbsoluteAtomic newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, ContinuousPackage.SLOPE_ABSOLUTE_ATOMIC__PROVIDER, SlopeAbsoluteAtomic.class, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, ContinuousPackage.SLOPE_ABSOLUTE_ATOMIC__PROVIDER, SlopeAbsoluteAtomic.class, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSlopeAbsolute() {
		return slopeAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlopeAbsolute(float newSlopeAbsolute) {
		float oldSlopeAbsolute = slopeAbsolute;
		slopeAbsolute = newSlopeAbsolute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER__SLOPE_ABSOLUTE, oldSlopeAbsolute, slopeAbsolute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER__EVENT:
				if (event != null)
					msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER__EVENT, null, msgs);
				return basicSetEvent((SlopeAbsoluteAtomic)otherEnd, msgs);
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
			case ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER__EVENT:
				return basicSetEvent(null, msgs);
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
			case ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER__EVENT:
				return getEvent();
			case ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER__SLOPE_ABSOLUTE:
				return getSlopeAbsolute();
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
			case ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER__EVENT:
				setEvent((SlopeAbsoluteAtomic)newValue);
				return;
			case ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER__SLOPE_ABSOLUTE:
				setSlopeAbsolute((Float)newValue);
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
			case ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER__EVENT:
				setEvent((SlopeAbsoluteAtomic)null);
				return;
			case ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER__SLOPE_ABSOLUTE:
				setSlopeAbsolute(SLOPE_ABSOLUTE_EDEFAULT);
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
			case ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER__EVENT:
				return event != null;
			case ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER__SLOPE_ABSOLUTE:
				return slopeAbsolute != SLOPE_ABSOLUTE_EDEFAULT;
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
		result.append(" (SlopeAbsolute: ");
		result.append(slopeAbsolute);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.CompositeDistributionEventImpl#refreshEvent()
	 */
	@Override
	public void refreshEvents() {
		Distribution distribution = this.getDistribution();
		if ( distribution == null){
			SlopeAbsoluteAtomic event = this.getEvent();
			if ( event!=null){				
				this.setEvent(null);
			}
		} else {
			if ( this.getEvent()==null){
				SlopeAbsoluteAtomic newEvent = ContinuousFactory.eINSTANCE.createSlopeAbsoluteAtomic();
				newEvent.setProvider(this);
			}
		}
	}
	
} //SlopeAbsoluteProviderImpl
