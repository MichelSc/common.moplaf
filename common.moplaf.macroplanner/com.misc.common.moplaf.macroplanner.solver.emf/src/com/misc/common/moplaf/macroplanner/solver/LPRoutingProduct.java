/**
 */
package com.misc.common.moplaf.macroplanner.solver;

import com.misc.common.moplaf.macroplanner.RoutingProduct;
import com.misc.common.moplaf.solver.GeneratorTuple;

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
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getLPBucket <em>LP Bucket</em>}</li>
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
	 * Returns the value of the '<em><b>LP Bucket</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getRoutingProduct <em>Routing Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LP Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LP Bucket</em>' reference.
	 * @see #setLPBucket(LPRoutingBucketProduct)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingProduct_LPBucket()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getRoutingProduct
	 * @model opposite="RoutingProduct"
	 * @generated
	 */
	LPRoutingBucketProduct getLPBucket();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getLPBucket <em>LP Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LP Bucket</em>' reference.
	 * @see #getLPBucket()
	 * @generated
	 */
	void setLPBucket(LPRoutingBucketProduct value);

} // LPRoutingProduct
