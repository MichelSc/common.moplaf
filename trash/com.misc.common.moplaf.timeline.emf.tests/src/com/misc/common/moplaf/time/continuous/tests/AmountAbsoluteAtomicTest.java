/**
 */
package com.misc.common.moplaf.time.continuous.tests;

import com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic;
import com.misc.common.moplaf.time.continuous.ContinuousFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Amount Absolute Atomic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmountAbsoluteAtomicTest extends AmountAbsoluteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AmountAbsoluteAtomicTest.class);
	}

	/**
	 * Constructs a new Amount Absolute Atomic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountAbsoluteAtomicTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Amount Absolute Atomic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AmountAbsoluteAtomic getFixture() {
		return (AmountAbsoluteAtomic)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContinuousFactory.eINSTANCE.createAmountAbsoluteAtomic());
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

} //AmountAbsoluteAtomicTest
