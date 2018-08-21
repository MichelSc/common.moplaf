/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.ExtractorPipe;
import com.misc.common.moplaf.datatools.util.ObjectSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extractor Pipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExtractorPipeImpl extends ExtractorCompoundImpl implements ExtractorPipe {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorPipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.EXTRACTOR_PIPE;
	}
	
	@Override
	protected String getTypeDescription() {
		return "Extractor pipe";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isValidRoot(EObject doc) {
		if ( this.getExtractors().size()==0 ) {
			return false;
		}
		Extractor first_extractor = this.getExtractors().get(0);
		return first_extractor.isValidRoot(doc);
	}

	/**
	 * 
	 */
	@Override
	public EClass basicGetExtractedType() {
		if ( this.getExtractors().size()==0 ) {
			return null;
		}
		Extractor last_extractor = this.getExtractors().get(this.getExtractors().size()-1);
		return last_extractor.getExtractedType();
	}



	@Override
	protected ObjectSet extractImpl(ObjectSet ins, int max_elements) {
		for( Extractor extractor: this.getExtractors()) {
			ins = extractor.extract(ins, max_elements);
		}
		return ins;
	}

} //ExtractorPipeImpl
