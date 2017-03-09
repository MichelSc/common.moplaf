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
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucketProduct()
 * @model
 * @generated
 */
public interface LPRoutingBucketProduct extends LPTuple {
	/**
	 * Returns the value of the '<em><b>Product Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Bucket</em>' reference.
	 * @see #setProductBucket(LPProductBucket)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucketProduct_ProductBucket()
	 * @model required="true"
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
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getLPBucket <em>LP Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Product</em>' reference.
	 * @see #setRoutingProduct(LPRoutingProduct)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucketProduct_RoutingProduct()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getLPBucket
	 * @model opposite="LPBucket"
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

} // LPRoutingBucketProduct
