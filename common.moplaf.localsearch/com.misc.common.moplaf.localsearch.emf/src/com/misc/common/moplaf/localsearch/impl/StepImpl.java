/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Phase;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.SolutionChange;
import com.misc.common.moplaf.localsearch.Step;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StepImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StepImpl#getStepNr <em>Step Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StepImpl#getPhase <em>Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends SolutionChangeImpl implements Step {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The default value of the '{@link #getStepNr() <em>Step Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepNr()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStepNr() <em>Step Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepNr()
	 * @generated
	 * @ordered
	 */
	protected int stepNr = STEP_NR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocalSearchPackage.Literals.STEP;
	}

	@Override
	public EList<SolutionChange> getSubChanges() {
		// TODO Auto-generated method stub
		EList<SolutionChange> list = super.getSubChanges();
		for ( Action action: this.getActions()) {
			list.add(action);
		}
		return list;
	}

	@Override
	public StrategyLevel getLevel() {
		return StrategyLevel.LEVEL_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public SolutionChange basicGetPreviousChange() {
		Phase phase = this.getPhase();
		int index = phase.getSteps().indexOf(this);
		ListIterator<Step> list_iterator = phase.getSteps().listIterator(index);
		if ( list_iterator.hasPrevious()) {
			return list_iterator.previous();
		}
		
		return null;
		
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectWithInverseResolvingEList<Action>(Action.class, this, LocalSearchPackage.STEP__ACTIONS, LocalSearchPackage.ACTION__STEP);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStepNr() {
		return stepNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepNr(int newStepNr) {
		int oldStepNr = stepNr;
		stepNr = newStepNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.STEP__STEP_NR, oldStepNr, stepNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase getPhase() {
		if (eContainerFeatureID() != LocalSearchPackage.STEP__PHASE) return null;
		return (Phase)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhase(Phase newPhase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPhase, LocalSearchPackage.STEP__PHASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(Phase newPhase) {
		if (newPhase != eInternalContainer() || (eContainerFeatureID() != LocalSearchPackage.STEP__PHASE && newPhase != null)) {
			if (EcoreUtil.isAncestor(this, newPhase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPhase != null)
				msgs = ((InternalEObject)newPhase).eInverseAdd(this, LocalSearchPackage.PHASE__STEPS, Phase.class, msgs);
			msgs = basicSetPhase(newPhase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.STEP__PHASE, newPhase, newPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void doAction(Action action) {
		Phase phase = this.getPhase();
		StrategyLevel keep_level = phase.getKeepLevel();
		Solution solution = this.getCurrentSolution();
		boolean keep_solutions = keep_level.getValue()==StrategyLevel.LEVEL_ACTION_VALUE;
		boolean keep_action = keep_level.getValue()>=StrategyLevel.LEVEL_ACTION_VALUE;
		
		Solution start_kept_solution = null;
		if ( keep_solutions && this.getPreviousChange()==null) {
			// start solution
			Solution start_solution_kept = solution.clone();
			start_solution_kept.setAncestor(null);
		}

		// do the action
		action.setCurrentSolution(this.getCurrentSolution());
		action.initialize();
		action.run();
		action.finalize();
		action.setCurrentSolution(null);
		
		if( keep_action ) {
			this.getActions().add(action); // owning
			action.setActionNr(this.getActions().size());
			if ( keep_solutions ) {
				// start solution
				action.setStartSolutionOwned(start_kept_solution);
				// end solution
				Solution end_solution_kept = solution.clone();
				action.setEndSolutionOwned(end_solution_kept);
				end_solution_kept.setAncestor(start_kept_solution); // owning
			}
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
			case LocalSearchPackage.STEP__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
			case LocalSearchPackage.STEP__PHASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPhase((Phase)otherEnd, msgs);
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
			case LocalSearchPackage.STEP__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case LocalSearchPackage.STEP__PHASE:
				return basicSetPhase(null, msgs);
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
			case LocalSearchPackage.STEP__PHASE:
				return eInternalContainer().eInverseRemove(this, LocalSearchPackage.PHASE__STEPS, Phase.class, msgs);
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
			case LocalSearchPackage.STEP__ACTIONS:
				return getActions();
			case LocalSearchPackage.STEP__STEP_NR:
				return getStepNr();
			case LocalSearchPackage.STEP__PHASE:
				return getPhase();
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
			case LocalSearchPackage.STEP__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case LocalSearchPackage.STEP__STEP_NR:
				setStepNr((Integer)newValue);
				return;
			case LocalSearchPackage.STEP__PHASE:
				setPhase((Phase)newValue);
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
			case LocalSearchPackage.STEP__ACTIONS:
				getActions().clear();
				return;
			case LocalSearchPackage.STEP__STEP_NR:
				setStepNr(STEP_NR_EDEFAULT);
				return;
			case LocalSearchPackage.STEP__PHASE:
				setPhase((Phase)null);
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
			case LocalSearchPackage.STEP__ACTIONS:
				return actions != null && !actions.isEmpty();
			case LocalSearchPackage.STEP__STEP_NR:
				return stepNr != STEP_NR_EDEFAULT;
			case LocalSearchPackage.STEP__PHASE:
				return getPhase() != null;
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
			case LocalSearchPackage.STEP___DO_ACTION__ACTION:
				doAction((Action)arguments.get(0));
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
		result.append(" (StepNr: ");
		result.append(stepNr);
		result.append(')');
		return result.toString();
	}

} //StepImpl
