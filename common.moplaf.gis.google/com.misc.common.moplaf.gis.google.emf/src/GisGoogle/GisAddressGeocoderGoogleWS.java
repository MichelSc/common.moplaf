/**
 */
package GisGoogle;

import com.misc.common.moplaf.gis.GisAddressGeocoder;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gis Address Geocoder Google WS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GisGoogle.GisAddressGeocoderGoogleWS#getHost <em>Host</em>}</li>
 *   <li>{@link GisGoogle.GisAddressGeocoderGoogleWS#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link GisGoogle.GisAddressGeocoderGoogleWS#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see GisGoogle.GisGooglePackage#getGisAddressGeocoderGoogleWS()
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
	 * @see GisGoogle.GisGooglePackage#getGisAddressGeocoderGoogleWS_Host()
	 * @model default="maps.googleapis.com"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link GisGoogle.GisAddressGeocoderGoogleWS#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link GisGoogle.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see GisGoogle.Protocol
	 * @see #setProtocol(Protocol)
	 * @see GisGoogle.GisGooglePackage#getGisAddressGeocoderGoogleWS_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link GisGoogle.GisAddressGeocoderGoogleWS#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see GisGoogle.Protocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

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
	 * @see GisGoogle.GisGooglePackage#getGisAddressGeocoderGoogleWS_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link GisGoogle.GisAddressGeocoderGoogleWS#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // GisAddressGeocoderGoogleWS
