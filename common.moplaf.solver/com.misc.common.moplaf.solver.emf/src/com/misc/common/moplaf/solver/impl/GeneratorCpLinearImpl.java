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
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.EnumCpLinearType;
import com.misc.common.moplaf.solver.GeneratorCpLinear;
import com.misc.common.moplaf.solver.GeneratorCpLinearTerm;
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
 * An implementation of the model object '<em><b>Generator Cp Linear</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorCpLinearImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorCpLinearImpl#getRightHandSide <em>Right Hand Side</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorCpLinearImpl#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorCpLinearImpl extends GeneratorCpConsImpl implements GeneratorCpLinear {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumCpLinearType TYPE_EDEFAULT = EnumCpLinearType.ENUM_LITERAL_CP_LINEAR_EQUAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EnumCpLinearType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightHandSide() <em>Right Hand Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightHandSide()
	 * @generated
	 * @ordered
	 */
	protected static final int RIGHT_HAND_SIDE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRightHandSide() <em>Right Hand Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightHandSide()
	 * @generated
	 * @ordered
	 */
	protected int rightHandSide = RIGHT_HAND_SIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorCpLinearTerm> term;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorCpLinearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_CP_LINEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumCpLinearType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EnumCpLinearType newType) {
		EnumCpLinearType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_CP_LINEAR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRightHandSide() {
		return rightHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightHandSide(int newRightHandSide) {
		int oldRightHandSide = rightHandSide;
		rightHandSide = newRightHandSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_CP_LINEAR__RIGHT_HAND_SIDE, oldRightHandSide, rightHandSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorCpLinearTerm> getTerm() {
		if (term == null) {
			term = new EObjectContainmentEList<GeneratorCpLinearTerm>(GeneratorCpLinearTerm.class, this, SolverPackage.GENERATOR_CP_LINEAR__TERM);
		}
		return term;
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
			case SolverPackage.GENERATOR_CP_LINEAR__TERM:
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
			case SolverPackage.GENERATOR_CP_LINEAR__TYPE:
				return getType();
			case SolverPackage.GENERATOR_CP_LINEAR__RIGHT_HAND_SIDE:
				return getRightHandSide();
			case SolverPackage.GENERATOR_CP_LINEAR__TERM:
				return getTerm();
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
			case SolverPackage.GENERATOR_CP_LINEAR__TYPE:
				setType((EnumCpLinearType)newValue);
				return;
			case SolverPackage.GENERATOR_CP_LINEAR__RIGHT_HAND_SIDE:
				setRightHandSide((Integer)newValue);
				return;
			case SolverPackage.GENERATOR_CP_LINEAR__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends GeneratorCpLinearTerm>)newValue);
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
			case SolverPackage.GENERATOR_CP_LINEAR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_CP_LINEAR__RIGHT_HAND_SIDE:
				setRightHandSide(RIGHT_HAND_SIDE_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_CP_LINEAR__TERM:
				getTerm().clear();
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
			case SolverPackage.GENERATOR_CP_LINEAR__TYPE:
				return type != TYPE_EDEFAULT;
			case SolverPackage.GENERATOR_CP_LINEAR__RIGHT_HAND_SIDE:
				return rightHandSide != RIGHT_HAND_SIDE_EDEFAULT;
			case SolverPackage.GENERATOR_CP_LINEAR__TERM:
				return term != null && !term.isEmpty();
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
		result.append(" (Type: ");
		result.append(type);
		result.append(", RightHandSide: ");
		result.append(rightHandSide);
		result.append(')');
		return result.toString();
	}

} //GeneratorCpLinearImpl
