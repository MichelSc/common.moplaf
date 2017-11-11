/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Phase;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.Step;
import com.misc.common.moplaf.localsearch.Strategy;
import com.misc.common.moplaf.localsearch.StrategyLevel;
import com.misc.common.moplaf.propagator2.Plugin;

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
	protected static final int MAX_STEPS_EDEFAULT = 0;

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
	protected static final float MAX_SECONDS_EDEFAULT = 0.0F;

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
	 */
	public void doStep(Step step) {
		String message1 = String.format("Phase %s step %d started", this.getName(), this.getNrSteps());
		Plugin.INSTANCE.logInfo(message1);

		this.doStepImpl(step);
	
		String message2 = String.format("Phase %s step %d finished", this.getName(), this.getNrSteps());
		Plugin.INSTANCE.logInfo(message2);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void doAction(Step step, Action action) {
		Phase phase = this;
		StrategyLevel keep_level = phase.getKeepLevel();
		boolean keep_solutions = keep_level.getValue()==StrategyLevel.LEVEL_ACTION_VALUE;
		boolean keep_action = keep_level.getValue()>=StrategyLevel.LEVEL_ACTION_VALUE;
		
		Solution solution = step.getCurrentSolution();
		
		// keep
		Solution start_kept_solution = null;
		if ( keep_solutions && step.getActions().isEmpty()) {
			// start solution
			start_kept_solution  = solution.clone();
			start_kept_solution .setAncestor(null);
		}

		// do the action
		action.setCurrentSolution(solution);
		action.initialize();
		action.run();
		action.finalize();
		action.setCurrentSolution(null);
		
		// keep
		if( keep_action ) {
			Strategy strategy = this.getStrategy();
			action.setActionNr(step.getActions().size());
			step.getActions().add(action); // owning
			if ( keep_solutions ) {
				// start solution
				action.setStartSolutionOwned(start_kept_solution);
				if ( action.getCurrentMove()!=null) {
					// new solution
					// end solution
					Solution start_solution = action.getStartSolution();
					Solution end_solution_kept = solution.clone();
					end_solution_kept.setSolutionNr(strategy.makeNewSolutionNr());
					end_solution_kept.setAncestor(start_solution); // owning
					action.setEndSolutionOwned(end_solution_kept);
				}
			}
		}
	}


	protected void doStepImpl(Step step) {
		
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
			case LocalSearchPackage.PHASE___DO_STEP__STEP:
				doStep((Step)arguments.get(0));
				return null;
			case LocalSearchPackage.PHASE___DO_ACTION__STEP_ACTION:
				doAction((Step)arguments.get(0), (Action)arguments.get(1));
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
		result.append(')');
		return result.toString();
	}

} //PhaseImpl
