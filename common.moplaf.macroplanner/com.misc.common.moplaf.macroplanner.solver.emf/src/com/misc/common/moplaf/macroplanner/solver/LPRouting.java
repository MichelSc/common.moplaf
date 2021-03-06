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

import com.misc.common.moplaf.macroplanner.Routing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Routing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getRoutingSet <em>Routing Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getRouting <em>Routing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getLPBuckets <em>LP Buckets</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getProducts <em>Products</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRouting()
 * @model
 * @generated
 */
public interface LPRouting extends LPTimeLine {
	/**
	 * Returns the value of the '<em><b>Routing Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingSet#getRoutings <em>Routings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Set</em>' container reference.
	 * @see #setRoutingSet(LPRoutingSet)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRouting_RoutingSet()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingSet#getRoutings
	 * @model opposite="Routings" required="true" transient="false"
	 * @generated
	 */
	LPRoutingSet getRoutingSet();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getRoutingSet <em>Routing Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Set</em>' container reference.
	 * @see #getRoutingSet()
	 * @generated
	 */
	void setRoutingSet(LPRoutingSet value);

	/**
	 * Returns the value of the '<em><b>Routing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing</em>' reference.
	 * @see #setRouting(Routing)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRouting_Routing()
	 * @model
	 * @generated
	 */
	Routing getRouting();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getRouting <em>Routing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing</em>' reference.
	 * @see #getRouting()
	 * @generated
	 */
	void setRouting(Routing value);

	/**
	 * Returns the value of the '<em><b>LP Buckets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LP Buckets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LP Buckets</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRouting_LPBuckets()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getRouting
	 * @model opposite="Routing" containment="true"
	 * @generated
	 */
	EList<LPRoutingBucket> getLPBuckets();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRouting_Products()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct#getRouting
	 * @model opposite="Routing" containment="true"
	 * @generated
	 */
	EList<LPRoutingProduct> getProducts();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRouting_Resources()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getRouting
	 * @model opposite="Routing" containment="true"
	 * @generated
	 */
	EList<LPRoutingResource> getResources();

} // LPRouting
