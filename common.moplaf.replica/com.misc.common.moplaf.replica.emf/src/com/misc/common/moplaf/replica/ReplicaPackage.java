/**
 */
package com.misc.common.moplaf.replica;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.replica.ReplicaFactory
 * @model kind="package"
 * @generated
 */
public interface ReplicaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "replica";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/replica/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "replica";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReplicaPackage eINSTANCE = com.misc.common.moplaf.replica.impl.ReplicaPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.replica.impl.ReplicaImpl <em>Replica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.replica.impl.ReplicaImpl
	 * @see com.misc.common.moplaf.replica.impl.ReplicaPackageImpl#getReplica()
	 * @generated
	 */
	int REPLICA = 0;

	/**
	 * The feature id for the '<em><b>Exemplar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA__EXEMPLAR = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA__CONTAINER = 2;

	/**
	 * The number of structural features of the '<em>Replica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Exemplar Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA___GET_EXEMPLAR_ELEMENTS = 0;

	/**
	 * The operation id for the '<em>Construct Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA___CONSTRUCT_ELEMENT__EOBJECT = 1;

	/**
	 * The operation id for the '<em>Refresh Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA___REFRESH_ELEMENTS = 2;

	/**
	 * The operation id for the '<em>Refresh XRefs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA___REFRESH_XREFS = 3;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA___REFRESH = 4;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA___REMOVE = 5;

	/**
	 * The operation id for the '<em>Get Replica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA___GET_REPLICA__EOBJECT = 6;

	/**
	 * The number of operations of the '<em>Replica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.replica.impl.ReplicatorReplicaImpl <em>Replicator Replica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.replica.impl.ReplicatorReplicaImpl
	 * @see com.misc.common.moplaf.replica.impl.ReplicaPackageImpl#getReplicatorReplica()
	 * @generated
	 */
	int REPLICATOR_REPLICA = 1;

	/**
	 * The feature id for the '<em><b>Exemplar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR_REPLICA__EXEMPLAR = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR_REPLICA__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR_REPLICA__CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Replicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR_REPLICA__REPLICATOR = 3;

	/**
	 * The number of structural features of the '<em>Replicator Replica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR_REPLICA_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>On Construct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR_REPLICA___ON_CONSTRUCT = 0;

	/**
	 * The operation id for the '<em>On Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR_REPLICA___ON_REFRESH = 1;

	/**
	 * The operation id for the '<em>On Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR_REPLICA___ON_REMOVE = 2;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR_REPLICA___REFRESH = 3;

	/**
	 * The number of operations of the '<em>Replicator Replica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR_REPLICA_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.replica.impl.ReplicatorImpl <em>Replicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.replica.impl.ReplicatorImpl
	 * @see com.misc.common.moplaf.replica.impl.ReplicaPackageImpl#getReplicator()
	 * @generated
	 */
	int REPLICATOR = 2;

	/**
	 * The feature id for the '<em><b>Root Replicas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR__ROOT_REPLICAS = 0;

	/**
	 * The number of structural features of the '<em>Replicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Replica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR___GET_REPLICA__OBJECT = 0;

	/**
	 * The operation id for the '<em>Get Exemplar Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR___GET_EXEMPLAR_ELEMENTS__REPLICATORREPLICA = 1;

	/**
	 * The operation id for the '<em>Get Root Exemplar Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR___GET_ROOT_EXEMPLAR_ELEMENTS = 2;

	/**
	 * The operation id for the '<em>Construct Replica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR___CONSTRUCT_REPLICA__OBJECT = 3;

	/**
	 * The operation id for the '<em>Refresh Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR___REFRESH_ELEMENTS__ELIST_ELIST = 4;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR___REFRESH = 5;

	/**
	 * The number of operations of the '<em>Replicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATOR_OPERATION_COUNT = 6;

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.replica.Replica <em>Replica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replica</em>'.
	 * @see com.misc.common.moplaf.replica.Replica
	 * @generated
	 */
	EClass getReplica();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.replica.Replica#getExemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exemplar</em>'.
	 * @see com.misc.common.moplaf.replica.Replica#getExemplar()
	 * @see #getReplica()
	 * @generated
	 */
	EReference getReplica_Exemplar();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.replica.Replica#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.misc.common.moplaf.replica.Replica#getElements()
	 * @see #getReplica()
	 * @generated
	 */
	EReference getReplica_Elements();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.replica.Replica#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see com.misc.common.moplaf.replica.Replica#getContainer()
	 * @see #getReplica()
	 * @generated
	 */
	EReference getReplica_Container();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.Replica#getExemplarElements() <em>Get Exemplar Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Exemplar Elements</em>' operation.
	 * @see com.misc.common.moplaf.replica.Replica#getExemplarElements()
	 * @generated
	 */
	EOperation getReplica__GetExemplarElements();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.Replica#constructElement(org.eclipse.emf.ecore.EObject) <em>Construct Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Element</em>' operation.
	 * @see com.misc.common.moplaf.replica.Replica#constructElement(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getReplica__ConstructElement__EObject();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.Replica#refreshElements() <em>Refresh Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Elements</em>' operation.
	 * @see com.misc.common.moplaf.replica.Replica#refreshElements()
	 * @generated
	 */
	EOperation getReplica__RefreshElements();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.Replica#refreshXRefs() <em>Refresh XRefs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh XRefs</em>' operation.
	 * @see com.misc.common.moplaf.replica.Replica#refreshXRefs()
	 * @generated
	 */
	EOperation getReplica__RefreshXRefs();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.Replica#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.replica.Replica#refresh()
	 * @generated
	 */
	EOperation getReplica__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.Replica#remove() <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see com.misc.common.moplaf.replica.Replica#remove()
	 * @generated
	 */
	EOperation getReplica__Remove();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.Replica#getReplica(org.eclipse.emf.ecore.EObject) <em>Get Replica</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Replica</em>' operation.
	 * @see com.misc.common.moplaf.replica.Replica#getReplica(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getReplica__GetReplica__EObject();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.replica.ReplicatorReplica <em>Replicator Replica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replicator Replica</em>'.
	 * @see com.misc.common.moplaf.replica.ReplicatorReplica
	 * @generated
	 */
	EClass getReplicatorReplica();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.replica.ReplicatorReplica#getExemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exemplar</em>'.
	 * @see com.misc.common.moplaf.replica.ReplicatorReplica#getExemplar()
	 * @see #getReplicatorReplica()
	 * @generated
	 */
	EReference getReplicatorReplica_Exemplar();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.replica.ReplicatorReplica#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.misc.common.moplaf.replica.ReplicatorReplica#getElements()
	 * @see #getReplicatorReplica()
	 * @generated
	 */
	EReference getReplicatorReplica_Elements();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.replica.ReplicatorReplica#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see com.misc.common.moplaf.replica.ReplicatorReplica#getContainer()
	 * @see #getReplicatorReplica()
	 * @generated
	 */
	EReference getReplicatorReplica_Container();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.replica.ReplicatorReplica#getReplicator <em>Replicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Replicator</em>'.
	 * @see com.misc.common.moplaf.replica.ReplicatorReplica#getReplicator()
	 * @see #getReplicatorReplica()
	 * @generated
	 */
	EReference getReplicatorReplica_Replicator();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.ReplicatorReplica#onConstruct() <em>On Construct</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Construct</em>' operation.
	 * @see com.misc.common.moplaf.replica.ReplicatorReplica#onConstruct()
	 * @generated
	 */
	EOperation getReplicatorReplica__OnConstruct();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.ReplicatorReplica#onRemove() <em>On Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Remove</em>' operation.
	 * @see com.misc.common.moplaf.replica.ReplicatorReplica#onRemove()
	 * @generated
	 */
	EOperation getReplicatorReplica__OnRemove();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.ReplicatorReplica#onRefresh() <em>On Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>On Refresh</em>' operation.
	 * @see com.misc.common.moplaf.replica.ReplicatorReplica#onRefresh()
	 * @generated
	 */
	EOperation getReplicatorReplica__OnRefresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.ReplicatorReplica#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.replica.ReplicatorReplica#refresh()
	 * @generated
	 */
	EOperation getReplicatorReplica__Refresh();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.replica.Replicator <em>Replicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replicator</em>'.
	 * @see com.misc.common.moplaf.replica.Replicator
	 * @generated
	 */
	EClass getReplicator();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.replica.Replicator#getRootReplicas <em>Root Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Replicas</em>'.
	 * @see com.misc.common.moplaf.replica.Replicator#getRootReplicas()
	 * @see #getReplicator()
	 * @generated
	 */
	EReference getReplicator_RootReplicas();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.Replicator#getReplica(org.eclipse.emf.ecore.EObject) <em>Get Replica</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Replica</em>' operation.
	 * @see com.misc.common.moplaf.replica.Replicator#getReplica(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getReplicator__GetReplica__Object();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.Replicator#getExemplarElements(com.misc.common.moplaf.replica.ReplicatorReplica) <em>Get Exemplar Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Exemplar Elements</em>' operation.
	 * @see com.misc.common.moplaf.replica.Replicator#getExemplarElements(com.misc.common.moplaf.replica.ReplicatorReplica)
	 * @generated
	 */
	EOperation getReplicator__GetExemplarElements__ReplicatorReplica();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.Replicator#getRootExemplarElements() <em>Get Root Exemplar Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Exemplar Elements</em>' operation.
	 * @see com.misc.common.moplaf.replica.Replicator#getRootExemplarElements()
	 * @generated
	 */
	EOperation getReplicator__GetRootExemplarElements();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.Replicator#constructReplica(org.eclipse.emf.ecore.EObject) <em>Construct Replica</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Replica</em>' operation.
	 * @see com.misc.common.moplaf.replica.Replicator#constructReplica(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getReplicator__ConstructReplica__Object();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.Replicator#refreshElements(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Refresh Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Elements</em>' operation.
	 * @see com.misc.common.moplaf.replica.Replicator#refreshElements(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getReplicator__RefreshElements__EList_EList();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.replica.Replicator#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.replica.Replicator#refresh()
	 * @generated
	 */
	EOperation getReplicator__Refresh();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReplicaFactory getReplicaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.replica.impl.ReplicaImpl <em>Replica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.replica.impl.ReplicaImpl
		 * @see com.misc.common.moplaf.replica.impl.ReplicaPackageImpl#getReplica()
		 * @generated
		 */
		EClass REPLICA = eINSTANCE.getReplica();

		/**
		 * The meta object literal for the '<em><b>Exemplar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICA__EXEMPLAR = eINSTANCE.getReplica_Exemplar();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICA__ELEMENTS = eINSTANCE.getReplica_Elements();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICA__CONTAINER = eINSTANCE.getReplica_Container();

		/**
		 * The meta object literal for the '<em><b>Get Exemplar Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICA___GET_EXEMPLAR_ELEMENTS = eINSTANCE.getReplica__GetExemplarElements();

		/**
		 * The meta object literal for the '<em><b>Construct Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICA___CONSTRUCT_ELEMENT__EOBJECT = eINSTANCE.getReplica__ConstructElement__EObject();

		/**
		 * The meta object literal for the '<em><b>Refresh Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICA___REFRESH_ELEMENTS = eINSTANCE.getReplica__RefreshElements();

		/**
		 * The meta object literal for the '<em><b>Refresh XRefs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICA___REFRESH_XREFS = eINSTANCE.getReplica__RefreshXRefs();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICA___REFRESH = eINSTANCE.getReplica__Refresh();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICA___REMOVE = eINSTANCE.getReplica__Remove();

		/**
		 * The meta object literal for the '<em><b>Get Replica</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICA___GET_REPLICA__EOBJECT = eINSTANCE.getReplica__GetReplica__EObject();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.replica.impl.ReplicatorReplicaImpl <em>Replicator Replica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.replica.impl.ReplicatorReplicaImpl
		 * @see com.misc.common.moplaf.replica.impl.ReplicaPackageImpl#getReplicatorReplica()
		 * @generated
		 */
		EClass REPLICATOR_REPLICA = eINSTANCE.getReplicatorReplica();

		/**
		 * The meta object literal for the '<em><b>Exemplar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATOR_REPLICA__EXEMPLAR = eINSTANCE.getReplicatorReplica_Exemplar();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATOR_REPLICA__ELEMENTS = eINSTANCE.getReplicatorReplica_Elements();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATOR_REPLICA__CONTAINER = eINSTANCE.getReplicatorReplica_Container();

		/**
		 * The meta object literal for the '<em><b>Replicator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATOR_REPLICA__REPLICATOR = eINSTANCE.getReplicatorReplica_Replicator();

		/**
		 * The meta object literal for the '<em><b>On Construct</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICATOR_REPLICA___ON_CONSTRUCT = eINSTANCE.getReplicatorReplica__OnConstruct();

		/**
		 * The meta object literal for the '<em><b>On Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICATOR_REPLICA___ON_REMOVE = eINSTANCE.getReplicatorReplica__OnRemove();

		/**
		 * The meta object literal for the '<em><b>On Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICATOR_REPLICA___ON_REFRESH = eINSTANCE.getReplicatorReplica__OnRefresh();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICATOR_REPLICA___REFRESH = eINSTANCE.getReplicatorReplica__Refresh();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.replica.impl.ReplicatorImpl <em>Replicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.replica.impl.ReplicatorImpl
		 * @see com.misc.common.moplaf.replica.impl.ReplicaPackageImpl#getReplicator()
		 * @generated
		 */
		EClass REPLICATOR = eINSTANCE.getReplicator();

		/**
		 * The meta object literal for the '<em><b>Root Replicas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATOR__ROOT_REPLICAS = eINSTANCE.getReplicator_RootReplicas();

		/**
		 * The meta object literal for the '<em><b>Get Replica</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICATOR___GET_REPLICA__OBJECT = eINSTANCE.getReplicator__GetReplica__Object();

		/**
		 * The meta object literal for the '<em><b>Get Exemplar Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICATOR___GET_EXEMPLAR_ELEMENTS__REPLICATORREPLICA = eINSTANCE
				.getReplicator__GetExemplarElements__ReplicatorReplica();

		/**
		 * The meta object literal for the '<em><b>Get Root Exemplar Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICATOR___GET_ROOT_EXEMPLAR_ELEMENTS = eINSTANCE.getReplicator__GetRootExemplarElements();

		/**
		 * The meta object literal for the '<em><b>Construct Replica</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICATOR___CONSTRUCT_REPLICA__OBJECT = eINSTANCE.getReplicator__ConstructReplica__Object();

		/**
		 * The meta object literal for the '<em><b>Refresh Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICATOR___REFRESH_ELEMENTS__ELIST_ELIST = eINSTANCE.getReplicator__RefreshElements__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLICATOR___REFRESH = eINSTANCE.getReplicator__Refresh();

	}

} //ReplicaPackage
