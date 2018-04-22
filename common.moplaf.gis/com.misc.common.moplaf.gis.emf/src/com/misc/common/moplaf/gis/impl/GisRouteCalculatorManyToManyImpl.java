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
import com.misc.common.moplaf.gis.GisRouteCalculatorManyToMany;
import com.misc.common.moplaf.gis.GisRouteInfo;
import com.misc.common.moplaf.gis.Plugin;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Calculator Many To Many</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GisRouteCalculatorManyToManyImpl extends GisRouteCalculatorImpl implements GisRouteCalculatorManyToMany {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRouteCalculatorManyToManyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ROUTE_CALCULATOR_MANY_TO_MANY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected EList<GisRouteInfo> getRoutesImpl(EList<GisLocation> froms, EList<GisLocation> tos) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<GisRouteInfo> getRoutes(EList<GisLocation> froms, EList<GisLocation> tos) {
		String message = String.format("CalculatorManyToMany.getRoutes froms %d tos %d",
				froms.size(),
				tos.size());
		Plugin.INSTANCE.logInfo(message); 
		EList<GisRouteInfo> route_infos = this.getRoutesImpl(froms,  tos);
		return route_infos;
	}




} //GisRouteCalculatorManyToManyImpl
