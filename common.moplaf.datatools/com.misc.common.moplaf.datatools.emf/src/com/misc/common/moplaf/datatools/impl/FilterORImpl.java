/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Filter;
import com.misc.common.moplaf.datatools.FilterOR;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extractor Filter OR</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FilterORImpl extends FilterCompoundImpl implements FilterOR {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterORImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.FILTER_OR;
	}
	
	@Override
	protected String getTypeDescription() {
		return "Filter or";
	}


	@Override
	public boolean satisfiesFilter(EObject object) {
		for ( Filter filter: this.getFilters()) {
			if ( filter.satisfiesFilter(object)) {
				return true;
			}
		}
		return false;
	}
} //ExtractorFilterORImpl
