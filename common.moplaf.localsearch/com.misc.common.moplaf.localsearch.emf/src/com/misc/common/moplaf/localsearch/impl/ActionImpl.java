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

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.Delta;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Phase;
import com.misc.common.moplaf.localsearch.Plugin;
import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.SolutionChange;
import com.misc.common.moplaf.localsearch.Step;
import com.misc.common.moplaf.localsearch.Strategy;
import com.misc.common.moplaf.localsearch.StrategyLevel;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getStartDeltas <em>Start Deltas</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getCurrentDelta <em>Current Delta</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getValidFeedback <em>Valid Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getActionNr <em>Action Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends SolutionChangeImpl implements Action {
	/**
	 * The cached value of the '{@link #getStartDeltas() <em>Start Deltas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDeltas()
	 * @generated
	 * @ordered
	 */
	protected EList<Delta> startDeltas;

	/**
	 * The cached value of the '{@link #getCurrentDelta() <em>Current Delta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDelta()
	 * @generated
	 * @ordered
	 */
	protected Delta currentDelta;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValidFeedback() <em>Valid Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback VALID_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getActionNr() <em>Action Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionNr()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTION_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActionNr() <em>Action Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionNr()
	 * @generated
	 * @ordered
	 */
	protected int actionNr = ACTION_NR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocalSearchPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delta> getStartDeltas() {
		if (startDeltas == null) {
			startDeltas = new EObjectContainmentEList<Delta>(Delta.class, this, LocalSearchPackage.ACTION__START_DELTAS);
		}
		return startDeltas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delta getCurrentDelta() {
		if (currentDelta != null && currentDelta.eIsProxy()) {
			InternalEObject oldCurrentDelta = (InternalEObject)currentDelta;
			currentDelta = (Delta)eResolveProxy(oldCurrentDelta);
			if (currentDelta != oldCurrentDelta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocalSearchPackage.ACTION__CURRENT_DELTA, oldCurrentDelta, currentDelta));
			}
		}
		return currentDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delta basicGetCurrentDelta() {
		return currentDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDelta(Delta newCurrentDelta) {
		Delta oldCurrentDelta = currentDelta;
		currentDelta = newCurrentDelta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.ACTION__CURRENT_DELTA, oldCurrentDelta, currentDelta));
	}

	@Override
	public SolutionChange basicGetSuperChange() {
		return this.getStep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public SolutionChange basicGetPreviousChange() {
		Step step = this.getStep();
		int index = step.getActions().indexOf(this);
		ListIterator<Action> list_iterator = step.getActions().listIterator(index);
		if ( list_iterator.hasPrevious()) {
			return list_iterator.previous();
		}
		return null;
	}


	@Override
	public StrategyLevel getLevel() {
		return StrategyLevel.LEVEL_ACTION;
	}

	@Override
	public boolean isKeepSolutions() {
		return this.getStep().getPhase().getKeepLevel().getValue()>=this.getLevel().getValue();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		// TODO: implement this method to return the 'Description' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isValid() {
		return this.getValidFeedback()==null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActionNr() {
		return actionNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionNr(int newActionNr) {
		int oldActionNr = actionNr;
		actionNr = newActionNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.ACTION__ACTION_NR, oldActionNr, actionNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getStep() {
		if (eContainerFeatureID() != LocalSearchPackage.ACTION__STEP) return null;
		return (Step)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(Step newStep, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStep, LocalSearchPackage.ACTION__STEP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(Step newStep) {
		if (newStep != eInternalContainer() || (eContainerFeatureID() != LocalSearchPackage.ACTION__STEP && newStep != null)) {
			if (EcoreUtil.isAncestor(this, newStep))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStep != null)
				msgs = ((InternalEObject)newStep).eInverseAdd(this, LocalSearchPackage.STEP__ACTIONS, Step.class, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.ACTION__STEP, newStep, newStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getResetEnabledFeedback() {
		return new EnabledFeedback(false, "not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getValidFeedback() {
		Solution solution = this.getCurrentSolution();
		if ( solution==null) {
			return new EnabledFeedback(false, "No current solution associated with the action");
		}
		return EnabledFeedback.NOFEEDBACK;
	}
	
	/*
	 * 
	 */
	protected void initializeImpl() {
		// default does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void initialize() {
		this.initializeImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void run() {
		Plugin.INSTANCE.logInfo(String.format("Action run: %s", this.getDescription()));
		for (Delta startDelta : this.getStartDeltas()) {
			this.runDoDelta(startDelta);
		}
	}
	
	private void runDoDelta(Delta delta) {
		// do the move
		delta.do_();
		
		// do the next moves
		for ( Delta nextDelta : delta.getNextDeltas()) {
			this.runDoDelta(nextDelta);
		}
		
		// undo the move
		delta.undo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void finalize() {
		Delta best_delta = null;
		for (Delta startDelta : this.getStartDeltas()) {
			best_delta = this.finalizeDelta(best_delta, startDelta); 
		}
		this.select(best_delta);
	}

	private Delta finalizeDelta(Delta best_delta, Delta current_delta) {
		Delta new_best_delta = best_delta;
		if ( current_delta.isSolution()) {
			Score current_score = current_delta.getScore();
			if ( current_delta.getScore().isFeasible() ) {
				if ( best_delta == null ){
					new_best_delta = current_delta;
				} else {
					Score best_score = best_delta.getScore();
					if ( current_score.isBetter(best_score)) {
						new_best_delta = current_delta;
					}
				}
			}
		}
		for ( Delta child_move : current_delta.getNextDeltas()) {
			new_best_delta = this.finalizeDelta(new_best_delta, child_move);
		}
		return new_best_delta;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void select(Delta target_delta) {
		Delta next_move = this.getNextDelta(target_delta);
		while ( next_move==null && this.getCurrentDelta()!=target_delta) {
			this.getCurrentDelta().undo();
			next_move = this.getNextDelta(target_delta);
		}
		while ( this.getCurrentDelta()!=target_delta ) {
			next_move.do_();
			next_move = this.getNextDelta(target_delta);
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void doAction(Phase phase, Step step) {
		Strategy strategy = phase.getStrategy();
		Solution solution = step.getCurrentSolution();
		boolean keep_action = phase.getKeepLevel().getValue()>=StrategyLevel.LEVEL_ACTION_VALUE;

		// keep or not keep
		if ( keep_action) {
			Solution start_solution = solution.clone();
			this.setStartSolutionOwned(start_solution);
		}

		// do the action
		this.setCurrentSolution(solution);
		this.initialize();
		this.run();
		this.finalize();

		// new solution
		if ( this.getCurrentDelta()!=null) {
			int new_solution_nr = strategy.makeNewSolutionNr();
			solution.setSolutionNr(new_solution_nr);
			step.setNewSolution(true);
			this.setNewSolution(true);
		}
		
		// keep or not keep
		Solution next_solution = solution;
		if ( keep_action) {
			this.setActionNr(step.getActions().size());
			step.getActions().add(this); // owning
			next_solution = solution.clone();
			this.setEndSolutionOwned(solution); // take ownership
		}
		step.setCurrentSolution(next_solution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocalSearchPackage.ACTION__STEP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStep((Step)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * Return the next move with respect to the current move on the path to the target move
	 * Return null if target_move is not accessible from the current move
	 * Return null if target_move is the current node
	 * @param target_delta
	 * @return
	 */
	private Delta getNextDelta(Delta target_delta) {
		if ( target_delta == null || target_delta == this.getCurrentDelta()) {
			return null;
		}
			
		Delta previous_delta = target_delta.getPreviousDelta();
		if ( previous_delta == this.getCurrentDelta()) {
			return target_delta;
		} else if ( previous_delta == null) {
			return null;
		} else {
			return this.getNextDelta(previous_delta);
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocalSearchPackage.ACTION__START_DELTAS:
				return ((InternalEList<?>)getStartDeltas()).basicRemove(otherEnd, msgs);
			case LocalSearchPackage.ACTION__STEP:
				return basicSetStep(null, msgs);
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
			case LocalSearchPackage.ACTION__STEP:
				return eInternalContainer().eInverseRemove(this, LocalSearchPackage.STEP__ACTIONS, Step.class, msgs);
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
			case LocalSearchPackage.ACTION__START_DELTAS:
				return getStartDeltas();
			case LocalSearchPackage.ACTION__CURRENT_DELTA:
				if (resolve) return getCurrentDelta();
				return basicGetCurrentDelta();
			case LocalSearchPackage.ACTION__DESCRIPTION:
				return getDescription();
			case LocalSearchPackage.ACTION__VALID_FEEDBACK:
				return getValidFeedback();
			case LocalSearchPackage.ACTION__ACTION_NR:
				return getActionNr();
			case LocalSearchPackage.ACTION__STEP:
				return getStep();
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
			case LocalSearchPackage.ACTION__START_DELTAS:
				getStartDeltas().clear();
				getStartDeltas().addAll((Collection<? extends Delta>)newValue);
				return;
			case LocalSearchPackage.ACTION__CURRENT_DELTA:
				setCurrentDelta((Delta)newValue);
				return;
			case LocalSearchPackage.ACTION__ACTION_NR:
				setActionNr((Integer)newValue);
				return;
			case LocalSearchPackage.ACTION__STEP:
				setStep((Step)newValue);
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
			case LocalSearchPackage.ACTION__START_DELTAS:
				getStartDeltas().clear();
				return;
			case LocalSearchPackage.ACTION__CURRENT_DELTA:
				setCurrentDelta((Delta)null);
				return;
			case LocalSearchPackage.ACTION__ACTION_NR:
				setActionNr(ACTION_NR_EDEFAULT);
				return;
			case LocalSearchPackage.ACTION__STEP:
				setStep((Step)null);
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
			case LocalSearchPackage.ACTION__START_DELTAS:
				return startDeltas != null && !startDeltas.isEmpty();
			case LocalSearchPackage.ACTION__CURRENT_DELTA:
				return currentDelta != null;
			case LocalSearchPackage.ACTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case LocalSearchPackage.ACTION__VALID_FEEDBACK:
				return VALID_FEEDBACK_EDEFAULT == null ? getValidFeedback() != null : !VALID_FEEDBACK_EDEFAULT.equals(getValidFeedback());
			case LocalSearchPackage.ACTION__ACTION_NR:
				return actionNr != ACTION_NR_EDEFAULT;
			case LocalSearchPackage.ACTION__STEP:
				return getStep() != null;
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
			case LocalSearchPackage.ACTION___INITIALIZE:
				initialize();
				return null;
			case LocalSearchPackage.ACTION___RUN:
				run();
				return null;
			case LocalSearchPackage.ACTION___FINALIZE:
				finalize();
				return null;
			case LocalSearchPackage.ACTION___SELECT__DELTA:
				select((Delta)arguments.get(0));
				return null;
			case LocalSearchPackage.ACTION___DO_ACTION__PHASE_STEP:
				doAction((Phase)arguments.get(0), (Step)arguments.get(1));
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
		result.append(" (ActionNr: ");
		result.append(actionNr);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
