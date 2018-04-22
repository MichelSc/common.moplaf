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
package com.misc.common.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.LocationResource;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;
import com.misc.common.moplaf.macroplanner.Routing;
import com.misc.common.moplaf.macroplanner.RoutingResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routing Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl#getLocationResource <em>Location Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl#getReservation <em>Reservation</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoutingResourceImpl extends MinimalEObjectImpl.Container implements RoutingResource {
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
	 * The default value of the '{@link #getReservation() <em>Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected static final double RESERVATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReservation() <em>Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected double reservation = RESERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float OFFSET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected float offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutingResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.ROUTING_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing getRouting() {
		if (eContainerFeatureID() != MacroPlannerPackage.ROUTING_RESOURCE__ROUTING) return null;
		return (Routing)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouting(Routing newRouting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRouting, MacroPlannerPackage.ROUTING_RESOURCE__ROUTING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouting(Routing newRouting) {
		if (newRouting != eInternalContainer() || (eContainerFeatureID() != MacroPlannerPackage.ROUTING_RESOURCE__ROUTING && newRouting != null)) {
			if (EcoreUtil.isAncestor(this, newRouting))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRouting != null)
				msgs = ((InternalEObject)newRouting).eInverseAdd(this, MacroPlannerPackage.ROUTING__RESOURCES, Routing.class, msgs);
			msgs = basicSetRouting(newRouting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING_RESOURCE__ROUTING, newRouting, newRouting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReservation() {
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservation(double newReservation) {
		double oldReservation = reservation;
		reservation = newReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING_RESOURCE__RESERVATION, oldReservation, reservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(float newOffset) {
		float oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING_RESOURCE__OFFSET, oldOffset, offset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerPackage.ROUTING_RESOURCE__LOCATION_RESOURCE, oldLocationResource, locationResource));
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
	public void setLocationResource(LocationResource newLocationResource) {
		LocationResource oldLocationResource = locationResource;
		locationResource = newLocationResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING_RESOURCE__LOCATION_RESOURCE, oldLocationResource, locationResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getCode() {
		String code = String.format("RR(%s,%s)", 
				this.getRouting()==null ? "null": this.getRouting().getCode(),
				this.getLocationResource()==null  ? "null": this.getLocationResource().getCode());
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerPackage.ROUTING_RESOURCE__ROUTING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRouting((Routing)otherEnd, msgs);
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
			case MacroPlannerPackage.ROUTING_RESOURCE__ROUTING:
				return basicSetRouting(null, msgs);
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
			case MacroPlannerPackage.ROUTING_RESOURCE__ROUTING:
				return eInternalContainer().eInverseRemove(this, MacroPlannerPackage.ROUTING__RESOURCES, Routing.class, msgs);
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
			case MacroPlannerPackage.ROUTING_RESOURCE__ROUTING:
				return getRouting();
			case MacroPlannerPackage.ROUTING_RESOURCE__LOCATION_RESOURCE:
				if (resolve) return getLocationResource();
				return basicGetLocationResource();
			case MacroPlannerPackage.ROUTING_RESOURCE__RESERVATION:
				return getReservation();
			case MacroPlannerPackage.ROUTING_RESOURCE__OFFSET:
				return getOffset();
			case MacroPlannerPackage.ROUTING_RESOURCE__CODE:
				return getCode();
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
			case MacroPlannerPackage.ROUTING_RESOURCE__ROUTING:
				setRouting((Routing)newValue);
				return;
			case MacroPlannerPackage.ROUTING_RESOURCE__LOCATION_RESOURCE:
				setLocationResource((LocationResource)newValue);
				return;
			case MacroPlannerPackage.ROUTING_RESOURCE__RESERVATION:
				setReservation((Double)newValue);
				return;
			case MacroPlannerPackage.ROUTING_RESOURCE__OFFSET:
				setOffset((Float)newValue);
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
			case MacroPlannerPackage.ROUTING_RESOURCE__ROUTING:
				setRouting((Routing)null);
				return;
			case MacroPlannerPackage.ROUTING_RESOURCE__LOCATION_RESOURCE:
				setLocationResource((LocationResource)null);
				return;
			case MacroPlannerPackage.ROUTING_RESOURCE__RESERVATION:
				setReservation(RESERVATION_EDEFAULT);
				return;
			case MacroPlannerPackage.ROUTING_RESOURCE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
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
			case MacroPlannerPackage.ROUTING_RESOURCE__ROUTING:
				return getRouting() != null;
			case MacroPlannerPackage.ROUTING_RESOURCE__LOCATION_RESOURCE:
				return locationResource != null;
			case MacroPlannerPackage.ROUTING_RESOURCE__RESERVATION:
				return reservation != RESERVATION_EDEFAULT;
			case MacroPlannerPackage.ROUTING_RESOURCE__OFFSET:
				return offset != OFFSET_EDEFAULT;
			case MacroPlannerPackage.ROUTING_RESOURCE__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
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
		result.append(" (Reservation: ");
		result.append(reservation);
		result.append(", Offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

} //RoutingResourceImpl
