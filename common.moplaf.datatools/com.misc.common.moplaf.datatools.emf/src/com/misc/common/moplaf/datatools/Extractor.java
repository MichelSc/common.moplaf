/**
 */
package com.misc.common.moplaf.datatools;

import java.util.Set;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extractor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.Extractor#isPartial <em>Partial</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.Extractor#getMaxNbSelected <em>Max Nb Selected</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getExtractor()
 * @model abstract="true"
 * @generated
 */
public interface Extractor extends DataTool {
	/**
	 * Returns the value of the '<em><b>Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial</em>' attribute.
	 * @see #setPartial(boolean)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getExtractor_Partial()
	 * @model
	 * @generated
	 */
	boolean isPartial();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.Extractor#isPartial <em>Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial</em>' attribute.
	 * @see #isPartial()
	 * @generated
	 */
	void setPartial(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Nb Selected</b></em>' attribute.
	 * The default value is <code>"1000000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Nb Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Nb Selected</em>' attribute.
	 * @see #setMaxNbSelected(int)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getExtractor_MaxNbSelected()
	 * @model default="1000000"
	 * @generated
	 */
	int getMaxNbSelected();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.Extractor#getMaxNbSelected <em>Max Nb Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Nb Selected</em>' attribute.
	 * @see #getMaxNbSelected()
	 * @generated
	 */
	void setMaxNbSelected(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.datatools.EObjectsSet" insDataType="com.misc.common.moplaf.datatools.EObjectsSet"
	 * @generated
	 */
	Set<EObject> extract(Set<EObject> ins);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model docRequired="true"
	 * @generated
	 */
	boolean isValidRoot(EObject doc);

} // Extractor
