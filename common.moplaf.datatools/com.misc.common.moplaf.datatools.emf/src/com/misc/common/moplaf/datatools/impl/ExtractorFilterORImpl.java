/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.ExtractorFilter;
import com.misc.common.moplaf.datatools.ExtractorFilterOR;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extractor Filter OR</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExtractorFilterORImpl extends ExtractorFilterCompoundImpl implements ExtractorFilterOR {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorFilterORImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.EXTRACTOR_FILTER_OR;
	}

	@Override
	public boolean satisfiesFilter(EObject object) {
		for ( ExtractorFilter filter: this.getFilters()) {
			if ( filter.satisfiesFilter(object)) {
				return true;
			}
		}
		return false;
	}
} //ExtractorFilterORImpl
