/**
 */
package com.misc.common.moplaf.replica.impl;

import com.misc.common.moplaf.replica.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReplicaFactoryImpl extends EFactoryImpl implements ReplicaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReplicaFactory init() {
		try {
			ReplicaFactory theReplicaFactory = (ReplicaFactory) EPackage.Registry.INSTANCE
					.getEFactory(ReplicaPackage.eNS_URI);
			if (theReplicaFactory != null) {
				return theReplicaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReplicaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplicaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ReplicaPackage.REPLICA:
			return createReplica();
		case ReplicaPackage.REPLICATOR_REPLICA:
			return createReplicatorReplica();
		case ReplicaPackage.REPLICATOR:
			return createReplicator();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Replica createReplica() {
		ReplicaImpl replica = new ReplicaImpl();
		return replica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends EObject> ReplicatorReplica<T> createReplicatorReplica() {
		ReplicatorReplicaImpl<T> replicatorReplica = new ReplicatorReplicaImpl<T>();
		return replicatorReplica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends EObject> Replicator<T> createReplicator() {
		ReplicatorImpl<T> replicator = new ReplicatorImpl<T>();
		return replicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplicaPackage getReplicaPackage() {
		return (ReplicaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReplicaPackage getPackage() {
		return ReplicaPackage.eINSTANCE;
	}

} //ReplicaFactoryImpl
