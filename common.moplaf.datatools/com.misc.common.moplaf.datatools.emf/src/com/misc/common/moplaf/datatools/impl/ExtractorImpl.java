/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extractor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExtractorImpl extends DataToolImpl implements Extractor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.EXTRACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean extract(Set<EObject> ins, Set<EObject> outs, int max_elements) {
		Set<EObject> ins2 = this.extractImplInit(ins);
		outs.clear();
		boolean complete = this.extractImpl(ins2, outs, max_elements);
		complete = this.extractImplFinal(outs, max_elements) && complete;
		return complete;
	}
	
	protected Set<EObject> extractImplInit(Set<EObject> ins) {
		return ins;
	}
	
	protected boolean extractImpl(Set<EObject> ins, Set<EObject> outs, int max_elements) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	protected boolean extractImplFinal(Set<EObject> outs, int max_elements) {
		int too_many = outs.size()-max_elements;
		if ( too_many<=0 ) {
			return true;
		}
		Iterator<EObject> iterator = outs.iterator();
		while ( too_many>0 && iterator.hasNext()) {
			iterator.next();
			iterator.remove();
			too_many--;
		}
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValidRoot(EObject doc) {
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DatatoolsPackage.EXTRACTOR___EXTRACT__SET_SET_INT:
				return extract((Set<EObject>)arguments.get(0), (Set<EObject>)arguments.get(1), (Integer)arguments.get(2));
			case DatatoolsPackage.EXTRACTOR___IS_VALID_ROOT__EOBJECT:
				return isValidRoot((EObject)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExtractorImpl
