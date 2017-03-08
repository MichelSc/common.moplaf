/**
 */
package com.misc.common.moplaf.macroplanner;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Availability#getSupplyChainData <em>Supply Chain Data</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Availability#getLocationResource <em>Location Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Availability#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Availability#getFrom <em>From</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Availability#getTo <em>To</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Availability#getCost <em>Cost</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Availability#isEnforce <em>Enforce</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Availability#getPenalty <em>Penalty</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getAvailability()
 * @model
 * @generated
 */
public interface Availability extends EObject {
	/**
	 * Returns the value of the '<em><b>Supply Chain Data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.SupplyChainData#getAvailabilities <em>Availabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply Chain Data</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply Chain Data</em>' container reference.
	 * @see #setSupplyChainData(SupplyChainData)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getAvailability_SupplyChainData()
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainData#getAvailabilities
	 * @model opposite="Availabilities" required="true" transient="false"
	 * @generated
	 */
	SupplyChainData getSupplyChainData();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Availability#getSupplyChainData <em>Supply Chain Data</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply Chain Data</em>' container reference.
	 * @see #getSupplyChainData()
	 * @generated
	 */
	void setSupplyChainData(SupplyChainData value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(float)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getAvailability_Quantity()
	 * @model
	 * @generated
	 */
	float getQuantity();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Availability#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(float value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(Date)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getAvailability_From()
	 * @model
	 * @generated
	 */
	Date getFrom();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Availability#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Date value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(Date)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getAvailability_To()
	 * @model
	 * @generated
	 */
	Date getTo();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Availability#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Date value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(float)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getAvailability_Cost()
	 * @model
	 * @generated
	 */
	float getCost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Availability#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(float value);

	/**
	 * Returns the value of the '<em><b>Enforce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enforce</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enforce</em>' attribute.
	 * @see #setEnforce(boolean)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getAvailability_Enforce()
	 * @model
	 * @generated
	 */
	boolean isEnforce();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Availability#isEnforce <em>Enforce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enforce</em>' attribute.
	 * @see #isEnforce()
	 * @generated
	 */
	void setEnforce(boolean value);

	/**
	 * Returns the value of the '<em><b>Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penalty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penalty</em>' attribute.
	 * @see #setPenalty(float)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getAvailability_Penalty()
	 * @model
	 * @generated
	 */
	float getPenalty();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Availability#getPenalty <em>Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalty</em>' attribute.
	 * @see #getPenalty()
	 * @generated
	 */
	void setPenalty(float value);

	/**
	 * Returns the value of the '<em><b>Location Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.LocationResource#getAvailabilities <em>Availabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Resource</em>' reference.
	 * @see #setLocationResource(LocationResource)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getAvailability_LocationResource()
	 * @see com.misc.common.moplaf.macroplanner.LocationResource#getAvailabilities
	 * @model opposite="Availabilities"
	 * @generated
	 */
	LocationResource getLocationResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Availability#getLocationResource <em>Location Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Resource</em>' reference.
	 * @see #getLocationResource()
	 * @generated
	 */
	void setLocationResource(LocationResource value);

} // Availability
