/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.ExtractorUnion;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
	public Set<EObject> extract(Set<EObject> ins) {
		HashSet<EObject> outs = new HashSet<EObject>();
		for( Extractor extractor: this.getExtractors()) {
			outs.addAll(extractor.extract(ins));
		}
		return outs;
	}

} //ExtractorUnionImpl
