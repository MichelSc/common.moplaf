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
package com.misc.common.moplaf.dbsynch.dbsynchjtds;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.dbsynch.dbsynchjtds.DbsynchjtdsPackage
 * @generated
 */
public interface DbsynchjtdsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DbsynchjtdsFactory eINSTANCE = com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DbsynchjtdsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Source Jdbc Jtds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Source Jdbc Jtds</em>'.
	 * @generated
	 */
	DataSourceJdbcJtds createDataSourceJdbcJtds();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DbsynchjtdsPackage getDbsynchjtdsPackage();

} //DbsynchjtdsFactory
