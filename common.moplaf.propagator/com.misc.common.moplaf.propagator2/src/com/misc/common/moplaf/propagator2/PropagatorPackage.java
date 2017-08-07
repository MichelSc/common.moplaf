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
package com.misc.common.moplaf.propagator2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see com.misc.common.moplaf.propagator2.PropagatorFactory
 * @model kind="package"
 * @generated
 */
public interface PropagatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "propagator2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/propagator2/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropagatorPackage eINSTANCE = com.misc.common.moplaf.propagator2.impl.PropagatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl <em>Object With Propagator Functions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorPackageImpl#getObjectWithPropagatorFunctions()
	 * @generated
	 */
	int OBJECT_WITH_PROPAGATOR_FUNCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Object With Propagator Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = 0;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__ECLASS = 1;

	/**
	 * The number of operations of the '<em>Object With Propagator Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorPackageImpl#getPropagatorFunction()
	 * @generated
	 */
	int PROPAGATOR_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION__ANTECEDENTS = 1;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING = 2;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION__TOUCHED = 3;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION__TOUCHED_CHILDREN = 4;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION__TOUCHERS = 5;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION__ENABLED = 6;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION__OBJECT = 9;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION__INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION__DESCRIPTION = 11;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___INIT = 0;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___ENABLE = 1;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___DISABLE = 2;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___RESET = 3;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___TOUCH__EOBJECT = 4;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___UNTOUCH = 5;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS = 6;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___REFRESH_THIS = 7;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS = 8;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___REFRESH = 9;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS = 10;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___DO_GET_PARENT = 11;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___DO_REFRESH = 12;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT = 13;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___GET_SCOPE = 14;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION___GET_FACTORY_ID = 15;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_OPERATION_COUNT = 16;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl <em>Function Bindings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorPackageImpl#getPropagatorFunctionBindings()
	 * @generated
	 */
	int PROPAGATOR_FUNCTION_BINDINGS = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS__PARENT = PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS = PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING = PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS__TOUCHED = PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN = PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS = PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS__ENABLED = PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS__TYPE = PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS__OBJECT = PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS__INSTANCE = PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION = PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Function Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT = PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___INIT = PROPAGATOR_FUNCTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___ENABLE = PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___DISABLE = PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___RESET = PROPAGATOR_FUNCTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT = PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH = PROPAGATOR_FUNCTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS = PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS = PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS = PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___REFRESH = PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS = PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT = PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH = PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT = PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE = PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___GET_FACTORY_ID = PROPAGATOR_FUNCTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS = PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PROPAGATOR_FUNCTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT = PROPAGATOR_FUNCTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '<em>Bindings</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.propagator2.util.Bindings
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorPackageImpl#getBindings()
	 * @generated
	 */
	int BINDINGS = 3;

	/**
	 * The meta object id for the '<em>Notification</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.notify.Notification
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 4;

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions <em>Object With Propagator Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object With Propagator Functions</em>'.
	 * @see com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions
	 * @generated
	 */
	EClass getObjectWithPropagatorFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions#getPropagatorFunctions <em>Propagator Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propagator Functions</em>'.
	 * @see com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions#getPropagatorFunctions()
	 * @see #getObjectWithPropagatorFunctions()
	 * @generated
	 */
	EReference getObjectWithPropagatorFunctions_PropagatorFunctions();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions#addPropagatorFunction(com.misc.common.moplaf.propagator2.PropagatorFunction) <em>Add Propagator Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Propagator Function</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions#addPropagatorFunction(com.misc.common.moplaf.propagator2.PropagatorFunction)
	 * @generated
	 */
	EOperation getObjectWithPropagatorFunctions__AddPropagatorFunction__PropagatorFunction();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions#getPropagatorFunction(org.eclipse.emf.ecore.EClass) <em>Get Propagator Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Propagator Function</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions#getPropagatorFunction(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getObjectWithPropagatorFunctions__GetPropagatorFunction__EClass();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.propagator2.PropagatorFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction
	 * @generated
	 */
	EClass getPropagatorFunction();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#getParent()
	 * @see #getPropagatorFunction()
	 * @generated
	 */
	EReference getPropagatorFunction_Parent();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getAntecedents <em>Antecedents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Antecedents</em>'.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#getAntecedents()
	 * @see #getPropagatorFunction()
	 * @generated
	 */
	EReference getPropagatorFunction_Antecedents();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#isTouched <em>Touched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Touched</em>'.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#isTouched()
	 * @see #getPropagatorFunction()
	 * @generated
	 */
	EAttribute getPropagatorFunction_Touched();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getTouchedChildren <em>Touched Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touched Children</em>'.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#getTouchedChildren()
	 * @see #getPropagatorFunction()
	 * @generated
	 */
	EReference getPropagatorFunction_TouchedChildren();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getTouchers <em>Touchers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Touchers</em>'.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#getTouchers()
	 * @see #getPropagatorFunction()
	 * @generated
	 */
	EReference getPropagatorFunction_Touchers();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#isEnabled()
	 * @see #getPropagatorFunction()
	 * @generated
	 */
	EAttribute getPropagatorFunction_Enabled();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getObjectWithPropagatorFunctions <em>Object With Propagator Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Object With Propagator Functions</em>'.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#getObjectWithPropagatorFunctions()
	 * @see #getPropagatorFunction()
	 * @generated
	 */
	EReference getPropagatorFunction_ObjectWithPropagatorFunctions();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#getType()
	 * @see #getPropagatorFunction()
	 * @generated
	 */
	EAttribute getPropagatorFunction_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#getObject()
	 * @see #getPropagatorFunction()
	 * @generated
	 */
	EAttribute getPropagatorFunction_Object();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#getInstance()
	 * @see #getPropagatorFunction()
	 * @generated
	 */
	EAttribute getPropagatorFunction_Instance();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#getDescription()
	 * @see #getPropagatorFunction()
	 * @generated
	 */
	EAttribute getPropagatorFunction_Description();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#init()
	 * @generated
	 */
	EOperation getPropagatorFunction__Init();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getAntecedentsSibling <em>Antecedents Sibling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Antecedents Sibling</em>'.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#getAntecedentsSibling()
	 * @see #getPropagatorFunction()
	 * @generated
	 */
	EReference getPropagatorFunction_AntecedentsSibling();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#touch(org.eclipse.emf.ecore.EObject) <em>Touch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Touch</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#touch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPropagatorFunction__Touch__EObject();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#untouch() <em>Untouch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Untouch</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#untouch()
	 * @generated
	 */
	EOperation getPropagatorFunction__Untouch();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#refreshAntecedents() <em>Refresh Antecedents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Antecedents</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#refreshAntecedents()
	 * @generated
	 */
	EOperation getPropagatorFunction__RefreshAntecedents();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#refreshThis() <em>Refresh This</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh This</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#refreshThis()
	 * @generated
	 */
	EOperation getPropagatorFunction__RefreshThis();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#refreshChildrenAndThis() <em>Refresh Children And This</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Children And This</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#refreshChildrenAndThis()
	 * @generated
	 */
	EOperation getPropagatorFunction__RefreshChildrenAndThis();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#refresh()
	 * @generated
	 */
	EOperation getPropagatorFunction__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#doGetParent() <em>Do Get Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Get Parent</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#doGetParent()
	 * @generated
	 */
	EOperation getPropagatorFunction__DoGetParent();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#doRefresh() <em>Do Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Refresh</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#doRefresh()
	 * @generated
	 */
	EOperation getPropagatorFunction__DoRefresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#doRefresh(org.eclipse.emf.ecore.EObject) <em>Do Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Refresh</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#doRefresh(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPropagatorFunction__DoRefresh__EObject();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getScope() <em>Get Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Scope</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#getScope()
	 * @generated
	 */
	EOperation getPropagatorFunction__GetScope();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getFactoryID() <em>Get Factory ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Factory ID</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#getFactoryID()
	 * @generated
	 */
	EOperation getPropagatorFunction__GetFactoryID();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#doGetAntecedents() <em>Do Get Antecedents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Get Antecedents</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#doGetAntecedents()
	 * @generated
	 */
	EOperation getPropagatorFunction__DoGetAntecedents();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.propagator2.PropagatorFunctionBindings <em>Function Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Bindings</em>'.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunctionBindings
	 * @generated
	 */
	EClass getPropagatorFunctionBindings();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunctionBindings#doGetBindings() <em>Do Get Bindings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Get Bindings</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunctionBindings#doGetBindings()
	 * @generated
	 */
	EOperation getPropagatorFunctionBindings__DoGetBindings();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunctionBindings#doCollectExplicitAntecedents(org.eclipse.emf.common.util.EList) <em>Do Collect Explicit Antecedents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunctionBindings#doCollectExplicitAntecedents(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getPropagatorFunctionBindings__DoCollectExplicitAntecedents__EList();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#enable() <em>Enable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enable</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#enable()
	 * @generated
	 */
	EOperation getPropagatorFunction__Enable();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#disable() <em>Disable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disable</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#disable()
	 * @generated
	 */
	EOperation getPropagatorFunction__Disable();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#reset()
	 * @generated
	 */
	EOperation getPropagatorFunction__Reset();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.propagator2.util.Bindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bindings</em>'.
	 * @see com.misc.common.moplaf.propagator2.util.Bindings
	 * @model instanceClass="com.misc.common.moplaf.propagator2.util.Bindings"
	 * @generated
	 */
	EDataType getBindings();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.notify.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Notification</em>'.
	 * @see org.eclipse.emf.common.notify.Notification
	 * @model instanceClass="org.eclipse.emf.common.notify.Notification"
	 * @generated
	 */
	EDataType getNotification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PropagatorFactory getPropagatorFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl <em>Object With Propagator Functions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl
		 * @see com.misc.common.moplaf.propagator2.impl.PropagatorPackageImpl#getObjectWithPropagatorFunctions()
		 * @generated
		 */
		EClass OBJECT_WITH_PROPAGATOR_FUNCTIONS = eINSTANCE.getObjectWithPropagatorFunctions();

		/**
		 * The meta object literal for the '<em><b>Propagator Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS = eINSTANCE.getObjectWithPropagatorFunctions_PropagatorFunctions();

		/**
		 * The meta object literal for the '<em><b>Add Propagator Function</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = eINSTANCE.getObjectWithPropagatorFunctions__AddPropagatorFunction__PropagatorFunction();

		/**
		 * The meta object literal for the '<em><b>Get Propagator Function</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__ECLASS = eINSTANCE.getObjectWithPropagatorFunctions__GetPropagatorFunction__EClass();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl
		 * @see com.misc.common.moplaf.propagator2.impl.PropagatorPackageImpl#getPropagatorFunction()
		 * @generated
		 */
		EClass PROPAGATOR_FUNCTION = eINSTANCE.getPropagatorFunction();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_FUNCTION__PARENT = eINSTANCE.getPropagatorFunction_Parent();

		/**
		 * The meta object literal for the '<em><b>Antecedents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_FUNCTION__ANTECEDENTS = eINSTANCE.getPropagatorFunction_Antecedents();

		/**
		 * The meta object literal for the '<em><b>Touched</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPAGATOR_FUNCTION__TOUCHED = eINSTANCE.getPropagatorFunction_Touched();

		/**
		 * The meta object literal for the '<em><b>Touched Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_FUNCTION__TOUCHED_CHILDREN = eINSTANCE.getPropagatorFunction_TouchedChildren();

		/**
		 * The meta object literal for the '<em><b>Touchers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_FUNCTION__TOUCHERS = eINSTANCE.getPropagatorFunction_Touchers();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPAGATOR_FUNCTION__ENABLED = eINSTANCE.getPropagatorFunction_Enabled();

		/**
		 * The meta object literal for the '<em><b>Object With Propagator Functions</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = eINSTANCE.getPropagatorFunction_ObjectWithPropagatorFunctions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPAGATOR_FUNCTION__TYPE = eINSTANCE.getPropagatorFunction_Type();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPAGATOR_FUNCTION__OBJECT = eINSTANCE.getPropagatorFunction_Object();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPAGATOR_FUNCTION__INSTANCE = eINSTANCE.getPropagatorFunction_Instance();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPAGATOR_FUNCTION__DESCRIPTION = eINSTANCE.getPropagatorFunction_Description();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___INIT = eINSTANCE.getPropagatorFunction__Init();

		/**
		 * The meta object literal for the '<em><b>Antecedents Sibling</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING = eINSTANCE.getPropagatorFunction_AntecedentsSibling();

		/**
		 * The meta object literal for the '<em><b>Touch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___TOUCH__EOBJECT = eINSTANCE.getPropagatorFunction__Touch__EObject();

		/**
		 * The meta object literal for the '<em><b>Untouch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___UNTOUCH = eINSTANCE.getPropagatorFunction__Untouch();

		/**
		 * The meta object literal for the '<em><b>Refresh Antecedents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS = eINSTANCE.getPropagatorFunction__RefreshAntecedents();

		/**
		 * The meta object literal for the '<em><b>Refresh This</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___REFRESH_THIS = eINSTANCE.getPropagatorFunction__RefreshThis();

		/**
		 * The meta object literal for the '<em><b>Refresh Children And This</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS = eINSTANCE.getPropagatorFunction__RefreshChildrenAndThis();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___REFRESH = eINSTANCE.getPropagatorFunction__Refresh();

		/**
		 * The meta object literal for the '<em><b>Do Get Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___DO_GET_PARENT = eINSTANCE.getPropagatorFunction__DoGetParent();

		/**
		 * The meta object literal for the '<em><b>Do Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___DO_REFRESH = eINSTANCE.getPropagatorFunction__DoRefresh();

		/**
		 * The meta object literal for the '<em><b>Do Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT = eINSTANCE.getPropagatorFunction__DoRefresh__EObject();

		/**
		 * The meta object literal for the '<em><b>Get Scope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___GET_SCOPE = eINSTANCE.getPropagatorFunction__GetScope();

		/**
		 * The meta object literal for the '<em><b>Get Factory ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___GET_FACTORY_ID = eINSTANCE.getPropagatorFunction__GetFactoryID();

		/**
		 * The meta object literal for the '<em><b>Do Get Antecedents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___DO_GET_ANTECEDENTS = eINSTANCE.getPropagatorFunction__DoGetAntecedents();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl <em>Function Bindings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl
		 * @see com.misc.common.moplaf.propagator2.impl.PropagatorPackageImpl#getPropagatorFunctionBindings()
		 * @generated
		 */
		EClass PROPAGATOR_FUNCTION_BINDINGS = eINSTANCE.getPropagatorFunctionBindings();

		/**
		 * The meta object literal for the '<em><b>Do Get Bindings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS = eINSTANCE.getPropagatorFunctionBindings__DoGetBindings();

		/**
		 * The meta object literal for the '<em><b>Do Collect Explicit Antecedents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = eINSTANCE.getPropagatorFunctionBindings__DoCollectExplicitAntecedents__EList();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___ENABLE = eINSTANCE.getPropagatorFunction__Enable();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___DISABLE = eINSTANCE.getPropagatorFunction__Disable();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPAGATOR_FUNCTION___RESET = eINSTANCE.getPropagatorFunction__Reset();

		/**
		 * The meta object literal for the '<em>Bindings</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.propagator2.util.Bindings
		 * @see com.misc.common.moplaf.propagator2.impl.PropagatorPackageImpl#getBindings()
		 * @generated
		 */
		EDataType BINDINGS = eINSTANCE.getBindings();

		/**
		 * The meta object literal for the '<em>Notification</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.notify.Notification
		 * @see com.misc.common.moplaf.propagator2.impl.PropagatorPackageImpl#getNotification()
		 * @generated
		 */
		EDataType NOTIFICATION = eINSTANCE.getNotification();

	}

} //PropagatorPackage
