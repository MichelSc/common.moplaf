/**
 */
package com.misc.common.moplaf.solver.tests;

import com.misc.common.moplaf.solver.SolutionLpVar;
import com.misc.common.moplaf.solver.SolverFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Solution Lp Var</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolutionLpVarTest extends SolutionVarTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SolutionLpVarTest.class);
	}

	/**
	 * Constructs a new Solution Lp Var test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionLpVarTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Solution Lp Var test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SolutionLpVar getFixture() {
		return (SolutionLpVar)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SolverFactory.eINSTANCE.createSolutionLpVar());
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

} //SolutionLpVarTest
