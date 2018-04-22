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

import com.misc.common.moplaf.gis.GisLocationPinpointer;
import com.misc.common.moplaf.gis.GisLocationTool;
import com.misc.common.moplaf.gis.GisPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Pinpointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GisLocationPinpointerImpl extends GisToolLocationImpl implements GisLocationPinpointer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisLocationPinpointerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_LOCATION_PINPOINTER;
	}

	@Override
	protected void handleImpl(GisLocationTool location) {
		location.flushResults();
		this.pinpointImpl(location);
	}
	
	protected void pinpointImpl(GisLocationTool location) {
		throw new UnsupportedOperationException();
	}

} //GisLocationPinpointerImpl
