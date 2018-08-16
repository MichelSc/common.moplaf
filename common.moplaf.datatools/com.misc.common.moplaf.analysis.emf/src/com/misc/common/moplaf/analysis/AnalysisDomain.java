/**
 */
package com.misc.common.moplaf.analysis;

import com.misc.common.moplaf.datatools.DataTools;

import com.misc.common.moplaf.job.TaskDomain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisDomain#getSuperDomain <em>Super Domain</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisDomain#getSubDomains <em>Sub Domains</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisDomain#getAnalyses <em>Analyses</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisDomain()
 * @model
 * @generated
 */
public interface AnalysisDomain extends DataTools, TaskDomain {
	/**
	 * Returns the value of the '<em><b>Super Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.analysis.AnalysisDomain#getSubDomains <em>Sub Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Domain</em>' container reference.
	 * @see #setSuperDomain(AnalysisDomain)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisDomain_SuperDomain()
	 * @see com.misc.common.moplaf.analysis.AnalysisDomain#getSubDomains
	 * @model opposite="SubDomains" transient="false"
	 * @generated
	 */
	AnalysisDomain getSuperDomain();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.AnalysisDomain#getSuperDomain <em>Super Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Domain</em>' container reference.
	 * @see #getSuperDomain()
	 * @generated
	 */
	void setSuperDomain(AnalysisDomain value);

	/**
	 * Returns the value of the '<em><b>Sub Domains</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.analysis.AnalysisDomain}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.analysis.AnalysisDomain#getSuperDomain <em>Super Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Domains</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Domains</em>' containment reference list.
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisDomain_SubDomains()
	 * @see com.misc.common.moplaf.analysis.AnalysisDomain#getSuperDomain
	 * @model opposite="SuperDomain" containment="true"
	 * @generated
	 */
	EList<AnalysisDomain> getSubDomains();

	/**
	 * Returns the value of the '<em><b>Analyses</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.analysis.DocAnalysis}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.analysis.DocAnalysis#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analyses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyses</em>' containment reference list.
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisDomain_Analyses()
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#getDomain
	 * @model opposite="Domain" containment="true"
	 * @generated
	 */
	EList<DocAnalysis> getAnalyses();

} // AnalysisDomain
