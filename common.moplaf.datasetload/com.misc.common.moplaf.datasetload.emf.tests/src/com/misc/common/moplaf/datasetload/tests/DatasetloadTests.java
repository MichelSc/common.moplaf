/**
 */
package com.misc.common.moplaf.datasetload.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>datasetload</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetloadTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DatasetloadTests("datasetload Tests");
		suite.addTestSuite(DataSourceJdbcTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetloadTests(String name) {
		super(name);
	}

} //DatasetloadTests
