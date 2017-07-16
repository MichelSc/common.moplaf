/**
 */
package com.misc.common.moplaf.replica.impl;

import com.misc.common.moplaf.replica.Replica;
import com.misc.common.moplaf.replica.ReplicaFactory;
import com.misc.common.moplaf.replica.ReplicaPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
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
 * An implementation of the model object '<em><b>Replica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.replica.impl.ReplicaImpl#getExemplar <em>Exemplar</em>}</li>
 *   <li>{@link com.misc.common.moplaf.replica.impl.ReplicaImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.replica.impl.ReplicaImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplicaImpl extends MinimalEObjectImpl.Container implements Replica {
	/**
	 * The cached value of the '{@link #getExemplar() <em>Exemplar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExemplar()
	 * @generated
	 * @ordered
	 */
	protected EObject exemplar;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Replica> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplicaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReplicaPackage.Literals.REPLICA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getExemplar() {
		if (exemplar != null && exemplar.eIsProxy()) {
			InternalEObject oldExemplar = (InternalEObject) exemplar;
			exemplar = eResolveProxy(oldExemplar);
			if (exemplar != oldExemplar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReplicaPackage.REPLICA__EXEMPLAR,
							oldExemplar, exemplar));
			}
		}
		return exemplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetExemplar() {
		return exemplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExemplar(EObject newExemplar) {
		EObject oldExemplar = exemplar;
		exemplar = newExemplar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReplicaPackage.REPLICA__EXEMPLAR, oldExemplar,
					exemplar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Replica> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<Replica>(Replica.class, this,
					ReplicaPackage.REPLICA__ELEMENTS, ReplicaPackage.REPLICA__CONTAINER);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Replica getContainer() {
		if (eContainerFeatureID() != ReplicaPackage.REPLICA__CONTAINER)
			return null;
		return (Replica) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Replica newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainer, ReplicaPackage.REPLICA__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Replica newContainer) {
		if (newContainer != eInternalContainer()
				|| (eContainerFeatureID() != ReplicaPackage.REPLICA__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this, ReplicaPackage.REPLICA__ELEMENTS,
						Replica.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReplicaPackage.REPLICA__CONTAINER, newContainer,
					newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<EObject> getExemplarElements() {
		EObject exemplar = this.getExemplar();
		if (exemplar == null) {
			return null;
		}
		return exemplar.eContents();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Replica constructElement(EObject exemplar) {
		Replica newReplica = ReplicaFactory.eINSTANCE.createReplica();
		return newReplica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshElements() {
		// elements presents (as is)
		Map<EObject, Replica> asis = new HashMap<EObject, Replica>();
		for (Replica replica_asis : this.getElements()) {
			asis.put(replica_asis.getExemplar(), replica_asis);
		}

		// elements presents in the exemplar (to be)
		for (EObject exemplar_element_tobe : this.getExemplarElements()) {
			Replica replica_asis = asis.remove(exemplar_element_tobe);
			if (replica_asis == null) {
				// create
				Replica new_replica = this.constructElement(exemplar_element_tobe);
				new_replica.setExemplar(exemplar_element_tobe);
				this.getElements().add(new_replica);
			}
		}

		// remove the elements still there
		for (Replica replica_to_remove : asis.values()) {
			replica_to_remove.remove();
		}

		// refresh the elements elements replica
		for (Replica element : this.getElements()) {
			element.refreshElements();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshXRefs() {
		for (Replica element : this.getElements()) {
			element.refreshXRefs();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		this.refreshElements();
		this.refreshXRefs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void remove() {
		for (Replica element : this.getElements()) {
			element.remove();
		}
		this.setContainer(null);
	}

	/**
	 * 
	 * @param exemplar
	 * @param excludedElement
	 * @return
	 */
	private Replica getReplicaPrivate(EObject exemplar, Replica excludedElement) {
		if (this.getExemplar() == exemplar) {
			return this;
		}
		// go to the elements
		for (Replica replica_element : this.getElements()) {
			if (replica_element != excludedElement) {
				Replica replica_found = ((ReplicaImpl) replica_element).getReplicaPrivate(exemplar, null);
				if (replica_found != null) {
					return replica_found;
				}
			}
		}
		// go to the container
		ReplicaImpl container = (ReplicaImpl) this.getContainer();
		if (container != null) {
			return container.getReplicaPrivate(exemplar, this);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Replica getReplica(EObject exemplar) {
		Replica found = this.getReplicaPrivate(exemplar, null);
		return found;
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
		case ReplicaPackage.REPLICA__ELEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getElements()).basicAdd(otherEnd, msgs);
		case ReplicaPackage.REPLICA__CONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainer((Replica) otherEnd, msgs);
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
		case ReplicaPackage.REPLICA__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case ReplicaPackage.REPLICA__CONTAINER:
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
		case ReplicaPackage.REPLICA__CONTAINER:
			return eInternalContainer().eInverseRemove(this, ReplicaPackage.REPLICA__ELEMENTS, Replica.class, msgs);
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
		case ReplicaPackage.REPLICA__EXEMPLAR:
			if (resolve)
				return getExemplar();
			return basicGetExemplar();
		case ReplicaPackage.REPLICA__ELEMENTS:
			return getElements();
		case ReplicaPackage.REPLICA__CONTAINER:
			return getContainer();
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
		case ReplicaPackage.REPLICA__EXEMPLAR:
			setExemplar((EObject) newValue);
			return;
		case ReplicaPackage.REPLICA__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends Replica>) newValue);
			return;
		case ReplicaPackage.REPLICA__CONTAINER:
			setContainer((Replica) newValue);
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
		case ReplicaPackage.REPLICA__EXEMPLAR:
			setExemplar((EObject) null);
			return;
		case ReplicaPackage.REPLICA__ELEMENTS:
			getElements().clear();
			return;
		case ReplicaPackage.REPLICA__CONTAINER:
			setContainer((Replica) null);
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
		case ReplicaPackage.REPLICA__EXEMPLAR:
			return exemplar != null;
		case ReplicaPackage.REPLICA__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case ReplicaPackage.REPLICA__CONTAINER:
			return getContainer() != null;
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
		case ReplicaPackage.REPLICA___GET_EXEMPLAR_ELEMENTS:
			return getExemplarElements();
		case ReplicaPackage.REPLICA___CONSTRUCT_ELEMENT__EOBJECT:
			return constructElement((EObject) arguments.get(0));
		case ReplicaPackage.REPLICA___REFRESH_ELEMENTS:
			refreshElements();
			return null;
		case ReplicaPackage.REPLICA___REFRESH_XREFS:
			refreshXRefs();
			return null;
		case ReplicaPackage.REPLICA___REFRESH:
			refresh();
			return null;
		case ReplicaPackage.REPLICA___REMOVE:
			remove();
			return null;
		case ReplicaPackage.REPLICA___GET_REPLICA__EOBJECT:
			return getReplica((EObject) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReplicaImpl
