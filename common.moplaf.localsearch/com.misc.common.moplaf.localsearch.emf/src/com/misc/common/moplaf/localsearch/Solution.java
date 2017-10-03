/**
 */
package com.misc.common.moplaf.localsearch;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends ObjectWithPropagatorFunctions, Score {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void replicate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refresh derived elements
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // Solution
