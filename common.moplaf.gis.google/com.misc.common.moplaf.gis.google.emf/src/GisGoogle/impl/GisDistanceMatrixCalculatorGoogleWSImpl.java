/**
 */
package GisGoogle.impl;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.Locale;

import GisGoogle.GisDistanceMatrixCalculatorGoogleWS;
import GisGoogle.GisGooglePackage;

import GisGoogle.Protocol;
import GisGoogle.TravelMode;
import com.misc.common.moplaf.gis.GisCoordinates;
import com.misc.common.moplaf.gis.GisDistanceFromLocation;
import com.misc.common.moplaf.gis.GisDistanceMatrix;
import com.misc.common.moplaf.gis.GisDistanceToLocation;
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
 *   <li>{@link GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#getHost <em>Host</em>}</li>
 *   <li>{@link GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#getKey <em>Key</em>}</li>
 *   <li>{@link GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#isAvoidTolls <em>Avoid Tolls</em>}</li>
 *   <li>{@link GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#isAvoidFerries <em>Avoid Ferries</em>}</li>
 *   <li>{@link GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#isAvoidHighways <em>Avoid Highways</em>}</li>
 *   <li>{@link GisGoogle.impl.GisDistanceMatrixCalculatorGoogleWSImpl#getTravelModel <em>Travel Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GisDistanceMatrixCalculatorGoogleWSImpl extends GisDistanceMatrixCalculatorImpl implements GisDistanceMatrixCalculatorGoogleWS {
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
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__HOST:
				return getHost();
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PROTOCOL:
				return getProtocol();
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
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__HOST:
				setHost((String)newValue);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PROTOCOL:
				setProtocol((Protocol)newValue);
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
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
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
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
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
		result.append(" (Host: ");
		result.append(host);
		result.append(", Protocol: ");
		result.append(protocol);
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
		for ( GisDistanceFromLocation fromLocation :matrix.getFromLocations()){
			GisCoordinates location = fromLocation.getLocation().getCoordinates();
			String locationAsString = String.format(Locale.US, "%f,%f", location.getLongitude(), location.getLatitude());
			fromLocations.add(locationAsString);
		}
		parameters.add("origins="+StringUtils.join(fromLocations, "|"));
		LinkedList<String> toLocations = new LinkedList<String>();
		for ( GisDistanceToLocation toLocation :matrix.getToLocations()){
			GisCoordinates location = toLocation.getLocation().getCoordinates();
			String locationAsString = String.format(Locale.US, "%f,%f", location.getLongitude(), location.getLatitude());
			toLocations.add(locationAsString);
		}
		if ( this.getKey()!=null ){
			parameters.add("key="+this.getKey());
		}
		parameters.add("origins="+StringUtils.join(toLocations, "|"));
		String targetURL = this.getProtocol().getLiteral()
		         + "/"
		         + this.getHost()
		         + "/maps/api/distancematrix/json?"
		         + StringUtils.join(parameters, ",");
		String urlParameters = StringUtils.join(parameters, "&");
	      CommonPlugin.INSTANCE.log("url ="+targetURL);
	      CommonPlugin.INSTANCE.log("params ="+urlParameters);
		// send the request
		String responseAsString = "";
	    URL url;
	    HttpURLConnection connection = null;  
	    try {
	      //Create connection
	      url = new URL(targetURL);
	      connection = (HttpURLConnection)url.openConnection();
	      connection.setRequestMethod("POST");
	      connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

	      connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
	      connection.setRequestProperty("Content-Language", "en-US");  

	      connection.setUseCaches (false);
	      connection.setDoInput(true);
	      connection.setDoOutput(true);

	      //Send request
	      DataOutputStream wr = new DataOutputStream (connection.getOutputStream ());
	      wr.writeBytes (urlParameters);
	      wr.flush ();
	      wr.close ();

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
	    JSONArray rows = (JSONArray)responseObject.get("rows");
	    int nofRows = fromLocations.size();
	    int nofColumns = toLocations.size();
	    for ( int rowIndex = 0; rowIndex<nofRows; rowIndex++){
	    	JSONObject rowObject = (JSONObject)rows.get(rowIndex);
	    	JSONArray elements = (JSONArray)rowObject.get("elements");
		    for ( int columnIndex = 0; columnIndex<nofColumns; columnIndex++){
		    	JSONObject elementObject = (JSONObject)elements.get(columnIndex);
		    	JSONObject distanceObject = (JSONObject)elementObject.get("distance");
		    	String distanceValue = (String)distanceObject.get("value");
	    	}
	    }
	}
	
	

} //GisDistanceMatrixCalculatorGoogleWSImpl
