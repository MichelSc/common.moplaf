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
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionProvidedEvents;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionSequence;
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
 * An implementation of the model object '<em><b>Propagator Calc Distribution Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionSequenceImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcDistributionSequenceImpl#getAntecedentCalcDistributionProvidedEvents <em>Antecedent Calc Distribution Provided Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagatorCalcDistributionSequenceImpl extends PropagatorFunctionDistributionImpl implements PropagatorCalcDistributionSequence {
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
	 * The cached value of the '{@link #getAntecedentCalcDistributionProvidedEvents() <em>Antecedent Calc Distribution Provided Events</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentCalcDistributionProvidedEvents()
	 * @generated
	 * @ordered
	 */
	protected PropagatorCalcDistributionProvidedEvents antecedentCalcDistributionProvidedEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorCalcDistributionSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__CONCRETE_PARENT, oldConcreteParent, concreteParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcDistributionProvidedEvents getAntecedentCalcDistributionProvidedEvents() {
		if (antecedentCalcDistributionProvidedEvents != null && antecedentCalcDistributionProvidedEvents.eIsProxy()) {
			InternalEObject oldAntecedentCalcDistributionProvidedEvents = (InternalEObject)antecedentCalcDistributionProvidedEvents;
			antecedentCalcDistributionProvidedEvents = (PropagatorCalcDistributionProvidedEvents)eResolveProxy(oldAntecedentCalcDistributionProvidedEvents);
			if (antecedentCalcDistributionProvidedEvents != oldAntecedentCalcDistributionProvidedEvents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__ANTECEDENT_CALC_DISTRIBUTION_PROVIDED_EVENTS, oldAntecedentCalcDistributionProvidedEvents, antecedentCalcDistributionProvidedEvents));
			}
		}
		return antecedentCalcDistributionProvidedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcDistributionProvidedEvents basicGetAntecedentCalcDistributionProvidedEvents() {
		return antecedentCalcDistributionProvidedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedentCalcDistributionProvidedEvents(PropagatorCalcDistributionProvidedEvents newAntecedentCalcDistributionProvidedEvents) {
		PropagatorCalcDistributionProvidedEvents oldAntecedentCalcDistributionProvidedEvents = antecedentCalcDistributionProvidedEvents;
		antecedentCalcDistributionProvidedEvents = newAntecedentCalcDistributionProvidedEvents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__ANTECEDENT_CALC_DISTRIBUTION_PROVIDED_EVENTS, oldAntecedentCalcDistributionProvidedEvents, antecedentCalcDistributionProvidedEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__ANTECEDENT_CALC_DISTRIBUTION_PROVIDED_EVENTS:
				if (resolve) return getAntecedentCalcDistributionProvidedEvents();
				return basicGetAntecedentCalcDistributionProvidedEvents();
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
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__CONCRETE_PARENT:
				setConcreteParent((PropagatorScopeDistribution)newValue);
				return;
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__ANTECEDENT_CALC_DISTRIBUTION_PROVIDED_EVENTS:
				setAntecedentCalcDistributionProvidedEvents((PropagatorCalcDistributionProvidedEvents)newValue);
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
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__CONCRETE_PARENT:
				setConcreteParent((PropagatorScopeDistribution)null);
				return;
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__ANTECEDENT_CALC_DISTRIBUTION_PROVIDED_EVENTS:
				setAntecedentCalcDistributionProvidedEvents((PropagatorCalcDistributionProvidedEvents)null);
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
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__CONCRETE_PARENT:
				return concreteParent != null;
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_DISTRIBUTION_SEQUENCE__ANTECEDENT_CALC_DISTRIBUTION_PROVIDED_EVENTS:
				return antecedentCalcDistributionProvidedEvents != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void init() {
		super.init();
		Distribution distribution = this.getDistribution();
		this.setConcreteParent(distribution.getPropagatorFunction(PropagatorScopeDistribution.class));
		this.setAntecedentCalcDistributionProvidedEvents(distribution.getPropagatorFunction(PropagatorCalcDistributionProvidedEvents.class));
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}

	@Override
	public void doCollectExplicitAntecedents(EList<PropagatorFunction> antecedents) {
		antecedents.add(this.getAntecedentCalcDistributionProvidedEvents());
	}

	private static Bindings distributionEventBindings = Bindings.constructBindings()
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT);
	
	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl#doGetBindings()
	 */
	@Override
	public Bindings doGetBindings() {
		return distributionEventBindings;
	}

	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#doRefresh()
	 */
	@Override
	public void doRefresh() {
		Distribution distribution = this.getDistribution();
		distribution.refreshSequence();
	}
} //PropagatorCalcDistributionSequenceImpl
