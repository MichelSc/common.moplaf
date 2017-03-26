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
package com.misc.common.moplaf.solver;

import com.misc.common.moplaf.job.JobPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.SolverFactory
 * @model kind="package"
 * @generated
 */
public interface SolverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "solver";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/solver/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "svr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverPackage eINSTANCE = com.misc.common.moplaf.solver.impl.SolverPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__RUN_FEEDBACK = JobPackage.RUN__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CANCEL_FEEDBACK = JobPackage.RUN__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__RESET_FEEDBACK = JobPackage.RUN__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CANCELED = JobPackage.RUN__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__RETURN_SUCCESS = JobPackage.RUN__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__RETURN_FEEDBACK = JobPackage.RUN__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__RETURN_INFORMATION = JobPackage.RUN__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Tuple Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__TUPLE_ROOT = JobPackage.RUN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__GOALS = JobPackage.RUN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generator Feature Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__GENERATOR_FEATURE_MODES = JobPackage.RUN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Solution Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__SOLUTION_PROVIDER = JobPackage.RUN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__REMARKS = JobPackage.RUN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Footprint Nof Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__FOOTPRINT_NOF_VARS = JobPackage.RUN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Footprint Nof Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__FOOTPRINT_NOF_CONS = JobPackage.RUN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Footprint Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__FOOTPRINT_NOF_TERMS = JobPackage.RUN_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Count Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__COUNT_CONS = JobPackage.RUN_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Count Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__COUNT_VARS = JobPackage.RUN_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>ELp Var Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ELP_VAR_COUNT = JobPackage.RUN_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>ELp Cons Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ELP_CONS_COUNT = JobPackage.RUN_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CODE = JobPackage.RUN_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__SELECTED = JobPackage.RUN_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = JobPackage.RUN_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___RESET = JobPackage.RUN___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___RUN = JobPackage.RUN___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___RUN__RUNCONTEXT = JobPackage.RUN___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___CANCEL = JobPackage.RUN___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___SET_PROGRESS__STRING_FLOAT = JobPackage.RUN___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___SET_PROGRESS__PROGRESSFEEDBACK = JobPackage.RUN___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___GET_RETURN = JobPackage.RUN___GET_RETURN;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___SET_RETURN__RETURNFEEDBACK = JobPackage.RUN___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___GENERATE = JobPackage.RUN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Root Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___GENERATE_ROOT_TUPLES = JobPackage.RUN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___GENERATE_TUPLES = JobPackage.RUN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Tuple XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___GENERATE_TUPLE_XREFERENCES = JobPackage.RUN_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___GENERATE_VARS = JobPackage.RUN_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___GENERATE_CONS = JobPackage.RUN_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Generate Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___GENERATE_GOALS = JobPackage.RUN_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Accept Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___ACCEPT_SOLUTION__SOLUTION = JobPackage.RUN_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Select Feature Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE = JobPackage.RUN_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___VISIT_TUPLES__ITUPLEVISITOR = JobPackage.RUN_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___REFRESH_SELECTED_SOLUTION = JobPackage.RUN_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = JobPackage.RUN_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorTupleImpl <em>Generator Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorTupleImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorTuple()
	 * @generated
	 */
	int GENERATOR_TUPLE = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorElementImpl <em>Generator Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorElementImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorElement()
	 * @generated
	 */
	int GENERATOR_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ELEMENT__CODE = 0;

	/**
	 * The number of structural features of the '<em>Generator Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ELEMENT___GET_GENERATOR = 0;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ELEMENT___REFRESH_SELECTED_SOLUTION = 1;

	/**
	 * The number of operations of the '<em>Generator Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ELEMENT_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE__CODE = GENERATOR_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE__GENERATOR_AS_ROOT = GENERATOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE__TUPLE_ELEMENT = GENERATOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE__TUPLE_CONTAINER = GENERATOR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE__VAR = GENERATOR_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE__CONS = GENERATOR_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE__NAME = GENERATOR_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE__MEMBERS = GENERATOR_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Generator Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_FEATURE_COUNT = GENERATOR_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE___GET_GENERATOR = GENERATOR_ELEMENT___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE___REFRESH_SELECTED_SOLUTION = GENERATOR_ELEMENT___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE___GENERATE_VARS = GENERATOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE___GENERATE_CONS = GENERATOR_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE___GENERATE_TUPLES = GENERATOR_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR = GENERATOR_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE___GENERATE_XREFERENCES = GENERATOR_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Generator Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_OPERATION_COUNT = GENERATOR_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorTupleMemberImpl <em>Generator Tuple Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorTupleMemberImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorTupleMember()
	 * @generated
	 */
	int GENERATOR_TUPLE_MEMBER = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER__CODE = GENERATOR_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER__NAME = GENERATOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER__TUPLE = GENERATOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER__SELECTED_SOLUTION_DISPLAY = GENERATOR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER__LABEL = GENERATOR_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generator Tuple Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER_FEATURE_COUNT = GENERATOR_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER___GET_GENERATOR = GENERATOR_ELEMENT___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER___REFRESH_SELECTED_SOLUTION = GENERATOR_ELEMENT___REFRESH_SELECTED_SOLUTION;

	/**
	 * The number of operations of the '<em>Generator Tuple Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER_OPERATION_COUNT = GENERATOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorVarImpl <em>Generator Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorVarImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorVar()
	 * @generated
	 */
	int GENERATOR_VAR = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR__CODE = GENERATOR_TUPLE_MEMBER__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR__NAME = GENERATOR_TUPLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR__TUPLE = GENERATOR_TUPLE_MEMBER__TUPLE;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR__SELECTED_SOLUTION_DISPLAY = GENERATOR_TUPLE_MEMBER__SELECTED_SOLUTION_DISPLAY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR__LABEL = GENERATOR_TUPLE_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR__SOLUTION = GENERATOR_TUPLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected Solution Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR__SELECTED_SOLUTION_VALUE = GENERATOR_TUPLE_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generator Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR_FEATURE_COUNT = GENERATOR_TUPLE_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR___GET_GENERATOR = GENERATOR_TUPLE_MEMBER___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR___REFRESH_SELECTED_SOLUTION = GENERATOR_TUPLE_MEMBER___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Get Solution Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR___GET_SOLUTION_VAR__SOLUTION = GENERATOR_TUPLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Solution One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR___IS_SOLUTION_ONE__SOLUTION = GENERATOR_TUPLE_MEMBER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Solution Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR___IS_SOLUTION_ZERO__SOLUTION = GENERATOR_TUPLE_MEMBER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Solution Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR___GET_SOLUTION_VALUE__SOLUTION = GENERATOR_TUPLE_MEMBER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Build</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR___BUILD__SOLVER = GENERATOR_TUPLE_MEMBER_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Generator Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR_OPERATION_COUNT = GENERATOR_TUPLE_MEMBER_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarImpl <em>Generator Lp Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorLpVarImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpVar()
	 * @generated
	 */
	int GENERATOR_LP_VAR = 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR__CODE = GENERATOR_VAR__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR__NAME = GENERATOR_VAR__NAME;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR__TUPLE = GENERATOR_VAR__TUPLE;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR__SELECTED_SOLUTION_DISPLAY = GENERATOR_VAR__SELECTED_SOLUTION_DISPLAY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR__LABEL = GENERATOR_VAR__LABEL;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR__SOLUTION = GENERATOR_VAR__SOLUTION;

	/**
	 * The feature id for the '<em><b>Selected Solution Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR__SELECTED_SOLUTION_VALUE = GENERATOR_VAR__SELECTED_SOLUTION_VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR__TYPE = GENERATOR_VAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR__LOWER_BOUND = GENERATOR_VAR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR__UPPER_BOUND = GENERATOR_VAR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lp Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR__LP_TERM = GENERATOR_VAR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generator Lp Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR_FEATURE_COUNT = GENERATOR_VAR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR___GET_GENERATOR = GENERATOR_VAR___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR___REFRESH_SELECTED_SOLUTION = GENERATOR_VAR___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Get Solution Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR___GET_SOLUTION_VAR__SOLUTION = GENERATOR_VAR___GET_SOLUTION_VAR__SOLUTION;

	/**
	 * The operation id for the '<em>Is Solution One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR___IS_SOLUTION_ONE__SOLUTION = GENERATOR_VAR___IS_SOLUTION_ONE__SOLUTION;

	/**
	 * The operation id for the '<em>Is Solution Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR___IS_SOLUTION_ZERO__SOLUTION = GENERATOR_VAR___IS_SOLUTION_ZERO__SOLUTION;

	/**
	 * The operation id for the '<em>Get Solution Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR___GET_SOLUTION_VALUE__SOLUTION = GENERATOR_VAR___GET_SOLUTION_VALUE__SOLUTION;

	/**
	 * The operation id for the '<em>Build</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR___BUILD__SOLVER = GENERATOR_VAR___BUILD__SOLVER;

	/**
	 * The number of operations of the '<em>Generator Lp Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR_OPERATION_COUNT = GENERATOR_VAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorConsImpl <em>Generator Cons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorConsImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCons()
	 * @generated
	 */
	int GENERATOR_CONS = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS__CODE = GENERATOR_TUPLE_MEMBER__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS__NAME = GENERATOR_TUPLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS__TUPLE = GENERATOR_TUPLE_MEMBER__TUPLE;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS__SELECTED_SOLUTION_DISPLAY = GENERATOR_TUPLE_MEMBER__SELECTED_SOLUTION_DISPLAY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS__LABEL = GENERATOR_TUPLE_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS__SOLUTION = GENERATOR_TUPLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS__NOF_TERMS = GENERATOR_TUPLE_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generator Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS_FEATURE_COUNT = GENERATOR_TUPLE_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS___GET_GENERATOR = GENERATOR_TUPLE_MEMBER___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS___REFRESH_SELECTED_SOLUTION = GENERATOR_TUPLE_MEMBER___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Get Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS___GET_SOLUTION__SOLUTION = GENERATOR_TUPLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS___BUILD__SOLVER = GENERATOR_TUPLE_MEMBER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generator Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS_OPERATION_COUNT = GENERATOR_TUPLE_MEMBER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpConsImpl <em>Generator Lp Cons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorLpConsImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpCons()
	 * @generated
	 */
	int GENERATOR_LP_CONS = 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS__CODE = GENERATOR_CONS__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS__NAME = GENERATOR_CONS__NAME;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS__TUPLE = GENERATOR_CONS__TUPLE;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS__SELECTED_SOLUTION_DISPLAY = GENERATOR_CONS__SELECTED_SOLUTION_DISPLAY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS__LABEL = GENERATOR_CONS__LABEL;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS__SOLUTION = GENERATOR_CONS__SOLUTION;

	/**
	 * The feature id for the '<em><b>Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS__NOF_TERMS = GENERATOR_CONS__NOF_TERMS;

	/**
	 * The feature id for the '<em><b>Lp Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS__LP_TERM = GENERATOR_CONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS__TYPE = GENERATOR_CONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Righ Hand Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS__RIGH_HAND_SIDE = GENERATOR_CONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generator Lp Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS_FEATURE_COUNT = GENERATOR_CONS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS___GET_GENERATOR = GENERATOR_CONS___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS___REFRESH_SELECTED_SOLUTION = GENERATOR_CONS___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Get Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS___GET_SOLUTION__SOLUTION = GENERATOR_CONS___GET_SOLUTION__SOLUTION;

	/**
	 * The operation id for the '<em>Build</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS___BUILD__SOLVER = GENERATOR_CONS___BUILD__SOLVER;

	/**
	 * The operation id for the '<em>Construct Term</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS___CONSTRUCT_TERM__GENERATORLPVAR_FLOAT = GENERATOR_CONS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Contribute Term</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS___CONTRIBUTE_TERM__GENERATORLPVAR_FLOAT = GENERATOR_CONS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generator Lp Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS_OPERATION_COUNT = GENERATOR_CONS_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpTermImpl <em>Generator Lp Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorLpTermImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpTerm()
	 * @generated
	 */
	int GENERATOR_LP_TERM = 8;

	/**
	 * The feature id for the '<em><b>Lp Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_TERM__LP_VAR = 0;

	/**
	 * The feature id for the '<em><b>Coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_TERM__COEFF = 1;

	/**
	 * The feature id for the '<em><b>Lp Linear</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_TERM__LP_LINEAR = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_TERM__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Generator Lp Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_TERM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Generator Lp Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpConsCountElementImpl <em>Generator Lp Cons Count Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorLpConsCountElementImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpConsCountElement()
	 * @generated
	 */
	int GENERATOR_LP_CONS_COUNT_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>ELp Cons Count</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS_COUNT_ELEMENT__ELP_CONS_COUNT = 0;

	/**
	 * The feature id for the '<em><b>ECount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS_COUNT_ELEMENT__ECOUNT = 1;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS_COUNT_ELEMENT__ECLASS = 2;

	/**
	 * The number of structural features of the '<em>Generator Lp Cons Count Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS_COUNT_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Generator Lp Cons Count Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS_COUNT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarCountElementImpl <em>Generator Lp Var Count Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorLpVarCountElementImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpVarCountElement()
	 * @generated
	 */
	int GENERATOR_LP_VAR_COUNT_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>ELp Var Count</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR_COUNT_ELEMENT__ELP_VAR_COUNT = 0;

	/**
	 * The feature id for the '<em><b>ECount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR_COUNT_ELEMENT__ECOUNT = 1;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR_COUNT_ELEMENT__ECLASS = 2;

	/**
	 * The number of structural features of the '<em>Generator Lp Var Count Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR_COUNT_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Generator Lp Var Count Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR_COUNT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarCountImpl <em>Generator Lp Var Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorLpVarCountImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpVarCount()
	 * @generated
	 */
	int GENERATOR_LP_VAR_COUNT = 11;

	/**
	 * The feature id for the '<em><b>ELp Var Count Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR_COUNT__ELP_VAR_COUNT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR_COUNT__GENERATOR = 1;

	/**
	 * The number of structural features of the '<em>Generator Lp Var Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR_COUNT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generator Lp Var Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR_COUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpConsCountImpl <em>Generator Lp Cons Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorLpConsCountImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpConsCount()
	 * @generated
	 */
	int GENERATOR_LP_CONS_COUNT = 12;

	/**
	 * The feature id for the '<em><b>Lp Cons Count Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS_COUNT__LP_CONS_COUNT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS_COUNT__GENERATOR = 1;

	/**
	 * The number of structural features of the '<em>Generator Lp Cons Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS_COUNT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generator Lp Cons Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS_COUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorFeatureModeImpl <em>Generator Feature Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorFeatureModeImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorFeatureMode()
	 * @generated
	 */
	int GENERATOR_FEATURE_MODE = 13;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_MODE__GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Objet Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_MODE__OBJET_SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_MODE__CODE = 2;

	/**
	 * The feature id for the '<em><b>ERemarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_MODE__EREMARKS = 3;

	/**
	 * The number of structural features of the '<em>Generator Feature Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_MODE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Is Object In Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_MODE___IS_OBJECT_IN_SCOPE__GENERATORTUPLE = 0;

	/**
	 * The number of operations of the '<em>Generator Feature Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_MODE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorConstraintEnablerImpl <em>Generator Constraint Enabler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorConstraintEnablerImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorConstraintEnabler()
	 * @generated
	 */
	int GENERATOR_CONSTRAINT_ENABLER = 14;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONSTRAINT_ENABLER__GENERATOR = GENERATOR_FEATURE_MODE__GENERATOR;

	/**
	 * The feature id for the '<em><b>Objet Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONSTRAINT_ENABLER__OBJET_SCOPE = GENERATOR_FEATURE_MODE__OBJET_SCOPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONSTRAINT_ENABLER__CODE = GENERATOR_FEATURE_MODE__CODE;

	/**
	 * The feature id for the '<em><b>ERemarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONSTRAINT_ENABLER__EREMARKS = GENERATOR_FEATURE_MODE__EREMARKS;

	/**
	 * The number of structural features of the '<em>Generator Constraint Enabler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONSTRAINT_ENABLER_FEATURE_COUNT = GENERATOR_FEATURE_MODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Object In Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONSTRAINT_ENABLER___IS_OBJECT_IN_SCOPE__GENERATORTUPLE = GENERATOR_FEATURE_MODE___IS_OBJECT_IN_SCOPE__GENERATORTUPLE;

	/**
	 * The number of operations of the '<em>Generator Constraint Enabler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONSTRAINT_ENABLER_OPERATION_COUNT = GENERATOR_FEATURE_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorVarOverflowImpl <em>Generator Var Overflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorVarOverflowImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorVarOverflow()
	 * @generated
	 */
	int GENERATOR_VAR_OVERFLOW = 15;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR_OVERFLOW__GENERATOR = GENERATOR_FEATURE_MODE__GENERATOR;

	/**
	 * The feature id for the '<em><b>Objet Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR_OVERFLOW__OBJET_SCOPE = GENERATOR_FEATURE_MODE__OBJET_SCOPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR_OVERFLOW__CODE = GENERATOR_FEATURE_MODE__CODE;

	/**
	 * The feature id for the '<em><b>ERemarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR_OVERFLOW__EREMARKS = GENERATOR_FEATURE_MODE__EREMARKS;

	/**
	 * The feature id for the '<em><b>Cost Over Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR_OVERFLOW__COST_OVER_FLOW = GENERATOR_FEATURE_MODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Enforce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR_OVERFLOW__MAX_ENFORCE = GENERATOR_FEATURE_MODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generator Var Overflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR_OVERFLOW_FEATURE_COUNT = GENERATOR_FEATURE_MODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Object In Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR_OVERFLOW___IS_OBJECT_IN_SCOPE__GENERATORTUPLE = GENERATOR_FEATURE_MODE___IS_OBJECT_IN_SCOPE__GENERATORTUPLE;

	/**
	 * The number of operations of the '<em>Generator Var Overflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR_OVERFLOW_OPERATION_COUNT = GENERATOR_FEATURE_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.IGeneratorTool <em>IGenerator Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.IGeneratorTool
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getIGeneratorTool()
	 * @generated
	 */
	int IGENERATOR_TOOL = 16;

	/**
	 * The number of structural features of the '<em>IGenerator Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGENERATOR_TOOL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGENERATOR_TOOL___GET_GENERATOR = 0;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGENERATOR_TOOL___DISPOSE = 1;

	/**
	 * The number of operations of the '<em>IGenerator Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGENERATOR_TOOL_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionProviderImpl <em>Solution Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionProviderImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionProvider()
	 * @generated
	 */
	int SOLUTION_PROVIDER = 20;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER__RUN_FEEDBACK = JobPackage.RUN__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER__CANCEL_FEEDBACK = JobPackage.RUN__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER__RESET_FEEDBACK = JobPackage.RUN__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER__CANCELED = JobPackage.RUN__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER__RETURN_SUCCESS = JobPackage.RUN__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER__RETURN_FEEDBACK = JobPackage.RUN__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER__RETURN_INFORMATION = JobPackage.RUN__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER__SOLUTION = JobPackage.RUN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER__CURRENT_SOLUTION_NR = JobPackage.RUN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER__CODE = JobPackage.RUN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Solution Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER_FEATURE_COUNT = JobPackage.RUN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___RESET = JobPackage.RUN___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___RUN = JobPackage.RUN___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___RUN__RUNCONTEXT = JobPackage.RUN___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___CANCEL = JobPackage.RUN___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___SET_PROGRESS__STRING_FLOAT = JobPackage.RUN___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___SET_PROGRESS__PROGRESSFEEDBACK = JobPackage.RUN___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___GET_RETURN = JobPackage.RUN___GET_RETURN;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___SET_RETURN__RETURNFEEDBACK = JobPackage.RUN___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___GET_GENERATOR = JobPackage.RUN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___DISPOSE = JobPackage.RUN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___SOLUTION_FACTORY = JobPackage.RUN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___CONSTRUCT_SOLUTION = JobPackage.RUN_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Solution Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER_OPERATION_COUNT = JobPackage.RUN_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionReaderImpl <em>Solution Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionReaderImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionReader()
	 * @generated
	 */
	int SOLUTION_READER = 17;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER__RUN_FEEDBACK = SOLUTION_PROVIDER__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER__CANCEL_FEEDBACK = SOLUTION_PROVIDER__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER__RESET_FEEDBACK = SOLUTION_PROVIDER__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER__CANCELED = SOLUTION_PROVIDER__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER__RETURN_SUCCESS = SOLUTION_PROVIDER__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER__RETURN_FEEDBACK = SOLUTION_PROVIDER__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER__RETURN_INFORMATION = SOLUTION_PROVIDER__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER__SOLUTION = SOLUTION_PROVIDER__SOLUTION;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER__CURRENT_SOLUTION_NR = SOLUTION_PROVIDER__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER__CODE = SOLUTION_PROVIDER__CODE;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER__FILE_PATH = SOLUTION_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solution Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_FEATURE_COUNT = SOLUTION_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___RESET = SOLUTION_PROVIDER___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___RUN = SOLUTION_PROVIDER___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___RUN__RUNCONTEXT = SOLUTION_PROVIDER___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___CANCEL = SOLUTION_PROVIDER___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___SET_PROGRESS__STRING_FLOAT = SOLUTION_PROVIDER___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___SET_PROGRESS__PROGRESSFEEDBACK = SOLUTION_PROVIDER___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___GET_RETURN = SOLUTION_PROVIDER___GET_RETURN;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___SET_RETURN__RETURNFEEDBACK = SOLUTION_PROVIDER___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___GET_GENERATOR = SOLUTION_PROVIDER___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___DISPOSE = SOLUTION_PROVIDER___DISPOSE;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___SOLUTION_FACTORY = SOLUTION_PROVIDER___SOLUTION_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___CONSTRUCT_SOLUTION = SOLUTION_PROVIDER___CONSTRUCT_SOLUTION;

	/**
	 * The operation id for the '<em>Read Sol From File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___READ_SOL_FROM_FILE = SOLUTION_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Sol As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___SET_SOL_AS_STRING__STRING = SOLUTION_PROVIDER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Solution Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_OPERATION_COUNT = SOLUTION_PROVIDER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionReaderPatternImpl <em>Solution Reader Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionReaderPatternImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionReaderPattern()
	 * @generated
	 */
	int SOLUTION_READER_PATTERN = 18;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__RUN_FEEDBACK = SOLUTION_READER__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__CANCEL_FEEDBACK = SOLUTION_READER__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__RESET_FEEDBACK = SOLUTION_READER__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__CANCELED = SOLUTION_READER__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__RETURN_SUCCESS = SOLUTION_READER__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__RETURN_FEEDBACK = SOLUTION_READER__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__RETURN_INFORMATION = SOLUTION_READER__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__SOLUTION = SOLUTION_READER__SOLUTION;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__CURRENT_SOLUTION_NR = SOLUTION_READER__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__CODE = SOLUTION_READER__CODE;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__FILE_PATH = SOLUTION_READER__FILE_PATH;

	/**
	 * The feature id for the '<em><b>Line Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__LINE_PATTERN = SOLUTION_READER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Var Name Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__VAR_NAME_GROUP = SOLUTION_READER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Var Optimal Value Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__VAR_OPTIMAL_VALUE_GROUP = SOLUTION_READER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Var Objective Coef Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__VAR_OBJECTIVE_COEF_GROUP = SOLUTION_READER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN__FIRST_LINE = SOLUTION_READER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Solution Reader Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN_FEATURE_COUNT = SOLUTION_READER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___RESET = SOLUTION_READER___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___RUN = SOLUTION_READER___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___RUN__RUNCONTEXT = SOLUTION_READER___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___CANCEL = SOLUTION_READER___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___SET_PROGRESS__STRING_FLOAT = SOLUTION_READER___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___SET_PROGRESS__PROGRESSFEEDBACK = SOLUTION_READER___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___GET_RETURN = SOLUTION_READER___GET_RETURN;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___SET_RETURN__RETURNFEEDBACK = SOLUTION_READER___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___GET_GENERATOR = SOLUTION_READER___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___DISPOSE = SOLUTION_READER___DISPOSE;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___SOLUTION_FACTORY = SOLUTION_READER___SOLUTION_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___CONSTRUCT_SOLUTION = SOLUTION_READER___CONSTRUCT_SOLUTION;

	/**
	 * The operation id for the '<em>Read Sol From File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___READ_SOL_FROM_FILE = SOLUTION_READER___READ_SOL_FROM_FILE;

	/**
	 * The operation id for the '<em>Set Sol As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___SET_SOL_AS_STRING__STRING = SOLUTION_READER___SET_SOL_AS_STRING__STRING;

	/**
	 * The number of operations of the '<em>Solution Reader Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN_OPERATION_COUNT = SOLUTION_READER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolverImpl <em>Solver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolverImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolver()
	 * @generated
	 */
	int SOLVER = 21;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.ILpWriter <em>ILp Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.ILpWriter
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getILpWriter()
	 * @generated
	 */
	int ILP_WRITER = 19;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_WRITER__FILE_PATH = IGENERATOR_TOOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_WRITER__FILE_FORMAT = IGENERATOR_TOOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Compressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_WRITER__FILE_COMPRESSED = IGENERATOR_TOOL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ILp Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_WRITER_FEATURE_COUNT = IGENERATOR_TOOL_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_WRITER___GET_GENERATOR = IGENERATOR_TOOL___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_WRITER___DISPOSE = IGENERATOR_TOOL___DISPOSE;

	/**
	 * The operation id for the '<em>Write Lp To File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_WRITER___WRITE_LP_TO_FILE = IGENERATOR_TOOL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Lp As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_WRITER___GET_LP_AS_STRING = IGENERATOR_TOOL_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>ILp Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_WRITER_OPERATION_COUNT = IGENERATOR_TOOL_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_FEEDBACK = SOLUTION_PROVIDER__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__CANCEL_FEEDBACK = SOLUTION_PROVIDER__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RESET_FEEDBACK = SOLUTION_PROVIDER__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__CANCELED = SOLUTION_PROVIDER__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RETURN_SUCCESS = SOLUTION_PROVIDER__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RETURN_FEEDBACK = SOLUTION_PROVIDER__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RETURN_INFORMATION = SOLUTION_PROVIDER__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOLUTION = SOLUTION_PROVIDER__SOLUTION;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__CURRENT_SOLUTION_NR = SOLUTION_PROVIDER__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__CODE = SOLUTION_PROVIDER__CODE;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__REMARKS = SOLUTION_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__STATUS = SOLUTION_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Solver Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOLVER_MAX_DURATION = SOLUTION_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Solver Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOLVER_LOG_LEVEL = SOLUTION_PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Solver Dump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOLVER_DUMP = SOLUTION_PROVIDER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Run Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_STARTED = SOLUTION_PROVIDER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Run Initialization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_INITIALIZATION_ENDED = SOLUTION_PROVIDER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Run Solving Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_SOLVING_ENDED = SOLUTION_PROVIDER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Run Finalization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_FINALIZATION_ENDED = SOLUTION_PROVIDER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Run Duration Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_DURATION_INITIALIZATION = SOLUTION_PROVIDER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Run Duration Finalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_DURATION_FINALIZATION = SOLUTION_PROVIDER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Run Duration Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_DURATION_SOLVING = SOLUTION_PROVIDER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Run Request Terminate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_REQUEST_TERMINATE = SOLUTION_PROVIDER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Run Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_TIME_OUT = SOLUTION_PROVIDER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Sol Unfeasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOL_UNFEASIBLE = SOLUTION_PROVIDER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sol Feasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOL_FEASIBLE = SOLUTION_PROVIDER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sol Optimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOL_OPTIMAL = SOLUTION_PROVIDER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOL_VALUE = SOLUTION_PROVIDER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Run Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_INTERRUPTED = SOLUTION_PROVIDER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__INITIALIZING = SOLUTION_PROVIDER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOLVING = SOLUTION_PROVIDER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Finalizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__FINALIZING = SOLUTION_PROVIDER_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__FINISHED = SOLUTION_PROVIDER_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Initial Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__INITIAL_SOLUTION = SOLUTION_PROVIDER_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__GOALS = SOLUTION_PROVIDER_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Solver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_FEATURE_COUNT = SOLUTION_PROVIDER_FEATURE_COUNT + 25;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___RESET = SOLUTION_PROVIDER___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___RUN = SOLUTION_PROVIDER___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___RUN__RUNCONTEXT = SOLUTION_PROVIDER___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___CANCEL = SOLUTION_PROVIDER___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___SET_PROGRESS__STRING_FLOAT = SOLUTION_PROVIDER___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___SET_PROGRESS__PROGRESSFEEDBACK = SOLUTION_PROVIDER___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___GET_RETURN = SOLUTION_PROVIDER___GET_RETURN;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___SET_RETURN__RETURNFEEDBACK = SOLUTION_PROVIDER___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___GET_GENERATOR = SOLUTION_PROVIDER___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___DISPOSE = SOLUTION_PROVIDER___DISPOSE;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___SOLUTION_FACTORY = SOLUTION_PROVIDER___SOLUTION_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___CONSTRUCT_SOLUTION = SOLUTION_PROVIDER___CONSTRUCT_SOLUTION;

	/**
	 * The operation id for the '<em>Solve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___SOLVE = SOLUTION_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___BUILD_VARS = SOLUTION_PROVIDER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Build Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___BUILD_VAR__GENERATORVAR = SOLUTION_PROVIDER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Build Lp Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___BUILD_LP_VAR__GENERATORLPVAR = SOLUTION_PROVIDER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Build Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___BUILD_CONS = SOLUTION_PROVIDER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Build Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___BUILD_CONS__GENERATORCONS = SOLUTION_PROVIDER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Build Lp Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___BUILD_LP_CONS__GENERATORLPCONS = SOLUTION_PROVIDER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Build Lp Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___BUILD_LP_CONS__GENERATORELEMENT_GENERATORLPLINEAR_FLOAT_ENUMLPCONSTYPE = SOLUTION_PROVIDER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Build Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___BUILD_GOALS = SOLUTION_PROVIDER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Build Lp Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___BUILD_LP_GOAL__GENERATORLPGOAL_FLOAT = SOLUTION_PROVIDER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___CONSTRUCT_SOLVER_GOAL__GENERATORGOAL = SOLUTION_PROVIDER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___CONSTRUCT_SOLVER_GOAL__SOLUTION = SOLUTION_PROVIDER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___CONSTRUCT_SOLVER_GOAL__SOLVER = SOLUTION_PROVIDER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Make Solution Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___MAKE_SOLUTION_GOALS__SOLUTION = SOLUTION_PROVIDER_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Solver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_OPERATION_COUNT = SOLUTION_PROVIDER_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolverLpImpl <em>Lp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolverLpImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolverLp()
	 * @generated
	 */
	int SOLVER_LP = 23;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionVarImpl <em>Solution Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionVarImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionVar()
	 * @generated
	 */
	int SOLUTION_VAR = 30;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionLpVarImpl <em>Solution Lp Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionLpVarImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionLpVar()
	 * @generated
	 */
	int SOLUTION_LP_VAR = 31;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionConsImpl <em>Solution Cons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionConsImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionCons()
	 * @generated
	 */
	int SOLUTION_CONS = 33;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionLpConsImpl <em>Solution Lp Cons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionLpConsImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionLpCons()
	 * @generated
	 */
	int SOLUTION_LP_CONS = 34;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpConsImpl <em>Generator Cp Cons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorCpConsImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpCons()
	 * @generated
	 */
	int GENERATOR_CP_CONS = 37;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpLinearImpl <em>Generator Cp Linear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorCpLinearImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpLinear()
	 * @generated
	 */
	int GENERATOR_CP_LINEAR = 38;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpLogicalImpl <em>Generator Cp Logical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorCpLogicalImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpLogical()
	 * @generated
	 */
	int GENERATOR_CP_LOGICAL = 39;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpVarImpl <em>Generator Cp Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorCpVarImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpVar()
	 * @generated
	 */
	int GENERATOR_CP_VAR = 40;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpVarAtomicImpl <em>Generator Cp Var Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorCpVarAtomicImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpVarAtomic()
	 * @generated
	 */
	int GENERATOR_CP_VAR_ATOMIC = 41;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpLinearTermImpl <em>Generator Cp Linear Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorCpLinearTermImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpLinearTerm()
	 * @generated
	 */
	int GENERATOR_CP_LINEAR_TERM = 42;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpLogicalTermImpl <em>Generator Cp Logical Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorCpLogicalTermImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpLogicalTerm()
	 * @generated
	 */
	int GENERATOR_CP_LOGICAL_TERM = 43;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionCpVarImpl <em>Solution Cp Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionCpVarImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionCpVar()
	 * @generated
	 */
	int SOLUTION_CP_VAR = 32;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolverCpImpl <em>Cp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolverCpImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolverCp()
	 * @generated
	 */
	int SOLVER_CP = 22;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RUN_FEEDBACK = SOLVER__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__CANCEL_FEEDBACK = SOLVER__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RESET_FEEDBACK = SOLVER__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__CANCELED = SOLVER__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RETURN_SUCCESS = SOLVER__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RETURN_FEEDBACK = SOLVER__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RETURN_INFORMATION = SOLVER__RETURN_INFORMATION;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 27;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionLpImpl <em>Solution Lp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionLpImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionLp()
	 * @generated
	 */
	int SOLUTION_LP = 29;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__SOLUTION = SOLVER__SOLUTION;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__CURRENT_SOLUTION_NR = SOLVER__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__CODE = SOLVER__CODE;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__REMARKS = SOLVER__REMARKS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__STATUS = SOLVER__STATUS;

	/**
	 * The feature id for the '<em><b>Solver Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__SOLVER_MAX_DURATION = SOLVER__SOLVER_MAX_DURATION;

	/**
	 * The feature id for the '<em><b>Solver Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__SOLVER_LOG_LEVEL = SOLVER__SOLVER_LOG_LEVEL;

	/**
	 * The feature id for the '<em><b>Solver Dump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__SOLVER_DUMP = SOLVER__SOLVER_DUMP;

	/**
	 * The feature id for the '<em><b>Run Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RUN_STARTED = SOLVER__RUN_STARTED;

	/**
	 * The feature id for the '<em><b>Run Initialization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RUN_INITIALIZATION_ENDED = SOLVER__RUN_INITIALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Solving Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RUN_SOLVING_ENDED = SOLVER__RUN_SOLVING_ENDED;

	/**
	 * The feature id for the '<em><b>Run Finalization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RUN_FINALIZATION_ENDED = SOLVER__RUN_FINALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Duration Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RUN_DURATION_INITIALIZATION = SOLVER__RUN_DURATION_INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Finalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RUN_DURATION_FINALIZATION = SOLVER__RUN_DURATION_FINALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RUN_DURATION_SOLVING = SOLVER__RUN_DURATION_SOLVING;

	/**
	 * The feature id for the '<em><b>Run Request Terminate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RUN_REQUEST_TERMINATE = SOLVER__RUN_REQUEST_TERMINATE;

	/**
	 * The feature id for the '<em><b>Run Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RUN_TIME_OUT = SOLVER__RUN_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Sol Unfeasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__SOL_UNFEASIBLE = SOLVER__SOL_UNFEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Feasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__SOL_FEASIBLE = SOLVER__SOL_FEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Optimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__SOL_OPTIMAL = SOLVER__SOL_OPTIMAL;

	/**
	 * The feature id for the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__SOL_VALUE = SOLVER__SOL_VALUE;

	/**
	 * The feature id for the '<em><b>Run Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RUN_INTERRUPTED = SOLVER__RUN_INTERRUPTED;

	/**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__INITIALIZING = SOLVER__INITIALIZING;

	/**
	 * The feature id for the '<em><b>Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__SOLVING = SOLVER__SOLVING;

	/**
	 * The feature id for the '<em><b>Finalizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__FINALIZING = SOLVER__FINALIZING;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__FINISHED = SOLVER__FINISHED;

	/**
	 * The feature id for the '<em><b>Initial Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__INITIAL_SOLUTION = SOLVER__INITIAL_SOLUTION;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__GOALS = SOLVER__GOALS;

	/**
	 * The feature id for the '<em><b>Search All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__SEARCH_ALL = SOLVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP_FEATURE_COUNT = SOLVER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___RESET = SOLVER___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___RUN = SOLVER___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___RUN__RUNCONTEXT = SOLVER___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___CANCEL = SOLVER___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___SET_PROGRESS__STRING_FLOAT = SOLVER___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___SET_PROGRESS__PROGRESSFEEDBACK = SOLVER___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___GET_RETURN = SOLVER___GET_RETURN;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___SET_RETURN__RETURNFEEDBACK = SOLVER___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___GET_GENERATOR = SOLVER___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___DISPOSE = SOLVER___DISPOSE;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___SOLUTION_FACTORY = SOLVER___SOLUTION_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___CONSTRUCT_SOLUTION = SOLVER___CONSTRUCT_SOLUTION;

	/**
	 * The operation id for the '<em>Solve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___SOLVE = SOLVER___SOLVE;

	/**
	 * The operation id for the '<em>Build Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___BUILD_VARS = SOLVER___BUILD_VARS;

	/**
	 * The operation id for the '<em>Build Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___BUILD_VAR__GENERATORVAR = SOLVER___BUILD_VAR__GENERATORVAR;

	/**
	 * The operation id for the '<em>Build Lp Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___BUILD_LP_VAR__GENERATORLPVAR = SOLVER___BUILD_LP_VAR__GENERATORLPVAR;

	/**
	 * The operation id for the '<em>Build Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___BUILD_CONS = SOLVER___BUILD_CONS;

	/**
	 * The operation id for the '<em>Build Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___BUILD_CONS__GENERATORCONS = SOLVER___BUILD_CONS__GENERATORCONS;

	/**
	 * The operation id for the '<em>Build Lp Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___BUILD_LP_CONS__GENERATORLPCONS = SOLVER___BUILD_LP_CONS__GENERATORLPCONS;

	/**
	 * The operation id for the '<em>Build Lp Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___BUILD_LP_CONS__GENERATORELEMENT_GENERATORLPLINEAR_FLOAT_ENUMLPCONSTYPE = SOLVER___BUILD_LP_CONS__GENERATORELEMENT_GENERATORLPLINEAR_FLOAT_ENUMLPCONSTYPE;

	/**
	 * The operation id for the '<em>Build Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___BUILD_GOALS = SOLVER___BUILD_GOALS;

	/**
	 * The operation id for the '<em>Build Lp Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___BUILD_LP_GOAL__GENERATORLPGOAL_FLOAT = SOLVER___BUILD_LP_GOAL__GENERATORLPGOAL_FLOAT;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___CONSTRUCT_SOLVER_GOAL__GENERATORGOAL = SOLVER___CONSTRUCT_SOLVER_GOAL__GENERATORGOAL;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___CONSTRUCT_SOLVER_GOAL__SOLUTION = SOLVER___CONSTRUCT_SOLVER_GOAL__SOLUTION;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___CONSTRUCT_SOLVER_GOAL__SOLVER = SOLVER___CONSTRUCT_SOLVER_GOAL__SOLVER;

	/**
	 * The operation id for the '<em>Make Solution Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___MAKE_SOLUTION_GOALS__SOLUTION = SOLVER___MAKE_SOLUTION_GOALS__SOLUTION;

	/**
	 * The number of operations of the '<em>Cp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP_OPERATION_COUNT = SOLVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RUN_FEEDBACK = SOLVER__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__CANCEL_FEEDBACK = SOLVER__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RESET_FEEDBACK = SOLVER__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__CANCELED = SOLVER__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RETURN_SUCCESS = SOLVER__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RETURN_FEEDBACK = SOLVER__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RETURN_INFORMATION = SOLVER__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__SOLUTION = SOLVER__SOLUTION;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__CURRENT_SOLUTION_NR = SOLVER__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__CODE = SOLVER__CODE;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__REMARKS = SOLVER__REMARKS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__STATUS = SOLVER__STATUS;

	/**
	 * The feature id for the '<em><b>Solver Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__SOLVER_MAX_DURATION = SOLVER__SOLVER_MAX_DURATION;

	/**
	 * The feature id for the '<em><b>Solver Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__SOLVER_LOG_LEVEL = SOLVER__SOLVER_LOG_LEVEL;

	/**
	 * The feature id for the '<em><b>Solver Dump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__SOLVER_DUMP = SOLVER__SOLVER_DUMP;

	/**
	 * The feature id for the '<em><b>Run Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RUN_STARTED = SOLVER__RUN_STARTED;

	/**
	 * The feature id for the '<em><b>Run Initialization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RUN_INITIALIZATION_ENDED = SOLVER__RUN_INITIALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Solving Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RUN_SOLVING_ENDED = SOLVER__RUN_SOLVING_ENDED;

	/**
	 * The feature id for the '<em><b>Run Finalization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RUN_FINALIZATION_ENDED = SOLVER__RUN_FINALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Duration Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RUN_DURATION_INITIALIZATION = SOLVER__RUN_DURATION_INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Finalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RUN_DURATION_FINALIZATION = SOLVER__RUN_DURATION_FINALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RUN_DURATION_SOLVING = SOLVER__RUN_DURATION_SOLVING;

	/**
	 * The feature id for the '<em><b>Run Request Terminate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RUN_REQUEST_TERMINATE = SOLVER__RUN_REQUEST_TERMINATE;

	/**
	 * The feature id for the '<em><b>Run Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RUN_TIME_OUT = SOLVER__RUN_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Sol Unfeasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__SOL_UNFEASIBLE = SOLVER__SOL_UNFEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Feasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__SOL_FEASIBLE = SOLVER__SOL_FEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Optimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__SOL_OPTIMAL = SOLVER__SOL_OPTIMAL;

	/**
	 * The feature id for the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__SOL_VALUE = SOLVER__SOL_VALUE;

	/**
	 * The feature id for the '<em><b>Run Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RUN_INTERRUPTED = SOLVER__RUN_INTERRUPTED;

	/**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__INITIALIZING = SOLVER__INITIALIZING;

	/**
	 * The feature id for the '<em><b>Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__SOLVING = SOLVER__SOLVING;

	/**
	 * The feature id for the '<em><b>Finalizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__FINALIZING = SOLVER__FINALIZING;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__FINISHED = SOLVER__FINISHED;

	/**
	 * The feature id for the '<em><b>Initial Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__INITIAL_SOLUTION = SOLVER__INITIAL_SOLUTION;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__GOALS = SOLVER__GOALS;

	/**
	 * The feature id for the '<em><b>Solver Optimality Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__SOLVER_OPTIMALITY_TOLERANCE = SOLVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solver Linear Relaxation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__SOLVER_LINEAR_RELAXATION = SOLVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sol Optimality Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__SOL_OPTIMALITY_GAP = SOLVER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP_FEATURE_COUNT = SOLVER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___RESET = SOLVER___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___RUN = SOLVER___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___RUN__RUNCONTEXT = SOLVER___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___CANCEL = SOLVER___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___SET_PROGRESS__STRING_FLOAT = SOLVER___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___SET_PROGRESS__PROGRESSFEEDBACK = SOLVER___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___GET_RETURN = SOLVER___GET_RETURN;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___SET_RETURN__RETURNFEEDBACK = SOLVER___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___GET_GENERATOR = SOLVER___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___DISPOSE = SOLVER___DISPOSE;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___SOLUTION_FACTORY = SOLVER___SOLUTION_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___CONSTRUCT_SOLUTION = SOLVER___CONSTRUCT_SOLUTION;

	/**
	 * The operation id for the '<em>Solve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___SOLVE = SOLVER___SOLVE;

	/**
	 * The operation id for the '<em>Build Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___BUILD_VARS = SOLVER___BUILD_VARS;

	/**
	 * The operation id for the '<em>Build Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___BUILD_VAR__GENERATORVAR = SOLVER___BUILD_VAR__GENERATORVAR;

	/**
	 * The operation id for the '<em>Build Lp Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___BUILD_LP_VAR__GENERATORLPVAR = SOLVER___BUILD_LP_VAR__GENERATORLPVAR;

	/**
	 * The operation id for the '<em>Build Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___BUILD_CONS = SOLVER___BUILD_CONS;

	/**
	 * The operation id for the '<em>Build Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___BUILD_CONS__GENERATORCONS = SOLVER___BUILD_CONS__GENERATORCONS;

	/**
	 * The operation id for the '<em>Build Lp Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___BUILD_LP_CONS__GENERATORLPCONS = SOLVER___BUILD_LP_CONS__GENERATORLPCONS;

	/**
	 * The operation id for the '<em>Build Lp Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___BUILD_LP_CONS__GENERATORELEMENT_GENERATORLPLINEAR_FLOAT_ENUMLPCONSTYPE = SOLVER___BUILD_LP_CONS__GENERATORELEMENT_GENERATORLPLINEAR_FLOAT_ENUMLPCONSTYPE;

	/**
	 * The operation id for the '<em>Build Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___BUILD_GOALS = SOLVER___BUILD_GOALS;

	/**
	 * The operation id for the '<em>Build Lp Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___BUILD_LP_GOAL__GENERATORLPGOAL_FLOAT = SOLVER___BUILD_LP_GOAL__GENERATORLPGOAL_FLOAT;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___CONSTRUCT_SOLVER_GOAL__GENERATORGOAL = SOLVER___CONSTRUCT_SOLVER_GOAL__GENERATORGOAL;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___CONSTRUCT_SOLVER_GOAL__SOLUTION = SOLVER___CONSTRUCT_SOLVER_GOAL__SOLUTION;

	/**
	 * The operation id for the '<em>Construct Solver Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___CONSTRUCT_SOLVER_GOAL__SOLVER = SOLVER___CONSTRUCT_SOLVER_GOAL__SOLVER;

	/**
	 * The operation id for the '<em>Make Solution Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___MAKE_SOLUTION_GOALS__SOLUTION = SOLVER___MAKE_SOLUTION_GOALS__SOLUTION;

	/**
	 * The number of operations of the '<em>Lp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP_OPERATION_COUNT = SOLVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionElementImpl <em>Solution Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionElementImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionElement()
	 * @generated
	 */
	int SOLUTION_ELEMENT = 28;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionGoalImpl <em>Solution Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionGoalImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionGoal()
	 * @generated
	 */
	int SOLUTION_GOAL = 35;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionLpGoalImpl <em>Solution Lp Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionLpGoalImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionLpGoal()
	 * @generated
	 */
	int SOLUTION_LP_GOAL = 36;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorGoalImpl <em>Generator Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorGoalImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorGoal()
	 * @generated
	 */
	int GENERATOR_GOAL = 44;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl <em>Generator Lp Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpGoal()
	 * @generated
	 */
	int GENERATOR_LP_GOAL = 45;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpLinearImpl <em>Generator Lp Linear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorLpLinearImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpLinear()
	 * @generated
	 */
	int GENERATOR_LP_LINEAR = 46;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolverGoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolverGoalImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolverGoal()
	 * @generated
	 */
	int SOLVER_GOAL = 24;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GOAL__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Solver</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GOAL__SOLVER = 1;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GOAL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Build Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GOAL___BUILD_GOAL = 0;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GOAL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolverGeneratorGoalImpl <em>Generator Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolverGeneratorGoalImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolverGeneratorGoal()
	 * @generated
	 */
	int SOLVER_GENERATOR_GOAL = 25;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GENERATOR_GOAL__LABEL = SOLVER_GOAL__LABEL;

	/**
	 * The feature id for the '<em><b>Solver</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GENERATOR_GOAL__SOLVER = SOLVER_GOAL__SOLVER;

	/**
	 * The feature id for the '<em><b>Goal To Solve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GENERATOR_GOAL__GOAL_TO_SOLVE = SOLVER_GOAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Goal Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GENERATOR_GOAL__GOAL_WEIGHT = SOLVER_GOAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Goal Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GENERATOR_GOAL__GOAL_BOUND = SOLVER_GOAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Optimize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GENERATOR_GOAL__OPTIMIZE = SOLVER_GOAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GENERATOR_GOAL__CONSTRAINT = SOLVER_GOAL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Generator Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GENERATOR_GOAL_FEATURE_COUNT = SOLVER_GOAL_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Build Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GENERATOR_GOAL___BUILD_GOAL = SOLVER_GOAL___BUILD_GOAL;

	/**
	 * The number of operations of the '<em>Generator Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GENERATOR_GOAL_OPERATION_COUNT = SOLVER_GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolverGoalPreviousSolverImpl <em>Goal Previous Solver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolverGoalPreviousSolverImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolverGoalPreviousSolver()
	 * @generated
	 */
	int SOLVER_GOAL_PREVIOUS_SOLVER = 26;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GOAL_PREVIOUS_SOLVER__LABEL = SOLVER_GOAL__LABEL;

	/**
	 * The feature id for the '<em><b>Solver</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GOAL_PREVIOUS_SOLVER__SOLVER = SOLVER_GOAL__SOLVER;

	/**
	 * The feature id for the '<em><b>Previous Solver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLVER = SOLVER_GOAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLUTION = SOLVER_GOAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Goal Previous Solver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GOAL_PREVIOUS_SOLVER_FEATURE_COUNT = SOLVER_GOAL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Build Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GOAL_PREVIOUS_SOLVER___BUILD_GOAL = SOLVER_GOAL___BUILD_GOAL;

	/**
	 * The number of operations of the '<em>Goal Previous Solver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_GOAL_PREVIOUS_SOLVER_OPERATION_COUNT = SOLVER_GOAL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SOLUTION_NR = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CODE = 2;

	/**
	 * The feature id for the '<em><b>Solver As Initial Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SOLVER_AS_INITIAL_SOLUTION = 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__VARS = 5;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CONS = 6;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__GOALS = 7;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Solution Var Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___SOLUTION_VAR_FACTORY = 0;

	/**
	 * The operation id for the '<em>Solution Cons Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___SOLUTION_CONS_FACTORY = 1;

	/**
	 * The operation id for the '<em>Solution Goal Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___SOLUTION_GOAL_FACTORY = 2;

	/**
	 * The operation id for the '<em>Construct Solution Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___CONSTRUCT_SOLUTION_VAR__GENERATORVAR = 3;

	/**
	 * The operation id for the '<em>Construct Solution Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___CONSTRUCT_SOLUTION_CONS__GENERATORCONS = 4;

	/**
	 * The operation id for the '<em>Construct Solution Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___CONSTRUCT_SOLUTION_GOAL__GENERATORGOAL = 5;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___DISPOSE = 6;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_ELEMENT__SOLUTION = 0;

	/**
	 * The number of structural features of the '<em>Solution Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_ELEMENT___DISPOSE = 0;

	/**
	 * The number of operations of the '<em>Solution Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP__PROVIDER = SOLUTION__PROVIDER;

	/**
	 * The feature id for the '<em><b>Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP__SOLUTION_NR = SOLUTION__SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP__CODE = SOLUTION__CODE;

	/**
	 * The feature id for the '<em><b>Solver As Initial Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP__SOLVER_AS_INITIAL_SOLUTION = SOLUTION__SOLVER_AS_INITIAL_SOLUTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP__ELEMENTS = SOLUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP__VARS = SOLUTION__VARS;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP__CONS = SOLUTION__CONS;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP__GOALS = SOLUTION__GOALS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP__VALUE = SOLUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solution Lp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_FEATURE_COUNT = SOLUTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Solution Var Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP___SOLUTION_VAR_FACTORY = SOLUTION___SOLUTION_VAR_FACTORY;

	/**
	 * The operation id for the '<em>Solution Cons Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP___SOLUTION_CONS_FACTORY = SOLUTION___SOLUTION_CONS_FACTORY;

	/**
	 * The operation id for the '<em>Solution Goal Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP___SOLUTION_GOAL_FACTORY = SOLUTION___SOLUTION_GOAL_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP___CONSTRUCT_SOLUTION_VAR__GENERATORVAR = SOLUTION___CONSTRUCT_SOLUTION_VAR__GENERATORVAR;

	/**
	 * The operation id for the '<em>Construct Solution Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP___CONSTRUCT_SOLUTION_CONS__GENERATORCONS = SOLUTION___CONSTRUCT_SOLUTION_CONS__GENERATORCONS;

	/**
	 * The operation id for the '<em>Construct Solution Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP___CONSTRUCT_SOLUTION_GOAL__GENERATORGOAL = SOLUTION___CONSTRUCT_SOLUTION_GOAL__GENERATORGOAL;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP___DISPOSE = SOLUTION___DISPOSE;

	/**
	 * The number of operations of the '<em>Solution Lp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_OPERATION_COUNT = SOLUTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR__SOLUTION = SOLUTION_ELEMENT__SOLUTION;

	/**
	 * The feature id for the '<em><b>Optimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR__OPTIMAL_VALUE = SOLUTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR__VAR = SOLUTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Solution Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR_FEATURE_COUNT = SOLUTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR___DISPOSE = SOLUTION_ELEMENT___DISPOSE;

	/**
	 * The operation id for the '<em>Is One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR___IS_ONE = SOLUTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR___IS_ZERO = SOLUTION_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Solution Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR_OPERATION_COUNT = SOLUTION_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_VAR__SOLUTION = SOLUTION_VAR__SOLUTION;

	/**
	 * The feature id for the '<em><b>Optimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_VAR__OPTIMAL_VALUE = SOLUTION_VAR__OPTIMAL_VALUE;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_VAR__VAR = SOLUTION_VAR__VAR;

	/**
	 * The number of structural features of the '<em>Solution Lp Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_VAR_FEATURE_COUNT = SOLUTION_VAR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_VAR___DISPOSE = SOLUTION_VAR___DISPOSE;

	/**
	 * The operation id for the '<em>Is One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_VAR___IS_ONE = SOLUTION_VAR___IS_ONE;

	/**
	 * The operation id for the '<em>Is Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_VAR___IS_ZERO = SOLUTION_VAR___IS_ZERO;

	/**
	 * The number of operations of the '<em>Solution Lp Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_VAR_OPERATION_COUNT = SOLUTION_VAR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CP_VAR__SOLUTION = SOLUTION_VAR__SOLUTION;

	/**
	 * The feature id for the '<em><b>Optimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CP_VAR__OPTIMAL_VALUE = SOLUTION_VAR__OPTIMAL_VALUE;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CP_VAR__VAR = SOLUTION_VAR__VAR;

	/**
	 * The number of structural features of the '<em>Solution Cp Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CP_VAR_FEATURE_COUNT = SOLUTION_VAR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CP_VAR___DISPOSE = SOLUTION_VAR___DISPOSE;

	/**
	 * The operation id for the '<em>Is One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CP_VAR___IS_ONE = SOLUTION_VAR___IS_ONE;

	/**
	 * The operation id for the '<em>Is Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CP_VAR___IS_ZERO = SOLUTION_VAR___IS_ZERO;

	/**
	 * The number of operations of the '<em>Solution Cp Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CP_VAR_OPERATION_COUNT = SOLUTION_VAR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CONS__SOLUTION = SOLUTION_ELEMENT__SOLUTION;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CONS__CONS = SOLUTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solution Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CONS_FEATURE_COUNT = SOLUTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CONS___DISPOSE = SOLUTION_ELEMENT___DISPOSE;

	/**
	 * The number of operations of the '<em>Solution Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CONS_OPERATION_COUNT = SOLUTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_CONS__SOLUTION = SOLUTION_CONS__SOLUTION;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_CONS__CONS = SOLUTION_CONS__CONS;

	/**
	 * The number of structural features of the '<em>Solution Lp Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_CONS_FEATURE_COUNT = SOLUTION_CONS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_CONS___DISPOSE = SOLUTION_CONS___DISPOSE;

	/**
	 * The number of operations of the '<em>Solution Lp Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_CONS_OPERATION_COUNT = SOLUTION_CONS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_GOAL__SOLUTION = SOLUTION_ELEMENT__SOLUTION;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_GOAL__GOAL = SOLUTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_GOAL__LABEL = SOLUTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constrained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_GOAL__CONSTRAINED = SOLUTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Optimized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_GOAL__OPTIMIZED = SOLUTION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_GOAL__BOUND = SOLUTION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Solution Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_GOAL_FEATURE_COUNT = SOLUTION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_GOAL___DISPOSE = SOLUTION_ELEMENT___DISPOSE;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_GOAL___REFRESH = SOLUTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Goal As Previous Solver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_GOAL___BUILD_GOAL_AS_PREVIOUS_SOLVER__SOLVER = SOLUTION_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Solution Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_GOAL_OPERATION_COUNT = SOLUTION_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_GOAL__SOLUTION = SOLUTION_GOAL__SOLUTION;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_GOAL__GOAL = SOLUTION_GOAL__GOAL;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_GOAL__LABEL = SOLUTION_GOAL__LABEL;

	/**
	 * The feature id for the '<em><b>Constrained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_GOAL__CONSTRAINED = SOLUTION_GOAL__CONSTRAINED;

	/**
	 * The feature id for the '<em><b>Optimized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_GOAL__OPTIMIZED = SOLUTION_GOAL__OPTIMIZED;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_GOAL__BOUND = SOLUTION_GOAL__BOUND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_GOAL__VALUE = SOLUTION_GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solution Lp Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_GOAL_FEATURE_COUNT = SOLUTION_GOAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_GOAL___DISPOSE = SOLUTION_GOAL___DISPOSE;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_GOAL___REFRESH = SOLUTION_GOAL___REFRESH;

	/**
	 * The operation id for the '<em>Build Goal As Previous Solver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_GOAL___BUILD_GOAL_AS_PREVIOUS_SOLVER__SOLVER = SOLUTION_GOAL___BUILD_GOAL_AS_PREVIOUS_SOLVER__SOLVER;

	/**
	 * The number of operations of the '<em>Solution Lp Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_GOAL_OPERATION_COUNT = SOLUTION_GOAL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS__CODE = GENERATOR_CONS__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS__NAME = GENERATOR_CONS__NAME;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS__TUPLE = GENERATOR_CONS__TUPLE;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS__SELECTED_SOLUTION_DISPLAY = GENERATOR_CONS__SELECTED_SOLUTION_DISPLAY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS__LABEL = GENERATOR_CONS__LABEL;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS__SOLUTION = GENERATOR_CONS__SOLUTION;

	/**
	 * The feature id for the '<em><b>Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS__NOF_TERMS = GENERATOR_CONS__NOF_TERMS;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS__POST = GENERATOR_CONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generator Cp Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS_FEATURE_COUNT = GENERATOR_CONS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS___GET_GENERATOR = GENERATOR_CONS___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS___REFRESH_SELECTED_SOLUTION = GENERATOR_CONS___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Get Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS___GET_SOLUTION__SOLUTION = GENERATOR_CONS___GET_SOLUTION__SOLUTION;

	/**
	 * The operation id for the '<em>Build</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS___BUILD__SOLVER = GENERATOR_CONS___BUILD__SOLVER;

	/**
	 * The number of operations of the '<em>Generator Cp Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS_OPERATION_COUNT = GENERATOR_CONS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR__CODE = GENERATOR_CP_CONS__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR__NAME = GENERATOR_CP_CONS__NAME;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR__TUPLE = GENERATOR_CP_CONS__TUPLE;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR__SELECTED_SOLUTION_DISPLAY = GENERATOR_CP_CONS__SELECTED_SOLUTION_DISPLAY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR__LABEL = GENERATOR_CP_CONS__LABEL;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR__SOLUTION = GENERATOR_CP_CONS__SOLUTION;

	/**
	 * The feature id for the '<em><b>Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR__NOF_TERMS = GENERATOR_CP_CONS__NOF_TERMS;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR__POST = GENERATOR_CP_CONS__POST;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR__TYPE = GENERATOR_CP_CONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR__RIGHT_HAND_SIDE = GENERATOR_CP_CONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR__TERM = GENERATOR_CP_CONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generator Cp Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR_FEATURE_COUNT = GENERATOR_CP_CONS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR___GET_GENERATOR = GENERATOR_CP_CONS___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR___REFRESH_SELECTED_SOLUTION = GENERATOR_CP_CONS___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Get Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR___GET_SOLUTION__SOLUTION = GENERATOR_CP_CONS___GET_SOLUTION__SOLUTION;

	/**
	 * The operation id for the '<em>Build</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR___BUILD__SOLVER = GENERATOR_CP_CONS___BUILD__SOLVER;

	/**
	 * The number of operations of the '<em>Generator Cp Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR_OPERATION_COUNT = GENERATOR_CP_CONS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL__CODE = GENERATOR_CP_CONS__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL__NAME = GENERATOR_CP_CONS__NAME;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL__TUPLE = GENERATOR_CP_CONS__TUPLE;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL__SELECTED_SOLUTION_DISPLAY = GENERATOR_CP_CONS__SELECTED_SOLUTION_DISPLAY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL__LABEL = GENERATOR_CP_CONS__LABEL;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL__SOLUTION = GENERATOR_CP_CONS__SOLUTION;

	/**
	 * The feature id for the '<em><b>Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL__NOF_TERMS = GENERATOR_CP_CONS__NOF_TERMS;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL__POST = GENERATOR_CP_CONS__POST;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL__TERM = GENERATOR_CP_CONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL__NOT = GENERATOR_CP_CONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL__TYPE = GENERATOR_CP_CONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generator Cp Logical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL_FEATURE_COUNT = GENERATOR_CP_CONS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL___GET_GENERATOR = GENERATOR_CP_CONS___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL___REFRESH_SELECTED_SOLUTION = GENERATOR_CP_CONS___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Get Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL___GET_SOLUTION__SOLUTION = GENERATOR_CP_CONS___GET_SOLUTION__SOLUTION;

	/**
	 * The operation id for the '<em>Build</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL___BUILD__SOLVER = GENERATOR_CP_CONS___BUILD__SOLVER;

	/**
	 * The number of operations of the '<em>Generator Cp Logical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL_OPERATION_COUNT = GENERATOR_CP_CONS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR__CODE = GENERATOR_VAR__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR__NAME = GENERATOR_VAR__NAME;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR__TUPLE = GENERATOR_VAR__TUPLE;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR__SELECTED_SOLUTION_DISPLAY = GENERATOR_VAR__SELECTED_SOLUTION_DISPLAY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR__LABEL = GENERATOR_VAR__LABEL;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR__SOLUTION = GENERATOR_VAR__SOLUTION;

	/**
	 * The feature id for the '<em><b>Selected Solution Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR__SELECTED_SOLUTION_VALUE = GENERATOR_VAR__SELECTED_SOLUTION_VALUE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR__PRIORITY = GENERATOR_VAR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generator Cp Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_FEATURE_COUNT = GENERATOR_VAR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR___GET_GENERATOR = GENERATOR_VAR___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR___REFRESH_SELECTED_SOLUTION = GENERATOR_VAR___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Get Solution Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR___GET_SOLUTION_VAR__SOLUTION = GENERATOR_VAR___GET_SOLUTION_VAR__SOLUTION;

	/**
	 * The operation id for the '<em>Is Solution One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR___IS_SOLUTION_ONE__SOLUTION = GENERATOR_VAR___IS_SOLUTION_ONE__SOLUTION;

	/**
	 * The operation id for the '<em>Is Solution Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR___IS_SOLUTION_ZERO__SOLUTION = GENERATOR_VAR___IS_SOLUTION_ZERO__SOLUTION;

	/**
	 * The operation id for the '<em>Get Solution Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR___GET_SOLUTION_VALUE__SOLUTION = GENERATOR_VAR___GET_SOLUTION_VALUE__SOLUTION;

	/**
	 * The operation id for the '<em>Build</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR___BUILD__SOLVER = GENERATOR_VAR___BUILD__SOLVER;

	/**
	 * The number of operations of the '<em>Generator Cp Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_OPERATION_COUNT = GENERATOR_VAR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC__CODE = GENERATOR_CP_VAR__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC__NAME = GENERATOR_CP_VAR__NAME;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC__TUPLE = GENERATOR_CP_VAR__TUPLE;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC__SELECTED_SOLUTION_DISPLAY = GENERATOR_CP_VAR__SELECTED_SOLUTION_DISPLAY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC__LABEL = GENERATOR_CP_VAR__LABEL;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC__SOLUTION = GENERATOR_CP_VAR__SOLUTION;

	/**
	 * The feature id for the '<em><b>Selected Solution Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC__SELECTED_SOLUTION_VALUE = GENERATOR_CP_VAR__SELECTED_SOLUTION_VALUE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC__PRIORITY = GENERATOR_CP_VAR__PRIORITY;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC__LOWER_BOUND = GENERATOR_CP_VAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC__UPPER_BOUND = GENERATOR_CP_VAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generator Cp Var Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC_FEATURE_COUNT = GENERATOR_CP_VAR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC___GET_GENERATOR = GENERATOR_CP_VAR___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC___REFRESH_SELECTED_SOLUTION = GENERATOR_CP_VAR___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Get Solution Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC___GET_SOLUTION_VAR__SOLUTION = GENERATOR_CP_VAR___GET_SOLUTION_VAR__SOLUTION;

	/**
	 * The operation id for the '<em>Is Solution One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC___IS_SOLUTION_ONE__SOLUTION = GENERATOR_CP_VAR___IS_SOLUTION_ONE__SOLUTION;

	/**
	 * The operation id for the '<em>Is Solution Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC___IS_SOLUTION_ZERO__SOLUTION = GENERATOR_CP_VAR___IS_SOLUTION_ZERO__SOLUTION;

	/**
	 * The operation id for the '<em>Get Solution Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC___GET_SOLUTION_VALUE__SOLUTION = GENERATOR_CP_VAR___GET_SOLUTION_VALUE__SOLUTION;

	/**
	 * The operation id for the '<em>Build</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC___BUILD__SOLVER = GENERATOR_CP_VAR___BUILD__SOLVER;

	/**
	 * The number of operations of the '<em>Generator Cp Var Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC_OPERATION_COUNT = GENERATOR_CP_VAR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR_TERM__COEFF = 0;

	/**
	 * The feature id for the '<em><b>Cp Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR_TERM__CP_VAR = 1;

	/**
	 * The number of structural features of the '<em>Generator Cp Linear Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR_TERM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generator Cp Linear Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR_TERM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL_TERM__NOT = 0;

	/**
	 * The feature id for the '<em><b>Cp Cons</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL_TERM__CP_CONS = 1;

	/**
	 * The number of structural features of the '<em>Generator Cp Logical Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL_TERM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generator Cp Logical Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL_TERM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_GOAL__CODE = GENERATOR_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_GOAL__GENERATOR = GENERATOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_GOAL__NAME = GENERATOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_GOAL__SELECTED_SOLUTION_DISPLAY = GENERATOR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_GOAL__LABEL = GENERATOR_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_GOAL__SOLUTION = GENERATOR_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Generator Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_GOAL_FEATURE_COUNT = GENERATOR_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_GOAL___GET_GENERATOR = GENERATOR_ELEMENT___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_GOAL___REFRESH_SELECTED_SOLUTION = GENERATOR_ELEMENT___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Build</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_GOAL___BUILD__SOLVER_FLOAT = GENERATOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Build Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_GOAL___BUILD_CONS__SOLVER_FLOAT = GENERATOR_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Solution Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_GOAL___GET_SOLUTION_GOAL__SOLUTION = GENERATOR_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generator Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_GOAL_OPERATION_COUNT = GENERATOR_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL__CODE = GENERATOR_GOAL__CODE;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL__GENERATOR = GENERATOR_GOAL__GENERATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL__NAME = GENERATOR_GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL__SELECTED_SOLUTION_DISPLAY = GENERATOR_GOAL__SELECTED_SOLUTION_DISPLAY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL__LABEL = GENERATOR_GOAL__LABEL;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL__SOLUTION = GENERATOR_GOAL__SOLUTION;

	/**
	 * The feature id for the '<em><b>Lp Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL__LP_TERM = GENERATOR_GOAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objective Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL__OBJECTIVE_TYPE = GENERATOR_GOAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected Solution Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL__SELECTED_SOLUTION_VALUE = GENERATOR_GOAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Value Indicative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL__MIN_VALUE_INDICATIVE = GENERATOR_GOAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Value Indicative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL__MAX_VALUE_INDICATIVE = GENERATOR_GOAL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Generator Lp Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL_FEATURE_COUNT = GENERATOR_GOAL_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL___GET_GENERATOR = GENERATOR_GOAL___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL___REFRESH_SELECTED_SOLUTION = GENERATOR_GOAL___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Build</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL___BUILD__SOLVER_FLOAT = GENERATOR_GOAL___BUILD__SOLVER_FLOAT;

	/**
	 * The operation id for the '<em>Build Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL___BUILD_CONS__SOLVER_FLOAT = GENERATOR_GOAL___BUILD_CONS__SOLVER_FLOAT;

	/**
	 * The operation id for the '<em>Get Solution Goal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL___GET_SOLUTION_GOAL__SOLUTION = GENERATOR_GOAL___GET_SOLUTION_GOAL__SOLUTION;

	/**
	 * The operation id for the '<em>Construct Term</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL___CONSTRUCT_TERM__GENERATORLPVAR_FLOAT = GENERATOR_GOAL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Contribute Term</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL___CONTRIBUTE_TERM__GENERATORLPVAR_FLOAT = GENERATOR_GOAL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Solution Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL___GET_SOLUTION_VALUE__SOLUTION = GENERATOR_GOAL_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generator Lp Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_GOAL_OPERATION_COUNT = GENERATOR_GOAL_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lp Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_LINEAR__LP_TERM = 0;

	/**
	 * The number of structural features of the '<em>Generator Lp Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_LINEAR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Construct Term</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_LINEAR___CONSTRUCT_TERM__GENERATORLPVAR_FLOAT = 0;

	/**
	 * The operation id for the '<em>Contribute Term</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_LINEAR___CONTRIBUTE_TERM__GENERATORLPVAR_FLOAT = 1;

	/**
	 * The number of operations of the '<em>Generator Lp Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_LINEAR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '<em>ITuple Visitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.ITupleVisitor
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getITupleVisitor()
	 * @generated
	 */
	int ITUPLE_VISITOR = 54;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 55;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.EnumLpVarType <em>Enum Lp Var Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.EnumLpVarType
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumLpVarType()
	 * @generated
	 */
	int ENUM_LP_VAR_TYPE = 47;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.EnumLpConsType <em>Enum Lp Cons Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.EnumLpConsType
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumLpConsType()
	 * @generated
	 */
	int ENUM_LP_CONS_TYPE = 48;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.EnumObjectiveType <em>Enum Objective Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.EnumObjectiveType
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumObjectiveType()
	 * @generated
	 */
	int ENUM_OBJECTIVE_TYPE = 49;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.EnumSolverLogLevel <em>Enum Solver Log Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.EnumSolverLogLevel
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumSolverLogLevel()
	 * @generated
	 */
	int ENUM_SOLVER_LOG_LEVEL = 50;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.EnumCpLinearType <em>Enum Cp Linear Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.EnumCpLinearType
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumCpLinearType()
	 * @generated
	 */
	int ENUM_CP_LINEAR_TYPE = 51;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.EnumCpLogicalType <em>Enum Cp Logical Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.EnumCpLogicalType
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumCpLogicalType()
	 * @generated
	 */
	int ENUM_CP_LOGICAL_TYPE = 52;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.EnumLpFileFormat <em>Enum Lp File Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.EnumLpFileFormat
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumLpFileFormat()
	 * @generated
	 */
	int ENUM_LP_FILE_FORMAT = 53;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see com.misc.common.moplaf.solver.Generator
	 * @generated
	 */
	EClass getGenerator();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.Generator#getTupleRoot <em>Tuple Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tuple Root</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#getTupleRoot()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_TupleRoot();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Generator#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#getRemarks()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Generator#getFootprintNofVars <em>Footprint Nof Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footprint Nof Vars</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#getFootprintNofVars()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_FootprintNofVars();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Generator#getFootprintNofCons <em>Footprint Nof Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footprint Nof Cons</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#getFootprintNofCons()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_FootprintNofCons();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Generator#getFootprintNofTerms <em>Footprint Nof Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footprint Nof Terms</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#getFootprintNofTerms()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_FootprintNofTerms();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Generator#isCountCons <em>Count Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Cons</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#isCountCons()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_CountCons();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Generator#isCountVars <em>Count Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Vars</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#isCountVars()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_CountVars();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.solver.Generator#getELpVarCount <em>ELp Var Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ELp Var Count</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#getELpVarCount()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_ELpVarCount();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.solver.Generator#getELpConsCount <em>ELp Cons Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ELp Cons Count</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#getELpConsCount()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_ELpConsCount();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Generator#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#getCode()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Code();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.Generator#getSolutionProvider <em>Solution Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solution Provider</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#getSolutionProvider()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_SolutionProvider();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.Generator#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#getSelected()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_Selected();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.Generator#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goals</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#getGoals()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_Goals();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Generator#generate() <em>Generate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate</em>' operation.
	 * @see com.misc.common.moplaf.solver.Generator#generate()
	 * @generated
	 */
	EOperation getGenerator__Generate();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Generator#generateRootTuples() <em>Generate Root Tuples</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Root Tuples</em>' operation.
	 * @see com.misc.common.moplaf.solver.Generator#generateRootTuples()
	 * @generated
	 */
	EOperation getGenerator__GenerateRootTuples();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Generator#generateTuples() <em>Generate Tuples</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Tuples</em>' operation.
	 * @see com.misc.common.moplaf.solver.Generator#generateTuples()
	 * @generated
	 */
	EOperation getGenerator__GenerateTuples();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Generator#generateTupleXReferences() <em>Generate Tuple XReferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Tuple XReferences</em>' operation.
	 * @see com.misc.common.moplaf.solver.Generator#generateTupleXReferences()
	 * @generated
	 */
	EOperation getGenerator__GenerateTupleXReferences();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Generator#generateVars() <em>Generate Vars</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Vars</em>' operation.
	 * @see com.misc.common.moplaf.solver.Generator#generateVars()
	 * @generated
	 */
	EOperation getGenerator__GenerateVars();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Generator#generateCons() <em>Generate Cons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Cons</em>' operation.
	 * @see com.misc.common.moplaf.solver.Generator#generateCons()
	 * @generated
	 */
	EOperation getGenerator__GenerateCons();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Generator#generateGoals() <em>Generate Goals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Goals</em>' operation.
	 * @see com.misc.common.moplaf.solver.Generator#generateGoals()
	 * @generated
	 */
	EOperation getGenerator__GenerateGoals();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Generator#acceptSolution(com.misc.common.moplaf.solver.Solution) <em>Accept Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Solution</em>' operation.
	 * @see com.misc.common.moplaf.solver.Generator#acceptSolution(com.misc.common.moplaf.solver.Solution)
	 * @generated
	 */
	EOperation getGenerator__AcceptSolution__Solution();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Generator#selectFeatureMode(com.misc.common.moplaf.solver.GeneratorFeatureMode, com.misc.common.moplaf.solver.GeneratorTuple) <em>Select Feature Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Select Feature Mode</em>' operation.
	 * @see com.misc.common.moplaf.solver.Generator#selectFeatureMode(com.misc.common.moplaf.solver.GeneratorFeatureMode, com.misc.common.moplaf.solver.GeneratorTuple)
	 * @generated
	 */
	EOperation getGenerator__SelectFeatureMode__GeneratorFeatureMode_GeneratorTuple();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Generator#visitTuples(com.misc.common.moplaf.solver.ITupleVisitor) <em>Visit Tuples</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit Tuples</em>' operation.
	 * @see com.misc.common.moplaf.solver.Generator#visitTuples(com.misc.common.moplaf.solver.ITupleVisitor)
	 * @generated
	 */
	EOperation getGenerator__VisitTuples__ITupleVisitor();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Generator#refreshSelectedSolution() <em>Refresh Selected Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Selected Solution</em>' operation.
	 * @see com.misc.common.moplaf.solver.Generator#refreshSelectedSolution()
	 * @generated
	 */
	EOperation getGenerator__RefreshSelectedSolution();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.Generator#getGeneratorFeatureModes <em>Generator Feature Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generator Feature Modes</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#getGeneratorFeatureModes()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_GeneratorFeatureModes();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorTuple <em>Generator Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Tuple</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple
	 * @generated
	 */
	EClass getGeneratorTuple();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.GeneratorTuple#getGeneratorAsRoot <em>Generator As Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generator As Root</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#getGeneratorAsRoot()
	 * @see #getGeneratorTuple()
	 * @generated
	 */
	EReference getGeneratorTuple_GeneratorAsRoot();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.GeneratorTuple#getTupleElement <em>Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tuple Element</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#getTupleElement()
	 * @see #getGeneratorTuple()
	 * @generated
	 */
	EReference getGeneratorTuple_TupleElement();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.GeneratorTuple#getTupleContainer <em>Tuple Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tuple Container</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#getTupleContainer()
	 * @see #getGeneratorTuple()
	 * @generated
	 */
	EReference getGeneratorTuple_TupleContainer();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.GeneratorTuple#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Var</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#getVar()
	 * @see #getGeneratorTuple()
	 * @generated
	 */
	EReference getGeneratorTuple_Var();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.GeneratorTuple#getCons <em>Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cons</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#getCons()
	 * @see #getGeneratorTuple()
	 * @generated
	 */
	EReference getGeneratorTuple_Cons();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorTuple#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#getName()
	 * @see #getGeneratorTuple()
	 * @generated
	 */
	EAttribute getGeneratorTuple_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.GeneratorTuple#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#getMembers()
	 * @see #getGeneratorTuple()
	 * @generated
	 */
	EReference getGeneratorTuple_Members();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorTuple#generateVars() <em>Generate Vars</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Vars</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#generateVars()
	 * @generated
	 */
	EOperation getGeneratorTuple__GenerateVars();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorTuple#generateCons() <em>Generate Cons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Cons</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#generateCons()
	 * @generated
	 */
	EOperation getGeneratorTuple__GenerateCons();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorTuple#generateTuples() <em>Generate Tuples</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Tuples</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#generateTuples()
	 * @generated
	 */
	EOperation getGeneratorTuple__GenerateTuples();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorTuple#visitTuples(com.misc.common.moplaf.solver.ITupleVisitor) <em>Visit Tuples</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit Tuples</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#visitTuples(com.misc.common.moplaf.solver.ITupleVisitor)
	 * @generated
	 */
	EOperation getGeneratorTuple__VisitTuples__ITupleVisitor();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorTuple#generateXReferences() <em>Generate XReferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate XReferences</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#generateXReferences()
	 * @generated
	 */
	EOperation getGeneratorTuple__GenerateXReferences();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorTupleMember <em>Generator Tuple Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Tuple Member</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTupleMember
	 * @generated
	 */
	EClass getGeneratorTupleMember();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorTupleMember#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTupleMember#getName()
	 * @see #getGeneratorTupleMember()
	 * @generated
	 */
	EAttribute getGeneratorTupleMember_Name();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.GeneratorTupleMember#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tuple</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTupleMember#getTuple()
	 * @see #getGeneratorTupleMember()
	 * @generated
	 */
	EReference getGeneratorTupleMember_Tuple();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorTupleMember#getSelectedSolutionDisplay <em>Selected Solution Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected Solution Display</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTupleMember#getSelectedSolutionDisplay()
	 * @see #getGeneratorTupleMember()
	 * @generated
	 */
	EAttribute getGeneratorTupleMember_SelectedSolutionDisplay();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorTupleMember#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTupleMember#getLabel()
	 * @see #getGeneratorTupleMember()
	 * @generated
	 */
	EAttribute getGeneratorTupleMember_Label();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorElement <em>Generator Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Element</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorElement
	 * @generated
	 */
	EClass getGeneratorElement();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorElement#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorElement#getCode()
	 * @see #getGeneratorElement()
	 * @generated
	 */
	EAttribute getGeneratorElement_Code();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorElement#getGenerator() <em>Get Generator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Generator</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorElement#getGenerator()
	 * @generated
	 */
	EOperation getGeneratorElement__GetGenerator();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorElement#refreshSelectedSolution() <em>Refresh Selected Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Selected Solution</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorElement#refreshSelectedSolution()
	 * @generated
	 */
	EOperation getGeneratorElement__RefreshSelectedSolution();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorGoal <em>Generator Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Goal</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorGoal
	 * @generated
	 */
	EClass getGeneratorGoal();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.GeneratorGoal#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generator</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorGoal#getGenerator()
	 * @see #getGeneratorGoal()
	 * @generated
	 */
	EReference getGeneratorGoal_Generator();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorGoal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorGoal#getName()
	 * @see #getGeneratorGoal()
	 * @generated
	 */
	EAttribute getGeneratorGoal_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorGoal#getSelectedSolutionDisplay <em>Selected Solution Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected Solution Display</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorGoal#getSelectedSolutionDisplay()
	 * @see #getGeneratorGoal()
	 * @generated
	 */
	EAttribute getGeneratorGoal_SelectedSolutionDisplay();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorGoal#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorGoal#getLabel()
	 * @see #getGeneratorGoal()
	 * @generated
	 */
	EAttribute getGeneratorGoal_Label();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.GeneratorGoal#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorGoal#getSolution()
	 * @see #getGeneratorGoal()
	 * @generated
	 */
	EReference getGeneratorGoal_Solution();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorGoal#build(com.misc.common.moplaf.solver.Solver, float) <em>Build</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorGoal#build(com.misc.common.moplaf.solver.Solver, float)
	 * @generated
	 */
	EOperation getGeneratorGoal__Build__Solver_float();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorGoal#buildCons(com.misc.common.moplaf.solver.Solver, float) <em>Build Cons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Cons</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorGoal#buildCons(com.misc.common.moplaf.solver.Solver, float)
	 * @generated
	 */
	EOperation getGeneratorGoal__BuildCons__Solver_float();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorGoal#getSolutionGoal(com.misc.common.moplaf.solver.Solution) <em>Get Solution Goal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Solution Goal</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorGoal#getSolutionGoal(com.misc.common.moplaf.solver.Solution)
	 * @generated
	 */
	EOperation getGeneratorGoal__GetSolutionGoal__Solution();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorLpGoal <em>Generator Lp Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Lp Goal</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpGoal
	 * @generated
	 */
	EClass getGeneratorLpGoal();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getObjectiveType <em>Objective Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective Type</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpGoal#getObjectiveType()
	 * @see #getGeneratorLpGoal()
	 * @generated
	 */
	EAttribute getGeneratorLpGoal_ObjectiveType();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getSelectedSolutionValue <em>Selected Solution Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected Solution Value</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpGoal#getSelectedSolutionValue()
	 * @see #getGeneratorLpGoal()
	 * @generated
	 */
	EAttribute getGeneratorLpGoal_SelectedSolutionValue();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getMinValueIndicative <em>Min Value Indicative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value Indicative</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpGoal#getMinValueIndicative()
	 * @see #getGeneratorLpGoal()
	 * @generated
	 */
	EAttribute getGeneratorLpGoal_MinValueIndicative();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getMaxValueIndicative <em>Max Value Indicative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value Indicative</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpGoal#getMaxValueIndicative()
	 * @see #getGeneratorLpGoal()
	 * @generated
	 */
	EAttribute getGeneratorLpGoal_MaxValueIndicative();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorLpGoal#getSolutionValue(com.misc.common.moplaf.solver.Solution) <em>Get Solution Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Solution Value</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorLpGoal#getSolutionValue(com.misc.common.moplaf.solver.Solution)
	 * @generated
	 */
	EOperation getGeneratorLpGoal__GetSolutionValue__Solution();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorLpLinear <em>Generator Lp Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Lp Linear</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpLinear
	 * @generated
	 */
	EClass getGeneratorLpLinear();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.solver.GeneratorLpLinear#getLpTerm <em>Lp Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lp Term</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpLinear#getLpTerm()
	 * @see #getGeneratorLpLinear()
	 * @generated
	 */
	EReference getGeneratorLpLinear_LpTerm();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorLpLinear#constructTerm(com.misc.common.moplaf.solver.GeneratorLpVar, float) <em>Construct Term</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Term</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorLpLinear#constructTerm(com.misc.common.moplaf.solver.GeneratorLpVar, float)
	 * @generated
	 */
	EOperation getGeneratorLpLinear__ConstructTerm__GeneratorLpVar_float();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorLpLinear#contributeTerm(com.misc.common.moplaf.solver.GeneratorLpVar, float) <em>Contribute Term</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contribute Term</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorLpLinear#contributeTerm(com.misc.common.moplaf.solver.GeneratorLpVar, float)
	 * @generated
	 */
	EOperation getGeneratorLpLinear__ContributeTerm__GeneratorLpVar_float();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolverGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see com.misc.common.moplaf.solver.SolverGoal
	 * @generated
	 */
	EClass getSolverGoal();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolverGoal#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.misc.common.moplaf.solver.SolverGoal#getLabel()
	 * @see #getSolverGoal()
	 * @generated
	 */
	EAttribute getSolverGoal_Label();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.solver.SolverGoal#getSolver <em>Solver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Solver</em>'.
	 * @see com.misc.common.moplaf.solver.SolverGoal#getSolver()
	 * @see #getSolverGoal()
	 * @generated
	 */
	EReference getSolverGoal_Solver();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.SolverGoal#buildGoal() <em>Build Goal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Goal</em>' operation.
	 * @see com.misc.common.moplaf.solver.SolverGoal#buildGoal()
	 * @generated
	 */
	EOperation getSolverGoal__BuildGoal();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolverGeneratorGoal <em>Generator Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Goal</em>'.
	 * @see com.misc.common.moplaf.solver.SolverGeneratorGoal
	 * @generated
	 */
	EClass getSolverGeneratorGoal();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalToSolve <em>Goal To Solve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal To Solve</em>'.
	 * @see com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalToSolve()
	 * @see #getSolverGeneratorGoal()
	 * @generated
	 */
	EReference getSolverGeneratorGoal_GoalToSolve();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalWeight <em>Goal Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal Weight</em>'.
	 * @see com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalWeight()
	 * @see #getSolverGeneratorGoal()
	 * @generated
	 */
	EAttribute getSolverGeneratorGoal_GoalWeight();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalBound <em>Goal Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal Bound</em>'.
	 * @see com.misc.common.moplaf.solver.SolverGeneratorGoal#getGoalBound()
	 * @see #getSolverGeneratorGoal()
	 * @generated
	 */
	EAttribute getSolverGeneratorGoal_GoalBound();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#isOptimize <em>Optimize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimize</em>'.
	 * @see com.misc.common.moplaf.solver.SolverGeneratorGoal#isOptimize()
	 * @see #getSolverGeneratorGoal()
	 * @generated
	 */
	EAttribute getSolverGeneratorGoal_Optimize();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolverGeneratorGoal#isConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see com.misc.common.moplaf.solver.SolverGeneratorGoal#isConstraint()
	 * @see #getSolverGeneratorGoal()
	 * @generated
	 */
	EAttribute getSolverGeneratorGoal_Constraint();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolverGoalPreviousSolver <em>Goal Previous Solver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Previous Solver</em>'.
	 * @see com.misc.common.moplaf.solver.SolverGoalPreviousSolver
	 * @generated
	 */
	EClass getSolverGoalPreviousSolver();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.SolverGoalPreviousSolver#getPreviousSolver <em>Previous Solver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Solver</em>'.
	 * @see com.misc.common.moplaf.solver.SolverGoalPreviousSolver#getPreviousSolver()
	 * @see #getSolverGoalPreviousSolver()
	 * @generated
	 */
	EReference getSolverGoalPreviousSolver_PreviousSolver();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.SolverGoalPreviousSolver#getPreviousSolution <em>Previous Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Solution</em>'.
	 * @see com.misc.common.moplaf.solver.SolverGoalPreviousSolver#getPreviousSolution()
	 * @see #getSolverGoalPreviousSolver()
	 * @generated
	 */
	EReference getSolverGoalPreviousSolver_PreviousSolution();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.solver.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.solver.Solution#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Provider</em>'.
	 * @see com.misc.common.moplaf.solver.Solution#getProvider()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Provider();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solution#getSolutionNr <em>Solution Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solution Nr</em>'.
	 * @see com.misc.common.moplaf.solver.Solution#getSolutionNr()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_SolutionNr();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solution#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.solver.Solution#getCode()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_Code();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.Solution#getSolverAsInitialSolution <em>Solver As Initial Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solver As Initial Solution</em>'.
	 * @see com.misc.common.moplaf.solver.Solution#getSolverAsInitialSolution()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_SolverAsInitialSolution();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.solver.Solution#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.misc.common.moplaf.solver.Solution#getElements()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Elements();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.Solution#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vars</em>'.
	 * @see com.misc.common.moplaf.solver.Solution#getVars()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Vars();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.Solution#getCons <em>Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cons</em>'.
	 * @see com.misc.common.moplaf.solver.Solution#getCons()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Cons();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.Solution#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goals</em>'.
	 * @see com.misc.common.moplaf.solver.Solution#getGoals()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Goals();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solution#solutionVarFactory() <em>Solution Var Factory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Solution Var Factory</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solution#solutionVarFactory()
	 * @generated
	 */
	EOperation getSolution__SolutionVarFactory();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solution#solutionConsFactory() <em>Solution Cons Factory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Solution Cons Factory</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solution#solutionConsFactory()
	 * @generated
	 */
	EOperation getSolution__SolutionConsFactory();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solution#solutionGoalFactory() <em>Solution Goal Factory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Solution Goal Factory</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solution#solutionGoalFactory()
	 * @generated
	 */
	EOperation getSolution__SolutionGoalFactory();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solution#constructSolutionCons(com.misc.common.moplaf.solver.GeneratorCons) <em>Construct Solution Cons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Solution Cons</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solution#constructSolutionCons(com.misc.common.moplaf.solver.GeneratorCons)
	 * @generated
	 */
	EOperation getSolution__ConstructSolutionCons__GeneratorCons();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solution#constructSolutionGoal(com.misc.common.moplaf.solver.GeneratorGoal) <em>Construct Solution Goal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Solution Goal</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solution#constructSolutionGoal(com.misc.common.moplaf.solver.GeneratorGoal)
	 * @generated
	 */
	EOperation getSolution__ConstructSolutionGoal__GeneratorGoal();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solution#constructSolutionVar(com.misc.common.moplaf.solver.GeneratorVar) <em>Construct Solution Var</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Solution Var</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solution#constructSolutionVar(com.misc.common.moplaf.solver.GeneratorVar)
	 * @generated
	 */
	EOperation getSolution__ConstructSolutionVar__GeneratorVar();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solution#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solution#dispose()
	 * @generated
	 */
	EOperation getSolution__Dispose();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolutionElement <em>Solution Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Element</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionElement
	 * @generated
	 */
	EClass getSolutionElement();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.solver.SolutionElement#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionElement#getSolution()
	 * @see #getSolutionElement()
	 * @generated
	 */
	EReference getSolutionElement_Solution();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.SolutionElement#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see com.misc.common.moplaf.solver.SolutionElement#dispose()
	 * @generated
	 */
	EOperation getSolutionElement__Dispose();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolutionLp <em>Solution Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Lp</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionLp
	 * @generated
	 */
	EClass getSolutionLp();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionLp#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionLp#getValue()
	 * @see #getSolutionLp()
	 * @generated
	 */
	EAttribute getSolutionLp_Value();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorVar <em>Generator Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Var</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorVar
	 * @generated
	 */
	EClass getGeneratorVar();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.GeneratorVar#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorVar#getSolution()
	 * @see #getGeneratorVar()
	 * @generated
	 */
	EReference getGeneratorVar_Solution();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorVar#getSelectedSolutionValue <em>Selected Solution Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected Solution Value</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorVar#getSelectedSolutionValue()
	 * @see #getGeneratorVar()
	 * @generated
	 */
	EAttribute getGeneratorVar_SelectedSolutionValue();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorVar#getSolutionVar(com.misc.common.moplaf.solver.Solution) <em>Get Solution Var</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Solution Var</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorVar#getSolutionVar(com.misc.common.moplaf.solver.Solution)
	 * @generated
	 */
	EOperation getGeneratorVar__GetSolutionVar__Solution();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorVar#isSolutionOne(com.misc.common.moplaf.solver.Solution) <em>Is Solution One</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Solution One</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorVar#isSolutionOne(com.misc.common.moplaf.solver.Solution)
	 * @generated
	 */
	EOperation getGeneratorVar__IsSolutionOne__Solution();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorVar#isSolutionZero(com.misc.common.moplaf.solver.Solution) <em>Is Solution Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Solution Zero</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorVar#isSolutionZero(com.misc.common.moplaf.solver.Solution)
	 * @generated
	 */
	EOperation getGeneratorVar__IsSolutionZero__Solution();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorVar#getSolutionValue(com.misc.common.moplaf.solver.Solution) <em>Get Solution Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Solution Value</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorVar#getSolutionValue(com.misc.common.moplaf.solver.Solution)
	 * @generated
	 */
	EOperation getGeneratorVar__GetSolutionValue__Solution();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorVar#build(com.misc.common.moplaf.solver.Solver) <em>Build</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorVar#build(com.misc.common.moplaf.solver.Solver)
	 * @generated
	 */
	EOperation getGeneratorVar__Build__Solver();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorLpVar <em>Generator Lp Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Lp Var</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVar
	 * @generated
	 */
	EClass getGeneratorLpVar();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpVar#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVar#getType()
	 * @see #getGeneratorLpVar()
	 * @generated
	 */
	EAttribute getGeneratorLpVar_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpVar#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVar#getLowerBound()
	 * @see #getGeneratorLpVar()
	 * @generated
	 */
	EAttribute getGeneratorLpVar_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpVar#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVar#getUpperBound()
	 * @see #getGeneratorLpVar()
	 * @generated
	 */
	EAttribute getGeneratorLpVar_UpperBound();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.GeneratorLpVar#getLpTerm <em>Lp Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lp Term</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVar#getLpTerm()
	 * @see #getGeneratorLpVar()
	 * @generated
	 */
	EReference getGeneratorLpVar_LpTerm();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorCons <em>Generator Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Cons</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCons
	 * @generated
	 */
	EClass getGeneratorCons();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.solver.GeneratorCons#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCons#getSolution()
	 * @see #getGeneratorCons()
	 * @generated
	 */
	EReference getGeneratorCons_Solution();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorCons#getNofTerms <em>Nof Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nof Terms</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCons#getNofTerms()
	 * @see #getGeneratorCons()
	 * @generated
	 */
	EAttribute getGeneratorCons_NofTerms();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorCons#getSolution(com.misc.common.moplaf.solver.Solution) <em>Get Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Solution</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorCons#getSolution(com.misc.common.moplaf.solver.Solution)
	 * @generated
	 */
	EOperation getGeneratorCons__GetSolution__Solution();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorCons#build(com.misc.common.moplaf.solver.Solver) <em>Build</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorCons#build(com.misc.common.moplaf.solver.Solver)
	 * @generated
	 */
	EOperation getGeneratorCons__Build__Solver();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorLpCons <em>Generator Lp Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Lp Cons</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpCons
	 * @generated
	 */
	EClass getGeneratorLpCons();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpCons#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpCons#getType()
	 * @see #getGeneratorLpCons()
	 * @generated
	 */
	EAttribute getGeneratorLpCons_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpCons#getRighHandSide <em>Righ Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Righ Hand Side</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpCons#getRighHandSide()
	 * @see #getGeneratorLpCons()
	 * @generated
	 */
	EAttribute getGeneratorLpCons_RighHandSide();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorLpTerm <em>Generator Lp Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Lp Term</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpTerm
	 * @generated
	 */
	EClass getGeneratorLpTerm();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getLpVar <em>Lp Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lp Var</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpTerm#getLpVar()
	 * @see #getGeneratorLpTerm()
	 * @generated
	 */
	EReference getGeneratorLpTerm_LpVar();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getCoeff <em>Coeff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coeff</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpTerm#getCoeff()
	 * @see #getGeneratorLpTerm()
	 * @generated
	 */
	EAttribute getGeneratorLpTerm_Coeff();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getLpLinear <em>Lp Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lp Linear</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpTerm#getLpLinear()
	 * @see #getGeneratorLpTerm()
	 * @generated
	 */
	EReference getGeneratorLpTerm_LpLinear();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpTerm#getDescription()
	 * @see #getGeneratorLpTerm()
	 * @generated
	 */
	EAttribute getGeneratorLpTerm_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorLpConsCountElement <em>Generator Lp Cons Count Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Lp Cons Count Element</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpConsCountElement
	 * @generated
	 */
	EClass getGeneratorLpConsCountElement();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.solver.GeneratorLpConsCountElement#getELpConsCount <em>ELp Cons Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>ELp Cons Count</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpConsCountElement#getELpConsCount()
	 * @see #getGeneratorLpConsCountElement()
	 * @generated
	 */
	EReference getGeneratorLpConsCountElement_ELpConsCount();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpConsCountElement#getECount <em>ECount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ECount</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpConsCountElement#getECount()
	 * @see #getGeneratorLpConsCountElement()
	 * @generated
	 */
	EAttribute getGeneratorLpConsCountElement_ECount();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpConsCountElement#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EClass</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpConsCountElement#getEClass()
	 * @see #getGeneratorLpConsCountElement()
	 * @generated
	 */
	EAttribute getGeneratorLpConsCountElement_EClass();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorLpVarCountElement <em>Generator Lp Var Count Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Lp Var Count Element</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVarCountElement
	 * @generated
	 */
	EClass getGeneratorLpVarCountElement();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.solver.GeneratorLpVarCountElement#getELpVarCount <em>ELp Var Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>ELp Var Count</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVarCountElement#getELpVarCount()
	 * @see #getGeneratorLpVarCountElement()
	 * @generated
	 */
	EReference getGeneratorLpVarCountElement_ELpVarCount();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpVarCountElement#getECount <em>ECount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ECount</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVarCountElement#getECount()
	 * @see #getGeneratorLpVarCountElement()
	 * @generated
	 */
	EAttribute getGeneratorLpVarCountElement_ECount();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpVarCountElement#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EClass</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVarCountElement#getEClass()
	 * @see #getGeneratorLpVarCountElement()
	 * @generated
	 */
	EAttribute getGeneratorLpVarCountElement_EClass();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorLpVarCount <em>Generator Lp Var Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Lp Var Count</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVarCount
	 * @generated
	 */
	EClass getGeneratorLpVarCount();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.solver.GeneratorLpVarCount#getELpVarCountElement <em>ELp Var Count Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ELp Var Count Element</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVarCount#getELpVarCountElement()
	 * @see #getGeneratorLpVarCount()
	 * @generated
	 */
	EReference getGeneratorLpVarCount_ELpVarCountElement();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.solver.GeneratorLpVarCount#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Generator</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVarCount#getGenerator()
	 * @see #getGeneratorLpVarCount()
	 * @generated
	 */
	EReference getGeneratorLpVarCount_Generator();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorLpConsCount <em>Generator Lp Cons Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Lp Cons Count</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpConsCount
	 * @generated
	 */
	EClass getGeneratorLpConsCount();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.solver.GeneratorLpConsCount#getLpConsCountElement <em>Lp Cons Count Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lp Cons Count Element</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpConsCount#getLpConsCountElement()
	 * @see #getGeneratorLpConsCount()
	 * @generated
	 */
	EReference getGeneratorLpConsCount_LpConsCountElement();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.solver.GeneratorLpConsCount#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Generator</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpConsCount#getGenerator()
	 * @see #getGeneratorLpConsCount()
	 * @generated
	 */
	EReference getGeneratorLpConsCount_Generator();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorFeatureMode <em>Generator Feature Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Feature Mode</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorFeatureMode
	 * @generated
	 */
	EClass getGeneratorFeatureMode();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.GeneratorFeatureMode#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generator</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorFeatureMode#getGenerator()
	 * @see #getGeneratorFeatureMode()
	 * @generated
	 */
	EReference getGeneratorFeatureMode_Generator();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.GeneratorFeatureMode#getObjetScope <em>Objet Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objet Scope</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorFeatureMode#getObjetScope()
	 * @see #getGeneratorFeatureMode()
	 * @generated
	 */
	EReference getGeneratorFeatureMode_ObjetScope();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorFeatureMode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorFeatureMode#getCode()
	 * @see #getGeneratorFeatureMode()
	 * @generated
	 */
	EAttribute getGeneratorFeatureMode_Code();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorFeatureMode#getERemarks <em>ERemarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ERemarks</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorFeatureMode#getERemarks()
	 * @see #getGeneratorFeatureMode()
	 * @generated
	 */
	EAttribute getGeneratorFeatureMode_ERemarks();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorFeatureMode#IsObjectInScope(com.misc.common.moplaf.solver.GeneratorTuple) <em>Is Object In Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Object In Scope</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorFeatureMode#IsObjectInScope(com.misc.common.moplaf.solver.GeneratorTuple)
	 * @generated
	 */
	EOperation getGeneratorFeatureMode__IsObjectInScope__GeneratorTuple();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorConstraintEnabler <em>Generator Constraint Enabler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Constraint Enabler</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorConstraintEnabler
	 * @generated
	 */
	EClass getGeneratorConstraintEnabler();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorVarOverflow <em>Generator Var Overflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Var Overflow</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorVarOverflow
	 * @generated
	 */
	EClass getGeneratorVarOverflow();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorVarOverflow#getCostOverFlow <em>Cost Over Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Over Flow</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorVarOverflow#getCostOverFlow()
	 * @see #getGeneratorVarOverflow()
	 * @generated
	 */
	EAttribute getGeneratorVarOverflow_CostOverFlow();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorVarOverflow#isMaxEnforce <em>Max Enforce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Enforce</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorVarOverflow#isMaxEnforce()
	 * @see #getGeneratorVarOverflow()
	 * @generated
	 */
	EAttribute getGeneratorVarOverflow_MaxEnforce();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.Solver <em>Solver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solver</em>'.
	 * @see com.misc.common.moplaf.solver.Solver
	 * @generated
	 */
	EClass getSolver();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#getRemarks()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#getStatus()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_Status();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#getSolverMaxDuration <em>Solver Max Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Max Duration</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#getSolverMaxDuration()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_SolverMaxDuration();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#getSolverLogLevel <em>Solver Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Log Level</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#getSolverLogLevel()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_SolverLogLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#isSolverDump <em>Solver Dump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Dump</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#isSolverDump()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_SolverDump();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#getRunStarted <em>Run Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Started</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#getRunStarted()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_RunStarted();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#getRunInitializationEnded <em>Run Initialization Ended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Initialization Ended</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#getRunInitializationEnded()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_RunInitializationEnded();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#getRunSolvingEnded <em>Run Solving Ended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Solving Ended</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#getRunSolvingEnded()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_RunSolvingEnded();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#getRunFinalizationEnded <em>Run Finalization Ended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Finalization Ended</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#getRunFinalizationEnded()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_RunFinalizationEnded();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#getRunDurationInitialization <em>Run Duration Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Duration Initialization</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#getRunDurationInitialization()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_RunDurationInitialization();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#getRunDurationFinalization <em>Run Duration Finalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Duration Finalization</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#getRunDurationFinalization()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_RunDurationFinalization();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#getRunDurationSolving <em>Run Duration Solving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Duration Solving</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#getRunDurationSolving()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_RunDurationSolving();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#isRunRequestTerminate <em>Run Request Terminate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Request Terminate</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#isRunRequestTerminate()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_RunRequestTerminate();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#isSolUnfeasible <em>Sol Unfeasible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sol Unfeasible</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#isSolUnfeasible()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_SolUnfeasible();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#isSolFeasible <em>Sol Feasible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sol Feasible</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#isSolFeasible()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_SolFeasible();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#isSolOptimal <em>Sol Optimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sol Optimal</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#isSolOptimal()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_SolOptimal();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#getSolValue <em>Sol Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sol Value</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#getSolValue()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_SolValue();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#isRunInterrupted <em>Run Interrupted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Interrupted</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#isRunInterrupted()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_RunInterrupted();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#isRunTimeOut <em>Run Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Time Out</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#isRunTimeOut()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_RunTimeOut();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#isInitializing <em>Initializing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initializing</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#isInitializing()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_Initializing();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.Solver#getInitialSolution <em>Initial Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Solution</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#getInitialSolution()
	 * @see #getSolver()
	 * @generated
	 */
	EReference getSolver_InitialSolution();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.solver.Solver#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#getGoals()
	 * @see #getSolver()
	 * @generated
	 */
	EReference getSolver_Goals();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#isSolving <em>Solving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solving</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#isSolving()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_Solving();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#isFinalizing <em>Finalizing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finalizing</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#isFinalizing()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_Finalizing();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#isFinished <em>Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#isFinished()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_Finished();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solver#solve() <em>Solve</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Solve</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solver#solve()
	 * @generated
	 */
	EOperation getSolver__Solve();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solver#buildVars() <em>Build Vars</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Vars</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solver#buildVars()
	 * @generated
	 */
	EOperation getSolver__BuildVars();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solver#buildVar(com.misc.common.moplaf.solver.GeneratorVar) <em>Build Var</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Var</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solver#buildVar(com.misc.common.moplaf.solver.GeneratorVar)
	 * @generated
	 */
	EOperation getSolver__BuildVar__GeneratorVar();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solver#buildLpVar(com.misc.common.moplaf.solver.GeneratorLpVar) <em>Build Lp Var</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Lp Var</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solver#buildLpVar(com.misc.common.moplaf.solver.GeneratorLpVar)
	 * @generated
	 */
	EOperation getSolver__BuildLpVar__GeneratorLpVar();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solver#buildCons() <em>Build Cons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Cons</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solver#buildCons()
	 * @generated
	 */
	EOperation getSolver__BuildCons();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solver#buildLpGoal(com.misc.common.moplaf.solver.GeneratorLpGoal, float) <em>Build Lp Goal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Lp Goal</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solver#buildLpGoal(com.misc.common.moplaf.solver.GeneratorLpGoal, float)
	 * @generated
	 */
	EOperation getSolver__BuildLpGoal__GeneratorLpGoal_float();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solver#buildCons(com.misc.common.moplaf.solver.GeneratorCons) <em>Build Cons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Cons</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solver#buildCons(com.misc.common.moplaf.solver.GeneratorCons)
	 * @generated
	 */
	EOperation getSolver__BuildCons__GeneratorCons();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solver#buildLpCons(com.misc.common.moplaf.solver.GeneratorLpCons) <em>Build Lp Cons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Lp Cons</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solver#buildLpCons(com.misc.common.moplaf.solver.GeneratorLpCons)
	 * @generated
	 */
	EOperation getSolver__BuildLpCons__GeneratorLpCons();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solver#buildLpCons(com.misc.common.moplaf.solver.GeneratorElement, com.misc.common.moplaf.solver.GeneratorLpLinear, float, com.misc.common.moplaf.solver.EnumLpConsType) <em>Build Lp Cons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Lp Cons</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solver#buildLpCons(com.misc.common.moplaf.solver.GeneratorElement, com.misc.common.moplaf.solver.GeneratorLpLinear, float, com.misc.common.moplaf.solver.EnumLpConsType)
	 * @generated
	 */
	EOperation getSolver__BuildLpCons__GeneratorElement_GeneratorLpLinear_float_EnumLpConsType();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solver#buildGoals() <em>Build Goals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Goals</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solver#buildGoals()
	 * @generated
	 */
	EOperation getSolver__BuildGoals();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solver#constructSolverGoal(com.misc.common.moplaf.solver.GeneratorGoal) <em>Construct Solver Goal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Solver Goal</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solver#constructSolverGoal(com.misc.common.moplaf.solver.GeneratorGoal)
	 * @generated
	 */
	EOperation getSolver__ConstructSolverGoal__GeneratorGoal();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solver#constructSolverGoal(com.misc.common.moplaf.solver.Solution) <em>Construct Solver Goal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Solver Goal</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solver#constructSolverGoal(com.misc.common.moplaf.solver.Solution)
	 * @generated
	 */
	EOperation getSolver__ConstructSolverGoal__Solution();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solver#constructSolverGoal(com.misc.common.moplaf.solver.Solver) <em>Construct Solver Goal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Solver Goal</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solver#constructSolverGoal(com.misc.common.moplaf.solver.Solver)
	 * @generated
	 */
	EOperation getSolver__ConstructSolverGoal__Solver();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solver#makeSolutionGoals(com.misc.common.moplaf.solver.Solution) <em>Make Solution Goals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Solution Goals</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solver#makeSolutionGoals(com.misc.common.moplaf.solver.Solution)
	 * @generated
	 */
	EOperation getSolver__MakeSolutionGoals__Solution();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolverLp <em>Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lp</em>'.
	 * @see com.misc.common.moplaf.solver.SolverLp
	 * @generated
	 */
	EClass getSolverLp();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolverLp#getSolverOptimalityTolerance <em>Solver Optimality Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Optimality Tolerance</em>'.
	 * @see com.misc.common.moplaf.solver.SolverLp#getSolverOptimalityTolerance()
	 * @see #getSolverLp()
	 * @generated
	 */
	EAttribute getSolverLp_SolverOptimalityTolerance();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolverLp#isSolverLinearRelaxation <em>Solver Linear Relaxation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Linear Relaxation</em>'.
	 * @see com.misc.common.moplaf.solver.SolverLp#isSolverLinearRelaxation()
	 * @see #getSolverLp()
	 * @generated
	 */
	EAttribute getSolverLp_SolverLinearRelaxation();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolverLp#getSolOptimalityGap <em>Sol Optimality Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sol Optimality Gap</em>'.
	 * @see com.misc.common.moplaf.solver.SolverLp#getSolOptimalityGap()
	 * @see #getSolverLp()
	 * @generated
	 */
	EAttribute getSolverLp_SolOptimalityGap();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolutionVar <em>Solution Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Var</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionVar
	 * @generated
	 */
	EClass getSolutionVar();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionVar#getOptimalValue <em>Optimal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimal Value</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionVar#getOptimalValue()
	 * @see #getSolutionVar()
	 * @generated
	 */
	EAttribute getSolutionVar_OptimalValue();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.SolutionVar#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionVar#getVar()
	 * @see #getSolutionVar()
	 * @generated
	 */
	EReference getSolutionVar_Var();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.SolutionVar#isOne() <em>Is One</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is One</em>' operation.
	 * @see com.misc.common.moplaf.solver.SolutionVar#isOne()
	 * @generated
	 */
	EOperation getSolutionVar__IsOne();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.SolutionVar#isZero() <em>Is Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Zero</em>' operation.
	 * @see com.misc.common.moplaf.solver.SolutionVar#isZero()
	 * @generated
	 */
	EOperation getSolutionVar__IsZero();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.ILpWriter <em>ILp Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ILp Writer</em>'.
	 * @see com.misc.common.moplaf.solver.ILpWriter
	 * @generated
	 */
	EClass getILpWriter();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.ILpWriter#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see com.misc.common.moplaf.solver.ILpWriter#getFilePath()
	 * @see #getILpWriter()
	 * @generated
	 */
	EAttribute getILpWriter_FilePath();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.ILpWriter#getFileFormat <em>File Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Format</em>'.
	 * @see com.misc.common.moplaf.solver.ILpWriter#getFileFormat()
	 * @see #getILpWriter()
	 * @generated
	 */
	EAttribute getILpWriter_FileFormat();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.ILpWriter#isFileCompressed <em>File Compressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Compressed</em>'.
	 * @see com.misc.common.moplaf.solver.ILpWriter#isFileCompressed()
	 * @see #getILpWriter()
	 * @generated
	 */
	EAttribute getILpWriter_FileCompressed();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.ILpWriter#writeLpToFile() <em>Write Lp To File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write Lp To File</em>' operation.
	 * @see com.misc.common.moplaf.solver.ILpWriter#writeLpToFile()
	 * @generated
	 */
	EOperation getILpWriter__WriteLpToFile();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.ILpWriter#getLpAsString() <em>Get Lp As String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Lp As String</em>' operation.
	 * @see com.misc.common.moplaf.solver.ILpWriter#getLpAsString()
	 * @generated
	 */
	EOperation getILpWriter__GetLpAsString();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolutionReader <em>Solution Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Reader</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionReader
	 * @generated
	 */
	EClass getSolutionReader();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionReader#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionReader#getFilePath()
	 * @see #getSolutionReader()
	 * @generated
	 */
	EAttribute getSolutionReader_FilePath();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.SolutionReader#readSolFromFile() <em>Read Sol From File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Sol From File</em>' operation.
	 * @see com.misc.common.moplaf.solver.SolutionReader#readSolFromFile()
	 * @generated
	 */
	EOperation getSolutionReader__ReadSolFromFile();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.SolutionReader#setSolAsString(java.lang.String) <em>Set Sol As String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Sol As String</em>' operation.
	 * @see com.misc.common.moplaf.solver.SolutionReader#setSolAsString(java.lang.String)
	 * @generated
	 */
	EOperation getSolutionReader__SetSolAsString__String();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolutionReaderPattern <em>Solution Reader Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Reader Pattern</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionReaderPattern
	 * @generated
	 */
	EClass getSolutionReaderPattern();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getLinePattern <em>Line Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Pattern</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionReaderPattern#getLinePattern()
	 * @see #getSolutionReaderPattern()
	 * @generated
	 */
	EAttribute getSolutionReaderPattern_LinePattern();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getVarNameGroup <em>Var Name Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name Group</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionReaderPattern#getVarNameGroup()
	 * @see #getSolutionReaderPattern()
	 * @generated
	 */
	EAttribute getSolutionReaderPattern_VarNameGroup();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getVarOptimalValueGroup <em>Var Optimal Value Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Optimal Value Group</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionReaderPattern#getVarOptimalValueGroup()
	 * @see #getSolutionReaderPattern()
	 * @generated
	 */
	EAttribute getSolutionReaderPattern_VarOptimalValueGroup();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getVarObjectiveCoefGroup <em>Var Objective Coef Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Objective Coef Group</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionReaderPattern#getVarObjectiveCoefGroup()
	 * @see #getSolutionReaderPattern()
	 * @generated
	 */
	EAttribute getSolutionReaderPattern_VarObjectiveCoefGroup();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionReaderPattern#getFirstLine <em>First Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Line</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionReaderPattern#getFirstLine()
	 * @see #getSolutionReaderPattern()
	 * @generated
	 */
	EAttribute getSolutionReaderPattern_FirstLine();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolutionLpVar <em>Solution Lp Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Lp Var</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionLpVar
	 * @generated
	 */
	EClass getSolutionLpVar();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolutionCons <em>Solution Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Cons</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionCons
	 * @generated
	 */
	EClass getSolutionCons();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.SolutionCons#getCons <em>Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cons</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionCons#getCons()
	 * @see #getSolutionCons()
	 * @generated
	 */
	EReference getSolutionCons_Cons();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolutionLpCons <em>Solution Lp Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Lp Cons</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionLpCons
	 * @generated
	 */
	EClass getSolutionLpCons();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolutionGoal <em>Solution Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Goal</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionGoal
	 * @generated
	 */
	EClass getSolutionGoal();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.SolutionGoal#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionGoal#getGoal()
	 * @see #getSolutionGoal()
	 * @generated
	 */
	EReference getSolutionGoal_Goal();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionGoal#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionGoal#getLabel()
	 * @see #getSolutionGoal()
	 * @generated
	 */
	EAttribute getSolutionGoal_Label();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionGoal#isConstrained <em>Constrained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constrained</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionGoal#isConstrained()
	 * @see #getSolutionGoal()
	 * @generated
	 */
	EAttribute getSolutionGoal_Constrained();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionGoal#isOptimized <em>Optimized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimized</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionGoal#isOptimized()
	 * @see #getSolutionGoal()
	 * @generated
	 */
	EAttribute getSolutionGoal_Optimized();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionGoal#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionGoal#getBound()
	 * @see #getSolutionGoal()
	 * @generated
	 */
	EAttribute getSolutionGoal_Bound();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.SolutionGoal#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.solver.SolutionGoal#refresh()
	 * @generated
	 */
	EOperation getSolutionGoal__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.SolutionGoal#buildGoalAsPreviousSolver(com.misc.common.moplaf.solver.Solver) <em>Build Goal As Previous Solver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Goal As Previous Solver</em>' operation.
	 * @see com.misc.common.moplaf.solver.SolutionGoal#buildGoalAsPreviousSolver(com.misc.common.moplaf.solver.Solver)
	 * @generated
	 */
	EOperation getSolutionGoal__BuildGoalAsPreviousSolver__Solver();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolutionLpGoal <em>Solution Lp Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Lp Goal</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionLpGoal
	 * @generated
	 */
	EClass getSolutionLpGoal();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionLpGoal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionLpGoal#getValue()
	 * @see #getSolutionLpGoal()
	 * @generated
	 */
	EAttribute getSolutionLpGoal_Value();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorCpCons <em>Generator Cp Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Cp Cons</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpCons
	 * @generated
	 */
	EClass getGeneratorCpCons();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorCpCons#isPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpCons#isPost()
	 * @see #getGeneratorCpCons()
	 * @generated
	 */
	EAttribute getGeneratorCpCons_Post();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorCpLinear <em>Generator Cp Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Cp Linear</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLinear
	 * @generated
	 */
	EClass getGeneratorCpLinear();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorCpLinear#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLinear#getType()
	 * @see #getGeneratorCpLinear()
	 * @generated
	 */
	EAttribute getGeneratorCpLinear_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorCpLinear#getRightHandSide <em>Right Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Hand Side</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLinear#getRightHandSide()
	 * @see #getGeneratorCpLinear()
	 * @generated
	 */
	EAttribute getGeneratorCpLinear_RightHandSide();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.solver.GeneratorCpLinear#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLinear#getTerm()
	 * @see #getGeneratorCpLinear()
	 * @generated
	 */
	EReference getGeneratorCpLinear_Term();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorCpLogical <em>Generator Cp Logical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Cp Logical</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLogical
	 * @generated
	 */
	EClass getGeneratorCpLogical();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.solver.GeneratorCpLogical#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLogical#getTerm()
	 * @see #getGeneratorCpLogical()
	 * @generated
	 */
	EReference getGeneratorCpLogical_Term();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorCpLogical#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLogical#isNot()
	 * @see #getGeneratorCpLogical()
	 * @generated
	 */
	EAttribute getGeneratorCpLogical_Not();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorCpLogical#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLogical#getType()
	 * @see #getGeneratorCpLogical()
	 * @generated
	 */
	EAttribute getGeneratorCpLogical_Type();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorCpVar <em>Generator Cp Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Cp Var</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpVar
	 * @generated
	 */
	EClass getGeneratorCpVar();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorCpVar#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpVar#getPriority()
	 * @see #getGeneratorCpVar()
	 * @generated
	 */
	EAttribute getGeneratorCpVar_Priority();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorCpVarAtomic <em>Generator Cp Var Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Cp Var Atomic</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpVarAtomic
	 * @generated
	 */
	EClass getGeneratorCpVarAtomic();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorCpVarAtomic#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpVarAtomic#getLowerBound()
	 * @see #getGeneratorCpVarAtomic()
	 * @generated
	 */
	EAttribute getGeneratorCpVarAtomic_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorCpVarAtomic#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpVarAtomic#getUpperBound()
	 * @see #getGeneratorCpVarAtomic()
	 * @generated
	 */
	EAttribute getGeneratorCpVarAtomic_UpperBound();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorCpLinearTerm <em>Generator Cp Linear Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Cp Linear Term</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLinearTerm
	 * @generated
	 */
	EClass getGeneratorCpLinearTerm();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorCpLinearTerm#getCoeff <em>Coeff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coeff</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLinearTerm#getCoeff()
	 * @see #getGeneratorCpLinearTerm()
	 * @generated
	 */
	EAttribute getGeneratorCpLinearTerm_Coeff();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.GeneratorCpLinearTerm#getCpVar <em>Cp Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cp Var</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLinearTerm#getCpVar()
	 * @see #getGeneratorCpLinearTerm()
	 * @generated
	 */
	EReference getGeneratorCpLinearTerm_CpVar();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.GeneratorCpLogicalTerm <em>Generator Cp Logical Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Cp Logical Term</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLogicalTerm
	 * @generated
	 */
	EClass getGeneratorCpLogicalTerm();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorCpLogicalTerm#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLogicalTerm#isNot()
	 * @see #getGeneratorCpLogicalTerm()
	 * @generated
	 */
	EAttribute getGeneratorCpLogicalTerm_Not();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.solver.GeneratorCpLogicalTerm#getCpCons <em>Cp Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cp Cons</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLogicalTerm#getCpCons()
	 * @see #getGeneratorCpLogicalTerm()
	 * @generated
	 */
	EReference getGeneratorCpLogicalTerm_CpCons();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolutionCpVar <em>Solution Cp Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Cp Var</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionCpVar
	 * @generated
	 */
	EClass getSolutionCpVar();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolverCp <em>Cp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cp</em>'.
	 * @see com.misc.common.moplaf.solver.SolverCp
	 * @generated
	 */
	EClass getSolverCp();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolverCp#isSearchAll <em>Search All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search All</em>'.
	 * @see com.misc.common.moplaf.solver.SolverCp#isSearchAll()
	 * @see #getSolverCp()
	 * @generated
	 */
	EAttribute getSolverCp_SearchAll();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.solver.ITupleVisitor <em>ITuple Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ITuple Visitor</em>'.
	 * @see com.misc.common.moplaf.solver.ITupleVisitor
	 * @model instanceClass="com.misc.common.moplaf.solver.ITupleVisitor"
	 * @generated
	 */
	EDataType getITupleVisitor();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.IGeneratorTool <em>IGenerator Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IGenerator Tool</em>'.
	 * @see com.misc.common.moplaf.solver.IGeneratorTool
	 * @generated
	 */
	EClass getIGeneratorTool();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.IGeneratorTool#getGenerator() <em>Get Generator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Generator</em>' operation.
	 * @see com.misc.common.moplaf.solver.IGeneratorTool#getGenerator()
	 * @generated
	 */
	EOperation getIGeneratorTool__GetGenerator();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.IGeneratorTool#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see com.misc.common.moplaf.solver.IGeneratorTool#dispose()
	 * @generated
	 */
	EOperation getIGeneratorTool__Dispose();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.SolutionProvider <em>Solution Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Provider</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionProvider
	 * @generated
	 */
	EClass getSolutionProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.solver.SolutionProvider#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionProvider#getSolution()
	 * @see #getSolutionProvider()
	 * @generated
	 */
	EReference getSolutionProvider_Solution();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionProvider#getCurrentSolutionNr <em>Current Solution Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Solution Nr</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionProvider#getCurrentSolutionNr()
	 * @see #getSolutionProvider()
	 * @generated
	 */
	EAttribute getSolutionProvider_CurrentSolutionNr();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.SolutionProvider#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionProvider#getCode()
	 * @see #getSolutionProvider()
	 * @generated
	 */
	EAttribute getSolutionProvider_Code();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.SolutionProvider#solutionFactory() <em>Solution Factory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Solution Factory</em>' operation.
	 * @see com.misc.common.moplaf.solver.SolutionProvider#solutionFactory()
	 * @generated
	 */
	EOperation getSolutionProvider__SolutionFactory();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.SolutionProvider#constructSolution() <em>Construct Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Solution</em>' operation.
	 * @see com.misc.common.moplaf.solver.SolutionProvider#constructSolution()
	 * @generated
	 */
	EOperation getSolutionProvider__ConstructSolution();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.solver.EnumLpVarType <em>Enum Lp Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Lp Var Type</em>'.
	 * @see com.misc.common.moplaf.solver.EnumLpVarType
	 * @generated
	 */
	EEnum getEnumLpVarType();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.solver.EnumLpConsType <em>Enum Lp Cons Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Lp Cons Type</em>'.
	 * @see com.misc.common.moplaf.solver.EnumLpConsType
	 * @generated
	 */
	EEnum getEnumLpConsType();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.solver.EnumObjectiveType <em>Enum Objective Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Objective Type</em>'.
	 * @see com.misc.common.moplaf.solver.EnumObjectiveType
	 * @generated
	 */
	EEnum getEnumObjectiveType();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.solver.EnumSolverLogLevel <em>Enum Solver Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Solver Log Level</em>'.
	 * @see com.misc.common.moplaf.solver.EnumSolverLogLevel
	 * @generated
	 */
	EEnum getEnumSolverLogLevel();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.solver.EnumCpLinearType <em>Enum Cp Linear Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Cp Linear Type</em>'.
	 * @see com.misc.common.moplaf.solver.EnumCpLinearType
	 * @generated
	 */
	EEnum getEnumCpLinearType();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.solver.EnumCpLogicalType <em>Enum Cp Logical Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Cp Logical Type</em>'.
	 * @see com.misc.common.moplaf.solver.EnumCpLogicalType
	 * @generated
	 */
	EEnum getEnumCpLogicalType();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.solver.EnumLpFileFormat <em>Enum Lp File Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Lp File Format</em>'.
	 * @see com.misc.common.moplaf.solver.EnumLpFileFormat
	 * @generated
	 */
	EEnum getEnumLpFileFormat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SolverFactory getSolverFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGenerator()
		 * @generated
		 */
		EClass GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '<em><b>Tuple Root</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__TUPLE_ROOT = eINSTANCE.getGenerator_TupleRoot();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__REMARKS = eINSTANCE.getGenerator_Remarks();

		/**
		 * The meta object literal for the '<em><b>Footprint Nof Vars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__FOOTPRINT_NOF_VARS = eINSTANCE.getGenerator_FootprintNofVars();

		/**
		 * The meta object literal for the '<em><b>Footprint Nof Cons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__FOOTPRINT_NOF_CONS = eINSTANCE.getGenerator_FootprintNofCons();

		/**
		 * The meta object literal for the '<em><b>Footprint Nof Terms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__FOOTPRINT_NOF_TERMS = eINSTANCE.getGenerator_FootprintNofTerms();

		/**
		 * The meta object literal for the '<em><b>Count Cons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__COUNT_CONS = eINSTANCE.getGenerator_CountCons();

		/**
		 * The meta object literal for the '<em><b>Count Vars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__COUNT_VARS = eINSTANCE.getGenerator_CountVars();

		/**
		 * The meta object literal for the '<em><b>ELp Var Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__ELP_VAR_COUNT = eINSTANCE.getGenerator_ELpVarCount();

		/**
		 * The meta object literal for the '<em><b>ELp Cons Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__ELP_CONS_COUNT = eINSTANCE.getGenerator_ELpConsCount();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__CODE = eINSTANCE.getGenerator_Code();

		/**
		 * The meta object literal for the '<em><b>Solution Provider</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__SOLUTION_PROVIDER = eINSTANCE.getGenerator_SolutionProvider();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__SELECTED = eINSTANCE.getGenerator_Selected();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__GOALS = eINSTANCE.getGenerator_Goals();

		/**
		 * The meta object literal for the '<em><b>Generator Feature Modes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__GENERATOR_FEATURE_MODES = eINSTANCE.getGenerator_GeneratorFeatureModes();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___GENERATE = eINSTANCE.getGenerator__Generate();

		/**
		 * The meta object literal for the '<em><b>Generate Root Tuples</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___GENERATE_ROOT_TUPLES = eINSTANCE.getGenerator__GenerateRootTuples();

		/**
		 * The meta object literal for the '<em><b>Generate Tuples</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___GENERATE_TUPLES = eINSTANCE.getGenerator__GenerateTuples();

		/**
		 * The meta object literal for the '<em><b>Generate Tuple XReferences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___GENERATE_TUPLE_XREFERENCES = eINSTANCE.getGenerator__GenerateTupleXReferences();

		/**
		 * The meta object literal for the '<em><b>Generate Vars</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___GENERATE_VARS = eINSTANCE.getGenerator__GenerateVars();

		/**
		 * The meta object literal for the '<em><b>Generate Cons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___GENERATE_CONS = eINSTANCE.getGenerator__GenerateCons();

		/**
		 * The meta object literal for the '<em><b>Generate Goals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___GENERATE_GOALS = eINSTANCE.getGenerator__GenerateGoals();

		/**
		 * The meta object literal for the '<em><b>Accept Solution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___ACCEPT_SOLUTION__SOLUTION = eINSTANCE.getGenerator__AcceptSolution__Solution();

		/**
		 * The meta object literal for the '<em><b>Select Feature Mode</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE = eINSTANCE.getGenerator__SelectFeatureMode__GeneratorFeatureMode_GeneratorTuple();

		/**
		 * The meta object literal for the '<em><b>Visit Tuples</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___VISIT_TUPLES__ITUPLEVISITOR = eINSTANCE.getGenerator__VisitTuples__ITupleVisitor();

		/**
		 * The meta object literal for the '<em><b>Refresh Selected Solution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___REFRESH_SELECTED_SOLUTION = eINSTANCE.getGenerator__RefreshSelectedSolution();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorTupleImpl <em>Generator Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorTupleImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorTuple()
		 * @generated
		 */
		EClass GENERATOR_TUPLE = eINSTANCE.getGeneratorTuple();

		/**
		 * The meta object literal for the '<em><b>Generator As Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_TUPLE__GENERATOR_AS_ROOT = eINSTANCE.getGeneratorTuple_GeneratorAsRoot();

		/**
		 * The meta object literal for the '<em><b>Tuple Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_TUPLE__TUPLE_ELEMENT = eINSTANCE.getGeneratorTuple_TupleElement();

		/**
		 * The meta object literal for the '<em><b>Tuple Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_TUPLE__TUPLE_CONTAINER = eINSTANCE.getGeneratorTuple_TupleContainer();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_TUPLE__VAR = eINSTANCE.getGeneratorTuple_Var();

		/**
		 * The meta object literal for the '<em><b>Cons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_TUPLE__CONS = eINSTANCE.getGeneratorTuple_Cons();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TUPLE__NAME = eINSTANCE.getGeneratorTuple_Name();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_TUPLE__MEMBERS = eINSTANCE.getGeneratorTuple_Members();

		/**
		 * The meta object literal for the '<em><b>Generate Vars</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_TUPLE___GENERATE_VARS = eINSTANCE.getGeneratorTuple__GenerateVars();

		/**
		 * The meta object literal for the '<em><b>Generate Cons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_TUPLE___GENERATE_CONS = eINSTANCE.getGeneratorTuple__GenerateCons();

		/**
		 * The meta object literal for the '<em><b>Generate Tuples</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_TUPLE___GENERATE_TUPLES = eINSTANCE.getGeneratorTuple__GenerateTuples();

		/**
		 * The meta object literal for the '<em><b>Visit Tuples</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR = eINSTANCE.getGeneratorTuple__VisitTuples__ITupleVisitor();

		/**
		 * The meta object literal for the '<em><b>Generate XReferences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_TUPLE___GENERATE_XREFERENCES = eINSTANCE.getGeneratorTuple__GenerateXReferences();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorTupleMemberImpl <em>Generator Tuple Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorTupleMemberImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorTupleMember()
		 * @generated
		 */
		EClass GENERATOR_TUPLE_MEMBER = eINSTANCE.getGeneratorTupleMember();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TUPLE_MEMBER__NAME = eINSTANCE.getGeneratorTupleMember_Name();

		/**
		 * The meta object literal for the '<em><b>Tuple</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_TUPLE_MEMBER__TUPLE = eINSTANCE.getGeneratorTupleMember_Tuple();

		/**
		 * The meta object literal for the '<em><b>Selected Solution Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TUPLE_MEMBER__SELECTED_SOLUTION_DISPLAY = eINSTANCE.getGeneratorTupleMember_SelectedSolutionDisplay();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TUPLE_MEMBER__LABEL = eINSTANCE.getGeneratorTupleMember_Label();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorElementImpl <em>Generator Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorElementImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorElement()
		 * @generated
		 */
		EClass GENERATOR_ELEMENT = eINSTANCE.getGeneratorElement();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_ELEMENT__CODE = eINSTANCE.getGeneratorElement_Code();

		/**
		 * The meta object literal for the '<em><b>Get Generator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_ELEMENT___GET_GENERATOR = eINSTANCE.getGeneratorElement__GetGenerator();

		/**
		 * The meta object literal for the '<em><b>Refresh Selected Solution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_ELEMENT___REFRESH_SELECTED_SOLUTION = eINSTANCE.getGeneratorElement__RefreshSelectedSolution();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorGoalImpl <em>Generator Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorGoalImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorGoal()
		 * @generated
		 */
		EClass GENERATOR_GOAL = eINSTANCE.getGeneratorGoal();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_GOAL__GENERATOR = eINSTANCE.getGeneratorGoal_Generator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_GOAL__NAME = eINSTANCE.getGeneratorGoal_Name();

		/**
		 * The meta object literal for the '<em><b>Selected Solution Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_GOAL__SELECTED_SOLUTION_DISPLAY = eINSTANCE.getGeneratorGoal_SelectedSolutionDisplay();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_GOAL__LABEL = eINSTANCE.getGeneratorGoal_Label();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_GOAL__SOLUTION = eINSTANCE.getGeneratorGoal_Solution();

		/**
		 * The meta object literal for the '<em><b>Build</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_GOAL___BUILD__SOLVER_FLOAT = eINSTANCE.getGeneratorGoal__Build__Solver_float();

		/**
		 * The meta object literal for the '<em><b>Build Cons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_GOAL___BUILD_CONS__SOLVER_FLOAT = eINSTANCE.getGeneratorGoal__BuildCons__Solver_float();

		/**
		 * The meta object literal for the '<em><b>Get Solution Goal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_GOAL___GET_SOLUTION_GOAL__SOLUTION = eINSTANCE.getGeneratorGoal__GetSolutionGoal__Solution();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl <em>Generator Lp Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorLpGoalImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpGoal()
		 * @generated
		 */
		EClass GENERATOR_LP_GOAL = eINSTANCE.getGeneratorLpGoal();

		/**
		 * The meta object literal for the '<em><b>Objective Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_GOAL__OBJECTIVE_TYPE = eINSTANCE.getGeneratorLpGoal_ObjectiveType();

		/**
		 * The meta object literal for the '<em><b>Selected Solution Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_GOAL__SELECTED_SOLUTION_VALUE = eINSTANCE.getGeneratorLpGoal_SelectedSolutionValue();

		/**
		 * The meta object literal for the '<em><b>Min Value Indicative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_GOAL__MIN_VALUE_INDICATIVE = eINSTANCE.getGeneratorLpGoal_MinValueIndicative();

		/**
		 * The meta object literal for the '<em><b>Max Value Indicative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_GOAL__MAX_VALUE_INDICATIVE = eINSTANCE.getGeneratorLpGoal_MaxValueIndicative();

		/**
		 * The meta object literal for the '<em><b>Get Solution Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_LP_GOAL___GET_SOLUTION_VALUE__SOLUTION = eINSTANCE.getGeneratorLpGoal__GetSolutionValue__Solution();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpLinearImpl <em>Generator Lp Linear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorLpLinearImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpLinear()
		 * @generated
		 */
		EClass GENERATOR_LP_LINEAR = eINSTANCE.getGeneratorLpLinear();

		/**
		 * The meta object literal for the '<em><b>Lp Term</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_LP_LINEAR__LP_TERM = eINSTANCE.getGeneratorLpLinear_LpTerm();

		/**
		 * The meta object literal for the '<em><b>Construct Term</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_LP_LINEAR___CONSTRUCT_TERM__GENERATORLPVAR_FLOAT = eINSTANCE.getGeneratorLpLinear__ConstructTerm__GeneratorLpVar_float();

		/**
		 * The meta object literal for the '<em><b>Contribute Term</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_LP_LINEAR___CONTRIBUTE_TERM__GENERATORLPVAR_FLOAT = eINSTANCE.getGeneratorLpLinear__ContributeTerm__GeneratorLpVar_float();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolverGoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolverGoalImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolverGoal()
		 * @generated
		 */
		EClass SOLVER_GOAL = eINSTANCE.getSolverGoal();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_GOAL__LABEL = eINSTANCE.getSolverGoal_Label();

		/**
		 * The meta object literal for the '<em><b>Solver</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVER_GOAL__SOLVER = eINSTANCE.getSolverGoal_Solver();

		/**
		 * The meta object literal for the '<em><b>Build Goal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER_GOAL___BUILD_GOAL = eINSTANCE.getSolverGoal__BuildGoal();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolverGeneratorGoalImpl <em>Generator Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolverGeneratorGoalImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolverGeneratorGoal()
		 * @generated
		 */
		EClass SOLVER_GENERATOR_GOAL = eINSTANCE.getSolverGeneratorGoal();

		/**
		 * The meta object literal for the '<em><b>Goal To Solve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVER_GENERATOR_GOAL__GOAL_TO_SOLVE = eINSTANCE.getSolverGeneratorGoal_GoalToSolve();

		/**
		 * The meta object literal for the '<em><b>Goal Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_GENERATOR_GOAL__GOAL_WEIGHT = eINSTANCE.getSolverGeneratorGoal_GoalWeight();

		/**
		 * The meta object literal for the '<em><b>Goal Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_GENERATOR_GOAL__GOAL_BOUND = eINSTANCE.getSolverGeneratorGoal_GoalBound();

		/**
		 * The meta object literal for the '<em><b>Optimize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_GENERATOR_GOAL__OPTIMIZE = eINSTANCE.getSolverGeneratorGoal_Optimize();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_GENERATOR_GOAL__CONSTRAINT = eINSTANCE.getSolverGeneratorGoal_Constraint();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolverGoalPreviousSolverImpl <em>Goal Previous Solver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolverGoalPreviousSolverImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolverGoalPreviousSolver()
		 * @generated
		 */
		EClass SOLVER_GOAL_PREVIOUS_SOLVER = eINSTANCE.getSolverGoalPreviousSolver();

		/**
		 * The meta object literal for the '<em><b>Previous Solver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLVER = eINSTANCE.getSolverGoalPreviousSolver_PreviousSolver();

		/**
		 * The meta object literal for the '<em><b>Previous Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLUTION = eINSTANCE.getSolverGoalPreviousSolver_PreviousSolution();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolutionImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__PROVIDER = eINSTANCE.getSolution_Provider();

		/**
		 * The meta object literal for the '<em><b>Solution Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__SOLUTION_NR = eINSTANCE.getSolution_SolutionNr();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__CODE = eINSTANCE.getSolution_Code();

		/**
		 * The meta object literal for the '<em><b>Solver As Initial Solution</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__SOLVER_AS_INITIAL_SOLUTION = eINSTANCE.getSolution_SolverAsInitialSolution();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__ELEMENTS = eINSTANCE.getSolution_Elements();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__VARS = eINSTANCE.getSolution_Vars();

		/**
		 * The meta object literal for the '<em><b>Cons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__CONS = eINSTANCE.getSolution_Cons();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__GOALS = eINSTANCE.getSolution_Goals();

		/**
		 * The meta object literal for the '<em><b>Solution Var Factory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___SOLUTION_VAR_FACTORY = eINSTANCE.getSolution__SolutionVarFactory();

		/**
		 * The meta object literal for the '<em><b>Solution Cons Factory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___SOLUTION_CONS_FACTORY = eINSTANCE.getSolution__SolutionConsFactory();

		/**
		 * The meta object literal for the '<em><b>Solution Goal Factory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___SOLUTION_GOAL_FACTORY = eINSTANCE.getSolution__SolutionGoalFactory();

		/**
		 * The meta object literal for the '<em><b>Construct Solution Cons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___CONSTRUCT_SOLUTION_CONS__GENERATORCONS = eINSTANCE.getSolution__ConstructSolutionCons__GeneratorCons();

		/**
		 * The meta object literal for the '<em><b>Construct Solution Goal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___CONSTRUCT_SOLUTION_GOAL__GENERATORGOAL = eINSTANCE.getSolution__ConstructSolutionGoal__GeneratorGoal();

		/**
		 * The meta object literal for the '<em><b>Construct Solution Var</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___CONSTRUCT_SOLUTION_VAR__GENERATORVAR = eINSTANCE.getSolution__ConstructSolutionVar__GeneratorVar();

		/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___DISPOSE = eINSTANCE.getSolution__Dispose();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolutionElementImpl <em>Solution Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolutionElementImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionElement()
		 * @generated
		 */
		EClass SOLUTION_ELEMENT = eINSTANCE.getSolutionElement();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_ELEMENT__SOLUTION = eINSTANCE.getSolutionElement_Solution();

		/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION_ELEMENT___DISPOSE = eINSTANCE.getSolutionElement__Dispose();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolutionLpImpl <em>Solution Lp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolutionLpImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionLp()
		 * @generated
		 */
		EClass SOLUTION_LP = eINSTANCE.getSolutionLp();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_LP__VALUE = eINSTANCE.getSolutionLp_Value();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorVarImpl <em>Generator Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorVarImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorVar()
		 * @generated
		 */
		EClass GENERATOR_VAR = eINSTANCE.getGeneratorVar();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_VAR__SOLUTION = eINSTANCE.getGeneratorVar_Solution();

		/**
		 * The meta object literal for the '<em><b>Selected Solution Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_VAR__SELECTED_SOLUTION_VALUE = eINSTANCE.getGeneratorVar_SelectedSolutionValue();

		/**
		 * The meta object literal for the '<em><b>Get Solution Var</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_VAR___GET_SOLUTION_VAR__SOLUTION = eINSTANCE.getGeneratorVar__GetSolutionVar__Solution();

		/**
		 * The meta object literal for the '<em><b>Is Solution One</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_VAR___IS_SOLUTION_ONE__SOLUTION = eINSTANCE.getGeneratorVar__IsSolutionOne__Solution();

		/**
		 * The meta object literal for the '<em><b>Is Solution Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_VAR___IS_SOLUTION_ZERO__SOLUTION = eINSTANCE.getGeneratorVar__IsSolutionZero__Solution();

		/**
		 * The meta object literal for the '<em><b>Get Solution Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_VAR___GET_SOLUTION_VALUE__SOLUTION = eINSTANCE.getGeneratorVar__GetSolutionValue__Solution();

		/**
		 * The meta object literal for the '<em><b>Build</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_VAR___BUILD__SOLVER = eINSTANCE.getGeneratorVar__Build__Solver();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarImpl <em>Generator Lp Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorLpVarImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpVar()
		 * @generated
		 */
		EClass GENERATOR_LP_VAR = eINSTANCE.getGeneratorLpVar();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_VAR__TYPE = eINSTANCE.getGeneratorLpVar_Type();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_VAR__LOWER_BOUND = eINSTANCE.getGeneratorLpVar_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_VAR__UPPER_BOUND = eINSTANCE.getGeneratorLpVar_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lp Term</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_LP_VAR__LP_TERM = eINSTANCE.getGeneratorLpVar_LpTerm();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorConsImpl <em>Generator Cons</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorConsImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCons()
		 * @generated
		 */
		EClass GENERATOR_CONS = eINSTANCE.getGeneratorCons();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_CONS__SOLUTION = eINSTANCE.getGeneratorCons_Solution();

		/**
		 * The meta object literal for the '<em><b>Nof Terms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CONS__NOF_TERMS = eINSTANCE.getGeneratorCons_NofTerms();

		/**
		 * The meta object literal for the '<em><b>Get Solution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_CONS___GET_SOLUTION__SOLUTION = eINSTANCE.getGeneratorCons__GetSolution__Solution();

		/**
		 * The meta object literal for the '<em><b>Build</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_CONS___BUILD__SOLVER = eINSTANCE.getGeneratorCons__Build__Solver();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpConsImpl <em>Generator Lp Cons</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorLpConsImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpCons()
		 * @generated
		 */
		EClass GENERATOR_LP_CONS = eINSTANCE.getGeneratorLpCons();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_CONS__TYPE = eINSTANCE.getGeneratorLpCons_Type();

		/**
		 * The meta object literal for the '<em><b>Righ Hand Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_CONS__RIGH_HAND_SIDE = eINSTANCE.getGeneratorLpCons_RighHandSide();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpTermImpl <em>Generator Lp Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorLpTermImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpTerm()
		 * @generated
		 */
		EClass GENERATOR_LP_TERM = eINSTANCE.getGeneratorLpTerm();

		/**
		 * The meta object literal for the '<em><b>Lp Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_LP_TERM__LP_VAR = eINSTANCE.getGeneratorLpTerm_LpVar();

		/**
		 * The meta object literal for the '<em><b>Coeff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_TERM__COEFF = eINSTANCE.getGeneratorLpTerm_Coeff();

		/**
		 * The meta object literal for the '<em><b>Lp Linear</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_LP_TERM__LP_LINEAR = eINSTANCE.getGeneratorLpTerm_LpLinear();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_TERM__DESCRIPTION = eINSTANCE.getGeneratorLpTerm_Description();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpConsCountElementImpl <em>Generator Lp Cons Count Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorLpConsCountElementImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpConsCountElement()
		 * @generated
		 */
		EClass GENERATOR_LP_CONS_COUNT_ELEMENT = eINSTANCE.getGeneratorLpConsCountElement();

		/**
		 * The meta object literal for the '<em><b>ELp Cons Count</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_LP_CONS_COUNT_ELEMENT__ELP_CONS_COUNT = eINSTANCE.getGeneratorLpConsCountElement_ELpConsCount();

		/**
		 * The meta object literal for the '<em><b>ECount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_CONS_COUNT_ELEMENT__ECOUNT = eINSTANCE.getGeneratorLpConsCountElement_ECount();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_CONS_COUNT_ELEMENT__ECLASS = eINSTANCE.getGeneratorLpConsCountElement_EClass();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarCountElementImpl <em>Generator Lp Var Count Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorLpVarCountElementImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpVarCountElement()
		 * @generated
		 */
		EClass GENERATOR_LP_VAR_COUNT_ELEMENT = eINSTANCE.getGeneratorLpVarCountElement();

		/**
		 * The meta object literal for the '<em><b>ELp Var Count</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_LP_VAR_COUNT_ELEMENT__ELP_VAR_COUNT = eINSTANCE.getGeneratorLpVarCountElement_ELpVarCount();

		/**
		 * The meta object literal for the '<em><b>ECount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_VAR_COUNT_ELEMENT__ECOUNT = eINSTANCE.getGeneratorLpVarCountElement_ECount();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_VAR_COUNT_ELEMENT__ECLASS = eINSTANCE.getGeneratorLpVarCountElement_EClass();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarCountImpl <em>Generator Lp Var Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorLpVarCountImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpVarCount()
		 * @generated
		 */
		EClass GENERATOR_LP_VAR_COUNT = eINSTANCE.getGeneratorLpVarCount();

		/**
		 * The meta object literal for the '<em><b>ELp Var Count Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_LP_VAR_COUNT__ELP_VAR_COUNT_ELEMENT = eINSTANCE.getGeneratorLpVarCount_ELpVarCountElement();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_LP_VAR_COUNT__GENERATOR = eINSTANCE.getGeneratorLpVarCount_Generator();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpConsCountImpl <em>Generator Lp Cons Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorLpConsCountImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpConsCount()
		 * @generated
		 */
		EClass GENERATOR_LP_CONS_COUNT = eINSTANCE.getGeneratorLpConsCount();

		/**
		 * The meta object literal for the '<em><b>Lp Cons Count Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_LP_CONS_COUNT__LP_CONS_COUNT_ELEMENT = eINSTANCE.getGeneratorLpConsCount_LpConsCountElement();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_LP_CONS_COUNT__GENERATOR = eINSTANCE.getGeneratorLpConsCount_Generator();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorFeatureModeImpl <em>Generator Feature Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorFeatureModeImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorFeatureMode()
		 * @generated
		 */
		EClass GENERATOR_FEATURE_MODE = eINSTANCE.getGeneratorFeatureMode();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_FEATURE_MODE__GENERATOR = eINSTANCE.getGeneratorFeatureMode_Generator();

		/**
		 * The meta object literal for the '<em><b>Objet Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_FEATURE_MODE__OBJET_SCOPE = eINSTANCE.getGeneratorFeatureMode_ObjetScope();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_FEATURE_MODE__CODE = eINSTANCE.getGeneratorFeatureMode_Code();

		/**
		 * The meta object literal for the '<em><b>ERemarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_FEATURE_MODE__EREMARKS = eINSTANCE.getGeneratorFeatureMode_ERemarks();

		/**
		 * The meta object literal for the '<em><b>Is Object In Scope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_FEATURE_MODE___IS_OBJECT_IN_SCOPE__GENERATORTUPLE = eINSTANCE.getGeneratorFeatureMode__IsObjectInScope__GeneratorTuple();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorConstraintEnablerImpl <em>Generator Constraint Enabler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorConstraintEnablerImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorConstraintEnabler()
		 * @generated
		 */
		EClass GENERATOR_CONSTRAINT_ENABLER = eINSTANCE.getGeneratorConstraintEnabler();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorVarOverflowImpl <em>Generator Var Overflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorVarOverflowImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorVarOverflow()
		 * @generated
		 */
		EClass GENERATOR_VAR_OVERFLOW = eINSTANCE.getGeneratorVarOverflow();

		/**
		 * The meta object literal for the '<em><b>Cost Over Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_VAR_OVERFLOW__COST_OVER_FLOW = eINSTANCE.getGeneratorVarOverflow_CostOverFlow();

		/**
		 * The meta object literal for the '<em><b>Max Enforce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_VAR_OVERFLOW__MAX_ENFORCE = eINSTANCE.getGeneratorVarOverflow_MaxEnforce();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolverImpl <em>Solver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolverImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolver()
		 * @generated
		 */
		EClass SOLVER = eINSTANCE.getSolver();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__REMARKS = eINSTANCE.getSolver_Remarks();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__STATUS = eINSTANCE.getSolver_Status();

		/**
		 * The meta object literal for the '<em><b>Solver Max Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__SOLVER_MAX_DURATION = eINSTANCE.getSolver_SolverMaxDuration();

		/**
		 * The meta object literal for the '<em><b>Solver Log Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__SOLVER_LOG_LEVEL = eINSTANCE.getSolver_SolverLogLevel();

		/**
		 * The meta object literal for the '<em><b>Solver Dump</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__SOLVER_DUMP = eINSTANCE.getSolver_SolverDump();

		/**
		 * The meta object literal for the '<em><b>Run Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__RUN_STARTED = eINSTANCE.getSolver_RunStarted();

		/**
		 * The meta object literal for the '<em><b>Run Initialization Ended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__RUN_INITIALIZATION_ENDED = eINSTANCE.getSolver_RunInitializationEnded();

		/**
		 * The meta object literal for the '<em><b>Run Solving Ended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__RUN_SOLVING_ENDED = eINSTANCE.getSolver_RunSolvingEnded();

		/**
		 * The meta object literal for the '<em><b>Run Finalization Ended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__RUN_FINALIZATION_ENDED = eINSTANCE.getSolver_RunFinalizationEnded();

		/**
		 * The meta object literal for the '<em><b>Run Duration Initialization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__RUN_DURATION_INITIALIZATION = eINSTANCE.getSolver_RunDurationInitialization();

		/**
		 * The meta object literal for the '<em><b>Run Duration Finalization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__RUN_DURATION_FINALIZATION = eINSTANCE.getSolver_RunDurationFinalization();

		/**
		 * The meta object literal for the '<em><b>Run Duration Solving</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__RUN_DURATION_SOLVING = eINSTANCE.getSolver_RunDurationSolving();

		/**
		 * The meta object literal for the '<em><b>Run Request Terminate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__RUN_REQUEST_TERMINATE = eINSTANCE.getSolver_RunRequestTerminate();

		/**
		 * The meta object literal for the '<em><b>Sol Unfeasible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__SOL_UNFEASIBLE = eINSTANCE.getSolver_SolUnfeasible();

		/**
		 * The meta object literal for the '<em><b>Sol Feasible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__SOL_FEASIBLE = eINSTANCE.getSolver_SolFeasible();

		/**
		 * The meta object literal for the '<em><b>Sol Optimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__SOL_OPTIMAL = eINSTANCE.getSolver_SolOptimal();

		/**
		 * The meta object literal for the '<em><b>Sol Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__SOL_VALUE = eINSTANCE.getSolver_SolValue();

		/**
		 * The meta object literal for the '<em><b>Run Interrupted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__RUN_INTERRUPTED = eINSTANCE.getSolver_RunInterrupted();

		/**
		 * The meta object literal for the '<em><b>Run Time Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__RUN_TIME_OUT = eINSTANCE.getSolver_RunTimeOut();

		/**
		 * The meta object literal for the '<em><b>Initializing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__INITIALIZING = eINSTANCE.getSolver_Initializing();

		/**
		 * The meta object literal for the '<em><b>Initial Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVER__INITIAL_SOLUTION = eINSTANCE.getSolver_InitialSolution();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVER__GOALS = eINSTANCE.getSolver_Goals();

		/**
		 * The meta object literal for the '<em><b>Solving</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__SOLVING = eINSTANCE.getSolver_Solving();

		/**
		 * The meta object literal for the '<em><b>Finalizing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__FINALIZING = eINSTANCE.getSolver_Finalizing();

		/**
		 * The meta object literal for the '<em><b>Finished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__FINISHED = eINSTANCE.getSolver_Finished();

		/**
		 * The meta object literal for the '<em><b>Solve</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER___SOLVE = eINSTANCE.getSolver__Solve();

		/**
		 * The meta object literal for the '<em><b>Build Vars</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER___BUILD_VARS = eINSTANCE.getSolver__BuildVars();

		/**
		 * The meta object literal for the '<em><b>Build Var</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER___BUILD_VAR__GENERATORVAR = eINSTANCE.getSolver__BuildVar__GeneratorVar();

		/**
		 * The meta object literal for the '<em><b>Build Lp Var</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER___BUILD_LP_VAR__GENERATORLPVAR = eINSTANCE.getSolver__BuildLpVar__GeneratorLpVar();

		/**
		 * The meta object literal for the '<em><b>Build Cons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER___BUILD_CONS = eINSTANCE.getSolver__BuildCons();

		/**
		 * The meta object literal for the '<em><b>Build Lp Goal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER___BUILD_LP_GOAL__GENERATORLPGOAL_FLOAT = eINSTANCE.getSolver__BuildLpGoal__GeneratorLpGoal_float();

		/**
		 * The meta object literal for the '<em><b>Build Cons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER___BUILD_CONS__GENERATORCONS = eINSTANCE.getSolver__BuildCons__GeneratorCons();

		/**
		 * The meta object literal for the '<em><b>Build Lp Cons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER___BUILD_LP_CONS__GENERATORLPCONS = eINSTANCE.getSolver__BuildLpCons__GeneratorLpCons();

		/**
		 * The meta object literal for the '<em><b>Build Lp Cons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER___BUILD_LP_CONS__GENERATORELEMENT_GENERATORLPLINEAR_FLOAT_ENUMLPCONSTYPE = eINSTANCE.getSolver__BuildLpCons__GeneratorElement_GeneratorLpLinear_float_EnumLpConsType();

		/**
		 * The meta object literal for the '<em><b>Build Goals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER___BUILD_GOALS = eINSTANCE.getSolver__BuildGoals();

		/**
		 * The meta object literal for the '<em><b>Construct Solver Goal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER___CONSTRUCT_SOLVER_GOAL__GENERATORGOAL = eINSTANCE.getSolver__ConstructSolverGoal__GeneratorGoal();

		/**
		 * The meta object literal for the '<em><b>Construct Solver Goal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER___CONSTRUCT_SOLVER_GOAL__SOLUTION = eINSTANCE.getSolver__ConstructSolverGoal__Solution();

		/**
		 * The meta object literal for the '<em><b>Construct Solver Goal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER___CONSTRUCT_SOLVER_GOAL__SOLVER = eINSTANCE.getSolver__ConstructSolverGoal__Solver();

		/**
		 * The meta object literal for the '<em><b>Make Solution Goals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLVER___MAKE_SOLUTION_GOALS__SOLUTION = eINSTANCE.getSolver__MakeSolutionGoals__Solution();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolverLpImpl <em>Lp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolverLpImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolverLp()
		 * @generated
		 */
		EClass SOLVER_LP = eINSTANCE.getSolverLp();

		/**
		 * The meta object literal for the '<em><b>Solver Optimality Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_LP__SOLVER_OPTIMALITY_TOLERANCE = eINSTANCE.getSolverLp_SolverOptimalityTolerance();

		/**
		 * The meta object literal for the '<em><b>Solver Linear Relaxation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_LP__SOLVER_LINEAR_RELAXATION = eINSTANCE.getSolverLp_SolverLinearRelaxation();

		/**
		 * The meta object literal for the '<em><b>Sol Optimality Gap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_LP__SOL_OPTIMALITY_GAP = eINSTANCE.getSolverLp_SolOptimalityGap();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolutionVarImpl <em>Solution Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolutionVarImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionVar()
		 * @generated
		 */
		EClass SOLUTION_VAR = eINSTANCE.getSolutionVar();

		/**
		 * The meta object literal for the '<em><b>Optimal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_VAR__OPTIMAL_VALUE = eINSTANCE.getSolutionVar_OptimalValue();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_VAR__VAR = eINSTANCE.getSolutionVar_Var();

		/**
		 * The meta object literal for the '<em><b>Is One</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION_VAR___IS_ONE = eINSTANCE.getSolutionVar__IsOne();

		/**
		 * The meta object literal for the '<em><b>Is Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION_VAR___IS_ZERO = eINSTANCE.getSolutionVar__IsZero();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.ILpWriter <em>ILp Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.ILpWriter
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getILpWriter()
		 * @generated
		 */
		EClass ILP_WRITER = eINSTANCE.getILpWriter();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ILP_WRITER__FILE_PATH = eINSTANCE.getILpWriter_FilePath();

		/**
		 * The meta object literal for the '<em><b>File Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ILP_WRITER__FILE_FORMAT = eINSTANCE.getILpWriter_FileFormat();

		/**
		 * The meta object literal for the '<em><b>File Compressed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ILP_WRITER__FILE_COMPRESSED = eINSTANCE.getILpWriter_FileCompressed();

		/**
		 * The meta object literal for the '<em><b>Write Lp To File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ILP_WRITER___WRITE_LP_TO_FILE = eINSTANCE.getILpWriter__WriteLpToFile();

		/**
		 * The meta object literal for the '<em><b>Get Lp As String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ILP_WRITER___GET_LP_AS_STRING = eINSTANCE.getILpWriter__GetLpAsString();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolutionReaderImpl <em>Solution Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolutionReaderImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionReader()
		 * @generated
		 */
		EClass SOLUTION_READER = eINSTANCE.getSolutionReader();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_READER__FILE_PATH = eINSTANCE.getSolutionReader_FilePath();

		/**
		 * The meta object literal for the '<em><b>Read Sol From File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION_READER___READ_SOL_FROM_FILE = eINSTANCE.getSolutionReader__ReadSolFromFile();

		/**
		 * The meta object literal for the '<em><b>Set Sol As String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION_READER___SET_SOL_AS_STRING__STRING = eINSTANCE.getSolutionReader__SetSolAsString__String();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolutionReaderPatternImpl <em>Solution Reader Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolutionReaderPatternImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionReaderPattern()
		 * @generated
		 */
		EClass SOLUTION_READER_PATTERN = eINSTANCE.getSolutionReaderPattern();

		/**
		 * The meta object literal for the '<em><b>Line Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_READER_PATTERN__LINE_PATTERN = eINSTANCE.getSolutionReaderPattern_LinePattern();

		/**
		 * The meta object literal for the '<em><b>Var Name Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_READER_PATTERN__VAR_NAME_GROUP = eINSTANCE.getSolutionReaderPattern_VarNameGroup();

		/**
		 * The meta object literal for the '<em><b>Var Optimal Value Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_READER_PATTERN__VAR_OPTIMAL_VALUE_GROUP = eINSTANCE.getSolutionReaderPattern_VarOptimalValueGroup();

		/**
		 * The meta object literal for the '<em><b>Var Objective Coef Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_READER_PATTERN__VAR_OBJECTIVE_COEF_GROUP = eINSTANCE.getSolutionReaderPattern_VarObjectiveCoefGroup();

		/**
		 * The meta object literal for the '<em><b>First Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_READER_PATTERN__FIRST_LINE = eINSTANCE.getSolutionReaderPattern_FirstLine();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolutionLpVarImpl <em>Solution Lp Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolutionLpVarImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionLpVar()
		 * @generated
		 */
		EClass SOLUTION_LP_VAR = eINSTANCE.getSolutionLpVar();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolutionConsImpl <em>Solution Cons</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolutionConsImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionCons()
		 * @generated
		 */
		EClass SOLUTION_CONS = eINSTANCE.getSolutionCons();

		/**
		 * The meta object literal for the '<em><b>Cons</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_CONS__CONS = eINSTANCE.getSolutionCons_Cons();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolutionLpConsImpl <em>Solution Lp Cons</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolutionLpConsImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionLpCons()
		 * @generated
		 */
		EClass SOLUTION_LP_CONS = eINSTANCE.getSolutionLpCons();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolutionGoalImpl <em>Solution Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolutionGoalImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionGoal()
		 * @generated
		 */
		EClass SOLUTION_GOAL = eINSTANCE.getSolutionGoal();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_GOAL__GOAL = eINSTANCE.getSolutionGoal_Goal();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_GOAL__LABEL = eINSTANCE.getSolutionGoal_Label();

		/**
		 * The meta object literal for the '<em><b>Constrained</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_GOAL__CONSTRAINED = eINSTANCE.getSolutionGoal_Constrained();

		/**
		 * The meta object literal for the '<em><b>Optimized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_GOAL__OPTIMIZED = eINSTANCE.getSolutionGoal_Optimized();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_GOAL__BOUND = eINSTANCE.getSolutionGoal_Bound();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION_GOAL___REFRESH = eINSTANCE.getSolutionGoal__Refresh();

		/**
		 * The meta object literal for the '<em><b>Build Goal As Previous Solver</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION_GOAL___BUILD_GOAL_AS_PREVIOUS_SOLVER__SOLVER = eINSTANCE.getSolutionGoal__BuildGoalAsPreviousSolver__Solver();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolutionLpGoalImpl <em>Solution Lp Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolutionLpGoalImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionLpGoal()
		 * @generated
		 */
		EClass SOLUTION_LP_GOAL = eINSTANCE.getSolutionLpGoal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_LP_GOAL__VALUE = eINSTANCE.getSolutionLpGoal_Value();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpConsImpl <em>Generator Cp Cons</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorCpConsImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpCons()
		 * @generated
		 */
		EClass GENERATOR_CP_CONS = eINSTANCE.getGeneratorCpCons();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CP_CONS__POST = eINSTANCE.getGeneratorCpCons_Post();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpLinearImpl <em>Generator Cp Linear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorCpLinearImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpLinear()
		 * @generated
		 */
		EClass GENERATOR_CP_LINEAR = eINSTANCE.getGeneratorCpLinear();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CP_LINEAR__TYPE = eINSTANCE.getGeneratorCpLinear_Type();

		/**
		 * The meta object literal for the '<em><b>Right Hand Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CP_LINEAR__RIGHT_HAND_SIDE = eINSTANCE.getGeneratorCpLinear_RightHandSide();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_CP_LINEAR__TERM = eINSTANCE.getGeneratorCpLinear_Term();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpLogicalImpl <em>Generator Cp Logical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorCpLogicalImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpLogical()
		 * @generated
		 */
		EClass GENERATOR_CP_LOGICAL = eINSTANCE.getGeneratorCpLogical();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_CP_LOGICAL__TERM = eINSTANCE.getGeneratorCpLogical_Term();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CP_LOGICAL__NOT = eINSTANCE.getGeneratorCpLogical_Not();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CP_LOGICAL__TYPE = eINSTANCE.getGeneratorCpLogical_Type();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpVarImpl <em>Generator Cp Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorCpVarImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpVar()
		 * @generated
		 */
		EClass GENERATOR_CP_VAR = eINSTANCE.getGeneratorCpVar();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CP_VAR__PRIORITY = eINSTANCE.getGeneratorCpVar_Priority();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpVarAtomicImpl <em>Generator Cp Var Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorCpVarAtomicImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpVarAtomic()
		 * @generated
		 */
		EClass GENERATOR_CP_VAR_ATOMIC = eINSTANCE.getGeneratorCpVarAtomic();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CP_VAR_ATOMIC__LOWER_BOUND = eINSTANCE.getGeneratorCpVarAtomic_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CP_VAR_ATOMIC__UPPER_BOUND = eINSTANCE.getGeneratorCpVarAtomic_UpperBound();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpLinearTermImpl <em>Generator Cp Linear Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorCpLinearTermImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpLinearTerm()
		 * @generated
		 */
		EClass GENERATOR_CP_LINEAR_TERM = eINSTANCE.getGeneratorCpLinearTerm();

		/**
		 * The meta object literal for the '<em><b>Coeff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CP_LINEAR_TERM__COEFF = eINSTANCE.getGeneratorCpLinearTerm_Coeff();

		/**
		 * The meta object literal for the '<em><b>Cp Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_CP_LINEAR_TERM__CP_VAR = eINSTANCE.getGeneratorCpLinearTerm_CpVar();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpLogicalTermImpl <em>Generator Cp Logical Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.GeneratorCpLogicalTermImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpLogicalTerm()
		 * @generated
		 */
		EClass GENERATOR_CP_LOGICAL_TERM = eINSTANCE.getGeneratorCpLogicalTerm();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CP_LOGICAL_TERM__NOT = eINSTANCE.getGeneratorCpLogicalTerm_Not();

		/**
		 * The meta object literal for the '<em><b>Cp Cons</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_CP_LOGICAL_TERM__CP_CONS = eINSTANCE.getGeneratorCpLogicalTerm_CpCons();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolutionCpVarImpl <em>Solution Cp Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolutionCpVarImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionCpVar()
		 * @generated
		 */
		EClass SOLUTION_CP_VAR = eINSTANCE.getSolutionCpVar();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolverCpImpl <em>Cp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolverCpImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolverCp()
		 * @generated
		 */
		EClass SOLVER_CP = eINSTANCE.getSolverCp();

		/**
		 * The meta object literal for the '<em><b>Search All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_CP__SEARCH_ALL = eINSTANCE.getSolverCp_SearchAll();

		/**
		 * The meta object literal for the '<em>ITuple Visitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.ITupleVisitor
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getITupleVisitor()
		 * @generated
		 */
		EDataType ITUPLE_VISITOR = eINSTANCE.getITupleVisitor();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.IGeneratorTool <em>IGenerator Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.IGeneratorTool
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getIGeneratorTool()
		 * @generated
		 */
		EClass IGENERATOR_TOOL = eINSTANCE.getIGeneratorTool();

		/**
		 * The meta object literal for the '<em><b>Get Generator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGENERATOR_TOOL___GET_GENERATOR = eINSTANCE.getIGeneratorTool__GetGenerator();

		/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGENERATOR_TOOL___DISPOSE = eINSTANCE.getIGeneratorTool__Dispose();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolutionProviderImpl <em>Solution Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolutionProviderImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionProvider()
		 * @generated
		 */
		EClass SOLUTION_PROVIDER = eINSTANCE.getSolutionProvider();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_PROVIDER__SOLUTION = eINSTANCE.getSolutionProvider_Solution();

		/**
		 * The meta object literal for the '<em><b>Current Solution Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_PROVIDER__CURRENT_SOLUTION_NR = eINSTANCE.getSolutionProvider_CurrentSolutionNr();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_PROVIDER__CODE = eINSTANCE.getSolutionProvider_Code();

		/**
		 * The meta object literal for the '<em><b>Solution Factory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION_PROVIDER___SOLUTION_FACTORY = eINSTANCE.getSolutionProvider__SolutionFactory();

		/**
		 * The meta object literal for the '<em><b>Construct Solution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION_PROVIDER___CONSTRUCT_SOLUTION = eINSTANCE.getSolutionProvider__ConstructSolution();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.EnumLpVarType <em>Enum Lp Var Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.EnumLpVarType
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumLpVarType()
		 * @generated
		 */
		EEnum ENUM_LP_VAR_TYPE = eINSTANCE.getEnumLpVarType();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.EnumLpConsType <em>Enum Lp Cons Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.EnumLpConsType
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumLpConsType()
		 * @generated
		 */
		EEnum ENUM_LP_CONS_TYPE = eINSTANCE.getEnumLpConsType();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.EnumObjectiveType <em>Enum Objective Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.EnumObjectiveType
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumObjectiveType()
		 * @generated
		 */
		EEnum ENUM_OBJECTIVE_TYPE = eINSTANCE.getEnumObjectiveType();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.EnumSolverLogLevel <em>Enum Solver Log Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.EnumSolverLogLevel
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumSolverLogLevel()
		 * @generated
		 */
		EEnum ENUM_SOLVER_LOG_LEVEL = eINSTANCE.getEnumSolverLogLevel();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.EnumCpLinearType <em>Enum Cp Linear Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.EnumCpLinearType
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumCpLinearType()
		 * @generated
		 */
		EEnum ENUM_CP_LINEAR_TYPE = eINSTANCE.getEnumCpLinearType();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.EnumCpLogicalType <em>Enum Cp Logical Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.EnumCpLogicalType
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumCpLogicalType()
		 * @generated
		 */
		EEnum ENUM_CP_LOGICAL_TYPE = eINSTANCE.getEnumCpLogicalType();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.EnumLpFileFormat <em>Enum Lp File Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.EnumLpFileFormat
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumLpFileFormat()
		 * @generated
		 */
		EEnum ENUM_LP_FILE_FORMAT = eINSTANCE.getEnumLpFileFormat();

	}

} //SolverPackage
