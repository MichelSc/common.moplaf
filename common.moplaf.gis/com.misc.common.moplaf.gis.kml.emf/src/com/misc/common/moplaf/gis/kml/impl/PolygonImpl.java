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

import com.misc.common.moplaf.gis.kml.KmlPackage;
import com.misc.common.moplaf.gis.kml.LinearRing;
import com.misc.common.moplaf.gis.kml.Polygon;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.impl.PolygonImpl#getOuterBoundary <em>Outer Boundary</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.kml.impl.PolygonImpl#getInnerBoundaries <em>Inner Boundaries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolygonImpl extends GeometryImpl implements Polygon {
	/**
	 * The cached value of the '{@link #getOuterBoundary() <em>Outer Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBoundary()
	 * @generated
	 * @ordered
	 */
	protected LinearRing outerBoundary;

	/**
	 * The cached value of the '{@link #getInnerBoundaries() <em>Inner Boundaries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBoundaries()
	 * @generated
	 * @ordered
	 */
	protected EList<LinearRing> innerBoundaries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.POLYGON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearRing getOuterBoundary() {
		return outerBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterBoundary(LinearRing newOuterBoundary, NotificationChain msgs) {
		LinearRing oldOuterBoundary = outerBoundary;
		outerBoundary = newOuterBoundary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmlPackage.POLYGON__OUTER_BOUNDARY, oldOuterBoundary, newOuterBoundary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterBoundary(LinearRing newOuterBoundary) {
		if (newOuterBoundary != outerBoundary) {
			NotificationChain msgs = null;
			if (outerBoundary != null)
				msgs = ((InternalEObject)outerBoundary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmlPackage.POLYGON__OUTER_BOUNDARY, null, msgs);
			if (newOuterBoundary != null)
				msgs = ((InternalEObject)newOuterBoundary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmlPackage.POLYGON__OUTER_BOUNDARY, null, msgs);
			msgs = basicSetOuterBoundary(newOuterBoundary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.POLYGON__OUTER_BOUNDARY, newOuterBoundary, newOuterBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinearRing> getInnerBoundaries() {
		if (innerBoundaries == null) {
			innerBoundaries = new EObjectContainmentEList<LinearRing>(LinearRing.class, this, KmlPackage.POLYGON__INNER_BOUNDARIES);
		}
		return innerBoundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.POLYGON__OUTER_BOUNDARY:
				return basicSetOuterBoundary(null, msgs);
			case KmlPackage.POLYGON__INNER_BOUNDARIES:
				return ((InternalEList<?>)getInnerBoundaries()).basicRemove(otherEnd, msgs);
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
			case KmlPackage.POLYGON__OUTER_BOUNDARY:
				return getOuterBoundary();
			case KmlPackage.POLYGON__INNER_BOUNDARIES:
				return getInnerBoundaries();
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
			case KmlPackage.POLYGON__OUTER_BOUNDARY:
				setOuterBoundary((LinearRing)newValue);
				return;
			case KmlPackage.POLYGON__INNER_BOUNDARIES:
				getInnerBoundaries().clear();
				getInnerBoundaries().addAll((Collection<? extends LinearRing>)newValue);
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
			case KmlPackage.POLYGON__OUTER_BOUNDARY:
				setOuterBoundary((LinearRing)null);
				return;
			case KmlPackage.POLYGON__INNER_BOUNDARIES:
				getInnerBoundaries().clear();
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
			case KmlPackage.POLYGON__OUTER_BOUNDARY:
				return outerBoundary != null;
			case KmlPackage.POLYGON__INNER_BOUNDARIES:
				return innerBoundaries != null && !innerBoundaries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PolygonImpl
