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
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getExtractor()
 * @model abstract="true"
 * @generated
 */
public interface Extractor extends DataTool {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model insDataType="com.misc.common.moplaf.datatools.EObjectsSet" outsDataType="com.misc.common.moplaf.datatools.EObjectsSet"
	 * @generated
	 */
	boolean extract(Set<EObject> ins, Set<EObject> outs, int max_elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model docRequired="true"
	 * @generated
	 */
	boolean isValidRoot(EObject doc);

} // Extractor
