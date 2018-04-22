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

import com.misc.common.moplaf.macroplanner.RoutingProduct;
import com.misc.common.moplaf.solver.GeneratorTuple;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Routing Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getRouting <em>Routing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getProduct <em>Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getRoutingProduct <em>Routing Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getLPBuckets <em>LP Buckets</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingProduct()
 * @model
 * @generated
 */
public interface LPRoutingProduct extends GeneratorTuple {
	/**
	 * Returns the value of the '<em><b>Routing</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing</em>' container reference.
	 * @see #setRouting(LPRouting)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingProduct_Routing()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRouting#getProducts
	 * @model opposite="Products" transient="false"
	 * @generated
	 */
	LPRouting getRouting();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getRouting <em>Routing</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing</em>' container reference.
	 * @see #getRouting()
	 * @generated
	 */
	void setRouting(LPRouting value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(LPProduct)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingProduct_Product()
	 * @model
	 * @generated
	 */
	LPProduct getProduct();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(LPProduct value);

	/**
	 * Returns the value of the '<em><b>Routing Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Product</em>' reference.
	 * @see #setRoutingProduct(RoutingProduct)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingProduct_RoutingProduct()
	 * @model required="true"
	 * @generated
	 */
	RoutingProduct getRoutingProduct();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getRoutingProduct <em>Routing Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Product</em>' reference.
	 * @see #getRoutingProduct()
	 * @generated
	 */
	void setRoutingProduct(RoutingProduct value);

	/**
	 * Returns the value of the '<em><b>LP Buckets</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getRoutingProduct <em>Routing Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LP Buckets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LP Buckets</em>' reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingProduct_LPBuckets()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getRoutingProduct
	 * @model opposite="RoutingProduct"
	 * @generated
	 */
	EList<LPRoutingBucketProduct> getLPBuckets();

} // LPRoutingProduct
