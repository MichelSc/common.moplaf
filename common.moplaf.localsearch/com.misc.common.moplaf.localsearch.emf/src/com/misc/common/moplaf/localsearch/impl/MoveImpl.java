/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Move;

import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.Plugin;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.MoveImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.MoveImpl#getDoEnabledFeedback <em>Do Enabled Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.MoveImpl#getUndoEnabledFeedback <em>Undo Enabled Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.MoveImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.MoveImpl#getNextMoves <em>Next Moves</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.MoveImpl#getScore <em>Score</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.MoveImpl#getAction <em>Action</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.MoveImpl#isCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MoveImpl extends MinimalEObjectImpl.Container implements Move {
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
	 * The default value of the '{@link #getDoEnabledFeedback() <em>Do Enabled Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoEnabledFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback DO_ENABLED_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUndoEnabledFeedback() <em>Undo Enabled Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndoEnabledFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback UNDO_ENABLED_FEEDBACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextMoves() <em>Next Moves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextMoves()
	 * @generated
	 * @ordered
	 */
	protected EList<Move> nextMoves;

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
	 * The default value of the '{@link #isCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CURRENT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocalSearchPackage.Literals.MOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Move> getNextMoves() {
		if (nextMoves == null) {
			nextMoves = new EObjectContainmentWithInverseEList<Move>(Move.class, this, LocalSearchPackage.MOVE__NEXT_MOVES, LocalSearchPackage.MOVE__PREVIOUS);
		}
		return nextMoves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move getPrevious() {
		if (eContainerFeatureID() != LocalSearchPackage.MOVE__PREVIOUS) return null;
		return (Move)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(Move newPrevious, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPrevious, LocalSearchPackage.MOVE__PREVIOUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(Move newPrevious) {
		if (newPrevious != eInternalContainer() || (eContainerFeatureID() != LocalSearchPackage.MOVE__PREVIOUS && newPrevious != null)) {
			if (EcoreUtil.isAncestor(this, newPrevious))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, LocalSearchPackage.MOVE__NEXT_MOVES, Move.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.MOVE__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isValid() {
		boolean valid = this.isValidFeedback()==null;
		return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getDoEnabledFeedback() {
		if ( !this.isValid()) {
			return new EnabledFeedback(false, this.isValidFeedback());
		}
		Move previous = this.getPrevious();
		Action action = this.basicGetAction();
		if ( previous==null) {
			// root move
			if ( action.getCurrentMove()==null) {
				return EnabledFeedback.NOFEEDBACK;
			} else {
				return new EnabledFeedback(false, "Other move is already current");
			}
		} else {
			// non root move
			if ( previous.isCurrent()) {
				return EnabledFeedback.NOFEEDBACK;
			} else {
				return new EnabledFeedback(false, "Other move than the previous is already current");
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getUndoEnabledFeedback() {
		if ( this.changes==null) {
			return new EnabledFeedback(false, "Not changes recorded");
		}
		if ( this.isCurrent()) {
			return EnabledFeedback.NOFEEDBACK;
		}
		return new EnabledFeedback(false, "Not the current move");
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocalSearchPackage.MOVE__SCORE, oldScore, newScore);
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
				msgs = ((InternalEObject)score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.MOVE__SCORE, null, msgs);
			if (newScore != null)
				msgs = ((InternalEObject)newScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.MOVE__SCORE, null, msgs);
			msgs = basicSetScore(newScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.MOVE__SCORE, newScore, newScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		Action action = basicGetAction();
		return action != null && action.eIsProxy() ? (Action)eResolveProxy((InternalEObject)action) : action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Action basicGetAction() {
		Move previous = this.getPrevious();
		if ( previous!=null) {
			// non root move
			return previous.getAction();
		}
		
		// root move
		EObject container = this.eContainer;
		if ( container instanceof Action){
			return (Action) container;
		}

		String logMessage = String.format("The owner of the Move %s must be a Action or another Move and not %s",
                this.getClass().getName(),
                container == null ? "null" : container.getClass().getName());
		Plugin.INSTANCE.logError(logMessage);

		return null;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isCurrent() {
		Action action = this.basicGetAction();
		boolean current = action.getCurrentMove()==this;
		return current;
	}
	
	private ChangeDescription  changes = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void do_() {
		Action action = this.getAction();
		Solution currentSolution = action.getCurrentSolution();
		ChangeRecorder recorder = new ChangeRecorder(currentSolution); // begin recording
		
		this.doImpl();

		this.changes = recorder.endRecording();
		action.setCurrentMove(this);
	}

	protected void doImpl() {
		// default implementation does nothing
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void undo() {
		this.changes.apply();
		this.changes = null;
		Action action = this.getAction();
		action.setCurrentMove(this.getPrevious());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String isValidFeedback() {
		// by default, the move is valid
		return null;
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
			case LocalSearchPackage.MOVE__PREVIOUS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPrevious((Move)otherEnd, msgs);
			case LocalSearchPackage.MOVE__NEXT_MOVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNextMoves()).basicAdd(otherEnd, msgs);
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
			case LocalSearchPackage.MOVE__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case LocalSearchPackage.MOVE__NEXT_MOVES:
				return ((InternalEList<?>)getNextMoves()).basicRemove(otherEnd, msgs);
			case LocalSearchPackage.MOVE__SCORE:
				return basicSetScore(null, msgs);
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
			case LocalSearchPackage.MOVE__PREVIOUS:
				return eInternalContainer().eInverseRemove(this, LocalSearchPackage.MOVE__NEXT_MOVES, Move.class, msgs);
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
			case LocalSearchPackage.MOVE__VALID:
				return isValid();
			case LocalSearchPackage.MOVE__DO_ENABLED_FEEDBACK:
				return getDoEnabledFeedback();
			case LocalSearchPackage.MOVE__UNDO_ENABLED_FEEDBACK:
				return getUndoEnabledFeedback();
			case LocalSearchPackage.MOVE__PREVIOUS:
				return getPrevious();
			case LocalSearchPackage.MOVE__NEXT_MOVES:
				return getNextMoves();
			case LocalSearchPackage.MOVE__SCORE:
				return getScore();
			case LocalSearchPackage.MOVE__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case LocalSearchPackage.MOVE__CURRENT:
				return isCurrent();
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
			case LocalSearchPackage.MOVE__PREVIOUS:
				setPrevious((Move)newValue);
				return;
			case LocalSearchPackage.MOVE__NEXT_MOVES:
				getNextMoves().clear();
				getNextMoves().addAll((Collection<? extends Move>)newValue);
				return;
			case LocalSearchPackage.MOVE__SCORE:
				setScore((Score)newValue);
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
			case LocalSearchPackage.MOVE__PREVIOUS:
				setPrevious((Move)null);
				return;
			case LocalSearchPackage.MOVE__NEXT_MOVES:
				getNextMoves().clear();
				return;
			case LocalSearchPackage.MOVE__SCORE:
				setScore((Score)null);
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
			case LocalSearchPackage.MOVE__VALID:
				return isValid() != VALID_EDEFAULT;
			case LocalSearchPackage.MOVE__DO_ENABLED_FEEDBACK:
				return DO_ENABLED_FEEDBACK_EDEFAULT == null ? getDoEnabledFeedback() != null : !DO_ENABLED_FEEDBACK_EDEFAULT.equals(getDoEnabledFeedback());
			case LocalSearchPackage.MOVE__UNDO_ENABLED_FEEDBACK:
				return UNDO_ENABLED_FEEDBACK_EDEFAULT == null ? getUndoEnabledFeedback() != null : !UNDO_ENABLED_FEEDBACK_EDEFAULT.equals(getUndoEnabledFeedback());
			case LocalSearchPackage.MOVE__PREVIOUS:
				return getPrevious() != null;
			case LocalSearchPackage.MOVE__NEXT_MOVES:
				return nextMoves != null && !nextMoves.isEmpty();
			case LocalSearchPackage.MOVE__SCORE:
				return score != null;
			case LocalSearchPackage.MOVE__ACTION:
				return basicGetAction() != null;
			case LocalSearchPackage.MOVE__CURRENT:
				return isCurrent() != CURRENT_EDEFAULT;
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
			case LocalSearchPackage.MOVE___DO_:
				do_();
				return null;
			case LocalSearchPackage.MOVE___UNDO:
				undo();
				return null;
			case LocalSearchPackage.MOVE___IS_VALID_FEEDBACK:
				return isValidFeedback();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MoveImpl
