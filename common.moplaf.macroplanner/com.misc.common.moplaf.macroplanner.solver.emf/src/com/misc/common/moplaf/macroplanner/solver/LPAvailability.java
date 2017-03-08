/**
 */
package com.misc.common.moplaf.macroplanner.solver;

import com.misc.common.moplaf.macroplanner.Availability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Availability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPAvailability#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPAvailability#getAvailability <em>Availability</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPAvailability#getLPBuckets <em>LP Buckets</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPAvailability()
 * @model
 * @generated
 */
public interface LPAvailability extends LPTimeLine {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPResource#getAvailabilities <em>Availabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' container reference.
	 * @see #setResource(LPResource)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPAvailability_Resource()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResource#getAvailabilities
	 * @model opposite="Availabilities" required="true" transient="false"
	 * @generated
	 */
	LPResource getResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailability#getResource <em>Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' container reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(LPResource value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' reference.
	 * @see #setAvailability(Availability)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPAvailability_Availability()
	 * @model
	 * @generated
	 */
	Availability getAvailability();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailability#getAvailability <em>Availability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' reference.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(Availability value);

	/**
	 * Returns the value of the '<em><b>LP Buckets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LP Buckets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LP Buckets</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPAvailability_LPBuckets()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket#getAvailability
	 * @model opposite="Availability" containment="true"
	 * @generated
	 */
	EList<LPAvailabilityBucket> getLPBuckets();

} // LPAvailability
