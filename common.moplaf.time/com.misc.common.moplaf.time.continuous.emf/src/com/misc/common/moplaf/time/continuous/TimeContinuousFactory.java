/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.time.continuous;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage
 * @generated
 */
public interface TimeContinuousFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimeContinuousFactory eINSTANCE = com.misc.common.moplaf.time.continuous.impl.TimeContinuousFactoryImpl.init();

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
	 * Returns a new object of class '<em>Amount Delta Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amount Delta Atomic</em>'.
	 * @generated
	 */
	AmountDeltaAtomic createAmountDeltaAtomic();

	/**
	 * Returns a new object of class '<em>Slope Delta Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slope Delta Atomic</em>'.
	 * @generated
	 */
	SlopeDeltaAtomic createSlopeDeltaAtomic();

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
	 * Returns a new object of class '<em>Slope Delta Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slope Delta Provider</em>'.
	 * @generated
	 */
	SlopeDeltaProvider createSlopeDeltaProvider();

	/**
	 * Returns a new object of class '<em>Slope Absolute Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slope Absolute Provider</em>'.
	 * @generated
	 */
	SlopeAbsoluteProvider createSlopeAbsoluteProvider();

	/**
	 * Returns a new object of class '<em>Amount Delta Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amount Delta Provider</em>'.
	 * @generated
	 */
	AmountDeltaProvider createAmountDeltaProvider();

	/**
	 * Returns a new object of class '<em>Amount Absolute Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amount Absolute Provider</em>'.
	 * @generated
	 */
	AmountAbsoluteProvider createAmountAbsoluteProvider();

	/**
	 * Returns a new object of class '<em>Propagator Function Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propagator Function Distribution</em>'.
	 * @generated
	 */
	PropagatorFunctionDistribution createPropagatorFunctionDistribution();

	/**
	 * Returns a new object of class '<em>Propagator Function Distribution Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propagator Function Distribution Event</em>'.
	 * @generated
	 */
	PropagatorFunctionDistributionEvent createPropagatorFunctionDistributionEvent();

	/**
	 * Returns a new object of class '<em>Propagator Function Events Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propagator Function Events Provider</em>'.
	 * @generated
	 */
	PropagatorFunctionEventsProvider createPropagatorFunctionEventsProvider();

	/**
	 * Returns a new object of class '<em>Propagator Function Distribution Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propagator Function Distribution Abstract</em>'.
	 * @generated
	 */
	PropagatorFunctionDistributionAbstract createPropagatorFunctionDistributionAbstract();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimeContinuousPackage getTimeContinuousPackage();

} //TimeContinuousFactory
