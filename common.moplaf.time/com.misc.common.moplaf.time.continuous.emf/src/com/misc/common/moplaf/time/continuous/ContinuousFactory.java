/**
 */
package com.misc.common.moplaf.time.continuous;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage
 * @generated
 */
public interface ContinuousFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContinuousFactory eINSTANCE = com.misc.common.moplaf.time.continuous.impl.ContinuousFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distribution</em>'.
	 * @generated
	 */
	Distribution createDistribution();

	/**
	 * Returns a new object of class '<em>Child Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Event</em>'.
	 * @generated
	 */
	ChildEvent createChildEvent();

	/**
	 * Returns a new object of class '<em>Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Event</em>'.
	 * @generated
	 */
	StartEvent createStartEvent();

	/**
	 * Returns a new object of class '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Event</em>'.
	 * @generated
	 */
	EndEvent createEndEvent();

	/**
	 * Returns a new object of class '<em>Capacity Change Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capacity Change Start</em>'.
	 * @generated
	 */
	CapacityChangeStart createCapacityChangeStart();

	/**
	 * Returns a new object of class '<em>Capacity Change End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capacity Change End</em>'.
	 * @generated
	 */
	CapacityChangeEnd createCapacityChangeEnd();

	/**
	 * Returns a new object of class '<em>Stock Change Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stock Change Start</em>'.
	 * @generated
	 */
	StockChangeStart createStockChangeStart();

	/**
	 * Returns a new object of class '<em>Stock Change End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stock Change End</em>'.
	 * @generated
	 */
	StockChangeEnd createStockChangeEnd();

	/**
	 * Returns a new object of class '<em>Amount Impulsion Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amount Impulsion Atomic</em>'.
	 * @generated
	 */
	AmountImpulsionAtomic createAmountImpulsionAtomic();

	/**
	 * Returns a new object of class '<em>Slope Impulsion Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slope Impulsion Atomic</em>'.
	 * @generated
	 */
	SlopeImpulsionAtomic createSlopeImpulsionAtomic();

	/**
	 * Returns a new object of class '<em>Amount Absolute Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amount Absolute Atomic</em>'.
	 * @generated
	 */
	AmountAbsoluteAtomic createAmountAbsoluteAtomic();

	/**
	 * Returns a new object of class '<em>Slope Absolute Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slope Absolute Atomic</em>'.
	 * @generated
	 */
	SlopeAbsoluteAtomic createSlopeAbsoluteAtomic();

	/**
	 * Returns a new object of class '<em>Stock Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stock Change</em>'.
	 * @generated
	 */
	StockChange createStockChange();

	/**
	 * Returns a new object of class '<em>Capacity Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capacity Change</em>'.
	 * @generated
	 */
	CapacityChange createCapacityChange();

	/**
	 * Returns a new object of class '<em>Slope Impulsion Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slope Impulsion Provider</em>'.
	 * @generated
	 */
	SlopeImpulsionProvider createSlopeImpulsionProvider();

	/**
	 * Returns a new object of class '<em>Slope Absolute Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slope Absolute Provider</em>'.
	 * @generated
	 */
	SlopeAbsoluteProvider createSlopeAbsoluteProvider();

	/**
	 * Returns a new object of class '<em>Amount Impulsion Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amount Impulsion Provider</em>'.
	 * @generated
	 */
	AmountImpulsionProvider createAmountImpulsionProvider();

	/**
	 * Returns a new object of class '<em>Amount Absolute Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amount Absolute Provider</em>'.
	 * @generated
	 */
	AmountAbsoluteProvider createAmountAbsoluteProvider();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContinuousPackage getContinuousPackage();

} //ContinuousFactory
