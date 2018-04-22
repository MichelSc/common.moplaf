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
import com.misc.common.moplaf.gis.GisRouteInfo;
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routes Holder Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderElementImpl#getToLocation <em>To Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderElementImpl#getFromLocation <em>From Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderElementImpl#getRoutesInfo <em>Routes Info</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderElementImpl#isCalculated <em>Calculated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisRoutesHolderElementImpl extends MinimalEObjectImpl.Container implements GisRoutesHolderElement {
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
	 * The cached value of the '{@link #getToLocation() <em>To Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToLocation()
	 * @generated
	 * @ordered
	 */
	protected GisRoutesHolderToLocation toLocation;

	/**
	 * The cached value of the '{@link #getRoutesInfo() <em>Routes Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutesInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<GisRouteInfo> routesInfo;

	/**
	 * The default value of the '{@link #isCalculated() <em>Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALCULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCalculated() <em>Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculated()
	 * @generated
	 * @ordered
	 */
	protected boolean calculated = CALCULATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRoutesHolderElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ROUTES_HOLDER_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("From %s to %s", 
                this.getFromLocation().getLocation().getDescription(),
                this.getToLocation().getLocation().getDescription());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolderToLocation getToLocation() {
		if (toLocation != null && toLocation.eIsProxy()) {
			InternalEObject oldToLocation = (InternalEObject)toLocation;
			toLocation = (GisRoutesHolderToLocation)eResolveProxy(oldToLocation);
			if (toLocation != oldToLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION, oldToLocation, toLocation));
			}
		}
		return toLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolderToLocation basicGetToLocation() {
		return toLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToLocation(GisRoutesHolderToLocation newToLocation, NotificationChain msgs) {
		GisRoutesHolderToLocation oldToLocation = toLocation;
		toLocation = newToLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION, oldToLocation, newToLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToLocation(GisRoutesHolderToLocation newToLocation) {
		if (newToLocation != toLocation) {
			NotificationChain msgs = null;
			if (toLocation != null)
				msgs = ((InternalEObject)toLocation).eInverseRemove(this, GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS, GisRoutesHolderToLocation.class, msgs);
			if (newToLocation != null)
				msgs = ((InternalEObject)newToLocation).eInverseAdd(this, GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS, GisRoutesHolderToLocation.class, msgs);
			msgs = basicSetToLocation(newToLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION, newToLocation, newToLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolderFromLocation getFromLocation() {
		if (eContainerFeatureID() != GisPackage.GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION) return null;
		return (GisRoutesHolderFromLocation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromLocation(GisRoutesHolderFromLocation newFromLocation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFromLocation, GisPackage.GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromLocation(GisRoutesHolderFromLocation newFromLocation) {
		if (newFromLocation != eInternalContainer() || (eContainerFeatureID() != GisPackage.GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION && newFromLocation != null)) {
			if (EcoreUtil.isAncestor(this, newFromLocation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFromLocation != null)
				msgs = ((InternalEObject)newFromLocation).eInverseAdd(this, GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__TO_LOCATIONS, GisRoutesHolderFromLocation.class, msgs);
			msgs = basicSetFromLocation(newFromLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION, newFromLocation, newFromLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisRouteInfo> getRoutesInfo() {
		if (routesInfo == null) {
			routesInfo = new EObjectContainmentEList<GisRouteInfo>(GisRouteInfo.class, this, GisPackage.GIS_ROUTES_HOLDER_ELEMENT__ROUTES_INFO);
		}
		return routesInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCalculated() {
		return calculated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculated(boolean newCalculated) {
		boolean oldCalculated = calculated;
		calculated = newCalculated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTES_HOLDER_ELEMENT__CALCULATED, oldCalculated, calculated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void update(GisRouteCalculator calculator) {
		GisRoutesHolder holder = this.getFromLocation().getRoutesHolder();
		BasicEList<GisLocation> froms = new BasicEList<>();
		froms.add(this.getFromLocation().getLocation());
		BasicEList<GisLocation> tos = new BasicEList<>();
		tos.add(this.getToLocation().getLocation());
		holder.update(calculator, froms, tos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		GisRoutesHolder holder = this.getFromLocation().getRoutesHolder();
		GisRouteCalculator calculator = holder.getCalculator();
		this.update(calculator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void remove() {
		GisRoutesHolderFromLocationImpl from = (GisRoutesHolderFromLocationImpl)this.getFromLocation();
		from.onElementRemoved(this);

		GisRoutesHolderToLocationImpl to = (GisRoutesHolderToLocationImpl)this.getToLocation();
		to.onElementRemoved(this);
		
		this.setFromLocation(null);
		this.setToLocation(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION:
				if (toLocation != null)
					msgs = ((InternalEObject)toLocation).eInverseRemove(this, GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS, GisRoutesHolderToLocation.class, msgs);
				return basicSetToLocation((GisRoutesHolderToLocation)otherEnd, msgs);
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFromLocation((GisRoutesHolderFromLocation)otherEnd, msgs);
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
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION:
				return basicSetToLocation(null, msgs);
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION:
				return basicSetFromLocation(null, msgs);
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__ROUTES_INFO:
				return ((InternalEList<?>)getRoutesInfo()).basicRemove(otherEnd, msgs);
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
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION:
				return eInternalContainer().eInverseRemove(this, GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__TO_LOCATIONS, GisRoutesHolderFromLocation.class, msgs);
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
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__DESCRIPTION:
				return getDescription();
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION:
				if (resolve) return getToLocation();
				return basicGetToLocation();
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION:
				return getFromLocation();
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__ROUTES_INFO:
				return getRoutesInfo();
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__CALCULATED:
				return isCalculated();
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
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION:
				setToLocation((GisRoutesHolderToLocation)newValue);
				return;
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION:
				setFromLocation((GisRoutesHolderFromLocation)newValue);
				return;
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__ROUTES_INFO:
				getRoutesInfo().clear();
				getRoutesInfo().addAll((Collection<? extends GisRouteInfo>)newValue);
				return;
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__CALCULATED:
				setCalculated((Boolean)newValue);
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
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION:
				setToLocation((GisRoutesHolderToLocation)null);
				return;
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION:
				setFromLocation((GisRoutesHolderFromLocation)null);
				return;
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__ROUTES_INFO:
				getRoutesInfo().clear();
				return;
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__CALCULATED:
				setCalculated(CALCULATED_EDEFAULT);
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
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION:
				return toLocation != null;
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION:
				return getFromLocation() != null;
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__ROUTES_INFO:
				return routesInfo != null && !routesInfo.isEmpty();
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT__CALCULATED:
				return calculated != CALCULATED_EDEFAULT;
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
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT___UPDATE__GISROUTECALCULATOR:
				update((GisRouteCalculator)arguments.get(0));
				return null;
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT___REFRESH:
				refresh();
				return null;
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT___REMOVE:
				remove();
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
		result.append(" (Calculated: ");
		result.append(calculated);
		result.append(')');
		return result.toString();
	}

} //GisRoutesHolderElementImpl
