/**
 */
package com.misc.common.moplaf.localsearch;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.Solution#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Score}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' containment reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolution_Score()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Score> getScore();

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
