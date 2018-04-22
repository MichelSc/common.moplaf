/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.macroplanner;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.LocationProduct#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.LocationProduct#getProduct <em>Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.LocationProduct#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.LocationProduct#getSupplies <em>Supplies</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.LocationProduct#getCapacities <em>Capacities</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getLocationProduct()
 * @model
 * @generated
 */
public interface LocationProduct extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.Location#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' container reference.
	 * @see #setLocation(Location)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getLocationProduct_Location()
	 * @see com.misc.common.moplaf.macroplanner.Location#getProducts
	 * @model opposite="Products" required="true" transient="false"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.LocationProduct#getLocation <em>Location</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' container reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getLocationProduct_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.LocationProduct#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getLocationProduct_Code()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Returns the value of the '<em><b>Supplies</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.Supply}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.Supply#getLocationProduct <em>Location Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplies</em>' reference list.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getLocationProduct_Supplies()
	 * @see com.misc.common.moplaf.macroplanner.Supply#getLocationProduct
	 * @model opposite="LocationProduct"
	 * @generated
	 */
	EList<Supply> getSupplies();

	/**
	 * Returns the value of the '<em><b>Capacities</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.Capacity}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.Capacity#getLocationProduct <em>Location Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacities</em>' reference list.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getLocationProduct_Capacities()
	 * @see com.misc.common.moplaf.macroplanner.Capacity#getLocationProduct
	 * @model opposite="LocationProduct"
	 * @generated
	 */
	EList<Capacity> getCapacities();

} // LocationProduct
