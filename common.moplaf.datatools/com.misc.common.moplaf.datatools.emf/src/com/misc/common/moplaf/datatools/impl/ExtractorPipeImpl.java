/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.ExtractorPipe;
import java.util.Set;

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
	
	/**
	 * 
	 */
	@Override
	public String getDescription() {
		String description = "pipe";
		return description;
	}

	@Override
	protected Set<EObject> extractImpl(Set<EObject> ins) {
		for( Extractor extractor: this.getExtractors()) {
			ins = extractor.extract(ins);
		}
		return ins;
	}

} //ExtractorPipeImpl
