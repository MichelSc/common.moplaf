/**
 */
package com.misc.common.moplaf.DatasetLoadOra.impl;

import com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin;
import com.misc.common.moplaf.DatasetLoadOra.DatasetLoadOraFactory;
import com.misc.common.moplaf.DatasetLoadOra.DatasetLoadOraPackage;

import com.misc.common.moplaf.datasetload.DatasetloadPackage;

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
public class DatasetLoadOraPackageImpl extends EPackageImpl implements DatasetLoadOraPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetLoadJdbcOraThinEClass = null;

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
	 * @see com.misc.common.moplaf.DatasetLoadOra.DatasetLoadOraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatasetLoadOraPackageImpl() {
		super(eNS_URI, DatasetLoadOraFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatasetLoadOraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatasetLoadOraPackage init() {
		if (isInited) return (DatasetLoadOraPackage)EPackage.Registry.INSTANCE.getEPackage(DatasetLoadOraPackage.eNS_URI);

		// Obtain or create and register package
		DatasetLoadOraPackageImpl theDatasetLoadOraPackage = (DatasetLoadOraPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatasetLoadOraPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatasetLoadOraPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DatasetloadPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDatasetLoadOraPackage.createPackageContents();

		// Initialize created meta-data
		theDatasetLoadOraPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatasetLoadOraPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatasetLoadOraPackage.eNS_URI, theDatasetLoadOraPackage);
		return theDatasetLoadOraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatasetLoadJdbcOraThin() {
		return datasetLoadJdbcOraThinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetLoadJdbcOraThin_Host() {
		return (EAttribute)datasetLoadJdbcOraThinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetLoadJdbcOraThin_Port() {
		return (EAttribute)datasetLoadJdbcOraThinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetLoadJdbcOraThin_DataBase() {
		return (EAttribute)datasetLoadJdbcOraThinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetLoadOraFactory getDatasetLoadOraFactory() {
		return (DatasetLoadOraFactory)getEFactoryInstance();
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
		datasetLoadJdbcOraThinEClass = createEClass(DATASET_LOAD_JDBC_ORA_THIN);
		createEAttribute(datasetLoadJdbcOraThinEClass, DATASET_LOAD_JDBC_ORA_THIN__HOST);
		createEAttribute(datasetLoadJdbcOraThinEClass, DATASET_LOAD_JDBC_ORA_THIN__PORT);
		createEAttribute(datasetLoadJdbcOraThinEClass, DATASET_LOAD_JDBC_ORA_THIN__DATA_BASE);
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
		datasetLoadJdbcOraThinEClass.getESuperTypes().add(theDatasetloadPackage.getDataSourceJdbc());

		// Initialize classes, features, and operations; add parameters
		initEClass(datasetLoadJdbcOraThinEClass, DatasetLoadJdbcOraThin.class, "DatasetLoadJdbcOraThin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatasetLoadJdbcOraThin_Host(), ecorePackage.getEString(), "Host", null, 0, 1, DatasetLoadJdbcOraThin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetLoadJdbcOraThin_Port(), ecorePackage.getEInt(), "Port", null, 0, 1, DatasetLoadJdbcOraThin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetLoadJdbcOraThin_DataBase(), ecorePackage.getEString(), "DataBase", null, 0, 1, DatasetLoadJdbcOraThin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DatasetLoadOraPackageImpl
