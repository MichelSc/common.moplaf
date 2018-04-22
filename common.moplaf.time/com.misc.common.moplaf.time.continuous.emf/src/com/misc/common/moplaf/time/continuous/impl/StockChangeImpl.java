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
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.ProvidedEvent;
import com.misc.common.moplaf.time.continuous.StockChange;
import com.misc.common.moplaf.time.continuous.StockChangeEnd;
import com.misc.common.moplaf.time.continuous.StockChangeStart;
import com.misc.common.moplaf.time.continuous.TimeContinuousFactory;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stock Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.StockChangeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.StockChangeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.StockChangeImpl#getSlope <em>Slope</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.StockChangeImpl#getStartEvent <em>Start Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.StockChangeImpl#getEndEvent <em>End Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StockChangeImpl extends EventsProviderImpl implements StockChange {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected static final double SLOPE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected double slope = SLOPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartEvent() <em>Start Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartEvent()
	 * @generated
	 * @ordered
	 */
	protected StockChangeStart startEvent;

	/**
	 * The cached value of the '{@link #getEndEvent() <em>End Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndEvent()
	 * @generated
	 * @ordered
	 */
	protected StockChangeEnd endEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockChangeImpl() {
		super();
	}

	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#addPropagatorFunctionAdapter()
	@Override
	public void addPropagatorFunctionAdapter() {
		super.addPropagatorFunctionAdapter();
	}
	 */

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousPackage.Literals.STOCK_CHANGE;
	}

	@Override
	public EList<ProvidedEvent> getProvidedEvents() {
		EObjectEList list = new EObjectEList(DistributionEvent.class, 
							                this, 
							                TimeContinuousPackage.EVENTS_PROVIDER__PROVIDED_EVENTS);
		ProvidedEvent startEvent = this.getStartEvent();
		if ( startEvent!=null) {
			list.add(startEvent);
		}
		ProvidedEvent endEvent = this.getEndEvent();
		if ( endEvent!=null) {
			list.add(endEvent);
		}
		return list;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.STOCK_CHANGE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.STOCK_CHANGE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlope() {
		return slope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlope(double newSlope) {
		double oldSlope = slope;
		slope = newSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.STOCK_CHANGE__SLOPE, oldSlope, slope));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockChangeStart getStartEvent() {
		return startEvent;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartEvent(StockChangeStart newStartEvent, NotificationChain msgs) {
		StockChangeStart oldStartEvent = startEvent;
		startEvent = newStartEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.STOCK_CHANGE__START_EVENT, oldStartEvent, newStartEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartEvent(StockChangeStart newStartEvent) {
		if (newStartEvent != startEvent) {
			NotificationChain msgs = null;
			if (startEvent != null)
				msgs = ((InternalEObject)startEvent).eInverseRemove(this, TimeContinuousPackage.STOCK_CHANGE_START__PROVIDER, StockChangeStart.class, msgs);
			if (newStartEvent != null)
				msgs = ((InternalEObject)newStartEvent).eInverseAdd(this, TimeContinuousPackage.STOCK_CHANGE_START__PROVIDER, StockChangeStart.class, msgs);
			msgs = basicSetStartEvent(newStartEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.STOCK_CHANGE__START_EVENT, newStartEvent, newStartEvent));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockChangeEnd getEndEvent() {
		return endEvent;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndEvent(StockChangeEnd newEndEvent, NotificationChain msgs) {
		StockChangeEnd oldEndEvent = endEvent;
		endEvent = newEndEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.STOCK_CHANGE__END_EVENT, oldEndEvent, newEndEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndEvent(StockChangeEnd newEndEvent) {
		if (newEndEvent != endEvent) {
			NotificationChain msgs = null;
			if (endEvent != null)
				msgs = ((InternalEObject)endEvent).eInverseRemove(this, TimeContinuousPackage.STOCK_CHANGE_END__PROVIDER, StockChangeEnd.class, msgs);
			if (newEndEvent != null)
				msgs = ((InternalEObject)newEndEvent).eInverseAdd(this, TimeContinuousPackage.STOCK_CHANGE_END__PROVIDER, StockChangeEnd.class, msgs);
			msgs = basicSetEndEvent(newEndEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.STOCK_CHANGE__END_EVENT, newEndEvent, newEndEvent));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimeContinuousPackage.STOCK_CHANGE__START_EVENT:
				if (startEvent != null)
					msgs = ((InternalEObject)startEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimeContinuousPackage.STOCK_CHANGE__START_EVENT, null, msgs);
				return basicSetStartEvent((StockChangeStart)otherEnd, msgs);
			case TimeContinuousPackage.STOCK_CHANGE__END_EVENT:
				if (endEvent != null)
					msgs = ((InternalEObject)endEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimeContinuousPackage.STOCK_CHANGE__END_EVENT, null, msgs);
				return basicSetEndEvent((StockChangeEnd)otherEnd, msgs);
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
			case TimeContinuousPackage.STOCK_CHANGE__START_EVENT:
				return basicSetStartEvent(null, msgs);
			case TimeContinuousPackage.STOCK_CHANGE__END_EVENT:
				return basicSetEndEvent(null, msgs);
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
			case TimeContinuousPackage.STOCK_CHANGE__START:
				return getStart();
			case TimeContinuousPackage.STOCK_CHANGE__END:
				return getEnd();
			case TimeContinuousPackage.STOCK_CHANGE__SLOPE:
				return getSlope();
			case TimeContinuousPackage.STOCK_CHANGE__START_EVENT:
				return getStartEvent();
			case TimeContinuousPackage.STOCK_CHANGE__END_EVENT:
				return getEndEvent();
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
			case TimeContinuousPackage.STOCK_CHANGE__START:
				setStart((Date)newValue);
				return;
			case TimeContinuousPackage.STOCK_CHANGE__END:
				setEnd((Date)newValue);
				return;
			case TimeContinuousPackage.STOCK_CHANGE__SLOPE:
				setSlope((Double)newValue);
				return;
			case TimeContinuousPackage.STOCK_CHANGE__START_EVENT:
				setStartEvent((StockChangeStart)newValue);
				return;
			case TimeContinuousPackage.STOCK_CHANGE__END_EVENT:
				setEndEvent((StockChangeEnd)newValue);
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
			case TimeContinuousPackage.STOCK_CHANGE__START:
				setStart(START_EDEFAULT);
				return;
			case TimeContinuousPackage.STOCK_CHANGE__END:
				setEnd(END_EDEFAULT);
				return;
			case TimeContinuousPackage.STOCK_CHANGE__SLOPE:
				setSlope(SLOPE_EDEFAULT);
				return;
			case TimeContinuousPackage.STOCK_CHANGE__START_EVENT:
				setStartEvent((StockChangeStart)null);
				return;
			case TimeContinuousPackage.STOCK_CHANGE__END_EVENT:
				setEndEvent((StockChangeEnd)null);
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
			case TimeContinuousPackage.STOCK_CHANGE__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case TimeContinuousPackage.STOCK_CHANGE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case TimeContinuousPackage.STOCK_CHANGE__SLOPE:
				return slope != SLOPE_EDEFAULT;
			case TimeContinuousPackage.STOCK_CHANGE__START_EVENT:
				return startEvent != null;
			case TimeContinuousPackage.STOCK_CHANGE__END_EVENT:
				return endEvent != null;
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
		result.append(" (Start: ");
		result.append(start);
		result.append(", End: ");
		result.append(end);
		result.append(", Slope: ");
		result.append(slope);
		result.append(')');
		return result.toString();
	}

	@Override
	public void refreshEvents() {
		Distribution distribution = this.getDistribution();
		if ( distribution == null){
			StockChangeStart oldstart = this.getStartEvent();
			if ( oldstart!=null){				
				this.setStartEvent(null);
			}
			StockChangeEnd oldend = this.getEndEvent();
			if ( oldend!=null){
				this.setEndEvent(null);
			}
		} else {
			if ( this.getStartEvent()==null){
				StockChangeStart newstart = TimeContinuousFactory.eINSTANCE.createStockChangeStart();
				newstart.setProvider(this);
			}
			if ( this.getEndEvent()==null){
				StockChangeEnd newend= TimeContinuousFactory.eINSTANCE.createStockChangeEnd();
				newend.setProvider(this);
			}
		}
	}
} //StockChangeImpl
