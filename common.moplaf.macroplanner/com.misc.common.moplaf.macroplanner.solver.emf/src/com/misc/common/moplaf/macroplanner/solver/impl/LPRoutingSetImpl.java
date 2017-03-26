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
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.Routing;
import com.misc.common.moplaf.macroplanner.SupplyChainRoutings;
import com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner;
import com.misc.common.moplaf.macroplanner.solver.LPRouting;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingSet;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.macroplanner.solver.Scenario;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Routing Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingSetImpl#getMacroPlanner <em>Macro Planner</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingSetImpl#getRoutings <em>Routings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPRoutingSetImpl extends LPTupleImpl implements LPRoutingSet {
	/**
	 * The cached value of the '{@link #getRoutings() <em>Routings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutings()
	 * @generated
	 * @ordered
	 */
	protected EList<LPRouting> routings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPRoutingSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_ROUTING_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPMacroPlanner getMacroPlanner() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_ROUTING_SET__MACRO_PLANNER) return null;
		return (LPMacroPlanner)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMacroPlanner(LPMacroPlanner newMacroPlanner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMacroPlanner, MacroPlannerSolverPackage.LP_ROUTING_SET__MACRO_PLANNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacroPlanner(LPMacroPlanner newMacroPlanner) {
		if (newMacroPlanner != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_ROUTING_SET__MACRO_PLANNER && newMacroPlanner != null)) {
			if (EcoreUtil.isAncestor(this, newMacroPlanner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMacroPlanner != null)
				msgs = ((InternalEObject)newMacroPlanner).eInverseAdd(this, MacroPlannerSolverPackage.LP_MACRO_PLANNER__ROUTING_SET, LPMacroPlanner.class, msgs);
			msgs = basicSetMacroPlanner(newMacroPlanner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_SET__MACRO_PLANNER, newMacroPlanner, newMacroPlanner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPRouting> getRoutings() {
		if (routings == null) {
			routings = new EObjectContainmentWithInverseEList<LPRouting>(LPRouting.class, this, MacroPlannerSolverPackage.LP_ROUTING_SET__ROUTINGS, MacroPlannerSolverPackage.LP_ROUTING__ROUTING_SET);
		}
		return routings;
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
			case MacroPlannerSolverPackage.LP_ROUTING_SET__MACRO_PLANNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMacroPlanner((LPMacroPlanner)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_SET__ROUTINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoutings()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_SET__MACRO_PLANNER:
				return basicSetMacroPlanner(null, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_SET__ROUTINGS:
				return ((InternalEList<?>)getRoutings()).basicRemove(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_SET__MACRO_PLANNER:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_MACRO_PLANNER__ROUTING_SET, LPMacroPlanner.class, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_SET__MACRO_PLANNER:
				return getMacroPlanner();
			case MacroPlannerSolverPackage.LP_ROUTING_SET__ROUTINGS:
				return getRoutings();
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
			case MacroPlannerSolverPackage.LP_ROUTING_SET__MACRO_PLANNER:
				setMacroPlanner((LPMacroPlanner)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_SET__ROUTINGS:
				getRoutings().clear();
				getRoutings().addAll((Collection<? extends LPRouting>)newValue);
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
			case MacroPlannerSolverPackage.LP_ROUTING_SET__MACRO_PLANNER:
				setMacroPlanner((LPMacroPlanner)null);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_SET__ROUTINGS:
				getRoutings().clear();
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
			case MacroPlannerSolverPackage.LP_ROUTING_SET__MACRO_PLANNER:
				return getMacroPlanner() != null;
			case MacroPlannerSolverPackage.LP_ROUTING_SET__ROUTINGS:
				return routings != null && !routings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();
		
		LPMacroPlanner lp = this.getMacroPlanner();
		Scenario scenario = lp.getScenario();
		
		for (SupplyChainRoutings dataset : scenario.getSelectedRoutings() ){
			for( Routing routing: dataset.getRoutings()){
				// routing
				LPRouting lprouting = MacroPlannerSolverFactory.eINSTANCE.createLPRouting();
				lprouting.setRouting(routing);
				lprouting.setName(routing.getCode());
				this.getRoutings().add(lprouting); // owning
			}
		}
	}
} //LPRoutingSetImpl
