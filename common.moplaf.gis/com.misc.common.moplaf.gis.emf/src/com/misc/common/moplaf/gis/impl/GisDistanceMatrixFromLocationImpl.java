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
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisDistanceMatrixElement;
import com.misc.common.moplaf.gis.GisDistanceMatrixFromLocation;
import com.misc.common.moplaf.gis.GisDistanceMatrixToLocation;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Matrix From Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixFromLocationImpl#getToLocations <em>To Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixFromLocationImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GisDistanceMatrixFromLocationImpl extends MinimalEObjectImpl.Container implements GisDistanceMatrixFromLocation {
	private HashMap<GisLocation, GisDistanceMatrixElement>   toLocationsIndex = null;
	/**
	 * The cached value of the '{@link #getToLocations() <em>To Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GisDistanceMatrixElement> toLocations;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected GisLocation location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisDistanceMatrixFromLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_DISTANCE_MATRIX_FROM_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisDistanceMatrixElement> getToLocations() {
		if (toLocations == null) {
			toLocations = new EObjectContainmentWithInverseEList<GisDistanceMatrixElement>(GisDistanceMatrixElement.class, this, GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__TO_LOCATIONS, GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION);
		}
		return toLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisLocation getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (GisLocation)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisLocation basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(GisLocation newLocation) {
		GisLocation oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisDistanceMatrixElement getElement(GisLocation toLocation) {
		if ( this.toLocationsIndex==null){
			this.toLocationsIndex = new HashMap<GisLocation, GisDistanceMatrixElement>();
			for ( GisDistanceMatrixElement element: this.getToLocations()){
				this.toLocationsIndex.put(element.getToLocation().getLocation(), element);
			}
		}
		return this.toLocationsIndex.get(toLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisDistanceMatrixElement addElement(GisDistanceMatrixToLocation toLocation) {
		GisDistanceMatrixElement element = this.getElement(toLocation.getLocation());
		if ( element==null){
			element = GisFactory.eINSTANCE.createGisDistanceMatrixElement();
			element.setToLocation(toLocation);
			element.setFromLocation(this);
			this.toLocationsIndex.put(toLocation.getLocation(), element);
		}
		return element;
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
			case GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__TO_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToLocations()).basicAdd(otherEnd, msgs);
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
			case GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__TO_LOCATIONS:
				return ((InternalEList<?>)getToLocations()).basicRemove(otherEnd, msgs);
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
			case GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__TO_LOCATIONS:
				return getToLocations();
			case GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
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
			case GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__TO_LOCATIONS:
				getToLocations().clear();
				getToLocations().addAll((Collection<? extends GisDistanceMatrixElement>)newValue);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__LOCATION:
				setLocation((GisLocation)newValue);
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
			case GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__TO_LOCATIONS:
				getToLocations().clear();
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__LOCATION:
				setLocation((GisLocation)null);
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
			case GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__TO_LOCATIONS:
				return toLocations != null && !toLocations.isEmpty();
			case GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__LOCATION:
				return location != null;
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
			case GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION___GET_ELEMENT__GISLOCATION:
				return getElement((GisLocation)arguments.get(0));
			case GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION___ADD_ELEMENT__GISDISTANCEMATRIXTOLOCATION:
				return addElement((GisDistanceMatrixToLocation)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GisDistanceMatrixFromLocationImpl
