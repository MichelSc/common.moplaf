/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.ExtractorUnion;
import com.misc.common.moplaf.datatools.util.ObjectSet;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extractor Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExtractorUnionImpl extends ExtractorLogicImpl implements ExtractorUnion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorUnionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.EXTRACTOR_UNION;
	}

	/**
	 * 
	 */
	@Override
	public String getDescription() {
		String description = "union";
		return description;
	}


	/**
	 * 
	 */
	@Override
	protected ObjectSet extractImpl(ObjectSet ins, int max_elements) {
		ObjectSet outs = new ObjectSet();
		boolean complete = ins.isComplete();
		for( Extractor extractor: this.getExtractors()) {
			ObjectSet out_this_extractor = extractor.extract(ins, max_elements); 
			outs.addAll(out_this_extractor);
			complete = complete && out_this_extractor.isComplete();
		}
		
		outs.setComplete(complete);
		return outs;
	}

} //ExtractorUnionImpl
