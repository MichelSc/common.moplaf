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

import java.util.Date;

import com.misc.common.moplaf.time.continuous.ChildEvent;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.ChildEventImpl#getOriginal <em>Original</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildEventImpl extends OwnedEventImpl implements ChildEvent {
	/**
	 * The cached value of the '{@link #getOriginal() <em>Original</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal()
	 * @generated
	 * @ordered
	 */
	protected DistributionEvent original;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildEventImpl() {
		super();
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousPackage.Literals.CHILD_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionEvent getOriginal() {
		if (original != null && original.eIsProxy()) {
			InternalEObject oldOriginal = (InternalEObject)original;
			original = (DistributionEvent)eResolveProxy(oldOriginal);
			if (original != oldOriginal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousPackage.CHILD_EVENT__ORIGINAL, oldOriginal, original));
			}
		}
		return original;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionEvent basicGetOriginal() {
		return original;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginal(DistributionEvent newOriginal) {
		DistributionEvent oldOriginal = original;
		original = newOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.CHILD_EVENT__ORIGINAL, oldOriginal, original));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousPackage.CHILD_EVENT__ORIGINAL:
				if (resolve) return getOriginal();
				return basicGetOriginal();
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
			case TimeContinuousPackage.CHILD_EVENT__ORIGINAL:
				setOriginal((DistributionEvent)newValue);
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
			case TimeContinuousPackage.CHILD_EVENT__ORIGINAL:
				setOriginal((DistributionEvent)null);
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
			case TimeContinuousPackage.CHILD_EVENT__ORIGINAL:
				return original != null;
		}
		return super.eIsSet(featureID);
	}
	


	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#refreshAmountAfter()
	 */
	@Override
	public void refreshAmountAfter() {
		if ( this.isAlive() ){
			DistributionEvent originalEvent = this.getOriginal();
			double amountAfter = this.getAmountBefore()
					          + originalEvent.getAmountAfter()
					          - originalEvent.getAmountBefore();
			this.setAmountAfter(amountAfter);
		}
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#refreshSlopeAfter()
	 */
	@Override
	public void refreshSlopeAfter() {
		if ( this.isAlive() ){
			DistributionEvent originalEvent = this.getOriginal();
			double slopeAfter = this.getSlopeBefore()
					         + originalEvent.getSlopeAfter()
					         - originalEvent.getSlopeBefore();
			this.setSlopeAfter(slopeAfter);
		}
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#refreshMoment()
	 */
	@Override
	public void refreshMoment() {
		if ( this.isAlive() ){
			DistributionEvent originalEvent = this.getOriginal();
			Date moment = originalEvent.getMoment();
			this.setMoment(moment);
		}
	}
	
	private boolean isAlive(){
		return this.eContainer()!=null;
	}
	
	

} //ChildEventImpl
