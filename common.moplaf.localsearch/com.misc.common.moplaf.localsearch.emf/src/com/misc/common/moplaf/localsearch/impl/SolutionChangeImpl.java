/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.common.util.EObjectListDerived;
import com.misc.common.moplaf.localsearch.LocalSearchFactory;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.SolutionChange;
import com.misc.common.moplaf.localsearch.SolutionRef;
import com.misc.common.moplaf.localsearch.StrategyLevel;

import java.lang.reflect.InvocationTargetException;
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
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getCurrentSolution <em>Current Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getPreviousChange <em>Previous Change</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getSubChanges <em>Sub Changes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getSuperChange <em>Super Change</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#isKeepSolutions <em>Keep Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionChangeImpl#isNewSolution <em>New Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SolutionChangeImpl extends MinimalEObjectImpl.Container implements SolutionChange {
	/**
	 * The cached value of the '{@link #getStartSolution() <em>Start Solution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSolution()
	 * @generated
	 * @ordered
	 */
	protected SolutionRef startSolution;

	/**
	 * The cached value of the '{@link #getEndSolution() <em>End Solution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndSolution()
	 * @generated
	 * @ordered
	 */
	protected SolutionRef endSolution;

	/**
	 * The cached value of the '{@link #getCurrentSolution() <em>Current Solution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSolution()
	 * @generated
	 * @ordered
	 */
	protected SolutionRef currentSolution;

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
	 * The default value of the '{@link #isKeepSolutions() <em>Keep Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeepSolutions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEEP_SOLUTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKeepSolutions() <em>Keep Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeepSolutions()
	 * @generated
	 * @ordered
	 */
	protected boolean keepSolutions = KEEP_SOLUTIONS_EDEFAULT;

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
	public SolutionRef getStartSolution() {
		return startSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartSolution(SolutionRef newStartSolution, NotificationChain msgs) {
		SolutionRef oldStartSolution = startSolution;
		startSolution = newStartSolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION, oldStartSolution, newStartSolution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartSolution(SolutionRef newStartSolution) {
		if (newStartSolution != startSolution) {
			NotificationChain msgs = null;
			if (startSolution != null)
				msgs = ((InternalEObject)startSolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION, null, msgs);
			if (newStartSolution != null)
				msgs = ((InternalEObject)newStartSolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION, null, msgs);
			msgs = basicSetStartSolution(newStartSolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION, newStartSolution, newStartSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionRef getEndSolution() {
		return endSolution;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndSolution(SolutionRef newEndSolution, NotificationChain msgs) {
		SolutionRef oldEndSolution = endSolution;
		endSolution = newEndSolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION, oldEndSolution, newEndSolution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndSolution(SolutionRef newEndSolution) {
		if (newEndSolution != endSolution) {
			NotificationChain msgs = null;
			if (endSolution != null)
				msgs = ((InternalEObject)endSolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION, null, msgs);
			if (newEndSolution != null)
				msgs = ((InternalEObject)newEndSolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION, null, msgs);
			msgs = basicSetEndSolution(newEndSolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION, newEndSolution, newEndSolution));
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

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 */
//	public EList<Solution> getSolutions() {
//		// Ensure that you remove @generated or mark it @generated NOT
//		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
//		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
//		EList<Solution> newList = new EObjectListDerived<Solution>(Solution.class, this, LocalSearchPackage.SOLUTION_CHANGE__SOLUTIONS, true);
//		Solution startSolution = this.getStartSolution();
//		if ( startSolution!=null ) {
//			newList.add(startSolution);
//			this.collectNewSolutions(newList);
//		}
//		return newList;
//	}
//	
//	private void collectNewSolutions(EList<Solution> solutions) {
//		if ( this.isKeepSolutions()) {
//			if ( this.isNewSolution() ) {
//				solutions.add(this.getEndSolutionOwned());
//			}
//		} else {
//			for ( SolutionChange subchange : this.getSubChanges()) {
//				((SolutionChangeImpl)subchange).collectNewSolutions(solutions);
//			}
//		}
//	}

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
	public SolutionRef getCurrentSolution() {
		return currentSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentSolution(SolutionRef newCurrentSolution, NotificationChain msgs) {
		SolutionRef oldCurrentSolution = currentSolution;
		currentSolution = newCurrentSolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION, oldCurrentSolution, newCurrentSolution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSolution(SolutionRef newCurrentSolution) {
		if (newCurrentSolution != currentSolution) {
			NotificationChain msgs = null;
			if (currentSolution != null)
				msgs = ((InternalEObject)currentSolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION, null, msgs);
			if (newCurrentSolution != null)
				msgs = ((InternalEObject)newCurrentSolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION, null, msgs);
			msgs = basicSetCurrentSolution(newCurrentSolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION, newCurrentSolution, newCurrentSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKeepSolutions() {
		return keepSolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeepSolutions(boolean newKeepSolutions) {
		boolean oldKeepSolutions = keepSolutions;
		keepSolutions = newKeepSolutions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION_CHANGE__KEEP_SOLUTIONS, oldKeepSolutions, keepSolutions));
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
	 */
	public void setCurrentSolution(Solution solution, boolean copy) {
		// the solution
		Solution to_set = solution;
		if ( copy ) {
			to_set = solution.clone();
		}
		
		// the ref
		SolutionRef ref = this.getCurrentSolution();
		if ( ref==null ) {
			ref = LocalSearchFactory.eINSTANCE.createSolutionRef();
			this.setCurrentSolution(ref);
			
		}
		
		// set
		ref.setSolution(to_set);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setStartSolution() {
		if ( this.isKeepSolutions()) {
			Solution new_solution = this.getCurrentSolution().getSolution().clone();

			SolutionRef start_ref = this.getStartSolution();
			if ( start_ref==null ) {
				start_ref = LocalSearchFactory.eINSTANCE.createSolutionRef();
				this.setStartSolution(start_ref); // owning
			}

			start_ref.setSolution(new_solution);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setEndSolution() {
		if ( this.isKeepSolutions()) {
			SolutionRef end_ref = this.getEndSolution();
			if ( end_ref==null ) {
				end_ref = LocalSearchFactory.eINSTANCE.createSolutionRef();
				this.setEndSolution(end_ref); // owning
			}

			Solution solution = this.isNewSolution() 
					          ? this.getCurrentSolution().getSolution().clone() 
					          : this.getStartSolution().getSolution();
					          
			end_ref.setSolution(solution);
		}
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
			case LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION:
				return basicSetStartSolution(null, msgs);
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION:
				return basicSetEndSolution(null, msgs);
			case LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION:
				return basicSetCurrentSolution(null, msgs);
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
				return getStartSolution();
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION:
				return getEndSolution();
			case LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION:
				return getCurrentSolution();
			case LocalSearchPackage.SOLUTION_CHANGE__PREVIOUS_CHANGE:
				if (resolve) return getPreviousChange();
				return basicGetPreviousChange();
			case LocalSearchPackage.SOLUTION_CHANGE__SUB_CHANGES:
				return getSubChanges();
			case LocalSearchPackage.SOLUTION_CHANGE__SUPER_CHANGE:
				if (resolve) return getSuperChange();
				return basicGetSuperChange();
			case LocalSearchPackage.SOLUTION_CHANGE__LEVEL:
				return getLevel();
			case LocalSearchPackage.SOLUTION_CHANGE__KEEP_SOLUTIONS:
				return isKeepSolutions();
			case LocalSearchPackage.SOLUTION_CHANGE__NEW_SOLUTION:
				return isNewSolution();
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
			case LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION:
				setStartSolution((SolutionRef)newValue);
				return;
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION:
				setEndSolution((SolutionRef)newValue);
				return;
			case LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION:
				setCurrentSolution((SolutionRef)newValue);
				return;
			case LocalSearchPackage.SOLUTION_CHANGE__KEEP_SOLUTIONS:
				setKeepSolutions((Boolean)newValue);
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
			case LocalSearchPackage.SOLUTION_CHANGE__START_SOLUTION:
				setStartSolution((SolutionRef)null);
				return;
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION:
				setEndSolution((SolutionRef)null);
				return;
			case LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION:
				setCurrentSolution((SolutionRef)null);
				return;
			case LocalSearchPackage.SOLUTION_CHANGE__KEEP_SOLUTIONS:
				setKeepSolutions(KEEP_SOLUTIONS_EDEFAULT);
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
				return startSolution != null;
			case LocalSearchPackage.SOLUTION_CHANGE__END_SOLUTION:
				return endSolution != null;
			case LocalSearchPackage.SOLUTION_CHANGE__CURRENT_SOLUTION:
				return currentSolution != null;
			case LocalSearchPackage.SOLUTION_CHANGE__PREVIOUS_CHANGE:
				return basicGetPreviousChange() != null;
			case LocalSearchPackage.SOLUTION_CHANGE__SUB_CHANGES:
				return !getSubChanges().isEmpty();
			case LocalSearchPackage.SOLUTION_CHANGE__SUPER_CHANGE:
				return basicGetSuperChange() != null;
			case LocalSearchPackage.SOLUTION_CHANGE__LEVEL:
				return getLevel() != LEVEL_EDEFAULT;
			case LocalSearchPackage.SOLUTION_CHANGE__KEEP_SOLUTIONS:
				return keepSolutions != KEEP_SOLUTIONS_EDEFAULT;
			case LocalSearchPackage.SOLUTION_CHANGE__NEW_SOLUTION:
				return newSolution != NEW_SOLUTION_EDEFAULT;
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
			case LocalSearchPackage.SOLUTION_CHANGE___SET_CURRENT_SOLUTION__SOLUTION_BOOLEAN:
				setCurrentSolution((Solution)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case LocalSearchPackage.SOLUTION_CHANGE___SET_START_SOLUTION:
				setStartSolution();
				return null;
			case LocalSearchPackage.SOLUTION_CHANGE___SET_END_SOLUTION:
				setEndSolution();
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
		result.append(" (KeepSolutions: ");
		result.append(keepSolutions);
		result.append(", NewSolution: ");
		result.append(newSolution);
		result.append(')');
		return result.toString();
	}

} //SolutionChangeImpl
