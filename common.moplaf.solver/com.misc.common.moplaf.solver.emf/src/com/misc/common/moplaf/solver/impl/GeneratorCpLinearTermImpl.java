/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorCpLinearTerm;
import com.misc.common.moplaf.solver.GeneratorCpVarAtomic;
import com.misc.common.moplaf.solver.SolverPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Cp Linear Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorCpLinearTermImpl#getCoeff <em>Coeff</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorCpLinearTermImpl#getCpVar <em>Cp Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorCpLinearTermImpl extends MinimalEObjectImpl.Container implements GeneratorCpLinearTerm {
	/**
	 * The default value of the '{@link #getCoeff() <em>Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoeff()
	 * @generated
	 * @ordered
	 */
	protected static final int COEFF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoeff() <em>Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoeff()
	 * @generated
	 * @ordered
	 */
	protected int coeff = COEFF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCpVar() <em>Cp Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpVar()
	 * @generated
	 * @ordered
	 */
	protected GeneratorCpVarAtomic cpVar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorCpLinearTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_CP_LINEAR_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoeff() {
		return coeff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoeff(int newCoeff) {
		int oldCoeff = coeff;
		coeff = newCoeff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_CP_LINEAR_TERM__COEFF, oldCoeff, coeff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorCpVarAtomic getCpVar() {
		if (cpVar != null && cpVar.eIsProxy()) {
			InternalEObject oldCpVar = (InternalEObject)cpVar;
			cpVar = (GeneratorCpVarAtomic)eResolveProxy(oldCpVar);
			if (cpVar != oldCpVar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.GENERATOR_CP_LINEAR_TERM__CP_VAR, oldCpVar, cpVar));
			}
		}
		return cpVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorCpVarAtomic basicGetCpVar() {
		return cpVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpVar(GeneratorCpVarAtomic newCpVar) {
		GeneratorCpVarAtomic oldCpVar = cpVar;
		cpVar = newCpVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_CP_LINEAR_TERM__CP_VAR, oldCpVar, cpVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.GENERATOR_CP_LINEAR_TERM__COEFF:
				return getCoeff();
			case SolverPackage.GENERATOR_CP_LINEAR_TERM__CP_VAR:
				if (resolve) return getCpVar();
				return basicGetCpVar();
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
			case SolverPackage.GENERATOR_CP_LINEAR_TERM__COEFF:
				setCoeff((Integer)newValue);
				return;
			case SolverPackage.GENERATOR_CP_LINEAR_TERM__CP_VAR:
				setCpVar((GeneratorCpVarAtomic)newValue);
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
			case SolverPackage.GENERATOR_CP_LINEAR_TERM__COEFF:
				setCoeff(COEFF_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_CP_LINEAR_TERM__CP_VAR:
				setCpVar((GeneratorCpVarAtomic)null);
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
			case SolverPackage.GENERATOR_CP_LINEAR_TERM__COEFF:
				return coeff != COEFF_EDEFAULT;
			case SolverPackage.GENERATOR_CP_LINEAR_TERM__CP_VAR:
				return cpVar != null;
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

} //GeneratorCpLinearTermImpl
