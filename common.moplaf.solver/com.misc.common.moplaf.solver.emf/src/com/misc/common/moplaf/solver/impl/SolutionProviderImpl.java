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
package com.misc.common.moplaf.solver.impl;


import com.misc.common.moplaf.job.impl.RunImpl;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.IGeneratorTool;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionProvider;
import com.misc.common.moplaf.solver.SolutionProviderParams;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.SolverPackage;
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
 * An implementation of the model object '<em><b>Solution Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionProviderImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionProviderImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionProviderImpl#getCurrentSolutionNr <em>Current Solution Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SolutionProviderImpl extends RunImpl implements SolutionProvider {
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
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> solution;

	/**
	 * The default value of the '{@link #getCurrentSolutionNr() <em>Current Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSolutionNr()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_SOLUTION_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentSolutionNr() <em>Current Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSolutionNr()
	 * @generated
	 * @ordered
	 */
	protected int currentSolutionNr = CURRENT_SOLUTION_NR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLUTION_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getSolution() {
		if (solution == null) {
			solution = new EObjectContainmentWithInverseEList<Solution>(Solution.class, this, SolverPackage.SOLUTION_PROVIDER__SOLUTION, SolverPackage.SOLUTION__PROVIDER);
		}
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentSolutionNr() {
		return currentSolutionNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSolutionNr(int newCurrentSolutionNr) {
		int oldCurrentSolutionNr = currentSolutionNr;
		currentSolutionNr = newCurrentSolutionNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_PROVIDER__CURRENT_SOLUTION_NR, oldCurrentSolutionNr, currentSolutionNr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_PROVIDER__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Solution solutionFactory() {
		Solution newsolution = SolverFactory.eINSTANCE.createSolution();
		return newsolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Solution constructSolution() {
		int currentNr = this.getCurrentSolutionNr();
		currentNr++;
		this.setCurrentSolutionNr(currentNr);
		Solution newsolution = this.solutionFactory();
		newsolution.setSolutionNr(currentNr);
		this.getSolution().add(newsolution);
		return newsolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator getGenerator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Default does nothing
	 * <!-- end-user-doc -->
	 */
	public void dispose() {
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
			case SolverPackage.SOLUTION_PROVIDER__SOLUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSolution()).basicAdd(otherEnd, msgs);
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
			case SolverPackage.SOLUTION_PROVIDER__SOLUTION:
				return ((InternalEList<?>)getSolution()).basicRemove(otherEnd, msgs);
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
			case SolverPackage.SOLUTION_PROVIDER__CODE:
				return getCode();
			case SolverPackage.SOLUTION_PROVIDER__SOLUTION:
				return getSolution();
			case SolverPackage.SOLUTION_PROVIDER__CURRENT_SOLUTION_NR:
				return getCurrentSolutionNr();
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
			case SolverPackage.SOLUTION_PROVIDER__CODE:
				setCode((String)newValue);
				return;
			case SolverPackage.SOLUTION_PROVIDER__SOLUTION:
				getSolution().clear();
				getSolution().addAll((Collection<? extends Solution>)newValue);
				return;
			case SolverPackage.SOLUTION_PROVIDER__CURRENT_SOLUTION_NR:
				setCurrentSolutionNr((Integer)newValue);
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
			case SolverPackage.SOLUTION_PROVIDER__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case SolverPackage.SOLUTION_PROVIDER__SOLUTION:
				getSolution().clear();
				return;
			case SolverPackage.SOLUTION_PROVIDER__CURRENT_SOLUTION_NR:
				setCurrentSolutionNr(CURRENT_SOLUTION_NR_EDEFAULT);
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
			case SolverPackage.SOLUTION_PROVIDER__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case SolverPackage.SOLUTION_PROVIDER__SOLUTION:
				return solution != null && !solution.isEmpty();
			case SolverPackage.SOLUTION_PROVIDER__CURRENT_SOLUTION_NR:
				return currentSolutionNr != CURRENT_SOLUTION_NR_EDEFAULT;
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
		if (baseClass == IGeneratorTool.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SolutionProviderParams.class) {
			switch (derivedFeatureID) {
				case SolverPackage.SOLUTION_PROVIDER__CODE: return SolverPackage.SOLUTION_PROVIDER_PARAMS__CODE;
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
		if (baseClass == IGeneratorTool.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SolutionProviderParams.class) {
			switch (baseFeatureID) {
				case SolverPackage.SOLUTION_PROVIDER_PARAMS__CODE: return SolverPackage.SOLUTION_PROVIDER__CODE;
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
		if (baseClass == IGeneratorTool.class) {
			switch (baseOperationID) {
				case SolverPackage.IGENERATOR_TOOL___GET_GENERATOR: return SolverPackage.SOLUTION_PROVIDER___GET_GENERATOR;
				case SolverPackage.IGENERATOR_TOOL___DISPOSE: return SolverPackage.SOLUTION_PROVIDER___DISPOSE;
				default: return -1;
			}
		}
		if (baseClass == SolutionProviderParams.class) {
			switch (baseOperationID) {
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
			case SolverPackage.SOLUTION_PROVIDER___SOLUTION_FACTORY:
				return solutionFactory();
			case SolverPackage.SOLUTION_PROVIDER___CONSTRUCT_SOLUTION:
				return constructSolution();
			case SolverPackage.SOLUTION_PROVIDER___GET_GENERATOR:
				return getGenerator();
			case SolverPackage.SOLUTION_PROVIDER___DISPOSE:
				dispose();
				return null;
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
		result.append(", CurrentSolutionNr: ");
		result.append(currentSolutionNr);
		result.append(')');
		return result.toString();
	}

} //SolutionProviderImpl