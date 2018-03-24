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
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorPackage;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAmountAbsolute;
import com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAtomicAmountAbsolute;
import com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAtomicMoment;
import com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAmountDelta;
import com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAtomicAmountDelta;
import com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAtomicMoment;
import com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeEndAmountDelta;
import com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeEndMoment;
import com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeStartAmountDelta;
import com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeStartMoment;
import com.misc.common.moplaf.time.continuous.calc.CalcChildEventAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.CalcChildEventMoment;
import com.misc.common.moplaf.time.continuous.calc.CalcChildEventSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.CalcDistributionChildEvents;
import com.misc.common.moplaf.time.continuous.calc.CalcDistributionInitialization;
import com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents;
import com.misc.common.moplaf.time.continuous.calc.CalcDistributionSequence;
import com.misc.common.moplaf.time.continuous.calc.CalcEndEventMoment;
import com.misc.common.moplaf.time.continuous.calc.CalcEventAmount;
import com.misc.common.moplaf.time.continuous.calc.CalcEventAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.CalcEventAmountBefore;
import com.misc.common.moplaf.time.continuous.calc.CalcEventMoment;
import com.misc.common.moplaf.time.continuous.calc.CalcEventSlope;
import com.misc.common.moplaf.time.continuous.calc.CalcEventSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.CalcEventSlopeBefore;
import com.misc.common.moplaf.time.continuous.calc.CalcEventsProviderRefreshEvents;
import com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteAtomicMoment;
import com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteAtomicSlopeAbsolute;
import com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteSlopeAbsolute;
import com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaAtomicMoment;
import com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaAtomicSlopeDelta;
import com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaSlopeDelta;
import com.misc.common.moplaf.time.continuous.calc.CalcStartEventAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.CalcStartEventMoment;
import com.misc.common.moplaf.time.continuous.calc.CalcStartEventSlopeAfter;
import com.misc.common.moplaf.time.continuous.calc.CalcStockChangeEndMoment;
import com.misc.common.moplaf.time.continuous.calc.CalcStockChangeEndSlopeDelta;
import com.misc.common.moplaf.time.continuous.calc.CalcStockChangeStartMoment;
import com.misc.common.moplaf.time.continuous.calc.CalcStockChangeStartSlopeDelta;
import com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh;
import com.misc.common.moplaf.time.continuous.calc.LayerDistributionAmounts;
import com.misc.common.moplaf.time.continuous.calc.LayerDistributionSlopes;
import com.misc.common.moplaf.time.continuous.calc.ScopeDistribution;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcFactory;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeContinuousCalcPackageImpl extends EPackageImpl implements TimeContinuousCalcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcDistributionInitializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerCompositeEventRefreshEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcDistributionChildEventsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcDistributionProvidedEventsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcDistributionSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerDistributionSlopesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerDistributionAmountsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcAmountAbsoluteAmountAbsoluteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcAmountAbsoluteAmountAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcAmountAbsoluteAtomicAmountAbsoluteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcAmountAbsoluteAtomicMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcAmountDeltaAmountAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcAmountDeltaAmountDeltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcAmountDeltaAtomicAmountDeltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcAmountDeltaAtomicMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcCapacityChangeEndAmountDeltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcCapacityChangeEndMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcCapacityChangeStartAmountDeltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcCapacityChangeStartMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcChildEventAmountAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcChildEventMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcChildEventSlopeAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcEndEventMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcEventAmountAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcEventAmountBeforeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcEventMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcEventSlopeAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcEventSlopeBeforeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcEventsProviderRefreshEventsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcSlopeAbsoluteAtomicMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcSlopeAbsoluteAtomicSlopeAbsoluteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcSlopeAbsoluteSlopeAbsoluteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcSlopeAbsoluteSlopeAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcSlopeDeltaAtomicMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcSlopeDeltaAtomicSlopeDeltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcSlopeDeltaSlopeAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcSlopeDeltaSlopeDeltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcStartEventAmountAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcStartEventMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcStartEventSlopeAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcStockChangeEndMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcStockChangeEndSlopeDeltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcStockChangeStartMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcStockChangeStartSlopeDeltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcEventSlopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcEventAmountEClass = null;

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
	 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimeContinuousCalcPackageImpl() {
		super(eNS_URI, TimeContinuousCalcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TimeContinuousCalcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimeContinuousCalcPackage init() {
		if (isInited) return (TimeContinuousCalcPackage)EPackage.Registry.INSTANCE.getEPackage(TimeContinuousCalcPackage.eNS_URI);

		// Obtain or create and register package
		TimeContinuousCalcPackageImpl theTimeContinuousCalcPackage = (TimeContinuousCalcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TimeContinuousCalcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TimeContinuousCalcPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PropagatorPackage.eINSTANCE.eClass();
		TimeContinuousPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTimeContinuousCalcPackage.createPackageContents();

		// Initialize created meta-data
		theTimeContinuousCalcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimeContinuousCalcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimeContinuousCalcPackage.eNS_URI, theTimeContinuousCalcPackage);
		return theTimeContinuousCalcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeDistribution() {
		return scopeDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcDistributionInitialization() {
		return calcDistributionInitializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcDistributionInitialization_ConcreteParent() {
		return (EReference)calcDistributionInitializationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerCompositeEventRefresh() {
		return layerCompositeEventRefreshEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerCompositeEventRefresh_ConcreteParent() {
		return (EReference)layerCompositeEventRefreshEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerCompositeEventRefresh_AntecedenCalcDistributionInitialization() {
		return (EReference)layerCompositeEventRefreshEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcDistributionChildEvents() {
		return calcDistributionChildEventsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcDistributionChildEvents_ConcreteParent() {
		return (EReference)calcDistributionChildEventsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcDistributionProvidedEvents() {
		return calcDistributionProvidedEventsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcDistributionProvidedEvents_ConcreteParent() {
		return (EReference)calcDistributionProvidedEventsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcDistributionProvidedEvents_AntecedentLayerCompositeeventRefresh() {
		return (EReference)calcDistributionProvidedEventsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcDistributionProvidedEvents_AntecedentCalcDistributionchildEvents() {
		return (EReference)calcDistributionProvidedEventsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcDistributionSequence() {
		return calcDistributionSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcDistributionSequence_ConcreteParent() {
		return (EReference)calcDistributionSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcDistributionSequence_AntecedentCalcDistributionProvidedEvents() {
		return (EReference)calcDistributionSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerDistributionSlopes() {
		return layerDistributionSlopesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerDistributionSlopes_ConcreteParent() {
		return (EReference)layerDistributionSlopesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerDistributionSlopes_AntecedentCalcDistributionSequence() {
		return (EReference)layerDistributionSlopesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerDistributionAmounts() {
		return layerDistributionAmountsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerDistributionAmounts_ConcreteParent() {
		return (EReference)layerDistributionAmountsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerDistributionAmounts_AntecedentLayerDistributionSlopes() {
		return (EReference)layerDistributionAmountsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcAmountAbsoluteAmountAbsolute() {
		return calcAmountAbsoluteAmountAbsoluteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcAmountAbsoluteAmountAfter() {
		return calcAmountAbsoluteAmountAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcAmountAbsoluteAtomicAmountAbsolute() {
		return calcAmountAbsoluteAtomicAmountAbsoluteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcAmountAbsoluteAtomicMoment() {
		return calcAmountAbsoluteAtomicMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcAmountDeltaAmountAfter() {
		return calcAmountDeltaAmountAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcAmountDeltaAmountDelta() {
		return calcAmountDeltaAmountDeltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcAmountDeltaAtomicAmountDelta() {
		return calcAmountDeltaAtomicAmountDeltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcAmountDeltaAtomicMoment() {
		return calcAmountDeltaAtomicMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcCapacityChangeEndAmountDelta() {
		return calcCapacityChangeEndAmountDeltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcCapacityChangeEndMoment() {
		return calcCapacityChangeEndMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcCapacityChangeStartAmountDelta() {
		return calcCapacityChangeStartAmountDeltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcCapacityChangeStartMoment() {
		return calcCapacityChangeStartMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcChildEventAmountAfter() {
		return calcChildEventAmountAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcChildEventMoment() {
		return calcChildEventMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcChildEventSlopeAfter() {
		return calcChildEventSlopeAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcEndEventMoment() {
		return calcEndEventMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcEventAmountAfter() {
		return calcEventAmountAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcEventAmountBefore() {
		return calcEventAmountBeforeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcEventMoment() {
		return calcEventMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcEventMoment_ConcreteParent() {
		return (EReference)calcEventMomentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcEventSlopeAfter() {
		return calcEventSlopeAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcEventSlopeBefore() {
		return calcEventSlopeBeforeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcEventsProviderRefreshEvents() {
		return calcEventsProviderRefreshEventsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcEventsProviderRefreshEvents_ConcreteParent() {
		return (EReference)calcEventsProviderRefreshEventsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcSlopeAbsoluteAtomicMoment() {
		return calcSlopeAbsoluteAtomicMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcSlopeAbsoluteAtomicSlopeAbsolute() {
		return calcSlopeAbsoluteAtomicSlopeAbsoluteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcSlopeAbsoluteSlopeAbsolute() {
		return calcSlopeAbsoluteSlopeAbsoluteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcSlopeAbsoluteSlopeAfter() {
		return calcSlopeAbsoluteSlopeAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcSlopeDeltaAtomicMoment() {
		return calcSlopeDeltaAtomicMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcSlopeDeltaAtomicSlopeDelta() {
		return calcSlopeDeltaAtomicSlopeDeltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcSlopeDeltaSlopeAfter() {
		return calcSlopeDeltaSlopeAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcSlopeDeltaSlopeDelta() {
		return calcSlopeDeltaSlopeDeltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcStartEventAmountAfter() {
		return calcStartEventAmountAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcStartEventMoment() {
		return calcStartEventMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcStartEventSlopeAfter() {
		return calcStartEventSlopeAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcStockChangeEndMoment() {
		return calcStockChangeEndMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcStockChangeEndSlopeDelta() {
		return calcStockChangeEndSlopeDeltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcStockChangeStartMoment() {
		return calcStockChangeStartMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcStockChangeStartSlopeDelta() {
		return calcStockChangeStartSlopeDeltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcEventSlope() {
		return calcEventSlopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcEventSlope_ConcreteParent() {
		return (EReference)calcEventSlopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcEventAmount() {
		return calcEventAmountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcEventAmount_ConcreteParent() {
		return (EReference)calcEventAmountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeContinuousCalcFactory getTimeContinuousCalcFactory() {
		return (TimeContinuousCalcFactory)getEFactoryInstance();
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
		scopeDistributionEClass = createEClass(SCOPE_DISTRIBUTION);

		calcDistributionInitializationEClass = createEClass(CALC_DISTRIBUTION_INITIALIZATION);
		createEReference(calcDistributionInitializationEClass, CALC_DISTRIBUTION_INITIALIZATION__CONCRETE_PARENT);

		layerCompositeEventRefreshEClass = createEClass(LAYER_COMPOSITE_EVENT_REFRESH);
		createEReference(layerCompositeEventRefreshEClass, LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT);
		createEReference(layerCompositeEventRefreshEClass, LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION);

		calcDistributionChildEventsEClass = createEClass(CALC_DISTRIBUTION_CHILD_EVENTS);
		createEReference(calcDistributionChildEventsEClass, CALC_DISTRIBUTION_CHILD_EVENTS__CONCRETE_PARENT);

		calcDistributionProvidedEventsEClass = createEClass(CALC_DISTRIBUTION_PROVIDED_EVENTS);
		createEReference(calcDistributionProvidedEventsEClass, CALC_DISTRIBUTION_PROVIDED_EVENTS__CONCRETE_PARENT);
		createEReference(calcDistributionProvidedEventsEClass, CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_LAYER_COMPOSITEEVENT_REFRESH);
		createEReference(calcDistributionProvidedEventsEClass, CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_CALC_DISTRIBUTIONCHILD_EVENTS);

		calcDistributionSequenceEClass = createEClass(CALC_DISTRIBUTION_SEQUENCE);
		createEReference(calcDistributionSequenceEClass, CALC_DISTRIBUTION_SEQUENCE__CONCRETE_PARENT);
		createEReference(calcDistributionSequenceEClass, CALC_DISTRIBUTION_SEQUENCE__ANTECEDENT_CALC_DISTRIBUTION_PROVIDED_EVENTS);

		layerDistributionSlopesEClass = createEClass(LAYER_DISTRIBUTION_SLOPES);
		createEReference(layerDistributionSlopesEClass, LAYER_DISTRIBUTION_SLOPES__CONCRETE_PARENT);
		createEReference(layerDistributionSlopesEClass, LAYER_DISTRIBUTION_SLOPES__ANTECEDENT_CALC_DISTRIBUTION_SEQUENCE);

		layerDistributionAmountsEClass = createEClass(LAYER_DISTRIBUTION_AMOUNTS);
		createEReference(layerDistributionAmountsEClass, LAYER_DISTRIBUTION_AMOUNTS__CONCRETE_PARENT);
		createEReference(layerDistributionAmountsEClass, LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENT_LAYER_DISTRIBUTION_SLOPES);

		calcAmountAbsoluteAmountAbsoluteEClass = createEClass(CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE);

		calcAmountAbsoluteAmountAfterEClass = createEClass(CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER);

		calcAmountAbsoluteAtomicAmountAbsoluteEClass = createEClass(CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE);

		calcAmountAbsoluteAtomicMomentEClass = createEClass(CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT);

		calcAmountDeltaAmountAfterEClass = createEClass(CALC_AMOUNT_DELTA_AMOUNT_AFTER);

		calcAmountDeltaAmountDeltaEClass = createEClass(CALC_AMOUNT_DELTA_AMOUNT_DELTA);

		calcAmountDeltaAtomicAmountDeltaEClass = createEClass(CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA);

		calcAmountDeltaAtomicMomentEClass = createEClass(CALC_AMOUNT_DELTA_ATOMIC_MOMENT);

		calcCapacityChangeEndAmountDeltaEClass = createEClass(CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA);

		calcCapacityChangeEndMomentEClass = createEClass(CALC_CAPACITY_CHANGE_END_MOMENT);

		calcCapacityChangeStartAmountDeltaEClass = createEClass(CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA);

		calcCapacityChangeStartMomentEClass = createEClass(CALC_CAPACITY_CHANGE_START_MOMENT);

		calcChildEventAmountAfterEClass = createEClass(CALC_CHILD_EVENT_AMOUNT_AFTER);

		calcChildEventMomentEClass = createEClass(CALC_CHILD_EVENT_MOMENT);

		calcChildEventSlopeAfterEClass = createEClass(CALC_CHILD_EVENT_SLOPE_AFTER);

		calcEndEventMomentEClass = createEClass(CALC_END_EVENT_MOMENT);

		calcEventAmountAfterEClass = createEClass(CALC_EVENT_AMOUNT_AFTER);

		calcEventAmountBeforeEClass = createEClass(CALC_EVENT_AMOUNT_BEFORE);

		calcEventMomentEClass = createEClass(CALC_EVENT_MOMENT);
		createEReference(calcEventMomentEClass, CALC_EVENT_MOMENT__CONCRETE_PARENT);

		calcEventSlopeAfterEClass = createEClass(CALC_EVENT_SLOPE_AFTER);

		calcEventSlopeBeforeEClass = createEClass(CALC_EVENT_SLOPE_BEFORE);

		calcEventsProviderRefreshEventsEClass = createEClass(CALC_EVENTS_PROVIDER_REFRESH_EVENTS);
		createEReference(calcEventsProviderRefreshEventsEClass, CALC_EVENTS_PROVIDER_REFRESH_EVENTS__CONCRETE_PARENT);

		calcSlopeAbsoluteAtomicMomentEClass = createEClass(CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT);

		calcSlopeAbsoluteAtomicSlopeAbsoluteEClass = createEClass(CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE);

		calcSlopeAbsoluteSlopeAbsoluteEClass = createEClass(CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE);

		calcSlopeAbsoluteSlopeAfterEClass = createEClass(CALC_SLOPE_ABSOLUTE_SLOPE_AFTER);

		calcSlopeDeltaAtomicMomentEClass = createEClass(CALC_SLOPE_DELTA_ATOMIC_MOMENT);

		calcSlopeDeltaAtomicSlopeDeltaEClass = createEClass(CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA);

		calcSlopeDeltaSlopeAfterEClass = createEClass(CALC_SLOPE_DELTA_SLOPE_AFTER);

		calcSlopeDeltaSlopeDeltaEClass = createEClass(CALC_SLOPE_DELTA_SLOPE_DELTA);

		calcStartEventAmountAfterEClass = createEClass(CALC_START_EVENT_AMOUNT_AFTER);

		calcStartEventMomentEClass = createEClass(CALC_START_EVENT_MOMENT);

		calcStartEventSlopeAfterEClass = createEClass(CALC_START_EVENT_SLOPE_AFTER);

		calcStockChangeEndMomentEClass = createEClass(CALC_STOCK_CHANGE_END_MOMENT);

		calcStockChangeEndSlopeDeltaEClass = createEClass(CALC_STOCK_CHANGE_END_SLOPE_DELTA);

		calcStockChangeStartMomentEClass = createEClass(CALC_STOCK_CHANGE_START_MOMENT);

		calcStockChangeStartSlopeDeltaEClass = createEClass(CALC_STOCK_CHANGE_START_SLOPE_DELTA);

		calcEventSlopeEClass = createEClass(CALC_EVENT_SLOPE);
		createEReference(calcEventSlopeEClass, CALC_EVENT_SLOPE__CONCRETE_PARENT);

		calcEventAmountEClass = createEClass(CALC_EVENT_AMOUNT);
		createEReference(calcEventAmountEClass, CALC_EVENT_AMOUNT__CONCRETE_PARENT);
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
		TimeContinuousPackage theTimeContinuousPackage = (TimeContinuousPackage)EPackage.Registry.INSTANCE.getEPackage(TimeContinuousPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scopeDistributionEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		calcDistributionInitializationEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		layerCompositeEventRefreshEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		calcDistributionChildEventsEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		calcDistributionProvidedEventsEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		calcDistributionSequenceEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		layerDistributionSlopesEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		layerDistributionAmountsEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		calcAmountAbsoluteAmountAbsoluteEClass.getESuperTypes().add(this.getCalcEventAmount());
		calcAmountAbsoluteAmountAfterEClass.getESuperTypes().add(this.getCalcEventAmountAfter());
		calcAmountAbsoluteAtomicAmountAbsoluteEClass.getESuperTypes().add(this.getCalcAmountAbsoluteAmountAbsolute());
		calcAmountAbsoluteAtomicMomentEClass.getESuperTypes().add(this.getCalcEventMoment());
		calcAmountDeltaAmountAfterEClass.getESuperTypes().add(this.getCalcEventAmountAfter());
		calcAmountDeltaAmountDeltaEClass.getESuperTypes().add(this.getCalcEventAmount());
		calcAmountDeltaAtomicAmountDeltaEClass.getESuperTypes().add(this.getCalcAmountDeltaAmountDelta());
		calcAmountDeltaAtomicMomentEClass.getESuperTypes().add(this.getCalcEventMoment());
		calcCapacityChangeEndAmountDeltaEClass.getESuperTypes().add(this.getCalcAmountDeltaAmountDelta());
		calcCapacityChangeEndMomentEClass.getESuperTypes().add(this.getCalcEventMoment());
		calcCapacityChangeStartAmountDeltaEClass.getESuperTypes().add(this.getCalcAmountDeltaAmountDelta());
		calcCapacityChangeStartMomentEClass.getESuperTypes().add(this.getCalcEventMoment());
		calcChildEventAmountAfterEClass.getESuperTypes().add(this.getCalcEventAmountAfter());
		calcChildEventMomentEClass.getESuperTypes().add(this.getCalcEventMoment());
		calcChildEventSlopeAfterEClass.getESuperTypes().add(this.getCalcEventSlopeAfter());
		calcEndEventMomentEClass.getESuperTypes().add(this.getCalcEventMoment());
		calcEventAmountAfterEClass.getESuperTypes().add(this.getCalcEventAmount());
		calcEventAmountBeforeEClass.getESuperTypes().add(this.getCalcEventAmount());
		calcEventMomentEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistributionEvent());
		calcEventSlopeAfterEClass.getESuperTypes().add(this.getCalcEventSlope());
		calcEventSlopeBeforeEClass.getESuperTypes().add(this.getCalcEventSlope());
		calcEventsProviderRefreshEventsEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionEventsProvider());
		calcSlopeAbsoluteAtomicMomentEClass.getESuperTypes().add(this.getCalcEventMoment());
		calcSlopeAbsoluteAtomicSlopeAbsoluteEClass.getESuperTypes().add(this.getCalcSlopeAbsoluteSlopeAbsolute());
		calcSlopeAbsoluteSlopeAbsoluteEClass.getESuperTypes().add(this.getCalcEventSlope());
		calcSlopeAbsoluteSlopeAfterEClass.getESuperTypes().add(this.getCalcEventSlopeAfter());
		calcSlopeDeltaAtomicMomentEClass.getESuperTypes().add(this.getCalcEventMoment());
		calcSlopeDeltaAtomicSlopeDeltaEClass.getESuperTypes().add(this.getCalcSlopeDeltaSlopeDelta());
		calcSlopeDeltaSlopeAfterEClass.getESuperTypes().add(this.getCalcEventSlopeAfter());
		calcSlopeDeltaSlopeDeltaEClass.getESuperTypes().add(this.getCalcEventSlope());
		calcStartEventAmountAfterEClass.getESuperTypes().add(this.getCalcEventAmountAfter());
		calcStartEventMomentEClass.getESuperTypes().add(this.getCalcEventMoment());
		calcStartEventSlopeAfterEClass.getESuperTypes().add(this.getCalcEventSlopeAfter());
		calcStockChangeEndMomentEClass.getESuperTypes().add(this.getCalcEventMoment());
		calcStockChangeEndSlopeDeltaEClass.getESuperTypes().add(this.getCalcSlopeDeltaSlopeDelta());
		calcStockChangeStartMomentEClass.getESuperTypes().add(this.getCalcEventMoment());
		calcStockChangeStartSlopeDeltaEClass.getESuperTypes().add(this.getCalcSlopeDeltaSlopeDelta());
		calcEventSlopeEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistributionEvent());
		calcEventAmountEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistributionEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(scopeDistributionEClass, ScopeDistribution.class, "ScopeDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcDistributionInitializationEClass, CalcDistributionInitialization.class, "CalcDistributionInitialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcDistributionInitialization_ConcreteParent(), this.getScopeDistribution(), null, "ConcreteParent", null, 0, 1, CalcDistributionInitialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerCompositeEventRefreshEClass, LayerCompositeEventRefresh.class, "LayerCompositeEventRefresh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerCompositeEventRefresh_ConcreteParent(), this.getScopeDistribution(), null, "ConcreteParent", null, 0, 1, LayerCompositeEventRefresh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerCompositeEventRefresh_AntecedenCalcDistributionInitialization(), this.getCalcDistributionInitialization(), null, "AntecedenCalcDistributionInitialization", null, 0, 1, LayerCompositeEventRefresh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcDistributionChildEventsEClass, CalcDistributionChildEvents.class, "CalcDistributionChildEvents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcDistributionChildEvents_ConcreteParent(), this.getScopeDistribution(), null, "ConcreteParent", null, 0, 1, CalcDistributionChildEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcDistributionProvidedEventsEClass, CalcDistributionProvidedEvents.class, "CalcDistributionProvidedEvents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcDistributionProvidedEvents_ConcreteParent(), this.getScopeDistribution(), null, "ConcreteParent", null, 0, 1, CalcDistributionProvidedEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalcDistributionProvidedEvents_AntecedentLayerCompositeeventRefresh(), this.getLayerCompositeEventRefresh(), null, "AntecedentLayerCompositeeventRefresh", null, 0, 1, CalcDistributionProvidedEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalcDistributionProvidedEvents_AntecedentCalcDistributionchildEvents(), this.getCalcDistributionChildEvents(), null, "AntecedentCalcDistributionchildEvents", null, 0, 1, CalcDistributionProvidedEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcDistributionSequenceEClass, CalcDistributionSequence.class, "CalcDistributionSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcDistributionSequence_ConcreteParent(), this.getScopeDistribution(), null, "ConcreteParent", null, 0, 1, CalcDistributionSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalcDistributionSequence_AntecedentCalcDistributionProvidedEvents(), this.getCalcDistributionProvidedEvents(), null, "AntecedentCalcDistributionProvidedEvents", null, 0, 1, CalcDistributionSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerDistributionSlopesEClass, LayerDistributionSlopes.class, "LayerDistributionSlopes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerDistributionSlopes_ConcreteParent(), this.getScopeDistribution(), null, "ConcreteParent", null, 0, 1, LayerDistributionSlopes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerDistributionSlopes_AntecedentCalcDistributionSequence(), this.getCalcDistributionSequence(), null, "AntecedentCalcDistributionSequence", null, 0, 1, LayerDistributionSlopes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerDistributionAmountsEClass, LayerDistributionAmounts.class, "LayerDistributionAmounts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerDistributionAmounts_ConcreteParent(), this.getScopeDistribution(), null, "ConcreteParent", null, 0, 1, LayerDistributionAmounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerDistributionAmounts_AntecedentLayerDistributionSlopes(), this.getLayerDistributionSlopes(), null, "AntecedentLayerDistributionSlopes", null, 0, 1, LayerDistributionAmounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcAmountAbsoluteAmountAbsoluteEClass, CalcAmountAbsoluteAmountAbsolute.class, "CalcAmountAbsoluteAmountAbsolute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcAmountAbsoluteAmountAfterEClass, CalcAmountAbsoluteAmountAfter.class, "CalcAmountAbsoluteAmountAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcAmountAbsoluteAtomicAmountAbsoluteEClass, CalcAmountAbsoluteAtomicAmountAbsolute.class, "CalcAmountAbsoluteAtomicAmountAbsolute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcAmountAbsoluteAtomicMomentEClass, CalcAmountAbsoluteAtomicMoment.class, "CalcAmountAbsoluteAtomicMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcAmountDeltaAmountAfterEClass, CalcAmountDeltaAmountAfter.class, "CalcAmountDeltaAmountAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcAmountDeltaAmountDeltaEClass, CalcAmountDeltaAmountDelta.class, "CalcAmountDeltaAmountDelta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcAmountDeltaAtomicAmountDeltaEClass, CalcAmountDeltaAtomicAmountDelta.class, "CalcAmountDeltaAtomicAmountDelta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcAmountDeltaAtomicMomentEClass, CalcAmountDeltaAtomicMoment.class, "CalcAmountDeltaAtomicMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcCapacityChangeEndAmountDeltaEClass, CalcCapacityChangeEndAmountDelta.class, "CalcCapacityChangeEndAmountDelta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcCapacityChangeEndMomentEClass, CalcCapacityChangeEndMoment.class, "CalcCapacityChangeEndMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcCapacityChangeStartAmountDeltaEClass, CalcCapacityChangeStartAmountDelta.class, "CalcCapacityChangeStartAmountDelta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcCapacityChangeStartMomentEClass, CalcCapacityChangeStartMoment.class, "CalcCapacityChangeStartMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcChildEventAmountAfterEClass, CalcChildEventAmountAfter.class, "CalcChildEventAmountAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcChildEventMomentEClass, CalcChildEventMoment.class, "CalcChildEventMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcChildEventSlopeAfterEClass, CalcChildEventSlopeAfter.class, "CalcChildEventSlopeAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcEndEventMomentEClass, CalcEndEventMoment.class, "CalcEndEventMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcEventAmountAfterEClass, CalcEventAmountAfter.class, "CalcEventAmountAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcEventAmountBeforeEClass, CalcEventAmountBefore.class, "CalcEventAmountBefore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcEventMomentEClass, CalcEventMoment.class, "CalcEventMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcEventMoment_ConcreteParent(), this.getCalcDistributionSequence(), null, "ConcreteParent", null, 0, 1, CalcEventMoment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcEventSlopeAfterEClass, CalcEventSlopeAfter.class, "CalcEventSlopeAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcEventSlopeBeforeEClass, CalcEventSlopeBefore.class, "CalcEventSlopeBefore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcEventsProviderRefreshEventsEClass, CalcEventsProviderRefreshEvents.class, "CalcEventsProviderRefreshEvents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcEventsProviderRefreshEvents_ConcreteParent(), this.getLayerCompositeEventRefresh(), null, "ConcreteParent", null, 0, 1, CalcEventsProviderRefreshEvents.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcSlopeAbsoluteAtomicMomentEClass, CalcSlopeAbsoluteAtomicMoment.class, "CalcSlopeAbsoluteAtomicMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcSlopeAbsoluteAtomicSlopeAbsoluteEClass, CalcSlopeAbsoluteAtomicSlopeAbsolute.class, "CalcSlopeAbsoluteAtomicSlopeAbsolute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcSlopeAbsoluteSlopeAbsoluteEClass, CalcSlopeAbsoluteSlopeAbsolute.class, "CalcSlopeAbsoluteSlopeAbsolute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcSlopeAbsoluteSlopeAfterEClass, CalcSlopeAbsoluteSlopeAfter.class, "CalcSlopeAbsoluteSlopeAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcSlopeDeltaAtomicMomentEClass, CalcSlopeDeltaAtomicMoment.class, "CalcSlopeDeltaAtomicMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcSlopeDeltaAtomicSlopeDeltaEClass, CalcSlopeDeltaAtomicSlopeDelta.class, "CalcSlopeDeltaAtomicSlopeDelta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcSlopeDeltaSlopeAfterEClass, CalcSlopeDeltaSlopeAfter.class, "CalcSlopeDeltaSlopeAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcSlopeDeltaSlopeDeltaEClass, CalcSlopeDeltaSlopeDelta.class, "CalcSlopeDeltaSlopeDelta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcStartEventAmountAfterEClass, CalcStartEventAmountAfter.class, "CalcStartEventAmountAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcStartEventMomentEClass, CalcStartEventMoment.class, "CalcStartEventMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcStartEventSlopeAfterEClass, CalcStartEventSlopeAfter.class, "CalcStartEventSlopeAfter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcStockChangeEndMomentEClass, CalcStockChangeEndMoment.class, "CalcStockChangeEndMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcStockChangeEndSlopeDeltaEClass, CalcStockChangeEndSlopeDelta.class, "CalcStockChangeEndSlopeDelta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcStockChangeStartMomentEClass, CalcStockChangeStartMoment.class, "CalcStockChangeStartMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcStockChangeStartSlopeDeltaEClass, CalcStockChangeStartSlopeDelta.class, "CalcStockChangeStartSlopeDelta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcEventSlopeEClass, CalcEventSlope.class, "CalcEventSlope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcEventSlope_ConcreteParent(), this.getLayerDistributionSlopes(), null, "ConcreteParent", null, 0, 1, CalcEventSlope.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcEventAmountEClass, CalcEventAmount.class, "CalcEventAmount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcEventAmount_ConcreteParent(), this.getLayerDistributionAmounts(), null, "ConcreteParent", null, 0, 1, CalcEventAmount.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TimeContinuousCalcPackageImpl
