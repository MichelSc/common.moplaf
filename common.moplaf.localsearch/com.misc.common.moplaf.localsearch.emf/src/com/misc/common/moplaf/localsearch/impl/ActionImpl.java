/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Move;

import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.propagator2.Plugin;

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
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getValidFeedback <em>Valid Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ActionImpl#getCurrentSolution <em>Current Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends MinimalEObjectImpl.Container implements Action {
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
	 * The default value of the '{@link #getValidFeedback() <em>Valid Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_FEEDBACK_EDEFAULT = null;

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
	 * The cached value of the '{@link #getCurrentSolution() <em>Current Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSolution()
	 * @generated
	 * @ordered
	 */
	protected Solution currentSolution;

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
	public String getDescription() {
		// TODO: implement this method to return the 'Description' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getCurrentSolution() {
		if (currentSolution != null && currentSolution.eIsProxy()) {
			InternalEObject oldCurrentSolution = (InternalEObject)currentSolution;
			currentSolution = (Solution)eResolveProxy(oldCurrentSolution);
			if (currentSolution != oldCurrentSolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocalSearchPackage.ACTION__CURRENT_SOLUTION, oldCurrentSolution, currentSolution));
			}
		}
		return currentSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetCurrentSolution() {
		return currentSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSolution(Solution newCurrentSolution) {
		Solution oldCurrentSolution = currentSolution;
		currentSolution = newCurrentSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.ACTION__CURRENT_SOLUTION, oldCurrentSolution, currentSolution));
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
	 */
	public String getValidFeedback() {
		Solution current_solution = this.getCurrentSolution();
		if ( current_solution==null) {
			return "No current solution";
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
	 * @generated
	 */
	public void finalize() {
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
			case LocalSearchPackage.ACTION__DESCRIPTION:
				return getDescription();
			case LocalSearchPackage.ACTION__VALID_FEEDBACK:
				return getValidFeedback();
			case LocalSearchPackage.ACTION__VALID:
				return isValid();
			case LocalSearchPackage.ACTION__CURRENT_SOLUTION:
				if (resolve) return getCurrentSolution();
				return basicGetCurrentSolution();
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
			case LocalSearchPackage.ACTION__CURRENT_SOLUTION:
				setCurrentSolution((Solution)newValue);
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
			case LocalSearchPackage.ACTION__CURRENT_SOLUTION:
				setCurrentSolution((Solution)null);
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
			case LocalSearchPackage.ACTION__VALID_FEEDBACK:
				return VALID_FEEDBACK_EDEFAULT == null ? getValidFeedback() != null : !VALID_FEEDBACK_EDEFAULT.equals(getValidFeedback());
			case LocalSearchPackage.ACTION__VALID:
				return isValid() != VALID_EDEFAULT;
			case LocalSearchPackage.ACTION__CURRENT_SOLUTION:
				return currentSolution != null;
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
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActionImpl
