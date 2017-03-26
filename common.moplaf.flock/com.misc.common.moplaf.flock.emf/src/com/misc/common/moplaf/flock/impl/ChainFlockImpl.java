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
package com.misc.common.moplaf.flock.impl;

import com.misc.common.moplaf.flock.Chain;
import com.misc.common.moplaf.flock.ChainFlock;
import com.misc.common.moplaf.flock.Flock;
import com.misc.common.moplaf.flock.FlockPackage;
import java.util.Collection;
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
 * An implementation of the model object '<em><b>Chain Flock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainFlockImpl#getMountedFlocks <em>Mounted Flocks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainFlockImpl#getMounterFlock <em>Mounter Flock</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainFlockImpl#getNextFlock <em>Next Flock</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainFlockImpl#getPreviousFlock <em>Previous Flock</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainFlockImpl#getChain <em>Chain</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainFlockImpl#getFlock <em>Flock</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainFlockImpl#getSequenceNr <em>Sequence Nr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ChainFlockImpl extends MinimalEObjectImpl.Container implements ChainFlock {
	/**
	 * The cached value of the '{@link #getMountedFlocks() <em>Mounted Flocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountedFlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<ChainFlock> mountedFlocks;

	/**
	 * The cached value of the '{@link #getMounterFlock() <em>Mounter Flock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMounterFlock()
	 * @generated
	 * @ordered
	 */
	protected ChainFlock mounterFlock;

	/**
	 * The cached value of the '{@link #getNextFlock() <em>Next Flock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFlock()
	 * @generated
	 * @ordered
	 */
	protected ChainFlock nextFlock;

	/**
	 * The cached value of the '{@link #getPreviousFlock() <em>Previous Flock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousFlock()
	 * @generated
	 * @ordered
	 */
	protected ChainFlock previousFlock;

	/**
	 * The cached value of the '{@link #getChain() <em>Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChain()
	 * @generated
	 * @ordered
	 */
	protected Chain chain;

	/**
	 * The cached value of the '{@link #getFlock() <em>Flock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlock()
	 * @generated
	 * @ordered
	 */
	protected Flock flock;

	/**
	 * The default value of the '{@link #getSequenceNr() <em>Sequence Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNr()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNr() <em>Sequence Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNr()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNr = SEQUENCE_NR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ChainFlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlockPackage.Literals.CHAIN_FLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChainFlock> getMountedFlocks() {
		if (mountedFlocks == null) {
			mountedFlocks = new EObjectWithInverseResolvingEList<ChainFlock>(ChainFlock.class, this, FlockPackage.CHAIN_FLOCK__MOUNTED_FLOCKS, FlockPackage.CHAIN_FLOCK__MOUNTER_FLOCK);
		}
		return mountedFlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainFlock getMounterFlock() {
		if (mounterFlock != null && mounterFlock.eIsProxy()) {
			InternalEObject oldMounterFlock = (InternalEObject)mounterFlock;
			mounterFlock = (ChainFlock)eResolveProxy(oldMounterFlock);
			if (mounterFlock != oldMounterFlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.CHAIN_FLOCK__MOUNTER_FLOCK, oldMounterFlock, mounterFlock));
			}
		}
		return mounterFlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainFlock basicGetMounterFlock() {
		return mounterFlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMounterFlock(ChainFlock newMounterFlock, NotificationChain msgs) {
		ChainFlock oldMounterFlock = mounterFlock;
		mounterFlock = newMounterFlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_FLOCK__MOUNTER_FLOCK, oldMounterFlock, newMounterFlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMounterFlock(ChainFlock newMounterFlock) {
		if (newMounterFlock != mounterFlock) {
			NotificationChain msgs = null;
			if (mounterFlock != null)
				msgs = ((InternalEObject)mounterFlock).eInverseRemove(this, FlockPackage.CHAIN_FLOCK__MOUNTED_FLOCKS, ChainFlock.class, msgs);
			if (newMounterFlock != null)
				msgs = ((InternalEObject)newMounterFlock).eInverseAdd(this, FlockPackage.CHAIN_FLOCK__MOUNTED_FLOCKS, ChainFlock.class, msgs);
			msgs = basicSetMounterFlock(newMounterFlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_FLOCK__MOUNTER_FLOCK, newMounterFlock, newMounterFlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainFlock getNextFlock() {
		if (nextFlock != null && nextFlock.eIsProxy()) {
			InternalEObject oldNextFlock = (InternalEObject)nextFlock;
			nextFlock = (ChainFlock)eResolveProxy(oldNextFlock);
			if (nextFlock != oldNextFlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.CHAIN_FLOCK__NEXT_FLOCK, oldNextFlock, nextFlock));
			}
		}
		return nextFlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainFlock basicGetNextFlock() {
		return nextFlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextFlock(ChainFlock newNextFlock, NotificationChain msgs) {
		ChainFlock oldNextFlock = nextFlock;
		nextFlock = newNextFlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_FLOCK__NEXT_FLOCK, oldNextFlock, newNextFlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextFlock(ChainFlock newNextFlock) {
		if (newNextFlock != nextFlock) {
			NotificationChain msgs = null;
			if (nextFlock != null)
				msgs = ((InternalEObject)nextFlock).eInverseRemove(this, FlockPackage.CHAIN_FLOCK__PREVIOUS_FLOCK, ChainFlock.class, msgs);
			if (newNextFlock != null)
				msgs = ((InternalEObject)newNextFlock).eInverseAdd(this, FlockPackage.CHAIN_FLOCK__PREVIOUS_FLOCK, ChainFlock.class, msgs);
			msgs = basicSetNextFlock(newNextFlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_FLOCK__NEXT_FLOCK, newNextFlock, newNextFlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainFlock getPreviousFlock() {
		if (previousFlock != null && previousFlock.eIsProxy()) {
			InternalEObject oldPreviousFlock = (InternalEObject)previousFlock;
			previousFlock = (ChainFlock)eResolveProxy(oldPreviousFlock);
			if (previousFlock != oldPreviousFlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.CHAIN_FLOCK__PREVIOUS_FLOCK, oldPreviousFlock, previousFlock));
			}
		}
		return previousFlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainFlock basicGetPreviousFlock() {
		return previousFlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousFlock(ChainFlock newPreviousFlock, NotificationChain msgs) {
		ChainFlock oldPreviousFlock = previousFlock;
		previousFlock = newPreviousFlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_FLOCK__PREVIOUS_FLOCK, oldPreviousFlock, newPreviousFlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousFlock(ChainFlock newPreviousFlock) {
		if (newPreviousFlock != previousFlock) {
			NotificationChain msgs = null;
			if (previousFlock != null)
				msgs = ((InternalEObject)previousFlock).eInverseRemove(this, FlockPackage.CHAIN_FLOCK__NEXT_FLOCK, ChainFlock.class, msgs);
			if (newPreviousFlock != null)
				msgs = ((InternalEObject)newPreviousFlock).eInverseAdd(this, FlockPackage.CHAIN_FLOCK__NEXT_FLOCK, ChainFlock.class, msgs);
			msgs = basicSetPreviousFlock(newPreviousFlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_FLOCK__PREVIOUS_FLOCK, newPreviousFlock, newPreviousFlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain getChain() {
		if (chain != null && chain.eIsProxy()) {
			InternalEObject oldChain = (InternalEObject)chain;
			chain = (Chain)eResolveProxy(oldChain);
			if (chain != oldChain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.CHAIN_FLOCK__CHAIN, oldChain, chain));
			}
		}
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain basicGetChain() {
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChain(Chain newChain, NotificationChain msgs) {
		Chain oldChain = chain;
		chain = newChain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_FLOCK__CHAIN, oldChain, newChain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChain(Chain newChain) {
		if (newChain != chain) {
			NotificationChain msgs = null;
			if (chain != null)
				msgs = ((InternalEObject)chain).eInverseRemove(this, FlockPackage.CHAIN__FLOCKS, Chain.class, msgs);
			if (newChain != null)
				msgs = ((InternalEObject)newChain).eInverseAdd(this, FlockPackage.CHAIN__FLOCKS, Chain.class, msgs);
			msgs = basicSetChain(newChain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_FLOCK__CHAIN, newChain, newChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flock getFlock() {
		if (flock != null && flock.eIsProxy()) {
			InternalEObject oldFlock = (InternalEObject)flock;
			flock = (Flock)eResolveProxy(oldFlock);
			if (flock != oldFlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.CHAIN_FLOCK__FLOCK, oldFlock, flock));
			}
		}
		return flock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flock basicGetFlock() {
		return flock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlock(Flock newFlock, NotificationChain msgs) {
		Flock oldFlock = flock;
		flock = newFlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_FLOCK__FLOCK, oldFlock, newFlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlock(Flock newFlock) {
		if (newFlock != flock) {
			NotificationChain msgs = null;
			if (flock != null)
				msgs = ((InternalEObject)flock).eInverseRemove(this, FlockPackage.FLOCK__CHAINS, Flock.class, msgs);
			if (newFlock != null)
				msgs = ((InternalEObject)newFlock).eInverseAdd(this, FlockPackage.FLOCK__CHAINS, Flock.class, msgs);
			msgs = basicSetFlock(newFlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_FLOCK__FLOCK, newFlock, newFlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceNr() {
		return sequenceNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNr(int newSequenceNr) {
		int oldSequenceNr = sequenceNr;
		sequenceNr = newSequenceNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_FLOCK__SEQUENCE_NR, oldSequenceNr, sequenceNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshInit() {
		// default does nothing
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
			case FlockPackage.CHAIN_FLOCK__MOUNTED_FLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMountedFlocks()).basicAdd(otherEnd, msgs);
			case FlockPackage.CHAIN_FLOCK__MOUNTER_FLOCK:
				if (mounterFlock != null)
					msgs = ((InternalEObject)mounterFlock).eInverseRemove(this, FlockPackage.CHAIN_FLOCK__MOUNTED_FLOCKS, ChainFlock.class, msgs);
				return basicSetMounterFlock((ChainFlock)otherEnd, msgs);
			case FlockPackage.CHAIN_FLOCK__NEXT_FLOCK:
				if (nextFlock != null)
					msgs = ((InternalEObject)nextFlock).eInverseRemove(this, FlockPackage.CHAIN_FLOCK__PREVIOUS_FLOCK, ChainFlock.class, msgs);
				return basicSetNextFlock((ChainFlock)otherEnd, msgs);
			case FlockPackage.CHAIN_FLOCK__PREVIOUS_FLOCK:
				if (previousFlock != null)
					msgs = ((InternalEObject)previousFlock).eInverseRemove(this, FlockPackage.CHAIN_FLOCK__NEXT_FLOCK, ChainFlock.class, msgs);
				return basicSetPreviousFlock((ChainFlock)otherEnd, msgs);
			case FlockPackage.CHAIN_FLOCK__CHAIN:
				if (chain != null)
					msgs = ((InternalEObject)chain).eInverseRemove(this, FlockPackage.CHAIN__FLOCKS, Chain.class, msgs);
				return basicSetChain((Chain)otherEnd, msgs);
			case FlockPackage.CHAIN_FLOCK__FLOCK:
				if (flock != null)
					msgs = ((InternalEObject)flock).eInverseRemove(this, FlockPackage.FLOCK__CHAINS, Flock.class, msgs);
				return basicSetFlock((Flock)otherEnd, msgs);
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
			case FlockPackage.CHAIN_FLOCK__MOUNTED_FLOCKS:
				return ((InternalEList<?>)getMountedFlocks()).basicRemove(otherEnd, msgs);
			case FlockPackage.CHAIN_FLOCK__MOUNTER_FLOCK:
				return basicSetMounterFlock(null, msgs);
			case FlockPackage.CHAIN_FLOCK__NEXT_FLOCK:
				return basicSetNextFlock(null, msgs);
			case FlockPackage.CHAIN_FLOCK__PREVIOUS_FLOCK:
				return basicSetPreviousFlock(null, msgs);
			case FlockPackage.CHAIN_FLOCK__CHAIN:
				return basicSetChain(null, msgs);
			case FlockPackage.CHAIN_FLOCK__FLOCK:
				return basicSetFlock(null, msgs);
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
			case FlockPackage.CHAIN_FLOCK__MOUNTED_FLOCKS:
				return getMountedFlocks();
			case FlockPackage.CHAIN_FLOCK__MOUNTER_FLOCK:
				if (resolve) return getMounterFlock();
				return basicGetMounterFlock();
			case FlockPackage.CHAIN_FLOCK__NEXT_FLOCK:
				if (resolve) return getNextFlock();
				return basicGetNextFlock();
			case FlockPackage.CHAIN_FLOCK__PREVIOUS_FLOCK:
				if (resolve) return getPreviousFlock();
				return basicGetPreviousFlock();
			case FlockPackage.CHAIN_FLOCK__CHAIN:
				if (resolve) return getChain();
				return basicGetChain();
			case FlockPackage.CHAIN_FLOCK__FLOCK:
				if (resolve) return getFlock();
				return basicGetFlock();
			case FlockPackage.CHAIN_FLOCK__SEQUENCE_NR:
				return getSequenceNr();
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
			case FlockPackage.CHAIN_FLOCK__MOUNTED_FLOCKS:
				getMountedFlocks().clear();
				getMountedFlocks().addAll((Collection<? extends ChainFlock>)newValue);
				return;
			case FlockPackage.CHAIN_FLOCK__MOUNTER_FLOCK:
				setMounterFlock((ChainFlock)newValue);
				return;
			case FlockPackage.CHAIN_FLOCK__NEXT_FLOCK:
				setNextFlock((ChainFlock)newValue);
				return;
			case FlockPackage.CHAIN_FLOCK__PREVIOUS_FLOCK:
				setPreviousFlock((ChainFlock)newValue);
				return;
			case FlockPackage.CHAIN_FLOCK__CHAIN:
				setChain((Chain)newValue);
				return;
			case FlockPackage.CHAIN_FLOCK__FLOCK:
				setFlock((Flock)newValue);
				return;
			case FlockPackage.CHAIN_FLOCK__SEQUENCE_NR:
				setSequenceNr((Integer)newValue);
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
			case FlockPackage.CHAIN_FLOCK__MOUNTED_FLOCKS:
				getMountedFlocks().clear();
				return;
			case FlockPackage.CHAIN_FLOCK__MOUNTER_FLOCK:
				setMounterFlock((ChainFlock)null);
				return;
			case FlockPackage.CHAIN_FLOCK__NEXT_FLOCK:
				setNextFlock((ChainFlock)null);
				return;
			case FlockPackage.CHAIN_FLOCK__PREVIOUS_FLOCK:
				setPreviousFlock((ChainFlock)null);
				return;
			case FlockPackage.CHAIN_FLOCK__CHAIN:
				setChain((Chain)null);
				return;
			case FlockPackage.CHAIN_FLOCK__FLOCK:
				setFlock((Flock)null);
				return;
			case FlockPackage.CHAIN_FLOCK__SEQUENCE_NR:
				setSequenceNr(SEQUENCE_NR_EDEFAULT);
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
			case FlockPackage.CHAIN_FLOCK__MOUNTED_FLOCKS:
				return mountedFlocks != null && !mountedFlocks.isEmpty();
			case FlockPackage.CHAIN_FLOCK__MOUNTER_FLOCK:
				return mounterFlock != null;
			case FlockPackage.CHAIN_FLOCK__NEXT_FLOCK:
				return nextFlock != null;
			case FlockPackage.CHAIN_FLOCK__PREVIOUS_FLOCK:
				return previousFlock != null;
			case FlockPackage.CHAIN_FLOCK__CHAIN:
				return chain != null;
			case FlockPackage.CHAIN_FLOCK__FLOCK:
				return flock != null;
			case FlockPackage.CHAIN_FLOCK__SEQUENCE_NR:
				return sequenceNr != SEQUENCE_NR_EDEFAULT;
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
		result.append(" (SequenceNr: ");
		result.append(sequenceNr);
		result.append(')');
		return result.toString();
	}

} //ChainFlockImpl
