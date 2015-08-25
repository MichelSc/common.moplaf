/**
 */
package com.misc.common.moplaf.solver.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>solver</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverTests extends TestSuite {

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
		TestSuite suite = new SolverTests("solver Tests");
		suite.addTestSuite(GeneratorLpVarTest.class);
		suite.addTestSuite(GeneratorLpConsTest.class);
		suite.addTestSuite(GeneratorFeatureModeTest.class);
		suite.addTestSuite(GeneratorConstraintEnablerTest.class);
		suite.addTestSuite(GeneratorVarOverflowTest.class);
		suite.addTestSuite(SolutionReaderPatternTest.class);
		suite.addTestSuite(SolutionTest.class);
		suite.addTestSuite(SolutionVarTest.class);
		suite.addTestSuite(SolutionLpVarTest.class);
		suite.addTestSuite(GeneratorCpLinearTest.class);
		suite.addTestSuite(GeneratorCpLogicalTest.class);
		suite.addTestSuite(GeneratorCpVarAtomicTest.class);
		suite.addTestSuite(SolutionCpVarTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverTests(String name) {
		super(name);
	}

} //SolverTests
