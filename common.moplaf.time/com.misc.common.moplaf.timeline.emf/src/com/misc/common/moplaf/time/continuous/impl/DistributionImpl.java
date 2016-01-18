/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ChildEvent;
import com.misc.common.moplaf.time.continuous.ContinuousFactory;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.DistributionVisitor;
import com.misc.common.moplaf.time.continuous.EndEvent;
import com.misc.common.moplaf.time.continuous.EventProvider;
import com.misc.common.moplaf.time.continuous.EventsProvider;
import com.misc.common.moplaf.time.continuous.EventsProviderAbstract;
import com.misc.common.moplaf.time.continuous.StartEvent;
import com.misc.common.moplaf.time.continuous.TimeUnit;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionChildEvents;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionInitialization;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribution</b></em>'.
 * <p>
 * A Distribution receives 
 *     <ul>
 *       <li>{@link EventsProvider}s through the relation {@link #eventsProviders}</li>
 *       <li>child {@link Distribution}s through the relation {@link #childDistribution}</li>
 *    </ul>
 * <p>
 * The Distribution
 * <ul>
 *   <li>consider the events </li>
 *     <ul>
 *       <li>{@link #startEvent} and {@link #endEvent}</li>
 *       <li>provided by the {@link EventsProvider}s</li>
 *       <li>belonging to the child {@link Distribution}s</li>
 *    </ul>
 *   <li>select the considered events in the horizon
 *   <li>sorts the selected events </li>
 *   <li>publishes the resulting sets of events </li>
 *     <ul>
 *       <li>in the relation {@link #sequenceEvent}</li>
 *       <li>in the attribute {@link DistributionEventImpl#eventNr}</li>
 *       <li>in the references {@link DistributionEventImpl#next} and {@link DistributionEventImpl#previous}</li>
 *    </ul>
 *   <li>maintains the value and slope of the distribution at every event</li>
 *     <ul>
 *       <li>in the attribute {@link DistributionEventImpl#amountBefore}</li>
 *       <li>in the attribute {@link DistributionEventImpl#amountAfter}</li>
 *       <li>in the attribute {@link DistributionEventImpl#slopeBefore}</li>
 *       <li>in the attribute {@link DistributionEventImpl#slopeAfter}</li>
 *    </ul>
 * </ul>
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getHorizonStart <em>Horizon Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getHorizonEnd <em>Horizon End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getChildEvents <em>Child Events</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getSequenceEvents <em>Sequence Events</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getEventsProviders <em>Events Providers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getParentDistribution <em>Parent Distribution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getChildDistribution <em>Child Distribution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.DistributionImpl#getProvidedEvents <em>Provided Events</em>}</li>
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
	 * The cached value of the '{@link #getChildEvents() <em>Child Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildEvent> childEvents;

	/**
	 * The cached value of the '{@link #getSequenceEvents() <em>Sequence Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionEvent> sequenceEvents;

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
	 * The cached value of the '{@link #getEventsProviders() <em>Events Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventsProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<EventsProviderAbstract> eventsProviders;

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
	 * The cached value of the '{@link #getProvidedEvents() <em>Provided Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionEvent> providedEvents;

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
	public EList<EventsProviderAbstract> getEventsProviders() {
		if (eventsProviders == null) {
			eventsProviders = new EObjectContainmentWithInverseEList<EventsProviderAbstract>(EventsProviderAbstract.class, this, ContinuousPackage.DISTRIBUTION__EVENTS_PROVIDERS, ContinuousPackage.EVENTS_PROVIDER_ABSTRACT__DISTRIBUTION);
		}
		return eventsProviders;
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
	public EList<ChildEvent> getChildEvents() {
		if (childEvents == null) {
			childEvents = new EObjectContainmentEList<ChildEvent>(ChildEvent.class, this, ContinuousPackage.DISTRIBUTION__CHILD_EVENTS);
		}
		return childEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistributionEvent> getSequenceEvents() {
		if (sequenceEvents == null) {
			sequenceEvents = new EObjectWithInverseResolvingEList<DistributionEvent>(DistributionEvent.class, this, ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS, ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE);
		}
		return sequenceEvents;
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
	 * @generated
	 */
	public EList<DistributionEvent> getProvidedEvents() {
		if (providedEvents == null) {
			providedEvents = new EObjectWithInverseResolvingEList<DistributionEvent>(DistributionEvent.class, this, ContinuousPackage.DISTRIBUTION__PROVIDED_EVENTS, ContinuousPackage.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT);
		}
		return providedEvents;
	}
	
	private float toDuration(long millis){
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
	
	private long toMillis(float duration){
		float millis = 0;
		switch ( this.getTimeUnit()){
		case DAY :
			millis = duration*1000.0f*60.0f*60.0f*24.0f;
			break;
		case HOUR :
			millis = duration*1000.0f*60.0f*60.0f;
			break;
		case MINUTE :
			millis = duration*1000.0f*60.0f;
			break;
		case SECOND :
			millis = duration*1000.0f;
			break;
		case MILLI :
			duration = millis;
			break;
		}
		return (long) millis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getDuration(Date from, Date to) {
		float duration = 0.0f;
		long fromTime = from.getTime();
		long toTime   = to.getTime();
		if ( fromTime!=toTime){
			duration = this.toDuration(toTime-fromTime);
		}
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Date getMoment(Date from, float duration) {
		Date moment = from;
		if ( duration != 0.0f){
			long time = from.getTime()+this.toMillis(duration);
			moment = new Date(time);
		}
		return moment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DistributionEvent getEventBefore(Date time) {
		DistributionEvent currentEvent = this.getEnd();
		while (currentEvent!=null){
			if ( currentEvent.getMoment().compareTo(time)<=0 ){
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
	public DistributionEvent getEventStrictBefore(Date time) {
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
			if ( currentEvent.getMoment().compareTo(time)>=0 ){
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
	public DistributionEvent getEventStrictAfter(Date time) {
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
		DistributionEvent eventAfter = this.getEventAfter(time);
		float amountBefore = eventAfter.getAmountBefore(time);
		return amountBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getAmountAfter(Date time) {
		DistributionEvent eventBefore = this.getEventBefore(time);
		float amountAfter = eventBefore.getAmountAfter(time);
		return amountAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getSlopeBefore(Date time) {
		DistributionEvent eventAfter = this.getEventAfter(time);
		float slopeAtBefore = eventAfter.getSlopeBefore();
		return slopeAtBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getSlopeAfter(Date time) {
		DistributionEvent eventBefore = this.getEventBefore(time);
		float slopeAfter = eventBefore.getSlopeAfter();
		return slopeAfter;
	}
	
	private class Minimor implements DistributionVisitor {
		private float minimum = Float.MAX_VALUE;
		public float getMinimum(){
			return this.minimum;
		}
		@Override
		public boolean visit(Date moment, float amount) {
			if ( amount<this.minimum){
				this.minimum = amount;
			}
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getMinAmount(Date from, Date to) {
		Minimor visitor = new Minimor();
		this.accept(from, to, visitor);
		return visitor.getMinimum();
	}

	private class Maximor implements DistributionVisitor {
		private float maximum = Float.MIN_VALUE;
		public float getMaximum(){
			return this.maximum;
		}
		@Override
		public boolean visit(Date moment, float amount) {
			if ( amount>this.maximum){
				this.maximum = amount;
			}
			return false;
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getMaxAmount(Date from, Date to) {
		Maximor visitor = new Maximor();
		this.accept(from, to, visitor);
		return visitor.getMaximum();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getAverageAmount(Date from, Date to) {
		float cumulated = this.getCumulatedAmount(from, to);
		float average = 0.0f;
		if( cumulated != 0.0f){
			float duration = this.getDuration(from, to);
			average = cumulated/duration;
		}
		return average; 
	}
	
	private class Cumulator implements DistributionVisitor{
		private Date previousMoment = null;
		private float previousAmount;
		private float cumulatedAmount = 0.0f;
		public float getCumulatedAmount() {
			return this.cumulatedAmount;
		}
		@Override
		public boolean visit(Date moment, float amount) {
			if ( this.previousMoment!=null){
				float startAmount = this.previousAmount;
				float endAmount = amount;
				float duration = DistributionImpl.this.getDuration(this.previousMoment, moment);
				this.cumulatedAmount += (startAmount+endAmount)/2.0f*duration;
			}
			this.previousAmount = amount;
			this.previousMoment = moment;
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getCumulatedAmount(Date from, Date to) {
		Cumulator visitor = new Cumulator();
		this.accept(from, to, visitor);
		float cumulated = visitor.getCumulatedAmount();
		return cumulated;
	}

	private class EarliestBelowGettor implements DistributionVisitor{
		private Date previousMoment;
		private float previousAmount;
		private boolean previousBelow;
		private float maxAmount;
		private float minDuration;
		private Date belowAsFrom = null;
		private Date belowUntil = null;
		private Date earliestBelow = null;
		public EarliestBelowGettor(float maxAmount, float minDuration){
			this.maxAmount = maxAmount;
			this.minDuration = minDuration;
		}
		public Date getEarliestBelow() {
			return this.earliestBelow;
		}
		@Override
		public boolean visit(Date moment, float amount) {
			boolean currentBelow = this.maxAmount <= amount;
			if ( currentBelow){
				this.belowUntil = moment;
				if ( this.previousBelow){
					// case below before and below now
				} else {
					// case below before and above now
					Date crossOver = moment;
					if ( this.previousMoment!=null){
						float duration = DistributionImpl.this.getDuration(this.previousMoment, moment)
								       * (maxAmount-this.previousAmount) / (amount-this.previousAmount);
						crossOver = DistributionImpl.this.getMoment(this.previousMoment, duration);
					}
					this.belowAsFrom = crossOver;
				}
			} else {
				// now above
//				this.belowUntil = null;
				if ( this.previousBelow){
					// case below before and above now
					float duration = DistributionImpl.this.getDuration(this.previousMoment, moment)
							       * (maxAmount-this.previousAmount) / (amount-this.previousAmount);
					this.belowUntil = DistributionImpl.this.getMoment(this.previousMoment, duration);
				} else {
					// case above before and below now
				}
			}
			if ( this.belowAsFrom!=null && this.belowUntil!=null){
				float durationUnder = DistributionImpl.this.getDuration(this. belowAsFrom, this.belowUntil);
				if ( durationUnder>=this.minDuration) {
					this.earliestBelow = this.belowAsFrom;
					return true;
				}
			}
			this.previousAmount = amount;
			this.previousMoment = moment;
			this.previousBelow = currentBelow;
			return false;
		} // method visit
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Date getEarliestBelow(Date after, float duration, float amount) {
		EarliestBelowGettor visitor = new EarliestBelowGettor(amount, duration);
		this.accept(after, this.getHorizonEnd(), visitor);
		return visitor.getEarliestBelow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLatestBelow(Date before, float duration, float amount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEarliestAbove(Date after, float duration, float amount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLatestAbove(Date before, float duration, float amount) {
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
			this.setStart(start); // owning
		}
	}
	
	private void refreshEnd() {
		if ( this.getEnd()==null){
			EndEvent end = ContinuousFactory.eINSTANCE.createEndEvent();
			this.setEnd(end);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshChildEvent() {
		// to be events
		HashSet<DistributionEvent> childEventsToBe = new HashSet<DistributionEvent>();
		for ( Distribution childDistribution : this.getChildDistribution()){
			for ( DistributionEvent childEvent : childDistribution.getProvidedEvents()){
				childEventsToBe.add(childEvent);
			}
		}
		
		// as is events
		Iterator<ChildEvent> childEventIter = this.getChildEvents().iterator();
		while ( childEventIter.hasNext()){
			ChildEvent childEventAsIs = childEventIter.next();
			DistributionEvent originalEvent = childEventAsIs.getOriginal();
			if ( originalEvent==null || !childEventsToBe.contains(originalEvent)){
				// the original event is not to be: remove the derived event
				childEventAsIs.setOriginal(null);
				childEventIter.remove(); // owning
			} else {
				// the original event does not need to be created
				 childEventsToBe.remove(originalEvent);
			}
		}
		
		// create the child event
		for ( DistributionEvent childEventToBe : childEventsToBe){
			ChildEvent newEvent = ContinuousFactory.eINSTANCE.createChildEvent(); 
			newEvent.setOriginal(childEventToBe);
			this.getChildEvents().add(newEvent); // owning
		}
		
		// for every child distribution, 
		//    for every of its sequence event, there is a child event
		//    and vice versa
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshProvidedEvents() {
		HashSet<DistributionEvent> eventstobe = new HashSet<DistributionEvent>();

		// from providers
		for (EventsProviderAbstract provider: this.getEventsProviders()){
			if ( provider instanceof EventsProvider ){
				EventsProvider eventsProvider = (EventsProvider)provider;
				for(DistributionEvent currentEvent : eventsProvider.getProvidedEvents()){
					eventstobe.add(currentEvent);
				}
			}
			else if ( provider instanceof EventProvider){
				EventProvider eventProvider = (EventProvider)provider;
				eventstobe.add(eventProvider.getProvidedEvent());
			}
		}

		// child events
		for(DistributionEvent currentEvent : this.getChildEvents()){
			eventstobe.add(currentEvent);
		}
		
		// horizon events
		eventstobe.add(this.getStart());
		eventstobe.add(this.getEnd());

		// and refresh
		EList<DistributionEvent> eventsasis = this.getProvidedEvents();
		eventsasis.retainAll(eventstobe);
		eventstobe.removeAll(eventsasis);
		eventsasis.addAll(eventstobe);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void accept(Date from, Date to, DistributionVisitor visitor) {
		if ( from == null ) { return ; }
		if ( to == null ) { return ; }
		if ( from.compareTo(to)<0 ){
			// forward visit
			DistributionEvent firstEvent = this.getEventStrictAfter(from);
			DistributionEvent lastEvent = this.getEventStrictBefore(to);
			float firstAmount = firstEvent.getAmountBefore(from);
			visitor.visit(from, firstAmount);
			DistributionEvent currentEvent = firstEvent;
			while (currentEvent.isBefore(lastEvent)){
				float amountBefore = currentEvent.getAmountBefore();
				float amountAfter = currentEvent.getAmountAfter();
				Date moment = currentEvent.getMoment();
				visitor.visit(moment, amountBefore);
				if ( amountBefore!=amountAfter){
					visitor.visit(moment, amountAfter);
				}
				currentEvent = currentEvent.getNext();
			}
			float lastAmount = lastEvent.getAmountAfter(to);
			visitor.visit(to, lastAmount);
		} else {
			// backward visit
			DistributionEvent firstEvent = this.getEventStrictAfter(from);
			DistributionEvent lastEvent = this.getEventStrictBefore(to);
			float lastAmount = lastEvent.getAmountAfter(to);
			visitor.visit(to, lastAmount);
			DistributionEvent currentEvent = lastEvent;
			while (firstEvent.isBefore(currentEvent)){
				float amountBefore = currentEvent.getAmountBefore();
				float amountAfter = currentEvent.getAmountAfter();
				Date moment = currentEvent.getMoment();
				visitor.visit(moment, amountBefore);
				if ( amountBefore!=amountAfter){
					visitor.visit(moment, amountAfter);
				}
				currentEvent = currentEvent.getPrevious();
			}
			float firstAmount = firstEvent.getAmountBefore(from);
			visitor.visit(from, firstAmount);
		}
	}

	private boolean isSequenceEvent(DistributionEvent event){
		Date moment = event.getMoment();
		if( moment==null ) { return false; }
		if( moment.compareTo(this.getHorizonStart())<0 ) { return false; }
		if( moment.compareTo(this.getHorizonEnd())  >0 ) { return false; }
		return true;	
	}

	private void refreshSequenceEventContent() {
		// to be events
		HashSet<DistributionEvent> eventsToBe = new HashSet<DistributionEvent>();
		for(DistributionEvent currentEvent : this.getProvidedEvents()){
			if ( this.isSequenceEvent(currentEvent)){
				eventsToBe.add(currentEvent);
			}
		}
	
		// as is events
		Iterator<DistributionEvent> sequenceEventIter = this.getSequenceEvents().iterator();
		while ( sequenceEventIter.hasNext()){
			DistributionEvent sequenceEventAsIs = sequenceEventIter.next();
			boolean removed = eventsToBe.remove(sequenceEventAsIs);
			if ( !removed ){
				// the original event is not to be: remove the sequence event asis
				sequenceEventAsIs.setNext(null);
				sequenceEventAsIs.setPrevious(null);
				sequenceEventIter.remove();
			} 
		}
		
		// create the child event
		for ( DistributionEvent eventToBe: eventsToBe){
			this.getSequenceEvents().add(eventToBe);
		}
	}
	
	private void refreshSequenceEventSort() {
		ECollections.sort(this.getSequenceEvents(), 
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
		for(DistributionEvent currentEvent : this.getSequenceEvents()){
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
	public void refresh() {
		PropagatorFunctionAdapter distributionscope  = Util.getPropagatorFunctionAdapter(this, PropagatorScopeDistribution.class);
		distributionscope.refresh();
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunctionAdapter() {
		Util.adapt(this, PropagatorLayerCompositeEventRefresh.class);
		Util.adapt(this, PropagatorCalcDistributionChildEvents.class);
		Util.adapt(this, PropagatorCalcDistributionProvidedEvents.class);
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
			case ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSequenceEvents()).basicAdd(otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__START:
				if (start != null)
					msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContinuousPackage.DISTRIBUTION__START, null, msgs);
				return basicSetStart((StartEvent)otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__END:
				if (end != null)
					msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContinuousPackage.DISTRIBUTION__END, null, msgs);
				return basicSetEnd((EndEvent)otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__EVENTS_PROVIDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEventsProviders()).basicAdd(otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
				if (parentDistribution != null)
					msgs = ((InternalEObject)parentDistribution).eInverseRemove(this, ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION, Distribution.class, msgs);
				return basicSetParentDistribution((Distribution)otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildDistribution()).basicAdd(otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__PROVIDED_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedEvents()).basicAdd(otherEnd, msgs);
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
			case ContinuousPackage.DISTRIBUTION__CHILD_EVENTS:
				return ((InternalEList<?>)getChildEvents()).basicRemove(otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS:
				return ((InternalEList<?>)getSequenceEvents()).basicRemove(otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__START:
				return basicSetStart(null, msgs);
			case ContinuousPackage.DISTRIBUTION__END:
				return basicSetEnd(null, msgs);
			case ContinuousPackage.DISTRIBUTION__EVENTS_PROVIDERS:
				return ((InternalEList<?>)getEventsProviders()).basicRemove(otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
				return basicSetParentDistribution(null, msgs);
			case ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
				return ((InternalEList<?>)getChildDistribution()).basicRemove(otherEnd, msgs);
			case ContinuousPackage.DISTRIBUTION__PROVIDED_EVENTS:
				return ((InternalEList<?>)getProvidedEvents()).basicRemove(otherEnd, msgs);
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
			case ContinuousPackage.DISTRIBUTION__CHILD_EVENTS:
				return getChildEvents();
			case ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS:
				return getSequenceEvents();
			case ContinuousPackage.DISTRIBUTION__START:
				return getStart();
			case ContinuousPackage.DISTRIBUTION__END:
				return getEnd();
			case ContinuousPackage.DISTRIBUTION__EVENTS_PROVIDERS:
				return getEventsProviders();
			case ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
				if (resolve) return getParentDistribution();
				return basicGetParentDistribution();
			case ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
				return getChildDistribution();
			case ContinuousPackage.DISTRIBUTION__PROVIDED_EVENTS:
				return getProvidedEvents();
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
			case ContinuousPackage.DISTRIBUTION__CHILD_EVENTS:
				getChildEvents().clear();
				getChildEvents().addAll((Collection<? extends ChildEvent>)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS:
				getSequenceEvents().clear();
				getSequenceEvents().addAll((Collection<? extends DistributionEvent>)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__START:
				setStart((StartEvent)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__END:
				setEnd((EndEvent)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__EVENTS_PROVIDERS:
				getEventsProviders().clear();
				getEventsProviders().addAll((Collection<? extends EventsProviderAbstract>)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
				setParentDistribution((Distribution)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
				getChildDistribution().clear();
				getChildDistribution().addAll((Collection<? extends Distribution>)newValue);
				return;
			case ContinuousPackage.DISTRIBUTION__PROVIDED_EVENTS:
				getProvidedEvents().clear();
				getProvidedEvents().addAll((Collection<? extends DistributionEvent>)newValue);
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
			case ContinuousPackage.DISTRIBUTION__CHILD_EVENTS:
				getChildEvents().clear();
				return;
			case ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS:
				getSequenceEvents().clear();
				return;
			case ContinuousPackage.DISTRIBUTION__START:
				setStart((StartEvent)null);
				return;
			case ContinuousPackage.DISTRIBUTION__END:
				setEnd((EndEvent)null);
				return;
			case ContinuousPackage.DISTRIBUTION__EVENTS_PROVIDERS:
				getEventsProviders().clear();
				return;
			case ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
				setParentDistribution((Distribution)null);
				return;
			case ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
				getChildDistribution().clear();
				return;
			case ContinuousPackage.DISTRIBUTION__PROVIDED_EVENTS:
				getProvidedEvents().clear();
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
			case ContinuousPackage.DISTRIBUTION__CHILD_EVENTS:
				return childEvents != null && !childEvents.isEmpty();
			case ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS:
				return sequenceEvents != null && !sequenceEvents.isEmpty();
			case ContinuousPackage.DISTRIBUTION__START:
				return start != null;
			case ContinuousPackage.DISTRIBUTION__END:
				return end != null;
			case ContinuousPackage.DISTRIBUTION__EVENTS_PROVIDERS:
				return eventsProviders != null && !eventsProviders.isEmpty();
			case ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION:
				return parentDistribution != null;
			case ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION:
				return childDistribution != null && !childDistribution.isEmpty();
			case ContinuousPackage.DISTRIBUTION__PROVIDED_EVENTS:
				return providedEvents != null && !providedEvents.isEmpty();
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
			case ContinuousPackage.DISTRIBUTION___GET_MOMENT__DATE_FLOAT:
				return getMoment((Date)arguments.get(0), (Float)arguments.get(1));
			case ContinuousPackage.DISTRIBUTION___GET_EVENT_BEFORE__DATE:
				return getEventBefore((Date)arguments.get(0));
			case ContinuousPackage.DISTRIBUTION___GET_EVENT_STRICT_BEFORE__DATE:
				return getEventStrictBefore((Date)arguments.get(0));
			case ContinuousPackage.DISTRIBUTION___GET_EVENT_AFTER__DATE:
				return getEventAfter((Date)arguments.get(0));
			case ContinuousPackage.DISTRIBUTION___GET_EVENT_STRICT_AFTER__DATE:
				return getEventStrictAfter((Date)arguments.get(0));
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
			case ContinuousPackage.DISTRIBUTION___GET_CUMULATED_AMOUNT__DATE_DATE:
				return getCumulatedAmount((Date)arguments.get(0), (Date)arguments.get(1));
			case ContinuousPackage.DISTRIBUTION___GET_EARLIEST_BELOW__DATE_FLOAT_FLOAT:
				return getEarliestBelow((Date)arguments.get(0), (Float)arguments.get(1), (Float)arguments.get(2));
			case ContinuousPackage.DISTRIBUTION___GET_LATEST_BELOW__DATE_FLOAT_FLOAT:
				return getLatestBelow((Date)arguments.get(0), (Float)arguments.get(1), (Float)arguments.get(2));
			case ContinuousPackage.DISTRIBUTION___GET_EARLIEST_ABOVE__DATE_FLOAT_FLOAT:
				return getEarliestAbove((Date)arguments.get(0), (Float)arguments.get(1), (Float)arguments.get(2));
			case ContinuousPackage.DISTRIBUTION___GET_LATEST_ABOVE__DATE_FLOAT_FLOAT:
				return getLatestAbove((Date)arguments.get(0), (Float)arguments.get(1), (Float)arguments.get(2));
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
			case ContinuousPackage.DISTRIBUTION___REFRESH_PROVIDED_EVENTS:
				refreshProvidedEvents();
				return null;
			case ContinuousPackage.DISTRIBUTION___ACCEPT__DATE_DATE_DISTRIBUTIONVISITOR:
				accept((Date)arguments.get(0), (Date)arguments.get(1), (DistributionVisitor)arguments.get(2));
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
