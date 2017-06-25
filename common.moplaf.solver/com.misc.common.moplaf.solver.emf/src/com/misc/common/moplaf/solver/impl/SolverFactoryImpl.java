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
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.*;

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
public class SolverFactoryImpl extends EFactoryImpl implements SolverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SolverFactory init() {
		try {
			SolverFactory theSolverFactory = (SolverFactory)EPackage.Registry.INSTANCE.getEFactory(SolverPackage.eNS_URI);
			if (theSolverFactory != null) {
				return theSolverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SolverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverFactoryImpl() {
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
			case SolverPackage.GENERATOR_ELEMENT: return createGeneratorElement();
			case SolverPackage.GENERATOR_LP_VAR: return createGeneratorLpVar();
			case SolverPackage.GENERATOR_LP_CONS: return createGeneratorLpCons();
			case SolverPackage.GENERATOR_LP_TERM: return createGeneratorLpTerm();
			case SolverPackage.GENERATOR_CONSTRAINT_ENABLER: return createGeneratorConstraintEnabler();
			case SolverPackage.SOLUTION_READER_PATTERN: return createSolutionReaderPattern();
			case SolverPackage.SOLVER_GENERATOR_GOAL: return createSolverGeneratorGoal();
			case SolverPackage.SOLVER_GOAL_PREVIOUS_SOLVER: return createSolverGoalPreviousSolver();
			case SolverPackage.SOLUTION: return createSolution();
			case SolverPackage.SOLUTION_ELEMENT: return createSolutionElement();
			case SolverPackage.SOLUTION_LP: return createSolutionLp();
			case SolverPackage.SOLUTION_VAR: return createSolutionVar();
			case SolverPackage.SOLUTION_LP_VAR: return createSolutionLpVar();
			case SolverPackage.SOLUTION_CP_VAR: return createSolutionCpVar();
			case SolverPackage.SOLUTION_CONS: return createSolutionCons();
			case SolverPackage.SOLUTION_LP_CONS: return createSolutionLpCons();
			case SolverPackage.SOLUTION_GOAL: return createSolutionGoal();
			case SolverPackage.SOLUTION_LP_GOAL: return createSolutionLpGoal();
			case SolverPackage.GENERATOR_CP_LINEAR: return createGeneratorCpLinear();
			case SolverPackage.GENERATOR_CP_LOGICAL: return createGeneratorCpLogical();
			case SolverPackage.GENERATOR_CP_VAR_ATOMIC: return createGeneratorCpVarAtomic();
			case SolverPackage.GENERATOR_CP_LINEAR_TERM: return createGeneratorCpLinearTerm();
			case SolverPackage.GENERATOR_CP_LOGICAL_TERM: return createGeneratorCpLogicalTerm();
			case SolverPackage.GENERATOR_LP_GOAL: return createGeneratorLpGoal();
			case SolverPackage.GENERATOR_LP_LINEAR: return createGeneratorLpLinear();
			case SolverPackage.SOLVER_LP_PARAMS: return createSolverLpParams();
			case SolverPackage.SOLVER_PARAMS: return createSolverParams();
			case SolverPackage.SOLUTION_PROVIDER_PARAMS: return createSolutionProviderParams();
			case SolverPackage.GENERATOR_VAR_BINDER: return createGeneratorVarBinder();
			case SolverPackage.GENERATOR_LP_VAR_BINDER: return createGeneratorLpVarBinder();
			case SolverPackage.GENERATOR_LP_VAR_BINDER_TO_SOLUTION: return createGeneratorLpVarBinderToSolution();
			case SolverPackage.GENERATOR_LP_VAR_BINDER_TO_VALUE: return createGeneratorLpVarBinderToValue();
			case SolverPackage.SOLVER_VAR_BINDER: return createSolverVarBinder();
			case SolverPackage.SOLVER_LP_VAR_BINDER: return createSolverLpVarBinder();
			case SolverPackage.SOLVER_LP_VAR_BINDER_TO_SOLUTION: return createSolverLpVarBinderToSolution();
			case SolverPackage.SOLVER_LP_VAR_BINDER_TO_VALUE: return createSolverLpVarBinderToValue();
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
			case SolverPackage.ENUM_LP_VAR_TYPE:
				return createEnumLpVarTypeFromString(eDataType, initialValue);
			case SolverPackage.ENUM_LP_CONS_TYPE:
				return createEnumLpConsTypeFromString(eDataType, initialValue);
			case SolverPackage.ENUM_OBJECTIVE_TYPE:
				return createEnumObjectiveTypeFromString(eDataType, initialValue);
			case SolverPackage.ENUM_SOLVER_LOG_LEVEL:
				return createEnumSolverLogLevelFromString(eDataType, initialValue);
			case SolverPackage.ENUM_CP_LINEAR_TYPE:
				return createEnumCpLinearTypeFromString(eDataType, initialValue);
			case SolverPackage.ENUM_CP_LOGICAL_TYPE:
				return createEnumCpLogicalTypeFromString(eDataType, initialValue);
			case SolverPackage.ENUM_LP_FILE_FORMAT:
				return createEnumLpFileFormatFromString(eDataType, initialValue);
			case SolverPackage.ITUPLE_VISITOR:
				return createITupleVisitorFromString(eDataType, initialValue);
			case SolverPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
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
			case SolverPackage.ENUM_LP_VAR_TYPE:
				return convertEnumLpVarTypeToString(eDataType, instanceValue);
			case SolverPackage.ENUM_LP_CONS_TYPE:
				return convertEnumLpConsTypeToString(eDataType, instanceValue);
			case SolverPackage.ENUM_OBJECTIVE_TYPE:
				return convertEnumObjectiveTypeToString(eDataType, instanceValue);
			case SolverPackage.ENUM_SOLVER_LOG_LEVEL:
				return convertEnumSolverLogLevelToString(eDataType, instanceValue);
			case SolverPackage.ENUM_CP_LINEAR_TYPE:
				return convertEnumCpLinearTypeToString(eDataType, instanceValue);
			case SolverPackage.ENUM_CP_LOGICAL_TYPE:
				return convertEnumCpLogicalTypeToString(eDataType, instanceValue);
			case SolverPackage.ENUM_LP_FILE_FORMAT:
				return convertEnumLpFileFormatToString(eDataType, instanceValue);
			case SolverPackage.ITUPLE_VISITOR:
				return convertITupleVisitorToString(eDataType, instanceValue);
			case SolverPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorElement createGeneratorElement() {
		GeneratorElementImpl generatorElement = new GeneratorElementImpl();
		return generatorElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpGoal createGeneratorLpGoal() {
		GeneratorLpGoalImpl generatorLpGoal = new GeneratorLpGoalImpl();
		return generatorLpGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpLinear createGeneratorLpLinear() {
		GeneratorLpLinearImpl generatorLpLinear = new GeneratorLpLinearImpl();
		return generatorLpLinear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverLpParams createSolverLpParams() {
		SolverLpParamsImpl solverLpParams = new SolverLpParamsImpl();
		return solverLpParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverParams createSolverParams() {
		SolverParamsImpl solverParams = new SolverParamsImpl();
		return solverParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionProviderParams createSolutionProviderParams() {
		SolutionProviderParamsImpl solutionProviderParams = new SolutionProviderParamsImpl();
		return solutionProviderParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorVarBinder createGeneratorVarBinder() {
		GeneratorVarBinderImpl generatorVarBinder = new GeneratorVarBinderImpl();
		return generatorVarBinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVarBinder createGeneratorLpVarBinder() {
		GeneratorLpVarBinderImpl generatorLpVarBinder = new GeneratorLpVarBinderImpl();
		return generatorLpVarBinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVarBinderToSolution createGeneratorLpVarBinderToSolution() {
		GeneratorLpVarBinderToSolutionImpl generatorLpVarBinderToSolution = new GeneratorLpVarBinderToSolutionImpl();
		return generatorLpVarBinderToSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVarBinderToValue createGeneratorLpVarBinderToValue() {
		GeneratorLpVarBinderToValueImpl generatorLpVarBinderToValue = new GeneratorLpVarBinderToValueImpl();
		return generatorLpVarBinderToValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverVarBinder createSolverVarBinder() {
		SolverVarBinderImpl solverVarBinder = new SolverVarBinderImpl();
		return solverVarBinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverLpVarBinder createSolverLpVarBinder() {
		SolverLpVarBinderImpl solverLpVarBinder = new SolverLpVarBinderImpl();
		return solverLpVarBinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverLpVarBinderToSolution createSolverLpVarBinderToSolution() {
		SolverLpVarBinderToSolutionImpl solverLpVarBinderToSolution = new SolverLpVarBinderToSolutionImpl();
		return solverLpVarBinderToSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverLpVarBinderToValue createSolverLpVarBinderToValue() {
		SolverLpVarBinderToValueImpl solverLpVarBinderToValue = new SolverLpVarBinderToValueImpl();
		return solverLpVarBinderToValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverGeneratorGoal createSolverGeneratorGoal() {
		SolverGeneratorGoalImpl solverGeneratorGoal = new SolverGeneratorGoalImpl();
		return solverGeneratorGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverGoalPreviousSolver createSolverGoalPreviousSolver() {
		SolverGoalPreviousSolverImpl solverGoalPreviousSolver = new SolverGoalPreviousSolverImpl();
		return solverGoalPreviousSolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution createSolution() {
		SolutionImpl solution = new SolutionImpl();
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionElement createSolutionElement() {
		SolutionElementImpl solutionElement = new SolutionElementImpl();
		return solutionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionLp createSolutionLp() {
		SolutionLpImpl solutionLp = new SolutionLpImpl();
		return solutionLp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar createGeneratorLpVar() {
		GeneratorLpVarImpl generatorLpVar = new GeneratorLpVarImpl();
		return generatorLpVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpCons createGeneratorLpCons() {
		GeneratorLpConsImpl generatorLpCons = new GeneratorLpConsImpl();
		return generatorLpCons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpTerm createGeneratorLpTerm() {
		GeneratorLpTermImpl generatorLpTerm = new GeneratorLpTermImpl();
		return generatorLpTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorConstraintEnabler createGeneratorConstraintEnabler() {
		GeneratorConstraintEnablerImpl generatorConstraintEnabler = new GeneratorConstraintEnablerImpl();
		return generatorConstraintEnabler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionVar createSolutionVar() {
		SolutionVarImpl solutionVar = new SolutionVarImpl();
		return solutionVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionReaderPattern createSolutionReaderPattern() {
		SolutionReaderPatternImpl solutionReaderPattern = new SolutionReaderPatternImpl();
		return solutionReaderPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionLpVar createSolutionLpVar() {
		SolutionLpVarImpl solutionLpVar = new SolutionLpVarImpl();
		return solutionLpVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionCons createSolutionCons() {
		SolutionConsImpl solutionCons = new SolutionConsImpl();
		return solutionCons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionLpCons createSolutionLpCons() {
		SolutionLpConsImpl solutionLpCons = new SolutionLpConsImpl();
		return solutionLpCons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionGoal createSolutionGoal() {
		SolutionGoalImpl solutionGoal = new SolutionGoalImpl();
		return solutionGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionLpGoal createSolutionLpGoal() {
		SolutionLpGoalImpl solutionLpGoal = new SolutionLpGoalImpl();
		return solutionLpGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorCpLinear createGeneratorCpLinear() {
		GeneratorCpLinearImpl generatorCpLinear = new GeneratorCpLinearImpl();
		return generatorCpLinear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorCpLogical createGeneratorCpLogical() {
		GeneratorCpLogicalImpl generatorCpLogical = new GeneratorCpLogicalImpl();
		return generatorCpLogical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorCpVarAtomic createGeneratorCpVarAtomic() {
		GeneratorCpVarAtomicImpl generatorCpVarAtomic = new GeneratorCpVarAtomicImpl();
		return generatorCpVarAtomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorCpLinearTerm createGeneratorCpLinearTerm() {
		GeneratorCpLinearTermImpl generatorCpLinearTerm = new GeneratorCpLinearTermImpl();
		return generatorCpLinearTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorCpLogicalTerm createGeneratorCpLogicalTerm() {
		GeneratorCpLogicalTermImpl generatorCpLogicalTerm = new GeneratorCpLogicalTermImpl();
		return generatorCpLogicalTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionCpVar createSolutionCpVar() {
		SolutionCpVarImpl solutionCpVar = new SolutionCpVarImpl();
		return solutionCpVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLpVarType createEnumLpVarTypeFromString(EDataType eDataType, String initialValue) {
		EnumLpVarType result = EnumLpVarType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumLpVarTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLpConsType createEnumLpConsTypeFromString(EDataType eDataType, String initialValue) {
		EnumLpConsType result = EnumLpConsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumLpConsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumObjectiveType createEnumObjectiveTypeFromString(EDataType eDataType, String initialValue) {
		EnumObjectiveType result = EnumObjectiveType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumObjectiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumSolverLogLevel createEnumSolverLogLevelFromString(EDataType eDataType, String initialValue) {
		EnumSolverLogLevel result = EnumSolverLogLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumSolverLogLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumCpLinearType createEnumCpLinearTypeFromString(EDataType eDataType, String initialValue) {
		EnumCpLinearType result = EnumCpLinearType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumCpLinearTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumCpLogicalType createEnumCpLogicalTypeFromString(EDataType eDataType, String initialValue) {
		EnumCpLogicalType result = EnumCpLogicalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumCpLogicalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLpFileFormat createEnumLpFileFormatFromString(EDataType eDataType, String initialValue) {
		EnumLpFileFormat result = EnumLpFileFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumLpFileFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITupleVisitor createITupleVisitorFromString(EDataType eDataType, String initialValue) {
		return (ITupleVisitor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertITupleVisitorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverPackage getSolverPackage() {
		return (SolverPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SolverPackage getPackage() {
		return SolverPackage.eINSTANCE;
	}

} //SolverFactoryImpl
