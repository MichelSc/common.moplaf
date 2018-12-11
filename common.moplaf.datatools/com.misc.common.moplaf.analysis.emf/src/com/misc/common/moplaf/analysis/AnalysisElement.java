/**
 */
package com.misc.common.moplaf.analysis;

import com.misc.common.moplaf.datatools.CategorizerSubject;
import com.misc.common.moplaf.datatools.CategoryAbstract;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisElement#getDoc <em>Doc</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisElement#getKey <em>Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisElement#getElement <em>Element</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.AnalysisElement#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisElement()
 * @model
 * @generated
 */
public interface AnalysisElement extends CategorizerSubject {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.analysis.AnalysisDoc#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' container reference.
	 * @see #setDoc(AnalysisDoc)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisElement_Doc()
	 * @see com.misc.common.moplaf.analysis.AnalysisDoc#getElements
	 * @model opposite="Elements" required="true" transient="false"
	 * @generated
	 */
	AnalysisDoc getDoc();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.AnalysisElement#getDoc <em>Doc</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' container reference.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(AnalysisDoc value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.analysis.AnalysisElementKey#getDocs <em>Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(AnalysisElementKey)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisElement_Key()
	 * @see com.misc.common.moplaf.analysis.AnalysisElementKey#getDocs
	 * @model opposite="Docs" required="true"
	 * @generated
	 */
	AnalysisElementKey getKey();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.AnalysisElement#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(AnalysisElementKey value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(EObject)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisElement_Element()
	 * @model required="true"
	 * @generated
	 */
	EObject getElement();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.AnalysisElement#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(CategoryAbstract)
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#getAnalysisElement_Category()
	 * @model required="true"
	 * @generated
	 */
	CategoryAbstract getCategory();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.analysis.AnalysisElement#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CategoryAbstract value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isInCategory(CategoryAbstract category);

} // AnalysisElement
