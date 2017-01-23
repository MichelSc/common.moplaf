/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic;
import com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider;
import com.misc.common.moplaf.time.continuous.ContinuousFactory;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.ProvidedEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Amount Absolute Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteProviderImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteProviderImpl#getAmountAbsolute <em>Amount Absolute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmountAbsoluteProviderImpl extends EventProviderImpl implements AmountAbsoluteProvider {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected AmountAbsoluteAtomic event;

	/**
	 * The default value of the '{@link #getAmountAbsolute() <em>Amount Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAbsolute()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_ABSOLUTE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmountAbsolute() <em>Amount Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAbsolute()
	 * @generated
	 * @ordered
	 */
	protected float amountAbsolute = AMOUNT_ABSOLUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmountAbsoluteProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.AMOUNT_ABSOLUTE_PROVIDER;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ProvidedEvent basicGetProvidedEvent() {
		return this.getEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountAbsoluteAtomic getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(AmountAbsoluteAtomic newEvent, NotificationChain msgs) {
		AmountAbsoluteAtomic oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(AmountAbsoluteAtomic newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, ContinuousPackage.AMOUNT_ABSOLUTE_ATOMIC__PROVIDER, AmountAbsoluteAtomic.class, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, ContinuousPackage.AMOUNT_ABSOLUTE_ATOMIC__PROVIDER, AmountAbsoluteAtomic.class, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmountAbsolute() {
		return amountAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountAbsolute(float newAmountAbsolute) {
		float oldAmountAbsolute = amountAbsolute;
		amountAbsolute = newAmountAbsolute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER__AMOUNT_ABSOLUTE, oldAmountAbsolute, amountAbsolute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER__EVENT:
				if (event != null)
					msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER__EVENT, null, msgs);
				return basicSetEvent((AmountAbsoluteAtomic)otherEnd, msgs);
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
			case ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER__EVENT:
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
			case ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER__EVENT:
				return getEvent();
			case ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER__AMOUNT_ABSOLUTE:
				return getAmountAbsolute();
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
			case ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER__EVENT:
				setEvent((AmountAbsoluteAtomic)newValue);
				return;
			case ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER__AMOUNT_ABSOLUTE:
				setAmountAbsolute((Float)newValue);
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
			case ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER__EVENT:
				setEvent((AmountAbsoluteAtomic)null);
				return;
			case ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER__AMOUNT_ABSOLUTE:
				setAmountAbsolute(AMOUNT_ABSOLUTE_EDEFAULT);
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
			case ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER__EVENT:
				return event != null;
			case ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER__AMOUNT_ABSOLUTE:
				return amountAbsolute != AMOUNT_ABSOLUTE_EDEFAULT;
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
		result.append(" (AmountAbsolute: ");
		result.append(amountAbsolute);
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
			AmountAbsoluteAtomic event = this.getEvent();
			if ( event!=null){				
				this.setEvent(null);
			}
		} else {
			if ( this.getEvent()==null){
				AmountAbsoluteAtomic newEvent = ContinuousFactory.eINSTANCE.createAmountAbsoluteAtomic();
				newEvent.setProvider(this);
			}
		}
	}

} //AmountAbsoluteProviderImpl