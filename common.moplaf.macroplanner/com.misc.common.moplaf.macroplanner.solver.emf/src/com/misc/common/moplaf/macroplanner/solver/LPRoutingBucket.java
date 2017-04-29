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

import com.misc.common.moplaf.solver.GeneratorLpVar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Routing Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getRouting <em>Routing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getProducts <em>Products</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getPlanned <em>Planned</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getPlannedSelectedSolution <em>Planned Selected Solution</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucket()
 * @model
 * @generated
 */
public interface LPRoutingBucket extends LPTimeBucket {
	/**
	 * Returns the value of the '<em><b>Routing</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing</em>' container reference.
	 * @see #setRouting(LPRouting)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucket_Routing()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRouting#getLPBuckets
	 * @model opposite="LPBuckets" transient="false"
	 * @generated
	 */
	LPRouting getRouting();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getRouting <em>Routing</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing</em>' container reference.
	 * @see #getRouting()
	 * @generated
	 */
	void setRouting(LPRouting value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucket_Products()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct#getRouting
	 * @model opposite="Routing" containment="true"
	 * @generated
	 */
	EList<LPRoutingBucketProduct> getProducts();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucket_Resources()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getRouting
	 * @model opposite="Routing" containment="true"
	 * @generated
	 */
	EList<LPRoutingBucketResource> getResources();

	/**
	 * Returns the value of the '<em><b>Planned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rate of Routing planned (Quantity per TimeUnit)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planned</em>' containment reference.
	 * @see #setPlanned(GeneratorLpVar)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucket_Planned()
	 * @model containment="true" required="true"
	 *        extendedMetaData="wildcards='' name=''"
	 * @generated
	 */
	GeneratorLpVar getPlanned();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getPlanned <em>Planned</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned</em>' containment reference.
	 * @see #getPlanned()
	 * @generated
	 */
	void setPlanned(GeneratorLpVar value);

	/**
	 * Returns the value of the '<em><b>Planned Selected Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned Selected Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Selected Solution</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucket_PlannedSelectedSolution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getPlannedSelectedSolution();

} // LPRoutingBucket
