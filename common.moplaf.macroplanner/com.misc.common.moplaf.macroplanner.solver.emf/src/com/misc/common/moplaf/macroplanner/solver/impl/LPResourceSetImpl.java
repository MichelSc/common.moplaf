/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.Location;
import com.misc.common.moplaf.macroplanner.LocationResource;
import com.misc.common.moplaf.macroplanner.SupplyChainMasterData;
import com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner;
import com.misc.common.moplaf.macroplanner.solver.LPResource;
import com.misc.common.moplaf.macroplanner.solver.LPResourceSet;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.macroplanner.solver.Scenario;

import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>LP Resource Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceSetImpl#getMacroPlanner <em>Macro Planner</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceSetImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPResourceSetImpl extends LPTupleImpl implements LPResourceSet {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<LPResource> resources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPResourceSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_RESOURCE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPMacroPlanner getMacroPlanner() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_RESOURCE_SET__MACRO_PLANNER) return null;
		return (LPMacroPlanner)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMacroPlanner(LPMacroPlanner newMacroPlanner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMacroPlanner, MacroPlannerSolverPackage.LP_RESOURCE_SET__MACRO_PLANNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacroPlanner(LPMacroPlanner newMacroPlanner) {
		if (newMacroPlanner != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_RESOURCE_SET__MACRO_PLANNER && newMacroPlanner != null)) {
			if (EcoreUtil.isAncestor(this, newMacroPlanner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMacroPlanner != null)
				msgs = ((InternalEObject)newMacroPlanner).eInverseAdd(this, MacroPlannerSolverPackage.LP_MACRO_PLANNER__RESOURCE_SET, LPMacroPlanner.class, msgs);
			msgs = basicSetMacroPlanner(newMacroPlanner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_SET__MACRO_PLANNER, newMacroPlanner, newMacroPlanner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<LPResource>(LPResource.class, this, MacroPlannerSolverPackage.LP_RESOURCE_SET__RESOURCES, MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE_SET);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LPResource getResource(LocationResource locationResource) {
		for (LPResource r : this.getResources()){
			if ( r.getResource() == locationResource){
				return r;
			}
		}
		return null;
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
			case MacroPlannerSolverPackage.LP_RESOURCE_SET__MACRO_PLANNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMacroPlanner((LPMacroPlanner)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_SET__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_RESOURCE_SET__MACRO_PLANNER:
				return basicSetMacroPlanner(null, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_SET__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_RESOURCE_SET__MACRO_PLANNER:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_MACRO_PLANNER__RESOURCE_SET, LPMacroPlanner.class, msgs);
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
			case MacroPlannerSolverPackage.LP_RESOURCE_SET__MACRO_PLANNER:
				return getMacroPlanner();
			case MacroPlannerSolverPackage.LP_RESOURCE_SET__RESOURCES:
				return getResources();
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
			case MacroPlannerSolverPackage.LP_RESOURCE_SET__MACRO_PLANNER:
				setMacroPlanner((LPMacroPlanner)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_SET__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends LPResource>)newValue);
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
			case MacroPlannerSolverPackage.LP_RESOURCE_SET__MACRO_PLANNER:
				setMacroPlanner((LPMacroPlanner)null);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_SET__RESOURCES:
				getResources().clear();
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
			case MacroPlannerSolverPackage.LP_RESOURCE_SET__MACRO_PLANNER:
				return getMacroPlanner() != null;
			case MacroPlannerSolverPackage.LP_RESOURCE_SET__RESOURCES:
				return resources != null && !resources.isEmpty();
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
			case MacroPlannerSolverPackage.LP_RESOURCE_SET___GET_RESOURCE__LOCATIONRESOURCE:
				return getResource((LocationResource)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();
		
		LPMacroPlanner lp = this.getMacroPlanner();
		Scenario scenario = lp.getScenario();
	    SupplyChainMasterData dataset = scenario.getSelectedMasterData();
		
		for (   Location location : dataset.getLocations()){
			for( LocationResource location_resource: location.getResources()){
				// location product
				LPResource lpresource = MacroPlannerSolverFactory.eINSTANCE.createLPResource();
				lpresource.setResource(location_resource);
				lpresource.setName(location_resource.getCode());
				this.getResources().add(lpresource); // owning
			}
		}
	}
} //LPResourceSetImpl
