/**
 */
package com.misc.common.moplaf.analysis;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.ColumnizerAbstract;
import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataToolContext;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.SuperCategory;
import com.misc.common.moplaf.job.DocRef;
import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link com.misc.common.moplaf.analysis.DocAnalysis#isComplete <em>Complete</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocAnalysis#getMaxElements <em>Max Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocAnalysis#getCategorizers <em>Categorizers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocAnalysis#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocAnalysis#getDataTools <em>Data Tools</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocAnalysis#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocAnalysis#getRefreshFeedback <em>Refresh Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocAnalysis#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.DocAnalysis#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis()
 * @model
 * @generated
 */
public interface DocAnalysis extends SuperCategory, DocRef, DataToolContext {
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
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis_Extractor()
	 * @model containment="true"
	 * @generated
	 */
	Extractor getExtractor();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocAnalysis#getExtractor <em>Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extractor</em>' containment reference.
	 * @see #getExtractor()
	 * @generated
	 */
	void setExtractor(Extractor value);

	/**
	 * Returns the value of the '<em><b>Columnizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnizer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnizer</em>' containment reference.
	 * @see #setColumnizer(ColumnizerAbstract)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis_Columnizer()
	 * @model containment="true"
	 * @generated
	 */
	ColumnizerAbstract getColumnizer();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocAnalysis#getColumnizer <em>Columnizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnizer</em>' containment reference.
	 * @see #getColumnizer()
	 * @generated
	 */
	void setColumnizer(ColumnizerAbstract value);

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
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis_Complete()
	 * @model
	 * @generated
	 */
	boolean isComplete();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocAnalysis#isComplete <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete</em>' attribute.
	 * @see #isComplete()
	 * @generated
	 */
	void setComplete(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Elements</b></em>' attribute.
	 * The default value is <code>"1000000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Elements</em>' attribute.
	 * @see #setMaxElements(int)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis_MaxElements()
	 * @model default="1000000"
	 * @generated
	 */
	int getMaxElements();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocAnalysis#getMaxElements <em>Max Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Elements</em>' attribute.
	 * @see #getMaxElements()
	 * @generated
	 */
	void setMaxElements(int value);

	/**
	 * Returns the value of the '<em><b>Categorizers</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.Categorizer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorizers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorizers</em>' containment reference list.
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis_Categorizers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Categorizer> getCategorizers();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Data Tools</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.DataTool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Tools</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Tools</em>' reference list.
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis_DataTools()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<DataTool> getDataTools();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.analysis.AnalysisDomain#getAnalyses <em>Analyses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(AnalysisDomain)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis_Domain()
	 * @see com.misc.common.moplaf.analysis.AnalysisDomain#getAnalyses
	 * @model opposite="Analyses" required="true" transient="false"
	 * @generated
	 */
	AnalysisDomain getDomain();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocAnalysis#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(AnalysisDomain value);

	/**
	 * Returns the value of the '<em><b>Refresh Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis_RefreshFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getRefreshFeedback();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocAnalysis#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remarks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getDocAnalysis_Remarks()
	 * @model
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.DocAnalysis#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addTool(DataTool tool);

} // DocAnalysis
