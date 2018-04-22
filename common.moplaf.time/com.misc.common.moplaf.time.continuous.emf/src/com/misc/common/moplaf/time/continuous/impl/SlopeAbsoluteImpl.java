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


import com.misc.common.moplaf.time.continuous.SlopeAbsolute;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slope Absolute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteImpl#getSlopeAbsolute <em>Slope Absolute</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SlopeAbsoluteImpl extends ProvidedEventImpl implements SlopeAbsolute {
	/**
	 * The default value of the '{@link #getSlopeAbsolute() <em>Slope Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeAbsolute()
	 * @generated
	 * @ordered
	 */
	protected static final double SLOPE_ABSOLUTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSlopeAbsolute() <em>Slope Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeAbsolute()
	 * @generated
	 * @ordered
	 */
	protected double slopeAbsolute = SLOPE_ABSOLUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlopeAbsoluteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousPackage.Literals.SLOPE_ABSOLUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlopeAbsolute() {
		return slopeAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlopeAbsolute(double newSlopeAbsolute) {
		double oldSlopeAbsolute = slopeAbsolute;
		slopeAbsolute = newSlopeAbsolute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.SLOPE_ABSOLUTE__SLOPE_ABSOLUTE, oldSlopeAbsolute, slopeAbsolute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshSlopeAbsolute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousPackage.SLOPE_ABSOLUTE__SLOPE_ABSOLUTE:
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
			case TimeContinuousPackage.SLOPE_ABSOLUTE__SLOPE_ABSOLUTE:
				setSlopeAbsolute((Double)newValue);
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
			case TimeContinuousPackage.SLOPE_ABSOLUTE__SLOPE_ABSOLUTE:
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
			case TimeContinuousPackage.SLOPE_ABSOLUTE__SLOPE_ABSOLUTE:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TimeContinuousPackage.SLOPE_ABSOLUTE___REFRESH_SLOPE_ABSOLUTE:
				refreshSlopeAbsolute();
				return null;
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
		result.append(" (SlopeAbsolute: ");
		result.append(slopeAbsolute);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#refreshSlopeAfter()
	 */
	@Override
	public void refreshSlopeAfter() {
		double slopeAfter = this.getSlopeAbsolute();
		this.setSlopeAfter(slopeAfter);
	}
	
	

} //SlopeAbsoluteImpl
