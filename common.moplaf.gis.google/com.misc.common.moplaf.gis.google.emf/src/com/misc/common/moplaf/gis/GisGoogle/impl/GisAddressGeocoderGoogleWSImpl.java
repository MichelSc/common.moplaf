/**
 */
package com.misc.common.moplaf.gis.GisGoogle.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedList;

import com.misc.common.moplaf.gis.GisAddress;
import com.misc.common.moplaf.gis.GisAddressGeocoded;
import com.misc.common.moplaf.gis.GisAddressStructured;
import com.misc.common.moplaf.gis.GisAddressUnstructured;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisGoogle.GisAddressGeocoderGoogleWS;
import com.misc.common.moplaf.gis.GisGoogle.GisGooglePackage;
import com.misc.common.moplaf.gis.GisGoogle.Protocol;
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
 * An implementation of the model object '<em><b>Gis Address Geocoder Google WS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.impl.GisAddressGeocoderGoogleWSImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.impl.GisAddressGeocoderGoogleWSImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.impl.GisAddressGeocoderGoogleWSImpl#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GisAddressGeocoderGoogleWSImpl extends GisAddressGeocoderImpl implements GisAddressGeocoderGoogleWS {
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
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__HOST:
				return getHost();
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PROTOCOL:
				return getProtocol();
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
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__HOST:
				setHost((String)newValue);
				return;
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PROTOCOL:
				setProtocol((Protocol)newValue);
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
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
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
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
		}
		return super.eIsSet(featureID);
	}
	
	private String encode(String toEncode) throws UnsupportedEncodingException{
		return URLEncoder.encode(toEncode, "UTF-8");
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
		result.append(" (Host: ");
		result.append(host);
		result.append(", Protocol: ");
		result.append(protocol);
		result.append(", Key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}
	
	

	@Override
	public void geocode(GisAddress address) {
	    CommonPlugin.INSTANCE.log("GisAddressGeocoderGoogleWS: called");
	
		// make the URL
		URL url;
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
					components.add("country:"+this.encode(country));
				}
				if ( area!=null && area.length()>0){
					components.add("administrative_area:"+this.encode(area));
				}
				if ( locality!=null && locality.length()>0){
					components.add("locality:"+this.encode(locality));
				}
				if ( postalCode!=null && postalCode.length()>0){
					components.add("postal_code:"+this.encode(postalCode));
				}
				if ( street!=null && street.length()>0){
					components.add("route:"+this.encode(street));
				}
				if ( building!=null && building.length()>0 ){
					components.add("street_number:"+this.encode(building));  // does not work
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
				parameters.add("address="+this.encode(addressAsString));
			}
			String parametersAsString = StringUtils.join(parameters, "&");
			String targetURL = this.getProtocol().getLiteral()
			         + "://"
			         + this.getHost()
			         + "/maps/api/geocode/json?"
			         + parametersAsString;
		  
			CommonPlugin.INSTANCE.log("url: "+targetURL);
			url = new URL(targetURL);
			connection = (HttpURLConnection)url.openConnection();
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
	    	address.getGeocodedAddresses().clear();
			JSONArray resultObjects = (JSONArray)responseObject.get("results");
			for (int resultIndex = 0; resultIndex<resultObjects.size(); resultIndex++){
		    	JSONObject resultObject = (JSONObject)resultObjects.get(resultIndex);
		    	String formattedAddress = (String)resultObject.get("formatted_address");
		    	JSONObject geometryObject = (JSONObject)resultObject.get("geometry");
		    	JSONObject locationObject = (JSONObject)geometryObject.get("location");
		    	double latitude  = (double)locationObject.get("lat");
		    	double longitude = (double)locationObject.get("lng");
		    	GisAddressGeocoded newGeocoded = GisFactory.eINSTANCE.createGisAddressGeocoded();
		    	newGeocoded.setDescription(formattedAddress);
		    	newGeocoded.setLatitude((float)latitude);
		    	newGeocoded.setLongitude((float)longitude);
		    	newGeocoded.setName("geocoded: "+address.getName()+" -> "+formattedAddress);
		    	address.getGeocodedAddresses().add(newGeocoded);
			}
	    	break;
		case "ZERO_RESULTS":
			// indicates that the geocode was successful but returned no results. This may occur if the geocoder was passed a non-existent address.
			break;
		case "OVER_QUERY_LIMIT" : 
			// indicates the service has received too many requests from your application within the allowed time period.
			CommonPlugin.INSTANCE.log("GisAddressGeocoderGoogleWS: too many requests for the allowed time period");
			break;
		case "REQUEST_DENIED": 
			// indicates that your request was denied.
			CommonPlugin.INSTANCE.log("GisAddressGeocoderGoogleWS: request denied");
			break;
		case "INVALID_REQUEST" :
			//  generally indicates that the query (address, components or latlng) is missing.
			CommonPlugin.INSTANCE.log("GisAddressGeocoderGoogleWS: invalid request provided");
			break;
		case "UNKNOWN_ERROR":  
			// indicates that the request could not be processed due to a server error. The request may succeed if you try again.
			CommonPlugin.INSTANCE.log("GisAddressGeocoderGoogleWS: unknown server error");
			break;
		default :
			CommonPlugin.INSTANCE.log("GisAddressGeocoderGoogleWS: unexpected response status: "+responsestatus);
			break;
		}  // switch on response status
	}

} //GisAddressGeocoderGoogleWSImpl
