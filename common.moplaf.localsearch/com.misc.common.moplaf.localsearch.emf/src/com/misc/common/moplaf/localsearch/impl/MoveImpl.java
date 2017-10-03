/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Move;

import com.misc.common.moplaf.localsearch.Score;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.MoveImpl#getNextMoves <em>Next Moves</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.MoveImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.MoveImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.MoveImpl#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveImpl extends MinimalEObjectImpl.Container implements Move {
	/**
	 * The cached value of the '{@link #getNextMoves() <em>Next Moves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextMoves()
	 * @generated
	 * @ordered
	 */
	protected EList<Move> nextMoves;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Move previous;

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
	 * The cached value of the '{@link #getScore() <em>Score</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected EList<Score> score;

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
			nextMoves = new EObjectWithInverseResolvingEList<Move>(Move.class, this, LocalSearchPackage.MOVE__NEXT_MOVES, LocalSearchPackage.MOVE__PREVIOUS);
		}
		return nextMoves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (Move)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocalSearchPackage.MOVE__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(Move newPrevious, NotificationChain msgs) {
		Move oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocalSearchPackage.MOVE__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(Move newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, LocalSearchPackage.MOVE__NEXT_MOVES, Move.class, msgs);
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
	 * @generated
	 */
	public EList<Score> getScore() {
		if (score == null) {
			score = new EObjectContainmentEList<Score>(Score.class, this, LocalSearchPackage.MOVE__SCORE);
		}
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void apply() {
		// to be implemented by the concrete class
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void revert() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case LocalSearchPackage.MOVE__NEXT_MOVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNextMoves()).basicAdd(otherEnd, msgs);
			case LocalSearchPackage.MOVE__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, LocalSearchPackage.MOVE__NEXT_MOVES, Move.class, msgs);
				return basicSetPrevious((Move)otherEnd, msgs);
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
			case LocalSearchPackage.MOVE__NEXT_MOVES:
				return ((InternalEList<?>)getNextMoves()).basicRemove(otherEnd, msgs);
			case LocalSearchPackage.MOVE__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case LocalSearchPackage.MOVE__SCORE:
				return ((InternalEList<?>)getScore()).basicRemove(otherEnd, msgs);
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
			case LocalSearchPackage.MOVE__NEXT_MOVES:
				return getNextMoves();
			case LocalSearchPackage.MOVE__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case LocalSearchPackage.MOVE__VALID:
				return isValid();
			case LocalSearchPackage.MOVE__SCORE:
				return getScore();
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
			case LocalSearchPackage.MOVE__NEXT_MOVES:
				getNextMoves().clear();
				getNextMoves().addAll((Collection<? extends Move>)newValue);
				return;
			case LocalSearchPackage.MOVE__PREVIOUS:
				setPrevious((Move)newValue);
				return;
			case LocalSearchPackage.MOVE__SCORE:
				getScore().clear();
				getScore().addAll((Collection<? extends Score>)newValue);
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
			case LocalSearchPackage.MOVE__NEXT_MOVES:
				getNextMoves().clear();
				return;
			case LocalSearchPackage.MOVE__PREVIOUS:
				setPrevious((Move)null);
				return;
			case LocalSearchPackage.MOVE__SCORE:
				getScore().clear();
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
			case LocalSearchPackage.MOVE__NEXT_MOVES:
				return nextMoves != null && !nextMoves.isEmpty();
			case LocalSearchPackage.MOVE__PREVIOUS:
				return previous != null;
			case LocalSearchPackage.MOVE__VALID:
				return isValid() != VALID_EDEFAULT;
			case LocalSearchPackage.MOVE__SCORE:
				return score != null && !score.isEmpty();
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
			case LocalSearchPackage.MOVE___APPLY:
				apply();
				return null;
			case LocalSearchPackage.MOVE___REVERT:
				revert();
				return null;
			case LocalSearchPackage.MOVE___IS_VALID_FEEDBACK:
				return isValidFeedback();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MoveImpl
