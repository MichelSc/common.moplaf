/**
 */
package com.misc.common.moplaf.time.continuous.tests;

import com.misc.common.moplaf.time.continuous.ContinuousFactory;
import com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Slope Absolute Provider</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlopeAbsoluteProviderTest extends EventProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SlopeAbsoluteProviderTest.class);
	}

	/**
	 * Constructs a new Slope Absolute Provider test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlopeAbsoluteProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Slope Absolute Provider test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SlopeAbsoluteProvider getFixture() {
		return (SlopeAbsoluteProvider)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContinuousFactory.eINSTANCE.createSlopeAbsoluteProvider());
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

} //SlopeAbsoluteProviderTest
