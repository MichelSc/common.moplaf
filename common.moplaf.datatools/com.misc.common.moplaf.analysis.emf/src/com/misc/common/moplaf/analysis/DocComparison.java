/**
 */
package com.misc.common.moplaf.analysis;

import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.Columnizer;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.Matcher;

import com.misc.common.moplaf.job.DocRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.DocComparison#getExtractor <em>Extractor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocComparison#getColumnizer <em>Columnizer</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocComparison#getDoc1 <em>Doc1</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocComparison#getDoc2 <em>Doc2</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocComparison#getCategorizer <em>Categorizer</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocComparison()
 * @model
 * @generated
 */
public interface DocComparison extends Matcher {
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
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocComparison_Extractor()
	 * @model
	 * @generated
	 */
	Extractor getExtractor();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocComparison#getExtractor <em>Extractor</em>}' reference.
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
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocComparison_Columnizer()
	 * @model
	 * @generated
	 */
	Columnizer getColumnizer();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocComparison#getColumnizer <em>Columnizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnizer</em>' reference.
	 * @see #getColumnizer()
	 * @generated
	 */
	void setColumnizer(Columnizer value);

	/**
	 * Returns the value of the '<em><b>Doc1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc1</em>' containment reference.
	 * @see #setDoc1(DocRef)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocComparison_Doc1()
	 * @model containment="true"
	 * @generated
	 */
	DocRef getDoc1();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocComparison#getDoc1 <em>Doc1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc1</em>' containment reference.
	 * @see #getDoc1()
	 * @generated
	 */
	void setDoc1(DocRef value);

	/**
	 * Returns the value of the '<em><b>Doc2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc2</em>' containment reference.
	 * @see #setDoc2(DocRef)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocComparison_Doc2()
	 * @model containment="true"
	 * @generated
	 */
	DocRef getDoc2();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocComparison#getDoc2 <em>Doc2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc2</em>' containment reference.
	 * @see #getDoc2()
	 * @generated
	 */
	void setDoc2(DocRef value);

	/**
	 * Returns the value of the '<em><b>Categorizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorizer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorizer</em>' reference.
	 * @see #setCategorizer(Categorizer)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocComparison_Categorizer()
	 * @model
	 * @generated
	 */
	Categorizer getCategorizer();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocComparison#getCategorizer <em>Categorizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorizer</em>' reference.
	 * @see #getCategorizer()
	 * @generated
	 */
	void setCategorizer(Categorizer value);

} // DocComparison
