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
import com.misc.common.moplaf.gis.GisRouteCalculatorOneToOne;
import com.misc.common.moplaf.gis.GisRouteInfo;
import com.misc.common.moplaf.gis.Plugin;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Calculator One To One</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GisRouteCalculatorOneToOneImpl extends GisRouteCalculatorImpl implements GisRouteCalculatorOneToOne {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRouteCalculatorOneToOneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ROUTE_CALCULATOR_ONE_TO_ONE;
	}

	/**
	 * Calculate a RouteInfo from a given location to a given location.
	 * To be implemented by the concrete class.
	 * @param from
	 * @param to
	 * @return
	 */
	protected GisRouteInfo getRouteImpl(GisLocation from, GisLocation to) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisRouteInfo getRoute(GisLocation from, GisLocation to) {
		String message = String.format("CalculatorOneToOne.getRoute from %s to %s",
				from.getDescription(),
				to.getDescription());
		Plugin.INSTANCE.logInfo(message); 
		GisRouteInfo route_info = this.getRouteImpl(from,  to);
		return route_info;
	}


} //GisRouteCalculatorOneToOneImpl
