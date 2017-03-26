/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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
package com.misc.common.moplaf.time.continuous.calc.impl;


import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes;
import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Layer Distribution Slopes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerDistributionSlopesImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerDistributionSlopesImpl#getAntecedentCalcDistributionSequence <em>Antecedent Calc Distribution Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagatorLayerDistributionSlopesImpl extends PropagatorFunctionDistributionImpl implements PropagatorLayerDistributionSlopes {
	/**
	 * The cached value of the '{@link #getConcreteParent() <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteParent()
	 * @generated
	 * @ordered
	 */
	protected PropagatorScopeDistribution concreteParent;
	/**
	 * The cached value of the '{@link #getAntecedentCalcDistributionSequence() <em>Antecedent Calc Distribution Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentCalcDistributionSequence()
	 * @generated
	 * @ordered
	 */
	protected PropagatorCalcDistributionSequence antecedentCalcDistributionSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorLayerDistributionSlopesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorScopeDistribution getConcreteParent() {
		if (concreteParent != null && concreteParent.eIsProxy()) {
			InternalEObject oldConcreteParent = (InternalEObject)concreteParent;
			concreteParent = (PropagatorScopeDistribution)eResolveProxy(oldConcreteParent);
			if (concreteParent != oldConcreteParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__CONCRETE_PARENT, oldConcreteParent, concreteParent));
			}
		}
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorScopeDistribution basicGetConcreteParent() {
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteParent(PropagatorScopeDistribution newConcreteParent) {
		PropagatorScopeDistribution oldConcreteParent = concreteParent;
		concreteParent = newConcreteParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcDistributionSequence getAntecedentCalcDistributionSequence() {
		if (antecedentCalcDistributionSequence != null && antecedentCalcDistributionSequence.eIsProxy()) {
			InternalEObject oldAntecedentCalcDistributionSequence = (InternalEObject)antecedentCalcDistributionSequence;
			antecedentCalcDistributionSequence = (PropagatorCalcDistributionSequence)eResolveProxy(oldAntecedentCalcDistributionSequence);
			if (antecedentCalcDistributionSequence != oldAntecedentCalcDistributionSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__ANTECEDENT_CALC_DISTRIBUTION_SEQUENCE, oldAntecedentCalcDistributionSequence, antecedentCalcDistributionSequence));
			}
		}
		return antecedentCalcDistributionSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcDistributionSequence basicGetAntecedentCalcDistributionSequence() {
		return antecedentCalcDistributionSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedentCalcDistributionSequence(PropagatorCalcDistributionSequence newAntecedentCalcDistributionSequence) {
		PropagatorCalcDistributionSequence oldAntecedentCalcDistributionSequence = antecedentCalcDistributionSequence;
		antecedentCalcDistributionSequence = newAntecedentCalcDistributionSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__ANTECEDENT_CALC_DISTRIBUTION_SEQUENCE, oldAntecedentCalcDistributionSequence, antecedentCalcDistributionSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__ANTECEDENT_CALC_DISTRIBUTION_SEQUENCE:
				if (resolve) return getAntecedentCalcDistributionSequence();
				return basicGetAntecedentCalcDistributionSequence();
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
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__CONCRETE_PARENT:
				setConcreteParent((PropagatorScopeDistribution)newValue);
				return;
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__ANTECEDENT_CALC_DISTRIBUTION_SEQUENCE:
				setAntecedentCalcDistributionSequence((PropagatorCalcDistributionSequence)newValue);
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
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__CONCRETE_PARENT:
				setConcreteParent((PropagatorScopeDistribution)null);
				return;
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__ANTECEDENT_CALC_DISTRIBUTION_SEQUENCE:
				setAntecedentCalcDistributionSequence((PropagatorCalcDistributionSequence)null);
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
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__CONCRETE_PARENT:
				return concreteParent != null;
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_SLOPES__ANTECEDENT_CALC_DISTRIBUTION_SEQUENCE:
				return antecedentCalcDistributionSequence != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void init() {
		super.init();
		Distribution distribution = this.getDistribution();
		this.setConcreteParent(distribution.getPropagatorFunction(PropagatorScopeDistribution.class));
		this.setAntecedentCalcDistributionSequence(distribution.getPropagatorFunction(PropagatorCalcDistributionSequence.class));
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}

	@Override
	public void doCollectExplicitAntecedents(EList<PropagatorFunction> antecedents) {
		antecedents.add(this.getAntecedentCalcDistributionSequence());
	}
} //PropagatorLayerDistributionSlopesImpl
