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

import com.misc.common.moplaf.solver.GeneratorLpLinear;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.SolverPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Lp Linear</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpLinearImpl#getLpTerm <em>Lp Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorLpLinearImpl extends MinimalEObjectImpl.Container implements GeneratorLpLinear {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpLinearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_LP_LINEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorLpTerm> getLpTerm() {
		if (lpTerm == null) {
			lpTerm = new EObjectContainmentWithInverseEList<GeneratorLpTerm>(GeneratorLpTerm.class, this, SolverPackage.GENERATOR_LP_LINEAR__LP_TERM, SolverPackage.GENERATOR_LP_TERM__LP_LINEAR);
		}
		return lpTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpTerm constructTerm(GeneratorLpVar var, double coef) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpTerm contributeTerm(GeneratorLpVar var, double coef) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GeneratorLpTerm constructTerm(GeneratorLpVar var, float coef) {
		GeneratorLpTerm term = SolverFactory.eINSTANCE.createGeneratorLpTerm();
		term.setCoeff(coef);
		term.setLpVar(var);
		this.getLpTerm().add(term);
		return term;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.GENERATOR_LP_LINEAR__LP_TERM:
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
			case SolverPackage.GENERATOR_LP_LINEAR__LP_TERM:
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
			case SolverPackage.GENERATOR_LP_LINEAR__LP_TERM:
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
			case SolverPackage.GENERATOR_LP_LINEAR__LP_TERM:
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
			case SolverPackage.GENERATOR_LP_LINEAR__LP_TERM:
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
			case SolverPackage.GENERATOR_LP_LINEAR__LP_TERM:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SolverPackage.GENERATOR_LP_LINEAR___CONSTRUCT_TERM__GENERATORLPVAR_DOUBLE:
				return constructTerm((GeneratorLpVar)arguments.get(0), (Double)arguments.get(1));
			case SolverPackage.GENERATOR_LP_LINEAR___CONTRIBUTE_TERM__GENERATORLPVAR_DOUBLE:
				return contributeTerm((GeneratorLpVar)arguments.get(0), (Double)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GeneratorLpLinearImpl
