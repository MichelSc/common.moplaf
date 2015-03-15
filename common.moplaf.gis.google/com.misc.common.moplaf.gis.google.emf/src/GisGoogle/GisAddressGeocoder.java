/**
 */
package GisGoogle;

import com.misc.common.moplaf.gis.Protocol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gis Address Geocoder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GisGoogle.GisAddressGeocoder#getHost <em>Host</em>}</li>
 *   <li>{@link GisGoogle.GisAddressGeocoder#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link GisGoogle.GisAddressGeocoder#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see GisGoogle.GisGooglePackage#getGisAddressGeocoder()
 * @model
 * @generated
 */
public interface GisAddressGeocoder extends com.misc.common.moplaf.gis.GisAddressGeocoder {
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
	 * @see GisGoogle.GisGooglePackage#getGisAddressGeocoder_Host()
	 * @model default="maps.googleapis.com"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link GisGoogle.GisAddressGeocoder#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.gis.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see com.misc.common.moplaf.gis.Protocol
	 * @see #setProtocol(Protocol)
	 * @see GisGoogle.GisGooglePackage#getGisAddressGeocoder_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link GisGoogle.GisAddressGeocoder#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see com.misc.common.moplaf.gis.Protocol
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
	 * @see GisGoogle.GisGooglePackage#getGisAddressGeocoder_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link GisGoogle.GisAddressGeocoder#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // GisAddressGeocoder
