/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Filter;
import com.misc.common.moplaf.datatools.FilterAND;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extractor Filter AND</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FilterANDImpl extends FilterCompoundImpl implements FilterAND {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterANDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.FILTER_AND;
	}
	
	@Override
	public boolean satisfiesFilter(EObject object) {
		for ( Filter filter: this.getFilters()) {
			if ( !filter.satisfiesFilter(object)) {
				return false;
			}
		}
		return true;
	}


} //ExtractorFilterANDImpl
