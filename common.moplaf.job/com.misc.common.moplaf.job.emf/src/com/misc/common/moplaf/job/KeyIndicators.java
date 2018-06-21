/**
 */
package com.misc.common.moplaf.job;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Indicators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.KeyIndicators#getIndicators <em>Indicators</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getKeyIndicators()
 * @model
 * @generated
 */
public interface KeyIndicators extends EObject {
	/**
	 * Returns the value of the '<em><b>Indicators</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.KeyIndicator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicators</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.JobPackage#getKeyIndicators_Indicators()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyIndicator> getIndicators();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshKeyIndicators();

} // KeyIndicators
