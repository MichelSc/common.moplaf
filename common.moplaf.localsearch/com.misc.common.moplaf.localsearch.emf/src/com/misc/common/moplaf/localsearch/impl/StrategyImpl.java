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

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.RunContext;
import com.misc.common.moplaf.job.impl.RunImpl;
import com.misc.common.moplaf.localsearch.LocalSearchFactory;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Phase;
import com.misc.common.moplaf.localsearch.Plugin;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.SolutionRef;
import com.misc.common.moplaf.localsearch.Strategy;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getPoolSolutions <em>Pool Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getCurrentSolutionNr <em>Current Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getMaxNrSolutions <em>Max Nr Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getSolutions <em>Solutions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StrategyImpl extends RunImpl implements Strategy {
	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected EList<Phase> phases;

	/**
	 * The cached value of the '{@link #getPoolSolutions() <em>Pool Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionRef> poolSolutions;

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
	 * The default value of the '{@link #getMaxNrSolutions() <em>Max Nr Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNrSolutions()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NR_SOLUTIONS_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getMaxNrSolutions() <em>Max Nr Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNrSolutions()
	 * @generated
	 * @ordered
	 */
	protected int maxNrSolutions = MAX_NR_SOLUTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> solutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocalSearchPackage.Literals.STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phase> getPhases() {
		if (phases == null) {
			phases = new EObjectContainmentWithInverseEList<Phase>(Phase.class, this, LocalSearchPackage.STRATEGY__PHASES, LocalSearchPackage.PHASE__STRATEGY);
		}
		return phases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionRef> getPoolSolutions() {
		if (poolSolutions == null) {
			poolSolutions = new EObjectContainmentEList<SolutionRef>(SolutionRef.class, this, LocalSearchPackage.STRATEGY__POOL_SOLUTIONS);
		}
		return poolSolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectContainmentWithInverseEList<Solution>(Solution.class, this, LocalSearchPackage.STRATEGY__SOLUTIONS, LocalSearchPackage.SOLUTION__STRATEGY);
		}
		return solutions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR, oldCurrentSolutionNr, currentSolutionNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNrSolutions() {
		return maxNrSolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNrSolutions(int newMaxNrSolutions) {
		int oldMaxNrSolutions = maxNrSolutions;
		maxNrSolutions = newMaxNrSolutions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.STRATEGY__MAX_NR_SOLUTIONS, oldMaxNrSolutions, maxNrSolutions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.STRATEGY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionRef selectGoodSolution(double chance) {
		// sort the solution from the best to the worst, thus by descending score
		SolutionRef selected = this.selectPoolSolution(chance, false);
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionRef selectBadSolution(double chance) {
		// sort the solution from the worst to the best, thus by ascending score
		SolutionRef selected = this.selectPoolSolution(chance, true);
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sort the solutions from best to worst.
	 * Normally, the sort order is maintained by the framework and this method should not be necessary.
	 * <!-- end-user-doc -->
	 */
	public void sortSolutions() {
		EList<SolutionRef> list = this.getPoolSolutions();
		ECollections.sort(list, (sol1, sol2)->sol1.getSolution().getScore().isBetter(sol2.getSolution().getScore())? -1 : +1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int makeNewSolutionNr() {
		int new_nr = this.getCurrentSolutionNr()+1;
		this.setCurrentSolutionNr(new_nr);
		return new_nr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void prune(double chance) {
		while ( this.getPoolSolutions().size()>this.getMaxNrSolutions()) {
			SolutionRef ref = this.selectBadSolution(chance);
			Solution sol = ref.getSolution();
			Plugin.INSTANCE.logInfo(String.format("Strategy %s solution %s:%d pruned", 
					this.getName(),
					sol.getStep(),
					sol.getSolutionNr()));
			ref.release();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void garbageCollect() {
		Iterator<Solution> iterator = this.getSolutions().iterator();
		while ( iterator.hasNext() ) {
			Solution solution = iterator.next();
			if ( solution.getReferences().size()==0 ) {
				iterator.remove();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionRef addPoolSolution(Solution solution, boolean copy) {
		// the solution
		Solution to_add = solution;
		if ( copy ) {
			to_add = solution.clone();
		}
		
		// the ref
		SolutionRef pool_ref = LocalSearchFactory.eINSTANCE.createSolutionRef();
		pool_ref.setSolution(to_add);
		this.getPoolSolutions().add(pool_ref);
		
		// sort
		this.sortSolutions();
		
		return pool_ref;
	}

	private static Random random = new Random();
	
	private SolutionRef selectPoolSolution(double chanceFirst, boolean reverse) {
		if ( this.getPoolSolutions().isEmpty() ) {
			Plugin.INSTANCE.logWarning("Strategy.selectPoolSolution: pool empty, no Solution selected");
			return null;
		}
		double threshold = random.nextDouble();
		// traverse the solutions from first to last
		EList<SolutionRef> list_solutions = this.getPoolSolutions();
		int nof_solutions = list_solutions.size();
//		String message = String.format("select, nofsolutions=%d, random=%f",
//				                       nof_solutions,
//				                       threshold);
//		Plugin.INSTANCE.log(message);
		double total_chance = chanceFirst == 0.0d
				            ? 1.0d
				            : 1-Math.pow(1-chanceFirst, nof_solutions);
		double cumulated_chance = 0.0d; // chance to select one of the previous solutions

		ListIterator<SolutionRef> iterator = list_solutions.listIterator(reverse ? nof_solutions : 0);
        while ( reverse ? iterator.hasPrevious() : iterator.hasNext()) {
			SolutionRef current_solution = reverse ? iterator.previous() : iterator.next();
			double current_chance = chanceFirst == 0.0d
					              ? 1.0d / nof_solutions
					              : (1-cumulated_chance)*chanceFirst;
			cumulated_chance += current_chance;
//			boolean selected = cumulated_chance/total_chance>threshold;
//			message = String.format("..solution=%d, chance=%f, cumulated=%f/%f, selected=%b",
//					current_solution.getSolutionNr(),
//					current_chance, 
//					cumulated_chance,
//					total_chance,
//					selected);
//			Plugin.INSTANCE.log(message);
			if ( cumulated_chance/total_chance>threshold) {
				return current_solution;
			} 
		}
		// assert should never come here (except if the pool is empty)
		return null;
	}

	/*
	 * 
	 */
	@Override
	protected ReturnFeedback runImpl(RunContext context) {
		
		String message1 = String.format("Strategy %s started", this.getName());
		Plugin.INSTANCE.logInfo(message1);
		this.setProgress(message1, 0.0f);
		
		for( Phase phase : this.getPhases()) {
			phase.doPhase();
			Plugin.INSTANCE.logInfo(String.format("Phase %s finished", phase.getName()));
		}
		Plugin.INSTANCE.logInfo(String.format("Strategy %s finished", this.getName()));
		
		return ReturnFeedback.SUCCESS;
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
			case LocalSearchPackage.STRATEGY__PHASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPhases()).basicAdd(otherEnd, msgs);
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSolutions()).basicAdd(otherEnd, msgs);
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
			case LocalSearchPackage.STRATEGY__PHASES:
				return ((InternalEList<?>)getPhases()).basicRemove(otherEnd, msgs);
			case LocalSearchPackage.STRATEGY__POOL_SOLUTIONS:
				return ((InternalEList<?>)getPoolSolutions()).basicRemove(otherEnd, msgs);
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				return ((InternalEList<?>)getSolutions()).basicRemove(otherEnd, msgs);
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
			case LocalSearchPackage.STRATEGY__PHASES:
				return getPhases();
			case LocalSearchPackage.STRATEGY__POOL_SOLUTIONS:
				return getPoolSolutions();
			case LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR:
				return getCurrentSolutionNr();
			case LocalSearchPackage.STRATEGY__MAX_NR_SOLUTIONS:
				return getMaxNrSolutions();
			case LocalSearchPackage.STRATEGY__NAME:
				return getName();
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				return getSolutions();
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
			case LocalSearchPackage.STRATEGY__PHASES:
				getPhases().clear();
				getPhases().addAll((Collection<? extends Phase>)newValue);
				return;
			case LocalSearchPackage.STRATEGY__POOL_SOLUTIONS:
				getPoolSolutions().clear();
				getPoolSolutions().addAll((Collection<? extends SolutionRef>)newValue);
				return;
			case LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR:
				setCurrentSolutionNr((Integer)newValue);
				return;
			case LocalSearchPackage.STRATEGY__MAX_NR_SOLUTIONS:
				setMaxNrSolutions((Integer)newValue);
				return;
			case LocalSearchPackage.STRATEGY__NAME:
				setName((String)newValue);
				return;
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				getSolutions().clear();
				getSolutions().addAll((Collection<? extends Solution>)newValue);
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
			case LocalSearchPackage.STRATEGY__PHASES:
				getPhases().clear();
				return;
			case LocalSearchPackage.STRATEGY__POOL_SOLUTIONS:
				getPoolSolutions().clear();
				return;
			case LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR:
				setCurrentSolutionNr(CURRENT_SOLUTION_NR_EDEFAULT);
				return;
			case LocalSearchPackage.STRATEGY__MAX_NR_SOLUTIONS:
				setMaxNrSolutions(MAX_NR_SOLUTIONS_EDEFAULT);
				return;
			case LocalSearchPackage.STRATEGY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				getSolutions().clear();
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
			case LocalSearchPackage.STRATEGY__PHASES:
				return phases != null && !phases.isEmpty();
			case LocalSearchPackage.STRATEGY__POOL_SOLUTIONS:
				return poolSolutions != null && !poolSolutions.isEmpty();
			case LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR:
				return currentSolutionNr != CURRENT_SOLUTION_NR_EDEFAULT;
			case LocalSearchPackage.STRATEGY__MAX_NR_SOLUTIONS:
				return maxNrSolutions != MAX_NR_SOLUTIONS_EDEFAULT;
			case LocalSearchPackage.STRATEGY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				return solutions != null && !solutions.isEmpty();
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
			case LocalSearchPackage.STRATEGY___SELECT_GOOD_SOLUTION__DOUBLE:
				return selectGoodSolution((Double)arguments.get(0));
			case LocalSearchPackage.STRATEGY___SELECT_BAD_SOLUTION__DOUBLE:
				return selectBadSolution((Double)arguments.get(0));
			case LocalSearchPackage.STRATEGY___SORT_SOLUTIONS:
				sortSolutions();
				return null;
			case LocalSearchPackage.STRATEGY___MAKE_NEW_SOLUTION_NR:
				return makeNewSolutionNr();
			case LocalSearchPackage.STRATEGY___PRUNE__DOUBLE:
				prune((Double)arguments.get(0));
				return null;
			case LocalSearchPackage.STRATEGY___GARBAGE_COLLECT:
				garbageCollect();
				return null;
			case LocalSearchPackage.STRATEGY___ADD_POOL_SOLUTION__SOLUTION_BOOLEAN:
				return addPoolSolution((Solution)arguments.get(0), (Boolean)arguments.get(1));
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
		result.append(" (CurrentSolutionNr: ");
		result.append(currentSolutionNr);
		result.append(", MaxNrSolutions: ");
		result.append(maxNrSolutions);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StrategyImpl
