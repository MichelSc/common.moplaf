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
package com.misc.common.moplaf.gis.osrm;

import com.misc.common.moplaf.gis.GisRouteCalculatorOneToOne;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gis Distance Matrix Calculator Osrm One To One</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getProfile <em>Profile</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getOverview <em>Overview</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisDistanceMatrixCalculatorOsrmOneToOne()
 * @model
 * @generated
 */
public interface GisDistanceMatrixCalculatorOsrmOneToOne extends GisRouteCalculatorOneToOne {

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The default value is <code>"https"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.gis.osrm.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see com.misc.common.moplaf.gis.osrm.Protocol
	 * @see #setProtocol(Protocol)
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisDistanceMatrixCalculatorOsrmOneToOne_Protocol()
	 * @model default="https"
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see com.misc.common.moplaf.gis.osrm.Protocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * The default value is <code>"router.project-osrm.org"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisDistanceMatrixCalculatorOsrmOneToOne_Host()
	 * @model default="router.project-osrm.org"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"443"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisDistanceMatrixCalculatorOsrmOneToOne_Port()
	 * @model default="443"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>"/route/v1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisDistanceMatrixCalculatorOsrmOneToOne_Path()
	 * @model default="/route/v1"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' attribute.
	 * The default value is <code>"driving"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' attribute.
	 * @see #setProfile(String)
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisDistanceMatrixCalculatorOsrmOneToOne_Profile()
	 * @model default="driving"
	 * @generated
	 */
	String getProfile();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getProfile <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' attribute.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(String value);

	/**
	 * Returns the value of the '<em><b>Overview</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.gis.osrm.Overview}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overview</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overview</em>' attribute.
	 * @see com.misc.common.moplaf.gis.osrm.Overview
	 * @see #setOverview(Overview)
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisDistanceMatrixCalculatorOsrmOneToOne_Overview()
	 * @model default="false"
	 * @generated
	 */
	Overview getOverview();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getOverview <em>Overview</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overview</em>' attribute.
	 * @see com.misc.common.moplaf.gis.osrm.Overview
	 * @see #getOverview()
	 * @generated
	 */
	void setOverview(Overview value);
} // GisDistanceMatrixCalculatorOsrmOneToOne
