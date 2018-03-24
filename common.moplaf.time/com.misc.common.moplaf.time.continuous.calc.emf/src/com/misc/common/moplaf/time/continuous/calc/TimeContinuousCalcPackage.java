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
package com.misc.common.moplaf.time.continuous.calc;


import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcFactory
 * @model kind="package"
 * @generated
 */
public interface TimeContinuousCalcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "calc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/time/continuous/calc/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "timcontc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimeContinuousCalcPackage eINSTANCE = com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.ScopeDistributionImpl <em>Scope Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.ScopeDistributionImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getScopeDistribution()
	 * @generated
	 */
	int SCOPE_DISTRIBUTION = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The number of structural features of the '<em>Scope Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Scope Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DISTRIBUTION_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionInitializationImpl <em>Calc Distribution Initialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionInitializationImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcDistributionInitialization()
	 * @generated
	 */
	int CALC_DISTRIBUTION_INITIALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Distribution Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Distribution Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_INITIALIZATION_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.LayerCompositeEventRefreshImpl <em>Layer Composite Event Refresh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.LayerCompositeEventRefreshImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getLayerCompositeEventRefresh()
	 * @generated
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anteceden Calc Distribution Initialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Layer Composite Event Refresh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Layer Composite Event Refresh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_COMPOSITE_EVENT_REFRESH_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionChildEventsImpl <em>Calc Distribution Child Events</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionChildEventsImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcDistributionChildEvents()
	 * @generated
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Distribution Child Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Distribution Child Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_CHILD_EVENTS_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionProvidedEventsImpl <em>Calc Distribution Provided Events</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionProvidedEventsImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcDistributionProvidedEvents()
	 * @generated
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antecedent Layer Compositeevent Refresh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_LAYER_COMPOSITEEVENT_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Antecedent Calc Distributionchild Events</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_CALC_DISTRIBUTIONCHILD_EVENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Calc Distribution Provided Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Distribution Provided Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_PROVIDED_EVENTS_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionSequenceImpl <em>Calc Distribution Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionSequenceImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcDistributionSequence()
	 * @generated
	 */
	int CALC_DISTRIBUTION_SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antecedent Calc Distribution Provided Events</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE__ANTECEDENT_CALC_DISTRIBUTION_PROVIDED_EVENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Calc Distribution Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Distribution Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_DISTRIBUTION_SEQUENCE_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.LayerDistributionSlopesImpl <em>Layer Distribution Slopes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.LayerDistributionSlopesImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getLayerDistributionSlopes()
	 * @generated
	 */
	int LAYER_DISTRIBUTION_SLOPES = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antecedent Calc Distribution Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES__ANTECEDENT_CALC_DISTRIBUTION_SEQUENCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Layer Distribution Slopes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Layer Distribution Slopes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_SLOPES_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.LayerDistributionAmountsImpl <em>Layer Distribution Amounts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.LayerDistributionAmountsImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getLayerDistributionAmounts()
	 * @generated
	 */
	int LAYER_DISTRIBUTION_AMOUNTS = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antecedent Layer Distribution Slopes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENT_LAYER_DISTRIBUTION_SLOPES = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Layer Distribution Amounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Layer Distribution Amounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_DISTRIBUTION_AMOUNTS_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventAmountImpl <em>Calc Event Amount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventAmountImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventAmount()
	 * @generated
	 */
	int CALC_EVENT_AMOUNT = 46;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__DISTRIBUTION_EVENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Event Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Event Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAmountAbsoluteImpl <em>Calc Amount Absolute Amount Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAmountAbsoluteImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountAbsoluteAmountAbsolute()
	 * @generated
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__PARENT = CALC_EVENT_AMOUNT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__ANTECEDENTS = CALC_EVENT_AMOUNT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__ANTECEDENTS_SIBLING = CALC_EVENT_AMOUNT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHED = CALC_EVENT_AMOUNT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHED_CHILDREN = CALC_EVENT_AMOUNT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHERS = CALC_EVENT_AMOUNT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__ENABLED = CALC_EVENT_AMOUNT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_AMOUNT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TYPE = CALC_EVENT_AMOUNT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__OBJECT = CALC_EVENT_AMOUNT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__INSTANCE = CALC_EVENT_AMOUNT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__DESCRIPTION = CALC_EVENT_AMOUNT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHED_PARENT = CALC_EVENT_AMOUNT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__DISTRIBUTION_EVENT = CALC_EVENT_AMOUNT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__CONCRETE_PARENT = CALC_EVENT_AMOUNT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Amount Absolute Amount Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE_FEATURE_COUNT = CALC_EVENT_AMOUNT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___INIT = CALC_EVENT_AMOUNT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___ENABLE = CALC_EVENT_AMOUNT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DISABLE = CALC_EVENT_AMOUNT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___RESET = CALC_EVENT_AMOUNT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___TOUCH__EOBJECT = CALC_EVENT_AMOUNT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___UNTOUCH = CALC_EVENT_AMOUNT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_AMOUNT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH_THIS__REFRESHER = CALC_EVENT_AMOUNT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_AMOUNT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH = CALC_EVENT_AMOUNT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH__REFRESHER = CALC_EVENT_AMOUNT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_GET_ANTECEDENTS = CALC_EVENT_AMOUNT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_GET_PARENT = CALC_EVENT_AMOUNT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_REFRESH = CALC_EVENT_AMOUNT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_REFRESH__EOBJECT = CALC_EVENT_AMOUNT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___GET_SCOPE = CALC_EVENT_AMOUNT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___GET_FACTORY_ID = CALC_EVENT_AMOUNT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_GET_BINDINGS = CALC_EVENT_AMOUNT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_AMOUNT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Amount Absolute Amount Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE_OPERATION_COUNT = CALC_EVENT_AMOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventAmountAfterImpl <em>Calc Event Amount After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventAmountAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventAmountAfter()
	 * @generated
	 */
	int CALC_EVENT_AMOUNT_AFTER = 24;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__PARENT = CALC_EVENT_AMOUNT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS = CALC_EVENT_AMOUNT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS_SIBLING = CALC_EVENT_AMOUNT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__TOUCHED = CALC_EVENT_AMOUNT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__TOUCHED_CHILDREN = CALC_EVENT_AMOUNT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__TOUCHERS = CALC_EVENT_AMOUNT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__ENABLED = CALC_EVENT_AMOUNT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_AMOUNT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__TYPE = CALC_EVENT_AMOUNT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__OBJECT = CALC_EVENT_AMOUNT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__INSTANCE = CALC_EVENT_AMOUNT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__DESCRIPTION = CALC_EVENT_AMOUNT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__TOUCHED_PARENT = CALC_EVENT_AMOUNT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__DISTRIBUTION_EVENT = CALC_EVENT_AMOUNT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER__CONCRETE_PARENT = CALC_EVENT_AMOUNT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Event Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER_FEATURE_COUNT = CALC_EVENT_AMOUNT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___INIT = CALC_EVENT_AMOUNT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___ENABLE = CALC_EVENT_AMOUNT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___DISABLE = CALC_EVENT_AMOUNT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___RESET = CALC_EVENT_AMOUNT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___TOUCH__EOBJECT = CALC_EVENT_AMOUNT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___UNTOUCH = CALC_EVENT_AMOUNT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_AMOUNT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___REFRESH_THIS__REFRESHER = CALC_EVENT_AMOUNT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_AMOUNT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___REFRESH = CALC_EVENT_AMOUNT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___REFRESH__REFRESHER = CALC_EVENT_AMOUNT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___DO_GET_ANTECEDENTS = CALC_EVENT_AMOUNT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___DO_GET_PARENT = CALC_EVENT_AMOUNT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___DO_REFRESH = CALC_EVENT_AMOUNT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___DO_REFRESH__EOBJECT = CALC_EVENT_AMOUNT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___GET_SCOPE = CALC_EVENT_AMOUNT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___GET_FACTORY_ID = CALC_EVENT_AMOUNT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___DO_GET_BINDINGS = CALC_EVENT_AMOUNT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_AMOUNT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Event Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_AFTER_OPERATION_COUNT = CALC_EVENT_AMOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAmountAfterImpl <em>Calc Amount Absolute Amount After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAmountAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountAbsoluteAmountAfter()
	 * @generated
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__PARENT = CALC_EVENT_AMOUNT_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__ANTECEDENTS = CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__ANTECEDENTS_SIBLING = CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__TOUCHED = CALC_EVENT_AMOUNT_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__TOUCHED_CHILDREN = CALC_EVENT_AMOUNT_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__TOUCHERS = CALC_EVENT_AMOUNT_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__ENABLED = CALC_EVENT_AMOUNT_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__TYPE = CALC_EVENT_AMOUNT_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__OBJECT = CALC_EVENT_AMOUNT_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__INSTANCE = CALC_EVENT_AMOUNT_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__DESCRIPTION = CALC_EVENT_AMOUNT_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__TOUCHED_PARENT = CALC_EVENT_AMOUNT_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__DISTRIBUTION_EVENT = CALC_EVENT_AMOUNT_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER__CONCRETE_PARENT = CALC_EVENT_AMOUNT_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Amount Absolute Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER_FEATURE_COUNT = CALC_EVENT_AMOUNT_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___INIT = CALC_EVENT_AMOUNT_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___ENABLE = CALC_EVENT_AMOUNT_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___DISABLE = CALC_EVENT_AMOUNT_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___RESET = CALC_EVENT_AMOUNT_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___TOUCH__EOBJECT = CALC_EVENT_AMOUNT_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___UNTOUCH = CALC_EVENT_AMOUNT_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___REFRESH_THIS__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___REFRESH = CALC_EVENT_AMOUNT_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___REFRESH__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___DO_GET_ANTECEDENTS = CALC_EVENT_AMOUNT_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___DO_GET_PARENT = CALC_EVENT_AMOUNT_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___DO_REFRESH = CALC_EVENT_AMOUNT_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___DO_REFRESH__EOBJECT = CALC_EVENT_AMOUNT_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___GET_SCOPE = CALC_EVENT_AMOUNT_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___GET_FACTORY_ID = CALC_EVENT_AMOUNT_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___DO_GET_BINDINGS = CALC_EVENT_AMOUNT_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Amount Absolute Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER_OPERATION_COUNT = CALC_EVENT_AMOUNT_AFTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAtomicAmountAbsoluteImpl <em>Calc Amount Absolute Atomic Amount Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAtomicAmountAbsoluteImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountAbsoluteAtomicAmountAbsolute()
	 * @generated
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__PARENT = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__ANTECEDENTS = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__ANTECEDENTS_SIBLING = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__TOUCHED = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__TOUCHED_CHILDREN = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__TOUCHERS = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__ENABLED = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__TYPE = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__OBJECT = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__INSTANCE = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__DESCRIPTION = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__TOUCHED_PARENT = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__DISTRIBUTION_EVENT = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE__CONCRETE_PARENT = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Amount Absolute Atomic Amount Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE_FEATURE_COUNT = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___INIT = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___ENABLE = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___DISABLE = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___RESET = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___TOUCH__EOBJECT = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___UNTOUCH = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___REFRESH_ANTECEDENTS__REFRESHER = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___REFRESH_THIS__REFRESHER = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___REFRESH = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___REFRESH__REFRESHER = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___DO_GET_ANTECEDENTS = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___DO_GET_PARENT = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___DO_REFRESH = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___DO_REFRESH__EOBJECT = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___GET_SCOPE = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___GET_FACTORY_ID = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___DO_GET_BINDINGS = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Amount Absolute Atomic Amount Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE_OPERATION_COUNT = CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventMomentImpl <em>Calc Event Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventMoment()
	 * @generated
	 */
	int CALC_EVENT_MOMENT = 26;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__DISTRIBUTION_EVENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_MOMENT_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAtomicMomentImpl <em>Calc Amount Absolute Atomic Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAtomicMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountAbsoluteAtomicMoment()
	 * @generated
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__PARENT = CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__ANTECEDENTS = CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__ANTECEDENTS_SIBLING = CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__TOUCHED = CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__TOUCHED_CHILDREN = CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__TOUCHERS = CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__ENABLED = CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__TYPE = CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__OBJECT = CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__INSTANCE = CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__DESCRIPTION = CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__TOUCHED_PARENT = CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__DISTRIBUTION_EVENT = CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT__CONCRETE_PARENT = CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Amount Absolute Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT_FEATURE_COUNT = CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___INIT = CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___ENABLE = CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___DISABLE = CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___RESET = CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___TOUCH__EOBJECT = CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___UNTOUCH = CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___REFRESH_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___REFRESH = CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___REFRESH__REFRESHER = CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___DO_GET_ANTECEDENTS = CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___DO_GET_PARENT = CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___DO_REFRESH = CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___DO_REFRESH__EOBJECT = CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___GET_SCOPE = CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___GET_FACTORY_ID = CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___DO_GET_BINDINGS = CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Amount Absolute Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT_OPERATION_COUNT = CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAmountAfterImpl <em>Calc Amount Delta Amount After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAmountAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountDeltaAmountAfter()
	 * @generated
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER = 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__PARENT = CALC_EVENT_AMOUNT_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__ANTECEDENTS = CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__ANTECEDENTS_SIBLING = CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__TOUCHED = CALC_EVENT_AMOUNT_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__TOUCHED_CHILDREN = CALC_EVENT_AMOUNT_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__TOUCHERS = CALC_EVENT_AMOUNT_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__ENABLED = CALC_EVENT_AMOUNT_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__TYPE = CALC_EVENT_AMOUNT_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__OBJECT = CALC_EVENT_AMOUNT_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__INSTANCE = CALC_EVENT_AMOUNT_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__DESCRIPTION = CALC_EVENT_AMOUNT_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__TOUCHED_PARENT = CALC_EVENT_AMOUNT_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__DISTRIBUTION_EVENT = CALC_EVENT_AMOUNT_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER__CONCRETE_PARENT = CALC_EVENT_AMOUNT_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Amount Delta Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER_FEATURE_COUNT = CALC_EVENT_AMOUNT_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___INIT = CALC_EVENT_AMOUNT_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___ENABLE = CALC_EVENT_AMOUNT_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___DISABLE = CALC_EVENT_AMOUNT_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___RESET = CALC_EVENT_AMOUNT_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___TOUCH__EOBJECT = CALC_EVENT_AMOUNT_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___UNTOUCH = CALC_EVENT_AMOUNT_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___REFRESH_THIS__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___REFRESH = CALC_EVENT_AMOUNT_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___REFRESH__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___DO_GET_ANTECEDENTS = CALC_EVENT_AMOUNT_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___DO_GET_PARENT = CALC_EVENT_AMOUNT_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___DO_REFRESH = CALC_EVENT_AMOUNT_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___DO_REFRESH__EOBJECT = CALC_EVENT_AMOUNT_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___GET_SCOPE = CALC_EVENT_AMOUNT_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___GET_FACTORY_ID = CALC_EVENT_AMOUNT_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___DO_GET_BINDINGS = CALC_EVENT_AMOUNT_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Amount Delta Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_AFTER_OPERATION_COUNT = CALC_EVENT_AMOUNT_AFTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAmountDeltaImpl <em>Calc Amount Delta Amount Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAmountDeltaImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountDeltaAmountDelta()
	 * @generated
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA = 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__PARENT = CALC_EVENT_AMOUNT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__ANTECEDENTS = CALC_EVENT_AMOUNT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__ANTECEDENTS_SIBLING = CALC_EVENT_AMOUNT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHED = CALC_EVENT_AMOUNT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHED_CHILDREN = CALC_EVENT_AMOUNT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHERS = CALC_EVENT_AMOUNT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__ENABLED = CALC_EVENT_AMOUNT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_AMOUNT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__TYPE = CALC_EVENT_AMOUNT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__OBJECT = CALC_EVENT_AMOUNT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__INSTANCE = CALC_EVENT_AMOUNT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__DESCRIPTION = CALC_EVENT_AMOUNT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHED_PARENT = CALC_EVENT_AMOUNT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__DISTRIBUTION_EVENT = CALC_EVENT_AMOUNT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA__CONCRETE_PARENT = CALC_EVENT_AMOUNT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Amount Delta Amount Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA_FEATURE_COUNT = CALC_EVENT_AMOUNT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___INIT = CALC_EVENT_AMOUNT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___ENABLE = CALC_EVENT_AMOUNT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___DISABLE = CALC_EVENT_AMOUNT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___RESET = CALC_EVENT_AMOUNT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___TOUCH__EOBJECT = CALC_EVENT_AMOUNT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___UNTOUCH = CALC_EVENT_AMOUNT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_AMOUNT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH_THIS__REFRESHER = CALC_EVENT_AMOUNT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_AMOUNT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH = CALC_EVENT_AMOUNT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH__REFRESHER = CALC_EVENT_AMOUNT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_GET_ANTECEDENTS = CALC_EVENT_AMOUNT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_GET_PARENT = CALC_EVENT_AMOUNT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_REFRESH = CALC_EVENT_AMOUNT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_REFRESH__EOBJECT = CALC_EVENT_AMOUNT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___GET_SCOPE = CALC_EVENT_AMOUNT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___GET_FACTORY_ID = CALC_EVENT_AMOUNT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_GET_BINDINGS = CALC_EVENT_AMOUNT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_AMOUNT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Amount Delta Amount Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_AMOUNT_DELTA_OPERATION_COUNT = CALC_EVENT_AMOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAtomicAmountDeltaImpl <em>Calc Amount Delta Atomic Amount Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAtomicAmountDeltaImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountDeltaAtomicAmountDelta()
	 * @generated
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA = 14;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__PARENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__ANTECEDENTS = CALC_AMOUNT_DELTA_AMOUNT_DELTA__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__ANTECEDENTS_SIBLING = CALC_AMOUNT_DELTA_AMOUNT_DELTA__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__TOUCHED = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__TOUCHED_CHILDREN = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__TOUCHERS = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__ENABLED = CALC_AMOUNT_DELTA_AMOUNT_DELTA__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_AMOUNT_DELTA_AMOUNT_DELTA__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__TYPE = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__OBJECT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__INSTANCE = CALC_AMOUNT_DELTA_AMOUNT_DELTA__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__DESCRIPTION = CALC_AMOUNT_DELTA_AMOUNT_DELTA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__TOUCHED_PARENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__DISTRIBUTION_EVENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA__CONCRETE_PARENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Amount Delta Atomic Amount Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA_FEATURE_COUNT = CALC_AMOUNT_DELTA_AMOUNT_DELTA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___INIT = CALC_AMOUNT_DELTA_AMOUNT_DELTA___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___ENABLE = CALC_AMOUNT_DELTA_AMOUNT_DELTA___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___DISABLE = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___RESET = CALC_AMOUNT_DELTA_AMOUNT_DELTA___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___TOUCH__EOBJECT = CALC_AMOUNT_DELTA_AMOUNT_DELTA___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___UNTOUCH = CALC_AMOUNT_DELTA_AMOUNT_DELTA___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___REFRESH_ANTECEDENTS__REFRESHER = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___REFRESH_THIS__REFRESHER = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___REFRESH = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___REFRESH__REFRESHER = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___DO_GET_ANTECEDENTS = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___DO_GET_PARENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___DO_REFRESH = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___DO_REFRESH__EOBJECT = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___GET_SCOPE = CALC_AMOUNT_DELTA_AMOUNT_DELTA___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___GET_FACTORY_ID = CALC_AMOUNT_DELTA_AMOUNT_DELTA___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___DO_GET_BINDINGS = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Amount Delta Atomic Amount Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA_OPERATION_COUNT = CALC_AMOUNT_DELTA_AMOUNT_DELTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAtomicMomentImpl <em>Calc Amount Delta Atomic Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAtomicMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountDeltaAtomicMoment()
	 * @generated
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT = 15;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__PARENT = CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__ANTECEDENTS = CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__ANTECEDENTS_SIBLING = CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__TOUCHED = CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__TOUCHED_CHILDREN = CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__TOUCHERS = CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__ENABLED = CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__TYPE = CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__OBJECT = CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__INSTANCE = CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__DESCRIPTION = CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__TOUCHED_PARENT = CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__DISTRIBUTION_EVENT = CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT__CONCRETE_PARENT = CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Amount Delta Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT_FEATURE_COUNT = CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___INIT = CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___ENABLE = CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___DISABLE = CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___RESET = CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___TOUCH__EOBJECT = CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___UNTOUCH = CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___REFRESH_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___REFRESH = CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___REFRESH__REFRESHER = CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___DO_GET_ANTECEDENTS = CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___DO_GET_PARENT = CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___DO_REFRESH = CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___DO_REFRESH__EOBJECT = CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___GET_SCOPE = CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___GET_FACTORY_ID = CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___DO_GET_BINDINGS = CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Amount Delta Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_AMOUNT_DELTA_ATOMIC_MOMENT_OPERATION_COUNT = CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeEndAmountDeltaImpl <em>Calc Capacity Change End Amount Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeEndAmountDeltaImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcCapacityChangeEndAmountDelta()
	 * @generated
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA = 16;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__PARENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__ANTECEDENTS = CALC_AMOUNT_DELTA_AMOUNT_DELTA__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__ANTECEDENTS_SIBLING = CALC_AMOUNT_DELTA_AMOUNT_DELTA__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__TOUCHED = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__TOUCHED_CHILDREN = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__TOUCHERS = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__ENABLED = CALC_AMOUNT_DELTA_AMOUNT_DELTA__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_AMOUNT_DELTA_AMOUNT_DELTA__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__TYPE = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__OBJECT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__INSTANCE = CALC_AMOUNT_DELTA_AMOUNT_DELTA__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__DESCRIPTION = CALC_AMOUNT_DELTA_AMOUNT_DELTA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__TOUCHED_PARENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__DISTRIBUTION_EVENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA__CONCRETE_PARENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Capacity Change End Amount Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA_FEATURE_COUNT = CALC_AMOUNT_DELTA_AMOUNT_DELTA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___INIT = CALC_AMOUNT_DELTA_AMOUNT_DELTA___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___ENABLE = CALC_AMOUNT_DELTA_AMOUNT_DELTA___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___DISABLE = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___RESET = CALC_AMOUNT_DELTA_AMOUNT_DELTA___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___TOUCH__EOBJECT = CALC_AMOUNT_DELTA_AMOUNT_DELTA___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___UNTOUCH = CALC_AMOUNT_DELTA_AMOUNT_DELTA___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___REFRESH_ANTECEDENTS__REFRESHER = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___REFRESH_THIS__REFRESHER = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___REFRESH = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___REFRESH__REFRESHER = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___DO_GET_ANTECEDENTS = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___DO_GET_PARENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___DO_REFRESH = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___DO_REFRESH__EOBJECT = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___GET_SCOPE = CALC_AMOUNT_DELTA_AMOUNT_DELTA___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___GET_FACTORY_ID = CALC_AMOUNT_DELTA_AMOUNT_DELTA___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___DO_GET_BINDINGS = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Capacity Change End Amount Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA_OPERATION_COUNT = CALC_AMOUNT_DELTA_AMOUNT_DELTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeEndMomentImpl <em>Calc Capacity Change End Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeEndMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcCapacityChangeEndMoment()
	 * @generated
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT = 17;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__PARENT = CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__ANTECEDENTS = CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__ANTECEDENTS_SIBLING = CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__TOUCHED = CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__TOUCHED_CHILDREN = CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__TOUCHERS = CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__ENABLED = CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__TYPE = CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__OBJECT = CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__INSTANCE = CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__DESCRIPTION = CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__TOUCHED_PARENT = CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__DISTRIBUTION_EVENT = CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT__CONCRETE_PARENT = CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Capacity Change End Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT_FEATURE_COUNT = CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___INIT = CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___ENABLE = CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___DISABLE = CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___RESET = CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___TOUCH__EOBJECT = CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___UNTOUCH = CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___REFRESH_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___REFRESH = CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___REFRESH__REFRESHER = CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___DO_GET_ANTECEDENTS = CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___DO_GET_PARENT = CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___DO_REFRESH = CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___DO_REFRESH__EOBJECT = CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___GET_SCOPE = CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___GET_FACTORY_ID = CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___DO_GET_BINDINGS = CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Capacity Change End Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_END_MOMENT_OPERATION_COUNT = CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeStartAmountDeltaImpl <em>Calc Capacity Change Start Amount Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeStartAmountDeltaImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcCapacityChangeStartAmountDelta()
	 * @generated
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA = 18;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__PARENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__ANTECEDENTS = CALC_AMOUNT_DELTA_AMOUNT_DELTA__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__ANTECEDENTS_SIBLING = CALC_AMOUNT_DELTA_AMOUNT_DELTA__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__TOUCHED = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__TOUCHED_CHILDREN = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__TOUCHERS = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__ENABLED = CALC_AMOUNT_DELTA_AMOUNT_DELTA__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_AMOUNT_DELTA_AMOUNT_DELTA__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__TYPE = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__OBJECT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__INSTANCE = CALC_AMOUNT_DELTA_AMOUNT_DELTA__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__DESCRIPTION = CALC_AMOUNT_DELTA_AMOUNT_DELTA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__TOUCHED_PARENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__DISTRIBUTION_EVENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA__CONCRETE_PARENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Capacity Change Start Amount Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA_FEATURE_COUNT = CALC_AMOUNT_DELTA_AMOUNT_DELTA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___INIT = CALC_AMOUNT_DELTA_AMOUNT_DELTA___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___ENABLE = CALC_AMOUNT_DELTA_AMOUNT_DELTA___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___DISABLE = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___RESET = CALC_AMOUNT_DELTA_AMOUNT_DELTA___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___TOUCH__EOBJECT = CALC_AMOUNT_DELTA_AMOUNT_DELTA___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___UNTOUCH = CALC_AMOUNT_DELTA_AMOUNT_DELTA___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___REFRESH_ANTECEDENTS__REFRESHER = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___REFRESH_THIS__REFRESHER = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___REFRESH = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___REFRESH__REFRESHER = CALC_AMOUNT_DELTA_AMOUNT_DELTA___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___DO_GET_ANTECEDENTS = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___DO_GET_PARENT = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___DO_REFRESH = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___DO_REFRESH__EOBJECT = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___GET_SCOPE = CALC_AMOUNT_DELTA_AMOUNT_DELTA___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___GET_FACTORY_ID = CALC_AMOUNT_DELTA_AMOUNT_DELTA___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___DO_GET_BINDINGS = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_AMOUNT_DELTA_AMOUNT_DELTA___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Capacity Change Start Amount Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA_OPERATION_COUNT = CALC_AMOUNT_DELTA_AMOUNT_DELTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeStartMomentImpl <em>Calc Capacity Change Start Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeStartMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcCapacityChangeStartMoment()
	 * @generated
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT = 19;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__PARENT = CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__ANTECEDENTS = CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__ANTECEDENTS_SIBLING = CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__TOUCHED = CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__TOUCHED_CHILDREN = CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__TOUCHERS = CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__ENABLED = CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__TYPE = CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__OBJECT = CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__INSTANCE = CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__DESCRIPTION = CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__TOUCHED_PARENT = CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__DISTRIBUTION_EVENT = CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT__CONCRETE_PARENT = CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Capacity Change Start Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT_FEATURE_COUNT = CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___INIT = CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___ENABLE = CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___DISABLE = CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___RESET = CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___TOUCH__EOBJECT = CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___UNTOUCH = CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___REFRESH_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___REFRESH = CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___REFRESH__REFRESHER = CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___DO_GET_ANTECEDENTS = CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___DO_GET_PARENT = CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___DO_REFRESH = CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___DO_REFRESH__EOBJECT = CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___GET_SCOPE = CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___GET_FACTORY_ID = CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___DO_GET_BINDINGS = CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Capacity Change Start Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CAPACITY_CHANGE_START_MOMENT_OPERATION_COUNT = CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcChildEventAmountAfterImpl <em>Calc Child Event Amount After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcChildEventAmountAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcChildEventAmountAfter()
	 * @generated
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER = 20;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__PARENT = CALC_EVENT_AMOUNT_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__ANTECEDENTS = CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__ANTECEDENTS_SIBLING = CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__TOUCHED = CALC_EVENT_AMOUNT_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__TOUCHED_CHILDREN = CALC_EVENT_AMOUNT_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__TOUCHERS = CALC_EVENT_AMOUNT_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__ENABLED = CALC_EVENT_AMOUNT_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__TYPE = CALC_EVENT_AMOUNT_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__OBJECT = CALC_EVENT_AMOUNT_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__INSTANCE = CALC_EVENT_AMOUNT_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__DESCRIPTION = CALC_EVENT_AMOUNT_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__TOUCHED_PARENT = CALC_EVENT_AMOUNT_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__DISTRIBUTION_EVENT = CALC_EVENT_AMOUNT_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER__CONCRETE_PARENT = CALC_EVENT_AMOUNT_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Child Event Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER_FEATURE_COUNT = CALC_EVENT_AMOUNT_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___INIT = CALC_EVENT_AMOUNT_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___ENABLE = CALC_EVENT_AMOUNT_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___DISABLE = CALC_EVENT_AMOUNT_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___RESET = CALC_EVENT_AMOUNT_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___TOUCH__EOBJECT = CALC_EVENT_AMOUNT_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___UNTOUCH = CALC_EVENT_AMOUNT_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___REFRESH_THIS__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___REFRESH = CALC_EVENT_AMOUNT_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___REFRESH__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___DO_GET_ANTECEDENTS = CALC_EVENT_AMOUNT_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___DO_GET_PARENT = CALC_EVENT_AMOUNT_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___DO_REFRESH = CALC_EVENT_AMOUNT_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___DO_REFRESH__EOBJECT = CALC_EVENT_AMOUNT_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___GET_SCOPE = CALC_EVENT_AMOUNT_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___GET_FACTORY_ID = CALC_EVENT_AMOUNT_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___DO_GET_BINDINGS = CALC_EVENT_AMOUNT_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Child Event Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_AMOUNT_AFTER_OPERATION_COUNT = CALC_EVENT_AMOUNT_AFTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcChildEventMomentImpl <em>Calc Child Event Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcChildEventMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcChildEventMoment()
	 * @generated
	 */
	int CALC_CHILD_EVENT_MOMENT = 21;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__PARENT = CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__ANTECEDENTS = CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__ANTECEDENTS_SIBLING = CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__TOUCHED = CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__TOUCHED_CHILDREN = CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__TOUCHERS = CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__ENABLED = CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__TYPE = CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__OBJECT = CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__INSTANCE = CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__DESCRIPTION = CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__TOUCHED_PARENT = CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__DISTRIBUTION_EVENT = CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT__CONCRETE_PARENT = CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Child Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT_FEATURE_COUNT = CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___INIT = CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___ENABLE = CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___DISABLE = CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___RESET = CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___TOUCH__EOBJECT = CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___UNTOUCH = CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___REFRESH_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___REFRESH = CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___REFRESH__REFRESHER = CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___DO_GET_ANTECEDENTS = CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___DO_GET_PARENT = CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___DO_REFRESH = CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___DO_REFRESH__EOBJECT = CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___GET_SCOPE = CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___GET_FACTORY_ID = CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___DO_GET_BINDINGS = CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Child Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_MOMENT_OPERATION_COUNT = CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventSlopeImpl <em>Calc Event Slope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventSlopeImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventSlope()
	 * @generated
	 */
	int CALC_EVENT_SLOPE = 45;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__DISTRIBUTION_EVENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Event Slope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Event Slope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventSlopeAfterImpl <em>Calc Event Slope After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventSlopeAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventSlopeAfter()
	 * @generated
	 */
	int CALC_EVENT_SLOPE_AFTER = 27;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__PARENT = CALC_EVENT_SLOPE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__ANTECEDENTS = CALC_EVENT_SLOPE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__ANTECEDENTS_SIBLING = CALC_EVENT_SLOPE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__TOUCHED = CALC_EVENT_SLOPE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__TOUCHED_CHILDREN = CALC_EVENT_SLOPE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__TOUCHERS = CALC_EVENT_SLOPE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__ENABLED = CALC_EVENT_SLOPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_SLOPE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__TYPE = CALC_EVENT_SLOPE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__OBJECT = CALC_EVENT_SLOPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__INSTANCE = CALC_EVENT_SLOPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__DESCRIPTION = CALC_EVENT_SLOPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__TOUCHED_PARENT = CALC_EVENT_SLOPE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__DISTRIBUTION_EVENT = CALC_EVENT_SLOPE__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER__CONCRETE_PARENT = CALC_EVENT_SLOPE__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Event Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER_FEATURE_COUNT = CALC_EVENT_SLOPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___INIT = CALC_EVENT_SLOPE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___ENABLE = CALC_EVENT_SLOPE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___DISABLE = CALC_EVENT_SLOPE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___RESET = CALC_EVENT_SLOPE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___TOUCH__EOBJECT = CALC_EVENT_SLOPE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___UNTOUCH = CALC_EVENT_SLOPE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_SLOPE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___REFRESH_THIS__REFRESHER = CALC_EVENT_SLOPE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_SLOPE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___REFRESH = CALC_EVENT_SLOPE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___REFRESH__REFRESHER = CALC_EVENT_SLOPE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___DO_GET_ANTECEDENTS = CALC_EVENT_SLOPE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___DO_GET_PARENT = CALC_EVENT_SLOPE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___DO_REFRESH = CALC_EVENT_SLOPE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___DO_REFRESH__EOBJECT = CALC_EVENT_SLOPE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___GET_SCOPE = CALC_EVENT_SLOPE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___GET_FACTORY_ID = CALC_EVENT_SLOPE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___DO_GET_BINDINGS = CALC_EVENT_SLOPE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_SLOPE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Event Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_AFTER_OPERATION_COUNT = CALC_EVENT_SLOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcChildEventSlopeAfterImpl <em>Calc Child Event Slope After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcChildEventSlopeAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcChildEventSlopeAfter()
	 * @generated
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER = 22;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__PARENT = CALC_EVENT_SLOPE_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__ANTECEDENTS = CALC_EVENT_SLOPE_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__ANTECEDENTS_SIBLING = CALC_EVENT_SLOPE_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__TOUCHED = CALC_EVENT_SLOPE_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__TOUCHED_CHILDREN = CALC_EVENT_SLOPE_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__TOUCHERS = CALC_EVENT_SLOPE_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__ENABLED = CALC_EVENT_SLOPE_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__TYPE = CALC_EVENT_SLOPE_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__OBJECT = CALC_EVENT_SLOPE_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__INSTANCE = CALC_EVENT_SLOPE_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__DESCRIPTION = CALC_EVENT_SLOPE_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__TOUCHED_PARENT = CALC_EVENT_SLOPE_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__DISTRIBUTION_EVENT = CALC_EVENT_SLOPE_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER__CONCRETE_PARENT = CALC_EVENT_SLOPE_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Child Event Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER_FEATURE_COUNT = CALC_EVENT_SLOPE_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___INIT = CALC_EVENT_SLOPE_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___ENABLE = CALC_EVENT_SLOPE_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___DISABLE = CALC_EVENT_SLOPE_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___RESET = CALC_EVENT_SLOPE_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___TOUCH__EOBJECT = CALC_EVENT_SLOPE_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___UNTOUCH = CALC_EVENT_SLOPE_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___REFRESH_THIS__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___REFRESH = CALC_EVENT_SLOPE_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___REFRESH__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___DO_GET_ANTECEDENTS = CALC_EVENT_SLOPE_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___DO_GET_PARENT = CALC_EVENT_SLOPE_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___DO_REFRESH = CALC_EVENT_SLOPE_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___DO_REFRESH__EOBJECT = CALC_EVENT_SLOPE_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___GET_SCOPE = CALC_EVENT_SLOPE_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___GET_FACTORY_ID = CALC_EVENT_SLOPE_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___DO_GET_BINDINGS = CALC_EVENT_SLOPE_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Child Event Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_CHILD_EVENT_SLOPE_AFTER_OPERATION_COUNT = CALC_EVENT_SLOPE_AFTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEndEventMomentImpl <em>Calc End Event Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEndEventMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEndEventMoment()
	 * @generated
	 */
	int CALC_END_EVENT_MOMENT = 23;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__PARENT = CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__ANTECEDENTS = CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__ANTECEDENTS_SIBLING = CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__TOUCHED = CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__TOUCHED_CHILDREN = CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__TOUCHERS = CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__ENABLED = CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__TYPE = CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__OBJECT = CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__INSTANCE = CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__DESCRIPTION = CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__TOUCHED_PARENT = CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__DISTRIBUTION_EVENT = CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT__CONCRETE_PARENT = CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc End Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT_FEATURE_COUNT = CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___INIT = CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___ENABLE = CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___DISABLE = CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___RESET = CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___TOUCH__EOBJECT = CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___UNTOUCH = CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___REFRESH_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___REFRESH = CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___REFRESH__REFRESHER = CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___DO_GET_ANTECEDENTS = CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___DO_GET_PARENT = CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___DO_REFRESH = CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___DO_REFRESH__EOBJECT = CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___GET_SCOPE = CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___GET_FACTORY_ID = CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___DO_GET_BINDINGS = CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc End Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_END_EVENT_MOMENT_OPERATION_COUNT = CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventAmountBeforeImpl <em>Calc Event Amount Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventAmountBeforeImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventAmountBefore()
	 * @generated
	 */
	int CALC_EVENT_AMOUNT_BEFORE = 25;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__PARENT = CALC_EVENT_AMOUNT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__ANTECEDENTS = CALC_EVENT_AMOUNT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__ANTECEDENTS_SIBLING = CALC_EVENT_AMOUNT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__TOUCHED = CALC_EVENT_AMOUNT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__TOUCHED_CHILDREN = CALC_EVENT_AMOUNT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__TOUCHERS = CALC_EVENT_AMOUNT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__ENABLED = CALC_EVENT_AMOUNT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_AMOUNT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__TYPE = CALC_EVENT_AMOUNT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__OBJECT = CALC_EVENT_AMOUNT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__INSTANCE = CALC_EVENT_AMOUNT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__DESCRIPTION = CALC_EVENT_AMOUNT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__TOUCHED_PARENT = CALC_EVENT_AMOUNT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__DISTRIBUTION_EVENT = CALC_EVENT_AMOUNT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE__CONCRETE_PARENT = CALC_EVENT_AMOUNT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Event Amount Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE_FEATURE_COUNT = CALC_EVENT_AMOUNT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___INIT = CALC_EVENT_AMOUNT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___ENABLE = CALC_EVENT_AMOUNT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___DISABLE = CALC_EVENT_AMOUNT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___RESET = CALC_EVENT_AMOUNT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___TOUCH__EOBJECT = CALC_EVENT_AMOUNT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___UNTOUCH = CALC_EVENT_AMOUNT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_AMOUNT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___REFRESH_THIS__REFRESHER = CALC_EVENT_AMOUNT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_AMOUNT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___REFRESH = CALC_EVENT_AMOUNT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___REFRESH__REFRESHER = CALC_EVENT_AMOUNT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___DO_GET_ANTECEDENTS = CALC_EVENT_AMOUNT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___DO_GET_PARENT = CALC_EVENT_AMOUNT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___DO_REFRESH = CALC_EVENT_AMOUNT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___DO_REFRESH__EOBJECT = CALC_EVENT_AMOUNT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___GET_SCOPE = CALC_EVENT_AMOUNT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___GET_FACTORY_ID = CALC_EVENT_AMOUNT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___DO_GET_BINDINGS = CALC_EVENT_AMOUNT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_AMOUNT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Event Amount Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_AMOUNT_BEFORE_OPERATION_COUNT = CALC_EVENT_AMOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventSlopeBeforeImpl <em>Calc Event Slope Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventSlopeBeforeImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventSlopeBefore()
	 * @generated
	 */
	int CALC_EVENT_SLOPE_BEFORE = 28;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__PARENT = CALC_EVENT_SLOPE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__ANTECEDENTS = CALC_EVENT_SLOPE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__ANTECEDENTS_SIBLING = CALC_EVENT_SLOPE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__TOUCHED = CALC_EVENT_SLOPE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__TOUCHED_CHILDREN = CALC_EVENT_SLOPE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__TOUCHERS = CALC_EVENT_SLOPE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__ENABLED = CALC_EVENT_SLOPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_SLOPE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__TYPE = CALC_EVENT_SLOPE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__OBJECT = CALC_EVENT_SLOPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__INSTANCE = CALC_EVENT_SLOPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__DESCRIPTION = CALC_EVENT_SLOPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__TOUCHED_PARENT = CALC_EVENT_SLOPE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__DISTRIBUTION_EVENT = CALC_EVENT_SLOPE__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE__CONCRETE_PARENT = CALC_EVENT_SLOPE__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Event Slope Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE_FEATURE_COUNT = CALC_EVENT_SLOPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___INIT = CALC_EVENT_SLOPE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___ENABLE = CALC_EVENT_SLOPE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___DISABLE = CALC_EVENT_SLOPE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___RESET = CALC_EVENT_SLOPE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___TOUCH__EOBJECT = CALC_EVENT_SLOPE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___UNTOUCH = CALC_EVENT_SLOPE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_SLOPE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___REFRESH_THIS__REFRESHER = CALC_EVENT_SLOPE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_SLOPE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___REFRESH = CALC_EVENT_SLOPE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___REFRESH__REFRESHER = CALC_EVENT_SLOPE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___DO_GET_ANTECEDENTS = CALC_EVENT_SLOPE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___DO_GET_PARENT = CALC_EVENT_SLOPE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___DO_REFRESH = CALC_EVENT_SLOPE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___DO_REFRESH__EOBJECT = CALC_EVENT_SLOPE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___GET_SCOPE = CALC_EVENT_SLOPE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___GET_FACTORY_ID = CALC_EVENT_SLOPE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___DO_GET_BINDINGS = CALC_EVENT_SLOPE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_SLOPE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Event Slope Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENT_SLOPE_BEFORE_OPERATION_COUNT = CALC_EVENT_SLOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventsProviderRefreshEventsImpl <em>Calc Events Provider Refresh Events</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventsProviderRefreshEventsImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventsProviderRefreshEvents()
	 * @generated
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS = 29;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Events Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__EVENTS_PROVIDER = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__EVENTS_PROVIDER;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS__CONCRETE_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Events Provider Refresh Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Events Provider Refresh Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_EVENTS_PROVIDER_REFRESH_EVENTS_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteAtomicMomentImpl <em>Calc Slope Absolute Atomic Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteAtomicMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeAbsoluteAtomicMoment()
	 * @generated
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT = 30;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__PARENT = CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__ANTECEDENTS = CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__ANTECEDENTS_SIBLING = CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__TOUCHED = CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__TOUCHED_CHILDREN = CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__TOUCHERS = CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__ENABLED = CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__TYPE = CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__OBJECT = CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__INSTANCE = CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__DESCRIPTION = CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__TOUCHED_PARENT = CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__DISTRIBUTION_EVENT = CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT__CONCRETE_PARENT = CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Slope Absolute Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT_FEATURE_COUNT = CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___INIT = CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___ENABLE = CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___DISABLE = CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___RESET = CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___TOUCH__EOBJECT = CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___UNTOUCH = CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___REFRESH_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___REFRESH = CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___REFRESH__REFRESHER = CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___DO_GET_ANTECEDENTS = CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___DO_GET_PARENT = CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___DO_REFRESH = CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___DO_REFRESH__EOBJECT = CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___GET_SCOPE = CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___GET_FACTORY_ID = CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___DO_GET_BINDINGS = CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Slope Absolute Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT_OPERATION_COUNT = CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteSlopeAbsoluteImpl <em>Calc Slope Absolute Slope Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteSlopeAbsoluteImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeAbsoluteSlopeAbsolute()
	 * @generated
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE = 32;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__PARENT = CALC_EVENT_SLOPE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__ANTECEDENTS = CALC_EVENT_SLOPE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__ANTECEDENTS_SIBLING = CALC_EVENT_SLOPE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHED = CALC_EVENT_SLOPE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHED_CHILDREN = CALC_EVENT_SLOPE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHERS = CALC_EVENT_SLOPE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__ENABLED = CALC_EVENT_SLOPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_SLOPE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TYPE = CALC_EVENT_SLOPE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__OBJECT = CALC_EVENT_SLOPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__INSTANCE = CALC_EVENT_SLOPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__DESCRIPTION = CALC_EVENT_SLOPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHED_PARENT = CALC_EVENT_SLOPE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__DISTRIBUTION_EVENT = CALC_EVENT_SLOPE__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__CONCRETE_PARENT = CALC_EVENT_SLOPE__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Slope Absolute Slope Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE_FEATURE_COUNT = CALC_EVENT_SLOPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___INIT = CALC_EVENT_SLOPE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___ENABLE = CALC_EVENT_SLOPE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DISABLE = CALC_EVENT_SLOPE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___RESET = CALC_EVENT_SLOPE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___TOUCH__EOBJECT = CALC_EVENT_SLOPE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___UNTOUCH = CALC_EVENT_SLOPE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_SLOPE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH_THIS__REFRESHER = CALC_EVENT_SLOPE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_SLOPE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH = CALC_EVENT_SLOPE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH__REFRESHER = CALC_EVENT_SLOPE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_GET_ANTECEDENTS = CALC_EVENT_SLOPE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_GET_PARENT = CALC_EVENT_SLOPE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_REFRESH = CALC_EVENT_SLOPE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_REFRESH__EOBJECT = CALC_EVENT_SLOPE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___GET_SCOPE = CALC_EVENT_SLOPE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___GET_FACTORY_ID = CALC_EVENT_SLOPE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_GET_BINDINGS = CALC_EVENT_SLOPE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_SLOPE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Slope Absolute Slope Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE_OPERATION_COUNT = CALC_EVENT_SLOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteAtomicSlopeAbsoluteImpl <em>Calc Slope Absolute Atomic Slope Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteAtomicSlopeAbsoluteImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeAbsoluteAtomicSlopeAbsolute()
	 * @generated
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE = 31;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__PARENT = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__ANTECEDENTS = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__ANTECEDENTS_SIBLING = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__TOUCHED = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__TOUCHED_CHILDREN = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__TOUCHERS = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__ENABLED = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__TYPE = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__OBJECT = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__INSTANCE = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__DESCRIPTION = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__TOUCHED_PARENT = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__DISTRIBUTION_EVENT = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE__CONCRETE_PARENT = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Slope Absolute Atomic Slope Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE_FEATURE_COUNT = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___INIT = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___ENABLE = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___DISABLE = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___RESET = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___TOUCH__EOBJECT = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___UNTOUCH = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___REFRESH_ANTECEDENTS__REFRESHER = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___REFRESH_THIS__REFRESHER = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___REFRESH = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___REFRESH__REFRESHER = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___DO_GET_ANTECEDENTS = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___DO_GET_PARENT = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___DO_REFRESH = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___DO_REFRESH__EOBJECT = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___GET_SCOPE = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___GET_FACTORY_ID = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___DO_GET_BINDINGS = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Slope Absolute Atomic Slope Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE_OPERATION_COUNT = CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteSlopeAfterImpl <em>Calc Slope Absolute Slope After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteSlopeAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeAbsoluteSlopeAfter()
	 * @generated
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER = 33;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__PARENT = CALC_EVENT_SLOPE_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__ANTECEDENTS = CALC_EVENT_SLOPE_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__ANTECEDENTS_SIBLING = CALC_EVENT_SLOPE_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__TOUCHED = CALC_EVENT_SLOPE_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__TOUCHED_CHILDREN = CALC_EVENT_SLOPE_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__TOUCHERS = CALC_EVENT_SLOPE_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__ENABLED = CALC_EVENT_SLOPE_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__TYPE = CALC_EVENT_SLOPE_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__OBJECT = CALC_EVENT_SLOPE_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__INSTANCE = CALC_EVENT_SLOPE_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__DESCRIPTION = CALC_EVENT_SLOPE_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__TOUCHED_PARENT = CALC_EVENT_SLOPE_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__DISTRIBUTION_EVENT = CALC_EVENT_SLOPE_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER__CONCRETE_PARENT = CALC_EVENT_SLOPE_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Slope Absolute Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER_FEATURE_COUNT = CALC_EVENT_SLOPE_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___INIT = CALC_EVENT_SLOPE_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___ENABLE = CALC_EVENT_SLOPE_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___DISABLE = CALC_EVENT_SLOPE_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___RESET = CALC_EVENT_SLOPE_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___TOUCH__EOBJECT = CALC_EVENT_SLOPE_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___UNTOUCH = CALC_EVENT_SLOPE_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___REFRESH_THIS__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___REFRESH = CALC_EVENT_SLOPE_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___REFRESH__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___DO_GET_ANTECEDENTS = CALC_EVENT_SLOPE_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___DO_GET_PARENT = CALC_EVENT_SLOPE_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___DO_REFRESH = CALC_EVENT_SLOPE_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___DO_REFRESH__EOBJECT = CALC_EVENT_SLOPE_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___GET_SCOPE = CALC_EVENT_SLOPE_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___GET_FACTORY_ID = CALC_EVENT_SLOPE_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___DO_GET_BINDINGS = CALC_EVENT_SLOPE_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Slope Absolute Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_ABSOLUTE_SLOPE_AFTER_OPERATION_COUNT = CALC_EVENT_SLOPE_AFTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaAtomicMomentImpl <em>Calc Slope Delta Atomic Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaAtomicMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeDeltaAtomicMoment()
	 * @generated
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT = 34;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__PARENT = CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__ANTECEDENTS = CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__ANTECEDENTS_SIBLING = CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__TOUCHED = CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__TOUCHED_CHILDREN = CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__TOUCHERS = CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__ENABLED = CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__TYPE = CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__OBJECT = CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__INSTANCE = CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__DESCRIPTION = CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__TOUCHED_PARENT = CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__DISTRIBUTION_EVENT = CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT__CONCRETE_PARENT = CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Slope Delta Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT_FEATURE_COUNT = CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___INIT = CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___ENABLE = CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___DISABLE = CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___RESET = CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___TOUCH__EOBJECT = CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___UNTOUCH = CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___REFRESH_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___REFRESH = CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___REFRESH__REFRESHER = CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___DO_GET_ANTECEDENTS = CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___DO_GET_PARENT = CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___DO_REFRESH = CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___DO_REFRESH__EOBJECT = CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___GET_SCOPE = CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___GET_FACTORY_ID = CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___DO_GET_BINDINGS = CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Slope Delta Atomic Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_MOMENT_OPERATION_COUNT = CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaSlopeDeltaImpl <em>Calc Slope Delta Slope Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaSlopeDeltaImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeDeltaSlopeDelta()
	 * @generated
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA = 37;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__PARENT = CALC_EVENT_SLOPE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__ANTECEDENTS = CALC_EVENT_SLOPE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__ANTECEDENTS_SIBLING = CALC_EVENT_SLOPE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHED = CALC_EVENT_SLOPE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHED_CHILDREN = CALC_EVENT_SLOPE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHERS = CALC_EVENT_SLOPE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__ENABLED = CALC_EVENT_SLOPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_SLOPE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__TYPE = CALC_EVENT_SLOPE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__OBJECT = CALC_EVENT_SLOPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__INSTANCE = CALC_EVENT_SLOPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__DESCRIPTION = CALC_EVENT_SLOPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHED_PARENT = CALC_EVENT_SLOPE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__DISTRIBUTION_EVENT = CALC_EVENT_SLOPE__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA__CONCRETE_PARENT = CALC_EVENT_SLOPE__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Slope Delta Slope Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA_FEATURE_COUNT = CALC_EVENT_SLOPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___INIT = CALC_EVENT_SLOPE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___ENABLE = CALC_EVENT_SLOPE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___DISABLE = CALC_EVENT_SLOPE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___RESET = CALC_EVENT_SLOPE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___TOUCH__EOBJECT = CALC_EVENT_SLOPE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___UNTOUCH = CALC_EVENT_SLOPE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_SLOPE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH_THIS__REFRESHER = CALC_EVENT_SLOPE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_SLOPE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH = CALC_EVENT_SLOPE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH__REFRESHER = CALC_EVENT_SLOPE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___DO_GET_ANTECEDENTS = CALC_EVENT_SLOPE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___DO_GET_PARENT = CALC_EVENT_SLOPE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___DO_REFRESH = CALC_EVENT_SLOPE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___DO_REFRESH__EOBJECT = CALC_EVENT_SLOPE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___GET_SCOPE = CALC_EVENT_SLOPE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___GET_FACTORY_ID = CALC_EVENT_SLOPE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___DO_GET_BINDINGS = CALC_EVENT_SLOPE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_SLOPE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Slope Delta Slope Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_DELTA_OPERATION_COUNT = CALC_EVENT_SLOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaAtomicSlopeDeltaImpl <em>Calc Slope Delta Atomic Slope Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaAtomicSlopeDeltaImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeDeltaAtomicSlopeDelta()
	 * @generated
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA = 35;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__PARENT = CALC_SLOPE_DELTA_SLOPE_DELTA__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__ANTECEDENTS = CALC_SLOPE_DELTA_SLOPE_DELTA__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__ANTECEDENTS_SIBLING = CALC_SLOPE_DELTA_SLOPE_DELTA__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__TOUCHED = CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__TOUCHED_CHILDREN = CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__TOUCHERS = CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__ENABLED = CALC_SLOPE_DELTA_SLOPE_DELTA__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_SLOPE_DELTA_SLOPE_DELTA__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__TYPE = CALC_SLOPE_DELTA_SLOPE_DELTA__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__OBJECT = CALC_SLOPE_DELTA_SLOPE_DELTA__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__INSTANCE = CALC_SLOPE_DELTA_SLOPE_DELTA__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__DESCRIPTION = CALC_SLOPE_DELTA_SLOPE_DELTA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__TOUCHED_PARENT = CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__DISTRIBUTION_EVENT = CALC_SLOPE_DELTA_SLOPE_DELTA__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA__CONCRETE_PARENT = CALC_SLOPE_DELTA_SLOPE_DELTA__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Slope Delta Atomic Slope Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA_FEATURE_COUNT = CALC_SLOPE_DELTA_SLOPE_DELTA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___INIT = CALC_SLOPE_DELTA_SLOPE_DELTA___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___ENABLE = CALC_SLOPE_DELTA_SLOPE_DELTA___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___DISABLE = CALC_SLOPE_DELTA_SLOPE_DELTA___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___RESET = CALC_SLOPE_DELTA_SLOPE_DELTA___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___TOUCH__EOBJECT = CALC_SLOPE_DELTA_SLOPE_DELTA___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___UNTOUCH = CALC_SLOPE_DELTA_SLOPE_DELTA___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___REFRESH_ANTECEDENTS__REFRESHER = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___REFRESH_THIS__REFRESHER = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___REFRESH = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___REFRESH__REFRESHER = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___DO_GET_ANTECEDENTS = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___DO_GET_PARENT = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___DO_REFRESH = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___DO_REFRESH__EOBJECT = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___GET_SCOPE = CALC_SLOPE_DELTA_SLOPE_DELTA___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___GET_FACTORY_ID = CALC_SLOPE_DELTA_SLOPE_DELTA___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___DO_GET_BINDINGS = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Slope Delta Atomic Slope Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA_OPERATION_COUNT = CALC_SLOPE_DELTA_SLOPE_DELTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaSlopeAfterImpl <em>Calc Slope Delta Slope After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaSlopeAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeDeltaSlopeAfter()
	 * @generated
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER = 36;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__PARENT = CALC_EVENT_SLOPE_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__ANTECEDENTS = CALC_EVENT_SLOPE_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__ANTECEDENTS_SIBLING = CALC_EVENT_SLOPE_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__TOUCHED = CALC_EVENT_SLOPE_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__TOUCHED_CHILDREN = CALC_EVENT_SLOPE_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__TOUCHERS = CALC_EVENT_SLOPE_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__ENABLED = CALC_EVENT_SLOPE_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__TYPE = CALC_EVENT_SLOPE_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__OBJECT = CALC_EVENT_SLOPE_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__INSTANCE = CALC_EVENT_SLOPE_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__DESCRIPTION = CALC_EVENT_SLOPE_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__TOUCHED_PARENT = CALC_EVENT_SLOPE_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__DISTRIBUTION_EVENT = CALC_EVENT_SLOPE_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER__CONCRETE_PARENT = CALC_EVENT_SLOPE_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Slope Delta Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER_FEATURE_COUNT = CALC_EVENT_SLOPE_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___INIT = CALC_EVENT_SLOPE_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___ENABLE = CALC_EVENT_SLOPE_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___DISABLE = CALC_EVENT_SLOPE_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___RESET = CALC_EVENT_SLOPE_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___TOUCH__EOBJECT = CALC_EVENT_SLOPE_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___UNTOUCH = CALC_EVENT_SLOPE_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___REFRESH_THIS__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___REFRESH = CALC_EVENT_SLOPE_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___REFRESH__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___DO_GET_ANTECEDENTS = CALC_EVENT_SLOPE_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___DO_GET_PARENT = CALC_EVENT_SLOPE_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___DO_REFRESH = CALC_EVENT_SLOPE_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___DO_REFRESH__EOBJECT = CALC_EVENT_SLOPE_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___GET_SCOPE = CALC_EVENT_SLOPE_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___GET_FACTORY_ID = CALC_EVENT_SLOPE_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___DO_GET_BINDINGS = CALC_EVENT_SLOPE_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Slope Delta Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SLOPE_DELTA_SLOPE_AFTER_OPERATION_COUNT = CALC_EVENT_SLOPE_AFTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcStartEventAmountAfterImpl <em>Calc Start Event Amount After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcStartEventAmountAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcStartEventAmountAfter()
	 * @generated
	 */
	int CALC_START_EVENT_AMOUNT_AFTER = 38;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__PARENT = CALC_EVENT_AMOUNT_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__ANTECEDENTS = CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__ANTECEDENTS_SIBLING = CALC_EVENT_AMOUNT_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__TOUCHED = CALC_EVENT_AMOUNT_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__TOUCHED_CHILDREN = CALC_EVENT_AMOUNT_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__TOUCHERS = CALC_EVENT_AMOUNT_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__ENABLED = CALC_EVENT_AMOUNT_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_AMOUNT_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__TYPE = CALC_EVENT_AMOUNT_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__OBJECT = CALC_EVENT_AMOUNT_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__INSTANCE = CALC_EVENT_AMOUNT_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__DESCRIPTION = CALC_EVENT_AMOUNT_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__TOUCHED_PARENT = CALC_EVENT_AMOUNT_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__DISTRIBUTION_EVENT = CALC_EVENT_AMOUNT_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER__CONCRETE_PARENT = CALC_EVENT_AMOUNT_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Start Event Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER_FEATURE_COUNT = CALC_EVENT_AMOUNT_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___INIT = CALC_EVENT_AMOUNT_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___ENABLE = CALC_EVENT_AMOUNT_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___DISABLE = CALC_EVENT_AMOUNT_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___RESET = CALC_EVENT_AMOUNT_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___TOUCH__EOBJECT = CALC_EVENT_AMOUNT_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___UNTOUCH = CALC_EVENT_AMOUNT_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___REFRESH_THIS__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___REFRESH = CALC_EVENT_AMOUNT_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___REFRESH__REFRESHER = CALC_EVENT_AMOUNT_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___DO_GET_ANTECEDENTS = CALC_EVENT_AMOUNT_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___DO_GET_PARENT = CALC_EVENT_AMOUNT_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___DO_REFRESH = CALC_EVENT_AMOUNT_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___DO_REFRESH__EOBJECT = CALC_EVENT_AMOUNT_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___GET_SCOPE = CALC_EVENT_AMOUNT_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___GET_FACTORY_ID = CALC_EVENT_AMOUNT_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___DO_GET_BINDINGS = CALC_EVENT_AMOUNT_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_AMOUNT_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Start Event Amount After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_AMOUNT_AFTER_OPERATION_COUNT = CALC_EVENT_AMOUNT_AFTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcStartEventMomentImpl <em>Calc Start Event Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcStartEventMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcStartEventMoment()
	 * @generated
	 */
	int CALC_START_EVENT_MOMENT = 39;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__PARENT = CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__ANTECEDENTS = CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__ANTECEDENTS_SIBLING = CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__TOUCHED = CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__TOUCHED_CHILDREN = CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__TOUCHERS = CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__ENABLED = CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__TYPE = CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__OBJECT = CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__INSTANCE = CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__DESCRIPTION = CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__TOUCHED_PARENT = CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__DISTRIBUTION_EVENT = CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT__CONCRETE_PARENT = CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Start Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT_FEATURE_COUNT = CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___INIT = CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___ENABLE = CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___DISABLE = CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___RESET = CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___TOUCH__EOBJECT = CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___UNTOUCH = CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___REFRESH_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___REFRESH = CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___REFRESH__REFRESHER = CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___DO_GET_ANTECEDENTS = CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___DO_GET_PARENT = CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___DO_REFRESH = CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___DO_REFRESH__EOBJECT = CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___GET_SCOPE = CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___GET_FACTORY_ID = CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___DO_GET_BINDINGS = CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Start Event Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_MOMENT_OPERATION_COUNT = CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcStartEventSlopeAfterImpl <em>Calc Start Event Slope After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcStartEventSlopeAfterImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcStartEventSlopeAfter()
	 * @generated
	 */
	int CALC_START_EVENT_SLOPE_AFTER = 40;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__PARENT = CALC_EVENT_SLOPE_AFTER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__ANTECEDENTS = CALC_EVENT_SLOPE_AFTER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__ANTECEDENTS_SIBLING = CALC_EVENT_SLOPE_AFTER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__TOUCHED = CALC_EVENT_SLOPE_AFTER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__TOUCHED_CHILDREN = CALC_EVENT_SLOPE_AFTER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__TOUCHERS = CALC_EVENT_SLOPE_AFTER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__ENABLED = CALC_EVENT_SLOPE_AFTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_SLOPE_AFTER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__TYPE = CALC_EVENT_SLOPE_AFTER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__OBJECT = CALC_EVENT_SLOPE_AFTER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__INSTANCE = CALC_EVENT_SLOPE_AFTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__DESCRIPTION = CALC_EVENT_SLOPE_AFTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__TOUCHED_PARENT = CALC_EVENT_SLOPE_AFTER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__DISTRIBUTION_EVENT = CALC_EVENT_SLOPE_AFTER__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER__CONCRETE_PARENT = CALC_EVENT_SLOPE_AFTER__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Start Event Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER_FEATURE_COUNT = CALC_EVENT_SLOPE_AFTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___INIT = CALC_EVENT_SLOPE_AFTER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___ENABLE = CALC_EVENT_SLOPE_AFTER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___DISABLE = CALC_EVENT_SLOPE_AFTER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___RESET = CALC_EVENT_SLOPE_AFTER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___TOUCH__EOBJECT = CALC_EVENT_SLOPE_AFTER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___UNTOUCH = CALC_EVENT_SLOPE_AFTER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___REFRESH_THIS__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___REFRESH = CALC_EVENT_SLOPE_AFTER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___REFRESH__REFRESHER = CALC_EVENT_SLOPE_AFTER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___DO_GET_ANTECEDENTS = CALC_EVENT_SLOPE_AFTER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___DO_GET_PARENT = CALC_EVENT_SLOPE_AFTER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___DO_REFRESH = CALC_EVENT_SLOPE_AFTER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___DO_REFRESH__EOBJECT = CALC_EVENT_SLOPE_AFTER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___GET_SCOPE = CALC_EVENT_SLOPE_AFTER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___GET_FACTORY_ID = CALC_EVENT_SLOPE_AFTER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___DO_GET_BINDINGS = CALC_EVENT_SLOPE_AFTER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_SLOPE_AFTER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Start Event Slope After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_START_EVENT_SLOPE_AFTER_OPERATION_COUNT = CALC_EVENT_SLOPE_AFTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeEndMomentImpl <em>Calc Stock Change End Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeEndMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcStockChangeEndMoment()
	 * @generated
	 */
	int CALC_STOCK_CHANGE_END_MOMENT = 41;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__PARENT = CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__ANTECEDENTS = CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__ANTECEDENTS_SIBLING = CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__TOUCHED = CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__TOUCHED_CHILDREN = CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__TOUCHERS = CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__ENABLED = CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__TYPE = CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__OBJECT = CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__INSTANCE = CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__DESCRIPTION = CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__TOUCHED_PARENT = CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__DISTRIBUTION_EVENT = CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT__CONCRETE_PARENT = CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Stock Change End Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT_FEATURE_COUNT = CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___INIT = CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___ENABLE = CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___DISABLE = CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___RESET = CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___TOUCH__EOBJECT = CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___UNTOUCH = CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___REFRESH_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___REFRESH = CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___REFRESH__REFRESHER = CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___DO_GET_ANTECEDENTS = CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___DO_GET_PARENT = CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___DO_REFRESH = CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___DO_REFRESH__EOBJECT = CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___GET_SCOPE = CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___GET_FACTORY_ID = CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___DO_GET_BINDINGS = CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Stock Change End Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_MOMENT_OPERATION_COUNT = CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeEndSlopeDeltaImpl <em>Calc Stock Change End Slope Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeEndSlopeDeltaImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcStockChangeEndSlopeDelta()
	 * @generated
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA = 42;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__PARENT = CALC_SLOPE_DELTA_SLOPE_DELTA__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__ANTECEDENTS = CALC_SLOPE_DELTA_SLOPE_DELTA__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__ANTECEDENTS_SIBLING = CALC_SLOPE_DELTA_SLOPE_DELTA__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__TOUCHED = CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__TOUCHED_CHILDREN = CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__TOUCHERS = CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__ENABLED = CALC_SLOPE_DELTA_SLOPE_DELTA__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_SLOPE_DELTA_SLOPE_DELTA__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__TYPE = CALC_SLOPE_DELTA_SLOPE_DELTA__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__OBJECT = CALC_SLOPE_DELTA_SLOPE_DELTA__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__INSTANCE = CALC_SLOPE_DELTA_SLOPE_DELTA__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__DESCRIPTION = CALC_SLOPE_DELTA_SLOPE_DELTA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__TOUCHED_PARENT = CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__DISTRIBUTION_EVENT = CALC_SLOPE_DELTA_SLOPE_DELTA__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA__CONCRETE_PARENT = CALC_SLOPE_DELTA_SLOPE_DELTA__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Stock Change End Slope Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA_FEATURE_COUNT = CALC_SLOPE_DELTA_SLOPE_DELTA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___INIT = CALC_SLOPE_DELTA_SLOPE_DELTA___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___ENABLE = CALC_SLOPE_DELTA_SLOPE_DELTA___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___DISABLE = CALC_SLOPE_DELTA_SLOPE_DELTA___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___RESET = CALC_SLOPE_DELTA_SLOPE_DELTA___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___TOUCH__EOBJECT = CALC_SLOPE_DELTA_SLOPE_DELTA___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___UNTOUCH = CALC_SLOPE_DELTA_SLOPE_DELTA___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___REFRESH_ANTECEDENTS__REFRESHER = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___REFRESH_THIS__REFRESHER = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___REFRESH = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___REFRESH__REFRESHER = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___DO_GET_ANTECEDENTS = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___DO_GET_PARENT = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___DO_REFRESH = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___DO_REFRESH__EOBJECT = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___GET_SCOPE = CALC_SLOPE_DELTA_SLOPE_DELTA___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___GET_FACTORY_ID = CALC_SLOPE_DELTA_SLOPE_DELTA___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___DO_GET_BINDINGS = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Stock Change End Slope Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_END_SLOPE_DELTA_OPERATION_COUNT = CALC_SLOPE_DELTA_SLOPE_DELTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeStartMomentImpl <em>Calc Stock Change Start Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeStartMomentImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcStockChangeStartMoment()
	 * @generated
	 */
	int CALC_STOCK_CHANGE_START_MOMENT = 43;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__PARENT = CALC_EVENT_MOMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__ANTECEDENTS = CALC_EVENT_MOMENT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__ANTECEDENTS_SIBLING = CALC_EVENT_MOMENT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__TOUCHED = CALC_EVENT_MOMENT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__TOUCHED_CHILDREN = CALC_EVENT_MOMENT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__TOUCHERS = CALC_EVENT_MOMENT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__ENABLED = CALC_EVENT_MOMENT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_EVENT_MOMENT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__TYPE = CALC_EVENT_MOMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__OBJECT = CALC_EVENT_MOMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__INSTANCE = CALC_EVENT_MOMENT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__DESCRIPTION = CALC_EVENT_MOMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__TOUCHED_PARENT = CALC_EVENT_MOMENT__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__DISTRIBUTION_EVENT = CALC_EVENT_MOMENT__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT__CONCRETE_PARENT = CALC_EVENT_MOMENT__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Stock Change Start Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT_FEATURE_COUNT = CALC_EVENT_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___INIT = CALC_EVENT_MOMENT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___ENABLE = CALC_EVENT_MOMENT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___DISABLE = CALC_EVENT_MOMENT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___RESET = CALC_EVENT_MOMENT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___TOUCH__EOBJECT = CALC_EVENT_MOMENT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___UNTOUCH = CALC_EVENT_MOMENT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___REFRESH_ANTECEDENTS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___REFRESH_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_EVENT_MOMENT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___REFRESH = CALC_EVENT_MOMENT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___REFRESH__REFRESHER = CALC_EVENT_MOMENT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___DO_GET_ANTECEDENTS = CALC_EVENT_MOMENT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___DO_GET_PARENT = CALC_EVENT_MOMENT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___DO_REFRESH = CALC_EVENT_MOMENT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___DO_REFRESH__EOBJECT = CALC_EVENT_MOMENT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___GET_SCOPE = CALC_EVENT_MOMENT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___GET_FACTORY_ID = CALC_EVENT_MOMENT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___DO_GET_BINDINGS = CALC_EVENT_MOMENT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_EVENT_MOMENT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Stock Change Start Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_MOMENT_OPERATION_COUNT = CALC_EVENT_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeStartSlopeDeltaImpl <em>Calc Stock Change Start Slope Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeStartSlopeDeltaImpl
	 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcStockChangeStartSlopeDelta()
	 * @generated
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA = 44;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__PARENT = CALC_SLOPE_DELTA_SLOPE_DELTA__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__ANTECEDENTS = CALC_SLOPE_DELTA_SLOPE_DELTA__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__ANTECEDENTS_SIBLING = CALC_SLOPE_DELTA_SLOPE_DELTA__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__TOUCHED = CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__TOUCHED_CHILDREN = CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__TOUCHERS = CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__ENABLED = CALC_SLOPE_DELTA_SLOPE_DELTA__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_SLOPE_DELTA_SLOPE_DELTA__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__TYPE = CALC_SLOPE_DELTA_SLOPE_DELTA__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__OBJECT = CALC_SLOPE_DELTA_SLOPE_DELTA__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__INSTANCE = CALC_SLOPE_DELTA_SLOPE_DELTA__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__DESCRIPTION = CALC_SLOPE_DELTA_SLOPE_DELTA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__TOUCHED_PARENT = CALC_SLOPE_DELTA_SLOPE_DELTA__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__DISTRIBUTION_EVENT = CALC_SLOPE_DELTA_SLOPE_DELTA__DISTRIBUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA__CONCRETE_PARENT = CALC_SLOPE_DELTA_SLOPE_DELTA__CONCRETE_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Stock Change Start Slope Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA_FEATURE_COUNT = CALC_SLOPE_DELTA_SLOPE_DELTA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___INIT = CALC_SLOPE_DELTA_SLOPE_DELTA___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___ENABLE = CALC_SLOPE_DELTA_SLOPE_DELTA___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___DISABLE = CALC_SLOPE_DELTA_SLOPE_DELTA___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___RESET = CALC_SLOPE_DELTA_SLOPE_DELTA___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___TOUCH__EOBJECT = CALC_SLOPE_DELTA_SLOPE_DELTA___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___UNTOUCH = CALC_SLOPE_DELTA_SLOPE_DELTA___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___REFRESH_ANTECEDENTS__REFRESHER = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___REFRESH_THIS__REFRESHER = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___REFRESH = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___REFRESH__REFRESHER = CALC_SLOPE_DELTA_SLOPE_DELTA___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___DO_GET_ANTECEDENTS = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___DO_GET_PARENT = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___DO_REFRESH = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___DO_REFRESH__EOBJECT = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___GET_SCOPE = CALC_SLOPE_DELTA_SLOPE_DELTA___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___GET_FACTORY_ID = CALC_SLOPE_DELTA_SLOPE_DELTA___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___DO_GET_BINDINGS = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_SLOPE_DELTA_SLOPE_DELTA___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Stock Change Start Slope Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_STOCK_CHANGE_START_SLOPE_DELTA_OPERATION_COUNT = CALC_SLOPE_DELTA_SLOPE_DELTA_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.ScopeDistribution <em>Scope Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Distribution</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.ScopeDistribution
	 * @generated
	 */
	EClass getScopeDistribution();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionInitialization <em>Calc Distribution Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Distribution Initialization</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionInitialization
	 * @generated
	 */
	EClass getCalcDistributionInitialization();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionInitialization#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionInitialization#getConcreteParent()
	 * @see #getCalcDistributionInitialization()
	 * @generated
	 */
	EReference getCalcDistributionInitialization_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh <em>Layer Composite Event Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Composite Event Refresh</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh
	 * @generated
	 */
	EClass getLayerCompositeEventRefresh();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh#getConcreteParent()
	 * @see #getLayerCompositeEventRefresh()
	 * @generated
	 */
	EReference getLayerCompositeEventRefresh_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh#getAntecedenCalcDistributionInitialization <em>Anteceden Calc Distribution Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Anteceden Calc Distribution Initialization</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh#getAntecedenCalcDistributionInitialization()
	 * @see #getLayerCompositeEventRefresh()
	 * @generated
	 */
	EReference getLayerCompositeEventRefresh_AntecedenCalcDistributionInitialization();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionChildEvents <em>Calc Distribution Child Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Distribution Child Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionChildEvents
	 * @generated
	 */
	EClass getCalcDistributionChildEvents();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionChildEvents#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionChildEvents#getConcreteParent()
	 * @see #getCalcDistributionChildEvents()
	 * @generated
	 */
	EReference getCalcDistributionChildEvents_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents <em>Calc Distribution Provided Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Distribution Provided Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents
	 * @generated
	 */
	EClass getCalcDistributionProvidedEvents();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents#getConcreteParent()
	 * @see #getCalcDistributionProvidedEvents()
	 * @generated
	 */
	EReference getCalcDistributionProvidedEvents_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents#getAntecedentLayerCompositeeventRefresh <em>Antecedent Layer Compositeevent Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Layer Compositeevent Refresh</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents#getAntecedentLayerCompositeeventRefresh()
	 * @see #getCalcDistributionProvidedEvents()
	 * @generated
	 */
	EReference getCalcDistributionProvidedEvents_AntecedentLayerCompositeeventRefresh();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents#getAntecedentCalcDistributionchildEvents <em>Antecedent Calc Distributionchild Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Calc Distributionchild Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents#getAntecedentCalcDistributionchildEvents()
	 * @see #getCalcDistributionProvidedEvents()
	 * @generated
	 */
	EReference getCalcDistributionProvidedEvents_AntecedentCalcDistributionchildEvents();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionSequence <em>Calc Distribution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Distribution Sequence</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionSequence
	 * @generated
	 */
	EClass getCalcDistributionSequence();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionSequence#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionSequence#getConcreteParent()
	 * @see #getCalcDistributionSequence()
	 * @generated
	 */
	EReference getCalcDistributionSequence_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.CalcDistributionSequence#getAntecedentCalcDistributionProvidedEvents <em>Antecedent Calc Distribution Provided Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Calc Distribution Provided Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcDistributionSequence#getAntecedentCalcDistributionProvidedEvents()
	 * @see #getCalcDistributionSequence()
	 * @generated
	 */
	EReference getCalcDistributionSequence_AntecedentCalcDistributionProvidedEvents();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.LayerDistributionSlopes <em>Layer Distribution Slopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Distribution Slopes</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.LayerDistributionSlopes
	 * @generated
	 */
	EClass getLayerDistributionSlopes();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.LayerDistributionSlopes#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.LayerDistributionSlopes#getConcreteParent()
	 * @see #getLayerDistributionSlopes()
	 * @generated
	 */
	EReference getLayerDistributionSlopes_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.LayerDistributionSlopes#getAntecedentCalcDistributionSequence <em>Antecedent Calc Distribution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Calc Distribution Sequence</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.LayerDistributionSlopes#getAntecedentCalcDistributionSequence()
	 * @see #getLayerDistributionSlopes()
	 * @generated
	 */
	EReference getLayerDistributionSlopes_AntecedentCalcDistributionSequence();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.LayerDistributionAmounts <em>Layer Distribution Amounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Distribution Amounts</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.LayerDistributionAmounts
	 * @generated
	 */
	EClass getLayerDistributionAmounts();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.LayerDistributionAmounts#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.LayerDistributionAmounts#getConcreteParent()
	 * @see #getLayerDistributionAmounts()
	 * @generated
	 */
	EReference getLayerDistributionAmounts_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.LayerDistributionAmounts#getAntecedentLayerDistributionSlopes <em>Antecedent Layer Distribution Slopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Layer Distribution Slopes</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.LayerDistributionAmounts#getAntecedentLayerDistributionSlopes()
	 * @see #getLayerDistributionAmounts()
	 * @generated
	 */
	EReference getLayerDistributionAmounts_AntecedentLayerDistributionSlopes();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAmountAbsolute <em>Calc Amount Absolute Amount Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Amount Absolute Amount Absolute</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAmountAbsolute
	 * @generated
	 */
	EClass getCalcAmountAbsoluteAmountAbsolute();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAmountAfter <em>Calc Amount Absolute Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Amount Absolute Amount After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAmountAfter
	 * @generated
	 */
	EClass getCalcAmountAbsoluteAmountAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAtomicAmountAbsolute <em>Calc Amount Absolute Atomic Amount Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Amount Absolute Atomic Amount Absolute</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAtomicAmountAbsolute
	 * @generated
	 */
	EClass getCalcAmountAbsoluteAtomicAmountAbsolute();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAtomicMoment <em>Calc Amount Absolute Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Amount Absolute Atomic Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAtomicMoment
	 * @generated
	 */
	EClass getCalcAmountAbsoluteAtomicMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAmountAfter <em>Calc Amount Delta Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Amount Delta Amount After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAmountAfter
	 * @generated
	 */
	EClass getCalcAmountDeltaAmountAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAmountDelta <em>Calc Amount Delta Amount Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Amount Delta Amount Delta</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAmountDelta
	 * @generated
	 */
	EClass getCalcAmountDeltaAmountDelta();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAtomicAmountDelta <em>Calc Amount Delta Atomic Amount Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Amount Delta Atomic Amount Delta</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAtomicAmountDelta
	 * @generated
	 */
	EClass getCalcAmountDeltaAtomicAmountDelta();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAtomicMoment <em>Calc Amount Delta Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Amount Delta Atomic Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAtomicMoment
	 * @generated
	 */
	EClass getCalcAmountDeltaAtomicMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeEndAmountDelta <em>Calc Capacity Change End Amount Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Capacity Change End Amount Delta</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeEndAmountDelta
	 * @generated
	 */
	EClass getCalcCapacityChangeEndAmountDelta();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeEndMoment <em>Calc Capacity Change End Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Capacity Change End Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeEndMoment
	 * @generated
	 */
	EClass getCalcCapacityChangeEndMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeStartAmountDelta <em>Calc Capacity Change Start Amount Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Capacity Change Start Amount Delta</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeStartAmountDelta
	 * @generated
	 */
	EClass getCalcCapacityChangeStartAmountDelta();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeStartMoment <em>Calc Capacity Change Start Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Capacity Change Start Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeStartMoment
	 * @generated
	 */
	EClass getCalcCapacityChangeStartMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcChildEventAmountAfter <em>Calc Child Event Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Child Event Amount After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcChildEventAmountAfter
	 * @generated
	 */
	EClass getCalcChildEventAmountAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcChildEventMoment <em>Calc Child Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Child Event Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcChildEventMoment
	 * @generated
	 */
	EClass getCalcChildEventMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcChildEventSlopeAfter <em>Calc Child Event Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Child Event Slope After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcChildEventSlopeAfter
	 * @generated
	 */
	EClass getCalcChildEventSlopeAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEndEventMoment <em>Calc End Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc End Event Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEndEventMoment
	 * @generated
	 */
	EClass getCalcEndEventMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventAmountAfter <em>Calc Event Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Event Amount After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventAmountAfter
	 * @generated
	 */
	EClass getCalcEventAmountAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventAmountBefore <em>Calc Event Amount Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Event Amount Before</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventAmountBefore
	 * @generated
	 */
	EClass getCalcEventAmountBefore();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventMoment <em>Calc Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Event Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventMoment
	 * @generated
	 */
	EClass getCalcEventMoment();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventMoment#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventMoment#getConcreteParent()
	 * @see #getCalcEventMoment()
	 * @generated
	 */
	EReference getCalcEventMoment_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventSlopeAfter <em>Calc Event Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Event Slope After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventSlopeAfter
	 * @generated
	 */
	EClass getCalcEventSlopeAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventSlopeBefore <em>Calc Event Slope Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Event Slope Before</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventSlopeBefore
	 * @generated
	 */
	EClass getCalcEventSlopeBefore();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventsProviderRefreshEvents <em>Calc Events Provider Refresh Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Events Provider Refresh Events</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventsProviderRefreshEvents
	 * @generated
	 */
	EClass getCalcEventsProviderRefreshEvents();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventsProviderRefreshEvents#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventsProviderRefreshEvents#getConcreteParent()
	 * @see #getCalcEventsProviderRefreshEvents()
	 * @generated
	 */
	EReference getCalcEventsProviderRefreshEvents_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteAtomicMoment <em>Calc Slope Absolute Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Slope Absolute Atomic Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteAtomicMoment
	 * @generated
	 */
	EClass getCalcSlopeAbsoluteAtomicMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteAtomicSlopeAbsolute <em>Calc Slope Absolute Atomic Slope Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Slope Absolute Atomic Slope Absolute</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteAtomicSlopeAbsolute
	 * @generated
	 */
	EClass getCalcSlopeAbsoluteAtomicSlopeAbsolute();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteSlopeAbsolute <em>Calc Slope Absolute Slope Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Slope Absolute Slope Absolute</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteSlopeAbsolute
	 * @generated
	 */
	EClass getCalcSlopeAbsoluteSlopeAbsolute();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteSlopeAfter <em>Calc Slope Absolute Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Slope Absolute Slope After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeAbsoluteSlopeAfter
	 * @generated
	 */
	EClass getCalcSlopeAbsoluteSlopeAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaAtomicMoment <em>Calc Slope Delta Atomic Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Slope Delta Atomic Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaAtomicMoment
	 * @generated
	 */
	EClass getCalcSlopeDeltaAtomicMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaAtomicSlopeDelta <em>Calc Slope Delta Atomic Slope Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Slope Delta Atomic Slope Delta</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaAtomicSlopeDelta
	 * @generated
	 */
	EClass getCalcSlopeDeltaAtomicSlopeDelta();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaSlopeAfter <em>Calc Slope Delta Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Slope Delta Slope After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaSlopeAfter
	 * @generated
	 */
	EClass getCalcSlopeDeltaSlopeAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaSlopeDelta <em>Calc Slope Delta Slope Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Slope Delta Slope Delta</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaSlopeDelta
	 * @generated
	 */
	EClass getCalcSlopeDeltaSlopeDelta();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcStartEventAmountAfter <em>Calc Start Event Amount After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Start Event Amount After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcStartEventAmountAfter
	 * @generated
	 */
	EClass getCalcStartEventAmountAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcStartEventMoment <em>Calc Start Event Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Start Event Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcStartEventMoment
	 * @generated
	 */
	EClass getCalcStartEventMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcStartEventSlopeAfter <em>Calc Start Event Slope After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Start Event Slope After</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcStartEventSlopeAfter
	 * @generated
	 */
	EClass getCalcStartEventSlopeAfter();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcStockChangeEndMoment <em>Calc Stock Change End Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Stock Change End Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcStockChangeEndMoment
	 * @generated
	 */
	EClass getCalcStockChangeEndMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcStockChangeEndSlopeDelta <em>Calc Stock Change End Slope Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Stock Change End Slope Delta</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcStockChangeEndSlopeDelta
	 * @generated
	 */
	EClass getCalcStockChangeEndSlopeDelta();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcStockChangeStartMoment <em>Calc Stock Change Start Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Stock Change Start Moment</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcStockChangeStartMoment
	 * @generated
	 */
	EClass getCalcStockChangeStartMoment();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcStockChangeStartSlopeDelta <em>Calc Stock Change Start Slope Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Stock Change Start Slope Delta</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcStockChangeStartSlopeDelta
	 * @generated
	 */
	EClass getCalcStockChangeStartSlopeDelta();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventSlope <em>Calc Event Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Event Slope</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventSlope
	 * @generated
	 */
	EClass getCalcEventSlope();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventSlope#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventSlope#getConcreteParent()
	 * @see #getCalcEventSlope()
	 * @generated
	 */
	EReference getCalcEventSlope_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventAmount <em>Calc Event Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Event Amount</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventAmount
	 * @generated
	 */
	EClass getCalcEventAmount();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.time.continuous.calc.CalcEventAmount#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.common.moplaf.time.continuous.calc.CalcEventAmount#getConcreteParent()
	 * @see #getCalcEventAmount()
	 * @generated
	 */
	EReference getCalcEventAmount_ConcreteParent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimeContinuousCalcFactory getTimeContinuousCalcFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.ScopeDistributionImpl <em>Scope Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.ScopeDistributionImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getScopeDistribution()
		 * @generated
		 */
		EClass SCOPE_DISTRIBUTION = eINSTANCE.getScopeDistribution();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionInitializationImpl <em>Calc Distribution Initialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionInitializationImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcDistributionInitialization()
		 * @generated
		 */
		EClass CALC_DISTRIBUTION_INITIALIZATION = eINSTANCE.getCalcDistributionInitialization();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_DISTRIBUTION_INITIALIZATION__CONCRETE_PARENT = eINSTANCE.getCalcDistributionInitialization_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.LayerCompositeEventRefreshImpl <em>Layer Composite Event Refresh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.LayerCompositeEventRefreshImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getLayerCompositeEventRefresh()
		 * @generated
		 */
		EClass LAYER_COMPOSITE_EVENT_REFRESH = eINSTANCE.getLayerCompositeEventRefresh();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT = eINSTANCE.getLayerCompositeEventRefresh_ConcreteParent();

		/**
		 * The meta object literal for the '<em><b>Anteceden Calc Distribution Initialization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION = eINSTANCE.getLayerCompositeEventRefresh_AntecedenCalcDistributionInitialization();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionChildEventsImpl <em>Calc Distribution Child Events</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionChildEventsImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcDistributionChildEvents()
		 * @generated
		 */
		EClass CALC_DISTRIBUTION_CHILD_EVENTS = eINSTANCE.getCalcDistributionChildEvents();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_DISTRIBUTION_CHILD_EVENTS__CONCRETE_PARENT = eINSTANCE.getCalcDistributionChildEvents_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionProvidedEventsImpl <em>Calc Distribution Provided Events</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionProvidedEventsImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcDistributionProvidedEvents()
		 * @generated
		 */
		EClass CALC_DISTRIBUTION_PROVIDED_EVENTS = eINSTANCE.getCalcDistributionProvidedEvents();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_DISTRIBUTION_PROVIDED_EVENTS__CONCRETE_PARENT = eINSTANCE.getCalcDistributionProvidedEvents_ConcreteParent();

		/**
		 * The meta object literal for the '<em><b>Antecedent Layer Compositeevent Refresh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_LAYER_COMPOSITEEVENT_REFRESH = eINSTANCE.getCalcDistributionProvidedEvents_AntecedentLayerCompositeeventRefresh();

		/**
		 * The meta object literal for the '<em><b>Antecedent Calc Distributionchild Events</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_CALC_DISTRIBUTIONCHILD_EVENTS = eINSTANCE.getCalcDistributionProvidedEvents_AntecedentCalcDistributionchildEvents();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionSequenceImpl <em>Calc Distribution Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionSequenceImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcDistributionSequence()
		 * @generated
		 */
		EClass CALC_DISTRIBUTION_SEQUENCE = eINSTANCE.getCalcDistributionSequence();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_DISTRIBUTION_SEQUENCE__CONCRETE_PARENT = eINSTANCE.getCalcDistributionSequence_ConcreteParent();

		/**
		 * The meta object literal for the '<em><b>Antecedent Calc Distribution Provided Events</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_DISTRIBUTION_SEQUENCE__ANTECEDENT_CALC_DISTRIBUTION_PROVIDED_EVENTS = eINSTANCE.getCalcDistributionSequence_AntecedentCalcDistributionProvidedEvents();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.LayerDistributionSlopesImpl <em>Layer Distribution Slopes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.LayerDistributionSlopesImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getLayerDistributionSlopes()
		 * @generated
		 */
		EClass LAYER_DISTRIBUTION_SLOPES = eINSTANCE.getLayerDistributionSlopes();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_DISTRIBUTION_SLOPES__CONCRETE_PARENT = eINSTANCE.getLayerDistributionSlopes_ConcreteParent();

		/**
		 * The meta object literal for the '<em><b>Antecedent Calc Distribution Sequence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_DISTRIBUTION_SLOPES__ANTECEDENT_CALC_DISTRIBUTION_SEQUENCE = eINSTANCE.getLayerDistributionSlopes_AntecedentCalcDistributionSequence();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.LayerDistributionAmountsImpl <em>Layer Distribution Amounts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.LayerDistributionAmountsImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getLayerDistributionAmounts()
		 * @generated
		 */
		EClass LAYER_DISTRIBUTION_AMOUNTS = eINSTANCE.getLayerDistributionAmounts();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_DISTRIBUTION_AMOUNTS__CONCRETE_PARENT = eINSTANCE.getLayerDistributionAmounts_ConcreteParent();

		/**
		 * The meta object literal for the '<em><b>Antecedent Layer Distribution Slopes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENT_LAYER_DISTRIBUTION_SLOPES = eINSTANCE.getLayerDistributionAmounts_AntecedentLayerDistributionSlopes();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAmountAbsoluteImpl <em>Calc Amount Absolute Amount Absolute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAmountAbsoluteImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountAbsoluteAmountAbsolute()
		 * @generated
		 */
		EClass CALC_AMOUNT_ABSOLUTE_AMOUNT_ABSOLUTE = eINSTANCE.getCalcAmountAbsoluteAmountAbsolute();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAmountAfterImpl <em>Calc Amount Absolute Amount After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAmountAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountAbsoluteAmountAfter()
		 * @generated
		 */
		EClass CALC_AMOUNT_ABSOLUTE_AMOUNT_AFTER = eINSTANCE.getCalcAmountAbsoluteAmountAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAtomicAmountAbsoluteImpl <em>Calc Amount Absolute Atomic Amount Absolute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAtomicAmountAbsoluteImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountAbsoluteAtomicAmountAbsolute()
		 * @generated
		 */
		EClass CALC_AMOUNT_ABSOLUTE_ATOMIC_AMOUNT_ABSOLUTE = eINSTANCE.getCalcAmountAbsoluteAtomicAmountAbsolute();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAtomicMomentImpl <em>Calc Amount Absolute Atomic Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountAbsoluteAtomicMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountAbsoluteAtomicMoment()
		 * @generated
		 */
		EClass CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT = eINSTANCE.getCalcAmountAbsoluteAtomicMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAmountAfterImpl <em>Calc Amount Delta Amount After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAmountAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountDeltaAmountAfter()
		 * @generated
		 */
		EClass CALC_AMOUNT_DELTA_AMOUNT_AFTER = eINSTANCE.getCalcAmountDeltaAmountAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAmountDeltaImpl <em>Calc Amount Delta Amount Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAmountDeltaImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountDeltaAmountDelta()
		 * @generated
		 */
		EClass CALC_AMOUNT_DELTA_AMOUNT_DELTA = eINSTANCE.getCalcAmountDeltaAmountDelta();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAtomicAmountDeltaImpl <em>Calc Amount Delta Atomic Amount Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAtomicAmountDeltaImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountDeltaAtomicAmountDelta()
		 * @generated
		 */
		EClass CALC_AMOUNT_DELTA_ATOMIC_AMOUNT_DELTA = eINSTANCE.getCalcAmountDeltaAtomicAmountDelta();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAtomicMomentImpl <em>Calc Amount Delta Atomic Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcAmountDeltaAtomicMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcAmountDeltaAtomicMoment()
		 * @generated
		 */
		EClass CALC_AMOUNT_DELTA_ATOMIC_MOMENT = eINSTANCE.getCalcAmountDeltaAtomicMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeEndAmountDeltaImpl <em>Calc Capacity Change End Amount Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeEndAmountDeltaImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcCapacityChangeEndAmountDelta()
		 * @generated
		 */
		EClass CALC_CAPACITY_CHANGE_END_AMOUNT_DELTA = eINSTANCE.getCalcCapacityChangeEndAmountDelta();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeEndMomentImpl <em>Calc Capacity Change End Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeEndMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcCapacityChangeEndMoment()
		 * @generated
		 */
		EClass CALC_CAPACITY_CHANGE_END_MOMENT = eINSTANCE.getCalcCapacityChangeEndMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeStartAmountDeltaImpl <em>Calc Capacity Change Start Amount Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeStartAmountDeltaImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcCapacityChangeStartAmountDelta()
		 * @generated
		 */
		EClass CALC_CAPACITY_CHANGE_START_AMOUNT_DELTA = eINSTANCE.getCalcCapacityChangeStartAmountDelta();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeStartMomentImpl <em>Calc Capacity Change Start Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcCapacityChangeStartMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcCapacityChangeStartMoment()
		 * @generated
		 */
		EClass CALC_CAPACITY_CHANGE_START_MOMENT = eINSTANCE.getCalcCapacityChangeStartMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcChildEventAmountAfterImpl <em>Calc Child Event Amount After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcChildEventAmountAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcChildEventAmountAfter()
		 * @generated
		 */
		EClass CALC_CHILD_EVENT_AMOUNT_AFTER = eINSTANCE.getCalcChildEventAmountAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcChildEventMomentImpl <em>Calc Child Event Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcChildEventMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcChildEventMoment()
		 * @generated
		 */
		EClass CALC_CHILD_EVENT_MOMENT = eINSTANCE.getCalcChildEventMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcChildEventSlopeAfterImpl <em>Calc Child Event Slope After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcChildEventSlopeAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcChildEventSlopeAfter()
		 * @generated
		 */
		EClass CALC_CHILD_EVENT_SLOPE_AFTER = eINSTANCE.getCalcChildEventSlopeAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEndEventMomentImpl <em>Calc End Event Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEndEventMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEndEventMoment()
		 * @generated
		 */
		EClass CALC_END_EVENT_MOMENT = eINSTANCE.getCalcEndEventMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventAmountAfterImpl <em>Calc Event Amount After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventAmountAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventAmountAfter()
		 * @generated
		 */
		EClass CALC_EVENT_AMOUNT_AFTER = eINSTANCE.getCalcEventAmountAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventAmountBeforeImpl <em>Calc Event Amount Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventAmountBeforeImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventAmountBefore()
		 * @generated
		 */
		EClass CALC_EVENT_AMOUNT_BEFORE = eINSTANCE.getCalcEventAmountBefore();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventMomentImpl <em>Calc Event Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventMoment()
		 * @generated
		 */
		EClass CALC_EVENT_MOMENT = eINSTANCE.getCalcEventMoment();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_EVENT_MOMENT__CONCRETE_PARENT = eINSTANCE.getCalcEventMoment_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventSlopeAfterImpl <em>Calc Event Slope After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventSlopeAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventSlopeAfter()
		 * @generated
		 */
		EClass CALC_EVENT_SLOPE_AFTER = eINSTANCE.getCalcEventSlopeAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventSlopeBeforeImpl <em>Calc Event Slope Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventSlopeBeforeImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventSlopeBefore()
		 * @generated
		 */
		EClass CALC_EVENT_SLOPE_BEFORE = eINSTANCE.getCalcEventSlopeBefore();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventsProviderRefreshEventsImpl <em>Calc Events Provider Refresh Events</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventsProviderRefreshEventsImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventsProviderRefreshEvents()
		 * @generated
		 */
		EClass CALC_EVENTS_PROVIDER_REFRESH_EVENTS = eINSTANCE.getCalcEventsProviderRefreshEvents();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_EVENTS_PROVIDER_REFRESH_EVENTS__CONCRETE_PARENT = eINSTANCE.getCalcEventsProviderRefreshEvents_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteAtomicMomentImpl <em>Calc Slope Absolute Atomic Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteAtomicMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeAbsoluteAtomicMoment()
		 * @generated
		 */
		EClass CALC_SLOPE_ABSOLUTE_ATOMIC_MOMENT = eINSTANCE.getCalcSlopeAbsoluteAtomicMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteAtomicSlopeAbsoluteImpl <em>Calc Slope Absolute Atomic Slope Absolute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteAtomicSlopeAbsoluteImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeAbsoluteAtomicSlopeAbsolute()
		 * @generated
		 */
		EClass CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE = eINSTANCE.getCalcSlopeAbsoluteAtomicSlopeAbsolute();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteSlopeAbsoluteImpl <em>Calc Slope Absolute Slope Absolute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteSlopeAbsoluteImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeAbsoluteSlopeAbsolute()
		 * @generated
		 */
		EClass CALC_SLOPE_ABSOLUTE_SLOPE_ABSOLUTE = eINSTANCE.getCalcSlopeAbsoluteSlopeAbsolute();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteSlopeAfterImpl <em>Calc Slope Absolute Slope After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeAbsoluteSlopeAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeAbsoluteSlopeAfter()
		 * @generated
		 */
		EClass CALC_SLOPE_ABSOLUTE_SLOPE_AFTER = eINSTANCE.getCalcSlopeAbsoluteSlopeAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaAtomicMomentImpl <em>Calc Slope Delta Atomic Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaAtomicMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeDeltaAtomicMoment()
		 * @generated
		 */
		EClass CALC_SLOPE_DELTA_ATOMIC_MOMENT = eINSTANCE.getCalcSlopeDeltaAtomicMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaAtomicSlopeDeltaImpl <em>Calc Slope Delta Atomic Slope Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaAtomicSlopeDeltaImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeDeltaAtomicSlopeDelta()
		 * @generated
		 */
		EClass CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA = eINSTANCE.getCalcSlopeDeltaAtomicSlopeDelta();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaSlopeAfterImpl <em>Calc Slope Delta Slope After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaSlopeAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeDeltaSlopeAfter()
		 * @generated
		 */
		EClass CALC_SLOPE_DELTA_SLOPE_AFTER = eINSTANCE.getCalcSlopeDeltaSlopeAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaSlopeDeltaImpl <em>Calc Slope Delta Slope Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcSlopeDeltaSlopeDeltaImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcSlopeDeltaSlopeDelta()
		 * @generated
		 */
		EClass CALC_SLOPE_DELTA_SLOPE_DELTA = eINSTANCE.getCalcSlopeDeltaSlopeDelta();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcStartEventAmountAfterImpl <em>Calc Start Event Amount After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcStartEventAmountAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcStartEventAmountAfter()
		 * @generated
		 */
		EClass CALC_START_EVENT_AMOUNT_AFTER = eINSTANCE.getCalcStartEventAmountAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcStartEventMomentImpl <em>Calc Start Event Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcStartEventMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcStartEventMoment()
		 * @generated
		 */
		EClass CALC_START_EVENT_MOMENT = eINSTANCE.getCalcStartEventMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcStartEventSlopeAfterImpl <em>Calc Start Event Slope After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcStartEventSlopeAfterImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcStartEventSlopeAfter()
		 * @generated
		 */
		EClass CALC_START_EVENT_SLOPE_AFTER = eINSTANCE.getCalcStartEventSlopeAfter();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeEndMomentImpl <em>Calc Stock Change End Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeEndMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcStockChangeEndMoment()
		 * @generated
		 */
		EClass CALC_STOCK_CHANGE_END_MOMENT = eINSTANCE.getCalcStockChangeEndMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeEndSlopeDeltaImpl <em>Calc Stock Change End Slope Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeEndSlopeDeltaImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcStockChangeEndSlopeDelta()
		 * @generated
		 */
		EClass CALC_STOCK_CHANGE_END_SLOPE_DELTA = eINSTANCE.getCalcStockChangeEndSlopeDelta();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeStartMomentImpl <em>Calc Stock Change Start Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeStartMomentImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcStockChangeStartMoment()
		 * @generated
		 */
		EClass CALC_STOCK_CHANGE_START_MOMENT = eINSTANCE.getCalcStockChangeStartMoment();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeStartSlopeDeltaImpl <em>Calc Stock Change Start Slope Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcStockChangeStartSlopeDeltaImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcStockChangeStartSlopeDelta()
		 * @generated
		 */
		EClass CALC_STOCK_CHANGE_START_SLOPE_DELTA = eINSTANCE.getCalcStockChangeStartSlopeDelta();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventSlopeImpl <em>Calc Event Slope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventSlopeImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventSlope()
		 * @generated
		 */
		EClass CALC_EVENT_SLOPE = eINSTANCE.getCalcEventSlope();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_EVENT_SLOPE__CONCRETE_PARENT = eINSTANCE.getCalcEventSlope_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventAmountImpl <em>Calc Event Amount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.CalcEventAmountImpl
		 * @see com.misc.common.moplaf.time.continuous.calc.impl.TimeContinuousCalcPackageImpl#getCalcEventAmount()
		 * @generated
		 */
		EClass CALC_EVENT_AMOUNT = eINSTANCE.getCalcEventAmount();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_EVENT_AMOUNT__CONCRETE_PARENT = eINSTANCE.getCalcEventAmount_ConcreteParent();

	}

} //TimeContinuousCalcPackage
