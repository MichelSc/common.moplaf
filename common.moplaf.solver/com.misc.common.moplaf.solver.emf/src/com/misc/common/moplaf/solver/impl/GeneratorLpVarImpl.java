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

import com.misc.common.moplaf.solver.EnumLpVarType;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Lp Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpVarImpl#getLpTerm <em>Lp Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorLpVarImpl extends GeneratorVarImpl implements GeneratorLpVar {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumLpVarType TYPE_EDEFAULT = EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EnumLpVarType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final float LOWER_BOUND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected float lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final float UPPER_BOUND_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected float upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLpTerm() <em>Lp Term</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorLpTerm> lpTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpVarImpl() {
		super();
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void build(Solver builder) throws Exception {
		builder.buildLpVar(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_LP_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLpVarType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EnumLpVarType newType) {
		EnumLpVarType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_VAR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(float newLowerBound) {
		float oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_VAR__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(float newUpperBound) {
		float oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_VAR__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorLpTerm> getLpTerm() {
		if (lpTerm == null) {
			lpTerm = new EObjectWithInverseResolvingEList<GeneratorLpTerm>(GeneratorLpTerm.class, this, SolverPackage.GENERATOR_LP_VAR__LP_TERM, SolverPackage.GENERATOR_LP_TERM__LP_VAR);
		}
		return lpTerm;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.GENERATOR_LP_VAR__LP_TERM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLpTerm()).basicAdd(otherEnd, msgs);
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
			case SolverPackage.GENERATOR_LP_VAR__LP_TERM:
				return ((InternalEList<?>)getLpTerm()).basicRemove(otherEnd, msgs);
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
			case SolverPackage.GENERATOR_LP_VAR__TYPE:
				return getType();
			case SolverPackage.GENERATOR_LP_VAR__LOWER_BOUND:
				return getLowerBound();
			case SolverPackage.GENERATOR_LP_VAR__UPPER_BOUND:
				return getUpperBound();
			case SolverPackage.GENERATOR_LP_VAR__LP_TERM:
				return getLpTerm();
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
			case SolverPackage.GENERATOR_LP_VAR__TYPE:
				setType((EnumLpVarType)newValue);
				return;
			case SolverPackage.GENERATOR_LP_VAR__LOWER_BOUND:
				setLowerBound((Float)newValue);
				return;
			case SolverPackage.GENERATOR_LP_VAR__UPPER_BOUND:
				setUpperBound((Float)newValue);
				return;
			case SolverPackage.GENERATOR_LP_VAR__LP_TERM:
				getLpTerm().clear();
				getLpTerm().addAll((Collection<? extends GeneratorLpTerm>)newValue);
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
			case SolverPackage.GENERATOR_LP_VAR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_LP_VAR__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_LP_VAR__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_LP_VAR__LP_TERM:
				getLpTerm().clear();
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
			case SolverPackage.GENERATOR_LP_VAR__TYPE:
				return type != TYPE_EDEFAULT;
			case SolverPackage.GENERATOR_LP_VAR__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case SolverPackage.GENERATOR_LP_VAR__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case SolverPackage.GENERATOR_LP_VAR__LP_TERM:
				return lpTerm != null && !lpTerm.isEmpty();
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
		result.append(", LowerBound: ");
		result.append(lowerBound);
		result.append(", UpperBound: ");
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}

} //GeneratorLpVarImpl
