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
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCalcStocked <em>Calc Stocked</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getBalance <em>Balance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#isConsumingSelectedSolution <em>Consuming Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getConsumptionSelectedSolution <em>Consumption Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#isStockedSelectedSolution <em>Stocked Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getStockSelectedSolution <em>Stock Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#isWithCapacity <em>With Capacity</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getStockMaximum <em>Stock Maximum</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#isCapacityTightSelectedSolution <em>Capacity Tight Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#isCapacitySlackSelectedSolution <em>Capacity Slack Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#isSuppliedSelectedSolution <em>Supplied Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getSupplySelectedSolution <em>Supply Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#isWithSupply <em>With Supply</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getSupplyMaximum <em>Supply Maximum</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#isSupplyTightSelectedSolution <em>Supply Tight Selected Solution</em>}</li>
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
	 * Returns the value of the '<em><b>Supplies</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getProductBucket <em>Product Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplies</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplies</em>' reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_Supplies()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getProductBucket
	 * @model opposite="ProductBucket"
	 * @generated
	 */
	EList<LPSupplyBucket> getSupplies();

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
	 * <!-- begin-model-doc -->
	 * Quantity of Product
	 * 
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Quantity of Product
	 * 
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Quantity of Product
	 * 
	 * <!-- end-model-doc -->
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
	 * Returns the value of the '<em><b>Calc Stocked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calc Stocked</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calc Stocked</em>' containment reference.
	 * @see #setCalcStocked(GeneratorLpCons)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_CalcStocked()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpCons getCalcStocked();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCalcStocked <em>Calc Stocked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calc Stocked</em>' containment reference.
	 * @see #getCalcStocked()
	 * @generated
	 */
	void setCalcStocked(GeneratorLpCons value);

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

	/**
	 * Returns the value of the '<em><b>Consuming Selected Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consuming Selected Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consuming Selected Solution</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_ConsumingSelectedSolution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isConsumingSelectedSolution();

	/**
	 * Returns the value of the '<em><b>Stock Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Maximum</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_StockMaximum()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getStockMaximum();

	/**
	 * Returns the value of the '<em><b>Stock Selected Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Selected Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Selected Solution</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_StockSelectedSolution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getStockSelectedSolution();

	/**
	 * Returns the value of the '<em><b>With Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Capacity</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_WithCapacity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isWithCapacity();

	/**
	 * Returns the value of the '<em><b>Supply Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply Maximum</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_SupplyMaximum()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getSupplyMaximum();

	/**
	 * Returns the value of the '<em><b>Supply Selected Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply Selected Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply Selected Solution</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_SupplySelectedSolution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getSupplySelectedSolution();

	/**
	 * Returns the value of the '<em><b>With Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Supply</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Supply</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_WithSupply()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isWithSupply();

	/**
	 * Returns the value of the '<em><b>Consumption Selected Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumption Selected Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumption Selected Solution</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_ConsumptionSelectedSolution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getConsumptionSelectedSolution();

	/**
	 * Returns the value of the '<em><b>Stocked Selected Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stocked Selected Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stocked Selected Solution</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_StockedSelectedSolution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isStockedSelectedSolution();

	/**
	 * Returns the value of the '<em><b>Capacity Tight Selected Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity Tight Selected Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Tight Selected Solution</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_CapacityTightSelectedSolution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isCapacityTightSelectedSolution();

	/**
	 * Returns the value of the '<em><b>Capacity Slack Selected Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity Slack Selected Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Slack Selected Solution</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_CapacitySlackSelectedSolution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isCapacitySlackSelectedSolution();

	/**
	 * Returns the value of the '<em><b>Supplied Selected Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplied Selected Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplied Selected Solution</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_SuppliedSelectedSolution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isSuppliedSelectedSolution();

	/**
	 * Returns the value of the '<em><b>Supply Tight Selected Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply Tight Selected Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply Tight Selected Solution</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPProductBucket_SupplyTightSelectedSolution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isSupplyTightSelectedSolution();

} // LPProductBucket
