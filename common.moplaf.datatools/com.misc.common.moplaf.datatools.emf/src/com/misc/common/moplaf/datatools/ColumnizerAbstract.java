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
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerAbstract()
 * @model abstract="true"
 * @generated
 */
public interface ColumnizerAbstract extends DataTool {

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
