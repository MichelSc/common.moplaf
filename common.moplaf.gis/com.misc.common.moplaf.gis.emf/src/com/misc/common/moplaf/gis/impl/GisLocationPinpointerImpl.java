/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisCoordinatesAbstract;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisLocationPinpointer;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.Plugin;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void pinpoint(GisLocation location) {
		Plugin.INSTANCE.logInfo("GisLocationPinpointer.pinpoint called");
		GisCoordinatesAbstract coordinates = location.getCoordinates();
		if ( coordinates == null )  return;
		location.getPinpointedLocations().clear();
		this.pinpointImpl(coordinates);
		Plugin.INSTANCE.logInfo("GisLocationPinpointer.pinpoint done");
	}
	
	protected void pinpointImpl(GisCoordinatesAbstract coodinates) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GisPackage.GIS_LOCATION_PINPOINTER___PINPOINT__GISLOCATION:
				pinpoint((GisLocation)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GisLocationPinpointerImpl
