/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.Improvment;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Solution;

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
 * An implementation of the model object '<em><b>Improvment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl#getMaxIterations <em>Max Iterations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl#getMaxSeconds <em>Max Seconds</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.ImprovmentImpl#getCurrentSolution <em>Current Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImprovmentImpl extends MinimalEObjectImpl.Container implements Improvment {
	/**
	 * The default value of the '{@link #getMaxIterations() <em>Max Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ITERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxIterations() <em>Max Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIterations()
	 * @generated
	 * @ordered
	 */
	protected int maxIterations = MAX_ITERATIONS_EDEFAULT;

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
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

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
	protected ImprovmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocalSearchPackage.Literals.IMPROVMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxIterations() {
		return maxIterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxIterations(int newMaxIterations) {
		int oldMaxIterations = maxIterations;
		maxIterations = newMaxIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVMENT__MAX_ITERATIONS, oldMaxIterations, maxIterations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVMENT__MAX_SECONDS, oldMaxSeconds, maxSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, LocalSearchPackage.IMPROVMENT__ACTIONS);
		}
		return actions;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocalSearchPackage.IMPROVMENT__CURRENT_SOLUTION, oldCurrentSolution, currentSolution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.IMPROVMENT__CURRENT_SOLUTION, oldCurrentSolution, currentSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createActions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void doIteration() {
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
			case LocalSearchPackage.IMPROVMENT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case LocalSearchPackage.IMPROVMENT__MAX_ITERATIONS:
				return getMaxIterations();
			case LocalSearchPackage.IMPROVMENT__MAX_SECONDS:
				return getMaxSeconds();
			case LocalSearchPackage.IMPROVMENT__ACTIONS:
				return getActions();
			case LocalSearchPackage.IMPROVMENT__CURRENT_SOLUTION:
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
			case LocalSearchPackage.IMPROVMENT__MAX_ITERATIONS:
				setMaxIterations((Integer)newValue);
				return;
			case LocalSearchPackage.IMPROVMENT__MAX_SECONDS:
				setMaxSeconds((Float)newValue);
				return;
			case LocalSearchPackage.IMPROVMENT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case LocalSearchPackage.IMPROVMENT__CURRENT_SOLUTION:
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
			case LocalSearchPackage.IMPROVMENT__MAX_ITERATIONS:
				setMaxIterations(MAX_ITERATIONS_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVMENT__MAX_SECONDS:
				setMaxSeconds(MAX_SECONDS_EDEFAULT);
				return;
			case LocalSearchPackage.IMPROVMENT__ACTIONS:
				getActions().clear();
				return;
			case LocalSearchPackage.IMPROVMENT__CURRENT_SOLUTION:
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
			case LocalSearchPackage.IMPROVMENT__MAX_ITERATIONS:
				return maxIterations != MAX_ITERATIONS_EDEFAULT;
			case LocalSearchPackage.IMPROVMENT__MAX_SECONDS:
				return maxSeconds != MAX_SECONDS_EDEFAULT;
			case LocalSearchPackage.IMPROVMENT__ACTIONS:
				return actions != null && !actions.isEmpty();
			case LocalSearchPackage.IMPROVMENT__CURRENT_SOLUTION:
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
			case LocalSearchPackage.IMPROVMENT___CREATE_ACTIONS:
				createActions();
				return null;
			case LocalSearchPackage.IMPROVMENT___DO_ITERATION:
				doIteration();
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
		result.append(" (MaxIterations: ");
		result.append(maxIterations);
		result.append(", MaxSeconds: ");
		result.append(maxSeconds);
		result.append(')');
		return result.toString();
	}

} //ImprovmentImpl
