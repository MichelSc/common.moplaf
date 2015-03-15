/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisAddress;
import com.misc.common.moplaf.gis.GisAddressGeocoder;
import com.misc.common.moplaf.gis.GisPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Geocoder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GisAddressGeocoderImpl extends MinimalEObjectImpl.Container implements GisAddressGeocoder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisAddressGeocoderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ADDRESS_GEOCODER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void geocode(GisAddress address) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			case GisPackage.GIS_ADDRESS_GEOCODER___GEOCODE__GISADDRESS:
				geocode((GisAddress)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GisAddressGeocoderImpl
