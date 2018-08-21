/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matcher</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getMatcher()
 * @model
 * @generated
 */
public interface Matcher extends DataTool {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MatchStatus getMatch(EObject ins1, EObject ins2);

} // Matcher
