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
package com.misc.common.moplaf.macroplanner.solver;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Routing Bucket Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getProductBucket <em>Product Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getRoutingProduct <em>Routing Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getRouting <em>Routing</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucketProduct()
 * @model
 * @generated
 */
public interface LPRoutingBucketProduct extends LPTuple {
	/**
	 * Returns the value of the '<em><b>Product Bucket</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getConsumptions <em>Consumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Bucket</em>' reference.
	 * @see #setProductBucket(LPProductBucket)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucketProduct_ProductBucket()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getConsumptions
	 * @model opposite="Consumptions" required="true"
	 * @generated
	 */
	LPProductBucket getProductBucket();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getProductBucket <em>Product Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Bucket</em>' reference.
	 * @see #getProductBucket()
	 * @generated
	 */
	void setProductBucket(LPProductBucket value);

	/**
	 * Returns the value of the '<em><b>Routing Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Product</em>' reference.
	 * @see #setRoutingProduct(LPRoutingProduct)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucketProduct_RoutingProduct()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getLPBuckets
	 * @model opposite="LPBuckets"
	 * @generated
	 */
	LPRoutingProduct getRoutingProduct();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getRoutingProduct <em>Routing Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Product</em>' reference.
	 * @see #getRoutingProduct()
	 * @generated
	 */
	void setRoutingProduct(LPRoutingProduct value);

	/**
	 * Returns the value of the '<em><b>Routing</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing</em>' container reference.
	 * @see #setRouting(LPRoutingBucket)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucketProduct_Routing()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getProducts
	 * @model opposite="Products" required="true" transient="false"
	 * @generated
	 */
	LPRoutingBucket getRouting();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getRouting <em>Routing</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing</em>' container reference.
	 * @see #getRouting()
	 * @generated
	 */
	void setRouting(LPRoutingBucket value);

} // LPRoutingBucketProduct
