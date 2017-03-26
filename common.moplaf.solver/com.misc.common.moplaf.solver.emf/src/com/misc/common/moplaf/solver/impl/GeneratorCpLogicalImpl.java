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

import com.misc.common.moplaf.solver.EnumCpLogicalType;
import com.misc.common.moplaf.solver.GeneratorCpLogical;
import com.misc.common.moplaf.solver.GeneratorCpLogicalTerm;
import com.misc.common.moplaf.solver.SolverPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Cp Logical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorCpLogicalImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorCpLogicalImpl#isNot <em>Not</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorCpLogicalImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorCpLogicalImpl extends GeneratorCpConsImpl implements GeneratorCpLogical {
	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorCpLogicalTerm> term;

	/**
	 * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNot()
	 * @generated
	 * @ordered
	 */
	protected boolean not = NOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumCpLogicalType TYPE_EDEFAULT = EnumCpLogicalType.ENUM_LITERAL_CP_LOGICAL_OR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EnumCpLogicalType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorCpLogicalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_CP_LOGICAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorCpLogicalTerm> getTerm() {
		if (term == null) {
			term = new EObjectContainmentEList<GeneratorCpLogicalTerm>(GeneratorCpLogicalTerm.class, this, SolverPackage.GENERATOR_CP_LOGICAL__TERM);
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(boolean newNot) {
		boolean oldNot = not;
		not = newNot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_CP_LOGICAL__NOT, oldNot, not));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumCpLogicalType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EnumCpLogicalType newType) {
		EnumCpLogicalType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_CP_LOGICAL__TYPE, oldType, type));
	}
	
	
	@Override
	public int getNofTerms() {
		return this.getTerm().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.GENERATOR_CP_LOGICAL__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
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
			case SolverPackage.GENERATOR_CP_LOGICAL__TERM:
				return getTerm();
			case SolverPackage.GENERATOR_CP_LOGICAL__NOT:
				return isNot();
			case SolverPackage.GENERATOR_CP_LOGICAL__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolverPackage.GENERATOR_CP_LOGICAL__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends GeneratorCpLogicalTerm>)newValue);
				return;
			case SolverPackage.GENERATOR_CP_LOGICAL__NOT:
				setNot((Boolean)newValue);
				return;
			case SolverPackage.GENERATOR_CP_LOGICAL__TYPE:
				setType((EnumCpLogicalType)newValue);
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
			case SolverPackage.GENERATOR_CP_LOGICAL__TERM:
				getTerm().clear();
				return;
			case SolverPackage.GENERATOR_CP_LOGICAL__NOT:
				setNot(NOT_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_CP_LOGICAL__TYPE:
				setType(TYPE_EDEFAULT);
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
			case SolverPackage.GENERATOR_CP_LOGICAL__TERM:
				return term != null && !term.isEmpty();
			case SolverPackage.GENERATOR_CP_LOGICAL__NOT:
				return not != NOT_EDEFAULT;
			case SolverPackage.GENERATOR_CP_LOGICAL__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (Not: ");
		result.append(not);
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //GeneratorCpLogicalImpl
