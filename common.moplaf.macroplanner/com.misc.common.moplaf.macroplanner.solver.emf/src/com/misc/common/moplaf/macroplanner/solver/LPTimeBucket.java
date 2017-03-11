/**
 */
package com.misc.common.moplaf.macroplanner.solver;

import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Time Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPTimeBucket#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPTimeBucket()
 * @model
 * @generated
 */
public interface LPTimeBucket extends LPTuple, ObjectTimeBucket {

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPTimeBucket_Content()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getContent();
} // LPTimeBucket
