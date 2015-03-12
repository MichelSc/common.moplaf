/**
 */
package com.misc.common.moplaf.solver.tests;

import com.misc.common.moplaf.solver.GeneratorCpLinear;
import com.misc.common.moplaf.solver.SolverFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generator Cp Linear</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorCpLinearTest extends GeneratorCpConsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GeneratorCpLinearTest.class);
	}

	/**
	 * Constructs a new Generator Cp Linear test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorCpLinearTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Generator Cp Linear test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GeneratorCpLinear getFixture() {
		return (GeneratorCpLinear)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SolverFactory.eINSTANCE.createGeneratorCpLinear());
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

} //GeneratorCpLinearTest
