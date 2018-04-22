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

import com.misc.common.moplaf.solver.EnumLpConsType;
import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpLinear;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.util.Util;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Lp Cons</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpConsImpl#getLpTerm <em>Lp Term</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpConsImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpConsImpl#getRighHandSide <em>Righ Hand Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorLpConsImpl extends GeneratorConsImpl implements GeneratorLpCons {
	/**
	 * The cached value of the '{@link #getLpTerm() <em>Lp Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorLpTerm> lpTerm;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumLpConsType TYPE_EDEFAULT = EnumLpConsType.ENUM_LITERAL_LP_CONS_EQUAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EnumLpConsType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRighHandSide() <em>Righ Hand Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRighHandSide()
	 * @generated
	 * @ordered
	 */
	protected static final double RIGH_HAND_SIDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRighHandSide() <em>Righ Hand Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRighHandSide()
	 * @generated
	 * @ordered
	 */
	protected double righHandSide = RIGH_HAND_SIDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpConsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_LP_CONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLpConsType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EnumLpConsType newType) {
		EnumLpConsType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_CONS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorLpTerm> getLpTerm() {
		if (lpTerm == null) {
			lpTerm = new EObjectContainmentWithInverseEList<GeneratorLpTerm>(GeneratorLpTerm.class, this, SolverPackage.GENERATOR_LP_CONS__LP_TERM, SolverPackage.GENERATOR_LP_TERM__LP_LINEAR);
		}
		return lpTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getNofTerms() {
		return this.getLpTerm().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRighHandSide() {
		return righHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRighHandSide(double newRighHandSide) {
		double oldRighHandSide = righHandSide;
		righHandSide = newRighHandSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_CONS__RIGH_HAND_SIDE, oldRighHandSide, righHandSide));
	}

	/**
	 * Create an new term to the linear. Assume that the var is not yet present in the linear.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GeneratorLpTerm constructTerm(GeneratorLpVar var, double coef) {
		return Util.constructTerm(this,  var, coef);
		}

	
	
	/**
	 * Contribute to a term in the linear.
	 * If there is already a term for this var in this linear, its coefficient is augmented with coef.
	 * Otherwise, a new term is constructed.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GeneratorLpTerm contributeTerm(GeneratorLpVar var, double coef) {
		return Util.contributeTerm(this, var, coef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */

	@Override
	public void build(Solver builder) throws Exception {
		builder.buildLpCons(this);
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
			case SolverPackage.GENERATOR_LP_CONS__LP_TERM:
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
			case SolverPackage.GENERATOR_LP_CONS__LP_TERM:
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
			case SolverPackage.GENERATOR_LP_CONS__LP_TERM:
				return getLpTerm();
			case SolverPackage.GENERATOR_LP_CONS__TYPE:
				return getType();
			case SolverPackage.GENERATOR_LP_CONS__RIGH_HAND_SIDE:
				return getRighHandSide();
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
			case SolverPackage.GENERATOR_LP_CONS__LP_TERM:
				getLpTerm().clear();
				getLpTerm().addAll((Collection<? extends GeneratorLpTerm>)newValue);
				return;
			case SolverPackage.GENERATOR_LP_CONS__TYPE:
				setType((EnumLpConsType)newValue);
				return;
			case SolverPackage.GENERATOR_LP_CONS__RIGH_HAND_SIDE:
				setRighHandSide((Double)newValue);
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
			case SolverPackage.GENERATOR_LP_CONS__LP_TERM:
				getLpTerm().clear();
				return;
			case SolverPackage.GENERATOR_LP_CONS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_LP_CONS__RIGH_HAND_SIDE:
				setRighHandSide(RIGH_HAND_SIDE_EDEFAULT);
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
			case SolverPackage.GENERATOR_LP_CONS__LP_TERM:
				return lpTerm != null && !lpTerm.isEmpty();
			case SolverPackage.GENERATOR_LP_CONS__TYPE:
				return type != TYPE_EDEFAULT;
			case SolverPackage.GENERATOR_LP_CONS__RIGH_HAND_SIDE:
				return righHandSide != RIGH_HAND_SIDE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GeneratorLpLinear.class) {
			switch (derivedFeatureID) {
				case SolverPackage.GENERATOR_LP_CONS__LP_TERM: return SolverPackage.GENERATOR_LP_LINEAR__LP_TERM;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GeneratorLpLinear.class) {
			switch (baseFeatureID) {
				case SolverPackage.GENERATOR_LP_LINEAR__LP_TERM: return SolverPackage.GENERATOR_LP_CONS__LP_TERM;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == GeneratorLpLinear.class) {
			switch (baseOperationID) {
				case SolverPackage.GENERATOR_LP_LINEAR___CONSTRUCT_TERM__GENERATORLPVAR_DOUBLE: return SolverPackage.GENERATOR_LP_CONS___CONSTRUCT_TERM__GENERATORLPVAR_DOUBLE;
				case SolverPackage.GENERATOR_LP_LINEAR___CONTRIBUTE_TERM__GENERATORLPVAR_DOUBLE: return SolverPackage.GENERATOR_LP_CONS___CONTRIBUTE_TERM__GENERATORLPVAR_DOUBLE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SolverPackage.GENERATOR_LP_CONS___CONSTRUCT_TERM__GENERATORLPVAR_DOUBLE:
				return constructTerm((GeneratorLpVar)arguments.get(0), (Double)arguments.get(1));
			case SolverPackage.GENERATOR_LP_CONS___CONTRIBUTE_TERM__GENERATORLPVAR_DOUBLE:
				return contributeTerm((GeneratorLpVar)arguments.get(0), (Double)arguments.get(1));
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
		result.append(" (Type: ");
		result.append(type);
		result.append(", RighHandSide: ");
		result.append(righHandSide);
		result.append(')');
		return result.toString();
	}


	
} //GeneratorLpConsImpl
