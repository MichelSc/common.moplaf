/**
 */
package com.misc.common.moplaf.analysis;

import com.misc.common.moplaf.datatools.Category;

import com.misc.common.moplaf.datatools.util.ObjectSet;

import com.misc.common.moplaf.job.DocRef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisDoc#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisDoc#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisDoc#isComplete <em>Complete</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisDoc#getNbElements <em>Nb Elements</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisDoc()
 * @model
 * @generated
 */
public interface AnalysisDoc extends DocRef {
	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.analysis.Analysis#getDocs <em>Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis</em>' container reference.
	 * @see #setAnalysis(Analysis)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisDoc_Analysis()
	 * @see com.misc.common.moplaf.analysis.Analysis#getDocs
	 * @model opposite="Docs" required="true" transient="false"
	 * @generated
	 */
	Analysis getAnalysis();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.AnalysisDoc#getAnalysis <em>Analysis</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis</em>' container reference.
	 * @see #getAnalysis()
	 * @generated
	 */
	void setAnalysis(Analysis value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.analysis.AnalysisElement}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.analysis.AnalysisElement#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisDoc_Elements()
	 * @see com.misc.common.moplaf.analysis.AnalysisElement#getDoc
	 * @model opposite="Doc" containment="true"
	 * @generated
	 */
	EList<AnalysisElement> getElements();

	/**
	 * Returns the value of the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete</em>' attribute.
	 * @see #setComplete(boolean)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisDoc_Complete()
	 * @model
	 * @generated
	 */
	boolean isComplete();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.AnalysisDoc#isComplete <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete</em>' attribute.
	 * @see #isComplete()
	 * @generated
	 */
	void setComplete(boolean value);

	/**
	 * Returns the value of the '<em><b>Nb Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Elements</em>' attribute.
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisDoc_NbElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNbElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.datatools.EObjectsSet"
	 * @generated
	 */
	ObjectSet getElements(Category category);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void flush();

} // AnalysisDoc
