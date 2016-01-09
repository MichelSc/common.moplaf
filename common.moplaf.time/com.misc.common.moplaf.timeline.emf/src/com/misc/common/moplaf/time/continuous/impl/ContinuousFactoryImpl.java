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
public class ContinuousFactoryImpl extends EFactoryImpl implements ContinuousFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContinuousFactory init() {
		try {
			ContinuousFactory theContinuousFactory = (ContinuousFactory)EPackage.Registry.INSTANCE.getEFactory(ContinuousPackage.eNS_URI);
			if (theContinuousFactory != null) {
				return theContinuousFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContinuousFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousFactoryImpl() {
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
			case ContinuousPackage.DISTRIBUTION: return createDistribution();
			case ContinuousPackage.CHILD_EVENT: return createChildEvent();
			case ContinuousPackage.START_EVENT: return createStartEvent();
			case ContinuousPackage.END_EVENT: return createEndEvent();
			case ContinuousPackage.CAPACITY_CHANGE_START: return createCapacityChangeStart();
			case ContinuousPackage.CAPACITY_CHANGE_END: return createCapacityChangeEnd();
			case ContinuousPackage.STOCK_CHANGE_START: return createStockChangeStart();
			case ContinuousPackage.STOCK_CHANGE_END: return createStockChangeEnd();
			case ContinuousPackage.AMOUNT_IMPULSION_ATOMIC: return createAmountImpulsionAtomic();
			case ContinuousPackage.SLOPE_IMPULSION_ATOMIC: return createSlopeImpulsionAtomic();
			case ContinuousPackage.AMOUNT_ABSOLUTE_ATOMIC: return createAmountAbsoluteAtomic();
			case ContinuousPackage.SLOPE_ABSOLUTE_ATOMIC: return createSlopeAbsoluteAtomic();
			case ContinuousPackage.STOCK_CHANGE: return createStockChange();
			case ContinuousPackage.CAPACITY_CHANGE: return createCapacityChange();
			case ContinuousPackage.SLOPE_IMPULSION_PROVIDER: return createSlopeImpulsionProvider();
			case ContinuousPackage.SLOPE_ABSOLUTE_PROVIDER: return createSlopeAbsoluteProvider();
			case ContinuousPackage.AMOUNT_IMPULSION_PROVIDER: return createAmountImpulsionProvider();
			case ContinuousPackage.AMOUNT_ABSOLUTE_PROVIDER: return createAmountAbsoluteProvider();
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
			case ContinuousPackage.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
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
			case ContinuousPackage.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
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
	public SlopeAbsoluteProvider createSlopeAbsoluteProvider() {
		SlopeAbsoluteProviderImpl slopeAbsoluteProvider = new SlopeAbsoluteProviderImpl();
		return slopeAbsoluteProvider;
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
	public ContinuousPackage getContinuousPackage() {
		return (ContinuousPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContinuousPackage getPackage() {
		return ContinuousPackage.eINSTANCE;
	}

} //ContinuousFactoryImpl
