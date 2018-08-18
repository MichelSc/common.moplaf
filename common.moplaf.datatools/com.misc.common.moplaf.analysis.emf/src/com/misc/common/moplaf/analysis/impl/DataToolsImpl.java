/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.AnalysisDomain;
import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.DataTools;

import com.misc.common.moplaf.datatools.DataTool;

import com.misc.common.moplaf.datatools.impl.DataToolContextImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Tools</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DataToolsImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DataToolsImpl#getDataTools <em>Data Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataToolsImpl extends DataToolContextImpl implements DataTools {
	/**
	 * The cached value of the '{@link #getDataTools() <em>Data Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTools()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTool> dataTools;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataToolsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.DATA_TOOLS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisDomain getDomain() {
		if (eContainerFeatureID() != AnalysisPackage.DATA_TOOLS__DOMAIN) return null;
		return (AnalysisDomain)eInternalContainer();
	}
	
	

	@Override
	public EList<EClass> getDomainTypes() {
		return this.getDomain().getDomainTypes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(AnalysisDomain newDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomain, AnalysisPackage.DATA_TOOLS__DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(AnalysisDomain newDomain) {
		if (newDomain != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.DATA_TOOLS__DOMAIN && newDomain != null)) {
			if (EcoreUtil.isAncestor(this, newDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, AnalysisPackage.ANALYSIS_DOMAIN__DATA_TOOLS, AnalysisDomain.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DATA_TOOLS__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTool> getDataTools() {
		if (dataTools == null) {
			dataTools = new EObjectContainmentEList<DataTool>(DataTool.class, this, AnalysisPackage.DATA_TOOLS__DATA_TOOLS);
		}
		return dataTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.DATA_TOOLS__DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomain((AnalysisDomain)otherEnd, msgs);
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
			case AnalysisPackage.DATA_TOOLS__DOMAIN:
				return basicSetDomain(null, msgs);
			case AnalysisPackage.DATA_TOOLS__DATA_TOOLS:
				return ((InternalEList<?>)getDataTools()).basicRemove(otherEnd, msgs);
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
			case AnalysisPackage.DATA_TOOLS__DOMAIN:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.ANALYSIS_DOMAIN__DATA_TOOLS, AnalysisDomain.class, msgs);
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
			case AnalysisPackage.DATA_TOOLS__DOMAIN:
				return getDomain();
			case AnalysisPackage.DATA_TOOLS__DATA_TOOLS:
				return getDataTools();
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
			case AnalysisPackage.DATA_TOOLS__DOMAIN:
				setDomain((AnalysisDomain)newValue);
				return;
			case AnalysisPackage.DATA_TOOLS__DATA_TOOLS:
				getDataTools().clear();
				getDataTools().addAll((Collection<? extends DataTool>)newValue);
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
			case AnalysisPackage.DATA_TOOLS__DOMAIN:
				setDomain((AnalysisDomain)null);
				return;
			case AnalysisPackage.DATA_TOOLS__DATA_TOOLS:
				getDataTools().clear();
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
			case AnalysisPackage.DATA_TOOLS__DOMAIN:
				return getDomain() != null;
			case AnalysisPackage.DATA_TOOLS__DATA_TOOLS:
				return dataTools != null && !dataTools.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataToolsImpl
