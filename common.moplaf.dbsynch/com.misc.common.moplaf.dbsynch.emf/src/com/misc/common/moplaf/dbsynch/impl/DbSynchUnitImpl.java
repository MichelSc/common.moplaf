/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.dbsynch.impl;

import com.misc.common.moplaf.dbsynch.DataSource;
import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.DbSynchUnit;
import com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.DbSynchUnitImpl#getParentUnit <em>Parent Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DbSynchUnitImpl extends DbSynchUnitAbstractImpl implements DbSynchUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbSynchUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbSynchPackage.Literals.DB_SYNCH_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbSynchUnitAbstract getParentUnit() {
		DbSynchUnitAbstract parentUnit = basicGetParentUnit();
		return parentUnit != null && parentUnit.eIsProxy() ? (DbSynchUnitAbstract)eResolveProxy((InternalEObject)parentUnit) : parentUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DbSynchUnitAbstract basicGetParentUnit() {
		if ( !(this.eContainer() instanceof DbSynchUnitAbstract) ){
			throw new RuntimeException("DbSynchUnit.getParentUnit: the owner must be a DbSynchUnitAbstract: either a DbSynchUnit or a DataSource");
		}
		return (DbSynchUnitAbstract)this.eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getParamValue(EAttribute attribute) {
		Object returnValue = super.getParamValue(attribute);
		if ( returnValue != null ){ return returnValue; }
		DbSynchUnitAbstract parentUnit = this.getParentUnit();
		return parentUnit.getParamValue(attribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DataSource basicGetDataSource() {
		return this.getParentUnit().getDataSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refresh() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public EList<Object> getParamAttributes() {
		EList<Object> attributesThisType = super.getParamAttributes();
		DbSynchUnitAbstract parent = this.getParentUnit();
		if ( parent==null) {
			return attributesThisType;
		}
		EList<Object> attributes = parent.getParamAttributes();
		attributes.addAll(attributesThisType);
		return attributes;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbSynchPackage.DB_SYNCH_UNIT__PARENT_UNIT:
				if (resolve) return getParentUnit();
				return basicGetParentUnit();
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
			case DbSynchPackage.DB_SYNCH_UNIT__PARENT_UNIT:
				return basicGetParentUnit() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DbSynchPackage.DB_SYNCH_UNIT___REFRESH:
				refresh();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DbSynchUnitImpl
