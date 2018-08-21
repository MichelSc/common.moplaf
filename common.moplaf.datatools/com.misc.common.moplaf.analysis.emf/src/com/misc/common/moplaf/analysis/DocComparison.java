/**
 */
package com.misc.common.moplaf.analysis;

import com.misc.common.moplaf.datatools.ColumnizerAbstract;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.Match;
import com.misc.common.moplaf.datatools.Matcher;

import com.misc.common.moplaf.job.DocRef;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link com.misc.common.moplaf.analysis.DocComparison#getColumnizerCompare <em>Columnizer Compare</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocComparison#getDoc1 <em>Doc1</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocComparison#getDoc2 <em>Doc2</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocComparison#getMatches <em>Matches</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocComparison#getMatcher <em>Matcher</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocComparison#getColumnizerKey <em>Columnizer Key</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocComparison()
 * @model
 * @generated
 */
public interface DocComparison extends EObject {
	/**
	 * Returns the value of the '<em><b>Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extractor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extractor</em>' containment reference.
	 * @see #setExtractor(Extractor)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocComparison_Extractor()
	 * @model containment="true"
	 * @generated
	 */
	Extractor getExtractor();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocComparison#getExtractor <em>Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extractor</em>' containment reference.
	 * @see #getExtractor()
	 * @generated
	 */
	void setExtractor(Extractor value);

	/**
	 * Returns the value of the '<em><b>Columnizer Compare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnizer Compare</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnizer Compare</em>' containment reference.
	 * @see #setColumnizerCompare(ColumnizerAbstract)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocComparison_ColumnizerCompare()
	 * @model containment="true"
	 * @generated
	 */
	ColumnizerAbstract getColumnizerCompare();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocComparison#getColumnizerCompare <em>Columnizer Compare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnizer Compare</em>' containment reference.
	 * @see #getColumnizerCompare()
	 * @generated
	 */
	void setColumnizerCompare(ColumnizerAbstract value);

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
	 * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.Match}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocComparison_Matches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Match> getMatches();

	/**
	 * Returns the value of the '<em><b>Matcher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matcher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matcher</em>' containment reference.
	 * @see #setMatcher(Matcher)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocComparison_Matcher()
	 * @model containment="true"
	 * @generated
	 */
	Matcher getMatcher();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocComparison#getMatcher <em>Matcher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matcher</em>' containment reference.
	 * @see #getMatcher()
	 * @generated
	 */
	void setMatcher(Matcher value);

	/**
	 * Returns the value of the '<em><b>Columnizer Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnizer Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnizer Key</em>' containment reference.
	 * @see #setColumnizerKey(ColumnizerAbstract)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocComparison_ColumnizerKey()
	 * @model containment="true"
	 * @generated
	 */
	ColumnizerAbstract getColumnizerKey();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocComparison#getColumnizerKey <em>Columnizer Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnizer Key</em>' containment reference.
	 * @see #getColumnizerKey()
	 * @generated
	 */
	void setColumnizerKey(ColumnizerAbstract value);

} // DocComparison
