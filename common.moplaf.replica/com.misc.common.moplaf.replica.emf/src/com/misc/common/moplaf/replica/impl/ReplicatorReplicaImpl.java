/**
 */
package com.misc.common.moplaf.replica.impl;

import com.misc.common.moplaf.replica.ReplicaPackage;
import com.misc.common.moplaf.replica.Replicator;
import com.misc.common.moplaf.replica.ReplicatorReplica;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replicator Replica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.replica.impl.ReplicatorReplicaImpl#getExemplar <em>Exemplar</em>}</li>
 *   <li>{@link com.misc.common.moplaf.replica.impl.ReplicatorReplicaImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.replica.impl.ReplicatorReplicaImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link com.misc.common.moplaf.replica.impl.ReplicatorReplicaImpl#getReplicator <em>Replicator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplicatorReplicaImpl<T extends EObject> extends MinimalEObjectImpl.Container
		implements ReplicatorReplica<T> {
	/**
	 * The cached value of the '{@link #getExemplar() <em>Exemplar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExemplar()
	 * @generated
	 * @ordered
	 */
	protected T exemplar;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ReplicatorReplica<T>> elements;

	/**
	 * The cached value of the '{@link #getReplicator() <em>Replicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicator()
	 * @generated
	 * @ordered
	 */
	protected Replicator<T> replicator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplicatorReplicaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReplicaPackage.Literals.REPLICATOR_REPLICA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getExemplar() {
		if (exemplar != null && exemplar.eIsProxy()) {
			InternalEObject oldExemplar = (InternalEObject) exemplar;
			exemplar = (T) eResolveProxy(oldExemplar);
			if (exemplar != oldExemplar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ReplicaPackage.REPLICATOR_REPLICA__EXEMPLAR, oldExemplar, exemplar));
			}
		}
		return exemplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetExemplar() {
		return exemplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExemplar(T newExemplar) {
		T oldExemplar = exemplar;
		exemplar = newExemplar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReplicaPackage.REPLICATOR_REPLICA__EXEMPLAR,
					oldExemplar, exemplar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReplicatorReplica<T>> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<ReplicatorReplica<T>>(ReplicatorReplica.class, this,
					ReplicaPackage.REPLICATOR_REPLICA__ELEMENTS, ReplicaPackage.REPLICATOR_REPLICA__CONTAINER);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public ReplicatorReplica<T> getContainer() {
		if (eContainerFeatureID() != ReplicaPackage.REPLICATOR_REPLICA__CONTAINER)
			return null;
		return (ReplicatorReplica<T>) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(ReplicatorReplica<T> newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainer, ReplicaPackage.REPLICATOR_REPLICA__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(ReplicatorReplica<T> newContainer) {
		if (newContainer != eInternalContainer()
				|| (eContainerFeatureID() != ReplicaPackage.REPLICATOR_REPLICA__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this, ReplicaPackage.REPLICATOR_REPLICA__ELEMENTS,
						ReplicatorReplica.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReplicaPackage.REPLICATOR_REPLICA__CONTAINER,
					newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Replicator<T> getReplicator() {
		if (replicator != null && replicator.eIsProxy()) {
			InternalEObject oldReplicator = (InternalEObject) replicator;
			replicator = (Replicator<T>) eResolveProxy(oldReplicator);
			if (replicator != oldReplicator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ReplicaPackage.REPLICATOR_REPLICA__REPLICATOR, oldReplicator, replicator));
			}
		}
		return replicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Replicator<T> basicGetReplicator() {
		return replicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplicator(Replicator<T> newReplicator) {
		Replicator<T> oldReplicator = replicator;
		replicator = newReplicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReplicaPackage.REPLICATOR_REPLICA__REPLICATOR,
					oldReplicator, replicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void onConstruct() {
		// default does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void onRemove() {
		// default does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void onRefresh() {
		// default calls onRefresh of every element
		for (ReplicatorReplica<T> replica : this.getElements()) {
			replica.onRefresh();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		Replicator<T> replicator = this.getReplicator();
		replicator.refreshElements(replicator.getExemplarElements(this), this.getElements());
		this.onRefresh();
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
		case ReplicaPackage.REPLICATOR_REPLICA__ELEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getElements()).basicAdd(otherEnd, msgs);
		case ReplicaPackage.REPLICATOR_REPLICA__CONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainer((ReplicatorReplica<T>) otherEnd, msgs);
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
		case ReplicaPackage.REPLICATOR_REPLICA__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case ReplicaPackage.REPLICATOR_REPLICA__CONTAINER:
			return basicSetContainer(null, msgs);
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
		case ReplicaPackage.REPLICATOR_REPLICA__CONTAINER:
			return eInternalContainer().eInverseRemove(this, ReplicaPackage.REPLICATOR_REPLICA__ELEMENTS,
					ReplicatorReplica.class, msgs);
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
		case ReplicaPackage.REPLICATOR_REPLICA__EXEMPLAR:
			if (resolve)
				return getExemplar();
			return basicGetExemplar();
		case ReplicaPackage.REPLICATOR_REPLICA__ELEMENTS:
			return getElements();
		case ReplicaPackage.REPLICATOR_REPLICA__CONTAINER:
			return getContainer();
		case ReplicaPackage.REPLICATOR_REPLICA__REPLICATOR:
			if (resolve)
				return getReplicator();
			return basicGetReplicator();
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
		case ReplicaPackage.REPLICATOR_REPLICA__EXEMPLAR:
			setExemplar((T) newValue);
			return;
		case ReplicaPackage.REPLICATOR_REPLICA__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends ReplicatorReplica<T>>) newValue);
			return;
		case ReplicaPackage.REPLICATOR_REPLICA__CONTAINER:
			setContainer((ReplicatorReplica<T>) newValue);
			return;
		case ReplicaPackage.REPLICATOR_REPLICA__REPLICATOR:
			setReplicator((Replicator<T>) newValue);
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
		case ReplicaPackage.REPLICATOR_REPLICA__EXEMPLAR:
			setExemplar((T) null);
			return;
		case ReplicaPackage.REPLICATOR_REPLICA__ELEMENTS:
			getElements().clear();
			return;
		case ReplicaPackage.REPLICATOR_REPLICA__CONTAINER:
			setContainer((ReplicatorReplica<T>) null);
			return;
		case ReplicaPackage.REPLICATOR_REPLICA__REPLICATOR:
			setReplicator((Replicator<T>) null);
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
		case ReplicaPackage.REPLICATOR_REPLICA__EXEMPLAR:
			return exemplar != null;
		case ReplicaPackage.REPLICATOR_REPLICA__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case ReplicaPackage.REPLICATOR_REPLICA__CONTAINER:
			return getContainer() != null;
		case ReplicaPackage.REPLICATOR_REPLICA__REPLICATOR:
			return replicator != null;
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
		case ReplicaPackage.REPLICATOR_REPLICA___ON_CONSTRUCT:
			onConstruct();
			return null;
		case ReplicaPackage.REPLICATOR_REPLICA___ON_REFRESH:
			onRefresh();
			return null;
		case ReplicaPackage.REPLICATOR_REPLICA___ON_REMOVE:
			onRemove();
			return null;
		case ReplicaPackage.REPLICATOR_REPLICA___REFRESH:
			refresh();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReplicatorReplicaImpl
