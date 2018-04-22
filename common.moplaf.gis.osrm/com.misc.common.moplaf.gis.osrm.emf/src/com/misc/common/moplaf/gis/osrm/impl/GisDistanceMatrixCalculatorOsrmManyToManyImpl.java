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
package com.misc.common.moplaf.gis.osrm.impl;

import com.misc.common.moplaf.gis.GisCoordinatesAbstract;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisRouteInfo;
import com.misc.common.moplaf.gis.Plugin;
import com.misc.common.moplaf.gis.impl.GisRouteCalculatorManyToManyImpl;

import com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany;
import com.misc.common.moplaf.gis.osrm.GisOsrmPackage;
import com.misc.common.moplaf.gis.osrm.Protocol;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gis Distance Matrix Calculator Osrm Many To Many</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmManyToManyImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmManyToManyImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmManyToManyImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmManyToManyImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmManyToManyImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisDistanceMatrixCalculatorOsrmManyToManyImpl extends GisRouteCalculatorManyToManyImpl implements GisDistanceMatrixCalculatorOsrmManyToMany {
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
	protected static final String PATH_EDEFAULT = "/table/v1";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisDistanceMatrixCalculatorOsrmManyToManyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisOsrmPackage.Literals.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROTOCOL, oldProtocol, protocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__HOST, oldHost, host));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROTOCOL:
				return getProtocol();
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__HOST:
				return getHost();
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PORT:
				return getPort();
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PATH:
				return getPath();
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROFILE:
				return getProfile();
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
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROTOCOL:
				setProtocol((Protocol)newValue);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__HOST:
				setHost((String)newValue);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PORT:
				setPort((Integer)newValue);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PATH:
				setPath((String)newValue);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROFILE:
				setProfile((String)newValue);
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
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROFILE:
				setProfile(PROFILE_EDEFAULT);
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
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PORT:
				return port != PORT_EDEFAULT;
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROFILE:
				return PROFILE_EDEFAULT == null ? profile != null : !PROFILE_EDEFAULT.equals(profile);
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
		result.append(')');
		return result.toString();
	}

	
	
	@Override
	protected EList<GisRouteInfo> getRoutesImpl(EList<GisLocation> froms, EList<GisLocation> tos) {
		BasicEList<GisRouteInfo> infos = new BasicEList<GisRouteInfo>();
		String feedback = "ok";
		Plugin.INSTANCE.logInfo("GisDistanceMatrixCalculatorOsrmWS: called");
		
		HashSet<GisLocation> good_locations = new HashSet<>();
		for ( GisLocation from : froms) {
			if ( from.isGeocoded()) {
				good_locations.add(from);
			}
		}
		for ( GisLocation to : tos) {
			if ( to.isGeocoded()) {
				good_locations.add(to);
			}
		}
		ArrayList<GisLocation> locations = new ArrayList<GisLocation>(good_locations);
		ArrayList<Integer> sources = new ArrayList<>();
		for ( GisLocation from : froms) {
			if ( from.isGeocoded()) {
				sources.add(locations.indexOf(from));
			}
		}
		ArrayList<Integer> destinations = new ArrayList<>();
		for ( GisLocation to : tos) {
			if ( to.isGeocoded()) {
				destinations.add(locations.indexOf(to));
			}
		}
		// make the URL
		// parameters
		LinkedList<String> parameters = new LinkedList<String>();
		parameters.add("generate_hints=false");
		if ( locations.size()==sources.size()) {
			parameters.add("sources=all");
		} else {
			String sourcesAsString = StringUtils.join(sources, ";");
			parameters.add("sources="+sourcesAsString);
		}
		if ( locations.size()==destinations.size()) {
			parameters.add("destinations=all");
		} else {
			String destinationsAsString = StringUtils.join(destinations, ";");
			parameters.add("destinations="+destinationsAsString);
		}
		String parametersAsString = StringUtils.join(parameters, "&");
		// locations
		LinkedList<String> locations_as_strings = new LinkedList<String>();
		for ( GisLocation location : locations) {
			GisCoordinatesAbstract loc_coordinate = location.getCoordinates();
			String loc_asstring = String.format(Locale.US, "%f,%f", loc_coordinate.getLongitude(), loc_coordinate.getLatitude());
			locations_as_strings.add(loc_asstring);
		}
		String locations_as_string = StringUtils.join(locations_as_strings, ";");
		// send the request
		String responseAsString = "";
		HttpURLConnection connection = null;  
		try {
			//Create connection
			String scheme = this.getProtocol().getLiteral();
			int port = this.getPort();
			String userInfo = null;
			String host = this.getHost();
			String path = String.format("%s/%s/%s", this.getPath(), this.getProfile(), locations_as_string); 
			String query = parametersAsString;
			String fragment = "";
			URI requesturi = new URI(scheme, userInfo, host, port, path, query, fragment);
			URL url2 = requesturi.toURL();

			Plugin.INSTANCE.logInfo("GisDistanceMatrixCalculatorOsrmManyToMany: url2: "+url2.toString());
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
			Plugin.INSTANCE.logInfo("GisDistanceMatrixCalculatorOsrmManyToMany: "+feedback);
			return null;
		} finally {
			if(connection != null) {
				connection.disconnect(); 
			}
		}  // try		
		// parse the response
		Plugin.INSTANCE.logInfo("GisDistanceMatrixCalculatorOsrmManyToMany: response ="+responseAsString);
		JSONObject responseObject = (JSONObject) JSONValue.parse(responseAsString);
		String response_code= (String)responseObject.get("code");
		Plugin.INSTANCE.logInfo("GisDistanceMatrixCalculatorOsrmManyToMany: code ="+response_code);
		GisRouteInfo info = null;
		switch ( response_code ){
		case "NoTable" : 
			Plugin.INSTANCE.logWarning("GisDistanceMatrixCalculatorOsrmManyToMany: no route");
			break;
		case "Ok" : 
			// indicates the response contains a valid result.
			JSONArray routes = (JSONArray)responseObject.get("durations");
			for (int source_index = 0; source_index<sources.size(); source_index++) {
				JSONArray row = (JSONArray)routes.get(source_index);
				for (int destination_index = 0; destination_index<destinations.size(); destination_index++) {
					Number duration = (Number)row.get(destination_index);  //seconds
					int source_location_index = sources.get(source_index);
					GisLocation source_location = locations.get(source_location_index);
					int destination_location_index = destinations.get(destination_index);
					GisLocation destination_location = locations.get(destination_location_index);
					info = GisFactory.eINSTANCE.createGisRouteInfo();
					info.setFromLocation(source_location);
					info.setToLocation(destination_location);
					info.setDuration(duration.doubleValue()/3600.0d);  // conversion in hours
					infos.add(info);
					} // traverse the destination
				} // traverse the sources
			break;
		default :
			feedback = "Unknown response code "+response_code;
			Plugin.INSTANCE.logError("GisDistanceMatrixCalculatorOsrmManyToMany: "+feedback);
			break;
		}  // switch on response status
		return infos;
	} // method getRoutes

} //GisDistanceMatrixCalculatorOsrmManyToManyImpl
