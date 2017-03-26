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

import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Capacity Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getProductBucket <em>Product Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getStocked <em>Stocked</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getSlack <em>Slack</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getBalance <em>Balance</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPCapacityBucket()
 * @model
 * @generated
 */
public interface LPCapacityBucket extends LPTimeBucket {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacity#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' container reference.
	 * @see #setCapacity(LPCapacity)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPCapacityBucket_Capacity()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacity#getLPBuckets
	 * @model opposite="LPBuckets" transient="false"
	 * @generated
	 */
	LPCapacity getCapacity();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getCapacity <em>Capacity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' container reference.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(LPCapacity value);

	/**
	 * Returns the value of the '<em><b>Product Bucket</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCapacities <em>Capacities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Bucket</em>' reference.
	 * @see #setProductBucket(LPProductBucket)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPCapacityBucket_ProductBucket()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket#getCapacities
	 * @model opposite="Capacities"
	 * @generated
	 */
	LPProductBucket getProductBucket();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getProductBucket <em>Product Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Bucket</em>' reference.
	 * @see #getProductBucket()
	 * @generated
	 */
	void setProductBucket(LPProductBucket value);

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
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPCapacityBucket_Stocked()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpVar getStocked();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getStocked <em>Stocked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stocked</em>' containment reference.
	 * @see #getStocked()
	 * @generated
	 */
	void setStocked(GeneratorLpVar value);

	/**
	 * Returns the value of the '<em><b>Slack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slack</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slack</em>' containment reference.
	 * @see #setSlack(GeneratorLpVar)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPCapacityBucket_Slack()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpVar getSlack();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getSlack <em>Slack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slack</em>' containment reference.
	 * @see #getSlack()
	 * @generated
	 */
	void setSlack(GeneratorLpVar value);

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
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPCapacityBucket_Balance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpCons getBalance();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket#getBalance <em>Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' containment reference.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(GeneratorLpCons value);

} // LPCapacityBucket
