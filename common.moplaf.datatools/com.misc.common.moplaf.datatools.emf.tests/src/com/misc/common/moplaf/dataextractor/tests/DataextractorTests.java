/**
 */
package com.misc.common.moplaf.dataextractor.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>dataextractor</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataextractorTests extends TestSuite {

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
		TestSuite suite = new DataextractorTests("dataextractor Tests");
		suite.addTestSuite(DataExtractorTest.class);
		suite.addTestSuite(DataSorterFeatureTest.class);
		suite.addTestSuite(DataExtractorReferenceTest.class);
		suite.addTestSuite(DataSelectorBigDecimalTest.class);
		suite.addTestSuite(DataSelectorDateTest.class);
		suite.addTestSuite(DataSelectorStringTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataextractorTests(String name) {
		super(name);
	}

} //DataextractorTests
