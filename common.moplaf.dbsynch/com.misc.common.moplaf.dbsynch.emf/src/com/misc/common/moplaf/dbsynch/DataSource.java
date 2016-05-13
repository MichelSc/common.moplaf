/**
 */
package com.misc.common.moplaf.dbsynch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <p>
 * A DataSource is the top level DbSynchUnit in the hierarchy of the synch units.
 * <p>
 * Next to its functionality as synch unit, the DataSource supports the connection
 * with the database.
 * <p>
 * Specialization of this class implements the up and down synchronization of a given Table: 
 * <ul>
 * <li>{@link #synchUpTableImpl(Table)} 
 * <li>{@link #synchDownTableImpl(Table)}
 * </ul>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.DataSource#isConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDataSource()
 * @model abstract="true"
 * @generated
 */
public interface DataSource extends DbSynchUnitAbstract {
	/**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #setConnected(boolean)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDataSource_Connected()
	 * @model
	 * @generated
	 */
	boolean isConnected();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.DataSource#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isConnected()
	 * @generated
	 */
	void setConnected(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void connect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void disconnect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void synchDownTableImpl(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void synchUpTableImpl(Table table);

} // DataSource
