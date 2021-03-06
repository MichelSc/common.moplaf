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
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.propagator2.PropagatorPackage;

import com.misc.common.moplaf.time.continuous.AmountAbsolute;
import com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic;
import com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider;
import com.misc.common.moplaf.time.continuous.AmountDelta;
import com.misc.common.moplaf.time.continuous.AmountDeltaAtomic;
import com.misc.common.moplaf.time.continuous.AmountDeltaProvider;
import com.misc.common.moplaf.time.continuous.CapacityChange;
import com.misc.common.moplaf.time.continuous.CapacityChangeEnd;
import com.misc.common.moplaf.time.continuous.CapacityChangeStart;
import com.misc.common.moplaf.time.continuous.ChildEvent;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.DistributionVisitor;
import com.misc.common.moplaf.time.continuous.EndEvent;
import com.misc.common.moplaf.time.continuous.EventProvider;
import com.misc.common.moplaf.time.continuous.EventsProvider;
import com.misc.common.moplaf.time.continuous.EventsProviderAbstract;
import com.misc.common.moplaf.time.continuous.OwnedEvent;
import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;
import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionAbstract;
import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionEvent;
import com.misc.common.moplaf.time.continuous.PropagatorFunctionEventsProvider;
import com.misc.common.moplaf.time.continuous.ProvidedEvent;
import com.misc.common.moplaf.time.continuous.SlopeAbsolute;
import com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic;
import com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider;
import com.misc.common.moplaf.time.continuous.SlopeDelta;
import com.misc.common.moplaf.time.continuous.SlopeDeltaAtomic;
import com.misc.common.moplaf.time.continuous.SlopeDeltaProvider;
import com.misc.common.moplaf.time.continuous.StartEvent;
import com.misc.common.moplaf.time.continuous.StockChange;
import com.misc.common.moplaf.time.continuous.StockChangeEnd;
import com.misc.common.moplaf.time.continuous.StockChangeStart;
import com.misc.common.moplaf.time.continuous.TimeContinuousFactory;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.TimeUnit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeContinuousPackageImpl extends EPackageImpl implements TimeContinuousPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountDeltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slopeDeltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountAbsoluteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slopeAbsoluteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capacityChangeStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capacityChangeEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockChangeStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockChangeEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountDeltaAtomicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slopeDeltaAtomicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountAbsoluteAtomicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slopeAbsoluteAtomicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventsProviderAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventsProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capacityChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slopeDeltaProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slopeAbsoluteProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountDeltaProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountAbsoluteProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorFunctionDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorFunctionDistributionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorFunctionEventsProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorFunctionDistributionAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType distributionVisitorEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimeContinuousPackageImpl() {
		super(eNS_URI, TimeContinuousFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TimeContinuousPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimeContinuousPackage init() {
		if (isInited) return (TimeContinuousPackage)EPackage.Registry.INSTANCE.getEPackage(TimeContinuousPackage.eNS_URI);

		// Obtain or create and register package
		TimeContinuousPackageImpl theTimeContinuousPackage = (TimeContinuousPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TimeContinuousPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TimeContinuousPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PropagatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTimeContinuousPackage.createPackageContents();

		// Initialize created meta-data
		theTimeContinuousPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimeContinuousPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimeContinuousPackage.eNS_URI, theTimeContinuousPackage);
		return theTimeContinuousPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistribution() {
		return distributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_Name() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_TimeUnit() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_HorizonStart() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_HorizonEnd() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_ChildEvents() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_SequenceEvents() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_Start() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_End() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_EventsProviders() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_ParentDistribution() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_ChildDistribution() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_ProvidedEvents() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetDuration__Date_Date() {
		return distributionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetMoment__Date_double() {
		return distributionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetEventBefore__Date() {
		return distributionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetEventStrictBefore__Date() {
		return distributionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetEventAfter__Date() {
		return distributionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetEventStrictAfter__Date() {
		return distributionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetAmountBefore__Date() {
		return distributionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetAmountAfter__Date() {
		return distributionEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetAmount__Date() {
		return distributionEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetSlopeBefore__Date() {
		return distributionEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetSlopeAfter__Date() {
		return distributionEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetMinAmount__Date_Date() {
		return distributionEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetMaxAmount__Date_Date() {
		return distributionEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetAverageAmount__Date_Date() {
		return distributionEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetCumulatedAmount__Date_Date() {
		return distributionEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetEarliestBelow__Date_double_double() {
		return distributionEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetLatestBelow__Date_double_double() {
		return distributionEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetEarliestAbove__Date_double_double() {
		return distributionEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetLatestAbove__Date_double_double() {
		return distributionEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetEarliestOutputPossible__double_Date_double_double() {
		return distributionEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__RefreshInit() {
		return distributionEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__RefreshSequence() {
		return distributionEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__RefreshChildEvent() {
		return distributionEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__RefreshProvidedEvents() {
		return distributionEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__Accept__Date_Date_DistributionVisitor() {
		return distributionEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__Refresh() {
		return distributionEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistributionEvent() {
		return distributionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistributionEvent_Moment() {
		return (EAttribute)distributionEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistributionEvent_EventNr() {
		return (EAttribute)distributionEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionEvent_Next() {
		return (EReference)distributionEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionEvent_Previous() {
		return (EReference)distributionEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistributionEvent_AmountBefore() {
		return (EAttribute)distributionEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistributionEvent_AmountAfter() {
		return (EAttribute)distributionEventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistributionEvent_SlopeBefore() {
		return (EAttribute)distributionEventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistributionEvent_SlopeAfter() {
		return (EAttribute)distributionEventEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistributionEvent_Description() {
		return (EAttribute)distributionEventEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionEvent_DistributionAsSequence() {
		return (EReference)distributionEventEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionEvent_Distribution() {
		return (EReference)distributionEventEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionEvent_DistributionAsProvidedEvent() {
		return (EReference)distributionEventEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistributionEvent_SegmentAfter() {
		return (EAttribute)distributionEventEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistributionEvent_SegmentBefore() {
		return (EAttribute)distributionEventEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistributionEvent__GetAmountBefore__Date() {
		return distributionEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistributionEvent__GetAmountAfter__Date() {
		return distributionEventEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistributionEvent__IsBefore__DistributionEvent() {
		return distributionEventEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistributionEvent__IsStrictBefore__DistributionEvent() {
		return distributionEventEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistributionEvent__RefreshSlopeBefore() {
		return distributionEventEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistributionEvent__RefreshAmountBefore() {
		return distributionEventEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistributionEvent__RefreshAmountAfter() {
		return distributionEventEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistributionEvent__RefreshSlopeAfter() {
		return distributionEventEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistributionEvent__RefreshMoment() {
		return distributionEventEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildEvent() {
		return childEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildEvent_Original() {
		return (EReference)childEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartEvent() {
		return startEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartEvent_AmountAtStart() {
		return (EAttribute)startEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartEvent_SlopeAtStart() {
		return (EAttribute)startEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEvent() {
		return endEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmountDelta() {
		return amountDeltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmountDelta_AmountDelta() {
		return (EAttribute)amountDeltaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAmountDelta__RefreshAmountDelta() {
		return amountDeltaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlopeDelta() {
		return slopeDeltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlopeDelta_SlopeDelta() {
		return (EAttribute)slopeDeltaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSlopeDelta__RefreshSlopeDelta() {
		return slopeDeltaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmountAbsolute() {
		return amountAbsoluteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmountAbsolute_AmountAbsolute() {
		return (EAttribute)amountAbsoluteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAmountAbsolute__RefreshAmountAbsolute() {
		return amountAbsoluteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlopeAbsolute() {
		return slopeAbsoluteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlopeAbsolute_SlopeAbsolute() {
		return (EAttribute)slopeAbsoluteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSlopeAbsolute__RefreshSlopeAbsolute() {
		return slopeAbsoluteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapacityChangeStart() {
		return capacityChangeStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapacityChangeStart_Provider() {
		return (EReference)capacityChangeStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapacityChangeEnd() {
		return capacityChangeEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapacityChangeEnd_Provider() {
		return (EReference)capacityChangeEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStockChangeStart() {
		return stockChangeStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockChangeStart_Provider() {
		return (EReference)stockChangeStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStockChangeEnd() {
		return stockChangeEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockChangeEnd_Provider() {
		return (EReference)stockChangeEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmountDeltaAtomic() {
		return amountDeltaAtomicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmountDeltaAtomic_Provider() {
		return (EReference)amountDeltaAtomicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlopeDeltaAtomic() {
		return slopeDeltaAtomicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlopeDeltaAtomic_Provider() {
		return (EReference)slopeDeltaAtomicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmountAbsoluteAtomic() {
		return amountAbsoluteAtomicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmountAbsoluteAtomic_Provider() {
		return (EReference)amountAbsoluteAtomicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlopeAbsoluteAtomic() {
		return slopeAbsoluteAtomicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlopeAbsoluteAtomic_Provider() {
		return (EReference)slopeAbsoluteAtomicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventsProviderAbstract() {
		return eventsProviderAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventsProviderAbstract_Distribution() {
		return (EReference)eventsProviderAbstractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventsProviderAbstract__RefreshEvents() {
		return eventsProviderAbstractEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventsProvider() {
		return eventsProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventsProvider_ProvidedEvents() {
		return (EReference)eventsProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStockChange() {
		return stockChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockChange_Start() {
		return (EAttribute)stockChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockChange_End() {
		return (EAttribute)stockChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockChange_Slope() {
		return (EAttribute)stockChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockChange_StartEvent() {
		return (EReference)stockChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockChange_EndEvent() {
		return (EReference)stockChangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapacityChange() {
		return capacityChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacityChange_Start() {
		return (EAttribute)capacityChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacityChange_End() {
		return (EAttribute)capacityChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacityChange_Amount() {
		return (EAttribute)capacityChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapacityChange_StartEvent() {
		return (EReference)capacityChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapacityChange_EndEvent() {
		return (EReference)capacityChangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventProvider() {
		return eventProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventProvider_ProvidedEvent() {
		return (EReference)eventProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventProvider_Moment() {
		return (EAttribute)eventProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlopeDeltaProvider() {
		return slopeDeltaProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlopeDeltaProvider_Event() {
		return (EReference)slopeDeltaProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlopeDeltaProvider_SlopeDelta() {
		return (EAttribute)slopeDeltaProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlopeAbsoluteProvider() {
		return slopeAbsoluteProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlopeAbsoluteProvider_Event() {
		return (EReference)slopeAbsoluteProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlopeAbsoluteProvider_SlopeAbsolute() {
		return (EAttribute)slopeAbsoluteProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmountDeltaProvider() {
		return amountDeltaProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmountDeltaProvider_Event() {
		return (EReference)amountDeltaProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmountDeltaProvider_AmountDelta() {
		return (EAttribute)amountDeltaProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmountAbsoluteProvider() {
		return amountAbsoluteProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmountAbsoluteProvider_Event() {
		return (EReference)amountAbsoluteProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmountAbsoluteProvider_AmountAbsolute() {
		return (EAttribute)amountAbsoluteProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwnedEvent() {
		return ownedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedEvent() {
		return providedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedEvent_EventProvider() {
		return (EReference)providedEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorFunctionDistribution() {
		return propagatorFunctionDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorFunctionDistribution_Distribution() {
		return (EReference)propagatorFunctionDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorFunctionDistributionEvent() {
		return propagatorFunctionDistributionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorFunctionDistributionEvent_DistributionEvent() {
		return (EReference)propagatorFunctionDistributionEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorFunctionEventsProvider() {
		return propagatorFunctionEventsProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropagatorFunctionEventsProvider_EventsProvider() {
		return (EReference)propagatorFunctionEventsProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorFunctionDistributionAbstract() {
		return propagatorFunctionDistributionAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnit() {
		return timeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDistributionVisitor() {
		return distributionVisitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeContinuousFactory getTimeContinuousFactory() {
		return (TimeContinuousFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		distributionEClass = createEClass(DISTRIBUTION);
		createEAttribute(distributionEClass, DISTRIBUTION__NAME);
		createEAttribute(distributionEClass, DISTRIBUTION__TIME_UNIT);
		createEAttribute(distributionEClass, DISTRIBUTION__HORIZON_START);
		createEAttribute(distributionEClass, DISTRIBUTION__HORIZON_END);
		createEReference(distributionEClass, DISTRIBUTION__CHILD_EVENTS);
		createEReference(distributionEClass, DISTRIBUTION__SEQUENCE_EVENTS);
		createEReference(distributionEClass, DISTRIBUTION__START);
		createEReference(distributionEClass, DISTRIBUTION__END);
		createEReference(distributionEClass, DISTRIBUTION__EVENTS_PROVIDERS);
		createEReference(distributionEClass, DISTRIBUTION__PARENT_DISTRIBUTION);
		createEReference(distributionEClass, DISTRIBUTION__CHILD_DISTRIBUTION);
		createEReference(distributionEClass, DISTRIBUTION__PROVIDED_EVENTS);
		createEOperation(distributionEClass, DISTRIBUTION___GET_DURATION__DATE_DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_MOMENT__DATE_DOUBLE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_EVENT_BEFORE__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_EVENT_STRICT_BEFORE__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_EVENT_AFTER__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_EVENT_STRICT_AFTER__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_AMOUNT_BEFORE__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_AMOUNT_AFTER__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_AMOUNT__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_SLOPE_BEFORE__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_SLOPE_AFTER__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_MIN_AMOUNT__DATE_DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_MAX_AMOUNT__DATE_DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_AVERAGE_AMOUNT__DATE_DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_CUMULATED_AMOUNT__DATE_DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_EARLIEST_BELOW__DATE_DOUBLE_DOUBLE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_LATEST_BELOW__DATE_DOUBLE_DOUBLE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_EARLIEST_ABOVE__DATE_DOUBLE_DOUBLE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_LATEST_ABOVE__DATE_DOUBLE_DOUBLE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_EARLIEST_OUTPUT_POSSIBLE__DOUBLE_DATE_DOUBLE_DOUBLE);
		createEOperation(distributionEClass, DISTRIBUTION___REFRESH_INIT);
		createEOperation(distributionEClass, DISTRIBUTION___REFRESH_SEQUENCE);
		createEOperation(distributionEClass, DISTRIBUTION___REFRESH_CHILD_EVENT);
		createEOperation(distributionEClass, DISTRIBUTION___REFRESH_PROVIDED_EVENTS);
		createEOperation(distributionEClass, DISTRIBUTION___ACCEPT__DATE_DATE_DISTRIBUTIONVISITOR);
		createEOperation(distributionEClass, DISTRIBUTION___REFRESH);

		distributionEventEClass = createEClass(DISTRIBUTION_EVENT);
		createEAttribute(distributionEventEClass, DISTRIBUTION_EVENT__MOMENT);
		createEAttribute(distributionEventEClass, DISTRIBUTION_EVENT__EVENT_NR);
		createEReference(distributionEventEClass, DISTRIBUTION_EVENT__NEXT);
		createEReference(distributionEventEClass, DISTRIBUTION_EVENT__PREVIOUS);
		createEAttribute(distributionEventEClass, DISTRIBUTION_EVENT__AMOUNT_BEFORE);
		createEAttribute(distributionEventEClass, DISTRIBUTION_EVENT__AMOUNT_AFTER);
		createEAttribute(distributionEventEClass, DISTRIBUTION_EVENT__SLOPE_BEFORE);
		createEAttribute(distributionEventEClass, DISTRIBUTION_EVENT__SLOPE_AFTER);
		createEAttribute(distributionEventEClass, DISTRIBUTION_EVENT__DESCRIPTION);
		createEReference(distributionEventEClass, DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE);
		createEReference(distributionEventEClass, DISTRIBUTION_EVENT__DISTRIBUTION);
		createEReference(distributionEventEClass, DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT);
		createEAttribute(distributionEventEClass, DISTRIBUTION_EVENT__SEGMENT_AFTER);
		createEAttribute(distributionEventEClass, DISTRIBUTION_EVENT__SEGMENT_BEFORE);
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___GET_AMOUNT_BEFORE__DATE);
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___GET_AMOUNT_AFTER__DATE);
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___IS_BEFORE__DISTRIBUTIONEVENT);
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___IS_STRICT_BEFORE__DISTRIBUTIONEVENT);
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE);
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE);
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER);
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER);
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___REFRESH_MOMENT);

		childEventEClass = createEClass(CHILD_EVENT);
		createEReference(childEventEClass, CHILD_EVENT__ORIGINAL);

		startEventEClass = createEClass(START_EVENT);
		createEAttribute(startEventEClass, START_EVENT__AMOUNT_AT_START);
		createEAttribute(startEventEClass, START_EVENT__SLOPE_AT_START);

		endEventEClass = createEClass(END_EVENT);

		amountDeltaEClass = createEClass(AMOUNT_DELTA);
		createEAttribute(amountDeltaEClass, AMOUNT_DELTA__AMOUNT_DELTA);
		createEOperation(amountDeltaEClass, AMOUNT_DELTA___REFRESH_AMOUNT_DELTA);

		slopeDeltaEClass = createEClass(SLOPE_DELTA);
		createEAttribute(slopeDeltaEClass, SLOPE_DELTA__SLOPE_DELTA);
		createEOperation(slopeDeltaEClass, SLOPE_DELTA___REFRESH_SLOPE_DELTA);

		amountAbsoluteEClass = createEClass(AMOUNT_ABSOLUTE);
		createEAttribute(amountAbsoluteEClass, AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE);
		createEOperation(amountAbsoluteEClass, AMOUNT_ABSOLUTE___REFRESH_AMOUNT_ABSOLUTE);

		slopeAbsoluteEClass = createEClass(SLOPE_ABSOLUTE);
		createEAttribute(slopeAbsoluteEClass, SLOPE_ABSOLUTE__SLOPE_ABSOLUTE);
		createEOperation(slopeAbsoluteEClass, SLOPE_ABSOLUTE___REFRESH_SLOPE_ABSOLUTE);

		capacityChangeStartEClass = createEClass(CAPACITY_CHANGE_START);
		createEReference(capacityChangeStartEClass, CAPACITY_CHANGE_START__PROVIDER);

		capacityChangeEndEClass = createEClass(CAPACITY_CHANGE_END);
		createEReference(capacityChangeEndEClass, CAPACITY_CHANGE_END__PROVIDER);

		stockChangeStartEClass = createEClass(STOCK_CHANGE_START);
		createEReference(stockChangeStartEClass, STOCK_CHANGE_START__PROVIDER);

		stockChangeEndEClass = createEClass(STOCK_CHANGE_END);
		createEReference(stockChangeEndEClass, STOCK_CHANGE_END__PROVIDER);

		amountDeltaAtomicEClass = createEClass(AMOUNT_DELTA_ATOMIC);
		createEReference(amountDeltaAtomicEClass, AMOUNT_DELTA_ATOMIC__PROVIDER);

		slopeDeltaAtomicEClass = createEClass(SLOPE_DELTA_ATOMIC);
		createEReference(slopeDeltaAtomicEClass, SLOPE_DELTA_ATOMIC__PROVIDER);

		amountAbsoluteAtomicEClass = createEClass(AMOUNT_ABSOLUTE_ATOMIC);
		createEReference(amountAbsoluteAtomicEClass, AMOUNT_ABSOLUTE_ATOMIC__PROVIDER);

		slopeAbsoluteAtomicEClass = createEClass(SLOPE_ABSOLUTE_ATOMIC);
		createEReference(slopeAbsoluteAtomicEClass, SLOPE_ABSOLUTE_ATOMIC__PROVIDER);

		eventsProviderAbstractEClass = createEClass(EVENTS_PROVIDER_ABSTRACT);
		createEReference(eventsProviderAbstractEClass, EVENTS_PROVIDER_ABSTRACT__DISTRIBUTION);
		createEOperation(eventsProviderAbstractEClass, EVENTS_PROVIDER_ABSTRACT___REFRESH_EVENTS);

		eventsProviderEClass = createEClass(EVENTS_PROVIDER);
		createEReference(eventsProviderEClass, EVENTS_PROVIDER__PROVIDED_EVENTS);

		stockChangeEClass = createEClass(STOCK_CHANGE);
		createEAttribute(stockChangeEClass, STOCK_CHANGE__START);
		createEAttribute(stockChangeEClass, STOCK_CHANGE__END);
		createEAttribute(stockChangeEClass, STOCK_CHANGE__SLOPE);
		createEReference(stockChangeEClass, STOCK_CHANGE__START_EVENT);
		createEReference(stockChangeEClass, STOCK_CHANGE__END_EVENT);

		capacityChangeEClass = createEClass(CAPACITY_CHANGE);
		createEAttribute(capacityChangeEClass, CAPACITY_CHANGE__START);
		createEAttribute(capacityChangeEClass, CAPACITY_CHANGE__END);
		createEAttribute(capacityChangeEClass, CAPACITY_CHANGE__AMOUNT);
		createEReference(capacityChangeEClass, CAPACITY_CHANGE__START_EVENT);
		createEReference(capacityChangeEClass, CAPACITY_CHANGE__END_EVENT);

		eventProviderEClass = createEClass(EVENT_PROVIDER);
		createEReference(eventProviderEClass, EVENT_PROVIDER__PROVIDED_EVENT);
		createEAttribute(eventProviderEClass, EVENT_PROVIDER__MOMENT);

		slopeDeltaProviderEClass = createEClass(SLOPE_DELTA_PROVIDER);
		createEReference(slopeDeltaProviderEClass, SLOPE_DELTA_PROVIDER__EVENT);
		createEAttribute(slopeDeltaProviderEClass, SLOPE_DELTA_PROVIDER__SLOPE_DELTA);

		slopeAbsoluteProviderEClass = createEClass(SLOPE_ABSOLUTE_PROVIDER);
		createEReference(slopeAbsoluteProviderEClass, SLOPE_ABSOLUTE_PROVIDER__EVENT);
		createEAttribute(slopeAbsoluteProviderEClass, SLOPE_ABSOLUTE_PROVIDER__SLOPE_ABSOLUTE);

		amountDeltaProviderEClass = createEClass(AMOUNT_DELTA_PROVIDER);
		createEReference(amountDeltaProviderEClass, AMOUNT_DELTA_PROVIDER__EVENT);
		createEAttribute(amountDeltaProviderEClass, AMOUNT_DELTA_PROVIDER__AMOUNT_DELTA);

		amountAbsoluteProviderEClass = createEClass(AMOUNT_ABSOLUTE_PROVIDER);
		createEReference(amountAbsoluteProviderEClass, AMOUNT_ABSOLUTE_PROVIDER__EVENT);
		createEAttribute(amountAbsoluteProviderEClass, AMOUNT_ABSOLUTE_PROVIDER__AMOUNT_ABSOLUTE);

		ownedEventEClass = createEClass(OWNED_EVENT);

		providedEventEClass = createEClass(PROVIDED_EVENT);
		createEReference(providedEventEClass, PROVIDED_EVENT__EVENT_PROVIDER);

		propagatorFunctionDistributionEClass = createEClass(PROPAGATOR_FUNCTION_DISTRIBUTION);
		createEReference(propagatorFunctionDistributionEClass, PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION);

		propagatorFunctionDistributionEventEClass = createEClass(PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT);
		createEReference(propagatorFunctionDistributionEventEClass, PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DISTRIBUTION_EVENT);

		propagatorFunctionEventsProviderEClass = createEClass(PROPAGATOR_FUNCTION_EVENTS_PROVIDER);
		createEReference(propagatorFunctionEventsProviderEClass, PROPAGATOR_FUNCTION_EVENTS_PROVIDER__EVENTS_PROVIDER);

		propagatorFunctionDistributionAbstractEClass = createEClass(PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT);

		// Create enums
		timeUnitEEnum = createEEnum(TIME_UNIT);

		// Create data types
		distributionVisitorEDataType = createEDataType(DISTRIBUTION_VISITOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PropagatorPackage thePropagatorPackage = (PropagatorPackage)EPackage.Registry.INSTANCE.getEPackage(PropagatorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		distributionEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctions());
		distributionEventEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctions());
		childEventEClass.getESuperTypes().add(this.getOwnedEvent());
		startEventEClass.getESuperTypes().add(this.getOwnedEvent());
		endEventEClass.getESuperTypes().add(this.getOwnedEvent());
		amountDeltaEClass.getESuperTypes().add(this.getProvidedEvent());
		slopeDeltaEClass.getESuperTypes().add(this.getProvidedEvent());
		amountAbsoluteEClass.getESuperTypes().add(this.getProvidedEvent());
		slopeAbsoluteEClass.getESuperTypes().add(this.getProvidedEvent());
		capacityChangeStartEClass.getESuperTypes().add(this.getAmountDelta());
		capacityChangeEndEClass.getESuperTypes().add(this.getAmountDelta());
		stockChangeStartEClass.getESuperTypes().add(this.getSlopeDelta());
		stockChangeEndEClass.getESuperTypes().add(this.getSlopeDelta());
		amountDeltaAtomicEClass.getESuperTypes().add(this.getAmountDelta());
		slopeDeltaAtomicEClass.getESuperTypes().add(this.getSlopeDelta());
		amountAbsoluteAtomicEClass.getESuperTypes().add(this.getAmountAbsolute());
		slopeAbsoluteAtomicEClass.getESuperTypes().add(this.getSlopeAbsolute());
		eventsProviderAbstractEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctions());
		eventsProviderEClass.getESuperTypes().add(this.getEventsProviderAbstract());
		stockChangeEClass.getESuperTypes().add(this.getEventsProvider());
		capacityChangeEClass.getESuperTypes().add(this.getEventsProvider());
		eventProviderEClass.getESuperTypes().add(this.getEventsProviderAbstract());
		slopeDeltaProviderEClass.getESuperTypes().add(this.getEventProvider());
		slopeAbsoluteProviderEClass.getESuperTypes().add(this.getEventProvider());
		amountDeltaProviderEClass.getESuperTypes().add(this.getEventProvider());
		amountAbsoluteProviderEClass.getESuperTypes().add(this.getEventProvider());
		ownedEventEClass.getESuperTypes().add(this.getDistributionEvent());
		providedEventEClass.getESuperTypes().add(this.getDistributionEvent());
		propagatorFunctionDistributionEClass.getESuperTypes().add(this.getPropagatorFunctionDistributionAbstract());
		propagatorFunctionDistributionEventEClass.getESuperTypes().add(this.getPropagatorFunctionDistributionAbstract());
		propagatorFunctionEventsProviderEClass.getESuperTypes().add(this.getPropagatorFunctionDistributionAbstract());
		propagatorFunctionDistributionAbstractEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());

		// Initialize classes, features, and operations; add parameters
		initEClass(distributionEClass, Distribution.class, "Distribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistribution_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_TimeUnit(), this.getTimeUnit(), "TimeUnit", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_HorizonStart(), ecorePackage.getEDate(), "HorizonStart", "2000-01-01", 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_HorizonEnd(), ecorePackage.getEDate(), "HorizonEnd", "2099-12-31", 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_ChildEvents(), this.getChildEvent(), null, "ChildEvents", null, 0, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_SequenceEvents(), this.getDistributionEvent(), this.getDistributionEvent_DistributionAsSequence(), "SequenceEvents", null, 0, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_Start(), this.getStartEvent(), null, "Start", null, 1, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_End(), this.getEndEvent(), null, "End", null, 1, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_EventsProviders(), this.getEventsProviderAbstract(), this.getEventsProviderAbstract_Distribution(), "EventsProviders", null, 0, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_ParentDistribution(), this.getDistribution(), this.getDistribution_ChildDistribution(), "ParentDistribution", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_ChildDistribution(), this.getDistribution(), this.getDistribution_ParentDistribution(), "ChildDistribution", null, 0, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_ProvidedEvents(), this.getDistributionEvent(), this.getDistributionEvent_DistributionAsProvidedEvent(), "ProvidedEvents", null, 0, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDistribution__GetDuration__Date_Date(), ecorePackage.getEDouble(), "getDuration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetMoment__Date_double(), ecorePackage.getEDate(), "getMoment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "duration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetEventBefore__Date(), this.getDistributionEvent(), "getEventBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetEventStrictBefore__Date(), this.getDistributionEvent(), "getEventStrictBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetEventAfter__Date(), this.getDistributionEvent(), "getEventAfter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetEventStrictAfter__Date(), this.getDistributionEvent(), "getEventStrictAfter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetAmountBefore__Date(), ecorePackage.getEDouble(), "getAmountBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetAmountAfter__Date(), ecorePackage.getEDouble(), "getAmountAfter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetAmount__Date(), ecorePackage.getEDouble(), "getAmount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetSlopeBefore__Date(), ecorePackage.getEDouble(), "getSlopeBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetSlopeAfter__Date(), ecorePackage.getEDouble(), "getSlopeAfter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetMinAmount__Date_Date(), ecorePackage.getEDouble(), "getMinAmount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetMaxAmount__Date_Date(), ecorePackage.getEDouble(), "getMaxAmount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetAverageAmount__Date_Date(), ecorePackage.getEDouble(), "getAverageAmount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetCumulatedAmount__Date_Date(), ecorePackage.getEDouble(), "getCumulatedAmount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetEarliestBelow__Date_double_double(), ecorePackage.getEDate(), "getEarliestBelow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "after", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "duration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "amount", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetLatestBelow__Date_double_double(), ecorePackage.getEDate(), "getLatestBelow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "before", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "duration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "amount", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetEarliestAbove__Date_double_double(), ecorePackage.getEDate(), "getEarliestAbove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "after", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "duration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "amount", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetLatestAbove__Date_double_double(), ecorePackage.getEDate(), "getLatestAbove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "before", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "duration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "amount", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetEarliestOutputPossible__double_Date_double_double(), ecorePackage.getEDate(), "getEarliestOutputPossible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "above", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "after", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "duration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "amount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistribution__RefreshInit(), null, "refreshInit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistribution__RefreshSequence(), null, "refreshSequence", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistribution__RefreshChildEvent(), null, "refreshChildEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistribution__RefreshProvidedEvents(), null, "refreshProvidedEvents", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__Accept__Date_Date_DistributionVisitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDistributionVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistribution__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(distributionEventEClass, DistributionEvent.class, "DistributionEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistributionEvent_Moment(), ecorePackage.getEDate(), "Moment", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionEvent_EventNr(), ecorePackage.getEInt(), "EventNr", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionEvent_Next(), this.getDistributionEvent(), this.getDistributionEvent_Previous(), "Next", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionEvent_Previous(), this.getDistributionEvent(), this.getDistributionEvent_Next(), "Previous", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionEvent_AmountBefore(), ecorePackage.getEDouble(), "AmountBefore", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionEvent_AmountAfter(), ecorePackage.getEDouble(), "AmountAfter", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionEvent_SlopeBefore(), ecorePackage.getEDouble(), "SlopeBefore", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionEvent_SlopeAfter(), ecorePackage.getEDouble(), "SlopeAfter", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionEvent_Description(), ecorePackage.getEString(), "Description", "", 0, 1, DistributionEvent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionEvent_DistributionAsSequence(), this.getDistribution(), this.getDistribution_SequenceEvents(), "DistributionAsSequence", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionEvent_Distribution(), this.getDistribution(), null, "Distribution", null, 0, 1, DistributionEvent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionEvent_DistributionAsProvidedEvent(), this.getDistribution(), this.getDistribution_ProvidedEvents(), "DistributionAsProvidedEvent", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionEvent_SegmentAfter(), ecorePackage.getEBoolean(), "SegmentAfter", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionEvent_SegmentBefore(), ecorePackage.getEBoolean(), "SegmentBefore", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDistributionEvent__GetAmountBefore__Date(), ecorePackage.getEDouble(), "getAmountBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "moment", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistributionEvent__GetAmountAfter__Date(), ecorePackage.getEDouble(), "getAmountAfter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "moment", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistributionEvent__IsBefore__DistributionEvent(), ecorePackage.getEBoolean(), "isBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDistributionEvent(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistributionEvent__IsStrictBefore__DistributionEvent(), ecorePackage.getEBoolean(), "isStrictBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDistributionEvent(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistributionEvent__RefreshSlopeBefore(), null, "refreshSlopeBefore", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistributionEvent__RefreshAmountBefore(), null, "refreshAmountBefore", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistributionEvent__RefreshAmountAfter(), null, "refreshAmountAfter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistributionEvent__RefreshSlopeAfter(), null, "refreshSlopeAfter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistributionEvent__RefreshMoment(), null, "refreshMoment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(childEventEClass, ChildEvent.class, "ChildEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildEvent_Original(), this.getDistributionEvent(), null, "Original", null, 1, 1, ChildEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEventEClass, StartEvent.class, "StartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartEvent_AmountAtStart(), ecorePackage.getEDouble(), "AmountAtStart", null, 0, 1, StartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartEvent_SlopeAtStart(), ecorePackage.getEDouble(), "SlopeAtStart", null, 0, 1, StartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endEventEClass, EndEvent.class, "EndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(amountDeltaEClass, AmountDelta.class, "AmountDelta", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmountDelta_AmountDelta(), ecorePackage.getEDouble(), "AmountDelta", null, 0, 1, AmountDelta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAmountDelta__RefreshAmountDelta(), null, "refreshAmountDelta", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(slopeDeltaEClass, SlopeDelta.class, "SlopeDelta", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlopeDelta_SlopeDelta(), ecorePackage.getEDouble(), "SlopeDelta", null, 0, 1, SlopeDelta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSlopeDelta__RefreshSlopeDelta(), null, "refreshSlopeDelta", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(amountAbsoluteEClass, AmountAbsolute.class, "AmountAbsolute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmountAbsolute_AmountAbsolute(), ecorePackage.getEDouble(), "AmountAbsolute", null, 0, 1, AmountAbsolute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAmountAbsolute__RefreshAmountAbsolute(), null, "refreshAmountAbsolute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(slopeAbsoluteEClass, SlopeAbsolute.class, "SlopeAbsolute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlopeAbsolute_SlopeAbsolute(), ecorePackage.getEDouble(), "SlopeAbsolute", null, 0, 1, SlopeAbsolute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSlopeAbsolute__RefreshSlopeAbsolute(), null, "refreshSlopeAbsolute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(capacityChangeStartEClass, CapacityChangeStart.class, "CapacityChangeStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapacityChangeStart_Provider(), this.getCapacityChange(), this.getCapacityChange_StartEvent(), "Provider", null, 1, 1, CapacityChangeStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capacityChangeEndEClass, CapacityChangeEnd.class, "CapacityChangeEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapacityChangeEnd_Provider(), this.getCapacityChange(), this.getCapacityChange_EndEvent(), "Provider", null, 1, 1, CapacityChangeEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockChangeStartEClass, StockChangeStart.class, "StockChangeStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStockChangeStart_Provider(), this.getStockChange(), this.getStockChange_StartEvent(), "Provider", null, 1, 1, StockChangeStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockChangeEndEClass, StockChangeEnd.class, "StockChangeEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStockChangeEnd_Provider(), this.getStockChange(), this.getStockChange_EndEvent(), "Provider", null, 1, 1, StockChangeEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amountDeltaAtomicEClass, AmountDeltaAtomic.class, "AmountDeltaAtomic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAmountDeltaAtomic_Provider(), this.getAmountDeltaProvider(), this.getAmountDeltaProvider_Event(), "Provider", null, 1, 1, AmountDeltaAtomic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slopeDeltaAtomicEClass, SlopeDeltaAtomic.class, "SlopeDeltaAtomic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlopeDeltaAtomic_Provider(), this.getSlopeDeltaProvider(), this.getSlopeDeltaProvider_Event(), "Provider", null, 1, 1, SlopeDeltaAtomic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amountAbsoluteAtomicEClass, AmountAbsoluteAtomic.class, "AmountAbsoluteAtomic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAmountAbsoluteAtomic_Provider(), this.getAmountAbsoluteProvider(), this.getAmountAbsoluteProvider_Event(), "Provider", null, 1, 1, AmountAbsoluteAtomic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slopeAbsoluteAtomicEClass, SlopeAbsoluteAtomic.class, "SlopeAbsoluteAtomic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlopeAbsoluteAtomic_Provider(), this.getSlopeAbsoluteProvider(), this.getSlopeAbsoluteProvider_Event(), "Provider", null, 1, 1, SlopeAbsoluteAtomic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventsProviderAbstractEClass, EventsProviderAbstract.class, "EventsProviderAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventsProviderAbstract_Distribution(), this.getDistribution(), this.getDistribution_EventsProviders(), "Distribution", null, 1, 1, EventsProviderAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEventsProviderAbstract__RefreshEvents(), null, "refreshEvents", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eventsProviderEClass, EventsProvider.class, "EventsProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventsProvider_ProvidedEvents(), this.getProvidedEvent(), null, "ProvidedEvents", null, 0, -1, EventsProvider.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stockChangeEClass, StockChange.class, "StockChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStockChange_Start(), ecorePackage.getEDate(), "Start", null, 0, 1, StockChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockChange_End(), ecorePackage.getEDate(), "End", null, 0, 1, StockChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockChange_Slope(), ecorePackage.getEDouble(), "Slope", null, 0, 1, StockChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockChange_StartEvent(), this.getStockChangeStart(), this.getStockChangeStart_Provider(), "StartEvent", null, 0, 1, StockChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockChange_EndEvent(), this.getStockChangeEnd(), this.getStockChangeEnd_Provider(), "EndEvent", null, 0, 1, StockChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capacityChangeEClass, CapacityChange.class, "CapacityChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapacityChange_Start(), ecorePackage.getEDate(), "Start", null, 0, 1, CapacityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacityChange_End(), ecorePackage.getEDate(), "End", null, 0, 1, CapacityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacityChange_Amount(), ecorePackage.getEDouble(), "Amount", null, 0, 1, CapacityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapacityChange_StartEvent(), this.getCapacityChangeStart(), this.getCapacityChangeStart_Provider(), "StartEvent", null, 0, 1, CapacityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapacityChange_EndEvent(), this.getCapacityChangeEnd(), this.getCapacityChangeEnd_Provider(), "EndEvent", null, 0, 1, CapacityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventProviderEClass, EventProvider.class, "EventProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventProvider_ProvidedEvent(), this.getProvidedEvent(), null, "ProvidedEvent", null, 0, 1, EventProvider.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventProvider_Moment(), ecorePackage.getEDate(), "Moment", null, 0, 1, EventProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slopeDeltaProviderEClass, SlopeDeltaProvider.class, "SlopeDeltaProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlopeDeltaProvider_Event(), this.getSlopeDeltaAtomic(), this.getSlopeDeltaAtomic_Provider(), "Event", null, 0, 1, SlopeDeltaProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlopeDeltaProvider_SlopeDelta(), ecorePackage.getEDouble(), "SlopeDelta", null, 0, 1, SlopeDeltaProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slopeAbsoluteProviderEClass, SlopeAbsoluteProvider.class, "SlopeAbsoluteProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlopeAbsoluteProvider_Event(), this.getSlopeAbsoluteAtomic(), this.getSlopeAbsoluteAtomic_Provider(), "Event", null, 0, 1, SlopeAbsoluteProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlopeAbsoluteProvider_SlopeAbsolute(), ecorePackage.getEDouble(), "SlopeAbsolute", "0.0", 0, 1, SlopeAbsoluteProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amountDeltaProviderEClass, AmountDeltaProvider.class, "AmountDeltaProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAmountDeltaProvider_Event(), this.getAmountDeltaAtomic(), this.getAmountDeltaAtomic_Provider(), "Event", null, 0, 1, AmountDeltaProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmountDeltaProvider_AmountDelta(), ecorePackage.getEDouble(), "AmountDelta", "0.0", 0, 1, AmountDeltaProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amountAbsoluteProviderEClass, AmountAbsoluteProvider.class, "AmountAbsoluteProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAmountAbsoluteProvider_Event(), this.getAmountAbsoluteAtomic(), this.getAmountAbsoluteAtomic_Provider(), "Event", null, 0, 1, AmountAbsoluteProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmountAbsoluteProvider_AmountAbsolute(), ecorePackage.getEDouble(), "AmountAbsolute", "0.0", 0, 1, AmountAbsoluteProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ownedEventEClass, OwnedEvent.class, "OwnedEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providedEventEClass, ProvidedEvent.class, "ProvidedEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedEvent_EventProvider(), this.getEventsProviderAbstract(), null, "EventProvider", null, 1, 1, ProvidedEvent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propagatorFunctionDistributionEClass, PropagatorFunctionDistribution.class, "PropagatorFunctionDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorFunctionDistribution_Distribution(), this.getDistribution(), null, "Distribution", null, 0, 1, PropagatorFunctionDistribution.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propagatorFunctionDistributionEventEClass, PropagatorFunctionDistributionEvent.class, "PropagatorFunctionDistributionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorFunctionDistributionEvent_DistributionEvent(), this.getDistributionEvent(), null, "DistributionEvent", null, 0, 1, PropagatorFunctionDistributionEvent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propagatorFunctionEventsProviderEClass, PropagatorFunctionEventsProvider.class, "PropagatorFunctionEventsProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropagatorFunctionEventsProvider_EventsProvider(), this.getEventsProviderAbstract(), null, "EventsProvider", null, 0, 1, PropagatorFunctionEventsProvider.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propagatorFunctionDistributionAbstractEClass, PropagatorFunctionDistributionAbstract.class, "PropagatorFunctionDistributionAbstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
		addEEnumLiteral(timeUnitEEnum, TimeUnit.HOUR);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.SECOND);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MINUTE);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MILLI);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.DAY);

		// Initialize data types
		initEDataType(distributionVisitorEDataType, DistributionVisitor.class, "DistributionVisitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getDistribution_Start(), 
		   source, 
		   new String[] {
			 "name", "End"
		   });	
		addAnnotation
		  (stockChangeEndEClass, 
		   source, 
		   new String[] {
			 "name", "SlopeImpulsion"
		   });	
		addAnnotation
		  (capacityChangeEClass, 
		   source, 
		   new String[] {
			 "name", "StockChange"
		   });	
		addAnnotation
		  (ownedEventEClass, 
		   source, 
		   new String[] {
			 "name", "End"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";	
		addAnnotation
		  (distributionEventEClass, 
		   source, 
		   new String[] {
			 "archetype", "Thing"
		   });	
		addAnnotation
		  (ownedEventEClass, 
		   source, 
		   new String[] {
			 "archetype", "Description"
		   });
	}

} //TimeContinuousPackageImpl
