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

import com.misc.common.moplaf.macroplanner.LocationResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPResource#getResourceSet <em>Resource Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPResource#getAvailabilities <em>Availabilities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPResource#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPResource#getLPBuckets <em>LP Buckets</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResource()
 * @model
 * @generated
 */
public interface LPResource extends LPTimeLine {
	/**
	 * Returns the value of the '<em><b>Availabilities</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPAvailability}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailability#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availabilities</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResource_Availabilities()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailability#getResource
	 * @model opposite="Resource" containment="true"
	 * @generated
	 */
	EList<LPAvailability> getAvailabilities();

	/**
	 * Returns the value of the '<em><b>Resource Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceSet#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Set</em>' container reference.
	 * @see #setResourceSet(LPResourceSet)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResource_ResourceSet()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceSet#getResources
	 * @model opposite="Resources" required="true" transient="false"
	 * @generated
	 */
	LPResourceSet getResourceSet();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPResource#getResourceSet <em>Resource Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Set</em>' container reference.
	 * @see #getResourceSet()
	 * @generated
	 */
	void setResourceSet(LPResourceSet value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(LocationResource)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResource_Resource()
	 * @model
	 * @generated
	 */
	LocationResource getResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPResource#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(LocationResource value);

	/**
	 * Returns the value of the '<em><b>LP Buckets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LP Buckets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LP Buckets</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResource_LPBuckets()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getResource
	 * @model opposite="Resource" containment="true"
	 * @generated
	 */
	EList<LPResourceBucket> getLPBuckets();

} // LPResource
