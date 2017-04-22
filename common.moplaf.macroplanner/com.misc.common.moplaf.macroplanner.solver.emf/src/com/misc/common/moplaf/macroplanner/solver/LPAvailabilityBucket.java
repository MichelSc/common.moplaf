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
 * A representation of the model object '<em><b>LP Availability Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getAvailability <em>Availability</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getResourceBucket <em>Resource Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getReserved <em>Reserved</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getSlack <em>Slack</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getBalance <em>Balance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getFraction <em>Fraction</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPAvailabilityBucket()
 * @model
 * @generated
 */
public interface LPAvailabilityBucket extends LPTimeBucket {
	/**
	 * Returns the value of the '<em><b>Availability</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailability#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' container reference.
	 * @see #setAvailability(LPAvailability)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPAvailabilityBucket_Availability()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailability#getLPBuckets
	 * @model opposite="LPBuckets" transient="false"
	 * @generated
	 */
	LPAvailability getAvailability();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getAvailability <em>Availability</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' container reference.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(LPAvailability value);

	/**
	 * Returns the value of the '<em><b>Resource Bucket</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getAvailabilities <em>Availabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Bucket</em>' reference.
	 * @see #setResourceBucket(LPResourceBucket)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPAvailabilityBucket_ResourceBucket()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getAvailabilities
	 * @model opposite="Availabilities"
	 * @generated
	 */
	LPResourceBucket getResourceBucket();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getResourceBucket <em>Resource Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Bucket</em>' reference.
	 * @see #getResourceBucket()
	 * @generated
	 */
	void setResourceBucket(LPResourceBucket value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved</em>' containment reference.
	 * @see #setReserved(GeneratorLpVar)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPAvailabilityBucket_Reserved()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpVar getReserved();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getReserved <em>Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' containment reference.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(GeneratorLpVar value);

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
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPAvailabilityBucket_Slack()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpVar getSlack();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getSlack <em>Slack</em>}' containment reference.
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
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPAvailabilityBucket_Balance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpCons getBalance();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getBalance <em>Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' containment reference.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(GeneratorLpCons value);

	/**
	 * Returns the value of the '<em><b>Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fraction</em>' attribute.
	 * @see #setFraction(float)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPAvailabilityBucket_Fraction()
	 * @model
	 * @generated
	 */
	float getFraction();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getFraction <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraction</em>' attribute.
	 * @see #getFraction()
	 * @generated
	 */
	void setFraction(float value);

} // LPAvailabilityBucket
