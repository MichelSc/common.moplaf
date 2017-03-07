/**
 */
package com.misc.common.moplaf.macroplanner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply Chain Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.SupplyChainData#getSuppliesAndDemands <em>Supplies And Demands</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.SupplyChainData#getAvailabilitiesAndReservations <em>Availabilities And Reservations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.SupplyChainData#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainData()
 * @model
 * @generated
 */
public interface SupplyChainData extends EObject {
	/**
	 * Returns the value of the '<em><b>Supplies And Demands</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.ProductSupply}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplies And Demands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplies And Demands</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainData_SuppliesAndDemands()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductSupply> getSuppliesAndDemands();

	/**
	 * Returns the value of the '<em><b>Availabilities And Reservations</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.ResourceAvailable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availabilities And Reservations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availabilities And Reservations</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainData_AvailabilitiesAndReservations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceAvailable> getAvailabilitiesAndReservations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainData_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.SupplyChainData#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SupplyChainData
