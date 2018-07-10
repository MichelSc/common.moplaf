/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
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
public abstract class ExtractorImpl extends DataToolAbstractImpl implements Extractor {
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
	public EList<EObject> extract(EList<EObject> ins) {
		HashSet<EObject> ins_set = new HashSet<EObject>(ins);
		Set<EObject> outs_set = this.extractImpl(ins_set);
		BasicEList<EObject> list = new BasicEList<EObject>(outs_set);
		return list;
	}

	/**
	 * 
	 * @param in
	 * @param outs
	 */
	protected  Set<EObject> extractImpl(Set<EObject> ins) {
		return new HashSet<EObject>();
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
			case DatatoolsPackage.EXTRACTOR___EXTRACT__ELIST:
				return extract((EList<EObject>)arguments.get(0));
			case DatatoolsPackage.EXTRACTOR___IS_VALID_ROOT__EOBJECT:
				return isValidRoot((EObject)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExtractorImpl
