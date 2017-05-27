/**
 */
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.RunParams;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RunParamsImpl extends MinimalEObjectImpl.Container implements RunParams {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.RUN_PARAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void copyParams(RunParams other) {
		for ( EAttribute attribute : this.eClass().getEAllAttributes()){
			if ( attribute.isChangeable() && !attribute.isDerived() ){
				if ( attribute.getEContainingClass().isSuperTypeOf(other.eClass()) ){
					this.eSet(attribute, other.eGet(attribute));
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public RunParams clone() {
		RunParams newRunParams = (RunParams) EcoreUtil.copy(this);
		return newRunParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JobPackage.RUN_PARAMS___COPY_PARAMS__RUNPARAMS:
				copyParams((RunParams)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RunParamsImpl
