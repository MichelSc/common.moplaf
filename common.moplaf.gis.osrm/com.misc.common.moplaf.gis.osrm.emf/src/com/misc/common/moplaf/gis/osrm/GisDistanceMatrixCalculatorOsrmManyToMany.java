/**
 */
package com.misc.common.moplaf.gis.osrm;

import com.misc.common.moplaf.gis.GisRouteCalculatorManyToMany;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gis Distance Matrix Calculator Osrm Many To Many</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisDistanceMatrixCalculatorOsrmManyToMany()
 * @model
 * @generated
 */
public interface GisDistanceMatrixCalculatorOsrmManyToMany extends GisRouteCalculatorManyToMany {
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
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisDistanceMatrixCalculatorOsrmManyToMany_Protocol()
	 * @model default="https"
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getProtocol <em>Protocol</em>}' attribute.
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
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisDistanceMatrixCalculatorOsrmManyToMany_Host()
	 * @model default="router.project-osrm.org"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getHost <em>Host</em>}' attribute.
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
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisDistanceMatrixCalculatorOsrmManyToMany_Port()
	 * @model default="443"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getPort <em>Port</em>}' attribute.
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
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisDistanceMatrixCalculatorOsrmManyToMany_Path()
	 * @model default="/route/v1"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getPath <em>Path</em>}' attribute.
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
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#getGisDistanceMatrixCalculatorOsrmManyToMany_Profile()
	 * @model default="driving"
	 * @generated
	 */
	String getProfile();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getProfile <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' attribute.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(String value);

} // GisDistanceMatrixCalculatorOsrmManyToMany
