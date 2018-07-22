/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;

import java.lang.reflect.InvocationTargetException;
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
	public Set<EObject> extract(Set<EObject> ins) {
		Set<EObject> ins2 = this.extractImplInit(ins);
		Set<EObject> outs = this.extractImpl(ins2);
		Set<EObject> outs2 = this.extractImplFinal(outs);
		return outs2;
	}
	
	protected Set<EObject> extractImplInit(Set<EObject> ins) {
		return ins;
	}
	
	protected Set<EObject> extractImpl(Set<EObject> ins) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	protected Set<EObject> extractImplFinal(Set<EObject> outs) {
		return outs;
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
			case DatatoolsPackage.EXTRACTOR___EXTRACT__SET:
				return extract((Set<EObject>)arguments.get(0));
			case DatatoolsPackage.EXTRACTOR___IS_VALID_ROOT__EOBJECT:
				return isValidRoot((EObject)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExtractorImpl
