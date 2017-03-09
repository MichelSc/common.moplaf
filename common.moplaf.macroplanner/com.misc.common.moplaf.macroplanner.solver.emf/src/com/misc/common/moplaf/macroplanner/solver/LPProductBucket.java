/**
 */
package com.misc.common.moplaf.macroplanner.solver;

import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Product Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getProduct <em>Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCapacities <em>Capacities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getSupplies <em>Supplies</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getConsumptions <em>Consumptions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getConsumed <em>Consumed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getSupplied <em>Supplied</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getStocked <em>Stocked</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCalcConsumed <em>Calc Consumed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCalcSupplied <em>Calc Supplied</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getBalance <em>Balance</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket()
 * @model
 * @generated
 */
public interface LPProductBucket extends LPTimeBucket {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' container reference.
	 * @see #setProduct(LPProduct)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_Product()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProduct#getLPBuckets
	 * @model opposite="LPBuckets" transient="false"
	 * @generated
	 */
	LPProduct getProduct();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getProduct <em>Product</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' container reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(LPProduct value);

	/**
	 * Returns the value of the '<em><b>Capacities</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getProductBucket <em>Product Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacities</em>' reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_Capacities()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getProductBucket
	 * @model opposite="ProductBucket"
	 * @generated
	 */
	EList<LPCapacityBucket> getCapacities();

	/**
	 * Returns the value of the '<em><b>Supplies</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getProductBucket <em>Product Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplies</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplies</em>' reference.
	 * @see #setSupplies(LPSupplyBucket)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_Supplies()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getProductBucket
	 * @model opposite="ProductBucket"
	 * @generated
	 */
	LPSupplyBucket getSupplies();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getSupplies <em>Supplies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplies</em>' reference.
	 * @see #getSupplies()
	 * @generated
	 */
	void setSupplies(LPSupplyBucket value);

	/**
	 * Returns the value of the '<em><b>Consumptions</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getProductBucket <em>Product Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumptions</em>' reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_Consumptions()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getProductBucket
	 * @model opposite="ProductBucket"
	 * @generated
	 */
	EList<LPRoutingBucketProduct> getConsumptions();

	/**
	 * Returns the value of the '<em><b>Consumed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed</em>' containment reference.
	 * @see #setConsumed(GeneratorLpVar)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_Consumed()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpVar getConsumed();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getConsumed <em>Consumed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumed</em>' containment reference.
	 * @see #getConsumed()
	 * @generated
	 */
	void setConsumed(GeneratorLpVar value);

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
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_Supplied()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpVar getSupplied();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getSupplied <em>Supplied</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplied</em>' containment reference.
	 * @see #getSupplied()
	 * @generated
	 */
	void setSupplied(GeneratorLpVar value);

	/**
	 * Returns the value of the '<em><b>Stocked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stocked</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stocked</em>' containment reference.
	 * @see #setStocked(GeneratorLpVar)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_Stocked()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpVar getStocked();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getStocked <em>Stocked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stocked</em>' containment reference.
	 * @see #getStocked()
	 * @generated
	 */
	void setStocked(GeneratorLpVar value);

	/**
	 * Returns the value of the '<em><b>Calc Consumed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calc Consumed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calc Consumed</em>' containment reference.
	 * @see #setCalcConsumed(GeneratorLpCons)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_CalcConsumed()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpCons getCalcConsumed();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCalcConsumed <em>Calc Consumed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calc Consumed</em>' containment reference.
	 * @see #getCalcConsumed()
	 * @generated
	 */
	void setCalcConsumed(GeneratorLpCons value);

	/**
	 * Returns the value of the '<em><b>Calc Supplied</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calc Supplied</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calc Supplied</em>' containment reference.
	 * @see #setCalcSupplied(GeneratorLpCons)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_CalcSupplied()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpCons getCalcSupplied();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCalcSupplied <em>Calc Supplied</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calc Supplied</em>' containment reference.
	 * @see #getCalcSupplied()
	 * @generated
	 */
	void setCalcSupplied(GeneratorLpCons value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' containment reference.
	 * @see #setBalance(GeneratorLpCons)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_Balance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpCons getBalance();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getBalance <em>Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' containment reference.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(GeneratorLpCons value);

} // LPProductBucket
