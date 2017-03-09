/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.SupplyChainData;
import com.misc.common.moplaf.macroplanner.SupplyChainMasterData;
import com.misc.common.moplaf.macroplanner.SupplyChainRoutings;

import com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.macroplanner.solver.Scenario;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.ScenarioImpl#getLPs <em>LPs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.ScenarioImpl#getScenarioStart <em>Scenario Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.ScenarioImpl#getScenarioEnd <em>Scenario End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.ScenarioImpl#getSelectedMasterData <em>Selected Master Data</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.ScenarioImpl#getSelectedData <em>Selected Data</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.ScenarioImpl#getSelectedRoutings <em>Selected Routings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The cached value of the '{@link #getLPs() <em>LPs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPs()
	 * @generated
	 * @ordered
	 */
	protected EList<LPMacroPlanner> lPs;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getScenarioStart() <em>Scenario Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date SCENARIO_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScenarioStart() <em>Scenario Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioStart()
	 * @generated
	 * @ordered
	 */
	protected Date scenarioStart = SCENARIO_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getScenarioEnd() <em>Scenario End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date SCENARIO_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScenarioEnd() <em>Scenario End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioEnd()
	 * @generated
	 * @ordered
	 */
	protected Date scenarioEnd = SCENARIO_END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectedMasterData() <em>Selected Master Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedMasterData()
	 * @generated
	 * @ordered
	 */
	protected SupplyChainMasterData selectedMasterData;

	/**
	 * The cached value of the '{@link #getSelectedData() <em>Selected Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedData()
	 * @generated
	 * @ordered
	 */
	protected EList<SupplyChainData> selectedData;

	/**
	 * The cached value of the '{@link #getSelectedRoutings() <em>Selected Routings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedRoutings()
	 * @generated
	 * @ordered
	 */
	protected EList<SupplyChainRoutings> selectedRoutings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPMacroPlanner> getLPs() {
		if (lPs == null) {
			lPs = new EObjectContainmentWithInverseEList<LPMacroPlanner>(LPMacroPlanner.class, this, MacroPlannerSolverPackage.SCENARIO__LPS, MacroPlannerSolverPackage.LP_MACRO_PLANNER__SCENARIO);
		}
		return lPs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getScenarioStart() {
		return scenarioStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarioStart(Date newScenarioStart) {
		Date oldScenarioStart = scenarioStart;
		scenarioStart = newScenarioStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.SCENARIO__SCENARIO_START, oldScenarioStart, scenarioStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getScenarioEnd() {
		return scenarioEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarioEnd(Date newScenarioEnd) {
		Date oldScenarioEnd = scenarioEnd;
		scenarioEnd = newScenarioEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.SCENARIO__SCENARIO_END, oldScenarioEnd, scenarioEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyChainMasterData getSelectedMasterData() {
		if (selectedMasterData != null && selectedMasterData.eIsProxy()) {
			InternalEObject oldSelectedMasterData = (InternalEObject)selectedMasterData;
			selectedMasterData = (SupplyChainMasterData)eResolveProxy(oldSelectedMasterData);
			if (selectedMasterData != oldSelectedMasterData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.SCENARIO__SELECTED_MASTER_DATA, oldSelectedMasterData, selectedMasterData));
			}
		}
		return selectedMasterData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyChainMasterData basicGetSelectedMasterData() {
		return selectedMasterData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedMasterData(SupplyChainMasterData newSelectedMasterData) {
		SupplyChainMasterData oldSelectedMasterData = selectedMasterData;
		selectedMasterData = newSelectedMasterData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.SCENARIO__SELECTED_MASTER_DATA, oldSelectedMasterData, selectedMasterData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupplyChainData> getSelectedData() {
		if (selectedData == null) {
			selectedData = new EObjectResolvingEList<SupplyChainData>(SupplyChainData.class, this, MacroPlannerSolverPackage.SCENARIO__SELECTED_DATA);
		}
		return selectedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupplyChainRoutings> getSelectedRoutings() {
		if (selectedRoutings == null) {
			selectedRoutings = new EObjectResolvingEList<SupplyChainRoutings>(SupplyChainRoutings.class, this, MacroPlannerSolverPackage.SCENARIO__SELECTED_ROUTINGS);
		}
		return selectedRoutings;
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
			case MacroPlannerSolverPackage.SCENARIO__LPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLPs()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.SCENARIO__LPS:
				return ((InternalEList<?>)getLPs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MacroPlannerSolverPackage.SCENARIO__LPS:
				return getLPs();
			case MacroPlannerSolverPackage.SCENARIO__NAME:
				return getName();
			case MacroPlannerSolverPackage.SCENARIO__SCENARIO_START:
				return getScenarioStart();
			case MacroPlannerSolverPackage.SCENARIO__SCENARIO_END:
				return getScenarioEnd();
			case MacroPlannerSolverPackage.SCENARIO__SELECTED_MASTER_DATA:
				if (resolve) return getSelectedMasterData();
				return basicGetSelectedMasterData();
			case MacroPlannerSolverPackage.SCENARIO__SELECTED_DATA:
				return getSelectedData();
			case MacroPlannerSolverPackage.SCENARIO__SELECTED_ROUTINGS:
				return getSelectedRoutings();
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
			case MacroPlannerSolverPackage.SCENARIO__LPS:
				getLPs().clear();
				getLPs().addAll((Collection<? extends LPMacroPlanner>)newValue);
				return;
			case MacroPlannerSolverPackage.SCENARIO__NAME:
				setName((String)newValue);
				return;
			case MacroPlannerSolverPackage.SCENARIO__SCENARIO_START:
				setScenarioStart((Date)newValue);
				return;
			case MacroPlannerSolverPackage.SCENARIO__SCENARIO_END:
				setScenarioEnd((Date)newValue);
				return;
			case MacroPlannerSolverPackage.SCENARIO__SELECTED_MASTER_DATA:
				setSelectedMasterData((SupplyChainMasterData)newValue);
				return;
			case MacroPlannerSolverPackage.SCENARIO__SELECTED_DATA:
				getSelectedData().clear();
				getSelectedData().addAll((Collection<? extends SupplyChainData>)newValue);
				return;
			case MacroPlannerSolverPackage.SCENARIO__SELECTED_ROUTINGS:
				getSelectedRoutings().clear();
				getSelectedRoutings().addAll((Collection<? extends SupplyChainRoutings>)newValue);
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
			case MacroPlannerSolverPackage.SCENARIO__LPS:
				getLPs().clear();
				return;
			case MacroPlannerSolverPackage.SCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MacroPlannerSolverPackage.SCENARIO__SCENARIO_START:
				setScenarioStart(SCENARIO_START_EDEFAULT);
				return;
			case MacroPlannerSolverPackage.SCENARIO__SCENARIO_END:
				setScenarioEnd(SCENARIO_END_EDEFAULT);
				return;
			case MacroPlannerSolverPackage.SCENARIO__SELECTED_MASTER_DATA:
				setSelectedMasterData((SupplyChainMasterData)null);
				return;
			case MacroPlannerSolverPackage.SCENARIO__SELECTED_DATA:
				getSelectedData().clear();
				return;
			case MacroPlannerSolverPackage.SCENARIO__SELECTED_ROUTINGS:
				getSelectedRoutings().clear();
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
			case MacroPlannerSolverPackage.SCENARIO__LPS:
				return lPs != null && !lPs.isEmpty();
			case MacroPlannerSolverPackage.SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MacroPlannerSolverPackage.SCENARIO__SCENARIO_START:
				return SCENARIO_START_EDEFAULT == null ? scenarioStart != null : !SCENARIO_START_EDEFAULT.equals(scenarioStart);
			case MacroPlannerSolverPackage.SCENARIO__SCENARIO_END:
				return SCENARIO_END_EDEFAULT == null ? scenarioEnd != null : !SCENARIO_END_EDEFAULT.equals(scenarioEnd);
			case MacroPlannerSolverPackage.SCENARIO__SELECTED_MASTER_DATA:
				return selectedMasterData != null;
			case MacroPlannerSolverPackage.SCENARIO__SELECTED_DATA:
				return selectedData != null && !selectedData.isEmpty();
			case MacroPlannerSolverPackage.SCENARIO__SELECTED_ROUTINGS:
				return selectedRoutings != null && !selectedRoutings.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", ScenarioStart: ");
		result.append(scenarioStart);
		result.append(", ScenarioEnd: ");
		result.append(scenarioEnd);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
