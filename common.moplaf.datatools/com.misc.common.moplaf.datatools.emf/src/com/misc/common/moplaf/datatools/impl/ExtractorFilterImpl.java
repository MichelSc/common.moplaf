/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.ExtractorFilter;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extractor Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExtractorFilterImpl extends ExtractorImpl implements ExtractorFilter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.EXTRACTOR_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean satisfiesFilter(EObject object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DatatoolsPackage.EXTRACTOR_FILTER___SATISFIES_FILTER__EOBJECT:
				return satisfiesFilter((EObject)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * Specified by Extractor
	 */
	@Override
	protected Set<EObject> extractImpl(Set<EObject> ins) {
		Set<EObject> outs = new HashSet<EObject>();
		for ( EObject in : ins) {
			if ( this.satisfiesFilter(in)) {
				outs.add(in);
			}
		}
		return outs;
	}
} //ExtractorFilterImpl
