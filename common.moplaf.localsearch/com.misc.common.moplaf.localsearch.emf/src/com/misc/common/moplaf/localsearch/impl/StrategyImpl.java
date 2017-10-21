/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.localsearch.Improvment;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.Strategy;

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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getImprovments <em>Improvments</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getBestSolution <em>Best Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.StrategyImpl#getCurrentSolutionNr <em>Current Solution Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StrategyImpl extends MinimalEObjectImpl.Container implements Strategy {
	/**
	 * The cached value of the '{@link #getImprovments() <em>Improvments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImprovments()
	 * @generated
	 * @ordered
	 */
	protected EList<Improvment> improvments;

	/**
	 * The cached value of the '{@link #getBestSolution() <em>Best Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestSolution()
	 * @generated
	 * @ordered
	 */
	protected Solution bestSolution;

	/**
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> solutions;

	/**
	 * The default value of the '{@link #getCurrentSolutionNr() <em>Current Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSolutionNr()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_SOLUTION_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentSolutionNr() <em>Current Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSolutionNr()
	 * @generated
	 * @ordered
	 */
	protected int currentSolutionNr = CURRENT_SOLUTION_NR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocalSearchPackage.Literals.STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Improvment> getImprovments() {
		if (improvments == null) {
			improvments = new EObjectContainmentEList<Improvment>(Improvment.class, this, LocalSearchPackage.STRATEGY__IMPROVMENTS);
		}
		return improvments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getBestSolution() {
		if (bestSolution != null && bestSolution.eIsProxy()) {
			InternalEObject oldBestSolution = (InternalEObject)bestSolution;
			bestSolution = (Solution)eResolveProxy(oldBestSolution);
			if (bestSolution != oldBestSolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocalSearchPackage.STRATEGY__BEST_SOLUTION, oldBestSolution, bestSolution));
			}
		}
		return bestSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetBestSolution() {
		return bestSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBestSolution(Solution newBestSolution) {
		Solution oldBestSolution = bestSolution;
		bestSolution = newBestSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.STRATEGY__BEST_SOLUTION, oldBestSolution, bestSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectContainmentWithInverseEList<Solution>(Solution.class, this, LocalSearchPackage.STRATEGY__SOLUTIONS, LocalSearchPackage.SOLUTION__STRATEGY);
		}
		return solutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentSolutionNr() {
		return currentSolutionNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSolutionNr(int newCurrentSolutionNr) {
		int oldCurrentSolutionNr = currentSolutionNr;
		currentSolutionNr = newCurrentSolutionNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR, oldCurrentSolutionNr, currentSolutionNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void selectSolutionsToImprove() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pruneSolution() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSolutions()).basicAdd(otherEnd, msgs);
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
			case LocalSearchPackage.STRATEGY__IMPROVMENTS:
				return ((InternalEList<?>)getImprovments()).basicRemove(otherEnd, msgs);
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				return ((InternalEList<?>)getSolutions()).basicRemove(otherEnd, msgs);
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
			case LocalSearchPackage.STRATEGY__IMPROVMENTS:
				return getImprovments();
			case LocalSearchPackage.STRATEGY__BEST_SOLUTION:
				if (resolve) return getBestSolution();
				return basicGetBestSolution();
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				return getSolutions();
			case LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR:
				return getCurrentSolutionNr();
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
			case LocalSearchPackage.STRATEGY__IMPROVMENTS:
				getImprovments().clear();
				getImprovments().addAll((Collection<? extends Improvment>)newValue);
				return;
			case LocalSearchPackage.STRATEGY__BEST_SOLUTION:
				setBestSolution((Solution)newValue);
				return;
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				getSolutions().clear();
				getSolutions().addAll((Collection<? extends Solution>)newValue);
				return;
			case LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR:
				setCurrentSolutionNr((Integer)newValue);
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
			case LocalSearchPackage.STRATEGY__IMPROVMENTS:
				getImprovments().clear();
				return;
			case LocalSearchPackage.STRATEGY__BEST_SOLUTION:
				setBestSolution((Solution)null);
				return;
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				getSolutions().clear();
				return;
			case LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR:
				setCurrentSolutionNr(CURRENT_SOLUTION_NR_EDEFAULT);
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
			case LocalSearchPackage.STRATEGY__IMPROVMENTS:
				return improvments != null && !improvments.isEmpty();
			case LocalSearchPackage.STRATEGY__BEST_SOLUTION:
				return bestSolution != null;
			case LocalSearchPackage.STRATEGY__SOLUTIONS:
				return solutions != null && !solutions.isEmpty();
			case LocalSearchPackage.STRATEGY__CURRENT_SOLUTION_NR:
				return currentSolutionNr != CURRENT_SOLUTION_NR_EDEFAULT;
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
			case LocalSearchPackage.STRATEGY___SELECT_SOLUTIONS_TO_IMPROVE:
				selectSolutionsToImprove();
				return null;
			case LocalSearchPackage.STRATEGY___PRUNE_SOLUTION:
				pruneSolution();
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
		result.append(" (CurrentSolutionNr: ");
		result.append(currentSolutionNr);
		result.append(')');
		return result.toString();
	}

} //StrategyImpl
