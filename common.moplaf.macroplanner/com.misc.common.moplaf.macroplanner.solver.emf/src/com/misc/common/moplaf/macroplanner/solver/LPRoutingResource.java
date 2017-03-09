/**
 */
package com.misc.common.moplaf.macroplanner.solver;

import com.misc.common.moplaf.macroplanner.RoutingResource;
import com.misc.common.moplaf.solver.GeneratorTuple;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Routing Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getRouting <em>Routing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getRoutingResource <em>Routing Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getLPBucket <em>LP Bucket</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingResource()
 * @model
 * @generated
 */
public interface LPRoutingResource extends GeneratorTuple {
	/**
	 * Returns the value of the '<em><b>Routing</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing</em>' container reference.
	 * @see #setRouting(LPRouting)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingResource_Routing()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRouting#getResources
	 * @model opposite="Resources" transient="false"
	 * @generated
	 */
	LPRouting getRouting();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getRouting <em>Routing</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing</em>' container reference.
	 * @see #getRouting()
	 * @generated
	 */
	void setRouting(LPRouting value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(LPResource)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingResource_Resource()
	 * @model
	 * @generated
	 */
	LPResource getResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(LPResource value);

	/**
	 * Returns the value of the '<em><b>Routing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Resource</em>' reference.
	 * @see #setRoutingResource(RoutingResource)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingResource_RoutingResource()
	 * @model required="true"
	 * @generated
	 */
	RoutingResource getRoutingResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getRoutingResource <em>Routing Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Resource</em>' reference.
	 * @see #getRoutingResource()
	 * @generated
	 */
	void setRoutingResource(RoutingResource value);

	/**
	 * Returns the value of the '<em><b>LP Bucket</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getRoutingResource <em>Routing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LP Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LP Bucket</em>' reference.
	 * @see #setLPBucket(LPRoutingBucketResource)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingResource_LPBucket()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource#getRoutingResource
	 * @model opposite="RoutingResource"
	 * @generated
	 */
	LPRoutingBucketResource getLPBucket();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getLPBucket <em>LP Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LP Bucket</em>' reference.
	 * @see #getLPBucket()
	 * @generated
	 */
	void setLPBucket(LPRoutingBucketResource value);

} // LPRoutingResource
