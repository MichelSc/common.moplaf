/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.common.Plugin;
import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataTools;
import com.misc.common.moplaf.datatools.DatatoolsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.DataToolImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataToolImpl extends MinimalEObjectImpl.Container implements DataTool {
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
	 * @generated
	 */
	public DataTools getContext() {
		DataTools context = basicGetContext();
		return context != null && context.eIsProxy() ? (DataTools)eResolveProxy((InternalEObject)context) : context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DataTools basicGetContext() {
		InternalEObject container = this.eContainer;
		if ( container instanceof DataTools ) {
			return (DataTools)container;
		} else if ( container instanceof DataTool ) {
			DataTool container_as_datatool = (DataTool) container;
			return container_as_datatool.getContext();
		}
		Plugin.INSTANCE.logWarning(String.format("The container of a %s must be a DataTools or a DataTool", this.eClass().getName()));
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatoolsPackage.DATA_TOOL__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatatoolsPackage.DATA_TOOL__CONTEXT:
				return basicGetContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //DataToolImpl
