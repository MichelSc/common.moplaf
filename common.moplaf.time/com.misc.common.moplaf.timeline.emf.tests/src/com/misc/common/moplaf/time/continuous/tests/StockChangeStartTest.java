/**
 */
package com.misc.common.moplaf.time.continuous.tests;

import com.misc.common.moplaf.time.continuous.ContinuousFactory;
import com.misc.common.moplaf.time.continuous.StockChangeStart;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stock Change Start</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StockChangeStartTest extends SlopeImpulsionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StockChangeStartTest.class);
	}

	/**
	 * Constructs a new Stock Change Start test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockChangeStartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stock Change Start test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StockChangeStart getFixture() {
		return (StockChangeStart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContinuousFactory.eINSTANCE.createStockChangeStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StockChangeStartTest
