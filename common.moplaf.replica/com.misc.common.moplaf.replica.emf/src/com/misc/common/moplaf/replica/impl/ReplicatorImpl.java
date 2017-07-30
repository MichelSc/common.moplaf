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
import org.eclipse.emf.common.util.BasicEList;
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
public class ReplicatorImpl<T extends EObject> extends MinimalEObjectImpl.Container implements Replicator<T> {
	/**
	 * The cached value of the '{@link #getRootReplicas() <em>Root Replicas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootReplicas()
	 * @generated
	 * @ordered
	 */
	protected EList<ReplicatorReplica<T>> rootReplicas;

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
	public EList<ReplicatorReplica<T>> getRootReplicas() {
		if (rootReplicas == null) {
			rootReplicas = new EObjectContainmentEList<ReplicatorReplica<T>>(ReplicatorReplica.class, this,
					ReplicaPackage.REPLICATOR__ROOT_REPLICAS);
		}
		return rootReplicas;
	}

	protected HashMap<T, ReplicatorReplica<T>> replicasIndex = null;

	private void addReplicaToIndex(ReplicatorReplica<T> replica) {
		this.replicasIndex.put(replica.getExemplar(), replica);
		for (ReplicatorReplica<T> element_replica : replica.getElements()) {
			addReplicaToIndex(element_replica);
		}
	}

	protected HashMap<T, ReplicatorReplica<T>> getReplicasIndex() {
		if (this.replicasIndex == null) {
			// lazy initialisation
			this.replicasIndex = new HashMap<T, ReplicatorReplica<T>>();
			for (ReplicatorReplica<T> root_replica : this.getRootReplicas()) {
				this.addReplicaToIndex(root_replica);
			}
		}
		return this.replicasIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReplicatorReplica<T> getReplica(T exemplar) {
		if (exemplar == null) {
			return null;
		}
		HashMap<T, ReplicatorReplica<T>> index = this.getReplicasIndex();
		ReplicatorReplica<T> replica = index.get(exemplar);
		return replica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<T> getExemplarElements(ReplicatorReplica<T> replica) {
		T exemplar = replica.getExemplar();
		EList<EObject> contents = exemplar.eContents();
		EList<T> elements = new BasicEList<T>();
		for (EObject some_exeplar_element : contents) {
			elements.add((T) some_exeplar_element);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<T> getRootExemplarElements() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReplicatorReplica<T> constructReplica(T exemplar) {
		// default implementation makes a ReplicatorReplica
		ReplicatorReplica<T> newReplica = ReplicaFactory.eINSTANCE.createReplicatorReplica();
		return newReplica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshElements(EList<T> exemplarElements, EList<ReplicatorReplica<T>> replicaElements) {
		HashMap<T, ReplicatorReplica<T>> index = this.getReplicasIndex();
		// elements presents (as is)
		Map<T, ReplicatorReplica<T>> asis = new HashMap<T, ReplicatorReplica<T>>();
		for (ReplicatorReplica<T> replica_asis : replicaElements) {
			asis.put(replica_asis.getExemplar(), replica_asis);
		}

		// elements presents in the exemplar (to be)
		for (T exemplar_element_tobe : exemplarElements) {
			ReplicatorReplica<T> replica_asis = asis.remove(exemplar_element_tobe);
			if (replica_asis == null) {
				// create
				ReplicatorReplica<T> new_replica = this.constructReplica(exemplar_element_tobe);
				new_replica.setExemplar(exemplar_element_tobe);
				new_replica.setReplicator(this);
				replicaElements.add(new_replica);
				index.put(exemplar_element_tobe, new_replica);
				new_replica.onConstruct(); // as late as possible
			}
		}

		// remove the elements still there
		for (ReplicatorReplica<T> replica_to_remove : asis.values()) {
			this.removeReplica(replica_to_remove);
		}

		// refresh the elements elements replica
		for (ReplicatorReplica<T> element : replicaElements) {
			this.refreshElements(this.getExemplarElements(element), element.getElements());
		}
	}
	
	private void onRefresh(ReplicatorReplica<T> replica) {
		replica.onRefresh();
		for ( ReplicatorReplica<T> replica_element : replica.getElements()) {
			this.onRefresh(replica_element);
		}
	}

	/**
	 * 
	 * @param replica
	 */
	private void removeReplica(ReplicatorReplica<T> replica) {
		// before actual removal
		replica.onRemove();
		// remove of the Replica elements
		for ( ReplicatorReplica<T> replica_element : replica.getElements()) {
			this.removeReplica(replica_element);
		}
		// actual removal of the Replica
		replica.setReplicator(null);
		this.getReplicasIndex().remove(replica.getExemplar());
		replica.setContainer(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		this.refreshElements(this.getRootExemplarElements(), this.getRootReplicas());
		for (ReplicatorReplica<T> replica : this.getRootReplicas()) {
			this.onRefresh(replica);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh(ReplicatorReplica<T> replica) {
		Replicator<T> replicator = this;
		replicator.refreshElements(replicator.getExemplarElements(replica), replica.getElements());
		this.onRefresh(replica);
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
			getRootReplicas().addAll((Collection<? extends ReplicatorReplica<T>>) newValue);
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
			return getReplica((T) arguments.get(0));
		case ReplicaPackage.REPLICATOR___GET_EXEMPLAR_ELEMENTS__REPLICATORREPLICA:
			return getExemplarElements((ReplicatorReplica<T>) arguments.get(0));
		case ReplicaPackage.REPLICATOR___GET_ROOT_EXEMPLAR_ELEMENTS:
			return getRootExemplarElements();
		case ReplicaPackage.REPLICATOR___CONSTRUCT_REPLICA__EOBJECT:
			return constructReplica((T) arguments.get(0));
		case ReplicaPackage.REPLICATOR___REFRESH_ELEMENTS__ELIST_ELIST:
			refreshElements((EList<T>) arguments.get(0), (EList<ReplicatorReplica<T>>) arguments.get(1));
			return null;
		case ReplicaPackage.REPLICATOR___REFRESH:
			refresh();
			return null;
		case ReplicaPackage.REPLICATOR___REFRESH__REPLICATORREPLICA:
			refresh((ReplicatorReplica<T>) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReplicatorImpl
