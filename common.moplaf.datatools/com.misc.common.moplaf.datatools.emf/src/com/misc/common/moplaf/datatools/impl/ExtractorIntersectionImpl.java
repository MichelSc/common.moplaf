/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.ExtractorIntersection;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extractor Intersection</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExtractorIntersectionImpl extends ExtractorLogicImpl implements ExtractorIntersection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorIntersectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.EXTRACTOR_INTERSECTION;
	}
	
	/**
	 * 
	 */
	@Override
	public String getDescription() {
		String description = "intersection";
		return description;
	}


	/**
	 * 
	 */
	@Override
	protected Set<EObject> extractImpl(Set<EObject> ins) {
		Set<EObject> outs = null;
		for( Extractor extractor: this.getExtractors()) {
			Set<EObject> extracted = extractor.extract(ins);
			if ( outs==null ) {
				outs = extracted; 
			} else {
				outs.retainAll(extracted);
			}
		}
		return outs;
	}


} //ExtractorIntersectionImpl
