/**
 */
package com.misc.common.moplaf.gis.gisgisgraphy.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.LinkedList;

import com.misc.common.moplaf.gis.GisAddress;
import com.misc.common.moplaf.gis.GisAddressGeocoded;
import com.misc.common.moplaf.gis.GisAddressStructured;
import com.misc.common.moplaf.gis.GisAddressUnstructured;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisGoogle.Protocol;
import com.misc.common.moplaf.gis.gisgisgraphy.GisAddressGeocoderGisgraphy;
import com.misc.common.moplaf.gis.gisgisgraphy.GisgisgraphyPackage;
import com.misc.common.moplaf.gis.impl.GisAddressGeocoderImpl;

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
 * An implementation of the model object '<em><b>Gis Address Geocoder Gisgraphy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.gisgisgraphy.impl.GisAddressGeocoderGisgraphyImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.gisgisgraphy.impl.GisAddressGeocoderGisgraphyImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.gisgisgraphy.impl.GisAddressGeocoderGisgraphyImpl#getPort <em>Port</em>}</li>
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
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = "services.gisgraphy.com";

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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = "/geocoding/geocode";

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
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__HOST:
				return getHost();
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PORT:
				return getPort();
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
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__HOST:
				setHost((String)newValue);
				return;
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PORT:
				setPort((Integer)newValue);
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
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PORT:
				setPort(PORT_EDEFAULT);
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
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case GisgisgraphyPackage.GIS_ADDRESS_GEOCODER_GISGRAPHY__PORT:
				return port != PORT_EDEFAULT;
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
		result.append(", Host: ");
		result.append(host);
		result.append(", Port: ");
		result.append(port);
		result.append(", Path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

	@Override
	public void geocode(GisAddress address) {
	    CommonPlugin.INSTANCE.log("GisAddressGeocoderGisgraphy: called");
	
		// make the URL
		HttpURLConnection connection = null;  
		String responseAsString = "";
		try {
			//Create connection
			LinkedList<String> parameters = new LinkedList<String>();
			String addressAsString = null;
			String countryCode = address.getCountryCode();
			if ( countryCode!=null && countryCode.length()>0) {
				parameters.add("country="+countryCode);
			}
//			if ( this.getKey()!=null ){
//				parameters.add("apikey="+this.getKey());
//			}
			if ( address instanceof GisAddressStructured){
				LinkedList<String> addressElements = new LinkedList<String>();
				GisAddressStructured addressStructured = (GisAddressStructured)address;
				String country    = addressStructured.getCountry();
				String locality   = addressStructured.getLocality();
				String area       = addressStructured.getAdministrativeArea();
				String postalCode = addressStructured.getPostalCode();
				String street     = addressStructured.getStreet();
				String building   = addressStructured.getBuildingNumber();
				if ( country!=null && country.length()>0 ){
					addressElements.add(country);
				}
				if ( area!=null && area.length()>0){
					addressElements.add(area);
				}
				if ( locality!=null && locality.length()>0){
					addressElements.add(locality);
				}
				if ( postalCode!=null && postalCode.length()>0){
					addressElements.add(postalCode);
					parameters.add("postal="+postalCode);
				}
				if ( street!=null && street.length()>0){
					addressElements.add(street);
				}
				if ( building!=null && building.length()>0 ){
					addressElements.add(building);
				}
				addressAsString = StringUtils.join(addressElements, " ");
			} else if ( address instanceof GisAddressUnstructured ){
				GisAddressUnstructured addressUnstructured = (GisAddressUnstructured)address;
				addressAsString = addressUnstructured.getAddress();
			}
			if ( addressAsString!=null && addressAsString.length()>0){
				parameters.add("address="+addressAsString);
			}
			parameters.add("format=json");
			String parametersAsString = StringUtils.join(parameters, "&");
			String scheme = this.getProtocol().getLiteral();
			int port = this.getPort();
			String userInfo = null;
			String host = this.getHost();
			String path = this.getPath(); 
			String query = parametersAsString;
			String fragment = "";
			URI requesturi = new URI(scheme, userInfo, host, port, path, query, fragment);
			URL url2 = requesturi.toURL();

			CommonPlugin.INSTANCE.log("url2: "+url2.toString());
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
			CommonPlugin.INSTANCE.log("GisAddressGeocoderGisgraphy: connection failed "+e.getMessage());
		} finally {
			if(connection != null) {
				connection.disconnect(); 
			}
		}  // try		
		
		if ( responseAsString.length()==0 ) return;

		// parse the response
		CommonPlugin.INSTANCE.log("response ="+responseAsString);
		JSONObject responseObject = (JSONObject) JSONValue.parse(responseAsString);
		//String responsestatus = (String)responseObject.get("status");
		// indicates the response contains a valid result.
    	address.flushGeocoded();
		JSONArray resultObjects = (JSONArray)responseObject.get("result");
		for (int resultIndex = 0; resultIndex<resultObjects.size(); resultIndex++){
	    	JSONObject resultObject = (JSONObject)resultObjects.get(resultIndex);
	    	double latitude  = (double)resultObject.get("lat");
	    	double longitude = (double)resultObject.get("lng");
	    	String street = (String)resultObject.get("streetName");
	    	String city = (String)resultObject.get("city");
	    	//long id = (long)resultObject.get("id");
	    	String description = String.format("%s %s", street, city);
	    	GisAddressGeocoded newGeocoded = GisFactory.eINSTANCE.createGisAddressGeocoded();
	    	newGeocoded.setDescription(description);
	    	newGeocoded.setLatitude((float)latitude);
	    	newGeocoded.setLongitude((float)longitude);
	    	newGeocoded.setName("geocoded: "+address.getName()+" -> "+description);
	    	address.getGeocodedAddresses().add(newGeocoded);
		}
	}
} //GisAddressGeocoderGisgraphyImpl
