/**
 */
package com.misc.common.moplaf.time.continuous.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>continuous</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContinuousTests extends TestSuite {

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
		TestSuite suite = new ContinuousTests("continuous Tests");
		suite.addTestSuite(DistributionTest.class);
		suite.addTestSuite(ChildEventTest.class);
		suite.addTestSuite(StartEventTest.class);
		suite.addTestSuite(EndEventTest.class);
		suite.addTestSuite(CapacityChangeStartTest.class);
		suite.addTestSuite(CapacityChangeEndTest.class);
		suite.addTestSuite(StockChangeStartTest.class);
		suite.addTestSuite(StockChangeEndTest.class);
		suite.addTestSuite(AmountImpulsionAtomicTest.class);
		suite.addTestSuite(SlopeImpulsionAtomicTest.class);
		suite.addTestSuite(AmountAbsoluteAtomicTest.class);
		suite.addTestSuite(SlopeAbsoluteAtomicTest.class);
		suite.addTestSuite(StockChangeTest.class);
		suite.addTestSuite(CapacityChangeTest.class);
		suite.addTestSuite(SlopeImpulsionProviderTest.class);
		suite.addTestSuite(SlopeAbsoluteProviderTest.class);
		suite.addTestSuite(AmountImpulsionProviderTest.class);
		suite.addTestSuite(AmountAbsoluteProviderTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousTests(String name) {
		super(name);
	}

} //ContinuousTests
