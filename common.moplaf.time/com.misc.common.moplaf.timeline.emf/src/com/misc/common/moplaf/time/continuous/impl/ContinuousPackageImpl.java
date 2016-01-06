/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.propagator.PropagatorPackage;
import com.misc.common.moplaf.time.continuous.AmountAbsolute;
import com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic;
import com.misc.common.moplaf.time.continuous.AmountImpulsion;
import com.misc.common.moplaf.time.continuous.AmountImpulsionAtomic;
import com.misc.common.moplaf.time.continuous.CapacityChange;
import com.misc.common.moplaf.time.continuous.CapacityChangeEnd;
import com.misc.common.moplaf.time.continuous.CapacityChangeStart;
import com.misc.common.moplaf.time.continuous.ChildEvent;
import com.misc.common.moplaf.time.continuous.CompositeEvent;
import com.misc.common.moplaf.time.continuous.ContinuousFactory;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.DistributionEventsProvider;
import com.misc.common.moplaf.time.continuous.EndEvent;
import com.misc.common.moplaf.time.continuous.SlopeAbsolute;
import com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic;
import com.misc.common.moplaf.time.continuous.SlopeImpulsion;
import com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic;
import com.misc.common.moplaf.time.continuous.StartEvent;
import com.misc.common.moplaf.time.continuous.StockChange;
import com.misc.common.moplaf.time.continuous.StockChangeEnd;
import com.misc.common.moplaf.time.continuous.StockChangeStart;
import com.misc.common.moplaf.time.continuous.TimeUnit;
import com.misc.common.moplaf.time.discrete.DiscretePackage;
import com.misc.common.moplaf.time.discrete.impl.DiscretePackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class ContinuousPackageImpl extends EPackageImpl implements ContinuousPackage {
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
	private EClass distributionEventsProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountImpulsionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slopeImpulsionEClass = null;

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
	private EClass capacityChangeEClass = null;

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
	private EClass amountImpulsionAtomicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slopeImpulsionAtomicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEventEClass = null;

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
	private EEnum timeUnitEEnum = null;

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
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContinuousPackageImpl() {
		super(eNS_URI, ContinuousFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContinuousPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContinuousPackage init() {
		if (isInited) return (ContinuousPackage)EPackage.Registry.INSTANCE.getEPackage(ContinuousPackage.eNS_URI);

		// Obtain or create and register package
		ContinuousPackageImpl theContinuousPackage = (ContinuousPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContinuousPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContinuousPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PropagatorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DiscretePackageImpl theDiscretePackage = (DiscretePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DiscretePackage.eNS_URI) instanceof DiscretePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DiscretePackage.eNS_URI) : DiscretePackage.eINSTANCE);

		// Create package meta-data objects
		theContinuousPackage.createPackageContents();
		theDiscretePackage.createPackageContents();

		// Initialize created meta-data
		theContinuousPackage.initializePackageContents();
		theDiscretePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContinuousPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContinuousPackage.eNS_URI, theContinuousPackage);
		return theContinuousPackage;
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
	public EReference getDistribution_Start() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_End() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_EventsProviders() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_TimeUnit() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_HorizonStart() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistribution_HorizonEnd() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_SequenceEvent() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_ChildEvent() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_ParentDistribution() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistribution_ChildDistribution() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(9);
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
	public EOperation getDistribution__GetEventBefore__Date() {
		return distributionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetEventAfter__Date() {
		return distributionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetAmountBefore__Date() {
		return distributionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetAmountAfter__Date() {
		return distributionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetSlopeBefore__Date() {
		return distributionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetSlopeAfter__Date() {
		return distributionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetMinAmount__Date_Date() {
		return distributionEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetMaxAmount__Date_Date() {
		return distributionEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetAverageAmount__Date_Date() {
		return distributionEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__GetIntegralAmount__Date_Date() {
		return distributionEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__RefreshInit() {
		return distributionEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__RefreshSequence() {
		return distributionEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__RefreshChildEvent() {
		return distributionEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistribution__Refresh() {
		return distributionEClass.getEOperations().get(14);
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
	public EOperation getDistributionEvent__RefreshSlopeBefore() {
		return distributionEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistributionEvent__RefreshAmountBefore() {
		return distributionEventEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistributionEvent__RefreshAmountAfter() {
		return distributionEventEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistributionEvent__RefreshSlopeAfter() {
		return distributionEventEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistributionEvent__RefreshMoment() {
		return distributionEventEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDistributionEvent__RefreshDescription() {
		return distributionEventEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistributionEventsProvider() {
		return distributionEventsProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionEventsProvider_Distribution() {
		return (EReference)distributionEventsProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributionEventsProvider_ProvidedEvents() {
		return (EReference)distributionEventsProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmountImpulsion() {
		return amountImpulsionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmountImpulsion_AmountImpulsion() {
		return (EAttribute)amountImpulsionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAmountImpulsion__RefreshAmountImpulsion() {
		return amountImpulsionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlopeImpulsion() {
		return slopeImpulsionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlopeImpulsion_SlopeImpulsion() {
		return (EAttribute)slopeImpulsionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSlopeImpulsion__RefreshSlopeImpulsion() {
		return slopeImpulsionEClass.getEOperations().get(0);
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
	public EReference getCapacityChange_CapacityChangeStart() {
		return (EReference)capacityChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapacityChange_CapacityChangeEnd() {
		return (EReference)capacityChangeEClass.getEStructuralFeatures().get(4);
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
	public EReference getStockChange_StockChangeStart() {
		return (EReference)stockChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockChange_StockChangeEnd() {
		return (EReference)stockChangeEClass.getEStructuralFeatures().get(4);
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
	public EReference getStockChangeStart_StockChange() {
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
	public EReference getStockChangeEnd_StockChange() {
		return (EReference)stockChangeEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmountImpulsionAtomic() {
		return amountImpulsionAtomicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlopeImpulsionAtomic() {
		return slopeImpulsionAtomicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeEvent() {
		return compositeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeEvent__RefreshEvent() {
		return compositeEventEClass.getEOperations().get(0);
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
	public EClass getSlopeAbsoluteAtomic() {
		return slopeAbsoluteAtomicEClass;
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
	public EReference getStartEvent_DistributionAsStart() {
		return (EReference)startEventEClass.getEStructuralFeatures().get(2);
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
	public EReference getEndEvent_DistributionAsEnd() {
		return (EReference)endEventEClass.getEStructuralFeatures().get(0);
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
	public EReference getCapacityChangeStart_CapacityChange() {
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
	public EReference getCapacityChangeEnd_CapacityChange() {
		return (EReference)capacityChangeEndEClass.getEStructuralFeatures().get(0);
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
	public ContinuousFactory getContinuousFactory() {
		return (ContinuousFactory)getEFactoryInstance();
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
		createEAttribute(distributionEClass, DISTRIBUTION__TIME_UNIT);
		createEAttribute(distributionEClass, DISTRIBUTION__HORIZON_START);
		createEAttribute(distributionEClass, DISTRIBUTION__HORIZON_END);
		createEReference(distributionEClass, DISTRIBUTION__CHILD_EVENT);
		createEReference(distributionEClass, DISTRIBUTION__SEQUENCE_EVENT);
		createEReference(distributionEClass, DISTRIBUTION__START);
		createEReference(distributionEClass, DISTRIBUTION__END);
		createEReference(distributionEClass, DISTRIBUTION__EVENTS_PROVIDERS);
		createEReference(distributionEClass, DISTRIBUTION__PARENT_DISTRIBUTION);
		createEReference(distributionEClass, DISTRIBUTION__CHILD_DISTRIBUTION);
		createEOperation(distributionEClass, DISTRIBUTION___GET_DURATION__DATE_DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_EVENT_BEFORE__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_EVENT_AFTER__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_AMOUNT_BEFORE__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_AMOUNT_AFTER__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_SLOPE_BEFORE__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_SLOPE_AFTER__DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_MIN_AMOUNT__DATE_DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_MAX_AMOUNT__DATE_DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_AVERAGE_AMOUNT__DATE_DATE);
		createEOperation(distributionEClass, DISTRIBUTION___GET_INTEGRAL_AMOUNT__DATE_DATE);
		createEOperation(distributionEClass, DISTRIBUTION___REFRESH_INIT);
		createEOperation(distributionEClass, DISTRIBUTION___REFRESH_SEQUENCE);
		createEOperation(distributionEClass, DISTRIBUTION___REFRESH_CHILD_EVENT);
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
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___REFRESH_SLOPE_BEFORE);
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___REFRESH_AMOUNT_BEFORE);
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___REFRESH_AMOUNT_AFTER);
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___REFRESH_SLOPE_AFTER);
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___REFRESH_MOMENT);
		createEOperation(distributionEventEClass, DISTRIBUTION_EVENT___REFRESH_DESCRIPTION);

		distributionEventsProviderEClass = createEClass(DISTRIBUTION_EVENTS_PROVIDER);
		createEReference(distributionEventsProviderEClass, DISTRIBUTION_EVENTS_PROVIDER__DISTRIBUTION);
		createEReference(distributionEventsProviderEClass, DISTRIBUTION_EVENTS_PROVIDER__PROVIDED_EVENTS);

		childEventEClass = createEClass(CHILD_EVENT);
		createEReference(childEventEClass, CHILD_EVENT__ORIGINAL);

		startEventEClass = createEClass(START_EVENT);
		createEAttribute(startEventEClass, START_EVENT__AMOUNT_AT_START);
		createEAttribute(startEventEClass, START_EVENT__SLOPE_AT_START);
		createEReference(startEventEClass, START_EVENT__DISTRIBUTION_AS_START);

		endEventEClass = createEClass(END_EVENT);
		createEReference(endEventEClass, END_EVENT__DISTRIBUTION_AS_END);

		amountImpulsionEClass = createEClass(AMOUNT_IMPULSION);
		createEAttribute(amountImpulsionEClass, AMOUNT_IMPULSION__AMOUNT_IMPULSION);
		createEOperation(amountImpulsionEClass, AMOUNT_IMPULSION___REFRESH_AMOUNT_IMPULSION);

		slopeImpulsionEClass = createEClass(SLOPE_IMPULSION);
		createEAttribute(slopeImpulsionEClass, SLOPE_IMPULSION__SLOPE_IMPULSION);
		createEOperation(slopeImpulsionEClass, SLOPE_IMPULSION___REFRESH_SLOPE_IMPULSION);

		amountAbsoluteEClass = createEClass(AMOUNT_ABSOLUTE);
		createEAttribute(amountAbsoluteEClass, AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE);

		slopeAbsoluteEClass = createEClass(SLOPE_ABSOLUTE);
		createEAttribute(slopeAbsoluteEClass, SLOPE_ABSOLUTE__SLOPE_ABSOLUTE);

		capacityChangeEClass = createEClass(CAPACITY_CHANGE);
		createEAttribute(capacityChangeEClass, CAPACITY_CHANGE__START);
		createEAttribute(capacityChangeEClass, CAPACITY_CHANGE__END);
		createEAttribute(capacityChangeEClass, CAPACITY_CHANGE__AMOUNT);
		createEReference(capacityChangeEClass, CAPACITY_CHANGE__CAPACITY_CHANGE_START);
		createEReference(capacityChangeEClass, CAPACITY_CHANGE__CAPACITY_CHANGE_END);

		capacityChangeStartEClass = createEClass(CAPACITY_CHANGE_START);
		createEReference(capacityChangeStartEClass, CAPACITY_CHANGE_START__CAPACITY_CHANGE);

		capacityChangeEndEClass = createEClass(CAPACITY_CHANGE_END);
		createEReference(capacityChangeEndEClass, CAPACITY_CHANGE_END__CAPACITY_CHANGE);

		stockChangeEClass = createEClass(STOCK_CHANGE);
		createEAttribute(stockChangeEClass, STOCK_CHANGE__START);
		createEAttribute(stockChangeEClass, STOCK_CHANGE__END);
		createEAttribute(stockChangeEClass, STOCK_CHANGE__SLOPE);
		createEReference(stockChangeEClass, STOCK_CHANGE__STOCK_CHANGE_START);
		createEReference(stockChangeEClass, STOCK_CHANGE__STOCK_CHANGE_END);

		stockChangeStartEClass = createEClass(STOCK_CHANGE_START);
		createEReference(stockChangeStartEClass, STOCK_CHANGE_START__STOCK_CHANGE);

		stockChangeEndEClass = createEClass(STOCK_CHANGE_END);
		createEReference(stockChangeEndEClass, STOCK_CHANGE_END__STOCK_CHANGE);

		amountImpulsionAtomicEClass = createEClass(AMOUNT_IMPULSION_ATOMIC);

		slopeImpulsionAtomicEClass = createEClass(SLOPE_IMPULSION_ATOMIC);

		compositeEventEClass = createEClass(COMPOSITE_EVENT);
		createEOperation(compositeEventEClass, COMPOSITE_EVENT___REFRESH_EVENT);

		amountAbsoluteAtomicEClass = createEClass(AMOUNT_ABSOLUTE_ATOMIC);

		slopeAbsoluteAtomicEClass = createEClass(SLOPE_ABSOLUTE_ATOMIC);

		// Create enums
		timeUnitEEnum = createEEnum(TIME_UNIT);
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
		distributionEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());
		distributionEventEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());
		childEventEClass.getESuperTypes().add(this.getDistributionEvent());
		startEventEClass.getESuperTypes().add(this.getDistributionEvent());
		endEventEClass.getESuperTypes().add(this.getDistributionEvent());
		amountImpulsionEClass.getESuperTypes().add(this.getDistributionEvent());
		slopeImpulsionEClass.getESuperTypes().add(this.getDistributionEvent());
		amountAbsoluteEClass.getESuperTypes().add(this.getDistributionEvent());
		slopeAbsoluteEClass.getESuperTypes().add(this.getDistributionEvent());
		capacityChangeEClass.getESuperTypes().add(this.getCompositeEvent());
		capacityChangeStartEClass.getESuperTypes().add(this.getAmountImpulsion());
		capacityChangeEndEClass.getESuperTypes().add(this.getAmountImpulsion());
		stockChangeEClass.getESuperTypes().add(this.getCompositeEvent());
		stockChangeStartEClass.getESuperTypes().add(this.getSlopeImpulsion());
		stockChangeEndEClass.getESuperTypes().add(this.getSlopeImpulsion());
		amountImpulsionAtomicEClass.getESuperTypes().add(this.getAmountImpulsion());
		amountImpulsionAtomicEClass.getESuperTypes().add(this.getDistributionEventsProvider());
		slopeImpulsionAtomicEClass.getESuperTypes().add(this.getSlopeImpulsion());
		slopeImpulsionAtomicEClass.getESuperTypes().add(this.getDistributionEventsProvider());
		compositeEventEClass.getESuperTypes().add(this.getDistributionEventsProvider());
		compositeEventEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());
		amountAbsoluteAtomicEClass.getESuperTypes().add(this.getAmountAbsolute());
		amountAbsoluteAtomicEClass.getESuperTypes().add(this.getDistributionEventsProvider());
		slopeAbsoluteAtomicEClass.getESuperTypes().add(this.getSlopeAbsolute());
		slopeAbsoluteAtomicEClass.getESuperTypes().add(this.getDistributionEventsProvider());

		// Initialize classes, features, and operations; add parameters
		initEClass(distributionEClass, Distribution.class, "Distribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistribution_TimeUnit(), this.getTimeUnit(), "TimeUnit", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_HorizonStart(), ecorePackage.getEDate(), "HorizonStart", "2000-01-01", 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_HorizonEnd(), ecorePackage.getEDate(), "HorizonEnd", "2099-12-31", 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_ChildEvent(), this.getChildEvent(), null, "ChildEvent", null, 0, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_SequenceEvent(), this.getDistributionEvent(), this.getDistributionEvent_DistributionAsSequence(), "SequenceEvent", null, 0, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_Start(), this.getStartEvent(), this.getStartEvent_DistributionAsStart(), "Start", null, 1, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_End(), this.getEndEvent(), this.getEndEvent_DistributionAsEnd(), "End", null, 1, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_EventsProviders(), this.getDistributionEventsProvider(), null, "EventsProviders", null, 0, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_ParentDistribution(), this.getDistribution(), this.getDistribution_ChildDistribution(), "ParentDistribution", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistribution_ChildDistribution(), this.getDistribution(), this.getDistribution_ParentDistribution(), "ChildDistribution", null, 0, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDistribution__GetDuration__Date_Date(), ecorePackage.getEFloat(), "getDuration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetEventBefore__Date(), this.getDistributionEvent(), "getEventBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetEventAfter__Date(), this.getDistributionEvent(), "getEventAfter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetAmountBefore__Date(), ecorePackage.getEFloat(), "getAmountBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetAmountAfter__Date(), ecorePackage.getEFloat(), "getAmountAfter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetSlopeBefore__Date(), ecorePackage.getEFloat(), "getSlopeBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetSlopeAfter__Date(), ecorePackage.getEFloat(), "getSlopeAfter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetMinAmount__Date_Date(), ecorePackage.getEFloat(), "getMinAmount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetMaxAmount__Date_Date(), ecorePackage.getEFloat(), "getMaxAmount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetAverageAmount__Date_Date(), ecorePackage.getEFloat(), "getAverageAmount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDistribution__GetIntegralAmount__Date_Date(), ecorePackage.getEFloat(), "getIntegralAmount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistribution__RefreshInit(), null, "refreshInit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistribution__RefreshSequence(), null, "refreshSequence", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistribution__RefreshChildEvent(), null, "refreshChildEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistribution__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(distributionEventEClass, DistributionEvent.class, "DistributionEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistributionEvent_Moment(), ecorePackage.getEDate(), "Moment", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionEvent_EventNr(), ecorePackage.getEInt(), "EventNr", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionEvent_Next(), this.getDistributionEvent(), this.getDistributionEvent_Previous(), "Next", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionEvent_Previous(), this.getDistributionEvent(), this.getDistributionEvent_Next(), "Previous", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionEvent_AmountBefore(), ecorePackage.getEFloat(), "AmountBefore", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionEvent_AmountAfter(), ecorePackage.getEFloat(), "AmountAfter", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionEvent_SlopeBefore(), ecorePackage.getEFloat(), "SlopeBefore", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionEvent_SlopeAfter(), ecorePackage.getEFloat(), "SlopeAfter", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionEvent_Description(), ecorePackage.getEString(), "Description", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionEvent_DistributionAsSequence(), this.getDistribution(), this.getDistribution_SequenceEvent(), "DistributionAsSequence", null, 0, 1, DistributionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDistributionEvent__RefreshSlopeBefore(), null, "refreshSlopeBefore", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistributionEvent__RefreshAmountBefore(), null, "refreshAmountBefore", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistributionEvent__RefreshAmountAfter(), null, "refreshAmountAfter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistributionEvent__RefreshSlopeAfter(), null, "refreshSlopeAfter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistributionEvent__RefreshMoment(), null, "refreshMoment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDistributionEvent__RefreshDescription(), null, "refreshDescription", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(distributionEventsProviderEClass, DistributionEventsProvider.class, "DistributionEventsProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDistributionEventsProvider_Distribution(), this.getDistribution(), null, "Distribution", null, 1, 1, DistributionEventsProvider.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionEventsProvider_ProvidedEvents(), this.getDistributionEvent(), null, "ProvidedEvents", null, 0, -1, DistributionEventsProvider.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(childEventEClass, ChildEvent.class, "ChildEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildEvent_Original(), this.getDistributionEvent(), null, "Original", null, 1, 1, ChildEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEventEClass, StartEvent.class, "StartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartEvent_AmountAtStart(), ecorePackage.getEFloat(), "AmountAtStart", null, 0, 1, StartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartEvent_SlopeAtStart(), ecorePackage.getEFloat(), "SlopeAtStart", null, 0, 1, StartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartEvent_DistributionAsStart(), this.getDistribution(), this.getDistribution_Start(), "DistributionAsStart", null, 1, 1, StartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endEventEClass, EndEvent.class, "EndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndEvent_DistributionAsEnd(), this.getDistribution(), this.getDistribution_End(), "DistributionAsEnd", null, 1, 1, EndEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amountImpulsionEClass, AmountImpulsion.class, "AmountImpulsion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmountImpulsion_AmountImpulsion(), ecorePackage.getEFloat(), "AmountImpulsion", null, 0, 1, AmountImpulsion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAmountImpulsion__RefreshAmountImpulsion(), null, "refreshAmountImpulsion", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(slopeImpulsionEClass, SlopeImpulsion.class, "SlopeImpulsion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlopeImpulsion_SlopeImpulsion(), ecorePackage.getEFloat(), "SlopeImpulsion", null, 0, 1, SlopeImpulsion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSlopeImpulsion__RefreshSlopeImpulsion(), null, "refreshSlopeImpulsion", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(amountAbsoluteEClass, AmountAbsolute.class, "AmountAbsolute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmountAbsolute_AmountAbsolute(), ecorePackage.getEFloat(), "AmountAbsolute", null, 0, 1, AmountAbsolute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slopeAbsoluteEClass, SlopeAbsolute.class, "SlopeAbsolute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlopeAbsolute_SlopeAbsolute(), ecorePackage.getEFloat(), "SlopeAbsolute", null, 0, 1, SlopeAbsolute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capacityChangeEClass, CapacityChange.class, "CapacityChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapacityChange_Start(), ecorePackage.getEDate(), "Start", null, 0, 1, CapacityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacityChange_End(), ecorePackage.getEDate(), "End", null, 0, 1, CapacityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacityChange_Amount(), ecorePackage.getEFloat(), "Amount", null, 0, 1, CapacityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapacityChange_CapacityChangeStart(), this.getCapacityChangeStart(), this.getCapacityChangeStart_CapacityChange(), "CapacityChangeStart", null, 0, 1, CapacityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapacityChange_CapacityChangeEnd(), this.getCapacityChangeEnd(), this.getCapacityChangeEnd_CapacityChange(), "CapacityChangeEnd", null, 0, 1, CapacityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capacityChangeStartEClass, CapacityChangeStart.class, "CapacityChangeStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapacityChangeStart_CapacityChange(), this.getCapacityChange(), this.getCapacityChange_CapacityChangeStart(), "CapacityChange", null, 0, 1, CapacityChangeStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capacityChangeEndEClass, CapacityChangeEnd.class, "CapacityChangeEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapacityChangeEnd_CapacityChange(), this.getCapacityChange(), this.getCapacityChange_CapacityChangeEnd(), "CapacityChange", null, 0, 1, CapacityChangeEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockChangeEClass, StockChange.class, "StockChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStockChange_Start(), ecorePackage.getEDate(), "Start", null, 0, 1, StockChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockChange_End(), ecorePackage.getEDate(), "End", null, 0, 1, StockChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockChange_Slope(), ecorePackage.getEFloat(), "Slope", null, 0, 1, StockChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockChange_StockChangeStart(), this.getStockChangeStart(), this.getStockChangeStart_StockChange(), "StockChangeStart", null, 0, 1, StockChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockChange_StockChangeEnd(), this.getStockChangeEnd(), this.getStockChangeEnd_StockChange(), "StockChangeEnd", null, 0, 1, StockChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockChangeStartEClass, StockChangeStart.class, "StockChangeStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStockChangeStart_StockChange(), this.getStockChange(), this.getStockChange_StockChangeStart(), "StockChange", null, 1, 1, StockChangeStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockChangeEndEClass, StockChangeEnd.class, "StockChangeEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStockChangeEnd_StockChange(), this.getStockChange(), this.getStockChange_StockChangeEnd(), "StockChange", null, 1, 1, StockChangeEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amountImpulsionAtomicEClass, AmountImpulsionAtomic.class, "AmountImpulsionAtomic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(slopeImpulsionAtomicEClass, SlopeImpulsionAtomic.class, "SlopeImpulsionAtomic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeEventEClass, CompositeEvent.class, "CompositeEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCompositeEvent__RefreshEvent(), null, "refreshEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(amountAbsoluteAtomicEClass, AmountAbsoluteAtomic.class, "AmountAbsoluteAtomic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(slopeAbsoluteAtomicEClass, SlopeAbsoluteAtomic.class, "SlopeAbsoluteAtomic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
		addEEnumLiteral(timeUnitEEnum, TimeUnit.HOUR);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.SECOND);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MINUTE);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MILLI);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.DAY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (capacityChangeEClass, 
		   source, 
		   new String[] {
			 "name", "StockChange"
		   });	
		addAnnotation
		  (stockChangeEndEClass, 
		   source, 
		   new String[] {
			 "name", "SlopeImpulsion"
		   });
	}

} //ContinuousPackageImpl
