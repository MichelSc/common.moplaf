/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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
package com.misc.common.moplaf.macroplanner.solver;

import com.misc.common.moplaf.macroplanner.LocationProduct;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getProductSet <em>Product Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getSupplies <em>Supplies</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getCapacities <em>Capacities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getProduct <em>Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getLPBuckets <em>LP Buckets</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProduct()
 * @model
 * @generated
 */
public interface LPProduct extends LPTimeLine {
	/**
	 * Returns the value of the '<em><b>Product Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPProductSet#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Set</em>' container reference.
	 * @see #setProductSet(LPProductSet)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProduct_ProductSet()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductSet#getProducts
	 * @model opposite="Products" required="true" transient="false"
	 * @generated
	 */
	LPProductSet getProductSet();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getProductSet <em>Product Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Set</em>' container reference.
	 * @see #getProductSet()
	 * @generated
	 */
	void setProductSet(LPProductSet value);

	/**
	 * Returns the value of the '<em><b>Supplies</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPSupply}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPSupply#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplies</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProduct_Supplies()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupply#getProduct
	 * @model opposite="Product" containment="true"
	 * @generated
	 */
	EList<LPSupply> getSupplies();

	/**
	 * Returns the value of the '<em><b>Capacities</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPCapacity}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacity#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacities</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProduct_Capacities()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacity#getProduct
	 * @model opposite="Product" containment="true"
	 * @generated
	 */
	EList<LPCapacity> getCapacities();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(LocationProduct)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProduct_Product()
	 * @model
	 * @generated
	 */
	LocationProduct getProduct();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(LocationProduct value);

	/**
	 * Returns the value of the '<em><b>LP Buckets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LP Buckets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LP Buckets</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProduct_LPBuckets()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getProduct
	 * @model opposite="Product" containment="true"
	 * @generated
	 */
	EList<LPProductBucket> getLPBuckets();

} // LPProduct
