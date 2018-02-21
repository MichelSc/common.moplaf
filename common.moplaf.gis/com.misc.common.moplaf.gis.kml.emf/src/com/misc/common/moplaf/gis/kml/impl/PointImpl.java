/**
 */
package com.misc.common.moplaf.gis.kml.impl;

import com.misc.common.moplaf.common.EnabledFeedback;

import com.misc.common.moplaf.gis.GisCoordinatesAbstract;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisLocationTool;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisToolLocation;

import com.misc.common.moplaf.gis.kml.KmlPackage;
import com.misc.common.moplaf.gis.kml.Point;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.impl.PointImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.kml.impl.PointImpl#isGeocoded <em>Geocoded</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.kml.impl.PointImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.kml.impl.PointImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.kml.impl.PointImpl#getLatitude <em>Latitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointImpl extends GeometryImpl implements Point {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isGeocoded() <em>Geocoded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeocoded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GEOCODED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected EList<GisLocationTool> tools;

	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected double longitude = LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LATITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected double latitude = LATITUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		// TODO: implement this method to return the 'Description' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGeocoded() {
		// TODO: implement this method to return the 'Geocoded' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisLocationTool> getTools() {
		if (tools == null) {
			tools = new EObjectContainmentWithInverseEList<GisLocationTool>(GisLocationTool.class, this, KmlPackage.POINT__TOOLS, GisPackage.GIS_LOCATION_TOOL__LOCATION);
		}
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitude(double newLongitude) {
		double oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.POINT__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitude(double newLatitude) {
		double oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.POINT__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisCoordinatesAbstract getCoordinates() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisLocationTool addTool(GisToolLocation tool) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFeedback getAddToolFeedback(GisToolLocation tool) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.POINT__TOOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTools()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.POINT__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
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
			case KmlPackage.POINT__DESCRIPTION:
				return getDescription();
			case KmlPackage.POINT__GEOCODED:
				return isGeocoded();
			case KmlPackage.POINT__TOOLS:
				return getTools();
			case KmlPackage.POINT__LONGITUDE:
				return getLongitude();
			case KmlPackage.POINT__LATITUDE:
				return getLatitude();
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
			case KmlPackage.POINT__TOOLS:
				getTools().clear();
				getTools().addAll((Collection<? extends GisLocationTool>)newValue);
				return;
			case KmlPackage.POINT__LONGITUDE:
				setLongitude((Double)newValue);
				return;
			case KmlPackage.POINT__LATITUDE:
				setLatitude((Double)newValue);
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
			case KmlPackage.POINT__TOOLS:
				getTools().clear();
				return;
			case KmlPackage.POINT__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case KmlPackage.POINT__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
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
			case KmlPackage.POINT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case KmlPackage.POINT__GEOCODED:
				return isGeocoded() != GEOCODED_EDEFAULT;
			case KmlPackage.POINT__TOOLS:
				return tools != null && !tools.isEmpty();
			case KmlPackage.POINT__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case KmlPackage.POINT__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GisLocation.class) {
			switch (derivedFeatureID) {
				case KmlPackage.POINT__DESCRIPTION: return GisPackage.GIS_LOCATION__DESCRIPTION;
				case KmlPackage.POINT__GEOCODED: return GisPackage.GIS_LOCATION__GEOCODED;
				case KmlPackage.POINT__TOOLS: return GisPackage.GIS_LOCATION__TOOLS;
				default: return -1;
			}
		}
		if (baseClass == GisCoordinatesAbstract.class) {
			switch (derivedFeatureID) {
				case KmlPackage.POINT__LONGITUDE: return GisPackage.GIS_COORDINATES_ABSTRACT__LONGITUDE;
				case KmlPackage.POINT__LATITUDE: return GisPackage.GIS_COORDINATES_ABSTRACT__LATITUDE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GisLocation.class) {
			switch (baseFeatureID) {
				case GisPackage.GIS_LOCATION__DESCRIPTION: return KmlPackage.POINT__DESCRIPTION;
				case GisPackage.GIS_LOCATION__GEOCODED: return KmlPackage.POINT__GEOCODED;
				case GisPackage.GIS_LOCATION__TOOLS: return KmlPackage.POINT__TOOLS;
				default: return -1;
			}
		}
		if (baseClass == GisCoordinatesAbstract.class) {
			switch (baseFeatureID) {
				case GisPackage.GIS_COORDINATES_ABSTRACT__LONGITUDE: return KmlPackage.POINT__LONGITUDE;
				case GisPackage.GIS_COORDINATES_ABSTRACT__LATITUDE: return KmlPackage.POINT__LATITUDE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == GisLocation.class) {
			switch (baseOperationID) {
				case GisPackage.GIS_LOCATION___GET_COORDINATES: return KmlPackage.POINT___GET_COORDINATES;
				case GisPackage.GIS_LOCATION___ADD_TOOL__GISTOOLLOCATION: return KmlPackage.POINT___ADD_TOOL__GISTOOLLOCATION;
				case GisPackage.GIS_LOCATION___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION: return KmlPackage.POINT___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION;
				default: return -1;
			}
		}
		if (baseClass == GisCoordinatesAbstract.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case KmlPackage.POINT___GET_COORDINATES:
				return getCoordinates();
			case KmlPackage.POINT___ADD_TOOL__GISTOOLLOCATION:
				return addTool((GisToolLocation)arguments.get(0));
			case KmlPackage.POINT___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION:
				return getAddToolFeedback((GisToolLocation)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Longitude: ");
		result.append(longitude);
		result.append(", Latitude: ");
		result.append(latitude);
		result.append(')');
		return result.toString();
	}

} //PointImpl
