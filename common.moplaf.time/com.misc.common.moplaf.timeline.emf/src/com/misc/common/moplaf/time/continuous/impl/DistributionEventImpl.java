/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountBefore;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventDescription;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeBefore;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#getDistributionAsProvidedEvent <em>Distribution As Provided Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DistributionEventImpl extends MinimalEObjectImpl.Container implements DistributionEvent {
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
	protected static final float AMOUNT_BEFORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmountBefore() <em>Amount Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountBefore()
	 * @generated
	 * @ordered
	 */
	protected float amountBefore = AMOUNT_BEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountAfter() <em>Amount After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAfter()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_AFTER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmountAfter() <em>Amount After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAfter()
	 * @generated
	 * @ordered
	 */
	protected float amountAfter = AMOUNT_AFTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlopeBefore() <em>Slope Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeBefore()
	 * @generated
	 * @ordered
	 */
	protected static final float SLOPE_BEFORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSlopeBefore() <em>Slope Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeBefore()
	 * @generated
	 * @ordered
	 */
	protected float slopeBefore = SLOPE_BEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlopeAfter() <em>Slope After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeAfter()
	 * @generated
	 * @ordered
	 */
	protected static final float SLOPE_AFTER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSlopeAfter() <em>Slope After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeAfter()
	 * @generated
	 * @ordered
	 */
	protected float slopeAfter = SLOPE_AFTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
		return ContinuousPackage.Literals.DISTRIBUTION_EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__MOMENT, oldMoment, moment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__EVENT_NR, oldEventNr, eventNr));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContinuousPackage.DISTRIBUTION_EVENT__NEXT, oldNext, next));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__NEXT, oldNext, newNext);
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
				msgs = ((InternalEObject)next).eInverseRemove(this, ContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS, DistributionEvent.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, ContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS, DistributionEvent.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__NEXT, newNext, newNext));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS, oldPrevious, previous));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS, oldPrevious, newPrevious);
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
				msgs = ((InternalEObject)previous).eInverseRemove(this, ContinuousPackage.DISTRIBUTION_EVENT__NEXT, DistributionEvent.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, ContinuousPackage.DISTRIBUTION_EVENT__NEXT, DistributionEvent.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmountBefore() {
		return amountBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountBefore(float newAmountBefore) {
		float oldAmountBefore = amountBefore;
		amountBefore = newAmountBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_BEFORE, oldAmountBefore, amountBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmountAfter() {
		return amountAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountAfter(float newAmountAfter) {
		float oldAmountAfter = amountAfter;
		amountAfter = newAmountAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_AFTER, oldAmountAfter, amountAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSlopeBefore() {
		return slopeBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlopeBefore(float newSlopeBefore) {
		float oldSlopeBefore = slopeBefore;
		slopeBefore = newSlopeBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__SLOPE_BEFORE, oldSlopeBefore, slopeBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSlopeAfter() {
		return slopeAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlopeAfter(float newSlopeAfter) {
		float oldSlopeAfter = slopeAfter;
		slopeAfter = newSlopeAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__SLOPE_AFTER, oldSlopeAfter, slopeAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE, oldDistributionAsSequence, distributionAsSequence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE, oldDistributionAsSequence, newDistributionAsSequence);
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
				msgs = ((InternalEObject)distributionAsSequence).eInverseRemove(this, ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS, Distribution.class, msgs);
			if (newDistributionAsSequence != null)
				msgs = ((InternalEObject)newDistributionAsSequence).eInverseAdd(this, ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS, Distribution.class, msgs);
			msgs = basicSetDistributionAsSequence(newDistributionAsSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE, newDistributionAsSequence, newDistributionAsSequence));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT, oldDistributionAsProvidedEvent, distributionAsProvidedEvent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT, oldDistributionAsProvidedEvent, newDistributionAsProvidedEvent);
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
				msgs = ((InternalEObject)distributionAsProvidedEvent).eInverseRemove(this, ContinuousPackage.DISTRIBUTION__PROVIDED_EVENTS, Distribution.class, msgs);
			if (newDistributionAsProvidedEvent != null)
				msgs = ((InternalEObject)newDistributionAsProvidedEvent).eInverseAdd(this, ContinuousPackage.DISTRIBUTION__PROVIDED_EVENTS, Distribution.class, msgs);
			msgs = basicSetDistributionAsProvidedEvent(newDistributionAsProvidedEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT, newDistributionAsProvidedEvent, newDistributionAsProvidedEvent));
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
		float slopeBefore = previous.getSlopeAfter();
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
		float slopeBefore = this.getSlopeBefore();
		float durationBefore = this.getDistributionAsSequence().getDuration(previous.getMoment(), this.getMoment());
		float amount = slopeBefore*durationBefore+previous.getAmountAfter();
		this.setAmountBefore(amount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshAmountAfter() {
		float amountAfter = this.getAmountBefore();
		this.setAmountAfter(amountAfter);;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSlopeAfter() {
		float slopeAfter = this.getSlopeBefore();
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
	 */
	public void refreshDescription() {
		String description = String.format("Event(%1$ty-%1$tm-%1$td %1$tH-%1$tM-%1$tS, %2$.2f, %3$.2f)", this.getMoment(), this.getAmountBefore(), this.getAmountAfter());
		this.setDescription(description);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunctionAdapter() {
		Util.adapt(this, PropagatorCalcEventSlopeBefore.class);
		Util.adapt(this, PropagatorCalcEventAmountBefore.class);
		Util.adapt(this, PropagatorCalcEventSlopeAfter.class);
		Util.adapt(this, PropagatorCalcEventAmountAfter.class);
		Util.adapt(this, PropagatorCalcEventDescription.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContinuousPackage.DISTRIBUTION_EVENT__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, ContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS, DistributionEvent.class, msgs);
				return basicSetNext((DistributionEvent)otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, ContinuousPackage.DISTRIBUTION_EVENT__NEXT, DistributionEvent.class, msgs);
				return basicSetPrevious((DistributionEvent)otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE:
				if (distributionAsSequence != null)
					msgs = ((InternalEObject)distributionAsSequence).eInverseRemove(this, ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS, Distribution.class, msgs);
				return basicSetDistributionAsSequence((Distribution)otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT:
				if (distributionAsProvidedEvent != null)
					msgs = ((InternalEObject)distributionAsProvidedEvent).eInverseRemove(this, ContinuousPackage.DISTRIBUTION__PROVIDED_EVENTS, Distribution.class, msgs);
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
			case ContinuousPackage.DISTRIBUTION_EVENT__NEXT:
				return basicSetNext(null, msgs);
			case ContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE:
				return basicSetDistributionAsSequence(null, msgs);
			case ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT:
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
			case ContinuousPackage.DISTRIBUTION_EVENT__MOMENT:
				return getMoment();
			case ContinuousPackage.DISTRIBUTION_EVENT__EVENT_NR:
				return getEventNr();
			case ContinuousPackage.DISTRIBUTION_EVENT__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case ContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case ContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_BEFORE:
				return getAmountBefore();
			case ContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_AFTER:
				return getAmountAfter();
			case ContinuousPackage.DISTRIBUTION_EVENT__SLOPE_BEFORE:
				return getSlopeBefore();
			case ContinuousPackage.DISTRIBUTION_EVENT__SLOPE_AFTER:
				return getSlopeAfter();
			case ContinuousPackage.DISTRIBUTION_EVENT__DESCRIPTION:
				return getDescription();
			case ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE:
				if (resolve) return getDistributionAsSequence();
				return basicGetDistributionAsSequence();
			case ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT:
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
			case ContinuousPackage.DISTRIBUTION_EVENT__MOMENT:
				setMoment((Date)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__EVENT_NR:
				setEventNr((Integer)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__NEXT:
				setNext((DistributionEvent)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS:
				setPrevious((DistributionEvent)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_BEFORE:
				setAmountBefore((Float)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_AFTER:
				setAmountAfter((Float)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__SLOPE_BEFORE:
				setSlopeBefore((Float)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__SLOPE_AFTER:
				setSlopeAfter((Float)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE:
				setDistributionAsSequence((Distribution)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT:
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
			case ContinuousPackage.DISTRIBUTION_EVENT__MOMENT:
				setMoment(MOMENT_EDEFAULT);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__EVENT_NR:
				setEventNr(EVENT_NR_EDEFAULT);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__NEXT:
				setNext((DistributionEvent)null);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS:
				setPrevious((DistributionEvent)null);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_BEFORE:
				setAmountBefore(AMOUNT_BEFORE_EDEFAULT);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_AFTER:
				setAmountAfter(AMOUNT_AFTER_EDEFAULT);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__SLOPE_BEFORE:
				setSlopeBefore(SLOPE_BEFORE_EDEFAULT);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__SLOPE_AFTER:
				setSlopeAfter(SLOPE_AFTER_EDEFAULT);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE:
				setDistributionAsSequence((Distribution)null);
				return;
			case ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT:
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
			case ContinuousPackage.DISTRIBUTION_EVENT__MOMENT:
				return MOMENT_EDEFAULT == null ? moment != null : !MOMENT_EDEFAULT.equals(moment);
			case ContinuousPackage.DISTRIBUTION_EVENT__EVENT_NR:
				return eventNr != EVENT_NR_EDEFAULT;
			case ContinuousPackage.DISTRIBUTION_EVENT__NEXT:
				return next != null;
			case ContinuousPackage.DISTRIBUTION_EVENT__PREVIOUS:
				return previous != null;
			case ContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_BEFORE:
				return amountBefore != AMOUNT_BEFORE_EDEFAULT;
			case ContinuousPackage.DISTRIBUTION_EVENT__AMOUNT_AFTER:
				return amountAfter != AMOUNT_AFTER_EDEFAULT;
			case ContinuousPackage.DISTRIBUTION_EVENT__SLOPE_BEFORE:
				return slopeBefore != SLOPE_BEFORE_EDEFAULT;
			case ContinuousPackage.DISTRIBUTION_EVENT__SLOPE_AFTER:
				return slopeAfter != SLOPE_AFTER_EDEFAULT;
			case ContinuousPackage.DISTRIBUTION_EVENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE:
				return distributionAsSequence != null;
			case ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT:
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
			case ContinuousPackage.DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE:
				refreshSlopeBefore();
				return null;
			case ContinuousPackage.DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE:
				refreshAmountBefore();
				return null;
			case ContinuousPackage.DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER:
				refreshAmountAfter();
				return null;
			case ContinuousPackage.DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER:
				refreshSlopeAfter();
				return null;
			case ContinuousPackage.DISTRIBUTION_EVENT___REFRESH_MOMENT:
				refreshMoment();
				return null;
			case ContinuousPackage.DISTRIBUTION_EVENT___REFRESH_DESCRIPTION:
				refreshDescription();
				return null;
			case ContinuousPackage.DISTRIBUTION_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER:
				addPropagatorFunctionAdapter();
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
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DistributionEventImpl
