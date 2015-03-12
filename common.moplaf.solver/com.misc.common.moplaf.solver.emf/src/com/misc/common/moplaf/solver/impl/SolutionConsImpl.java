/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorCons;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionCons;
import com.misc.common.moplaf.solver.SolverPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution Cons</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionConsImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionConsImpl#getCons <em>Cons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolutionConsImpl extends MinimalEObjectImpl.Container implements SolutionCons {
	/**
	 * The cached value of the '{@link #getCons() <em>Cons</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCons()
	 * @generated
	 * @ordered
	 */
	protected GeneratorCons cons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionConsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLUTION_CONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getSolution() {
		if (eContainerFeatureID() != SolverPackage.SOLUTION_CONS__SOLUTION) return null;
		return (Solution)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolution(Solution newSolution, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSolution, SolverPackage.SOLUTION_CONS__SOLUTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolution(Solution newSolution) {
		if (newSolution != eInternalContainer() || (eContainerFeatureID() != SolverPackage.SOLUTION_CONS__SOLUTION && newSolution != null)) {
			if (EcoreUtil.isAncestor(this, newSolution))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSolution != null)
				msgs = ((InternalEObject)newSolution).eInverseAdd(this, SolverPackage.SOLUTION__CONS, Solution.class, msgs);
			msgs = basicSetSolution(newSolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_CONS__SOLUTION, newSolution, newSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorCons getCons() {
		if (cons != null && cons.eIsProxy()) {
			InternalEObject oldCons = (InternalEObject)cons;
			cons = (GeneratorCons)eResolveProxy(oldCons);
			if (cons != oldCons) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLUTION_CONS__CONS, oldCons, cons));
			}
		}
		return cons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorCons basicGetCons() {
		return cons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCons(GeneratorCons newCons, NotificationChain msgs) {
		GeneratorCons oldCons = cons;
		cons = newCons;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_CONS__CONS, oldCons, newCons);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCons(GeneratorCons newCons) {
		if (newCons != cons) {
			NotificationChain msgs = null;
			if (cons != null)
				msgs = ((InternalEObject)cons).eInverseRemove(this, SolverPackage.GENERATOR_CONS__SOLUTION, GeneratorCons.class, msgs);
			if (newCons != null)
				msgs = ((InternalEObject)newCons).eInverseAdd(this, SolverPackage.GENERATOR_CONS__SOLUTION, GeneratorCons.class, msgs);
			msgs = basicSetCons(newCons, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_CONS__CONS, newCons, newCons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.SOLUTION_CONS__SOLUTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSolution((Solution)otherEnd, msgs);
			case SolverPackage.SOLUTION_CONS__CONS:
				if (cons != null)
					msgs = ((InternalEObject)cons).eInverseRemove(this, SolverPackage.GENERATOR_CONS__SOLUTION, GeneratorCons.class, msgs);
				return basicSetCons((GeneratorCons)otherEnd, msgs);
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
			case SolverPackage.SOLUTION_CONS__SOLUTION:
				return basicSetSolution(null, msgs);
			case SolverPackage.SOLUTION_CONS__CONS:
				return basicSetCons(null, msgs);
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
			case SolverPackage.SOLUTION_CONS__SOLUTION:
				return eInternalContainer().eInverseRemove(this, SolverPackage.SOLUTION__CONS, Solution.class, msgs);
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
			case SolverPackage.SOLUTION_CONS__SOLUTION:
				return getSolution();
			case SolverPackage.SOLUTION_CONS__CONS:
				if (resolve) return getCons();
				return basicGetCons();
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
			case SolverPackage.SOLUTION_CONS__SOLUTION:
				setSolution((Solution)newValue);
				return;
			case SolverPackage.SOLUTION_CONS__CONS:
				setCons((GeneratorCons)newValue);
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
			case SolverPackage.SOLUTION_CONS__SOLUTION:
				setSolution((Solution)null);
				return;
			case SolverPackage.SOLUTION_CONS__CONS:
				setCons((GeneratorCons)null);
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
			case SolverPackage.SOLUTION_CONS__SOLUTION:
				return getSolution() != null;
			case SolverPackage.SOLUTION_CONS__CONS:
				return cons != null;
		}
		return super.eIsSet(featureID);
	}

} //SolutionConsImpl
