/**
 */
package com.misc.common.moplaf.analysis;

import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.Columnizer;
import com.misc.common.moplaf.datatools.Extractor;

import com.misc.common.moplaf.job.DocRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.DocAnalysis#getExtractor <em>Extractor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocAnalysis#getColumnizer <em>Columnizer</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis()
 * @model
 * @generated
 */
public interface DocAnalysis extends DocRef, Categorizer {
	/**
	 * Returns the value of the '<em><b>Extractor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extractor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extractor</em>' reference.
	 * @see #setExtractor(Extractor)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis_Extractor()
	 * @model
	 * @generated
	 */
	Extractor getExtractor();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocAnalysis#getExtractor <em>Extractor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extractor</em>' reference.
	 * @see #getExtractor()
	 * @generated
	 */
	void setExtractor(Extractor value);

	/**
	 * Returns the value of the '<em><b>Columnizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnizer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnizer</em>' reference.
	 * @see #setColumnizer(Columnizer)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis_Columnizer()
	 * @model
	 * @generated
	 */
	Columnizer getColumnizer();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocAnalysis#getColumnizer <em>Columnizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnizer</em>' reference.
	 * @see #getColumnizer()
	 * @generated
	 */
	void setColumnizer(Columnizer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // DocAnalysis
