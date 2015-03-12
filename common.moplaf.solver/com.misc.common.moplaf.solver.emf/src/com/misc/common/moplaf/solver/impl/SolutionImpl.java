/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorCons;
import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionCons;
import com.misc.common.moplaf.solver.SolutionProvider;
import com.misc.common.moplaf.solver.SolutionVar;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.SolverPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionImpl#getVar <em>Var</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionImpl#getCons <em>Cons</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionImpl#getSolutionNr <em>Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionImpl#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolutionImpl extends MinimalEObjectImpl.Container implements Solution {
	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionVar> var;
	/**
	 * The cached value of the '{@link #getCons() <em>Cons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCons()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionCons> cons;

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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

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
		return SolverPackage.Literals.SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionVar> getVar() {
		if (var == null) {
			var = new EObjectContainmentWithInverseEList<SolutionVar>(SolutionVar.class, this, SolverPackage.SOLUTION__VAR, SolverPackage.SOLUTION_VAR__SOLUTION);
		}
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionCons> getCons() {
		if (cons == null) {
			cons = new EObjectContainmentWithInverseEList<SolutionCons>(SolutionCons.class, this, SolverPackage.SOLUTION__CONS, SolverPackage.SOLUTION_CONS__SOLUTION);
		}
		return cons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionProvider getProvider() {
		if (eContainerFeatureID() != SolverPackage.SOLUTION__PROVIDER) return null;
		return (SolutionProvider)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(SolutionProvider newProvider, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProvider, SolverPackage.SOLUTION__PROVIDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(SolutionProvider newProvider) {
		if (newProvider != eInternalContainer() || (eContainerFeatureID() != SolverPackage.SOLUTION__PROVIDER && newProvider != null)) {
			if (EcoreUtil.isAncestor(this, newProvider))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, SolverPackage.SOLUTION_PROVIDER__SOLUTION, SolutionProvider.class, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION__PROVIDER, newProvider, newProvider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION__SOLUTION_NR, oldSolutionNr, solutionNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getCode() {
		String provider = this.getProvider().getCode();
		int thisNr = this.getSolutionNr();
		String string = String.format("%1$s/%2$d", provider, thisNr);
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setCode(String newCode) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionVar solutionVarFactory() {
		SolutionVar newSolutionVar = SolverFactory.eINSTANCE.createSolutionVar();
		return newSolutionVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionCons solutionConsFactory() {
		SolutionCons newSolutionCons = SolverFactory.eINSTANCE.createSolutionCons();
		return newSolutionCons;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionCons constructSolutionCons(GeneratorCons cons) {
		SolutionCons newSolutionCons = this.solutionConsFactory();
		this.getCons().add(newSolutionCons);
		return newSolutionCons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionVar constructSolutionVar(GeneratorVar var) {
		SolutionVar newSolutionVar = this.solutionVarFactory();
		var.getSolution().add(newSolutionVar);
		this.getVar().add(newSolutionVar);
		return newSolutionVar;
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
			case SolverPackage.SOLUTION__VAR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVar()).basicAdd(otherEnd, msgs);
			case SolverPackage.SOLUTION__CONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCons()).basicAdd(otherEnd, msgs);
			case SolverPackage.SOLUTION__PROVIDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProvider((SolutionProvider)otherEnd, msgs);
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
			case SolverPackage.SOLUTION__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case SolverPackage.SOLUTION__CONS:
				return ((InternalEList<?>)getCons()).basicRemove(otherEnd, msgs);
			case SolverPackage.SOLUTION__PROVIDER:
				return basicSetProvider(null, msgs);
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
			case SolverPackage.SOLUTION__PROVIDER:
				return eInternalContainer().eInverseRemove(this, SolverPackage.SOLUTION_PROVIDER__SOLUTION, SolutionProvider.class, msgs);
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
			case SolverPackage.SOLUTION__VAR:
				return getVar();
			case SolverPackage.SOLUTION__CONS:
				return getCons();
			case SolverPackage.SOLUTION__PROVIDER:
				return getProvider();
			case SolverPackage.SOLUTION__SOLUTION_NR:
				return getSolutionNr();
			case SolverPackage.SOLUTION__CODE:
				return getCode();
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
			case SolverPackage.SOLUTION__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends SolutionVar>)newValue);
				return;
			case SolverPackage.SOLUTION__CONS:
				getCons().clear();
				getCons().addAll((Collection<? extends SolutionCons>)newValue);
				return;
			case SolverPackage.SOLUTION__PROVIDER:
				setProvider((SolutionProvider)newValue);
				return;
			case SolverPackage.SOLUTION__SOLUTION_NR:
				setSolutionNr((Integer)newValue);
				return;
			case SolverPackage.SOLUTION__CODE:
				setCode((String)newValue);
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
			case SolverPackage.SOLUTION__VAR:
				getVar().clear();
				return;
			case SolverPackage.SOLUTION__CONS:
				getCons().clear();
				return;
			case SolverPackage.SOLUTION__PROVIDER:
				setProvider((SolutionProvider)null);
				return;
			case SolverPackage.SOLUTION__SOLUTION_NR:
				setSolutionNr(SOLUTION_NR_EDEFAULT);
				return;
			case SolverPackage.SOLUTION__CODE:
				setCode(CODE_EDEFAULT);
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
			case SolverPackage.SOLUTION__VAR:
				return var != null && !var.isEmpty();
			case SolverPackage.SOLUTION__CONS:
				return cons != null && !cons.isEmpty();
			case SolverPackage.SOLUTION__PROVIDER:
				return getProvider() != null;
			case SolverPackage.SOLUTION__SOLUTION_NR:
				return solutionNr != SOLUTION_NR_EDEFAULT;
			case SolverPackage.SOLUTION__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
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
			case SolverPackage.SOLUTION___SOLUTION_VAR_FACTORY:
				return solutionVarFactory();
			case SolverPackage.SOLUTION___SOLUTION_CONS_FACTORY:
				return solutionConsFactory();
			case SolverPackage.SOLUTION___CONSTRUCT_SOLUTION_CONS__GENERATORCONS:
				return constructSolutionCons((GeneratorCons)arguments.get(0));
			case SolverPackage.SOLUTION___CONSTRUCT_SOLUTION_VAR__GENERATORVAR:
				return constructSolutionVar((GeneratorVar)arguments.get(0));
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
		result.append(')');
		return result.toString();
	}

} //SolutionImpl
