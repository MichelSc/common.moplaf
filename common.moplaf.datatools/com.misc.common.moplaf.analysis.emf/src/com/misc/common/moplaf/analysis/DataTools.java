/**
 */
package com.misc.common.moplaf.analysis;

import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataToolContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Tools</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.DataTools#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DataTools#getDataTools <em>Data Tools</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDataTools()
 * @model
 * @generated
 */
public interface DataTools extends DataToolContext {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.analysis.AnalysisDomain#getDataTools <em>Data Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(AnalysisDomain)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDataTools_Domain()
	 * @see com.misc.common.moplaf.analysis.AnalysisDomain#getDataTools
	 * @model opposite="DataTools" required="true" transient="false"
	 * @generated
	 */
	AnalysisDomain getDomain();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DataTools#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(AnalysisDomain value);

	/**
	 * Returns the value of the '<em><b>Data Tools</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.DataTool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Tools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Tools</em>' containment reference list.
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDataTools_DataTools()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTool> getDataTools();

} // DataTools
