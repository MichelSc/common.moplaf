/**
 */
package com.misc.common.moplaf.replica.impl;

import com.misc.common.moplaf.replica.ReplicaFactory;
import com.misc.common.moplaf.replica.ReplicaPackage;
import com.misc.common.moplaf.replica.Replicator;
import com.misc.common.moplaf.replica.ReplicatorReplica;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.replica.impl.ReplicatorImpl#getRootReplicas <em>Root Replicas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplicatorImpl extends MinimalEObjectImpl.Container implements Replicator {
	/**
	 * The cached value of the '{@link #getRootReplicas() <em>Root Replicas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootReplicas()
	 * @generated
	 * @ordered
	 */
	protected EList<ReplicatorReplica> rootReplicas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplicatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReplicaPackage.Literals.REPLICATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReplicatorReplica> getRootReplicas() {
		if (rootReplicas == null) {
			rootReplicas = new EObjectContainmentEList<ReplicatorReplica>(ReplicatorReplica.class, this,
					ReplicaPackage.REPLICATOR__ROOT_REPLICAS);
		}
		return rootReplicas;
	}

	protected HashMap<EObject, ReplicatorReplica> replicasIndex = null;

	private void addReplicaToIndex(ReplicatorReplica replica) {
		this.replicasIndex.put(replica.getExemplar(), replica);
		for (ReplicatorReplica element_replica : replica.getElements()) {
			addReplicaToIndex(element_replica);
		}
	}

	protected HashMap<EObject, ReplicatorReplica> getReplicasIndex() {
		if (this.replicasIndex == null) {
			// lazy initialisation
			this.replicasIndex = new HashMap<EObject, ReplicatorReplica>();
			for (ReplicatorReplica root_replica : this.getRootReplicas()) {
				this.addReplicaToIndex(root_replica);
			}
		}
		return this.replicasIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReplicatorReplica getReplica(EObject exemplar) {
		if ( exemplar==null ) { return null; }
		HashMap<EObject, ReplicatorReplica> index = this.getReplicasIndex();
		ReplicatorReplica replica = index.get(exemplar);
		return replica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<EObject> getExemplarElements(ReplicatorReplica replica) {
		EObject exemplar = replica.getExemplar();
		return exemplar.eContents();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<EObject> getRootExemplarElements() {
		// must be overloaded by implementation
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReplicatorReplica constructReplica(EObject exemplar) {
		// default implementation makes a ReplicatorReplica
		ReplicatorReplica newReplica = ReplicaFactory.eINSTANCE.createReplicatorReplica();
		return newReplica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshElements(EList<EObject> exemplarElements, EList<ReplicatorReplica> replicaElements) {
		HashMap<EObject, ReplicatorReplica> index = this.getReplicasIndex();
		// elements presents (as is)
		Map<EObject, ReplicatorReplica> asis = new HashMap<EObject, ReplicatorReplica>();
		for (ReplicatorReplica replica_asis : replicaElements) {
			asis.put(replica_asis.getExemplar(), replica_asis);
		}

		// elements presents in the exemplar (to be)
		for (EObject exemplar_element_tobe : exemplarElements) {
			ReplicatorReplica replica_asis = asis.remove(exemplar_element_tobe);
			if (replica_asis == null) {
				// create
				ReplicatorReplica new_replica = this.constructReplica(exemplar_element_tobe);
				new_replica.setExemplar(exemplar_element_tobe);
				new_replica.setReplicator(this);
				replicaElements.add(new_replica);
				index.put(exemplar_element_tobe, new_replica);
				new_replica.onConstruct(); // as late as possible
			}
		}

		// remove the elements still there
		for (ReplicatorReplica replica_to_remove : asis.values()) {
			replica_to_remove.onRemove();
			replica_to_remove.setReplicator(null);
			index.remove(replica_to_remove.getExemplar());
			replicaElements.remove(replica_to_remove);
		}

		// refresh the elements elements replica
		for (ReplicatorReplica element : replicaElements) {
			this.refreshElements(this.getExemplarElements(element), element.getElements());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		this.refreshElements(this.getRootExemplarElements(), this.getRootReplicas());
		for (ReplicatorReplica replica : this.getRootReplicas()) {
			replica.onRefresh();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReplicaPackage.REPLICATOR__ROOT_REPLICAS:
			return ((InternalEList<?>) getRootReplicas()).basicRemove(otherEnd, msgs);
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
		case ReplicaPackage.REPLICATOR__ROOT_REPLICAS:
			return getRootReplicas();
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
		case ReplicaPackage.REPLICATOR__ROOT_REPLICAS:
			getRootReplicas().clear();
			getRootReplicas().addAll((Collection<? extends ReplicatorReplica>) newValue);
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
		case ReplicaPackage.REPLICATOR__ROOT_REPLICAS:
			getRootReplicas().clear();
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
		case ReplicaPackage.REPLICATOR__ROOT_REPLICAS:
			return rootReplicas != null && !rootReplicas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ReplicaPackage.REPLICATOR___GET_REPLICA__EOBJECT:
			return getReplica((EObject) arguments.get(0));
		case ReplicaPackage.REPLICATOR___GET_EXEMPLAR_ELEMENTS__REPLICATORREPLICA:
			return getExemplarElements((ReplicatorReplica) arguments.get(0));
		case ReplicaPackage.REPLICATOR___GET_ROOT_EXEMPLAR_ELEMENTS:
			return getRootExemplarElements();
		case ReplicaPackage.REPLICATOR___CONSTRUCT_REPLICA__EOBJECT:
			return constructReplica((EObject) arguments.get(0));
		case ReplicaPackage.REPLICATOR___REFRESH_ELEMENTS__ELIST_ELIST:
			refreshElements((EList<EObject>) arguments.get(0), (EList<ReplicatorReplica>) arguments.get(1));
			return null;
		case ReplicaPackage.REPLICATOR___REFRESH:
			refresh();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReplicatorImpl
