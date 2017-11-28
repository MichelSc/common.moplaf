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
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getStartSolution <em>Start Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getEndSolution <em>End Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getEndSolutionOwned <em>End Solution Owned</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getPreviousChange <em>Previous Change</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getSubChanges <em>Sub Changes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getCurrentSolution <em>Current Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#isKeepSolutions <em>Keep Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#isNewSolution <em>New Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getSuperChange <em>Super Change</em>}</li>
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
	 * The default value of the '{@link #isKeepSolutions() <em>Keep Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeepSolutions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEEP_SOLUTIONS_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isNewSolution() <em>New Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNewSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_SOLUTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNewSolution() <em>New Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNewSolution()
	 * @generated
	 * @ordered
	 */
	protected boolean newSolution = NEW_SOLUTION_EDEFAULT;

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
	public Solution getStartSolution() {
		Solution startSolution = basicGetStartSolution();
		return startSolution != null && startSolution.eIsProxy() ? (Solution)eResolveProxy((InternalEObject)startSolution) : startSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Solution basicGetStartSolution() {
		SolutionChange previous = this.getPreviousChange();
		if( previous!=null) {
			return previous.getEndSolution();
		}
		return this.getSuperChange().getStartSolution();
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
	 */
	public Solution basicGetEndSolution() {
		if ( this.isKeepSolutions() ) {
			if ( this.isNewSolution()) {
				return this.getEndSolutionOwned();
			} else {
				return this.getStartSolution();
			}
		} else {
			int subchanges = this.getSubChanges().size();
			if ( subchanges>0 ){
				return this.getSubChanges().get(subchanges-1).getEndSolution();
			} else {
				// no change, so this is the start solutions
				return this.getStartSolution();
			}
		}
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
	 */
	public EList<Solution> getSolutions() {
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<Solution> newList = new EObjectListDerived<Solution>(Solution.class, this, LocalSearchPackage.SOLUTION_CHANGE__SOLUTIONS, true);
		Solution startSolution = this.getStartSolution();
		if ( startSolution!=null) {
			newList.add(startSolution);
			this.collectNewSolutions(newList);
		}
		return newList;
	}
	
	private void collectNewSolutions(EList<Solution> solutions) {
		if ( this.isKeepSolutions()) {
			if ( this.isNewSolution() ) {
				solutions.add(this.getEndSolutionOwned());
			}
		} else {
			for ( SolutionChange subchange : this.getSubChanges()) {
				((SolutionChangeImpl)subchange).collectNewSolutions(solutions);
			}
		}
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
	public boolean isKeepSolutions() {
		// TODO: implement this method to return the 'Keep Solutions' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNewSolution() {
		return newSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewSolution(boolean newNewSolution) {
		boolean oldNewSolution = newSolution;
		newSolution = newNewSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION_CHANGE__NEW_SOLUTION, oldNewSolution, newSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionChange getSuperChange() {
		SolutionChange superChange = basicGetSuperChange();
		return superChange != null && superChange.eIsProxy() ? (SolutionChange)eResolveProxy((InternalEObject)superChange) : superChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionChange basicGetSuperChange() {
		return null;
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
			case LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION:
				if (resolve) return getStartSolution();
				return basicGetStartSolution();
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION:
				if (resolve) return getEndSolution();
				return basicGetEndSolution();
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION_OWNED:
				return getEndSolutionOwned();
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
			case LocalSearchPackage.SOLUTION_CHANGE__KEEP_SOLUTIONS:
				return isKeepSolutions();
			case LocalSearchPackage.SOLUTION_CHANGE__NEW_SOLUTION:
				return isNewSolution();
			case LocalSearchPackage.SOLUTION_CHANGE__SUPER_CHANGE:
				if (resolve) return getSuperChange();
				return basicGetSuperChange();
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
			case LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION:
				setCurrentSolution((Solution)newValue);
				return;
			case LocalSearchPackage.SOLUTION_CHANGE__NEW_SOLUTION:
				setNewSolution((Boolean)newValue);
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
			case LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION:
				setCurrentSolution((Solution)null);
				return;
			case LocalSearchPackage.SOLUTION_CHANGE__NEW_SOLUTION:
				setNewSolution(NEW_SOLUTION_EDEFAULT);
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
			case LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION:
				return basicGetStartSolution() != null;
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION:
				return basicGetEndSolution() != null;
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION_OWNED:
				return endSolutionOwned != null;
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
			case LocalSearchPackage.SOLUTION_CHANGE__KEEP_SOLUTIONS:
				return isKeepSolutions() != KEEP_SOLUTIONS_EDEFAULT;
			case LocalSearchPackage.SOLUTION_CHANGE__NEW_SOLUTION:
				return newSolution != NEW_SOLUTION_EDEFAULT;
			case LocalSearchPackage.SOLUTION_CHANGE__SUPER_CHANGE:
				return basicGetSuperChange() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (NewSolution: ");
		result.append(newSolution);
		result.append(')');
		return result.toString();
	}

} //SolutionChangeImpl
