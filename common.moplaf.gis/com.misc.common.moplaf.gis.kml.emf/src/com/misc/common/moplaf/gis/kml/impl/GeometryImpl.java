/**
 */
package com.misc.common.moplaf.gis.kml.impl;

import com.misc.common.moplaf.gis.kml.Geometry;
import com.misc.common.moplaf.gis.kml.KmlPackage;
import com.misc.common.moplaf.gis.kml.MultiGeometry;
import com.misc.common.moplaf.gis.kml.Placemark;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.impl.GeometryImpl#getPlacemark <em>Placemark</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeometryImpl extends MinimalEObjectImpl.Container implements Geometry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.GEOMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Placemark getPlacemark() {
		Placemark placemark = basicGetPlacemark();
		return placemark != null && placemark.eIsProxy() ? (Placemark)eResolveProxy((InternalEObject)placemark) : placemark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Placemark basicGetPlacemark() {
		EObject owner = this.eContainer();
		if ( owner instanceof Placemark) {
			return (Placemark)owner;
		} else if ( owner instanceof MultiGeometry ) {
			MultiGeometry multi = (MultiGeometry)owner;
			return multi.getPlacemark();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KmlPackage.GEOMETRY__PLACEMARK:
				if (resolve) return getPlacemark();
				return basicGetPlacemark();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KmlPackage.GEOMETRY__PLACEMARK:
				return basicGetPlacemark() != null;
		}
		return super.eIsSet(featureID);
	}

} //GeometryImpl
