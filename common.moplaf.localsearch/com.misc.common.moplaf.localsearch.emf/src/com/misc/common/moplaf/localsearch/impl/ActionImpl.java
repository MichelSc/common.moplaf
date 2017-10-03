/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Move;

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
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getSelectedMove <em>Selected Move</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
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
	 * The cached value of the '{@link #getSelectedMove() <em>Selected Move</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedMove()
	 * @generated
	 * @ordered
	 */
	protected Move selectedMove;

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
	public Move getSelectedMove() {
		if (selectedMove != null && selectedMove.eIsProxy()) {
			InternalEObject oldSelectedMove = (InternalEObject)selectedMove;
			selectedMove = (Move)eResolveProxy(oldSelectedMove);
			if (selectedMove != oldSelectedMove) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocalSearchPackage.ACTION__SELECTED_MOVE, oldSelectedMove, selectedMove));
			}
		}
		return selectedMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move basicGetSelectedMove() {
		return selectedMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedMove(Move newSelectedMove) {
		Move oldSelectedMove = selectedMove;
		selectedMove = newSelectedMove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.ACTION__SELECTED_MOVE, oldSelectedMove, selectedMove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createMoves() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void scoreMoves() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void selectMove() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void doAction() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case LocalSearchPackage.ACTION__ROOT_MOVES:
				return getRootMoves();
			case LocalSearchPackage.ACTION__CURRENT_MOVE:
				if (resolve) return getCurrentMove();
				return basicGetCurrentMove();
			case LocalSearchPackage.ACTION__SELECTED_MOVE:
				if (resolve) return getSelectedMove();
				return basicGetSelectedMove();
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
			case LocalSearchPackage.ACTION__SELECTED_MOVE:
				setSelectedMove((Move)newValue);
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
			case LocalSearchPackage.ACTION__SELECTED_MOVE:
				setSelectedMove((Move)null);
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
			case LocalSearchPackage.ACTION__SELECTED_MOVE:
				return selectedMove != null;
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
			case LocalSearchPackage.ACTION___CREATE_MOVES:
				createMoves();
				return null;
			case LocalSearchPackage.ACTION___SCORE_MOVES:
				scoreMoves();
				return null;
			case LocalSearchPackage.ACTION___SELECT_MOVE:
				selectMove();
				return null;
			case LocalSearchPackage.ACTION___DO_ACTION:
				doAction();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActionImpl
