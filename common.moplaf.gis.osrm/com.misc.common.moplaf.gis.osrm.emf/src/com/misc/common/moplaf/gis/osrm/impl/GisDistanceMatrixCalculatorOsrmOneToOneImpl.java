/**
 */
package com.misc.common.moplaf.gis.osrm.impl;

import com.misc.common.moplaf.gis.GisCoordinatesAbstract;
import com.misc.common.moplaf.gis.GisLocation;

import com.misc.common.moplaf.gis.GisRouteInfo;
import com.misc.common.moplaf.gis.Plugin;
import com.misc.common.moplaf.gis.impl.GisRouteCalculatorOneToOneImpl;

import com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne;
import com.misc.common.moplaf.gis.osrm.GisOsrmPackage;

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
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gis Distance Matrix Calculator Osrm One To One</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmOneToOneImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmOneToOneImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmOneToOneImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmOneToOneImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmOneToOneImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmOneToOneImpl#isWithAlternatives <em>With Alternatives</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmOneToOneImpl#isWithGeometry <em>With Geometry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisDistanceMatrixCalculatorOsrmOneToOneImpl extends GisRouteCalculatorOneToOneImpl implements GisDistanceMatrixCalculatorOsrmOneToOne {
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
	protected static final String PATH_EDEFAULT = "route/v1/driving";
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
	 * The default value of the '{@link #isWithAlternatives() <em>With Alternatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithAlternatives()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WITH_ALTERNATIVES_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isWithAlternatives() <em>With Alternatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithAlternatives()
	 * @generated
	 * @ordered
	 */
	protected boolean withAlternatives = WITH_ALTERNATIVES_EDEFAULT;
	/**
	 * The default value of the '{@link #isWithGeometry() <em>With Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithGeometry()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WITH_GEOMETRY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isWithGeometry() <em>With Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithGeometry()
	 * @generated
	 * @ordered
	 */
	protected boolean withGeometry = WITH_GEOMETRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisDistanceMatrixCalculatorOsrmOneToOneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROTOCOL, oldProtocol, protocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__HOST, oldHost, host));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWithAlternatives() {
		return withAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithAlternatives(boolean newWithAlternatives) {
		boolean oldWithAlternatives = withAlternatives;
		withAlternatives = newWithAlternatives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__WITH_ALTERNATIVES, oldWithAlternatives, withAlternatives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWithGeometry() {
		return withGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithGeometry(boolean newWithGeometry) {
		boolean oldWithGeometry = withGeometry;
		withGeometry = newWithGeometry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__WITH_GEOMETRY, oldWithGeometry, withGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROTOCOL:
				return getProtocol();
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__HOST:
				return getHost();
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PORT:
				return getPort();
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PATH:
				return getPath();
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROFILE:
				return getProfile();
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__WITH_ALTERNATIVES:
				return isWithAlternatives();
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__WITH_GEOMETRY:
				return isWithGeometry();
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
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROTOCOL:
				setProtocol((Protocol)newValue);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__HOST:
				setHost((String)newValue);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PORT:
				setPort((Integer)newValue);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PATH:
				setPath((String)newValue);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROFILE:
				setProfile((String)newValue);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__WITH_ALTERNATIVES:
				setWithAlternatives((Boolean)newValue);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__WITH_GEOMETRY:
				setWithGeometry((Boolean)newValue);
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
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROFILE:
				setProfile(PROFILE_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__WITH_ALTERNATIVES:
				setWithAlternatives(WITH_ALTERNATIVES_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__WITH_GEOMETRY:
				setWithGeometry(WITH_GEOMETRY_EDEFAULT);
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
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PORT:
				return port != PORT_EDEFAULT;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROFILE:
				return PROFILE_EDEFAULT == null ? profile != null : !PROFILE_EDEFAULT.equals(profile);
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__WITH_ALTERNATIVES:
				return withAlternatives != WITH_ALTERNATIVES_EDEFAULT;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__WITH_GEOMETRY:
				return withGeometry != WITH_GEOMETRY_EDEFAULT;
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
		result.append(", WithAlternatives: ");
		result.append(withAlternatives);
		result.append(", WithGeometry: ");
		result.append(withGeometry);
		result.append(')');
		return result.toString();
	}

	@Override
	protected GisRouteInfo getRouteImpl(GisLocation from, GisLocation to) {
		String feedback = "ok";
		Plugin.INSTANCE.logInfo("GisDistanceMatrixCalculatorGoogleWS: called");
		// make the URL
		// parameters
		LinkedList<String> parameters = new LinkedList<String>();
		if ( this.isWithGeometry()) {
			parameters.add("geometries=geojson");
		}
		if ( this.isWithAlternatives()){
			parameters.add("alternatives=true");
		}
		parameters.add("steps=true");
		String parametersAsString = StringUtils.join(parameters, "&");
		// locations
		GisCoordinatesAbstract from_coordinate = from.getCoordinates();
		GisCoordinatesAbstract to_coordinate = to.getCoordinates();
		String from_to_asstring = String.format(Locale.US, "%f,%f;%f,%f", 
				from_coordinate.getLatitude(),
				from_coordinate.getLongitude(),
				to_coordinate.getLatitude(),
				to_coordinate.getLongitude());
		// send the request
		String responseAsString = "";
		HttpURLConnection connection = null;  
		try {
			//Create connection
			String scheme = this.getProtocol().getLiteral();
			int port = this.getPort();
			String userInfo = null;
			String host = this.getHost();
			String path = String.format("%s/%s/%s", this.getPath(), this.getProfile(), from_to_asstring); 
			String query = parametersAsString;
			String fragment = "";
			URI requesturi = new URI(scheme, userInfo, host, port, path, query, fragment);
			URL url2 = requesturi.toURL();

			Plugin.INSTANCE.logInfo("GisDistanceMatrixCalculatorOsrmOneToOne: url2: "+url2.toString());
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
			Plugin.INSTANCE.logInfo("GisDistanceMatrixCalculatorOsrmOneToOne: "+feedback);
			return null;
		} finally {
			if(connection != null) {
				connection.disconnect(); 
			}
		}  // try		
		// parse the response
		Plugin.INSTANCE.logInfo("GisDistanceMatrixCalculatorOsrmOneToOne: response ="+responseAsString);
		JSONObject responseObject = (JSONObject) JSONValue.parse(responseAsString);
		String responsestatus = (String)responseObject.get("status");
		Plugin.INSTANCE.logInfo("GisDistanceMatrixCalculatorOsrmOneToOne: status ="+responsestatus);
//		switch ( responsestatus){
//		case "OK" : 
//			// indicates the response contains a valid result.
//			JSONArray rows = (JSONArray)responseObject.get("rows");
//			int rowIndex = 0;
//			for ( GisLocation fromLocation :fromLocationsInRequest){
//				JSONObject rowObject = (JSONObject)rows.get(rowIndex);
//				JSONArray elements = (JSONArray)rowObject.get("elements");
//				int columnIndex = 0;
//				for ( GisLocation toLocation :toLocationsInRequest){
//					JSONObject elementObject = (JSONObject)elements.get(columnIndex);
//					String elementstatus = (String)elementObject.get("status");
//					boolean calculated = false;
//					Long distance = 0l;
//					Long duration = 0l;
//					switch ( elementstatus){
//					case "OK" : 
//						// indicates the response contains a valid result.
//						calculated = true;
//						JSONObject distanceObject = (JSONObject)elementObject.get("distance");
//						distance = (Long) distanceObject.get("value"); 
//						JSONObject durationObject = (JSONObject)elementObject.get("duration");
//						duration = (Long) durationObject.get("value"); 
//						break;
//					case "NOT_FOUND":
//						calculated = false;
//						// indicates that the origin and/or destination of this pairing could not be geocoded";
//						break;
//					case "ZERO_RESULTS":
//						calculated = false;
//						// indicates no route could be found between the origin and destination";
//						break;
//					default:
//						Plugin.INSTANCE.logInfo("GisDistanceMatrixCalculatorGoogleWS: "+"Unknown response status: "+responsestatus);
//						calculated = false;
//					} // switch on the element status
//					//    			      CommonPlugin.INSTANCE.log("GisDistanceMatrixCalculatorGoogleWS: value "+distanceValue);
//					GisRouteInfo newElement = GisFactory.eINSTANCE.createGisRouteInfo();
//					newElement.setFromLocation(fromLocation);
//					newElement.setToLocation(toLocation);
//					newElement.setDistance(distance);
//					newElement.setDuration(duration);
//					infos.add(newElement);
//					columnIndex++;
//				} // traverse the to locations
//				rowIndex++;
//			}  // traverse the fromlocations
//			break;
//		case "INVALID_REQUEST" :
//			feedback = "Invalid Request: indicates that the provided request was invalid"; 
//			Plugin.INSTANCE.logError("GisDistanceMatrixCalculatorGoogleWS: "+feedback);
//			break;
//		case "MAX_ELEMENTS_EXCEEDED": 
//			feedback = "Max Elements Exceeded: indicates that the product of origins and destinations exceeds the per-query limit";
//			Plugin.INSTANCE.logError("GisDistanceMatrixCalculatorGoogleWS: "+feedback);
//			break;
//		case "OVER_QUERY_LIMIT" : 
//			feedback = "Over Query Limit: indicates the service has received too many requests from your application within the allowed time period";
//			Plugin.INSTANCE.logError("GisDistanceMatrixCalculatorGoogleWS: "+feedback);
//			break;
//		case "REQUEST_DENIED": 
//			feedback = "Request denied: indicates that the service denied use of the Distance Matrix service by your application";
//			Plugin.INSTANCE.logError("GisDistanceMatrixCalculatorGoogleWS: "+feedback);
//			break;
//		case "UNKNOWN_ERROR":  
//			feedback = "Unknown Error: indicates a Distance Matrix request could not be processed due to a server error. The request may succeed if you try again";
//			Plugin.INSTANCE.logError("GisDistanceMatrixCalculatorGoogleWS: "+feedback);
//			break;
//		default :
//			feedback = "Unknown response status "+responsestatus;
//			Plugin.INSTANCE.logError("GisDistanceMatrixCalculatorGoogleWS: "+feedback);
//			break;
//		}  // swich on response status
		return null;
	}
} //GisDistanceMatrixCalculatorOsrmOneToOneImpl
