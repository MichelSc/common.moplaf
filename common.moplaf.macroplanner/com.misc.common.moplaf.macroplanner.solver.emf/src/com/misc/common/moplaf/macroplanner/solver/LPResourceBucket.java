/**
 */
package com.misc.common.moplaf.macroplanner.solver;

import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Resource Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getAvailabilities <em>Availabilities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getReservations <em>Reservations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getReserved <em>Reserved</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getCalcReserved <em>Calc Reserved</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getBalance <em>Balance</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResourceBucket()
 * @model
 * @generated
 */
public interface LPResourceBucket extends LPTimeBucket {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPResource#getLPBuckets <em>LP Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' container reference.
	 * @see #setResource(LPResource)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResourceBucket_Resource()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResource#getLPBuckets
	 * @model opposite="LPBuckets" transient="false"
	 * @generated
	 */
	LPResource getResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getResource <em>Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' container reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(LPResource value);

	/**
	 * Returns the value of the '<em><b>Availabilities</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getResourceBucket <em>Resource Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availabilities</em>' reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResourceBucket_Availabilities()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getResourceBucket
	 * @model opposite="ResourceBucket"
	 * @generated
	 */
	EList<LPAvailabilityBucket> getAvailabilities();

	/**
	 * Returns the value of the '<em><b>Reservations</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getResourceBucket <em>Resource Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservations</em>' reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResourceBucket_Reservations()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getResourceBucket
	 * @model opposite="ResourceBucket"
	 * @generated
	 */
	EList<LPRoutingBucketResource> getReservations();

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
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResourceBucket_Reserved()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpVar getReserved();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getReserved <em>Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' containment reference.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(GeneratorLpVar value);

	/**
	 * Returns the value of the '<em><b>Calc Reserved</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calc Reserved</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calc Reserved</em>' containment reference.
	 * @see #setCalcReserved(GeneratorLpCons)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResourceBucket_CalcReserved()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpCons getCalcReserved();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getCalcReserved <em>Calc Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calc Reserved</em>' containment reference.
	 * @see #getCalcReserved()
	 * @generated
	 */
	void setCalcReserved(GeneratorLpCons value);

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
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPResourceBucket_Balance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpCons getBalance();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket#getBalance <em>Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' containment reference.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(GeneratorLpCons value);

} // LPResourceBucket
