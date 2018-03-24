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
import com.misc.common.moplaf.time.continuous.calc.CalcDistributionChildEvents;
import com.misc.common.moplaf.time.continuous.calc.CalcDistributionProvidedEvents;
import com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh;
import com.misc.common.moplaf.time.continuous.calc.ScopeDistribution;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Distribution Provided Events</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionProvidedEventsImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionProvidedEventsImpl#getAntecedentLayerCompositeeventRefresh <em>Antecedent Layer Compositeevent Refresh</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionProvidedEventsImpl#getAntecedentCalcDistributionchildEvents <em>Antecedent Calc Distributionchild Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcDistributionProvidedEventsImpl extends PropagatorFunctionDistributionImpl implements CalcDistributionProvidedEvents {
	/**
	 * The cached value of the '{@link #getConcreteParent() <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteParent()
	 * @generated
	 * @ordered
	 */
	protected ScopeDistribution concreteParent;
	/**
	 * The cached value of the '{@link #getAntecedentLayerCompositeeventRefresh() <em>Antecedent Layer Compositeevent Refresh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentLayerCompositeeventRefresh()
	 * @generated
	 * @ordered
	 */
	protected LayerCompositeEventRefresh antecedentLayerCompositeeventRefresh;
	/**
	 * The cached value of the '{@link #getAntecedentCalcDistributionchildEvents() <em>Antecedent Calc Distributionchild Events</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentCalcDistributionchildEvents()
	 * @generated
	 * @ordered
	 */
	protected CalcDistributionChildEvents antecedentCalcDistributionchildEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcDistributionProvidedEventsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.CALC_DISTRIBUTION_PROVIDED_EVENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDistribution getConcreteParent() {
		if (concreteParent != null && concreteParent.eIsProxy()) {
			InternalEObject oldConcreteParent = (InternalEObject)concreteParent;
			concreteParent = (ScopeDistribution)eResolveProxy(oldConcreteParent);
			if (concreteParent != oldConcreteParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__CONCRETE_PARENT, oldConcreteParent, concreteParent));
			}
		}
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDistribution basicGetConcreteParent() {
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteParent(ScopeDistribution newConcreteParent) {
		ScopeDistribution oldConcreteParent = concreteParent;
		concreteParent = newConcreteParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerCompositeEventRefresh getAntecedentLayerCompositeeventRefresh() {
		if (antecedentLayerCompositeeventRefresh != null && antecedentLayerCompositeeventRefresh.eIsProxy()) {
			InternalEObject oldAntecedentLayerCompositeeventRefresh = (InternalEObject)antecedentLayerCompositeeventRefresh;
			antecedentLayerCompositeeventRefresh = (LayerCompositeEventRefresh)eResolveProxy(oldAntecedentLayerCompositeeventRefresh);
			if (antecedentLayerCompositeeventRefresh != oldAntecedentLayerCompositeeventRefresh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_LAYER_COMPOSITEEVENT_REFRESH, oldAntecedentLayerCompositeeventRefresh, antecedentLayerCompositeeventRefresh));
			}
		}
		return antecedentLayerCompositeeventRefresh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerCompositeEventRefresh basicGetAntecedentLayerCompositeeventRefresh() {
		return antecedentLayerCompositeeventRefresh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedentLayerCompositeeventRefresh(LayerCompositeEventRefresh newAntecedentLayerCompositeeventRefresh) {
		LayerCompositeEventRefresh oldAntecedentLayerCompositeeventRefresh = antecedentLayerCompositeeventRefresh;
		antecedentLayerCompositeeventRefresh = newAntecedentLayerCompositeeventRefresh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_LAYER_COMPOSITEEVENT_REFRESH, oldAntecedentLayerCompositeeventRefresh, antecedentLayerCompositeeventRefresh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcDistributionChildEvents getAntecedentCalcDistributionchildEvents() {
		if (antecedentCalcDistributionchildEvents != null && antecedentCalcDistributionchildEvents.eIsProxy()) {
			InternalEObject oldAntecedentCalcDistributionchildEvents = (InternalEObject)antecedentCalcDistributionchildEvents;
			antecedentCalcDistributionchildEvents = (CalcDistributionChildEvents)eResolveProxy(oldAntecedentCalcDistributionchildEvents);
			if (antecedentCalcDistributionchildEvents != oldAntecedentCalcDistributionchildEvents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_CALC_DISTRIBUTIONCHILD_EVENTS, oldAntecedentCalcDistributionchildEvents, antecedentCalcDistributionchildEvents));
			}
		}
		return antecedentCalcDistributionchildEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcDistributionChildEvents basicGetAntecedentCalcDistributionchildEvents() {
		return antecedentCalcDistributionchildEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedentCalcDistributionchildEvents(CalcDistributionChildEvents newAntecedentCalcDistributionchildEvents) {
		CalcDistributionChildEvents oldAntecedentCalcDistributionchildEvents = antecedentCalcDistributionchildEvents;
		antecedentCalcDistributionchildEvents = newAntecedentCalcDistributionchildEvents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_CALC_DISTRIBUTIONCHILD_EVENTS, oldAntecedentCalcDistributionchildEvents, antecedentCalcDistributionchildEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_LAYER_COMPOSITEEVENT_REFRESH:
				if (resolve) return getAntecedentLayerCompositeeventRefresh();
				return basicGetAntecedentLayerCompositeeventRefresh();
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_CALC_DISTRIBUTIONCHILD_EVENTS:
				if (resolve) return getAntecedentCalcDistributionchildEvents();
				return basicGetAntecedentCalcDistributionchildEvents();
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
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__CONCRETE_PARENT:
				setConcreteParent((ScopeDistribution)newValue);
				return;
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_LAYER_COMPOSITEEVENT_REFRESH:
				setAntecedentLayerCompositeeventRefresh((LayerCompositeEventRefresh)newValue);
				return;
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_CALC_DISTRIBUTIONCHILD_EVENTS:
				setAntecedentCalcDistributionchildEvents((CalcDistributionChildEvents)newValue);
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
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__CONCRETE_PARENT:
				setConcreteParent((ScopeDistribution)null);
				return;
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_LAYER_COMPOSITEEVENT_REFRESH:
				setAntecedentLayerCompositeeventRefresh((LayerCompositeEventRefresh)null);
				return;
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_CALC_DISTRIBUTIONCHILD_EVENTS:
				setAntecedentCalcDistributionchildEvents((CalcDistributionChildEvents)null);
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
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__CONCRETE_PARENT:
				return concreteParent != null;
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_LAYER_COMPOSITEEVENT_REFRESH:
				return antecedentLayerCompositeeventRefresh != null;
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_PROVIDED_EVENTS__ANTECEDENT_CALC_DISTRIBUTIONCHILD_EVENTS:
				return antecedentCalcDistributionchildEvents != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void init() {
		super.init();
		Distribution distribution = this.getDistribution();
		this.setConcreteParent(distribution.getPropagatorFunction(ScopeDistribution.class));
		this.setAntecedentCalcDistributionchildEvents(distribution.getPropagatorFunction(CalcDistributionChildEvents.class));
		this.setAntecedentLayerCompositeeventRefresh(distribution.getPropagatorFunction(LayerCompositeEventRefresh.class));
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}

	@Override
	public void doCollectExplicitAntecedents(EList<PropagatorFunction> antecedents) {
		antecedents.add(this.getAntecedentCalcDistributionchildEvents());
		antecedents.add(this.getAntecedentLayerCompositeeventRefresh());
	}

	private static Bindings distributionBindings = Bindings.constructBindings()
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS)
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION__CHILD_EVENTS);

	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl#doGetBindings()
	 */
	@Override
	public Bindings doGetBindings() {
		return distributionBindings;
	}

	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#doRefresh()
	 */
	@Override
	public void doRefresh() {
		Distribution distribution = this.getDistribution();
		distribution.refreshProvidedEvents();
	}
} //PropagatorCalcDistributionProvidedEventsImpl
