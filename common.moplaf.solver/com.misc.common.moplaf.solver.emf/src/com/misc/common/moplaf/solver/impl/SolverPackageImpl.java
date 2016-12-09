/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.solver.EnumCpLinearType;
import com.misc.common.moplaf.solver.EnumCpLogicalType;
import com.misc.common.moplaf.solver.EnumLpConsType;
import com.misc.common.moplaf.solver.EnumLpFileFormat;
import com.misc.common.moplaf.solver.EnumLpVarType;
import com.misc.common.moplaf.solver.EnumObjectiveType;
import com.misc.common.moplaf.solver.EnumSolverLogLevel;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorCons;
import com.misc.common.moplaf.solver.GeneratorConstraintEnabler;
import com.misc.common.moplaf.solver.GeneratorCpCons;
import com.misc.common.moplaf.solver.GeneratorCpLinear;
import com.misc.common.moplaf.solver.GeneratorCpLinearTerm;
import com.misc.common.moplaf.solver.GeneratorCpLogical;
import com.misc.common.moplaf.solver.GeneratorCpLogicalTerm;
import com.misc.common.moplaf.solver.GeneratorCpVar;
import com.misc.common.moplaf.solver.GeneratorCpVarAtomic;
import com.misc.common.moplaf.solver.GeneratorElement;
import com.misc.common.moplaf.solver.GeneratorFeatureMode;
import com.misc.common.moplaf.solver.GeneratorGoal;
import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpConsCount;
import com.misc.common.moplaf.solver.GeneratorLpConsCountElement;
import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.GeneratorLpLinear;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorLpVarCount;
import com.misc.common.moplaf.solver.GeneratorLpVarCountElement;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.GeneratorTupleMember;
import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.GeneratorVarOverflow;
import com.misc.common.moplaf.solver.IGeneratorTool;
import com.misc.common.moplaf.solver.ILpWriter;
import com.misc.common.moplaf.solver.ITupleVisitor;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionCons;
import com.misc.common.moplaf.solver.SolutionCpVar;
import com.misc.common.moplaf.solver.SolutionElement;
import com.misc.common.moplaf.solver.SolutionGoal;
import com.misc.common.moplaf.solver.SolutionLp;
import com.misc.common.moplaf.solver.SolutionLpCons;
import com.misc.common.moplaf.solver.SolutionLpGoal;
import com.misc.common.moplaf.solver.SolutionLpVar;
import com.misc.common.moplaf.solver.SolutionProvider;
import com.misc.common.moplaf.solver.SolutionReader;
import com.misc.common.moplaf.solver.SolutionReaderPattern;
import com.misc.common.moplaf.solver.SolutionVar;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverCp;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.SolverGeneratorGoal;
import com.misc.common.moplaf.solver.SolverGoal;
import com.misc.common.moplaf.solver.SolverGoalPreviousSolver;
import com.misc.common.moplaf.solver.SolverLp;
import com.misc.common.moplaf.solver.SolverPackage;
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
public class SolverPackageImpl extends EPackageImpl implements SolverPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorTupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorTupleMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorLpGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorLpLinearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverGeneratorGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverGoalPreviousSolverEClass = null;

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
	private EClass solutionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionLpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorLpVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorConsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorLpConsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorLpTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorLpConsCountElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorLpVarCountElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorLpVarCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorLpConsCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorFeatureModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorConstraintEnablerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorVarOverflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverLpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iLpWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionReaderPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionLpVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionConsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionLpConsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionLpGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorCpConsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorCpLinearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorCpLogicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorCpVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorCpVarAtomicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorCpLinearTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorCpLogicalTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionCpVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverCpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iGeneratorToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumLpVarTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumLpConsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumObjectiveTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSolverLogLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumCpLinearTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumCpLogicalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumLpFileFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iTupleVisitorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

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
	 * @see com.misc.common.moplaf.solver.SolverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SolverPackageImpl() {
		super(eNS_URI, SolverFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SolverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SolverPackage init() {
		if (isInited) return (SolverPackage)EPackage.Registry.INSTANCE.getEPackage(SolverPackage.eNS_URI);

		// Obtain or create and register package
		SolverPackageImpl theSolverPackage = (SolverPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SolverPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SolverPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		JobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSolverPackage.createPackageContents();

		// Initialize created meta-data
		theSolverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSolverPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SolverPackage.eNS_URI, theSolverPackage);
		return theSolverPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerator() {
		return generatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerator_TupleRoot() {
		return (EReference)generatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerator_Remarks() {
		return (EAttribute)generatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerator_FootprintNofVars() {
		return (EAttribute)generatorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerator_FootprintNofCons() {
		return (EAttribute)generatorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerator_FootprintNofTerms() {
		return (EAttribute)generatorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerator_CountCons() {
		return (EAttribute)generatorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerator_CountVars() {
		return (EAttribute)generatorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerator_ELpVarCount() {
		return (EReference)generatorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerator_ELpConsCount() {
		return (EReference)generatorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerator_Code() {
		return (EAttribute)generatorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerator_SolutionProvider() {
		return (EReference)generatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerator_Selected() {
		return (EReference)generatorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerator_Goals() {
		return (EReference)generatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenerator__Generate() {
		return generatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenerator__GenerateRootTuples() {
		return generatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenerator__GenerateTuples() {
		return generatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenerator__GenerateTupleXReferences() {
		return generatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenerator__GenerateVars() {
		return generatorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenerator__GenerateCons() {
		return generatorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenerator__GenerateGoals() {
		return generatorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenerator__AcceptSolution__Solution() {
		return generatorEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenerator__SelectFeatureMode__GeneratorFeatureMode_GeneratorTuple() {
		return generatorEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenerator__VisitTuples__ITupleVisitor() {
		return generatorEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenerator__RefreshSelectedSolution() {
		return generatorEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerator_GeneratorFeatureModes() {
		return (EReference)generatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorTuple() {
		return generatorTupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorTuple_GeneratorAsRoot() {
		return (EReference)generatorTupleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorTuple_TupleElement() {
		return (EReference)generatorTupleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorTuple_TupleContainer() {
		return (EReference)generatorTupleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorTuple_Var() {
		return (EReference)generatorTupleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorTuple_Cons() {
		return (EReference)generatorTupleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorTuple_Name() {
		return (EAttribute)generatorTupleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorTuple_Members() {
		return (EReference)generatorTupleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorTuple__GenerateVars() {
		return generatorTupleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorTuple__GenerateCons() {
		return generatorTupleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorTuple__GenerateTuples() {
		return generatorTupleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorTuple__VisitTuples__ITupleVisitor() {
		return generatorTupleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorTuple__GenerateXReferences() {
		return generatorTupleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorTupleMember() {
		return generatorTupleMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorTupleMember_Name() {
		return (EAttribute)generatorTupleMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorTupleMember_Tuple() {
		return (EReference)generatorTupleMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorTupleMember_SelectedSolutionDisplay() {
		return (EAttribute)generatorTupleMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorTupleMember_Label() {
		return (EAttribute)generatorTupleMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorElement() {
		return generatorElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorElement_Code() {
		return (EAttribute)generatorElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorElement__GetGenerator() {
		return generatorElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorElement__RefreshSelectedSolution() {
		return generatorElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorGoal() {
		return generatorGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorGoal_Generator() {
		return (EReference)generatorGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorGoal_Name() {
		return (EAttribute)generatorGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorGoal_SelectedSolutionDisplay() {
		return (EAttribute)generatorGoalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorGoal_Label() {
		return (EAttribute)generatorGoalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorGoal_Solution() {
		return (EReference)generatorGoalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorGoal__Build__Solver_float() {
		return generatorGoalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorGoal__BuildCons__Solver_float() {
		return generatorGoalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorGoal__GetSolutionGoal__Solution() {
		return generatorGoalEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorLpGoal() {
		return generatorLpGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorLpGoal_ObjectiveType() {
		return (EAttribute)generatorLpGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorLpGoal_SelectedSolutionValue() {
		return (EAttribute)generatorLpGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorLpGoal__GetSolutionValue__Solution() {
		return generatorLpGoalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorLpLinear() {
		return generatorLpLinearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorLpLinear_LpTerm() {
		return (EReference)generatorLpLinearEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorLpLinear__ConstructTerm__GeneratorLpVar_float() {
		return generatorLpLinearEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolverGoal() {
		return solverGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverGoal_Label() {
		return (EAttribute)solverGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolverGoal_Solver() {
		return (EReference)solverGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolverGoal__BuildGoal() {
		return solverGoalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolverGeneratorGoal() {
		return solverGeneratorGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolverGeneratorGoal_GoalToSolve() {
		return (EReference)solverGeneratorGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverGeneratorGoal_GoalWeight() {
		return (EAttribute)solverGeneratorGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverGeneratorGoal_GoalBound() {
		return (EAttribute)solverGeneratorGoalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverGeneratorGoal_Optimize() {
		return (EAttribute)solverGeneratorGoalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverGeneratorGoal_Constraint() {
		return (EAttribute)solverGeneratorGoalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolverGoalPreviousSolver() {
		return solverGoalPreviousSolverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolverGoalPreviousSolver_PreviousSolver() {
		return (EReference)solverGoalPreviousSolverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolverGoalPreviousSolver_PreviousSolution() {
		return (EReference)solverGoalPreviousSolverEClass.getEStructuralFeatures().get(1);
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
	public EReference getSolution_Provider() {
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
	public EAttribute getSolution_Code() {
		return (EAttribute)solutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_SolverAsInitialSolution() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Elements() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Vars() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Cons() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Goals() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolution__SolutionVarFactory() {
		return solutionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolution__SolutionConsFactory() {
		return solutionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolution__SolutionGoalFactory() {
		return solutionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolution__ConstructSolutionCons__GeneratorCons() {
		return solutionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolution__ConstructSolutionGoal__GeneratorGoal() {
		return solutionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolution__ConstructSolutionVar__GeneratorVar() {
		return solutionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolution__Dispose() {
		return solutionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionElement() {
		return solutionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionElement_Solution() {
		return (EReference)solutionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolutionElement__Dispose() {
		return solutionElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionLp() {
		return solutionLpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionLp_Value() {
		return (EAttribute)solutionLpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorVar() {
		return generatorVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorVar_Solution() {
		return (EReference)generatorVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorVar_SelectedSolutionValue() {
		return (EAttribute)generatorVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorVar__GetSolutionVar__Solution() {
		return generatorVarEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorVar__IsSolutionOne__Solution() {
		return generatorVarEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorVar__IsSolutionZero__Solution() {
		return generatorVarEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorVar__GetSolutionValue__Solution() {
		return generatorVarEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorVar__Build__Solver() {
		return generatorVarEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorLpVar() {
		return generatorLpVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorLpVar_Type() {
		return (EAttribute)generatorLpVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorLpVar_LowerBound() {
		return (EAttribute)generatorLpVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorLpVar_UpperBound() {
		return (EAttribute)generatorLpVarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorLpVar_LpTerm() {
		return (EReference)generatorLpVarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorCons() {
		return generatorConsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorCons_Solution() {
		return (EReference)generatorConsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorCons_NofTerms() {
		return (EAttribute)generatorConsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorCons__GetSolution__Solution() {
		return generatorConsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorCons__Build__Solver() {
		return generatorConsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorLpCons() {
		return generatorLpConsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorLpCons_Type() {
		return (EAttribute)generatorLpConsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorLpCons_RighHandSide() {
		return (EAttribute)generatorLpConsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorLpTerm() {
		return generatorLpTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorLpTerm_LpVar() {
		return (EReference)generatorLpTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorLpTerm_Coeff() {
		return (EAttribute)generatorLpTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorLpTerm_LpLinear() {
		return (EReference)generatorLpTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorLpTerm_Description() {
		return (EAttribute)generatorLpTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorLpConsCountElement() {
		return generatorLpConsCountElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorLpConsCountElement_ELpConsCount() {
		return (EReference)generatorLpConsCountElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorLpConsCountElement_ECount() {
		return (EAttribute)generatorLpConsCountElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorLpConsCountElement_EClass() {
		return (EAttribute)generatorLpConsCountElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorLpVarCountElement() {
		return generatorLpVarCountElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorLpVarCountElement_ELpVarCount() {
		return (EReference)generatorLpVarCountElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorLpVarCountElement_ECount() {
		return (EAttribute)generatorLpVarCountElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorLpVarCountElement_EClass() {
		return (EAttribute)generatorLpVarCountElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorLpVarCount() {
		return generatorLpVarCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorLpVarCount_ELpVarCountElement() {
		return (EReference)generatorLpVarCountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorLpVarCount_Generator() {
		return (EReference)generatorLpVarCountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorLpConsCount() {
		return generatorLpConsCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorLpConsCount_LpConsCountElement() {
		return (EReference)generatorLpConsCountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorLpConsCount_Generator() {
		return (EReference)generatorLpConsCountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorFeatureMode() {
		return generatorFeatureModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorFeatureMode_Generator() {
		return (EReference)generatorFeatureModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorFeatureMode_ObjetScope() {
		return (EReference)generatorFeatureModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorFeatureMode_Code() {
		return (EAttribute)generatorFeatureModeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorFeatureMode_ERemarks() {
		return (EAttribute)generatorFeatureModeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneratorFeatureMode__IsObjectInScope__GeneratorTuple() {
		return generatorFeatureModeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorConstraintEnabler() {
		return generatorConstraintEnablerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorVarOverflow() {
		return generatorVarOverflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorVarOverflow_CostOverFlow() {
		return (EAttribute)generatorVarOverflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorVarOverflow_MaxEnforce() {
		return (EAttribute)generatorVarOverflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolver() {
		return solverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_Remarks() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_Status() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_SolverMaxDuration() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_SolverLogLevel() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_SolverDump() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_RunStarted() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_RunInitializationEnded() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_RunSolvingEnded() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_RunFinalizationEnded() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_RunDurationInitialization() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_RunDurationFinalization() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_RunDurationSolving() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_RunRequestTerminate() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_SolUnfeasible() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_SolFeasible() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_SolOptimal() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_SolValue() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_RunInterrupted() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_RunTimeOut() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_Initializing() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolver_InitialSolution() {
		return (EReference)solverEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolver_Goals() {
		return (EReference)solverEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_Solving() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_Finalizing() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolver_Finished() {
		return (EAttribute)solverEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolver__Solve() {
		return solverEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolver__BuildVars() {
		return solverEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolver__BuildVar__GeneratorVar() {
		return solverEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolver__BuildLpVar__GeneratorLpVar() {
		return solverEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolver__BuildCons() {
		return solverEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolver__BuildLpGoal__GeneratorLpGoal_float() {
		return solverEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolver__BuildCons__GeneratorCons() {
		return solverEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolver__BuildLpCons__GeneratorLpCons() {
		return solverEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolver__BuildLpCons__GeneratorElement_GeneratorLpLinear_float_EnumLpConsType() {
		return solverEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolver__BuildGoals() {
		return solverEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolver__ConstructSolverGoal__GeneratorGoal() {
		return solverEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolver__ConstructSolverGoal__Solution() {
		return solverEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolver__ConstructSolverGoal__Solver() {
		return solverEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolver__MakeSolutionGoals__Solution() {
		return solverEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolverLp() {
		return solverLpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverLp_SolverOptimalityTolerance() {
		return (EAttribute)solverLpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverLp_SolverLinearRelaxation() {
		return (EAttribute)solverLpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverLp_SolOptimalityGap() {
		return (EAttribute)solverLpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionVar() {
		return solutionVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionVar_OptimalValue() {
		return (EAttribute)solutionVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionVar_Var() {
		return (EReference)solutionVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolutionVar__IsOne() {
		return solutionVarEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolutionVar__IsZero() {
		return solutionVarEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getILpWriter() {
		return iLpWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getILpWriter_FilePath() {
		return (EAttribute)iLpWriterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getILpWriter_FileFormat() {
		return (EAttribute)iLpWriterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getILpWriter_FileCompressed() {
		return (EAttribute)iLpWriterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getILpWriter__WriteLpToFile() {
		return iLpWriterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getILpWriter__GetLpAsString() {
		return iLpWriterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionReader() {
		return solutionReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionReader_FilePath() {
		return (EAttribute)solutionReaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolutionReader__ReadSolFromFile() {
		return solutionReaderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolutionReader__SetSolAsString__String() {
		return solutionReaderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionReaderPattern() {
		return solutionReaderPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionReaderPattern_LinePattern() {
		return (EAttribute)solutionReaderPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionReaderPattern_VarNameGroup() {
		return (EAttribute)solutionReaderPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionReaderPattern_VarOptimalValueGroup() {
		return (EAttribute)solutionReaderPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionReaderPattern_VarObjectiveCoefGroup() {
		return (EAttribute)solutionReaderPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionReaderPattern_FirstLine() {
		return (EAttribute)solutionReaderPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionLpVar() {
		return solutionLpVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionCons() {
		return solutionConsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionCons_Cons() {
		return (EReference)solutionConsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionLpCons() {
		return solutionLpConsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionGoal() {
		return solutionGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionGoal_Goal() {
		return (EReference)solutionGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionGoal_Label() {
		return (EAttribute)solutionGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionGoal_Constrained() {
		return (EAttribute)solutionGoalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionGoal_Optimized() {
		return (EAttribute)solutionGoalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionGoal_Bound() {
		return (EAttribute)solutionGoalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolutionGoal__Refresh() {
		return solutionGoalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolutionGoal__BuildGoalAsPreviousSolver__Solver() {
		return solutionGoalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionLpGoal() {
		return solutionLpGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionLpGoal_Value() {
		return (EAttribute)solutionLpGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorCpCons() {
		return generatorCpConsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorCpCons_Post() {
		return (EAttribute)generatorCpConsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorCpLinear() {
		return generatorCpLinearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorCpLinear_Type() {
		return (EAttribute)generatorCpLinearEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorCpLinear_RightHandSide() {
		return (EAttribute)generatorCpLinearEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorCpLinear_Term() {
		return (EReference)generatorCpLinearEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorCpLogical() {
		return generatorCpLogicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorCpLogical_Term() {
		return (EReference)generatorCpLogicalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorCpLogical_Not() {
		return (EAttribute)generatorCpLogicalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorCpLogical_Type() {
		return (EAttribute)generatorCpLogicalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorCpVar() {
		return generatorCpVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorCpVar_Priority() {
		return (EAttribute)generatorCpVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorCpVarAtomic() {
		return generatorCpVarAtomicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorCpVarAtomic_LowerBound() {
		return (EAttribute)generatorCpVarAtomicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorCpVarAtomic_UpperBound() {
		return (EAttribute)generatorCpVarAtomicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorCpLinearTerm() {
		return generatorCpLinearTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorCpLinearTerm_Coeff() {
		return (EAttribute)generatorCpLinearTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorCpLinearTerm_CpVar() {
		return (EReference)generatorCpLinearTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorCpLogicalTerm() {
		return generatorCpLogicalTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorCpLogicalTerm_Not() {
		return (EAttribute)generatorCpLogicalTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorCpLogicalTerm_CpCons() {
		return (EReference)generatorCpLogicalTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionCpVar() {
		return solutionCpVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolverCp() {
		return solverCpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverCp_SearchAll() {
		return (EAttribute)solverCpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getITupleVisitor() {
		return iTupleVisitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIGeneratorTool() {
		return iGeneratorToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGeneratorTool__GetGenerator() {
		return iGeneratorToolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGeneratorTool__Dispose() {
		return iGeneratorToolEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionProvider() {
		return solutionProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionProvider_Solution() {
		return (EReference)solutionProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionProvider_CurrentSolutionNr() {
		return (EAttribute)solutionProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionProvider_Code() {
		return (EAttribute)solutionProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolutionProvider__SolutionFactory() {
		return solutionProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolutionProvider__ConstructSolution() {
		return solutionProviderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumLpVarType() {
		return enumLpVarTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumLpConsType() {
		return enumLpConsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumObjectiveType() {
		return enumObjectiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumSolverLogLevel() {
		return enumSolverLogLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumCpLinearType() {
		return enumCpLinearTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumCpLogicalType() {
		return enumCpLogicalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumLpFileFormat() {
		return enumLpFileFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverFactory getSolverFactory() {
		return (SolverFactory)getEFactoryInstance();
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
		generatorEClass = createEClass(GENERATOR);
		createEReference(generatorEClass, GENERATOR__TUPLE_ROOT);
		createEReference(generatorEClass, GENERATOR__GOALS);
		createEReference(generatorEClass, GENERATOR__GENERATOR_FEATURE_MODES);
		createEReference(generatorEClass, GENERATOR__SOLUTION_PROVIDER);
		createEAttribute(generatorEClass, GENERATOR__REMARKS);
		createEAttribute(generatorEClass, GENERATOR__FOOTPRINT_NOF_VARS);
		createEAttribute(generatorEClass, GENERATOR__FOOTPRINT_NOF_CONS);
		createEAttribute(generatorEClass, GENERATOR__FOOTPRINT_NOF_TERMS);
		createEAttribute(generatorEClass, GENERATOR__COUNT_CONS);
		createEAttribute(generatorEClass, GENERATOR__COUNT_VARS);
		createEReference(generatorEClass, GENERATOR__ELP_VAR_COUNT);
		createEReference(generatorEClass, GENERATOR__ELP_CONS_COUNT);
		createEAttribute(generatorEClass, GENERATOR__CODE);
		createEReference(generatorEClass, GENERATOR__SELECTED);
		createEOperation(generatorEClass, GENERATOR___GENERATE);
		createEOperation(generatorEClass, GENERATOR___GENERATE_ROOT_TUPLES);
		createEOperation(generatorEClass, GENERATOR___GENERATE_TUPLES);
		createEOperation(generatorEClass, GENERATOR___GENERATE_TUPLE_XREFERENCES);
		createEOperation(generatorEClass, GENERATOR___GENERATE_VARS);
		createEOperation(generatorEClass, GENERATOR___GENERATE_CONS);
		createEOperation(generatorEClass, GENERATOR___GENERATE_GOALS);
		createEOperation(generatorEClass, GENERATOR___ACCEPT_SOLUTION__SOLUTION);
		createEOperation(generatorEClass, GENERATOR___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE);
		createEOperation(generatorEClass, GENERATOR___VISIT_TUPLES__ITUPLEVISITOR);
		createEOperation(generatorEClass, GENERATOR___REFRESH_SELECTED_SOLUTION);

		generatorElementEClass = createEClass(GENERATOR_ELEMENT);
		createEAttribute(generatorElementEClass, GENERATOR_ELEMENT__CODE);
		createEOperation(generatorElementEClass, GENERATOR_ELEMENT___GET_GENERATOR);
		createEOperation(generatorElementEClass, GENERATOR_ELEMENT___REFRESH_SELECTED_SOLUTION);

		generatorTupleEClass = createEClass(GENERATOR_TUPLE);
		createEReference(generatorTupleEClass, GENERATOR_TUPLE__GENERATOR_AS_ROOT);
		createEReference(generatorTupleEClass, GENERATOR_TUPLE__TUPLE_ELEMENT);
		createEReference(generatorTupleEClass, GENERATOR_TUPLE__TUPLE_CONTAINER);
		createEReference(generatorTupleEClass, GENERATOR_TUPLE__VAR);
		createEReference(generatorTupleEClass, GENERATOR_TUPLE__CONS);
		createEAttribute(generatorTupleEClass, GENERATOR_TUPLE__NAME);
		createEReference(generatorTupleEClass, GENERATOR_TUPLE__MEMBERS);
		createEOperation(generatorTupleEClass, GENERATOR_TUPLE___GENERATE_VARS);
		createEOperation(generatorTupleEClass, GENERATOR_TUPLE___GENERATE_CONS);
		createEOperation(generatorTupleEClass, GENERATOR_TUPLE___GENERATE_TUPLES);
		createEOperation(generatorTupleEClass, GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR);
		createEOperation(generatorTupleEClass, GENERATOR_TUPLE___GENERATE_XREFERENCES);

		generatorTupleMemberEClass = createEClass(GENERATOR_TUPLE_MEMBER);
		createEAttribute(generatorTupleMemberEClass, GENERATOR_TUPLE_MEMBER__NAME);
		createEReference(generatorTupleMemberEClass, GENERATOR_TUPLE_MEMBER__TUPLE);
		createEAttribute(generatorTupleMemberEClass, GENERATOR_TUPLE_MEMBER__SELECTED_SOLUTION_DISPLAY);
		createEAttribute(generatorTupleMemberEClass, GENERATOR_TUPLE_MEMBER__LABEL);

		generatorVarEClass = createEClass(GENERATOR_VAR);
		createEReference(generatorVarEClass, GENERATOR_VAR__SOLUTION);
		createEAttribute(generatorVarEClass, GENERATOR_VAR__SELECTED_SOLUTION_VALUE);
		createEOperation(generatorVarEClass, GENERATOR_VAR___GET_SOLUTION_VAR__SOLUTION);
		createEOperation(generatorVarEClass, GENERATOR_VAR___IS_SOLUTION_ONE__SOLUTION);
		createEOperation(generatorVarEClass, GENERATOR_VAR___IS_SOLUTION_ZERO__SOLUTION);
		createEOperation(generatorVarEClass, GENERATOR_VAR___GET_SOLUTION_VALUE__SOLUTION);
		createEOperation(generatorVarEClass, GENERATOR_VAR___BUILD__SOLVER);

		generatorLpVarEClass = createEClass(GENERATOR_LP_VAR);
		createEAttribute(generatorLpVarEClass, GENERATOR_LP_VAR__TYPE);
		createEAttribute(generatorLpVarEClass, GENERATOR_LP_VAR__LOWER_BOUND);
		createEAttribute(generatorLpVarEClass, GENERATOR_LP_VAR__UPPER_BOUND);
		createEReference(generatorLpVarEClass, GENERATOR_LP_VAR__LP_TERM);

		generatorConsEClass = createEClass(GENERATOR_CONS);
		createEReference(generatorConsEClass, GENERATOR_CONS__SOLUTION);
		createEAttribute(generatorConsEClass, GENERATOR_CONS__NOF_TERMS);
		createEOperation(generatorConsEClass, GENERATOR_CONS___GET_SOLUTION__SOLUTION);
		createEOperation(generatorConsEClass, GENERATOR_CONS___BUILD__SOLVER);

		generatorLpConsEClass = createEClass(GENERATOR_LP_CONS);
		createEAttribute(generatorLpConsEClass, GENERATOR_LP_CONS__TYPE);
		createEAttribute(generatorLpConsEClass, GENERATOR_LP_CONS__RIGH_HAND_SIDE);

		generatorLpTermEClass = createEClass(GENERATOR_LP_TERM);
		createEReference(generatorLpTermEClass, GENERATOR_LP_TERM__LP_VAR);
		createEAttribute(generatorLpTermEClass, GENERATOR_LP_TERM__COEFF);
		createEReference(generatorLpTermEClass, GENERATOR_LP_TERM__LP_LINEAR);
		createEAttribute(generatorLpTermEClass, GENERATOR_LP_TERM__DESCRIPTION);

		generatorLpConsCountElementEClass = createEClass(GENERATOR_LP_CONS_COUNT_ELEMENT);
		createEReference(generatorLpConsCountElementEClass, GENERATOR_LP_CONS_COUNT_ELEMENT__ELP_CONS_COUNT);
		createEAttribute(generatorLpConsCountElementEClass, GENERATOR_LP_CONS_COUNT_ELEMENT__ECOUNT);
		createEAttribute(generatorLpConsCountElementEClass, GENERATOR_LP_CONS_COUNT_ELEMENT__ECLASS);

		generatorLpVarCountElementEClass = createEClass(GENERATOR_LP_VAR_COUNT_ELEMENT);
		createEReference(generatorLpVarCountElementEClass, GENERATOR_LP_VAR_COUNT_ELEMENT__ELP_VAR_COUNT);
		createEAttribute(generatorLpVarCountElementEClass, GENERATOR_LP_VAR_COUNT_ELEMENT__ECOUNT);
		createEAttribute(generatorLpVarCountElementEClass, GENERATOR_LP_VAR_COUNT_ELEMENT__ECLASS);

		generatorLpVarCountEClass = createEClass(GENERATOR_LP_VAR_COUNT);
		createEReference(generatorLpVarCountEClass, GENERATOR_LP_VAR_COUNT__ELP_VAR_COUNT_ELEMENT);
		createEReference(generatorLpVarCountEClass, GENERATOR_LP_VAR_COUNT__GENERATOR);

		generatorLpConsCountEClass = createEClass(GENERATOR_LP_CONS_COUNT);
		createEReference(generatorLpConsCountEClass, GENERATOR_LP_CONS_COUNT__LP_CONS_COUNT_ELEMENT);
		createEReference(generatorLpConsCountEClass, GENERATOR_LP_CONS_COUNT__GENERATOR);

		generatorFeatureModeEClass = createEClass(GENERATOR_FEATURE_MODE);
		createEReference(generatorFeatureModeEClass, GENERATOR_FEATURE_MODE__GENERATOR);
		createEReference(generatorFeatureModeEClass, GENERATOR_FEATURE_MODE__OBJET_SCOPE);
		createEAttribute(generatorFeatureModeEClass, GENERATOR_FEATURE_MODE__CODE);
		createEAttribute(generatorFeatureModeEClass, GENERATOR_FEATURE_MODE__EREMARKS);
		createEOperation(generatorFeatureModeEClass, GENERATOR_FEATURE_MODE___IS_OBJECT_IN_SCOPE__GENERATORTUPLE);

		generatorConstraintEnablerEClass = createEClass(GENERATOR_CONSTRAINT_ENABLER);

		generatorVarOverflowEClass = createEClass(GENERATOR_VAR_OVERFLOW);
		createEAttribute(generatorVarOverflowEClass, GENERATOR_VAR_OVERFLOW__COST_OVER_FLOW);
		createEAttribute(generatorVarOverflowEClass, GENERATOR_VAR_OVERFLOW__MAX_ENFORCE);

		iGeneratorToolEClass = createEClass(IGENERATOR_TOOL);
		createEOperation(iGeneratorToolEClass, IGENERATOR_TOOL___GET_GENERATOR);
		createEOperation(iGeneratorToolEClass, IGENERATOR_TOOL___DISPOSE);

		solutionReaderEClass = createEClass(SOLUTION_READER);
		createEAttribute(solutionReaderEClass, SOLUTION_READER__FILE_PATH);
		createEOperation(solutionReaderEClass, SOLUTION_READER___READ_SOL_FROM_FILE);
		createEOperation(solutionReaderEClass, SOLUTION_READER___SET_SOL_AS_STRING__STRING);

		solutionReaderPatternEClass = createEClass(SOLUTION_READER_PATTERN);
		createEAttribute(solutionReaderPatternEClass, SOLUTION_READER_PATTERN__LINE_PATTERN);
		createEAttribute(solutionReaderPatternEClass, SOLUTION_READER_PATTERN__VAR_NAME_GROUP);
		createEAttribute(solutionReaderPatternEClass, SOLUTION_READER_PATTERN__VAR_OPTIMAL_VALUE_GROUP);
		createEAttribute(solutionReaderPatternEClass, SOLUTION_READER_PATTERN__VAR_OBJECTIVE_COEF_GROUP);
		createEAttribute(solutionReaderPatternEClass, SOLUTION_READER_PATTERN__FIRST_LINE);

		iLpWriterEClass = createEClass(ILP_WRITER);
		createEAttribute(iLpWriterEClass, ILP_WRITER__FILE_PATH);
		createEAttribute(iLpWriterEClass, ILP_WRITER__FILE_FORMAT);
		createEAttribute(iLpWriterEClass, ILP_WRITER__FILE_COMPRESSED);
		createEOperation(iLpWriterEClass, ILP_WRITER___WRITE_LP_TO_FILE);
		createEOperation(iLpWriterEClass, ILP_WRITER___GET_LP_AS_STRING);

		solutionProviderEClass = createEClass(SOLUTION_PROVIDER);
		createEReference(solutionProviderEClass, SOLUTION_PROVIDER__SOLUTION);
		createEAttribute(solutionProviderEClass, SOLUTION_PROVIDER__CURRENT_SOLUTION_NR);
		createEAttribute(solutionProviderEClass, SOLUTION_PROVIDER__CODE);
		createEOperation(solutionProviderEClass, SOLUTION_PROVIDER___SOLUTION_FACTORY);
		createEOperation(solutionProviderEClass, SOLUTION_PROVIDER___CONSTRUCT_SOLUTION);

		solverEClass = createEClass(SOLVER);
		createEAttribute(solverEClass, SOLVER__REMARKS);
		createEAttribute(solverEClass, SOLVER__STATUS);
		createEAttribute(solverEClass, SOLVER__SOLVER_MAX_DURATION);
		createEAttribute(solverEClass, SOLVER__SOLVER_LOG_LEVEL);
		createEAttribute(solverEClass, SOLVER__SOLVER_DUMP);
		createEAttribute(solverEClass, SOLVER__RUN_STARTED);
		createEAttribute(solverEClass, SOLVER__RUN_INITIALIZATION_ENDED);
		createEAttribute(solverEClass, SOLVER__RUN_SOLVING_ENDED);
		createEAttribute(solverEClass, SOLVER__RUN_FINALIZATION_ENDED);
		createEAttribute(solverEClass, SOLVER__RUN_DURATION_INITIALIZATION);
		createEAttribute(solverEClass, SOLVER__RUN_DURATION_FINALIZATION);
		createEAttribute(solverEClass, SOLVER__RUN_DURATION_SOLVING);
		createEAttribute(solverEClass, SOLVER__RUN_REQUEST_TERMINATE);
		createEAttribute(solverEClass, SOLVER__RUN_TIME_OUT);
		createEAttribute(solverEClass, SOLVER__SOL_UNFEASIBLE);
		createEAttribute(solverEClass, SOLVER__SOL_FEASIBLE);
		createEAttribute(solverEClass, SOLVER__SOL_OPTIMAL);
		createEAttribute(solverEClass, SOLVER__SOL_VALUE);
		createEAttribute(solverEClass, SOLVER__RUN_INTERRUPTED);
		createEAttribute(solverEClass, SOLVER__INITIALIZING);
		createEAttribute(solverEClass, SOLVER__SOLVING);
		createEAttribute(solverEClass, SOLVER__FINALIZING);
		createEAttribute(solverEClass, SOLVER__FINISHED);
		createEReference(solverEClass, SOLVER__INITIAL_SOLUTION);
		createEReference(solverEClass, SOLVER__GOALS);
		createEOperation(solverEClass, SOLVER___SOLVE);
		createEOperation(solverEClass, SOLVER___BUILD_VARS);
		createEOperation(solverEClass, SOLVER___BUILD_VAR__GENERATORVAR);
		createEOperation(solverEClass, SOLVER___BUILD_LP_VAR__GENERATORLPVAR);
		createEOperation(solverEClass, SOLVER___BUILD_CONS);
		createEOperation(solverEClass, SOLVER___BUILD_CONS__GENERATORCONS);
		createEOperation(solverEClass, SOLVER___BUILD_LP_CONS__GENERATORLPCONS);
		createEOperation(solverEClass, SOLVER___BUILD_LP_CONS__GENERATORELEMENT_GENERATORLPLINEAR_FLOAT_ENUMLPCONSTYPE);
		createEOperation(solverEClass, SOLVER___BUILD_GOALS);
		createEOperation(solverEClass, SOLVER___BUILD_LP_GOAL__GENERATORLPGOAL_FLOAT);
		createEOperation(solverEClass, SOLVER___CONSTRUCT_SOLVER_GOAL__GENERATORGOAL);
		createEOperation(solverEClass, SOLVER___CONSTRUCT_SOLVER_GOAL__SOLUTION);
		createEOperation(solverEClass, SOLVER___CONSTRUCT_SOLVER_GOAL__SOLVER);
		createEOperation(solverEClass, SOLVER___MAKE_SOLUTION_GOALS__SOLUTION);

		solverCpEClass = createEClass(SOLVER_CP);
		createEAttribute(solverCpEClass, SOLVER_CP__SEARCH_ALL);

		solverLpEClass = createEClass(SOLVER_LP);
		createEAttribute(solverLpEClass, SOLVER_LP__SOLVER_OPTIMALITY_TOLERANCE);
		createEAttribute(solverLpEClass, SOLVER_LP__SOLVER_LINEAR_RELAXATION);
		createEAttribute(solverLpEClass, SOLVER_LP__SOL_OPTIMALITY_GAP);

		solverGoalEClass = createEClass(SOLVER_GOAL);
		createEAttribute(solverGoalEClass, SOLVER_GOAL__LABEL);
		createEReference(solverGoalEClass, SOLVER_GOAL__SOLVER);
		createEOperation(solverGoalEClass, SOLVER_GOAL___BUILD_GOAL);

		solverGeneratorGoalEClass = createEClass(SOLVER_GENERATOR_GOAL);
		createEReference(solverGeneratorGoalEClass, SOLVER_GENERATOR_GOAL__GOAL_TO_SOLVE);
		createEAttribute(solverGeneratorGoalEClass, SOLVER_GENERATOR_GOAL__GOAL_WEIGHT);
		createEAttribute(solverGeneratorGoalEClass, SOLVER_GENERATOR_GOAL__GOAL_BOUND);
		createEAttribute(solverGeneratorGoalEClass, SOLVER_GENERATOR_GOAL__OPTIMIZE);
		createEAttribute(solverGeneratorGoalEClass, SOLVER_GENERATOR_GOAL__CONSTRAINT);

		solverGoalPreviousSolverEClass = createEClass(SOLVER_GOAL_PREVIOUS_SOLVER);
		createEReference(solverGoalPreviousSolverEClass, SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLVER);
		createEReference(solverGoalPreviousSolverEClass, SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLUTION);

		solutionEClass = createEClass(SOLUTION);
		createEReference(solutionEClass, SOLUTION__PROVIDER);
		createEAttribute(solutionEClass, SOLUTION__SOLUTION_NR);
		createEAttribute(solutionEClass, SOLUTION__CODE);
		createEReference(solutionEClass, SOLUTION__SOLVER_AS_INITIAL_SOLUTION);
		createEReference(solutionEClass, SOLUTION__ELEMENTS);
		createEReference(solutionEClass, SOLUTION__VARS);
		createEReference(solutionEClass, SOLUTION__CONS);
		createEReference(solutionEClass, SOLUTION__GOALS);
		createEOperation(solutionEClass, SOLUTION___SOLUTION_VAR_FACTORY);
		createEOperation(solutionEClass, SOLUTION___SOLUTION_CONS_FACTORY);
		createEOperation(solutionEClass, SOLUTION___SOLUTION_GOAL_FACTORY);
		createEOperation(solutionEClass, SOLUTION___CONSTRUCT_SOLUTION_VAR__GENERATORVAR);
		createEOperation(solutionEClass, SOLUTION___CONSTRUCT_SOLUTION_CONS__GENERATORCONS);
		createEOperation(solutionEClass, SOLUTION___CONSTRUCT_SOLUTION_GOAL__GENERATORGOAL);
		createEOperation(solutionEClass, SOLUTION___DISPOSE);

		solutionElementEClass = createEClass(SOLUTION_ELEMENT);
		createEReference(solutionElementEClass, SOLUTION_ELEMENT__SOLUTION);
		createEOperation(solutionElementEClass, SOLUTION_ELEMENT___DISPOSE);

		solutionLpEClass = createEClass(SOLUTION_LP);
		createEAttribute(solutionLpEClass, SOLUTION_LP__VALUE);

		solutionVarEClass = createEClass(SOLUTION_VAR);
		createEAttribute(solutionVarEClass, SOLUTION_VAR__OPTIMAL_VALUE);
		createEReference(solutionVarEClass, SOLUTION_VAR__VAR);
		createEOperation(solutionVarEClass, SOLUTION_VAR___IS_ONE);
		createEOperation(solutionVarEClass, SOLUTION_VAR___IS_ZERO);

		solutionLpVarEClass = createEClass(SOLUTION_LP_VAR);

		solutionCpVarEClass = createEClass(SOLUTION_CP_VAR);

		solutionConsEClass = createEClass(SOLUTION_CONS);
		createEReference(solutionConsEClass, SOLUTION_CONS__CONS);

		solutionLpConsEClass = createEClass(SOLUTION_LP_CONS);

		solutionGoalEClass = createEClass(SOLUTION_GOAL);
		createEReference(solutionGoalEClass, SOLUTION_GOAL__GOAL);
		createEAttribute(solutionGoalEClass, SOLUTION_GOAL__LABEL);
		createEAttribute(solutionGoalEClass, SOLUTION_GOAL__CONSTRAINED);
		createEAttribute(solutionGoalEClass, SOLUTION_GOAL__OPTIMIZED);
		createEAttribute(solutionGoalEClass, SOLUTION_GOAL__BOUND);
		createEOperation(solutionGoalEClass, SOLUTION_GOAL___REFRESH);
		createEOperation(solutionGoalEClass, SOLUTION_GOAL___BUILD_GOAL_AS_PREVIOUS_SOLVER__SOLVER);

		solutionLpGoalEClass = createEClass(SOLUTION_LP_GOAL);
		createEAttribute(solutionLpGoalEClass, SOLUTION_LP_GOAL__VALUE);

		generatorCpConsEClass = createEClass(GENERATOR_CP_CONS);
		createEAttribute(generatorCpConsEClass, GENERATOR_CP_CONS__POST);

		generatorCpLinearEClass = createEClass(GENERATOR_CP_LINEAR);
		createEAttribute(generatorCpLinearEClass, GENERATOR_CP_LINEAR__TYPE);
		createEAttribute(generatorCpLinearEClass, GENERATOR_CP_LINEAR__RIGHT_HAND_SIDE);
		createEReference(generatorCpLinearEClass, GENERATOR_CP_LINEAR__TERM);

		generatorCpLogicalEClass = createEClass(GENERATOR_CP_LOGICAL);
		createEReference(generatorCpLogicalEClass, GENERATOR_CP_LOGICAL__TERM);
		createEAttribute(generatorCpLogicalEClass, GENERATOR_CP_LOGICAL__NOT);
		createEAttribute(generatorCpLogicalEClass, GENERATOR_CP_LOGICAL__TYPE);

		generatorCpVarEClass = createEClass(GENERATOR_CP_VAR);
		createEAttribute(generatorCpVarEClass, GENERATOR_CP_VAR__PRIORITY);

		generatorCpVarAtomicEClass = createEClass(GENERATOR_CP_VAR_ATOMIC);
		createEAttribute(generatorCpVarAtomicEClass, GENERATOR_CP_VAR_ATOMIC__LOWER_BOUND);
		createEAttribute(generatorCpVarAtomicEClass, GENERATOR_CP_VAR_ATOMIC__UPPER_BOUND);

		generatorCpLinearTermEClass = createEClass(GENERATOR_CP_LINEAR_TERM);
		createEAttribute(generatorCpLinearTermEClass, GENERATOR_CP_LINEAR_TERM__COEFF);
		createEReference(generatorCpLinearTermEClass, GENERATOR_CP_LINEAR_TERM__CP_VAR);

		generatorCpLogicalTermEClass = createEClass(GENERATOR_CP_LOGICAL_TERM);
		createEAttribute(generatorCpLogicalTermEClass, GENERATOR_CP_LOGICAL_TERM__NOT);
		createEReference(generatorCpLogicalTermEClass, GENERATOR_CP_LOGICAL_TERM__CP_CONS);

		generatorGoalEClass = createEClass(GENERATOR_GOAL);
		createEReference(generatorGoalEClass, GENERATOR_GOAL__GENERATOR);
		createEAttribute(generatorGoalEClass, GENERATOR_GOAL__NAME);
		createEAttribute(generatorGoalEClass, GENERATOR_GOAL__SELECTED_SOLUTION_DISPLAY);
		createEAttribute(generatorGoalEClass, GENERATOR_GOAL__LABEL);
		createEReference(generatorGoalEClass, GENERATOR_GOAL__SOLUTION);
		createEOperation(generatorGoalEClass, GENERATOR_GOAL___BUILD__SOLVER_FLOAT);
		createEOperation(generatorGoalEClass, GENERATOR_GOAL___BUILD_CONS__SOLVER_FLOAT);
		createEOperation(generatorGoalEClass, GENERATOR_GOAL___GET_SOLUTION_GOAL__SOLUTION);

		generatorLpGoalEClass = createEClass(GENERATOR_LP_GOAL);
		createEAttribute(generatorLpGoalEClass, GENERATOR_LP_GOAL__OBJECTIVE_TYPE);
		createEAttribute(generatorLpGoalEClass, GENERATOR_LP_GOAL__SELECTED_SOLUTION_VALUE);
		createEOperation(generatorLpGoalEClass, GENERATOR_LP_GOAL___GET_SOLUTION_VALUE__SOLUTION);

		generatorLpLinearEClass = createEClass(GENERATOR_LP_LINEAR);
		createEReference(generatorLpLinearEClass, GENERATOR_LP_LINEAR__LP_TERM);
		createEOperation(generatorLpLinearEClass, GENERATOR_LP_LINEAR___CONSTRUCT_TERM__GENERATORLPVAR_FLOAT);

		// Create enums
		enumLpVarTypeEEnum = createEEnum(ENUM_LP_VAR_TYPE);
		enumLpConsTypeEEnum = createEEnum(ENUM_LP_CONS_TYPE);
		enumObjectiveTypeEEnum = createEEnum(ENUM_OBJECTIVE_TYPE);
		enumSolverLogLevelEEnum = createEEnum(ENUM_SOLVER_LOG_LEVEL);
		enumCpLinearTypeEEnum = createEEnum(ENUM_CP_LINEAR_TYPE);
		enumCpLogicalTypeEEnum = createEEnum(ENUM_CP_LOGICAL_TYPE);
		enumLpFileFormatEEnum = createEEnum(ENUM_LP_FILE_FORMAT);

		// Create data types
		iTupleVisitorEDataType = createEDataType(ITUPLE_VISITOR);
		exceptionEDataType = createEDataType(EXCEPTION);
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
		JobPackage theJobPackage = (JobPackage)EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		generatorEClass.getESuperTypes().add(theJobPackage.getRun());
		generatorTupleEClass.getESuperTypes().add(this.getGeneratorElement());
		generatorTupleMemberEClass.getESuperTypes().add(this.getGeneratorElement());
		generatorVarEClass.getESuperTypes().add(this.getGeneratorTupleMember());
		generatorLpVarEClass.getESuperTypes().add(this.getGeneratorVar());
		generatorConsEClass.getESuperTypes().add(this.getGeneratorTupleMember());
		generatorLpConsEClass.getESuperTypes().add(this.getGeneratorCons());
		generatorLpConsEClass.getESuperTypes().add(this.getGeneratorLpLinear());
		generatorConstraintEnablerEClass.getESuperTypes().add(this.getGeneratorFeatureMode());
		generatorVarOverflowEClass.getESuperTypes().add(this.getGeneratorFeatureMode());
		solutionReaderEClass.getESuperTypes().add(this.getSolutionProvider());
		solutionReaderPatternEClass.getESuperTypes().add(this.getSolutionReader());
		iLpWriterEClass.getESuperTypes().add(this.getIGeneratorTool());
		solutionProviderEClass.getESuperTypes().add(theJobPackage.getRun());
		solutionProviderEClass.getESuperTypes().add(this.getIGeneratorTool());
		solverEClass.getESuperTypes().add(this.getSolutionProvider());
		solverCpEClass.getESuperTypes().add(this.getSolver());
		solverLpEClass.getESuperTypes().add(this.getSolver());
		solverGeneratorGoalEClass.getESuperTypes().add(this.getSolverGoal());
		solverGoalPreviousSolverEClass.getESuperTypes().add(this.getSolverGoal());
		solutionLpEClass.getESuperTypes().add(this.getSolution());
		solutionVarEClass.getESuperTypes().add(this.getSolutionElement());
		solutionLpVarEClass.getESuperTypes().add(this.getSolutionVar());
		solutionCpVarEClass.getESuperTypes().add(this.getSolutionVar());
		solutionConsEClass.getESuperTypes().add(this.getSolutionElement());
		solutionLpConsEClass.getESuperTypes().add(this.getSolutionCons());
		solutionGoalEClass.getESuperTypes().add(this.getSolutionElement());
		solutionLpGoalEClass.getESuperTypes().add(this.getSolutionGoal());
		generatorCpConsEClass.getESuperTypes().add(this.getGeneratorCons());
		generatorCpLinearEClass.getESuperTypes().add(this.getGeneratorCpCons());
		generatorCpLogicalEClass.getESuperTypes().add(this.getGeneratorCpCons());
		generatorCpVarEClass.getESuperTypes().add(this.getGeneratorVar());
		generatorCpVarAtomicEClass.getESuperTypes().add(this.getGeneratorCpVar());
		generatorGoalEClass.getESuperTypes().add(this.getGeneratorElement());
		generatorLpGoalEClass.getESuperTypes().add(this.getGeneratorGoal());
		generatorLpGoalEClass.getESuperTypes().add(this.getGeneratorLpLinear());

		// Initialize classes, features, and operations; add parameters
		initEClass(generatorEClass, Generator.class, "Generator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenerator_TupleRoot(), this.getGeneratorTuple(), this.getGeneratorTuple_GeneratorAsRoot(), "TupleRoot", null, 0, -1, Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGenerator_Goals(), this.getGeneratorGoal(), this.getGeneratorGoal_Generator(), "Goals", null, 0, -1, Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGenerator_GeneratorFeatureModes(), this.getGeneratorFeatureMode(), this.getGeneratorFeatureMode_Generator(), "GeneratorFeatureModes", null, 0, -1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenerator_SolutionProvider(), this.getSolutionProvider(), null, "SolutionProvider", null, 0, -1, Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerator_Remarks(), ecorePackage.getEString(), "Remarks", null, 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerator_FootprintNofVars(), ecorePackage.getEInt(), "FootprintNofVars", null, 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerator_FootprintNofCons(), ecorePackage.getEInt(), "FootprintNofCons", null, 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerator_FootprintNofTerms(), ecorePackage.getEInt(), "FootprintNofTerms", null, 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerator_CountCons(), ecorePackage.getEBoolean(), "CountCons", null, 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerator_CountVars(), ecorePackage.getEBoolean(), "CountVars", null, 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenerator_ELpVarCount(), this.getGeneratorLpVarCount(), this.getGeneratorLpVarCount_Generator(), "ELpVarCount", null, 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenerator_ELpConsCount(), this.getGeneratorLpConsCount(), this.getGeneratorLpConsCount_Generator(), "ELpConsCount", null, 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerator_Code(), ecorePackage.getEString(), "Code", null, 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenerator_Selected(), this.getSolution(), null, "Selected", null, 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGenerator__Generate(), theJobPackage.getReturnFeedback(), "generate", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getGenerator__GenerateRootTuples(), null, "generateRootTuples", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getGenerator__GenerateTuples(), null, "generateTuples", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getGenerator__GenerateTupleXReferences(), null, "generateTupleXReferences", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getGenerator__GenerateVars(), null, "generateVars", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getGenerator__GenerateCons(), null, "generateCons", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getGenerator__GenerateGoals(), null, "generateGoals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getGenerator__AcceptSolution__Solution(), null, "acceptSolution", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolution(), "solutionprovider", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGenerator__SelectFeatureMode__GeneratorFeatureMode_GeneratorTuple(), this.getGeneratorFeatureMode(), "selectFeatureMode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorFeatureMode(), "feature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorTuple(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGenerator__VisitTuples__ITupleVisitor(), null, "visitTuples", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getITupleVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEOperation(getGenerator__RefreshSelectedSolution(), null, "refreshSelectedSolution", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(generatorElementEClass, GeneratorElement.class, "GeneratorElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorElement_Code(), ecorePackage.getEString(), "Code", null, 0, 1, GeneratorElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getGeneratorElement__GetGenerator(), this.getGenerator(), "getGenerator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGeneratorElement__RefreshSelectedSolution(), null, "refreshSelectedSolution", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(generatorTupleEClass, GeneratorTuple.class, "GeneratorTuple", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorTuple_GeneratorAsRoot(), this.getGenerator(), this.getGenerator_TupleRoot(), "GeneratorAsRoot", null, 0, 1, GeneratorTuple.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorTuple_TupleElement(), this.getGeneratorTuple(), this.getGeneratorTuple_TupleContainer(), "TupleElement", null, 0, -1, GeneratorTuple.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorTuple_TupleContainer(), this.getGeneratorTuple(), this.getGeneratorTuple_TupleElement(), "TupleContainer", null, 0, 1, GeneratorTuple.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorTuple_Var(), this.getGeneratorVar(), null, "Var", null, 0, -1, GeneratorTuple.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorTuple_Cons(), this.getGeneratorCons(), null, "Cons", null, 0, -1, GeneratorTuple.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorTuple_Name(), ecorePackage.getEString(), "Name", null, 0, 1, GeneratorTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorTuple_Members(), this.getGeneratorTupleMember(), this.getGeneratorTupleMember_Tuple(), "Members", null, 0, -1, GeneratorTuple.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getGeneratorTuple__GenerateVars(), null, "generateVars", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGeneratorTuple__GenerateCons(), null, "generateCons", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGeneratorTuple__GenerateTuples(), null, "generateTuples", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGeneratorTuple__VisitTuples__ITupleVisitor(), null, "visitTuples", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getITupleVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEOperation(getGeneratorTuple__GenerateXReferences(), null, "generateXReferences", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(generatorTupleMemberEClass, GeneratorTupleMember.class, "GeneratorTupleMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorTupleMember_Name(), ecorePackage.getEString(), "Name", null, 0, 1, GeneratorTupleMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorTupleMember_Tuple(), this.getGeneratorTuple(), this.getGeneratorTuple_Members(), "Tuple", null, 0, 1, GeneratorTupleMember.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorTupleMember_SelectedSolutionDisplay(), ecorePackage.getEString(), "SelectedSolutionDisplay", null, 0, 1, GeneratorTupleMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorTupleMember_Label(), ecorePackage.getEString(), "Label", null, 0, 1, GeneratorTupleMember.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(generatorVarEClass, GeneratorVar.class, "GeneratorVar", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorVar_Solution(), this.getSolutionVar(), this.getSolutionVar_Var(), "Solution", null, 0, -1, GeneratorVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorVar_SelectedSolutionValue(), ecorePackage.getEFloat(), "SelectedSolutionValue", null, 0, 1, GeneratorVar.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGeneratorVar__GetSolutionVar__Solution(), this.getSolutionVar(), "getSolutionVar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolution(), "solution", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGeneratorVar__IsSolutionOne__Solution(), ecorePackage.getEBoolean(), "isSolutionOne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolution(), "solver", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGeneratorVar__IsSolutionZero__Solution(), ecorePackage.getEBoolean(), "isSolutionZero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolution(), "solver", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGeneratorVar__GetSolutionValue__Solution(), ecorePackage.getEFloat(), "getSolutionValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolution(), "solver", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGeneratorVar__Build__Solver(), null, "build", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolver(), "builder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(generatorLpVarEClass, GeneratorLpVar.class, "GeneratorLpVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorLpVar_Type(), this.getEnumLpVarType(), "Type", "Integer", 1, 1, GeneratorLpVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorLpVar_LowerBound(), ecorePackage.getEFloat(), "LowerBound", null, 1, 1, GeneratorLpVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorLpVar_UpperBound(), ecorePackage.getEFloat(), "UpperBound", "1", 1, 1, GeneratorLpVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorLpVar_LpTerm(), this.getGeneratorLpTerm(), this.getGeneratorLpTerm_LpVar(), "LpTerm", null, 0, -1, GeneratorLpVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorConsEClass, GeneratorCons.class, "GeneratorCons", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorCons_Solution(), this.getSolutionCons(), this.getSolutionCons_Cons(), "Solution", null, 0, -1, GeneratorCons.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorCons_NofTerms(), ecorePackage.getEInt(), "NofTerms", null, 0, 1, GeneratorCons.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGeneratorCons__GetSolution__Solution(), this.getSolutionCons(), "getSolution", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolution(), "solution", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGeneratorCons__Build__Solver(), null, "build", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolver(), "builder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(generatorLpConsEClass, GeneratorLpCons.class, "GeneratorLpCons", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorLpCons_Type(), this.getEnumLpConsType(), "Type", "Equal", 0, 1, GeneratorLpCons.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorLpCons_RighHandSide(), ecorePackage.getEFloat(), "RighHandSide", null, 0, 1, GeneratorLpCons.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorLpTermEClass, GeneratorLpTerm.class, "GeneratorLpTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorLpTerm_LpVar(), this.getGeneratorLpVar(), this.getGeneratorLpVar_LpTerm(), "LpVar", null, 1, 1, GeneratorLpTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorLpTerm_Coeff(), ecorePackage.getEFloat(), "Coeff", null, 0, 1, GeneratorLpTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorLpTerm_LpLinear(), this.getGeneratorLpLinear(), this.getGeneratorLpLinear_LpTerm(), "LpLinear", null, 1, 1, GeneratorLpTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorLpTerm_Description(), ecorePackage.getEString(), "Description", null, 0, 1, GeneratorLpTerm.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(generatorLpConsCountElementEClass, GeneratorLpConsCountElement.class, "GeneratorLpConsCountElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorLpConsCountElement_ELpConsCount(), this.getGeneratorLpConsCount(), this.getGeneratorLpConsCount_LpConsCountElement(), "ELpConsCount", null, 1, 1, GeneratorLpConsCountElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorLpConsCountElement_ECount(), ecorePackage.getEInt(), "ECount", null, 0, 1, GeneratorLpConsCountElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorLpConsCountElement_EClass(), ecorePackage.getEString(), "EClass", null, 0, 1, GeneratorLpConsCountElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorLpVarCountElementEClass, GeneratorLpVarCountElement.class, "GeneratorLpVarCountElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorLpVarCountElement_ELpVarCount(), this.getGeneratorLpVarCount(), this.getGeneratorLpVarCount_ELpVarCountElement(), "ELpVarCount", null, 1, 1, GeneratorLpVarCountElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorLpVarCountElement_ECount(), ecorePackage.getEInt(), "ECount", null, 0, 1, GeneratorLpVarCountElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorLpVarCountElement_EClass(), ecorePackage.getEString(), "EClass", null, 0, 1, GeneratorLpVarCountElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorLpVarCountEClass, GeneratorLpVarCount.class, "GeneratorLpVarCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorLpVarCount_ELpVarCountElement(), this.getGeneratorLpVarCountElement(), this.getGeneratorLpVarCountElement_ELpVarCount(), "ELpVarCountElement", null, 0, -1, GeneratorLpVarCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorLpVarCount_Generator(), this.getGenerator(), this.getGenerator_ELpVarCount(), "Generator", null, 1, 1, GeneratorLpVarCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorLpConsCountEClass, GeneratorLpConsCount.class, "GeneratorLpConsCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorLpConsCount_LpConsCountElement(), this.getGeneratorLpConsCountElement(), this.getGeneratorLpConsCountElement_ELpConsCount(), "LpConsCountElement", null, 0, -1, GeneratorLpConsCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorLpConsCount_Generator(), this.getGenerator(), this.getGenerator_ELpConsCount(), "Generator", null, 1, 1, GeneratorLpConsCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorFeatureModeEClass, GeneratorFeatureMode.class, "GeneratorFeatureMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorFeatureMode_Generator(), this.getGenerator(), this.getGenerator_GeneratorFeatureModes(), "Generator", null, 1, 1, GeneratorFeatureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorFeatureMode_ObjetScope(), this.getGeneratorTuple(), null, "ObjetScope", null, 0, 1, GeneratorFeatureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorFeatureMode_Code(), ecorePackage.getEString(), "Code", null, 0, 1, GeneratorFeatureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorFeatureMode_ERemarks(), ecorePackage.getEString(), "ERemarks", null, 0, 1, GeneratorFeatureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGeneratorFeatureMode__IsObjectInScope__GeneratorTuple(), ecorePackage.getEInt(), "IsObjectInScope", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorTuple(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(generatorConstraintEnablerEClass, GeneratorConstraintEnabler.class, "GeneratorConstraintEnabler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generatorVarOverflowEClass, GeneratorVarOverflow.class, "GeneratorVarOverflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorVarOverflow_CostOverFlow(), ecorePackage.getEFloat(), "CostOverFlow", null, 0, 1, GeneratorVarOverflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorVarOverflow_MaxEnforce(), ecorePackage.getEBoolean(), "MaxEnforce", null, 0, 1, GeneratorVarOverflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iGeneratorToolEClass, IGeneratorTool.class, "IGeneratorTool", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIGeneratorTool__GetGenerator(), this.getGenerator(), "getGenerator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIGeneratorTool__Dispose(), null, "dispose", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(solutionReaderEClass, SolutionReader.class, "SolutionReader", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolutionReader_FilePath(), ecorePackage.getEString(), "FilePath", null, 0, 1, SolutionReader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSolutionReader__ReadSolFromFile(), null, "readSolFromFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSolutionReader__SetSolAsString__String(), null, "setSolAsString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "solution", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(solutionReaderPatternEClass, SolutionReaderPattern.class, "SolutionReaderPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolutionReaderPattern_LinePattern(), ecorePackage.getEString(), "LinePattern", "(\\S+)\\s+(\\S+)\\s+\\(obj:(\\S+)\\)", 0, 1, SolutionReaderPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionReaderPattern_VarNameGroup(), ecorePackage.getEInt(), "VarNameGroup", "1", 0, 1, SolutionReaderPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionReaderPattern_VarOptimalValueGroup(), ecorePackage.getEInt(), "VarOptimalValueGroup", "2", 0, 1, SolutionReaderPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionReaderPattern_VarObjectiveCoefGroup(), ecorePackage.getEInt(), "VarObjectiveCoefGroup", "3", 0, 1, SolutionReaderPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionReaderPattern_FirstLine(), ecorePackage.getEInt(), "FirstLine", "2", 0, 1, SolutionReaderPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iLpWriterEClass, ILpWriter.class, "ILpWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getILpWriter_FilePath(), ecorePackage.getEString(), "FilePath", null, 0, 1, ILpWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getILpWriter_FileFormat(), this.getEnumLpFileFormat(), "FileFormat", null, 0, 1, ILpWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getILpWriter_FileCompressed(), ecorePackage.getEBoolean(), "FileCompressed", null, 0, 1, ILpWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getILpWriter__WriteLpToFile(), null, "writeLpToFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getILpWriter__GetLpAsString(), ecorePackage.getEString(), "getLpAsString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(solutionProviderEClass, SolutionProvider.class, "SolutionProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionProvider_Solution(), this.getSolution(), this.getSolution_Provider(), "Solution", null, 0, -1, SolutionProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionProvider_CurrentSolutionNr(), ecorePackage.getEInt(), "CurrentSolutionNr", "0", 0, 1, SolutionProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionProvider_Code(), ecorePackage.getEString(), "Code", null, 0, 1, SolutionProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSolutionProvider__SolutionFactory(), this.getSolution(), "solutionFactory", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSolutionProvider__ConstructSolution(), this.getSolution(), "constructSolution", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(solverEClass, Solver.class, "Solver", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolver_Remarks(), ecorePackage.getEString(), "Remarks", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_Status(), ecorePackage.getEString(), "Status", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_SolverMaxDuration(), ecorePackage.getEFloat(), "SolverMaxDuration", "100", 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_SolverLogLevel(), this.getEnumSolverLogLevel(), "SolverLogLevel", "Normal", 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_SolverDump(), ecorePackage.getEBoolean(), "SolverDump", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_RunStarted(), ecorePackage.getEDate(), "RunStarted", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_RunInitializationEnded(), ecorePackage.getEDate(), "RunInitializationEnded", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_RunSolvingEnded(), ecorePackage.getEDate(), "RunSolvingEnded", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_RunFinalizationEnded(), ecorePackage.getEDate(), "RunFinalizationEnded", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_RunDurationInitialization(), ecorePackage.getEFloat(), "RunDurationInitialization", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_RunDurationFinalization(), ecorePackage.getEFloat(), "RunDurationFinalization", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_RunDurationSolving(), ecorePackage.getEFloat(), "RunDurationSolving", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_RunRequestTerminate(), ecorePackage.getEBoolean(), "RunRequestTerminate", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_RunTimeOut(), ecorePackage.getEBoolean(), "RunTimeOut", "false", 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_SolUnfeasible(), ecorePackage.getEBoolean(), "SolUnfeasible", "false", 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_SolFeasible(), ecorePackage.getEBoolean(), "SolFeasible", "false", 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_SolOptimal(), ecorePackage.getEBoolean(), "SolOptimal", "false", 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_SolValue(), ecorePackage.getEFloat(), "SolValue", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_RunInterrupted(), ecorePackage.getEBoolean(), "RunInterrupted", "false", 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_Initializing(), ecorePackage.getEBoolean(), "Initializing", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_Solving(), ecorePackage.getEBoolean(), "Solving", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_Finalizing(), ecorePackage.getEBoolean(), "Finalizing", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolver_Finished(), ecorePackage.getEBoolean(), "Finished", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolver_InitialSolution(), this.getSolution(), this.getSolution_SolverAsInitialSolution(), "InitialSolution", null, 0, 1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolver_Goals(), this.getSolverGoal(), this.getSolverGoal_Solver(), "Goals", null, 0, -1, Solver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSolver__Solve(), theJobPackage.getReturnFeedback(), "solve", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSolver__BuildVars(), null, "buildVars", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getSolver__BuildVar__GeneratorVar(), null, "buildVar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorVar(), "var", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getSolver__BuildLpVar__GeneratorLpVar(), null, "buildLpVar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorLpVar(), "var", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getSolver__BuildCons(), null, "buildCons", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getSolver__BuildCons__GeneratorCons(), null, "buildCons", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorCons(), "cons", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getSolver__BuildLpCons__GeneratorLpCons(), null, "buildLpCons", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorLpCons(), "cons", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getSolver__BuildLpCons__GeneratorElement_GeneratorLpLinear_float_EnumLpConsType(), null, "buildLpCons", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorLpLinear(), "linear", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "rhs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnumLpConsType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getSolver__BuildGoals(), null, "buildGoals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getSolver__BuildLpGoal__GeneratorLpGoal_float(), null, "buildLpGoal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorLpGoal(), "goal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "weight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getSolver__ConstructSolverGoal__GeneratorGoal(), this.getSolverGeneratorGoal(), "constructSolverGoal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorGoal(), "goal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSolver__ConstructSolverGoal__Solution(), this.getSolverGoalPreviousSolver(), "constructSolverGoal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolution(), "previousSolution", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSolver__ConstructSolverGoal__Solver(), this.getSolverGoalPreviousSolver(), "constructSolverGoal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolver(), "previousSolver", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSolver__MakeSolutionGoals__Solution(), null, "makeSolutionGoals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolution(), "solution", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(solverCpEClass, SolverCp.class, "SolverCp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolverCp_SearchAll(), ecorePackage.getEBoolean(), "SearchAll", null, 0, 1, SolverCp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solverLpEClass, SolverLp.class, "SolverLp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolverLp_SolverOptimalityTolerance(), ecorePackage.getEFloat(), "SolverOptimalityTolerance", "0.05", 0, 1, SolverLp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverLp_SolverLinearRelaxation(), ecorePackage.getEBoolean(), "SolverLinearRelaxation", null, 0, 1, SolverLp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverLp_SolOptimalityGap(), ecorePackage.getEFloat(), "SolOptimalityGap", null, 0, 1, SolverLp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solverGoalEClass, SolverGoal.class, "SolverGoal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolverGoal_Label(), ecorePackage.getEString(), "Label", null, 0, 1, SolverGoal.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolverGoal_Solver(), this.getSolver(), this.getSolver_Goals(), "Solver", null, 1, 1, SolverGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSolverGoal__BuildGoal(), null, "buildGoal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(solverGeneratorGoalEClass, SolverGeneratorGoal.class, "SolverGeneratorGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolverGeneratorGoal_GoalToSolve(), this.getGeneratorGoal(), null, "GoalToSolve", null, 1, 1, SolverGeneratorGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverGeneratorGoal_GoalWeight(), ecorePackage.getEFloat(), "GoalWeight", "1.0", 1, 1, SolverGeneratorGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverGeneratorGoal_GoalBound(), ecorePackage.getEFloat(), "GoalBound", null, 0, 1, SolverGeneratorGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverGeneratorGoal_Optimize(), ecorePackage.getEBoolean(), "Optimize", "true", 0, 1, SolverGeneratorGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverGeneratorGoal_Constraint(), ecorePackage.getEBoolean(), "Constraint", "false", 0, 1, SolverGeneratorGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solverGoalPreviousSolverEClass, SolverGoalPreviousSolver.class, "SolverGoalPreviousSolver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolverGoalPreviousSolver_PreviousSolver(), this.getSolver(), null, "PreviousSolver", null, 1, 1, SolverGoalPreviousSolver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolverGoalPreviousSolver_PreviousSolution(), this.getSolution(), null, "PreviousSolution", null, 0, 1, SolverGoalPreviousSolver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolution_Provider(), this.getSolutionProvider(), this.getSolutionProvider_Solution(), "Provider", null, 1, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolution_SolutionNr(), ecorePackage.getEInt(), "SolutionNr", null, 0, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolution_Code(), ecorePackage.getEString(), "Code", null, 0, 1, Solution.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_SolverAsInitialSolution(), this.getSolver(), this.getSolver_InitialSolution(), "SolverAsInitialSolution", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Elements(), this.getSolutionElement(), this.getSolutionElement_Solution(), "Elements", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Vars(), this.getSolutionVar(), null, "Vars", null, 0, -1, Solution.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Cons(), this.getSolutionCons(), null, "Cons", null, 0, -1, Solution.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Goals(), this.getSolutionGoal(), null, "Goals", null, 0, -1, Solution.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getSolution__SolutionVarFactory(), this.getSolutionVar(), "solutionVarFactory", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSolution__SolutionConsFactory(), this.getSolutionCons(), "solutionConsFactory", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSolution__SolutionGoalFactory(), this.getSolutionGoal(), "solutionGoalFactory", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSolution__ConstructSolutionVar__GeneratorVar(), this.getSolutionVar(), "constructSolutionVar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorVar(), "var", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSolution__ConstructSolutionCons__GeneratorCons(), this.getSolutionCons(), "constructSolutionCons", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorCons(), "cons", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSolution__ConstructSolutionGoal__GeneratorGoal(), this.getSolutionGoal(), "constructSolutionGoal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorGoal(), "goal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSolution__Dispose(), null, "dispose", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(solutionElementEClass, SolutionElement.class, "SolutionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionElement_Solution(), this.getSolution(), this.getSolution_Elements(), "Solution", null, 1, 1, SolutionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSolutionElement__Dispose(), null, "dispose", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(solutionLpEClass, SolutionLp.class, "SolutionLp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolutionLp_Value(), ecorePackage.getEFloat(), "Value", null, 0, 1, SolutionLp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solutionVarEClass, SolutionVar.class, "SolutionVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolutionVar_OptimalValue(), ecorePackage.getEFloat(), "OptimalValue", null, 0, 1, SolutionVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionVar_Var(), this.getGeneratorVar(), this.getGeneratorVar_Solution(), "var", null, 1, 1, SolutionVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSolutionVar__IsOne(), ecorePackage.getEBoolean(), "isOne", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSolutionVar__IsZero(), ecorePackage.getEBoolean(), "isZero", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(solutionLpVarEClass, SolutionLpVar.class, "SolutionLpVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solutionCpVarEClass, SolutionCpVar.class, "SolutionCpVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solutionConsEClass, SolutionCons.class, "SolutionCons", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionCons_Cons(), this.getGeneratorCons(), this.getGeneratorCons_Solution(), "cons", null, 1, 1, SolutionCons.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solutionLpConsEClass, SolutionLpCons.class, "SolutionLpCons", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solutionGoalEClass, SolutionGoal.class, "SolutionGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionGoal_Goal(), this.getGeneratorGoal(), this.getGeneratorGoal_Solution(), "Goal", null, 1, 1, SolutionGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionGoal_Label(), ecorePackage.getEString(), "Label", null, 0, 1, SolutionGoal.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionGoal_Constrained(), ecorePackage.getEBoolean(), "Constrained", null, 0, 1, SolutionGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionGoal_Optimized(), ecorePackage.getEBoolean(), "Optimized", null, 0, 1, SolutionGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionGoal_Bound(), ecorePackage.getEFloat(), "Bound", null, 0, 1, SolutionGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSolutionGoal__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSolutionGoal__BuildGoalAsPreviousSolver__Solver(), null, "buildGoalAsPreviousSolver", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolver(), "builder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(solutionLpGoalEClass, SolutionLpGoal.class, "SolutionLpGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolutionLpGoal_Value(), ecorePackage.getEFloat(), "Value", null, 0, 1, SolutionLpGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorCpConsEClass, GeneratorCpCons.class, "GeneratorCpCons", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorCpCons_Post(), ecorePackage.getEBoolean(), "Post", null, 0, 1, GeneratorCpCons.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorCpLinearEClass, GeneratorCpLinear.class, "GeneratorCpLinear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorCpLinear_Type(), this.getEnumCpLinearType(), "Type", null, 0, 1, GeneratorCpLinear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorCpLinear_RightHandSide(), ecorePackage.getEInt(), "RightHandSide", null, 0, 1, GeneratorCpLinear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorCpLinear_Term(), this.getGeneratorCpLinearTerm(), null, "Term", null, 0, -1, GeneratorCpLinear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorCpLogicalEClass, GeneratorCpLogical.class, "GeneratorCpLogical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorCpLogical_Term(), this.getGeneratorCpLogicalTerm(), null, "Term", null, 0, -1, GeneratorCpLogical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorCpLogical_Not(), ecorePackage.getEBoolean(), "Not", null, 0, 1, GeneratorCpLogical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorCpLogical_Type(), this.getEnumCpLogicalType(), "Type", null, 0, 1, GeneratorCpLogical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorCpVarEClass, GeneratorCpVar.class, "GeneratorCpVar", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorCpVar_Priority(), ecorePackage.getEInt(), "Priority", null, 0, 1, GeneratorCpVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorCpVarAtomicEClass, GeneratorCpVarAtomic.class, "GeneratorCpVarAtomic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorCpVarAtomic_LowerBound(), ecorePackage.getEInt(), "LowerBound", null, 0, 1, GeneratorCpVarAtomic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorCpVarAtomic_UpperBound(), ecorePackage.getEInt(), "UpperBound", null, 0, 1, GeneratorCpVarAtomic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorCpLinearTermEClass, GeneratorCpLinearTerm.class, "GeneratorCpLinearTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorCpLinearTerm_Coeff(), ecorePackage.getEInt(), "Coeff", null, 0, 1, GeneratorCpLinearTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorCpLinearTerm_CpVar(), this.getGeneratorCpVarAtomic(), null, "CpVar", null, 0, 1, GeneratorCpLinearTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorCpLogicalTermEClass, GeneratorCpLogicalTerm.class, "GeneratorCpLogicalTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorCpLogicalTerm_Not(), ecorePackage.getEBoolean(), "Not", null, 0, 1, GeneratorCpLogicalTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorCpLogicalTerm_CpCons(), this.getGeneratorCpCons(), null, "CpCons", null, 0, 1, GeneratorCpLogicalTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorGoalEClass, GeneratorGoal.class, "GeneratorGoal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorGoal_Generator(), this.getGenerator(), this.getGenerator_Goals(), "Generator", null, 0, 1, GeneratorGoal.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorGoal_Name(), ecorePackage.getEString(), "Name", null, 0, 1, GeneratorGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorGoal_SelectedSolutionDisplay(), ecorePackage.getEString(), "SelectedSolutionDisplay", null, 0, 1, GeneratorGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorGoal_Label(), ecorePackage.getEString(), "Label", null, 0, 1, GeneratorGoal.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorGoal_Solution(), this.getSolutionGoal(), this.getSolutionGoal_Goal(), "Solution", null, 0, -1, GeneratorGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGeneratorGoal__Build__Solver_float(), null, "build", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolver(), "builder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "weight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getGeneratorGoal__BuildCons__Solver_float(), null, "buildCons", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolver(), "builder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "rhs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getGeneratorGoal__GetSolutionGoal__Solution(), this.getSolutionGoal(), "getSolutionGoal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolution(), "solution", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(generatorLpGoalEClass, GeneratorLpGoal.class, "GeneratorLpGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorLpGoal_ObjectiveType(), this.getEnumObjectiveType(), "ObjectiveType", "Maximum", 0, 1, GeneratorLpGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratorLpGoal_SelectedSolutionValue(), ecorePackage.getEFloat(), "SelectedSolutionValue", null, 0, 1, GeneratorLpGoal.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGeneratorLpGoal__GetSolutionValue__Solution(), ecorePackage.getEFloat(), "getSolutionValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSolution(), "solution", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(generatorLpLinearEClass, GeneratorLpLinear.class, "GeneratorLpLinear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorLpLinear_LpTerm(), this.getGeneratorLpTerm(), this.getGeneratorLpTerm_LpLinear(), "LpTerm", null, 0, -1, GeneratorLpLinear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGeneratorLpLinear__ConstructTerm__GeneratorLpVar_float(), this.getGeneratorLpTerm(), "constructTerm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeneratorLpVar(), "var", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "coef", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumLpVarTypeEEnum, EnumLpVarType.class, "EnumLpVarType");
		addEEnumLiteral(enumLpVarTypeEEnum, EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER);
		addEEnumLiteral(enumLpVarTypeEEnum, EnumLpVarType.ENUM_LITERAL_LP_VAR_REAL);

		initEEnum(enumLpConsTypeEEnum, EnumLpConsType.class, "EnumLpConsType");
		addEEnumLiteral(enumLpConsTypeEEnum, EnumLpConsType.ENUM_LITERAL_LP_CONS_EQUAL);
		addEEnumLiteral(enumLpConsTypeEEnum, EnumLpConsType.ENUM_LITERAL_LP_CONS_SMALLER_OR_EQUAL);
		addEEnumLiteral(enumLpConsTypeEEnum, EnumLpConsType.ENUM_LITERAL_LP_CONS_BIGGER_OR_EQUAL);

		initEEnum(enumObjectiveTypeEEnum, EnumObjectiveType.class, "EnumObjectiveType");
		addEEnumLiteral(enumObjectiveTypeEEnum, EnumObjectiveType.MINIMUM);
		addEEnumLiteral(enumObjectiveTypeEEnum, EnumObjectiveType.MAXIMUM);

		initEEnum(enumSolverLogLevelEEnum, EnumSolverLogLevel.class, "EnumSolverLogLevel");
		addEEnumLiteral(enumSolverLogLevelEEnum, EnumSolverLogLevel.ENUM_NONE);
		addEEnumLiteral(enumSolverLogLevelEEnum, EnumSolverLogLevel.ENUM_MIN);
		addEEnumLiteral(enumSolverLogLevelEEnum, EnumSolverLogLevel.ENUM_NORMAL);
		addEEnumLiteral(enumSolverLogLevelEEnum, EnumSolverLogLevel.ENUM_FULL);

		initEEnum(enumCpLinearTypeEEnum, EnumCpLinearType.class, "EnumCpLinearType");
		addEEnumLiteral(enumCpLinearTypeEEnum, EnumCpLinearType.ENUM_LITERAL_CP_LINEAR_EQUAL);
		addEEnumLiteral(enumCpLinearTypeEEnum, EnumCpLinearType.ENUM_LITERAL_CP_LINEAR_NOT_EQUAL);
		addEEnumLiteral(enumCpLinearTypeEEnum, EnumCpLinearType.ENUM_LITERAL_CP_LINEAR_SMALLER);
		addEEnumLiteral(enumCpLinearTypeEEnum, EnumCpLinearType.ENUM_LITERAL_CP_LINEAR_SMALLER_OR_EQUAL);
		addEEnumLiteral(enumCpLinearTypeEEnum, EnumCpLinearType.ENUM_LITERAL_CP_LINEAR_BIGGER);
		addEEnumLiteral(enumCpLinearTypeEEnum, EnumCpLinearType.ENUM_LITERAL_CP_LINEAR_BIGGER_OR_EQUAL);

		initEEnum(enumCpLogicalTypeEEnum, EnumCpLogicalType.class, "EnumCpLogicalType");
		addEEnumLiteral(enumCpLogicalTypeEEnum, EnumCpLogicalType.ENUM_LITERAL_CP_LOGICAL_OR);
		addEEnumLiteral(enumCpLogicalTypeEEnum, EnumCpLogicalType.ENUM_LITERAL_CP_LOGICAL_AND);

		initEEnum(enumLpFileFormatEEnum, EnumLpFileFormat.class, "EnumLpFileFormat");
		addEEnumLiteral(enumLpFileFormatEEnum, EnumLpFileFormat.FILE_FORMAT_MPS);
		addEEnumLiteral(enumLpFileFormatEEnum, EnumLpFileFormat.FILE_FORMAT_CPLEX);
		addEEnumLiteral(enumLpFileFormatEEnum, EnumLpFileFormat.FILE_FORMAT_GAMS);
		addEEnumLiteral(enumLpFileFormatEEnum, EnumLpFileFormat.FILE_FORMAT_GLPK);
		addEEnumLiteral(enumLpFileFormatEEnum, EnumLpFileFormat.FILE_FORMAT_SAV);
		addEEnumLiteral(enumLpFileFormatEEnum, EnumLpFileFormat.FILE_FORMAT_LP_SOLVE);

		// Initialize data types
		initEDataType(iTupleVisitorEDataType, ITupleVisitor.class, "ITupleVisitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SolverPackageImpl
