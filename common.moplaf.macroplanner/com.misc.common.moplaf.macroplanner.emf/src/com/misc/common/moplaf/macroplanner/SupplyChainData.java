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
 *   <li>{@link com.misc.common.moplaf.macroplanner.SupplyChainData#getSupplies <em>Supplies</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.SupplyChainData#getAvailabilities <em>Availabilities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.SupplyChainData#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.SupplyChainData#getCapacities <em>Capacities</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainData()
 * @model
 * @generated
 */
public interface SupplyChainData extends EObject {
	/**
	 * Returns the value of the '<em><b>Supplies</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.Supply}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.Supply#getSupplyChainData <em>Supply Chain Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplies</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainData_Supplies()
	 * @see com.misc.common.moplaf.macroplanner.Supply#getSupplyChainData
	 * @model opposite="SupplyChainData" containment="true"
	 * @generated
	 */
	EList<Supply> getSupplies();

	/**
	 * Returns the value of the '<em><b>Availabilities</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.Availability}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.Availability#getSupplyChainData <em>Supply Chain Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availabilities</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainData_Availabilities()
	 * @see com.misc.common.moplaf.macroplanner.Availability#getSupplyChainData
	 * @model opposite="SupplyChainData" containment="true"
	 * @generated
	 */
	EList<Availability> getAvailabilities();

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

	/**
	 * Returns the value of the '<em><b>Capacities</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.Capacity}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.Capacity#getSupplyChainData <em>Supply Chain Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacities</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainData_Capacities()
	 * @see com.misc.common.moplaf.macroplanner.Capacity#getSupplyChainData
	 * @model opposite="SupplyChainData" containment="true"
	 * @generated
	 */
	EList<Capacity> getCapacities();

} // SupplyChainData
