/**
 */
package com.misc.common.moplaf.flock.impl;

import com.misc.common.moplaf.flock.ChainFlock;
import com.misc.common.moplaf.flock.Flock;
import com.misc.common.moplaf.flock.FlockEvent;
import com.misc.common.moplaf.flock.FlockPackage;
import com.misc.common.moplaf.flock.FlockScope;
import com.misc.common.moplaf.flock.Location;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockImpl#getChains <em>Chains</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockImpl#getChainRoot <em>Chain Root</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockImpl#getDurationMin <em>Duration Min</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockImpl#getDurationMax <em>Duration Max</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockImpl#getStartEarliest <em>Start Earliest</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockImpl#getEndLatest <em>End Latest</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockImpl#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockImpl#getEndLocation <em>End Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockImpl#getStartEvent <em>Start Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockImpl#getEndEvent <em>End Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockImpl#getFlockScope <em>Flock Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlockImpl extends MinimalEObjectImpl.Container implements Flock {
	/**
	 * The cached value of the '{@link #getChains() <em>Chains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChains()
	 * @generated
	 * @ordered
	 */
	protected EList<ChainFlock> chains;

	/**
	 * The cached value of the '{@link #getChainRoot() <em>Chain Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainRoot()
	 * @generated
	 * @ordered
	 */
	protected ChainFlock chainRoot;

	/**
	 * The default value of the '{@link #getDurationMin() <em>Duration Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMin()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDurationMin() <em>Duration Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMin()
	 * @generated
	 * @ordered
	 */
	protected float durationMin = DURATION_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationMax() <em>Duration Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMax()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDurationMax() <em>Duration Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMax()
	 * @generated
	 * @ordered
	 */
	protected float durationMax = DURATION_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartEarliest() <em>Start Earliest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartEarliest()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EARLIEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartEarliest() <em>Start Earliest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartEarliest()
	 * @generated
	 * @ordered
	 */
	protected Date startEarliest = START_EARLIEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndLatest() <em>End Latest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLatest()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_LATEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndLatest() <em>End Latest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLatest()
	 * @generated
	 * @ordered
	 */
	protected Date endLatest = END_LATEST_EDEFAULT;

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
	 * The cached value of the '{@link #getStartLocation() <em>Start Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLocation()
	 * @generated
	 * @ordered
	 */
	protected Location startLocation;

	/**
	 * The cached value of the '{@link #getEndLocation() <em>End Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLocation()
	 * @generated
	 * @ordered
	 */
	protected Location endLocation;

	/**
	 * The cached value of the '{@link #getStartEvent() <em>Start Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartEvent()
	 * @generated
	 * @ordered
	 */
	protected FlockEvent startEvent;

	/**
	 * The cached value of the '{@link #getEndEvent() <em>End Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndEvent()
	 * @generated
	 * @ordered
	 */
	protected FlockEvent endEvent;

	/**
	 * The cached value of the '{@link #getFlockScope() <em>Flock Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlockScope()
	 * @generated
	 * @ordered
	 */
	protected FlockScope flockScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlockPackage.Literals.FLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChainFlock> getChains() {
		if (chains == null) {
			chains = new EObjectWithInverseResolvingEList<ChainFlock>(ChainFlock.class, this, FlockPackage.FLOCK__CHAINS, FlockPackage.CHAIN_FLOCK__FLOCK);
		}
		return chains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainFlock getChainRoot() {
		if (chainRoot != null && chainRoot.eIsProxy()) {
			InternalEObject oldChainRoot = (InternalEObject)chainRoot;
			chainRoot = (ChainFlock)eResolveProxy(oldChainRoot);
			if (chainRoot != oldChainRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.FLOCK__CHAIN_ROOT, oldChainRoot, chainRoot));
			}
		}
		return chainRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainFlock basicGetChainRoot() {
		return chainRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainRoot(ChainFlock newChainRoot) {
		ChainFlock oldChainRoot = chainRoot;
		chainRoot = newChainRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__CHAIN_ROOT, oldChainRoot, chainRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDurationMin() {
		return durationMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationMin(float newDurationMin) {
		float oldDurationMin = durationMin;
		durationMin = newDurationMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__DURATION_MIN, oldDurationMin, durationMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDurationMax() {
		return durationMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationMax(float newDurationMax) {
		float oldDurationMax = durationMax;
		durationMax = newDurationMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__DURATION_MAX, oldDurationMax, durationMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartEarliest() {
		return startEarliest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartEarliest(Date newStartEarliest) {
		Date oldStartEarliest = startEarliest;
		startEarliest = newStartEarliest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__START_EARLIEST, oldStartEarliest, startEarliest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndLatest() {
		return endLatest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndLatest(Date newEndLatest) {
		Date oldEndLatest = endLatest;
		endLatest = newEndLatest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__END_LATEST, oldEndLatest, endLatest));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__START, oldStart, start));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getStartLocation() {
		if (startLocation != null && startLocation.eIsProxy()) {
			InternalEObject oldStartLocation = (InternalEObject)startLocation;
			startLocation = (Location)eResolveProxy(oldStartLocation);
			if (startLocation != oldStartLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.FLOCK__START_LOCATION, oldStartLocation, startLocation));
			}
		}
		return startLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetStartLocation() {
		return startLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLocation(Location newStartLocation) {
		Location oldStartLocation = startLocation;
		startLocation = newStartLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__START_LOCATION, oldStartLocation, startLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getEndLocation() {
		if (endLocation != null && endLocation.eIsProxy()) {
			InternalEObject oldEndLocation = (InternalEObject)endLocation;
			endLocation = (Location)eResolveProxy(oldEndLocation);
			if (endLocation != oldEndLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.FLOCK__END_LOCATION, oldEndLocation, endLocation));
			}
		}
		return endLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetEndLocation() {
		return endLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndLocation(Location newEndLocation) {
		Location oldEndLocation = endLocation;
		endLocation = newEndLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__END_LOCATION, oldEndLocation, endLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockEvent getStartEvent() {
		if (startEvent != null && startEvent.eIsProxy()) {
			InternalEObject oldStartEvent = (InternalEObject)startEvent;
			startEvent = (FlockEvent)eResolveProxy(oldStartEvent);
			if (startEvent != oldStartEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.FLOCK__START_EVENT, oldStartEvent, startEvent));
			}
		}
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockEvent basicGetStartEvent() {
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartEvent(FlockEvent newStartEvent, NotificationChain msgs) {
		FlockEvent oldStartEvent = startEvent;
		startEvent = newStartEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__START_EVENT, oldStartEvent, newStartEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartEvent(FlockEvent newStartEvent) {
		if (newStartEvent != startEvent) {
			NotificationChain msgs = null;
			if (startEvent != null)
				msgs = ((InternalEObject)startEvent).eInverseRemove(this, FlockPackage.FLOCK_EVENT__FLOCK_AS_START, FlockEvent.class, msgs);
			if (newStartEvent != null)
				msgs = ((InternalEObject)newStartEvent).eInverseAdd(this, FlockPackage.FLOCK_EVENT__FLOCK_AS_START, FlockEvent.class, msgs);
			msgs = basicSetStartEvent(newStartEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__START_EVENT, newStartEvent, newStartEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockEvent getEndEvent() {
		if (endEvent != null && endEvent.eIsProxy()) {
			InternalEObject oldEndEvent = (InternalEObject)endEvent;
			endEvent = (FlockEvent)eResolveProxy(oldEndEvent);
			if (endEvent != oldEndEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.FLOCK__END_EVENT, oldEndEvent, endEvent));
			}
		}
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockEvent basicGetEndEvent() {
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndEvent(FlockEvent newEndEvent, NotificationChain msgs) {
		FlockEvent oldEndEvent = endEvent;
		endEvent = newEndEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__END_EVENT, oldEndEvent, newEndEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndEvent(FlockEvent newEndEvent) {
		if (newEndEvent != endEvent) {
			NotificationChain msgs = null;
			if (endEvent != null)
				msgs = ((InternalEObject)endEvent).eInverseRemove(this, FlockPackage.FLOCK_EVENT__FLOCK_AS_END, FlockEvent.class, msgs);
			if (newEndEvent != null)
				msgs = ((InternalEObject)newEndEvent).eInverseAdd(this, FlockPackage.FLOCK_EVENT__FLOCK_AS_END, FlockEvent.class, msgs);
			msgs = basicSetEndEvent(newEndEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__END_EVENT, newEndEvent, newEndEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockScope getFlockScope() {
		if (flockScope != null && flockScope.eIsProxy()) {
			InternalEObject oldFlockScope = (InternalEObject)flockScope;
			flockScope = (FlockScope)eResolveProxy(oldFlockScope);
			if (flockScope != oldFlockScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.FLOCK__FLOCK_SCOPE, oldFlockScope, flockScope));
			}
		}
		return flockScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockScope basicGetFlockScope() {
		return flockScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlockScope(FlockScope newFlockScope, NotificationChain msgs) {
		FlockScope oldFlockScope = flockScope;
		flockScope = newFlockScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__FLOCK_SCOPE, oldFlockScope, newFlockScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlockScope(FlockScope newFlockScope) {
		if (newFlockScope != flockScope) {
			NotificationChain msgs = null;
			if (flockScope != null)
				msgs = ((InternalEObject)flockScope).eInverseRemove(this, FlockPackage.FLOCK_SCOPE__FLOCKS, FlockScope.class, msgs);
			if (newFlockScope != null)
				msgs = ((InternalEObject)newFlockScope).eInverseAdd(this, FlockPackage.FLOCK_SCOPE__FLOCKS, FlockScope.class, msgs);
			msgs = basicSetFlockScope(newFlockScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK__FLOCK_SCOPE, newFlockScope, newFlockScope));
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
			case FlockPackage.FLOCK__CHAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChains()).basicAdd(otherEnd, msgs);
			case FlockPackage.FLOCK__START_EVENT:
				if (startEvent != null)
					msgs = ((InternalEObject)startEvent).eInverseRemove(this, FlockPackage.FLOCK_EVENT__FLOCK_AS_START, FlockEvent.class, msgs);
				return basicSetStartEvent((FlockEvent)otherEnd, msgs);
			case FlockPackage.FLOCK__END_EVENT:
				if (endEvent != null)
					msgs = ((InternalEObject)endEvent).eInverseRemove(this, FlockPackage.FLOCK_EVENT__FLOCK_AS_END, FlockEvent.class, msgs);
				return basicSetEndEvent((FlockEvent)otherEnd, msgs);
			case FlockPackage.FLOCK__FLOCK_SCOPE:
				if (flockScope != null)
					msgs = ((InternalEObject)flockScope).eInverseRemove(this, FlockPackage.FLOCK_SCOPE__FLOCKS, FlockScope.class, msgs);
				return basicSetFlockScope((FlockScope)otherEnd, msgs);
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
			case FlockPackage.FLOCK__CHAINS:
				return ((InternalEList<?>)getChains()).basicRemove(otherEnd, msgs);
			case FlockPackage.FLOCK__START_EVENT:
				return basicSetStartEvent(null, msgs);
			case FlockPackage.FLOCK__END_EVENT:
				return basicSetEndEvent(null, msgs);
			case FlockPackage.FLOCK__FLOCK_SCOPE:
				return basicSetFlockScope(null, msgs);
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
			case FlockPackage.FLOCK__CHAINS:
				return getChains();
			case FlockPackage.FLOCK__CHAIN_ROOT:
				if (resolve) return getChainRoot();
				return basicGetChainRoot();
			case FlockPackage.FLOCK__DURATION_MIN:
				return getDurationMin();
			case FlockPackage.FLOCK__DURATION_MAX:
				return getDurationMax();
			case FlockPackage.FLOCK__START_EARLIEST:
				return getStartEarliest();
			case FlockPackage.FLOCK__END_LATEST:
				return getEndLatest();
			case FlockPackage.FLOCK__START:
				return getStart();
			case FlockPackage.FLOCK__END:
				return getEnd();
			case FlockPackage.FLOCK__START_LOCATION:
				if (resolve) return getStartLocation();
				return basicGetStartLocation();
			case FlockPackage.FLOCK__END_LOCATION:
				if (resolve) return getEndLocation();
				return basicGetEndLocation();
			case FlockPackage.FLOCK__START_EVENT:
				if (resolve) return getStartEvent();
				return basicGetStartEvent();
			case FlockPackage.FLOCK__END_EVENT:
				if (resolve) return getEndEvent();
				return basicGetEndEvent();
			case FlockPackage.FLOCK__FLOCK_SCOPE:
				if (resolve) return getFlockScope();
				return basicGetFlockScope();
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
			case FlockPackage.FLOCK__CHAINS:
				getChains().clear();
				getChains().addAll((Collection<? extends ChainFlock>)newValue);
				return;
			case FlockPackage.FLOCK__CHAIN_ROOT:
				setChainRoot((ChainFlock)newValue);
				return;
			case FlockPackage.FLOCK__DURATION_MIN:
				setDurationMin((Float)newValue);
				return;
			case FlockPackage.FLOCK__DURATION_MAX:
				setDurationMax((Float)newValue);
				return;
			case FlockPackage.FLOCK__START_EARLIEST:
				setStartEarliest((Date)newValue);
				return;
			case FlockPackage.FLOCK__END_LATEST:
				setEndLatest((Date)newValue);
				return;
			case FlockPackage.FLOCK__START:
				setStart((Date)newValue);
				return;
			case FlockPackage.FLOCK__END:
				setEnd((Date)newValue);
				return;
			case FlockPackage.FLOCK__START_LOCATION:
				setStartLocation((Location)newValue);
				return;
			case FlockPackage.FLOCK__END_LOCATION:
				setEndLocation((Location)newValue);
				return;
			case FlockPackage.FLOCK__START_EVENT:
				setStartEvent((FlockEvent)newValue);
				return;
			case FlockPackage.FLOCK__END_EVENT:
				setEndEvent((FlockEvent)newValue);
				return;
			case FlockPackage.FLOCK__FLOCK_SCOPE:
				setFlockScope((FlockScope)newValue);
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
			case FlockPackage.FLOCK__CHAINS:
				getChains().clear();
				return;
			case FlockPackage.FLOCK__CHAIN_ROOT:
				setChainRoot((ChainFlock)null);
				return;
			case FlockPackage.FLOCK__DURATION_MIN:
				setDurationMin(DURATION_MIN_EDEFAULT);
				return;
			case FlockPackage.FLOCK__DURATION_MAX:
				setDurationMax(DURATION_MAX_EDEFAULT);
				return;
			case FlockPackage.FLOCK__START_EARLIEST:
				setStartEarliest(START_EARLIEST_EDEFAULT);
				return;
			case FlockPackage.FLOCK__END_LATEST:
				setEndLatest(END_LATEST_EDEFAULT);
				return;
			case FlockPackage.FLOCK__START:
				setStart(START_EDEFAULT);
				return;
			case FlockPackage.FLOCK__END:
				setEnd(END_EDEFAULT);
				return;
			case FlockPackage.FLOCK__START_LOCATION:
				setStartLocation((Location)null);
				return;
			case FlockPackage.FLOCK__END_LOCATION:
				setEndLocation((Location)null);
				return;
			case FlockPackage.FLOCK__START_EVENT:
				setStartEvent((FlockEvent)null);
				return;
			case FlockPackage.FLOCK__END_EVENT:
				setEndEvent((FlockEvent)null);
				return;
			case FlockPackage.FLOCK__FLOCK_SCOPE:
				setFlockScope((FlockScope)null);
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
			case FlockPackage.FLOCK__CHAINS:
				return chains != null && !chains.isEmpty();
			case FlockPackage.FLOCK__CHAIN_ROOT:
				return chainRoot != null;
			case FlockPackage.FLOCK__DURATION_MIN:
				return durationMin != DURATION_MIN_EDEFAULT;
			case FlockPackage.FLOCK__DURATION_MAX:
				return durationMax != DURATION_MAX_EDEFAULT;
			case FlockPackage.FLOCK__START_EARLIEST:
				return START_EARLIEST_EDEFAULT == null ? startEarliest != null : !START_EARLIEST_EDEFAULT.equals(startEarliest);
			case FlockPackage.FLOCK__END_LATEST:
				return END_LATEST_EDEFAULT == null ? endLatest != null : !END_LATEST_EDEFAULT.equals(endLatest);
			case FlockPackage.FLOCK__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case FlockPackage.FLOCK__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case FlockPackage.FLOCK__START_LOCATION:
				return startLocation != null;
			case FlockPackage.FLOCK__END_LOCATION:
				return endLocation != null;
			case FlockPackage.FLOCK__START_EVENT:
				return startEvent != null;
			case FlockPackage.FLOCK__END_EVENT:
				return endEvent != null;
			case FlockPackage.FLOCK__FLOCK_SCOPE:
				return flockScope != null;
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
		result.append(" (DurationMin: ");
		result.append(durationMin);
		result.append(", DurationMax: ");
		result.append(durationMax);
		result.append(", StartEarliest: ");
		result.append(startEarliest);
		result.append(", EndLatest: ");
		result.append(endLatest);
		result.append(", Start: ");
		result.append(start);
		result.append(", End: ");
		result.append(end);
		result.append(')');
		return result.toString();
	}

} //FlockImpl
