/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.common.EnabledFeedback;

import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.Delta;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Plugin;
import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.localsearch.Solution;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.DeltaImpl#getAction <em>Action</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.DeltaImpl#getScore <em>Score</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.DeltaImpl#getPreviousDelta <em>Previous Delta</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.DeltaImpl#getNextDeltas <em>Next Deltas</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.DeltaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.DeltaImpl#getDoEnabledFeedback <em>Do Enabled Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.DeltaImpl#getUndoEnabledFeedback <em>Undo Enabled Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.DeltaImpl#getSelectEnabledFeedback <em>Select Enabled Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.DeltaImpl#getValidFeedback <em>Valid Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.DeltaImpl#isCurrent <em>Current</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.DeltaImpl#isSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DeltaImpl extends MinimalEObjectImpl.Container implements Delta {

	private ChangeDescription  changes = null;

	
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
	 * The cached value of the '{@link #getNextDeltas() <em>Next Deltas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextDeltas()
	 * @generated
	 * @ordered
	 */
	protected EList<Delta> nextDeltas;

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
	 * The default value of the '{@link #getSelectEnabledFeedback() <em>Select Enabled Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectEnabledFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback SELECT_ENABLED_FEEDBACK_EDEFAULT = null;


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
	 * The default value of the '{@link #isCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CURRENT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isSolution() <em>Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOLUTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSolution() <em>Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolution()
	 * @generated
	 * @ordered
	 */
	protected boolean solution = SOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeltaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocalSearchPackage.Literals.DELTA;
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
		Delta previous = this.getPreviousDelta();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocalSearchPackage.DELTA__SCORE, oldScore, newScore);
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
				msgs = ((InternalEObject)score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.DELTA__SCORE, null, msgs);
			if (newScore != null)
				msgs = ((InternalEObject)newScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.DELTA__SCORE, null, msgs);
			msgs = basicSetScore(newScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.DELTA__SCORE, newScore, newScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delta getPreviousDelta() {
		if (eContainerFeatureID() != LocalSearchPackage.DELTA__PREVIOUS_DELTA) return null;
		return (Delta)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousDelta(Delta newPreviousDelta, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPreviousDelta, LocalSearchPackage.DELTA__PREVIOUS_DELTA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousDelta(Delta newPreviousDelta) {
		if (newPreviousDelta != eInternalContainer() || (eContainerFeatureID() != LocalSearchPackage.DELTA__PREVIOUS_DELTA && newPreviousDelta != null)) {
			if (EcoreUtil.isAncestor(this, newPreviousDelta))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreviousDelta != null)
				msgs = ((InternalEObject)newPreviousDelta).eInverseAdd(this, LocalSearchPackage.DELTA__NEXT_DELTAS, Delta.class, msgs);
			msgs = basicSetPreviousDelta(newPreviousDelta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.DELTA__PREVIOUS_DELTA, newPreviousDelta, newPreviousDelta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delta> getNextDeltas() {
		if (nextDeltas == null) {
			nextDeltas = new EObjectContainmentWithInverseEList<Delta>(Delta.class, this, LocalSearchPackage.DELTA__NEXT_DELTAS, LocalSearchPackage.DELTA__PREVIOUS_DELTA);
		}
		return nextDeltas;
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
	public EnabledFeedback getDoEnabledFeedback() {
		EnabledFeedback validFeedback = this.getValidFeedback();
		if ( !validFeedback.isEnabled() ) {
			return validFeedback;
		}
		Delta previous = this.getPreviousDelta();
		Action action = this.basicGetAction();
		if ( previous==null) {
			// root move
			if ( action.getCurrentDelta()==null) {
				return EnabledFeedback.NOFEEDBACK;
			} else {
				return new EnabledFeedback(false, "Other delta is already current");
			}
		} else {
			// non root move
			if ( previous.isCurrent()) {
				return EnabledFeedback.NOFEEDBACK;
			} else {
				return new EnabledFeedback(false, "Other delta than the previous is already current");
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
	 */
	public EnabledFeedback getSelectEnabledFeedback() {
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getValidFeedback() {
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isCurrent() {
		Action action = this.basicGetAction();
		boolean current = action.getCurrentDelta()==this;
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSolution() {
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolution(boolean newSolution) {
		boolean oldSolution = solution;
		solution = newSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.DELTA__SOLUTION, oldSolution, solution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void do_() {
		Action action = this.getAction();
		Solution currentSolution = action.getCurrentSolution().getSolution();
		ChangeRecorder recorder = new ChangeRecorder(currentSolution); // begin recording

		// procedural changes
		this.doImpl();

		// declarative changes, including the score
		currentSolution.refresh();

		this.changes = recorder.endRecording();
		
		// this is the current move
		action.setCurrentDelta(this);
		
		// keep the core for this move
		Score new_score = currentSolution.getScore().clone();
		this.setScore(new_score);  // owning
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
		action.setCurrentDelta(this.getPreviousDelta());
		// we keep the score; that is all the point of this functionality!
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
			case LocalSearchPackage.DELTA__PREVIOUS_DELTA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPreviousDelta((Delta)otherEnd, msgs);
			case LocalSearchPackage.DELTA__NEXT_DELTAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNextDeltas()).basicAdd(otherEnd, msgs);
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
			case LocalSearchPackage.DELTA__SCORE:
				return basicSetScore(null, msgs);
			case LocalSearchPackage.DELTA__PREVIOUS_DELTA:
				return basicSetPreviousDelta(null, msgs);
			case LocalSearchPackage.DELTA__NEXT_DELTAS:
				return ((InternalEList<?>)getNextDeltas()).basicRemove(otherEnd, msgs);
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
			case LocalSearchPackage.DELTA__PREVIOUS_DELTA:
				return eInternalContainer().eInverseRemove(this, LocalSearchPackage.DELTA__NEXT_DELTAS, Delta.class, msgs);
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
			case LocalSearchPackage.DELTA__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case LocalSearchPackage.DELTA__SCORE:
				return getScore();
			case LocalSearchPackage.DELTA__PREVIOUS_DELTA:
				return getPreviousDelta();
			case LocalSearchPackage.DELTA__NEXT_DELTAS:
				return getNextDeltas();
			case LocalSearchPackage.DELTA__DESCRIPTION:
				return getDescription();
			case LocalSearchPackage.DELTA__DO_ENABLED_FEEDBACK:
				return getDoEnabledFeedback();
			case LocalSearchPackage.DELTA__UNDO_ENABLED_FEEDBACK:
				return getUndoEnabledFeedback();
			case LocalSearchPackage.DELTA__SELECT_ENABLED_FEEDBACK:
				return getSelectEnabledFeedback();
			case LocalSearchPackage.DELTA__VALID_FEEDBACK:
				return getValidFeedback();
			case LocalSearchPackage.DELTA__CURRENT:
				return isCurrent();
			case LocalSearchPackage.DELTA__SOLUTION:
				return isSolution();
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
			case LocalSearchPackage.DELTA__SCORE:
				setScore((Score)newValue);
				return;
			case LocalSearchPackage.DELTA__PREVIOUS_DELTA:
				setPreviousDelta((Delta)newValue);
				return;
			case LocalSearchPackage.DELTA__NEXT_DELTAS:
				getNextDeltas().clear();
				getNextDeltas().addAll((Collection<? extends Delta>)newValue);
				return;
			case LocalSearchPackage.DELTA__SOLUTION:
				setSolution((Boolean)newValue);
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
			case LocalSearchPackage.DELTA__SCORE:
				setScore((Score)null);
				return;
			case LocalSearchPackage.DELTA__PREVIOUS_DELTA:
				setPreviousDelta((Delta)null);
				return;
			case LocalSearchPackage.DELTA__NEXT_DELTAS:
				getNextDeltas().clear();
				return;
			case LocalSearchPackage.DELTA__SOLUTION:
				setSolution(SOLUTION_EDEFAULT);
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
			case LocalSearchPackage.DELTA__ACTION:
				return basicGetAction() != null;
			case LocalSearchPackage.DELTA__SCORE:
				return score != null;
			case LocalSearchPackage.DELTA__PREVIOUS_DELTA:
				return getPreviousDelta() != null;
			case LocalSearchPackage.DELTA__NEXT_DELTAS:
				return nextDeltas != null && !nextDeltas.isEmpty();
			case LocalSearchPackage.DELTA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case LocalSearchPackage.DELTA__DO_ENABLED_FEEDBACK:
				return DO_ENABLED_FEEDBACK_EDEFAULT == null ? getDoEnabledFeedback() != null : !DO_ENABLED_FEEDBACK_EDEFAULT.equals(getDoEnabledFeedback());
			case LocalSearchPackage.DELTA__UNDO_ENABLED_FEEDBACK:
				return UNDO_ENABLED_FEEDBACK_EDEFAULT == null ? getUndoEnabledFeedback() != null : !UNDO_ENABLED_FEEDBACK_EDEFAULT.equals(getUndoEnabledFeedback());
			case LocalSearchPackage.DELTA__SELECT_ENABLED_FEEDBACK:
				return SELECT_ENABLED_FEEDBACK_EDEFAULT == null ? getSelectEnabledFeedback() != null : !SELECT_ENABLED_FEEDBACK_EDEFAULT.equals(getSelectEnabledFeedback());
			case LocalSearchPackage.DELTA__VALID_FEEDBACK:
				return VALID_FEEDBACK_EDEFAULT == null ? getValidFeedback() != null : !VALID_FEEDBACK_EDEFAULT.equals(getValidFeedback());
			case LocalSearchPackage.DELTA__CURRENT:
				return isCurrent() != CURRENT_EDEFAULT;
			case LocalSearchPackage.DELTA__SOLUTION:
				return solution != SOLUTION_EDEFAULT;
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
			case LocalSearchPackage.DELTA___DO_:
				do_();
				return null;
			case LocalSearchPackage.DELTA___UNDO:
				undo();
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
		result.append(" (Solution: ");
		result.append(solution);
		result.append(')');
		return result.toString();
	}

} //DeltaImpl
