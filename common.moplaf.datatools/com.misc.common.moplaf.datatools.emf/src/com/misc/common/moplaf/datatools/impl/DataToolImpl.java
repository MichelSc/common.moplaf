/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.common.Plugin;
import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataToolContext;
import com.misc.common.moplaf.datatools.DatatoolsPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DataToolImpl extends DataToolAbstractImpl implements DataTool {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.DATA_TOOL;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DataTool clone() {
		DataTool datatool = (DataTool)EcoreUtil.copy(this);
		return datatool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DataToolContext basicGetContext() {
		EObject container = this.eContainer();
		if ( container instanceof DataToolContext ) {
			return (DataToolContext)container;
		} 
		Plugin.INSTANCE.logWarning(String.format("The container of a %s must be a DataToolContext", this.eClass().getName()));
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DatatoolsPackage.DATA_TOOL___CLONE:
				return clone();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataToolImpl
