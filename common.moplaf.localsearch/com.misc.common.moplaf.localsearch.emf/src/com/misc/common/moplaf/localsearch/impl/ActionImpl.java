/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Move;
import com.misc.common.moplaf.localsearch.Plugin;
import com.misc.common.moplaf.localsearch.Score;
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
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getRootMoves <em>Root Moves</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getCurrentMove <em>Current Move</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getValidFeedback <em>Valid Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getActionNr <em>Action Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends SolutionChangeImpl implements Action {
	/**
	 * The cached value of the '{@link #getRootMoves() <em>Root Moves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootMoves()
	 * @generated
	 * @ordered
	 */
	protected EList<Move> rootMoves;

	/**
	 * The cached value of the '{@link #getCurrentMove() <em>Current Move</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMove()
	 * @generated
	 * @ordered
	 */
	protected Move currentMove;

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
	 * The default value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALID_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getValidFeedback() <em>Valid Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_FEEDBACK_EDEFAULT = null;

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
		Step previous_step = (Step) step.getPreviousChange();
		if ( previous_step!=null) {
			int nof_actions = previous_step.getActions().size();
			return previous_step.getActions().get(nof_actions-1);
		}
		return null;
	}


	@Override
	public StrategyLevel getLevel() {
		return StrategyLevel.LEVEL_ACTION;
	}

	@Override
	public boolean isKeepSolutions() {
		return this.getStep().getPhase().getKeepLevel()==this.getLevel();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Move> getRootMoves() {
		if (rootMoves == null) {
			rootMoves = new EObjectContainmentEList<Move>(Move.class, this, LocalSearchPackage.ACTION__ROOT_MOVES);
		}
		return rootMoves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move getCurrentMove() {
		if (currentMove != null && currentMove.eIsProxy()) {
			InternalEObject oldCurrentMove = (InternalEObject)currentMove;
			currentMove = (Move)eResolveProxy(oldCurrentMove);
			if (currentMove != oldCurrentMove) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocalSearchPackage.ACTION__CURRENT_MOVE, oldCurrentMove, currentMove));
			}
		}
		return currentMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move basicGetCurrentMove() {
		return currentMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentMove(Move newCurrentMove) {
		Move oldCurrentMove = currentMove;
		currentMove = newCurrentMove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.ACTION__CURRENT_MOVE, oldCurrentMove, currentMove));
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
	public String getValidFeedback() {
		Solution solution = this.getCurrentSolution();
		if ( solution==null) {
			return "No current solution associated with the action";
		}
		return null;
	}
	
	/*
	 * 
	 */
	protected void createMovesImpl() {
		// default does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void initialize() {
		Plugin.INSTANCE.logInfo("Action initialize: called");
		this.createMovesImpl();
		Plugin.INSTANCE.logInfo("Action initialize: done");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void run() {
		Plugin.INSTANCE.logInfo("Action run: called");
		for (Move rootMove : this.getRootMoves()) {
			this.runDoMove(rootMove);
		}
		Plugin.INSTANCE.logInfo("Action run: done");
	}
	
	private void runDoMove(Move move) {
		Plugin.INSTANCE.logInfo("Action runMove: called, move: "+move.getDescription());
		// do the move
		move.do_();
		
		// do the next moves
		for ( Move nextMove : move.getNextMoves()) {
			this.runDoMove(nextMove);
		}
		
		// undo the move
		move.undo();

		Plugin.INSTANCE.logInfo("Action runMove: done, move: "+move.getDescription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void finalize() {
		Plugin.INSTANCE.logInfo("Action finalize: called");
		Move best_move = null;
		for (Move rootMove : this.getRootMoves()) {
			best_move = this.finalizeMove(best_move, rootMove); 
		}
		this.select(best_move);
		Plugin.INSTANCE.logInfo("Action finalize: done");
	}

	private Move finalizeMove(Move best_move, Move current_move) {
		Plugin.INSTANCE.logInfo("Action finalizeMove: called, move: "+current_move.getDescription());
		Move new_best_move = best_move;
		if ( current_move.isSolution()) {
			Score best_score = best_move == null ? this.getCurrentSolution().getScore() : best_move.getScore();
			Score current_score = current_move.getScore();
			if ( current_move.getScore().isFeasible() && current_score.isBetter(best_score)) {
				new_best_move = current_move;
			}
		}
		for ( Move child_move : current_move.getNextMoves()) {
			new_best_move = this.finalizeMove(new_best_move, child_move);
		}
		Plugin.INSTANCE.logInfo("Action finalizeMove: called, move: "+current_move.getDescription());
		return new_best_move;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void select(Move target_move) {
		Move next_move = this.getNextMove(target_move);
		while ( next_move==null && this.getCurrentMove()!=target_move) {
			this.getCurrentMove().undo();
			next_move = this.getNextMove(target_move);
		}
		while ( this.getCurrentMove()!=target_move ) {
			next_move.do_();
			next_move = this.getNextMove(target_move);
		}
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
	 * @param target_move
	 * @return
	 */
	private Move getNextMove(Move target_move) {
		if ( target_move == null || target_move == this.getCurrentMove()) {
			return null;
		}
			
		Move previous_move = target_move.getPrevious();
		if ( previous_move == this.getCurrentMove()) {
			return target_move;
		} else if ( previous_move == null) {
			return null;
		} else {
			return this.getNextMove(previous_move);
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
			case LocalSearchPackage.ACTION__ROOT_MOVES:
				return ((InternalEList<?>)getRootMoves()).basicRemove(otherEnd, msgs);
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
			case LocalSearchPackage.ACTION__ROOT_MOVES:
				return getRootMoves();
			case LocalSearchPackage.ACTION__CURRENT_MOVE:
				if (resolve) return getCurrentMove();
				return basicGetCurrentMove();
			case LocalSearchPackage.ACTION__DESCRIPTION:
				return getDescription();
			case LocalSearchPackage.ACTION__VALID:
				return isValid();
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
			case LocalSearchPackage.ACTION__ROOT_MOVES:
				getRootMoves().clear();
				getRootMoves().addAll((Collection<? extends Move>)newValue);
				return;
			case LocalSearchPackage.ACTION__CURRENT_MOVE:
				setCurrentMove((Move)newValue);
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
			case LocalSearchPackage.ACTION__ROOT_MOVES:
				getRootMoves().clear();
				return;
			case LocalSearchPackage.ACTION__CURRENT_MOVE:
				setCurrentMove((Move)null);
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
			case LocalSearchPackage.ACTION__ROOT_MOVES:
				return rootMoves != null && !rootMoves.isEmpty();
			case LocalSearchPackage.ACTION__CURRENT_MOVE:
				return currentMove != null;
			case LocalSearchPackage.ACTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case LocalSearchPackage.ACTION__VALID:
				return isValid() != VALID_EDEFAULT;
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
			case LocalSearchPackage.ACTION___SELECT__MOVE:
				select((Move)arguments.get(0));
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
