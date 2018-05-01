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
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.SolutionRef;
import com.misc.common.moplaf.localsearch.Strategy;
import com.misc.common.moplaf.propagator2.Plugin;
import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionImpl#getScore <em>Score</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionImpl#getSolutionNr <em>Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionImpl#getReferences <em>References</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionImpl#getStrategy <em>Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SolutionImpl extends ObjectWithPropagatorFunctionsImpl implements Solution {
	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected Score score;

	/**
	 * The default value of the '{@link #getSolutionNr() <em>Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionNr()
	 * @generated
	 * @ordered
	 */
	protected static final int SOLUTION_NR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getSolutionNr() <em>Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionNr()
	 * @generated
	 * @ordered
	 */
	protected int solutionNr = SOLUTION_NR_EDEFAULT;
	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final String STEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected String step = STEP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionRef> references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocalSearchPackage.Literals.SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Score getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScore(Score newScore, NotificationChain msgs) {
		Score oldScore = score;
		score = newScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION__SCORE, oldScore, newScore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(Score newScore) {
		if (newScore != score) {
			NotificationChain msgs = null;
			if (score != null)
				msgs = ((InternalEObject)score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.SOLUTION__SCORE, null, msgs);
			if (newScore != null)
				msgs = ((InternalEObject)newScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.SOLUTION__SCORE, null, msgs);
			msgs = basicSetScore(newScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION__SCORE, newScore, newScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSolutionNr() {
		return solutionNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolutionNr(int newSolutionNr) {
		int oldSolutionNr = solutionNr;
		solutionNr = newSolutionNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION__SOLUTION_NR, oldSolutionNr, solutionNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy getStrategy() {
		if (eContainerFeatureID() != LocalSearchPackage.SOLUTION__STRATEGY) return null;
		return (Strategy)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategy(Strategy newStrategy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStrategy, LocalSearchPackage.SOLUTION__STRATEGY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(Strategy newStrategy) {
		if (newStrategy != eInternalContainer() || (eContainerFeatureID() != LocalSearchPackage.SOLUTION__STRATEGY && newStrategy != null)) {
			if (EcoreUtil.isAncestor(this, newStrategy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStrategy != null)
				msgs = ((InternalEObject)newStrategy).eInverseAdd(this, LocalSearchPackage.STRATEGY__SOLUTIONS, Strategy.class, msgs);
			msgs = basicSetStrategy(newStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION__STRATEGY, newStrategy, newStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Strategy basicGetStrategy() {
		// root move
		EObject container = this.eContainer;
		if ( container instanceof Strategy){
			return (Strategy) container;
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(String newStep) {
		String oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionRef> getReferences() {
		if (references == null) {
			references = new EObjectWithInverseResolvingEList<SolutionRef>(SolutionRef.class, this, LocalSearchPackage.SOLUTION__REFERENCES, LocalSearchPackage.SOLUTION_REF__SOLUTION);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Solution clone() {
		Strategy strategy = this.getStrategy();

		// clone the solution
		Plugin.INSTANCE.logInfo("Solution clone: called");
		Solution new_solution = this.cloneImpl();
		strategy.getSolutions().add(new_solution); // owning
		Plugin.INSTANCE.logInfo("Solution clone: done");
		
		return new_solution;
	}
	
	/**
	 * 
	 * @return
	 */
	protected Solution cloneImpl() {
		// default implementation
		Solution newSolution = (Solution)EcoreUtil.copy(this);
		return newSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refresh() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case LocalSearchPackage.SOLUTION__REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferences()).basicAdd(otherEnd, msgs);
			case LocalSearchPackage.SOLUTION__STRATEGY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStrategy((Strategy)otherEnd, msgs);
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
			case LocalSearchPackage.SOLUTION__SCORE:
				return basicSetScore(null, msgs);
			case LocalSearchPackage.SOLUTION__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case LocalSearchPackage.SOLUTION__STRATEGY:
				return basicSetStrategy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LocalSearchPackage.SOLUTION__STRATEGY:
				return eInternalContainer().eInverseRemove(this, LocalSearchPackage.STRATEGY__SOLUTIONS, Strategy.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocalSearchPackage.SOLUTION__SCORE:
				return getScore();
			case LocalSearchPackage.SOLUTION__SOLUTION_NR:
				return getSolutionNr();
			case LocalSearchPackage.SOLUTION__STEP:
				return getStep();
			case LocalSearchPackage.SOLUTION__REFERENCES:
				return getReferences();
			case LocalSearchPackage.SOLUTION__STRATEGY:
				return getStrategy();
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
			case LocalSearchPackage.SOLUTION__SCORE:
				setScore((Score)newValue);
				return;
			case LocalSearchPackage.SOLUTION__SOLUTION_NR:
				setSolutionNr((Integer)newValue);
				return;
			case LocalSearchPackage.SOLUTION__STEP:
				setStep((String)newValue);
				return;
			case LocalSearchPackage.SOLUTION__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends SolutionRef>)newValue);
				return;
			case LocalSearchPackage.SOLUTION__STRATEGY:
				setStrategy((Strategy)newValue);
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
			case LocalSearchPackage.SOLUTION__SCORE:
				setScore((Score)null);
				return;
			case LocalSearchPackage.SOLUTION__SOLUTION_NR:
				setSolutionNr(SOLUTION_NR_EDEFAULT);
				return;
			case LocalSearchPackage.SOLUTION__STEP:
				setStep(STEP_EDEFAULT);
				return;
			case LocalSearchPackage.SOLUTION__REFERENCES:
				getReferences().clear();
				return;
			case LocalSearchPackage.SOLUTION__STRATEGY:
				setStrategy((Strategy)null);
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
			case LocalSearchPackage.SOLUTION__SCORE:
				return score != null;
			case LocalSearchPackage.SOLUTION__SOLUTION_NR:
				return solutionNr != SOLUTION_NR_EDEFAULT;
			case LocalSearchPackage.SOLUTION__STEP:
				return STEP_EDEFAULT == null ? step != null : !STEP_EDEFAULT.equals(step);
			case LocalSearchPackage.SOLUTION__REFERENCES:
				return references != null && !references.isEmpty();
			case LocalSearchPackage.SOLUTION__STRATEGY:
				return getStrategy() != null;
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
			case LocalSearchPackage.SOLUTION___CLONE:
				return clone();
			case LocalSearchPackage.SOLUTION___REFRESH:
				refresh();
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
		result.append(" (SolutionNr: ");
		result.append(solutionNr);
		result.append(", Step: ");
		result.append(step);
		result.append(')');
		return result.toString();
	}

} //SolutionImpl
