/**
 */
package com.misc.common.moplaf.gis.GisGoogle.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.LinkedList;
import java.util.Locale;

import com.misc.common.moplaf.gis.GisCoordinates;
import com.misc.common.moplaf.gis.GisDistanceMatrix;
import com.misc.common.moplaf.gis.GisDistanceMatrixElement;
import com.misc.common.moplaf.gis.GisDistanceMatrixFromLocation;
import com.misc.common.moplaf.gis.GisDistanceMatrixToLocation;
import com.misc.common.moplaf.gis.GisGoogle.GisDistanceMatrixCalculatorGoogleWS;
import com.misc.common.moplaf.gis.GisGoogle.GisGooglePackage;
import com.misc.common.moplaf.gis.GisGoogle.Protocol;
import com.misc.common.moplaf.gis.GisGoogle.TravelMode;
import com.misc.common.moplaf.gis.impl.GisDistanceMatrixCalculatorImpl;

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
 * An implementation of the model object '<em><b>Gis Distance Matrix Calculator Google WS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#getKey <em>Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#isAvoidTolls <em>Avoid Tolls</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#isAvoidFerries <em>Avoid Ferries</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#isAvoidHighways <em>Avoid Highways</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#getTravelModel <em>Travel Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GisDistanceMatrixCalculatorGoogleWSImpl extends GisDistanceMatrixCalculatorImpl implements GisDistanceMatrixCalculatorGoogleWS {
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
	protected static final String PATH_EDEFAULT = "/maps/api/distancematrix/json";

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
	 * The default value of the '{@link #isAvoidTolls() <em>Avoid Tolls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvoidTolls()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVOID_TOLLS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAvoidTolls() <em>Avoid Tolls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvoidTolls()
	 * @generated
	 * @ordered
	 */
	protected boolean avoidTolls = AVOID_TOLLS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAvoidFerries() <em>Avoid Ferries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvoidFerries()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVOID_FERRIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAvoidFerries() <em>Avoid Ferries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvoidFerries()
	 * @generated
	 * @ordered
	 */
	protected boolean avoidFerries = AVOID_FERRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #isAvoidHighways() <em>Avoid Highways</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvoidHighways()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVOID_HIGHWAYS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAvoidHighways() <em>Avoid Highways</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvoidHighways()
	 * @generated
	 * @ordered
	 */
	protected boolean avoidHighways = AVOID_HIGHWAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTravelModel() <em>Travel Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelModel()
	 * @generated
	 * @ordered
	 */
	protected static final TravelMode TRAVEL_MODEL_EDEFAULT = TravelMode.DRIVING;

	/**
	 * The cached value of the '{@link #getTravelModel() <em>Travel Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelModel()
	 * @generated
	 * @ordered
	 */
	protected TravelMode travelModel = TRAVEL_MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisDistanceMatrixCalculatorGoogleWSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisGooglePackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__HOST, oldHost, host));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PROTOCOL, oldProtocol, protocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvoidTolls() {
		return avoidTolls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvoidTolls(boolean newAvoidTolls) {
		boolean oldAvoidTolls = avoidTolls;
		avoidTolls = newAvoidTolls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_TOLLS, oldAvoidTolls, avoidTolls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvoidFerries() {
		return avoidFerries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvoidFerries(boolean newAvoidFerries) {
		boolean oldAvoidFerries = avoidFerries;
		avoidFerries = newAvoidFerries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_FERRIES, oldAvoidFerries, avoidFerries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvoidHighways() {
		return avoidHighways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvoidHighways(boolean newAvoidHighways) {
		boolean oldAvoidHighways = avoidHighways;
		avoidHighways = newAvoidHighways;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_HIGHWAYS, oldAvoidHighways, avoidHighways));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelMode getTravelModel() {
		return travelModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelModel(TravelMode newTravelModel) {
		TravelMode oldTravelModel = travelModel;
		travelModel = newTravelModel == null ? TRAVEL_MODEL_EDEFAULT : newTravelModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__TRAVEL_MODEL, oldTravelModel, travelModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PROTOCOL:
				return getProtocol();
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PORT:
				return getPort();
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__HOST:
				return getHost();
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PATH:
				return getPath();
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__KEY:
				return getKey();
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_TOLLS:
				return isAvoidTolls();
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_FERRIES:
				return isAvoidFerries();
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_HIGHWAYS:
				return isAvoidHighways();
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__TRAVEL_MODEL:
				return getTravelModel();
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
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PROTOCOL:
				setProtocol((Protocol)newValue);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PORT:
				setPort((Integer)newValue);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__HOST:
				setHost((String)newValue);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PATH:
				setPath((String)newValue);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__KEY:
				setKey((String)newValue);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_TOLLS:
				setAvoidTolls((Boolean)newValue);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_FERRIES:
				setAvoidFerries((Boolean)newValue);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_HIGHWAYS:
				setAvoidHighways((Boolean)newValue);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__TRAVEL_MODEL:
				setTravelModel((TravelMode)newValue);
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
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_TOLLS:
				setAvoidTolls(AVOID_TOLLS_EDEFAULT);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_FERRIES:
				setAvoidFerries(AVOID_FERRIES_EDEFAULT);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_HIGHWAYS:
				setAvoidHighways(AVOID_HIGHWAYS_EDEFAULT);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__TRAVEL_MODEL:
				setTravelModel(TRAVEL_MODEL_EDEFAULT);
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
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PORT:
				return port != PORT_EDEFAULT;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_TOLLS:
				return avoidTolls != AVOID_TOLLS_EDEFAULT;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_FERRIES:
				return avoidFerries != AVOID_FERRIES_EDEFAULT;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_HIGHWAYS:
				return avoidHighways != AVOID_HIGHWAYS_EDEFAULT;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__TRAVEL_MODEL:
				return travelModel != TRAVEL_MODEL_EDEFAULT;
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
		result.append(", AvoidTolls: ");
		result.append(avoidTolls);
		result.append(", AvoidFerries: ");
		result.append(avoidFerries);
		result.append(", AvoidHighways: ");
		result.append(avoidHighways);
		result.append(", TravelModel: ");
		result.append(travelModel);
		result.append(')');
		return result.toString();
	}

	@Override
	public void calculate(GisDistanceMatrix matrix) {
	      CommonPlugin.INSTANCE.log("GisDistanceMatrixCalculatorGoogleWS: called");
		// make the URL
		LinkedList<String> parameters = new LinkedList<String>();
		if ( this.getTravelModel()!=null) {
			parameters.add("mode="+this.getTravelModel().getLiteral());
		}
		if ( this.isAvoidHighways()){
			parameters.add("avoid=highways");
		}
		if ( this.isAvoidTolls()){
			parameters.add("avoid=tolls");
		}
		if ( this.isAvoidFerries()){
			parameters.add("avoid=ferries");
		}
		LinkedList<String> fromLocations = new LinkedList<String>();
		LinkedList<GisDistanceMatrixFromLocation> fromLocationsInRequest = new LinkedList<GisDistanceMatrixFromLocation>();
		for ( GisDistanceMatrixFromLocation fromLocation :matrix.getFromLocations()){
			GisCoordinates location = fromLocation.getLocation().getCoordinates();
			if ( location!=null){
				String locationAsString = String.format(Locale.US, "%f,%f", location.getLatitude(), location.getLongitude());
				fromLocations.add(locationAsString);
				fromLocationsInRequest.add(fromLocation);
			}
		}
		parameters.add("origins="+StringUtils.join(fromLocations, "|"));
		LinkedList<String> toLocations = new LinkedList<String>();
		LinkedList<GisDistanceMatrixToLocation> toLocationsInRequest = new LinkedList<GisDistanceMatrixToLocation>();
		for ( GisDistanceMatrixToLocation toLocation :matrix.getToLocations()){
			GisCoordinates location = toLocation.getLocation().getCoordinates();
			if ( location!=null){
				String locationAsString = String.format(Locale.US, "%f,%f", location.getLatitude(), location.getLongitude());
				toLocations.add(locationAsString);
				toLocationsInRequest.add(toLocation);
				
			}
		}
		parameters.add("destinations="+StringUtils.join(toLocations, "|"));
		if ( this.getKey()!=null ){
			parameters.add("key="+this.getKey());
		}
		String parametersAsString = StringUtils.join(parameters, "&");
//		String targetURL = this.getProtocol().getLiteral()
//		         + "://"
//		         + this.getHost()
//		         + "/maps/api/distancematrix/json?"
//		         + parametersAsString;
		//String urlParameters = "";
		// send the request
		String responseAsString = "";
	    HttpURLConnection connection = null;  
	    try {
	      //Create connection
	      String scheme = this.getProtocol().getLiteral();
	      int port = this.getPort();
		  String userInfo = null;
	      String host = this.getHost();
	      String path = this.getPath(); //"/maps/api/distancematrix/json";
	      String query = parametersAsString;
	      String fragment = "";
	      URI requesturi = new URI(scheme, userInfo, host, port, path, query, fragment);
	      URL url2 = requesturi.toURL();

	      CommonPlugin.INSTANCE.log("url2: "+url2.toString());
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
	      CommonPlugin.INSTANCE.log("GisDistanceMatrixCalculatorGoogleWS: connection failed "+e.getMessage());
        } finally {
	      if(connection != null) {
	        connection.disconnect(); 
	      }
	    }  // try		
	    // parse the response
        CommonPlugin.INSTANCE.log("response ="+responseAsString);
	    JSONObject responseObject = (JSONObject) JSONValue.parse(responseAsString);
    	String responsestatus = (String)responseObject.get("status");
    	switch ( responsestatus){
    	case "OK" : 
    		// indicates the response contains a valid result.
    	    JSONArray rows = (JSONArray)responseObject.get("rows");
    	    int rowIndex = 0;
    		for ( GisDistanceMatrixFromLocation fromLocation :fromLocationsInRequest){
    	    	JSONObject rowObject = (JSONObject)rows.get(rowIndex);
    	    	JSONArray elements = (JSONArray)rowObject.get("elements");
    			int columnIndex = 0;
    			for ( GisDistanceMatrixToLocation toLocation :toLocationsInRequest){
    		    	JSONObject elementObject = (JSONObject)elements.get(columnIndex);
    		    	String elementstatus = (String)elementObject.get("status");
    		    	boolean calculated = false;
    		    	Long distance = 0l;
    		    	Long duration = 0l;
    		    	switch ( elementstatus){
    		    	case "OK" : 
    		    		// indicates the response contains a valid result.
    		    		calculated = true;
    			    	JSONObject distanceObject = (JSONObject)elementObject.get("distance");
    			    	distance = (Long) distanceObject.get("value"); 
    			    	JSONObject durationObject = (JSONObject)elementObject.get("duration");
    			    	duration = (Long) durationObject.get("value"); 
    		    		break;
    		    	case "NOT_FOUND":
    		    		// indicates that the origin and/or destination of this pairing could not be geocoded.
    		    		calculated = false;
    		    		break;
    		    	case "ZERO_RESULTS":
    		    		calculated = false;
    		    		//indicates no route could be found between the origin and destination.
    		    		break;
    		    	default:
    			        CommonPlugin.INSTANCE.log("GisDistanceMatrixCalculatorGoogleWS: unexpected element status: #"+responsestatus+"#");
    		    		calculated = false;
    		    	} // switch on the element status
//    			      CommonPlugin.INSTANCE.log("GisDistanceMatrixCalculatorGoogleWS: value "+distanceValue);
    		    	GisDistanceMatrixElement newElement = fromLocation.addElement(toLocation);
    		    	newElement.setFromLocation(fromLocation);
    		    	newElement.setToLocation(toLocation);
    		    	newElement.setDistance(distance);
    		    	newElement.setDuration(duration);
    		    	newElement.setCalculated(calculated);
    		    	columnIndex++;
    		    } // traverse the to locations
    			rowIndex++;
    		}  // traverse the fromlocations
    		break;
    	case "INVALID_REQUEST" :
    		//  indicates that the provided request was invalid.
	        CommonPlugin.INSTANCE.log("GisDistanceMatrixCalculatorGoogleWS: invalid provided request");
    		break;
		case "MAX_ELEMENTS_EXCEEDED": 
			// indicates that the product of origins and destinations exceeds the per-query limit.
	        CommonPlugin.INSTANCE.log("GisDistanceMatrixCalculatorGoogleWS: per-query limit exceeded");
    		break;
		case "OVER_QUERY_LIMIT" : 
			// indicates the service has received too many requests from your application within the allowed time period.
	        CommonPlugin.INSTANCE.log("GisDistanceMatrixCalculatorGoogleWS: too many requests for the allowed time period");
	    	break;
		case "REQUEST_DENIED": 
			//indicates that the service denied use of the Distance Matrix service by your application.
	        CommonPlugin.INSTANCE.log("GisDistanceMatrixCalculatorGoogleWS: request denied");
		    break;
		case "UNKNOWN_ERROR":  
			//indicates a Distance Matrix request could not be processed due to a server error. The request may succeed if you try again.
	        CommonPlugin.INSTANCE.log("GisDistanceMatrixCalculatorGoogleWS: unknown server error");
    		break;
		default :
	        CommonPlugin.INSTANCE.log("GisDistanceMatrixCalculatorGoogleWS: unexpected response status: "+responsestatus);
    		break;
    	}  // swich on response status
	}

} //GisDistanceMatrixCalculatorGoogleWSImpl
