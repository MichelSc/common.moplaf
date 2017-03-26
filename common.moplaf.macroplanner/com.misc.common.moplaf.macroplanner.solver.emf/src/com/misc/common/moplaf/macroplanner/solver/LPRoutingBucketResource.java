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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Routing Bucket Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getResourceBucket <em>Resource Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getRoutingResource <em>Routing Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getRouting <em>Routing</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucketResource()
 * @model
 * @generated
 */
public interface LPRoutingBucketResource extends LPTuple {
	/**
	 * Returns the value of the '<em><b>Resource Bucket</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getReservations <em>Reservations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Bucket</em>' reference.
	 * @see #setResourceBucket(LPResourceBucket)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucketResource_ResourceBucket()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getReservations
	 * @model opposite="Reservations" required="true"
	 * @generated
	 */
	LPResourceBucket getResourceBucket();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getResourceBucket <em>Resource Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Bucket</em>' reference.
	 * @see #getResourceBucket()
	 * @generated
	 */
	void setResourceBucket(LPResourceBucket value);

	/**
	 * Returns the value of the '<em><b>Routing Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Resource</em>' reference.
	 * @see #setRoutingResource(LPRoutingResource)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucketResource_RoutingResource()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getLPBuckets
	 * @model opposite="LPBuckets"
	 * @generated
	 */
	LPRoutingResource getRoutingResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getRoutingResource <em>Routing Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Resource</em>' reference.
	 * @see #getRoutingResource()
	 * @generated
	 */
	void setRoutingResource(LPRoutingResource value);

	/**
	 * Returns the value of the '<em><b>Routing</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing</em>' container reference.
	 * @see #setRouting(LPRoutingBucket)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucketResource_Routing()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket#getResources
	 * @model opposite="Resources" required="true" transient="false"
	 * @generated
	 */
	LPRoutingBucket getRouting();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getRouting <em>Routing</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing</em>' container reference.
	 * @see #getRouting()
	 * @generated
	 */
	void setRouting(LPRoutingBucket value);

} // LPRoutingBucketResource
