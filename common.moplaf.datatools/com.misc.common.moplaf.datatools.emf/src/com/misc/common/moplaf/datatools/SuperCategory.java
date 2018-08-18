/**
 */
package com.misc.common.moplaf.datatools;

import com.misc.common.moplaf.datatools.util.ObjectSet;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Category</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getSuperCategory()
 * @model
 * @generated
 */
public interface SuperCategory extends CategoryAbstract {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model insDataType="com.misc.common.moplaf.datatools.EObjectsSet" categorizersMany="true"
	 * @generated
	 */
	void refreshCats(ObjectSet ins, EList<Categorizer> categorizers);

} // SuperCategory
