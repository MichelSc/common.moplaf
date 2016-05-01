/**
 */
package com.misc.common.moplaf.DatasetLoadMariaDb.impl;

import com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb;
import com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadMariaDbFactory;
import com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadMariaDbPackage;
import com.misc.common.moplaf.dbsynch.DatasetloadPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetLoadMariaDbPackageImpl extends EPackageImpl implements DatasetLoadMariaDbPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetLoadJdbcMariaDbEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadMariaDbPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatasetLoadMariaDbPackageImpl() {
		super(eNS_URI, DatasetLoadMariaDbFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DatasetLoadMariaDbPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatasetLoadMariaDbPackage init() {
		if (isInited) return (DatasetLoadMariaDbPackage)EPackage.Registry.INSTANCE.getEPackage(DatasetLoadMariaDbPackage.eNS_URI);

		// Obtain or create and register package
		DatasetLoadMariaDbPackageImpl theDatasetLoadMariaDbPackage = (DatasetLoadMariaDbPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatasetLoadMariaDbPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatasetLoadMariaDbPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DatasetloadPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDatasetLoadMariaDbPackage.createPackageContents();

		// Initialize created meta-data
		theDatasetLoadMariaDbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatasetLoadMariaDbPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatasetLoadMariaDbPackage.eNS_URI, theDatasetLoadMariaDbPackage);
		return theDatasetLoadMariaDbPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatasetLoadJdbcMariaDb() {
		return datasetLoadJdbcMariaDbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetLoadJdbcMariaDb_Host() {
		return (EAttribute)datasetLoadJdbcMariaDbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetLoadJdbcMariaDb_Port() {
		return (EAttribute)datasetLoadJdbcMariaDbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetLoadJdbcMariaDb_DataBase() {
		return (EAttribute)datasetLoadJdbcMariaDbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetLoadMariaDbFactory getDatasetLoadMariaDbFactory() {
		return (DatasetLoadMariaDbFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		datasetLoadJdbcMariaDbEClass = createEClass(DATASET_LOAD_JDBC_MARIA_DB);
		createEAttribute(datasetLoadJdbcMariaDbEClass, DATASET_LOAD_JDBC_MARIA_DB__HOST);
		createEAttribute(datasetLoadJdbcMariaDbEClass, DATASET_LOAD_JDBC_MARIA_DB__PORT);
		createEAttribute(datasetLoadJdbcMariaDbEClass, DATASET_LOAD_JDBC_MARIA_DB__DATA_BASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DatasetloadPackage theDatasetloadPackage = (DatasetloadPackage)EPackage.Registry.INSTANCE.getEPackage(DatasetloadPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		datasetLoadJdbcMariaDbEClass.getESuperTypes().add(theDatasetloadPackage.getDataSourceJdbc());

		// Initialize classes, features, and operations; add parameters
		initEClass(datasetLoadJdbcMariaDbEClass, DatasetLoadJdbcMariaDb.class, "DatasetLoadJdbcMariaDb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatasetLoadJdbcMariaDb_Host(), ecorePackage.getEString(), "Host", null, 0, 1, DatasetLoadJdbcMariaDb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetLoadJdbcMariaDb_Port(), ecorePackage.getEInt(), "Port", null, 0, 1, DatasetLoadJdbcMariaDb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetLoadJdbcMariaDb_DataBase(), ecorePackage.getEString(), "DataBase", null, 0, 1, DatasetLoadJdbcMariaDb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DatasetLoadMariaDbPackageImpl
