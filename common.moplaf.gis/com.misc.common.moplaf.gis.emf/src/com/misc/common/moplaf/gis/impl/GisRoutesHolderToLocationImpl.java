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
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisRouteCalculator;
import com.misc.common.moplaf.gis.GisRoutesHolder;
import com.misc.common.moplaf.gis.GisRoutesHolderElement;
import com.misc.common.moplaf.gis.GisRoutesHolderFromLocation;
import com.misc.common.moplaf.gis.GisRoutesHolderToLocation;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routes Holder To Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderToLocationImpl#getFromLocations <em>From Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderToLocationImpl#getRoutesHolder <em>Routes Holder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisRoutesHolderToLocationImpl extends GisRoutesHolderWaypointImpl implements GisRoutesHolderToLocation {
	/**
	 * The cached value of the '{@link #getFromLocations() <em>From Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GisRoutesHolderElement> fromLocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRoutesHolderToLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ROUTES_HOLDER_TO_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisRoutesHolderElement> getFromLocations() {
		if (fromLocations == null) {
			fromLocations = new EObjectWithInverseResolvingEList<GisRoutesHolderElement>(GisRoutesHolderElement.class, this, GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS, GisPackage.GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION);
		}
		return fromLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolder getRoutesHolder() {
		if (eContainerFeatureID() != GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER) return null;
		return (GisRoutesHolder)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoutesHolder(GisRoutesHolder newRoutesHolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoutesHolder, GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutesHolder(GisRoutesHolder newRoutesHolder) {
		if (newRoutesHolder != eInternalContainer() || (eContainerFeatureID() != GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER && newRoutesHolder != null)) {
			if (EcoreUtil.isAncestor(this, newRoutesHolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoutesHolder != null)
				msgs = ((InternalEObject)newRoutesHolder).eInverseAdd(this, GisPackage.GIS_ROUTES_HOLDER__TO_LOCATIONS, GisRoutesHolder.class, msgs);
			msgs = basicSetRoutesHolder(newRoutesHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER, newRoutesHolder, newRoutesHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("To %s", this.getLocation().getDescription());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisRoutesHolderElement getElement(GisLocation fromLocation) {
		GisRoutesHolder holder = this.getRoutesHolder();
		GisRoutesHolderFromLocation from_holder = holder.getFromLocation(fromLocation);
		return from_holder.getElement(this.getLocation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisRoutesHolderElement addElement(GisRoutesHolderFromLocation fromLocation) {
		return fromLocation.addElement(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void update(GisRouteCalculator calculator) {
		GisRoutesHolder holder = this.getRoutesHolder();
		BasicEList<GisLocation> froms = new BasicEList<>();
		for ( GisRoutesHolderFromLocation from : holder.getFromLocations()) {
			froms.add(from.getLocation());
		}
		BasicEList<GisLocation> tos = new BasicEList<>();
		tos.add(this.getLocation());
		holder.update(calculator, froms, tos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		GisRoutesHolder holder = this.getRoutesHolder();
		GisRouteCalculator calculator = holder.getCalculator();
		this.update(calculator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void remove() {
		while( this.getFromLocations().size()>0 ) {
			this.getFromLocations().get(0).remove();
		}

		GisRoutesHolderImpl routeHolder = (GisRoutesHolderImpl)this.getRoutesHolder();
		routeHolder.onToLocationRemoved(this);

		this.setRoutesHolder(null); // owning
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromLocations()).basicAdd(otherEnd, msgs);
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoutesHolder((GisRoutesHolder)otherEnd, msgs);
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS:
				return ((InternalEList<?>)getFromLocations()).basicRemove(otherEnd, msgs);
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER:
				return basicSetRoutesHolder(null, msgs);
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER:
				return eInternalContainer().eInverseRemove(this, GisPackage.GIS_ROUTES_HOLDER__TO_LOCATIONS, GisRoutesHolder.class, msgs);
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS:
				return getFromLocations();
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER:
				return getRoutesHolder();
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS:
				getFromLocations().clear();
				getFromLocations().addAll((Collection<? extends GisRoutesHolderElement>)newValue);
				return;
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER:
				setRoutesHolder((GisRoutesHolder)newValue);
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS:
				getFromLocations().clear();
				return;
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER:
				setRoutesHolder((GisRoutesHolder)null);
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS:
				return fromLocations != null && !fromLocations.isEmpty();
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER:
				return getRoutesHolder() != null;
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION___GET_ELEMENT__GISLOCATION:
				return getElement((GisLocation)arguments.get(0));
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION___ADD_ELEMENT__GISROUTESHOLDERFROMLOCATION:
				return addElement((GisRoutesHolderFromLocation)arguments.get(0));
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION___UPDATE__GISROUTECALCULATOR:
				update((GisRouteCalculator)arguments.get(0));
				return null;
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION___REFRESH:
				refresh();
				return null;
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION___REMOVE:
				remove();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	// this method is not part of the api but of the implementation
	public void onElementRemoved(GisRoutesHolderElement element) {
	}
	
} //GisRoutesHolderToLocationImpl
