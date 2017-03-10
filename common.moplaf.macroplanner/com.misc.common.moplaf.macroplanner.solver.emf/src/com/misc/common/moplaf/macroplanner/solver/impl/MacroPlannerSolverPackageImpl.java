/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;

import com.misc.common.moplaf.macroplanner.solver.LPAvailability;
import com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket;
import com.misc.common.moplaf.macroplanner.solver.LPCapacity;
import com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket;
import com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner;
import com.misc.common.moplaf.macroplanner.solver.LPProduct;
import com.misc.common.moplaf.macroplanner.solver.LPProductBucket;
import com.misc.common.moplaf.macroplanner.solver.LPProductSet;
import com.misc.common.moplaf.macroplanner.solver.LPResource;
import com.misc.common.moplaf.macroplanner.solver.LPResourceBucket;
import com.misc.common.moplaf.macroplanner.solver.LPResourceSet;
import com.misc.common.moplaf.macroplanner.solver.LPRouting;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingResource;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingSet;
import com.misc.common.moplaf.macroplanner.solver.LPSupply;
import com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket;
import com.misc.common.moplaf.macroplanner.solver.LPTimeBucket;
import com.misc.common.moplaf.macroplanner.solver.LPTimeLine;
import com.misc.common.moplaf.macroplanner.solver.LPTuple;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.macroplanner.solver.Scenario;

import com.misc.common.moplaf.solver.SolverPackage;

