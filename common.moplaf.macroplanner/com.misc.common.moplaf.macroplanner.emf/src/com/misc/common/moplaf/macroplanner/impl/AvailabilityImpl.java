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
package com.misc.common.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.Availability;
import com.misc.common.moplaf.macroplanner.LocationResource;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.AvailabilityImpl#getLocationResource <em>Location Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.AvailabilityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.AvailabilityImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.AvailabilityImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.AvailabilityImpl#getTo <em>To</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.AvailabilityImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.AvailabilityImpl#isEnforce <em>Enforce</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.AvailabilityImpl#getPenalty <em>Penalty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvailabilityImpl extends MacroPlannerDataElementImpl implements Availability {
	/**
	 * The cached value of the '{@link #getLocationResource() <em>Location Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationResource()
	 * @generated
	 * @ordered
	 */
	protected LocationResource locationResource;

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
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final float QUANTITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected float quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Date from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Date to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected float cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnforce() <em>Enforce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnforce()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENFORCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnforce() <em>Enforce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnforce()
	 * @generated
	 * @ordered
	 */
	protected boolean enforce = ENFORCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenalty() <em>Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalty()
	 * @generated
	 * @ordered
	 */
	protected static final float PENALTY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPenalty() <em>Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalty()
	 * @generated
	 * @ordered
	 */
	protected float penalty = PENALTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.AVAILABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(float newQuantity) {
		float oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.AVAILABILITY__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Date newFrom) {
		Date oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.AVAILABILITY__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Date newTo) {
		Date oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.AVAILABILITY__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(float newCost) {
		float oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.AVAILABILITY__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnforce() {
		return enforce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnforce(boolean newEnforce) {
		boolean oldEnforce = enforce;
		enforce = newEnforce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.AVAILABILITY__ENFORCE, oldEnforce, enforce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPenalty() {
		return penalty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenalty(float newPenalty) {
		float oldPenalty = penalty;
		penalty = newPenalty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.AVAILABILITY__PENALTY, oldPenalty, penalty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationResource getLocationResource() {
		if (locationResource != null && locationResource.eIsProxy()) {
			InternalEObject oldLocationResource = (InternalEObject)locationResource;
			locationResource = (LocationResource)eResolveProxy(oldLocationResource);
			if (locationResource != oldLocationResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerPackage.AVAILABILITY__LOCATION_RESOURCE, oldLocationResource, locationResource));
			}
		}
		return locationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationResource basicGetLocationResource() {
		return locationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationResource(LocationResource newLocationResource, NotificationChain msgs) {
		LocationResource oldLocationResource = locationResource;
		locationResource = newLocationResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.AVAILABILITY__LOCATION_RESOURCE, oldLocationResource, newLocationResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationResource(LocationResource newLocationResource) {
		if (newLocationResource != locationResource) {
			NotificationChain msgs = null;
			if (locationResource != null)
				msgs = ((InternalEObject)locationResource).eInverseRemove(this, MacroPlannerPackage.LOCATION_RESOURCE__AVAILABILITIES, LocationResource.class, msgs);
			if (newLocationResource != null)
				msgs = ((InternalEObject)newLocationResource).eInverseAdd(this, MacroPlannerPackage.LOCATION_RESOURCE__AVAILABILITIES, LocationResource.class, msgs);
			msgs = basicSetLocationResource(newLocationResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.AVAILABILITY__LOCATION_RESOURCE, newLocationResource, newLocationResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		LocationResource locationResource = this.getLocationResource();
		String description = String.format("%s: %.2f", locationResource==null ? "null" : locationResource.getCode(), this.getQuantity());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerPackage.AVAILABILITY__LOCATION_RESOURCE:
				if (locationResource != null)
					msgs = ((InternalEObject)locationResource).eInverseRemove(this, MacroPlannerPackage.LOCATION_RESOURCE__AVAILABILITIES, LocationResource.class, msgs);
				return basicSetLocationResource((LocationResource)otherEnd, msgs);
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
			case MacroPlannerPackage.AVAILABILITY__LOCATION_RESOURCE:
				return basicSetLocationResource(null, msgs);
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
			case MacroPlannerPackage.AVAILABILITY__LOCATION_RESOURCE:
				if (resolve) return getLocationResource();
				return basicGetLocationResource();
			case MacroPlannerPackage.AVAILABILITY__DESCRIPTION:
				return getDescription();
			case MacroPlannerPackage.AVAILABILITY__QUANTITY:
				return getQuantity();
			case MacroPlannerPackage.AVAILABILITY__FROM:
				return getFrom();
			case MacroPlannerPackage.AVAILABILITY__TO:
				return getTo();
			case MacroPlannerPackage.AVAILABILITY__COST:
				return getCost();
			case MacroPlannerPackage.AVAILABILITY__ENFORCE:
				return isEnforce();
			case MacroPlannerPackage.AVAILABILITY__PENALTY:
				return getPenalty();
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
			case MacroPlannerPackage.AVAILABILITY__LOCATION_RESOURCE:
				setLocationResource((LocationResource)newValue);
				return;
			case MacroPlannerPackage.AVAILABILITY__QUANTITY:
				setQuantity((Float)newValue);
				return;
			case MacroPlannerPackage.AVAILABILITY__FROM:
				setFrom((Date)newValue);
				return;
			case MacroPlannerPackage.AVAILABILITY__TO:
				setTo((Date)newValue);
				return;
			case MacroPlannerPackage.AVAILABILITY__COST:
				setCost((Float)newValue);
				return;
			case MacroPlannerPackage.AVAILABILITY__ENFORCE:
				setEnforce((Boolean)newValue);
				return;
			case MacroPlannerPackage.AVAILABILITY__PENALTY:
				setPenalty((Float)newValue);
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
			case MacroPlannerPackage.AVAILABILITY__LOCATION_RESOURCE:
				setLocationResource((LocationResource)null);
				return;
			case MacroPlannerPackage.AVAILABILITY__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case MacroPlannerPackage.AVAILABILITY__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case MacroPlannerPackage.AVAILABILITY__TO:
				setTo(TO_EDEFAULT);
				return;
			case MacroPlannerPackage.AVAILABILITY__COST:
				setCost(COST_EDEFAULT);
				return;
			case MacroPlannerPackage.AVAILABILITY__ENFORCE:
				setEnforce(ENFORCE_EDEFAULT);
				return;
			case MacroPlannerPackage.AVAILABILITY__PENALTY:
				setPenalty(PENALTY_EDEFAULT);
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
			case MacroPlannerPackage.AVAILABILITY__LOCATION_RESOURCE:
				return locationResource != null;
			case MacroPlannerPackage.AVAILABILITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case MacroPlannerPackage.AVAILABILITY__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case MacroPlannerPackage.AVAILABILITY__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case MacroPlannerPackage.AVAILABILITY__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case MacroPlannerPackage.AVAILABILITY__COST:
				return cost != COST_EDEFAULT;
			case MacroPlannerPackage.AVAILABILITY__ENFORCE:
				return enforce != ENFORCE_EDEFAULT;
			case MacroPlannerPackage.AVAILABILITY__PENALTY:
				return penalty != PENALTY_EDEFAULT;
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
		result.append(" (Quantity: ");
		result.append(quantity);
		result.append(", From: ");
		result.append(from);
		result.append(", To: ");
		result.append(to);
		result.append(", Cost: ");
		result.append(cost);
		result.append(", Enforce: ");
		result.append(enforce);
		result.append(", Penalty: ");
		result.append(penalty);
		result.append(')');
		return result.toString();
	}

} //AvailabilityImpl
