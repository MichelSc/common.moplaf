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

import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorFeatureMode;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.SolverPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Feature Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorFeatureModeImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorFeatureModeImpl#getObjetScope <em>Objet Scope</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorFeatureModeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorFeatureModeImpl#getERemarks <em>ERemarks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorFeatureModeImpl extends MinimalEObjectImpl.Container implements GeneratorFeatureMode {
	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected Generator generator;

	/**
	 * The cached value of the '{@link #getObjetScope() <em>Objet Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetScope()
	 * @generated
	 * @ordered
	 */
	protected GeneratorTuple objetScope;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getERemarks() <em>ERemarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String EREMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getERemarks() <em>ERemarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERemarks()
	 * @generated
	 * @ordered
	 */
	protected String eRemarks = EREMARKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorFeatureModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_FEATURE_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator getGenerator() {
		if (generator != null && generator.eIsProxy()) {
			InternalEObject oldGenerator = (InternalEObject)generator;
			generator = (Generator)eResolveProxy(oldGenerator);
			if (generator != oldGenerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.GENERATOR_FEATURE_MODE__GENERATOR, oldGenerator, generator));
			}
		}
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator basicGetGenerator() {
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerator(Generator newGenerator, NotificationChain msgs) {
		Generator oldGenerator = generator;
		generator = newGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_FEATURE_MODE__GENERATOR, oldGenerator, newGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(Generator newGenerator) {
		if (newGenerator != generator) {
			NotificationChain msgs = null;
			if (generator != null)
				msgs = ((InternalEObject)generator).eInverseRemove(this, SolverPackage.GENERATOR__GENERATOR_FEATURE_MODES, Generator.class, msgs);
			if (newGenerator != null)
				msgs = ((InternalEObject)newGenerator).eInverseAdd(this, SolverPackage.GENERATOR__GENERATOR_FEATURE_MODES, Generator.class, msgs);
			msgs = basicSetGenerator(newGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_FEATURE_MODE__GENERATOR, newGenerator, newGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorTuple getObjetScope() {
		if (objetScope != null && objetScope.eIsProxy()) {
			InternalEObject oldObjetScope = (InternalEObject)objetScope;
			objetScope = (GeneratorTuple)eResolveProxy(oldObjetScope);
			if (objetScope != oldObjetScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.GENERATOR_FEATURE_MODE__OBJET_SCOPE, oldObjetScope, objetScope));
			}
		}
		return objetScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorTuple basicGetObjetScope() {
		return objetScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjetScope(GeneratorTuple newObjetScope) {
		GeneratorTuple oldObjetScope = objetScope;
		objetScope = newObjetScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_FEATURE_MODE__OBJET_SCOPE, oldObjetScope, objetScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_FEATURE_MODE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getERemarks() {
		return eRemarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERemarks(String newERemarks) {
		String oldERemarks = eRemarks;
		eRemarks = newERemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_FEATURE_MODE__EREMARKS, oldERemarks, eRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int IsObjectInScope(GeneratorTuple object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.GENERATOR_FEATURE_MODE__GENERATOR:
				if (generator != null)
					msgs = ((InternalEObject)generator).eInverseRemove(this, SolverPackage.GENERATOR__GENERATOR_FEATURE_MODES, Generator.class, msgs);
				return basicSetGenerator((Generator)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.GENERATOR_FEATURE_MODE__GENERATOR:
				return basicSetGenerator(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.GENERATOR_FEATURE_MODE__GENERATOR:
				if (resolve) return getGenerator();
				return basicGetGenerator();
			case SolverPackage.GENERATOR_FEATURE_MODE__OBJET_SCOPE:
				if (resolve) return getObjetScope();
				return basicGetObjetScope();
			case SolverPackage.GENERATOR_FEATURE_MODE__CODE:
				return getCode();
			case SolverPackage.GENERATOR_FEATURE_MODE__EREMARKS:
				return getERemarks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolverPackage.GENERATOR_FEATURE_MODE__GENERATOR:
				setGenerator((Generator)newValue);
				return;
			case SolverPackage.GENERATOR_FEATURE_MODE__OBJET_SCOPE:
				setObjetScope((GeneratorTuple)newValue);
				return;
			case SolverPackage.GENERATOR_FEATURE_MODE__CODE:
				setCode((String)newValue);
				return;
			case SolverPackage.GENERATOR_FEATURE_MODE__EREMARKS:
				setERemarks((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SolverPackage.GENERATOR_FEATURE_MODE__GENERATOR:
				setGenerator((Generator)null);
				return;
			case SolverPackage.GENERATOR_FEATURE_MODE__OBJET_SCOPE:
				setObjetScope((GeneratorTuple)null);
				return;
			case SolverPackage.GENERATOR_FEATURE_MODE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_FEATURE_MODE__EREMARKS:
				setERemarks(EREMARKS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SolverPackage.GENERATOR_FEATURE_MODE__GENERATOR:
				return generator != null;
			case SolverPackage.GENERATOR_FEATURE_MODE__OBJET_SCOPE:
				return objetScope != null;
			case SolverPackage.GENERATOR_FEATURE_MODE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case SolverPackage.GENERATOR_FEATURE_MODE__EREMARKS:
				return EREMARKS_EDEFAULT == null ? eRemarks != null : !EREMARKS_EDEFAULT.equals(eRemarks);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SolverPackage.GENERATOR_FEATURE_MODE___IS_OBJECT_IN_SCOPE__GENERATORTUPLE:
				return IsObjectInScope((GeneratorTuple)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Code: ");
		result.append(code);
		result.append(", ERemarks: ");
		result.append(eRemarks);
		result.append(')');
		return result.toString();
	}

} //GeneratorFeatureModeImpl
