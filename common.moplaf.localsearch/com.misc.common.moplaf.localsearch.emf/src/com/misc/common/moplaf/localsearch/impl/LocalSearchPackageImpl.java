/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.LocalSearchFactory;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Move;
import com.misc.common.moplaf.localsearch.Phase;
import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.SolutionChange;
import com.misc.common.moplaf.localsearch.Step;
import com.misc.common.moplaf.localsearch.Strategy;

import com.misc.common.moplaf.localsearch.StrategyLevel;
import com.misc.common.moplaf.propagator2.PropagatorPackage;
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
public class LocalSearchPackageImpl extends EPackageImpl implements LocalSearchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum strategyLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enabledFeedbackEDataType = null;

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
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LocalSearchPackageImpl() {
		super(eNS_URI, LocalSearchFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LocalSearchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LocalSearchPackage init() {
		if (isInited) return (LocalSearchPackage)EPackage.Registry.INSTANCE.getEPackage(LocalSearchPackage.eNS_URI);

		// Obtain or create and register package
		LocalSearchPackageImpl theLocalSearchPackage = (LocalSearchPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LocalSearchPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LocalSearchPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		JobPackage.eINSTANCE.eClass();
		PropagatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLocalSearchPackage.createPackageContents();

		// Initialize created meta-data
		theLocalSearchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLocalSearchPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LocalSearchPackage.eNS_URI, theLocalSearchPackage);
		return theLocalSearchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolution() {
		return solutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Score() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolution_SolutionNr() {
		return (EAttribute)solutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Ancestor() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Descendants() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Strategy() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolution__Clone() {
		return solutionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolution__Refresh() {
		return solutionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_RootMoves() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_CurrentMove() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Description() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Valid() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_ActionNr() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Step() {
		return (EReference)actionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_ValidFeedback() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Initialize() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Run() {
		return actionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Finalize() {
		return actionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Select__Move() {
		return actionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMove() {
		return moveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMove_NextMoves() {
		return (EReference)moveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Description() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_ValidFeedback() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMove_Previous() {
		return (EReference)moveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Valid() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_DoEnabledFeedback() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_UndoEnabledFeedback() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_SelectEnabledFeedback() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMove_Score() {
		return (EReference)moveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMove_Action() {
		return (EReference)moveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Current() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Solution() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMove__Do_() {
		return moveEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMove__Undo() {
		return moveEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScore() {
		return scoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScore_Feasible() {
		return (EAttribute)scoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScore_Description() {
		return (EAttribute)scoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScore__IsBetter__Score() {
		return scoreEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScore__Clone() {
		return scoreEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScore__Copy__Score() {
		return scoreEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategy_Phases() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategy_Solutions() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategy_CurrentSolutionNr() {
		return (EAttribute)strategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategy_MaxNrSolutions() {
		return (EAttribute)strategyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategy_Name() {
		return (EAttribute)strategyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategy_SelectBestChance() {
		return (EAttribute)strategyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategy_SelectWorstChance() {
		return (EAttribute)strategyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategy__SelectGoodSolution() {
		return strategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategy__SelectBadSolution() {
		return strategyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategy__SortSolutions() {
		return strategyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhase() {
		return phaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_Name() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_KeepLevel() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_MaxSteps() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_MaxSeconds() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_PhaseStart() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_PhaseEnd() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_NrSteps() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_DurationTotal() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_DurationAverage() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhase_Strategy() {
		return (EReference)phaseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhase_Steps() {
		return (EReference)phaseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPhase__DoStep__Step() {
		return phaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Actions() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_StepNr() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Phase() {
		return (EReference)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionChange() {
		return solutionChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_EndSolutionOwned() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_StartSolution() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_EndSolution() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_StartSolutionOwned() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_PreviousChange() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionChange_Level() {
		return (EAttribute)solutionChangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_Solutions() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_SubChanges() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_CurrentSolution() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStrategyLevel() {
		return strategyLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnabledFeedback() {
		return enabledFeedbackEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalSearchFactory getLocalSearchFactory() {
		return (LocalSearchFactory)getEFactoryInstance();
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
		solutionEClass = createEClass(SOLUTION);
		createEReference(solutionEClass, SOLUTION__SCORE);
		createEAttribute(solutionEClass, SOLUTION__SOLUTION_NR);
		createEReference(solutionEClass, SOLUTION__ANCESTOR);
		createEReference(solutionEClass, SOLUTION__DESCENDANTS);
		createEReference(solutionEClass, SOLUTION__STRATEGY);
		createEOperation(solutionEClass, SOLUTION___CLONE);
		createEOperation(solutionEClass, SOLUTION___REFRESH);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__ROOT_MOVES);
		createEReference(actionEClass, ACTION__CURRENT_MOVE);
		createEAttribute(actionEClass, ACTION__DESCRIPTION);
		createEAttribute(actionEClass, ACTION__VALID);
		createEAttribute(actionEClass, ACTION__VALID_FEEDBACK);
		createEAttribute(actionEClass, ACTION__ACTION_NR);
		createEReference(actionEClass, ACTION__STEP);
		createEOperation(actionEClass, ACTION___INITIALIZE);
		createEOperation(actionEClass, ACTION___RUN);
		createEOperation(actionEClass, ACTION___FINALIZE);
		createEOperation(actionEClass, ACTION___SELECT__MOVE);

		moveEClass = createEClass(MOVE);
		createEReference(moveEClass, MOVE__ACTION);
		createEReference(moveEClass, MOVE__SCORE);
		createEReference(moveEClass, MOVE__PREVIOUS);
		createEReference(moveEClass, MOVE__NEXT_MOVES);
		createEAttribute(moveEClass, MOVE__DESCRIPTION);
		createEAttribute(moveEClass, MOVE__VALID);
		createEAttribute(moveEClass, MOVE__VALID_FEEDBACK);
		createEAttribute(moveEClass, MOVE__DO_ENABLED_FEEDBACK);
		createEAttribute(moveEClass, MOVE__UNDO_ENABLED_FEEDBACK);
		createEAttribute(moveEClass, MOVE__SELECT_ENABLED_FEEDBACK);
		createEAttribute(moveEClass, MOVE__CURRENT);
		createEAttribute(moveEClass, MOVE__SOLUTION);
		createEOperation(moveEClass, MOVE___DO_);
		createEOperation(moveEClass, MOVE___UNDO);

		scoreEClass = createEClass(SCORE);
		createEAttribute(scoreEClass, SCORE__FEASIBLE);
		createEAttribute(scoreEClass, SCORE__DESCRIPTION);
		createEOperation(scoreEClass, SCORE___IS_BETTER__SCORE);
		createEOperation(scoreEClass, SCORE___CLONE);
		createEOperation(scoreEClass, SCORE___COPY__SCORE);

		strategyEClass = createEClass(STRATEGY);
		createEReference(strategyEClass, STRATEGY__PHASES);
		createEReference(strategyEClass, STRATEGY__SOLUTIONS);
		createEAttribute(strategyEClass, STRATEGY__CURRENT_SOLUTION_NR);
		createEAttribute(strategyEClass, STRATEGY__MAX_NR_SOLUTIONS);
		createEAttribute(strategyEClass, STRATEGY__NAME);
		createEAttribute(strategyEClass, STRATEGY__SELECT_BEST_CHANCE);
		createEAttribute(strategyEClass, STRATEGY__SELECT_WORST_CHANCE);
		createEOperation(strategyEClass, STRATEGY___SELECT_GOOD_SOLUTION);
		createEOperation(strategyEClass, STRATEGY___SELECT_BAD_SOLUTION);
		createEOperation(strategyEClass, STRATEGY___SORT_SOLUTIONS);

		phaseEClass = createEClass(PHASE);
		createEAttribute(phaseEClass, PHASE__NAME);
		createEAttribute(phaseEClass, PHASE__KEEP_LEVEL);
		createEAttribute(phaseEClass, PHASE__MAX_STEPS);
		createEAttribute(phaseEClass, PHASE__MAX_SECONDS);
		createEAttribute(phaseEClass, PHASE__PHASE_START);
		createEAttribute(phaseEClass, PHASE__PHASE_END);
		createEAttribute(phaseEClass, PHASE__NR_STEPS);
		createEAttribute(phaseEClass, PHASE__DURATION_TOTAL);
		createEAttribute(phaseEClass, PHASE__DURATION_AVERAGE);
		createEReference(phaseEClass, PHASE__STRATEGY);
		createEReference(phaseEClass, PHASE__STEPS);
		createEOperation(phaseEClass, PHASE___DO_STEP__STEP);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__ACTIONS);
		createEAttribute(stepEClass, STEP__STEP_NR);
		createEReference(stepEClass, STEP__PHASE);

		solutionChangeEClass = createEClass(SOLUTION_CHANGE);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__END_SOLUTION_OWNED);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__START_SOLUTION);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__END_SOLUTION);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__START_SOLUTION_OWNED);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__PREVIOUS_CHANGE);
		createEAttribute(solutionChangeEClass, SOLUTION_CHANGE__LEVEL);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__SOLUTIONS);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__SUB_CHANGES);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__CURRENT_SOLUTION);

		// Create enums
		strategyLevelEEnum = createEEnum(STRATEGY_LEVEL);

		// Create data types
		enabledFeedbackEDataType = createEDataType(ENABLED_FEEDBACK);
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
		JobPackage theJobPackage = (JobPackage)EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		solutionEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctions());
		actionEClass.getESuperTypes().add(this.getSolutionChange());
		strategyEClass.getESuperTypes().add(theJobPackage.getRun());
		phaseEClass.getESuperTypes().add(this.getSolutionChange());
		stepEClass.getESuperTypes().add(this.getSolutionChange());

		// Initialize classes, features, and operations; add parameters
		initEClass(solutionEClass, Solution.class, "Solution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolution_Score(), this.getScore(), null, "Score", null, 1, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolution_SolutionNr(), ecorePackage.getEInt(), "SolutionNr", null, 0, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Ancestor(), this.getSolution(), this.getSolution_Descendants(), "Ancestor", null, 0, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Descendants(), this.getSolution(), this.getSolution_Ancestor(), "Descendants", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Strategy(), this.getStrategy(), null, "Strategy", null, 1, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSolution__Clone(), this.getSolution(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSolution__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_RootMoves(), this.getMove(), null, "RootMoves", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_CurrentMove(), this.getMove(), null, "CurrentMove", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Action.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Valid(), ecorePackage.getEBoolean(), "Valid", null, 0, 1, Action.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ValidFeedback(), ecorePackage.getEString(), "ValidFeedback", null, 0, 1, Action.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionNr(), ecorePackage.getEInt(), "ActionNr", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Step(), this.getStep(), this.getStep_Actions(), "Step", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAction__Initialize(), null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAction__Run(), null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAction__Finalize(), null, "finalize", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getAction__Select__Move(), null, "select", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMove(), "target_move", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(moveEClass, Move.class, "Move", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMove_Action(), this.getAction(), null, "Action", null, 1, 1, Move.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMove_Score(), this.getScore(), null, "Score", null, 1, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMove_Previous(), this.getMove(), this.getMove_NextMoves(), "Previous", null, 0, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMove_NextMoves(), this.getMove(), this.getMove_Previous(), "NextMoves", null, 0, -1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Move.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_Valid(), ecorePackage.getEBoolean(), "Valid", null, 0, 1, Move.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_ValidFeedback(), ecorePackage.getEString(), "ValidFeedback", null, 0, 1, Move.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_DoEnabledFeedback(), this.getEnabledFeedback(), "DoEnabledFeedback", null, 0, 1, Move.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_UndoEnabledFeedback(), this.getEnabledFeedback(), "UndoEnabledFeedback", null, 0, 1, Move.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_SelectEnabledFeedback(), this.getEnabledFeedback(), "SelectEnabledFeedback", null, 0, 1, Move.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_Current(), ecorePackage.getEBoolean(), "Current", null, 1, 1, Move.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_Solution(), ecorePackage.getEBoolean(), "Solution", null, 0, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMove__Do_(), null, "do_", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMove__Undo(), null, "undo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(scoreEClass, Score.class, "Score", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScore_Feasible(), ecorePackage.getEBoolean(), "Feasible", null, 0, 1, Score.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getScore_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Score.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getScore__IsBetter__Score(), ecorePackage.getEBoolean(), "isBetter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getScore(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getScore__Clone(), this.getScore(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getScore__Copy__Score(), null, "copy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getScore(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(strategyEClass, Strategy.class, "Strategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrategy_Phases(), this.getPhase(), this.getPhase_Strategy(), "Phases", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrategy_Solutions(), this.getSolution(), null, "Solutions", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategy_CurrentSolutionNr(), ecorePackage.getEInt(), "CurrentSolutionNr", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategy_MaxNrSolutions(), ecorePackage.getEInt(), "MaxNrSolutions", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategy_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategy_SelectBestChance(), ecorePackage.getEDouble(), "SelectBestChance", "1.0", 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategy_SelectWorstChance(), ecorePackage.getEDouble(), "SelectWorstChance", "1.0", 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStrategy__SelectGoodSolution(), this.getSolution(), "selectGoodSolution", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStrategy__SelectBadSolution(), this.getSolution(), "selectBadSolution", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStrategy__SortSolutions(), null, "sortSolutions", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(phaseEClass, Phase.class, "Phase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhase_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_KeepLevel(), this.getStrategyLevel(), "KeepLevel", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_MaxSteps(), ecorePackage.getEInt(), "MaxSteps", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_MaxSeconds(), ecorePackage.getEFloat(), "MaxSeconds", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_PhaseStart(), ecorePackage.getEDate(), "PhaseStart", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_PhaseEnd(), ecorePackage.getEDate(), "PhaseEnd", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_NrSteps(), ecorePackage.getEInt(), "NrSteps", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_DurationTotal(), ecorePackage.getEFloat(), "DurationTotal", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_DurationAverage(), ecorePackage.getEFloat(), "DurationAverage", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhase_Strategy(), this.getStrategy(), this.getStrategy_Phases(), "Strategy", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhase_Steps(), this.getStep(), this.getStep_Phase(), "Steps", null, 0, -1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPhase__DoStep__Step(), null, "doStep", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStep(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Actions(), this.getAction(), this.getAction_Step(), "Actions", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_StepNr(), ecorePackage.getEInt(), "StepNr", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Phase(), this.getPhase(), this.getPhase_Steps(), "Phase", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solutionChangeEClass, SolutionChange.class, "SolutionChange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionChange_EndSolutionOwned(), this.getSolution(), null, "EndSolutionOwned", null, 1, 1, SolutionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionChange_StartSolution(), this.getSolution(), null, "StartSolution", null, 0, 1, SolutionChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionChange_EndSolution(), this.getSolution(), null, "EndSolution", null, 0, 1, SolutionChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionChange_StartSolutionOwned(), this.getSolution(), null, "StartSolutionOwned", null, 1, 1, SolutionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionChange_PreviousChange(), this.getSolutionChange(), null, "PreviousChange", null, 0, 1, SolutionChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionChange_Level(), this.getStrategyLevel(), "Level", null, 0, 1, SolutionChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionChange_Solutions(), this.getSolution(), null, "Solutions", null, 0, -1, SolutionChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionChange_SubChanges(), this.getSolutionChange(), null, "SubChanges", null, 0, -1, SolutionChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionChange_CurrentSolution(), this.getSolution(), null, "CurrentSolution", null, 0, 1, SolutionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(strategyLevelEEnum, StrategyLevel.class, "StrategyLevel");
		addEEnumLiteral(strategyLevelEEnum, StrategyLevel.LEVEL_NONE);
		addEEnumLiteral(strategyLevelEEnum, StrategyLevel.LEVEL_PHASE);
		addEEnumLiteral(strategyLevelEEnum, StrategyLevel.LEVEL_STEP);
		addEEnumLiteral(strategyLevelEEnum, StrategyLevel.LEVEL_ACTION);

		// Initialize data types
		initEDataType(enabledFeedbackEDataType, EnabledFeedback.class, "EnabledFeedback", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LocalSearchPackageImpl
