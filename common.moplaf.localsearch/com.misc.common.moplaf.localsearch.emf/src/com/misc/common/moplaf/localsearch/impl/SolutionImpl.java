/**
 */
package com.misc.common.moplaf.localsearch.impl;

import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.Strategy;
import com.misc.common.moplaf.propagator2.Plugin;
import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionImpl#getScore <em>Score</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionImpl#getSolutionNr <em>Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionImpl#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionImpl#getDescendants <em>Descendants</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.impl.SolutionImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SolutionImpl extends ObjectWithPropagatorFunctionsImpl implements Solution {
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
	 * The default value of the '{@link #getSolutionNr() <em>Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionNr()
	 * @generated
	 * @ordered
	 */
	protected static final int SOLUTION_NR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getSolutionNr() <em>Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionNr()
	 * @generated
	 * @ordered
	 */
	protected int solutionNr = SOLUTION_NR_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAncestor() <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncestor()
	 * @generated
	 * @ordered
	 */
	protected Solution ancestor;

	/**
	 * The cached value of the '{@link #getDescendants() <em>Descendants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescendants()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> descendants;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final String STEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected String step = STEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocalSearchPackage.Literals.SOLUTION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION__SCORE, oldScore, newScore);
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
				msgs = ((InternalEObject)score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.SOLUTION__SCORE, null, msgs);
			if (newScore != null)
				msgs = ((InternalEObject)newScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocalSearchPackage.SOLUTION__SCORE, null, msgs);
			msgs = basicSetScore(newScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION__SCORE, newScore, newScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSolutionNr() {
		return solutionNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolutionNr(int newSolutionNr) {
		int oldSolutionNr = solutionNr;
		solutionNr = newSolutionNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION__SOLUTION_NR, oldSolutionNr, solutionNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getAncestor() {
		if (ancestor != null && ancestor.eIsProxy()) {
			InternalEObject oldAncestor = (InternalEObject)ancestor;
			ancestor = (Solution)eResolveProxy(oldAncestor);
			if (ancestor != oldAncestor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocalSearchPackage.SOLUTION__ANCESTOR, oldAncestor, ancestor));
			}
		}
		return ancestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetAncestor() {
		return ancestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAncestor(Solution newAncestor, NotificationChain msgs) {
		Solution oldAncestor = ancestor;
		ancestor = newAncestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION__ANCESTOR, oldAncestor, newAncestor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAncestor(Solution newAncestor) {
		if (newAncestor != ancestor) {
			NotificationChain msgs = null;
			if (ancestor != null)
				msgs = ((InternalEObject)ancestor).eInverseRemove(this, LocalSearchPackage.SOLUTION__DESCENDANTS, Solution.class, msgs);
			if (newAncestor != null)
				msgs = ((InternalEObject)newAncestor).eInverseAdd(this, LocalSearchPackage.SOLUTION__DESCENDANTS, Solution.class, msgs);
			msgs = basicSetAncestor(newAncestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION__ANCESTOR, newAncestor, newAncestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getDescendants() {
		if (descendants == null) {
			descendants = new EObjectWithInverseResolvingEList<Solution>(Solution.class, this, LocalSearchPackage.SOLUTION__DESCENDANTS, LocalSearchPackage.SOLUTION__ANCESTOR);
		}
		return descendants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy getStrategy() {
		Strategy strategy = basicGetStrategy();
		return strategy != null && strategy.eIsProxy() ? (Strategy)eResolveProxy((InternalEObject)strategy) : strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Strategy basicGetStrategy() {
		// root move
		EObject container = this.eContainer;
		if ( container instanceof Strategy){
			return (Strategy) container;
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(String newStep) {
		String oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalSearchPackage.SOLUTION__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Solution clone() {
		Plugin.INSTANCE.logInfo("Solution clone: called");
		Solution new_solution = this.cloneImpl();
		Plugin.INSTANCE.logInfo("Solution clone: done");
		return new_solution;
	}
	
	/**
	 * 
	 * @return
	 */
	protected Solution cloneImpl() {
		// default implementation
		Solution newSolution = (Solution)EcoreUtil.copy(this);
		return newSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refresh() {
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
			case LocalSearchPackage.SOLUTION__ANCESTOR:
				if (ancestor != null)
					msgs = ((InternalEObject)ancestor).eInverseRemove(this, LocalSearchPackage.SOLUTION__DESCENDANTS, Solution.class, msgs);
				return basicSetAncestor((Solution)otherEnd, msgs);
			case LocalSearchPackage.SOLUTION__DESCENDANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDescendants()).basicAdd(otherEnd, msgs);
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
			case LocalSearchPackage.SOLUTION__SCORE:
				return basicSetScore(null, msgs);
			case LocalSearchPackage.SOLUTION__ANCESTOR:
				return basicSetAncestor(null, msgs);
			case LocalSearchPackage.SOLUTION__DESCENDANTS:
				return ((InternalEList<?>)getDescendants()).basicRemove(otherEnd, msgs);
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
			case LocalSearchPackage.SOLUTION__SCORE:
				return getScore();
			case LocalSearchPackage.SOLUTION__SOLUTION_NR:
				return getSolutionNr();
			case LocalSearchPackage.SOLUTION__ANCESTOR:
				if (resolve) return getAncestor();
				return basicGetAncestor();
			case LocalSearchPackage.SOLUTION__DESCENDANTS:
				return getDescendants();
			case LocalSearchPackage.SOLUTION__STRATEGY:
				if (resolve) return getStrategy();
				return basicGetStrategy();
			case LocalSearchPackage.SOLUTION__STEP:
				return getStep();
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
			case LocalSearchPackage.SOLUTION__SCORE:
				setScore((Score)newValue);
				return;
			case LocalSearchPackage.SOLUTION__SOLUTION_NR:
				setSolutionNr((Integer)newValue);
				return;
			case LocalSearchPackage.SOLUTION__ANCESTOR:
				setAncestor((Solution)newValue);
				return;
			case LocalSearchPackage.SOLUTION__DESCENDANTS:
				getDescendants().clear();
				getDescendants().addAll((Collection<? extends Solution>)newValue);
				return;
			case LocalSearchPackage.SOLUTION__STEP:
				setStep((String)newValue);
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
			case LocalSearchPackage.SOLUTION__SCORE:
				setScore((Score)null);
				return;
			case LocalSearchPackage.SOLUTION__SOLUTION_NR:
				setSolutionNr(SOLUTION_NR_EDEFAULT);
				return;
			case LocalSearchPackage.SOLUTION__ANCESTOR:
				setAncestor((Solution)null);
				return;
			case LocalSearchPackage.SOLUTION__DESCENDANTS:
				getDescendants().clear();
				return;
			case LocalSearchPackage.SOLUTION__STEP:
				setStep(STEP_EDEFAULT);
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
			case LocalSearchPackage.SOLUTION__SCORE:
				return score != null;
			case LocalSearchPackage.SOLUTION__SOLUTION_NR:
				return solutionNr != SOLUTION_NR_EDEFAULT;
			case LocalSearchPackage.SOLUTION__ANCESTOR:
				return ancestor != null;
			case LocalSearchPackage.SOLUTION__DESCENDANTS:
				return descendants != null && !descendants.isEmpty();
			case LocalSearchPackage.SOLUTION__STRATEGY:
				return basicGetStrategy() != null;
			case LocalSearchPackage.SOLUTION__STEP:
				return STEP_EDEFAULT == null ? step != null : !STEP_EDEFAULT.equals(step);
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
			case LocalSearchPackage.SOLUTION___CLONE:
				return clone();
			case LocalSearchPackage.SOLUTION___REFRESH:
				refresh();
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
		result.append(" (SolutionNr: ");
		result.append(solutionNr);
		result.append(", Step: ");
		result.append(step);
		result.append(')');
		return result.toString();
	}

} //SolutionImpl
