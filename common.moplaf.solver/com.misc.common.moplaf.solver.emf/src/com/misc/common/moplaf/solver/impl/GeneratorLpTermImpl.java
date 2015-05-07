/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
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
 * An implementation of the model object '<em><b>Generator Lp Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpTermImpl#getLpVar <em>Lp Var</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpTermImpl#getCoeff <em>Coeff</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpTermImpl#getLpCons <em>Lp Cons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorLpTermImpl extends MinimalEObjectImpl.Container implements GeneratorLpTerm {
	/**
	 * The cached value of the '{@link #getLpVar() <em>Lp Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpVar()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar lpVar;

	/**
	 * The default value of the '{@link #getCoeff() <em>Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoeff()
	 * @generated
	 * @ordered
	 */
	protected static final float COEFF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoeff() <em>Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoeff()
	 * @generated
	 * @ordered
	 */
	protected float coeff = COEFF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_LP_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar getLpVar() {
		if (lpVar != null && lpVar.eIsProxy()) {
			InternalEObject oldLpVar = (InternalEObject)lpVar;
			lpVar = (GeneratorLpVar)eResolveProxy(oldLpVar);
			if (lpVar != oldLpVar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.GENERATOR_LP_TERM__LP_VAR, oldLpVar, lpVar));
			}
		}
		return lpVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar basicGetLpVar() {
		return lpVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLpVar(GeneratorLpVar newLpVar, NotificationChain msgs) {
		GeneratorLpVar oldLpVar = lpVar;
		lpVar = newLpVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_TERM__LP_VAR, oldLpVar, newLpVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLpVar(GeneratorLpVar newLpVar) {
		if (newLpVar != lpVar) {
			NotificationChain msgs = null;
			if (lpVar != null)
				msgs = ((InternalEObject)lpVar).eInverseRemove(this, SolverPackage.GENERATOR_LP_VAR__LP_TERM, GeneratorLpVar.class, msgs);
			if (newLpVar != null)
				msgs = ((InternalEObject)newLpVar).eInverseAdd(this, SolverPackage.GENERATOR_LP_VAR__LP_TERM, GeneratorLpVar.class, msgs);
			msgs = basicSetLpVar(newLpVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_TERM__LP_VAR, newLpVar, newLpVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoeff() {
		return coeff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoeff(float newCoeff) {
		float oldCoeff = coeff;
		coeff = newCoeff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_TERM__COEFF, oldCoeff, coeff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpCons getLpCons() {
		if (eContainerFeatureID() != SolverPackage.GENERATOR_LP_TERM__LP_CONS) return null;
		return (GeneratorLpCons)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLpCons(GeneratorLpCons newLpCons, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLpCons, SolverPackage.GENERATOR_LP_TERM__LP_CONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLpCons(GeneratorLpCons newLpCons) {
		if (newLpCons != eInternalContainer() || (eContainerFeatureID() != SolverPackage.GENERATOR_LP_TERM__LP_CONS && newLpCons != null)) {
			if (EcoreUtil.isAncestor(this, newLpCons))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLpCons != null)
				msgs = ((InternalEObject)newLpCons).eInverseAdd(this, SolverPackage.GENERATOR_LP_CONS__LP_TERM, GeneratorLpCons.class, msgs);
			msgs = basicSetLpCons(newLpCons, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_TERM__LP_CONS, newLpCons, newLpCons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.GENERATOR_LP_TERM__LP_VAR:
				if (lpVar != null)
					msgs = ((InternalEObject)lpVar).eInverseRemove(this, SolverPackage.GENERATOR_LP_VAR__LP_TERM, GeneratorLpVar.class, msgs);
				return basicSetLpVar((GeneratorLpVar)otherEnd, msgs);
			case SolverPackage.GENERATOR_LP_TERM__LP_CONS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLpCons((GeneratorLpCons)otherEnd, msgs);
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
			case SolverPackage.GENERATOR_LP_TERM__LP_VAR:
				return basicSetLpVar(null, msgs);
			case SolverPackage.GENERATOR_LP_TERM__LP_CONS:
				return basicSetLpCons(null, msgs);
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
			case SolverPackage.GENERATOR_LP_TERM__LP_CONS:
				return eInternalContainer().eInverseRemove(this, SolverPackage.GENERATOR_LP_CONS__LP_TERM, GeneratorLpCons.class, msgs);
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
			case SolverPackage.GENERATOR_LP_TERM__LP_VAR:
				if (resolve) return getLpVar();
				return basicGetLpVar();
			case SolverPackage.GENERATOR_LP_TERM__COEFF:
				return getCoeff();
			case SolverPackage.GENERATOR_LP_TERM__LP_CONS:
				return getLpCons();
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
			case SolverPackage.GENERATOR_LP_TERM__LP_VAR:
				setLpVar((GeneratorLpVar)newValue);
				return;
			case SolverPackage.GENERATOR_LP_TERM__COEFF:
				setCoeff((Float)newValue);
				return;
			case SolverPackage.GENERATOR_LP_TERM__LP_CONS:
				setLpCons((GeneratorLpCons)newValue);
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
			case SolverPackage.GENERATOR_LP_TERM__LP_VAR:
				setLpVar((GeneratorLpVar)null);
				return;
			case SolverPackage.GENERATOR_LP_TERM__COEFF:
				setCoeff(COEFF_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_LP_TERM__LP_CONS:
				setLpCons((GeneratorLpCons)null);
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
			case SolverPackage.GENERATOR_LP_TERM__LP_VAR:
				return lpVar != null;
			case SolverPackage.GENERATOR_LP_TERM__COEFF:
				return coeff != COEFF_EDEFAULT;
			case SolverPackage.GENERATOR_LP_TERM__LP_CONS:
				return getLpCons() != null;
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
		result.append(" (Coeff: ");
		result.append(coeff);
		result.append(')');
		return result.toString();
	}

} //GeneratorLpTermImpl
