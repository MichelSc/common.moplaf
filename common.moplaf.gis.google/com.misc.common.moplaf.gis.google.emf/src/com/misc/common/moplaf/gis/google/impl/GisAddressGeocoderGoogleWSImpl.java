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
package com.misc.common.moplaf.gis.google.impl;

import com.misc.common.moplaf.gis.GisAddress;
import com.misc.common.moplaf.gis.GisAddressGeocoded;
import com.misc.common.moplaf.gis.GisAddressStructured;
import com.misc.common.moplaf.gis.GisAddressUnstructured;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisLocationTool;
import com.misc.common.moplaf.gis.Plugin;
import com.misc.common.moplaf.gis.google.GisAddressGeocoderGoogleWS;
import com.misc.common.moplaf.gis.google.GisGooglePackage;
import com.misc.common.moplaf.gis.google.Protocol;

import com.misc.common.moplaf.gis.impl.GisAddressGeocoderImpl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.LinkedList;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gis Address Geocoder Google WS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.google.impl.GisAddressGeocoderGoogleWSImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.google.impl.GisAddressGeocoderGoogleWSImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.google.impl.GisAddressGeocoderGoogleWSImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.google.impl.GisAddressGeocoderGoogleWSImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.google.impl.GisAddressGeocoderGoogleWSImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisAddressGeocoderGoogleWSImpl extends GisAddressGeocoderImpl implements GisAddressGeocoderGoogleWS {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Protocol PROTOCOL_EDEFAULT = Protocol.HTTPS;

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
	protected static final int PORT_EDEFAULT = 443;

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
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisAddressGeocoderGoogleWSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisGooglePackage.Literals.GIS_ADDRESS_GEOCODER_GOOGLE_WS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PROTOCOL, oldProtocol, protocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__HOST, oldHost, host));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PROTOCOL:
				return getProtocol();
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PORT:
				return getPort();
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__HOST:
				return getHost();
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PATH:
				return getPath();
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__KEY:
				return getKey();
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
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PROTOCOL:
				setProtocol((Protocol)newValue);
				return;
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PORT:
				setPort((Integer)newValue);
				return;
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__HOST:
				setHost((String)newValue);
				return;
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PATH:
				setPath((String)newValue);
				return;
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__KEY:
				setKey((String)newValue);
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
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__KEY:
				setKey(KEY_EDEFAULT);
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
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PORT:
				return port != PORT_EDEFAULT;
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
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
		result.append(", Key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

	@Override
	protected void geocodeImpl(GisLocationTool location) {
		GisAddress address = (GisAddress) location.getLocation();
		String feedback = "Ok";
	
		// make the URL
		HttpURLConnection connection = null;  
		String responseAsString = "";
		try {
			//Create connection
			LinkedList<String> parameters = new LinkedList<String>();
			LinkedList<String> components = new LinkedList<String>();
			String addressAsString = null;
			String countryCode = address.getCountryCode();
			if ( countryCode!=null && countryCode.length()>0) {
				parameters.add("region="+countryCode);
			}
			if ( this.getKey()!=null ){
				parameters.add("key="+this.getKey());
			}
			if ( address instanceof GisAddressStructured){
				GisAddressStructured addressStructured = (GisAddressStructured)address;
				String country    = addressStructured.getCountry();
				String locality   = addressStructured.getLocality();
				String area       = addressStructured.getAdministrativeArea();
				String postalCode = addressStructured.getPostalCode();
				String street     = addressStructured.getStreet();
				String building   = addressStructured.getBuildingNumber();
				if ( country!=null && country.length()>0 ){
					components.add("country:"+country);
				}
				if ( area!=null && area.length()>0){
					components.add("administrative_area:"+area);
				}
				if ( locality!=null && locality.length()>0){
					components.add("locality:"+locality);
				}
				if ( postalCode!=null && postalCode.length()>0){
					components.add("postal_code:"+postalCode);
				}
				if ( street!=null && street.length()>0){
					components.add("route:"+street);
				}
				if ( building!=null && building.length()>0 ){
					components.add("street_number:"+building);  // does not work
				}
			} else if ( address instanceof GisAddressUnstructured ){
				GisAddressUnstructured addressUnstructured = (GisAddressUnstructured)address;
				addressAsString = addressUnstructured.getAddress();
			}
			if ( components.size()>0 ){
				String componentsAsString = StringUtils.join(components, "|");
				parameters.add("components="+componentsAsString);
			}
			if ( addressAsString!=null && addressAsString.length()>0){
				parameters.add("address="+addressAsString);
			}
			String parametersAsString = StringUtils.join(parameters, "&");
			String scheme = this.getProtocol().getLiteral();
			int port = this.getPort();
			String userInfo = null;
			String host = this.getHost();
			String path = this.getPath(); // "/maps/api/geocode/json";
			String query = parametersAsString;
			String fragment = "";
			URI requesturi = new URI(scheme, userInfo, host, port, path, query, fragment);
			URL url2 = requesturi.toURL();

			Plugin.INSTANCE.logInfo("GisAddressGeocoderGoogleWS: url: "+url2.toString());
			connection = (HttpURLConnection)url2.openConnection();
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setRequestProperty("Content-Language", "en-US");  
			connection.setUseCaches (false);
			connection.setDoInput(true);
			connection.setDoOutput(true);

			connection.connect();
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			String line;
			StringBuffer response = new StringBuffer(); 
			while((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();
			responseAsString = response.toString();
		} catch (Exception e) {
			CommonPlugin.INSTANCE.log("GisAddressGeocoderGoogleWS: connection failed "+e.getMessage());
			feedback = "Connection failed: "+e.getMessage();
			Plugin.INSTANCE.logError("GeocoderGoogleWS: "+feedback);
			return;
		} finally {
			if(connection != null) {
				connection.disconnect(); 
			}
		}  // try		
		
		if ( responseAsString.length()==0 ) return;

		// parse the response
		CommonPlugin.INSTANCE.log("response ="+responseAsString);
		JSONObject responseObject = (JSONObject) JSONValue.parse(responseAsString);
		String responsestatus = (String)responseObject.get("status");
		switch ( responsestatus){
		case "OK" : 
			// indicates the response contains a valid result.
			JSONArray resultObjects = (JSONArray)responseObject.get("results");
			for (int resultIndex = 0; resultIndex<resultObjects.size(); resultIndex++){
		    	JSONObject resultObject = (JSONObject)resultObjects.get(resultIndex);
		    	String formattedAddress = (String)resultObject.get("formatted_address");
		    	JSONObject geometryObject = (JSONObject)resultObject.get("geometry");
		    	JSONObject locationObject = (JSONObject)geometryObject.get("location");
		    	double latitude  = (double)locationObject.get("lat");
		    	double longitude = (double)locationObject.get("lng");
		    	GisAddressGeocoded newGeocoded = GisFactory.eINSTANCE.createGisAddressGeocoded();
		    	newGeocoded.setAddressGeocoded(formattedAddress);
		    	newGeocoded.setLatitude((float)latitude);
		    	newGeocoded.setLongitude((float)longitude);
		    	location.getResults().add(newGeocoded);
			}
	    	break;
		case "ZERO_RESULTS":
			feedback = "Zero results: indicates that the geocode was successful but returned no results. This may occur if the geocoder was passed a non-existent address";
			Plugin.INSTANCE.logError("GisAddressGeocoderGoogleWS: "+feedback);
			break;
		case "OVER_QUERY_LIMIT" :
			feedback = "Over Query Limit: indicates the service has received too many requests from your application within the allowed time period";
			Plugin.INSTANCE.logError("GisAddressGeocoderGoogleWS: "+feedback);
			break;
		case "REQUEST_DENIED": 
			feedback = "Request Denied: indicates that your request was denied";
			Plugin.INSTANCE.logError("GisAddressGeocoderGoogleWS: "+feedback);
			break;
		case "INVALID_REQUEST" :
			feedback = "Invalid Request: generally indicates that the query (address, components or latlng) is missing";
			Plugin.INSTANCE.logError("GisAddressGeocoderGoogleWS: "+feedback);
			break;
		case "UNKNOWN_ERROR":  
			feedback = "Unknown Error: indicates that the request could not be processed due to a server error. The request may succeed if you try again";
			Plugin.INSTANCE.logError("GisAddressGeocoderGoogleWS: "+feedback);
			break;
		default :
			feedback = "Unknown Response Status "+responsestatus;
			Plugin.INSTANCE.logError("GisAddressGeocoderGoogleWS: "+feedback);
			break;
		}  // switch on response status
	}
} //GisAddressGeocoderGoogleWSImpl
