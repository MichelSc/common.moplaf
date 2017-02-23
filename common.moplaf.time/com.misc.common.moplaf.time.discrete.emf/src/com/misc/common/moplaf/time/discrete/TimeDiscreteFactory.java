/**
 */
package com.misc.common.moplaf.time.discrete;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.time.discrete.TimeDiscretePackage
 * @generated
 */
public interface TimeDiscreteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimeDiscreteFactory eINSTANCE = com.misc.common.moplaf.time.discrete.impl.TimeDiscreteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Time Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Bucket</em>'.
	 * @generated
	 */
	TimeBucket createTimeBucket();

	/**
	 * Returns a new object of class '<em>Time Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Line</em>'.
	 * @generated
	 */
	TimeLine createTimeLine();

	/**
	 * Returns a new object of class '<em>Time Line Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Line Merge</em>'.
	 * @generated
	 */
	TimeLineMerge createTimeLineMerge();

	/**
	 * Returns a new object of class '<em>Merge Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Element</em>'.
	 * @generated
	 */
	MergeElement createMergeElement();

	/**
	 * Returns a new object of class '<em>Object With Time Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object With Time Line</em>'.
	 * @generated
	 */
	ObjectWithTimeLine createObjectWithTimeLine();

	/**
	 * Returns a new object of class '<em>Object Time Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Time Bucket</em>'.
	 * @generated
	 */
	ObjectTimeBucket createObjectTimeBucket();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimeDiscretePackage getTimeDiscretePackage();

} //DiscreteFactory
