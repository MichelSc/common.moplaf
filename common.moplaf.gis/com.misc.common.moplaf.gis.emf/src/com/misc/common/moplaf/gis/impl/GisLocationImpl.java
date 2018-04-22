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

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.gis.GisCoordinatesAbstract;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisLocationPinpointer;
import com.misc.common.moplaf.gis.GisLocationTool;
import com.misc.common.moplaf.gis.GisPackage;

import com.misc.common.moplaf.gis.GisToolLocation;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisLocationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisLocationImpl#isGeocoded <em>Geocoded</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisLocationImpl#getTools <em>Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GisLocationImpl extends MinimalEObjectImpl.Container implements GisLocation {
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
	 * The default value of the '{@link #isGeocoded() <em>Geocoded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeocoded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GEOCODED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected EList<GisLocationTool> tools;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		// TODO: implement this method to return the 'Description' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isGeocoded() {
		GisCoordinatesAbstract coordinates = this.getCoordinates();
		if ( coordinates == null) {
			return false;
		}
		// some more validation could take place here
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisLocationTool> getTools() {
		if (tools == null) {
			tools = new EObjectContainmentWithInverseEList<GisLocationTool>(GisLocationTool.class, this, GisPackage.GIS_LOCATION__TOOLS, GisPackage.GIS_LOCATION_TOOL__LOCATION);
		}
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisCoordinatesAbstract getCoordinates() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisLocationTool addTool(GisToolLocation tool) {
		GisLocationTool location_tool = tool.constructLocationTool();
		location_tool.setTool(tool);
		this.getTools().add(location_tool);
		return location_tool;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getAddToolFeedback(GisToolLocation tool) {
		if ( tool instanceof GisLocationPinpointer ) {
			return EnabledFeedback.NOFEEDBACK;
		}
		return new EnabledFeedback(false, "Tool not supported "+tool.eClass().getName());
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
			case GisPackage.GIS_LOCATION__TOOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTools()).basicAdd(otherEnd, msgs);
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
			case GisPackage.GIS_LOCATION__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
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
			case GisPackage.GIS_LOCATION__DESCRIPTION:
				return getDescription();
			case GisPackage.GIS_LOCATION__GEOCODED:
				return isGeocoded();
			case GisPackage.GIS_LOCATION__TOOLS:
				return getTools();
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
			case GisPackage.GIS_LOCATION__TOOLS:
				getTools().clear();
				getTools().addAll((Collection<? extends GisLocationTool>)newValue);
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
			case GisPackage.GIS_LOCATION__TOOLS:
				getTools().clear();
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
			case GisPackage.GIS_LOCATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case GisPackage.GIS_LOCATION__GEOCODED:
				return isGeocoded() != GEOCODED_EDEFAULT;
			case GisPackage.GIS_LOCATION__TOOLS:
				return tools != null && !tools.isEmpty();
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
			case GisPackage.GIS_LOCATION___GET_COORDINATES:
				return getCoordinates();
			case GisPackage.GIS_LOCATION___ADD_TOOL__GISTOOLLOCATION:
				return addTool((GisToolLocation)arguments.get(0));
			case GisPackage.GIS_LOCATION___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION:
				return getAddToolFeedback((GisToolLocation)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GisLocationImpl
