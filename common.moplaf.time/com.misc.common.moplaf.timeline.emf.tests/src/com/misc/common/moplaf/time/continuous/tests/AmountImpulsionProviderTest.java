/**
 */
package com.misc.common.moplaf.time.continuous.tests;

import com.misc.common.moplaf.time.continuous.AmountImpulsionProvider;
import com.misc.common.moplaf.time.continuous.ContinuousFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Amount Impulsion Provider</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmountImpulsionProviderTest extends EventProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AmountImpulsionProviderTest.class);
	}

	/**
	 * Constructs a new Amount Impulsion Provider test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountImpulsionProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Amount Impulsion Provider test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AmountImpulsionProvider getFixture() {
		return (AmountImpulsionProvider)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContinuousFactory.eINSTANCE.createAmountImpulsionProvider());
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

} //AmountImpulsionProviderTest
