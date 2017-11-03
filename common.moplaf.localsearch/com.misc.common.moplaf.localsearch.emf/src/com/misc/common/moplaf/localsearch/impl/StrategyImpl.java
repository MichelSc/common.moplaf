/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.localsearch.Improvment;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.Strategy;
import com.misc.common.moplaf.propagator2.Plugin;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getImprovments <em>Improvments</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getBestSolution <em>Best Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getCurrentSolutionNr <em>Current Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getMaxNrSolutions <em>Max Nr Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getSelectChance <em>Select Chance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StrategyImpl extends MinimalEObjectImpl.Container implements Strategy {
	/**
	 * The cached value of the '{@link #getImprovments() <em>Improvments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImprovments()
	 * @generated
	 * @ordered
	 */
	protected EList<Improvment> improvments;

	/**
	 * The cached value of the '{@link #getBestSolution() <em>Best Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestSolution()
	 * @generated
	 * @ordered
	 */
	protected Solution bestSolution;

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
	 * The default value of the '{@link #getSelectChance() <em>Select Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectChance()
	 * @generated
	 * @ordered
	 */
	protected static final double SELECT_CHANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSelectChance() <em>Select Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectChance()
	 * @generated
	 * @ordered
	 */
	protected double selectChance = SELECT_CHANCE_EDEFAULT;

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
	public EList<Improvment> getImprovments() {
		if (improvments == null) {
			improvments = new EObjectContainmentEList<Improvment>(Improvment.class, this, LocalSearchPackage.STRATEGY__IMPROVMENTS);
		}
		return improvments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getBestSolution() {
		if (bestSolution != null && bestSolution.eIsProxy()) {
			InternalEObject oldBestSolution = (InternalEObject)bestSolution;
			bestSolution = (Solution)eResolveProxy(oldBestSolution);
			if (bestSolution != oldBestSolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocalSearchPackage.STRATEGY__BEST_SOLUTION, oldBestSolution, bestSolution));
			}
		}
		return bestSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetBestSolution() {
		return bestSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBestSolution(Solution newBestSolution) {
		Solution oldBestSolution = bestSolution;
		bestSolution = newBestSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.STRATEGY__BEST_SOLUTION, oldBestSolution, bestSolution));
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
	 * @generated
	 */
	public double getSelectChance() {
		return selectChance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectChance(double newSelectChance) {
		double oldSelectChance = selectChance;
		selectChance = newSelectChance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.STRATEGY__SELECT_CHANCE, oldSelectChance, selectChance));
	}

	private static Random random = new Random();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Solution selectSolutionToImprove() {
		// sort the solution from the best to the worst, thus by descending score
		LinkedList<Solution> sorted_list = new LinkedList<Solution>(this.getSolutions());
		sorted_list.sort((sol1, sol2)->Float.compare(sol2.getScore().getScore(), sol1.getScore().getScore()));
		
		while ( true ) {
			// forever
			// traverse the solutions from best to worst
			double threshold = random.nextDouble();
			double select_chance = this.getSelectChance(); // probability to select a solution; the higher, the more chance to get the best solution
			double cumulated_chance = 0.0d; // chance to select one of the previous solutions
			for ( Solution current_solution : sorted_list) {
				double current_chance = (1-cumulated_chance)*select_chance;
				cumulated_chance += current_chance;
				if ( cumulated_chance>threshold) {
					return current_solution;
				} 
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void run() {
		Plugin.INSTANCE.logInfo(String.format("Strategy %s started", this.getName()));

		for( Improvment improvment : this.getImprovments()) {
			Plugin.INSTANCE.logInfo(String.format("Improvments %s started", improvment.getName()));
			Date start = new Date();
			Date now = null;
			int nr_iterations = 0;
			boolean finished = false;
			long elapsed_millis = 0;
			do {
				// select a solution to improve
				Solution solution = this.selectSolutionToImprove().clone();
				improvment.setSolution(solution);
				improvment.doIteration();
				// prune the solution pool
				this.prune();
				// loop control
				nr_iterations++;
				now = new Date();
				elapsed_millis = now.getTime()-start.getTime();
				finished = nr_iterations>improvment.getMaxIterations() || elapsed_millis>improvment.getMaxSeconds()*1000;
			} while ( !finished);
			improvment.setImprovmentsStart(start);
			improvment.setImprovmentsEnd(now);
			improvment.setDurationTotal(elapsed_millis/1000);
			improvment.setDurationAverage(elapsed_millis/1000/nr_iterations);
			improvment.setIterations(nr_iterations);
			
			Plugin.INSTANCE.logInfo(String.format("Improvments %s finished", improvment.getName()));
		}
		Plugin.INSTANCE.logInfo(String.format("Strategy %s finished", this.getName()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void prune() {
		// default implementation does nothing
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
			case LocalSearchPackage.STRATEGY__IMPROVMENTS:
				return ((InternalEList<?>)getImprovments()).basicRemove(otherEnd, msgs);
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
			case LocalSearchPackage.STRATEGY__IMPROVMENTS:
				return getImprovments();
			case LocalSearchPackage.STRATEGY__BEST_SOLUTION:
				if (resolve) return getBestSolution();
				return basicGetBestSolution();
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				return getSolutions();
			case LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR:
				return getCurrentSolutionNr();
			case LocalSearchPackage.STRATEGY__MAX_NR_SOLUTIONS:
				return getMaxNrSolutions();
			case LocalSearchPackage.STRATEGY__NAME:
				return getName();
			case LocalSearchPackage.STRATEGY__SELECT_CHANCE:
				return getSelectChance();
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
			case LocalSearchPackage.STRATEGY__IMPROVMENTS:
				getImprovments().clear();
				getImprovments().addAll((Collection<? extends Improvment>)newValue);
				return;
			case LocalSearchPackage.STRATEGY__BEST_SOLUTION:
				setBestSolution((Solution)newValue);
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
			case LocalSearchPackage.STRATEGY__SELECT_CHANCE:
				setSelectChance((Double)newValue);
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
			case LocalSearchPackage.STRATEGY__IMPROVMENTS:
				getImprovments().clear();
				return;
			case LocalSearchPackage.STRATEGY__BEST_SOLUTION:
				setBestSolution((Solution)null);
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
			case LocalSearchPackage.STRATEGY__SELECT_CHANCE:
				setSelectChance(SELECT_CHANCE_EDEFAULT);
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
			case LocalSearchPackage.STRATEGY__IMPROVMENTS:
				return improvments != null && !improvments.isEmpty();
			case LocalSearchPackage.STRATEGY__BEST_SOLUTION:
				return bestSolution != null;
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				return solutions != null && !solutions.isEmpty();
			case LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR:
				return currentSolutionNr != CURRENT_SOLUTION_NR_EDEFAULT;
			case LocalSearchPackage.STRATEGY__MAX_NR_SOLUTIONS:
				return maxNrSolutions != MAX_NR_SOLUTIONS_EDEFAULT;
			case LocalSearchPackage.STRATEGY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LocalSearchPackage.STRATEGY__SELECT_CHANCE:
				return selectChance != SELECT_CHANCE_EDEFAULT;
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
			case LocalSearchPackage.STRATEGY___SELECT_SOLUTION_TO_IMPROVE:
				return selectSolutionToImprove();
			case LocalSearchPackage.STRATEGY___RUN:
				run();
				return null;
			case LocalSearchPackage.STRATEGY___PRUNE:
				prune();
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
		result.append(", SelectChance: ");
		result.append(selectChance);
		result.append(')');
		return result.toString();
	}

} //StrategyImpl
