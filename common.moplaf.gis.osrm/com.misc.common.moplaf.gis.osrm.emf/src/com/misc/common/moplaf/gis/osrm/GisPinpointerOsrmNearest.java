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

import com.misc.common.moplaf.gis.GisLocationPinpointer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gis Pinpointer Osrm Nearest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getProfile <em>Profile</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getMaxPinpoints <em>Max Pinpoints</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisPinpointerOsrmNearest()
 * @model
 * @generated
 */
public interface GisPinpointerOsrmNearest extends GisLocationPinpointer {
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
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisPinpointerOsrmNearest_Protocol()
	 * @model default="https"
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getProtocol <em>Protocol</em>}' attribute.
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
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisPinpointerOsrmNearest_Host()
	 * @model default="router.project-osrm.org"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getHost <em>Host</em>}' attribute.
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
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisPinpointerOsrmNearest_Port()
	 * @model default="443"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>"/nearest/v1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisPinpointerOsrmNearest_Path()
	 * @model default="/nearest/v1"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getPath <em>Path</em>}' attribute.
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
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisPinpointerOsrmNearest_Profile()
	 * @model default="driving"
	 * @generated
	 */
	String getProfile();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getProfile <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' attribute.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(String value);

	/**
	 * Returns the value of the '<em><b>Max Pinpoints</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Pinpoints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Pinpoints</em>' attribute.
	 * @see #setMaxPinpoints(int)
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisPinpointerOsrmNearest_MaxPinpoints()
	 * @model default="1"
	 * @generated
	 */
	int getMaxPinpoints();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getMaxPinpoints <em>Max Pinpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pinpoints</em>' attribute.
	 * @see #getMaxPinpoints()
	 * @generated
	 */
	void setMaxPinpoints(int value);

} // GisPinpointerOsrmNearest
