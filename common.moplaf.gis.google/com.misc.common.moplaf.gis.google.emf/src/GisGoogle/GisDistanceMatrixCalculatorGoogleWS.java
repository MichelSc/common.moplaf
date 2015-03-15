/**
 */
package GisGoogle;

import com.misc.common.moplaf.gis.GisDistanceMatrixCalculator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gis Distance Matrix Calculator Google WS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS#getHost <em>Host</em>}</li>
 *   <li>{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS#getKey <em>Key</em>}</li>
 *   <li>{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS#isAvoidTolls <em>Avoid Tolls</em>}</li>
 *   <li>{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS#isAvoidFerries <em>Avoid Ferries</em>}</li>
 *   <li>{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS#isAvoidHighways <em>Avoid Highways</em>}</li>
 *   <li>{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS#getTravelModel <em>Travel Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see GisGoogle.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS()
 * @model
 * @generated
 */
public interface GisDistanceMatrixCalculatorGoogleWS extends GisDistanceMatrixCalculator {
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
	 * @see GisGoogle.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_Host()
	 * @model default="maps.googleapis.com"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS#getHost <em>Host</em>}' attribute.
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
	 * @see GisGoogle.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS#getProtocol <em>Protocol</em>}' attribute.
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
	 * @see GisGoogle.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS#getKey <em>Key</em>}' attribute.
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
	 * @see GisGoogle.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_AvoidTolls()
	 * @model
	 * @generated
	 */
	boolean isAvoidTolls();

	/**
	 * Sets the value of the '{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS#isAvoidTolls <em>Avoid Tolls</em>}' attribute.
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
	 * @see GisGoogle.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_AvoidFerries()
	 * @model
	 * @generated
	 */
	boolean isAvoidFerries();

	/**
	 * Sets the value of the '{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS#isAvoidFerries <em>Avoid Ferries</em>}' attribute.
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
	 * @see GisGoogle.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_AvoidHighways()
	 * @model
	 * @generated
	 */
	boolean isAvoidHighways();

	/**
	 * Sets the value of the '{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS#isAvoidHighways <em>Avoid Highways</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avoid Highways</em>' attribute.
	 * @see #isAvoidHighways()
	 * @generated
	 */
	void setAvoidHighways(boolean value);

	/**
	 * Returns the value of the '<em><b>Travel Model</b></em>' attribute.
	 * The literals are from the enumeration {@link GisGoogle.TravelMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Travel Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Model</em>' attribute.
	 * @see GisGoogle.TravelMode
	 * @see #setTravelModel(TravelMode)
	 * @see GisGoogle.GisGooglePackage#getGisDistanceMatrixCalculatorGoogleWS_TravelModel()
	 * @model
	 * @generated
	 */
	TravelMode getTravelModel();

	/**
	 * Sets the value of the '{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS#getTravelModel <em>Travel Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Model</em>' attribute.
	 * @see GisGoogle.TravelMode
	 * @see #getTravelModel()
	 * @generated
	 */
	void setTravelModel(TravelMode value);

} // GisDistanceMatrixCalculatorGoogleWS
