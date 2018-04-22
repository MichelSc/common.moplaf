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

import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisRouteCalculator;
import com.misc.common.moplaf.gis.GisRoutesHolder;
import com.misc.common.moplaf.gis.GisRoutesHolderElement;
import com.misc.common.moplaf.gis.GisRoutesHolderFromLocation;
import com.misc.common.moplaf.gis.GisRoutesHolderToLocation;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routes Holder From Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderFromLocationImpl#getToLocations <em>To Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderFromLocationImpl#getRoutesHolder <em>Routes Holder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisRoutesHolderFromLocationImpl extends GisRoutesHolderWaypointImpl implements GisRoutesHolderFromLocation {
	private HashMap<GisLocation, GisRoutesHolderElement>   toLocationsIndex = null;

	/**
	 * The cached value of the '{@link #getToLocations() <em>To Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GisRoutesHolderElement> toLocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRoutesHolderFromLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ROUTES_HOLDER_FROM_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisRoutesHolderElement> getToLocations() {
		if (toLocations == null) {
			toLocations = new EObjectContainmentWithInverseEList<GisRoutesHolderElement>(GisRoutesHolderElement.class, this, GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__TO_LOCATIONS, GisPackage.GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION);
		}
		return toLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolder getRoutesHolder() {
		if (eContainerFeatureID() != GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER) return null;
		return (GisRoutesHolder)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoutesHolder(GisRoutesHolder newRoutesHolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoutesHolder, GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutesHolder(GisRoutesHolder newRoutesHolder) {
		if (newRoutesHolder != eInternalContainer() || (eContainerFeatureID() != GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER && newRoutesHolder != null)) {
			if (EcoreUtil.isAncestor(this, newRoutesHolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoutesHolder != null)
				msgs = ((InternalEObject)newRoutesHolder).eInverseAdd(this, GisPackage.GIS_ROUTES_HOLDER__FROM_LOCATIONS, GisRoutesHolder.class, msgs);
			msgs = basicSetRoutesHolder(newRoutesHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER, newRoutesHolder, newRoutesHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("From %s", this.getLocation().getDescription());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisRoutesHolderElement getElement(GisLocation toLocation) {
		if ( this.toLocationsIndex==null){
			this.toLocationsIndex = new HashMap<GisLocation, GisRoutesHolderElement>();
			for ( GisRoutesHolderElement element: this.getToLocations()){
				this.toLocationsIndex.put(element.getToLocation().getLocation(), element);
			}
		}
		return this.toLocationsIndex.get(toLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisRoutesHolderElement addElement(GisRoutesHolderToLocation toLocation) {
		GisRoutesHolderElement element = this.getElement(toLocation.getLocation());
		if ( element==null){
			element = GisFactory.eINSTANCE.createGisRoutesHolderElement();
			element.setToLocation(toLocation);
			element.setFromLocation(this);
			this.toLocationsIndex.put(toLocation.getLocation(), element);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void update(GisRouteCalculator calculator) {
		GisRoutesHolder holder = this.getRoutesHolder();
		BasicEList<GisLocation> froms = new BasicEList<>();
		froms.add(this.getLocation());
		BasicEList<GisLocation> tos = new BasicEList<>();
		for ( GisRoutesHolderToLocation to : holder.getToLocations()) {
			tos.add(to.getLocation());
		}
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
		while ( this.getToLocations().size()>0 ) {
			this.getToLocations().get(0).remove();
		}

		GisRoutesHolderImpl routeHolder = (GisRoutesHolderImpl)this.getRoutesHolder();
		routeHolder.onFromLocationRemoved(this);
		
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
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__TO_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToLocations()).basicAdd(otherEnd, msgs);
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER:
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
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__TO_LOCATIONS:
				return ((InternalEList<?>)getToLocations()).basicRemove(otherEnd, msgs);
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER:
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
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER:
				return eInternalContainer().eInverseRemove(this, GisPackage.GIS_ROUTES_HOLDER__FROM_LOCATIONS, GisRoutesHolder.class, msgs);
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
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__TO_LOCATIONS:
				return getToLocations();
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER:
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
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__TO_LOCATIONS:
				getToLocations().clear();
				getToLocations().addAll((Collection<? extends GisRoutesHolderElement>)newValue);
				return;
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER:
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
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__TO_LOCATIONS:
				getToLocations().clear();
				return;
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER:
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
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__TO_LOCATIONS:
				return toLocations != null && !toLocations.isEmpty();
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER:
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
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION___GET_ELEMENT__GISLOCATION:
				return getElement((GisLocation)arguments.get(0));
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION___ADD_ELEMENT__GISROUTESHOLDERTOLOCATION:
				return addElement((GisRoutesHolderToLocation)arguments.get(0));
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION___UPDATE__GISROUTECALCULATOR:
				update((GisRouteCalculator)arguments.get(0));
				return null;
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION___REFRESH:
				refresh();
				return null;
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION___REMOVE:
				remove();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	// this method is not part of the api but of the implementation
	public void onElementRemoved(GisRoutesHolderElement element) {
		if ( this.toLocationsIndex!=null ) {
			this.toLocationsIndex.remove(element.getToLocation().getLocation());
		}
	}

} //GisRoutesHolderFromLocationImpl
