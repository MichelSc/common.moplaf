/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.AnalysisDomain;
import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.DataTools;
import com.misc.common.moplaf.analysis.DocAnalysis;

import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataToolContext;
import com.misc.common.moplaf.datatools.DataToolType;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.job.Task;
import com.misc.common.moplaf.job.impl.TaskDomainImpl;
import com.misc.common.moplaf.job.util.Util;

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
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl#getSuperDomain <em>Super Domain</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl#getSubDomains <em>Sub Domains</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl#getAnalyses <em>Analyses</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl#getDataTools <em>Data Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisDomainImpl extends TaskDomainImpl implements AnalysisDomain {
	/**
	 * The cached value of the '{@link #getSubDomains() <em>Sub Domains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysisDomain> subDomains;

	/**
	 * The cached value of the '{@link #getAnalyses() <em>Analyses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyses()
	 * @generated
	 * @ordered
	 */
	protected EList<DocAnalysis> analyses;

	/**
	 * The cached value of the '{@link #getDataTools() <em>Data Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTools()
	 * @generated
	 * @ordered
	 */
	protected EList<com.misc.common.moplaf.analysis.DataTools> dataTools;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.ANALYSIS_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocAnalysis> getAnalyses() {
		if (analyses == null) {
			analyses = new EObjectContainmentWithInverseEList<DocAnalysis>(DocAnalysis.class, this, AnalysisPackage.ANALYSIS_DOMAIN__ANALYSES, AnalysisPackage.DOC_ANALYSIS__DOMAIN);
		}
		return analyses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<com.misc.common.moplaf.analysis.DataTools> getDataTools() {
		if (dataTools == null) {
			dataTools = new EObjectContainmentWithInverseEList<com.misc.common.moplaf.analysis.DataTools>(com.misc.common.moplaf.analysis.DataTools.class, this, AnalysisPackage.ANALYSIS_DOMAIN__DATA_TOOLS, AnalysisPackage.DATA_TOOLS__DOMAIN);
		}
		return dataTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<DataTool> getNewDataTools(DataToolType type) {
		// from the extensions
		EList<DataTool> datatools =  com.misc.common.moplaf.datatools.util.Util.getNewDataTools(type);
		// copies for this domain
		for ( DataTools tools : this.getDataTools()) {
			for ( DataTool tool : tools.getDataTools() ) {
				if ( tool.getType()==type) {
					DataTool new_tool = tool.clone();
					datatools.add(new_tool);
				}
			}
		}
		return datatools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getDomainTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisDomain getSuperDomain() {
		if (eContainerFeatureID() != AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN) return null;
		return (AnalysisDomain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperDomain(AnalysisDomain newSuperDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperDomain, AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperDomain(AnalysisDomain newSuperDomain) {
		if (newSuperDomain != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN && newSuperDomain != null)) {
			if (EcoreUtil.isAncestor(this, newSuperDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperDomain != null)
				msgs = ((InternalEObject)newSuperDomain).eInverseAdd(this, AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS, AnalysisDomain.class, msgs);
			msgs = basicSetSuperDomain(newSuperDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN, newSuperDomain, newSuperDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysisDomain> getSubDomains() {
		if (subDomains == null) {
			subDomains = new EObjectContainmentWithInverseEList<AnalysisDomain>(AnalysisDomain.class, this, AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS, AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN);
		}
		return subDomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Task> getNewTasks() {
		return Util.getNewTasks();
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
			case AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperDomain((AnalysisDomain)otherEnd, msgs);
			case AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubDomains()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.ANALYSIS_DOMAIN__ANALYSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnalyses()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.ANALYSIS_DOMAIN__DATA_TOOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataTools()).basicAdd(otherEnd, msgs);
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
			case AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN:
				return basicSetSuperDomain(null, msgs);
			case AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS:
				return ((InternalEList<?>)getSubDomains()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYSIS_DOMAIN__ANALYSES:
				return ((InternalEList<?>)getAnalyses()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYSIS_DOMAIN__DATA_TOOLS:
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
			case AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS, AnalysisDomain.class, msgs);
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
			case AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN:
				return getSuperDomain();
			case AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS:
				return getSubDomains();
			case AnalysisPackage.ANALYSIS_DOMAIN__ANALYSES:
				return getAnalyses();
			case AnalysisPackage.ANALYSIS_DOMAIN__DATA_TOOLS:
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
			case AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN:
				setSuperDomain((AnalysisDomain)newValue);
				return;
			case AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS:
				getSubDomains().clear();
				getSubDomains().addAll((Collection<? extends AnalysisDomain>)newValue);
				return;
			case AnalysisPackage.ANALYSIS_DOMAIN__ANALYSES:
				getAnalyses().clear();
				getAnalyses().addAll((Collection<? extends DocAnalysis>)newValue);
				return;
			case AnalysisPackage.ANALYSIS_DOMAIN__DATA_TOOLS:
				getDataTools().clear();
				getDataTools().addAll((Collection<? extends com.misc.common.moplaf.analysis.DataTools>)newValue);
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
			case AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN:
				setSuperDomain((AnalysisDomain)null);
				return;
			case AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS:
				getSubDomains().clear();
				return;
			case AnalysisPackage.ANALYSIS_DOMAIN__ANALYSES:
				getAnalyses().clear();
				return;
			case AnalysisPackage.ANALYSIS_DOMAIN__DATA_TOOLS:
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
			case AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN:
				return getSuperDomain() != null;
			case AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS:
				return subDomains != null && !subDomains.isEmpty();
			case AnalysisPackage.ANALYSIS_DOMAIN__ANALYSES:
				return analyses != null && !analyses.isEmpty();
			case AnalysisPackage.ANALYSIS_DOMAIN__DATA_TOOLS:
				return dataTools != null && !dataTools.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == DataToolContext.class) {
			switch (baseOperationID) {
				case DatatoolsPackage.DATA_TOOL_CONTEXT___GET_DOMAIN_TYPES: return AnalysisPackage.ANALYSIS_DOMAIN___GET_DOMAIN_TYPES;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AnalysisPackage.ANALYSIS_DOMAIN___GET_NEW_DATA_TOOLS__DATATOOLTYPE:
				return getNewDataTools((DataToolType)arguments.get(0));
			case AnalysisPackage.ANALYSIS_DOMAIN___GET_DOMAIN_TYPES:
				return getDomainTypes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnalysisDomainImpl
