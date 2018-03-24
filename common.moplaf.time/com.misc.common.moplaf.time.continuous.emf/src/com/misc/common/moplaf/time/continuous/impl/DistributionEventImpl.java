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

import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribution Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#getMoment <em>Moment</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#getEventNr <em>Event Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#getNext <em>Next</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#getAmountBefore <em>Amount Before</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#getAmountAfter <em>Amount After</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#getSlopeBefore <em>Slope Before</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#getSlopeAfter <em>Slope After</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#getDistributionAsSequence <em>Distribution As Sequence</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#getDistributionAsProvidedEvent <em>Distribution As Provided Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DistributionEventImpl extends ObjectWithPropagatorFunctionsImpl implements DistributionEvent {
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
	 * The default value of the '{@link #getEventNr() <em>Event Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventNr()
	 * @generated
	 * @ordered
	 */
	protected static final int EVENT_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEventNr() <em>Event Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventNr()
	 * @generated
	 * @ordered
	 */
	protected int eventNr = EVENT_NR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected DistributionEvent next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected DistributionEvent previous;

	/**
	 * The default value of the '{@link #getAmountBefore() <em>Amount Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountBefore()
	 * @generated
	 * @ordered
	 */
	protected static final double AMOUNT_BEFORE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmountBefore() <em>Amount Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountBefore()
	 * @generated
	 * @ordered
	 */
	protected double amountBefore = AMOUNT_BEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountAfter() <em>Amount After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAfter()
	 * @generated
	 * @ordered
	 */
	protected static final double AMOUNT_AFTER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmountAfter() <em>Amount After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAfter()
	 * @generated
	 * @ordered
	 */
	protected double amountAfter = AMOUNT_AFTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlopeBefore() <em>Slope Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeBefore()
	 * @generated
	 * @ordered
	 */
	protected static final double SLOPE_BEFORE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSlopeBefore() <em>Slope Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeBefore()
	 * @generated
	 * @ordered
	 */
	protected double slopeBefore = SLOPE_BEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlopeAfter() <em>Slope After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeAfter()
	 * @generated
	 * @ordered
	 */
	protected static final double SLOPE_AFTER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSlopeAfter() <em>Slope After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeAfter()
	 * @generated
	 * @ordered
	 */
	protected double slopeAfter = SLOPE_AFTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDistributionAsSequence() <em>Distribution As Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionAsSequence()
	 * @generated
	 * @ordered
	 */
	protected Distribution distributionAsSequence;

	/**
	 * The cached value of the '{@link #getDistributionAsProvidedEvent() <em>Distribution As Provided Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionAsProvidedEvent()
	 * @generated
	 * @ordered
	 */
	protected Distribution distributionAsProvidedEvent;

	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @ordered
	 */
	protected Distribution distribution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousPackage.Literals.DISTRIBUTION_EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.DISTRIBUTION_EVENT__MOMENT, oldMoment, moment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEventNr() {
		return eventNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventNr(int newEventNr) {
		int oldEventNr = eventNr;
		eventNr = newEventNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.DISTRIBUTION_EVENT__EVENT_NR, oldEventNr, eventNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionEvent getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (DistributionEvent)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousPackage.DISTRIBUTION_EVENT__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionEvent basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(DistributionEvent newNext, NotificationChain msgs) {
		DistributionEvent oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.DISTRIBUTION_EVENT__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(DistributionEvent newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, TimeContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS, DistributionEvent.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, TimeContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS, DistributionEvent.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.DISTRIBUTION_EVENT__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionEvent getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (DistributionEvent)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionEvent basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(DistributionEvent newPrevious, NotificationChain msgs) {
		DistributionEvent oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(DistributionEvent newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, TimeContinuousPackage.DISTRIBUTION_EVENT__NEXT, DistributionEvent.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, TimeContinuousPackage.DISTRIBUTION_EVENT__NEXT, DistributionEvent.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAmountBefore() {
		return amountBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountBefore(double newAmountBefore) {
		double oldAmountBefore = amountBefore;
		amountBefore = newAmountBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_BEFORE, oldAmountBefore, amountBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAmountAfter() {
		return amountAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountAfter(double newAmountAfter) {
		double oldAmountAfter = amountAfter;
		amountAfter = newAmountAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_AFTER, oldAmountAfter, amountAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlopeBefore() {
		return slopeBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlopeBefore(double newSlopeBefore) {
		double oldSlopeBefore = slopeBefore;
		slopeBefore = newSlopeBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.DISTRIBUTION_EVENT__SLOPE_BEFORE, oldSlopeBefore, slopeBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlopeAfter() {
		return slopeAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlopeAfter(double newSlopeAfter) {
		double oldSlopeAfter = slopeAfter;
		slopeAfter = newSlopeAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.DISTRIBUTION_EVENT__SLOPE_AFTER, oldSlopeAfter, slopeAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("Event(%1$ty-%1$tm-%1$td %1$tH-%1$tM-%1$tS, %2$.2f, %3$.2f)", this.getMoment(), this.getAmountBefore(), this.getAmountAfter());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution getDistributionAsSequence() {
		if (distributionAsSequence != null && distributionAsSequence.eIsProxy()) {
			InternalEObject oldDistributionAsSequence = (InternalEObject)distributionAsSequence;
			distributionAsSequence = (Distribution)eResolveProxy(oldDistributionAsSequence);
			if (distributionAsSequence != oldDistributionAsSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE, oldDistributionAsSequence, distributionAsSequence));
			}
		}
		return distributionAsSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution basicGetDistributionAsSequence() {
		return distributionAsSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistributionAsSequence(Distribution newDistributionAsSequence, NotificationChain msgs) {
		Distribution oldDistributionAsSequence = distributionAsSequence;
		distributionAsSequence = newDistributionAsSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE, oldDistributionAsSequence, newDistributionAsSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistributionAsSequence(Distribution newDistributionAsSequence) {
		if (newDistributionAsSequence != distributionAsSequence) {
			NotificationChain msgs = null;
			if (distributionAsSequence != null)
				msgs = ((InternalEObject)distributionAsSequence).eInverseRemove(this, TimeContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS, Distribution.class, msgs);
			if (newDistributionAsSequence != null)
				msgs = ((InternalEObject)newDistributionAsSequence).eInverseAdd(this, TimeContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS, Distribution.class, msgs);
			msgs = basicSetDistributionAsSequence(newDistributionAsSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE, newDistributionAsSequence, newDistributionAsSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution getDistribution() {
		Distribution distribution = basicGetDistribution();
		return distribution != null && distribution.eIsProxy() ? (Distribution)eResolveProxy((InternalEObject)distribution) : distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution basicGetDistribution() {
		// TODO: implement this method to return the 'Distribution' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution getDistributionAsProvidedEvent() {
		if (distributionAsProvidedEvent != null && distributionAsProvidedEvent.eIsProxy()) {
			InternalEObject oldDistributionAsProvidedEvent = (InternalEObject)distributionAsProvidedEvent;
			distributionAsProvidedEvent = (Distribution)eResolveProxy(oldDistributionAsProvidedEvent);
			if (distributionAsProvidedEvent != oldDistributionAsProvidedEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT, oldDistributionAsProvidedEvent, distributionAsProvidedEvent));
			}
		}
		return distributionAsProvidedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution basicGetDistributionAsProvidedEvent() {
		return distributionAsProvidedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistributionAsProvidedEvent(Distribution newDistributionAsProvidedEvent, NotificationChain msgs) {
		Distribution oldDistributionAsProvidedEvent = distributionAsProvidedEvent;
		distributionAsProvidedEvent = newDistributionAsProvidedEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT, oldDistributionAsProvidedEvent, newDistributionAsProvidedEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistributionAsProvidedEvent(Distribution newDistributionAsProvidedEvent) {
		if (newDistributionAsProvidedEvent != distributionAsProvidedEvent) {
			NotificationChain msgs = null;
			if (distributionAsProvidedEvent != null)
				msgs = ((InternalEObject)distributionAsProvidedEvent).eInverseRemove(this, TimeContinuousPackage.DISTRIBUTION__PROVIDED_EVENTS, Distribution.class, msgs);
			if (newDistributionAsProvidedEvent != null)
				msgs = ((InternalEObject)newDistributionAsProvidedEvent).eInverseAdd(this, TimeContinuousPackage.DISTRIBUTION__PROVIDED_EVENTS, Distribution.class, msgs);
			msgs = basicSetDistributionAsProvidedEvent(newDistributionAsProvidedEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT, newDistributionAsProvidedEvent, newDistributionAsProvidedEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getAmountBefore(Date moment) {
		Distribution distribution = this.getDistributionAsSequence();
		double amountBefore = this.getAmountBefore();
		double slopeBefore  = this.getSlopeBefore();
		double duration = distribution.getDuration(moment, this.getMoment());
		double amount = amountBefore-duration*slopeBefore;
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getAmountAfter(Date moment) {
		Distribution distribution = this.getDistributionAsSequence();
		double amountAfter = this.getAmountAfter();
		double slopeAfter = this.getSlopeAfter();
		double duration = distribution.getDuration(this.getMoment(), moment );
		double amount   = amountAfter+duration*slopeAfter;
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isBefore(DistributionEvent other) {
		boolean isBefore = this.getEventNr()<=other.getEventNr();
		return isBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isStrictBefore(DistributionEvent other) {
		boolean isBefore = this.getEventNr()<other.getEventNr();
		return isBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSlopeBefore() {
		DistributionEvent previous = this.getPrevious();
		if ( previous==null){
			// value of AmountBefore is undetermined
			// as it is not part of the sequence
			return;
		}
		double slopeBefore = previous.getSlopeAfter();
		this.setSlopeBefore(slopeBefore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshAmountBefore() {
		DistributionEvent previous = this.getPrevious();
		if ( previous==null){
			// value of AmountBefore is undetermined
			// as it is not part of the sequence
			return;
		}
		double slopeBefore = this.getSlopeBefore();
		double durationBefore = this.getDistributionAsSequence().getDuration(previous.getMoment(), this.getMoment());
		double amount = slopeBefore*durationBefore+previous.getAmountAfter();
		this.setAmountBefore(amount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshAmountAfter() {
		double amountAfter = this.getAmountBefore();
		this.setAmountAfter(amountAfter);;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSlopeAfter() {
		double slopeAfter = this.getSlopeBefore();
		this.setSlopeAfter(slopeAfter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshMoment() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimeContinuousPackage.DISTRIBUTION_EVENT__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, TimeContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS, DistributionEvent.class, msgs);
				return basicSetNext((DistributionEvent)otherEnd, msgs);
			case TimeContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, TimeContinuousPackage.DISTRIBUTION_EVENT__NEXT, DistributionEvent.class, msgs);
				return basicSetPrevious((DistributionEvent)otherEnd, msgs);
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE:
				if (distributionAsSequence != null)
					msgs = ((InternalEObject)distributionAsSequence).eInverseRemove(this, TimeContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS, Distribution.class, msgs);
				return basicSetDistributionAsSequence((Distribution)otherEnd, msgs);
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT:
				if (distributionAsProvidedEvent != null)
					msgs = ((InternalEObject)distributionAsProvidedEvent).eInverseRemove(this, TimeContinuousPackage.DISTRIBUTION__PROVIDED_EVENTS, Distribution.class, msgs);
				return basicSetDistributionAsProvidedEvent((Distribution)otherEnd, msgs);
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
			case TimeContinuousPackage.DISTRIBUTION_EVENT__NEXT:
				return basicSetNext(null, msgs);
			case TimeContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE:
				return basicSetDistributionAsSequence(null, msgs);
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT:
				return basicSetDistributionAsProvidedEvent(null, msgs);
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
			case TimeContinuousPackage.DISTRIBUTION_EVENT__MOMENT:
				return getMoment();
			case TimeContinuousPackage.DISTRIBUTION_EVENT__EVENT_NR:
				return getEventNr();
			case TimeContinuousPackage.DISTRIBUTION_EVENT__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case TimeContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case TimeContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_BEFORE:
				return getAmountBefore();
			case TimeContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_AFTER:
				return getAmountAfter();
			case TimeContinuousPackage.DISTRIBUTION_EVENT__SLOPE_BEFORE:
				return getSlopeBefore();
			case TimeContinuousPackage.DISTRIBUTION_EVENT__SLOPE_AFTER:
				return getSlopeAfter();
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DESCRIPTION:
				return getDescription();
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE:
				if (resolve) return getDistributionAsSequence();
				return basicGetDistributionAsSequence();
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION:
				if (resolve) return getDistribution();
				return basicGetDistribution();
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT:
				if (resolve) return getDistributionAsProvidedEvent();
				return basicGetDistributionAsProvidedEvent();
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
			case TimeContinuousPackage.DISTRIBUTION_EVENT__MOMENT:
				setMoment((Date)newValue);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__EVENT_NR:
				setEventNr((Integer)newValue);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__NEXT:
				setNext((DistributionEvent)newValue);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS:
				setPrevious((DistributionEvent)newValue);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_BEFORE:
				setAmountBefore((Double)newValue);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_AFTER:
				setAmountAfter((Double)newValue);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__SLOPE_BEFORE:
				setSlopeBefore((Double)newValue);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__SLOPE_AFTER:
				setSlopeAfter((Double)newValue);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE:
				setDistributionAsSequence((Distribution)newValue);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT:
				setDistributionAsProvidedEvent((Distribution)newValue);
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
			case TimeContinuousPackage.DISTRIBUTION_EVENT__MOMENT:
				setMoment(MOMENT_EDEFAULT);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__EVENT_NR:
				setEventNr(EVENT_NR_EDEFAULT);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__NEXT:
				setNext((DistributionEvent)null);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS:
				setPrevious((DistributionEvent)null);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_BEFORE:
				setAmountBefore(AMOUNT_BEFORE_EDEFAULT);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_AFTER:
				setAmountAfter(AMOUNT_AFTER_EDEFAULT);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__SLOPE_BEFORE:
				setSlopeBefore(SLOPE_BEFORE_EDEFAULT);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__SLOPE_AFTER:
				setSlopeAfter(SLOPE_AFTER_EDEFAULT);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE:
				setDistributionAsSequence((Distribution)null);
				return;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT:
				setDistributionAsProvidedEvent((Distribution)null);
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
			case TimeContinuousPackage.DISTRIBUTION_EVENT__MOMENT:
				return MOMENT_EDEFAULT == null ? moment != null : !MOMENT_EDEFAULT.equals(moment);
			case TimeContinuousPackage.DISTRIBUTION_EVENT__EVENT_NR:
				return eventNr != EVENT_NR_EDEFAULT;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__NEXT:
				return next != null;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS:
				return previous != null;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_BEFORE:
				return amountBefore != AMOUNT_BEFORE_EDEFAULT;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_AFTER:
				return amountAfter != AMOUNT_AFTER_EDEFAULT;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__SLOPE_BEFORE:
				return slopeBefore != SLOPE_BEFORE_EDEFAULT;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__SLOPE_AFTER:
				return slopeAfter != SLOPE_AFTER_EDEFAULT;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE:
				return distributionAsSequence != null;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION:
				return basicGetDistribution() != null;
			case TimeContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT:
				return distributionAsProvidedEvent != null;
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
			case TimeContinuousPackage.DISTRIBUTION_EVENT___GET_AMOUNT_BEFORE__DATE:
				return getAmountBefore((Date)arguments.get(0));
			case TimeContinuousPackage.DISTRIBUTION_EVENT___GET_AMOUNT_AFTER__DATE:
				return getAmountAfter((Date)arguments.get(0));
			case TimeContinuousPackage.DISTRIBUTION_EVENT___IS_BEFORE__DISTRIBUTIONEVENT:
				return isBefore((DistributionEvent)arguments.get(0));
			case TimeContinuousPackage.DISTRIBUTION_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT:
				return isStrictBefore((DistributionEvent)arguments.get(0));
			case TimeContinuousPackage.DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE:
				refreshSlopeBefore();
				return null;
			case TimeContinuousPackage.DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE:
				refreshAmountBefore();
				return null;
			case TimeContinuousPackage.DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER:
				refreshAmountAfter();
				return null;
			case TimeContinuousPackage.DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER:
				refreshSlopeAfter();
				return null;
			case TimeContinuousPackage.DISTRIBUTION_EVENT___REFRESH_MOMENT:
				refreshMoment();
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
		result.append(" (Moment: ");
		result.append(moment);
		result.append(", EventNr: ");
		result.append(eventNr);
		result.append(", AmountBefore: ");
		result.append(amountBefore);
		result.append(", AmountAfter: ");
		result.append(amountAfter);
		result.append(", SlopeBefore: ");
		result.append(slopeBefore);
		result.append(", SlopeAfter: ");
		result.append(slopeAfter);
		result.append(')');
		return result.toString();
	}

} //DistributionEventImpl
