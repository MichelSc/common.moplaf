/**
 */
package com.misc.common.moplaf.gis.osrm.impl;

import com.misc.common.moplaf.gis.GisCoordinatesAbstract;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisLocationPinpointed;
import com.misc.common.moplaf.gis.Plugin;
import com.misc.common.moplaf.gis.impl.GisLocationPinpointerImpl;

import com.misc.common.moplaf.gis.osrm.GisOsrmPackage;
import com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest;

import com.misc.common.moplaf.gis.osrm.Protocol;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.LinkedList;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gis Pinpointer Osrm Nearest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisPinpointerOsrmNearestImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisPinpointerOsrmNearestImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisPinpointerOsrmNearestImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisPinpointerOsrmNearestImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisPinpointerOsrmNearestImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisPinpointerOsrmNearestImpl#getMaxPinpoints <em>Max Pinpoints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisPinpointerOsrmNearestImpl extends GisLocationPinpointerImpl implements GisPinpointerOsrmNearest {
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
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = "router.project-osrm.org";

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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = "/nearest/v1";

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
	 * The default value of the '{@link #getProfile() <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_EDEFAULT = "driving";

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected String profile = PROFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxPinpoints() <em>Max Pinpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPinpoints()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_PINPOINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxPinpoints() <em>Max Pinpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPinpoints()
	 * @generated
	 * @ordered
	 */
	protected int maxPinpoints = MAX_PINPOINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisPinpointerOsrmNearestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisOsrmPackage.Literals.GIS_PINPOINTER_OSRM_NEAREST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PROTOCOL, oldProtocol, protocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__HOST, oldHost, host));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(String newProfile) {
		String oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxPinpoints() {
		return maxPinpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPinpoints(int newMaxPinpoints) {
		int oldMaxPinpoints = maxPinpoints;
		maxPinpoints = newMaxPinpoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__MAX_PINPOINTS, oldMaxPinpoints, maxPinpoints));
	}
	
	

	@Override
	protected void pinpointImpl(GisCoordinatesAbstract coordinate) {
		String feedback = "ok";
		Plugin.INSTANCE.logInfo("GisPinpointerOsrmNearest: called");
		// make the URL
		// parameters
		LinkedList<String> parameters = new LinkedList<String>();
		parameters.add("generate_hints=false");
		parameters.add(String.format("number=%d", this.getMaxPinpoints()));
		String parametersAsString = StringUtils.join(parameters, "&");
		
		// location
		String location_asstring = String.format(Locale.US, "%f,%f", 
				coordinate.getLongitude(),
				coordinate.getLatitude());
		// send the request
		String responseAsString = "";
		HttpURLConnection connection = null;  
		try {
			//Create connection
			String scheme = this.getProtocol().getLiteral();
			int port = this.getPort();
			String userInfo = null;
			String host = this.getHost();
			String path = String.format("%s/%s/%s", this.getPath(), this.getProfile(), location_asstring); 
			String query = parametersAsString;
			String fragment = "";
			URI requesturi = new URI(scheme, userInfo, host, port, path, query, fragment);
			URL url2 = requesturi.toURL();

			Plugin.INSTANCE.logInfo("GisPinpointerOsrmNearest: url2: "+url2.toString());
			connection = (HttpURLConnection)url2.openConnection();
			//connection.setRequestMethod("POST"); //default is GET
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			//connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
			connection.setRequestProperty("Content-Language", "en-US");  
			connection.setUseCaches (false);
			connection.setDoInput(true);
			connection.setDoOutput(true);

			//Send request
			connection.connect();
			//	      DataOutputStream wr = new DataOutputStream (connection.getOutputStream ());
			//	      wr.writeBytes (urlParameters);
			//	      wr.flush ();
			//	      wr.close ();

			//Get Response    
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
			feedback = "Connection failed: "+e.getMessage();
			Plugin.INSTANCE.logError("GisPinpointerOsrmNearest: "+feedback);
		} finally {
			if(connection != null) {
				connection.disconnect(); 
			}
		}  // try		
		// parse the response
		Plugin.INSTANCE.logInfo("GisPinpointerOsrmNearest: response ="+responseAsString);
		JSONObject responseObject = (JSONObject) JSONValue.parse(responseAsString);
		String response_code= (String)responseObject.get("code");
		Plugin.INSTANCE.logInfo("GisPinpointerOsrmNearest: code ="+response_code);
		switch ( response_code ){
		case "Ok" : 
			// indicates the response contains a valid result.
			JSONArray points = (JSONArray)responseObject.get("waypoints");
			for (int point_index = 0; point_index<points.size(); point_index++) {
				JSONObject point = (JSONObject)points.get(point_index);
				String name= (String)point.get("name");   
				JSONArray coordinates = (JSONArray)point.get("location");
				Number longitude = (Number)coordinates.get(0);
				Number latitude  = (Number)coordinates.get(1);
				Number distance  = (Number)point.get("distance");
				GisLocationPinpointed pinpointed = GisFactory.eINSTANCE.createGisLocationPinpointed();
				pinpointed.setLongitude(longitude.doubleValue());
				pinpointed.setLatitude (latitude .doubleValue());
				pinpointed.setLocationPinpointed(name);
				pinpointed.setDistance(distance.doubleValue()/1000.0d); // convert m's to km's
			}  // traverse the routes
			break;
		default :
			feedback = "Unknown response code "+response_code;
			Plugin.INSTANCE.logError("GisPinpointerOsrmNearest: "+feedback);
			break;
		}  // swich on response status
	} // pinpoint

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PROTOCOL:
				return getProtocol();
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__HOST:
				return getHost();
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PORT:
				return getPort();
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PATH:
				return getPath();
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PROFILE:
				return getProfile();
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__MAX_PINPOINTS:
				return getMaxPinpoints();
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
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PROTOCOL:
				setProtocol((Protocol)newValue);
				return;
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__HOST:
				setHost((String)newValue);
				return;
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PORT:
				setPort((Integer)newValue);
				return;
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PATH:
				setPath((String)newValue);
				return;
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PROFILE:
				setProfile((String)newValue);
				return;
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__MAX_PINPOINTS:
				setMaxPinpoints((Integer)newValue);
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
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PROFILE:
				setProfile(PROFILE_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__MAX_PINPOINTS:
				setMaxPinpoints(MAX_PINPOINTS_EDEFAULT);
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
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PORT:
				return port != PORT_EDEFAULT;
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__PROFILE:
				return PROFILE_EDEFAULT == null ? profile != null : !PROFILE_EDEFAULT.equals(profile);
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST__MAX_PINPOINTS:
				return maxPinpoints != MAX_PINPOINTS_EDEFAULT;
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
		result.append(", Profile: ");
		result.append(profile);
		result.append(", MaxPinpoints: ");
		result.append(maxPinpoints);
		result.append(')');
		return result.toString();
	}

} //GisPinpointerOsrmNearestImpl
