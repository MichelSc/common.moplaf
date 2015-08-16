/**
 */
package com.misc.common.moplaf.solver;

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
	 * The feature id for the '<em><b>Tuple Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__TUPLE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Generator Feature Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__GENERATOR_FEATURE_MODES = 1;

	/**
	 * The feature id for the '<em><b>Objective Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__OBJECTIVE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__REMARKS = 3;

	/**
	 * The feature id for the '<em><b>Footprint Nof Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__FOOTPRINT_NOF_VARS = 4;

	/**
	 * The feature id for the '<em><b>Footprint Nof Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__FOOTPRINT_NOF_CONS = 5;

	/**
	 * The feature id for the '<em><b>Footprint Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__FOOTPRINT_NOF_TERMS = 6;

	/**
	 * The feature id for the '<em><b>Count Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__COUNT_CONS = 7;

	/**
	 * The feature id for the '<em><b>Count Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__COUNT_VARS = 8;

	/**
	 * The feature id for the '<em><b>ELp Var Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ELP_VAR_COUNT = 9;

	/**
	 * The feature id for the '<em><b>ELp Cons Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ELP_CONS_COUNT = 10;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CODE = 11;

	/**
	 * The feature id for the '<em><b>Solution Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__SOLUTION_PROVIDER = 12;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__SELECTED = 13;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = 14;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___GENERATE = 0;

	/**
	 * The operation id for the '<em>Generate Root Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___GENERATE_ROOT_TUPLES = 1;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___GENERATE_TUPLES = 2;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___GENERATE_VARS = 3;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___GENERATE_CONS = 4;

	/**
	 * The operation id for the '<em>Accept Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___ACCEPT_SOLUTION__SOLUTION = 5;

	/**
	 * The operation id for the '<em>Select Feature Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE = 6;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___VISIT_TUPLES__ITUPLEVISITOR = 7;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___REFRESH_SELECTED_SOLUTION = 8;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorTupleImpl <em>Generator Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorTupleImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorTuple()
	 * @generated
	 */
	int GENERATOR_TUPLE = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorElementImpl <em>Generator Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorElementImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorElement()
	 * @generated
	 */
	int GENERATOR_ELEMENT = 36;

	/**
	 * The number of structural features of the '<em>Generator Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Generator Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_ELEMENT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE__CODE = GENERATOR_ELEMENT_FEATURE_COUNT + 5;

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
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE___GET_GENERATOR = GENERATOR_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR = GENERATOR_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE___REFRESH_SELECTED_SOLUTION = GENERATOR_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Generator Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_OPERATION_COUNT = GENERATOR_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorTupleMemberImpl <em>Generator Tuple Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorTupleMemberImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorTupleMember()
	 * @generated
	 */
	int GENERATOR_TUPLE_MEMBER = 2;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER__CODE = GENERATOR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER__SELECTED_SOLUTION_DISPLAY = GENERATOR_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER__LABEL = GENERATOR_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Generator Tuple Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER_FEATURE_COUNT = GENERATOR_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER___REFRESH_SELECTED_SOLUTION = GENERATOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generator Tuple Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_TUPLE_MEMBER_OPERATION_COUNT = GENERATOR_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorVarImpl <em>Generator Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorVarImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorVar()
	 * @generated
	 */
	int GENERATOR_VAR = 3;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR__CODE = GENERATOR_TUPLE_MEMBER__CODE;

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
	 * The number of operations of the '<em>Generator Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_VAR_OPERATION_COUNT = GENERATOR_TUPLE_MEMBER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarImpl <em>Generator Lp Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorLpVarImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpVar()
	 * @generated
	 */
	int GENERATOR_LP_VAR = 4;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR__CODE = GENERATOR_VAR__CODE;

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
	 * The feature id for the '<em><b>Objective Coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR__OBJECTIVE_COEFF = GENERATOR_VAR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lp Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR__LP_TERM = GENERATOR_VAR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Generator Lp Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_VAR_FEATURE_COUNT = GENERATOR_VAR_FEATURE_COUNT + 5;

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
	int GENERATOR_CONS = 5;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS__CODE = GENERATOR_TUPLE_MEMBER__CODE;

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
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS___REFRESH_SELECTED_SOLUTION = GENERATOR_TUPLE_MEMBER___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS___GENERATE = GENERATOR_TUPLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONS___GET_SOLUTION__SOLUTION = GENERATOR_TUPLE_MEMBER_OPERATION_COUNT + 1;

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
	int GENERATOR_LP_CONS = 6;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS__CODE = GENERATOR_CONS__CODE;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS__TYPE = GENERATOR_CONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lp Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS__LP_TERM = GENERATOR_CONS_FEATURE_COUNT + 1;

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
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS___REFRESH_SELECTED_SOLUTION = GENERATOR_CONS___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS___GENERATE = GENERATOR_CONS___GENERATE;

	/**
	 * The operation id for the '<em>Get Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS___GET_SOLUTION__SOLUTION = GENERATOR_CONS___GET_SOLUTION__SOLUTION;

	/**
	 * The operation id for the '<em>Construct Term</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS___CONSTRUCT_TERM__GENERATORLPVAR_FLOAT = GENERATOR_CONS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generator Lp Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_CONS_OPERATION_COUNT = GENERATOR_CONS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorLpTermImpl <em>Generator Lp Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorLpTermImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorLpTerm()
	 * @generated
	 */
	int GENERATOR_LP_TERM = 7;

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
	 * The feature id for the '<em><b>Lp Cons</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_TERM__LP_CONS = 2;

	/**
	 * The number of structural features of the '<em>Generator Lp Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_LP_TERM_FEATURE_COUNT = 3;

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
	int GENERATOR_LP_CONS_COUNT_ELEMENT = 8;

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
	int GENERATOR_LP_VAR_COUNT_ELEMENT = 9;

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
	int GENERATOR_LP_VAR_COUNT = 10;

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
	int GENERATOR_LP_CONS_COUNT = 11;

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
	int GENERATOR_FEATURE_MODE = 12;

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
	int GENERATOR_CONSTRAINT_ENABLER = 13;

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
	int GENERATOR_VAR_OVERFLOW = 14;

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
	int IGENERATOR_TOOL = 15;

	/**
	 * The number of structural features of the '<em>IGenerator Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGENERATOR_TOOL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Parent Generator Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGENERATOR_TOOL___GET_PARENT_GENERATOR_TOOL = 0;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGENERATOR_TOOL___GET_GENERATOR = 1;

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
	int SOLUTION_PROVIDER = 19;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER__SOLUTION = IGENERATOR_TOOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER__CURRENT_SOLUTION_NR = IGENERATOR_TOOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER__CODE = IGENERATOR_TOOL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Solution Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER_FEATURE_COUNT = IGENERATOR_TOOL_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Parent Generator Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___GET_PARENT_GENERATOR_TOOL = IGENERATOR_TOOL___GET_PARENT_GENERATOR_TOOL;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___GET_GENERATOR = IGENERATOR_TOOL___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___SOLUTION_FACTORY = IGENERATOR_TOOL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER___CONSTRUCT_SOLUTION = IGENERATOR_TOOL_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Solution Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PROVIDER_OPERATION_COUNT = IGENERATOR_TOOL_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionReaderImpl <em>Solution Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionReaderImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionReader()
	 * @generated
	 */
	int SOLUTION_READER = 16;

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
	 * The operation id for the '<em>Get Parent Generator Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___GET_PARENT_GENERATOR_TOOL = SOLUTION_PROVIDER___GET_PARENT_GENERATOR_TOOL;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER___GET_GENERATOR = SOLUTION_PROVIDER___GET_GENERATOR;

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
	int SOLUTION_READER_PATTERN = 17;

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
	 * The operation id for the '<em>Get Parent Generator Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___GET_PARENT_GENERATOR_TOOL = SOLUTION_READER___GET_PARENT_GENERATOR_TOOL;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_PATTERN___GET_GENERATOR = SOLUTION_READER___GET_GENERATOR;

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
	int SOLVER = 20;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.ILpWriter <em>ILp Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.ILpWriter
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getILpWriter()
	 * @generated
	 */
	int ILP_WRITER = 18;

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
	 * The operation id for the '<em>Get Parent Generator Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_WRITER___GET_PARENT_GENERATOR_TOOL = IGENERATOR_TOOL___GET_PARENT_GENERATOR_TOOL;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_WRITER___GET_GENERATOR = IGENERATOR_TOOL___GET_GENERATOR;

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
	 * The feature id for the '<em><b>Solver Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOLVER_BACKGROUND = SOLUTION_PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOL_VALUE = SOLUTION_PROVIDER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Solver Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOLVER_LOG_LEVEL = SOLUTION_PROVIDER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Solver Dump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOLVER_DUMP = SOLUTION_PROVIDER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Run Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_STARTED = SOLUTION_PROVIDER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Run Initialization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_INITIALIZATION_ENDED = SOLUTION_PROVIDER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Run Solving Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_SOLVING_ENDED = SOLUTION_PROVIDER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Run Finalization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_FINALIZATION_ENDED = SOLUTION_PROVIDER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Run Duration Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_DURATION_INITIALIZATION = SOLUTION_PROVIDER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Run Duration Finalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_DURATION_FINALIZATION = SOLUTION_PROVIDER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Run Duration Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_DURATION_SOLVING = SOLUTION_PROVIDER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Run Request Terminate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_REQUEST_TERMINATE = SOLUTION_PROVIDER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sol Unfeasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOL_UNFEASIBLE = SOLUTION_PROVIDER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sol Feasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOL_FEASIBLE = SOLUTION_PROVIDER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sol Optimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOL_OPTIMAL = SOLUTION_PROVIDER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Run Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_INTERRUPTED = SOLUTION_PROVIDER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__SOLVING = SOLUTION_PROVIDER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Finalizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__FINALIZING = SOLUTION_PROVIDER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__FINISHED = SOLUTION_PROVIDER_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Run Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__RUN_TIME_OUT = SOLUTION_PROVIDER_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER__INITIALIZING = SOLUTION_PROVIDER_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Solver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_FEATURE_COUNT = SOLUTION_PROVIDER_FEATURE_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Parent Generator Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___GET_PARENT_GENERATOR_TOOL = SOLUTION_PROVIDER___GET_PARENT_GENERATOR_TOOL;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER___GET_GENERATOR = SOLUTION_PROVIDER___GET_GENERATOR;

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
	 * The number of operations of the '<em>Solver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_OPERATION_COUNT = SOLUTION_PROVIDER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolverLpImpl <em>Lp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolverLpImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolverLp()
	 * @generated
	 */
	int SOLVER_LP = 21;

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
	 * The feature id for the '<em><b>Solver Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__SOLVER_BACKGROUND = SOLVER__SOLVER_BACKGROUND;

	/**
	 * The feature id for the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__SOL_VALUE = SOLVER__SOL_VALUE;

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
	 * The feature id for the '<em><b>Run Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RUN_INTERRUPTED = SOLVER__RUN_INTERRUPTED;

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
	 * The feature id for the '<em><b>Run Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__RUN_TIME_OUT = SOLVER__RUN_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP__INITIALIZING = SOLVER__INITIALIZING;

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
	 * The operation id for the '<em>Get Parent Generator Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___GET_PARENT_GENERATOR_TOOL = SOLVER___GET_PARENT_GENERATOR_TOOL;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP___GET_GENERATOR = SOLVER___GET_GENERATOR;

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
	 * The number of operations of the '<em>Lp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_LP_OPERATION_COUNT = SOLVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionVarImpl <em>Solution Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionVarImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionVar()
	 * @generated
	 */
	int SOLUTION_VAR = 23;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionLpVarImpl <em>Solution Lp Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionLpVarImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionLpVar()
	 * @generated
	 */
	int SOLUTION_LP_VAR = 24;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionConsImpl <em>Solution Cons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionConsImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionCons()
	 * @generated
	 */
	int SOLUTION_CONS = 25;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionLpConsImpl <em>Solution Lp Cons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionLpConsImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionLpCons()
	 * @generated
	 */
	int SOLUTION_LP_CONS = 26;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpConsImpl <em>Generator Cp Cons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorCpConsImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpCons()
	 * @generated
	 */
	int GENERATOR_CP_CONS = 27;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpLinearImpl <em>Generator Cp Linear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorCpLinearImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpLinear()
	 * @generated
	 */
	int GENERATOR_CP_LINEAR = 28;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpLogicalImpl <em>Generator Cp Logical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorCpLogicalImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpLogical()
	 * @generated
	 */
	int GENERATOR_CP_LOGICAL = 29;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpVarImpl <em>Generator Cp Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorCpVarImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpVar()
	 * @generated
	 */
	int GENERATOR_CP_VAR = 30;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpVarAtomicImpl <em>Generator Cp Var Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorCpVarAtomicImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpVarAtomic()
	 * @generated
	 */
	int GENERATOR_CP_VAR_ATOMIC = 31;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpLinearTermImpl <em>Generator Cp Linear Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorCpLinearTermImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpLinearTerm()
	 * @generated
	 */
	int GENERATOR_CP_LINEAR_TERM = 32;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.GeneratorCpLogicalTermImpl <em>Generator Cp Logical Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.GeneratorCpLogicalTermImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getGeneratorCpLogicalTerm()
	 * @generated
	 */
	int GENERATOR_CP_LOGICAL_TERM = 33;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionCpVarImpl <em>Solution Cp Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionCpVarImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolutionCpVar()
	 * @generated
	 */
	int SOLUTION_CP_VAR = 34;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolverCpImpl <em>Cp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolverCpImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolverCp()
	 * @generated
	 */
	int SOLVER_CP = 35;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.impl.SolutionImpl
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 22;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__VAR = 0;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CONS = 1;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__PROVIDER = 2;

	/**
	 * The feature id for the '<em><b>Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SOLUTION_NR = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CODE = 4;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = 5;

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
	 * The operation id for the '<em>Construct Solution Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___CONSTRUCT_SOLUTION_CONS__GENERATORCONS = 2;

	/**
	 * The operation id for the '<em>Construct Solution Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___CONSTRUCT_SOLUTION_VAR__GENERATORVAR = 3;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Optimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR__OPTIMAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR__SOLUTION = 1;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR__VAR = 2;

	/**
	 * The number of structural features of the '<em>Solution Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR___IS_ONE = 0;

	/**
	 * The operation id for the '<em>Is Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR___IS_ZERO = 1;

	/**
	 * The number of operations of the '<em>Solution Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_VAR_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Optimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_VAR__OPTIMAL_VALUE = SOLUTION_VAR__OPTIMAL_VALUE;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_VAR__SOLUTION = SOLUTION_VAR__SOLUTION;

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
	int SOLUTION_CONS__SOLUTION = 0;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CONS__CONS = 1;

	/**
	 * The number of structural features of the '<em>Solution Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Solution Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CONS_OPERATION_COUNT = 0;

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
	 * The number of operations of the '<em>Solution Lp Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_LP_CONS_OPERATION_COUNT = SOLUTION_CONS_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS__CODE = GENERATOR_CONS__CODE;

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
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS___REFRESH_SELECTED_SOLUTION = GENERATOR_CONS___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS___GENERATE = GENERATOR_CONS___GENERATE;

	/**
	 * The operation id for the '<em>Get Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS___GET_SOLUTION__SOLUTION = GENERATOR_CONS___GET_SOLUTION__SOLUTION;

	/**
	 * The number of operations of the '<em>Generator Cp Cons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_CONS_OPERATION_COUNT = GENERATOR_CONS_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR__CODE = GENERATOR_CP_CONS__CODE;

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
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR___REFRESH_SELECTED_SOLUTION = GENERATOR_CP_CONS___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR___GENERATE = GENERATOR_CP_CONS___GENERATE;

	/**
	 * The operation id for the '<em>Get Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR___GET_SOLUTION__SOLUTION = GENERATOR_CP_CONS___GET_SOLUTION__SOLUTION;

	/**
	 * The number of operations of the '<em>Generator Cp Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LINEAR_OPERATION_COUNT = GENERATOR_CP_CONS_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL__CODE = GENERATOR_CP_CONS__CODE;

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
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL___REFRESH_SELECTED_SOLUTION = GENERATOR_CP_CONS___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL___GENERATE = GENERATOR_CP_CONS___GENERATE;

	/**
	 * The operation id for the '<em>Get Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL___GET_SOLUTION__SOLUTION = GENERATOR_CP_CONS___GET_SOLUTION__SOLUTION;

	/**
	 * The number of operations of the '<em>Generator Cp Logical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_LOGICAL_OPERATION_COUNT = GENERATOR_CP_CONS_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR__CODE = GENERATOR_VAR__CODE;

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
	 * The number of operations of the '<em>Generator Cp Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_OPERATION_COUNT = GENERATOR_VAR_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CP_VAR_ATOMIC__CODE = GENERATOR_CP_VAR__CODE;

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
	 * The feature id for the '<em><b>Optimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CP_VAR__OPTIMAL_VALUE = SOLUTION_VAR__OPTIMAL_VALUE;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_CP_VAR__SOLUTION = SOLUTION_VAR__SOLUTION;

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
	 * The feature id for the '<em><b>Solver Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__SOLVER_BACKGROUND = SOLVER__SOLVER_BACKGROUND;

	/**
	 * The feature id for the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__SOL_VALUE = SOLVER__SOL_VALUE;

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
	 * The feature id for the '<em><b>Run Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RUN_INTERRUPTED = SOLVER__RUN_INTERRUPTED;

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
	 * The feature id for the '<em><b>Run Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__RUN_TIME_OUT = SOLVER__RUN_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP__INITIALIZING = SOLVER__INITIALIZING;

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
	 * The operation id for the '<em>Get Parent Generator Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___GET_PARENT_GENERATOR_TOOL = SOLVER___GET_PARENT_GENERATOR_TOOL;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP___GET_GENERATOR = SOLVER___GET_GENERATOR;

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
	 * The number of operations of the '<em>Cp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_CP_OPERATION_COUNT = SOLVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>ITuple Visitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.ITupleVisitor
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getITupleVisitor()
	 * @generated
	 */
	int ITUPLE_VISITOR = 44;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 45;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.EnumLpVarType <em>Enum Lp Var Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.EnumLpVarType
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumLpVarType()
	 * @generated
	 */
	int ENUM_LP_VAR_TYPE = 37;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.EnumLpConsType <em>Enum Lp Cons Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.EnumLpConsType
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumLpConsType()
	 * @generated
	 */
	int ENUM_LP_CONS_TYPE = 38;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.EnumObjectiveType <em>Enum Objective Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.EnumObjectiveType
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumObjectiveType()
	 * @generated
	 */
	int ENUM_OBJECTIVE_TYPE = 39;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.EnumSolverLogLevel <em>Enum Solver Log Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.EnumSolverLogLevel
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumSolverLogLevel()
	 * @generated
	 */
	int ENUM_SOLVER_LOG_LEVEL = 40;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.EnumCpLinearType <em>Enum Cp Linear Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.EnumCpLinearType
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumCpLinearType()
	 * @generated
	 */
	int ENUM_CP_LINEAR_TYPE = 41;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.EnumCpLogicalType <em>Enum Cp Logical Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.EnumCpLogicalType
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumCpLogicalType()
	 * @generated
	 */
	int ENUM_CP_LOGICAL_TYPE = 42;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.solver.EnumLpFileFormat <em>Enum Lp File Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.solver.EnumLpFileFormat
	 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getEnumLpFileFormat()
	 * @generated
	 */
	int ENUM_LP_FILE_FORMAT = 43;


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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Generator#getObjectiveType <em>Objective Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective Type</em>'.
	 * @see com.misc.common.moplaf.solver.Generator#getObjectiveType()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_ObjectiveType();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorTuple#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#getCode()
	 * @see #getGeneratorTuple()
	 * @generated
	 */
	EAttribute getGeneratorTuple_Code();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorTuple#getGenerator() <em>Get Generator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Generator</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#getGenerator()
	 * @generated
	 */
	EOperation getGeneratorTuple__GetGenerator();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorTuple#refreshSelectedSolution() <em>Refresh Selected Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Selected Solution</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple#refreshSelectedSolution()
	 * @generated
	 */
	EOperation getGeneratorTuple__RefreshSelectedSolution();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorTupleMember#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorTupleMember#getCode()
	 * @see #getGeneratorTupleMember()
	 * @generated
	 */
	EAttribute getGeneratorTupleMember_Code();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorTupleMember#refreshSelectedSolution() <em>Refresh Selected Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Selected Solution</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorTupleMember#refreshSelectedSolution()
	 * @generated
	 */
	EOperation getGeneratorTupleMember__RefreshSelectedSolution();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.solver.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.solver.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.solver.Solution#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see com.misc.common.moplaf.solver.Solution#getVar()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.solver.Solution#getCons <em>Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cons</em>'.
	 * @see com.misc.common.moplaf.solver.Solution#getCons()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Cons();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.Solution#constructSolutionCons(com.misc.common.moplaf.solver.GeneratorCons) <em>Construct Solution Cons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Solution Cons</em>' operation.
	 * @see com.misc.common.moplaf.solver.Solution#constructSolutionCons(com.misc.common.moplaf.solver.GeneratorCons)
	 * @generated
	 */
	EOperation getSolution__ConstructSolutionCons__GeneratorCons();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.GeneratorLpVar#getObjectiveCoeff <em>Objective Coeff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective Coeff</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVar#getObjectiveCoeff()
	 * @see #getGeneratorLpVar()
	 * @generated
	 */
	EAttribute getGeneratorLpVar_ObjectiveCoeff();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorCons#generate() <em>Generate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorCons#generate()
	 * @generated
	 */
	EOperation getGeneratorCons__Generate();

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
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.solver.GeneratorLpCons#getLpTerm <em>Lp Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lp Term</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpCons#getLpTerm()
	 * @see #getGeneratorLpCons()
	 * @generated
	 */
	EReference getGeneratorLpCons_LpTerm();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.GeneratorLpCons#constructTerm(com.misc.common.moplaf.solver.GeneratorLpVar, float) <em>Construct Term</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Term</em>' operation.
	 * @see com.misc.common.moplaf.solver.GeneratorLpCons#constructTerm(com.misc.common.moplaf.solver.GeneratorLpVar, float)
	 * @generated
	 */
	EOperation getGeneratorLpCons__ConstructTerm__GeneratorLpVar_float();

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.solver.GeneratorLpTerm#getLpCons <em>Lp Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lp Cons</em>'.
	 * @see com.misc.common.moplaf.solver.GeneratorLpTerm#getLpCons()
	 * @see #getGeneratorLpTerm()
	 * @generated
	 */
	EReference getGeneratorLpTerm_LpCons();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.solver.Solver#isSolverBackground <em>Solver Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Background</em>'.
	 * @see com.misc.common.moplaf.solver.Solver#isSolverBackground()
	 * @see #getSolver()
	 * @generated
	 */
	EAttribute getSolver_SolverBackground();

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.solver.SolutionVar#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionVar#getSolution()
	 * @see #getSolutionVar()
	 * @generated
	 */
	EReference getSolutionVar_Solution();

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.solver.SolutionCons#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Solution</em>'.
	 * @see com.misc.common.moplaf.solver.SolutionCons#getSolution()
	 * @see #getSolutionCons()
	 * @generated
	 */
	EReference getSolutionCons_Solution();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.solver.IGeneratorTool#getParentGeneratorTool() <em>Get Parent Generator Tool</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parent Generator Tool</em>' operation.
	 * @see com.misc.common.moplaf.solver.IGeneratorTool#getParentGeneratorTool()
	 * @generated
	 */
	EOperation getIGeneratorTool__GetParentGeneratorTool();

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
		 * The meta object literal for the '<em><b>Objective Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__OBJECTIVE_TYPE = eINSTANCE.getGenerator_ObjectiveType();

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
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TUPLE__CODE = eINSTANCE.getGeneratorTuple_Code();

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
		 * The meta object literal for the '<em><b>Get Generator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_TUPLE___GET_GENERATOR = eINSTANCE.getGeneratorTuple__GetGenerator();

		/**
		 * The meta object literal for the '<em><b>Visit Tuples</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR = eINSTANCE.getGeneratorTuple__VisitTuples__ITupleVisitor();

		/**
		 * The meta object literal for the '<em><b>Refresh Selected Solution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_TUPLE___REFRESH_SELECTED_SOLUTION = eINSTANCE.getGeneratorTuple__RefreshSelectedSolution();

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
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_TUPLE_MEMBER__CODE = eINSTANCE.getGeneratorTupleMember_Code();

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
		 * The meta object literal for the '<em><b>Refresh Selected Solution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_TUPLE_MEMBER___REFRESH_SELECTED_SOLUTION = eINSTANCE.getGeneratorTupleMember__RefreshSelectedSolution();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.solver.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.solver.impl.SolutionImpl
		 * @see com.misc.common.moplaf.solver.impl.SolverPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__VAR = eINSTANCE.getSolution_Var();

		/**
		 * The meta object literal for the '<em><b>Cons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__CONS = eINSTANCE.getSolution_Cons();

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
		 * The meta object literal for the '<em><b>Construct Solution Cons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___CONSTRUCT_SOLUTION_CONS__GENERATORCONS = eINSTANCE.getSolution__ConstructSolutionCons__GeneratorCons();

		/**
		 * The meta object literal for the '<em><b>Construct Solution Var</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___CONSTRUCT_SOLUTION_VAR__GENERATORVAR = eINSTANCE.getSolution__ConstructSolutionVar__GeneratorVar();

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
		 * The meta object literal for the '<em><b>Objective Coeff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_VAR__OBJECTIVE_COEFF = eINSTANCE.getGeneratorLpVar_ObjectiveCoeff();

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
		 * The meta object literal for the '<em><b>Generate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_CONS___GENERATE = eINSTANCE.getGeneratorCons__Generate();

		/**
		 * The meta object literal for the '<em><b>Get Solution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_CONS___GET_SOLUTION__SOLUTION = eINSTANCE.getGeneratorCons__GetSolution__Solution();

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
		 * The meta object literal for the '<em><b>Lp Term</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_LP_CONS__LP_TERM = eINSTANCE.getGeneratorLpCons_LpTerm();

		/**
		 * The meta object literal for the '<em><b>Righ Hand Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_LP_CONS__RIGH_HAND_SIDE = eINSTANCE.getGeneratorLpCons_RighHandSide();

		/**
		 * The meta object literal for the '<em><b>Construct Term</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR_LP_CONS___CONSTRUCT_TERM__GENERATORLPVAR_FLOAT = eINSTANCE.getGeneratorLpCons__ConstructTerm__GeneratorLpVar_float();

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
		 * The meta object literal for the '<em><b>Lp Cons</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_LP_TERM__LP_CONS = eINSTANCE.getGeneratorLpTerm_LpCons();

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
		 * The meta object literal for the '<em><b>Solver Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER__SOLVER_BACKGROUND = eINSTANCE.getSolver_SolverBackground();

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
		 * The meta object literal for the '<em><b>Solution</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_VAR__SOLUTION = eINSTANCE.getSolutionVar_Solution();

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
		 * The meta object literal for the '<em><b>Solution</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_CONS__SOLUTION = eINSTANCE.getSolutionCons_Solution();

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
		 * The meta object literal for the '<em><b>Get Parent Generator Tool</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGENERATOR_TOOL___GET_PARENT_GENERATOR_TOOL = eINSTANCE.getIGeneratorTool__GetParentGeneratorTool();

		/**
		 * The meta object literal for the '<em><b>Get Generator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGENERATOR_TOOL___GET_GENERATOR = eINSTANCE.getIGeneratorTool__GetGenerator();

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
