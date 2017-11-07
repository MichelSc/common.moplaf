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
import com.misc.common.moplaf.localsearch.Step;
import com.misc.common.moplaf.localsearch.Strategy;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
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
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getCurrentSolutionNr <em>Current Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getMaxNrSolutions <em>Max Nr Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getSelectBestChance <em>Select Best Chance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getSelectWorstChance <em>Select Worst Chance</em>}</li>
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
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> solutions;

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
	protected static final int MAX_NR_SOLUTIONS_EDEFAULT = 0;

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
	 * The default value of the '{@link #getSelectBestChance() <em>Select Best Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectBestChance()
	 * @generated
	 * @ordered
	 */
	protected static final double SELECT_BEST_CHANCE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getSelectBestChance() <em>Select Best Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectBestChance()
	 * @generated
	 * @ordered
	 */
	protected double selectBestChance = SELECT_BEST_CHANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectWorstChance() <em>Select Worst Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectWorstChance()
	 * @generated
	 * @ordered
	 */
	protected static final double SELECT_WORST_CHANCE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getSelectWorstChance() <em>Select Worst Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectWorstChance()
	 * @generated
	 * @ordered
	 */
	protected double selectWorstChance = SELECT_WORST_CHANCE_EDEFAULT;

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
	public EList<Solution> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectContainmentEList<Solution>(Solution.class, this, LocalSearchPackage.STRATEGY__SOLUTIONS);
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
	 * @generated
	 */
	public double getSelectBestChance() {
		return selectBestChance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectBestChance(double newSelectBestChance) {
		double oldSelectBestChance = selectBestChance;
		selectBestChance = newSelectBestChance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.STRATEGY__SELECT_BEST_CHANCE, oldSelectBestChance, selectBestChance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSelectWorstChance() {
		return selectWorstChance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectWorstChance(double newSelectWorstChance) {
		double oldSelectWorstChance = selectWorstChance;
		selectWorstChance = newSelectWorstChance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.STRATEGY__SELECT_WORST_CHANCE, oldSelectWorstChance, selectWorstChance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Solution selectGoodSolution() {
		// sort the solution from the best to the worst, thus by descending score
		Solution selected = this.select(this.getSelectBestChance(), false);
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Solution selectBadSolution() {
		// sort the solution from the worst to the best, thus by ascending score
		Solution selected = this.select(this.getSelectWorstChance(), true);
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sort the solutions from best to worst.
	 * Normally, the sort order is maintained by the framework and this method should not be necessary.
	 * <!-- end-user-doc -->
	 */
	public void sortSolutions() {
		EList<Solution> list = this.getSolutions();
		ECollections.sort(list, (sol1, sol2)->sol1.getScore().isBetter(sol2.getScore())? -1 : +1);
	}

	private static Random random = new Random();
	
	private Solution select(double chanceFirst, boolean reverse) {
		double threshold = random.nextDouble();
		// traverse the solutions from first to last
		EList<Solution> list_solutions = this.getSolutions();
		int nof_solutions = list_solutions.size();
//		String message = String.format("select, nofsolutions=%d, random=%f",
//				                       nof_solutions,
//				                       threshold);
//		Plugin.INSTANCE.log(message);
		double total_chance = chanceFirst == 0.0d
				            ? 1.0d
				            : 1-Math.pow(1-chanceFirst, nof_solutions);
		double cumulated_chance = 0.0d; // chance to select one of the previous solutions

		ListIterator<Solution> iterator = list_solutions.listIterator(reverse ? nof_solutions : 0);
        while ( reverse ? iterator.hasPrevious() : iterator.hasNext()) {
			Solution current_solution = reverse ? iterator.previous() : iterator.next();
			double current_chance = chanceFirst == 0.0d
					              ? 1.0d / nof_solutions
					              : (1-cumulated_chance)*chanceFirst;
			cumulated_chance += current_chance;
			boolean selected = cumulated_chance/total_chance>threshold;
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
		// assert should never come here
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
		
		int iterations_total = 0;
	
		for( Phase phase : this.getPhases()) {
			// initialize the improvement
			phase.setPhaseStart(null);
			phase.setPhaseEnd(null);
			phase.setDurationTotal(0.0f);
			phase.setDurationAverage(0.0f);
			phase.setNrSteps(0);
			
			String message2 = String.format("Phase %s started", phase.getName());
			Plugin.INSTANCE.logInfo(message2);
			this.setProgress(message1, ++iterations_total);
			
			Date start = new Date();
			Date now = null;
			int nr_iterations = 0;
			boolean finished = false;
			long elapsed_millis = 0;
			do {
				// select a solution to improve
				Solution solution = this.selectGoodSolution().clone();
				Step step = LocalSearchFactory.eINSTANCE.createStep();
				phase.getSteps().add(step);
				phase.setCurrentSolution(solution);
				
				// all the work is here
				phase.doStep(step);
				
				// maintain the list of solutions, insert the solution after the next best
				ListIterator<Solution> iterator = this.getSolutions().listIterator();
				while ( iterator.hasNext()) {
					Solution next_solution = iterator.next();
					if ( solution.getScore().isBetter(next_solution.getScore())) {
						iterator.previous();
						break;
					}
				}
				iterator.add(solution);// owning
				
				// loop control
				nr_iterations++;
				now = new Date();
				elapsed_millis = now.getTime()-start.getTime();
				finished = nr_iterations>phase.getMaxSteps() || elapsed_millis>phase.getMaxSeconds()*1000;
				
				// feedback
				String message3 = String.format("Improvments=%s, iteration=%d/%d, seconds=%f/%f, score=%s", 
						phase.getName(),
						nr_iterations,
						phase.getMaxSteps(),
						elapsed_millis/1000.0f,
						phase.getMaxSeconds(),
						solution.getScore().getDescription());
				Plugin.INSTANCE.logInfo(message3);
				this.setProgress(message3, ++iterations_total);
				
				// prune the solution pool
				this.prune();

			} while ( !finished);
			
			phase.setPhaseStart(start);
			phase.setPhaseEnd(now);
			phase.setDurationTotal(elapsed_millis/1000);
			phase.setDurationAverage(elapsed_millis/1000/nr_iterations);
			phase.setNrSteps(nr_iterations);
			
			Plugin.INSTANCE.logInfo(String.format("Phase %s finished", phase.getName()));
		}
		Plugin.INSTANCE.logInfo(String.format("Strategy %s finished", this.getName()));
		
		return ReturnFeedback.SUCCESS;
	}
	
	/**
	 * 
	 */
	private void prune() {
		while ( this.getSolutions().size()>this.getMaxNrSolutions()) {
			Solution solution = this.selectBadSolution();
			this.getSolutions().remove(solution);
		}
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
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				return getSolutions();
			case LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR:
				return getCurrentSolutionNr();
			case LocalSearchPackage.STRATEGY__MAX_NR_SOLUTIONS:
				return getMaxNrSolutions();
			case LocalSearchPackage.STRATEGY__NAME:
				return getName();
			case LocalSearchPackage.STRATEGY__SELECT_BEST_CHANCE:
				return getSelectBestChance();
			case LocalSearchPackage.STRATEGY__SELECT_WORST_CHANCE:
				return getSelectWorstChance();
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
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				getSolutions().clear();
				getSolutions().addAll((Collection<? extends Solution>)newValue);
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
			case LocalSearchPackage.STRATEGY__SELECT_BEST_CHANCE:
				setSelectBestChance((Double)newValue);
				return;
			case LocalSearchPackage.STRATEGY__SELECT_WORST_CHANCE:
				setSelectWorstChance((Double)newValue);
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
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				getSolutions().clear();
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
			case LocalSearchPackage.STRATEGY__SELECT_BEST_CHANCE:
				setSelectBestChance(SELECT_BEST_CHANCE_EDEFAULT);
				return;
			case LocalSearchPackage.STRATEGY__SELECT_WORST_CHANCE:
				setSelectWorstChance(SELECT_WORST_CHANCE_EDEFAULT);
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
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				return solutions != null && !solutions.isEmpty();
			case LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR:
				return currentSolutionNr != CURRENT_SOLUTION_NR_EDEFAULT;
			case LocalSearchPackage.STRATEGY__MAX_NR_SOLUTIONS:
				return maxNrSolutions != MAX_NR_SOLUTIONS_EDEFAULT;
			case LocalSearchPackage.STRATEGY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LocalSearchPackage.STRATEGY__SELECT_BEST_CHANCE:
				return selectBestChance != SELECT_BEST_CHANCE_EDEFAULT;
			case LocalSearchPackage.STRATEGY__SELECT_WORST_CHANCE:
				return selectWorstChance != SELECT_WORST_CHANCE_EDEFAULT;
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
			case LocalSearchPackage.STRATEGY___SELECT_GOOD_SOLUTION:
				return selectGoodSolution();
			case LocalSearchPackage.STRATEGY___SELECT_BAD_SOLUTION:
				return selectBadSolution();
			case LocalSearchPackage.STRATEGY___SORT_SOLUTIONS:
				sortSolutions();
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
		result.append(" (CurrentSolutionNr: ");
		result.append(currentSolutionNr);
		result.append(", MaxNrSolutions: ");
		result.append(maxNrSolutions);
		result.append(", Name: ");
		result.append(name);
		result.append(", SelectBestChance: ");
		result.append(selectBestChance);
		result.append(", SelectWorstChance: ");
		result.append(selectWorstChance);
		result.append(')');
		return result.toString();
	}

} //StrategyImpl
