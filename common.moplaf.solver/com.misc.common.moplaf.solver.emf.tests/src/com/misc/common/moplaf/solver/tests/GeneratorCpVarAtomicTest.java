/**
 */
package com.misc.common.moplaf.solver.tests;

import com.misc.common.moplaf.solver.GeneratorCpVarAtomic;
import com.misc.common.moplaf.solver.SolverFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generator Cp Var Atomic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorCpVarAtomicTest extends GeneratorCpVarTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GeneratorCpVarAtomicTest.class);
	}

	/**
	 * Constructs a new Generator Cp Var Atomic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorCpVarAtomicTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Generator Cp Var Atomic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GeneratorCpVarAtomic getFixture() {
		return (GeneratorCpVarAtomic)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SolverFactory.eINSTANCE.createGeneratorCpVarAtomic());
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

} //GeneratorCpVarAtomicTest
