/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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
package com.misc.common.moplaf.dbsynch.dbsynchora.impl;

import com.misc.common.moplaf.dbsynch.dbsynchora.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbsynchoraFactoryImpl extends EFactoryImpl implements DbsynchoraFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DbsynchoraFactory init() {
		try {
			DbsynchoraFactory theDbsynchoraFactory = (DbsynchoraFactory)EPackage.Registry.INSTANCE.getEFactory(DbsynchoraPackage.eNS_URI);
			if (theDbsynchoraFactory != null) {
				return theDbsynchoraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DbsynchoraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbsynchoraFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DbsynchoraPackage.DATA_SOURCE_JDBC_ORA_THIN: return createDataSourceJdbcOraThin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceJdbcOraThin createDataSourceJdbcOraThin() {
		DataSourceJdbcOraThinImpl dataSourceJdbcOraThin = new DataSourceJdbcOraThinImpl();
		return dataSourceJdbcOraThin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbsynchoraPackage getDbsynchoraPackage() {
		return (DbsynchoraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DbsynchoraPackage getPackage() {
		return DbsynchoraPackage.eINSTANCE;
	}

} //DbsynchoraFactoryImpl
