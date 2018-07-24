/**
 */
package com.misc.common.moplaf.datatools;

import com.misc.common.moplaf.datatools.util.ObjectSet;
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
	 * <!-- begin-model-doc -->
	 * Implement some extraction logic.
	 * Return the set of extracted objects.
	 * The input set is possibly consumed by the extraction logic. So its state after extraction may have changed.
	 * <!-- end-model-doc -->
	 * @model dataType="com.misc.common.moplaf.datatools.EObjectsSet" insDataType="com.misc.common.moplaf.datatools.EObjectsSet"
	 * @generated
	 */
	ObjectSet extract(ObjectSet ins, int max_elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model docRequired="true"
	 * @generated
	 */
	boolean isValidRoot(EObject doc);

} // Extractor
