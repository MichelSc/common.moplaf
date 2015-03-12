/**
 */
package com.misc.common.moplaf.dataextractor.tests;

import com.misc.common.moplaf.dataextractor.DataSelectorDate;
import com.misc.common.moplaf.dataextractor.DataextractorFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Selector Date</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSelectorDateTest extends DataSelectorFeatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataSelectorDateTest.class);
	}

	/**
	 * Constructs a new Data Selector Date test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSelectorDateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Selector Date test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataSelectorDate getFixture() {
		return (DataSelectorDate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataextractorFactory.eINSTANCE.createDataSelectorDate());
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

} //DataSelectorDateTest
