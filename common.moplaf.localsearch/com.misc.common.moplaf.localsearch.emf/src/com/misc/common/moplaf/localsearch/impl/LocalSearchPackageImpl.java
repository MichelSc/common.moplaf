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
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.Delta;
import com.misc.common.moplaf.localsearch.LocalSearchFactory;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
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
	private EClass deltaEClass = null;

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
		FilePackage.eINSTANCE.eClass();

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
	public EReference getSolution_Strategy() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolution_Step() {
		return (EAttribute)solutionEClass.getEStructuralFeatures().get(3);
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
	public EReference getAction_StartDeltas() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_CurrentDelta() {
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
	public EAttribute getAction_ActionNr() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Step() {
		return (EReference)actionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_ValidFeedback() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(3);
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
	public EOperation getAction__Select__Delta() {
		return actionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__DoAction__Phase_Step() {
		return actionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__DoAction() {
		return actionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelta() {
		return deltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelta_Action() {
		return (EReference)deltaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelta_Score() {
		return (EReference)deltaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelta_PreviousDelta() {
		return (EReference)deltaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelta_NextDeltas() {
		return (EReference)deltaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelta_Description() {
		return (EAttribute)deltaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelta_ValidFeedback() {
		return (EAttribute)deltaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelta_DoEnabledFeedback() {
		return (EAttribute)deltaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelta_UndoEnabledFeedback() {
		return (EAttribute)deltaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelta_SelectEnabledFeedback() {
		return (EAttribute)deltaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelta_Current() {
		return (EAttribute)deltaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelta_Solution() {
		return (EAttribute)deltaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDelta__Do_() {
		return deltaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDelta__Undo() {
		return deltaEClass.getEOperations().get(1);
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
	public EOperation getStrategy__SelectGoodSolution__double() {
		return strategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategy__SelectBadSolution__double() {
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
	public EOperation getStrategy__MakeNewSolutionNr() {
		return strategyEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategy__Prune__double() {
		return strategyEClass.getEOperations().get(4);
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
	public EAttribute getPhase_SelectBestChance() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhase_SelectWorstChance() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPhase__DoPhase() {
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
	public EAttribute getStep_Step() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_ValidFeedback() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStep__DoStep__Phase() {
		return stepEClass.getEOperations().get(0);
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
	public EReference getSolutionChange_StartSolutionOwned() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_EndSolutionOwned() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_StartSolution() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_EndSolution() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_PreviousChange() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionChange_Level() {
		return (EAttribute)solutionChangeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_SubChanges() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_CurrentSolution() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionChange_KeepSolutions() {
		return (EAttribute)solutionChangeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionChange_NewSolution() {
		return (EAttribute)solutionChangeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionChange_SuperChange() {
		return (EReference)solutionChangeEClass.getEStructuralFeatures().get(7);
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
		createEReference(solutionEClass, SOLUTION__STRATEGY);
		createEAttribute(solutionEClass, SOLUTION__STEP);
		createEOperation(solutionEClass, SOLUTION___CLONE);
		createEOperation(solutionEClass, SOLUTION___REFRESH);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__START_DELTAS);
		createEReference(actionEClass, ACTION__CURRENT_DELTA);
		createEAttribute(actionEClass, ACTION__DESCRIPTION);
		createEAttribute(actionEClass, ACTION__VALID_FEEDBACK);
		createEAttribute(actionEClass, ACTION__ACTION_NR);
		createEReference(actionEClass, ACTION__STEP);
		createEOperation(actionEClass, ACTION___INITIALIZE);
		createEOperation(actionEClass, ACTION___RUN);
		createEOperation(actionEClass, ACTION___FINALIZE);
		createEOperation(actionEClass, ACTION___SELECT__DELTA);
		createEOperation(actionEClass, ACTION___DO_ACTION__PHASE_STEP);
		createEOperation(actionEClass, ACTION___DO_ACTION);

		deltaEClass = createEClass(DELTA);
		createEReference(deltaEClass, DELTA__ACTION);
		createEReference(deltaEClass, DELTA__SCORE);
		createEReference(deltaEClass, DELTA__PREVIOUS_DELTA);
		createEReference(deltaEClass, DELTA__NEXT_DELTAS);
		createEAttribute(deltaEClass, DELTA__DESCRIPTION);
		createEAttribute(deltaEClass, DELTA__DO_ENABLED_FEEDBACK);
		createEAttribute(deltaEClass, DELTA__UNDO_ENABLED_FEEDBACK);
		createEAttribute(deltaEClass, DELTA__SELECT_ENABLED_FEEDBACK);
		createEAttribute(deltaEClass, DELTA__VALID_FEEDBACK);
		createEAttribute(deltaEClass, DELTA__CURRENT);
		createEAttribute(deltaEClass, DELTA__SOLUTION);
		createEOperation(deltaEClass, DELTA___DO_);
		createEOperation(deltaEClass, DELTA___UNDO);

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
		createEOperation(strategyEClass, STRATEGY___SELECT_GOOD_SOLUTION__DOUBLE);
		createEOperation(strategyEClass, STRATEGY___SELECT_BAD_SOLUTION__DOUBLE);
		createEOperation(strategyEClass, STRATEGY___SORT_SOLUTIONS);
		createEOperation(strategyEClass, STRATEGY___MAKE_NEW_SOLUTION_NR);
		createEOperation(strategyEClass, STRATEGY___PRUNE__DOUBLE);

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
		createEAttribute(phaseEClass, PHASE__SELECT_BEST_CHANCE);
		createEAttribute(phaseEClass, PHASE__SELECT_WORST_CHANCE);
		createEOperation(phaseEClass, PHASE___DO_PHASE);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__ACTIONS);
		createEAttribute(stepEClass, STEP__STEP_NR);
		createEReference(stepEClass, STEP__PHASE);
		createEAttribute(stepEClass, STEP__STEP);
		createEAttribute(stepEClass, STEP__VALID_FEEDBACK);
		createEOperation(stepEClass, STEP___DO_STEP__PHASE);

		solutionChangeEClass = createEClass(SOLUTION_CHANGE);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__START_SOLUTION_OWNED);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__END_SOLUTION_OWNED);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__CURRENT_SOLUTION);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__START_SOLUTION);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__END_SOLUTION);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__PREVIOUS_CHANGE);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__SUB_CHANGES);
		createEReference(solutionChangeEClass, SOLUTION_CHANGE__SUPER_CHANGE);
		createEAttribute(solutionChangeEClass, SOLUTION_CHANGE__LEVEL);
		createEAttribute(solutionChangeEClass, SOLUTION_CHANGE__KEEP_SOLUTIONS);
		createEAttribute(solutionChangeEClass, SOLUTION_CHANGE__NEW_SOLUTION);

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
		stepEClass.getESuperTypes().add(this.getSolutionChange());

		// Initialize classes, features, and operations; add parameters
		initEClass(solutionEClass, Solution.class, "Solution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolution_Score(), this.getScore(), null, "Score", null, 1, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolution_SolutionNr(), ecorePackage.getEInt(), "SolutionNr", null, 0, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Strategy(), this.getStrategy(), null, "Strategy", null, 1, 1, Solution.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolution_Step(), ecorePackage.getEString(), "Step", null, 0, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSolution__Clone(), this.getSolution(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSolution__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_StartDeltas(), this.getDelta(), null, "StartDeltas", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_CurrentDelta(), this.getDelta(), null, "CurrentDelta", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Action.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ValidFeedback(), this.getEnabledFeedback(), "ValidFeedback", null, 0, 1, Action.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionNr(), ecorePackage.getEInt(), "ActionNr", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Step(), this.getStep(), this.getStep_Actions(), "Step", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAction__Initialize(), null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAction__Run(), null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAction__Finalize(), null, "finalize", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getAction__Select__Delta(), null, "select", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDelta(), "target_move", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAction__DoAction__Phase_Step(), null, "doAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPhase(), "phase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStep(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAction__DoAction(), null, "doAction", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deltaEClass, Delta.class, "Delta", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelta_Action(), this.getAction(), null, "Action", null, 1, 1, Delta.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDelta_Score(), this.getScore(), null, "Score", null, 1, 1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelta_PreviousDelta(), this.getDelta(), this.getDelta_NextDeltas(), "PreviousDelta", null, 0, 1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelta_NextDeltas(), this.getDelta(), this.getDelta_PreviousDelta(), "NextDeltas", null, 0, -1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelta_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Delta.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelta_DoEnabledFeedback(), this.getEnabledFeedback(), "DoEnabledFeedback", null, 0, 1, Delta.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelta_UndoEnabledFeedback(), this.getEnabledFeedback(), "UndoEnabledFeedback", null, 0, 1, Delta.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelta_SelectEnabledFeedback(), this.getEnabledFeedback(), "SelectEnabledFeedback", null, 0, 1, Delta.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelta_ValidFeedback(), this.getEnabledFeedback(), "ValidFeedback", null, 0, 1, Delta.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelta_Current(), ecorePackage.getEBoolean(), "Current", null, 1, 1, Delta.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelta_Solution(), ecorePackage.getEBoolean(), "Solution", null, 0, 1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDelta__Do_(), null, "do_", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDelta__Undo(), null, "undo", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		initEAttribute(getStrategy_MaxNrSolutions(), ecorePackage.getEInt(), "MaxNrSolutions", "10", 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategy_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStrategy__SelectGoodSolution__double(), this.getSolution(), "selectGoodSolution", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "chance", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStrategy__SelectBadSolution__double(), this.getSolution(), "selectBadSolution", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "chance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStrategy__SortSolutions(), null, "sortSolutions", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStrategy__MakeNewSolutionNr(), ecorePackage.getEInt(), "makeNewSolutionNr", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStrategy__Prune__double(), null, "prune", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "chance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(phaseEClass, Phase.class, "Phase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhase_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_KeepLevel(), this.getStrategyLevel(), "KeepLevel", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_MaxSteps(), ecorePackage.getEInt(), "MaxSteps", "10", 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_MaxSeconds(), ecorePackage.getEFloat(), "MaxSeconds", "60", 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_PhaseStart(), ecorePackage.getEDate(), "PhaseStart", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_PhaseEnd(), ecorePackage.getEDate(), "PhaseEnd", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_NrSteps(), ecorePackage.getEInt(), "NrSteps", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_DurationTotal(), ecorePackage.getEFloat(), "DurationTotal", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_DurationAverage(), ecorePackage.getEFloat(), "DurationAverage", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhase_Strategy(), this.getStrategy(), this.getStrategy_Phases(), "Strategy", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhase_Steps(), this.getStep(), this.getStep_Phase(), "Steps", null, 0, -1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_SelectBestChance(), ecorePackage.getEDouble(), "SelectBestChance", "1.0", 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_SelectWorstChance(), ecorePackage.getEDouble(), "SelectWorstChance", "1.0", 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPhase__DoPhase(), null, "doPhase", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Actions(), this.getAction(), this.getAction_Step(), "Actions", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_StepNr(), ecorePackage.getEInt(), "StepNr", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Phase(), this.getPhase(), this.getPhase_Steps(), "Phase", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Step(), ecorePackage.getEString(), "Step", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_ValidFeedback(), this.getEnabledFeedback(), "ValidFeedback", null, 0, 1, Step.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStep__DoStep__Phase(), null, "doStep", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPhase(), "phase", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(solutionChangeEClass, SolutionChange.class, "SolutionChange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionChange_StartSolutionOwned(), this.getSolution(), null, "StartSolutionOwned", null, 0, 1, SolutionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionChange_EndSolutionOwned(), this.getSolution(), null, "EndSolutionOwned", null, 0, 1, SolutionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionChange_CurrentSolution(), this.getSolution(), null, "CurrentSolution", null, 0, 1, SolutionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionChange_StartSolution(), this.getSolution(), null, "StartSolution", null, 1, 1, SolutionChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionChange_EndSolution(), this.getSolution(), null, "EndSolution", null, 1, 1, SolutionChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionChange_PreviousChange(), this.getSolutionChange(), null, "PreviousChange", null, 0, 1, SolutionChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionChange_SubChanges(), this.getSolutionChange(), null, "SubChanges", null, 0, -1, SolutionChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionChange_SuperChange(), this.getSolutionChange(), null, "SuperChange", null, 0, 1, SolutionChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionChange_Level(), this.getStrategyLevel(), "Level", null, 0, 1, SolutionChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionChange_KeepSolutions(), ecorePackage.getEBoolean(), "KeepSolutions", null, 0, 1, SolutionChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionChange_NewSolution(), ecorePackage.getEBoolean(), "NewSolution", null, 0, 1, SolutionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
