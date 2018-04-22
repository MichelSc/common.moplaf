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
package com.misc.common.moplaf.gis.kml.impl;

import com.misc.common.moplaf.gis.kml.Geometry;
import com.misc.common.moplaf.gis.kml.KmlPackage;
import com.misc.common.moplaf.gis.kml.MultiGeometry;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.impl.MultiGeometryImpl#getGeometries <em>Geometries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiGeometryImpl extends GeometryImpl implements MultiGeometry {
	/**
	 * The cached value of the '{@link #getGeometries() <em>Geometries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometries()
	 * @generated
	 * @ordered
	 */
	protected EList<Geometry> geometries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.MULTI_GEOMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Geometry> getGeometries() {
		if (geometries == null) {
			geometries = new EObjectContainmentEList<Geometry>(Geometry.class, this, KmlPackage.MULTI_GEOMETRY__GEOMETRIES);
		}
		return geometries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.MULTI_GEOMETRY__GEOMETRIES:
				return ((InternalEList<?>)getGeometries()).basicRemove(otherEnd, msgs);
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
			case KmlPackage.MULTI_GEOMETRY__GEOMETRIES:
				return getGeometries();
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
			case KmlPackage.MULTI_GEOMETRY__GEOMETRIES:
				getGeometries().clear();
				getGeometries().addAll((Collection<? extends Geometry>)newValue);
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
			case KmlPackage.MULTI_GEOMETRY__GEOMETRIES:
				getGeometries().clear();
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
			case KmlPackage.MULTI_GEOMETRY__GEOMETRIES:
				return geometries != null && !geometries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiGeometryImpl
