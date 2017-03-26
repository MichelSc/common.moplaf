/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.time.continuous.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeContinuousFactoryImpl extends EFactoryImpl implements TimeContinuousFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeContinuousFactory init() {
		try {
			TimeContinuousFactory theTimeContinuousFactory = (TimeContinuousFactory)EPackage.Registry.INSTANCE.getEFactory(TimeContinuousPackage.eNS_URI);
			if (theTimeContinuousFactory != null) {
				return theTimeContinuousFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimeContinuousFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeContinuousFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TimeContinuousPackage.DISTRIBUTION: return createDistribution();
			case TimeContinuousPackage.CHILD_EVENT: return createChildEvent();
			case TimeContinuousPackage.START_EVENT: return createStartEvent();
			case TimeContinuousPackage.END_EVENT: return createEndEvent();
			case TimeContinuousPackage.CAPACITY_CHANGE_START: return createCapacityChangeStart();
			case TimeContinuousPackage.CAPACITY_CHANGE_END: return createCapacityChangeEnd();
			case TimeContinuousPackage.STOCK_CHANGE_START: return createStockChangeStart();
			case TimeContinuousPackage.STOCK_CHANGE_END: return createStockChangeEnd();
			case TimeContinuousPackage.AMOUNT_IMPULSION_ATOMIC: return createAmountImpulsionAtomic();
			case TimeContinuousPackage.SLOPE_IMPULSION_ATOMIC: return createSlopeImpulsionAtomic();
			case TimeContinuousPackage.AMOUNT_ABSOLUTE_ATOMIC: return createAmountAbsoluteAtomic();
			case TimeContinuousPackage.SLOPE_ABSOLUTE_ATOMIC: return createSlopeAbsoluteAtomic();
			case TimeContinuousPackage.STOCK_CHANGE: return createStockChange();
			case TimeContinuousPackage.CAPACITY_CHANGE: return createCapacityChange();
			case TimeContinuousPackage.SLOPE_IMPULSION_PROVIDER: return createSlopeImpulsionProvider();
			case TimeContinuousPackage.SLOPE_ABSOLUTE_PROVIDER: return createSlopeAbsoluteProvider();
			case TimeContinuousPackage.AMOUNT_IMPULSION_PROVIDER: return createAmountImpulsionProvider();
			case TimeContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER: return createAmountAbsoluteProvider();
			case TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION: return createPropagatorFunctionDistribution();
			case TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT: return createPropagatorFunctionDistributionEvent();
			case TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER: return createPropagatorFunctionEventsProvider();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TimeContinuousPackage.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			case TimeContinuousPackage.DISTRIBUTION_VISITOR:
				return createDistributionVisitorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TimeContinuousPackage.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			case TimeContinuousPackage.DISTRIBUTION_VISITOR:
				return convertDistributionVisitorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution createDistribution() {
		DistributionImpl distribution = new DistributionImpl();
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildEvent createChildEvent() {
		ChildEventImpl childEvent = new ChildEventImpl();
		return childEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapacityChangeStart createCapacityChangeStart() {
		CapacityChangeStartImpl capacityChangeStart = new CapacityChangeStartImpl();
		return capacityChangeStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapacityChangeEnd createCapacityChangeEnd() {
		CapacityChangeEndImpl capacityChangeEnd = new CapacityChangeEndImpl();
		return capacityChangeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockChangeStart createStockChangeStart() {
		StockChangeStartImpl stockChangeStart = new StockChangeStartImpl();
		return stockChangeStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockChangeEnd createStockChangeEnd() {
		StockChangeEndImpl stockChangeEnd = new StockChangeEndImpl();
		return stockChangeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountImpulsionAtomic createAmountImpulsionAtomic() {
		AmountImpulsionAtomicImpl amountImpulsionAtomic = new AmountImpulsionAtomicImpl();
		return amountImpulsionAtomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlopeImpulsionAtomic createSlopeImpulsionAtomic() {
		SlopeImpulsionAtomicImpl slopeImpulsionAtomic = new SlopeImpulsionAtomicImpl();
		return slopeImpulsionAtomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountAbsoluteAtomic createAmountAbsoluteAtomic() {
		AmountAbsoluteAtomicImpl amountAbsoluteAtomic = new AmountAbsoluteAtomicImpl();
		return amountAbsoluteAtomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlopeAbsoluteAtomic createSlopeAbsoluteAtomic() {
		SlopeAbsoluteAtomicImpl slopeAbsoluteAtomic = new SlopeAbsoluteAtomicImpl();
		return slopeAbsoluteAtomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockChange createStockChange() {
		StockChangeImpl stockChange = new StockChangeImpl();
		return stockChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapacityChange createCapacityChange() {
		CapacityChangeImpl capacityChange = new CapacityChangeImpl();
		return capacityChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlopeImpulsionProvider createSlopeImpulsionProvider() {
		SlopeImpulsionProviderImpl slopeImpulsionProvider = new SlopeImpulsionProviderImpl();
		return slopeImpulsionProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlopeAbsoluteProvider createSlopeAbsoluteProvider() {
		SlopeAbsoluteProviderImpl slopeAbsoluteProvider = new SlopeAbsoluteProviderImpl();
		return slopeAbsoluteProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountImpulsionProvider createAmountImpulsionProvider() {
		AmountImpulsionProviderImpl amountImpulsionProvider = new AmountImpulsionProviderImpl();
		return amountImpulsionProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountAbsoluteProvider createAmountAbsoluteProvider() {
		AmountAbsoluteProviderImpl amountAbsoluteProvider = new AmountAbsoluteProviderImpl();
		return amountAbsoluteProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorFunctionDistribution createPropagatorFunctionDistribution() {
		PropagatorFunctionDistributionImpl propagatorFunctionDistribution = new PropagatorFunctionDistributionImpl();
		return propagatorFunctionDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorFunctionDistributionEvent createPropagatorFunctionDistributionEvent() {
		PropagatorFunctionDistributionEventImpl propagatorFunctionDistributionEvent = new PropagatorFunctionDistributionEventImpl();
		return propagatorFunctionDistributionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorFunctionEventsProvider createPropagatorFunctionEventsProvider() {
		PropagatorFunctionEventsProviderImpl propagatorFunctionEventsProvider = new PropagatorFunctionEventsProviderImpl();
		return propagatorFunctionEventsProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionVisitor createDistributionVisitorFromString(EDataType eDataType, String initialValue) {
		return (DistributionVisitor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistributionVisitorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeContinuousPackage getTimeContinuousPackage() {
		return (TimeContinuousPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimeContinuousPackage getPackage() {
		return TimeContinuousPackage.eINSTANCE;
	}

} //TimeContinuousFactoryImpl
