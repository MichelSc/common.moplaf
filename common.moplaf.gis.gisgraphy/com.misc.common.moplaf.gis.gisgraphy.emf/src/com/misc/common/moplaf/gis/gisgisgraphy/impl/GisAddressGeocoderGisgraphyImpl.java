/**
 */
package com.misc.common.moplaf.gis.gisgisgraphy.impl;

import com.misc.common.moplaf.gis.GisGoogle.Protocol;

import com.misc.common.moplaf.gis.gisgisgraphy.GisAddressGeocoderGisgraphy;
import com.misc.common.moplaf.gis.gisgisgraphy.GisgisgraphyPackage;

import com.misc.common.moplaf.gis.impl.GisAddressGeocoderImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gis Address Geocoder Gisgraphy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.gisgisgraphy.impl.GisAddressGeocoderGisgraphyImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.gisgisgraphy.impl.GisAddressGeocoderGisgraphyImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.gisgisgraphy.impl.GisAddressGeocoderGisgraphyImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.gisgisgraphy.impl.GisAddressGeocoderGisgraphyImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GisAddressGeocoderGisgraphyImpl extends GisAddressGeocoderImpl implements GisAddressGeocoderGisgraphy {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Protocol PROTOCOL_EDEFAULT = Protocol.HTTP;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected Protocol protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 80;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = "maps.googleapis.com";

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = "/maps/api/geocode/json";

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisAddressGeocoderGisgraphyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisgisgraphyPackage.Literals.GIS_ADDRESS_GEOCODER_GISGRAPHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(Protocol newProtocol) {
		Protocol oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PROTOCOL:
				return getProtocol();
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PORT:
				return getPort();
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__HOST:
				return getHost();
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PATH:
				return getPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PROTOCOL:
				setProtocol((Protocol)newValue);
				return;
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PORT:
				setPort((Integer)newValue);
				return;
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__HOST:
				setHost((String)newValue);
				return;
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PATH:
				setPath((String)newValue);
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
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PATH:
				setPath(PATH_EDEFAULT);
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
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PORT:
				return port != PORT_EDEFAULT;
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		}
		return super.eIsSet(featureID);
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
		result.append(" (Protocol: ");
		result.append(protocol);
		result.append(", Port: ");
		result.append(port);
		result.append(", Host: ");
		result.append(host);
		result.append(", Path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //GisAddressGeocoderGisgraphyImpl
