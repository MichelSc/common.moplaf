/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisAddress;
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
