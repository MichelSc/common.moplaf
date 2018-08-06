/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.AnalysisDomain;
import com.misc.common.moplaf.analysis.AnalysisHolder;
import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.DocAnalysis;

import com.misc.common.moplaf.datatools.impl.DataToolsImpl;

import com.misc.common.moplaf.job.Doc;
import com.misc.common.moplaf.job.Docs;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.Task;
import com.misc.common.moplaf.job.TaskDomain;
import com.misc.common.moplaf.job.Tasks;
import com.misc.common.moplaf.job.util.Util;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl#getDocs <em>Docs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl#getSuperDomain <em>Super Domain</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl#getSubDomains <em>Sub Domains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisDomainImpl extends DataToolsImpl implements AnalysisDomain {
	/**
	 * The cached value of the '{@link #getDocs() <em>Docs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocs()
	 * @generated
	 * @ordered
	 */
	protected EList<Doc> docs;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getAnalysis() <em>Analysis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysis()
	 * @generated
	 * @ordered
	 */
	protected EList<DocAnalysis> analysis;

	/**
	 * The cached value of the '{@link #getSubDomains() <em>Sub Domains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDomains()
	 * @generated
	 * @ordered
	 */
	protected AnalysisDomain subDomains;

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
	public EList<Doc> getDocs() {
		if (docs == null) {
			docs = new EObjectContainmentEList<Doc>(Doc.class, this, AnalysisPackage.ANALYSIS_DOMAIN__DOCS);
		}
		return docs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, AnalysisPackage.ANALYSIS_DOMAIN__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocAnalysis> getAnalysis() {
		if (analysis == null) {
			analysis = new EObjectContainmentEList<DocAnalysis>(DocAnalysis.class, this, AnalysisPackage.ANALYSIS_DOMAIN__ANALYSIS);
		}
		return analysis;
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
	public AnalysisDomain getSubDomains() {
		return subDomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubDomains(AnalysisDomain newSubDomains, NotificationChain msgs) {
		AnalysisDomain oldSubDomains = subDomains;
		subDomains = newSubDomains;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS, oldSubDomains, newSubDomains);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubDomains(AnalysisDomain newSubDomains) {
		if (newSubDomains != subDomains) {
			NotificationChain msgs = null;
			if (subDomains != null)
				msgs = ((InternalEObject)subDomains).eInverseRemove(this, AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN, AnalysisDomain.class, msgs);
			if (newSubDomains != null)
				msgs = ((InternalEObject)newSubDomains).eInverseAdd(this, AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN, AnalysisDomain.class, msgs);
			msgs = basicSetSubDomains(newSubDomains, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS, newSubDomains, newSubDomains));
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
	public void garbageCollect() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperDomain((AnalysisDomain)otherEnd, msgs);
			case AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS:
				if (subDomains != null)
					msgs = ((InternalEObject)subDomains).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS, null, msgs);
				return basicSetSubDomains((AnalysisDomain)otherEnd, msgs);
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
			case AnalysisPackage.ANALYSIS_DOMAIN__DOCS:
				return ((InternalEList<?>)getDocs()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYSIS_DOMAIN__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYSIS_DOMAIN__ANALYSIS:
				return ((InternalEList<?>)getAnalysis()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN:
				return basicSetSuperDomain(null, msgs);
			case AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS:
				return basicSetSubDomains(null, msgs);
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
			case AnalysisPackage.ANALYSIS_DOMAIN__DOCS:
				return getDocs();
			case AnalysisPackage.ANALYSIS_DOMAIN__TASKS:
				return getTasks();
			case AnalysisPackage.ANALYSIS_DOMAIN__ANALYSIS:
				return getAnalysis();
			case AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN:
				return getSuperDomain();
			case AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS:
				return getSubDomains();
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
			case AnalysisPackage.ANALYSIS_DOMAIN__DOCS:
				getDocs().clear();
				getDocs().addAll((Collection<? extends Doc>)newValue);
				return;
			case AnalysisPackage.ANALYSIS_DOMAIN__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case AnalysisPackage.ANALYSIS_DOMAIN__ANALYSIS:
				getAnalysis().clear();
				getAnalysis().addAll((Collection<? extends DocAnalysis>)newValue);
				return;
			case AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN:
				setSuperDomain((AnalysisDomain)newValue);
				return;
			case AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS:
				setSubDomains((AnalysisDomain)newValue);
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
			case AnalysisPackage.ANALYSIS_DOMAIN__DOCS:
				getDocs().clear();
				return;
			case AnalysisPackage.ANALYSIS_DOMAIN__TASKS:
				getTasks().clear();
				return;
			case AnalysisPackage.ANALYSIS_DOMAIN__ANALYSIS:
				getAnalysis().clear();
				return;
			case AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN:
				setSuperDomain((AnalysisDomain)null);
				return;
			case AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS:
				setSubDomains((AnalysisDomain)null);
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
			case AnalysisPackage.ANALYSIS_DOMAIN__DOCS:
				return docs != null && !docs.isEmpty();
			case AnalysisPackage.ANALYSIS_DOMAIN__TASKS:
				return tasks != null && !tasks.isEmpty();
			case AnalysisPackage.ANALYSIS_DOMAIN__ANALYSIS:
				return analysis != null && !analysis.isEmpty();
			case AnalysisPackage.ANALYSIS_DOMAIN__SUPER_DOMAIN:
				return getSuperDomain() != null;
			case AnalysisPackage.ANALYSIS_DOMAIN__SUB_DOMAINS:
				return subDomains != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Docs.class) {
			switch (derivedFeatureID) {
				case AnalysisPackage.ANALYSIS_DOMAIN__DOCS: return JobPackage.DOCS__DOCS;
				default: return -1;
			}
		}
		if (baseClass == Tasks.class) {
			switch (derivedFeatureID) {
				case AnalysisPackage.ANALYSIS_DOMAIN__TASKS: return JobPackage.TASKS__TASKS;
				default: return -1;
			}
		}
		if (baseClass == TaskDomain.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AnalysisHolder.class) {
			switch (derivedFeatureID) {
				case AnalysisPackage.ANALYSIS_DOMAIN__ANALYSIS: return AnalysisPackage.ANALYSIS_HOLDER__ANALYSIS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Docs.class) {
			switch (baseFeatureID) {
				case JobPackage.DOCS__DOCS: return AnalysisPackage.ANALYSIS_DOMAIN__DOCS;
				default: return -1;
			}
		}
		if (baseClass == Tasks.class) {
			switch (baseFeatureID) {
				case JobPackage.TASKS__TASKS: return AnalysisPackage.ANALYSIS_DOMAIN__TASKS;
				default: return -1;
			}
		}
		if (baseClass == TaskDomain.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AnalysisHolder.class) {
			switch (baseFeatureID) {
				case AnalysisPackage.ANALYSIS_HOLDER__ANALYSIS: return AnalysisPackage.ANALYSIS_DOMAIN__ANALYSIS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Docs.class) {
			switch (baseOperationID) {
				case JobPackage.DOCS___GARBAGE_COLLECT: return AnalysisPackage.ANALYSIS_DOMAIN___GARBAGE_COLLECT;
				default: return -1;
			}
		}
		if (baseClass == Tasks.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TaskDomain.class) {
			switch (baseOperationID) {
				case JobPackage.TASK_DOMAIN___GET_NEW_TASKS: return AnalysisPackage.ANALYSIS_DOMAIN___GET_NEW_TASKS;
				default: return -1;
			}
		}
		if (baseClass == AnalysisHolder.class) {
			switch (baseOperationID) {
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
			case AnalysisPackage.ANALYSIS_DOMAIN___GET_NEW_TASKS:
				return getNewTasks();
			case AnalysisPackage.ANALYSIS_DOMAIN___GARBAGE_COLLECT:
				garbageCollect();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnalysisDomainImpl
