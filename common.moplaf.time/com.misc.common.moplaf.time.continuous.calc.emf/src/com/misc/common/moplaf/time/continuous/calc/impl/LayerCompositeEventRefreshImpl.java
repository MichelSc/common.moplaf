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
import com.misc.common.moplaf.time.continuous.calc.CalcDistributionInitialization;
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
 * An implementation of the model object '<em><b>Propagator Layer Composite Event Refresh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.LayerCompositeEventRefreshImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.LayerCompositeEventRefreshImpl#getAntecedenCalcDistributionInitialization <em>Anteceden Calc Distribution Initialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerCompositeEventRefreshImpl extends PropagatorFunctionDistributionImpl implements LayerCompositeEventRefresh {
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
	 * The cached value of the '{@link #getAntecedenCalcDistributionInitialization() <em>Anteceden Calc Distribution Initialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedenCalcDistributionInitialization()
	 * @generated
	 * @ordered
	 */
	protected CalcDistributionInitialization antecedenCalcDistributionInitialization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerCompositeEventRefreshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.LAYER_COMPOSITE_EVENT_REFRESH;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT, oldConcreteParent, concreteParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcDistributionInitialization getAntecedenCalcDistributionInitialization() {
		if (antecedenCalcDistributionInitialization != null && antecedenCalcDistributionInitialization.eIsProxy()) {
			InternalEObject oldAntecedenCalcDistributionInitialization = (InternalEObject)antecedenCalcDistributionInitialization;
			antecedenCalcDistributionInitialization = (CalcDistributionInitialization)eResolveProxy(oldAntecedenCalcDistributionInitialization);
			if (antecedenCalcDistributionInitialization != oldAntecedenCalcDistributionInitialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION, oldAntecedenCalcDistributionInitialization, antecedenCalcDistributionInitialization));
			}
		}
		return antecedenCalcDistributionInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcDistributionInitialization basicGetAntecedenCalcDistributionInitialization() {
		return antecedenCalcDistributionInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedenCalcDistributionInitialization(CalcDistributionInitialization newAntecedenCalcDistributionInitialization) {
		CalcDistributionInitialization oldAntecedenCalcDistributionInitialization = antecedenCalcDistributionInitialization;
		antecedenCalcDistributionInitialization = newAntecedenCalcDistributionInitialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION, oldAntecedenCalcDistributionInitialization, antecedenCalcDistributionInitialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousCalcPackage.LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
			case TimeContinuousCalcPackage.LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION:
				if (resolve) return getAntecedenCalcDistributionInitialization();
				return basicGetAntecedenCalcDistributionInitialization();
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
			case TimeContinuousCalcPackage.LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT:
				setConcreteParent((ScopeDistribution)newValue);
				return;
			case TimeContinuousCalcPackage.LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION:
				setAntecedenCalcDistributionInitialization((CalcDistributionInitialization)newValue);
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
			case TimeContinuousCalcPackage.LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT:
				setConcreteParent((ScopeDistribution)null);
				return;
			case TimeContinuousCalcPackage.LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION:
				setAntecedenCalcDistributionInitialization((CalcDistributionInitialization)null);
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
			case TimeContinuousCalcPackage.LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT:
				return concreteParent != null;
			case TimeContinuousCalcPackage.LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION:
				return antecedenCalcDistributionInitialization != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void init() {
		super.init();
		Distribution distribution = this.getDistribution();
		this.setConcreteParent(distribution.getPropagatorFunction(ScopeDistribution.class));
		this.setAntecedenCalcDistributionInitialization(distribution.getPropagatorFunction(CalcDistributionInitialization.class));
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}

	@Override
	public void doCollectExplicitAntecedents(EList<PropagatorFunction> antecedents) {
		antecedents.add(this.getAntecedenCalcDistributionInitialization());
	}
} //PropagatorLayerCompositeEventRefreshImpl
