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
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucketResource()
 * @model
 * @generated
 */
public interface LPRoutingBucketResource extends LPTuple {
	/**
	 * Returns the value of the '<em><b>Resource Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Bucket</em>' reference.
	 * @see #setResourceBucket(LPResourceBucket)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucketResource_ResourceBucket()
	 * @model required="true"
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
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getLPBucket <em>LP Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Resource</em>' reference.
	 * @see #setRoutingResource(LPRoutingResource)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingBucketResource_RoutingResource()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingResource#getLPBucket
	 * @model opposite="LPBucket"
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

} // LPRoutingBucketResource
