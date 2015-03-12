/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionVar;
import com.misc.common.moplaf.solver.SolverPackage;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionVarImpl#getOptimalValue <em>Optimal Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionVarImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionVarImpl#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolutionVarImpl extends MinimalEObjectImpl.Container implements SolutionVar {
	/**
	 * The default value of the '{@link #getOptimalValue() <em>Optimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimalValue()
	 * @generated
	 * @ordered
	 */
	protected static final float OPTIMAL_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOptimalValue() <em>Optimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimalValue()
	 * @generated
	 * @ordered
	 */
	protected float optimalValue = OPTIMAL_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected GeneratorVar var;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLUTION_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOptimalValue() {
		return optimalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimalValue(float newOptimalValue) {
		float oldOptimalValue = optimalValue;
		optimalValue = newOptimalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_VAR__OPTIMAL_VALUE, oldOptimalValue, optimalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getSolution() {
		if (eContainerFeatureID() != SolverPackage.SOLUTION_VAR__SOLUTION) return null;
		return (Solution)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolution(Solution newSolution, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSolution, SolverPackage.SOLUTION_VAR__SOLUTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolution(Solution newSolution) {
		if (newSolution != eInternalContainer() || (eContainerFeatureID() != SolverPackage.SOLUTION_VAR__SOLUTION && newSolution != null)) {
			if (EcoreUtil.isAncestor(this, newSolution))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSolution != null)
				msgs = ((InternalEObject)newSolution).eInverseAdd(this, SolverPackage.SOLUTION__VAR, Solution.class, msgs);
			msgs = basicSetSolution(newSolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_VAR__SOLUTION, newSolution, newSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorVar getVar() {
		if (var != null && var.eIsProxy()) {
			InternalEObject oldVar = (InternalEObject)var;
			var = (GeneratorVar)eResolveProxy(oldVar);
			if (var != oldVar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLUTION_VAR__VAR, oldVar, var));
			}
		}
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorVar basicGetVar() {
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVar(GeneratorVar newVar, NotificationChain msgs) {
		GeneratorVar oldVar = var;
		var = newVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_VAR__VAR, oldVar, newVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar(GeneratorVar newVar) {
		if (newVar != var) {
			NotificationChain msgs = null;
			if (var != null)
				msgs = ((InternalEObject)var).eInverseRemove(this, SolverPackage.GENERATOR_VAR__SOLUTION, GeneratorVar.class, msgs);
			if (newVar != null)
				msgs = ((InternalEObject)newVar).eInverseAdd(this, SolverPackage.GENERATOR_VAR__SOLUTION, GeneratorVar.class, msgs);
			msgs = basicSetVar(newVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_VAR__VAR, newVar, newVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOne() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isZero() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.SOLUTION_VAR__SOLUTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSolution((Solution)otherEnd, msgs);
			case SolverPackage.SOLUTION_VAR__VAR:
				if (var != null)
					msgs = ((InternalEObject)var).eInverseRemove(this, SolverPackage.GENERATOR_VAR__SOLUTION, GeneratorVar.class, msgs);
				return basicSetVar((GeneratorVar)otherEnd, msgs);
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
			case SolverPackage.SOLUTION_VAR__SOLUTION:
				return basicSetSolution(null, msgs);
			case SolverPackage.SOLUTION_VAR__VAR:
				return basicSetVar(null, msgs);
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
			case SolverPackage.SOLUTION_VAR__SOLUTION:
				return eInternalContainer().eInverseRemove(this, SolverPackage.SOLUTION__VAR, Solution.class, msgs);
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
			case SolverPackage.SOLUTION_VAR__OPTIMAL_VALUE:
				return getOptimalValue();
			case SolverPackage.SOLUTION_VAR__SOLUTION:
				return getSolution();
			case SolverPackage.SOLUTION_VAR__VAR:
				if (resolve) return getVar();
				return basicGetVar();
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
			case SolverPackage.SOLUTION_VAR__OPTIMAL_VALUE:
				setOptimalValue((Float)newValue);
				return;
			case SolverPackage.SOLUTION_VAR__SOLUTION:
				setSolution((Solution)newValue);
				return;
			case SolverPackage.SOLUTION_VAR__VAR:
				setVar((GeneratorVar)newValue);
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
			case SolverPackage.SOLUTION_VAR__OPTIMAL_VALUE:
				setOptimalValue(OPTIMAL_VALUE_EDEFAULT);
				return;
			case SolverPackage.SOLUTION_VAR__SOLUTION:
				setSolution((Solution)null);
				return;
			case SolverPackage.SOLUTION_VAR__VAR:
				setVar((GeneratorVar)null);
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
			case SolverPackage.SOLUTION_VAR__OPTIMAL_VALUE:
				return optimalValue != OPTIMAL_VALUE_EDEFAULT;
			case SolverPackage.SOLUTION_VAR__SOLUTION:
				return getSolution() != null;
			case SolverPackage.SOLUTION_VAR__VAR:
				return var != null;
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
			case SolverPackage.SOLUTION_VAR___IS_ONE:
				return isOne();
			case SolverPackage.SOLUTION_VAR___IS_ZERO:
				return isZero();
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
		result.append(" (OptimalValue: ");
		result.append(optimalValue);
		result.append(')');
		return result.toString();
	}

} //SolutionVarImpl
