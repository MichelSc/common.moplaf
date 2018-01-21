/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisRouteCalculatorOneToOne;
import com.misc.common.moplaf.gis.GisRouteInfo;
import com.misc.common.moplaf.gis.GisRoutesHolderElement;
import com.misc.common.moplaf.gis.GisRoutesHolderFromLocation;
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
