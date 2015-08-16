/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorLpConsCount;
import com.misc.common.moplaf.solver.GeneratorLpConsCountElement;
import com.misc.common.moplaf.solver.SolverPackage;

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
 * An implementation of the model object '<em><b>Generator Lp Cons Count</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpConsCountImpl#getLpConsCountElement <em>Lp Cons Count Element</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorLpConsCountImpl#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorLpConsCountImpl extends MinimalEObjectImpl.Container implements GeneratorLpConsCount {
	/**
	 * The cached value of the '{@link #getLpConsCountElement() <em>Lp Cons Count Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpConsCountElement()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorLpConsCountElement> lpConsCountElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpConsCountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_LP_CONS_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorLpConsCountElement> getLpConsCountElement() {
		if (lpConsCountElement == null) {
			lpConsCountElement = new EObjectContainmentWithInverseEList<GeneratorLpConsCountElement>(GeneratorLpConsCountElement.class, this, SolverPackage.GENERATOR_LP_CONS_COUNT__LP_CONS_COUNT_ELEMENT, SolverPackage.GENERATOR_LP_CONS_COUNT_ELEMENT__ELP_CONS_COUNT);
		}
		return lpConsCountElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator getGenerator() {
		if (eContainerFeatureID() != SolverPackage.GENERATOR_LP_CONS_COUNT__GENERATOR) return null;
		return (Generator)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerator(Generator newGenerator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenerator, SolverPackage.GENERATOR_LP_CONS_COUNT__GENERATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(Generator newGenerator) {
		if (newGenerator != eInternalContainer() || (eContainerFeatureID() != SolverPackage.GENERATOR_LP_CONS_COUNT__GENERATOR && newGenerator != null)) {
			if (EcoreUtil.isAncestor(this, newGenerator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenerator != null)
				msgs = ((InternalEObject)newGenerator).eInverseAdd(this, SolverPackage.GENERATOR__ELP_CONS_COUNT, Generator.class, msgs);
			msgs = basicSetGenerator(newGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_LP_CONS_COUNT__GENERATOR, newGenerator, newGenerator));
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
			case SolverPackage.GENERATOR_LP_CONS_COUNT__LP_CONS_COUNT_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLpConsCountElement()).basicAdd(otherEnd, msgs);
			case SolverPackage.GENERATOR_LP_CONS_COUNT__GENERATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenerator((Generator)otherEnd, msgs);
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
			case SolverPackage.GENERATOR_LP_CONS_COUNT__LP_CONS_COUNT_ELEMENT:
				return ((InternalEList<?>)getLpConsCountElement()).basicRemove(otherEnd, msgs);
			case SolverPackage.GENERATOR_LP_CONS_COUNT__GENERATOR:
				return basicSetGenerator(null, msgs);
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
			case SolverPackage.GENERATOR_LP_CONS_COUNT__GENERATOR:
				return eInternalContainer().eInverseRemove(this, SolverPackage.GENERATOR__ELP_CONS_COUNT, Generator.class, msgs);
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
			case SolverPackage.GENERATOR_LP_CONS_COUNT__LP_CONS_COUNT_ELEMENT:
				return getLpConsCountElement();
			case SolverPackage.GENERATOR_LP_CONS_COUNT__GENERATOR:
				return getGenerator();
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
			case SolverPackage.GENERATOR_LP_CONS_COUNT__LP_CONS_COUNT_ELEMENT:
				getLpConsCountElement().clear();
				getLpConsCountElement().addAll((Collection<? extends GeneratorLpConsCountElement>)newValue);
				return;
			case SolverPackage.GENERATOR_LP_CONS_COUNT__GENERATOR:
				setGenerator((Generator)newValue);
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
			case SolverPackage.GENERATOR_LP_CONS_COUNT__LP_CONS_COUNT_ELEMENT:
				getLpConsCountElement().clear();
				return;
			case SolverPackage.GENERATOR_LP_CONS_COUNT__GENERATOR:
				setGenerator((Generator)null);
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
			case SolverPackage.GENERATOR_LP_CONS_COUNT__LP_CONS_COUNT_ELEMENT:
				return lpConsCountElement != null && !lpConsCountElement.isEmpty();
			case SolverPackage.GENERATOR_LP_CONS_COUNT__GENERATOR:
				return getGenerator() != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneratorLpConsCountImpl
