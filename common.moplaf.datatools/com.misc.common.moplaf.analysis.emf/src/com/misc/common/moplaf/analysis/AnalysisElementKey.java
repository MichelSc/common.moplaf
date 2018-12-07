/**
 */
package com.misc.common.moplaf.analysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisElementKey#getSheet <em>Sheet</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisElementKey#getDocs <em>Docs</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisElementKey()
 * @model
 * @generated
 */
public interface AnalysisElementKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.analysis.AnalysisSheet#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' container reference.
	 * @see #setSheet(AnalysisSheet)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisElementKey_Sheet()
	 * @see com.misc.common.moplaf.analysis.AnalysisSheet#getKeys
	 * @model opposite="Keys" required="true" transient="false"
	 * @generated
	 */
	AnalysisSheet getSheet();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.AnalysisElementKey#getSheet <em>Sheet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' container reference.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(AnalysisSheet value);

	/**
	 * Returns the value of the '<em><b>Docs</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.analysis.AnalysisElement}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.analysis.AnalysisElement#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docs</em>' reference list.
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisElementKey_Docs()
	 * @see com.misc.common.moplaf.analysis.AnalysisElement#getKey
	 * @model opposite="Key"
	 * @generated
	 */
	EList<AnalysisElement> getDocs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Object getKeyValue();

} // AnalysisElementKey
