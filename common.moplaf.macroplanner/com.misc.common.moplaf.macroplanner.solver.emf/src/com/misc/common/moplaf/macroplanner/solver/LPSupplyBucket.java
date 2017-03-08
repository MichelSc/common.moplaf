/**
 */
package com.misc.common.moplaf.macroplanner.solver;

import com.misc.common.moplaf.solver.GeneratorLpVar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Supply Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getSupply <em>Supply</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getProductBucket <em>Product Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getSupplied <em>Supplied</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPSupplyBucket()
 * @model
 * @generated
 */
public interface LPSupplyBucket extends LPTimeBucket {
	/**
	 * Returns the value of the '<em><b>Supply</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPSupply#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply</em>' container reference.
	 * @see #setSupply(LPSupply)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPSupplyBucket_Supply()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupply#getLPBuckets
	 * @model opposite="LPBuckets" transient="false"
	 * @generated
	 */
	LPSupply getSupply();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getSupply <em>Supply</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply</em>' container reference.
	 * @see #getSupply()
	 * @generated
	 */
	void setSupply(LPSupply value);

	/**
	 * Returns the value of the '<em><b>Product Bucket</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getSupplies <em>Supplies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Bucket</em>' reference.
	 * @see #setProductBucket(LPProductBucket)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPSupplyBucket_ProductBucket()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getSupplies
	 * @model opposite="Supplies"
	 * @generated
	 */
	LPProductBucket getProductBucket();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getProductBucket <em>Product Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Bucket</em>' reference.
	 * @see #getProductBucket()
	 * @generated
	 */
	void setProductBucket(LPProductBucket value);

	/**
	 * Returns the value of the '<em><b>Supplied</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplied</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplied</em>' containment reference.
	 * @see #setSupplied(GeneratorLpVar)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPSupplyBucket_Supplied()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpVar getSupplied();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getSupplied <em>Supplied</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplied</em>' containment reference.
	 * @see #getSupplied()
	 * @generated
	 */
	void setSupplied(GeneratorLpVar value);

} // LPSupplyBucket
