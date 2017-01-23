/**
 */
package com.misc.common.moplaf.solver.tests;

import com.misc.common.moplaf.solver.SolutionLpCons;
import com.misc.common.moplaf.solver.SolverFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Solution Lp Cons</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolutionLpConsTest extends SolutionConsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SolutionLpConsTest.class);
	}

	/**
	 * Constructs a new Solution Lp Cons test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionLpConsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Solution Lp Cons test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SolutionLpCons getFixture() {
		return (SolutionLpCons)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SolverFactory.eINSTANCE.createSolutionLpCons());
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

} //SolutionLpConsTest