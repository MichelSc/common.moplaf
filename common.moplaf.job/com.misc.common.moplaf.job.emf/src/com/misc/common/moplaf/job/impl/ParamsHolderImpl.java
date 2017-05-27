/**
 */
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.ParamsHolder;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.RunParams;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Params Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.ParamsHolderImpl#getRunsParams <em>Runs Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParamsHolderImpl extends MinimalEObjectImpl.Container implements ParamsHolder {
	/**
	 * The cached value of the '{@link #getRunsParams() <em>Runs Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunsParams()
	 * @generated
	 * @ordered
	 */
	protected EList<RunParams> runsParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamsHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.PARAMS_HOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunParams> getRunsParams() {
		if (runsParams == null) {
			runsParams = new EObjectContainmentEList<RunParams>(RunParams.class, this, JobPackage.PARAMS_HOLDER__RUNS_PARAMS);
		}
		return runsParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public RunParams constructParams(Run run) {
		RunParams newParams = run.constructParams();
		newParams.copyParams(run);
		this.getRunsParams().add(newParams);
		return newParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobPackage.PARAMS_HOLDER__RUNS_PARAMS:
				return ((InternalEList<?>)getRunsParams()).basicRemove(otherEnd, msgs);
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
			case JobPackage.PARAMS_HOLDER__RUNS_PARAMS:
				return getRunsParams();
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
			case JobPackage.PARAMS_HOLDER__RUNS_PARAMS:
				getRunsParams().clear();
				getRunsParams().addAll((Collection<? extends RunParams>)newValue);
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
			case JobPackage.PARAMS_HOLDER__RUNS_PARAMS:
				getRunsParams().clear();
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
			case JobPackage.PARAMS_HOLDER__RUNS_PARAMS:
				return runsParams != null && !runsParams.isEmpty();
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
			case JobPackage.PARAMS_HOLDER___CONSTRUCT_PARAMS__RUN:
				return constructParams((Run)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ParamsHolderImpl