import com.misc.common.moplaf.time.discrete.TimeDiscretePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class MacroPlannerSolverPackageImpl extends EPackageImpl implements MacroPlannerSolverPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpMacroPlannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpTupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpTimeLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpTimeBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpProductSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpProductBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpSupplyBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpCapacityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpCapacityBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpResourceSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpResourceBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpAvailabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpAvailabilityBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpRoutingSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpRoutingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpRoutingBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpRoutingBucketProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpRoutingBucketResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpRoutingProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpRoutingResourceEClass = null;

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
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MacroPlannerSolverPackageImpl() {
		super(eNS_URI, MacroPlannerSolverFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MacroPlannerSolverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MacroPlannerSolverPackage init() {
		if (isInited) return (MacroPlannerSolverPackage)EPackage.Registry.INSTANCE.getEPackage(MacroPlannerSolverPackage.eNS_URI);

		// Obtain or create and register package
		MacroPlannerSolverPackageImpl theMacroPlannerSolverPackage = (MacroPlannerSolverPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MacroPlannerSolverPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MacroPlannerSolverPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MacroPlannerPackage.eINSTANCE.eClass();
		SolverPackage.eINSTANCE.eClass();
		TimeDiscretePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMacroPlannerSolverPackage.createPackageContents();

		// Initialize created meta-data
		theMacroPlannerSolverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMacroPlannerSolverPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MacroPlannerSolverPackage.eNS_URI, theMacroPlannerSolverPackage);
		return theMacroPlannerSolverPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_LPs() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Name() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_ScenarioStart() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_ScenarioEnd() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_SelectedMasterData() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_SelectedData() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_SelectedRoutings() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPMacroPlanner() {
		return lpMacroPlannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLPMacroPlanner_BucketSize() {
		return (EAttribute)lpMacroPlannerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPMacroPlanner_ProductSet() {
		return (EReference)lpMacroPlannerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPMacroPlanner_ResourceSet() {
		return (EReference)lpMacroPlannerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPMacroPlanner_RoutingSet() {
		return (EReference)lpMacroPlannerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPMacroPlanner_Scenario() {
		return (EReference)lpMacroPlannerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPMacroPlanner_TimeLine() {
		return (EReference)lpMacroPlannerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPMacroPlanner_CostRoutings() {
		return (EReference)lpMacroPlannerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPMacroPlanner_CostSupplies() {
		return (EReference)lpMacroPlannerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPMacroPlanner_CostCapacities() {
		return (EReference)lpMacroPlannerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPMacroPlanner_CostAvailabilities() {
		return (EReference)lpMacroPlannerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPMacroPlanner_PenaltyCapacities() {
		return (EReference)lpMacroPlannerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPMacroPlanner_PenaltyAvailabilities() {
		return (EReference)lpMacroPlannerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPTuple() {
		return lpTupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPTimeLine() {
		return lpTimeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPTimeBucket() {
		return lpTimeBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPProductSet() {
		return lpProductSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProductSet_MacroPlanner() {
		return (EReference)lpProductSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProductSet_Products() {
		return (EReference)lpProductSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLPProductSet__GetProduct__LocationProduct() {
		return lpProductSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPProduct() {
		return lpProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProduct_ProductSet() {
		return (EReference)lpProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProduct_Supplies() {
		return (EReference)lpProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProduct_Capacities() {
		return (EReference)lpProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProduct_Product() {
		return (EReference)lpProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProduct_LPBuckets() {
		return (EReference)lpProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPProductBucket() {
		return lpProductBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProductBucket_Product() {
		return (EReference)lpProductBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProductBucket_Capacities() {
		return (EReference)lpProductBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProductBucket_Supplies() {
		return (EReference)lpProductBucketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProductBucket_Consumptions() {
		return (EReference)lpProductBucketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProductBucket_Consumed() {
		return (EReference)lpProductBucketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProductBucket_Supplied() {
		return (EReference)lpProductBucketEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProductBucket_Stocked() {
		return (EReference)lpProductBucketEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProductBucket_CalcConsumed() {
		return (EReference)lpProductBucketEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProductBucket_CalcSupplied() {
		return (EReference)lpProductBucketEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProductBucket_CalcStocked() {
		return (EReference)lpProductBucketEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPProductBucket_Balance() {
		return (EReference)lpProductBucketEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPSupply() {
		return lpSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPSupply_Supply() {
		return (EReference)lpSupplyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPSupply_LPBuckets() {
		return (EReference)lpSupplyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPSupply_Product() {
		return (EReference)lpSupplyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPSupplyBucket() {
		return lpSupplyBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPSupplyBucket_Supply() {
		return (EReference)lpSupplyBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPSupplyBucket_ProductBucket() {
		return (EReference)lpSupplyBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPSupplyBucket_Supplied() {
		return (EReference)lpSupplyBucketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLPSupplyBucket_Fraction() {
		return (EAttribute)lpSupplyBucketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPCapacity() {
		return lpCapacityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPCapacity_Product() {
		return (EReference)lpCapacityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPCapacity_Capacity() {
		return (EReference)lpCapacityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPCapacity_LPBuckets() {
		return (EReference)lpCapacityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPCapacityBucket() {
		return lpCapacityBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPCapacityBucket_Capacity() {
		return (EReference)lpCapacityBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPCapacityBucket_ProductBucket() {
		return (EReference)lpCapacityBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPCapacityBucket_Stocked() {
		return (EReference)lpCapacityBucketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPCapacityBucket_Slack() {
		return (EReference)lpCapacityBucketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPCapacityBucket_Balance() {
		return (EReference)lpCapacityBucketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPResourceSet() {
		return lpResourceSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPResourceSet_MacroPlanner() {
		return (EReference)lpResourceSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPResourceSet_Resources() {
		return (EReference)lpResourceSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLPResourceSet__GetResource__LocationResource() {
		return lpResourceSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPResource() {
		return lpResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPResource_Availabilities() {
		return (EReference)lpResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPResource_ResourceSet() {
		return (EReference)lpResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPResource_Resource() {
		return (EReference)lpResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPResource_LPBuckets() {
		return (EReference)lpResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPResourceBucket() {
		return lpResourceBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPResourceBucket_Resource() {
		return (EReference)lpResourceBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPResourceBucket_Availabilities() {
		return (EReference)lpResourceBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPResourceBucket_Reservations() {
		return (EReference)lpResourceBucketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPResourceBucket_Reserved() {
		return (EReference)lpResourceBucketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPResourceBucket_CalcReserved() {
		return (EReference)lpResourceBucketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPResourceBucket_Balance() {
		return (EReference)lpResourceBucketEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPAvailability() {
		return lpAvailabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPAvailability_Resource() {
		return (EReference)lpAvailabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPAvailability_Availability() {
		return (EReference)lpAvailabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPAvailability_LPBuckets() {
		return (EReference)lpAvailabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPAvailabilityBucket() {
		return lpAvailabilityBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPAvailabilityBucket_Availability() {
		return (EReference)lpAvailabilityBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPAvailabilityBucket_ResourceBucket() {
		return (EReference)lpAvailabilityBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPAvailabilityBucket_Reserved() {
		return (EReference)lpAvailabilityBucketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPAvailabilityBucket_Slack() {
		return (EReference)lpAvailabilityBucketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPAvailabilityBucket_Balance() {
		return (EReference)lpAvailabilityBucketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPRoutingSet() {
		return lpRoutingSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingSet_MacroPlanner() {
		return (EReference)lpRoutingSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingSet_Routings() {
		return (EReference)lpRoutingSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPRouting() {
		return lpRoutingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRouting_RoutingSet() {
		return (EReference)lpRoutingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRouting_Routing() {
		return (EReference)lpRoutingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRouting_LPBuckets() {
		return (EReference)lpRoutingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRouting_Products() {
		return (EReference)lpRoutingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRouting_Resources() {
		return (EReference)lpRoutingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPRoutingBucket() {
		return lpRoutingBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingBucket_Routing() {
		return (EReference)lpRoutingBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingBucket_Products() {
		return (EReference)lpRoutingBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingBucket_Resources() {
		return (EReference)lpRoutingBucketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingBucket_Planned() {
		return (EReference)lpRoutingBucketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPRoutingBucketProduct() {
		return lpRoutingBucketProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingBucketProduct_ProductBucket() {
		return (EReference)lpRoutingBucketProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingBucketProduct_RoutingProduct() {
		return (EReference)lpRoutingBucketProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingBucketProduct_Routing() {
		return (EReference)lpRoutingBucketProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPRoutingBucketResource() {
		return lpRoutingBucketResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingBucketResource_ResourceBucket() {
		return (EReference)lpRoutingBucketResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingBucketResource_RoutingResource() {
		return (EReference)lpRoutingBucketResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingBucketResource_Routing() {
		return (EReference)lpRoutingBucketResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPRoutingProduct() {
		return lpRoutingProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingProduct_Routing() {
		return (EReference)lpRoutingProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingProduct_Product() {
		return (EReference)lpRoutingProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingProduct_RoutingProduct() {
		return (EReference)lpRoutingProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingProduct_LPBuckets() {
		return (EReference)lpRoutingProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPRoutingResource() {
		return lpRoutingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingResource_Routing() {
		return (EReference)lpRoutingResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingResource_Resource() {
		return (EReference)lpRoutingResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingResource_RoutingResource() {
		return (EReference)lpRoutingResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLPRoutingResource_LPBuckets() {
		return (EReference)lpRoutingResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroPlannerSolverFactory getMacroPlannerSolverFactory() {
		return (MacroPlannerSolverFactory)getEFactoryInstance();
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
		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__LPS);
		createEAttribute(scenarioEClass, SCENARIO__NAME);
		createEAttribute(scenarioEClass, SCENARIO__SCENARIO_START);
		createEAttribute(scenarioEClass, SCENARIO__SCENARIO_END);
		createEReference(scenarioEClass, SCENARIO__SELECTED_MASTER_DATA);
		createEReference(scenarioEClass, SCENARIO__SELECTED_DATA);
		createEReference(scenarioEClass, SCENARIO__SELECTED_ROUTINGS);

		lpMacroPlannerEClass = createEClass(LP_MACRO_PLANNER);
		createEAttribute(lpMacroPlannerEClass, LP_MACRO_PLANNER__BUCKET_SIZE);
		createEReference(lpMacroPlannerEClass, LP_MACRO_PLANNER__PRODUCT_SET);
		createEReference(lpMacroPlannerEClass, LP_MACRO_PLANNER__RESOURCE_SET);
		createEReference(lpMacroPlannerEClass, LP_MACRO_PLANNER__ROUTING_SET);
		createEReference(lpMacroPlannerEClass, LP_MACRO_PLANNER__SCENARIO);
		createEReference(lpMacroPlannerEClass, LP_MACRO_PLANNER__TIME_LINE);
		createEReference(lpMacroPlannerEClass, LP_MACRO_PLANNER__COST_ROUTINGS);
		createEReference(lpMacroPlannerEClass, LP_MACRO_PLANNER__COST_SUPPLIES);
		createEReference(lpMacroPlannerEClass, LP_MACRO_PLANNER__COST_CAPACITIES);
		createEReference(lpMacroPlannerEClass, LP_MACRO_PLANNER__COST_AVAILABILITIES);
		createEReference(lpMacroPlannerEClass, LP_MACRO_PLANNER__PENALTY_CAPACITIES);
		createEReference(lpMacroPlannerEClass, LP_MACRO_PLANNER__PENALTY_AVAILABILITIES);

		lpTupleEClass = createEClass(LP_TUPLE);

		lpTimeLineEClass = createEClass(LP_TIME_LINE);

		lpTimeBucketEClass = createEClass(LP_TIME_BUCKET);

		lpProductSetEClass = createEClass(LP_PRODUCT_SET);
		createEReference(lpProductSetEClass, LP_PRODUCT_SET__MACRO_PLANNER);
		createEReference(lpProductSetEClass, LP_PRODUCT_SET__PRODUCTS);
		createEOperation(lpProductSetEClass, LP_PRODUCT_SET___GET_PRODUCT__LOCATIONPRODUCT);

		lpProductEClass = createEClass(LP_PRODUCT);
		createEReference(lpProductEClass, LP_PRODUCT__PRODUCT_SET);
		createEReference(lpProductEClass, LP_PRODUCT__SUPPLIES);
		createEReference(lpProductEClass, LP_PRODUCT__CAPACITIES);
		createEReference(lpProductEClass, LP_PRODUCT__PRODUCT);
		createEReference(lpProductEClass, LP_PRODUCT__LP_BUCKETS);

		lpProductBucketEClass = createEClass(LP_PRODUCT_BUCKET);
		createEReference(lpProductBucketEClass, LP_PRODUCT_BUCKET__PRODUCT);
		createEReference(lpProductBucketEClass, LP_PRODUCT_BUCKET__CAPACITIES);
		createEReference(lpProductBucketEClass, LP_PRODUCT_BUCKET__SUPPLIES);
		createEReference(lpProductBucketEClass, LP_PRODUCT_BUCKET__CONSUMPTIONS);
		createEReference(lpProductBucketEClass, LP_PRODUCT_BUCKET__CONSUMED);
		createEReference(lpProductBucketEClass, LP_PRODUCT_BUCKET__SUPPLIED);
		createEReference(lpProductBucketEClass, LP_PRODUCT_BUCKET__STOCKED);
		createEReference(lpProductBucketEClass, LP_PRODUCT_BUCKET__CALC_CONSUMED);
		createEReference(lpProductBucketEClass, LP_PRODUCT_BUCKET__CALC_SUPPLIED);
		createEReference(lpProductBucketEClass, LP_PRODUCT_BUCKET__CALC_STOCKED);
		createEReference(lpProductBucketEClass, LP_PRODUCT_BUCKET__BALANCE);

		lpSupplyEClass = createEClass(LP_SUPPLY);
		createEReference(lpSupplyEClass, LP_SUPPLY__SUPPLY);
		createEReference(lpSupplyEClass, LP_SUPPLY__LP_BUCKETS);
		createEReference(lpSupplyEClass, LP_SUPPLY__PRODUCT);

		lpSupplyBucketEClass = createEClass(LP_SUPPLY_BUCKET);
		createEReference(lpSupplyBucketEClass, LP_SUPPLY_BUCKET__SUPPLY);
		createEReference(lpSupplyBucketEClass, LP_SUPPLY_BUCKET__PRODUCT_BUCKET);
		createEReference(lpSupplyBucketEClass, LP_SUPPLY_BUCKET__SUPPLIED);
		createEAttribute(lpSupplyBucketEClass, LP_SUPPLY_BUCKET__FRACTION);

		lpCapacityEClass = createEClass(LP_CAPACITY);
		createEReference(lpCapacityEClass, LP_CAPACITY__PRODUCT);
		createEReference(lpCapacityEClass, LP_CAPACITY__CAPACITY);
		createEReference(lpCapacityEClass, LP_CAPACITY__LP_BUCKETS);

		lpCapacityBucketEClass = createEClass(LP_CAPACITY_BUCKET);
		createEReference(lpCapacityBucketEClass, LP_CAPACITY_BUCKET__CAPACITY);
		createEReference(lpCapacityBucketEClass, LP_CAPACITY_BUCKET__PRODUCT_BUCKET);
		createEReference(lpCapacityBucketEClass, LP_CAPACITY_BUCKET__STOCKED);
		createEReference(lpCapacityBucketEClass, LP_CAPACITY_BUCKET__SLACK);
		createEReference(lpCapacityBucketEClass, LP_CAPACITY_BUCKET__BALANCE);

		lpResourceSetEClass = createEClass(LP_RESOURCE_SET);
		createEReference(lpResourceSetEClass, LP_RESOURCE_SET__MACRO_PLANNER);
		createEReference(lpResourceSetEClass, LP_RESOURCE_SET__RESOURCES);
		createEOperation(lpResourceSetEClass, LP_RESOURCE_SET___GET_RESOURCE__LOCATIONRESOURCE);

		lpResourceEClass = createEClass(LP_RESOURCE);
		createEReference(lpResourceEClass, LP_RESOURCE__RESOURCE_SET);
		createEReference(lpResourceEClass, LP_RESOURCE__AVAILABILITIES);
		createEReference(lpResourceEClass, LP_RESOURCE__RESOURCE);
		createEReference(lpResourceEClass, LP_RESOURCE__LP_BUCKETS);

		lpResourceBucketEClass = createEClass(LP_RESOURCE_BUCKET);
		createEReference(lpResourceBucketEClass, LP_RESOURCE_BUCKET__RESOURCE);
		createEReference(lpResourceBucketEClass, LP_RESOURCE_BUCKET__AVAILABILITIES);
		createEReference(lpResourceBucketEClass, LP_RESOURCE_BUCKET__RESERVATIONS);
		createEReference(lpResourceBucketEClass, LP_RESOURCE_BUCKET__RESERVED);
		createEReference(lpResourceBucketEClass, LP_RESOURCE_BUCKET__CALC_RESERVED);
		createEReference(lpResourceBucketEClass, LP_RESOURCE_BUCKET__BALANCE);

		lpAvailabilityEClass = createEClass(LP_AVAILABILITY);
		createEReference(lpAvailabilityEClass, LP_AVAILABILITY__RESOURCE);
		createEReference(lpAvailabilityEClass, LP_AVAILABILITY__AVAILABILITY);
		createEReference(lpAvailabilityEClass, LP_AVAILABILITY__LP_BUCKETS);

		lpAvailabilityBucketEClass = createEClass(LP_AVAILABILITY_BUCKET);
		createEReference(lpAvailabilityBucketEClass, LP_AVAILABILITY_BUCKET__AVAILABILITY);
		createEReference(lpAvailabilityBucketEClass, LP_AVAILABILITY_BUCKET__RESOURCE_BUCKET);
		createEReference(lpAvailabilityBucketEClass, LP_AVAILABILITY_BUCKET__RESERVED);
		createEReference(lpAvailabilityBucketEClass, LP_AVAILABILITY_BUCKET__SLACK);
		createEReference(lpAvailabilityBucketEClass, LP_AVAILABILITY_BUCKET__BALANCE);

		lpRoutingSetEClass = createEClass(LP_ROUTING_SET);
		createEReference(lpRoutingSetEClass, LP_ROUTING_SET__MACRO_PLANNER);
		createEReference(lpRoutingSetEClass, LP_ROUTING_SET__ROUTINGS);

		lpRoutingEClass = createEClass(LP_ROUTING);
		createEReference(lpRoutingEClass, LP_ROUTING__ROUTING_SET);
		createEReference(lpRoutingEClass, LP_ROUTING__ROUTING);
		createEReference(lpRoutingEClass, LP_ROUTING__LP_BUCKETS);
		createEReference(lpRoutingEClass, LP_ROUTING__PRODUCTS);
		createEReference(lpRoutingEClass, LP_ROUTING__RESOURCES);

		lpRoutingProductEClass = createEClass(LP_ROUTING_PRODUCT);
		createEReference(lpRoutingProductEClass, LP_ROUTING_PRODUCT__ROUTING);
		createEReference(lpRoutingProductEClass, LP_ROUTING_PRODUCT__PRODUCT);
		createEReference(lpRoutingProductEClass, LP_ROUTING_PRODUCT__ROUTING_PRODUCT);
		createEReference(lpRoutingProductEClass, LP_ROUTING_PRODUCT__LP_BUCKETS);

		lpRoutingResourceEClass = createEClass(LP_ROUTING_RESOURCE);
		createEReference(lpRoutingResourceEClass, LP_ROUTING_RESOURCE__ROUTING);
		createEReference(lpRoutingResourceEClass, LP_ROUTING_RESOURCE__RESOURCE);
		createEReference(lpRoutingResourceEClass, LP_ROUTING_RESOURCE__ROUTING_RESOURCE);
		createEReference(lpRoutingResourceEClass, LP_ROUTING_RESOURCE__LP_BUCKETS);

		lpRoutingBucketEClass = createEClass(LP_ROUTING_BUCKET);
		createEReference(lpRoutingBucketEClass, LP_ROUTING_BUCKET__ROUTING);
		createEReference(lpRoutingBucketEClass, LP_ROUTING_BUCKET__PRODUCTS);
		createEReference(lpRoutingBucketEClass, LP_ROUTING_BUCKET__RESOURCES);
		createEReference(lpRoutingBucketEClass, LP_ROUTING_BUCKET__PLANNED);

		lpRoutingBucketProductEClass = createEClass(LP_ROUTING_BUCKET_PRODUCT);
		createEReference(lpRoutingBucketProductEClass, LP_ROUTING_BUCKET_PRODUCT__PRODUCT_BUCKET);
		createEReference(lpRoutingBucketProductEClass, LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT);
		createEReference(lpRoutingBucketProductEClass, LP_ROUTING_BUCKET_PRODUCT__ROUTING);

		lpRoutingBucketResourceEClass = createEClass(LP_ROUTING_BUCKET_RESOURCE);
		createEReference(lpRoutingBucketResourceEClass, LP_ROUTING_BUCKET_RESOURCE__RESOURCE_BUCKET);
		createEReference(lpRoutingBucketResourceEClass, LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE);
		createEReference(lpRoutingBucketResourceEClass, LP_ROUTING_BUCKET_RESOURCE__ROUTING);
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
		MacroPlannerPackage theMacroPlannerPackage = (MacroPlannerPackage)EPackage.Registry.INSTANCE.getEPackage(MacroPlannerPackage.eNS_URI);
		SolverPackage theSolverPackage = (SolverPackage)EPackage.Registry.INSTANCE.getEPackage(SolverPackage.eNS_URI);
		TimeDiscretePackage theTimeDiscretePackage = (TimeDiscretePackage)EPackage.Registry.INSTANCE.getEPackage(TimeDiscretePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lpMacroPlannerEClass.getESuperTypes().add(theSolverPackage.getGenerator());
		lpTupleEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());
		lpTimeLineEClass.getESuperTypes().add(this.getLPTuple());
		lpTimeLineEClass.getESuperTypes().add(theTimeDiscretePackage.getObjectWithTimeLine());
		lpTimeBucketEClass.getESuperTypes().add(this.getLPTuple());
		lpTimeBucketEClass.getESuperTypes().add(theTimeDiscretePackage.getObjectTimeBucket());
		lpProductSetEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());
		lpProductSetEClass.getESuperTypes().add(this.getLPTuple());
		lpProductEClass.getESuperTypes().add(this.getLPTimeLine());
		lpProductBucketEClass.getESuperTypes().add(this.getLPTimeBucket());
		lpSupplyEClass.getESuperTypes().add(this.getLPTimeLine());
		lpSupplyBucketEClass.getESuperTypes().add(this.getLPTimeBucket());
		lpCapacityEClass.getESuperTypes().add(this.getLPTimeLine());
		lpCapacityBucketEClass.getESuperTypes().add(this.getLPTimeBucket());
		lpResourceSetEClass.getESuperTypes().add(this.getLPTuple());
		lpResourceEClass.getESuperTypes().add(this.getLPTimeLine());
		lpResourceBucketEClass.getESuperTypes().add(this.getLPTimeBucket());
		lpAvailabilityEClass.getESuperTypes().add(this.getLPTimeLine());
		lpAvailabilityBucketEClass.getESuperTypes().add(this.getLPTimeBucket());
		lpRoutingSetEClass.getESuperTypes().add(this.getLPTuple());
		lpRoutingEClass.getESuperTypes().add(this.getLPTimeLine());
		lpRoutingProductEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());
		lpRoutingResourceEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());
		lpRoutingBucketEClass.getESuperTypes().add(this.getLPTimeBucket());
		lpRoutingBucketProductEClass.getESuperTypes().add(this.getLPTuple());
		lpRoutingBucketResourceEClass.getESuperTypes().add(this.getLPTuple());

		// Initialize classes, features, and operations; add parameters
		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_LPs(), this.getLPMacroPlanner(), this.getLPMacroPlanner_Scenario(), "LPs", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_ScenarioStart(), ecorePackage.getEDate(), "ScenarioStart", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_ScenarioEnd(), ecorePackage.getEDate(), "ScenarioEnd", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_SelectedMasterData(), theMacroPlannerPackage.getSupplyChainMasterData(), null, "SelectedMasterData", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_SelectedData(), theMacroPlannerPackage.getSupplyChainData(), null, "SelectedData", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_SelectedRoutings(), theMacroPlannerPackage.getSupplyChainRoutings(), null, "SelectedRoutings", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpMacroPlannerEClass, LPMacroPlanner.class, "LPMacroPlanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLPMacroPlanner_BucketSize(), theTimeDiscretePackage.getBucketType(), "BucketSize", "Day", 0, 1, LPMacroPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPMacroPlanner_ProductSet(), this.getLPProductSet(), this.getLPProductSet_MacroPlanner(), "ProductSet", null, 1, 1, LPMacroPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPMacroPlanner_ResourceSet(), this.getLPResourceSet(), this.getLPResourceSet_MacroPlanner(), "ResourceSet", null, 1, 1, LPMacroPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPMacroPlanner_RoutingSet(), this.getLPRoutingSet(), this.getLPRoutingSet_MacroPlanner(), "RoutingSet", null, 1, 1, LPMacroPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPMacroPlanner_Scenario(), this.getScenario(), this.getScenario_LPs(), "Scenario", null, 1, 1, LPMacroPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPMacroPlanner_TimeLine(), theTimeDiscretePackage.getTimeLine(), null, "TimeLine", null, 0, 1, LPMacroPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPMacroPlanner_CostRoutings(), theSolverPackage.getGeneratorLpGoal(), null, "CostRoutings", null, 1, 1, LPMacroPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPMacroPlanner_CostSupplies(), theSolverPackage.getGeneratorLpGoal(), null, "CostSupplies", null, 1, 1, LPMacroPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPMacroPlanner_CostCapacities(), theSolverPackage.getGeneratorLpGoal(), null, "CostCapacities", null, 1, 1, LPMacroPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPMacroPlanner_CostAvailabilities(), theSolverPackage.getGeneratorLpGoal(), null, "CostAvailabilities", null, 1, 1, LPMacroPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPMacroPlanner_PenaltyCapacities(), theSolverPackage.getGeneratorLpGoal(), null, "PenaltyCapacities", null, 1, 1, LPMacroPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPMacroPlanner_PenaltyAvailabilities(), theSolverPackage.getGeneratorLpGoal(), null, "PenaltyAvailabilities", null, 1, 1, LPMacroPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpTupleEClass, LPTuple.class, "LPTuple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lpTimeLineEClass, LPTimeLine.class, "LPTimeLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lpTimeBucketEClass, LPTimeBucket.class, "LPTimeBucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lpProductSetEClass, LPProductSet.class, "LPProductSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPProductSet_MacroPlanner(), this.getLPMacroPlanner(), this.getLPMacroPlanner_ProductSet(), "MacroPlanner", null, 1, 1, LPProductSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProductSet_Products(), this.getLPProduct(), this.getLPProduct_ProductSet(), "Products", null, 0, -1, LPProductSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getLPProductSet__GetProduct__LocationProduct(), this.getLPProduct(), "getProduct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMacroPlannerPackage.getLocationProduct(), "locationProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lpProductEClass, LPProduct.class, "LPProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPProduct_ProductSet(), this.getLPProductSet(), this.getLPProductSet_Products(), "ProductSet", null, 1, 1, LPProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProduct_Supplies(), this.getLPSupply(), this.getLPSupply_Product(), "Supplies", null, 0, -1, LPProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProduct_Capacities(), this.getLPCapacity(), this.getLPCapacity_Product(), "Capacities", null, 0, -1, LPProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProduct_Product(), theMacroPlannerPackage.getLocationProduct(), null, "Product", null, 0, 1, LPProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProduct_LPBuckets(), this.getLPProductBucket(), this.getLPProductBucket_Product(), "LPBuckets", null, 0, -1, LPProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpProductBucketEClass, LPProductBucket.class, "LPProductBucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPProductBucket_Product(), this.getLPProduct(), this.getLPProduct_LPBuckets(), "Product", null, 0, 1, LPProductBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProductBucket_Capacities(), this.getLPCapacityBucket(), this.getLPCapacityBucket_ProductBucket(), "Capacities", null, 0, -1, LPProductBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProductBucket_Supplies(), this.getLPSupplyBucket(), this.getLPSupplyBucket_ProductBucket(), "Supplies", null, 0, -1, LPProductBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProductBucket_Consumptions(), this.getLPRoutingBucketProduct(), this.getLPRoutingBucketProduct_ProductBucket(), "Consumptions", null, 0, -1, LPProductBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProductBucket_Consumed(), theSolverPackage.getGeneratorLpVar(), null, "Consumed", null, 1, 1, LPProductBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProductBucket_Supplied(), theSolverPackage.getGeneratorLpVar(), null, "Supplied", null, 1, 1, LPProductBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProductBucket_Stocked(), theSolverPackage.getGeneratorLpVar(), null, "Stocked", null, 1, 1, LPProductBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProductBucket_CalcConsumed(), theSolverPackage.getGeneratorLpCons(), null, "CalcConsumed", null, 1, 1, LPProductBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProductBucket_CalcSupplied(), theSolverPackage.getGeneratorLpCons(), null, "CalcSupplied", null, 1, 1, LPProductBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProductBucket_CalcStocked(), theSolverPackage.getGeneratorLpCons(), null, "CalcStocked", null, 1, 1, LPProductBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPProductBucket_Balance(), theSolverPackage.getGeneratorLpCons(), null, "Balance", null, 1, 1, LPProductBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpSupplyEClass, LPSupply.class, "LPSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPSupply_Supply(), theMacroPlannerPackage.getSupply(), null, "Supply", null, 0, 1, LPSupply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPSupply_LPBuckets(), this.getLPSupplyBucket(), this.getLPSupplyBucket_Supply(), "LPBuckets", null, 0, -1, LPSupply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPSupply_Product(), this.getLPProduct(), this.getLPProduct_Supplies(), "Product", null, 0, 1, LPSupply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpSupplyBucketEClass, LPSupplyBucket.class, "LPSupplyBucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPSupplyBucket_Supply(), this.getLPSupply(), this.getLPSupply_LPBuckets(), "Supply", null, 0, 1, LPSupplyBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPSupplyBucket_ProductBucket(), this.getLPProductBucket(), this.getLPProductBucket_Supplies(), "ProductBucket", null, 0, 1, LPSupplyBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPSupplyBucket_Supplied(), theSolverPackage.getGeneratorLpVar(), null, "Supplied", null, 1, 1, LPSupplyBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLPSupplyBucket_Fraction(), ecorePackage.getEFloat(), "Fraction", null, 0, 1, LPSupplyBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpCapacityEClass, LPCapacity.class, "LPCapacity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPCapacity_Product(), this.getLPProduct(), this.getLPProduct_Capacities(), "Product", null, 1, 1, LPCapacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPCapacity_Capacity(), theMacroPlannerPackage.getCapacity(), null, "Capacity", null, 0, 1, LPCapacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPCapacity_LPBuckets(), this.getLPCapacityBucket(), this.getLPCapacityBucket_Capacity(), "LPBuckets", null, 0, -1, LPCapacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpCapacityBucketEClass, LPCapacityBucket.class, "LPCapacityBucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPCapacityBucket_Capacity(), this.getLPCapacity(), this.getLPCapacity_LPBuckets(), "Capacity", null, 0, 1, LPCapacityBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPCapacityBucket_ProductBucket(), this.getLPProductBucket(), this.getLPProductBucket_Capacities(), "ProductBucket", null, 0, 1, LPCapacityBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPCapacityBucket_Stocked(), theSolverPackage.getGeneratorLpVar(), null, "Stocked", null, 1, 1, LPCapacityBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPCapacityBucket_Slack(), theSolverPackage.getGeneratorLpVar(), null, "Slack", null, 1, 1, LPCapacityBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPCapacityBucket_Balance(), theSolverPackage.getGeneratorLpCons(), null, "Balance", null, 1, 1, LPCapacityBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpResourceSetEClass, LPResourceSet.class, "LPResourceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPResourceSet_MacroPlanner(), this.getLPMacroPlanner(), this.getLPMacroPlanner_ResourceSet(), "MacroPlanner", null, 1, 1, LPResourceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPResourceSet_Resources(), this.getLPResource(), this.getLPResource_ResourceSet(), "Resources", null, 0, -1, LPResourceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLPResourceSet__GetResource__LocationResource(), this.getLPResource(), "getResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMacroPlannerPackage.getLocationResource(), "locationResource", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lpResourceEClass, LPResource.class, "LPResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPResource_ResourceSet(), this.getLPResourceSet(), this.getLPResourceSet_Resources(), "ResourceSet", null, 1, 1, LPResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPResource_Availabilities(), this.getLPAvailability(), this.getLPAvailability_Resource(), "Availabilities", null, 0, -1, LPResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPResource_Resource(), theMacroPlannerPackage.getLocationResource(), null, "Resource", null, 0, 1, LPResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPResource_LPBuckets(), this.getLPResourceBucket(), this.getLPResourceBucket_Resource(), "LPBuckets", null, 0, -1, LPResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpResourceBucketEClass, LPResourceBucket.class, "LPResourceBucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPResourceBucket_Resource(), this.getLPResource(), this.getLPResource_LPBuckets(), "Resource", null, 0, 1, LPResourceBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPResourceBucket_Availabilities(), this.getLPAvailabilityBucket(), this.getLPAvailabilityBucket_ResourceBucket(), "Availabilities", null, 0, -1, LPResourceBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPResourceBucket_Reservations(), this.getLPRoutingBucketResource(), this.getLPRoutingBucketResource_ResourceBucket(), "Reservations", null, 0, -1, LPResourceBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPResourceBucket_Reserved(), theSolverPackage.getGeneratorLpVar(), null, "Reserved", null, 1, 1, LPResourceBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPResourceBucket_CalcReserved(), theSolverPackage.getGeneratorLpCons(), null, "CalcReserved", null, 1, 1, LPResourceBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPResourceBucket_Balance(), theSolverPackage.getGeneratorLpCons(), null, "Balance", null, 1, 1, LPResourceBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpAvailabilityEClass, LPAvailability.class, "LPAvailability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPAvailability_Resource(), this.getLPResource(), this.getLPResource_Availabilities(), "Resource", null, 1, 1, LPAvailability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPAvailability_Availability(), theMacroPlannerPackage.getAvailability(), null, "Availability", null, 0, 1, LPAvailability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPAvailability_LPBuckets(), this.getLPAvailabilityBucket(), this.getLPAvailabilityBucket_Availability(), "LPBuckets", null, 0, -1, LPAvailability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpAvailabilityBucketEClass, LPAvailabilityBucket.class, "LPAvailabilityBucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPAvailabilityBucket_Availability(), this.getLPAvailability(), this.getLPAvailability_LPBuckets(), "Availability", null, 0, 1, LPAvailabilityBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPAvailabilityBucket_ResourceBucket(), this.getLPResourceBucket(), this.getLPResourceBucket_Availabilities(), "ResourceBucket", null, 0, 1, LPAvailabilityBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPAvailabilityBucket_Reserved(), theSolverPackage.getGeneratorLpVar(), null, "Reserved", null, 1, 1, LPAvailabilityBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPAvailabilityBucket_Slack(), theSolverPackage.getGeneratorLpVar(), null, "Slack", null, 1, 1, LPAvailabilityBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPAvailabilityBucket_Balance(), theSolverPackage.getGeneratorLpCons(), null, "Balance", null, 1, 1, LPAvailabilityBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpRoutingSetEClass, LPRoutingSet.class, "LPRoutingSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPRoutingSet_MacroPlanner(), this.getLPMacroPlanner(), this.getLPMacroPlanner_RoutingSet(), "MacroPlanner", null, 1, 1, LPRoutingSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRoutingSet_Routings(), this.getLPRouting(), this.getLPRouting_RoutingSet(), "Routings", null, 0, -1, LPRoutingSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpRoutingEClass, LPRouting.class, "LPRouting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPRouting_RoutingSet(), this.getLPRoutingSet(), this.getLPRoutingSet_Routings(), "RoutingSet", null, 1, 1, LPRouting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRouting_Routing(), theMacroPlannerPackage.getRouting(), null, "Routing", null, 0, 1, LPRouting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRouting_LPBuckets(), this.getLPRoutingBucket(), this.getLPRoutingBucket_Routing(), "LPBuckets", null, 0, -1, LPRouting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRouting_Products(), this.getLPRoutingProduct(), this.getLPRoutingProduct_Routing(), "Products", null, 0, -1, LPRouting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRouting_Resources(), this.getLPRoutingResource(), this.getLPRoutingResource_Routing(), "Resources", null, 0, -1, LPRouting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpRoutingProductEClass, LPRoutingProduct.class, "LPRoutingProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPRoutingProduct_Routing(), this.getLPRouting(), this.getLPRouting_Products(), "Routing", null, 0, 1, LPRoutingProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRoutingProduct_Product(), this.getLPProduct(), null, "Product", null, 0, 1, LPRoutingProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRoutingProduct_RoutingProduct(), theMacroPlannerPackage.getRoutingProduct(), null, "RoutingProduct", null, 1, 1, LPRoutingProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRoutingProduct_LPBuckets(), this.getLPRoutingBucketProduct(), this.getLPRoutingBucketProduct_RoutingProduct(), "LPBuckets", null, 0, -1, LPRoutingProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpRoutingResourceEClass, LPRoutingResource.class, "LPRoutingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPRoutingResource_Routing(), this.getLPRouting(), this.getLPRouting_Resources(), "Routing", null, 0, 1, LPRoutingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRoutingResource_Resource(), this.getLPResource(), null, "Resource", null, 0, 1, LPRoutingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRoutingResource_RoutingResource(), theMacroPlannerPackage.getRoutingResource(), null, "RoutingResource", null, 1, 1, LPRoutingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRoutingResource_LPBuckets(), this.getLPRoutingBucketResource(), this.getLPRoutingBucketResource_RoutingResource(), "LPBuckets", null, 0, -1, LPRoutingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpRoutingBucketEClass, LPRoutingBucket.class, "LPRoutingBucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPRoutingBucket_Routing(), this.getLPRouting(), this.getLPRouting_LPBuckets(), "Routing", null, 0, 1, LPRoutingBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRoutingBucket_Products(), this.getLPRoutingBucketProduct(), this.getLPRoutingBucketProduct_Routing(), "Products", null, 0, -1, LPRoutingBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRoutingBucket_Resources(), this.getLPRoutingBucketResource(), this.getLPRoutingBucketResource_Routing(), "Resources", null, 0, -1, LPRoutingBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRoutingBucket_Planned(), theSolverPackage.getGeneratorLpVar(), null, "Planned", null, 1, 1, LPRoutingBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpRoutingBucketProductEClass, LPRoutingBucketProduct.class, "LPRoutingBucketProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPRoutingBucketProduct_ProductBucket(), this.getLPProductBucket(), this.getLPProductBucket_Consumptions(), "ProductBucket", null, 1, 1, LPRoutingBucketProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRoutingBucketProduct_RoutingProduct(), this.getLPRoutingProduct(), this.getLPRoutingProduct_LPBuckets(), "RoutingProduct", null, 0, 1, LPRoutingBucketProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRoutingBucketProduct_Routing(), this.getLPRoutingBucket(), this.getLPRoutingBucket_Products(), "Routing", null, 1, 1, LPRoutingBucketProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpRoutingBucketResourceEClass, LPRoutingBucketResource.class, "LPRoutingBucketResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLPRoutingBucketResource_ResourceBucket(), this.getLPResourceBucket(), this.getLPResourceBucket_Reservations(), "ResourceBucket", null, 1, 1, LPRoutingBucketResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRoutingBucketResource_RoutingResource(), this.getLPRoutingResource(), this.getLPRoutingResource_LPBuckets(), "RoutingResource", null, 0, 1, LPRoutingBucketResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLPRoutingBucketResource_Routing(), this.getLPRoutingBucket(), this.getLPRoutingBucket_Resources(), "Routing", null, 1, 1, LPRoutingBucketResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MacroPlannerSolverPackageImpl
