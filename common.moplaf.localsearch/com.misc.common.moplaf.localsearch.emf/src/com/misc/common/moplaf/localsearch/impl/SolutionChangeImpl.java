/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.common.util.EObjectListDerived;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.SolutionChange;
import com.misc.common.moplaf.localsearch.StrategyLevel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getEndSolutionOwned <em>End Solution Owned</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getStartSolution <em>Start Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getEndSolution <em>End Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getStartSolutionOwned <em>Start Solution Owned</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getPreviousChange <em>Previous Change</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getSubChanges <em>Sub Changes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getCurrentSolution <em>Current Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SolutionChangeImpl extends MinimalEObjectImpl.Container implements SolutionChange {
	/**
	 * The cached value of the '{@link #getEndSolutionOwned() <em>End Solution Owned</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndSolutionOwned()
	 * @generated
	 * @ordered
	 */
	protected Solution endSolutionOwned;

	/**
	 * The cached value of the '{@link #getStartSolutionOwned() <em>Start Solution Owned</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSolutionOwned()
	 * @generated
	 * @ordered
	 */
	protected Solution startSolutionOwned;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final StrategyLevel LEVEL_EDEFAULT = StrategyLevel.LEVEL_NONE;

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
	protected SolutionChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocalSearchPackage.Literals.SOLUTION_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getEndSolutionOwned() {
		return endSolutionOwned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndSolutionOwned(Solution newEndSolutionOwned, NotificationChain msgs) {
		Solution oldEndSolutionOwned = endSolutionOwned;
		endSolutionOwned = newEndSolutionOwned;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION_OWNED, oldEndSolutionOwned, newEndSolutionOwned);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndSolutionOwned(Solution newEndSolutionOwned) {
		if (newEndSolutionOwned != endSolutionOwned) {
			NotificationChain msgs = null;
			if (endSolutionOwned != null)
				msgs = ((InternalEObject)endSolutionOwned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION_OWNED, null, msgs);
			if (newEndSolutionOwned != null)
				msgs = ((InternalEObject)newEndSolutionOwned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION_OWNED, null, msgs);
			msgs = basicSetEndSolutionOwned(newEndSolutionOwned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION_OWNED, newEndSolutionOwned, newEndSolutionOwned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getStartSolution() {
		Solution startSolution = basicGetStartSolution();
		return startSolution != null && startSolution.eIsProxy() ? (Solution)eResolveProxy((InternalEObject)startSolution) : startSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetStartSolution() {
		// TODO: implement this method to return the 'Start Solution' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getEndSolution() {
		Solution endSolution = basicGetEndSolution();
		return endSolution != null && endSolution.eIsProxy() ? (Solution)eResolveProxy((InternalEObject)endSolution) : endSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetEndSolution() {
		// TODO: implement this method to return the 'End Solution' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getStartSolutionOwned() {
		return startSolutionOwned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartSolutionOwned(Solution newStartSolutionOwned, NotificationChain msgs) {
		Solution oldStartSolutionOwned = startSolutionOwned;
		startSolutionOwned = newStartSolutionOwned;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION_OWNED, oldStartSolutionOwned, newStartSolutionOwned);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartSolutionOwned(Solution newStartSolutionOwned) {
		if (newStartSolutionOwned != startSolutionOwned) {
			NotificationChain msgs = null;
			if (startSolutionOwned != null)
				msgs = ((InternalEObject)startSolutionOwned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION_OWNED, null, msgs);
			if (newStartSolutionOwned != null)
				msgs = ((InternalEObject)newStartSolutionOwned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION_OWNED, null, msgs);
			msgs = basicSetStartSolutionOwned(newStartSolutionOwned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION_OWNED, newStartSolutionOwned, newStartSolutionOwned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionChange getPreviousChange() {
		SolutionChange previousChange = basicGetPreviousChange();
		return previousChange != null && previousChange.eIsProxy() ? (SolutionChange)eResolveProxy((InternalEObject)previousChange) : previousChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionChange basicGetPreviousChange() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyLevel getLevel() {
		// TODO: implement this method to return the 'Level' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getSolutions() {
		// TODO: implement this method to return the 'Solutions' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<SolutionChange> getSubChanges() {
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<SolutionChange> newList = new EObjectListDerived<SolutionChange>(SolutionChange.class, this, LocalSearchPackage.SOLUTION_CHANGE__SUB_CHANGES, true);
		return newList;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION, oldCurrentSolution, currentSolution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION, oldCurrentSolution, currentSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION_OWNED:
				return basicSetEndSolutionOwned(null, msgs);
			case LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION_OWNED:
				return basicSetStartSolutionOwned(null, msgs);
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
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION_OWNED:
				return getEndSolutionOwned();
			case LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION:
				if (resolve) return getStartSolution();
				return basicGetStartSolution();
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION:
				if (resolve) return getEndSolution();
				return basicGetEndSolution();
			case LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION_OWNED:
				return getStartSolutionOwned();
			case LocalSearchPackage.SOLUTION_CHANGE__PREVIOUS_CHANGE:
				if (resolve) return getPreviousChange();
				return basicGetPreviousChange();
			case LocalSearchPackage.SOLUTION_CHANGE__LEVEL:
				return getLevel();
			case LocalSearchPackage.SOLUTION_CHANGE__SOLUTIONS:
				return getSolutions();
			case LocalSearchPackage.SOLUTION_CHANGE__SUB_CHANGES:
				return getSubChanges();
			case LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION_OWNED:
				setEndSolutionOwned((Solution)newValue);
				return;
			case LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION_OWNED:
				setStartSolutionOwned((Solution)newValue);
				return;
			case LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION:
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
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION_OWNED:
				setEndSolutionOwned((Solution)null);
				return;
			case LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION_OWNED:
				setStartSolutionOwned((Solution)null);
				return;
			case LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION:
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
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION_OWNED:
				return endSolutionOwned != null;
			case LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION:
				return basicGetStartSolution() != null;
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION:
				return basicGetEndSolution() != null;
			case LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION_OWNED:
				return startSolutionOwned != null;
			case LocalSearchPackage.SOLUTION_CHANGE__PREVIOUS_CHANGE:
				return basicGetPreviousChange() != null;
			case LocalSearchPackage.SOLUTION_CHANGE__LEVEL:
				return getLevel() != LEVEL_EDEFAULT;
			case LocalSearchPackage.SOLUTION_CHANGE__SOLUTIONS:
				return !getSolutions().isEmpty();
			case LocalSearchPackage.SOLUTION_CHANGE__SUB_CHANGES:
				return !getSubChanges().isEmpty();
			case LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION:
				return currentSolution != null;
		}
		return super.eIsSet(featureID);
	}

} //SolutionChangeImpl