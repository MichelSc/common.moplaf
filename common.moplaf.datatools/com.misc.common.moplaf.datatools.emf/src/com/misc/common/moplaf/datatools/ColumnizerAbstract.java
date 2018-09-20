/**
 */
package com.misc.common.moplaf.datatools;

import com.misc.common.moplaf.common.IPropertiesProvider;
import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columnizer Abstract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.ColumnizerAbstract#getSheetLabel <em>Sheet Label</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerAbstract()
 * @model abstract="true"
 * @generated
 */
public interface ColumnizerAbstract extends DataTool {

	/**
	 * Returns the value of the '<em><b>Sheet Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Label</em>' attribute.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerAbstract_SheetLabel()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSheetLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model typeRequired="true"
	 * @generated
	 */
	boolean isValidElementType(EClass type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="com.misc.common.moplaf.datatools.IPropertiesProvider"
	 * @generated
	 */
	IPropertiesProvider getPropertiesProvider();
} // ColumnizerAbstract
