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
import com.misc.common.moplaf.macroplanner.Location;
import com.misc.common.moplaf.macroplanner.LocationResource;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;
import com.misc.common.moplaf.macroplanner.Resource;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationResourceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationResourceImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationResourceImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationResourceImpl#getAvailabilities <em>Availabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationResourceImpl extends MinimalEObjectImpl.Container implements LocationResource {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

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
	 * The cached value of the '{@link #getAvailabilities() <em>Availabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Availability> availabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.LOCATION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (eContainerFeatureID() != MacroPlannerPackage.LOCATION_RESOURCE__LOCATION) return null;
		return (Location)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLocation, MacroPlannerPackage.LOCATION_RESOURCE__LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != eInternalContainer() || (eContainerFeatureID() != MacroPlannerPackage.LOCATION_RESOURCE__LOCATION && newLocation != null)) {
			if (EcoreUtil.isAncestor(this, newLocation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, MacroPlannerPackage.LOCATION__RESOURCES, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.LOCATION_RESOURCE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerPackage.LOCATION_RESOURCE__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.LOCATION_RESOURCE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getCode() {
		String code = String.format("LP(%s,%s)", 
				this.getLocation()==null ? "null": this.getLocation().getCode(),
				this.getResource()==null  ? "null": this.getResource().getCode());
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Availability> getAvailabilities() {
		if (availabilities == null) {
			availabilities = new EObjectWithInverseResolvingEList<Availability>(Availability.class, this, MacroPlannerPackage.LOCATION_RESOURCE__AVAILABILITIES, MacroPlannerPackage.AVAILABILITY__LOCATION_RESOURCE);
		}
		return availabilities;
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
			case MacroPlannerPackage.LOCATION_RESOURCE__LOCATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLocation((Location)otherEnd, msgs);
			case MacroPlannerPackage.LOCATION_RESOURCE__AVAILABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAvailabilities()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerPackage.LOCATION_RESOURCE__LOCATION:
				return basicSetLocation(null, msgs);
			case MacroPlannerPackage.LOCATION_RESOURCE__AVAILABILITIES:
				return ((InternalEList<?>)getAvailabilities()).basicRemove(otherEnd, msgs);
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
			case MacroPlannerPackage.LOCATION_RESOURCE__LOCATION:
				return eInternalContainer().eInverseRemove(this, MacroPlannerPackage.LOCATION__RESOURCES, Location.class, msgs);
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
			case MacroPlannerPackage.LOCATION_RESOURCE__LOCATION:
				return getLocation();
			case MacroPlannerPackage.LOCATION_RESOURCE__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case MacroPlannerPackage.LOCATION_RESOURCE__CODE:
				return getCode();
			case MacroPlannerPackage.LOCATION_RESOURCE__AVAILABILITIES:
				return getAvailabilities();
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
			case MacroPlannerPackage.LOCATION_RESOURCE__LOCATION:
				setLocation((Location)newValue);
				return;
			case MacroPlannerPackage.LOCATION_RESOURCE__RESOURCE:
				setResource((Resource)newValue);
				return;
			case MacroPlannerPackage.LOCATION_RESOURCE__AVAILABILITIES:
				getAvailabilities().clear();
				getAvailabilities().addAll((Collection<? extends Availability>)newValue);
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
			case MacroPlannerPackage.LOCATION_RESOURCE__LOCATION:
				setLocation((Location)null);
				return;
			case MacroPlannerPackage.LOCATION_RESOURCE__RESOURCE:
				setResource((Resource)null);
				return;
			case MacroPlannerPackage.LOCATION_RESOURCE__AVAILABILITIES:
				getAvailabilities().clear();
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
			case MacroPlannerPackage.LOCATION_RESOURCE__LOCATION:
				return getLocation() != null;
			case MacroPlannerPackage.LOCATION_RESOURCE__RESOURCE:
				return resource != null;
			case MacroPlannerPackage.LOCATION_RESOURCE__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case MacroPlannerPackage.LOCATION_RESOURCE__AVAILABILITIES:
				return availabilities != null && !availabilities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocationResourceImpl
