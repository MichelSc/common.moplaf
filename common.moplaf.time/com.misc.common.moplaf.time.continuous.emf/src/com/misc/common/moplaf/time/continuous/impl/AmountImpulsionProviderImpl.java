/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.time.continuous.impl;


import com.misc.common.moplaf.time.continuous.AmountImpulsionAtomic;
import com.misc.common.moplaf.time.continuous.AmountImpulsionProvider;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.ProvidedEvent;
import com.misc.common.moplaf.time.continuous.TimeContinuousFactory;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Amount Impulsion Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.AmountImpulsionProviderImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.AmountImpulsionProviderImpl#getAmountImpulsion <em>Amount Impulsion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmountImpulsionProviderImpl extends EventProviderImpl implements AmountImpulsionProvider {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected AmountImpulsionAtomic event;

	/**
	 * The default value of the '{@link #getAmountImpulsion() <em>Amount Impulsion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountImpulsion()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_IMPULSION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmountImpulsion() <em>Amount Impulsion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountImpulsion()
	 * @generated
	 * @ordered
	 */
	protected float amountImpulsion = AMOUNT_IMPULSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmountImpulsionProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousPackage.Literals.AMOUNT_IMPULSION_PROVIDER;
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
	public AmountImpulsionAtomic getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(AmountImpulsionAtomic newEvent, NotificationChain msgs) {
		AmountImpulsionAtomic oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(AmountImpulsionAtomic newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, TimeContinuousPackage.AMOUNT_IMPULSION_ATOMIC__PROVIDER, AmountImpulsionAtomic.class, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, TimeContinuousPackage.AMOUNT_IMPULSION_ATOMIC__PROVIDER, AmountImpulsionAtomic.class, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmountImpulsion() {
		return amountImpulsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountImpulsion(float newAmountImpulsion) {
		float oldAmountImpulsion = amountImpulsion;
		amountImpulsion = newAmountImpulsion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER__AMOUNT_IMPULSION, oldAmountImpulsion, amountImpulsion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER__EVENT:
				if (event != null)
					msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER__EVENT, null, msgs);
				return basicSetEvent((AmountImpulsionAtomic)otherEnd, msgs);
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
			case TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER__EVENT:
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
			case TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER__EVENT:
				return getEvent();
			case TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER__AMOUNT_IMPULSION:
				return getAmountImpulsion();
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
			case TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER__EVENT:
				setEvent((AmountImpulsionAtomic)newValue);
				return;
			case TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER__AMOUNT_IMPULSION:
				setAmountImpulsion((Float)newValue);
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
			case TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER__EVENT:
				setEvent((AmountImpulsionAtomic)null);
				return;
			case TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER__AMOUNT_IMPULSION:
				setAmountImpulsion(AMOUNT_IMPULSION_EDEFAULT);
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
			case TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER__EVENT:
				return event != null;
			case TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER__AMOUNT_IMPULSION:
				return amountImpulsion != AMOUNT_IMPULSION_EDEFAULT;
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
		result.append(" (AmountImpulsion: ");
		result.append(amountImpulsion);
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
			AmountImpulsionAtomic event = this.getEvent();
			if ( event!=null){				
				this.setEvent(null);
			}
		} else {
			if ( this.getEvent()==null){
				AmountImpulsionAtomic newEvent = TimeContinuousFactory.eINSTANCE.createAmountImpulsionAtomic();
				newEvent.setProvider(this);
			}
		}
	}

} //AmountImpulsionProviderImpl
