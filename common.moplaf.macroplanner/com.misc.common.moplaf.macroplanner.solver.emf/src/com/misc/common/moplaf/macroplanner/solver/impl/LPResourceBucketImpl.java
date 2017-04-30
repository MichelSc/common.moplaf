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
package com.misc.common.moplaf.macroplanner.solver.impl;


import com.misc.common.moplaf.macroplanner.RoutingResource;
import com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket;
import com.misc.common.moplaf.macroplanner.solver.LPResource;
import com.misc.common.moplaf.macroplanner.solver.LPResourceBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingResource;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.solver.EnumLpConsType;
import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.util.Util;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Resource Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getAvailabilities <em>Availabilities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getReservations <em>Reservations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getPlanned <em>Planned</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getCalcReserved <em>Calc Reserved</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getCalcPlanned <em>Calc Planned</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#isReservingSelectedSolution <em>Reserving Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getReservationSelectedSolution <em>Reservation Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#isWithAvailability <em>With Availability</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getReservationMaximum <em>Reservation Maximum</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#isAvailabilityTightSelectedSolution <em>Availability Tight Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#isAvailabilitySlackSelectedSolution <em>Availability Slack Selected Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPResourceBucketImpl extends LPTimeBucketImpl implements LPResourceBucket {
	/**
	 * The cached value of the '{@link #getAvailabilities() <em>Availabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<LPAvailabilityBucket> availabilities;

	/**
	 * The cached value of the '{@link #getReservations() <em>Reservations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservations()
	 * @generated
	 * @ordered
	 */
	protected EList<LPRoutingBucketResource> reservations;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar reserved;

	/**
	 * The cached value of the '{@link #getPlanned() <em>Planned</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanned()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar planned;

	/**
	 * The cached value of the '{@link #getCalcReserved() <em>Calc Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcReserved()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpCons calcReserved;

	/**
	 * The cached value of the '{@link #getCalcPlanned() <em>Calc Planned</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcPlanned()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpCons calcPlanned;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpCons balance;

	/**
	 * The default value of the '{@link #isReservingSelectedSolution() <em>Reserving Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReservingSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESERVING_SELECTED_SOLUTION_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getReservationSelectedSolution() <em>Reservation Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final double RESERVATION_SELECTED_SOLUTION_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #isWithAvailability() <em>With Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WITH_AVAILABILITY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getReservationMaximum() <em>Reservation Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final double RESERVATION_MAXIMUM_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #isAvailabilityTightSelectedSolution() <em>Availability Tight Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailabilityTightSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVAILABILITY_TIGHT_SELECTED_SOLUTION_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAvailabilitySlackSelectedSolution() <em>Availability Slack Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailabilitySlackSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVAILABILITY_SLACK_SELECTED_SOLUTION_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPResourceBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPResource getResource() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE) return null;
		return (LPResource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(LPResource newResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResource, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(LPResource newResource) {
		if (newResource != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE && newResource != null)) {
			if (EcoreUtil.isAncestor(this, newResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, MacroPlannerSolverPackage.LP_RESOURCE__LP_BUCKETS, LPResource.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPAvailabilityBucket> getAvailabilities() {
		if (availabilities == null) {
			availabilities = new EObjectWithInverseResolvingEList<LPAvailabilityBucket>(LPAvailabilityBucket.class, this, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES, MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESOURCE_BUCKET);
		}
		return availabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPRoutingBucketResource> getReservations() {
		if (reservations == null) {
			reservations = new EObjectWithInverseResolvingEList<LPRoutingBucketResource>(LPRoutingBucketResource.class, this, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATIONS, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__RESOURCE_BUCKET);
		}
		return reservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReserved(GeneratorLpVar newReserved, NotificationChain msgs) {
		GeneratorLpVar oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED, oldReserved, newReserved);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(GeneratorLpVar newReserved) {
		if (newReserved != reserved) {
			NotificationChain msgs = null;
			if (reserved != null)
				msgs = ((InternalEObject)reserved).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED, null, msgs);
			if (newReserved != null)
				msgs = ((InternalEObject)newReserved).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED, null, msgs);
			msgs = basicSetReserved(newReserved, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED, newReserved, newReserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar getPlanned() {
		return planned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanned(GeneratorLpVar newPlanned, NotificationChain msgs) {
		GeneratorLpVar oldPlanned = planned;
		planned = newPlanned;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__PLANNED, oldPlanned, newPlanned);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanned(GeneratorLpVar newPlanned) {
		if (newPlanned != planned) {
			NotificationChain msgs = null;
			if (planned != null)
				msgs = ((InternalEObject)planned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__PLANNED, null, msgs);
			if (newPlanned != null)
				msgs = ((InternalEObject)newPlanned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__PLANNED, null, msgs);
			msgs = basicSetPlanned(newPlanned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__PLANNED, newPlanned, newPlanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpCons getCalcReserved() {
		return calcReserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalcReserved(GeneratorLpCons newCalcReserved, NotificationChain msgs) {
		GeneratorLpCons oldCalcReserved = calcReserved;
		calcReserved = newCalcReserved;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_RESERVED, oldCalcReserved, newCalcReserved);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalcReserved(GeneratorLpCons newCalcReserved) {
		if (newCalcReserved != calcReserved) {
			NotificationChain msgs = null;
			if (calcReserved != null)
				msgs = ((InternalEObject)calcReserved).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_RESERVED, null, msgs);
			if (newCalcReserved != null)
				msgs = ((InternalEObject)newCalcReserved).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_RESERVED, null, msgs);
			msgs = basicSetCalcReserved(newCalcReserved, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_RESERVED, newCalcReserved, newCalcReserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpCons getCalcPlanned() {
		return calcPlanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalcPlanned(GeneratorLpCons newCalcPlanned, NotificationChain msgs) {
		GeneratorLpCons oldCalcPlanned = calcPlanned;
		calcPlanned = newCalcPlanned;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_PLANNED, oldCalcPlanned, newCalcPlanned);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalcPlanned(GeneratorLpCons newCalcPlanned) {
		if (newCalcPlanned != calcPlanned) {
			NotificationChain msgs = null;
			if (calcPlanned != null)
				msgs = ((InternalEObject)calcPlanned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_PLANNED, null, msgs);
			if (newCalcPlanned != null)
				msgs = ((InternalEObject)newCalcPlanned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_PLANNED, null, msgs);
			msgs = basicSetCalcPlanned(newCalcPlanned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_PLANNED, newCalcPlanned, newCalcPlanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpCons getBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBalance(GeneratorLpCons newBalance, NotificationChain msgs) {
		GeneratorLpCons oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE, oldBalance, newBalance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(GeneratorLpCons newBalance) {
		if (newBalance != balance) {
			NotificationChain msgs = null;
			if (balance != null)
				msgs = ((InternalEObject)balance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE, null, msgs);
			if (newBalance != null)
				msgs = ((InternalEObject)newBalance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE, null, msgs);
			msgs = basicSetBalance(newBalance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE, newBalance, newBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isReservingSelectedSolution() {
		double epsilon = this.getLPMacroPlanner().getEpsilon();
		double reserved = this.getReservationSelectedSolution();
		boolean isReserved = Math.abs(reserved)>epsilon;
		return isReserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getReservationMaximum() {
		float amount = 0.0f;
		for ( LPAvailabilityBucket bucketAvailability: this.getAvailabilities()){
			amount += bucketAvailability.getAvailability().getAvailability().getQuantity()
					* bucketAvailability.getFraction();
		}
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getReservationSelectedSolution() {
		return this.getReserved().getSelectedSolutionValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isWithAvailability() {
		boolean with = this.getAvailabilities().size()>0;
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isAvailabilityTightSelectedSolution() {
		for(LPAvailabilityBucket availabitiy : this.getAvailabilities()){
			if ( !availabitiy.isTightSelectedSolution() ){
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isAvailabilitySlackSelectedSolution() {
		for(LPAvailabilityBucket availabitiy : this.getAvailabilities()){
			if ( availabitiy.isSlackSelectedSolution() ){
				return true;
			}
		}
		return false;
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
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResource((LPResource)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAvailabilities()).basicAdd(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReservations()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE:
				return basicSetResource(null, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES:
				return ((InternalEList<?>)getAvailabilities()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATIONS:
				return ((InternalEList<?>)getReservations()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED:
				return basicSetReserved(null, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__PLANNED:
				return basicSetPlanned(null, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_RESERVED:
				return basicSetCalcReserved(null, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_PLANNED:
				return basicSetCalcPlanned(null, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE:
				return basicSetBalance(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_RESOURCE__LP_BUCKETS, LPResource.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE:
				return getResource();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES:
				return getAvailabilities();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATIONS:
				return getReservations();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED:
				return getReserved();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__PLANNED:
				return getPlanned();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_RESERVED:
				return getCalcReserved();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_PLANNED:
				return getCalcPlanned();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE:
				return getBalance();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVING_SELECTED_SOLUTION:
				return isReservingSelectedSolution();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATION_SELECTED_SOLUTION:
				return getReservationSelectedSolution();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__WITH_AVAILABILITY:
				return isWithAvailability();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATION_MAXIMUM:
				return getReservationMaximum();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITY_TIGHT_SELECTED_SOLUTION:
				return isAvailabilityTightSelectedSolution();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITY_SLACK_SELECTED_SOLUTION:
				return isAvailabilitySlackSelectedSolution();
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
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE:
				setResource((LPResource)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES:
				getAvailabilities().clear();
				getAvailabilities().addAll((Collection<? extends LPAvailabilityBucket>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATIONS:
				getReservations().clear();
				getReservations().addAll((Collection<? extends LPRoutingBucketResource>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED:
				setReserved((GeneratorLpVar)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__PLANNED:
				setPlanned((GeneratorLpVar)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_RESERVED:
				setCalcReserved((GeneratorLpCons)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_PLANNED:
				setCalcPlanned((GeneratorLpCons)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE:
				setBalance((GeneratorLpCons)newValue);
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
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE:
				setResource((LPResource)null);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES:
				getAvailabilities().clear();
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATIONS:
				getReservations().clear();
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED:
				setReserved((GeneratorLpVar)null);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__PLANNED:
				setPlanned((GeneratorLpVar)null);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_RESERVED:
				setCalcReserved((GeneratorLpCons)null);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_PLANNED:
				setCalcPlanned((GeneratorLpCons)null);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE:
				setBalance((GeneratorLpCons)null);
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
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE:
				return getResource() != null;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES:
				return availabilities != null && !availabilities.isEmpty();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATIONS:
				return reservations != null && !reservations.isEmpty();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED:
				return reserved != null;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__PLANNED:
				return planned != null;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_RESERVED:
				return calcReserved != null;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__CALC_PLANNED:
				return calcPlanned != null;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE:
				return balance != null;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVING_SELECTED_SOLUTION:
				return isReservingSelectedSolution() != RESERVING_SELECTED_SOLUTION_EDEFAULT;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATION_SELECTED_SOLUTION:
				return getReservationSelectedSolution() != RESERVATION_SELECTED_SOLUTION_EDEFAULT;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__WITH_AVAILABILITY:
				return isWithAvailability() != WITH_AVAILABILITY_EDEFAULT;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATION_MAXIMUM:
				return getReservationMaximum() != RESERVATION_MAXIMUM_EDEFAULT;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITY_TIGHT_SELECTED_SOLUTION:
				return isAvailabilityTightSelectedSolution() != AVAILABILITY_TIGHT_SELECTED_SOLUTION_EDEFAULT;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITY_SLACK_SELECTED_SOLUTION:
				return isAvailabilitySlackSelectedSolution() != AVAILABILITY_SLACK_SELECTED_SOLUTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();
		
		LPResource resource = this.getResource();
		
		// logic name
		String name = String.format("%s,%s", resource.getName(), this.getBucketShortName());
		this.setName(name);
	}

	/**
	 * 
	 */
	@Override
	public void generateXReferences() {
		super.generateXReferences();
		
	}

	/**
	 * 
	 */
	@Override
	public void generateVars() {
		super.generateVars();
		
		// var reseerved
		{
		GeneratorLpVar var = Util.createGeneratorLpVarRealPositiveUnbounded("reserved");
		this.setReserved(var);  // owning
		}
		// var planned
		{
		GeneratorLpVar var = Util.createGeneratorLpVarRealPositiveUnbounded("planned");
		this.setPlanned(var);  // owning
		}
	}

	/**
	 * 
	 */
	@Override
	public void generateCons() {
		super.generateCons();
		
		this.generateLpConsCalcReserved();
		this.generateLpConsCalcPlanned();
		this.generateLpConsBalance();
	}

	/**
	 * 
	 */
	private void generateLpConsCalcReserved(){
		GeneratorLpCons cons = SolverFactory.eINSTANCE.createGeneratorLpCons();
		cons.setType(EnumLpConsType.ENUM_LITERAL_LP_CONS_EQUAL);
		cons.setName("calc_reserved");
		GeneratorLpVar var_reserved_total = this.getReserved();
		cons.constructTerm(var_reserved_total, 1.0f);
		float rhs = 0.0f;
		for (  LPAvailabilityBucket lp_availability_bucket : this.getAvailabilities()){
			GeneratorLpVar var_stocked = lp_availability_bucket.getReserved();
			cons.constructTerm(var_stocked, -1.0f);
		} // 
		cons.setRighHandSide(rhs);
		this.setCalcReserved(cons); // owning
	}

	/**
	 * 
	 */
	private void generateLpConsCalcPlanned(){
		// number of resources planned

		GeneratorLpCons cons = SolverFactory.eINSTANCE.createGeneratorLpCons();
		cons.setType(EnumLpConsType.ENUM_LITERAL_LP_CONS_EQUAL);
		cons.setName("calc_planned");
		GeneratorLpVar var_planned = this.getPlanned();
		cons.constructTerm(var_planned, 1.0f);
		float rhs = 0.0f;
		for (  LPRoutingBucketResource lp_resource_bucket_planned : this.getReservations()){
			LPRoutingBucket lp_routing_bucket = lp_resource_bucket_planned.getRouting();
			LPRoutingResource lp_routing_resource = lp_resource_bucket_planned.getRoutingResource();
			RoutingResource routing_resource = lp_routing_resource.getRoutingResource();
			GeneratorLpVar var_routing_planned = lp_routing_bucket.getPlanned();
			float resourcesReservedOneRouting = (float)routing_resource.getReservation(); // resource times TimeUnits
			float resourcesReservedPerBucket = resourcesReservedOneRouting 
					                         * routing_resource.getRouting().getMacroPlannerData().getTimeUnit().toHours()
					                         / lp_routing_bucket.getBucket().getHours(); // resources
					                         
			cons.contributeTerm(var_routing_planned, -resourcesReservedPerBucket); // a routing may contribute several times to the same resource bucket
		} // 
		cons.setRighHandSide(rhs);
		this.setCalcPlanned(cons); // owning
	}
	
	/**
	 * 
	 */
	private void generateLpConsBalance(){

		GeneratorLpCons cons = SolverFactory.eINSTANCE.createGeneratorLpCons();
		cons.setType(EnumLpConsType.ENUM_LITERAL_LP_CONS_EQUAL);
		cons.setName("balance");
		GeneratorLpVar var_planned = this.getPlanned();
		GeneratorLpVar var_reserved = this.getReserved();
		cons.constructTerm(var_planned, 1.0f);
		cons.constructTerm(var_reserved, -1.0f);
		float rhs = 0.0f;
		cons.setRighHandSide(rhs);
		this.setBalance(cons); // owning
	}
} //LPResourceBucketImpl
