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
package com.misc.common.moplaf.gis.google;

import com.misc.common.moplaf.gis.GisRouteCalculatorManyToMany;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gis Distance Matrix Calculator Google WS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getKey <em>Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#isAvoidTolls <em>Avoid Tolls</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#isAvoidFerries <em>Avoid Ferries</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#isAvoidHighways <em>Avoid Highways</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getTravelModel <em>Travel Model</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.google.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS()
 * @model
 * @generated
 */
public interface GisDistanceMatrixCalculatorGoogleWS extends GisRouteCalculatorManyToMany {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.gis.google.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see com.misc.common.moplaf.gis.google.Protocol
	 * @see #setProtocol(Protocol)
	 * @see com.misc.common.moplaf.gis.google.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see com.misc.common.moplaf.gis.google.Protocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"80"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see com.misc.common.moplaf.gis.google.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_Port()
	 * @model default="80"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * The default value is <code>"maps.googleapis.com"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see com.misc.common.moplaf.gis.google.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_Host()
	 * @model default="maps.googleapis.com"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>"/maps/api/distancematrix/json"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see com.misc.common.moplaf.gis.google.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_Path()
	 * @model default="/maps/api/distancematrix/json"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see com.misc.common.moplaf.gis.google.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Avoid Tolls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avoid Tolls</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avoid Tolls</em>' attribute.
	 * @see #setAvoidTolls(boolean)
	 * @see com.misc.common.moplaf.gis.google.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_AvoidTolls()
	 * @model
	 * @generated
	 */
	boolean isAvoidTolls();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#isAvoidTolls <em>Avoid Tolls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avoid Tolls</em>' attribute.
	 * @see #isAvoidTolls()
	 * @generated
	 */
	void setAvoidTolls(boolean value);

	/**
	 * Returns the value of the '<em><b>Avoid Ferries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avoid Ferries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avoid Ferries</em>' attribute.
	 * @see #setAvoidFerries(boolean)
	 * @see com.misc.common.moplaf.gis.google.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_AvoidFerries()
	 * @model
	 * @generated
	 */
	boolean isAvoidFerries();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#isAvoidFerries <em>Avoid Ferries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avoid Ferries</em>' attribute.
	 * @see #isAvoidFerries()
	 * @generated
	 */
	void setAvoidFerries(boolean value);

	/**
	 * Returns the value of the '<em><b>Avoid Highways</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avoid Highways</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avoid Highways</em>' attribute.
	 * @see #setAvoidHighways(boolean)
	 * @see com.misc.common.moplaf.gis.google.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_AvoidHighways()
	 * @model
	 * @generated
	 */
	boolean isAvoidHighways();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#isAvoidHighways <em>Avoid Highways</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avoid Highways</em>' attribute.
	 * @see #isAvoidHighways()
	 * @generated
	 */
	void setAvoidHighways(boolean value);

	/**
	 * Returns the value of the '<em><b>Travel Model</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.gis.google.TravelMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Travel Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Model</em>' attribute.
	 * @see com.misc.common.moplaf.gis.google.TravelMode
	 * @see #setTravelModel(TravelMode)
	 * @see com.misc.common.moplaf.gis.google.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_TravelModel()
	 * @model
	 * @generated
	 */
	TravelMode getTravelModel();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getTravelModel <em>Travel Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Model</em>' attribute.
	 * @see com.misc.common.moplaf.gis.google.TravelMode
	 * @see #getTravelModel()
	 * @generated
	 */
	void setTravelModel(TravelMode value);

} // GisDistanceMatrixCalculatorGoogleWS
