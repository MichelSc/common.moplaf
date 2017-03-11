/**
 */
package com.misc.common.moplaf.macroplanner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routing Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getRouting <em>Routing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getLocationProduct <em>Location Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getConsumption <em>Consumption</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRoutingProduct()
 * @model
 * @generated
 */
public interface RoutingProduct extends EObject {
	/**
	 * Returns the value of the '<em><b>Routing</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.Routing#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing</em>' container reference.
	 * @see #setRouting(Routing)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRoutingProduct_Routing()
	 * @see com.misc.common.moplaf.macroplanner.Routing#getProducts
	 * @model opposite="Products" required="true" transient="false"
	 * @generated
	 */
	Routing getRouting();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getRouting <em>Routing</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing</em>' container reference.
	 * @see #getRouting()
	 * @generated
	 */
	void setRouting(Routing value);

	/**
	 * Returns the value of the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumption</em>' attribute.
	 * @see #setConsumption(float)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRoutingProduct_Consumption()
	 * @model
	 * @generated
	 */
	float getConsumption();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getConsumption <em>Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumption</em>' attribute.
	 * @see #getConsumption()
	 * @generated
	 */
	void setConsumption(float value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(float)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRoutingProduct_Offset()
	 * @model
	 * @generated
	 */
	float getOffset();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(float value);

	/**
	 * Returns the value of the '<em><b>Location Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Product</em>' reference.
	 * @see #setLocationProduct(LocationProduct)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRoutingProduct_LocationProduct()
	 * @model required="true"
	 * @generated
	 */
	LocationProduct getLocationProduct();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getLocationProduct <em>Location Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Product</em>' reference.
	 * @see #getLocationProduct()
	 * @generated
	 */
	void setLocationProduct(LocationProduct value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRoutingProduct_Code()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getCode();

} // RoutingProduct
