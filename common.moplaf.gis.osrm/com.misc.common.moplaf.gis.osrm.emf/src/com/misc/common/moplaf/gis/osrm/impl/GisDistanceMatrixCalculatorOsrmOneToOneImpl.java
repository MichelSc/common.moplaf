/**
 */
package com.misc.common.moplaf.gis.osrm.impl;

import com.misc.common.moplaf.gis.GisLocation;

import com.misc.common.moplaf.gis.GisRouteInfo;
import com.misc.common.moplaf.gis.impl.GisRouteCalculatorOneToOneImpl;

import com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne;
import com.misc.common.moplaf.gis.osrm.GisOsrmPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gis Distance Matrix Calculator Osrm One To One</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GisDistanceMatrixCalculatorOsrmOneToOneImpl extends GisRouteCalculatorOneToOneImpl implements GisDistanceMatrixCalculatorOsrmOneToOne {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisDistanceMatrixCalculatorOsrmOneToOneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE;
	}

	@Override
	protected GisRouteInfo getRouteImpl(GisLocation from, GisLocation to) {
		return null;
		
	}
	
	

} //GisDistanceMatrixCalculatorOsrmOneToOneImpl
