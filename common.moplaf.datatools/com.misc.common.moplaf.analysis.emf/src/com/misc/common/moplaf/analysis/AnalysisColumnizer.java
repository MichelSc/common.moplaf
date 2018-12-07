/**
 */
package com.misc.common.moplaf.analysis;

import com.misc.common.moplaf.datatools.ColumnizerAbstract;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columnizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisColumnizer#getKeys <em>Keys</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisColumnizer#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisColumnizer#getColumnizer <em>Columnizer</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisColumnizer()
 * @model
 * @generated
 */
public interface AnalysisColumnizer extends EObject {
	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.analysis.AnalysisElementKey#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference.
	 * @see #setKeys(AnalysisElementKey)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisColumnizer_Keys()
	 * @see com.misc.common.moplaf.analysis.AnalysisElementKey#getSheet
	 * @model opposite="Sheet" containment="true"
	 * @generated
	 */
	AnalysisElementKey getKeys();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.AnalysisColumnizer#getKeys <em>Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keys</em>' containment reference.
	 * @see #getKeys()
	 * @generated
	 */
	void setKeys(AnalysisElementKey value);

	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.analysis.Analysis#getSheets <em>Sheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis</em>' container reference.
	 * @see #setAnalysis(Analysis)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisColumnizer_Analysis()
	 * @see com.misc.common.moplaf.analysis.Analysis#getSheets
	 * @model opposite="Sheets" required="true" transient="false"
	 * @generated
	 */
	Analysis getAnalysis();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.AnalysisColumnizer#getAnalysis <em>Analysis</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis</em>' container reference.
	 * @see #getAnalysis()
	 * @generated
	 */
	void setAnalysis(Analysis value);

	/**
	 * Returns the value of the '<em><b>Columnizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnizer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnizer</em>' reference.
	 * @see #setColumnizer(ColumnizerAbstract)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisColumnizer_Columnizer()
	 * @model
	 * @generated
	 */
	ColumnizerAbstract getColumnizer();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.AnalysisColumnizer#getColumnizer <em>Columnizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnizer</em>' reference.
	 * @see #getColumnizer()
	 * @generated
	 */
	void setColumnizer(ColumnizerAbstract value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addElement(AnalysisElement doc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeElement(AnalysisElement doc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object getKeyValue(EObject element);

} // AnalysisColumnizer
