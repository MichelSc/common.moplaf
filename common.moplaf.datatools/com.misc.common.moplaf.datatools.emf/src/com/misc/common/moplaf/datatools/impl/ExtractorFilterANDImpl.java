/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.ExtractorFilter;
import com.misc.common.moplaf.datatools.ExtractorFilterAND;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extractor Filter AND</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExtractorFilterANDImpl extends ExtractorFilterCompoundImpl implements ExtractorFilterAND {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorFilterANDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.EXTRACTOR_FILTER_AND;
	}
	
	@Override
	public boolean satisfiesFilter(EObject object) {
		for ( ExtractorFilter filter: this.getFilters()) {
			if ( !filter.satisfiesFilter(object)) {
				return false;
			}
		}
		return true;
	}


} //ExtractorFilterANDImpl
