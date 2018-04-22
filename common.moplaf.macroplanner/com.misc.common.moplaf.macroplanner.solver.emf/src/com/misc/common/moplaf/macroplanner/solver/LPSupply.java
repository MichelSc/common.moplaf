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

import com.misc.common.moplaf.macroplanner.Supply;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPSupply#getSupply <em>Supply</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPSupply#getLPBuckets <em>LP Buckets</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPSupply#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPSupply()
 * @model
 * @generated
 */
public interface LPSupply extends LPTimeLine {
	/**
	 * Returns the value of the '<em><b>Supply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply</em>' reference.
	 * @see #setSupply(Supply)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPSupply_Supply()
	 * @model
	 * @generated
	 */
	Supply getSupply();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPSupply#getSupply <em>Supply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply</em>' reference.
	 * @see #getSupply()
	 * @generated
	 */
	void setSupply(Supply value);

	/**
	 * Returns the value of the '<em><b>LP Buckets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getSupply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LP Buckets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LP Buckets</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPSupply_LPBuckets()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket#getSupply
	 * @model opposite="Supply" containment="true"
	 * @generated
	 */
	EList<LPSupplyBucket> getLPBuckets();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPProduct#getSupplies <em>Supplies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' container reference.
	 * @see #setProduct(LPProduct)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPSupply_Product()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProduct#getSupplies
	 * @model opposite="Supplies" transient="false"
	 * @generated
	 */
	LPProduct getProduct();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPSupply#getProduct <em>Product</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' container reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(LPProduct value);

} // LPSupply
