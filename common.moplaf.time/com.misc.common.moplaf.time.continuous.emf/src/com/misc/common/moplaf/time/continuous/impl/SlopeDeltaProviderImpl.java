/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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


import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.ProvidedEvent;
import com.misc.common.moplaf.time.continuous.SlopeDeltaAtomic;
import com.misc.common.moplaf.time.continuous.SlopeDeltaProvider;
import com.misc.common.moplaf.time.continuous.TimeContinuousFactory;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slope Delta Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.SlopeDeltaProviderImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.SlopeDeltaProviderImpl#getSlopeDelta <em>Slope Delta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlopeDeltaProviderImpl extends EventProviderImpl implements SlopeDeltaProvider {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected SlopeDeltaAtomic event;

	/**
	 * The default value of the '{@link #getSlopeDelta() <em>Slope Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeDelta()
	 * @generated
	 * @ordered
	 */
	protected static final double SLOPE_DELTA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSlopeDelta() <em>Slope Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeDelta()
	 * @generated
	 * @ordered
	 */
	protected double slopeDelta = SLOPE_DELTA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlopeDeltaProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousPackage.Literals.SLOPE_DELTA_PROVIDER;
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
	public SlopeDeltaAtomic getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(SlopeDeltaAtomic newEvent, NotificationChain msgs) {
		SlopeDeltaAtomic oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.SLOPE_DELTA_PROVIDER__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(SlopeDeltaAtomic newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, TimeContinuousPackage.SLOPE_DELTA_ATOMIC__PROVIDER, SlopeDeltaAtomic.class, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, TimeContinuousPackage.SLOPE_DELTA_ATOMIC__PROVIDER, SlopeDeltaAtomic.class, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.SLOPE_DELTA_PROVIDER__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlopeDelta() {
		return slopeDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlopeDelta(double newSlopeDelta) {
		double oldSlopeDelta = slopeDelta;
		slopeDelta = newSlopeDelta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.SLOPE_DELTA_PROVIDER__SLOPE_DELTA, oldSlopeDelta, slopeDelta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimeContinuousPackage.SLOPE_DELTA_PROVIDER__EVENT:
				if (event != null)
					msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimeContinuousPackage.SLOPE_DELTA_PROVIDER__EVENT, null, msgs);
				return basicSetEvent((SlopeDeltaAtomic)otherEnd, msgs);
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
			case TimeContinuousPackage.SLOPE_DELTA_PROVIDER__EVENT:
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
			case TimeContinuousPackage.SLOPE_DELTA_PROVIDER__EVENT:
				return getEvent();
			case TimeContinuousPackage.SLOPE_DELTA_PROVIDER__SLOPE_DELTA:
				return getSlopeDelta();
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
			case TimeContinuousPackage.SLOPE_DELTA_PROVIDER__EVENT:
				setEvent((SlopeDeltaAtomic)newValue);
				return;
			case TimeContinuousPackage.SLOPE_DELTA_PROVIDER__SLOPE_DELTA:
				setSlopeDelta((Double)newValue);
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
			case TimeContinuousPackage.SLOPE_DELTA_PROVIDER__EVENT:
				setEvent((SlopeDeltaAtomic)null);
				return;
			case TimeContinuousPackage.SLOPE_DELTA_PROVIDER__SLOPE_DELTA:
				setSlopeDelta(SLOPE_DELTA_EDEFAULT);
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
			case TimeContinuousPackage.SLOPE_DELTA_PROVIDER__EVENT:
				return event != null;
			case TimeContinuousPackage.SLOPE_DELTA_PROVIDER__SLOPE_DELTA:
				return slopeDelta != SLOPE_DELTA_EDEFAULT;
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
		result.append(" (SlopeDelta: ");
		result.append(slopeDelta);
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
			SlopeDeltaAtomic event = this.getEvent();
			if ( event!=null){				
				this.setEvent(null);
			}
		} else {
			if ( this.getEvent()==null){
				SlopeDeltaAtomic newEvent = TimeContinuousFactory.eINSTANCE.createSlopeDeltaAtomic();
				newEvent.setProvider(this);
			}
		}
	}

} //SlopeDeltaProviderImpl
