/**
 */
package com.misc.common.moplaf.macroplanner;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capacity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Capacity#getSupplyChainData <em>Supply Chain Data</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Capacity#getLocationProduct <em>Location Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Capacity#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Capacity#getFrom <em>From</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Capacity#getTo <em>To</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Capacity#getCost <em>Cost</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Capacity#isEnforce <em>Enforce</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Capacity#getPenalty <em>Penalty</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getCapacity()
 * @model
 * @generated
 */
public interface Capacity extends EObject {
	/**
	 * Returns the value of the '<em><b>Supply Chain Data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.SupplyChainData#getCapacities <em>Capacities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply Chain Data</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply Chain Data</em>' container reference.
	 * @see #setSupplyChainData(SupplyChainData)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getCapacity_SupplyChainData()
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainData#getCapacities
	 * @model opposite="Capacities" required="true" transient="false"
	 * @generated
	 */
	SupplyChainData getSupplyChainData();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Capacity#getSupplyChainData <em>Supply Chain Data</em>}' container reference.
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
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getCapacity_Quantity()
	 * @model
	 * @generated
	 */
	float getQuantity();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Capacity#getQuantity <em>Quantity</em>}' attribute.
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
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getCapacity_From()
	 * @model
	 * @generated
	 */
	Date getFrom();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Capacity#getFrom <em>From</em>}' attribute.
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
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getCapacity_To()
	 * @model
	 * @generated
	 */
	Date getTo();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Capacity#getTo <em>To</em>}' attribute.
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
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getCapacity_Cost()
	 * @model
	 * @generated
	 */
	float getCost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Capacity#getCost <em>Cost</em>}' attribute.
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
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getCapacity_Enforce()
	 * @model
	 * @generated
	 */
	boolean isEnforce();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Capacity#isEnforce <em>Enforce</em>}' attribute.
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
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getCapacity_Penalty()
	 * @model
	 * @generated
	 */
	float getPenalty();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Capacity#getPenalty <em>Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalty</em>' attribute.
	 * @see #getPenalty()
	 * @generated
	 */
	void setPenalty(float value);

	/**
	 * Returns the value of the '<em><b>Location Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.LocationProduct#getCapacities <em>Capacities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Product</em>' reference.
	 * @see #setLocationProduct(LocationProduct)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getCapacity_LocationProduct()
	 * @see com.misc.common.moplaf.macroplanner.LocationProduct#getCapacities
	 * @model opposite="Capacities"
	 * @generated
	 */
	LocationProduct getLocationProduct();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Capacity#getLocationProduct <em>Location Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Product</em>' reference.
	 * @see #getLocationProduct()
	 * @generated
	 */
	void setLocationProduct(LocationProduct value);

} // Capacity
