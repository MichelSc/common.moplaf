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
import com.misc.common.moplaf.localsearch.Phase;
import com.misc.common.moplaf.localsearch.Plugin;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.SolutionRef;
import com.misc.common.moplaf.localsearch.Step;
import com.misc.common.moplaf.localsearch.Strategy;
import com.misc.common.moplaf.localsearch.StrategyLevel;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl#getKeepLevel <em>Keep Level</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl#getMaxSteps <em>Max Steps</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl#getMaxSeconds <em>Max Seconds</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl#getPhaseStart <em>Phase Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl#getPhaseEnd <em>Phase End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl#getNrSteps <em>Nr Steps</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl#getDurationTotal <em>Duration Total</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl#getDurationAverage <em>Duration Average</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl#getSelectBestChance <em>Select Best Chance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.PhaseImpl#getSelectWorstChance <em>Select Worst Chance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PhaseImpl extends MinimalEObjectImpl.Container implements Phase {
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
	 * The default value of the '{@link #getKeepLevel() <em>Keep Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepLevel()
	 * @generated
	 * @ordered
	 */
	protected static final StrategyLevel KEEP_LEVEL_EDEFAULT = StrategyLevel.LEVEL_NONE;

	/**
	 * The cached value of the '{@link #getKeepLevel() <em>Keep Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepLevel()
	 * @generated
	 * @ordered
	 */
	protected StrategyLevel keepLevel = KEEP_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSteps() <em>Max Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSteps()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_STEPS_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getMaxSteps() <em>Max Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSteps()
	 * @generated
	 * @ordered
	 */
	protected int maxSteps = MAX_STEPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSeconds() <em>Max Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_SECONDS_EDEFAULT = 60.0F;

	/**
	 * The cached value of the '{@link #getMaxSeconds() <em>Max Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSeconds()
	 * @generated
	 * @ordered
	 */
	protected float maxSeconds = MAX_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseStart() <em>Phase Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date PHASE_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseStart() <em>Phase Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseStart()
	 * @generated
	 * @ordered
	 */
	protected Date phaseStart = PHASE_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseEnd() <em>Phase End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date PHASE_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseEnd() <em>Phase End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseEnd()
	 * @generated
	 * @ordered
	 */
	protected Date phaseEnd = PHASE_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getNrSteps() <em>Nr Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrSteps()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_STEPS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrSteps() <em>Nr Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrSteps()
	 * @generated
	 * @ordered
	 */
	protected int nrSteps = NR_STEPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationTotal() <em>Duration Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationTotal()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_TOTAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDurationTotal() <em>Duration Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationTotal()
	 * @generated
	 * @ordered
	 */
	protected float durationTotal = DURATION_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationAverage() <em>Duration Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationAverage()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_AVERAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDurationAverage() <em>Duration Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationAverage()
	 * @generated
	 * @ordered
	 */
	protected float durationAverage = DURATION_AVERAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

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
	protected PhaseImpl() {
		super();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocalSearchPackage.Literals.PHASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.PHASE__NAME, oldName, name));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyLevel getKeepLevel() {
		return keepLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeepLevel(StrategyLevel newKeepLevel) {
		StrategyLevel oldKeepLevel = keepLevel;
		keepLevel = newKeepLevel == null ? KEEP_LEVEL_EDEFAULT : newKeepLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.PHASE__KEEP_LEVEL, oldKeepLevel, keepLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSteps() {
		return maxSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSteps(int newMaxSteps) {
		int oldMaxSteps = maxSteps;
		maxSteps = newMaxSteps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.PHASE__MAX_STEPS, oldMaxSteps, maxSteps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxSeconds() {
		return maxSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSeconds(float newMaxSeconds) {
		float oldMaxSeconds = maxSeconds;
		maxSeconds = newMaxSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.PHASE__MAX_SECONDS, oldMaxSeconds, maxSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPhaseStart() {
		return phaseStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseStart(Date newPhaseStart) {
		Date oldPhaseStart = phaseStart;
		phaseStart = newPhaseStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.PHASE__PHASE_START, oldPhaseStart, phaseStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPhaseEnd() {
		return phaseEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseEnd(Date newPhaseEnd) {
		Date oldPhaseEnd = phaseEnd;
		phaseEnd = newPhaseEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.PHASE__PHASE_END, oldPhaseEnd, phaseEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrSteps() {
		return nrSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrSteps(int newNrSteps) {
		int oldNrSteps = nrSteps;
		nrSteps = newNrSteps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.PHASE__NR_STEPS, oldNrSteps, nrSteps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDurationTotal() {
		return durationTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationTotal(float newDurationTotal) {
		float oldDurationTotal = durationTotal;
		durationTotal = newDurationTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.PHASE__DURATION_TOTAL, oldDurationTotal, durationTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDurationAverage() {
		return durationAverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationAverage(float newDurationAverage) {
		float oldDurationAverage = durationAverage;
		durationAverage = newDurationAverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.PHASE__DURATION_AVERAGE, oldDurationAverage, durationAverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy getStrategy() {
		if (eContainerFeatureID() != LocalSearchPackage.PHASE__STRATEGY) return null;
		return (Strategy)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategy(Strategy newStrategy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStrategy, LocalSearchPackage.PHASE__STRATEGY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(Strategy newStrategy) {
		if (newStrategy != eInternalContainer() || (eContainerFeatureID() != LocalSearchPackage.PHASE__STRATEGY && newStrategy != null)) {
			if (EcoreUtil.isAncestor(this, newStrategy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStrategy != null)
				msgs = ((InternalEObject)newStrategy).eInverseAdd(this, LocalSearchPackage.STRATEGY__PHASES, Strategy.class, msgs);
			msgs = basicSetStrategy(newStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.PHASE__STRATEGY, newStrategy, newStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentWithInverseEList<Step>(Step.class, this, LocalSearchPackage.PHASE__STEPS, LocalSearchPackage.STEP__PHASE);
		}
		return steps;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.PHASE__SELECT_BEST_CHANCE, oldSelectBestChance, selectBestChance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.PHASE__SELECT_WORST_CHANCE, oldSelectWorstChance, selectWorstChance));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void doPhase() {
		Phase phase = this;
		Strategy strategy = phase.getStrategy();
		int iterations_total = 0;
		
		// initialize the improvement
		phase.setPhaseStart(null);
		phase.setPhaseEnd(null);
		phase.setDurationTotal(0.0f);
		phase.setDurationAverage(0.0f);
		phase.setNrSteps(0);
		
		String message2 = String.format("Phase %s started", phase.getName());
		Plugin.INSTANCE.logInfo(message2);
		strategy.setProgress(message2, ++iterations_total);
		
		Date start = new Date();
		Date end = null;
		int nr_iterations = 0;
		boolean finished = false;
		long elapsed_millis = 0;
		do {
			// select a solution to improve
			SolutionRef pool_ref = strategy.selectGoodSolution(this.getSelectBestChance());
			if ( pool_ref==null ) {
				Plugin.INSTANCE.logError(String.format("Phase%s, step %04d: no start solution, break", phase.getName(), nr_iterations));
				finished = true;
				break;
			}
			Solution new_solution = pool_ref.getSolution().clone();
			
			boolean keep_step          = phase.getKeepLevel().getValue()>=StrategyLevel.LEVEL_STEP_VALUE;
			boolean keep_step_solution = phase.getKeepLevel().getValue()==StrategyLevel.LEVEL_STEP_VALUE; 

			// create the step
			Step step = this.constructStep();
			if ( keep_step ) {
				this.getSteps().add(step);
			}
			String step_name = String.format("%s:%04d", this.getName(), nr_iterations);
			step.setStep(step_name);
			step.setStepNr(nr_iterations);
			step.setKeepSolutions(keep_step_solution);
			this.setNrSteps(nr_iterations);
			
			// do the step
			step.setCurrentSolution(new_solution, false); 
			step.doStep(phase);

			// put solution in pool
			boolean is_better = step.isNewSolution();
			if ( is_better ) {
				strategy.addPoolSolution(new_solution, false);
				// prune the solution pool
				strategy.prune(this.getSelectWorstChance());
			}
			
			// loop control
			nr_iterations++;
			end = new Date();
			elapsed_millis = end.getTime()-start.getTime();
			
			// feedback
			String message3 = String.format("phase=%s, iteration=%d/%d, seconds=%f/%f, score=%s, better=%b", 
					phase.getName(),
					nr_iterations,
					phase.getMaxSteps(),
					elapsed_millis/1000.0f,
					phase.getMaxSeconds(),
					new_solution.getScore().getDescription(),
					is_better);
			Plugin.INSTANCE.logInfo(message3);
			strategy.setProgress(message3, ++iterations_total);

			// is finished 
			if ( nr_iterations>=phase.getMaxSteps() ) {
				finished = true;
				Plugin.INSTANCE.logInfo("Phase finished, maxNrIterations reached");
			} else if (elapsed_millis>phase.getMaxSeconds()*1000 ){
				finished = true;
				Plugin.INSTANCE.logInfo("Phase finished, maxSecondsreached");
			} else if (strategy.isCancelled() ){
				finished = true;
				Plugin.INSTANCE.logInfo("Phase finished, cancelled");
			} 

		} while ( !finished); // loop on the steps
		
		// the phase is done
		phase.setPhaseStart(start);
		phase.setPhaseEnd(end);
		phase.setDurationTotal(elapsed_millis/1000);
		phase.setDurationAverage(nr_iterations==0 ? 0.0f: elapsed_millis/1000/nr_iterations);
		phase.setNrSteps(nr_iterations);
	}
	
	protected Step constructStep() {
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
			case LocalSearchPackage.PHASE__STRATEGY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStrategy((Strategy)otherEnd, msgs);
			case LocalSearchPackage.PHASE__STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteps()).basicAdd(otherEnd, msgs);
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
			case LocalSearchPackage.PHASE__STRATEGY:
				return basicSetStrategy(null, msgs);
			case LocalSearchPackage.PHASE__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case LocalSearchPackage.PHASE__STRATEGY:
				return eInternalContainer().eInverseRemove(this, LocalSearchPackage.STRATEGY__PHASES, Strategy.class, msgs);
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
			case LocalSearchPackage.PHASE__NAME:
				return getName();
			case LocalSearchPackage.PHASE__KEEP_LEVEL:
				return getKeepLevel();
			case LocalSearchPackage.PHASE__MAX_STEPS:
				return getMaxSteps();
			case LocalSearchPackage.PHASE__MAX_SECONDS:
				return getMaxSeconds();
			case LocalSearchPackage.PHASE__PHASE_START:
				return getPhaseStart();
			case LocalSearchPackage.PHASE__PHASE_END:
				return getPhaseEnd();
			case LocalSearchPackage.PHASE__NR_STEPS:
				return getNrSteps();
			case LocalSearchPackage.PHASE__DURATION_TOTAL:
				return getDurationTotal();
			case LocalSearchPackage.PHASE__DURATION_AVERAGE:
				return getDurationAverage();
			case LocalSearchPackage.PHASE__STRATEGY:
				return getStrategy();
			case LocalSearchPackage.PHASE__STEPS:
				return getSteps();
			case LocalSearchPackage.PHASE__SELECT_BEST_CHANCE:
				return getSelectBestChance();
			case LocalSearchPackage.PHASE__SELECT_WORST_CHANCE:
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
			case LocalSearchPackage.PHASE__NAME:
				setName((String)newValue);
				return;
			case LocalSearchPackage.PHASE__KEEP_LEVEL:
				setKeepLevel((StrategyLevel)newValue);
				return;
			case LocalSearchPackage.PHASE__MAX_STEPS:
				setMaxSteps((Integer)newValue);
				return;
			case LocalSearchPackage.PHASE__MAX_SECONDS:
				setMaxSeconds((Float)newValue);
				return;
			case LocalSearchPackage.PHASE__PHASE_START:
				setPhaseStart((Date)newValue);
				return;
			case LocalSearchPackage.PHASE__PHASE_END:
				setPhaseEnd((Date)newValue);
				return;
			case LocalSearchPackage.PHASE__NR_STEPS:
				setNrSteps((Integer)newValue);
				return;
			case LocalSearchPackage.PHASE__DURATION_TOTAL:
				setDurationTotal((Float)newValue);
				return;
			case LocalSearchPackage.PHASE__DURATION_AVERAGE:
				setDurationAverage((Float)newValue);
				return;
			case LocalSearchPackage.PHASE__STRATEGY:
				setStrategy((Strategy)newValue);
				return;
			case LocalSearchPackage.PHASE__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case LocalSearchPackage.PHASE__SELECT_BEST_CHANCE:
				setSelectBestChance((Double)newValue);
				return;
			case LocalSearchPackage.PHASE__SELECT_WORST_CHANCE:
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
			case LocalSearchPackage.PHASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LocalSearchPackage.PHASE__KEEP_LEVEL:
				setKeepLevel(KEEP_LEVEL_EDEFAULT);
				return;
			case LocalSearchPackage.PHASE__MAX_STEPS:
				setMaxSteps(MAX_STEPS_EDEFAULT);
				return;
			case LocalSearchPackage.PHASE__MAX_SECONDS:
				setMaxSeconds(MAX_SECONDS_EDEFAULT);
				return;
			case LocalSearchPackage.PHASE__PHASE_START:
				setPhaseStart(PHASE_START_EDEFAULT);
				return;
			case LocalSearchPackage.PHASE__PHASE_END:
				setPhaseEnd(PHASE_END_EDEFAULT);
				return;
			case LocalSearchPackage.PHASE__NR_STEPS:
				setNrSteps(NR_STEPS_EDEFAULT);
				return;
			case LocalSearchPackage.PHASE__DURATION_TOTAL:
				setDurationTotal(DURATION_TOTAL_EDEFAULT);
				return;
			case LocalSearchPackage.PHASE__DURATION_AVERAGE:
				setDurationAverage(DURATION_AVERAGE_EDEFAULT);
				return;
			case LocalSearchPackage.PHASE__STRATEGY:
				setStrategy((Strategy)null);
				return;
			case LocalSearchPackage.PHASE__STEPS:
				getSteps().clear();
				return;
			case LocalSearchPackage.PHASE__SELECT_BEST_CHANCE:
				setSelectBestChance(SELECT_BEST_CHANCE_EDEFAULT);
				return;
			case LocalSearchPackage.PHASE__SELECT_WORST_CHANCE:
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
			case LocalSearchPackage.PHASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LocalSearchPackage.PHASE__KEEP_LEVEL:
				return keepLevel != KEEP_LEVEL_EDEFAULT;
			case LocalSearchPackage.PHASE__MAX_STEPS:
				return maxSteps != MAX_STEPS_EDEFAULT;
			case LocalSearchPackage.PHASE__MAX_SECONDS:
				return maxSeconds != MAX_SECONDS_EDEFAULT;
			case LocalSearchPackage.PHASE__PHASE_START:
				return PHASE_START_EDEFAULT == null ? phaseStart != null : !PHASE_START_EDEFAULT.equals(phaseStart);
			case LocalSearchPackage.PHASE__PHASE_END:
				return PHASE_END_EDEFAULT == null ? phaseEnd != null : !PHASE_END_EDEFAULT.equals(phaseEnd);
			case LocalSearchPackage.PHASE__NR_STEPS:
				return nrSteps != NR_STEPS_EDEFAULT;
			case LocalSearchPackage.PHASE__DURATION_TOTAL:
				return durationTotal != DURATION_TOTAL_EDEFAULT;
			case LocalSearchPackage.PHASE__DURATION_AVERAGE:
				return durationAverage != DURATION_AVERAGE_EDEFAULT;
			case LocalSearchPackage.PHASE__STRATEGY:
				return getStrategy() != null;
			case LocalSearchPackage.PHASE__STEPS:
				return steps != null && !steps.isEmpty();
			case LocalSearchPackage.PHASE__SELECT_BEST_CHANCE:
				return selectBestChance != SELECT_BEST_CHANCE_EDEFAULT;
			case LocalSearchPackage.PHASE__SELECT_WORST_CHANCE:
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
			case LocalSearchPackage.PHASE___DO_PHASE:
				doPhase();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", KeepLevel: ");
		result.append(keepLevel);
		result.append(", MaxSteps: ");
		result.append(maxSteps);
		result.append(", MaxSeconds: ");
		result.append(maxSeconds);
		result.append(", PhaseStart: ");
		result.append(phaseStart);
		result.append(", PhaseEnd: ");
		result.append(phaseEnd);
		result.append(", NrSteps: ");
		result.append(nrSteps);
		result.append(", DurationTotal: ");
		result.append(durationTotal);
		result.append(", DurationAverage: ");
		result.append(durationAverage);
		result.append(", SelectBestChance: ");
		result.append(selectBestChance);
		result.append(", SelectWorstChance: ");
		result.append(selectWorstChance);
		result.append(')');
		return result.toString();
	}

} //PhaseImpl
