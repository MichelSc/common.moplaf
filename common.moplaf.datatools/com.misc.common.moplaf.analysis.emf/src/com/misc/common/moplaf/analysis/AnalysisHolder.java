/**
 */
package com.misc.common.moplaf.analysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisHolder#getAnalyses <em>Analyses</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisHolder()
 * @model
 * @generated
 */
public interface AnalysisHolder extends EObject {
	/**
	 * Returns the value of the '<em><b>Analyses</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.analysis.DocAnalysis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analyses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyses</em>' containment reference list.
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisHolder_Analyses()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocAnalysis> getAnalyses();

} // AnalysisHolder
