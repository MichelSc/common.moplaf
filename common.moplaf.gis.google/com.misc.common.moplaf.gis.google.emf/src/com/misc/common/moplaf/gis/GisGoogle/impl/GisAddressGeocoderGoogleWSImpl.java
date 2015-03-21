/**
 */
package com.misc.common.moplaf.gis.GisGoogle.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.Locale;

import com.misc.common.moplaf.gis.GisAddress;
import com.misc.common.moplaf.gis.GisAddressStructured;
import com.misc.common.moplaf.gis.GisAddressUnstructured;
import com.misc.common.moplaf.gis.GisCoordinates;
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
		LinkedList<String> parameters = new LinkedList<String>();
		LinkedList<String> components = new LinkedList<String>();
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
			String city       = addressStructured.getCity();
			String street     = addressStructured.getStreet();
			String postalCode = addressStructured.getPostalCode();
			String building   = addressStructured.getBuildingNumber();
			if ( country!=null && country.length()>0 ){
				components.add("country:"+country);
			}
			if ( city!=null && city.length()>0){
				components.add("locality:"+city);
			}
			if ( street!=null && street.length()>0){
				components.add("route:"+street);
			}
			if ( postalCode!=null && postalCode.length()>0){
				components.add("postal_code:"+postalCode);
			}
		} else if ( address instanceof GisAddressUnstructured ){
			GisAddressUnstructured addressUnstructured = (GisAddressUnstructured)address;
			String addressAsString = addressUnstructured.getAddress();
			if ( addressAsString!=null && addressAsString.length()>0){
				parameters.add("address="+addressAsString);
			}
		}
		if ( components.size()>0 ){
			String componentsAsString = StringUtils.join(components, "|");
			parameters.add("components="+componentsAsString);
		}
		String parametersAsString = StringUtils.join(parameters, "&");
		String targetURL = this.getProtocol().getLiteral()
		         + "://"
		         + this.getHost()
		         + "/maps/api/geocode/json?"
		         + parametersAsString;
	  
		CommonPlugin.INSTANCE.log("url: "+targetURL);
		String responseAsString = "";
		URL url;
		HttpURLConnection connection = null;  
		try {
			//Create connection
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
			JSONArray rows = (JSONArray)responseObject.get("results");
			int resultIndex = 0;
	    	JSONObject resultObject = (JSONObject)rows.get(resultIndex);
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
