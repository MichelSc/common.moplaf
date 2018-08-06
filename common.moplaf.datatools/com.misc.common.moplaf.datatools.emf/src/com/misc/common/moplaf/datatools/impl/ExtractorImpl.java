/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DataToolType;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;

import com.misc.common.moplaf.datatools.util.ObjectSet;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
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
	public ObjectSet extract(ObjectSet ins, int max_elements) {
		ObjectSet ins2 = this.extractImplInit(ins, max_elements);
		ObjectSet outs = this.extractImpl(ins2, max_elements);
		ObjectSet outs2 = this.extractImplFinal(outs, max_elements);
		return outs2;
	}
	
	protected ObjectSet extractImplInit(ObjectSet ins, int max_elements) {
		return ins;
	}
	
	protected ObjectSet extractImpl(ObjectSet ins, int max_elements) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	protected ObjectSet extractImplFinal(ObjectSet outs, int max_elements) {
		int too_many = outs.size()-max_elements;
		if ( too_many>0 ) {
			outs.setComplete(false);
			Iterator<EObject> iterator = outs.iterator();
			while ( too_many>0 && iterator.hasNext()) {
				iterator.next();
				iterator.remove();
				too_many--;
			}
		}
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
			case DatatoolsPackage.EXTRACTOR___EXTRACT__OBJECTSET_INT:
				return extract((ObjectSet)arguments.get(0), (Integer)arguments.get(1));
			case DatatoolsPackage.EXTRACTOR___IS_VALID_ROOT__EOBJECT:
				return isValidRoot((EObject)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * 
	 */
	@Override
	public DataToolType getType() {
		return DataToolType.EXTRACTOR;
	}
	
	

} //ExtractorImpl
