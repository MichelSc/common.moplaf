/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.ExtractorIntersection;
import com.misc.common.moplaf.datatools.util.ObjectSet;

import org.eclipse.emf.ecore.EClass;

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
	protected ObjectSet extractImpl(ObjectSet ins, int max_elements) {
		ObjectSet outs = null;
		boolean complete = ins.isComplete();
		for( Extractor extractor: this.getExtractors()) {
			ObjectSet extracted = extractor.extract(ins, max_elements);
			if ( outs==null ) {
				outs = extracted; 
			} else {
				outs.retainAll(extracted);
			}
			complete = complete && extracted.isComplete();
		}
		outs.setComplete(complete);
		return outs;
	}


} //ExtractorIntersectionImpl
