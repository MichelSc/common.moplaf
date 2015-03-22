/**
 */
package com.misc.common.moplaf.gis.GisGoogle;

import com.misc.common.moplaf.gis.GisAddressGeocoder;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gis Address Geocoder Google WS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.GisAddressGeocoderGoogleWS#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.GisAddressGeocoderGoogleWS#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.GisAddressGeocoderGoogleWS#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.GisAddressGeocoderGoogleWS#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisGoogle.GisAddressGeocoderGoogleWS#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.gis.GisGoogle.GisGooglePackage#getGisAddressGeocoderGoogleWS()
 * @model
 * @generated
 */
public interface GisAddressGeocoderGoogleWS extends GisAddressGeocoder {
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
	 * @see com.misc.common.moplaf.gis.GisGoogle.GisGooglePackage#getGisAddressGeocoderGoogleWS_Host()
	 * @model default="maps.googleapis.com"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisGoogle.GisAddressGeocoderGoogleWS#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>"/maps/api/geocode/json"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see com.misc.common.moplaf.gis.GisGoogle.GisGooglePackage#getGisAddressGeocoderGoogleWS_Path()
	 * @model default="/maps/api/geocode/json"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisGoogle.GisAddressGeocoderGoogleWS#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.gis.GisGoogle.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see com.misc.common.moplaf.gis.GisGoogle.Protocol
	 * @see #setProtocol(Protocol)
	 * @see com.misc.common.moplaf.gis.GisGoogle.GisGooglePackage#getGisAddressGeocoderGoogleWS_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisGoogle.GisAddressGeocoderGoogleWS#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see com.misc.common.moplaf.gis.GisGoogle.Protocol
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
	 * @see com.misc.common.moplaf.gis.GisGoogle.GisGooglePackage#getGisAddressGeocoderGoogleWS_Port()
	 * @model default="80"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisGoogle.GisAddressGeocoderGoogleWS#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

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
	 * @see com.misc.common.moplaf.gis.GisGoogle.GisGooglePackage#getGisAddressGeocoderGoogleWS_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisGoogle.GisAddressGeocoderGoogleWS#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // GisAddressGeocoderGoogleWS
