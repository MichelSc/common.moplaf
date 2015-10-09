/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ChildEvent;
import com.misc.common.moplaf.time.continuous.CompositeDistributionEvent;
import com.misc.common.moplaf.time.continuous.ContinuousFactory;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.EndEvent;
import com.misc.common.moplaf.time.continuous.StartEvent;
import com.misc.common.moplaf.time.continuous.TimeUnit;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionChildEvents;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionInitialization;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAtomicEvents;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionDescriptions;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes;
import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getHorizonStart <em>Horizon Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getHorizonEnd <em>Horizon End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getAtomicEvent <em>Atomic Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getChildEvent <em>Child Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getSequenceEvent <em>Sequence Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getCompositeEvent <em>Composite Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getParentDistribution <em>Parent Distribution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getChildDistribution <em>Child Distribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistributionImpl extends MinimalEObjectImpl.Container implements Distribution {
	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit TIME_UNIT_EDEFAULT = TimeUnit.HOUR;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit timeUnit = TIME_UNIT_EDEFAULT;


	/**
	 * The default value of the '{@link #getHorizonStart() <em>Horizon Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizonStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date HORIZON_START_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2000-01-01");

	/**
	 * The cached value of the '{@link #getHorizonStart() <em>Horizon Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizonStart()
	 * @generated
	 * @ordered
	 */
	protected Date horizonStart = HORIZON_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizonEnd() <em>Horizon End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizonEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date HORIZON_END_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2099-12-31");

	/**
	 * The cached value of the '{@link #getHorizonEnd() <em>Horizon End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizonEnd()
	 * @generated
	 * @ordered
	 */
	protected Date horizonEnd = HORIZON_END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAtomicEvent() <em>Atomic Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomicEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionEvent> atomicEvent;

	/**
	 * The cached value of the '{@link #getChildEvent() <em>Child Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildEvent> childEvent;

	/**
	 * The cached value of the '{@link #getSequenceEvent() <em>Sequence Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionEvent> sequenceEvent;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected StartEvent start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected EndEvent end;

	/**
	 * The cached value of the '{@link #getCompositeEvent() <em>Composite Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeDistributionEvent> compositeEvent;

	/**
	 * The cached value of the '{@link #getParentDistribution() <em>Parent Distribution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDistribution()
	 * @generated
	 * @ordered
	 */
	protected Distribution parentDistribution;

	/**
	 * The cached value of the '{@link #getChildDistribution() <em>Child Distribution</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildDistribution()
	 * @generated
	 * @ordered
	 */
	protected EList<Distribution> childDistribution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistributionEvent> getAtomicEvent() {
		if (atomicEvent == null) {
			atomicEvent = new EObjectWithInverseResolvingEList<DistributionEvent>(DistributionEvent.class, this, ContinuousPackage.DISTRIBUTION__ATOMIC_EVENT, ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION);
		}
		return atomicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvent getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(StartEvent newStart, NotificationChain msgs) {
		StartEvent oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(StartEvent newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, ContinuousPackage.START_EVENT__DISTRIBUTION_AS_START, StartEvent.class, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, ContinuousPackage.START_EVENT__DISTRIBUTION_AS_START, StartEvent.class, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(EndEvent newEnd, NotificationChain msgs) {
		EndEvent oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(EndEvent newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, ContinuousPackage.END_EVENT__DISTRIBUTION_AS_END, EndEvent.class, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, ContinuousPackage.END_EVENT__DISTRIBUTION_AS_END, EndEvent.class, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getTimeUnit() {
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnit(TimeUnit newTimeUnit) {
		TimeUnit oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getHorizonStart() {
		return horizonStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizonStart(Date newHorizonStart) {
		Date oldHorizonStart = horizonStart;
		horizonStart = newHorizonStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION__HORIZON_START, oldHorizonStart, horizonStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getHorizonEnd() {
		return horizonEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizonEnd(Date newHorizonEnd) {
		Date oldHorizonEnd = horizonEnd;
		horizonEnd = newHorizonEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION__HORIZON_END, oldHorizonEnd, horizonEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistributionEvent> getSequenceEvent() {
		if (sequenceEvent == null) {
			sequenceEvent = new EObjectResolvingEList<DistributionEvent>(DistributionEvent.class, this, ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENT);
		}
		return sequenceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeDistributionEvent> getCompositeEvent() {
		if (compositeEvent == null) {
			compositeEvent = new EObjectWithInverseResolvingEList<CompositeDistributionEvent>(CompositeDistributionEvent.class, this, ContinuousPackage.DISTRIBUTION__COMPOSITE_EVENT, ContinuousPackage.COMPOSITE_DISTRIBUTION_EVENT__DISTRIBUTION);
		}
		return compositeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChildEvent> getChildEvent() {
		if (childEvent == null) {
			childEvent = new EObjectContainmentEList<ChildEvent>(ChildEvent.class, this, ContinuousPackage.DISTRIBUTION__CHILD_EVENT);
		}
		return childEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution getParentDistribution() {
		if (parentDistribution != null && parentDistribution.eIsProxy()) {
			InternalEObject oldParentDistribution = (InternalEObject)parentDistribution;
			parentDistribution = (Distribution)eResolveProxy(oldParentDistribution);
			if (parentDistribution != oldParentDistribution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION, oldParentDistribution, parentDistribution));
			}
		}
		return parentDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution basicGetParentDistribution() {
		return parentDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentDistribution(Distribution newParentDistribution, NotificationChain msgs) {
		Distribution oldParentDistribution = parentDistribution;
		parentDistribution = newParentDistribution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION, oldParentDistribution, newParentDistribution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentDistribution(Distribution newParentDistribution) {
		if (newParentDistribution != parentDistribution) {
			NotificationChain msgs = null;
			if (parentDistribution != null)
				msgs = ((InternalEObject)parentDistribution).eInverseRemove(this, ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION, Distribution.class, msgs);
			if (newParentDistribution != null)
				msgs = ((InternalEObject)newParentDistribution).eInverseAdd(this, ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION, Distribution.class, msgs);
			msgs = basicSetParentDistribution(newParentDistribution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION, newParentDistribution, newParentDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Distribution> getChildDistribution() {
		if (childDistribution == null) {
			childDistribution = new EObjectWithInverseResolvingEList<Distribution>(Distribution.class, this, ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION, ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION);
		}
		return childDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getDuration(Date from, Date to) {
		float millis = (float)(to.getTime()-from.getTime());
		float duration = 0.0f;
		switch ( this.getTimeUnit()){
		case DAY :
			duration = millis/1000.0f/60.0f/60.0f/24.0f;
			break;
		case HOUR :
			duration = millis/1000.0f/60.0f/60.0f;
			break;
		case MINUTE :
			duration = millis/1000.0f/60.0f;
			break;
		case SECOND :
			duration = millis/1000.0f;
			break;
		case MILLI :
			duration = millis;
			break;
		}
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DistributionEvent getEventBefore(Date time) {
		DistributionEvent currentEvent = this.getEnd();
		while (currentEvent!=null){
			if ( currentEvent.getMoment().compareTo(time)<0 ){
				return currentEvent;
			}
			currentEvent = currentEvent.getPrevious();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DistributionEvent getEventAfter(Date time) {
		DistributionEvent currentEvent = this.getStart();
		while (currentEvent!=null){
			if ( currentEvent.getMoment().compareTo(time)>0 ){
				return currentEvent;
			}
			currentEvent = currentEvent.getNext();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getAmountBefore(Date time) {
		DistributionEvent eventBefore = this.getEventBefore(time);
		float durationFromBefore = this.getDuration(eventBefore.getMoment(), time);
		float amountAtBefore = eventBefore.getAmountAfter();
		float slopeAtBefore = eventBefore.getSlopeAfter();
		float amount = amountAtBefore+durationFromBefore*slopeAtBefore;
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getAmountAfter(Date time) {
		DistributionEvent eventAfter = this.getEventAfter(time);
		float durationToAfter = this.getDuration(time, eventAfter.getMoment());
		float amountAtAfter = eventAfter.getAmountBefore();
		float slopeAtAfter = eventAfter.getSlopeBefore();
		float amount = amountAtAfter-durationToAfter*slopeAtAfter;
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getSlopeBefore(Date time) {
		DistributionEvent eventBefore = this.getEventBefore(time);
		float slopeAtBefore = eventBefore.getSlopeAfter();
		return slopeAtBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getSlopeAfter(Date time) {
		DistributionEvent eventAfter = this.getEventAfter(time);
		float slopeAtAfter = eventAfter.getSlopeBefore();
		return slopeAtAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinAmount(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxAmount(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAverageAmount(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getIntegralAmount(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshInit() {
		refreshStart();
		refreshEnd();
	}

	private void refreshStart() {
		if ( this.getStart()==null){
			StartEvent start = ContinuousFactory.eINSTANCE.createStartEvent();
			start.setDistribution(this);
			this.setStart(start);
		}
	}
	
	private void refreshEnd() {
		if ( this.getEnd()==null){
			EndEvent end = ContinuousFactory.eINSTANCE.createEndEvent();
			end.setDistribution(this);
			this.setEnd(end);
		}
	}

	private void refreshSequenceEventContent() {
		HashSet<DistributionEvent> eventstobe = new HashSet<DistributionEvent>();

		for(DistributionEvent currentEvent : this.getAtomicEvent()){
			Date moment = currentEvent.getMoment();
			if( moment!=null
			 && moment.compareTo(this.getHorizonStart())>=0
			 && moment.compareTo(this.getHorizonEnd())<=0 ){
				eventstobe.add(currentEvent);
			}
		}

		EList<DistributionEvent> eventsasis = this.getSequenceEvent();
		eventsasis.retainAll(eventstobe);
		eventstobe.removeAll(eventsasis);
		eventsasis.addAll(eventstobe);
	}
	
	private void refreshSequenceEventSort() {
		ECollections.sort(this.getSequenceEvent(), 
				         new Comparator<DistributionEvent>(){

							@Override
							public int compare(DistributionEvent arg0,
									           DistributionEvent arg1) {
								Date moment0 = arg0.getMoment();
								Date moment1 = arg1.getMoment();
								return moment0.compareTo(moment1);
							}});
		
	}
	
	private void refreshSequenceEventNextPrevious() {
		DistributionEvent previousEvent = null;
		int eventNr = 0;
		for(DistributionEvent currentEvent : this.getSequenceEvent()){
			currentEvent.setEventNr(eventNr);
			currentEvent.setPrevious(previousEvent);
			eventNr++;
			previousEvent = currentEvent;
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSequence() {
		this.refreshSequenceEventContent();
		this.refreshSequenceEventSort();
		this.refreshSequenceEventNextPrevious();
	}
	
			

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshChildEvent() {
		// to be events
		HashSet<DistributionEvent> childEventsToBe = new HashSet<DistributionEvent>();
		for ( Distribution childDistribution : this.getChildDistribution()){
			for ( DistributionEvent childEvent : childDistribution.getAtomicEvent()){
				childEventsToBe.add(childEvent);
			}
		}
		
		// as is events
		Iterator<ChildEvent> childEventIter = this.getChildEvent().iterator();
		while ( childEventIter.hasNext()){
			ChildEvent childEventAsIs = childEventIter.next();
			DistributionEvent originalEvent = childEventAsIs.getOriginal();
			if ( originalEvent==null || !childEventsToBe.contains(originalEvent)){
				// the original event is not to be: remove the derived event
				childEventAsIs.setDistribution(null);
				childEventAsIs.setOriginal(null);
				childEventIter.remove();
			} else {
				// the original event does not need to be created
				 childEventsToBe.remove(originalEvent);
			}
		}
		
		// create the child event
		for ( DistributionEvent childEventToBe : childEventsToBe){
			ChildEvent newEvent = ContinuousFactory.eINSTANCE.createChildEvent();
			newEvent.setDistribution(this);
			newEvent.setOriginal(childEventToBe);
			this.getChildEvent().add(newEvent);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		PropagatorFunctionAdapter distributionscope  = Util.getPropagatorFunctionAdapter(this, PropagatorScopeDistribution.class);
		distributionscope.refresh();
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunctionAdapter() {
		Util.adapt(this, PropagatorLayerDistributionAtomicEvents.class);
		Util.adapt(this, PropagatorCalcDistributionChildEvents.class);
		Util.adapt(this, PropagatorCalcDistributionSequence.class);
		Util.adapt(this, PropagatorLayerDistributionSlopes.class);
		Util.adapt(this, PropagatorLayerDistributionAmounts.class);
		Util.adapt(this, PropagatorLayerDistributionDescriptions.class);
		Util.adapt(this, PropagatorScopeDistribution.class);
		Util.adapt(this, PropagatorCalcDistributionInitialization.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContinuousPackage.DISTRIBUTION__ATOMIC_EVENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAtomicEvent()).basicAdd(otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__START:
				if (start != null)
					msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContinuousPackage.DISTRIBUTION__START, null, msgs);
				return basicSetStart((StartEvent)otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__END:
				if (end != null)
					msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContinuousPackage.DISTRIBUTION__END, null, msgs);
				return basicSetEnd((EndEvent)otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__COMPOSITE_EVENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompositeEvent()).basicAdd(otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
				if (parentDistribution != null)
					msgs = ((InternalEObject)parentDistribution).eInverseRemove(this, ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION, Distribution.class, msgs);
				return basicSetParentDistribution((Distribution)otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildDistribution()).basicAdd(otherEnd, msgs);
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
			case ContinuousPackage.DISTRIBUTION__ATOMIC_EVENT:
				return ((InternalEList<?>)getAtomicEvent()).basicRemove(otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__CHILD_EVENT:
				return ((InternalEList<?>)getChildEvent()).basicRemove(otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__START:
				return basicSetStart(null, msgs);
			case ContinuousPackage.DISTRIBUTION__END:
				return basicSetEnd(null, msgs);
			case ContinuousPackage.DISTRIBUTION__COMPOSITE_EVENT:
				return ((InternalEList<?>)getCompositeEvent()).basicRemove(otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
				return basicSetParentDistribution(null, msgs);
			case ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
				return ((InternalEList<?>)getChildDistribution()).basicRemove(otherEnd, msgs);
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
			case ContinuousPackage.DISTRIBUTION__TIME_UNIT:
				return getTimeUnit();
			case ContinuousPackage.DISTRIBUTION__HORIZON_START:
				return getHorizonStart();
			case ContinuousPackage.DISTRIBUTION__HORIZON_END:
				return getHorizonEnd();
			case ContinuousPackage.DISTRIBUTION__ATOMIC_EVENT:
				return getAtomicEvent();
			case ContinuousPackage.DISTRIBUTION__CHILD_EVENT:
				return getChildEvent();
			case ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENT:
				return getSequenceEvent();
			case ContinuousPackage.DISTRIBUTION__START:
				return getStart();
			case ContinuousPackage.DISTRIBUTION__END:
				return getEnd();
			case ContinuousPackage.DISTRIBUTION__COMPOSITE_EVENT:
				return getCompositeEvent();
			case ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
				if (resolve) return getParentDistribution();
				return basicGetParentDistribution();
			case ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
				return getChildDistribution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContinuousPackage.DISTRIBUTION__TIME_UNIT:
				setTimeUnit((TimeUnit)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__HORIZON_START:
				setHorizonStart((Date)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__HORIZON_END:
				setHorizonEnd((Date)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__ATOMIC_EVENT:
				getAtomicEvent().clear();
				getAtomicEvent().addAll((Collection<? extends DistributionEvent>)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__CHILD_EVENT:
				getChildEvent().clear();
				getChildEvent().addAll((Collection<? extends ChildEvent>)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENT:
				getSequenceEvent().clear();
				getSequenceEvent().addAll((Collection<? extends DistributionEvent>)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__START:
				setStart((StartEvent)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__END:
				setEnd((EndEvent)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__COMPOSITE_EVENT:
				getCompositeEvent().clear();
				getCompositeEvent().addAll((Collection<? extends CompositeDistributionEvent>)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
				setParentDistribution((Distribution)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
				getChildDistribution().clear();
				getChildDistribution().addAll((Collection<? extends Distribution>)newValue);
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
			case ContinuousPackage.DISTRIBUTION__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
				return;
			case ContinuousPackage.DISTRIBUTION__HORIZON_START:
				setHorizonStart(HORIZON_START_EDEFAULT);
				return;
			case ContinuousPackage.DISTRIBUTION__HORIZON_END:
				setHorizonEnd(HORIZON_END_EDEFAULT);
				return;
			case ContinuousPackage.DISTRIBUTION__ATOMIC_EVENT:
				getAtomicEvent().clear();
				return;
			case ContinuousPackage.DISTRIBUTION__CHILD_EVENT:
				getChildEvent().clear();
				return;
			case ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENT:
				getSequenceEvent().clear();
				return;
			case ContinuousPackage.DISTRIBUTION__START:
				setStart((StartEvent)null);
				return;
			case ContinuousPackage.DISTRIBUTION__END:
				setEnd((EndEvent)null);
				return;
			case ContinuousPackage.DISTRIBUTION__COMPOSITE_EVENT:
				getCompositeEvent().clear();
				return;
			case ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
				setParentDistribution((Distribution)null);
				return;
			case ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
				getChildDistribution().clear();
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
			case ContinuousPackage.DISTRIBUTION__TIME_UNIT:
				return timeUnit != TIME_UNIT_EDEFAULT;
			case ContinuousPackage.DISTRIBUTION__HORIZON_START:
				return HORIZON_START_EDEFAULT == null ? horizonStart != null : !HORIZON_START_EDEFAULT.equals(horizonStart);
			case ContinuousPackage.DISTRIBUTION__HORIZON_END:
				return HORIZON_END_EDEFAULT == null ? horizonEnd != null : !HORIZON_END_EDEFAULT.equals(horizonEnd);
			case ContinuousPackage.DISTRIBUTION__ATOMIC_EVENT:
				return atomicEvent != null && !atomicEvent.isEmpty();
			case ContinuousPackage.DISTRIBUTION__CHILD_EVENT:
				return childEvent != null && !childEvent.isEmpty();
			case ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENT:
				return sequenceEvent != null && !sequenceEvent.isEmpty();
			case ContinuousPackage.DISTRIBUTION__START:
				return start != null;
			case ContinuousPackage.DISTRIBUTION__END:
				return end != null;
			case ContinuousPackage.DISTRIBUTION__COMPOSITE_EVENT:
				return compositeEvent != null && !compositeEvent.isEmpty();
			case ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
				return parentDistribution != null;
			case ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
				return childDistribution != null && !childDistribution.isEmpty();
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
			case ContinuousPackage.DISTRIBUTION___GET_DURATION__DATE_DATE:
				return getDuration((Date)arguments.get(0), (Date)arguments.get(1));
			case ContinuousPackage.DISTRIBUTION___GET_EVENT_BEFORE__DATE:
				return getEventBefore((Date)arguments.get(0));
			case ContinuousPackage.DISTRIBUTION___GET_EVENT_AFTER__DATE:
				return getEventAfter((Date)arguments.get(0));
			case ContinuousPackage.DISTRIBUTION___GET_AMOUNT_BEFORE__DATE:
				return getAmountBefore((Date)arguments.get(0));
			case ContinuousPackage.DISTRIBUTION___GET_AMOUNT_AFTER__DATE:
				return getAmountAfter((Date)arguments.get(0));
			case ContinuousPackage.DISTRIBUTION___GET_SLOPE_BEFORE__DATE:
				return getSlopeBefore((Date)arguments.get(0));
			case ContinuousPackage.DISTRIBUTION___GET_SLOPE_AFTER__DATE:
				return getSlopeAfter((Date)arguments.get(0));
			case ContinuousPackage.DISTRIBUTION___GET_MIN_AMOUNT__DATE_DATE:
				return getMinAmount((Date)arguments.get(0), (Date)arguments.get(1));
			case ContinuousPackage.DISTRIBUTION___GET_MAX_AMOUNT__DATE_DATE:
				return getMaxAmount((Date)arguments.get(0), (Date)arguments.get(1));
			case ContinuousPackage.DISTRIBUTION___GET_AVERAGE_AMOUNT__DATE_DATE:
				return getAverageAmount((Date)arguments.get(0), (Date)arguments.get(1));
			case ContinuousPackage.DISTRIBUTION___GET_INTEGRAL_AMOUNT__DATE_DATE:
				return getIntegralAmount((Date)arguments.get(0), (Date)arguments.get(1));
			case ContinuousPackage.DISTRIBUTION___REFRESH_INIT:
				refreshInit();
				return null;
			case ContinuousPackage.DISTRIBUTION___REFRESH_SEQUENCE:
				refreshSequence();
				return null;
			case ContinuousPackage.DISTRIBUTION___REFRESH_CHILD_EVENT:
				refreshChildEvent();
				return null;
			case ContinuousPackage.DISTRIBUTION___REFRESH:
				refresh();
				return null;
			case ContinuousPackage.DISTRIBUTION___ADD_PROPAGATOR_FUNCTION_ADAPTER:
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
		result.append(" (TimeUnit: ");
		result.append(timeUnit);
		result.append(", HorizonStart: ");
		result.append(horizonStart);
		result.append(", HorizonEnd: ");
		result.append(horizonEnd);
		result.append(')');
		return result.toString();
	}

} //DistributionImpl
